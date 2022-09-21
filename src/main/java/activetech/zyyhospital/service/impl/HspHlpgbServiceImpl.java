package activetech.zyyhospital.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.service.SystemConfigService;
import activetech.hospital.dao.mapper.HspEmgInfMapper;
import activetech.hospital.dao.mapper.HspGcsInfMapper;
import activetech.hospital.dao.mapper.HspSqlInfMapper;
import activetech.hospital.dao.mapper.HspsqlinfCustomMapper;
import activetech.hospital.pojo.domain.HspEmgInf;
import activetech.hospital.pojo.domain.HspGcsInf;
import activetech.hospital.pojo.domain.HspSqlInf;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspsqlinfCustom;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.zyyhospital.dao.mapper.HspAdlInfMapper;
import activetech.zyyhospital.dao.mapper.HspBradenInfMapper;
import activetech.zyyhospital.dao.mapper.HspDdfxpgbInfMapper;
import activetech.zyyhospital.dao.mapper.HspFallriskInfMapper;
import activetech.zyyhospital.dao.mapper.HspHljldInfMapper;
import activetech.zyyhospital.dao.mapper.HspHlpgbCustomMapper;
import activetech.zyyhospital.dao.mapper.HspHlpgbMapper;
import activetech.zyyhospital.dao.mapper.HspLqblInfMapper;
import activetech.zyyhospital.dao.mapper.HspNrsInfMapper;
import activetech.zyyhospital.dao.mapper.HspZcddexpfInfMapper;
import activetech.zyyhospital.dao.mapper.HspZyfxpfInfMapper;
import activetech.zyyhospital.pojo.domain.HspAdlInf;
import activetech.zyyhospital.pojo.domain.HspBradenInf;
import activetech.zyyhospital.pojo.domain.HspDdfxpgbInf;
import activetech.zyyhospital.pojo.domain.HspFallriskInf;
import activetech.zyyhospital.pojo.domain.HspHljldInf;
import activetech.zyyhospital.pojo.domain.HspHljldInfExample;
import activetech.zyyhospital.pojo.domain.HspHlpgb;
import activetech.zyyhospital.pojo.domain.HspLqblInf;
import activetech.zyyhospital.pojo.domain.HspLqblInfExample;
import activetech.zyyhospital.pojo.domain.HspNrsInf;
import activetech.zyyhospital.pojo.domain.HspZcddexpfInf;
import activetech.zyyhospital.pojo.domain.HspZyfxpfInf;
import activetech.zyyhospital.pojo.dto.HspAdlInfCustom;
import activetech.zyyhospital.pojo.dto.HspBradenInfCustom;
import activetech.zyyhospital.pojo.dto.HspDdfxpgbInfCustom;
import activetech.zyyhospital.pojo.dto.HspFallriskInfCustom;
import activetech.zyyhospital.pojo.dto.HspGcsInfCustom;
import activetech.zyyhospital.pojo.dto.HspHlpgbCustom;
import activetech.zyyhospital.pojo.dto.HspHlpgbQueryDto;
import activetech.zyyhospital.pojo.dto.HspNrsInfCustom;
import activetech.zyyhospital.pojo.dto.HspZcddexpfInfCustom;
import activetech.zyyhospital.pojo.dto.HspZyfxpfInfCustom;
import activetech.zyyhospital.service.HspHlpgbService;
import activetech.zyyhospital.service.ScoreQueryService;

public class HspHlpgbServiceImpl implements HspHlpgbService {
	@Autowired
	private HspHlpgbCustomMapper hspHlpgbCustomMapper;
	@Autowired
	private HspHlpgbMapper hspHlpgbMapper;
	@Autowired
	private HspEmgInfMapper hspEmgInfMapper;
	@Autowired
	private HspAdlInfMapper hspAdlInfMapper;
	@Autowired
	private HspZcddexpfInfMapper hspZcddexpfInfMapper;
	@Autowired
	private HspBradenInfMapper hspBradenInfMapper;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private HspFallriskInfMapper hspFallriskInfMapper;
	@Autowired
	private HspZyfxpfInfMapper hspZyfxpfInfMapper;
	@Autowired
	private HspGcsInfMapper hspGcsInfMapper;
	@Autowired
	private HspNrsInfMapper hspNrsInfMapper;
	@Autowired
	private HspDdfxpgbInfMapper hspDdfxpgbInfMapper;
	@Autowired
	private ScoreQueryService scoreQueryService;	
	@Autowired
	private HspsqlinfCustomMapper hspsqlinfCustomMapper;	
	@Autowired
	private HspHljldInfMapper hspHljldInfMapper;
	@Autowired
	private HspSqlInfMapper hspSqlInfMapper;
	@Autowired
	private HspLqblInfMapper hspLqblInfMapper;
	
