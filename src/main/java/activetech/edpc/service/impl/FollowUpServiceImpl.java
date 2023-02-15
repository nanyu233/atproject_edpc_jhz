package activetech.edpc.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


import activetech.base.pojo.dto.ActiveUser;
import activetech.edpc.dao.mapper.*;
import activetech.edpc.pojo.domain.*;
import activetech.edpc.pojo.dto.*;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.process.context.Config;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.SystemConfigService;
import activetech.edpc.service.FollowUpService;
import activetech.util.DateUtil;
import activetech.util.StringUtils;

public class FollowUpServiceImpl implements FollowUpService {
	@Autowired
	private HspFuvMedInfMapper hspFuvMedInfMapper;

	@Autowired
	private HspFuvInfMapperCustom hspFuvInfMapperCustom;

	@Autowired
	private SystemConfigService systemConfigService;

	@Autowired
	private HspPatInfMapperCustom hspPatInfMapperCustom;
	
	@Autowired
	private HspFuvPlnMapper hspFuvPlnMapper;
	
	@Autowired	
	private HspFuvPlnMapperCustom hspFuvPlnMapperCustom;
	
	@Autowired
	private HspFuvInfMapper hspFuvInfMapper;
	
	@Autowired
	private HspFuvPatMapperCustom hspFuvPatMapperCustom;
	
	@Autowired
	private HspFuvPatMapper hspFuvPatMapper;
	
	@Autowired
	private HspFuvDocInfMapper hspFuvDocInfMapper;
	
	@Autowired
	private HspFuvGrpInfMapper hspFuvGrpInfMapper;

	@Autowired
	private HspDbzlBasMapperCustom hspDbzlBasMapperCustom;

	@Autowired
	private HspDbzlBasMapper hspDbzlBasMapper;
	
	@Override
	public int queryCountfuvResult(HspPatInfQueryDto hspPatInfQueryDto) {
		return hspPatInfMapperCustom.countByCondition(hspPatInfQueryDto);
	}
	
	/**
	 * 随访患者列表
	 */
	@Override
	public List<HspPatInfCustom> queryfuvResult(HspPatInfQueryDto hspPatInfQueryDto) {
		return hspPatInfMapperCustom.selectByCondition(hspPatInfQueryDto);
	}
	/**
	 * 随访患者列表(改
	 */
	@Override
	public List<HspDbzlBasCustom> selectHspDbzlBasPatient(HspDbzlBasQueryDto hspDbzlBasQueryDto) {
		return hspDbzlBasMapperCustom.selectHspDbzlBasPatient(hspDbzlBasQueryDto);
	}
	
	@Override
	public int queryCountfuvplnResult(HspFuvPlnQueryDto hspFuvPlnQueryDto) {
		return hspFuvPlnMapperCustom.countByCondition(hspFuvPlnQueryDto);
	}
	/**
	 * 随访计划列表
	 */
	@Override
	public List<HspFuvPlnCustom> queryfuvplnResult(HspFuvPlnQueryDto hspFuvPlnQueryDto) {
		return hspFuvPlnMapperCustom.selectByCondition(hspFuvPlnQueryDto);
	}
	
