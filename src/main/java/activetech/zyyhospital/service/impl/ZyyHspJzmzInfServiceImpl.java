package activetech.zyyhospital.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.dao.mapper.DstuserMapper;
import activetech.base.pojo.domain.Dstuser;
import activetech.base.pojo.domain.DstuserExample;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.service.SystemConfigService;
import activetech.hospital.dao.mapper.HspEmgInfMapper;
import activetech.hospital.dao.mapper.HspMewsInfMapper;
import activetech.hospital.dao.mapper.HspSqlInfMapper;
import activetech.hospital.pojo.domain.HspEmgInf;
import activetech.hospital.pojo.domain.HspMewsInf;
import activetech.hospital.pojo.domain.HspSqlInf;
import activetech.hospital.pojo.domain.HspSqlInfExample;
import activetech.hospital.pojo.domain.HspSqlInfExample.Criteria;
import activetech.hospital.pojo.dto.HspFastInfCustom;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.pda.pojo.dto.HspCfxxInfoCustom;
import activetech.pda.pojo.dto.HspCfxxInfoQueryDto;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.zyyhospital.dao.mapper.HspFallassInfMapper;
import activetech.zyyhospital.dao.mapper.HspHlpgbCustomMapper;
import activetech.zyyhospital.dao.mapper.HspHlpgbMapper;
import activetech.zyyhospital.dao.mapper.HspJzcspgInfMapper;
import activetech.zyyhospital.dao.mapper.HspLqblInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspLqblInfMapper;
import activetech.zyyhospital.dao.mapper.HspNrsInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspNrsInfMapper;
import activetech.zyyhospital.dao.mapper.ZyyHspemginfCustomMapper;
import activetech.zyyhospital.pojo.domain.HspFallassInf;
import activetech.zyyhospital.pojo.domain.HspHlpgb;
import activetech.zyyhospital.pojo.domain.HspJzcspgInf;
import activetech.zyyhospital.pojo.domain.HspLqblInf;
import activetech.zyyhospital.pojo.domain.HspNrsInf;
import activetech.zyyhospital.pojo.dto.HspFallAssInfCustom;
import activetech.zyyhospital.pojo.dto.HspLqblInfCustom;
import activetech.zyyhospital.pojo.dto.HspLqbljlQueryDto;
import activetech.zyyhospital.pojo.dto.HspNrsInfCustom;
import activetech.zyyhospital.service.ZyyHspJzmzInfService;
import activetech.zyyhospital.service.ZyyHspemginfService;

public class ZyyHspJzmzInfServiceImpl implements ZyyHspJzmzInfService {
	
	@Autowired
	private ZyyHspemginfCustomMapper zyyHspemginfCustomMapper;
	@Autowired
	private HspLqblInfCustomMapper hspLqblInfCustomMapper;
	@Autowired
	private HspEmgInfMapper hspEmgInfMapper;
	@Autowired
	private HspMewsInfMapper hspMewsInfMapper;
	@Autowired
	private HspHlpgbCustomMapper hspHlpgbCustomMapper;
	@Autowired
	private HspLqblInfMapper hspLqblInfMapper;
	@Autowired
	private DstuserMapper dstuserMapper;
	
	@Autowired
	private HspNrsInfCustomMapper hspNrsInfCustomMapper;
	
	@Autowired
	private HspNrsInfMapper hspNrsInfMapper;
	
	@Autowired
	private HspFallassInfMapper hspFallassInfMapper;
	
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
	
	@Autowired
	private SystemConfigService systemConfigService; 
	
	@Autowired
	private HspSqlInfMapper hspSqlInfMapper;
	
	@Autowired
	private HspHlpgbMapper hspHlpgbMapper;
	
	@Autowired
	private HspJzcspgInfMapper hspJzcspgInfMapper;
	
	@Override
	public int jzmzFindHspemginfCount(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		return zyyHspemginfCustomMapper.jzmzFindHspemginfCount(hspemginfQueryDto);
	}

	@Override
	public List<HspemginfCustom> jzmzFindHspemginfList(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		hspemginfQueryDto.setXtdate(new Date());
		return zyyHspemginfCustomMapper.jzmzFindHspemginfList(hspemginfQueryDto);
	}
	
	@Override
	public HspMewsInf findhspMewsInfByemgSeq(String emgSeq) throws Exception {
		return hspMewsInfMapper.selectByPrimaryKey(emgSeq);
	}
		
