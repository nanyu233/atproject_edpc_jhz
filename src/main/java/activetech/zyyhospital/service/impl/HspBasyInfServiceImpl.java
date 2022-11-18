package activetech.zyyhospital.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import activetech.base.pojo.dto.ActiveUser;
import activetech.hospital.dao.mapper.HspEmgInfMapper;
import activetech.hospital.pojo.domain.HspEmgInf;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import activetech.zyyhospital.dao.mapper.HspBasyCzjsMapper;
import activetech.zyyhospital.dao.mapper.HspBasyInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspBasyInfMapper;
import activetech.zyyhospital.pojo.domain.HspBasyCzjs;
import activetech.zyyhospital.pojo.domain.HspBasyCzjsExample;
import activetech.zyyhospital.pojo.domain.HspBasyInf;
import activetech.zyyhospital.pojo.dto.HspBasyCzjsCustom;
import activetech.zyyhospital.pojo.dto.HspBasyInfCustom;
import activetech.zyyhospital.pojo.dto.HspBasyInfQueryDto;
import activetech.zyyhospital.service.HspBasyInfService;

public class HspBasyInfServiceImpl implements HspBasyInfService{

//	@Autowired
//	private HspOperateInfMapper hspOperateInfMapper;
	
//	@Autowired
//	private HspOperateInfCustomMapper hspOperateInfCustomMapper;
	
	@Autowired
	private HspEmgInfMapper hspEmgInfMapper;
	
	@Autowired
	private HspBasyInfCustomMapper hspBasyInfCustomMapper;
	
	@Autowired
	private HspBasyInfMapper hspBasyInfMapper;
	
	@Autowired
	private HspBasyCzjsMapper hspBasyCzjsMapper;
	
	/**
	 * 病案首页返回数据
	 */
	@Override
	public HspBasyInfQueryDto medicalRecord_result(HspBasyInfQueryDto hspBasyQueryDto) {
		hspBasyQueryDto.getHspemginfCustom().setJbzdType("1");
		hspBasyQueryDto = hspBasyInfCustomMapper.medicalRecord_result(hspBasyQueryDto);
		if(null != hspBasyQueryDto.getHspBasyCustom() && StringUtils.isNotNullAndEmptyByTrim(hspBasyQueryDto.getHspBasyCustom().getBasySeq())) {
			HspBasyCzjsExample hspBasyCzjsExample = new HspBasyCzjsExample();
			HspBasyCzjsExample.Criteria criteria = hspBasyCzjsExample.createCriteria();
			criteria.andBasySeqEqualTo(hspBasyQueryDto.getHspBasyCustom().getBasySeq());
			List<HspBasyCzjs> hspBasyCzjs = hspBasyCzjsMapper.selectByExample(hspBasyCzjsExample);
			hspBasyQueryDto.getHspBasyCustom().setBasyCzjsList(JSON.toJSONString(hspBasyCzjs));
		}
		return hspBasyQueryDto;
	}
	
	/**
	 * 病案首页保存
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 */
	@Override
	public void addMedicalRecord(HspBasyInfQueryDto hspBasyQueryDto, ActiveUser activeUser) throws Exception {
		HspBasyInfCustom hspBasyCustom = hspBasyQueryDto.getHspBasyCustom();
		HspemginfCustom hspemginfCustom = hspBasyQueryDto.getHspemginfCustom();
		//病案首页保存
		if(null != hspBasyCustom) {
			HspBasyInf hspBasyInf = hspBasyInfCustomMapper.findBasyInfByEmgSeq(hspBasyCustom.getEmgSeq());
			if(null != hspBasyInf) {
				hspBasyCustom.setBasySeq(hspBasyInf.getBasySeq());
				hspBasyCustom.setCreDat(hspBasyInf.getCreDat());
				hspBasyCustom.setCreCod(hspBasyInf.getCreCod());
				hspBasyCustom.setCreNam(hspBasyInf.getCreNam());
				hspBasyCustom.setUpdDat(new Date());
				hspBasyCustom.setUpdCod(activeUser.getUsrno());
				hspBasyCustom.setUpdNam(activeUser.getUsrname());
				hspBasyInfMapper.updateByPrimaryKey(hspBasyCustom);
			}else {
				hspBasyInf = new HspBasyInf();
				String basySeq = UUIDBuild.getUUID();
				hspBasyCustom.setBasySeq(basySeq);
				hspBasyCustom.setCreDat(new Date());
				hspBasyCustom.setCreCod(activeUser.getUsrno());
				hspBasyCustom.setCreNam(activeUser.getUsrname());
				hspBasyCustom.setUpdDat(new Date());
				hspBasyCustom.setUpdCod(activeUser.getUsrno());
				hspBasyCustom.setUpdNam(activeUser.getUsrname());
				hspBasyInfMapper.insert(hspBasyCustom);
			}
			//更新操作技术
			updateCzjs(hspBasyQueryDto);
		}
		
		//预检信息保存
		if(null != hspemginfCustom) {
			if(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getEmgSeq())) {
				HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(hspemginfCustom.getEmgSeq());
				hspEmgInf.setCstSexCod(hspemginfCustom.getCstSexCod());
				hspEmgInf.setBthDat(hspemginfCustom.getBthDat());
				hspEmgInf.setCstAge(hspemginfCustom.getCstAge());
				hspEmgInf.setCstAgeCod(hspemginfCustom.getCstAgeCod());
				hspEmgInf.setNationality(hspemginfCustom.getNationality());
				hspEmgInf.setNation(hspemginfCustom.getNation());
				hspEmgInf.setEmgJob(hspemginfCustom.getEmgJob());
				hspEmgInf.setGzdw(hspemginfCustom.getGzdw());
				hspEmgInf.setMaritalStatus(hspemginfCustom.getMaritalStatus());
				hspEmgInf.setIdNbr(hspemginfCustom.getIdNbr());
				hspEmgInf.setCstAdr(hspemginfCustom.getCstAdr());
				hspEmgInf.setPheNbr(hspemginfCustom.getPheNbr());
				hspEmgInf.setDocDat(hspemginfCustom.getDocDat());
				hspEmgInfMapper.updateByPrimaryKey(hspEmgInf);
			}
		}
	}
	
	
	/**
	 * 通过oper_seq查询手术操作数据
	 * @param hspOperateInfQueryDto
	 */
