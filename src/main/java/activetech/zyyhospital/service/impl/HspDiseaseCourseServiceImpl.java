package activetech.zyyhospital.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.dao.mapper.DstuserMapper;
import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.domain.Dstuser;
import activetech.base.pojo.domain.DstuserExample;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.SystemConfigService;
import activetech.basehis.dao.mapper.HspAotographInfoCustomMapper;
import activetech.basehis.pojo.dto.HspAotographInfoCustom;
import activetech.hospital.dao.mapper.HspEmgInfMapper;
import activetech.hospital.pojo.domain.HspEmgInf;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.util.ComparatorObject;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import activetech.zyyhospital.dao.mapper.HspCfjlInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspDiseaseCourseCustomMapper;
import activetech.zyyhospital.dao.mapper.HspDiseaseCourseMapper;
import activetech.zyyhospital.dao.mapper.HspOperateInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspPrintInfMapper;
import activetech.zyyhospital.dao.mapper.HspQjjlInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspTransfusionInfCustomMapper;
import activetech.zyyhospital.pojo.domain.HspDiseaseCourse;
import activetech.zyyhospital.pojo.domain.HspDiseaseCourseExample;
import activetech.zyyhospital.pojo.domain.HspDiseaseCourseWithBLOBs;
import activetech.zyyhospital.pojo.domain.HspPrintInf;
import activetech.zyyhospital.pojo.dto.HspCfjlInfCustom;
import activetech.zyyhospital.pojo.dto.HspDiseaseCourseCustom;
import activetech.zyyhospital.pojo.dto.HspDiseaseCourseQueryDto;
import activetech.zyyhospital.pojo.dto.HspJjbjlInfCustom;
import activetech.zyyhospital.pojo.dto.HspLqbljlQueryDto;
import activetech.zyyhospital.pojo.dto.HspOperateInfCustom;
import activetech.zyyhospital.pojo.dto.HspQjjlInfCustom;
import activetech.zyyhospital.pojo.dto.HspTransfusionInfCustom;
import activetech.zyyhospital.service.HspDiseaseCourseService;

public class HspDiseaseCourseServiceImpl implements HspDiseaseCourseService {
	
	@Autowired
	private HspDiseaseCourseCustomMapper hspDiseaseCourseCustomMapper;
	@Autowired
	private HspDiseaseCourseMapper hspDiseaseCourseMapper;
	@Autowired
	private HspEmgInfMapper hspEmgInfMapper;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private HspCfjlInfCustomMapper hspCfjlInfCustomMapper;
	@Autowired
	private HspQjjlInfCustomMapper hspQjjlInfCustomMapper;
	@Autowired
	private DstuserMapper dstuserMapper;
	@Autowired
	private HspPrintInfMapper hspPrintInfMapper;
	@Autowired
	private HspAotographInfoCustomMapper hspAotographInfoCustomMapper;

	@Autowired
	private HspOperateInfCustomMapper hspOperateInfCustomMapper;
	
	@Autowired
	private HspTransfusionInfCustomMapper hspTransfusionInfCustomMapper; 
	
	@Override
	public HspDiseaseCourseCustom findHspDiseaseCourse(
			HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto) {
		return hspDiseaseCourseCustomMapper.findHspDiseaseCourse(hspDiseaseCourseQueryDto);
	}

	@Override
	public List<HspDiseaseCourseCustom> findHspDiseaseCourseList(
			HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto) {
		return hspDiseaseCourseCustomMapper.findHspDiseaseCourseList(hspDiseaseCourseQueryDto);
	}

