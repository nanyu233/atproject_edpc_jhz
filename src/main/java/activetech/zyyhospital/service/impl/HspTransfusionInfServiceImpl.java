package activetech.zyyhospital.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.service.SystemConfigService;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.zyyhospital.dao.mapper.HspTransfusionInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspTransfusionInfMapper;
import activetech.zyyhospital.pojo.domain.HspTransfusionInf;
import activetech.zyyhospital.pojo.dto.HspTransfusionInfCustom;
import activetech.zyyhospital.pojo.dto.HspTransfusionInfQueryDto;
import activetech.zyyhospital.service.HspTransfusionInfService;

public class HspTransfusionInfServiceImpl implements HspTransfusionInfService {

	@Autowired
	private HspTransfusionInfCustomMapper hspTransfusionInfCustomMapper;
	
	@Autowired
	private HspTransfusionInfMapper hspTransfusionInfMapper;
	
	@Autowired
	private SystemConfigService systemConfigService;
	
	/**
	 * 查询输血记录条数
	 * @param hspTransfusionInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@Override
	public int findTransfusionCountByEmgSeq(HspTransfusionInfQueryDto hspTransfusionInfQueryDto) throws Exception {
		return hspTransfusionInfCustomMapper.findTransfusionCountByEmgSeq(hspTransfusionInfQueryDto);
	}

	/**
	 * 查询输血记录列表
	 * @param hspTransfusionInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<HspTransfusionInfCustom> findTransfusionListByEmgSeq(HspTransfusionInfQueryDto hspTransfusionInfQueryDto) throws Exception {
		List<HspTransfusionInfCustom> transfusionList = hspTransfusionInfCustomMapper.findTransfusionListByEmgSeq(hspTransfusionInfQueryDto);
		List<Dstdictinfo> pbgNbrTypeList = systemConfigService.findDictinfoByType("XT_COD");
		final Map<String,String> map = pbgNbrTypeList.stream().collect(Collectors.toMap(Dstdictinfo::getInfocode, Dstdictinfo::getInfo));
		if(StringUtils.isNotNullAndZero(transfusionList)) {
			transfusionList.forEach(transfusion ->{
				vitalSignsJoining(transfusion,map);
			});
		}
		return transfusionList;
	}
	
	/**
	 * 获取一条输血记录
	 * @param transfusionSeq
	 * @return
	 * @throws Exception
	 */
	@Override
	public HspTransfusionInf getTransfusionInf(String transfusionSeq) throws Exception {
		return hspTransfusionInfMapper.selectByPrimaryKey(transfusionSeq);
	}
	
