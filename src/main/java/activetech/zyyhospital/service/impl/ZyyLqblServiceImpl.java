package activetech.zyyhospital.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.alibaba.fastjson.JSONObject;

import activetech.base.dao.mapper.DstuserMapper;
import activetech.base.pojo.domain.Dstuser;
import activetech.base.pojo.domain.DstuserExample;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.SystemConfigService;
import activetech.basehis.dao.mapper.HspAotographInfoCustomMapper;
import activetech.basehis.dao.mapper.HspAotographInfoMapper;
import activetech.basehis.dao.mapper.VHemsYpxxMapper;
import activetech.basehis.pojo.dto.HspAotographInfoCustom;
import activetech.external.pojo.dto.VHemsJyjgQueryDto;
import activetech.hospital.dao.mapper.HspEmgInfMapper;
import activetech.hospital.dao.mapper.HspMewsInfMapper;
import activetech.hospital.dao.mapper.HspSqlInfMapper;
import activetech.hospital.pojo.domain.HspEmgInf;
import activetech.hospital.pojo.domain.HspMewsInf;
import activetech.hospital.pojo.domain.HspSqlInf;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.util.DateUtil;
import activetech.util.HttpClientUtil;
import activetech.util.JacksonUtil;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import activetech.zyyhospital.dao.mapper.HspCgxjInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspCgxjInfMapper;
import activetech.zyyhospital.dao.mapper.HspDocadviceInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspDocadviceInfMapper;
import activetech.zyyhospital.dao.mapper.HspHljldInfMapper;
import activetech.zyyhospital.dao.mapper.HspHlpgbCustomMapper;
import activetech.zyyhospital.dao.mapper.HspHlpgbMapper;
import activetech.zyyhospital.dao.mapper.HspJzcspgInfMapper;
import activetech.zyyhospital.dao.mapper.HspLqblInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspLqblInfMapper;
import activetech.zyyhospital.dao.mapper.HspMediaInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspNrsInfMapper;
import activetech.zyyhospital.dao.mapper.HspObsvtfstInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspObsvtfstInfMapper;
import activetech.zyyhospital.dao.mapper.HspPrintInfMapper;
import activetech.zyyhospital.pojo.domain.HspCgxjInf;
import activetech.zyyhospital.pojo.domain.HspCgxjInfExample;
import activetech.zyyhospital.pojo.domain.HspDocadviceInf;
import activetech.zyyhospital.pojo.domain.HspHljldInf;
import activetech.zyyhospital.pojo.domain.HspHljldInfExample;
import activetech.zyyhospital.pojo.domain.HspHlpgb;
import activetech.zyyhospital.pojo.domain.HspJzcspgInf;
import activetech.zyyhospital.pojo.domain.HspLqblInf;
import activetech.zyyhospital.pojo.domain.HspLqblInfExample;
import activetech.zyyhospital.pojo.domain.HspNrsInf;
import activetech.zyyhospital.pojo.domain.HspObsvtfstInf;
import activetech.zyyhospital.pojo.domain.HspObsvtfstInfExample;
import activetech.zyyhospital.pojo.domain.HspPrintInf;
import activetech.zyyhospital.pojo.domain.THemsPaperwork;
import activetech.zyyhospital.pojo.dto.HspCgxjInfCustom;
import activetech.zyyhospital.pojo.dto.HspDocadviceInfCustom;
import activetech.zyyhospital.pojo.dto.HspLqblInfCustom;
import activetech.zyyhospital.pojo.dto.HspLqbljlQueryDto;
import activetech.zyyhospital.pojo.dto.HspMediaInfCustom;
import activetech.zyyhospital.pojo.dto.HspNrsInfCustom;
import activetech.zyyhospital.pojo.dto.HspObsvtfstInfCustom;
import activetech.zyyhospital.service.ZyyLqblService;

public class ZyyLqblServiceImpl implements ZyyLqblService {
	private static Logger logger = Logger.getLogger(ZyyLqblServiceImpl.class); 
	@Autowired
	private HspObsvtfstInfMapper hspObsvtfstInfMapper;
	@Autowired
	private HspObsvtfstInfCustomMapper hspObsvtfstInfCustomMapper;
//	@Autowired
//	private HspCfjlInfCustomMapper hspCfjlInfCustomMapper;
	@Autowired
	private HspEmgInfMapper hspEmgInfMapper;
	@Autowired
	private HspSqlInfMapper hspSqlInfMapper;
//	@Autowired
//	private HspCfjlInfMapper hspCfjlInfMapper;
//	@Autowired
//	private HspJjbjlInfCustomMapper hspJjbjlInfCustomMapper;
//	@Autowired
//	private HspJjbjlInfMapper hspJjbjlInfMapper;
	@Autowired
	private HspLqblInfMapper hspLqblInfMapper;
	@Autowired
	private HspLqblInfCustomMapper hspLqblInfCustomMapper;
	@Autowired
	private HspCgxjInfMapper hspCgxjInfMapper;
	@Autowired
	private HspCgxjInfCustomMapper hspCgxjInfCustomMapper;
//	@Autowired
//	private HspQjjlInfMapper hspQjjlInfMapper;
//	@Autowired
//	private HspQjjlInfCustomMapper hspQjjlInfCustomMapper;
	@Autowired
	private HspHlpgbCustomMapper hspHlpgbCustomMapper;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private HspDocadviceInfMapper hspDocadviceInfMapper;
	@Autowired
	private HspMewsInfMapper hspMewsInfMapper;
	@Autowired
	private HspMediaInfCustomMapper hspMediaInfCustomMapper;
	@Autowired
	private VHemsYpxxMapper vHemsYpxxMapper;
	@Autowired
	private DstuserMapper dstuserMapper;
	@Autowired
	private HspDocadviceInfCustomMapper hspDocadviceInfCustomMapper;
	@Autowired
	private HspPrintInfMapper hspPrintInfMapper;
	@Autowired
	private HspAotographInfoMapper hspAotographInfoMapper;
	@Autowired
	private HspAotographInfoCustomMapper hspAotographInfoCustomMapper;
	@Autowired
	private HspHljldInfMapper hspHljldInfMapper;
	@Autowired
	private HspNrsInfMapper hspNrsInfMapper;
	@Autowired
	private HspHlpgbMapper hspHlpgbMapper;
	@Autowired
	private HspJzcspgInfMapper hspJzcspgInfMapper;
	
	/*-------------------------------chen-----------------------*/
	//------------------------------留观首页------------------------
	@Override
	public HspObsvtfstInfCustom findObsvtfstByEmgSeq(String emgSeq)
			throws Exception {
		HspObsvtfstInfCustom hspObsvtfstInfCustom=hspObsvtfstInfCustomMapper.findObsvtfstByEmgSeq(emgSeq);
		String admtDatStr="";
		String dscgDatStr="";
		if(hspObsvtfstInfCustom==null){
			hspObsvtfstInfCustom=new HspObsvtfstInfCustom();
			HspEmgInf hspEmgInf=hspEmgInfMapper.selectByPrimaryKey(emgSeq);
			if(hspEmgInf!=null){
				admtDatStr=DateUtil.formatDateByFormat(hspEmgInf.getEmgDat(), "yyyy/MM/dd HH:mm:ss");
				hspObsvtfstInfCustom.setAdmtDat(hspEmgInf.getEmgDat());
				hspObsvtfstInfCustom.setAdmtDatStr(admtDatStr);
				HspSqlInf hspSqlInf=hspSqlInfMapper.selectByPrimaryKey(hspEmgInf.getSqlSeq());
				if(hspSqlInf!=null){
					//判断转归数据是否首诊数据，不是：则赋值（转归日期）
					if(!hspEmgInf.getCstDspCod().equals(hspSqlInf.getSqlStaCod())){
						dscgDatStr=DateUtil.formatDateByFormat(hspSqlInf.getSqlDat(), "yyyy/MM/dd HH:mm:ss");
						hspObsvtfstInfCustom.setDscgDat(hspSqlInf.getSqlDat());
						hspObsvtfstInfCustom.setDscgDatStr(dscgDatStr);
					}
				}
			}
			
		}
		return hspObsvtfstInfCustom;
	}