//	@Override
//	public HspOperateInf findOperateBySeq(String operSeq) {
//		return hspOperateInfMapper.selectByPrimaryKey(operSeq);
//	}
	
	/**
	 * 查询手术操作列表总数
	 * @param hspOperateInfQueryDto
	 * @return
	 */
//	@Override
//	public int findOperateListCount(HspOperateInfQueryDto hspOperateInfQueryDto) {
//		return hspOperateInfCustomMapper.findOperateListCount(hspOperateInfQueryDto);
//	}
	
	/**
	 * 通过emg_seq查询该患者的手术操作列表数据
	 * @param hspOperateInfQueryDto
	 * @return
	 */
//	@Override
//	public List<HspOperateInfCustom> findOperateListByEmgSeq(HspOperateInfQueryDto hspOperateInfQueryDto) {
//		return hspOperateInfCustomMapper.findOperateListByEmgSeq(hspOperateInfQueryDto);
//	}
	
	/**
	 * 手术操作情况保存
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 */
//	@Override
//	public String addOperatelr(HspOperateInfCustom hspOperateInfCustom, ActiveUser activeUser) throws Exception {
//		if(StringUtils.isNotNullAndEmptyByTrim(hspOperateInfCustom.getOperSeq())) {
//			hspOperateInfCustom.setUpdDat(new Date());
//			hspOperateInfCustom.setUpdCod(activeUser.getUsrno());
//			hspOperateInfCustom.setUpdNam(activeUser.getUsrname());
//			HspOperateInf operateInf = new HspOperateInf();
//			BeanUtils.copyProperties(operateInf,hspOperateInfCustom);
//			hspOperateInfMapper.updateByPrimaryKey(operateInf);
//		}else {
//			String operSeq = UUIDBuild.getUUID();
//			hspOperateInfCustom.setOperSeq(operSeq);
//			hspOperateInfCustom.setCreDat(new Date());
//			hspOperateInfCustom.setCreCod(activeUser.getUsrno());
//			hspOperateInfCustom.setCreNam(activeUser.getUsrname());
//			hspOperateInfCustom.setUpdDat(new Date());
//			hspOperateInfCustom.setUpdCod(activeUser.getUsrno());
//			hspOperateInfCustom.setUpdNam(activeUser.getUsrname());
//			HspOperateInf operateInf = new HspOperateInf();
//			BeanUtils.copyProperties(operateInf,hspOperateInfCustom);
//			hspOperateInfMapper.insertSelective(operateInf);
//		}
//		return hspOperateInfCustom.getOperSeq();
//	}

	/**
	 * 通过oper_seq删除手术操作数据
	 */
//	@Override
//	public void delOperateBySeq(String operSeq) {
//		hspOperateInfMapper.deleteByPrimaryKey(operSeq);
//	}

	
	/**
	 * 更新操作技术数据
	 * @param hspBasyQueryDto
	 */
	private void updateCzjs(HspBasyInfQueryDto hspBasyQueryDto) {
		HspBasyInfCustom hspBasyCustom = hspBasyQueryDto.getHspBasyCustom();
		//删除原数据
		HspBasyCzjsExample hspBasyCzjsExample = new HspBasyCzjsExample();
		HspBasyCzjsExample.Criteria criteria = hspBasyCzjsExample.createCriteria();
		criteria.andBasySeqEqualTo(hspBasyCustom.getBasySeq());
		hspBasyCzjsMapper.deleteByExample(hspBasyCzjsExample);
		
		//操作技术勾选数据
		String czjsStr = hspBasyCustom.getBasyCzjsList();
		if(StringUtils.isNotNullAndEmptyByTrim(czjsStr)) {
			List<HspBasyCzjsCustom> czjsList = JSONObject.parseArray(czjsStr,HspBasyCzjsCustom.class);
			czjsList.forEach(czjs -> {
				String czjsSeq = UUIDBuild.getUUID();
				czjs.setCzjsSeq(czjsSeq);
				czjs.setBasySeq(hspBasyCustom.getBasySeq());
				czjs.setCrtDat(hspBasyCustom.getCreDat());
				czjs.setCrtUsrNo(hspBasyCustom.getCreCod());
				czjs.setCrtUsrNam(hspBasyCustom.getCreNam());
				czjs.setUpdDat(hspBasyCustom.getUpdDat());
				czjs.setUpdUsrNo(hspBasyCustom.getUpdCod());
				czjs.setUpdUsrNam(hspBasyCustom.getUpdNam());
				hspBasyCzjsMapper.insert(czjs);
			});
		}
	}
}