	@Override
	public String saveOrUpdate(HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto,
			ActiveUser activeUser) throws Exception {
		//保存后返回唯一键
		String onlySeq = "";
		HspDiseaseCourseCustom courseCustom = hspDiseaseCourseQueryDto.getHspDiseaseCourseCustom();
		//非空判断
		String nullstr = this.updateHspDiseaseCourseCustomNotNullAndEmptyByTrim(courseCustom);
		if(StringUtils.isNotNullAndEmptyByTrim(nullstr)){
			 ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { nullstr}));
		}
		courseCustom.setUpdateDoc(activeUser.getUsrno());
		courseCustom.setUpdateDate(new Date());
		//修改留观号
		HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(courseCustom.getEmgSeqDc());
		if(null != hspEmgInf ){
			hspEmgInfMapper.updateByPrimaryKey(hspEmgInf);
		}
		
		if(StringUtils.isNotNullAndEmptyByTrim(courseCustom.getDiseaseCourseSeq())){
			HspDiseaseCourseWithBLOBs courseWithBLOBs = hspDiseaseCourseMapper.selectByPrimaryKey(courseCustom.getDiseaseCourseSeq());
			if(null != courseWithBLOBs){
				courseCustom.setCreateDate(courseWithBLOBs.getCreateDate());
				hspDiseaseCourseMapper.updateByPrimaryKeyWithBLOBs(courseCustom);
				onlySeq = courseCustom.getDiseaseCourseSeq();
				return onlySeq;
			}
		}
		courseCustom.setDiseaseCourseSeq(UUIDBuild.getUUID());
		courseCustom.setCreateDate(new Date());
		hspDiseaseCourseMapper.insert(courseCustom);
		onlySeq = courseCustom.getDiseaseCourseSeq();
		return onlySeq;
	}

	@Override
	public void deleteDiseaseCourse(String diseaseCourseSeq) {
		hspDiseaseCourseMapper.deleteByPrimaryKey(diseaseCourseSeq);
	}

	@Override
	public void saveOrUpdateFirst(HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto,
			HspLqbljlQueryDto hspLqbljlQueryDto, ActiveUser activeUser) throws Exception {
		HspDiseaseCourseCustom courseCustom = hspDiseaseCourseQueryDto.getHspDiseaseCourseCustom();
		//非空判断
		String nullstr = this.updateHspDiseaseCourseCustomNotNullAndEmptyByTrim(courseCustom);
		if(StringUtils.isNotNullAndEmptyByTrim(nullstr)){
			 ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { nullstr}));
		}
		courseCustom.setUpdateDoc(activeUser.getUsrno());
		courseCustom.setUpdateDate(new Date());
		//修改留观号
		HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(courseCustom.getEmgSeqDc());
		if(null != hspEmgInf){
			if(StringUtils.isNotNullAndEmptyByTrim(hspDiseaseCourseQueryDto.getObservationCode())){
				hspEmgInf.setObservationCode(hspDiseaseCourseQueryDto.getObservationCode());
			}else{
				String observationCode = systemConfigService.findSequences("HSPEMGINF_OBSERVATIONCODE","6","L");
				hspEmgInf.setObservationCode(observationCode);
			}
		}
		if(StringUtils.isNotNullAndEmptyByTrim(courseCustom.getDiseaseCourseSeq())){
			HspDiseaseCourseWithBLOBs courseWithBLOBs = hspDiseaseCourseMapper.selectByPrimaryKey(courseCustom.getDiseaseCourseSeq());
			if(null != courseWithBLOBs){
				courseCustom.setCreateDate(courseWithBLOBs.getCreateDate());
				//如果是自定义签名则清空前端传过来的用户号
				if (StringUtils.isNotNullAndEmptyByTrim(courseCustom.getCreateDoc())) {
					DstuserExample userExample = new DstuserExample();
					DstuserExample.Criteria dstuserCriteria = userExample.createCriteria();
					dstuserCriteria.andUsrnoEqualTo(courseCustom.getCreateDoc());
					List<Dstuser> list = dstuserMapper.selectByExample(userExample);
					if(list != null && list.size() == 1){
						Dstuser dstuser = list.get(0);
						if (!dstuser.getUsrname().equals(courseCustom.getCreateNam())) {
							courseCustom.setCreateDoc(null);
						}
					}
				}
				hspDiseaseCourseMapper.updateByPrimaryKeyWithBLOBs(courseCustom);
			}
		}else{
			HspDiseaseCourseExample example = new HspDiseaseCourseExample();
			HspDiseaseCourseExample.Criteria criteria = example.createCriteria();
			criteria.andEmgSeqDcEqualTo(hspEmgInf.getEmgSeq());
			criteria.andCourseTypeEqualTo(courseCustom.getCourseType());
			List<HspDiseaseCourse> hspDiseaseCourseList = hspDiseaseCourseMapper.selectByExample(example);
			if (hspDiseaseCourseList.size()>0) {
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] {"保存失败！请重新操作。"}));
			}else {
				courseCustom.setDiseaseCourseSeq(UUIDBuild.getUUID());
				courseCustom.setCreateDate(new Date());
				//如果是自定义签名则清空前端传过来的用户号
				if (StringUtils.isNotNullAndEmptyByTrim(courseCustom.getCreateDoc())) {
					DstuserExample userExample = new DstuserExample();
					DstuserExample.Criteria dstuserCriteria = userExample.createCriteria();
					dstuserCriteria.andUsrnoEqualTo(courseCustom.getCreateDoc());
					List<Dstuser> list = dstuserMapper.selectByExample(userExample);
					if(list != null && list.size() == 1){
						Dstuser dstuser = list.get(0);
						if (!dstuser.getUsrname().equals(courseCustom.getCreateNam())) {
							courseCustom.setCreateDoc(null);
						}
					}
				}
				hspDiseaseCourseMapper.insert(courseCustom);
			}
		}
		//更新hsp_emg_inf留观号
		hspEmgInfMapper.updateByPrimaryKey(hspEmgInf);
	}
	
	//非空判断
	public String updateHspDiseaseCourseCustomNotNullAndEmptyByTrim(HspDiseaseCourseCustom hspConsentInfCustom){
				//机构名称
				if(!StringUtils.isNotNullAndEmptyByTrim(hspConsentInfCustom.getEmgSeqDc())){
					return "预检号";
				}
		return null;
	}

	@Override
	public int findHspDiseaseCourseTotal(HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto) {
		return hspDiseaseCourseCustomMapper.findHspDiseaseCourseTotal(hspDiseaseCourseQueryDto);
	}

	@Override
	public List<Object> findAllHspDiseaseCourseList(HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto) throws Exception {
		List<Object> allObj  = new ArrayList<Object>(); 
		List<HspDiseaseCourseCustom> hspDiseaseCourseCustomList = hspDiseaseCourseCustomMapper.findHspDiseaseCourseListNotEquals(hspDiseaseCourseQueryDto);		
		for (HspDiseaseCourseCustom hspDiseaseCourseCustom : hspDiseaseCourseCustomList) {
			HspAotographInfoCustom hspAotographInfoCustom = new HspAotographInfoCustom();
			hspAotographInfoCustom.setRelevanceId(hspDiseaseCourseCustom.getDiseaseCourseSeq());
			hspAotographInfoCustom.setDocumentTable("HSP_DISEASE_COURSE");
			hspAotographInfoCustom.setDocumentType(hspDiseaseCourseCustom.getCourseType());
			List<HspAotographInfoCustom> hspAotographInfoList = hspAotographInfoCustomMapper.findDzqmImg(hspAotographInfoCustom);
			hspDiseaseCourseCustom.setHspAotographInfoList(hspAotographInfoList);
		}
		allObj.addAll(hspDiseaseCourseCustomList);
		String emgSeq = hspDiseaseCourseQueryDto.getHspDiseaseCourseCustom().getEmgSeqDc();
		HspLqbljlQueryDto hspLqbljlQueryDto = new HspLqbljlQueryDto();
		HspJjbjlInfCustom hspJjbjlInfCustom = new HspJjbjlInfCustom();
		HspCfjlInfCustom hspCfjlInfCustom = new HspCfjlInfCustom();
		HspQjjlInfCustom hspQjjlInfCustom = new HspQjjlInfCustom();
		//手术操作记录
		HspOperateInfCustom hspOperateInfCustom = new HspOperateInfCustom();
		//输血记录
		HspTransfusionInfCustom hspTransfusionInfCustom = new HspTransfusionInfCustom();
		//emgseq赋值
		hspJjbjlInfCustom.setEmgSeq(emgSeq);
		hspCfjlInfCustom.setEmgSeq(emgSeq);
		hspQjjlInfCustom.setEmgSeq(emgSeq);
		hspOperateInfCustom.setEmgSeq(emgSeq);
		hspTransfusionInfCustom.setEmgSeq(emgSeq);
		
		hspLqbljlQueryDto.setHspJjbjlInfCustom(hspJjbjlInfCustom);
		hspLqbljlQueryDto.setHspCfjlInfCustom(hspCfjlInfCustom);
		hspLqbljlQueryDto.setHspQjjlInfCustom(hspQjjlInfCustom);
		hspLqbljlQueryDto.setHspOperateInfCustom(hspOperateInfCustom);
		hspLqbljlQueryDto.setHspTransfusionInfCustom(hspTransfusionInfCustom);
		
		hspLqbljlQueryDto.setSort("cfjlDat");
		hspLqbljlQueryDto.setOrder("asc");
		List<HspCfjlInfCustom> hspCfjlInfCustomList = hspCfjlInfCustomMapper.findhspCfjlInfList(hspLqbljlQueryDto);	
		for (HspCfjlInfCustom hspCfjlInfCustom2 : hspCfjlInfCustomList) {
			HspAotographInfoCustom hspAotographInfoCustom = new HspAotographInfoCustom();
			hspAotographInfoCustom.setRelevanceId(hspCfjlInfCustom2.getCfjlSeq());
			hspAotographInfoCustom.setDocumentTable("HSP_CFJL_INF");
			hspAotographInfoCustom.setDocumentType(hspCfjlInfCustom2.getCfjlType());
			List<HspAotographInfoCustom> hspAotographInfoList = hspAotographInfoCustomMapper.findDzqmImg(hspAotographInfoCustom);
			hspCfjlInfCustom2.setHspAotographInfoList(hspAotographInfoList);
		}	
		allObj.addAll(hspCfjlInfCustomList);
		//抢救记录
		hspLqbljlQueryDto.setSort("qjjlDat");
		List<HspQjjlInfCustom> hspQjjlInfCustomList = hspQjjlInfCustomMapper.findhspQjjlInfList(hspLqbljlQueryDto);
		for (HspQjjlInfCustom hspQjjlInfCustom2 : hspQjjlInfCustomList) {
			HspAotographInfoCustom hspAotographInfoCustom = new HspAotographInfoCustom();
			hspAotographInfoCustom.setRelevanceId(hspQjjlInfCustom2.getQjjlSeq());
			hspAotographInfoCustom.setDocumentTable("HSP_QJJL_INF");
			List<HspAotographInfoCustom> hspAotographInfoList = hspAotographInfoCustomMapper.findDzqmImg(hspAotographInfoCustom);
			hspQjjlInfCustom2.setHspAotographInfoList(hspAotographInfoList);
		}
		allObj.addAll(hspQjjlInfCustomList);
		//手术操作记录
		hspLqbljlQueryDto.setSort("OPER_DAT");
		List<HspOperateInfCustom> hspOperateInfCustomList = hspOperateInfCustomMapper.findOperateListPrint(hspLqbljlQueryDto);
		allObj.addAll(hspOperateInfCustomList);
		//输血记录
		hspLqbljlQueryDto.setSort("TRANSFUSION_DAT");
		List<HspTransfusionInfCustom> transfusionInfList = hspTransfusionInfCustomMapper.findTransfusionListPrint(hspLqbljlQueryDto);
		List<Dstdictinfo> pbgNbrTypeList = systemConfigService.findDictinfoByType("XT_COD");
		final Map<String,String> map = pbgNbrTypeList.stream().collect(Collectors.toMap(Dstdictinfo::getInfocode, Dstdictinfo::getInfo));
		if(StringUtils.isNotNullAndZero(transfusionInfList)) {
			HspTransfusionInfServiceImpl transfusionInfServiceImpl = new HspTransfusionInfServiceImpl();
			transfusionInfList.forEach(transfusion ->{
				transfusionInfServiceImpl.vitalSignsJoining(transfusion,map);
			});
		}
		for (HspTransfusionInfCustom hspTransfusionInfCustom2 : transfusionInfList) {
			HspAotographInfoCustom hspAotographInfoCustom = new HspAotographInfoCustom();
			hspAotographInfoCustom.setRelevanceId(hspTransfusionInfCustom2.getTransfusionSeq());
			hspAotographInfoCustom.setDocumentTable("HSP_TRANSFUSION_INF");
			List<HspAotographInfoCustom> hspAotographInfoList = hspAotographInfoCustomMapper.findDzqmImg(hspAotographInfoCustom);
			hspTransfusionInfCustom2.setHspAotographInfoList(hspAotographInfoList);
		}
		allObj.addAll(transfusionInfList);
		Collections.sort(allObj, new ComparatorObject("getComparatorVal"));
		return allObj;
	}
	
	@Override
	public void afterPrint(HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto) throws Exception {
		HspemginfCustom param = new HspemginfCustom();
		param.setEmgSeq(hspDiseaseCourseQueryDto.getEmgSeq());
		HspPrintInf hspPrintInf = new HspPrintInf();
		hspPrintInf.setEmgSeq(hspDiseaseCourseQueryDto.getEmgSeq());
		hspPrintInf.setPrintId(UUIDBuild.getUUID());
		hspPrintInf.setPrintPage(hspDiseaseCourseQueryDto.getPrintPage());
		hspPrintInf.setPrintType(hspDiseaseCourseQueryDto.getPrintType());
		hspPrintInfMapper.insertSelective(hspPrintInf);
		if(StringUtils.isNotNullAndZero(hspDiseaseCourseQueryDto.getDiseaseCourseSeqList())){
			//更新病程表打印状态
			hspDiseaseCourseCustomMapper.updDiseaseCourseAfterPrint(hspDiseaseCourseQueryDto);
		}
		if(StringUtils.isNotNullAndZero(hspDiseaseCourseQueryDto.getCfjlSeqList())){
			///更新查房记录表打印状态
			hspCfjlInfCustomMapper.updCfjlAfterPrint(hspDiseaseCourseQueryDto);
		}
		if(StringUtils.isNotNullAndZero(hspDiseaseCourseQueryDto.getQjjlSeqList())){
			//更新抢救记录表打印状态
			hspQjjlInfCustomMapper.updQjjlAfterPrint(hspDiseaseCourseQueryDto);
		}
		if(StringUtils.isNotNullAndZero(hspDiseaseCourseQueryDto.getOperateInfList())){
			//更新手术操作打印状态
			hspOperateInfCustomMapper.updOperateAfterPrint(hspDiseaseCourseQueryDto);
		}
		if(StringUtils.isNotNullAndZero(hspDiseaseCourseQueryDto.getTransfusionSeqList())){
			//更新输血记录打印状态
			hspTransfusionInfCustomMapper.updTransfusionAfterPrint(hspDiseaseCourseQueryDto);
		}
	}



}