	@Override
	public void submitObsvtfst(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser)
			throws Exception {
		HspObsvtfstInfCustom hspObsvtfstInfCustom=hspLqbljlQueryDto.getHspObsvtfstInfCustom();
		//根据emg_seq查询留观小结，如果有则更新，否则新增
		HspObsvtfstInfExample  hspObsvtfstInfExample = new HspObsvtfstInfExample();
		HspObsvtfstInfExample.Criteria criteria =  hspObsvtfstInfExample.createCriteria();
		criteria.andEmgSeqEqualTo(hspObsvtfstInfCustom.getEmgSeq());
		List<HspObsvtfstInf> HspObsvtfstInf = hspObsvtfstInfMapper.selectByExample(hspObsvtfstInfExample);
		//如果有则更新
		if(HspObsvtfstInf !=null && HspObsvtfstInf.size()>0){
			HspObsvtfstInf hspObsvtfstInf=hspObsvtfstInfMapper.selectByPrimaryKey(hspObsvtfstInfCustom.getObsvtfstSeq());
			hspObsvtfstInfCustom.setCratDat(hspObsvtfstInf.getCratDat());
	    	hspObsvtfstInfCustom.setCratNam(hspObsvtfstInf.getCratNam());
	    	hspObsvtfstInfCustom.setCratNbr(hspObsvtfstInf.getCratNbr());
	    	hspObsvtfstInfCustom.setUpdtDat(hspObsvtfstInf.getUpdtDat());
	    	hspObsvtfstInfCustom.setUpdtNbr(hspObsvtfstInf.getUpdtNbr());
	    	hspObsvtfstInfCustom.setUpdtNam(hspObsvtfstInf.getUpdtNam());
	    	hspObsvtfstInfCustom.setUpdtDat2(hspObsvtfstInf.getUpdtDat2());
	    	hspObsvtfstInfCustom.setUpdtNbr2(hspObsvtfstInf.getUpdtNbr2());
	    	hspObsvtfstInfCustom.setUpdtNam2(hspObsvtfstInf.getUpdtNam2());
	    	hspObsvtfstInfCustom.setUpdtDat3(hspObsvtfstInf.getUpdtDat3());
	    	hspObsvtfstInfCustom.setUpdtNbr3(hspObsvtfstInf.getUpdtNbr3());
	    	hspObsvtfstInfCustom.setUpdtNam3(hspObsvtfstInf.getUpdtNam3());
			if(!StringUtils.isNotNullAndEmptyByTrim(hspObsvtfstInf.getUpdtNbr())){
		    	hspObsvtfstInfCustom.setUpdtDat(new Date());
		    	hspObsvtfstInfCustom.setUpdtNbr(activeUser.getUsrno());
		    	hspObsvtfstInfCustom.setUpdtNam(activeUser.getUsrname());
		    }else if(!StringUtils.isNotNullAndEmptyByTrim(hspObsvtfstInf.getUpdtNbr2())
		    		&& !activeUser.getUsrno().equals(hspObsvtfstInf.getUpdtNbr())){
		    	hspObsvtfstInfCustom.setUpdtDat2(new Date());
		    	hspObsvtfstInfCustom.setUpdtNbr2(activeUser.getUsrno());
		    	hspObsvtfstInfCustom.setUpdtNam2(activeUser.getUsrname());
		    }else if(!activeUser.getUsrno().equals(hspObsvtfstInf.getUpdtNbr())
		    		&& !activeUser.getUsrno().equals(hspObsvtfstInf.getUpdtNbr2())){
		    	hspObsvtfstInfCustom.setUpdtDat3(new Date());
		    	hspObsvtfstInfCustom.setUpdtNbr3(activeUser.getUsrno());
		    	hspObsvtfstInfCustom.setUpdtNam3(activeUser.getUsrname());
		    }
			hspObsvtfstInfMapper.updateByPrimaryKey(hspObsvtfstInfCustom);
		}else{
			//如果没有就新增
			hspObsvtfstInfCustom.setObsvtfstSeq(UUIDBuild.getUUID());
			hspObsvtfstInfCustom.setCratDat(new Date());
			hspObsvtfstInfMapper.insert(hspObsvtfstInfCustom);
		}
		
		HspEmgInf  hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(hspObsvtfstInfCustom.getEmgSeq());
		HspemginfCustom hspemginfCustom=hspLqbljlQueryDto.getHspemginfCustom();
		//保存留观号
		if(hspemginfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getObservationCode())){
				hspEmgInf.setObservationCode(hspemginfCustom.getObservationCode());
			}else{
				String observationCode =systemConfigService.findSequences("HSPEMGINF_OBSERVATIONCODE","6","L");
				hspEmgInf.setObservationCode(observationCode);
			}
		}
		//更新电话和身份证号
		hspEmgInf.setPheNbr(hspemginfCustom.getPheNbr());
		hspEmgInf.setIdNbr(hspemginfCustom.getIdNbr());
		hspEmgInfMapper.updateByPrimaryKey(hspEmgInf);
		
		
	}
	
	@Override
	public void deleteObsvtfst(String obsvtfstSeq)throws Exception {
		if(StringUtils.isNotNullAndEmptyByTrim(obsvtfstSeq)){
			hspObsvtfstInfMapper.deleteByPrimaryKey(obsvtfstSeq);
		}
	}

	
	/**
	 * 留抢病历
	 */
	@Override
	public HspLqblInfCustom findLqblByEmgSeq(String emgSeq) throws Exception {
		HspLqblInfCustom hspLqblInfCustom=hspLqblInfCustomMapper.findLqblByEmgSeq(emgSeq);
		HspemginfCustom hspemginfCustom=hspHlpgbCustomMapper.findEmgInfByEmgSeq(emgSeq);
		if(hspLqblInfCustom==null){
			hspLqblInfCustom=new HspLqblInfCustom();
			HspMewsInf hspMewsInf=hspMewsInfMapper.selectByPrimaryKey(emgSeq);
			if(hspMewsInf!=null){
				//血压
				hspLqblInfCustom.setTgjcXyUp(null == hspMewsInf.getSbpupNbr() ? null : hspMewsInf.getSbpupNbr().toString());
				hspLqblInfCustom.setTgjcXyDown(null == hspMewsInf.getSbpdownNbr() ? null : hspMewsInf.getSbpdownNbr().toString());
				//体温
				hspLqblInfCustom.setTgjcTw(null == hspMewsInf.getTmpNbr() ? null : hspMewsInf.getTmpNbr().toString());
				//呼吸
				hspLqblInfCustom.setTgjcHx(null == hspMewsInf.getBreNbr() ? null : hspMewsInf.getBreNbr().toString());
				//脉搏
				hspLqblInfCustom.setTgjcPulse(null == hspMewsInf.getHrtRte()? null : hspMewsInf.getHrtRte().toString());
			}	
			//预检信息
			if(hspemginfCustom!=null){
				//血糖
				hspLqblInfCustom.setTgjcXtType(hspemginfCustom.getGlsCod());
				hspLqblInfCustom.setTgjcXtFlg(hspemginfCustom.getGlsType());
				hspLqblInfCustom.setTgjcXt(hspemginfCustom.getGlsNum());
				//血氧
				hspLqblInfCustom.setTgjcCbzy(null == hspemginfCustom.getOxyNbr() ? null : hspemginfCustom.getOxyNbr().toString());
				//入院日期获取
				hspLqblInfCustom.setLqblDat(hspemginfCustom.getEmgDat());
			}
		}
		return hspLqblInfCustom;
	}

	/**
	 * 留抢病历保存
	 */
	@Override
	public void submitLqbl(HspLqbljlQueryDto hspLqbljlQueryDto,
			ActiveUser activeUser) throws Exception {
		HspLqblInfCustom hspLqblInfCustom=hspLqbljlQueryDto.getHspLqblInfCustom();
		if(hspLqblInfCustom!=null){
			//根据emg_seq查询留抢病历表，如果有则更新，否则新增
			HspLqblInfExample  hspLqblInfExample = new HspLqblInfExample();
			HspLqblInfExample.Criteria criteria =  hspLqblInfExample.createCriteria();
			criteria.andEmgSeqEqualTo(hspLqblInfCustom.getEmgSeq());
			criteria.andBltypeEqualTo("0");
			List<HspLqblInf> hspLqblInfrtv = hspLqblInfMapper.selectByExample(hspLqblInfExample);
			//如果有则更新
			if(hspLqblInfrtv !=null && hspLqblInfrtv.size()>0){
				HspLqblInf hspLqblInf=hspLqblInfMapper.selectByPrimaryKey(hspLqblInfrtv.get(0).getLqblSeq());
				hspLqblInfCustom.setCratDat(hspLqblInf.getCratDat());
		    	hspLqblInfCustom.setUpdtDat(hspLqblInf.getUpdtDat());
		    	hspLqblInfCustom.setUpdtNbr(hspLqblInf.getUpdtNbr());
		    	hspLqblInfCustom.setUpdtNam(hspLqblInf.getUpdtNam());
		    	hspLqblInfCustom.setUpdtDat2(hspLqblInf.getUpdtDat2());
		    	hspLqblInfCustom.setUpdtNbr2(hspLqblInf.getUpdtNbr2());
		    	hspLqblInfCustom.setUpdtNam2(hspLqblInf.getUpdtNam2());
		    	hspLqblInfCustom.setUpdtDat3(hspLqblInf.getUpdtDat3());
		    	hspLqblInfCustom.setUpdtNbr3(hspLqblInf.getUpdtNbr3());
		    	hspLqblInfCustom.setUpdtNam3(hspLqblInf.getUpdtNam3());
				if(!StringUtils.isNotNullAndEmptyByTrim(hspLqblInf.getUpdtNbr())){
			    	hspLqblInfCustom.setUpdtDat(new Date());
			    	hspLqblInfCustom.setUpdtNbr(activeUser.getUsrno());
			    	hspLqblInfCustom.setUpdtNam(activeUser.getUsrname());
			    }else if(!StringUtils.isNotNullAndEmptyByTrim(hspLqblInf.getUpdtNbr2())
			    		&& !activeUser.getUsrno().equals(hspLqblInf.getUpdtNbr())){
			    	hspLqblInfCustom.setUpdtDat2(new Date());
			    	hspLqblInfCustom.setUpdtNbr2(activeUser.getUsrno());
			    	hspLqblInfCustom.setUpdtNam2(activeUser.getUsrname());
			    }else if(!activeUser.getUsrno().equals(hspLqblInf.getUpdtNbr())
			    		&& !activeUser.getUsrno().equals(hspLqblInf.getUpdtNbr2())){
			    	hspLqblInfCustom.setUpdtDat3(new Date());
			    	hspLqblInfCustom.setUpdtNbr3(activeUser.getUsrno());
			    	hspLqblInfCustom.setUpdtNam3(activeUser.getUsrname());
			    }
				//如果是自定义签名则清空前端传过来的用户号
				customSign(hspLqblInfCustom);
				hspLqblInfMapper.updateByPrimaryKeyWithBLOBs(hspLqblInfCustom);
			}else{
				//如果没有，就新增
				hspLqblInfCustom.setLqblSeq(UUIDBuild.getUUID());
				hspLqblInfCustom.setCratDat(new Date());
				//用于进行权限控制
				hspLqblInfCustom.setUpdtDat(new Date());
		    	hspLqblInfCustom.setUpdtNbr(activeUser.getUsrno());
		    	hspLqblInfCustom.setUpdtNam(activeUser.getUsrname());
				//如果是自定义签名则清空前端传过来的用户号
				customSign(hspLqblInfCustom);
				hspLqblInfMapper.insert(hspLqblInfCustom);
			}
			
			HspEmgInf  hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(hspLqblInfCustom.getEmgSeq());
			HspemginfCustom hspemginfCustom=hspLqbljlQueryDto.getHspemginfCustom();
			
			//保存留观号
			if(hspemginfCustom!=null){
				if(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getObservationCode())){
					hspEmgInf.setObservationCode(hspemginfCustom.getObservationCode());
				}else{
					String observationCode = systemConfigService.findSequences("HSPEMGINF_OBSERVATIONCODE","6","L");
					hspEmgInf.setObservationCode(observationCode);
				}
			}
			//主诉更新
			if (StringUtils.isNotNullAndEmptyByTrim(hspLqblInfCustom.getLqblDes())) {
				
				//入院护理评估主诉更新
				HspHlpgb HspHlpgb = hspHlpgbMapper.selectByPrimaryKey(hspLqblInfCustom.getEmgSeq());
				if (null != HspHlpgb) {
					HspHlpgb.setPreDgnCod(hspLqblInfCustom.getLqblDes());
					hspHlpgbMapper.updateByPrimaryKey(HspHlpgb);
				}
				
				//急诊创伤入院护理评估主诉更新
				HspJzcspgInf hspJzcspgInf = hspJzcspgInfMapper.selectByPrimaryKey(hspLqblInfCustom.getEmgSeq());
				if (null != hspJzcspgInf) {
					hspJzcspgInf.setPreDgnCod(hspLqblInfCustom.getLqblDes());
					hspJzcspgInfMapper.updateByPrimaryKey(hspJzcspgInf);
				}
				
				//预检主诉更新
				hspEmgInf.setPreDgnCod(hspLqblInfCustom.getLqblDes());
			}
			hspEmgInfMapper.updateByPrimaryKey(hspEmgInf);
			
		}
	}
	
	/**
	 * 自定义签名处理
	 * @param hspLqblInfCustom
	 */
	public void customSign(HspLqblInfCustom hspLqblInfCustom) {
		if (StringUtils.isNotNullAndEmptyByTrim(hspLqblInfCustom.getCratNbr())) {
			DstuserExample userExample = new DstuserExample();
			DstuserExample.Criteria dstuserCriteria = userExample.createCriteria();
			dstuserCriteria.andUsrnoEqualTo(hspLqblInfCustom.getCratNbr());
			List<Dstuser> list = dstuserMapper.selectByExample(userExample);
			if(list != null && list.size() == 1){
				Dstuser dstuser = list.get(0);
				if (!dstuser.getUsrname().equals(hspLqblInfCustom.getCratNam())) {
					hspLqblInfCustom.setCratNbr(null);
				}
			}
		}
	}
	
	/**
	 * 删除留抢病历
	 */
	@Override
	public void deletelqbl(String lqblSeq)throws Exception {
		if(StringUtils.isNotNullAndEmptyByTrim(lqblSeq)){
			hspLqblInfMapper.deleteByPrimaryKey(lqblSeq);
		}
	}
	
	/**
	 * @Description 获取出观小结数据
	 * @author machaofan
	 * @date 2020年8月13日上午10:47:37
	 * @param emgSeq
	 * @return
	 * @throws Exception
	 * @return HspCgxjInfCustom
	 */
	@Override
	public HspCgxjInfCustom findCgxjByEmgSeq(String emgSeq)throws Exception {
		return hspCgxjInfCustomMapper.findCgxjByEmgSeq(emgSeq);
	}

		@Override
		public void submitCgxj(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser)
				throws Exception {
			HspCgxjInfCustom hspCgxjInfCustom=hspLqbljlQueryDto.getHspCgxjInfCustom();
			//根据emg_seq查询留抢病历表，如果有则更新，否则新增
			HspCgxjInfExample  hspCgxjInfExample = new HspCgxjInfExample();
			HspCgxjInfExample.Criteria criteria =  hspCgxjInfExample.createCriteria();
			criteria.andEmgSeqEqualTo(hspCgxjInfCustom.getEmgSeq());
			List<HspCgxjInf> HspCgxjInf = hspCgxjInfMapper.selectByExample(hspCgxjInfExample);
			//如果有则更新
			if(HspCgxjInf !=null && HspCgxjInf.size()>0){
				HspCgxjInf hspCgxjInf=hspCgxjInfMapper.selectByPrimaryKey(HspCgxjInf.get(0).getCgxjSeq());
				if(!StringUtils.isNotNullAndEmptyByTrim(hspCgxjInfCustom.getCgxjSeq())){
					hspCgxjInfCustom.setCgxjSeq(HspCgxjInf.get(0).getCgxjSeq());
				}
				hspCgxjInfCustom.setCratDat(hspCgxjInf.getCratDat());
		    	hspCgxjInfCustom.setUpdtDat(new Date());
		    	hspCgxjInfCustom.setUpdtNbr(activeUser.getUsrno());
		    	hspCgxjInfCustom.setUpdtNam(activeUser.getUsrname());
				hspCgxjInfMapper.updateByPrimaryKey(hspCgxjInfCustom);
			}else{
				//没有就新增
				hspCgxjInfCustom.setCgxjSeq(UUIDBuild.getUUID());
				hspCgxjInfCustom.setCratDat(new Date());
				hspCgxjInfMapper.insert(hspCgxjInfCustom);
			}

			HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(hspCgxjInfCustom.getEmgSeq());
			HspemginfCustom hspemginfCustom=hspLqbljlQueryDto.getHspemginfCustom();
			//保存留观号
			if(hspemginfCustom!=null){
				if(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getObservationCode())){
					hspEmgInf.setObservationCode(hspemginfCustom.getObservationCode());
				}else{
					String observationCode = systemConfigService.findSequences("HSPEMGINF_OBSERVATIONCODE","6","L");
					hspEmgInf.setObservationCode(observationCode);
				}
			}
			//更新hsp_emg_inf的留观号
			hspEmgInfMapper.updateByPrimaryKey(hspEmgInf);
			
			
		}
		
		@Override
		public void deletecgxj(String cgxjSeq)throws Exception {
			if(StringUtils.isNotNullAndEmptyByTrim(cgxjSeq)){
				hspCgxjInfMapper.deleteByPrimaryKey(cgxjSeq);
			}
		}
	
	/*-------------------------------zhang----------------------*/
