package activetech.basehems.service.impl;

import activetech.base.pojo.domain.Dstappoption;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.service.SystemConfigService;
import activetech.basehems.service.BaseHspemgInfService;
import activetech.basehis.dao.mapper.VHemsRczMapper;
import activetech.basehis.pojo.domain.VHemsRcz;
import activetech.edpc.service.JzbrService;
import activetech.hl7.base.HL7Util;
import activetech.hospital.dao.mapper.*;
import activetech.hospital.pojo.domain.*;
import activetech.hospital.pojo.dto.*;
import activetech.netty.client.NettyClient;
import activetech.netty.util.MethodInvokeMeta;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import activetech.zyyhospital.dao.mapper.*;
import activetech.zyyhospital.pojo.domain.*;
import activetech.zyyhospital.pojo.dto.HspDdfxpgbInfCustom;
import activetech.zyyhospital.pojo.dto.HspFallAssInfCustom;
import activetech.zyyhospital.pojo.dto.HspNrsInfCustom;
import activetech.zyyhospital.pojo.dto.HspPewsckInfCustom;
import ca.uhn.hl7v2.model.v26.message.ACK;
import ca.uhn.hl7v2.model.v26.message.ADT_A01;
import ca.uhn.hl7v2.model.v26.segment.DG1;
import ca.uhn.hl7v2.model.v26.segment.EVN;
import ca.uhn.hl7v2.model.v26.segment.MSH;
import ca.uhn.hl7v2.util.Terser;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 
 * <p>Title:预检分诊基础接口实现类</p>
 * <p>Description:基础实现接口不允许修改</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2017-10-23 下午3:43:27
 *
 */
public class BaseHspemgInfServiceImpl implements BaseHspemgInfService{
	private static Logger logger = Logger.getLogger(BaseHspemgInfServiceImpl.class); 
	@Autowired
	private HspMewsInfMapper hspmewsinfMapper;
	@Autowired
	private HspGcsInfMapper hspgcsinfMapper;
	@Autowired
	private HspCramsInfMapper hspcramsinfMapper;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private HspSqlInfMapper hspsqlinfMapper;
	@Autowired
	private HspEmgInfMapper hspemginfMapper;
	@Autowired
	private HspJbzdInfMapper hspJbzdInfMapper;
	@Autowired
	private HspEmgInfhisMapper hspEmgInfhisMapper;
	@Autowired
	private HspemginfCustomMapper hspemginfCustomMapper;
	@Autowired
	private HspBedInfMapper hspBedInfMapper;
	
	@Autowired
	private HspFastInfMapper hspFastInfMapper;
	@Autowired
	private HspNrsInfCustomMapper hspNrsInfCustomMapper;
	@Autowired
	private HspNrsInfMapper hspNrsInfMapper;
	@Autowired
	private HspPewsckInfMapper hspPewsckInfMapper;
	@Autowired
	private HspFallassInfMapper hspFallassInfMapper;
	@Autowired
	private HspDdfxpgbInfMapper hspDdfxpgbInfMapper;
	@Autowired
	private VHemsRczMapper vHemsRczMapper;
	@Autowired
	private JzbrService jzbrService;
	
	////////////接口开放方法公用方法Start/////////////////////////////////////////////////////////////////////////////

