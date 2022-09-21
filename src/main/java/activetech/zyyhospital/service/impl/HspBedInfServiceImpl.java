package activetech.zyyhospital.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.SystemConfigService;
import activetech.basehems.service.BaseHspemgInfService;
import activetech.hospital.dao.mapper.HspEmgInfMapper;
import activetech.hospital.dao.mapper.HspSqlInfMapper;
import activetech.hospital.pojo.domain.HspEmgInf;
import activetech.hospital.pojo.domain.HspSqlInf;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.zyyhospital.dao.mapper.HspBedInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspBedInfMapper;
import activetech.zyyhospital.pojo.domain.HspBedInf;
import activetech.zyyhospital.pojo.dto.HspBedInfCustom;
import activetech.zyyhospital.pojo.dto.HspBedInfCustomDto;
import activetech.zyyhospital.service.HspBedInfService;

public class HspBedInfServiceImpl implements HspBedInfService {
	@Autowired
	private HspBedInfMapper hspBedInfMapper;
	@Autowired
	private HspBedInfCustomMapper hspBedInfCustomMapper;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private HspEmgInfMapper hspEmgInfMapper;
	@Autowired
	private HspSqlInfMapper hspsqlinfMapper;
	@Autowired
	BaseHspemgInfService baseHspemgInfService;
	@Override
	public void addBed(HspBedInfCustomDto hspBedInfCustomDto,ActiveUser activeUser) throws Exception {
		// TODO Auto-generated method stub
		HspBedInfCustom hspBedInfCustom=hspBedInfCustomDto.getHspBedInfCustom();
		HspBedInfCustom bedInfCustom=hspBedInfCustomMapper.findBedByNumAndPlc(hspBedInfCustom);
		if(bedInfCustom!=null){
			if("1".equals(bedInfCustom.getBedStatus())){
				//抛异常
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920,new Object[] {bedInfCustom.getBedPlcNam()+hspBedInfCustom.getBedNum()+"床已存在，无需重复添加"}));
			}else{
				//更新bedStatus为1
				HspBedInf hspBedInf=hspBedInfMapper.selectByPrimaryKey(bedInfCustom.getBedid());
				hspBedInf.setBedStatus("1");
				hspBedInf.setUpdDat(new Date());
				hspBedInf.setUpdNbr(activeUser.getUsrno());
				hspBedInf.setUpdNam(activeUser.getUsrname());
				hspBedInf.setShoworder(hspBedInfCustom.getShoworder());
				hspBedInfMapper.updateByPrimaryKey(hspBedInf);
			}
		}else{
			Date createdate = new Date();
			String dateStr = DateUtil.formatDateByFormat(createdate, "yyyyMMdd");
			String bedId=systemConfigService.findSequences("HSPBEDINF_BEDID","8",dateStr);
			hspBedInfCustom.setBedid(bedId);
			hspBedInfCustom.setBedStatus("1");
			hspBedInfCustom.setCrtDat(new Date());
			hspBedInfCustom.setCrtNam(activeUser.getUsrname());
			hspBedInfCustom.setCrtNbr(activeUser.getUsrno());
			hspBedInfMapper.insert(hspBedInfCustom);
		}

	}

	@Override
	public void updateBed(HspBedInfCustomDto hspBedInfCustomDto,ActiveUser activeUser)
			throws Exception {
		HspBedInfCustom hspBedInfCustom=hspBedInfCustomDto.getHspBedInfCustom();
		HspBedInf hspBedInf=hspBedInfMapper.selectByPrimaryKey(hspBedInfCustom.getBedid());		
		hspBedInf.setUpdDat(new Date());
		hspBedInf.setUpdNam(activeUser.getUsrname());
		hspBedInf.setUpdNbr(activeUser.getUsrno());
		if (hspBedInf.getBedPlace().equals(hspBedInfCustom.getBedPlace()) 
				&& hspBedInf.getBedNum().equals(hspBedInfCustom.getBedNum())) {
			//只改变排序字段
			hspBedInf.setShoworder(hspBedInfCustom.getShoworder());
			hspBedInfMapper.updateByPrimaryKey(hspBedInf);
		}else {
			HspBedInfCustom bedInfCustom=hspBedInfCustomMapper.findBedByNumAndPlc(hspBedInfCustom);			
			//床位已存在
			if(bedInfCustom!=null) {
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920,new Object[] {bedInfCustom.getBedPlcNam()+hspBedInfCustom.getBedNum()+"床已存在"}));
			}			
			hspBedInf.setBedPlace(hspBedInfCustom.getBedPlace());
			hspBedInf.setBedNum(hspBedInfCustom.getBedNum());
			hspBedInf.setShoworder(hspBedInfCustom.getShoworder());
			hspBedInfMapper.updateByPrimaryKey(hspBedInf);
		}		
	}

	@Override
	public void delBed(HspBedInfCustomDto hspBedInfCustomDto,ActiveUser activeUser) throws Exception {
		if(hspBedInfCustomDto!=null){
			HspBedInfCustom hspBedInfCustom=hspBedInfCustomDto.getHspBedInfCustom();
			if(StringUtils.isNotNullAndEmptyByTrim(hspBedInfCustom.getBedid())){
				HspBedInf hspBedInf=hspBedInfMapper.selectByPrimaryKey(hspBedInfCustom.getBedid());
				if(hspBedInf!=null){
					if(StringUtils.isNotNullAndEmptyByTrim(hspBedInf.getEmgSeq())){
						ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920,new Object[] {"该床位有使用患者，不允许删除！"}));
					}
					hspBedInf.setBedStatus("3");
					hspBedInfMapper.updateByPrimaryKey(hspBedInf);
				}
			}
		}
	}

	@Override
	public List<HspBedInfCustom> getBedList(
			HspBedInfCustomDto hspBedInfCustomDto) throws Exception {
		List<HspBedInfCustom> list=hspBedInfCustomMapper.findBedList(hspBedInfCustomDto);
		return list;
	}

	@Override
	public int findBedListCount(HspBedInfCustomDto hspBedInfCustomDto)
			throws Exception {
		int total=hspBedInfCustomMapper.findBedListCount(hspBedInfCustomDto);
		return total;
	}

	@Override
	public HspBedInf findBedById(HspBedInfCustomDto hspBedInfCustomDto)
			throws Exception {
		HspBedInf hspBedInf=hspBedInfMapper.selectByPrimaryKey(hspBedInfCustomDto.getHspBedInfCustom().getBedid());
		return hspBedInf;
	}

	@Override
	public List<HspBedInfCustom> findBedPlaceAndNum(String emgSeq,String editbedflg) throws Exception {
		String bedid= "";
		if(StringUtils.isNotNullAndEmptyByTrim(emgSeq) && StringUtils.isNotNullAndEmptyByTrim(editbedflg) ){
			//根据预检号查询留观床位还是留抢床位
			HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(emgSeq);
			if(StringUtils.isNotNullAndEmptyByTrim(hspEmgInf.getEmgBed())){
				bedid = hspEmgInf.getEmgBed();
			}else if(StringUtils.isNotNullAndEmptyByTrim(hspEmgInf.getBedLgs())){
				bedid = hspEmgInf.getBedLgs();//如果都没床位，这个也是空的
			}
		}
		List<HspBedInfCustom> list=hspBedInfCustomMapper.findBedPlaceAndNum(emgSeq,bedid);
		return list;
	}

	@Override
	public void updatedeployBed(HspBedInfCustomDto hspBedInfCustomDto,
			ActiveUser activeUser) throws Exception {
		HspBedInfCustom hspBedInfCustom = hspBedInfCustomDto.getHspBedInfCustom();
		HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(hspBedInfCustom.getEmgSeq());
		//修改转归表床位
		updateHspSqlinfo(hspEmgInf,hspBedInfCustom);
		//重新绑定床位
		baseHspemgInfService.clearAndreBindBed(hspBedInfCustom.getEmgSeq(),hspBedInfCustom.getBedid());
		//1 如果没做过转归
		if(hspEmgInf.getFirstsqlseq().equals(hspEmgInf.getSqlSeq())){
			hspEmgInf.setEmgBed(hspBedInfCustom.getEmgBed());
			hspEmgInf.setBedLgs(hspBedInfCustom.getBedLgs());
			hspEmgInfMapper.updateByPrimaryKey(hspEmgInf);
		}
	}

	@Override
	public List<HspBedInfCustom> findALLBedPlace(String isBedType) throws Exception {
		String islgbed = systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue();
		HspBedInfCustomDto hspBedInfCustomDto =  new HspBedInfCustomDto();
		HspBedInfCustom hspBedInfCustom = new HspBedInfCustom();
		if(StringUtils.isNotNullAndEmptyByTrim(isBedType)) {
			hspBedInfCustom.setIslgbed(isBedType);
		}else {
			hspBedInfCustom.setIslgbed(islgbed);
		}
		hspBedInfCustomDto.setHspBedInfCustom(hspBedInfCustom);
		List<HspBedInfCustom> list=hspBedInfCustomMapper.findALLBedPlace(hspBedInfCustomDto);
		return list;
	}
	 /**
	  * 修改转归内部子方法
	  * @param hspemginfCustom
	  */
	 private void updateHspSqlinfo(HspEmgInf hspEmgInf,HspBedInfCustom hspBedInfCustom) {
		 	HspSqlInf hspsqlinf = hspsqlinfMapper.selectByPrimaryKey(hspEmgInf.getSqlSeq());
			hspsqlinf.setSqlDepCod(hspBedInfCustom.getBedid());
			hspsqlinfMapper.updateByPrimaryKey(hspsqlinf);
		
	}
	 
	 /**
	  * 新入病人调配床位
	  * @param hspBedInfCustomDto
	  * @param activeUser
	  * @throws Exception
	  */
	 public void updateRelatedBed(HspBedInfCustomDto hspBedInfCustomDto,ActiveUser activeUser)throws Exception{
		 HspBedInfCustom hspBedInfCustom = hspBedInfCustomDto.getHspBedInfCustom();
		 HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(hspBedInfCustom.getEmgSeq());
		 //修改转归表床位
		 updateHspSqlinfo(hspEmgInf,hspBedInfCustom);
		 //重新绑定床位
		 baseHspemgInfService.clearAndreBindBed(hspBedInfCustom.getEmgSeq(),hspBedInfCustom.getBedid());
		 //1 如果没做过转归
		 if(hspEmgInf.getFirstsqlseq().equals(hspEmgInf.getSqlSeq())){
			 HspemginfCustom hspemginfCustom=baseHspemgInfService.findHspemginfCustom(hspBedInfCustom.getEmgSeq());
			 //状态等于 6 说明是留抢 
			 if("6".equals(hspemginfCustom.getSqlStaCod())) {
				 hspEmgInf.setEmgBed(hspBedInfCustom.getBedid());
				 hspEmgInf.setBedLgs("");
			 //等于 11 是留观
			 }else if("11".equals(hspemginfCustom.getSqlStaCod())) {
				 hspEmgInf.setEmgBed("");
				 hspEmgInf.setBedLgs(hspBedInfCustom.getBedid());
			 }
			 hspEmgInfMapper.updateByPrimaryKey(hspEmgInf);
		 }
	 }
		
}
