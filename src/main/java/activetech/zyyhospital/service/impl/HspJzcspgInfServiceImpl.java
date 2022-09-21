package activetech.zyyhospital.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.service.SystemConfigService;
import activetech.hospital.dao.mapper.HspGcsInfMapper;
import activetech.hospital.dao.mapper.HspsqlinfCustomMapper;
import activetech.hospital.pojo.domain.HspGcsInf;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspsqlinfCustom;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.zyyhospital.dao.mapper.HspAdlInfMapper;
import activetech.zyyhospital.dao.mapper.HspBradenInfMapper;
import activetech.zyyhospital.dao.mapper.HspDdfxpgbInfMapper;
import activetech.zyyhospital.dao.mapper.HspHlpgbCustomMapper;
import activetech.zyyhospital.dao.mapper.HspJzcspgInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspJzcspgInfMapper;
import activetech.zyyhospital.dao.mapper.HspLqblInfMapper;
import activetech.zyyhospital.dao.mapper.HspNrsInfMapper;
import activetech.zyyhospital.dao.mapper.HspZyfxpfInfMapper;
import activetech.zyyhospital.pojo.domain.HspAdlInf;
import activetech.zyyhospital.pojo.domain.HspBradenInf;
import activetech.zyyhospital.pojo.domain.HspDdfxpgbInf;
import activetech.zyyhospital.pojo.domain.HspJzcspgInf;
import activetech.zyyhospital.pojo.domain.HspLqblInf;
import activetech.zyyhospital.pojo.domain.HspLqblInfExample;
import activetech.zyyhospital.pojo.domain.HspNrsInf;
import activetech.zyyhospital.pojo.domain.HspZyfxpfInf;
import activetech.zyyhospital.pojo.dto.HspAdlInfCustom;
import activetech.zyyhospital.pojo.dto.HspBradenInfCustom;
import activetech.zyyhospital.pojo.dto.HspDdfxpgbInfCustom;
import activetech.zyyhospital.pojo.dto.HspGcsInfCustom;
import activetech.zyyhospital.pojo.dto.HspJzcspgInfCustom;
import activetech.zyyhospital.pojo.dto.HspJzcspgInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspNrsInfCustom;
import activetech.zyyhospital.pojo.dto.HspZyfxpfInfCustom;
import activetech.zyyhospital.service.HspJzcspgInfService;
import activetech.zyyhospital.service.ScoreQueryService;

public class HspJzcspgInfServiceImpl implements HspJzcspgInfService{

	@Autowired
	private HspJzcspgInfMapper hspJzcspgInfMapper;
	@Autowired
	private HspJzcspgInfCustomMapper hspJzcspgInfCustomMapper;
	@Autowired
	private HspHlpgbCustomMapper hspHlpgbCustomMapper;
	@Autowired
	private ScoreQueryService scoreQueryService;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private HspGcsInfMapper hspGcsInfMapper;
	@Autowired
	private HspNrsInfMapper hspNrsInfMapper;
	@Autowired
	private HspDdfxpgbInfMapper hspDdfxpgbInfMapper;
	@Autowired
	private HspBradenInfMapper hspBradenInfMapper;
	@Autowired
	private HspAdlInfMapper hspAdlInfMapper;
	@Autowired
	private HspZyfxpfInfMapper hspZyfxpfInfMapper;	
	@Autowired
	private HspsqlinfCustomMapper hspsqlinfCustomMapper;
	@Autowired
	private HspLqblInfMapper hspLqblInfMapper;
	
	@Override
	public HspJzcspgInfQueryDto getJzcsrypgbByEmgSeq(String emgSeq) throws Exception {
		HspJzcspgInfQueryDto hspJzcspgInfQueryDto = new HspJzcspgInfQueryDto();
		HspJzcspgInfCustom hspJzcspgInfCustom = hspJzcspgInfCustomMapper.findJzcspgByEmgSeq(emgSeq);
		HspemginfCustom hspemginfCustom = hspHlpgbCustomMapper.findEmgInfByEmgSeq(emgSeq);
		if (hspJzcspgInfCustom == null) {
			hspJzcspgInfCustom = new HspJzcspgInfCustom();
		}
		if(hspemginfCustom == null){
			hspemginfCustom = new HspemginfCustom();
		}
		HspLqblInfExample  hspLqblInfExample = new HspLqblInfExample();
		HspLqblInfExample.Criteria criteria =  hspLqblInfExample.createCriteria();
		criteria.andEmgSeqEqualTo(emgSeq);
		criteria.andBltypeEqualTo("0");
		List<HspLqblInf> hspLqblInfrtv = hspLqblInfMapper.selectByExample(hspLqblInfExample);
		//如果有则默认赋值留抢病历主诉
		if(hspLqblInfrtv != null && hspLqblInfrtv.size() > 0){
			HspLqblInf hspLqblInf = hspLqblInfrtv.get(0);
			hspJzcspgInfCustom.setPreDgnCod(hspLqblInf.getLqblDes());
		}
		//转归记录
		HspsqlinfCustom hspsqlinfCustom= hspsqlinfCustomMapper.findSql_jzt(hspemginfCustom.getSqlSeq());
		hspJzcspgInfQueryDto.setHspJzcspgInfCustom(hspJzcspgInfCustom);
		hspJzcspgInfQueryDto.setHspemginfCustom(hspemginfCustom);
		hspJzcspgInfQueryDto.setHspsqlinfCustom(hspsqlinfCustom);
		return hspJzcspgInfQueryDto;
	}
	