	/**
	 * 预检分诊主方法
	 * @param hspemginfQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@Override
	public HspsqlinfCustom insertBaseHspemginf(
			HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser)
			throws Exception {
		//基本信息赋值
		HspemginfCustom hspemginfCustom=hspemginfQueryDto.getHspemginfCustom();
		//请求来源为 HIS查询病历且未查到患者数据 将分诊护士赋值未 AUTO，且将其他不为空字段，默认赋值
		if("HIS_NO_PATIENT".equals(hspemginfQueryDto.getRequestSource())) {
			VHemsRcz vHemsRczReg = vHemsRczMapper.selectForMz(hspemginfCustom.getMpi(),hspemginfCustom.getJzxh());
			hspemginfCustom.setEmgDat(vHemsRczReg.getGhsj());
			hspemginfCustom.setGrnChl("0");
			hspemginfCustom.setPreUsrNbr("AUTO");	
			hspemginfCustom.setPreUsrNam("AUTO");
			hspemginfCustom.setCstDspCod("5");
		}else {
			hspemginfCustom.setPreUsrNbr(activeUser.getUsrno());	
			hspemginfCustom.setPreUsrNam(activeUser.getUsrname());
		}
		hspemginfCustom.setModUsrNbr(activeUser.getUsrno());
		hspemginfCustom.setModUsrNam(activeUser.getUsrname());

		//1.MEWS评分表组装
		HspmewsinfCustom hspmewsinfCustom=new HspmewsinfCustom();
		hspmewsinfCustom.setEmgSeq(hspemginfCustom.getEmgSeq());
		hspmewsinfCustom.setHrtRte(hspemginfCustom.getHrtRte());
		hspmewsinfCustom.setSbpupNbr(hspemginfCustom.getSbpUpNbr());
		hspmewsinfCustom.setSbpdownNbr(hspemginfCustom.getSbpDownNbr());
		hspmewsinfCustom.setBreNbr(hspemginfCustom.getBreNbr());
		hspmewsinfCustom.setTmpNbr(hspemginfCustom.getTmpNbr());
		hspmewsinfCustom.setSenRctCod(hspemginfCustom.getSenRctCod());
		hspmewsinfCustom.setTotSco(hspemginfCustom.getMewsTotSco());
		hspmewsinfCustom.setChkLvlCod(hspemginfCustom.getChkLvlCod());
		hspmewsinfCustom.setModLvlCod(hspemginfCustom.getModLvlCod());
		hspmewsinfCustom.setModLvlDes(hspemginfCustom.getModLvlDes());
		insertHspmewsinfCus(hspmewsinfCustom,hspemginfCustom);

		//2.GCS意识评分表组装
		HspgcsinfCustom hspgcsinfCustom=new HspgcsinfCustom();
		hspgcsinfCustom.setEmgSeq(hspemginfCustom.getEmgSeq());
		hspgcsinfCustom.setGcsSeq(hspemginfCustom.getEmgSeq());
		hspgcsinfCustom.setCratDat(new Date());
		hspgcsinfCustom.setEyeRctCod(hspemginfCustom.getEyeRctCod());
		hspgcsinfCustom.setLanRctCod(hspemginfCustom.getLanRctCod());
		hspgcsinfCustom.setActRctCod(hspemginfCustom.getActRctCod());
		hspgcsinfCustom.setTotSco(hspemginfCustom.getGcsTotSco());
		insertHspgcsinfCus(hspgcsinfCustom,hspemginfCustom);

		//3.CRAMS创伤评分表组装
		HspcramsinfCustom hspcramsinfCustom=new HspcramsinfCustom();
		hspcramsinfCustom.setEmgSeq(hspemginfCustom.getEmgSeq());
		hspcramsinfCustom.setCirLvlCod(hspemginfCustom.getCirLvlCod());
		hspcramsinfCustom.setBreLvlCod(hspemginfCustom.getBreLvlCod());
		hspcramsinfCustom.setBdyLvlCod(hspemginfCustom.getBdyLvlCod());
		hspcramsinfCustom.setSptLvlCod(hspemginfCustom.getSptLvlCod());
		hspcramsinfCustom.setLanLvlCod(hspemginfCustom.getLanLvlCod());
		hspcramsinfCustom.setTotSco(hspemginfCustom.getCramsTotSco());
		insertHspcramsinfCus(hspcramsinfCustom,hspemginfCustom);
		
		//4.新增pews评分
		submitPewsck(hspemginfQueryDto);
		
		//5.转归表组装
		HspsqlinfCustom hspsqlinfCustom=new HspsqlinfCustom();
		hspsqlinfCustom.setEmgSeq(hspemginfCustom.getEmgSeq());
		hspsqlinfCustom.setSqlNurNbr(activeUser.getUsrno());
		hspsqlinfCustom.setSqlNurNam(activeUser.getUsrname());
		hspsqlinfCustom.setSqlStaCod(hspemginfCustom.getCstDspCod());
		hspsqlinfCustom.setSqlDepCod(hspemginfCustom.getBedid());//只放床位
		hspsqlinfCustom.setSqlDctNbr(hspemginfCustom.getSqlDctNbr());
		hspsqlinfCustom.setSqlDctNam(hspemginfCustom.getSqlDctNam());
		hspsqlinfCustom.setSqlDat(hspemginfCustom.getEmgDat());
		insertHspsqlinfCus(hspsqlinfCustom);
		
		//6.预检主表组装
		//当病人去向是留抢时，留观号赋值
		if("6".equals(hspemginfCustom.getCstDspCod())){
			String observationCode =systemConfigService.findSequences("HSPEMGINF_OBSERVATIONCODE","6","L");
			hspemginfCustom.setObservationCode(observationCode);
		}
		hspemginfCustom.setSqlSeq(hspsqlinfCustom.getSqlSeq());
		hspemginfCustom.setFirstsqlseq(hspsqlinfCustom.getSqlSeq());//存放首次转归编号
		insertHspemginfCus(hspemginfCustom);
		
		//7.床位绑定emgSeq
		if(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getBedid())){
			HspBedInf hspBedInf=new HspBedInf();
			hspBedInf.setBedid(hspemginfCustom.getBedid());
			hspBedInf.setEmgSeq(hspemginfCustom.getEmgSeq());
			hspBedInf.setUpdDat(new Date());
			hspBedInf.setUpdNbr(activeUser.getUsrno());
			hspBedInf.setUpdNam(activeUser.getUsrname());
            hspBedInfMapper.updateByPrimaryKeySelective(hspBedInf);
		}
		//8.诊断信息表组装
		HspJbzdInfCustom hspJbzdInfCustomNew  = new HspJbzdInfCustom();
		hspJbzdInfCustomNew.setJbzdComm(hspemginfCustom.getPreDgnCod());
		hspJbzdInfCustomNew.setJbzdSeq(UUIDBuild.getUUID());
		hspJbzdInfCustomNew.setHzzdDat(new Date());
		hspJbzdInfCustomNew.setHzzdNurNbr(activeUser.getUsrno());
		hspJbzdInfCustomNew.setJbzdType("0");
		hspJbzdInfCustomNew.setEmgSeq(hspemginfCustom.getEmgSeq());
		hspJbzdInfMapper.insert(hspJbzdInfCustomNew);
		
		//9.新增卒中评分表
		HspFastInfCustom hspFastInfCustom=hspemginfQueryDto.getHspFastInfCustom();
		hspFastInfCustom.setEmgSeq(hspemginfCustom.getEmgSeq());
		insertZyyHspFastInf(hspFastInfCustom, activeUser);
		//10.NRS 评分
		submitHspnrsinfCus(hspemginfQueryDto,activeUser);
		//11.Morse评分
		submitHspDdfxpgbInf(hspemginfQueryDto,activeUser);
		//12.跌倒评分
		submitHspFallassinfCus(hspemginfQueryDto,activeUser);

		jzbrService.enterDbzl(hspemginfQueryDto,activeUser);

		return hspsqlinfCustom;
	}
		
	/**
	 * 预检分诊修改/转归 公用方法
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public void updateBaseHspemginf(
			HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser) throws Exception {
		HspemginfCustom hspemginfCustom = hspemginfQueryDto.getHspemginfCustom();
		//如果是AUTO则更新为当前登录用户 （AUTO为HIS门诊病历通过MPI(病历号)和JZXH(就诊次数)未查到数据，新增预检数据时默认赋值的）
		if("AUTO".equals(hspemginfCustom.getPreUsrNam())) {
			hspemginfCustom.setPreUsrNam(activeUser.getUsrname());
			hspemginfCustom.setPreUsrNbr(activeUser.getUsrno());
		}
		
		//1.初步印象信息更新
		HspJbzdInfExample hspJbzdInfExample = new HspJbzdInfExample();
		HspJbzdInfExample.Criteria criteria = hspJbzdInfExample.createCriteria();
		criteria.andEmgSeqEqualTo(hspemginfCustom.getEmgSeq());
		criteria.andJbzdTypeEqualTo("0");
		hspJbzdInfMapper.deleteByExample(hspJbzdInfExample);
		
		HspJbzdInfCustom hspJbzdInfCustomNew  = new HspJbzdInfCustom();
		hspJbzdInfCustomNew.setJbzdComm(hspemginfCustom.getPreDgnCod());
		hspJbzdInfCustomNew.setJbzdSeq(UUIDBuild.getUUID());
		hspJbzdInfCustomNew.setHzzdDat(new Date());
		hspJbzdInfCustomNew.setHzzdNurNbr(activeUser.getUsrno());
		hspJbzdInfCustomNew.setJbzdType("0");
		hspJbzdInfCustomNew.setEmgSeq(hspemginfCustom.getEmgSeq());
		hspJbzdInfMapper.insert(hspJbzdInfCustomNew);

		//2.CRAMS创伤评分表修改组装
		HspcramsinfCustom hspcramsinfCustom=new HspcramsinfCustom();
		hspcramsinfCustom.setEmgSeq(hspemginfCustom.getEmgSeq());
		hspcramsinfCustom.setCirLvlCod(hspemginfCustom.getCirLvlCod());
		hspcramsinfCustom.setBreLvlCod(hspemginfCustom.getBreLvlCod());
		hspcramsinfCustom.setBdyLvlCod(hspemginfCustom.getBdyLvlCod());
		hspcramsinfCustom.setSptLvlCod(hspemginfCustom.getSptLvlCod());
		hspcramsinfCustom.setLanLvlCod(hspemginfCustom.getLanLvlCod());
		hspcramsinfCustom.setTotSco(hspemginfCustom.getCramsTotSco());
		hspcramsinfMapper.updateByPrimaryKey(hspcramsinfCustom);

		//3.MEWS评分表修改组装
		HspmewsinfCustom hspmewsinfCustom=new HspmewsinfCustom();
		hspmewsinfCustom.setEmgSeq(hspemginfCustom.getEmgSeq());
		hspmewsinfCustom.setHrtRte(hspemginfCustom.getHrtRte());
		hspmewsinfCustom.setSbpupNbr(hspemginfCustom.getSbpUpNbr());
		hspmewsinfCustom.setSbpdownNbr(hspemginfCustom.getSbpDownNbr());
		hspmewsinfCustom.setBreNbr(hspemginfCustom.getBreNbr());
		hspmewsinfCustom.setTmpNbr(hspemginfCustom.getTmpNbr());
		hspmewsinfCustom.setSenRctCod(hspemginfCustom.getSenRctCod());
		hspmewsinfCustom.setTotSco(hspemginfCustom.getMewsTotSco());
		hspmewsinfCustom.setChkLvlCod(hspemginfCustom.getChkLvlCod());
		hspmewsinfCustom.setModLvlCod(hspemginfCustom.getModLvlCod());
		hspmewsinfCustom.setModLvlDes(hspemginfCustom.getModLvlDes());
		hspmewsinfMapper.updateByPrimaryKey(hspmewsinfCustom);

		//4.GCS意识评分表修改组装
		HspgcsinfCustom hspgcsinfCustom=new HspgcsinfCustom();
		hspgcsinfCustom.setEmgSeq(hspemginfCustom.getEmgSeq());
		hspgcsinfCustom.setGcsSeq(hspemginfCustom.getEmgSeq());
		hspgcsinfCustom.setCratDat(new Date());
		hspgcsinfCustom.setEyeRctCod(hspemginfCustom.getEyeRctCod());
		hspgcsinfCustom.setLanRctCod(hspemginfCustom.getLanRctCod());
		hspgcsinfCustom.setActRctCod(hspemginfCustom.getActRctCod());
		hspgcsinfCustom.setTotSco(hspemginfCustom.getGcsTotSco());
		hspgcsinfMapper.updateByPrimaryKey(hspgcsinfCustom);

		//6.卒中信息绑定
		HspFastInfCustom hspFastInfCustom=hspemginfQueryDto.getHspFastInfCustom();
		hspFastInfCustom.setEmgSeq(hspemginfCustom.getEmgSeq());
		insertZyyHspFastInf(hspFastInfCustom, activeUser);
		
		//7.NRS疼痛评分
		submitHspnrsinfCus(hspemginfQueryDto,activeUser);
		
		//产科pews评分提交
		submitPewsck(hspemginfQueryDto);
		
		//Morse评分
		submitHspDdfxpgbInf(hspemginfQueryDto,activeUser);
		
		//跌倒评分
		submitHspFallassinfCus(hspemginfQueryDto,activeUser);
		
		//8.转归表、床位、主表 操作
		 //emg数据库现有数据
		 HspEmgInf hspEmgInf=hspemginfMapper.selectByPrimaryKey(hspemginfCustom.getEmgSeq());
		 hspemginfCustom.setAdtA01(hspEmgInf.getAdtA01());
		 hspemginfCustom.setGhbz(hspEmgInf.getGhbz());
		 if(hspemginfCustom.getJzxh() == null && hspEmgInf.getJzxh() != null){
			 hspemginfCustom.setJzxh(hspEmgInf.getJzxh());
			 hspemginfCustom.setMpi(hspEmgInf.getMpi());
		 }
		 /*if(StringUtils.isNotNullAndEmptyByTrim(hspEmgInf.getAdtA01())&& hspEmgInf.getEmgDepCod().equals(hspemginfCustom.getEmgDepCod())){
			 try {
				 ADT_A01 adt_A01 = HL7Util.hl7Text2Msg(hspEmgInf.getAdtA01(), ADT_A01.class);
				 insertGhxxAndBackYj(adt_A01, hspemginfCustom);
			} catch (Exception e) {
				logger.info("等级回传出错",e);
				try {
					ADT_A01 adt_A01 = HL7Util.hl7Text2Msg(hspEmgInf.getAdtA01(), ADT_A01.class);
					 insertGhxxAndBackYj(adt_A01, hspemginfCustom);
				} catch (Exception e2) {
					logger.info("等级回传出错2",e2);
				}
			}
		 }*/
		//查询是否有开启留观室
		Dstappoption dstappoption = systemConfigService.findAppoptionByOptkey("LG_BED");//0 没开启 1 开启
		
