package activetech.pda.service.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;

import activetech.base.pojo.dto.ActiveUser;
import activetech.hl7.base.HL7Client;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.pda.dao.mapper.HspCfxxExecCustomMapper;
import activetech.pda.dao.mapper.HspCfxxExecMapper;
import activetech.pda.dao.mapper.HspCfxxInfoCustomMapper;
import activetech.pda.dao.mapper.HspCfxxInfoMapper;
import activetech.pda.pojo.domain.HspCfxxInfo;
import activetech.pda.pojo.dto.HspCfxxExecCustom;
import activetech.pda.pojo.dto.HspCfxxExecQueryDto;
import activetech.pda.pojo.dto.HspCfxxInfoCustom;
import activetech.pda.pojo.dto.HspCfxxInfoQueryDto;
import activetech.pda.service.HspCfxxInfoService;
import activetech.util.StringUtils;

/**
 * 处方信息Service实现类
 * @author machaofan
 *
 */
public class HspCfxxInfoServiceImpl implements HspCfxxInfoService {
	@Resource(name = "transactionManager")  
    private PlatformTransactionManager platformTransactionManager;  
	
	@Autowired
	private HspCfxxInfoCustomMapper hspCfxxInfoCustomMapper; 
	
	@Autowired
	private HspCfxxInfoMapper hspCfxxInfoMapper;
	
	@Autowired
	private HspCfxxExecCustomMapper hspCfxxExecCustomMapper;
	
	@Autowired
	private HspCfxxExecMapper hspCfxxExecMapper; 
	/**
	 * 获取患者数据
	 * @param emgSeq
	 * @return
	 */
	@Override
	public HspemginfCustom getEmgInfData(String emgSeq) throws Exception{
		return hspCfxxInfoCustomMapper.getEmgInfData(emgSeq);
	}
	
	
	
