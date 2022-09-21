package activetech.pda.service.impl;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.service.SystemConfigService;
import activetech.hl7.base.HL7Client;
import activetech.pda.dao.mapper.HspCfxxExecCustomMapper;
import activetech.pda.dao.mapper.HspCfxxExecMapper;
import activetech.pda.dao.mapper.HspCfxxInfoCustomMapper;
import activetech.pda.dao.mapper.HspCfxxRecordMapper;
import activetech.pda.pojo.domain.HspCfxxRecord;
import activetech.pda.pojo.domain.HspCfxxRecordExample;
import activetech.pda.pojo.dto.HspCfxxExecCustom;
import activetech.pda.pojo.dto.HspCfxxExecQueryDto;
import activetech.pda.pojo.dto.HspCfxxInfoCustom;
import activetech.pda.pojo.dto.HspCfxxInfoQueryDto;
import activetech.pda.service.HspCfxxExecService;
import activetech.util.DateUtil;
import activetech.util.StringUtils;

/**
 * 处方执行单信息Service实现类
 * @author machaofan
 *
 */
public class HspCfxxExecServiceImpl implements HspCfxxExecService {
	@Autowired
	private HspCfxxExecCustomMapper hspCfxxExecCustomMapper;
	
	@Autowired
	private SystemConfigService systemConfigService;
	
	@Autowired
	private HspCfxxRecordMapper hspCfxxRecordMapper;
	
	@Autowired
	private HspCfxxInfoCustomMapper hspCfxxInfoCustomMapper;
	
	@Autowired
	private HspCfxxExecMapper hspCfxxExecMapper;
	
	/**
	 * 获取患者固定时间内所有给药方式去重
	 * @param vstCad
	 * @return
	 */
	@Override
	public List<HspCfxxExecCustom> getDaWayByDate(HspCfxxExecQueryDto hspCfxxExecQueryDto) throws Exception {
		return hspCfxxExecCustomMapper.getDaWayByDate(hspCfxxExecQueryDto);
	}
	
	
	/**
	 * 执行单列表总条数
	 * @param hspCfxxExecQueryDto
	 * @return
	 */
	@Override
	public int getCfxxExecListCount(HspCfxxExecQueryDto hspCfxxExecQueryDto) throws Exception{
		return hspCfxxExecCustomMapper.getCfxxExecListCount(hspCfxxExecQueryDto);
	}

	/**
	 * 执行单列表
	 * @param hspCfxxExecQueryDto
	 * @return
	 */
	@Override
	public List<HspCfxxExecCustom> getCfxxExecList(HspCfxxExecQueryDto hspCfxxExecQueryDto) throws Exception {
        List<HspCfxxExecCustom> hspCfxxExecCustomList = hspCfxxExecCustomMapper.getCfxxExecList(hspCfxxExecQueryDto);
		return hspCfxxExecCustomList;
	}
	