	/**
	 * 门急诊病历查询
	 */
	@Override
	public Map<String,Object> findMzblByEmgSeq(String emgSeq, String lqblSeq, String mpi, String jzxh, String cstNam, ActiveUser activeUser) throws Exception {
		Map<String, Object> resMap = new HashMap<String, Object>();
		//留抢病历
		HspLqblInfCustom hspLqblInfCustom = null;
		//疼痛评分
		HspNrsInf hspNrsInf = null;
		//跌倒评估
		HspFallassInf hspFallassInf = null;	
		
		//病历主键不为空
		if(StringUtils.isNotNullAndEmptyByTrim(lqblSeq)) {
			hspLqblInfCustom = hspLqblInfCustomMapper.selectByPrimaryKey(lqblSeq);
		}
		HspemginfCustom hspemginfCustom = hspHlpgbCustomMapper.findEmgInfByEmgSeq(emgSeq);
		//门诊病历为空
		if(null == hspLqblInfCustom){
			hspLqblInfCustom=new HspLqblInfCustom();
			//预检生命体征
			HspMewsInf hspMewsInf=hspMewsInfMapper.selectByPrimaryKey(emgSeq);
			if(null != hspMewsInf){
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
			if(null != hspemginfCustom){
				//血糖
				hspLqblInfCustom.setTgjcXtType(hspemginfCustom.getGlsCod());
				hspLqblInfCustom.setTgjcXtFlg(hspemginfCustom.getGlsType());
				hspLqblInfCustom.setTgjcXt(hspemginfCustom.getGlsNum());
				//血氧
				hspLqblInfCustom.setTgjcCbzy(null == hspemginfCustom.getOxyNbr() ? null : hspemginfCustom.getOxyNbr().toString());
				//入院日期获取
				hspLqblInfCustom.setLqblDat(hspemginfCustom.getEmgDat());
			}
			//为空则获取预检的评分
			hspNrsInf = hspNrsInfCustomMapper.findNrsByEmgSeq(emgSeq); 
			hspFallassInf = hspFallassInfMapper.selectByPrimaryKey(emgSeq);
		}else {
			//不为空获取门诊病历的评分
			hspNrsInf = hspNrsInfMapper.selectByPrimaryKey(hspLqblInfCustom.getNrsSeq());
			hspFallassInf = hspFallassInfMapper.selectByPrimaryKey(hspLqblInfCustom.getFallSeq());
		}
		//如果为空则声明一个新的对象
		if(null == hspemginfCustom) {
			hspemginfCustom = new HspemginfCustom();
			hspemginfCustom.setEmgSeq(emgSeq);
			hspemginfCustom.setCstNam(cstNam);
		}
		//两种情况：1、MPI+JZXH查到数据，2、通过姓名查到数据 但是挂号失败，MPI、JZXH会出现可能为空的情况，要重新赋值
		if(!StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getMpi())) {
			hspemginfCustom.setMpi(mpi);
		}
		if(null == hspemginfCustom.getJzxh()) {
			hspemginfCustom.setJzxh(Long.valueOf(jzxh));
		}
		//获取视图数据
		//检验检查数据(视图查询)
		hspLqblInfCustom.setJyJcList(getAdviceByMpi(hspemginfCustom,"inspection"));
		//医嘱数据(视图查询)
		hspLqblInfCustom.setAdviceList(getAdviceByMpi(hspemginfCustom,"advice"));
		
		//如果疼痛评分为空 则赋予主键
		if(null == hspNrsInf) {
			hspNrsInf = new HspNrsInfCustom();
			hspNrsInf.setXtpgSeq(emgSeq);
		}
		//如果跌倒评估为空 则赋予主键
		if(null == hspFallassInf) {
			hspFallassInf = new HspFallassInf();
			hspFallassInf.setFallassSeq(emgSeq);
		}		
		
		resMap.put("hspemginfCustom", hspemginfCustom);
		resMap.put("hspLqblInfCustom", hspLqblInfCustom);
		resMap.put("hspNrsInfCustom", hspNrsInf);
		resMap.put("hspFallassInfCustom", hspFallassInf);
		return resMap;
	}

	
	