//	@Override
//	public int findhspCfjlInfcount(HspLqbljlQueryDto hspLqbljlQueryDto)
//			throws Exception {
//		// TODO Auto-generated method stub
//		return hspCfjlInfCustomMapper.findhspCfjlInfcount(hspLqbljlQueryDto);
//	}

//	@Override
//	public List<HspCfjlInfCustom> findhspCfjlInfList(
//			HspLqbljlQueryDto hspLqbljlQueryDto) throws Exception {
//		// TODO Auto-generated method stub
//		return hspCfjlInfCustomMapper.findhspCfjlInfList(hspLqbljlQueryDto);
//	}
	
//	@Override
//	public String addcfjlsubmit(HspLqbljlQueryDto hspLqbljlQueryDto)
//			throws Exception {
//		HspCfjlInf hspCfjlInf = new HspCfjlInf();
//		BeanUtils.copyProperties(hspCfjlInf, hspLqbljlQueryDto.getHspCfjlInfCustom());
//		hspCfjlInf.setCfjlSeq(UUIDBuild.getUUID());
//		hspCfjlInf.setCreateDat(new Date());
//		hspCfjlInfMapper.insertSelective(hspCfjlInf);
//		return hspCfjlInf.getCfjlSeq();
//
//	}
	
//	public void delcfjl(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser) throws Exception {
//		if(hspLqbljlQueryDto!=null){
//			if(hspLqbljlQueryDto.getHspCfjlInfCustom()!=null){
//				hspCfjlInfMapper.deleteByPrimaryKey(hspLqbljlQueryDto.getHspCfjlInfCustom().getCfjlSeq());
//			}
//		}
//	}
	