	/**
	 * @Description 医嘱拆分、(更新最新医嘱、执行单的数据)
	 * 生产环境中会出现，医嘱核对时，执行单未生成（如医嘱已核对没有对应的执行单），医嘱核对之后，
	 * 医嘱数据会有修改（如核对时医嘱为正常状态，核对后医嘱修改为作废，医嘱查询仍为正常状态）
	 * 医嘱核对生成执行单后，医嘱成为作废状态，作废医嘱对应的执行单依然存在
	 * 为处理这个场景，在医嘱拆分时，查询最新的医嘱数据更新本地处方表，
	 * 根据已核对医嘱查询HL7接口拿到最新的处置单并插入执行单表中
	 * 通过作废医嘱组号删除对应执行单
	 * @author machaofan
	 * @date 2020年7月20日下午2:02:09
	 * @param hspCfxxExecQueryDto
	 * @throws Exception
	 * @return void
	 */
	@Override
	public void updateAdviceSplit(HspCfxxExecQueryDto hspCfxxExecQueryDto,ActiveUser activeUser) throws Exception {
		//获取最新医嘱
		HspCfxxInfoQueryDto hspCfxxInfoQueryDto = new HspCfxxInfoQueryDto();
		HspCfxxInfoCustom hspCfxxInfoCustom = new HspCfxxInfoCustom();
		hspCfxxInfoCustom.setMpi(hspCfxxExecQueryDto.getHspCfxxExecCustom().getMpi());
		hspCfxxInfoQueryDto.setStartdate(hspCfxxExecQueryDto.getStartdate());
		hspCfxxInfoQueryDto.setEnddate(hspCfxxExecQueryDto.getEnddate());
		hspCfxxInfoQueryDto.setHspCfxxInfoCustom(hspCfxxInfoCustom);
		//医嘱拆分获取最新医嘱数据,不通过组号去重合并
		//本地处方表
		List<HspCfxxInfoCustom> cfxxList = hspCfxxInfoCustomMapper.findCfxxListByLocal(hspCfxxInfoQueryDto);
		//HIS视图
		List<HspCfxxInfoCustom> hisList = hspCfxxInfoCustomMapper.findCfxxListByHis(hspCfxxInfoQueryDto);
		//通过主键取两个list交集，并保留his视图的数据
		List<HspCfxxInfoCustom> newTransfer = hisList.stream().filter(m -> cfxxList.stream().map(d -> d.getDaSeq()).collect(Collectors.toList()).contains(m.getDaSeq())).collect(Collectors.toList());
		//交集不为空
		if(StringUtils.isNotNullAndZero(newTransfer)) {
			hspCfxxInfoQueryDto.setCfxxList(newTransfer);
			//对已核对数据部分字段进行修改
			hspCfxxInfoCustomMapper.updateCfxxInfo(hspCfxxInfoQueryDto);
		}
		//通过已核对医嘱获取执行单
		//本地处方表
		List<HspCfxxInfoCustom> localList = hspCfxxInfoCustomMapper.getCfxxDataByLocal(hspCfxxInfoQueryDto);
		hspCfxxInfoQueryDto.setCfxxList(localList);
		hspCfxxInfoQueryDto.setMPI(hspCfxxExecQueryDto.getHspCfxxExecCustom().getMpi());
		saveExecCheck(hspCfxxInfoQueryDto, activeUser);
		//获取作废医嘱
		hspCfxxInfoCustom.setOrderStatus("作废");
		List<HspCfxxInfoCustom> invalidList = hspCfxxInfoCustomMapper.getCfxxDataByLocal(hspCfxxInfoQueryDto);
		//通过作废医嘱的组号删除对应的执行单
		if(StringUtils.isNotNullAndZero(invalidList)) {
			for (HspCfxxInfoCustom exec : invalidList) {
				hspCfxxExecCustomMapper.deleteCfxxExecByDaSub(exec.getDaSub());
			}
		}
		//医嘱拆分
		hspCfxxExecCustomMapper.updateAdviceSplit(hspCfxxExecQueryDto);
	}
	