	/**
	 * 医嘱数据获取
	 * @param hspEmgInf
	 * @return
	 */
	public List<HspCfxxInfoCustom> getAdviceByMpi(HspemginfCustom hspemginfCustom,String queryType){
		HspCfxxInfoQueryDto hspCfxxInfoQueryDto = new HspCfxxInfoQueryDto();
		HspCfxxInfoCustom hspCfxxInfoCustom = new HspCfxxInfoCustom();
		hspCfxxInfoCustom.setMpi(hspemginfCustom.getMpi());
		hspCfxxInfoCustom.setSeries(Short.valueOf(hspemginfCustom.getJzxh().toString()));
		hspCfxxInfoQueryDto.setHspCfxxInfoCustom(hspCfxxInfoCustom);
		hspCfxxInfoQueryDto.setQueryType(queryType);
		return hspLqblInfCustomMapper.getAdviceByMpi(hspCfxxInfoQueryDto);
	}
	
	/**
	 * 门急诊保存
	 */
	@Override
	public String submitMzbl(HspLqbljlQueryDto hspLqbljlQueryDto, ActiveUser activeUser) throws Exception {
		//请求来源(HIS_NO_PATIENT:HIS请求病历且未查到患者数据)
		String requestSource = hspLqbljlQueryDto.getRequestSource();
		if("HIS_NO_PATIENT".equals(requestSource)) {
			//新增预检数据
			insertHspemginf_HIS(hspLqbljlQueryDto,activeUser);
		}
		//返回预检号
		return updateMzbl(hspLqbljlQueryDto,activeUser);
	}
	