	/**
	 * 保存输血记录
	 * @param hspTransfusionInfQueryDto
	 * @param activeUser
	 * @throws Exception
	 */
	@Override
	public String updateBloodTransRecord(HspTransfusionInfQueryDto hspTransfusionInfQueryDto, ActiveUser activeUser) throws Exception {
		HspTransfusionInfCustom hspTransfusionInfCustom = hspTransfusionInfQueryDto.getHspTransfusionInfCustom();
		if(null != hspTransfusionInfCustom) {
			if(StringUtils.isNotNullAndEmptyByTrim(hspTransfusionInfCustom.getTransfusionSeq())) {
				HspTransfusionInf hspTransfusionInf = hspTransfusionInfMapper.selectByPrimaryKey(hspTransfusionInfCustom.getTransfusionSeq());
				hspTransfusionInfCustom.setCrtDat(hspTransfusionInf.getCrtDat());
				hspTransfusionInfCustom.setCrtCod(hspTransfusionInf.getCrtCod());
				hspTransfusionInfCustom.setCrtNam(hspTransfusionInf.getCrtNam());
				hspTransfusionInfCustom.setUpdDat(new Date());
				hspTransfusionInfCustom.setUpdCod(activeUser.getUsrno());
				hspTransfusionInfCustom.setUpdNam(activeUser.getUsrno());
				hspTransfusionInfMapper.updateByPrimaryKey(hspTransfusionInfCustom);
			}else {
				String date = DateUtil.formatDateByFormat(new Date(), "yyyyMMdd");
				String transfusionSeq =systemConfigService.findSequences("HSPTRANSFUSIONINF_SEQ","6",date);
				hspTransfusionInfCustom.setTransfusionSeq(transfusionSeq);
				hspTransfusionInfCustom.setCrtDat(new Date());
				hspTransfusionInfCustom.setCrtCod(activeUser.getUsrno());
				hspTransfusionInfCustom.setCrtNam(activeUser.getUsrno());
				hspTransfusionInfCustom.setUpdDat(new Date());
				hspTransfusionInfCustom.setUpdCod(activeUser.getUsrno());
				hspTransfusionInfCustom.setUpdNam(activeUser.getUsrno());
				hspTransfusionInfMapper.insert(hspTransfusionInfCustom);
			}
			return hspTransfusionInfCustom.getTransfusionSeq();
		}
		return "";
	}
	
	
	/**
	 * 删除输血记录
	 * @param transfusionSeq
	 * @throws Exception
	 */
	@Override
	public void delBloodTransRecord(String transfusionSeq) throws Exception {
		hspTransfusionInfMapper.deleteByPrimaryKey(transfusionSeq);
	}
	
	
	/**
	 * 输血后评估（生命体征）拼接
	 */
	public void vitalSignsJoining(HspTransfusionInfCustom hspTransfusionInfCustom,Map<String,String> map) {
		//拼接字段
		StringBuffer buffer = new StringBuffer();
		//体温
		String tmpNbr = hspTransfusionInfCustom.getTmpNbr();
		//心率
		String hrtRte = hspTransfusionInfCustom.getHrtRte();
		//呼吸 呼吸扩充
		String breNbr = hspTransfusionInfCustom.getBreNbr();
		String breNbrFlg = hspTransfusionInfCustom.getBreNbrFlg();
		//血氧
		String oxyNbr = hspTransfusionInfCustom.getOxyNbr();
		//脉搏
		String pulse = hspTransfusionInfCustom.getPulse(); 
		//血糖 血氧类型
		String pbgNbr = hspTransfusionInfCustom.getPbgNbr() == null ? "" : hspTransfusionInfCustom.getPbgNbr();
		String pbgNbrType = hspTransfusionInfCustom.getPbgNbrType();
		//血压
		String sbpUpNbr = hspTransfusionInfCustom.getSbpUpNbr() == null ? "" : hspTransfusionInfCustom.getSbpUpNbr();
		String sbpDownNbr = hspTransfusionInfCustom.getSbpDownNbr() == null ? "" : hspTransfusionInfCustom.getSbpDownNbr();
		//体温不为空
		if(StringUtils.isNotNullAndEmptyByTrim(tmpNbr)) {
			buffer.append("体温：耳温-" + tmpNbr + "°C，");
		}
		//心率
		if(StringUtils.isNotNullAndEmptyByTrim(hrtRte)) {
			buffer.append("心率：" + hrtRte + "次/分，");
		}		
		//呼吸
		if(StringUtils.isNotNullAndEmptyByTrim(breNbr)) {
			buffer.append("呼吸：");
			if("2".equals(breNbrFlg)) {
				buffer.append("机械通气-");
			}
			buffer.append(breNbr + "次/分，");
		}
		//血氧不为空
		if(StringUtils.isNotNullAndEmptyByTrim(oxyNbr)) {
			buffer.append("血氧：" + oxyNbr + "%，");
		}
		//脉搏
		if(StringUtils.isNotNullAndEmptyByTrim(pulse)){
			buffer.append("脉搏：" + pulse + "次/分，");
		}		
		//血糖
		if(StringUtils.isNotNullAndEmptyByTrim(pbgNbr)) {
			buffer.append("血糖：");
			if(StringUtils.isNotNullAndEmptyByTrim(pbgNbrType)) {
				buffer.append(map.get(pbgNbrType));
				buffer.append("-");
			}
			buffer.append(pbgNbr+"mmol/L，");
		}
		//血压不为空
		if(StringUtils.isNotNullAndEmptyByTrim(sbpUpNbr) || StringUtils.isNotNullAndEmptyByTrim(sbpDownNbr)) {
			buffer.append("血压：" + sbpUpNbr + "/" + sbpDownNbr + "mmHg");
		}		
		hspTransfusionInfCustom.setVitalSigns(buffer.toString());
	}

}