	/**
	 * 医嘱拆分打印列表
	 * @param hspCfxxExecQueryDto
	 * @return
	 */
	@Override
	public List<HspCfxxExecCustom> adviceSplitPrint(HspCfxxExecQueryDto hspCfxxExecQueryDto) throws Exception{
		List<HspCfxxExecCustom> adviceExecList = hspCfxxExecCustomMapper.adviceSplitPrint(hspCfxxExecQueryDto);
		//处理多条处方信息，将拼接信息拆分放到List中，以便前端做数据处理
		for (HspCfxxExecCustom hspCfxxExecCustom : adviceExecList) {
			List<Map<String,Object>> execList = new ArrayList<Map<String,Object>>();
			String [] daInfoStr = {};
			String [] daDoseStr = {};
			String [] daUnitStr = {};
			if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxExecCustom.getDaInfo())) {
				daInfoStr = hspCfxxExecCustom.getDaInfo().split("\\|br");
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxExecCustom.getDaDose())) {
				daDoseStr = hspCfxxExecCustom.getDaDose().split("\\|br");
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxExecCustom.getDaUnit())) {
				daUnitStr = hspCfxxExecCustom.getDaUnit().split("\\|br");
			}
			for (int i = 0; i < daInfoStr.length; i++) {
				Map<String,Object> map = new HashMap<String,Object>();
				if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxExecCustom.getDaInfo())) {
					map.put("daInfo", daInfoStr[i]);
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxExecCustom.getDaDose())) {
					map.put("daDose", daDoseStr[i]);
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspCfxxExecCustom.getDaUnit())) {
					map.put("daUnit", daUnitStr[i]);
				}
				execList.add(map);
			}
			hspCfxxExecCustom.setInfoList(execList);
		}
		return adviceExecList;
	}
	
	/**
	 * 打印执行单
	 * @param execSeqStr
	 */
	@Override
	public void printExec(HspCfxxExecQueryDto hspCfxxExecQueryDto) throws Exception{
		HspCfxxExecCustom hspCfxxExecCustom = hspCfxxExecQueryDto.getHspCfxxExecCustom();
		String insPrint = hspCfxxExecCustom.getIsprint();
		String [] disposalSeq = hspCfxxExecCustom.getDisposalSeq().split(",");
		for (String string : disposalSeq) {
				hspCfxxExecCustomMapper.printExec(string,insPrint);
		}
	}
	
	
	/**
	 * 医嘱执行列表总条数
	 * @param hspCfxxExecQueryDto
	 * @return
	 */
	@Override
	public int getAdviceExecListCount(HspCfxxExecQueryDto hspCfxxExecQueryDto) throws Exception{
		return hspCfxxExecCustomMapper.getAdviceExecListCount(hspCfxxExecQueryDto);
	}
	
	/**
	 * 医嘱执行列表
	 * @param hspCfxxExecQueryDto
	 * @return
	 */
	@Override
	public List<HspCfxxExecCustom> getAdviceExecList(HspCfxxExecQueryDto hspCfxxExecQueryDto) throws Exception{
		return hspCfxxExecCustomMapper.getAdviceExecList(hspCfxxExecQueryDto);
	}
	
	/**
	 * 医嘱执行
	 * @param hspCfxxExecQueryDto
	 * @return
	 */
	@Override
	public void updateAdviceExec(HspCfxxExecQueryDto hspCfxxExecQueryDto, ActiveUser activeUser) throws Exception{
		if(null != hspCfxxExecQueryDto) {
			//医嘱执行List
			List<HspCfxxExecCustom> execList = hspCfxxExecQueryDto.getExecList();
			for (HspCfxxExecCustom hspCfxxExecCustom : execList) {
				//如果是待执行 则将状态改为已执行	
				if("1".equals(hspCfxxExecCustom.getZxdzt())){
					hspCfxxExecCustom.setZxdzt("2");
					//流水记录
					HspCfxxRecord hspCfxxRecord = new HspCfxxRecord();
					String date = DateUtil.formatDateByFormat(new Date(), "yyyyMMdd");
					String recordSeq = systemConfigService.findSequences("HSPCFXXRECORDSEQ","6", date);
					hspCfxxRecord.setRecordSeq(recordSeq);
					hspCfxxRecord.setDisposalSeq(hspCfxxExecCustom.getDisposalSeq());
					hspCfxxRecord.setMpi(hspCfxxExecCustom.getMpi());
					hspCfxxRecord.setRecordStatus("执行");
					hspCfxxRecord.setRecordDate(new Date());
					hspCfxxRecord.setRecordUsrno(activeUser.getUsrno());
					hspCfxxRecord.setRecordUsrnam(activeUser.getUsrname());
					hspCfxxRecord.setRemaker("PC执行");
					hspCfxxRecordMapper.insert(hspCfxxRecord);
				}else {
					//执行状态为 输液中、暂停输液、结束输液、继续输液 修改流水记录为 '执行'的时间、记录人
					HspCfxxRecordExample hspCfxxRecordExample = new HspCfxxRecordExample();
					HspCfxxRecordExample.Criteria criteria = hspCfxxRecordExample.createCriteria();
					criteria.andDisposalSeqEqualTo(hspCfxxExecCustom.getDisposalSeq());
					criteria.andMpiEqualTo(hspCfxxExecCustom.getMpi());
					criteria.andRecordStatusEqualTo("执行");
					List<HspCfxxRecord> recordList = hspCfxxRecordMapper.selectByExample(hspCfxxRecordExample);
					if(StringUtils.isNotNullAndZero(recordList)) {
						recordList.get(0).setRecordDate(hspCfxxExecCustom.getExecTime());
						recordList.get(0).setRecordUsrno(hspCfxxExecCustom.getExecUser());
						recordList.get(0).setRecordUsrnam(hspCfxxExecCustom.getExecUserxm());
						hspCfxxRecordMapper.updateByExample(recordList.get(0), hspCfxxRecordExample);
					}
				}
				hspCfxxExecCustomMapper.updateAdviceExec(hspCfxxExecCustom);
			}
		}
	}
	
	/**
	 * 医嘱拆分获取执行单数据
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