		//当病人去向是留抢时，留观号赋值
		if("6".equals(hspemginfCustom.getCstDspCod()) && !StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getObservationCode())){
			String observationCode =systemConfigService.findSequences("HSPEMGINF_OBSERVATIONCODE","6","L");
			hspemginfCustom.setObservationCode(observationCode);
		}
		//1 开启留观室
		if(dstappoption.getOptvalue().equals("1")){
			//判断是否绑定群体事件
			checkQtsj(hspemginfCustom,hspEmgInf);
			hspemginfMapper.updateByPrimaryKey(hspemginfCustom);
			updateHspSqlinfo(hspemginfCustom);
			//没做过转归
			if(hspemginfCustom.getFirstsqlseq().equals(hspemginfCustom.getSqlSeq())){
				//首诊“留抢”或者“留观”修改成其他去向 
				if(("6".equals(hspEmgInf.getCstDspCod()) || "11".equals(hspEmgInf.getCstDspCod()) ) &&
						(!"6".equals(hspemginfCustom.getCstDspCod()) 
								&& !"11".equals(hspemginfCustom.getCstDspCod())) ){
					//床位清空
                    clearBed(hspemginfCustom);
                    String mpi = hspemginfCustom.getMpi();
					Long jzxh = hspemginfCustom.getJzxh();
                    if(StringUtils.isNotNullAndEmptyByTrim(mpi) && jzxh !=null){
                		sendLgxx("2", mpi, jzxh);
                	}
				}
				//首诊任何去向修改成“留抢”或者留观
				else if(("6".equals(hspemginfCustom.getCstDspCod()) 
								|| "11".equals(hspemginfCustom.getCstDspCod())) ){
					//清空和重新绑定床位
					clearAndreBindBed(hspemginfCustom.getEmgSeq(),hspemginfCustom.getBedid());
					String mpi = hspemginfCustom.getMpi();
					Long jzxh = hspemginfCustom.getJzxh();
                    if(StringUtils.isNotNullAndEmptyByTrim(mpi) && jzxh !=null){
                		sendLgxx("1", mpi, jzxh);
                	}
				}
			}
		}else{
			//判断是否绑定群体事件
			checkQtsj(hspemginfCustom,hspEmgInf);
			//0 没开启 留观室
			hspemginfMapper.updateByPrimaryKey(hspemginfCustom);
			updateHspSqlinfo(hspemginfCustom);
			//没做过转归
			if(hspemginfCustom.getFirstsqlseq().equals(hspemginfCustom.getSqlSeq())){
				//首诊“留抢”修改成其他去向
				if("6".equals(hspEmgInf.getCstDspCod()) && 
						!"6".equals(hspemginfQueryDto.getHspemginfCustom().getCstDspCod()) ){
					//emg床位清空 ； sql修改；bed 清空
					//emgbed 、bedid都为空
                     //床位清空
                    clearBed(hspemginfCustom);
                    clearBed(hspemginfCustom);
                    String mpi = hspemginfCustom.getMpi();
					Long jzxh = hspemginfCustom.getJzxh();
                    if(StringUtils.isNotNullAndEmptyByTrim(mpi) && jzxh !=null){
                		sendLgxx("2", mpi, jzxh);
                	}
				}
				//首诊任何去向修改成“留抢”
				else if("6".equals(hspemginfQueryDto.getHspemginfCustom().getCstDspCod()) ){
					//清空和重新绑定床位
					clearAndreBindBed(hspemginfCustom.getEmgSeq(),hspemginfCustom.getBedid());
					String mpi = hspemginfCustom.getMpi();
					Long jzxh = hspemginfCustom.getJzxh();
                    if(StringUtils.isNotNullAndEmptyByTrim(mpi) && jzxh !=null){
                		sendLgxx("1", mpi, jzxh);
                	}
				}
			}
		}
	}
	
	private void sendLgxx(String type,String mpi,Long jzxh) throws Exception {
		//TODO 删除webService接口
	}
	
	public String insertGhxxAndBackYj(ADT_A01 adt_A01,HspemginfCustom hspemginfCustom) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		adt_A01.getINSURANCE().clear();
		hspemginfCustom.setAdtA01(adt_A01.toString());
		MSH msh = adt_A01.getMSH();
		HL7Util.getMsh(msh, "ESB", "ADT", "A01", "ADT_A01");
		EVN evn = adt_A01.getEVN();
        evn.getEvn1_EventTypeCode().setValue("FZDJ");
        evn.getEvn2_RecordedDateTime().setValue(sdf.format(hspemginfCustom.getEmgDat()));
        evn.getEvn5_OperatorID(0).getXcn1_IDNumber().setValue(hspemginfCustom.getPreUsrNbr());
        evn.getEvn5_OperatorID(0).getXcn2_FamilyName().getFn1_Surname().setValue(hspemginfCustom.getPreDgnCod());
        Terser terser = new Terser(adt_A01);
		terser.set("/PID-3",null);
		terser.set("/PID-3-5",null);
		terser.set("/PID-3-10",null);
		terser.set("/PID-3",null);
		terser.set("/PV1-3-2",null);
		terser.set("/PV1-3-10",null);
		terser.set("/PV1-3-10-2",null);
		terser.set("/PV1-5",null);
		terser.set("/PV1-10",null);
		terser.set("/PV1-14",null);
		terser.set("/PV1-16",null);
		terser.set("/PV1-21",null);
		terser.set("/PV1-50",null);
		terser.set("/PV1-51",null);
		DG1 dg1 = adt_A01.getDG1();
        dg1.getDg11_SetIDDG1().setValue("1");
        dg1.getDg13_DiagnosisCodeDG1().getCwe1_Identifier().setValue("SN");
        dg1.getDg16_DiagnosisType().setValue(Integer.parseInt(hspemginfCustom.getEmgDepCod()) + 1+"");
        dg1.getDg17_MajorDiagnosticCategory().getCne1_Identifier().setValue(hspemginfCustom.getEmgFkCod()); //分诊科室
        dg1.getDg18_DiagnosticRelatedGroup().getCne1_Identifier().setValue(hspemginfCustom.getArvChlCod()); //加字段前端提交
        dg1.getDg19_DRGApprovalIndicator().setValue(hspemginfCustom.getTmpNbr()+"");
        dg1.getDg110_DRGGrouperReviewCode().setValue(hspemginfCustom.getHrtRte()+"");
        dg1.getDg111_OutlierType().getCwe1_Identifier().setValue(hspemginfCustom.getBreNbr()+"");
        String sbp = "";
        if(hspemginfCustom.getSbpUpNbr() != null){
        	sbp = hspemginfCustom.getSbpUpNbr().toString();
        }
        if(hspemginfCustom.getSbpDownNbr() != null){
        	sbp += "."+hspemginfCustom.getSbpDownNbr();
        }
        dg1.getDg112_OutlierDays().setValue(sbp);
        dg1.getDg113_OutlierCost().getCp1_Price().getMo1_Quantity().setValue(hspemginfCustom.getOxyNbr()+"");
        dg1.getDg115_DiagnosisPriority().setValue(hspemginfCustom.getGlsNum()); //预检时无血糖
        dg1.getDg116_DiagnosingClinician(0).getXcn1_IDNumber().setValue(hspemginfCustom.getNrsSco());
        dg1.getDg117_DiagnosisClassification().setValue(hspemginfCustom.getSenRctCod()); //是否是清醒程度
        dg1.getDg118_ConfidentialIndicator().setValue(hspemginfCustom.getCramsTotSco()+""); //
        dg1.getDg119_AttestationDateTime().setValue(sdf.format(hspemginfCustom.getEmgDat()));
        dg1.getDg120_DiagnosisIdentifier().getEi1_EntityIdentifier().setValue(hspemginfCustom.getPreUsrNbr());
        dg1.getDg121_DiagnosisActionCode().setValue(hspemginfCustom.getPreUsrNam());
        
        NettyClient client = new NettyClient("ensemble.zjyy.com", 10019);