	@Override
	public HspJzcspgInfCustom findJzcsrypgbByEmgSeq(String emgSeq) throws Exception {
		HspJzcspgInfCustom hspJzcspgInfCustom = hspJzcspgInfCustomMapper.findJzcspgByEmgSeq(emgSeq);
		if (hspJzcspgInfCustom == null) {
			hspJzcspgInfCustom = new HspJzcspgInfCustom();
		}
		return hspJzcspgInfCustom;
	}

	@Override
	public void updateJzcsrypgb(HspJzcspgInfQueryDto hspJzcspgInfQueryDto, ActiveUser activeUser) throws Exception {
		if (hspJzcspgInfQueryDto != null) {
			HspJzcspgInfCustom hspJzcspgInfCustom = hspJzcspgInfQueryDto.getHspJzcspgInfCustom();
			HspJzcspgInf hspJzcspgInf = hspJzcspgInfMapper.selectByPrimaryKey(hspJzcspgInfCustom.getEmgSeq());
			if (hspJzcspgInf == null) {
				hspJzcspgInfCustom.setCreateDat(new Date());
				hspJzcspgInfCustom.setCreateNbr(activeUser.getUsrname());
				hspJzcspgInfCustom.setOprDat(DateUtil.parseDate(DateUtil.formatDateByFormat(new Date(),"yyyy/MM/dd"),"yyyy/MM/dd"));
				//针对评分进行操作
				aboutSco(hspJzcspgInfCustom,activeUser);
				hspJzcspgInfMapper.insert(hspJzcspgInfCustom);
			}else {
				aboutSco(hspJzcspgInfCustom,activeUser);
				hspJzcspgInfCustom.setCreateDat(hspJzcspgInf.getCreateDat());
				hspJzcspgInfCustom.setCreateNbr(hspJzcspgInf.getCreateNbr());
				hspJzcspgInfCustom.setUpdateDat(new Date());
				hspJzcspgInfCustom.setUpdateNbr(activeUser.getUsrname());
				hspJzcspgInfCustom.setOprDat(hspJzcspgInf.getOprDat());
				hspJzcspgInfMapper.updateByPrimaryKey(hspJzcspgInfCustom);
			}
		}
	}
	