//	@Override
//	public HspCfjlInfCustom findHspCfjlInfbyid(String cfjlSeq) throws Exception {
//		HspCfjlInfCustom hspCfjlInfCustom =new HspCfjlInfCustom();
//		HspCfjlInf hspCfjlInf = hspCfjlInfMapper.selectByPrimaryKey(cfjlSeq);
//		if(hspCfjlInf!=null){
//			hspCfjlInfCustom.setCfjlDatString(DateUtil.formatDateByFormat(hspCfjlInf.getCfjlDat(), "yyyy/MM/dd HH:mm:ss"));
//			BeanUtils.copyProperties(hspCfjlInfCustom, hspCfjlInf);
//		}
//		return hspCfjlInfCustom;
//	}
	
//	@Override
//	public String updatecfjl(HspLqbljlQueryDto hspLqbljlQueryDto,
//			ActiveUser activeUser) throws Exception {
//		if(hspLqbljlQueryDto.getHspCfjlInfCustom()!=null){
//			if(StringUtils.isNotNullAndEmptyByTrim(hspLqbljlQueryDto.getHspCfjlInfCustom().getCfjlSeq())){
//				HspCfjlInf hspCfjlInf = hspCfjlInfMapper.selectByPrimaryKey(hspLqbljlQueryDto.getHspCfjlInfCustom().getCfjlSeq());
//				hspCfjlInf.setCfjlDat(hspLqbljlQueryDto.getHspCfjlInfCustom().getCfjlDat());
//				hspCfjlInf.setCfjlType(hspLqbljlQueryDto.getHspCfjlInfCustom().getCfjlType());
//				hspCfjlInf.setCfjlContent(hspLqbljlQueryDto.getHspCfjlInfCustom().getCfjlContent());
//				hspCfjlInf.setUpdateDat(new Date());
//				hspCfjlInf.setUpdateNam(activeUser.getUsrname());
//				hspCfjlInf.setUpdateNum(activeUser.getUsrno());
//				hspCfjlInf.setCheckNam(hspLqbljlQueryDto.getHspCfjlInfCustom().getCheckNam());
//				hspCfjlInf.setCfjlNam(hspLqbljlQueryDto.getHspCfjlInfCustom().getCfjlNam());
//				hspCfjlInf.setCfjlNum(hspLqbljlQueryDto.getHspCfjlInfCustom().getCfjlNum());
//				hspCfjlInfMapper.updateByPrimaryKeyWithBLOBs(hspCfjlInf);
//				return hspLqbljlQueryDto.getHspCfjlInfCustom().getCfjlSeq();
//			}
//		}
//		return "";
//	}
	
//	@Override
//	public int findhspJjbjlInfcount(HspLqbljlQueryDto hspLqbljlQueryDto)
//			throws Exception {
//		// TODO Auto-generated method stub
//		return hspJjbjlInfCustomMapper.findhspJjbjlInfcount(hspLqbljlQueryDto);
//	}

//	@Override
//	public List<HspJjbjlInfCustom> findhspJjbjlInfList(
//			HspLqbljlQueryDto hspLqbljlQueryDto) throws Exception {
//		// TODO Auto-generated method stub
//		return hspJjbjlInfCustomMapper.findhspJjbjlInfList(hspLqbljlQueryDto);
//	}
	
//	@Override
//	public int addjjbjlsubmit(HspLqbljlQueryDto hspLqbljlQueryDto)
//			throws Exception {
//		HspJjbjlInf hspJjbjlInf = new HspJjbjlInf();
//		BeanUtils.copyProperties(hspJjbjlInf, hspLqbljlQueryDto.getHspJjbjlInfCustom());
//		hspJjbjlInf.setJjbjlSeq(UUIDBuild.getUUID());
//		hspJjbjlInf.setCreateDat(new Date());
//		return hspJjbjlInfMapper.insertSelective(hspJjbjlInf);
//
//	}
	
//	public void deljjbjl(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser) throws Exception {
//		if(hspLqbljlQueryDto!=null){
//			if(hspLqbljlQueryDto.getHspJjbjlInfCustom()!=null){
//				hspJjbjlInfMapper.deleteByPrimaryKey(hspLqbljlQueryDto.getHspJjbjlInfCustom().getJjbjlSeq());
//			}
//		}
//	}
	
//	@Override
//	public HspJjbjlInfCustom findHspjjbjlInfbyid(String jjbjlSeq) throws Exception {
//		HspJjbjlInfCustom hspJjbjlInfCustom =new HspJjbjlInfCustom();
//		HspJjbjlInf hspJjbjlInf = hspJjbjlInfMapper.selectByPrimaryKey(jjbjlSeq);
//		if(hspJjbjlInf!=null){
//			hspJjbjlInfCustom.setJjbjlDatString(DateUtil.formatDateByFormat(hspJjbjlInf.getJjbjlDat(), "yyyy/MM/dd HH:mm:ss"));
//			BeanUtils.copyProperties(hspJjbjlInfCustom, hspJjbjlInf);
//		}
//		return hspJjbjlInfCustom;
//	}
	
//	@Override
//	public void updatejjbjl(HspLqbljlQueryDto hspLqbljlQueryDto,
//			ActiveUser activeUser) throws Exception {
//		if(hspLqbljlQueryDto.getHspJjbjlInfCustom()!=null){
//			if(StringUtils.isNotNullAndEmptyByTrim(hspLqbljlQueryDto.getHspJjbjlInfCustom().getJjbjlSeq())){
//				HspJjbjlInf hspJjbjlInf= hspJjbjlInfMapper.selectByPrimaryKey(hspLqbljlQueryDto.getHspJjbjlInfCustom().getJjbjlSeq());
//				hspJjbjlInf.setJjbjlDat(hspLqbljlQueryDto.getHspJjbjlInfCustom().getJjbjlDat());
//				hspJjbjlInf.setJjbjlType(hspLqbljlQueryDto.getHspJjbjlInfCustom().getJjbjlType());
//				hspJjbjlInf.setJjbjlContent(hspLqbljlQueryDto.getHspJjbjlInfCustom().getJjbjlContent());
//				hspJjbjlInf.setUpdateDat(new Date());
//				hspJjbjlInf.setUpdateNam(activeUser.getUsrname());
//				hspJjbjlInf.setUpdateNum(activeUser.getUsrno());
//				hspJjbjlInf.setJjbjlNam(hspLqbljlQueryDto.getHspJjbjlInfCustom().getJjbjlNam());
//				hspJjbjlInf.setJjbjlNum(hspLqbljlQueryDto.getHspJjbjlInfCustom().getJjbjlNum());
//				hspJjbjlInfMapper.updateByPrimaryKeyWithBLOBs(hspJjbjlInf);
//			}
//		}
//	}
	