//  NettyClient client = new NettyClient("192.16.2.141", 10003);
		MethodInvokeMeta cmd = new MethodInvokeMeta();
		logger.info("传参："+adt_A01.toString());
        cmd.setArgs(new Object[] {adt_A01});
        Object reVal = client.remoteCall(cmd, 0);
        ACK ack = HL7Util.hl7Text2Msg(reVal.toString(), ACK.class);
        return ack.getMSA().getMsa1_AcknowledgmentCode().getValue();
	}
	
	 /**
	  * 修改转归内部子方法
	  * @param hspemginfCustom
	  */
	 private void updateHspSqlinfo(HspemginfCustom hspemginfCustom) {
		 	HspSqlInf hspsqlinf = hspsqlinfMapper.selectByPrimaryKey(hspemginfCustom.getSqlSeq());
		 	hspsqlinf.setEmgSeq(hspemginfCustom.getEmgSeq());
			hspsqlinf.setSqlSeq(hspemginfCustom.getFirstsqlseq());
			hspsqlinf.setRegDat(new Date());
			hspsqlinf.setSqlDat(hspemginfCustom.getEmgDat());
			hspsqlinf.setSqlStaCod(hspemginfCustom.getCstDspCod());
			hspsqlinf.setSqlDepCod(hspemginfCustom.getBedid());
			hspsqlinf.setSqlNurNbr(hspemginfCustom.getModUsrNbr());
			hspsqlinf.setSqlNurNam(hspemginfCustom.getModUsrNam());
			hspsqlinfMapper.updateByPrimaryKey(hspsqlinf);
		
	}


	/**
     * 新增转归信息表主方法
     * @param hspsqlinfCustom
     * @throws Exception
     */
    public void insertHspsqlinfCus(HspsqlinfCustom hspsqlinfCustom)throws Exception{
    	//生成转归号并赋值
		Date regdat=new Date();
		String dateStr = DateUtil.formatDateByFormat(regdat, "yyyyMMdd");
		String sqlSeq=systemConfigService.findSequences("HSPSQLINF_SQLSEQ","8",dateStr);
    	hspsqlinfCustom.setSqlSeq(sqlSeq);
    	//赋值登记日期与时间 转归时间 装归日期
    	hspsqlinfCustom.setRegDat(regdat);
    	if(hspsqlinfCustom.getSqlDat() == null){
    		hspsqlinfCustom.setSqlDat(regdat);
    	}
		//数据操作
		HspEmgInf hspEmgInf =hspemginfMapper.selectByPrimaryKey(hspsqlinfCustom.getEmgSeq());
		if(hspEmgInf != null ){
			hspEmgInf.setSqlSeq(sqlSeq);
			hspemginfMapper.updateByPrimaryKey(hspEmgInf);
		}
		hspsqlinfMapper.insert(hspsqlinfCustom);
    }
    
	/**
	 * 更新转归表-离抢登记用
	 * @param hspsqlinfCustomZG
	 */
	public void updateHspsqlinf(HspsqlinfCustom hspsqlinfCustomZG) {
		HspSqlInf hspsqlinf=hspsqlinfMapper.selectByPrimaryKey(hspsqlinfCustomZG.getSqlSeq());
		hspsqlinf.setRegDat(new Date());
		hspsqlinf.setSqlDat(hspsqlinfCustomZG.getSqlDat());
		hspsqlinf.setSqlStaCod(hspsqlinfCustomZG.getSqlStaCod());
		hspsqlinf.setSqlDepCod(hspsqlinfCustomZG.getSqlDepCod());
		hspsqlinf.setSqlNurNbr(hspsqlinfCustomZG.getSqlNurNbr());
		hspsqlinf.setSqlNurNam(hspsqlinfCustomZG.getSqlNurNam());
		hspsqlinf.setSqlDes(hspsqlinfCustomZG.getSqlDes());
		hspsqlinfMapper.updateByPrimaryKey(hspsqlinf);
	}
	
	/**
	 * 新增HIS表
	 * @param hspemginfCustom
	 * @param activeUser
	 */
	public void insertEmgHis(HspEmgInf hspemginf_del,String emgSeq,ActiveUser activeUser,String opertype,String opermemo){
			//his表赋值
			HspEmgInfhis hspEmgInfHis = new HspEmgInfhis();
			BeanUtils.copyProperties(hspemginf_del, hspEmgInfHis);
			hspEmgInfHis.setOpertype(opertype);
			hspEmgInfHis.setOpermemo(opermemo);
			hspEmgInfHis.setUsrno(activeUser.getUsrno());
			hspEmgInfHis.setUsrname(activeUser.getUsrname());
			hspEmgInfhisMapper.insert(hspEmgInfHis);
	}
	
	/**
	 * 获取预检分诊表基本信息
	 * @param emgSeq
	 * @return
	 */
	public HspemginfCustom findHspemginfCustom(String emgSeq) {
		HspemginfCustom hspemginfCustom = hspemginfCustomMapper.findHspemginfCustom(emgSeq);
		return hspemginfCustom;
	}
	
	/**
	 * 根据预检号获取急诊表原始信息
	 * @param emgSeq
	 * @return
	 */
	public HspEmgInf getHspemginfByEmgseq(String emgSeq){
		return hspemginfMapper.selectByPrimaryKey(emgSeq);
	}
	
	////////////接口开放方法公用方法End/////////////////////////////////////////////////////////////////////////////

    
	////////////子方法Start/////////////////////////////////////////////////////////////////////////////
    /**
     * Mews评分新增
     * @param hspmewsinfCustom
     * @param hspemginfCustom
     * @throws Exception
     */
    public void insertHspmewsinfCus(HspmewsinfCustom hspmewsinfCustom,HspemginfCustom hspemginfCustom)throws Exception{
		//数据操作
		hspmewsinfMapper.insert(hspmewsinfCustom);
    }
    
    /**
     * 新增GCS意识评分表
     * @param hspgcsinfCustom
     * @param hspemginfCustom
     * @throws Exception
     */
    public void insertHspgcsinfCus(HspgcsinfCustom hspgcsinfCustom,HspemginfCustom hspemginfCustom)throws Exception{
		//数据操作
		hspgcsinfMapper.insert(hspgcsinfCustom);
    }
    
    /**
     * 新增CRAMS评分
     * @param hspcramsinfCustom
     * @param hspemginfCustom
     * @throws Exception
     */
    public void insertHspcramsinfCus(HspcramsinfCustom hspcramsinfCustom,HspemginfCustom hspemginfCustom)throws Exception{
		//数据操作
		hspcramsinfMapper.insert(hspcramsinfCustom);
    }
    
	/**
	 * 新增急诊记录表
	 * @param hspemginfCustom
	 * @throws Exception
	 */
    public void insertHspemginfCus(HspemginfCustom hspemginfCustom)throws Exception{
    	checkQtsj(hspemginfCustom,null);
		//数据操作
		hspemginfMapper.insertSelective(hspemginfCustom);  
    }
    
    
    /**
     * 提交NRS疼痛评分表
     * @param activeUser 
     * @param hspcramsinfCustom
     * @throws Exception
     */
    private void submitHspnrsinfCus(HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser)throws Exception{
    	//参数校验
    	HspNrsInfCustom hspNrsInfCustom=hspemginfQueryDto.getHspNrsInfCustom();
		if(hspNrsInfCustom!=null){
			HspNrsInfCustom hspNrsInf=hspNrsInfCustomMapper.findNrsByEmgSeq(hspemginfQueryDto.getHspemginfCustom().getEmgSeq());
			if(hspNrsInf!=null){
				hspNrsInf.setNrsMemo(hspNrsInfCustom.getNrsMemo());
				hspNrsInf.setNrsSco(hspNrsInfCustom.getNrsSco());
				hspNrsInf.setNrsTtbw(hspNrsInfCustom.getNrsTtbw());
				hspNrsInf.setNrsTtbwQt(hspNrsInfCustom.getNrsTtbwQt());
				hspNrsInf.setNrsTtsj(hspNrsInfCustom.getNrsTtsj());
				hspNrsInf.setNrsTtxz(hspNrsInfCustom.getNrsTtxz());
				hspNrsInf.setNrsTtxzQt(hspNrsInfCustom.getNrsTtxzQt());
				hspNrsInf.setNrsTtkz(hspNrsInfCustom.getNrsTtkz());
				hspNrsInf.setNrsDat(new Date());
				hspNrsInf.setTtpfTypeCod(hspNrsInfCustom.getTtpfTypeCod());
				hspNrsInf.setTtpfNr(hspNrsInfCustom.getTtpfNr());
				hspNrsInfMapper.updateByPrimaryKey(hspNrsInf);
			}else{
				hspNrsInfCustom.setXtpgSeq(hspemginfQueryDto.getHspemginfCustom().getEmgSeq());
				hspNrsInfCustom.setEmgSeq(hspemginfQueryDto.getHspemginfCustom().getEmgSeq());
				hspNrsInfCustom.setCrtUsrNme(activeUser.getUsrname());
				hspNrsInfCustom.setNrsDat(new Date());
				hspNrsInfCustom.setNrsStatus("0");
				hspNrsInfMapper.insert(hspNrsInfCustom);
			}
		}
    }
    
    /**
     * 跌倒评分表提交
     * @param hspemginfQueryDto
     */
    private void submitHspFallassinfCus(HspemginfQueryDto hspemginfQueryDto,ActiveUser activeUser){
    	HspFallAssInfCustom hspFallAssInfCustom = hspemginfQueryDto.getHspFallAssInfCustom();
    	if(hspFallAssInfCustom != null) {
    		HspFallassInf hspFallassInf = hspFallassInfMapper.selectByPrimaryKey(hspemginfQueryDto.getHspemginfCustom().getEmgSeq());
    		if(hspFallassInf !=null ) {
    			hspFallassInf.setFallAssCod(hspFallAssInfCustom.getFallAssCod());
    			hspFallassInf.setFallAssess(hspFallAssInfCustom.getFallAssess());
    			hspFallassInf.setFallUsrnam(activeUser.getUsrname());
    			hspFallassInf.setFallUsrno(activeUser.getUsrno());
    			hspFallassInf.setFallDate(new Date());
    			hspFallassInfMapper.updateByPrimaryKey(hspFallassInf);
    		}else {
    			hspFallAssInfCustom.setFallassSeq(hspemginfQueryDto.getHspemginfCustom().getEmgSeq());
    			hspFallAssInfCustom.setEmgSeq(hspemginfQueryDto.getHspemginfCustom().getEmgSeq());
    			hspFallAssInfCustom.setFallUsrnam(activeUser.getUsrname());
    			hspFallAssInfCustom.setFallUsrno(activeUser.getUsrno());
    			hspFallAssInfCustom.setFallDate(new Date());
    			hspFallassInfMapper.insert(hspFallAssInfCustom);
    		}
    	}
    }
    
    /**
     * Morse跌倒评分表提交
     * @param hspemginfQueryDto
     */
    private void submitHspDdfxpgbInf(HspemginfQueryDto hspemginfQueryDto,ActiveUser activeUser){
		HspDdfxpgbInfCustom hspDdfxpgbInfCustom = hspemginfQueryDto.getHspDdfxpgbInfCustom();
		if(hspDdfxpgbInfCustom != null){
			if (StringUtils.isNotNullAndEmptyByTrim(hspDdfxpgbInfCustom.getDdfxpgbSeq())) {
				HspDdfxpgbInf hspDdfxpgbInf = hspDdfxpgbInfMapper.selectByPrimaryKey(hspDdfxpgbInfCustom.getDdfxpgbSeq());
				if (hspDdfxpgbInf != null) {
					hspDdfxpgbInfCustom.setCretDat(hspDdfxpgbInf.getCretDat());
					hspDdfxpgbInfCustom.setCrtUsrNo(hspDdfxpgbInf.getCrtUsrNo());
					hspDdfxpgbInfCustom.setCrtUsrNme(hspDdfxpgbInf.getCrtUsrNme());
					hspDdfxpgbInfCustom.setUpdUsrNo(activeUser.getUsrno());
					hspDdfxpgbInfCustom.setUpdUsrNme(activeUser.getUsrname());
					hspDdfxpgbInfMapper.updateByPrimaryKey(hspDdfxpgbInfCustom);
				}
			}else {
				hspDdfxpgbInfCustom.setDdfxpgbSeq(hspDdfxpgbInfCustom.getEmgSeq());
				hspDdfxpgbInfCustom.setCretDat(new Date());
				hspDdfxpgbInfCustom.setCrtUsrNo(activeUser.getUsrno());
				hspDdfxpgbInfCustom.setCrtUsrNme(activeUser.getUsrname());
				hspDdfxpgbInfMapper.insertSelective(hspDdfxpgbInfCustom);
			}
		}
	}
    
	/**
	 * 中医院hsp_fast_inf入库
	 * @param hspemginfQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	private void insertZyyHspFastInf(
			HspFastInfCustom hspFastInfCustom, ActiveUser activeUser)
			throws Exception {
		HspFastInf hspFastInf=hspFastInfMapper.selectByPrimaryKey(hspFastInfCustom.getEmgSeq());
		if(hspFastInf!=null){
			hspFastInf.setCzFlag(hspFastInfCustom.getCzFlag());
			hspFastInf.setMtCod(hspFastInfCustom.getMtCod());
			hspFastInf.setSzthCod(hspFastInfCustom.getSzthCod());
			hspFastInf.setWlCod(hspFastInfCustom.getWlCod());
			hspFastInf.setFastupdDat(new Date());
			hspFastInf.setFastupdNbr(activeUser.getUsrname());
			hspFastInfMapper.updateByPrimaryKey(hspFastInf);
		}else{
			hspFastInfCustom.setFastcrtDat(new Date());
			hspFastInfCustom.setFastcrtNbr(activeUser.getUsrname());
			hspFastInfMapper.insert(hspFastInfCustom);
		}
	}
	
	private void submitPewsck(HspemginfQueryDto hspemginfQueryDto){
		HspPewsckInfCustom hspPewsckInfCustom=hspemginfQueryDto.getHspPewsckInfCustom();
		String emgSeq=hspemginfQueryDto.getHspemginfCustom().getEmgSeq();
		HspPewsckInf hspPewsckInf=hspPewsckInfMapper.selectByPrimaryKey(emgSeq);
		if(hspPewsckInfCustom!=null){
			if(hspPewsckInf!=null){
				hspPewsckInfCustom.setEmgSeq(emgSeq);
				hspPewsckInfMapper.updateByPrimaryKey(hspPewsckInfCustom);
			}else{
				hspPewsckInfCustom.setEmgSeq(emgSeq);
				hspPewsckInfMapper.insert(hspPewsckInfCustom);
			}
		}
		
	}


	@Override
	public void clearBed(HspemginfCustom hspemginfCustom) {
		// TODO Auto-generated method stub
		HspBedInf hspBedInf=new HspBedInf();
		//清空床 根据emgseq查
		HspBedInfExample bedInfExample = new HspBedInfExample();
		HspBedInfExample.Criteria criteriaHspBedInf = bedInfExample.createCriteria();
		criteriaHspBedInf.andEmgSeqEqualTo(hspemginfCustom.getEmgSeq());
		List<HspBedInf> hspBedInflist = hspBedInfMapper.selectByExample(bedInfExample);//理论上只有1条
		if(hspBedInflist.size()>0){
			hspBedInf.setBedid(hspBedInflist.get(0).getBedid());
			hspBedInf.setEmgSeq("");
			hspBedInfMapper.updateByPrimaryKeySelective(hspBedInf);
		}
	}


	@Override
	public void clearAndreBindBed(String emgSeq,String Bedid) {
		// TODO Auto-generated method stub
		HspBedInf hspBedInf=new HspBedInf();
		//清空床 根据emgseq查
		HspBedInfExample bedInfExample = new HspBedInfExample();
		HspBedInfExample.Criteria criteriaHspBedInf = bedInfExample.createCriteria();
		criteriaHspBedInf.andEmgSeqEqualTo(emgSeq);
		List<HspBedInf> hspBedInflist = hspBedInfMapper.selectByExample(bedInfExample);//理论上只有1条
		if(hspBedInflist.size()>0){
			hspBedInf.setBedid(hspBedInflist.get(0).getBedid());
			hspBedInf.setEmgSeq("");
			hspBedInfMapper.updateByPrimaryKeySelective(hspBedInf);
		}
		//绑定床
		hspBedInf.setBedid(Bedid);
		hspBedInf.setEmgSeq(emgSeq);
		hspBedInfMapper.updateByPrimaryKeySelective(hspBedInf);
	}
	
	
	/**
	 * 根据床号取名字
	 * @param emgSeq
	 * @return
	 */
	public HspBedInf getHspBedInfByBedid(String bedId){
		return hspBedInfMapper.selectByPrimaryKey(bedId);
	}
	
	
	/**
	 * 是否绑定群体事件
	 * @param hspemginfCustom
	 * @return
	 */
	public void checkQtsj(HspemginfCustom hspemginfCustom,HspEmgInf hspEmgInf) {
		if("1".equals(hspemginfCustom.getQtsjFlg())) {
			if(null != hspEmgInf && null != hspEmgInf.getQtsjSeq()) {
				if(hspEmgInf.getQtsjSeq().equals(hspemginfCustom.getQtsjSeq())) {
					hspemginfCustom.setTriageNum(hspEmgInf.getTriageNum());
					return;
				}
			}
    		//获取该群体事件是否有患者绑定，如果有则取到最大的分组序号
			Integer maxTriage = hspemginfCustomMapper.findMaxTriage(hspemginfCustom.getQtsjSeq());
			if(null != maxTriage) {
				maxTriage += 1;
			}else {
				maxTriage = 1;
			}
			hspemginfCustom.setTriageNum(maxTriage.toString());
    	}else if("0".equals(hspemginfCustom.getQtsjFlg())) {
    		hspemginfCustom.setTriageNum("");
    	}
	}
	////////////子方法 END/////////////////////////////////////////////////////////////////////////////
}