	@Override
	public void submitFuvPln(HspFuvPlnQueryDto hspFuvPlnQueryDto, ActiveUser activeUser) throws Exception{
		List<HspFuvPlnCustom> list= hspFuvPlnQueryDto.getHspFuvPlnCustoms();
		List<HspFuvPlnCustom> listWN= new ArrayList<HspFuvPlnCustom>();
		HspFuvPlnCustom hspFuvPlnCustom;
		Date crtDate = new Date();		
		for(int i=0;i<list.size();i++){
			if(StringUtils.isNotNullAndEmptyByTrim(list.get(i).getPatId())){				
				String plnSeq = systemConfigService.findSequences("HSPFUVPLN_SEQ", "8", "");
				hspFuvPlnCustom = new HspFuvPlnCustom();
				hspFuvPlnCustom.setPlnSeq(plnSeq);
				hspFuvPlnCustom.setPatId(list.get(i).getPatId());
				hspFuvPlnCustom.setLstFuvTim(list.get(i).getLstFuvTim());
				hspFuvPlnCustom.setPlnFuvTim(list.get(i).getPlnFuvTim());
				hspFuvPlnCustom.setPlnFuvTyp(list.get(i).getPlnFuvTyp());
				hspFuvPlnCustom.setPlnSta(list.get(i).getPlnSta());
				hspFuvPlnCustom.setAlmRedFlg("0");
				//默认提醒时间为到期前72小时
				Date fuvAlmTim = DateUtil.dateRoll(list.get(i).getPlnFuvTim(),-72);			
				hspFuvPlnCustom.setFuvAlmTim(fuvAlmTim);
				hspFuvPlnCustom.setAlmUsrNo(list.get(i).getAlmUsrNo());
				hspFuvPlnCustom.setAlmUsrNme(list.get(i).getAlmUsrNme());
				hspFuvPlnCustom.setCrtUsrNo(activeUser.getUsrno());
				hspFuvPlnCustom.setCrtUsrNme(activeUser.getUsrname());
				hspFuvPlnCustom.setCrtTim(crtDate);
				hspFuvPlnMapper.insert(hspFuvPlnCustom);
				listWN.add(hspFuvPlnCustom);
			}
		}
		//操作第一条同步数据至HSP_FUV_PAT
		if(StringUtils.isNotNullAndEmptyByTrim(listWN.get(0).getPatId())){			
			HspFuvPat hspFuvPat = hspFuvPatMapper.selectByPrimaryKey(listWN.get(0).getPatId());
			hspFuvPat.setFuvSta(listWN.get(0).getPlnSta());
			//判断第一条计划时间是否小于当前计划时间
			if(hspFuvPat.getPlnFuvTim()==null||listWN.get(0).getPlnFuvTim().getTime()<=hspFuvPat.getPlnFuvTim().getTime()){				
				//更新患者表下次随访信息
				hspFuvPat.setPlnFuvTim(listWN.get(0).getPlnFuvTim());
				hspFuvPat.setLftNum((short)listWN.size());
				hspFuvPat.setPlnFuvSeq(listWN.get(0).getPlnSeq());
				hspFuvPatMapper.updateByPrimaryKey(hspFuvPat);
			}
		}
	}
		
	/**
	 * 随访计划删除
	 */
	@Override
	public ResultInfo deletefuvpln(String plnSeq) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		HspFuvPln hspFuvPln = hspFuvPlnMapper.selectByPrimaryKey(plnSeq);		
		HspFuvPat hspFuvPat = hspFuvPatMapper.selectByPrimaryKey(hspFuvPln.getPatId());	
		//判断计划是否完结
		if(!hspFuvPln.getPlnSta().equals("2")&&!hspFuvPln.getPlnSta().equals("9")){
			//判断患者剩余周期
			if(hspFuvPat.getLftNum()>0){
				//更新患者剩余周期
				hspFuvPat.setLftNum((short)(hspFuvPat.getLftNum()-1));
			}			
		}
		HspFuvPlnExample example = new HspFuvPlnExample();
		HspFuvPlnExample.Criteria criteria_pln = example.createCriteria();
		criteria_pln.andPatIdEqualTo(hspFuvPat.getPatId());
		if(plnSeq.equals(hspFuvPat.getPlnFuvSeq())){
			//设置计划信息为后继节点
			criteria_pln.andPlnFuvTimGreaterThan(hspFuvPln.getPlnFuvTim());
			example.setOrderByClause("pln_fuv_tim");
			List<HspFuvPln> hspFuvPlns = hspFuvPlnMapper.selectByExample(example);
			if(hspFuvPlns!=null&&hspFuvPlns.size()>0){
				hspFuvPat.setPlnFuvTim(hspFuvPlns.get(0).getPlnFuvTim());
				hspFuvPat.setPlnFuvSeq(hspFuvPlns.get(0).getPlnSeq());
			}else{
				hspFuvPat.setFuvSta(null);
				hspFuvPat.setPlnFuvTim(null);
				hspFuvPat.setPlnFuvSeq(null);
			}
		}else if(plnSeq.equals(hspFuvPat.getLstFuvSeq())){
			//设置计划信息为前驱节点
			criteria_pln.andPlnFuvTimLessThan(hspFuvPln.getPlnFuvTim());
			example.setOrderByClause("pln_fuv_tim desc");
			List<HspFuvPln> hspFuvPlns = hspFuvPlnMapper.selectByExample(example);
			if(hspFuvPlns!=null&&hspFuvPlns.size()>0){					
				hspFuvPat.setLstFuvTim(hspFuvPlns.get(0).getLstFuvTim());
				hspFuvPat.setLstFuvSeq(hspFuvPlns.get(0).getPlnSeq());
			}else{
				hspFuvPat.setLstFuvTim(null);
				hspFuvPat.setLstFuvSeq(null);
			}
		}
		