	@Override
	public HspHlpgbQueryDto getHlpgbByEmgSeq(String emgSeq) throws Exception {
		HspHlpgbQueryDto hspHlpgbQueryDto=new HspHlpgbQueryDto();
		HspHlpgbCustom hspHlpgbCustom=hspHlpgbCustomMapper.findHlpgbByEmgSeq(emgSeq);
		HspemginfCustom hspemginfCustom=hspHlpgbCustomMapper.findEmgInfByEmgSeq(emgSeq);
		if(hspemginfCustom == null){
			hspemginfCustom = new HspemginfCustom();
		}
		
		if(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getSqlStaCod()) && "13".equals(hspemginfCustom.getSqlStaCod())){
			hspemginfCustom.setSqlDepCod(hspemginfCustom.getSqlDes());
		}
		if(hspHlpgbCustom==null){
			hspHlpgbCustom=new HspHlpgbCustom();
		}
		//转归记录
		HspsqlinfCustom hspsqlinfCustom= hspsqlinfCustomMapper.findSql_jzt(hspemginfCustom.getSqlSeq());
		hspHlpgbQueryDto.setHspemginfCustom(hspemginfCustom);
		hspHlpgbQueryDto.setHspHlpgbCustom(hspHlpgbCustom);
		hspHlpgbQueryDto.setHspsqlinfCustom(hspsqlinfCustom);
		return hspHlpgbQueryDto;
	}

	@Override
	public void updateHlpgb(HspHlpgbQueryDto hspHlpgbQueryDto,ActiveUser activeUser) throws Exception {
		if(hspHlpgbQueryDto!=null){
			HspHlpgbCustom hspHlpgbCustom=hspHlpgbQueryDto.getHspHlpgbCustom();

			HspHlpgb hspHlpgb=hspHlpgbMapper.selectByPrimaryKey(hspHlpgbCustom.getEmgSeq());
			if(hspHlpgb==null){
				hspHlpgbCustom.setCreateDat(new Date());
				hspHlpgbCustom.setCreateNbr(activeUser.getUsrname());
				hspHlpgbCustom.setOprDat(DateUtil.parseDate(DateUtil.formatDateByFormat(new Date(),"yyyy/MM/dd"),"yyyy/MM/dd"));
				hspHlpgbMapper.insert(hspHlpgbCustom);
			}else{
				hspHlpgbCustom.setCreateDat(hspHlpgb.getCreateDat());
				hspHlpgbCustom.setCreateNbr(hspHlpgb.getCreateNbr());
				hspHlpgbCustom.setUpdateDat(new Date());
				hspHlpgbCustom.setUpdateNbr(activeUser.getUsrname());
				hspHlpgbCustom.setBradenSeq(hspHlpgb.getBradenSeq());
				hspHlpgbCustom.setAdlSeq(hspHlpgb.getAdlSeq());
				hspHlpgbCustom.setFalldSeq(hspHlpgb.getFalldSeq());
				hspHlpgbCustom.setFallriskSeq(hspHlpgb.getFallriskSeq());
				hspHlpgbCustom.setOprDat(hspHlpgb.getOprDat());
				hspHlpgbCustom.setZyfxpfSeq(hspHlpgb.getZyfxpfSeq());
				hspHlpgbCustom.setGcsSeq(hspHlpgb.getGcsSeq());
				hspHlpgbCustom.setNrsSeq(hspHlpgb.getNrsSeq());
				hspHlpgbCustom.setDdfxpgbSeq(hspHlpgb.getDdfxpgbSeq());
				hspHlpgbMapper.updateByPrimaryKey(hspHlpgbCustom);
			}
			
			//保存主诉症状
			HspemginfCustom hspemginfCustom=hspHlpgbQueryDto.getHspemginfCustom();
			if(hspemginfCustom!=null){
				HspEmgInf hspEmgInf=hspEmgInfMapper.selectByPrimaryKey(hspemginfCustom.getEmgSeq());
				if(hspEmgInf!=null){
					hspEmgInf.setSymSitDes(hspemginfCustom.getSymSitDes());
					hspEmgInfMapper.updateByPrimaryKey(hspEmgInf);
				}
			}
			//修改了评估时间，查询病情护理记录单首笔数据 并更新护理记录单创建时间
			if(!hspHlpgbCustom.getAssessmentDat().equals(hspHlpgb.getAssessmentDat())) {
				HspHljldInfExample hspHljldInfExample = new HspHljldInfExample();
				HspHljldInfExample.Criteria criteria = hspHljldInfExample.createCriteria();
				hspHljldInfExample.setOrderByClause("CRT_DAT");
				criteria.andEmgSeqEqualTo(hspHlpgbCustom.getEmgSeq());
				List<HspHljldInf> hljldList = hspHljldInfMapper.selectByExample(hspHljldInfExample);
				if(StringUtils.isNotNullAndZero(hljldList)) {
					HspHljldInf hspHljldInf =  hljldList.get(0);
					hspHljldInf.setCrtDat(hspHlpgbCustom.getAssessmentDat());
					hspHljldInfMapper.updateByPrimaryKey(hspHljldInf);
				}
			}
		}
		
	}
	


	@Override
	public HspHlpgb getZyhByEmgSeq(String emgSeq) throws Exception {
		HspHlpgb hspHlpgb=hspHlpgbCustomMapper.findQxZyhEmgSeq(emgSeq);
		return hspHlpgb;
	}

	@Override
	public HspHlpgbCustom findHlpgbByEmgSeq(String emgSeq) throws Exception {
		HspHlpgbCustom hspHlpgbCustom=hspHlpgbCustomMapper.findHlpgbByEmgSeq(emgSeq);
		return hspHlpgbCustom;
	}

	@Override
	public String submitBradenScore(HspHlpgbQueryDto hspHlpgbQueryDto,ActiveUser activeUser)throws Exception {
		HspBradenInfCustom hspBradenInfCustom=hspHlpgbQueryDto.getHspBradenInfCustom();
		String emgSeq=hspBradenInfCustom.getEmgSeq();
		if(hspBradenInfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspBradenInfCustom.getXtpgSeq())){
				HspBradenInf hspBradenInf=hspBradenInfMapper.selectByPrimaryKey(hspBradenInfCustom.getXtpgSeq());
				if(hspBradenInf!=null){
					hspBradenInfCustom.setCratDat(new Date());
					hspBradenInfCustom.setCrtUsrNme(hspBradenInf.getCrtUsrNme());
					hspBradenInfCustom.setCrtUsrNo(hspBradenInf.getCrtUsrNo());
					hspBradenInfCustom.setUpdTime(new Date());
					hspBradenInfCustom.setUpdUsrNo(activeUser.getUsrno());
					hspBradenInfCustom.setUpdUsrNme(activeUser.getUsrname());
					hspBradenInfCustom.setEmgSeq(hspBradenInf.getEmgSeq());
					hspBradenInfMapper.updateByPrimaryKey(hspBradenInfCustom);
				}
			}else{
				//生成专用系统评估号
				Date createdate = new Date();
				String dateStr = DateUtil.formatDateByFormat(createdate, "yyyyMMdd");
				String xtpgSeq=systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
				hspBradenInfCustom.setXtpgSeq("H-"+xtpgSeq);
				hspBradenInfCustom.setCratDat(new Date());
				hspBradenInfCustom.setCrtUsrNme(activeUser.getUsrname());
				hspBradenInfCustom.setCrtUsrNo(activeUser.getUsrno());
				hspBradenInfCustom.setUpdTime(new Date());
				hspBradenInfCustom.setUpdUsrNme(activeUser.getUsrname());
				hspBradenInfCustom.setUpdUsrNo(activeUser.getUsrno());
				hspBradenInfMapper.insert(hspBradenInfCustom);
			}
		}
		String xtpgSeq=hspBradenInfCustom.getXtpgSeq();
		HspHlpgb hspHlpgb=hspHlpgbMapper.selectByPrimaryKey(emgSeq);
		if(hspHlpgb!=null){
			hspHlpgb.setBradenSeq(xtpgSeq);
			hspHlpgbMapper.updateByPrimaryKey(hspHlpgb);
		}else{
			hspHlpgb=new HspHlpgb();
			hspHlpgb.setEmgSeq(emgSeq);
			hspHlpgb.setBradenSeq(xtpgSeq);
			hspHlpgbMapper.insert(hspHlpgb);
		}
		return hspBradenInfCustom.getXtpgSeq();
	}

	@Override
	public String submitAdlScore(HspHlpgbQueryDto hspHlpgbQueryDto,ActiveUser activeUser)throws Exception {
		HspAdlInfCustom hspAdlInfCustom=hspHlpgbQueryDto.getHspAdlInfCustom();
		String emgSeq=hspAdlInfCustom.getEmgSeq();
		if(hspAdlInfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspAdlInfCustom.getXtpgSeq())){
				HspAdlInf hspAdlInf=hspAdlInfMapper.selectByPrimaryKey(hspAdlInfCustom.getXtpgSeq());
				if(hspAdlInf!=null){
					hspAdlInfCustom.setCratDat(new Date());
					hspAdlInfCustom.setCrtUsrNme(hspAdlInf.getCrtUsrNme());
					hspAdlInfCustom.setCrtUsrNo(hspAdlInf.getCrtUsrNo());
					hspAdlInfCustom.setUpdTime(new Date());
					hspAdlInfCustom.setUpdUsrNme(activeUser.getUsrname());
					hspAdlInfCustom.setUpdUsrNo(activeUser.getUsrno());
					hspAdlInfCustom.setEmgSeq(hspAdlInf.getEmgSeq());
					hspAdlInfMapper.updateByPrimaryKey(hspAdlInfCustom);
				}
			}else{
				//生成专用系统评估号
				Date createdate = new Date();
				String dateStr = DateUtil.formatDateByFormat(createdate, "yyyyMMdd");
				String xtpgSeq=systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
				hspAdlInfCustom.setXtpgSeq("H-"+xtpgSeq);
				hspAdlInfCustom.setCratDat(new Date());
				hspAdlInfCustom.setCrtUsrNo(activeUser.getUsrno());
				hspAdlInfCustom.setCrtUsrNme(activeUser.getUsrname());
				hspAdlInfCustom.setUpdTime(new Date());
				hspAdlInfCustom.setUpdUsrNme(activeUser.getUsrname());
				hspAdlInfCustom.setUpdUsrNo(activeUser.getUsrno());
				hspAdlInfMapper.insert(hspAdlInfCustom);
			}
		}
		String xtpgSeq=hspAdlInfCustom.getXtpgSeq();
		HspHlpgb hspHlpgb=hspHlpgbMapper.selectByPrimaryKey(emgSeq);
		if(hspHlpgb!=null){
			hspHlpgb.setAdlSeq(xtpgSeq);
			hspHlpgbMapper.updateByPrimaryKey(hspHlpgb);
		}else{
			hspHlpgb=new HspHlpgb();
			hspHlpgb.setEmgSeq(emgSeq);
			hspHlpgb.setAdlSeq(xtpgSeq);
			hspHlpgbMapper.insert(hspHlpgb);
		}
		return hspAdlInfCustom.getXtpgSeq();
	}

	@Override
	public String submitFallDScore(HspHlpgbQueryDto hspHlpgbQueryDto)
			throws Exception {
		HspZcddexpfInfCustom hspZcddexpfInfCustom=hspHlpgbQueryDto.getHspZcddexpfInfCustom();
		String emgSeq=hspZcddexpfInfCustom.getEmgSeq();
		if(hspZcddexpfInfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspZcddexpfInfCustom.getXtpgSeq())){
				HspZcddexpfInf hspZcddexpfInf=hspZcddexpfInfMapper.selectByPrimaryKey(hspZcddexpfInfCustom.getXtpgSeq());
				if(hspZcddexpfInf!=null){
					hspZcddexpfInfCustom.setCratDat(new Date());
					hspZcddexpfInfCustom.setEmgSeq(hspZcddexpfInf.getEmgSeq());
					hspZcddexpfInfMapper.updateByPrimaryKey(hspZcddexpfInfCustom);
				}
			}else{
				//生成专用系统评估号
				Date createdate = new Date();
				String dateStr = DateUtil.formatDateByFormat(createdate, "yyyyMMdd");
				String xtpgSeq=systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
				hspZcddexpfInfCustom.setXtpgSeq("H-"+xtpgSeq);
				hspZcddexpfInfCustom.setCratDat(new Date());
				hspZcddexpfInfMapper.insert(hspZcddexpfInfCustom);
			}
		}
		String xtpgSeq=hspZcddexpfInfCustom.getXtpgSeq();
		HspHlpgb hspHlpgb=hspHlpgbMapper.selectByPrimaryKey(emgSeq);
		if(hspHlpgb!=null){
			hspHlpgb.setFalldSeq(xtpgSeq);
			hspHlpgbMapper.updateByPrimaryKey(hspHlpgb);
		}else{
			hspHlpgb=new HspHlpgb();
			hspHlpgb.setEmgSeq(emgSeq);
			hspHlpgb.setFalldSeq(xtpgSeq);
			hspHlpgbMapper.insert(hspHlpgb);
		}
		return hspZcddexpfInfCustom.getXtpgSeq();
	}
	
	@Override
	public String submitFallRisk(HspHlpgbQueryDto hspHlpgbQueryDto,ActiveUser activeUser)throws Exception {
		HspFallriskInfCustom hspFallriskInfCustom=hspHlpgbQueryDto.getHspFallriskInfCustom();
		String emgSeq=hspFallriskInfCustom.getEmgSeq();
		if(hspFallriskInfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspFallriskInfCustom.getFallriskSeq())){
				HspFallriskInf hspFallriskInf=hspFallriskInfMapper.selectByPrimaryKey(hspFallriskInfCustom.getFallriskSeq());
				if(hspFallriskInf!=null){
					hspFallriskInfCustom.setCretDat(new Date());
					hspFallriskInfCustom.setCrtUsrNme(hspFallriskInf.getCrtUsrNme());
					hspFallriskInfCustom.setCrtUsrNo(hspFallriskInf.getCrtUsrNo());
					hspFallriskInfCustom.setUpdTime(new Date());
					hspFallriskInfCustom.setUpdUsrNme(activeUser.getUsrname());
					hspFallriskInfCustom.setUpdUsrNo(activeUser.getUsrno());
					hspFallriskInfCustom.setEmgSeq(hspFallriskInf.getEmgSeq());
					hspFallriskInfMapper.updateByPrimaryKey(hspFallriskInfCustom);
				}else{
					//生成专用系统评估号
					Date createdate = new Date();
					String dateStr = DateUtil.formatDateByFormat(createdate, "yyyyMMdd");
					String xtpgSeq=systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
					hspFallriskInfCustom.setFallriskSeq("H-"+xtpgSeq);
					hspFallriskInfCustom.setCretDat(new Date());
					hspFallriskInfCustom.setCrtUsrNme(activeUser.getUsrname());
					hspFallriskInfCustom.setCrtUsrNo(activeUser.getUsrno());
					hspFallriskInfCustom.setUpdTime(new Date());
					hspFallriskInfCustom.setUpdUsrNme(activeUser.getUsrname());
					hspFallriskInfCustom.setUpdUsrNo(activeUser.getUsrno());
					hspFallriskInfMapper.insert(hspFallriskInfCustom);
				}
			}else{
				//生成专用系统评估号
				Date createdate = new Date();
				String dateStr = DateUtil.formatDateByFormat(createdate, "yyyyMMdd");
				String xtpgSeq=systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
				hspFallriskInfCustom.setFallriskSeq("H-"+xtpgSeq);
				hspFallriskInfCustom.setCretDat(new Date());
				hspFallriskInfCustom.setCrtUsrNme(activeUser.getUsrname());
				hspFallriskInfCustom.setCrtUsrNo(activeUser.getUsrno());
				hspFallriskInfCustom.setUpdTime(new Date());
				hspFallriskInfCustom.setUpdUsrNme(activeUser.getUsrname());
				hspFallriskInfCustom.setUpdUsrNo(activeUser.getUsrno());
				hspFallriskInfMapper.insert(hspFallriskInfCustom);
			}
		}
		String xtpgSeq=hspFallriskInfCustom.getFallriskSeq();
		HspHlpgb hspHlpgb=hspHlpgbMapper.selectByPrimaryKey(emgSeq);
		if(hspHlpgb!=null){
			hspHlpgb.setFallriskSeq(xtpgSeq);
			hspHlpgbMapper.updateByPrimaryKey(hspHlpgb);
		}else{
			hspHlpgb=new HspHlpgb();
			hspHlpgb.setEmgSeq(emgSeq);
			hspHlpgb.setFallriskSeq(xtpgSeq);
			hspHlpgbMapper.insert(hspHlpgb);
		}
		return hspFallriskInfCustom.getFallriskSeq();
	}
	
	public String submitZyfxpfScore(HspHlpgbQueryDto hspHlpgbQueryDto,ActiveUser activeUser)
			throws Exception {
		HspZyfxpfInfCustom hspZyfxpfInfCustom=hspHlpgbQueryDto.getHspZyfxpfInfCustom();
		String emgSeq=hspZyfxpfInfCustom.getEmgSeq();
		if(hspZyfxpfInfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspZyfxpfInfCustom.getZyfxpfSeq())){
				HspZyfxpfInf hspZyfxpfInf=hspZyfxpfInfMapper.selectByPrimaryKey(hspZyfxpfInfCustom.getZyfxpfSeq());
				//修改
				if(hspZyfxpfInf!=null){
					hspZyfxpfInfCustom.setCrtusrno(hspZyfxpfInf.getCrtusrno());
					hspZyfxpfInfCustom.setCrtusrnme(hspZyfxpfInf.getCrtusrnme());
					hspZyfxpfInfCustom.setCrttime(new Date());
					hspZyfxpfInfCustom.setUpdusrno(activeUser.getUsrno());
					hspZyfxpfInfCustom.setUpdusrnme(activeUser.getUsrname());
					hspZyfxpfInfCustom.setUpdtime(new Date());
					hspZyfxpfInfMapper.updateByPrimaryKey(hspZyfxpfInfCustom);
				}
			}else{
				//新增
				String dateStr = DateUtil.formatDateByFormat(new Date(), "yyyyMMdd");
				String zyfxpfSeq=systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
				hspZyfxpfInfCustom.setZyfxpfSeq("H-"+zyfxpfSeq);
				hspZyfxpfInfCustom.setCrtusrno(activeUser.getUsrno());
				hspZyfxpfInfCustom.setCrtusrnme(activeUser.getUsrname());
				hspZyfxpfInfCustom.setCrttime(new Date());
				hspZyfxpfInfCustom.setUpdusrno(activeUser.getUsrno());
				hspZyfxpfInfCustom.setUpdusrnme(activeUser.getUsrname());
				hspZyfxpfInfCustom.setUpdtime(new Date());
				hspZyfxpfInfMapper.insert(hspZyfxpfInfCustom);
			}
		}
		String zyfxpfSeq=hspZyfxpfInfCustom.getZyfxpfSeq();
		HspHlpgb hspHlpgb=hspHlpgbMapper.selectByPrimaryKey(emgSeq);
		if(hspHlpgb!=null){
			hspHlpgb.setZyfxpfSeq(zyfxpfSeq);
			hspHlpgbMapper.updateByPrimaryKey(hspHlpgb);
		}else{
			hspHlpgb=new HspHlpgb();
			hspHlpgb.setEmgSeq(emgSeq);
			hspHlpgb.setZyfxpfSeq(zyfxpfSeq);
			hspHlpgbMapper.insert(hspHlpgb);
		}
		return hspZyfxpfInfCustom.getZyfxpfSeq();
	}

	@Override
	public String submitGcsSco(HspHlpgbQueryDto hspHlpgbQueryDto, ActiveUser activeUser) throws Exception {
		HspGcsInfCustom hspGcsInfCustom = hspHlpgbQueryDto.getHspGcsInfCustom();
		if(hspGcsInfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspGcsInfCustom.getEmgSeq())){
				HspGcsInf hspGcsInf = hspGcsInfMapper.selectByPrimaryKey(hspGcsInfCustom.getEmgSeq());
				if(hspGcsInf != null){
					hspGcsInfCustom.setCratDat(new Date());
					hspGcsInfCustom.setUpdUsrNo(activeUser.getUsrno());
					hspGcsInfCustom.setUpdUsrNme(activeUser.getUsrname());
					hspGcsInfCustom.setUpdTime(new Date());
					hspGcsInfMapper.updateByPrimaryKey(hspGcsInfCustom);
				}
			}else{
				//生成专用系统评估号
				Date createdate = new Date();
				String dateStr = DateUtil.formatDateByFormat(createdate, "yyyyMMdd");
				String xtpgSeq=systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
				hspGcsInfCustom.setEmgSeq("H-"+xtpgSeq);
				hspGcsInfCustom.setCrtUsrNo(activeUser.getUsrno());
				hspGcsInfCustom.setCrtUsrNme(activeUser.getUsrname());
				hspGcsInfCustom.setCratDat(new Date());
				hspGcsInfMapper.insert(hspGcsInfCustom);
			}
		}
		String xtpgSeq = hspGcsInfCustom.getEmgSeq();
		String emgSeq = hspGcsInfCustom.getGcsSeq();
		HspHlpgb hspHlpgb = hspHlpgbMapper.selectByPrimaryKey(emgSeq);
		if(hspHlpgb != null){
			hspHlpgb.setGcsSeq(xtpgSeq);
			hspHlpgbMapper.updateByPrimaryKey(hspHlpgb);
		}else{
			hspHlpgb=new HspHlpgb();
			hspHlpgb.setEmgSeq(emgSeq);
			hspHlpgb.setGcsSeq(xtpgSeq);
			hspHlpgbMapper.insert(hspHlpgb);
		}
		return hspGcsInfCustom.getEmgSeq();
	}
	
	@Override
	public String submitNrsScore(HspHlpgbQueryDto hspHlpgbQueryDto, ActiveUser activeUser) throws Exception {
		HspNrsInfCustom hspNrsInfCustom = hspHlpgbQueryDto.getHspNrsInfCustom();
		if(hspNrsInfCustom!=null){
			if (StringUtils.isNotNullAndEmptyByTrim(hspNrsInfCustom.getXtpgSeq())) {
				HspNrsInf hspNrsInf = hspNrsInfMapper.selectByPrimaryKey(hspNrsInfCustom.getXtpgSeq());
				if (hspNrsInf != null) {
					hspNrsInfCustom.setNrsDat(new Date());
					hspNrsInfCustom.setEmgSeq(hspNrsInf.getEmgSeq());
					hspNrsInfCustom.setNrsStatus(hspNrsInf.getNrsStatus());
					hspNrsInfCustom.setCrtUsrNme(hspNrsInf.getCrtUsrNme());
					hspNrsInfCustom.setCrtUsrNo(hspNrsInf.getCrtUsrNo());
					hspNrsInfCustom.setUpdTime(new Date());
					hspNrsInfCustom.setUpdUsrNme(activeUser.getUsrname());
					hspNrsInfCustom.setUpdUsrNo(activeUser.getUsrno());
					hspNrsInfMapper.updateByPrimaryKey(hspNrsInfCustom);
				}
			} else {
				Date createdate = new Date();
				String dateStr = DateUtil.formatDateByFormat(createdate, "yyyyMMdd");
				String xtpgSeq=systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
				hspNrsInfCustom.setXtpgSeq("H-"+xtpgSeq);
				hspNrsInfCustom.setNrsDat(new Date());
				hspNrsInfCustom.setCrtUsrNme(activeUser.getUsrname());
				hspNrsInfCustom.setCrtUsrNo(activeUser.getUsrno());
				hspNrsInfCustom.setUpdTime(new Date());
				hspNrsInfCustom.setUpdUsrNme(activeUser.getUsrname());
				hspNrsInfCustom.setUpdUsrNo(activeUser.getUsrno());
				hspNrsInfCustom.setNrsStatus("1");
				hspNrsInfMapper.insert(hspNrsInfCustom);
			}
		}
		String xtpgSeq = hspNrsInfCustom.getXtpgSeq();
		String emgSeq = hspNrsInfCustom.getEmgSeq();
		HspHlpgb hspHlpgb = hspHlpgbMapper.selectByPrimaryKey(emgSeq);
		if(hspHlpgb != null){
			hspHlpgb.setNrsSeq(xtpgSeq);
			hspHlpgbMapper.updateByPrimaryKey(hspHlpgb);
		}else{
			hspHlpgb=new HspHlpgb();
			hspHlpgb.setEmgSeq(emgSeq);
			hspHlpgb.setNrsSeq(xtpgSeq);
			hspHlpgbMapper.insert(hspHlpgb);
		}
		return xtpgSeq;
	}

	@Override
	public String addMorseScore(HspHlpgbQueryDto hspHlpgbQueryDto, ActiveUser activeUser) throws Exception {
		HspDdfxpgbInfCustom hspDdfxpgbInfCustom = hspHlpgbQueryDto.getHspDdfxpgbInfCustom();
		if(hspDdfxpgbInfCustom != null){
			if (StringUtils.isNotNullAndEmptyByTrim(hspDdfxpgbInfCustom.getDdfxpgbSeq())) {
				HspDdfxpgbInf hspDdfxpgbInf = hspDdfxpgbInfMapper.selectByPrimaryKey(hspDdfxpgbInfCustom.getDdfxpgbSeq());
				if (hspDdfxpgbInf != null) {
					hspDdfxpgbInfCustom.setCretDat(new Date());
					hspDdfxpgbInfCustom.setCrtUsrNo(hspDdfxpgbInf.getCrtUsrNo());
					hspDdfxpgbInfCustom.setCrtUsrNme(hspDdfxpgbInf.getCrtUsrNme());
					hspDdfxpgbInfCustom.setUpdUsrNo(activeUser.getUsrno());
					hspDdfxpgbInfCustom.setUpdUsrNme(activeUser.getUsrname());
					hspDdfxpgbInfMapper.updateByPrimaryKey(hspDdfxpgbInfCustom);
				}
			}else {
				Date createdate = new Date();
				String dateStr = DateUtil.formatDateByFormat(createdate, "yyyyMMdd");
				String xtpgSeq = systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
				hspDdfxpgbInfCustom.setDdfxpgbSeq("H-" + xtpgSeq);
				hspDdfxpgbInfCustom.setCretDat(new Date());
				hspDdfxpgbInfCustom.setCrtUsrNo(activeUser.getUsrno());
				hspDdfxpgbInfCustom.setCrtUsrNme(activeUser.getUsrname());
				hspDdfxpgbInfMapper.insertSelective(hspDdfxpgbInfCustom);
			}
		}
		String ddfxpgbSeq = hspDdfxpgbInfCustom.getDdfxpgbSeq();
		String emgSeq = hspDdfxpgbInfCustom.getEmgSeq();
		HspHlpgb hspHlpgb = hspHlpgbMapper.selectByPrimaryKey(emgSeq);
		if(hspHlpgb != null){
			hspHlpgb.setDdfxpgbSeq(ddfxpgbSeq);
			hspHlpgbMapper.updateByPrimaryKey(hspHlpgb);
		}else{
			hspHlpgb = new HspHlpgb();
			hspHlpgb.setEmgSeq(emgSeq);
			hspHlpgb.setDdfxpgbSeq(ddfxpgbSeq);
			hspHlpgbMapper.insert(hspHlpgb);
		}
		return ddfxpgbSeq;
	}

	/**
	 * 首条护理评估单新增
	 */
	@Override
	public void firstAssignment(String emgSeq,ActiveUser activeUser) throws Exception {
		//查询护理评估单
		HspHlpgbCustom hspHlpgbCustom = hspHlpgbCustomMapper.findHlpgbByEmgSeq(emgSeq);
		
		//首条护理评估单 新增
		if (hspHlpgbCustom == null) {
			//查询预检表数据
			HspemginfCustom hspemginfCustom = hspHlpgbCustomMapper.findEmgInfByEmgSeq(emgSeq);
			
			hspHlpgbCustom = new HspHlpgbCustom();
			//基础数据初始化赋值
			hspHlpgbCustom.setEmgSeq(emgSeq);
			hspHlpgbCustom.setCreateDat(new Date());
			hspHlpgbCustom.setCreateNbr(activeUser.getUsrname());
			hspHlpgbCustom.setInformDocDat(hspemginfCustom.getEmgDat());
			hspHlpgbCustom.setDocDat(hspemginfCustom.getEmgDat());
			hspHlpgbCustom.setSqlDctNbr(hspemginfCustom.getSqlDctNbr());
			hspHlpgbCustom.setArvChlCod(hspemginfCustom.getArvChlCod());
			hspHlpgbCustom.setCmpPsnCod(hspemginfCustom.getCmpPsnCod());
			hspHlpgbCustom.setAssessmentDat(hspemginfCustom.getEmgDat());
			hspHlpgbCustom.setPsryqt(hspemginfCustom.getPsryqt());
			hspHlpgbCustom.setAbnDoctor(hspemginfCustom.getAbnDoctor());
			hspHlpgbCustom.setAbnDriver(hspemginfCustom.getAbnDriver());
			hspHlpgbCustom.setAbnScoNme(hspemginfCustom.getAbnScoNme());
			hspHlpgbCustom.setSeeDocDat(hspemginfCustom.getEmgDat());
			
			HspLqblInfExample  hspLqblInfExample = new HspLqblInfExample();
			HspLqblInfExample.Criteria criteria =  hspLqblInfExample.createCriteria();
			criteria.andEmgSeqEqualTo(hspHlpgbCustom.getEmgSeq());
			criteria.andBltypeEqualTo("0");
			List<HspLqblInf> hspLqblInfrtv = hspLqblInfMapper.selectByExample(hspLqblInfExample);
			//如果有则默认赋值留抢病历主诉
			if(hspLqblInfrtv != null && hspLqblInfrtv.size() > 0){
				HspLqblInf hspLqblInf = hspLqblInfrtv.get(0);
				hspHlpgbCustom.setPreDgnCod(hspLqblInf.getLqblDes());
			}
			
			hspHlpgbCustom.setOprDat(DateUtil.parseDate(DateUtil.formatDateByFormat(new Date(),"yyyy/MM/dd"),"yyyy/MM/dd"));
			//如果是诊间转留抢的患者，则时间取转归为留抢时的转归时间
			if (StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getSqlSeq())) {
				HspSqlInf hspsqlinf = hspSqlInfMapper.selectByPrimaryKey(hspemginfCustom.getSqlSeq());
				if (hspsqlinf != null) {
					hspHlpgbCustom.setSeeDocDat(hspsqlinf.getSqlDat());
					hspHlpgbCustom.setInformDocDat(hspsqlinf.getSqlDat());
					hspHlpgbCustom.setDocDat(hspsqlinf.getSqlDat());
					hspHlpgbCustom.setAssessmentDat(hspsqlinf.getSqlDat());
				}
			}
			//过敏史初始化赋值
			hspHlpgbCustom.setGmsCod(hspemginfCustom.getAlgHon());
			hspHlpgbCustom.setGmsType(hspemginfCustom.getAlgTypCod());
			hspHlpgbCustom.setGmsDes(hspemginfCustom.getAlgTypDes());
			//末梢血糖初始化赋值
			hspHlpgbCustom.setPbgNbr(hspemginfCustom.getGlsNum());
			hspHlpgbCustom.setPbgNbrFlg(hspemginfCustom.getGlsType());
			//神志初始化赋值
			hspHlpgbCustom.setSzCod(hspemginfCustom.getSenStuCod());
			//生命体征初始化赋值
			hspHlpgbCustom.setTmpNbr(null==hspemginfCustom.getTmpNbr()?null:hspemginfCustom.getTmpNbr().toString());
			hspHlpgbCustom.setPulse(null==hspemginfCustom.getPulse()?null:hspemginfCustom.getPulse().toString());
			hspHlpgbCustom.setBreNbr(null==hspemginfCustom.getBreNbr()?null:hspemginfCustom.getBreNbr().toString());
			hspHlpgbCustom.setSbpUpNbr(null==hspemginfCustom.getSbpUpNbr()?null:hspemginfCustom.getSbpUpNbr().toString());
			hspHlpgbCustom.setSbpDownNbr(null==hspemginfCustom.getSbpDownNbr()?null:hspemginfCustom.getSbpDownNbr().toString());
			hspHlpgbCustom.setOxyNbr(null==hspemginfCustom.getOxyNbr()?null:hspemginfCustom.getOxyNbr().toString());
			hspHlpgbCustom.setPbgNbr(hspemginfCustom.getGlsNum());
			hspHlpgbCustom.setPbgNbrFlg(hspemginfCustom.getGlsType());
			hspHlpgbCustom.setGlsCod(hspemginfCustom.getGlsCod());
			
			//获取预检NRS评分
			HspNrsInf hspNrsInf = scoreQueryService.findNrsScoreByXtpgSeq(emgSeq);
			//获取预检GCS评分
			HspGcsInf hspGcsInf = scoreQueryService.findGcsScoreByXtpgSeq(emgSeq);
			
			Date createdate = new Date();
			String dateStr = DateUtil.formatDateByFormat(createdate, "yyyyMMdd");
			if (hspNrsInf != null) {
				String xtpgSeq = systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
				hspNrsInf.setXtpgSeq("H-" + xtpgSeq);
				hspNrsInf.setNrsDat(createdate);
				hspNrsInf.setCrtUsrNme(activeUser.getUsrname());
				hspNrsInf.setCrtUsrNo(activeUser.getUsrno());
				hspNrsInf.setUpdTime(new Date());
				hspNrsInf.setUpdUsrNme(activeUser.getUsrname());
				hspNrsInf.setUpdUsrNo(activeUser.getUsrno());
				hspNrsInf.setNrsStatus("1");
				hspHlpgbCustom.setNrsSeq("H-" + xtpgSeq);
				hspNrsInfMapper.insert(hspNrsInf);
			}
			if (hspGcsInf != null) {
				String xtpgSeq = systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
				hspGcsInf.setEmgSeq("H-" + xtpgSeq);
				hspGcsInf.setCratDat(createdate);
				hspGcsInf.setCrtUsrNo(activeUser.getUsrno());
				hspGcsInf.setCrtUsrNme(activeUser.getUsrname());
				hspHlpgbCustom.setGcsSeq("H-" + xtpgSeq);
				hspGcsInfMapper.insert(hspGcsInf);
			}
			hspHlpgbMapper.insert(hspHlpgbCustom);
		}
	}

	
	@Override
	public List<HspHlpgbCustom> exportVitalSigns(HspHlpgbQueryDto hspHlpgbQueryDto) throws Exception{
		return hspHlpgbCustomMapper.exportVitalSigns(hspHlpgbQueryDto);
	}

}
