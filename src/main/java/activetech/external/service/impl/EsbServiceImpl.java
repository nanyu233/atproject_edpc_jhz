package activetech.external.service.impl;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.SystemConfigService;
import activetech.edpc.dao.mapper.HspDbzlBasMapper;
import activetech.edpc.dao.mapper.HspXtAddMapper;
import activetech.edpc.dao.mapper.HspZlInfCustomMapper;
import activetech.edpc.pojo.domain.HspDbzlBas;
import activetech.edpc.pojo.dto.HspDbzlBasCustom;
import activetech.edpc.pojo.dto.HspDbzlBasQueryDto;
import activetech.edpc.pojo.dto.HspZlInfCustom;
import activetech.external.dao.mapper.HspEcgInfMapper;
import activetech.external.dao.mapper.HspEcgInfMapperCustom;
import activetech.external.dao.mapper.VHemsJcjgMapperCustom;
import activetech.external.dao.mapper.VHemsJyjgMapper;
import activetech.external.pojo.domain.*;
import activetech.external.service.EsbService;
import activetech.hospital.dao.mapper.HspEmgInfMapper;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EsbServiceImpl implements EsbService{
	
	@Autowired
	private HspXtAddMapper hspXtAddMapper;
	
	@Autowired
	private VHemsJcjgMapperCustom vHemsJcjgMapperCustom;
	
	@Autowired
	private VHemsJyjgMapper vHemsJyjgMapper;
	
	@Autowired
	private HspEcgInfMapper hspEcgInfMapper;
	
	@Autowired
	private HspEmgInfMapper hspEmgInfMapper;

	@Autowired
	private HspEcgInfMapperCustom hspEcgInfMapperCustom;

	@Autowired
	private HspDbzlBasMapper hspDbzlBasMapper;

	@Autowired
	private SystemConfigService systemConfigService;

	@Autowired
	private HspZlInfCustomMapper hspZlInfCustomMapper;

	@Override
	public ResultInfo getJyjcInfo(String regSeq) {
		
		ResultInfo resultInfo = null;
		// 通过胸痛患者类型获取mpi 和jzxh
		String mpi = "";
		String jzxh = "";
//		if("0".equals(wayTyp)) {
//			// 分诊的胸痛病人
//			HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(emgSeq);
//			mpi = hspEmgInf.getMpi();
//			if(hspEmgInf.getJzxh()!=null) {
//				jzxh = hspEmgInf.getJzxh().toString();
//			}
//		}else{
//			// 院内发病和绕行的胸痛病人
//			HspXtAdd hspXtAdd = hspXtAddMapper.selectByPrimaryKey(emgSeq);
//			if(hspXtAdd!=null) {
//				mpi = hspXtAdd.getMpiNo();
//				jzxh = hspXtAdd.getSadId();
//			}
//
//		}

		HspDbzlBas hspDbzlBas = hspDbzlBasMapper.selectByPrimaryKey(regSeq);
		mpi = hspDbzlBas.getMpi();
		jzxh = hspDbzlBas.getJzxh().toString();


		if(StringUtils.isNotEmpty(mpi) && StringUtils.isNotEmpty(jzxh)) {
			Map<String,Object> sysdata = new HashMap<>();
			// 获取检查结果
			VHemsJcjgExample example = new VHemsJcjgExample();
			VHemsJcjgExample.Criteria criteria = example.createCriteria();
			criteria.andMpiEqualTo(mpi);
			criteria.andSeekMedicalTimesEqualTo(jzxh);
			List<VHemsJcjg> jcjgList = vHemsJcjgMapperCustom.selectByExample(example);
			sysdata.put("jcjgList", jcjgList);
			
			// 获取检验结果
			VHemsJyjgExample jyjgexample = new VHemsJyjgExample();
			VHemsJyjgExample.Criteria jyjgcriteria = jyjgexample.createCriteria();
			jyjgcriteria.andMpiEqualTo(mpi);
			jyjgcriteria.andSeekMedicalTimesEqualTo(jzxh);
			// 20201104 去除JCLXMC='危急值'
			jyjgcriteria.andJylxmcIsNull();
			jyjgexample.setDistinct(true);
			jyjgexample.setOrderByClause("XH");
			List<VHemsJyjg> jyjgList = vHemsJyjgMapper.selectByExample(jyjgexample);
			
			// 根据大项分组,判断条件为report_item_name为null
			JSONArray jsonArray = new JSONArray();
			if(jyjgList.size()>0) {
				for(VHemsJyjg vHemsJyjg:jyjgList) {
					if(vHemsJyjg.getReportItemName()==null) {
						JSONObject jsonObject = new JSONObject();
						jsonObject.put("examinaim", vHemsJyjg.getExaminaim());
						jsonObject.put("resultDateTime", vHemsJyjg.getResultDateTime());
						jsonObject.put("sampleno", vHemsJyjg.getSampleno());
						jsonObject.put("data", new JSONArray());
						jsonArray.add(jsonObject);
					}
				}
				for(VHemsJyjg vHemsJyjg:jyjgList) {				
					if(vHemsJyjg.getReportItemName()!=null) {
						for(int i=0; i<jsonArray.size();i++) {
							if(jsonArray.getJSONObject(i).get("sampleno").equals(vHemsJyjg.getSampleno())) {
								JSONObject jsonObject = new JSONObject();
								jsonObject.put("result", vHemsJyjg.getResult());
								jsonObject.put("upperLimit", vHemsJyjg.getUpperLimit());
								jsonObject.put("lowerLimit", vHemsJyjg.getLowerLimit());
								jsonObject.put("reportItemName", vHemsJyjg.getReportItemName());
								jsonObject.put("units", vHemsJyjg.getUnits());
								jsonObject.put("errorFlag", vHemsJyjg.getErrorFlag());
								jsonArray.getJSONObject(i).getJSONArray("data").add(jsonObject);
							}
						}
					}
				}
			}
				
			sysdata.put("jyjgList", jsonArray);
			
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
			resultInfo.setSysdata(sysdata);
		}else {
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, new Object[] {
					"未找到符合要求的数据"
			});
		}
		
		return resultInfo;
	}

	@Override
	public ResultInfo getECGInfo(String regSeq, String wayTyp) {
		
		ResultInfo resultInfo = null;
		
		Map<String,Object> sysdata = new HashMap<>();
		// 获取心电图路径
		HspEcgInfExample example = new HspEcgInfExample();
		HspEcgInfExample.Criteria criteria = example.createCriteria();
		criteria.andRefIdEqualTo(regSeq);
		criteria.andEcgTypeEqualTo("11");
		List<HspEcgInf> list = hspEcgInfMapper.selectByExample(example);
		HspEcgInf hspEcgInf = null;
		if(list.size()>0) {
			hspEcgInf = list.get(0);
		}
		sysdata.put("hspEcgInf", hspEcgInf);
		
		resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		resultInfo.setSysdata(sysdata);
		
		// 通过胸痛患者类型获取mpi 和jzxh   接口数据暂时不取
		/*
		String mpi = "";
		String jzxh = "";
		
		if("0".equals(wayTyp)) {
			// 分诊的胸痛病人
			HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(emgSeq);
			mpi = hspEmgInf.getMpi();
			if(hspEmgInf.getJzxh()!=null) {
				jzxh = hspEmgInf.getJzxh().toString();
			}
		}else{
			// 院内发病和绕行的胸痛病人
			HspXtAdd hspXtAdd = hspXtAddMapper.selectByPrimaryKey(emgSeq);
			if(hspXtAdd!=null) {
				mpi = hspXtAdd.getMpiNo();
				jzxh = hspXtAdd.getSadId();
			}
			
		}
		
		if(StringUtils.isNotEmpty(mpi) && StringUtils.isNotEmpty(jzxh)) {
			Map<String,Object> sysdata = new HashMap<>();
			// 获取心电图路径
			HspEcgInfExample example = new HspEcgInfExample();
			HspEcgInfExample.Criteria criteria = example.createCriteria();
			criteria.andRefIdEqualTo(emgSeq);
			criteria.andEcgTypeEqualTo("12");
			List<HspEcgInf> list = hspEcgInfMapper.selectByExample(example);
			String ecgBasePath = ApplicationConfig.getConfig().get("ECG_BASE_PATH");
			if(list.size()>0) {
				for(HspEcgInf hspEcgInf :list) {
					hspEcgInf.setFilePath(ecgBasePath+hspEcgInf.getFilePath());
					System.out.println(ecgBasePath+hspEcgInf.getFilePath());
				}
			}
			
			sysdata.put("ecgList", list);
			
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
			resultInfo.setSysdata(sysdata);
		}else {
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, new Object[] {
					"未找到符合要求的数据"
			});
		}
		*/
		
		return resultInfo;
	
	}

	@Override
	public ResultInfo addOrUpdateEcgInf(HspEcgInf hspEcgInf, ActiveUser activeUser){
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		hspEcgInf.setCrtUser(activeUser.getUsrno());
		hspEcgInfMapperCustom.addOrUpdateEcgInf(hspEcgInf);
		return resultInfo;
	}

	@Override
	public void insertHspDbzlBasForCust(HspDbzlBasQueryDto hspDbzlBasQueryDto, ActiveUser activeUser) {
		HspDbzlBasCustom hspDbzlBasCustom = hspDbzlBasQueryDto.getHspDbzlBasCustom();
         String regSeq;
		HspDbzlBas hspDbzlBas = new HspDbzlBas();
		if("".equals(hspDbzlBasQueryDto.getHspDbzlBasCustom().getRegSeq())){
			regSeq = systemConfigService.findSequences("hsp_dbzl_bas_reg_seq", "8", null);
			//唯一ID
			hspDbzlBas.setRegSeq(regSeq);
			hspDbzlBas.setRegTim(hspDbzlBasCustom.getRegTim());
			hspDbzlBas.setEmgSeq(hspDbzlBasCustom.getEmgSeq());
			hspDbzlBas.setMpi(hspDbzlBasCustom.getMpi());

			hspDbzlBas.setPatTyp(hspDbzlBasCustom.getPatTyp());

			hspDbzlBas.setWayTyp("0");
			hspDbzlBas.setCardType(hspDbzlBasCustom.getCardType());
			hspDbzlBas.setVstCad(hspDbzlBasCustom.getVstCad());
			hspDbzlBas.setCstNam(hspDbzlBasCustom.getCstNam());
			hspDbzlBas.setCstSexCod(hspDbzlBasCustom.getCstSexCod());
			hspDbzlBas.setIdType(hspDbzlBasCustom.getCardType());
			hspDbzlBas.setIdNbr(hspDbzlBasCustom.getIdNbr());
			hspDbzlBas.setCstAgeCod(hspDbzlBasCustom.getCstAgeCod());
			hspDbzlBas.setCstAge(hspDbzlBasCustom.getCstAge());
			hspDbzlBas.setPatWgt(null);
			hspDbzlBas.setPatHgt(null);
			hspDbzlBas.setBthDat(hspDbzlBasCustom.getBthDat());
			hspDbzlBas.setPheNbr(hspDbzlBasCustom.getPheNbr());
			hspDbzlBas.setCstAdr(hspDbzlBasCustom.getCstAdr());
			hspDbzlBas.setNation(hspDbzlBasCustom.getNation());
			hspDbzlBas.setEmgJob(hspDbzlBasCustom.getEmgJob());
			hspDbzlBas.setMaritalStatus(hspDbzlBasCustom.getMaritalStatus());
			hspDbzlBas.setCstEdu(null);
			hspDbzlBas.setLnkMan(null);
			hspDbzlBas.setLnkWay(null);
			hspDbzlBas.setGrnChl(hspDbzlBasCustom.getGrnChl());
			hspDbzlBas.setSwChl(hspDbzlBasCustom.getSwChl());
			hspDbzlBas.setHspAra(null);
			hspDbzlBas.setYqxh(null);
			hspDbzlBas.setJzxh(hspDbzlBasCustom.getJzxh());
			hspDbzlBas.setZyxh(null);
			hspDbzlBas.setDocDat(hspDbzlBasCustom.getDocDat());
			hspDbzlBas.setJzys(hspDbzlBasCustom.getJzys());
			hspDbzlBas.setYsxm(hspDbzlBasCustom.getYsxm());
			hspDbzlBas.setKsdm(hspDbzlBasCustom.getKsdm());
			hspDbzlBas.setCrtTim(new Date());
			hspDbzlBas.setCrtNo(activeUser.getUsrno());
			hspDbzlBas.setCrtNam(activeUser.getUsrname());
			hspDbzlBas.setModTim(new Date());
			hspDbzlBas.setModNo(activeUser.getUsrno());
			hspDbzlBas.setModNam(activeUser.getUsrname());
			hspDbzlBas.setRcdSta(null);
			hspDbzlBas.setChkTim(null);
			hspDbzlBas.setChkNo(null);
			hspDbzlBas.setChkNam(null);
			hspDbzlBas.setChkMsg(null);
			hspDbzlBas.setStpFlg(null);
			hspDbzlBas.setStpTim(null);
			hspDbzlBas.setStpNo(null);
			hspDbzlBas.setStpNam(null);
			hspDbzlBas.setSmtSta("1");
			hspDbzlBas.setSmtSeq(null);
			hspDbzlBas.setSmtMsg(null);
			if("1".equals(activeUser.getHospitalCategory())){
				hspDbzlBas.setHspAra("1");
			}else{
				hspDbzlBas.setHspAra("2");
			}
			hspDbzlBasMapper.insert(hspDbzlBas);
		}else{
			regSeq=hspDbzlBasQueryDto.getHspDbzlBasCustom().getRegSeq();
			hspDbzlBas.setModTim(new Date());
			hspDbzlBas.setModNo(activeUser.getUsrno());
			hspDbzlBas.setModNam(activeUser.getUsrname());
			hspDbzlBasMapper.updateByPrimaryKeySelective(hspDbzlBas);
		}

		addzlinf(hspDbzlBasCustom, regSeq);
	}

	private void addzlinf(HspDbzlBasCustom hspDbzlBasCustom, String regSeq) {
		HspZlInfCustom baseZlInf = new HspZlInfCustom();
		baseZlInf.setEmgNo(regSeq);
		//血压
		if(hspDbzlBasCustom.getXuey() != null ){
			baseZlInf.setProCode("XYJZ");
			baseZlInf.setProVal(hspDbzlBasCustom.getXuey());
			hspZlInfCustomMapper.mergeHspXtzlInf(baseZlInf);
		}

		//脉搏
		if(hspDbzlBasCustom.getMb() != null) {
			baseZlInf.setProCode("MBJZ");
			baseZlInf.setProVal(hspDbzlBasCustom.getMb());
			hspZlInfCustomMapper.mergeHspXtzlInf(baseZlInf);
		}
		//血氧
        if(hspDbzlBasCustom.getXueyang() != null) {
			baseZlInf.setProCode("XUEYANG");
			baseZlInf.setProVal(hspDbzlBasCustom.getXueyang());
			hspZlInfCustomMapper.mergeHspXtzlInf(baseZlInf);
        }
        //tiwen
		if(hspDbzlBasCustom.getTiw() != null) {
			baseZlInf.setProCode("TWJZ");
			baseZlInf.setProVal(hspDbzlBasCustom.getTiw());
			hspZlInfCustomMapper.mergeHspXtzlInf(baseZlInf);
		}
       //呼吸频率
		if(hspDbzlBasCustom.getHuxipl() != null) {
			baseZlInf.setProCode("HXPLJZ");
			baseZlInf.setProVal(hspDbzlBasCustom.getHuxipl());
			hspZlInfCustomMapper.mergeHspXtzlInf(baseZlInf);
		}
		/*//意识
		if(hspDbzlBasCustom.getXueyang() != null) {
			baseZlInf.setProCode("YISHI");
			baseZlInf.setProVal(hspDbzlBasCustom.getSenRctCod());
			hspZlInfCustomMapper.mergeHspXtzlInf(baseZlInf);
		}*/


	}


}