		hspFuvPatMapper.updateByPrimaryKey(hspFuvPat);
		
		hspFuvPlnMapper.deleteByPrimaryKey(plnSeq);
		//删除随访登记
		HspFuvInfExample hspFuvInfExample = new HspFuvInfExample();
		HspFuvInfExample.Criteria criteria = hspFuvInfExample.createCriteria();
		criteria.andPlnSeqEqualTo(plnSeq);
		hspFuvInfMapper.deleteByExample(hspFuvInfExample);
		return resultInfo;
	}
	
	/**
	 * 随访患者新增
	 * @throws Exception 
	 */
	@Override
	public void submitFuvPat(HspFuvPatQueryDto hspFuvPatQueryDto, ActiveUser activeUser) throws Exception {
		//判断患者表是否已有该患者
		HspFuvPat hspFuvPat = hspFuvPatMapper.selectByPrimaryKey(hspFuvPatQueryDto.getHspFuvPatCustom().getPatId());		
		if(hspFuvPat!=null&&StringUtils.isNotNullAndEmptyByTrim(hspFuvPat.getPatId())){
			hspFuvPatMapper.updateByPrimaryKey(hspFuvPatQueryDto.getHspFuvPatCustom());
			//ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920,new Object[] {"已存在该患者！"}));
		}else{
			hspFuvPatMapper.insert(hspFuvPatQueryDto.getHspFuvPatCustom());			
		}
	}

	@Override
	public List<HspFuvPatCustom> queryfuvResultXt(HspFuvPatQueryDto hspFuvPatQueryDto) {
		return hspFuvPatMapperCustom.selectByConditionXt(hspFuvPatQueryDto);
	}
	@Override
	public List<HspFuvPatCustom> queryfuvResultCz(HspFuvPatQueryDto hspFuvPatQueryDto) {
		return hspFuvPatMapperCustom.selectByConditionCz(hspFuvPatQueryDto);
	}
	@Override
	public List<HspFuvPatCustom> queryfuvResultCs(HspFuvPatQueryDto hspFuvPatQueryDto) {
		return hspFuvPatMapperCustom.selectByConditionCs(hspFuvPatQueryDto);
	}

	@Override
	public int queryCountfuvResultXt(HspFuvPatQueryDto hspFuvPatQueryDto) {
		return hspFuvPatMapperCustom.countByConditionXt(hspFuvPatQueryDto);
	}
	@Override
	public int queryCountfuvResultCz(HspFuvPatQueryDto hspFuvPatQueryDto) {
		return hspFuvPatMapperCustom.countByConditionCz(hspFuvPatQueryDto);
	}
	@Override
	public int queryCountfuvResultCs(HspFuvPatQueryDto hspFuvPatQueryDto) {
		return hspFuvPatMapperCustom.countByConditionCs(hspFuvPatQueryDto);
	}
	
	@Override
	public HspFuvPatCustom selectOneByCondition(HspFuvPatQueryDto hspFuvPatQueryDto) {
		HspFuvPatCustom hspFuvPatCustom = hspFuvPatMapperCustom.selectOneByCondition(hspFuvPatQueryDto);
		// HSP_FUV_PAT 表中无记录则从 HSP_DBZL_BAS 表中查询患者信息并同步到 HSP_FUV_PAT 表
		if (hspFuvPatCustom == null) {
			hspFuvPatCustom = new HspFuvPatCustom();
			HspDbzlBas hspDbzlBas = hspDbzlBasMapper.selectByPrimaryKey(hspFuvPatQueryDto.getHspFuvPatCustom().getPatId());
			// 赋值给hspFuvPatCustom
			// 患者编号
			hspFuvPatCustom.setPatId(hspDbzlBas.getRegSeq());
			// 患者姓名
			hspFuvPatCustom.setPatNam(hspDbzlBas.getCstNam());
			// 患者性别
			hspFuvPatCustom.setCstSexCod(hspDbzlBas.getCstSexCod());
			// 出生日期
			hspFuvPatCustom.setBthDat(hspDbzlBas.getBthDat());
			// 联系电话
			hspFuvPatCustom.setLnkNbr(hspDbzlBas.getLnkWay());
			// 民族
			hspFuvPatCustom.setPatNatCod(hspDbzlBas.getNation());
			// 婚姻状况
			hspFuvPatCustom.setMarStaCod(hspDbzlBas.getMaritalStatus());
			// 职业
			hspFuvPatCustom.setPatJob(hspDbzlBas.getEmgJob());
			// 证件号码
			hspFuvPatCustom.setIdNbr(hspDbzlBas.getIdNbr());
			// 地址
			hspFuvPatCustom.setPatTel(hspDbzlBas.getPheNbr());
			// 电话
			hspFuvPatCustom.setLnkNbr(hspDbzlBas.getLnkWay());
			// 插入 HSP_FUV_PAT 表
			hspFuvPatMapper.insert(hspFuvPatCustom);


			HspFuvPatCustom hspFuvPatCustom2 = hspFuvPatMapperCustom.selectOneByCondition(hspFuvPatQueryDto);
			hspFuvPatCustom=hspFuvPatCustom2;

		}
		return hspFuvPatCustom;
	}
	
	@Override
	public HspFuvPlnCustom selectPlnOneByCondition(HspFuvPlnQueryDto hspFuvPlnQueryDto) {
		return hspFuvPlnMapperCustom.selectOneByCondition(hspFuvPlnQueryDto);
	}
	
	@Override
	public int queryCountfuvInfResult(HspFuvInfQueryDto hspFuvInfQueryDto) {
		return hspFuvInfMapperCustom.countByCondition(hspFuvInfQueryDto);
	}
	
	/**
	 * 随访记录列表
	 */
	@Override
	public List<HspFuvInfCustom> queryfuvInfResult(HspFuvInfQueryDto hspFuvInfQueryDto) {
		return hspFuvInfMapperCustom.selectByCondition(hspFuvInfQueryDto);
	}
	@Override
	public HspFuvInfCustom selectInfOneByCondition(HspFuvInfQueryDto hspFuvInfQueryDto) {
		HspFuvInfCustom hspFuvInfCustom = hspFuvInfMapperCustom.selectOneByCondition(hspFuvInfQueryDto);
		if(hspFuvInfCustom!=null&&StringUtils.isNotNullAndEmptyByTrim(hspFuvInfCustom.getFuvSeq())){
			HspFuvMedInfExample example = new HspFuvMedInfExample();
			HspFuvMedInfExample.Criteria criteria = example.createCriteria();
			criteria.andFuvSeqEqualTo(hspFuvInfCustom.getFuvSeq());
			List<HspFuvMedInf> hspFuvMedInfList = hspFuvMedInfMapper.selectByExample(example);
			hspFuvInfCustom.setHspFuvMedInfList(hspFuvMedInfList);
		}
		return hspFuvInfCustom;
	}
	
	private void updatePatAndPln(HspFuvInfCustom hspFuvInfCustom) throws Exception{
		HspFuvPat hspFuvPat = hspFuvPatMapper.selectByPrimaryKey(hspFuvInfCustom.getPatId());			
		HspFuvPln hspFuvPln = hspFuvPlnMapper.selectByPrimaryKey(hspFuvInfCustom.getPlnSeq());
		if(StringUtils.isNotNullAndEmptyByTrim(hspFuvInfCustom.getFuvTim())){		
			hspFuvPln.setLstFuvTim(hspFuvInfCustom.getFuvTim());
			hspFuvPln.setPlnSta(hspFuvInfCustom.getPlnSta());
		}
		//修改最近或下次计划才同步更新患者表
		if(hspFuvPln.getPlnSeq().equals(hspFuvPat.getLstFuvSeq())||hspFuvPln.getPlnSeq().equals(hspFuvPat.getPlnFuvSeq())){
			if(StringUtils.isNotNullAndEmptyByTrim(hspFuvInfCustom.getFuvTim())){
				if(!StringUtils.isNotNullAndEmptyByTrim(hspFuvInfCustom.getFuvSeq())){
					if(hspFuvPln.getPlnSeq().equals(hspFuvPat.getPlnFuvSeq())){
						hspFuvPat.setLftNum((short)(hspFuvPat.getLftNum()-1));
					}
				}
				hspFuvPat.setLstFuvTim(hspFuvInfCustom.getFuvTim());
			}
			//终止随访处理
			if(StringUtils.isNotNullAndEmptyByTrim(hspFuvInfCustom.getFuvAgnFlg())&&hspFuvInfCustom.getFuvAgnFlg().equals("0")){
				//剩余期数归零
				hspFuvPat.setLftNum((short)0);
				//更新(或者删除)剩余计划状态为终结
				HspFuvPlnExample example = new HspFuvPlnExample();
				HspFuvPlnExample.Criteria criteria = example.createCriteria();
				criteria.andPatIdEqualTo(hspFuvInfCustom.getPatId());
				criteria.andPlnFuvTimGreaterThan(hspFuvPln.getPlnFuvTim());
				List<HspFuvPln> hspFuvPlns = hspFuvPlnMapper.selectByExample(example);
				for(int i=0;i<hspFuvPlns.size();i++){
					hspFuvPlns.get(i).setPlnSta("9");
					hspFuvPlnMapper.updateByPrimaryKey(hspFuvPlns.get(i));
					//hspFuvPlnMapper.deleteByPrimaryKey(hspFuvPlns.get(i).getPlnSeq());
				}
			}
			
			if(hspFuvPat.getLftNum()>0){
				//未完结计划
				//更新患者表下次计划时间状态
				HspFuvPlnExample example = new HspFuvPlnExample();
				HspFuvPlnExample.Criteria criteria = example.createCriteria();
				criteria.andPatIdEqualTo(hspFuvInfCustom.getPatId());
				criteria.andPlnFuvTimGreaterThan(hspFuvPln.getPlnFuvTim());
				example.setOrderByClause("pln_fuv_tim");
				List<HspFuvPln> hspFuvPlns = hspFuvPlnMapper.selectByExample(example);
				
				hspFuvPat.setPlnFuvTim(hspFuvPlns.get(0).getPlnFuvTim());
				hspFuvPat.setFuvSta(hspFuvPlns.get(0).getPlnSta());				
				hspFuvPat.setPlnFuvSeq(hspFuvPlns.get(0).getPlnSeq());
				//设置提醒人为下次随访人员
				if(StringUtils.isNotNullAndEmptyByTrim(hspFuvInfCustom.getNxtFuvDoc())){
					hspFuvPlns.get(0).setAlmUsrNo(hspFuvInfCustom.getNxtFuvDoc());
					hspFuvPlns.get(0).setAlmUsrNme(hspFuvInfCustom.getNxtFuvDocNme());
					hspFuvPlnMapper.updateByPrimaryKey(hspFuvPlns.get(0));
				}
			}else{
				//已完结计划
				hspFuvPat.setPlnFuvTim(null);
				hspFuvPat.setFuvSta(null);
				hspFuvPat.setPlnFuvSeq(null);
			}
			hspFuvPat.setLstFuvSeq(hspFuvInfCustom.getPlnSeq());
			hspFuvPatMapper.updateByPrimaryKey(hspFuvPat);
		}		
					
		hspFuvPlnMapper.updateByPrimaryKey(hspFuvPln);		
	}
	
	@Override
	public void submitFuv(HspFuvInfQueryDto hspFuvInfQueryDto) throws Exception{
		HspFuvInfCustom hspFuvInfCustom = hspFuvInfQueryDto.getHspFuvInfCustom();
				
		//更新患者表及计划表
		updatePatAndPln(hspFuvInfCustom);
		
		if(StringUtils.isNotNullAndEmptyByTrim(hspFuvInfCustom.getFuvSeq())){
			hspFuvInfMapper.updateByPrimaryKey(hspFuvInfCustom);
		}else{
			String fuvSeq = systemConfigService.findSequences("HSPFUVINF_SEQ", "8", "");		
			hspFuvInfCustom.setFuvSeq(fuvSeq);
			hspFuvInfMapper.insert(hspFuvInfCustom);
		}		
		
		//删除原有
		HspFuvMedInfExample example = new HspFuvMedInfExample();
		HspFuvMedInfExample.Criteria criteria = example.createCriteria();
		criteria.andFuvSeqEqualTo(hspFuvInfCustom.getFuvSeq());
		hspFuvMedInfMapper.deleteByExample(example);
		//插入现填并更新关联用药id
		if(hspFuvInfCustom.getHspFuvMedInfList()!=null){	
			String[] medCon = new String[hspFuvInfCustom.getHspFuvMedInfList().size()];
			for (int i=0;i<hspFuvInfCustom.getHspFuvMedInfList().size();i++) {
				if(StringUtils.isNotNullAndEmptyByTrim(hspFuvInfCustom.getHspFuvMedInfList().get(i).getMedNam())){//避免首个空提交
					String fmiSeq = systemConfigService.findSequences("HSPFUVMEDINF_SEQ", "8", "");
					hspFuvInfCustom.getHspFuvMedInfList().get(i).setFmiSeq(fmiSeq);
					hspFuvInfCustom.getHspFuvMedInfList().get(i).setFuvSeq(hspFuvInfCustom.getFuvSeq());
					hspFuvMedInfMapper.insert(hspFuvInfCustom.getHspFuvMedInfList().get(i));		
					medCon[i] = hspFuvInfCustom.getHspFuvMedInfList().get(i).getFmiSeq();
				}
			}
			hspFuvInfCustom.setMedCon(Arrays.toString(medCon));
			hspFuvInfMapper.updateByPrimaryKey(hspFuvInfCustom);
		}

	}

	@Override
	public List<HspFuvDocInf> queryFuvDoc(HspFuvInfQueryDto hspFuvInfQueryDto) {
		HspFuvDocInfExample example = new HspFuvDocInfExample();
		return hspFuvDocInfMapper.selectByExample(example);
	}

	@Override
	public List<HspFuvGrpInf> queryFuvGrp(HspFuvInfQueryDto hspFuvInfQueryDto) {
		HspFuvGrpInfExample example = new HspFuvGrpInfExample();
		return hspFuvGrpInfMapper.selectByExample(example);
	}

	@Override
	public Integer checkUnFinishPln(HspFuvPlnQueryDto hspFuvPlnQueryDto) {
		return hspFuvPlnMapperCustom.checkUnFinishPln(hspFuvPlnQueryDto);
	}

	@Override
	public int queryCountfuvResult(HspDbzlBasQueryDto hspDbzlBasQueryDto) {
		return hspDbzlBasMapperCustom.countByCondition(hspDbzlBasQueryDto);
	}

}