	/**
	 * HIS查询病历 新增预检数据
	 * @param hspLqbljlQueryDto
	 * @param activeUser
	 * @throws Exception
	 */
	private void insertHspemginf_HIS(HspLqbljlQueryDto hspLqbljlQueryDto, ActiveUser activeUser)throws Exception {
		//保存前再次通过MPI和JZXH查询预检数据
		HspemginfQueryDto hspemginfQueryDto = new HspemginfQueryDto();
		hspemginfQueryDto.setHspemginfCustom(hspLqbljlQueryDto.getHspemginfCustom());
		HspemginfCustom hspemginfCustom = zyyHspemginfService.getEmgInfByMpiAndJzxh(hspemginfQueryDto);
		//未查到则新增预检数据,查到则替换 emgSeq
		if(null == hspemginfCustom) {
			//请求来源赋值为 HIS查询病历且未查到患者数据
			hspemginfQueryDto.setRequestSource("HIS_NO_PATIENT");
			//评分数据赋值
			hspemginfQueryDto.setHspNrsInfCustom(hspLqbljlQueryDto.getHspNrsInfCustom());
			hspemginfQueryDto.setHspFallAssInfCustom(hspLqbljlQueryDto.getHspFallAssInfCustom());
			hspemginfQueryDto.setHspFastInfCustom(new HspFastInfCustom());
			//生命体征赋值
			HspemginfCustom hspemginfCustomMews = hspemginfQueryDto.getHspemginfCustom();
			HspLqblInfCustom hspLqblInfCustom = hspLqbljlQueryDto.getHspLqblInfCustom();
			
			if(StringUtils.isNotNullAndEmptyByTrim(hspLqblInfCustom.getTgjcPulse())) {
				hspemginfCustomMews.setHrtRte(Short.valueOf(hspLqblInfCustom.getTgjcPulse()));
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hspLqblInfCustom.getTgjcXyUp())) {
				hspemginfCustomMews.setSbpUpNbr(Short.valueOf(hspLqblInfCustom.getTgjcXyUp()));
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hspLqblInfCustom.getTgjcXyDown())) {
				hspemginfCustomMews.setSbpDownNbr(Short.valueOf(hspLqblInfCustom.getTgjcXyDown()));
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hspLqblInfCustom.getTgjcHx())) {
				hspemginfCustomMews.setBreNbr(Short.valueOf(hspLqblInfCustom.getTgjcHx()));
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hspLqblInfCustom.getTgjcTw())) {
				hspemginfCustomMews.setTmpNbr(new BigDecimal(hspLqblInfCustom.getTgjcTw()));
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hspLqblInfCustom.getTgjcCbzy())) {
				hspemginfCustomMews.setOxyNbr(Short.valueOf(hspLqblInfCustom.getTgjcCbzy()));
			}
			hspemginfCustomMews.setGlsNum(hspLqblInfCustom.getTgjcXt());
			hspemginfCustomMews.setGlsCod(hspLqblInfCustom.getTgjcXtType());
			hspemginfCustomMews.setGlsType(hspLqblInfCustom.getTgjcXtFlg());
			zyyHspemginfService.insertHspemginf_hzzyy(hspemginfQueryDto, activeUser);
		}else {
			//替换emgSeq
			String emgSeq = hspemginfCustom.getEmgSeq();
			hspLqbljlQueryDto.getHspemginfCustom().setEmgSeq(emgSeq);
			hspLqbljlQueryDto.getHspLqblInfCustom().setEmgSeq(emgSeq);
			hspLqbljlQueryDto.getHspNrsInfCustom().setEmgSeq(emgSeq);
			hspLqbljlQueryDto.getHspFallAssInfCustom().setEmgSeq(emgSeq);
		}
	}
	
	/**
	 * 门急诊病历保存 返回预检号emgSeq
	 */
	public String updateMzbl(HspLqbljlQueryDto hspLqbljlQueryDto, ActiveUser activeUser) throws Exception {
		HspLqblInfCustom hspLqblInfCustom = hspLqbljlQueryDto.getHspLqblInfCustom();
		if(hspLqblInfCustom != null){
			//评分操作
			//疼痛评分
			String xtpgSeq = updateHspNrsInf(hspLqbljlQueryDto,activeUser);
			//跌倒评估
			String fallAssSeq = updateFallAssInf(hspLqbljlQueryDto,activeUser);
			hspLqblInfCustom.setNrsSeq(xtpgSeq);
			hspLqblInfCustom.setFallSeq(fallAssSeq);
			HspLqblInf hspLqblInf = hspLqblInfMapper.selectByPrimaryKey(hspLqblInfCustom.getLqblSeq());
			if(null != hspLqblInf) {
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
				Date createdate = new Date();
				String dateStr = DateUtil.formatDateByFormat(createdate, "yyyyMMdd");
				String lqblSeq= systemConfigService.findSequences("HSPLQBL_SEQ","8",dateStr);
				hspLqblInfCustom.setLqblSeq(lqblSeq);
				hspLqblInfCustom.setCratDat(createdate);
				//如果是自定义签名则清空前端传过来的用户号
				customSign(hspLqblInfCustom);
				hspLqblInfMapper.insert(hspLqblInfCustom);
			}	
			
			//更新病人主诉 病人主诉为空则不更新
			if(StringUtils.isNotNullAndEmptyByTrim(hspLqblInfCustom.getLqblDes())) {
				
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
				
				HspEmgInf  hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(hspLqblInfCustom.getEmgSeq());
				if(hspEmgInf != null){
					hspEmgInf.setPreDgnCod(hspLqblInfCustom.getLqblDes());
					hspEmgInfMapper.updateByPrimaryKey(hspEmgInf);
				}
			}
			//返回预检号
			return hspLqblInfCustom.getEmgSeq();
		}
		return "";
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
	 * 预检登记 疼痛评分更新
	 * @param hspLqbljlQueryDto
	 * @param activeUser
	 * @throws Exception
	 */
	private String updateHspNrsInf(HspLqbljlQueryDto hspLqbljlQueryDto, ActiveUser activeUser) throws Exception {
		HspNrsInfCustom hspNrsInfCustom = hspLqbljlQueryDto.getHspNrsInfCustom();
		Date createdate = new Date();
		String dateStr = DateUtil.formatDateByFormat(createdate, "yyyyMMdd");
		String xtpgSeq= systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
		if(null != hspNrsInfCustom && StringUtils.isNotNullAndEmptyByTrim(hspNrsInfCustom.getXtpgSeq())) {
			//参数校验 如果主键 包含DOC- 说明是病历添加则修改，不包含 DOC- 说明是读取的预检数据 则新增
			if(hspNrsInfCustom.getXtpgSeq().contains("DOC-")) {
				HspNrsInf hspNrsInf = hspNrsInfMapper.selectByPrimaryKey(hspNrsInfCustom.getXtpgSeq());
				if(hspNrsInf!=null){
					hspNrsInf.setNrsMemo(hspNrsInfCustom.getNrsMemo());
					hspNrsInf.setNrsSco(hspNrsInfCustom.getNrsSco());
					hspNrsInf.setNrsTtbw(hspNrsInfCustom.getNrsTtbw());
					hspNrsInf.setNrsTtbwQt(hspNrsInfCustom.getNrsTtbwQt());
					hspNrsInf.setNrsTtsj(hspNrsInfCustom.getNrsTtsj());
					hspNrsInf.setNrsTtxz(hspNrsInfCustom.getNrsTtxz());
					hspNrsInf.setNrsTtxzQt(hspNrsInfCustom.getNrsTtxzQt());
					hspNrsInf.setNrsTtkz(hspNrsInfCustom.getNrsTtkz());
					hspNrsInf.setTtpfTypeCod(hspNrsInfCustom.getTtpfTypeCod());
					hspNrsInf.setTtpfNr(hspNrsInfCustom.getTtpfNr());
					hspNrsInf.setUpdTime(new Date());
					hspNrsInf.setUpdUsrNo(activeUser.getUsrno());
					hspNrsInf.setUpdUsrNme(activeUser.getUsrname());
					hspNrsInfMapper.updateByPrimaryKey(hspNrsInf);
				}
			}else {
				hspNrsInfCustom.setXtpgSeq("DOC-" + xtpgSeq);
				hspNrsInfCustom.setNrsStatus("1");
				hspNrsInfCustom.setNrsDat(new Date());
				hspNrsInfCustom.setCrtUsrNo(activeUser.getUsrno());
				hspNrsInfCustom.setCrtUsrNme(activeUser.getUsrname());
				hspNrsInfCustom.setUpdTime(new Date());
				hspNrsInfCustom.setUpdUsrNo(activeUser.getUsrno());
				hspNrsInfCustom.setUpdUsrNme(activeUser.getUsrname());
				hspNrsInfMapper.insert(hspNrsInfCustom);
			}
		}
		return hspNrsInfCustom.getXtpgSeq();
	}
	
	/**
	 * 预检登记 跌倒评估更新
	 * @param hspLqbljlQueryDto
	 * @param activeUser
	 */
	private String updateFallAssInf(HspLqbljlQueryDto hspLqbljlQueryDto, ActiveUser activeUser) {
		HspFallAssInfCustom hspFallAssInfCustom = hspLqbljlQueryDto.getHspFallAssInfCustom();
		Date createdate = new Date();
		String dateStr = DateUtil.formatDateByFormat(createdate, "yyyyMMdd");
		String fallAssSeq= systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
		if(null != hspFallAssInfCustom && StringUtils.isNotNullAndEmptyByTrim(hspFallAssInfCustom.getFallassSeq())) {
			//参数校验 如果主键 包含DOC- 说明是病历添加则修改，不包含 DOC- 则新增
			if(hspFallAssInfCustom.getFallassSeq().contains("DOC-")) {
				HspFallassInf hspFallassInf = hspFallassInfMapper.selectByPrimaryKey(hspFallAssInfCustom.getFallassSeq());
	    		if(hspFallassInf !=null ) {
	    			hspFallassInf.setFallAssCod(hspFallAssInfCustom.getFallAssCod());
	    			hspFallassInf.setFallAssess(hspFallAssInfCustom.getFallAssess());
	    			hspFallassInf.setFallUsrnam(activeUser.getUsrname());
	    			hspFallassInf.setFallUsrno(activeUser.getUsrno());
	    			hspFallassInf.setFallDate(new Date());
	    			hspFallassInfMapper.updateByPrimaryKey(hspFallassInf);
	    		}
			}else {
				hspFallAssInfCustom.setFallassSeq("DOC-" + fallAssSeq);
				hspFallAssInfCustom.setFallUsrnam(activeUser.getUsrname());
				hspFallAssInfCustom.setFallUsrno(activeUser.getUsrno());
				hspFallAssInfCustom.setFallDate(new Date());
				hspFallassInfMapper.insert(hspFallAssInfCustom);
			}
		}
		return hspFallAssInfCustom.getFallassSeq();
	}

	
	/**
	 * 导入今日留抢病历
	 * @param emgSeq
	 * @return
	 */
	@Override
	public HspLqblInfCustom findLqblByEmgSeq(String emgSeq) throws Exception{
		return hspLqblInfCustomMapper.findLqblByEmgSeq(emgSeq);
	}

	
	/**
	 * 治疗意见刷新
	 * @return
	 * @throws Exception
	 */
	@Override
	public HspLqblInfCustom refreshTreatmentOptions(String mpi, String jzxh) throws Exception {
		HspLqblInfCustom hspLqblInfCustom = new HspLqblInfCustom();
		HspemginfCustom hspemginfCustom = new HspemginfCustom();
		hspemginfCustom.setMpi(mpi);
		hspemginfCustom.setJzxh(Long.valueOf(jzxh));
		//检验检查数据拼接
		hspLqblInfCustom.setJyJcList(getAdviceByMpi(hspemginfCustom,"inspection"));
		//医嘱数据(视图查询)
		hspLqblInfCustom.setAdviceList(getAdviceByMpi(hspemginfCustom,"advice"));
		return hspLqblInfCustom;
	}
	
	/**
	 * @Description 删除门诊病历
	 * @author machaofan
	 * @date 2020年7月24日上午11:43:23
	 * @param lqblSeq
	 * @return
	 * @throws Exception
	 * @return SubmitResultInfo
	 */
	@Override
	public void delMzbl(String lqblSeq) throws Exception{
		hspLqblInfMapper.deleteByPrimaryKey(lqblSeq);
	}
	
	/**
	 * @Description 查看患者是否挂号绑定、是否有留抢状态
	 * @author machaofan
	 * @date 2020年7月24日下午3:21:41
	 * @param emgSeq
	 * @param mpi
	 * @param jzxh
	 * @return
	 * @throws Exception
	 * @return Map<String,Object>
	 */
	@Override
	public Map<String,Object> isRetention(String mpi, String jzxh) throws Exception{
		Map<String,Object> map = new HashMap<String, Object>();
		HspemginfQueryDto hspemginfQueryDto = new HspemginfQueryDto();
		HspemginfCustom hspemginfCustom = new HspemginfCustom();
		hspemginfCustom.setMpi(mpi);
		hspemginfCustom.setJzxh(Long.valueOf(jzxh));
		hspemginfQueryDto.setHspemginfCustom(hspemginfCustom);
		hspemginfCustom = zyyHspemginfService.getEmgInfByMpiAndJzxh(hspemginfQueryDto);
		//等于null 直接返回页面并提示
		if(null == hspemginfCustom) {
			 map.put("status", "prompt");
			 return map;
		}else {
			//不等于null则查询时候包含留抢状态
			HspSqlInfExample hspSqlInfExample = new HspSqlInfExample();
			Criteria criteria = hspSqlInfExample.createCriteria();
			criteria.andEmgSeqEqualTo(hspemginfCustom.getEmgSeq());
			List<HspSqlInf> sqlList = hspSqlInfMapper.selectByExample(hspSqlInfExample);
			//过滤留抢状态的数据
			sqlList = sqlList.stream().filter(e ->"6".equals(e.getSqlStaCod())).collect(Collectors.toList());
			//不为空且大于0，说明有留抢数据
			if(StringUtils.isNotNullAndZero(sqlList)) {
				map.put("status", "yes");
				map.put("hspemginfCustom", hspemginfCustom);
				return map;
			}else {
				map.put("status", "no");
				return map;
			}
		}
	}

	@Override
	public String submitMzbl(String requestSource, HspLqbljlQueryDto hspLqbljlQueryDto, ActiveUser activeUser,HspemginfQueryDto hspemginfQueryDto,HspemginfCustom hspemginfCustomXm) throws Exception {
		//请求来源(HIS_NO_PATIENT:HIS请求病历且未查到患者数据通过名字也未查到数据)
		if("HIS_NO_PATIENT".equals(requestSource)) {
			//新增预检数据
			zyyHspemginfService.insertHspemginf_hzzyy(hspemginfQueryDto, activeUser);
		}else {
			//查到数据的情况下
			//如果 null == hspemginfCustomXm  说明是通过MPI+JZXH查到的，则不做操作，直接保存病历
			//如果 null != hspemginfCustomXm  说明是通过名字查到的，则更新预检表的MPI+JZXH
			if(null != hspemginfCustomXm){
				HspEmgInf hspEmgInf = new HspEmgInf();
				hspEmgInf.setEmgSeq(hspemginfCustomXm.getEmgSeq());
				hspEmgInf.setMpi(hspemginfCustomXm.getMpi());
				hspEmgInf.setJzxh(hspemginfCustomXm.getJzxh());
				hspEmgInfMapper.updateByPrimaryKeySelective(hspEmgInf);
			}
		}
		//返回预检号
		return updateMzbl(hspLqbljlQueryDto,activeUser);
	}
}