//	@Override
//	public int findhspQjjlInfcount(HspLqbljlQueryDto hspLqbljlQueryDto)
//			throws Exception {
//		// TODO Auto-generated method stub
//		return hspQjjlInfCustomMapper.findhspQjjlInfcount(hspLqbljlQueryDto);
//	}
//
//	@Override
//	public List<HspQjjlInfCustom> findhspQjjlInfList(
//			HspLqbljlQueryDto hspLqbljlQueryDto) throws Exception {
//		return hspQjjlInfCustomMapper.findhspQjjlInfList(hspLqbljlQueryDto);
//	}
//
//	@Override
//	public String addqjjlsubmit(HspLqbljlQueryDto hspLqbljlQueryDto)
//			throws Exception {
//		HspQjjlInf hspQjjlInf = new HspQjjlInf();
//		BeanUtils.copyProperties(hspQjjlInf, hspLqbljlQueryDto.getHspQjjlInfCustom());
//		hspQjjlInf.setQjjlSeq(UUIDBuild.getUUID());
//		hspQjjlInf.setCreateDat(new Date());
//		hspQjjlInfMapper.insertSelective(hspQjjlInf);
//		return hspQjjlInf.getQjjlSeq();
//	}
//
//	public void delqjjl(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser) throws Exception {
//		if(hspLqbljlQueryDto!=null){
//			if(hspLqbljlQueryDto.getHspQjjlInfCustom()!=null){
//				if(StringUtils.isNotNullAndEmptyByTrim(hspLqbljlQueryDto.getHspQjjlInfCustom().getQjjlSeq())){
//					hspQjjlInfMapper.deleteByPrimaryKey(hspLqbljlQueryDto.getHspQjjlInfCustom().getQjjlSeq());
//				}
//			}
//		}
//	}
//
//	@Override
//	public HspQjjlInfCustom findHspqjjlInfbyid(String qjjlSeq) throws Exception {
//		HspQjjlInfCustom hspQjjlInfCustom =new HspQjjlInfCustom();
//		HspQjjlInf hspQjjlInf = hspQjjlInfMapper.selectByPrimaryKey(qjjlSeq);
//		if(hspQjjlInf!=null){
//			hspQjjlInfCustom.setQjjlDatString(DateUtil.formatDateByFormat(hspQjjlInf.getQjjlDatStart(), "yyyy/MM/dd HH:mm:ss"));
//			hspQjjlInfCustom.setQjjlJldatString(DateUtil.formatDateByFormat(hspQjjlInf.getQjjlJldat(), "yyyy/MM/dd HH:mm:ss"));
//			BeanUtils.copyProperties(hspQjjlInfCustom, hspQjjlInf);
//		}
//		return hspQjjlInfCustom;
//	}
//
//	@Override
//	public String updateqjjl(HspLqbljlQueryDto hspLqbljlQueryDto,
//			ActiveUser activeUser) throws Exception {
//		HspQjjlInfCustom hspQjjlInfCustom = hspLqbljlQueryDto.getHspQjjlInfCustom();
//		if (hspQjjlInfCustom == null) {
//			hspQjjlInfCustom = new HspQjjlInfCustom();
//		}
//		if(StringUtils.isNotNullAndEmptyByTrim(hspQjjlInfCustom.getQjjlSeq())){
//			HspQjjlInf hspQjjlInf = hspQjjlInfMapper.selectByPrimaryKey(hspQjjlInfCustom.getQjjlSeq());
//			if (hspQjjlInf != null) {
//				hspQjjlInfCustom.setEmgSeq(hspQjjlInf.getEmgSeq());
//				hspQjjlInfCustom.setCreateDat(hspQjjlInf.getCreateDat());
//				hspQjjlInfCustom.setUpdateDat(new Date());
//				hspQjjlInfCustom.setUpdateNam(activeUser.getUsrname());
//				hspQjjlInfCustom.setUpdateNum(activeUser.getUsrno());
//				hspQjjlInfMapper.updateByPrimaryKeyWithBLOBs(hspQjjlInf);
//			}
//		}
//		return hspQjjlInfCustom.getQjjlSeq();
//	}
//
	
	@Override
	public void insertyzxx(VHemsJyjgQueryDto vHemsJyjgQueryDto,ActiveUser activeUser)
			throws Exception {
		HspDocadviceInfCustom hspDocadviceInfCustom = vHemsJyjgQueryDto.getHspDocadviceInfCustom();
		if(hspDocadviceInfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspDocadviceInfCustom.getDocadviceContents())){
				String[] a = hspDocadviceInfCustom.getDocadviceContents().split(",");  
				for (int i = 0; i < a.length; i++) {
					String[] b=a[i].split("#");
					HspDocadviceInf hspDocadviceInf = new HspDocadviceInf();
					for (int j = 0; j < b.length; j++) {
						String typeString = systemConfigService.findSequences("HSPDOCADVICEINF_SEQ","7","YZ");
						hspDocadviceInf.setDocadviceIsdat(hspDocadviceInfCustom.getDocadviceIsdat());
						hspDocadviceInf.setDocadviceBedat(hspDocadviceInfCustom.getDocadviceIsdat());
						hspDocadviceInf.setDocadviceContent(b[0]);
						hspDocadviceInf.setDocadviceNam(hspDocadviceInfCustom.getDocadviceNam());
						hspDocadviceInf.setCreateNam(activeUser.getUsrname());
						hspDocadviceInf.setCreateNum(activeUser.getUsrno());
						hspDocadviceInf.setCreateDat(new Date());
						hspDocadviceInf.setVstCad(hspDocadviceInfCustom.getVstCad());
			        	hspDocadviceInf.setDocadviceSeq(UUIDBuild.getUUID());
			        	hspDocadviceInf.setDocadviceType(typeString);
			        	hspDocadviceInf.setDocadviceFlag("0");
			        	hspDocadviceInf.setDocadviceStatus("0");
					}
					hspDocadviceInfMapper.insert(hspDocadviceInf);
				}
			}
		}
	}
	
	@Override
	public HspDocadviceInfCustom findyzxxbyid(String docadviceSeq)
			throws Exception {
		HspDocadviceInfCustom hspDocadviceInfCustom= new HspDocadviceInfCustom();
		HspDocadviceInf hspDocadviceInf = hspDocadviceInfMapper.selectByPrimaryKey(docadviceSeq);
		if(hspDocadviceInf!=null){
			hspDocadviceInfCustom.setDocadviceDatisString(DateUtil.formatDateByFormat(hspDocadviceInf.getDocadviceIsdat(), "yyyy/MM/dd HH:mm:ss"));
			BeanUtils.copyProperties(hspDocadviceInfCustom, hspDocadviceInf);
		}
		return hspDocadviceInfCustom;
	}

	@Override
	public void updateyzxx(VHemsJyjgQueryDto vHemsJyjgQueryDto,
			ActiveUser activeUser) throws Exception {
		HspDocadviceInfCustom hspDocadviceInfCustom=vHemsJyjgQueryDto.getHspDocadviceInfCustom();
		if(hspDocadviceInfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspDocadviceInfCustom.getDocadviceSeq())){
				HspDocadviceInf hspDocadviceInf = hspDocadviceInfMapper.selectByPrimaryKey(hspDocadviceInfCustom.getDocadviceSeq());
				if(hspDocadviceInf!=null){
					hspDocadviceInf.setDocadviceContent(hspDocadviceInfCustom.getDocadviceContent());
					hspDocadviceInf.setDocadviceIsdat(hspDocadviceInfCustom.getDocadviceIsdat());
					hspDocadviceInf.setDocadviceBedat(hspDocadviceInfCustom.getDocadviceIsdat());
					hspDocadviceInf.setUpdateDat(new Date());
					hspDocadviceInf.setUpdateNam(activeUser.getUsrname());
					hspDocadviceInf.setUpdateNum(activeUser.getUsrno());
					hspDocadviceInfMapper.updateByPrimaryKeyWithBLOBs(hspDocadviceInf);
				}else if("1".equals(hspDocadviceInfCustom.getDocadviceFlag())){
					hspDocadviceInfCustom.setCreateDat(new Date());
					hspDocadviceInfCustom.setCreateNam(activeUser.getUsrname());
					hspDocadviceInfCustom.setCreateNum(activeUser.getUsrno());
					hspDocadviceInfCustom.setDocadviceFlag("0");
					hspDocadviceInfCustom.setDocadviceStatus("0");
					hspDocadviceInfCustom.setDocadviceBedat(hspDocadviceInfCustom.getDocadviceIsdat());
					hspDocadviceInfCustom.setUpdateDat(new Date());
					hspDocadviceInfCustom.setUpdateNam(activeUser.getUsrname());
					hspDocadviceInfCustom.setUpdateNum(activeUser.getUsrno());
					hspDocadviceInfMapper.insert(hspDocadviceInfCustom);
				}
			}
		}
		
	}
	@Override
	public void delyzxx(List<HspDocadviceInfCustom> hspDocadviceInfCustomlist,
			ActiveUser activeUser) throws Exception {
		for (HspDocadviceInfCustom hspDocadviceInfCustom : hspDocadviceInfCustomlist) {
			HspDocadviceInf hspDocadviceInf = hspDocadviceInfMapper.selectByPrimaryKey(hspDocadviceInfCustom.getDocadviceSeq());
			if(hspDocadviceInf==null){//新增修改状态为1
				hspDocadviceInfCustom.setDocadviceStatus("1");
				hspDocadviceInfMapper.insert(hspDocadviceInfCustom);
			}else{//存在,status 0改为1
				hspDocadviceInf.setDocadviceStatus("1");
				hspDocadviceInfMapper.updateByPrimaryKeyWithBLOBs(hspDocadviceInf);
			}
		}
		
	}
	
	@Override
	public void insertyzxxajax(List<HspDocadviceInfCustom> hspDocadviceInfCustomlist,
			ActiveUser activeUser) throws Exception {
		for (HspDocadviceInfCustom hspDocadviceInfCustom : hspDocadviceInfCustomlist) {
			HspDocadviceInf hspDocadviceInf = hspDocadviceInfMapper.selectByPrimaryKey(hspDocadviceInfCustom.getDocadviceSeq());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			if(hspDocadviceInf==null){
				hspDocadviceInfCustom.setDocadviceBedat(sdf.parse(hspDocadviceInfCustom.getDocadviceDatbeString()));
				hspDocadviceInfCustom.setDocadviceIsdat(sdf.parse(hspDocadviceInfCustom.getDocadviceDatisString()));
				if(StringUtils.isNotNullAndEmptyByTrim(hspDocadviceInfCustom.getDocadviceNuimdatString())){
					hspDocadviceInfCustom.setDocadviceNuimdat(sdf.parse(hspDocadviceInfCustom.getDocadviceNuimdatString()));
				}
				hspDocadviceInfCustom.setDocadviceFlag("0");
				hspDocadviceInfCustom.setDocadviceStatus("0");
				hspDocadviceInfMapper.insert(hspDocadviceInfCustom);
			}else {
				if(StringUtils.isNotNullAndEmptyByTrim(hspDocadviceInfCustom.getDocadviceNuimdatString())){
					hspDocadviceInf.setDocadviceNuimdat(sdf.parse(hspDocadviceInfCustom.getDocadviceNuimdatString()));
				}else{
					hspDocadviceInf.setDocadviceNuimdat(null);
				}
				hspDocadviceInf.setDocadviceNuimnam(hspDocadviceInfCustom.getDocadviceNuimnam());
				hspDocadviceInf.setDocadviceNuimnam2(hspDocadviceInfCustom.getDocadviceNuimnam2());
				hspDocadviceInf.setDocadviceFlag("0");
				hspDocadviceInf.setDocadviceStatus("0");
				hspDocadviceInf.setDocadviceChecknam(hspDocadviceInfCustom.getDocadviceChecknam());
				hspDocadviceInfMapper.updateByPrimaryKeyWithBLOBs(hspDocadviceInf);
			}
		}
	}
	
	@Override
	public void inseryzxxbatch(VHemsJyjgQueryDto vHemsJyjgQueryDto,
			ActiveUser activeUser) throws Exception {
		if(vHemsJyjgQueryDto.getHspDocadviceInfCustom().getEnddate() != null){
			Date endDate = DateUtil.getNextDay(vHemsJyjgQueryDto.getHspDocadviceInfCustom().getEnddate());
			vHemsJyjgQueryDto.getHspDocadviceInfCustom().setEnddate(endDate);
		}
		List<HspDocadviceInfCustom>  HspDocadviceInfList =  vHemsYpxxMapper.findvhemsypxxinfoanddocadviceList(vHemsJyjgQueryDto);
		for (HspDocadviceInfCustom hspDocadviceInfCustom : HspDocadviceInfList) {
			HspDocadviceInf hspDocadviceInf = hspDocadviceInfMapper.selectByPrimaryKey(hspDocadviceInfCustom.getDocadviceSeq());
			if(hspDocadviceInf==null){
				hspDocadviceInfCustom.setDocadviceFlag("0");
				hspDocadviceInfMapper.insert(hspDocadviceInfCustom);
			}
		}
	}
	
	@Override
	public byte[] lqbltpctbyte(String emgSeq) throws Exception {
		byte[] bytes = null;
		HspMediaInfCustom hspMediaInfCustom=hspMediaInfCustomMapper.selectByEmgSeq(emgSeq);
		if(hspMediaInfCustom!=null){
			bytes=hspMediaInfCustom.getMedData();
		}
		return bytes;
	}
	
	/*-------------------------------wu-------------------------*/
	@Override
	public HspLqblInfCustom findLqblForDisease(String emgSeqDc) {
		HspLqblInfCustom custom = hspLqblInfCustomMapper.findLqblForDisease(emgSeqDc);
		if(null == custom){
			return new HspLqblInfCustom();
		}
		StringBuilder builder = new StringBuilder();
		//开始拼接体格检查
		if(StringUtils.isNotNullAndEmptyByTrim(custom.getXyFlgStr()) || StringUtils.isNotNullAndEmptyByTrim(custom.getSbpVal())){
			builder.append("血压：").append(custom.getXyFlgStr() == null ? "":custom.getXyFlgStr() ).append(custom.getSbpVal() == null ? "":custom.getSbpVal()+"mmHg");
		}
		if(StringUtils.isNotNullAndEmptyByTrim(custom.getTgjcTw()) || !"1".equals(custom.getTgjcTwFlg())){
			builder.append("，体温：").append(custom.getTwFlgStr() == null ?"":custom.getTwFlgStr()).append(custom.getTgjcTw() == null ?"":custom.getTgjcTw() + "℃");
		}
		if(StringUtils.isNotNullAndEmptyByTrim(custom.getXyFlgStr()) || StringUtils.isNotNullAndEmptyByTrim(custom.getTgjcCbzy())){
			 builder.append("，床边指氧饱和度：").append(custom.getXyFlgStr() ==null ?"":custom.getXyFlgStr()).append(custom.getTgjcCbzy() ==null ?"":custom.getTgjcCbzy() + "%");
		}
		if(StringUtils.isNotNullAndEmptyByTrim(custom.getTgjcHx())){
			builder.append("，呼吸：").append(custom.getHxFlgStr() == null ?"":custom.getHxFlgStr() ).append(custom.getTgjcHx() +"次/分");
		}else if(!StringUtils.isNotNullAndEmptyByTrim(custom.getTgjcHx())&&StringUtils.isNotNullAndEmptyByTrim(custom.getHxFlgStr())){
			builder.append("，呼吸：").append(custom.getHxFlgStr());
		}
		if(StringUtils.isNotNullAndEmptyByTrim(custom.getXtCodStr())){
			builder.append("，"+custom.getXtCodStr()+"：");
			if(StringUtils.isNotNullAndEmptyByTrim(custom.getTgjcXt())){
				builder.append(custom.getTgjcXt()+"mmol/L");
			}else if(StringUtils.isNotNullAndEmptyByTrim(custom.getXtFlgStr())){
				builder.append(custom.getXtFlgStr());
			}	
		}else{
			if(StringUtils.isNotNullAndEmptyByTrim(custom.getTgjcXt())){
				builder.append("，血糖：").append(custom.getTgjcXt()+"mmol/L");
			}else if(StringUtils.isNotNullAndEmptyByTrim(custom.getXtFlgStr())){
				builder.append("，血糖：").append(custom.getXtFlgStr());
			}
		}
		
		if(StringUtils.isNotNullAndEmptyByTrim(custom.getTgjcMb()) || StringUtils.isNotNullAndEmptyByTrim(custom.getMbFlgStr())){
			builder.append("，心率：").append(custom.getMbFlgStr() == null ? "":custom.getMbFlgStr()).append(custom.getTgjcMb() == null ? "":custom.getTgjcMb() +"次/分");
		}
		
		if(StringUtils.isNotNullAndEmptyByTrim(custom.getTgjcPulse()) || StringUtils.isNotNullAndEmptyByTrim(custom.getPulseFlgStr())){
			builder.append("，脉搏：").append(custom.getPulseFlgStr() == null ? "":custom.getPulseFlgStr()).append(custom.getTgjcPulse() == null ? "":custom.getTgjcPulse() +"次/分");
		}
		
		String tgjcMergeStr = builder.toString();
		
		if(StringUtils.isNotNullAndEmptyByTrim(tgjcMergeStr)){
			tgjcMergeStr = tgjcMergeStr+"；";
			if(tgjcMergeStr.indexOf("，") == 0 ){
				tgjcMergeStr = tgjcMergeStr.substring(1);
			}
			custom.setTgjcMergeStr(tgjcMergeStr);
		}
		return custom;
	}
	
	@Override
	public void afterPrint(VHemsJyjgQueryDto vHemsJyjgQueryDto) {
		HspPrintInf hspPrintInf = new HspPrintInf();
		hspPrintInf.setEmgSeq(vHemsJyjgQueryDto.getHspemginfCustom().getEmgSeq());
		hspPrintInf.setPrintId(UUIDBuild.getUUID());
		hspPrintInf.setPrintPage(vHemsJyjgQueryDto.getHspemginfCustom().getPrintPage());
		hspPrintInf.setPrintType(vHemsJyjgQueryDto.getHspemginfCustom().getPrintType());
		hspPrintInfMapper.insertSelective(hspPrintInf);
		//更新打印标志
		hspDocadviceInfCustomMapper.afterprint(vHemsJyjgQueryDto);
	}

	@Override
	public List<HspLqblInfCustom> getLslqblList(String vstCad) {
		List<HspLqblInfCustom> list = hspLqblInfCustomMapper.getLslqblList(vstCad);
		if(list.size()>0){
			for(int i=0;i<list.size();i++){
				HspLqblInfCustom hspLqblInfCustom = findLqblForDisease(list.get(i).getEmgSeq());
				list.get(i).setTgjcMergeStr(hspLqblInfCustom.getTgjcMergeStr());
			}
		}
		return list;
	}
	
	/**
	 * 导入今日门急诊病历
	 * @param emgSeq
	 * @return
	 * @throws Exception
	 */
	@Override
	public HspLqblInfCustom findMzblByEmgSeq(String emgSeq) throws Exception{
		return hspLqblInfCustomMapper.findMzblByEmgSeq(emgSeq);
	}
	

	@Override
	public void submitDzqm(HspAotographInfoCustom hspAotographInfoCustom, ActiveUser activeUser) throws Exception {
		HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(hspAotographInfoCustom.getEmgSeq());
		String qmOpenid = activeUser.getQmOpenid();
		if(!StringUtils.isNotNullAndEmptyByTrim(qmOpenid)){
			//String url171 = "http://test.51trust.com/gateway/doctor/synDoctorSearch";
			String url171 = systemConfigService.findAppoptionByOptkey("qm171").getOptvalue();
			JSONObject param = new JSONObject();
			JSONObject head = new JSONObject();
			JSONObject body = new JSONObject();
			head.put("clientId", "2017070411003376");
			body.put("employeeNumber", activeUser.getUsrno()); //工号
			param.put("head", head);
			param.put("body", body);
			String request171 = param.toJSONString();
			String reVal171 = HttpClientUtil.doPostJson(url171, request171);
			JSONObject reMap171 = JSONObject.parseObject(reVal171);
			JSONObject dataMap171 = (JSONObject) reMap171.get("data");
			qmOpenid = dataMap171.get("openId").toString();
		}
		
		//String url172 = "http://test.51trust.com/gateway/common/computeDigest";
		String url172 = systemConfigService.findAppoptionByOptkey("qm172").getOptvalue();
		String request172 = hspAotographInfoCustom.getRequest172();
		String reVal172 = HttpClientUtil.doPostJson(url172, request172);
		JSONObject reMap172 = JSONObject.parseObject(reVal172);
		JSONObject dataMap172 = (JSONObject) reMap172.get("data");
		String hashValue = (String) dataMap172.get("hashValue");
		String hashType = (String) dataMap172.get("hashType");
		
		String url = systemConfigService.findAppoptionByOptkey("qm173").getOptvalue();
		//String url = "http://test.51trust.com/gateway/recipe/synRecipeInfo";
		JSONObject param = new JSONObject();
		JSONObject head = new JSONObject();
		JSONObject body = new JSONObject();
		
		head.put("clientId", "2017070411003376");
		head.put("templateId", hspAotographInfoCustom.getTemplateId()); //哈希类型，002是急门诊病历
		head.put("clientSecret", "2017070411003360");
		head.put("channelID", "");
		head.put("sysTag", "his");
		
		body.put("urId", UUIDBuild.getUUID()); //唯一值,一个值只能用一次
		body.put("openId", qmOpenid); //工号
		body.put("patientName", hspEmgInf.getCstNam()); //患者姓名
		Map<String, Object> ageMap = DateUtil.getAge(hspEmgInf.getBthDat(), "岁", "月", "天");
		body.put("patientAge", ageMap.get("age").toString()+ageMap.get("flag").toString()); //患者年龄
		if("0".equals(hspEmgInf.getCstSexCod())){
			body.put("patientSex", "男"); //患者性别
		}else{
			body.put("patientSex", "女"); //患者性别
		}
		body.put("patientCard", hspEmgInf.getIdNbr()); //患者证件号
		body.put("patientCardType", "SF"); //证件号类型 YB：患者医保号SF：身份证HZ：护照QT：其它
		body.put("recipeTime", DateUtil.formatDateByFormat(new Date(), DateUtil.DATETIME_FORMAT)); //开具时间   （签名时间？）"2020-05-19 14:53:33"
		if(StringUtils.isNotNullAndEmptyByTrim(hspAotographInfoCustom.getTag())){
			body.put("tag", hspAotographInfoCustom.getTag()); 
		}
		body.put("hashValue", hashValue); //172接口获得
		body.put("hashType", hashType); //172接口获得
		body.put("remarks", request172); //备注
		
		param.put("signType", "0");
		JSONObject msg = new JSONObject();
		msg.put("head", head);
		msg.put("body", body);
		param.put("msg", msg);
		String request = JacksonUtil.obj2Json(param);
		logger.info("签名接口发送数据："+request);
		String reVal = HttpClientUtil.doPostJson(url, request);
		logger.info("签名接口返回数据："+reVal);
		JSONObject reMap = JSONObject.parseObject(reVal);
		if(!"0".equals(reMap.get("status"))){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920,new Object[] {reMap.get("message")}));
		}
		JSONObject dataMap = (JSONObject) reMap.get("data");
		hspAotographInfoCustom.setAotographReturn((String) dataMap.get("uniqueId")); //签名数据唯一标识，需要存起来
		hspAotographInfoCustom.setDocImg((String) dataMap.get("stamp"));//用户签章图 base64，需png格式展示
		hspAotographInfoCustom.setAotographId(UUIDBuild.getUUID());
		hspAotographInfoCustom.setAotographTime(new Date());
		hspAotographInfoCustom.setRemark(request172);
		hspAotographInfoCustom.setDocNo(activeUser.getUsrno());
		hspAotographInfoCustom.setDocName(activeUser.getUsrname());
		hspAotographInfoMapper.insertSelective(hspAotographInfoCustom);
	}

	@Override
	public List<HspAotographInfoCustom> findDzqmImg(HspAotographInfoCustom hspAotographInfoCustom) {
		return hspAotographInfoCustomMapper.findDzqmImg(hspAotographInfoCustom);
	}

	@Override
	public HspLqbljlQueryDto findRelatedDataByEmgSeq(String emgSeq) throws Exception {
		HspLqbljlQueryDto hspLqbljlQueryDto = new HspLqbljlQueryDto();
		HspHljldInfExample hspHljldInfExample = new HspHljldInfExample();
		HspHljldInfExample.Criteria criteria = hspHljldInfExample.createCriteria();
		hspHljldInfExample.setOrderByClause("CRT_DAT");
		criteria.andEmgSeqEqualTo(emgSeq);
		List<HspHljldInf> hljldList = hspHljldInfMapper.selectByExample(hspHljldInfExample);
		if(StringUtils.isNotNullAndZero(hljldList)) {
			HspHljldInf hspHljldInf =  hljldList.get(0);
			if (StringUtils.isNotNullAndEmptyByTrim(hspHljldInf.getNrsSeq())) {
				HspNrsInf hspNrsInf = hspNrsInfMapper.selectByPrimaryKey(hspHljldInf.getNrsSeq());	
				HspNrsInfCustom hspNrsInfCustom = new HspNrsInfCustom();
				BeanUtils.copyProperties(hspNrsInfCustom,hspNrsInf);
				hspLqbljlQueryDto.setHspNrsInfCustom(hspNrsInfCustom);
			}
		}
		return hspLqbljlQueryDto;
	}
	
	@Override
	public HspLqblInfCustom findAllLqblForDisease(String lqblSeq) {
		HspLqblInfCustom custom = hspLqblInfCustomMapper.findAllLqblForDisease(lqblSeq);
		if(null == custom){
			return new HspLqblInfCustom();
		}
		StringBuilder builder = new StringBuilder();
		//开始拼接体格检查
		if(StringUtils.isNotNullAndEmptyByTrim(custom.getXyFlgStr()) || StringUtils.isNotNullAndEmptyByTrim(custom.getSbpVal())){
			builder.append("血压：").append(custom.getXyFlgStr() == null ? "":custom.getXyFlgStr() ).append(custom.getSbpVal() == null ? "":custom.getSbpVal()+"mmHg");
		}
		if(StringUtils.isNotNullAndEmptyByTrim(custom.getTgjcTw()) || !"1".equals(custom.getTgjcTwFlg())){
			builder.append("，体温：").append(custom.getTwFlgStr() == null ?"":custom.getTwFlgStr()).append(custom.getTgjcTw() == null ?"":custom.getTgjcTw() + "℃");
		}
		if(StringUtils.isNotNullAndEmptyByTrim(custom.getXyFlgStr()) || StringUtils.isNotNullAndEmptyByTrim(custom.getTgjcCbzy())){
			 builder.append("，床边指氧饱和度：").append(custom.getXyFlgStr() ==null ?"":custom.getXyFlgStr()).append(custom.getTgjcCbzy() ==null ?"":custom.getTgjcCbzy() + "%");
		}
		if(StringUtils.isNotNullAndEmptyByTrim(custom.getTgjcHx())){
			builder.append("，呼吸：").append(custom.getHxFlgStr() == null ?"":custom.getHxFlgStr() ).append(custom.getTgjcHx() +"次/分");
		}else if(!StringUtils.isNotNullAndEmptyByTrim(custom.getTgjcHx())&&StringUtils.isNotNullAndEmptyByTrim(custom.getHxFlgStr())){
			builder.append("，呼吸：").append(custom.getHxFlgStr());
		}
		if(StringUtils.isNotNullAndEmptyByTrim(custom.getXtCodStr())){
			builder.append("，"+custom.getXtCodStr()+"：");
			if(StringUtils.isNotNullAndEmptyByTrim(custom.getTgjcXt())){
				builder.append(custom.getTgjcXt()+"mmol/L");
			}else if(StringUtils.isNotNullAndEmptyByTrim(custom.getXtFlgStr())){
				builder.append(custom.getXtFlgStr());
			}	
		}else{
			if(StringUtils.isNotNullAndEmptyByTrim(custom.getTgjcXt())){
				builder.append("，血糖：").append(custom.getTgjcXt()+"mmol/L");
			}else if(StringUtils.isNotNullAndEmptyByTrim(custom.getXtFlgStr())){
				builder.append("，血糖：").append(custom.getXtFlgStr());
			}
		}
		
		if(StringUtils.isNotNullAndEmptyByTrim(custom.getTgjcMb()) || StringUtils.isNotNullAndEmptyByTrim(custom.getMbFlgStr())){
			builder.append("，心率：").append(custom.getMbFlgStr() == null ? "":custom.getMbFlgStr()).append(custom.getTgjcMb() == null ? "":custom.getTgjcMb() +"次/分");
		}
		
		if(StringUtils.isNotNullAndEmptyByTrim(custom.getTgjcPulse()) || StringUtils.isNotNullAndEmptyByTrim(custom.getPulseFlgStr())){
			builder.append("，脉搏：").append(custom.getPulseFlgStr() == null ? "":custom.getPulseFlgStr()).append(custom.getTgjcPulse() == null ? "":custom.getTgjcPulse() +"次/分");
		}
		
		String tgjcMergeStr = builder.toString();
		
		if(StringUtils.isNotNullAndEmptyByTrim(tgjcMergeStr)){
			tgjcMergeStr = tgjcMergeStr+"；";
			if(tgjcMergeStr.indexOf("，") == 0 ){
				tgjcMergeStr = tgjcMergeStr.substring(1);
			}
			custom.setTgjcMergeStr(tgjcMergeStr);
		}
		return custom;
	}

	@Resource(name = "transactionManager")  
    private PlatformTransactionManager platformTransactionManager;  
	@Override
	public List<THemsPaperwork> findBclbBySeq(String emgSeq) throws Exception {
		List<THemsPaperwork> list = new ArrayList<THemsPaperwork>();
		// TODO Auto-generated method stub
		 //关闭事务自动提交  
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();  
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);  
        TransactionStatus status = platformTransactionManager.getTransaction(def); 
        try{
        	hspLqblInfCustomMapper.proc_paperworkdata(emgSeq);
        	THemsPaperwork tHemsPaperwork = new THemsPaperwork();
        	tHemsPaperwork.setEmgSeq(emgSeq);
			list = hspLqblInfCustomMapper.getBclbByEmgSeq(tHemsPaperwork);
        	platformTransactionManager.commit(status); 
        }catch(Exception ex){
        	ex.printStackTrace();
			platformTransactionManager.rollback(status); 
        }
		return list;
	}

	@Override
	public List<HspDocadviceInfCustom> findvhemsypxxinfoanddocadviceList(VHemsJyjgQueryDto vHemsJyjgQueryDto){
		List<HspDocadviceInfCustom> list= hspDocadviceInfCustomMapper.findvhemsypxxinfoanddocadviceList(vHemsJyjgQueryDto);
		for (HspDocadviceInfCustom hspDocadviceInfCustom : list) {
			hspDocadviceInfCustom.setDocadviceDatisString(DateUtil.formatDateByFormat(hspDocadviceInfCustom.getDocadviceIsdat(), "yyyy/MM/dd HH:mm"));
			hspDocadviceInfCustom.setDocadviceDatbeString(DateUtil.formatDateByFormat(hspDocadviceInfCustom.getDocadviceBedat(), "yyyy/MM/dd HH:mm"));
			hspDocadviceInfCustom.setDocadviceBedat(null);
			hspDocadviceInfCustom.setDocadviceIsdat(null);
			if(hspDocadviceInfCustom.getDocadviceNuimdat()!=null){
				hspDocadviceInfCustom.setDocadviceNuimdatString(DateUtil.formatDateByFormat(hspDocadviceInfCustom.getDocadviceNuimdat(), "yyyy/MM/dd HH:mm"));
				hspDocadviceInfCustom.setDocadviceNuimdat(null);
			}
			if(hspDocadviceInfCustom.getDocadviceDocstdat()!=null){
				hspDocadviceInfCustom.setDocadviceDocstdatString(DateUtil.formatDateByFormat(hspDocadviceInfCustom.getDocadviceDocstdat(), "yyyy/MM/dd HH:mm"));
				hspDocadviceInfCustom.setDocadviceDocstdat(null);	
			}
			if(hspDocadviceInfCustom.getDocadviceNustdat()!=null){
				hspDocadviceInfCustom.setDocadviceNustdatString(DateUtil.formatDateByFormat(hspDocadviceInfCustom.getDocadviceNustdat(), "yyyy/MM/dd HH:mm"));
				hspDocadviceInfCustom.setDocadviceNustdat(null);
			}
		}
		return list;		
	}

}