	/**
	 * 获取处方信息（视图+本地处方表）
	 * @param hspCfxxInfoQueryDto
	 */
	@Override
	public List<HspCfxxInfoCustom> getCfxxDataAndHIS(HspCfxxInfoQueryDto hspCfxxInfoQueryDto) throws Exception{
		//本地处方表
		List<HspCfxxInfoCustom> cfxxList = hspCfxxInfoCustomMapper.getCfxxDataByLocal(hspCfxxInfoQueryDto);
		//HIS视图
		List<HspCfxxInfoCustom> hisList = hspCfxxInfoCustomMapper.getCfxxDataByHis(hspCfxxInfoQueryDto);
		cfxxList.addAll(hisList);
		//根据组号去重
		cfxxList = cfxxList.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(HspCfxxInfo :: getDaSub))), ArrayList::new));
		//条件筛选
		if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoQueryDto.getHspCfxxInfoCustom().getYzzt())) {
			//等于0为 未核对数据
			if("0".equals(hspCfxxInfoQueryDto.getHspCfxxInfoCustom().getYzzt())) {
				cfxxList = cfxxList.stream().filter((HspCfxxInfo cfxx) -> "0".equals(cfxx.getYzzt())).collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(HspCfxxInfo :: getDaSub))), ArrayList::new));
			//等于1为 除未核对的所有数据
			}else if("1".equals(hspCfxxInfoQueryDto.getHspCfxxInfoCustom().getYzzt())) {
				cfxxList = cfxxList.stream().filter((HspCfxxInfo cfxx) -> !"0".equals(cfxx.getYzzt())).collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(HspCfxxInfo :: getDaSub))), ArrayList::new));
			}
		}
		cfxxList.sort(Comparator.comparingLong(HspCfxxInfoCustom::getStartTimeLong).thenComparing(HspCfxxInfoCustom::getDaSeq).reversed());
		return cfxxList;
	}

	/**
	 * 医嘱核对
	 * @param hspCfxxInfoQueryDto
	 * @param activeUser
	 */
	@Override
	public void saveDocAdcSubmit(HspCfxxInfoQueryDto hspCfxxInfoQueryDto, ActiveUser activeUser) throws Exception{
		if(null != hspCfxxInfoQueryDto) {
			//获取核对数据
			List<HspCfxxInfoCustom> cfxxList = hspCfxxInfoQueryDto.getCfxxList();
			if(null != cfxxList && cfxxList.size()>0) {
				for (HspCfxxInfoCustom hspCfxxInfoCustom : cfxxList) {
					hspCfxxInfoCustom.setYzzt("2");
					hspCfxxInfoCustom.setDaWay(hspCfxxInfoCustom.getDaWayStr());
					String [] daSeqStr = {};
					if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getDaSeq())) {
						daSeqStr = hspCfxxInfoCustom.getDaSeq().split("\\|br");
					}
					//如果daSeq长度>1说明是多组数据拼接，则需处理数据，如果=1则直接保存
					if(daSeqStr.length>1) {
						//数据校验保存
						dataCheckSave(hspCfxxInfoCustom,daSeqStr,activeUser);
					}else {
						//判断数量是否为空
						if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getNum())) {
							hspCfxxInfoCustom.setDaNumb(new BigDecimal(hspCfxxInfoCustom.getNum()));
						}
						saveDocAdc(hspCfxxInfoCustom,activeUser);
					}
				}
				//通过HL7查询执行单数据
				saveExecCheck(hspCfxxInfoQueryDto, activeUser);
			}
		}
	}

	/**
	 * 医嘱核对多条数据拼接，校验保存(因同组数据拼接到一起，所以在入库时需拆分入库，判断是否为空以免因null值抛出异常，)
	 * @param hspCfxxInfoCustom
	 * @param daSeqStr
	 * @param activeUser
	 */
	public void dataCheckSave(HspCfxxInfoCustom hspCfxxInfoCustom, String [] daSeqStr, ActiveUser activeUser) {
		String [] daInfoStr = {};
		String [] daDoseStr = {};
		String [] daUnitStr = {};
		String [] daNumStr = {};
		String [] YFDWStr = {};
		String [] highRisk = {};
		String [] seriesStr = {};
		String [] mrnStr = {};
		String [] wardCodeStr = {};
		String [] deptCodeStr = {};
		String [] todayTimesStr = {};
		String [] provideBySelfStr = {};
		String [] isAuxStr = {};
		String [] exhortationStr = {};
		String [] remarkStr = {};
		String [] drugSpecStr = {};
		String [] daFreqStr = {};
		String [] orderStatusStr = {};
		if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getDaInfo())) {
			daInfoStr = hspCfxxInfoCustom.getDaInfo().split("\\|br");
		}
		if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getDaDose())) {
			daDoseStr = hspCfxxInfoCustom.getDaDose().split("\\|br");
		}
		if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getDaUnit())) {
			daUnitStr = hspCfxxInfoCustom.getDaUnit().split("\\|br");
		}
		if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getNum())) {
			daNumStr = hspCfxxInfoCustom.getNum().split("\\|br");
		}
		if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getYfdw())) {
			YFDWStr = hspCfxxInfoCustom.getYfdw().split("\\|br");
		}
		if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getHighRisk())) {
			highRisk = hspCfxxInfoCustom.getHighRisk().split("\\|br");
		}
		if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getSeriesStr())) {
			seriesStr = hspCfxxInfoCustom.getSeriesStr().split("\\|br");
		}
		if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getMrn())) {
			mrnStr = hspCfxxInfoCustom.getMrn().split("\\|br");
		}
		if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getWardCode())) {
			wardCodeStr = hspCfxxInfoCustom.getWardCode().split("\\|br");
		}
		if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getDeptCode())) {
			deptCodeStr = hspCfxxInfoCustom.getDeptCode().split("\\|br");
		}
		if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getTodayTimesStr())) {
			todayTimesStr = hspCfxxInfoCustom.getTodayTimesStr().split("\\|br");
		}
		if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getProvideBySelfStr())) {
			provideBySelfStr = hspCfxxInfoCustom.getProvideBySelfStr().split("\\|br");
		}
		if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getIsAuxStr())) {
			isAuxStr = hspCfxxInfoCustom.getIsAuxStr().split("\\|br");
		}
		if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getExhortation())) {
			exhortationStr = hspCfxxInfoCustom.getExhortation().split("\\|br");
		}
		if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getRemark())) {
			remarkStr = hspCfxxInfoCustom.getRemark().split("\\|br");
		}
		if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getDrugSpec())) {
			drugSpecStr = hspCfxxInfoCustom.getDrugSpec().split("\\|br");
		}
		if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getDaFreq())) {
			daFreqStr = hspCfxxInfoCustom.getDaFreq().split("\\|br");
		}
		if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getOrderStatus())) {
			orderStatusStr = hspCfxxInfoCustom.getOrderStatus().split("\\|br");
		}
		
		for (int i = 0; i<daSeqStr.length; i++) {
			if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getDaSeq())) {
				hspCfxxInfoCustom.setDaSeq(daSeqStr[i]);
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getDaInfo())) {
				hspCfxxInfoCustom.setDaInfo(daInfoStr[i]);
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getDaDose())) {
				hspCfxxInfoCustom.setDaDose(daDoseStr[i]);
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getDaUnit())) {
				hspCfxxInfoCustom.setDaUnit(daUnitStr[i]);
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getNum())) {
				hspCfxxInfoCustom.setDaNumb(new BigDecimal(daNumStr[i]));
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getYfdw())) {
				hspCfxxInfoCustom.setYfdw(YFDWStr[i]);
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getHighRisk())) {
				hspCfxxInfoCustom.setHighRisk(highRisk[i]);
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getSeriesStr())) {
				hspCfxxInfoCustom.setSeries(Short.valueOf(seriesStr[i]));
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getMrn())) {
				hspCfxxInfoCustom.setMrn(mrnStr[i]);
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getWardCode())) {
				hspCfxxInfoCustom.setWardCode(wardCodeStr[i]);
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getDeptCode())) {
				hspCfxxInfoCustom.setDeptCode(deptCodeStr[i]);
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getTodayTimesStr())) {
				hspCfxxInfoCustom.setTodayTimes(Short.valueOf(todayTimesStr[i]));
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getProvideBySelfStr())) {
				hspCfxxInfoCustom.setProvideBySelf(Short.valueOf(provideBySelfStr[i]));
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getIsAuxStr())) {
				hspCfxxInfoCustom.setIsAux(Short.valueOf(isAuxStr[i]));
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getExhortation())) {
				hspCfxxInfoCustom.setExhortation(exhortationStr[i]);
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getProvideBySelfStr())) {
				hspCfxxInfoCustom.setRemark(remarkStr[i]);
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getDrugSpec())) {
				hspCfxxInfoCustom.setDrugSpec(drugSpecStr[i]);
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getDaFreq())) {
				hspCfxxInfoCustom.setDaFreq(daFreqStr[i]);
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxInfoCustom.getOrderStatus())) {
				hspCfxxInfoCustom.setOrderStatus(orderStatusStr[i]);
			}
			
			//保存数据
			saveDocAdc(hspCfxxInfoCustom,activeUser);
		}
	}
	
	/**
	 * 医嘱核对保存
	 * @param hspCfxxInfoCustom
	 * @param activeUser
	 */
	public void saveDocAdc(HspCfxxInfoCustom hspCfxxInfoCustom, ActiveUser activeUser) {
		String daSeq = hspCfxxInfoCustom.getDaSeq();
		HspCfxxInfo hspCfxxInfo = hspCfxxInfoMapper.selectByPrimaryKey(daSeq);
		//不为空则是修改
		if(null != hspCfxxInfo) {
			hspCfxxInfoCustom.setCrtTime(hspCfxxInfo.getCrtTime());
			hspCfxxInfoCustom.setCrtUser(hspCfxxInfo.getCrtUser());
			hspCfxxInfoCustom.setModTime(new Date());
			hspCfxxInfoCustom.setModUser(activeUser.getUsrname());
			hspCfxxInfoMapper.updateByPrimaryKey(hspCfxxInfoCustom);
		}else {
			hspCfxxInfoCustom.setCrtTime(new Date());
			hspCfxxInfoCustom.setCrtUser(activeUser.getUsrname());
			hspCfxxInfoCustom.setModTime(new Date());
			hspCfxxInfoCustom.setModUser(activeUser.getUsrname());
			hspCfxxInfoMapper.insert(hspCfxxInfoCustom);
		}
	}
	
	
	/**
	 * 医嘱核对添加执行单数据
	 * @param hspCfxxInfoQueryDto
	 * @param activeUser
	 * @throws Exception 
	 */
	public void saveExecCheck(HspCfxxInfoQueryDto hspCfxxInfoQueryDto, ActiveUser activeUser) throws Exception {
		HspCfxxExecQueryDto hspCfxxExecQueryDto = new HspCfxxExecQueryDto();
		HspCfxxExecCustom hspCfxxExecCustom = new HspCfxxExecCustom();
		hspCfxxExecCustom.setMpi(hspCfxxInfoQueryDto.getMPI());
		hspCfxxExecQueryDto.setHspCfxxExecCustom(hspCfxxExecCustom);
		hspCfxxExecQueryDto.setStartdate(hspCfxxInfoQueryDto.getStartdate());
		hspCfxxExecQueryDto.setEnddate(hspCfxxInfoQueryDto.getEnddate());
		//获取已存在的执行单数据
		List<HspCfxxExecCustom> execList = hspCfxxExecCustomMapper.getCfxxExec(hspCfxxExecQueryDto);
		//格式化时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        //通过HL7获取执行单数据
		List<HspCfxxExecCustom> execListNew = HL7Client.findHisCfxxExecByHL7(hspCfxxInfoQueryDto,sdf.format(hspCfxxInfoQueryDto.getStartdate()),sdf.format(hspCfxxInfoQueryDto.getEnddate()),activeUser,execList);
        //保存数据库中不存在的数据
        for (HspCfxxExecCustom execCustom : execListNew) {
        	hspCfxxExecMapper.insert(execCustom);
		}
        
	}
}