	@Override
	public String submitBradenScore(HspJzcspgInfQueryDto hspJzcspgInfQueryDto,ActiveUser activeUser)throws Exception {
		HspBradenInfCustom hspBradenInfCustom = hspJzcspgInfQueryDto.getHspBradenInfCustom();
		String emgSeq = hspBradenInfCustom.getEmgSeq();
		if(hspBradenInfCustom != null){
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
				hspBradenInfCustom.setXtpgSeq("HCS-"+xtpgSeq);
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
		HspJzcspgInf hspJzcspgInf = hspJzcspgInfMapper.selectByPrimaryKey(emgSeq);
		if(hspJzcspgInf!=null){
			hspJzcspgInf.setBradenSeq(xtpgSeq);
			hspJzcspgInfMapper.updateByPrimaryKey(hspJzcspgInf);
		}else{
			hspJzcspgInf = new HspJzcspgInf();
			hspJzcspgInf.setEmgSeq(emgSeq);
			hspJzcspgInf.setBradenSeq(xtpgSeq);
			hspJzcspgInfMapper.insert(hspJzcspgInf);
		}
		return hspBradenInfCustom.getXtpgSeq();
	}

	@Override
	public String submitAdlScore(HspJzcspgInfQueryDto hspJzcspgInfQueryDto,ActiveUser activeUser)throws Exception {
		HspAdlInfCustom hspAdlInfCustom = hspJzcspgInfQueryDto.getHspAdlInfCustom();
		String emgSeq = hspAdlInfCustom.getEmgSeq();
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
				hspAdlInfCustom.setXtpgSeq("HCS-"+xtpgSeq);
				hspAdlInfCustom.setCratDat(new Date());
				hspAdlInfCustom.setCrtUsrNo(activeUser.getUsrno());
				hspAdlInfCustom.setCrtUsrNme(activeUser.getUsrname());
				hspAdlInfCustom.setUpdTime(new Date());
				hspAdlInfCustom.setUpdUsrNme(activeUser.getUsrname());
				hspAdlInfCustom.setUpdUsrNo(activeUser.getUsrno());
				hspAdlInfMapper.insert(hspAdlInfCustom);
			}
		}
		String xtpgSeq = hspAdlInfCustom.getXtpgSeq();
		HspJzcspgInf hspJzcspgInf = hspJzcspgInfMapper.selectByPrimaryKey(emgSeq);
		if(hspJzcspgInf!=null){
			hspJzcspgInf.setAdlSeq(xtpgSeq);
			hspJzcspgInfMapper.updateByPrimaryKey(hspJzcspgInf);
		}else{
			hspJzcspgInf = new HspJzcspgInf();
			hspJzcspgInf.setEmgSeq(emgSeq);
			hspJzcspgInf.setAdlSeq(xtpgSeq);
			hspJzcspgInfMapper.insert(hspJzcspgInf);
		}
		return hspAdlInfCustom.getXtpgSeq();
	}
	
	@Override
	public String submitNrsScore(HspJzcspgInfQueryDto hspJzcspgInfQueryDto, ActiveUser activeUser) throws Exception {
		HspNrsInfCustom hspNrsInfCustom = hspJzcspgInfQueryDto.getHspNrsInfCustom();
		if(hspNrsInfCustom != null){
			if (StringUtils.isNotNullAndEmptyByTrim(hspNrsInfCustom.getXtpgSeq()) && !"-1".equals(hspNrsInfCustom.getXtpgSeq())) {
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
				hspNrsInfCustom.setXtpgSeq("HCS-"+xtpgSeq);
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
		HspJzcspgInf hspJzcspgInf = hspJzcspgInfMapper.selectByPrimaryKey(emgSeq);
		if(hspJzcspgInf != null){
			hspJzcspgInf.setNrsSeq(xtpgSeq);
			hspJzcspgInfMapper.updateByPrimaryKey(hspJzcspgInf);
		}else{
			hspJzcspgInf=new HspJzcspgInf();
			hspJzcspgInf.setEmgSeq(emgSeq);
			hspJzcspgInf.setNrsSeq(xtpgSeq);
			hspJzcspgInfMapper.insert(hspJzcspgInf);
		}
		return xtpgSeq;
	}
	
	public String submitZyfxpfScore(HspJzcspgInfQueryDto hspJzcspgInfQueryDto,ActiveUser activeUser)
			throws Exception {
		HspZyfxpfInfCustom hspZyfxpfInfCustom=hspJzcspgInfQueryDto.getHspZyfxpfInfCustom();
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
				hspZyfxpfInfCustom.setZyfxpfSeq("HCS-"+zyfxpfSeq);
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
		HspJzcspgInf hspJzcspgInf = hspJzcspgInfMapper.selectByPrimaryKey(emgSeq);
		if(hspJzcspgInf!=null){
			hspJzcspgInf.setZyfxpfSeq(zyfxpfSeq);
			hspJzcspgInfMapper.updateByPrimaryKey(hspJzcspgInf);
		}else{
			hspJzcspgInf=new HspJzcspgInf();
			hspJzcspgInf.setEmgSeq(emgSeq);
			hspJzcspgInf.setZyfxpfSeq(zyfxpfSeq);
			hspJzcspgInfMapper.insert(hspJzcspgInf);
		}
		return hspZyfxpfInfCustom.getZyfxpfSeq();
	}
	
	@Override
	public String submitGcsSco(HspJzcspgInfQueryDto hspJzcspgInfQueryDto, ActiveUser activeUser) throws Exception {
		HspGcsInfCustom hspGcsInfCustom = hspJzcspgInfQueryDto.getHspGcsInfCustom();
		if(hspGcsInfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspGcsInfCustom.getEmgSeq()) && !"-1".equals(hspGcsInfCustom.getEmgSeq())){
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
				hspGcsInfCustom.setEmgSeq("HCS-"+xtpgSeq);
				hspGcsInfCustom.setCrtUsrNo(activeUser.getUsrno());
				hspGcsInfCustom.setCrtUsrNme(activeUser.getUsrname());
				hspGcsInfCustom.setCratDat(new Date());
				hspGcsInfMapper.insert(hspGcsInfCustom);
			}
		}
		String xtpgSeq = hspGcsInfCustom.getEmgSeq();
		String emgSeq = hspGcsInfCustom.getGcsSeq();
		HspJzcspgInf hspJzcspgInf = hspJzcspgInfMapper.selectByPrimaryKey(emgSeq);
		if(hspJzcspgInf != null){
			hspJzcspgInf.setGcsSeq(xtpgSeq);
			hspJzcspgInfMapper.updateByPrimaryKey(hspJzcspgInf);
		}else{
			hspJzcspgInf=new HspJzcspgInf();
			hspJzcspgInf.setEmgSeq(emgSeq);
			hspJzcspgInf.setGcsSeq(xtpgSeq);
			hspJzcspgInfMapper.insert(hspJzcspgInf);
		}
		return hspGcsInfCustom.getEmgSeq();
	}
	
	@Override
	public String addMorseScore(HspJzcspgInfQueryDto hspJzcspgInfQueryDto, ActiveUser activeUser) throws Exception {
		HspDdfxpgbInfCustom hspDdfxpgbInfCustom = hspJzcspgInfQueryDto.getHspDdfxpgbInfCustom();
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
				hspDdfxpgbInfCustom.setDdfxpgbSeq("HCS-" + xtpgSeq);
				hspDdfxpgbInfCustom.setCretDat(new Date());
				hspDdfxpgbInfCustom.setCrtUsrNo(activeUser.getUsrno());
				hspDdfxpgbInfCustom.setCrtUsrNme(activeUser.getUsrname());
				hspDdfxpgbInfMapper.insertSelective(hspDdfxpgbInfCustom);
			}
		}
		String ddfxpgbSeq = hspDdfxpgbInfCustom.getDdfxpgbSeq();
		String emgSeq = hspDdfxpgbInfCustom.getEmgSeq();
		HspJzcspgInf hspJzcspgInf = hspJzcspgInfMapper.selectByPrimaryKey(emgSeq);
		if(hspJzcspgInf != null){
			hspJzcspgInf.setDdfxpgbSeq(ddfxpgbSeq);
			hspJzcspgInfMapper.updateByPrimaryKey(hspJzcspgInf);
		}else{
			hspJzcspgInf = new HspJzcspgInf();
			hspJzcspgInf.setEmgSeq(emgSeq);
			hspJzcspgInf.setDdfxpgbSeq(ddfxpgbSeq);
			hspJzcspgInfMapper.insert(hspJzcspgInf);
		}
		return ddfxpgbSeq;
	}
	
	/**
	 * 首次新增病情创伤入院护理评估表关于各评分操作
	 * 当首次添加创伤入院护理评估表时，各评分读取的数据为预检的数据
	 * 如果未对评分做操作直接保存，则新增评分
	 * @param hspJzcspgInfCustom
	 * @throws Exception 
	 */
	public void aboutSco(HspJzcspgInfCustom hspJzcspgInfCustom,ActiveUser activeUser) throws Exception {
		HspNrsInf hspNrsInf = scoreQueryService.findNrsScoreByXtpgSeq(hspJzcspgInfCustom.getEmgSeq());
		HspGcsInf hspGcsInf = scoreQueryService.findGcsScoreByXtpgSeq(hspJzcspgInfCustom.getEmgSeq());
		
		Date createdate = new Date();
		String dateStr = DateUtil.formatDateByFormat(createdate, "yyyyMMdd");
		if (!StringUtils.isNotNullAndEmptyByTrim(hspJzcspgInfCustom.getNrsSeq())) {
			if (hspNrsInf != null) {
				String xtpgSeq = systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
				hspNrsInf.setXtpgSeq("HCS-" + xtpgSeq);
				hspNrsInf.setNrsDat(createdate);
				hspNrsInf.setCrtUsrNme(activeUser.getUsrname());
				hspNrsInf.setCrtUsrNo(activeUser.getUsrno());
				hspNrsInf.setUpdTime(new Date());
				hspNrsInf.setUpdUsrNme(activeUser.getUsrname());
				hspNrsInf.setUpdUsrNo(activeUser.getUsrno());
				hspNrsInf.setNrsStatus("1");
				hspJzcspgInfCustom.setNrsSeq("HCS-" + xtpgSeq);
				hspNrsInfMapper.insert(hspNrsInf);
			}
		}
		if (!StringUtils.isNotNullAndEmptyByTrim(hspJzcspgInfCustom.getGcsSeq())) {
			if (hspGcsInf != null) {
				String xtpgSeq = systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
				hspGcsInf.setEmgSeq("HCS-" + xtpgSeq);
				hspGcsInf.setCratDat(createdate);
				hspGcsInf.setCrtUsrNo(activeUser.getUsrno());
				hspGcsInf.setCrtUsrNme(activeUser.getUsrname());
				hspJzcspgInfCustom.setGcsSeq("HCS-" + xtpgSeq);
				hspGcsInfMapper.insert(hspGcsInf);
			}
		}	
	}
}
