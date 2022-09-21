package activetech.zyyhospital.service.impl;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.edpc.dao.mapper.HspTashInfMapper;
import activetech.edpc.pojo.domain.HspTashInf;
import activetech.edpc.pojo.dto.HspTashInfCustom;
import activetech.hospital.dao.mapper.HspGcsInfMapper;
import activetech.hospital.dao.mapper.HspZjpfInfMapper;
import activetech.hospital.pojo.domain.HspGcsInf;
import activetech.hospital.pojo.domain.HspGcsInfExample;
import activetech.hospital.pojo.domain.HspZjpfInf;
import activetech.hospital.pojo.domain.HspZjpfInfExample;
import activetech.hospital.pojo.dto.HspZjpfInfCustom;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import activetech.zyyhospital.dao.mapper.*;
import activetech.zyyhospital.pojo.domain.*;
import activetech.zyyhospital.pojo.domain.HspTiInf;
import activetech.zyyhospital.pojo.dto.*;
import activetech.zyyhospital.service.ScoreQueryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScoreQueryServiceImpl implements ScoreQueryService {
	@Autowired
	private HspBradenInfMapper hspBradenInfMapper;
	@Autowired
	private HspNrsInfMapper hspNrsInfMapper;
	@Autowired
	private HspAdlInfMapper hspAdlInfMapper;
	@Autowired
	private HspZcddexpfInfMapper hspZcddexpfInfMapper;
	@Autowired
	private HspGcsInfMapper hspGcsInfMapper;
	@Autowired
	private HspHlpgbMapper hspHlpgbMapper;
	@Autowired
	private HspFallriskInfMapper hspFallriskInfMapper;
	@Autowired
	private HspZyfxpfInfMapper hspZyfxpfInfMapper;
	@Autowired
	private HspZyfxpfInfCustomMapper hspZyfxpfInCustomfMapper;
	@Autowired
	private HspDdfxpgbInfMapper hspDdfxpgbInfMapper;
	@Autowired
	private HspHljldInfMapper hspHljldInfMapper;
	@Autowired
	private HspZjpfInfMapper hspZjpfInfMapper;
	@Autowired
	private HspJzcspgInfMapper hspJzcspgInfMapper;
	@Autowired
	private HspTiInfMapper hspTiInfMapper;
	@Autowired
	private HspTiInfCustomMapper hspTiInfCustomMapper;
	@Autowired
	private HspTashInfMapper hspTashInfMapper;
	
	//---------------------------------braden评分-------------------------------------
	@Override
	public List<HspBradenInf> queryBradenList(HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception {
		List<HspBradenInf> bradenList=null;
		if(hspXtpgInfQueryDto!=null){
			String emgSeq=hspXtpgInfQueryDto.getHspBradenInfCustom().getEmgSeq();
			HspBradenInfExample hspBradenInfExample=new HspBradenInfExample();
			HspBradenInfExample.Criteria criteria=hspBradenInfExample.createCriteria();
			criteria.andEmgSeqEqualTo(emgSeq);
			//criteria.andCratDatIsNotNull();
			criteria.andBradenScoIsNotNull();
			if (hspXtpgInfQueryDto.getStartdate() != null) {
				criteria.andCratDatGreaterThanOrEqualTo(hspXtpgInfQueryDto.getStartdate());
			}
			if (hspXtpgInfQueryDto.getEnddate() != null) {
				criteria.andCratDatLessThanOrEqualTo(hspXtpgInfQueryDto.getEnddate());
			}
			hspBradenInfExample.setOrderByClause("crat_dat desc NULLS LAST");
			bradenList=hspBradenInfMapper.selectByExample(hspBradenInfExample);
		}
		return bradenList;
	}

	/**
	 * 评分查询——新增braden评分
	 */
	@Override
	public void addBradenScore(HspXtpgInfQueryDto hspXtpgInfQueryDto,ActiveUser activeUser)
			throws Exception {
		HspBradenInfCustom hspBradenInfCustom=hspXtpgInfQueryDto.getHspBradenInfCustom();
		if(hspBradenInfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspBradenInfCustom.getXtpgSeq())){
				HspBradenInf hspBradenInf=hspBradenInfMapper.selectByPrimaryKey(hspBradenInfCustom.getXtpgSeq());
				if(hspBradenInf!=null){
					hspBradenInfCustom.setCrtUsrNme(hspBradenInf.getCrtUsrNme());
					hspBradenInfCustom.setCrtUsrNo(hspBradenInf.getCrtUsrNo());
					hspBradenInfCustom.setUpdTime(new Date());
					hspBradenInfCustom.setUpdUsrNo(activeUser.getUsrno());
					hspBradenInfCustom.setUpdUsrNme(activeUser.getUsrname());
					hspBradenInfCustom.setEmgSeq(hspBradenInf.getEmgSeq());
					hspBradenInfMapper.updateByPrimaryKey(hspBradenInfCustom);
				}
			}else{
				hspBradenInfCustom.setXtpgSeq(UUIDBuild.getUUID());
				hspBradenInfCustom.setCrtUsrNme(activeUser.getUsrname());
				hspBradenInfCustom.setCrtUsrNo(activeUser.getUsrno());
				hspBradenInfCustom.setUpdTime(new Date());
				hspBradenInfCustom.setUpdUsrNme(activeUser.getUsrname());
				hspBradenInfCustom.setUpdUsrNo(activeUser.getUsrno());
				hspBradenInfMapper.insert(hspBradenInfCustom);
			}
		}
		
	}

	@Override
	public void delBradenScore(String xtpgSeq) throws Exception {
		if(StringUtils.isNotNullAndEmptyByTrim(xtpgSeq)){
			//H- + 16位序号
			if(xtpgSeq.length()==18){
				HspBradenInf hspBradenInf=hspBradenInfMapper.selectByPrimaryKey(xtpgSeq);
				String emgSeq=hspBradenInf.getEmgSeq();
				HspHlpgb hspHlpgb=hspHlpgbMapper.selectByPrimaryKey(emgSeq);
				hspHlpgb.setBradenSeq(null);
				hspHlpgbMapper.updateByPrimaryKey(hspHlpgb);
			}
			if (xtpgSeq.indexOf("HCS-") != -1) {
				HspBradenInf hspBradenInf=hspBradenInfMapper.selectByPrimaryKey(xtpgSeq);
				HspJzcspgInf hspJzcspgInf = hspJzcspgInfMapper.selectByPrimaryKey(hspBradenInf.getEmgSeq());
				hspJzcspgInf.setBradenSeq(null);
				hspJzcspgInfMapper.updateByPrimaryKey(hspJzcspgInf);
			}
			//HLIJL- + 16位序号
			if(xtpgSeq.indexOf("HLIJL-") != -1){
				List<HspHljldInf> list = new ArrayList<HspHljldInf>();
				HspHljldInfExample hspHljldInfInfExample = new HspHljldInfExample();
				HspHljldInfExample.Criteria criteria = hspHljldInfInfExample.createCriteria();
				criteria.andBradenSeqEqualTo(xtpgSeq);
				list = hspHljldInfMapper.selectByExample(hspHljldInfInfExample);
				if(list.size()>0){
					String bqhiSeq = list.get(0).getBqhiSeq();
					HspHljldInf hspHljldInf=hspHljldInfMapper.selectByPrimaryKey(bqhiSeq);
					hspHljldInf.setBradenSeq(null);
					hspHljldInfMapper.updateByPrimaryKey(hspHljldInf);
				}
			}
			hspBradenInfMapper.deleteByPrimaryKey(xtpgSeq);
		}
	}

	@Override
	public HspBradenInf findBradenScoreByXtpgSeq(String xtpgSeq) throws Exception {
		if(StringUtils.isNotNullAndEmptyByTrim(xtpgSeq)){
			return hspBradenInfMapper.selectByPrimaryKey(xtpgSeq);
		}
		return null;
	}
	
	/**
	 * 获取最新一条braden评分
	 */
	@Override
	public HspBradenInf findFirstBradenScore(String emgSeq) throws Exception {
		HspBradenInf hspBradenInf=null;
		if(StringUtils.isNotNullAndEmptyByTrim(emgSeq)){
			HspBradenInfExample hspBradenInfExample=new HspBradenInfExample();
			HspBradenInfExample.Criteria criteria=hspBradenInfExample.createCriteria();
			criteria.andEmgSeqEqualTo(emgSeq);
			//criteria.andCratDatIsNotNull();
			criteria.andBradenScoIsNotNull();
			hspBradenInfExample.setOrderByClause("crat_dat desc NULLS LAST");
			List<HspBradenInf> list= hspBradenInfMapper.selectByExample(hspBradenInfExample);
			if(list.size()>0)
				hspBradenInf=list.get(0);
		}
		return hspBradenInf;
	}

	//---------------------------------ADL评分-----------------------------
	@Override
	public List<HspAdlInf> queryAdlList(HspXtpgInfQueryDto hspXtpgInfQueryDto)
			throws Exception {
		List<HspAdlInf> adlList=null;
		if(hspXtpgInfQueryDto!=null){
			String emgSeq=hspXtpgInfQueryDto.getHspAdlInfCustom().getEmgSeq();
			HspAdlInfExample hspAdlInfExample=new HspAdlInfExample();
			HspAdlInfExample.Criteria criteria=hspAdlInfExample.createCriteria();
			criteria.andEmgSeqEqualTo(emgSeq);
			criteria.andCratDatIsNotNull();
			criteria.andAdlScoIsNotNull();
			if (hspXtpgInfQueryDto.getStartdate() != null) {
				criteria.andCratDatGreaterThanOrEqualTo(hspXtpgInfQueryDto.getStartdate());
			}
			if (hspXtpgInfQueryDto.getEnddate() != null) {
				criteria.andCratDatLessThanOrEqualTo(hspXtpgInfQueryDto.getEnddate());
			}		
			hspAdlInfExample.setOrderByClause("crat_dat desc");
			adlList=hspAdlInfMapper.selectByExample(hspAdlInfExample);
		}
		return adlList;
	}

	@Override
	public void addAdlScore(HspXtpgInfQueryDto hspXtpgInfQueryDto,ActiveUser activeUser)
			throws Exception {
		HspAdlInfCustom hspAdlInfCustom=hspXtpgInfQueryDto.getHspAdlInfCustom();
		if(hspAdlInfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspAdlInfCustom.getXtpgSeq())){
				HspAdlInf hspAdlInf=hspAdlInfMapper.selectByPrimaryKey(hspAdlInfCustom.getXtpgSeq());
				if(hspAdlInf!=null){
					hspAdlInfCustom.setCrtUsrNme(hspAdlInf.getCrtUsrNme());
					hspAdlInfCustom.setCrtUsrNo(hspAdlInf.getCrtUsrNo());
					hspAdlInfCustom.setUpdTime(new Date());
					hspAdlInfCustom.setUpdUsrNme(activeUser.getUsrname());
					hspAdlInfCustom.setUpdUsrNo(activeUser.getUsrno());
					hspAdlInfCustom.setEmgSeq(hspAdlInf.getEmgSeq());
					hspAdlInfMapper.updateByPrimaryKey(hspAdlInfCustom);
				}
			}else{
				hspAdlInfCustom.setXtpgSeq(UUIDBuild.getUUID());
				hspAdlInfCustom.setCrtUsrNo(activeUser.getUsrno());
				hspAdlInfCustom.setCrtUsrNme(activeUser.getUsrname());
				hspAdlInfCustom.setUpdTime(new Date());
				hspAdlInfCustom.setUpdUsrNme(activeUser.getUsrname());
				hspAdlInfCustom.setUpdUsrNo(activeUser.getUsrno());
				hspAdlInfMapper.insert(hspAdlInfCustom);
			}
		}
	}

	@Override
	public void delAdlScore(String xtpgSeq) throws Exception {
		if(StringUtils.isNotNullAndEmptyByTrim(xtpgSeq)){
			if(xtpgSeq.length()==18){
				HspAdlInf hspAdlInf=hspAdlInfMapper.selectByPrimaryKey(xtpgSeq);
				String emgSeq=hspAdlInf.getEmgSeq();
				HspHlpgb hspHlpgb=hspHlpgbMapper.selectByPrimaryKey(emgSeq);
				hspHlpgb.setAdlSeq(null);
				hspHlpgbMapper.updateByPrimaryKey(hspHlpgb);
			}
			if (xtpgSeq.indexOf("HCS-") != -1) {
				HspAdlInf hspAdlInf=hspAdlInfMapper.selectByPrimaryKey(xtpgSeq);
				HspJzcspgInf hspJzcspgInf = hspJzcspgInfMapper.selectByPrimaryKey(hspAdlInf.getEmgSeq());
				hspJzcspgInf.setAdlSeq(null);
				hspJzcspgInfMapper.updateByPrimaryKey(hspJzcspgInf);
			}
			//HLIJL- + 16位序号
			if(xtpgSeq.indexOf("HLIJL-") != -1){
				List<HspHljldInf> list = new ArrayList<HspHljldInf>();
				HspHljldInfExample hspHljldInfInfExample = new HspHljldInfExample();
				HspHljldInfExample.Criteria criteria = hspHljldInfInfExample.createCriteria();
				criteria.andBradenSeqEqualTo(xtpgSeq);
				list = hspHljldInfMapper.selectByExample(hspHljldInfInfExample);
				if(list.size()>0){
					String bqhiSeq = list.get(0).getBqhiSeq();
					HspHljldInf hspHljldInf=hspHljldInfMapper.selectByPrimaryKey(bqhiSeq);
					hspHljldInf.setAdlSeq(null);
					hspHljldInfMapper.updateByPrimaryKey(hspHljldInf);
				}
			}
			hspAdlInfMapper.deleteByPrimaryKey(xtpgSeq);
		}
	}

	@Override
	public HspAdlInf findAdlScoreByXtpgSeq(String xtpgSeq) throws Exception {
		if(StringUtils.isNotNullAndEmptyByTrim(xtpgSeq)){
			return hspAdlInfMapper.selectByPrimaryKey(xtpgSeq);
		}
		return null;
	}
	
	/**
	 * 获取最新一条adl评分
	 */
	@Override
	public HspAdlInf findFirstAdlScore(String emgSeq) throws Exception {
		HspAdlInf hspAdlInf=null;
		if(StringUtils.isNotNullAndEmptyByTrim(emgSeq)){
			HspAdlInfExample hspAdlInfExample=new HspAdlInfExample();
			HspAdlInfExample.Criteria criteria=hspAdlInfExample.createCriteria();
			criteria.andEmgSeqEqualTo(emgSeq);
			criteria.andCratDatIsNotNull();
			criteria.andAdlScoIsNotNull();
			hspAdlInfExample.setOrderByClause("crat_dat desc");
			List<HspAdlInf> list= hspAdlInfMapper.selectByExample(hspAdlInfExample);
			if(list.size()>0)
				hspAdlInf=list.get(0);
		}
		return hspAdlInf;
	}
	
	//---------------------------------坠床跌倒评分-----------------------------

	@Override
	public List<HspZcddexpfInf> queryZcddList(
			HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception {
		List<HspZcddexpfInf> zcddList=null;
		if(hspXtpgInfQueryDto!=null){
			String emgSeq=hspXtpgInfQueryDto.getHspZcddexpfInfCustom().getEmgSeq();
			HspZcddexpfInfExample hspZcddexpfInfExample=new HspZcddexpfInfExample();
			HspZcddexpfInfExample.Criteria criteria=hspZcddexpfInfExample.createCriteria();
			criteria.andEmgSeqEqualTo(emgSeq);
			criteria.andCratDatIsNotNull();
			criteria.andZcddexpfScoIsNotNull();
			hspZcddexpfInfExample.setOrderByClause("crat_dat asc");
			zcddList=hspZcddexpfInfMapper.selectByExample(hspZcddexpfInfExample);
		}
		return zcddList;
	}

	@Override
	public void addZcddScore(HspXtpgInfQueryDto hspXtpgInfQueryDto)
			throws Exception {
		HspZcddexpfInfCustom hspZcddexpfInfCustom=hspXtpgInfQueryDto.getHspZcddexpfInfCustom();
		if(hspZcddexpfInfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspZcddexpfInfCustom.getXtpgSeq())){
				HspZcddexpfInf hspZcddexpfInf=hspZcddexpfInfMapper.selectByPrimaryKey(hspZcddexpfInfCustom.getXtpgSeq());
				if(hspZcddexpfInf!=null){
					hspZcddexpfInfCustom.setEmgSeq(hspZcddexpfInf.getEmgSeq());
					hspZcddexpfInfMapper.updateByPrimaryKey(hspZcddexpfInfCustom);
				}
			}else{
				hspZcddexpfInfCustom.setXtpgSeq(UUIDBuild.getUUID());
				hspZcddexpfInfMapper.insert(hspZcddexpfInfCustom);
			}
		}
		
	}

	@Override
	public void delZcddScore(String xtpgSeq) throws Exception {
		if(StringUtils.isNotNullAndEmptyByTrim(xtpgSeq)){
			if(xtpgSeq.length()<=18){
				HspZcddexpfInf hspZcddexpfInf=hspZcddexpfInfMapper.selectByPrimaryKey(xtpgSeq);
				String emgSeq=hspZcddexpfInf.getEmgSeq();
				HspHlpgb hspHlpgb=hspHlpgbMapper.selectByPrimaryKey(emgSeq);
				hspHlpgb.setFalldSeq(null);
				hspHlpgbMapper.updateByPrimaryKey(hspHlpgb);
			}
			hspZcddexpfInfMapper.deleteByPrimaryKey(xtpgSeq);
		}
	}

	@Override
	public HspZcddexpfInf findZcddScoreByXtpgSeq(String xtpgSeq)
			throws Exception {
		if(StringUtils.isNotNullAndEmptyByTrim(xtpgSeq)){
			return hspZcddexpfInfMapper.selectByPrimaryKey(xtpgSeq);
		}
		return null;
	}
	
	/**
	 * 获取最新一条adl评分
	 */
	@Override
	public HspZcddexpfInf findFirstZcddScore(String emgSeq) throws Exception {
		HspZcddexpfInf hspZcddexpfInf=null;
		if(StringUtils.isNotNullAndEmptyByTrim(emgSeq)){
			HspZcddexpfInfExample hspZcddexpfInfExample=new HspZcddexpfInfExample();
			HspZcddexpfInfExample.Criteria criteria=hspZcddexpfInfExample.createCriteria();
			criteria.andEmgSeqEqualTo(emgSeq);
			criteria.andCratDatIsNotNull();
			criteria.andZcddexpfScoIsNotNull();
			hspZcddexpfInfExample.setOrderByClause("crat_dat desc");
			List<HspZcddexpfInf> list= hspZcddexpfInfMapper.selectByExample(hspZcddexpfInfExample);
			if(list.size()>0)
				hspZcddexpfInf=list.get(0);
		}
		return hspZcddexpfInf;
	}
	
	// ---------------------------------Nrs评分-------------------------------------
	@Override
	public List<HspNrsInf> queryNrsList(
			HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception {
		List<HspNrsInf> nrsList = null;
		if (hspXtpgInfQueryDto != null) {
			String emgSeq = hspXtpgInfQueryDto.getHspNrsInfCustom().getEmgSeq();
			HspNrsInfExample hspNrsInfExample = new HspNrsInfExample();
			HspNrsInfExample.Criteria criteria = hspNrsInfExample.createCriteria();
			criteria.andEmgSeqEqualTo(emgSeq);
			//criteria.andNrsStatusEqualTo("1");
			//criteria.andNrsDatIsNotNull();
			criteria.andNrsScoIsNotNull();
			if (hspXtpgInfQueryDto.getStartdate() != null) {
				criteria.andNrsDatGreaterThanOrEqualTo(hspXtpgInfQueryDto.getStartdate());
			}
			if (hspXtpgInfQueryDto.getEnddate() != null) {
				criteria.andNrsDatLessThanOrEqualTo(hspXtpgInfQueryDto.getEnddate());
			}
			hspNrsInfExample.setOrderByClause("nrs_dat desc NULLS LAST");
			nrsList = hspNrsInfMapper.selectByExample(hspNrsInfExample);
		}
		return nrsList;
	}

	@Override
	public void addNrsScore(HspXtpgInfQueryDto hspXtpgInfQueryDto,ActiveUser activeUser)
			throws Exception {
		HspNrsInfCustom hspNrsInfCustom = hspXtpgInfQueryDto.getHspNrsInfCustom();
		if (hspNrsInfCustom != null) {
			if (StringUtils.isNotNullAndEmptyByTrim(hspNrsInfCustom.getXtpgSeq())) {
				HspNrsInf hspNrsInf = hspNrsInfMapper.selectByPrimaryKey(hspNrsInfCustom.getXtpgSeq());
				if (hspNrsInf != null) {
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
				hspNrsInfCustom.setXtpgSeq(UUIDBuild.getUUID());
				hspNrsInfCustom.setCrtUsrNme(activeUser.getUsrname());
				hspNrsInfCustom.setCrtUsrNo(activeUser.getUsrno());
				hspNrsInfCustom.setUpdTime(new Date());
				hspNrsInfCustom.setUpdUsrNme(activeUser.getUsrname());
				hspNrsInfCustom.setUpdUsrNo(activeUser.getUsrno());
				hspNrsInfCustom.setNrsStatus("1");
				hspNrsInfMapper.insert(hspNrsInfCustom);
			}
		}

	}

	/**
	 * 评分查询删除首条默认赋值的nrs和gcs评分时，将急诊创伤和护理记录的关联值改成-1
	 * 这样能保证护士如果不想要首条默认预检的时候可以去评分查询删除 就不会再默认赋值
	 */
	@Override
	public void delNrsScore(String xtpgSeq) throws Exception {
		if (StringUtils.isNotNullAndEmptyByTrim(xtpgSeq)) {
			if(xtpgSeq.indexOf("H-") != -1){
				HspNrsInf hspNrsInf = hspNrsInfMapper.selectByPrimaryKey(xtpgSeq);
				String emgSeq = hspNrsInf.getEmgSeq();
				HspHlpgb hspHlpgb = hspHlpgbMapper.selectByPrimaryKey(emgSeq);
				hspHlpgb.setNrsSeq(null);
				hspHlpgbMapper.updateByPrimaryKey(hspHlpgb);
			}
			if (xtpgSeq.indexOf("HCS-") != -1) {
				HspNrsInf hspNrsInf = hspNrsInfMapper.selectByPrimaryKey(xtpgSeq);
				HspJzcspgInf hspJzcspgInf = hspJzcspgInfMapper.selectByPrimaryKey(hspNrsInf.getEmgSeq());
				hspJzcspgInf.setNrsSeq("-1");  
				hspJzcspgInfMapper.updateByPrimaryKey(hspJzcspgInf);
			}
			//HLIJL- + 16位序号
			if(xtpgSeq.indexOf("HLIJL-") != -1){
				List<HspHljldInf> list = new ArrayList<HspHljldInf>();
				HspHljldInfExample hspHljldInfInfExample = new HspHljldInfExample();
				HspHljldInfExample.Criteria criteria = hspHljldInfInfExample.createCriteria();
				criteria.andNrsSeqEqualTo(xtpgSeq);
				list = hspHljldInfMapper.selectByExample(hspHljldInfInfExample);
				if(list.size()>0){
					String bqhiSeq = list.get(0).getBqhiSeq();
					HspHljldInf hspHljldInf=hspHljldInfMapper.selectByPrimaryKey(bqhiSeq);
					hspHljldInf.setNrsSeq(null);
					hspHljldInfMapper.updateByPrimaryKey(hspHljldInf);
				}
			}
			hspNrsInfMapper.deleteByPrimaryKey(xtpgSeq);
		}
	}

	@Override
	public HspNrsInf findNrsScoreByXtpgSeq(String xtpgSeq)
			throws Exception {
		if (StringUtils.isNotNullAndEmptyByTrim(xtpgSeq)) {
			return hspNrsInfMapper.selectByPrimaryKey(xtpgSeq);
		}
		return null;
	}
	
	/**
	 * 获取最新一条Nrs评分
	 */
	@Override
	public HspNrsInf findFirstNrsScore(String emgSeq) throws Exception {
		HspNrsInf hspNrsInf=null;
		if(StringUtils.isNotNullAndEmptyByTrim(emgSeq)){
			HspNrsInfExample hspNrsInfExample=new HspNrsInfExample();
			HspNrsInfExample.Criteria criteria=hspNrsInfExample.createCriteria();
			criteria.andEmgSeqEqualTo(emgSeq);
			criteria.andNrsStatusEqualTo("1");
			//criteria.andNrsDatIsNotNull();
			criteria.andNrsScoIsNotNull();
			//去除医生填写的疼痛评分（门急诊病历疼痛评分）
			criteria.andXtpgSeqNotLike("DOC-%");
			hspNrsInfExample.setOrderByClause("nrs_dat desc NULLS LAST");
			List<HspNrsInf> list= hspNrsInfMapper.selectByExample(hspNrsInfExample);
			if(list.size()>0)
				hspNrsInf=list.get(0);
		}
		return hspNrsInf;
	}

	
	@Override
	public List<HspGcsInf> queryGcsList(HspXtpgInfQueryDto hspXtpgInfQueryDto)
			throws Exception {
		List<HspGcsInf> gcsList=null;
		if(hspXtpgInfQueryDto!=null){
			String gcsSeq=hspXtpgInfQueryDto.getHspGcsInfCustom().getGcsSeq();
			HspGcsInfExample hspGcsInfExample=new HspGcsInfExample();
			HspGcsInfExample.Criteria criteria=hspGcsInfExample.createCriteria();
			criteria.andGcsSeqEqualTo(gcsSeq);
			criteria.andTotScoIsNotNull();
			if (hspXtpgInfQueryDto.getStartdate() != null) {
				criteria.andCratDatGreaterThanOrEqualTo(hspXtpgInfQueryDto.getStartdate());
			}
			if (hspXtpgInfQueryDto.getEnddate() != null) {
				criteria.andCratDatLessThanOrEqualTo(hspXtpgInfQueryDto.getEnddate());
			}
			hspGcsInfExample.setOrderByClause("crat_dat DESC NULLS LAST");
			gcsList=hspGcsInfMapper.selectByExample(hspGcsInfExample);
		}
		return gcsList;
	}

	@Override
	public void addGcsScore(HspXtpgInfQueryDto hspXtpgInfQueryDto,ActiveUser activeUser)throws Exception {
		HspGcsInfCustom hspGcsInfCustom=hspXtpgInfQueryDto.getHspGcsInfCustom();
		if(hspGcsInfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspGcsInfCustom.getEmgSeq())){
				HspGcsInf hspGcsInf=hspGcsInfMapper.selectByPrimaryKey(hspGcsInfCustom.getEmgSeq());
				if(hspGcsInf!=null){
					hspGcsInfCustom.setCrtUsrNme(hspGcsInf.getCrtUsrNme());
					hspGcsInfCustom.setCrtUsrNo(hspGcsInf.getCrtUsrNo());
					hspGcsInfCustom.setUpdTime(new Date());
					hspGcsInfCustom.setUpdUsrNme(activeUser.getUsrname());
					hspGcsInfCustom.setUpdUsrNo(activeUser.getUsrno());
					hspGcsInfCustom.setEmgSeq(hspGcsInf.getEmgSeq());
					hspGcsInfMapper.updateByPrimaryKey(hspGcsInfCustom);
				}
				else{
					hspGcsInfCustom.setCrtUsrNme(activeUser.getUsrname());
					hspGcsInfCustom.setCrtUsrNo(activeUser.getUsrno());
					hspGcsInfCustom.setUpdTime(new Date());
					hspGcsInfCustom.setUpdUsrNme(activeUser.getUsrname());
					hspGcsInfCustom.setUpdUsrNo(activeUser.getUsrno());
					hspGcsInfMapper.insert(hspGcsInfCustom);
				}
			}else{
				hspGcsInfCustom.setEmgSeq(UUIDBuild.getUUID());
				hspGcsInfCustom.setCrtUsrNme(activeUser.getUsrname());
				hspGcsInfCustom.setCrtUsrNo(activeUser.getUsrno());
				hspGcsInfCustom.setUpdTime(new Date());
				hspGcsInfCustom.setUpdUsrNme(activeUser.getUsrname());
				hspGcsInfCustom.setUpdUsrNo(activeUser.getUsrno());
				hspGcsInfMapper.insert(hspGcsInfCustom);
			}
		}
	}
	
	@Override
	public List<HspZjpfInf> queryZjpfList(HspXtpgInfQueryDto hspXtpgInfQueryDto)
			throws Exception {
		List<HspZjpfInf> zjpfList=null;
		if(hspXtpgInfQueryDto!=null){
			String emgSeq=hspXtpgInfQueryDto.getHspZjpfInfCustom().getEmgSeq();
			HspZjpfInfExample hspZjpfInfExample=new HspZjpfInfExample();
			HspZjpfInfExample.Criteria criteria=hspZjpfInfExample.createCriteria();
			criteria.andEmgSeqEqualTo(emgSeq);
			criteria.andZjpfZfIsNotNull();
			if (hspXtpgInfQueryDto.getStartdate() != null) {
				criteria.andCratDatGreaterThanOrEqualTo(hspXtpgInfQueryDto.getStartdate());
			}
			if (hspXtpgInfQueryDto.getEnddate() != null) {
				criteria.andCratDatLessThanOrEqualTo(hspXtpgInfQueryDto.getEnddate());
			}
			hspZjpfInfExample.setOrderByClause("crat_dat DESC NULLS LAST");
			zjpfList=hspZjpfInfMapper.selectByExample(hspZjpfInfExample);
		}
		return zjpfList;
	}
	
	@Override
	public HspZjpfInf findZjpfScoreByXtpgSeq(String zjpfSeq) throws Exception {
		if(StringUtils.isNotNullAndEmptyByTrim(zjpfSeq)){
			return hspZjpfInfMapper.selectByPrimaryKey(zjpfSeq);
		}
		return null;
	}
	
	@Override
	public void addZjpfScore(HspXtpgInfQueryDto hspXtpgInfQueryDto,ActiveUser activeUser)throws Exception {
		HspZjpfInfCustom hspZjpfInfCustom=hspXtpgInfQueryDto.getHspZjpfInfCustom();
		if(hspZjpfInfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspZjpfInfCustom.getZjpfSeq())){
				HspZjpfInf hspZjpfInf=hspZjpfInfMapper.selectByPrimaryKey(hspZjpfInfCustom.getZjpfSeq());
				if(hspZjpfInf!=null){
					hspZjpfInfCustom.setCrtUsrNme(hspZjpfInf.getCrtUsrNme());
					hspZjpfInfCustom.setCrtUsrNo(hspZjpfInf.getCrtUsrNo());
					hspZjpfInfCustom.setEmgSeq(hspZjpfInf.getEmgSeq());
					hspZjpfInfCustom.setJlDat(new Date());
					hspZjpfInfCustom.setPfType(hspZjpfInf.getPfType());
					hspZjpfInfMapper.updateByPrimaryKey(hspZjpfInfCustom);
				}
			}else{
				hspZjpfInfCustom.setZjpfSeq(UUIDBuild.getUUID());
				hspZjpfInfCustom.setJlDat(new Date());
				hspZjpfInfCustom.setCrtUsrNme(activeUser.getUsrname());
				hspZjpfInfCustom.setCrtUsrNo(activeUser.getUsrno());
				hspZjpfInfCustom.setPfType("3");
				hspZjpfInfMapper.insert(hspZjpfInfCustom);
			}
		}
	}

	@Override
	public void delZjpfScore(String zjpfSeq) throws Exception {
		if(StringUtils.isNotNullAndEmptyByTrim(zjpfSeq)){
			hspZjpfInfMapper.deleteByPrimaryKey(zjpfSeq);
		}
	}
	
	
	/**
	 * 评分查询删除首条默认赋值的nrs和gcs评分时，将急诊创伤和护理记录的关联值改成-1
	 * 这样能保证护士如果不想要首条默认预检的时候可以去评分查询删除 就不会再默认赋值
	 */
	@Override
	public void delGcsScore(String emgSeq) throws Exception {
		if(StringUtils.isNotNullAndEmptyByTrim(emgSeq)){
			if(emgSeq.indexOf("H-") != -1){
				HspGcsInf hspGcsInf = hspGcsInfMapper.selectByPrimaryKey(emgSeq);
				String gcsSeq = hspGcsInf.getGcsSeq();
				HspHlpgb hspHlpgb = hspHlpgbMapper.selectByPrimaryKey(gcsSeq);
				hspHlpgb.setGcsSeq(null);
				hspHlpgbMapper.updateByPrimaryKey(hspHlpgb);
			}
			if (emgSeq.indexOf("HCS-") != -1) {
				HspGcsInf hspGcsInf = hspGcsInfMapper.selectByPrimaryKey(emgSeq);
				HspJzcspgInf hspJzcspgInf = hspJzcspgInfMapper.selectByPrimaryKey(hspGcsInf.getGcsSeq());
				hspJzcspgInf.setGcsSeq("-1");
				hspJzcspgInfMapper.updateByPrimaryKey(hspJzcspgInf);
			}
			//HLIJL- + 16位序号
			if(emgSeq.indexOf("HLIJL-") != -1){
				List<HspHljldInf> list = new ArrayList<HspHljldInf>();
				HspHljldInfExample hspHljldInfInfExample = new HspHljldInfExample();
				HspHljldInfExample.Criteria criteria = hspHljldInfInfExample.createCriteria();
				criteria.andGcsSeqEqualTo(emgSeq);
				list = hspHljldInfMapper.selectByExample(hspHljldInfInfExample);
				if(list.size()>0){
					String bqhiSeq = list.get(0).getBqhiSeq();
					HspHljldInf hspHljldInf=hspHljldInfMapper.selectByPrimaryKey(bqhiSeq);
					hspHljldInf.setGcsSeq(null);
					hspHljldInfMapper.updateByPrimaryKey(hspHljldInf);
				}
			}
			hspGcsInfMapper.deleteByPrimaryKey(emgSeq);
		}
	}

	@Override
	public HspGcsInf findGcsScoreByXtpgSeq(String emgSeq) throws Exception {
		if(StringUtils.isNotNullAndEmptyByTrim(emgSeq)){
			return hspGcsInfMapper.selectByPrimaryKey(emgSeq);
		}
		return null;
	}

	@Override
	public HspGcsInf findFirstGcsScore(String gscSeq) throws Exception {
		HspGcsInf hspGcsInf=null;
		if(StringUtils.isNotNullAndEmptyByTrim(gscSeq)){
			HspGcsInfExample hspGcsInfExample=new HspGcsInfExample();
			HspGcsInfExample.Criteria criteria=hspGcsInfExample.createCriteria();
			criteria.andGcsSeqEqualTo(gscSeq);
//			criteria.andCratDatIsNotNull();
			criteria.andTotScoIsNotNull();
			hspGcsInfExample.setOrderByClause("crat_dat DESC NULLS LAST");
			List<HspGcsInf> list= hspGcsInfMapper.selectByExample(hspGcsInfExample);
			if(list.size()>0)
				hspGcsInf=list.get(0);
		}
		return hspGcsInf;
	}
	
	@Override
	public HspFallriskInf findFirstFallriskByEmgSeq(String emgSeq) throws Exception {
		HspFallriskInf hspFallriskInf=null;
		if(StringUtils.isNotNullAndEmptyByTrim(emgSeq)){
			HspFallriskInfExample hspFallriskInfExample=new HspFallriskInfExample();
			HspFallriskInfExample.Criteria criteria=hspFallriskInfExample.createCriteria();
			criteria.andEmgSeqEqualTo(emgSeq);
			criteria.andRiskScoIsNotNull();
			hspFallriskInfExample.setOrderByClause("CRET_DAT DESC NULLS LAST");
			List<HspFallriskInf> list= hspFallriskInfMapper.selectByExample(hspFallriskInfExample);
			if(list.size()>0)
				hspFallriskInf=list.get(0);
		}
		return hspFallriskInf;
	}
	
	@Override
	public List<HspFallriskInf> findFallriskListByEmgSeq(HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception {
		List<HspFallriskInf> list=new ArrayList<HspFallriskInf>();
		if(hspXtpgInfQueryDto.getHspFallriskInfCustom()==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920,new Object[] {"数据有误，请刷新重来!"}));
		}
		String emgSeq=hspXtpgInfQueryDto.getHspFallriskInfCustom().getEmgSeq();
		String fallRiskFlg=hspXtpgInfQueryDto.getHspFallriskInfCustom().getFallRiskFlg();
		if(StringUtils.isNotNullAndEmptyByTrim(emgSeq)){
			HspFallriskInfExample hspFallriskInfExample=new HspFallriskInfExample();
			HspFallriskInfExample.Criteria criteria=hspFallriskInfExample.createCriteria();
			criteria.andRiskSpare1EqualTo(fallRiskFlg);
			criteria.andEmgSeqEqualTo(emgSeq);
			criteria.andRiskScoIsNotNull();
			if (hspXtpgInfQueryDto.getStartdate() != null) {
				criteria.andCretDatGreaterThanOrEqualTo(hspXtpgInfQueryDto.getStartdate());
			}
			if (hspXtpgInfQueryDto.getEnddate() != null) {
				criteria.andCretDatLessThanOrEqualTo(hspXtpgInfQueryDto.getEnddate());
			}	
			hspFallriskInfExample.setOrderByClause("CRET_DAT DESC NULLS LAST");
			list= hspFallriskInfMapper.selectByExample(hspFallriskInfExample);
		}
		return list;
	}
	
	@Override
	public HspFallriskInf findFallriskById(String id) throws Exception {
		if(StringUtils.isNotNullAndEmptyByTrim(id)){
			return hspFallriskInfMapper.selectByPrimaryKey(id);
		}
		return null;
	}
	
	@Override
	public void addFallRisk(HspXtpgInfQueryDto hspXtpgInfQueryDto,ActiveUser activeUser)
			throws Exception {
		HspFallriskInfCustom hspFallriskInfCustom=hspXtpgInfQueryDto.getHspFallriskInfCustom();
		if(hspFallriskInfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspFallriskInfCustom.getFallriskSeq())){
				HspFallriskInf hspFallriskInf=hspFallriskInfMapper.selectByPrimaryKey(hspFallriskInfCustom.getFallriskSeq());
				if(hspFallriskInf!=null){
					hspFallriskInfCustom.setCrtUsrNme(hspFallriskInf.getCrtUsrNme());
					hspFallriskInfCustom.setCrtUsrNo(hspFallriskInf.getCrtUsrNo());
					hspFallriskInfCustom.setUpdTime(new Date());
					hspFallriskInfCustom.setUpdUsrNme(activeUser.getUsrname());
					hspFallriskInfCustom.setUpdUsrNo(activeUser.getUsrno());
					hspFallriskInfCustom.setEmgSeq(hspFallriskInf.getEmgSeq());
					hspFallriskInfMapper.updateByPrimaryKey(hspFallriskInfCustom);
				}
			}else{
				hspFallriskInfCustom.setFallriskSeq(UUIDBuild.getUUID());
				hspFallriskInfCustom.setCrtUsrNme(activeUser.getUsrname());
				hspFallriskInfCustom.setCrtUsrNo(activeUser.getUsrno());
				hspFallriskInfCustom.setUpdTime(new Date());
				hspFallriskInfCustom.setUpdUsrNme(activeUser.getUsrname());
				hspFallriskInfCustom.setUpdUsrNo(activeUser.getUsrno());
				hspFallriskInfMapper.insert(hspFallriskInfCustom);
			}
		}
	}

	@Override
	public void delFallRisk(String fallriskSeq) throws Exception {
		if(StringUtils.isNotNullAndEmptyByTrim(fallriskSeq)){
			hspFallriskInfMapper.deleteByPrimaryKey(fallriskSeq);
		}
	}

	@Override
	public HspZyfxpfInf findZyfxpfScoreByZyfxpfSeq(String zyfxpfSeq) throws Exception {
		if(StringUtils.isNotNullAndEmptyByTrim(zyfxpfSeq)){
			return hspZyfxpfInfMapper.selectByPrimaryKey(zyfxpfSeq);
		}
		return null;
	}

	
	public List<HspZyfxpfInf> queryZyfxpfList(HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception {
		List<HspZyfxpfInf> zyfxpfList=null;
		if(hspXtpgInfQueryDto!=null){
			String emgSeq=hspXtpgInfQueryDto.getHspZyfxpfInfCustom().getEmgSeq();
			HspZyfxpfInfExample hspZyfxpfInfExample=new HspZyfxpfInfExample();
			HspZyfxpfInfExample.Criteria criteria=hspZyfxpfInfExample.createCriteria();
			criteria.andEmgSeqEqualTo(emgSeq);
			criteria.andZyfxpfScoIsNotNull();
			if (hspXtpgInfQueryDto.getStartdate() != null) {
				criteria.andCrttimeGreaterThanOrEqualTo(hspXtpgInfQueryDto.getStartdate());
			}
			if (hspXtpgInfQueryDto.getEnddate() != null) {
				criteria.andCrttimeLessThanOrEqualTo(hspXtpgInfQueryDto.getEnddate());
			}
			hspZyfxpfInfExample.setOrderByClause("crttime desc NULLS LAST");
			zyfxpfList=hspZyfxpfInfMapper.selectByExample(hspZyfxpfInfExample);
		}
		return zyfxpfList;
	}
	
	public void addZyfxpfScore(HspXtpgInfQueryDto hspXtpgInfQueryDto,ActiveUser activeUser)
			throws Exception {
		HspZyfxpfInfCustom hspZyfxpfInfCustom=hspXtpgInfQueryDto.getHspZyfxpfInfCustom();
	
		if(hspZyfxpfInfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspZyfxpfInfCustom.getZyfxpfSeq())){
				HspZyfxpfInf hspZyfxpfInf=hspZyfxpfInfMapper.selectByPrimaryKey(hspZyfxpfInfCustom.getZyfxpfSeq());
				if(hspZyfxpfInf!=null){
					hspZyfxpfInfCustom.setCrtusrno(hspZyfxpfInf.getCrtusrno());
					hspZyfxpfInfCustom.setCrtusrnme(hspZyfxpfInf.getCrtusrnme());
					hspZyfxpfInfCustom.setCrttime(hspZyfxpfInfCustom.getCrttime());
					hspZyfxpfInfCustom.setUpdusrno(activeUser.getUsrno());
					hspZyfxpfInfCustom.setUpdusrnme(activeUser.getUsrname());
					hspZyfxpfInfCustom.setUpdtime(new Date());
					hspZyfxpfInfMapper.updateByPrimaryKey(hspZyfxpfInfCustom);
				}
			}else{
				hspZyfxpfInfCustom.setZyfxpfSeq(UUIDBuild.getUUID());
				hspZyfxpfInfCustom.setCrtusrno(activeUser.getUsrno());
				hspZyfxpfInfCustom.setCrtusrnme(activeUser.getUsrname());
				hspZyfxpfInfCustom.setCrttime(hspZyfxpfInfCustom.getCrttime());
				hspZyfxpfInfCustom.setUpdusrno(activeUser.getUsrno());
				hspZyfxpfInfCustom.setUpdusrnme(activeUser.getUsrname());
				hspZyfxpfInfCustom.setUpdtime(new Date());
				hspZyfxpfInfMapper.insert(hspZyfxpfInfCustom);
			}
		}
	}
	
	public void delZyfxpfScore(String zyfxpfSeq) throws Exception {
		if(StringUtils.isNotNullAndEmptyByTrim(zyfxpfSeq)){
			if(zyfxpfSeq.indexOf("H-") != -1){
				HspZyfxpfInf hspZyfxpfInf=hspZyfxpfInfMapper.selectByPrimaryKey(zyfxpfSeq);
				String emgSeq=hspZyfxpfInf.getEmgSeq();
				HspHlpgb hspHlpgb=hspHlpgbMapper.selectByPrimaryKey(emgSeq);
				hspHlpgb.setZyfxpfSeq(null);
				hspHlpgbMapper.updateByPrimaryKey(hspHlpgb);
			}
			if (zyfxpfSeq.indexOf("HCS-") != -1) {
				HspZyfxpfInf hspZyfxpfInf=hspZyfxpfInfMapper.selectByPrimaryKey(zyfxpfSeq);
				HspJzcspgInf hspJzcspgInf = hspJzcspgInfMapper.selectByPrimaryKey(hspZyfxpfInf.getEmgSeq());
				hspJzcspgInf.setZyfxpfSeq(null);
				hspJzcspgInfMapper.updateByPrimaryKey(hspJzcspgInf);
			}
			//HLIJL- + 16位序号
			if(zyfxpfSeq.indexOf("HLIJL-") != -1){
				List<HspHljldInf> list = new ArrayList<HspHljldInf>();
				HspHljldInfExample hspHljldInfInfExample = new HspHljldInfExample();
				HspHljldInfExample.Criteria criteria = hspHljldInfInfExample.createCriteria();
				criteria.andZyfxpfSeqEqualTo(zyfxpfSeq);
				list = hspHljldInfMapper.selectByExample(hspHljldInfInfExample);
				if(list.size()>0){
					String bqhiSeq = list.get(0).getBqhiSeq();
					HspHljldInf hspHljldInf=hspHljldInfMapper.selectByPrimaryKey(bqhiSeq);
					hspHljldInf.setZyfxpfSeq(null);
					hspHljldInfMapper.updateByPrimaryKey(hspHljldInf);
				}
			}
			hspZyfxpfInfMapper.deleteByPrimaryKey(zyfxpfSeq);
		}
	}
	
	/**
	 * 转运风险评分打印
	 */
	@Override
	public List<HspZyfxpfInfCustom> printfxpfScoreList(HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception {
		List<HspZyfxpfInfCustom> zyfxpfList=null;
		if(hspXtpgInfQueryDto!=null){
			String emgSeq=hspXtpgInfQueryDto.getHspZyfxpfInfCustom().getEmgSeq();
			HspZyfxpfInfExample hspZyfxpfInfExample=new HspZyfxpfInfExample();
			HspZyfxpfInfExample.Criteria criteria=hspZyfxpfInfExample.createCriteria();
			criteria.andEmgSeqEqualTo(emgSeq);
			criteria.andZyfxpfScoIsNotNull();
			hspZyfxpfInfExample.setOrderByClause("crttime desc NULLS LAST");
			zyfxpfList=hspZyfxpfInCustomfMapper.printfxpfScoreList(hspZyfxpfInfExample);
		}
		return zyfxpfList;
	}

	@Override
	public List<HspDdfxpgbInf> findMorseListByEmgSeq(HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception {
		List<HspDdfxpgbInf> list = new ArrayList<HspDdfxpgbInf>();
		if(hspXtpgInfQueryDto.getHspDdfxpgbInfCustom() == null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920,new Object[] {"数据有误，请刷新重来!"}));
		}
		String emgSeq = hspXtpgInfQueryDto.getHspDdfxpgbInfCustom().getEmgSeq();
		if(StringUtils.isNotNullAndEmptyByTrim(emgSeq)){
			HspDdfxpgbInfExample hspDdfxpgbInfExample = new HspDdfxpgbInfExample();
			HspDdfxpgbInfExample.Criteria criteria = hspDdfxpgbInfExample.createCriteria();
			criteria.andEmgSeqEqualTo(emgSeq);
			criteria.andZfIsNotNull();
			if (hspXtpgInfQueryDto.getStartdate() != null) {
				criteria.andCretDatGreaterThanOrEqualTo(hspXtpgInfQueryDto.getStartdate());
			}
			if (hspXtpgInfQueryDto.getEnddate() != null) {
				criteria.andCretDatLessThanOrEqualTo(hspXtpgInfQueryDto.getEnddate());
			}	
			hspDdfxpgbInfExample.setOrderByClause("CRET_DAT DESC NULLS LAST");
			list = hspDdfxpgbInfMapper.selectByExample(hspDdfxpgbInfExample);
		}
		return list;
	}

	@Override
	public HspDdfxpgbInf findMorseByDdfxpgbSeq(String ddfxpgbSeq) throws Exception {
		if(StringUtils.isNotNullAndEmptyByTrim(ddfxpgbSeq)){
			return hspDdfxpgbInfMapper.selectByPrimaryKey(ddfxpgbSeq);
		}
		return null;
	}

	@Override
	public void addMorseScore(HspXtpgInfQueryDto hspXtpgInfQueryDto, ActiveUser activeUser) throws Exception {
		HspDdfxpgbInfCustom hspDdfxpgbInfCustom = hspXtpgInfQueryDto.getHspDdfxpgbInfCustom();
		if(hspDdfxpgbInfCustom != null){
			if (StringUtils.isNotNullAndEmptyByTrim(hspDdfxpgbInfCustom.getDdfxpgbSeq())) {
				HspDdfxpgbInf hspDdfxpgbInf = hspDdfxpgbInfMapper.selectByPrimaryKey(hspDdfxpgbInfCustom.getDdfxpgbSeq());
				if (hspDdfxpgbInf != null) {
					hspDdfxpgbInfCustom.setCrtUsrNo(hspDdfxpgbInf.getCrtUsrNo());
					hspDdfxpgbInfCustom.setCrtUsrNme(hspDdfxpgbInf.getCrtUsrNme());
					hspDdfxpgbInfCustom.setUpdUsrNo(activeUser.getUsrno());
					hspDdfxpgbInfCustom.setUpdUsrNme(activeUser.getUsrname());
					hspDdfxpgbInfMapper.updateByPrimaryKey(hspDdfxpgbInfCustom);
				}
			}else {
				hspDdfxpgbInfCustom.setDdfxpgbSeq(UUIDBuild.getUUID());
				hspDdfxpgbInfCustom.setCrtUsrNo(activeUser.getUsrno());
				hspDdfxpgbInfCustom.setCrtUsrNme(activeUser.getUsrname());
				hspDdfxpgbInfMapper.insertSelective(hspDdfxpgbInfCustom);
			}
		}
	}

	@Override
	public void delMorseScore(String ddfxpgbSeq) throws Exception {
		if(StringUtils.isNotNullAndEmptyByTrim(ddfxpgbSeq)){
			if(ddfxpgbSeq.indexOf("H-") != -1){
				HspDdfxpgbInf hspDdfxpgbInf = hspDdfxpgbInfMapper.selectByPrimaryKey(ddfxpgbSeq);
				String emgSeq = hspDdfxpgbInf.getEmgSeq();
				HspHlpgb hspHlpgb = hspHlpgbMapper.selectByPrimaryKey(emgSeq);
				hspHlpgb.setDdfxpgbSeq(null);
				hspHlpgbMapper.updateByPrimaryKey(hspHlpgb);
			}
			if (ddfxpgbSeq.indexOf("HCS-") != -1) {
				HspDdfxpgbInf hspDdfxpgbInf = hspDdfxpgbInfMapper.selectByPrimaryKey(ddfxpgbSeq);
				HspJzcspgInf hspJzcspgInf = hspJzcspgInfMapper.selectByPrimaryKey(hspDdfxpgbInf.getEmgSeq());
				hspJzcspgInf.setDdfxpgbSeq(null);
				hspJzcspgInfMapper.updateByPrimaryKey(hspJzcspgInf);
			}
			//HLIJL- + 16位序号
			if(ddfxpgbSeq.indexOf("HLIJL-") != -1){
				List<HspHljldInf> list = new ArrayList<HspHljldInf>();
				HspHljldInfExample hspHljldInfInfExample = new HspHljldInfExample();
				HspHljldInfExample.Criteria criteria = hspHljldInfInfExample.createCriteria();
				criteria.andDdfxpgbSeqEqualTo(ddfxpgbSeq);
				list = hspHljldInfMapper.selectByExample(hspHljldInfInfExample);
				if(list.size()>0){
					String bqhiSeq = list.get(0).getBqhiSeq();
					HspHljldInf hspHljldInf=hspHljldInfMapper.selectByPrimaryKey(bqhiSeq);
					hspHljldInf.setDdfxpgbSeq(null);
					hspHljldInfMapper.updateByPrimaryKey(hspHljldInf);
				}
			}
			hspDdfxpgbInfMapper.deleteByPrimaryKey(ddfxpgbSeq);
		}
	}

	@Override
	public HspDdfxpgbInf findFirstMorseByEmgSeq(String emgSeq) throws Exception {
		HspDdfxpgbInf hspDdfxpgbInf = null;
		if(StringUtils.isNotNullAndEmptyByTrim(emgSeq)){
			HspDdfxpgbInfExample hspDdfxpgbInfExample = new HspDdfxpgbInfExample();
			HspDdfxpgbInfExample.Criteria criteria = hspDdfxpgbInfExample.createCriteria();
			criteria.andEmgSeqEqualTo(emgSeq);
			criteria.andZfIsNotNull();
			hspDdfxpgbInfExample.setOrderByClause("CRET_DAT DESC NULLS LAST");
			List<HspDdfxpgbInf> list = hspDdfxpgbInfMapper.selectByExample(hspDdfxpgbInfExample);
			if(list.size()>0)
				hspDdfxpgbInf = list.get(0);
		}
		return hspDdfxpgbInf;
	}

	/*逻辑：首条护理记录单时，将从入院护理评估单和创伤入院护理评估两者中取对应评分项中的最新一条评分传递到页面赋值*/
	@Override
	public HspHljldInfCustom findFirstScoByEmgSeq(String emgSeq) throws Exception {	
		HspHljldInfCustom hsphljldCustom = new HspHljldInfCustom();
		
		HspBradenInfExample hspBradenInfExample=new HspBradenInfExample();
		HspBradenInfExample.Criteria hspBradenInfCriteria=hspBradenInfExample.createCriteria();
		hspBradenInfCriteria.andEmgSeqEqualTo(emgSeq);
		hspBradenInfCriteria.andBradenScoIsNotNull();
		List<HspBradenInf> bradenInflist = hspBradenInfMapper.selectByExample(hspBradenInfExample);		
		if (bradenInflist.size() != 0) {
			HspBradenInf hspBradenInf1 = null;
			HspBradenInf hspBradenInf2 = null;
			for (HspBradenInf hspBradenInf : bradenInflist) {
				if (hspBradenInf.getXtpgSeq().indexOf("HCS-") != -1) {
					hspBradenInf1 = hspBradenInf;
				}
				if (hspBradenInf.getXtpgSeq().indexOf("H-") != -1) {
					hspBradenInf2 = hspBradenInf;
				}
			}
			if (hspBradenInf1 == null && hspBradenInf2 != null) {
				hsphljldCustom.setBradenSeq(hspBradenInf2.getXtpgSeq());
				hsphljldCustom.setBradenSco(hspBradenInf2.getBradenSco().toString());
			}else if (hspBradenInf2 == null && hspBradenInf1 != null) {
				hsphljldCustom.setBradenSeq(hspBradenInf1.getXtpgSeq());
				hsphljldCustom.setBradenSco(hspBradenInf1.getBradenSco().toString());
			}else if (hspBradenInf1 != null && hspBradenInf2 != null) {
				if (hspBradenInf1.getCratDat().before(hspBradenInf2.getCratDat())) {
					hsphljldCustom.setBradenSeq(hspBradenInf2.getXtpgSeq());
					hsphljldCustom.setBradenSco(hspBradenInf2.getBradenSco().toString());
				}else {
					hsphljldCustom.setBradenSeq(hspBradenInf1.getXtpgSeq());
					hsphljldCustom.setBradenSco(hspBradenInf1.getBradenSco().toString());
				}
			}		
		}

		HspAdlInfExample hspAdlInfExample=new HspAdlInfExample();
		HspAdlInfExample.Criteria hspAdlInfCriteria=hspAdlInfExample.createCriteria();
		hspAdlInfCriteria.andEmgSeqEqualTo(emgSeq);
		hspAdlInfCriteria.andAdlScoIsNotNull();
		List<HspAdlInf> hspAdlInflist = hspAdlInfMapper.selectByExample(hspAdlInfExample);
		if (hspAdlInflist.size() != 0) {
			HspAdlInf hspAdlInf1 = null;
			HspAdlInf hspAdlInf2 = null;
			for (HspAdlInf hspAdlInf : hspAdlInflist) {
				if (hspAdlInf.getXtpgSeq().indexOf("HCS-") != -1) {
					hspAdlInf1 = hspAdlInf;
				}
				if (hspAdlInf.getXtpgSeq().indexOf("H-") != -1) {
					hspAdlInf2 = hspAdlInf;
				}
			}
			if (hspAdlInf1 == null && hspAdlInf2 != null) {
				hsphljldCustom.setAdlSeq(hspAdlInf2.getXtpgSeq());
				hsphljldCustom.setAdlSco(hspAdlInf2.getAdlSco().toString());
			}else if (hspAdlInf2 == null && hspAdlInf1 != null) {
				hsphljldCustom.setAdlSeq(hspAdlInf1.getXtpgSeq());
				hsphljldCustom.setAdlSco(hspAdlInf1.getAdlSco().toString());
			}else if (hspAdlInf1 != null && hspAdlInf2 != null) {
				if (hspAdlInf1.getCratDat().before(hspAdlInf2.getCratDat())) {
					hsphljldCustom.setAdlSeq(hspAdlInf2.getXtpgSeq());
					hsphljldCustom.setAdlSco(hspAdlInf2.getAdlSco().toString());
				}else {
					hsphljldCustom.setAdlSeq(hspAdlInf1.getXtpgSeq());
					hsphljldCustom.setAdlSco(hspAdlInf1.getAdlSco().toString());
				}
			}
		}
		
		HspNrsInfExample hspNrsInfExample = new HspNrsInfExample();
		HspNrsInfExample.Criteria hspNrsInfCriteria = hspNrsInfExample.createCriteria();
		hspNrsInfCriteria.andEmgSeqEqualTo(emgSeq);
		hspNrsInfCriteria.andNrsScoIsNotNull();
		List<HspNrsInf> nrsList = hspNrsInfMapper.selectByExample(hspNrsInfExample);
		if (nrsList.size() != 0) {
			HspNrsInf HspNrsInf1 = null;
			HspNrsInf HspNrsInf2 = null;
			for (HspNrsInf hspNrsInf : nrsList) {
				if (hspNrsInf.getXtpgSeq().indexOf("HCS-") != -1) {
					HspNrsInf1 = hspNrsInf;
				}
				if (hspNrsInf.getXtpgSeq().indexOf("H-") != -1) {
					HspNrsInf2 = hspNrsInf;
				}
			}
			if (HspNrsInf1 == null && HspNrsInf2 != null) {
				hsphljldCustom.setNrsSeq(HspNrsInf2.getXtpgSeq());
				hsphljldCustom.setNrsSco(HspNrsInf2.getNrsSco().toString());
			}else if (HspNrsInf2 == null && HspNrsInf1 != null) {
				hsphljldCustom.setNrsSeq(HspNrsInf1.getXtpgSeq());
				hsphljldCustom.setNrsSco(HspNrsInf1.getNrsSco().toString());
			}else if (HspNrsInf1 != null && HspNrsInf2 != null) {
				if (HspNrsInf1.getNrsDat().before(HspNrsInf2.getNrsDat())) {
					hsphljldCustom.setNrsSeq(HspNrsInf2.getXtpgSeq());
					hsphljldCustom.setNrsSco(HspNrsInf2.getNrsSco().toString());
				}else {
					hsphljldCustom.setNrsSeq(HspNrsInf1.getXtpgSeq());
					hsphljldCustom.setNrsSco(HspNrsInf1.getNrsSco().toString());
				}
			}
		}
		
		HspZyfxpfInfExample hspZyfxpfInfExample=new HspZyfxpfInfExample();
		HspZyfxpfInfExample.Criteria hspZyfxpfInfCriteria=hspZyfxpfInfExample.createCriteria();
		hspZyfxpfInfCriteria.andEmgSeqEqualTo(emgSeq);
		hspZyfxpfInfCriteria.andZyfxpfScoIsNotNull();
		List<HspZyfxpfInf> zyfxpfList = hspZyfxpfInfMapper.selectByExample(hspZyfxpfInfExample);
		if (zyfxpfList.size() != 0) {
			HspZyfxpfInf hspZyfxpfInf1 = null;
			HspZyfxpfInf hspZyfxpfInf2 = null;
			for (HspZyfxpfInf hspZyfxpfInf : zyfxpfList) {
				if (hspZyfxpfInf.getZyfxpfSeq().indexOf("HCS-") != -1) {
					hspZyfxpfInf1 = hspZyfxpfInf;
				}
				if (hspZyfxpfInf.getZyfxpfSeq().indexOf("H-") != -1) {
					hspZyfxpfInf2 = hspZyfxpfInf;
				}
			}
			if (hspZyfxpfInf1 == null && hspZyfxpfInf2 != null) {
				hsphljldCustom.setZyfxpfSeq(hspZyfxpfInf2.getZyfxpfSeq());
				hsphljldCustom.setZyfxpfSco(hspZyfxpfInf2.getZyfxpfSco().toString());
			}else if (hspZyfxpfInf2 == null && hspZyfxpfInf1 != null) {
				hsphljldCustom.setZyfxpfSeq(hspZyfxpfInf1.getZyfxpfSeq());
				hsphljldCustom.setZyfxpfSco(hspZyfxpfInf1.getZyfxpfSco().toString());
			}else if (hspZyfxpfInf1 != null && hspZyfxpfInf2 != null) {
				if (hspZyfxpfInf1.getCrttime().before(hspZyfxpfInf2.getCrttime())) {
					hsphljldCustom.setZyfxpfSeq(hspZyfxpfInf2.getZyfxpfSeq());
					hsphljldCustom.setZyfxpfSco(hspZyfxpfInf2.getZyfxpfSco().toString());
				}else {
					hsphljldCustom.setZyfxpfSeq(hspZyfxpfInf1.getZyfxpfSeq());
					hsphljldCustom.setZyfxpfSco(hspZyfxpfInf1.getZyfxpfSco().toString());
				}
			}
		}
		
		HspGcsInfExample hspGcsInfExample=new HspGcsInfExample();
		HspGcsInfExample.Criteria hspGcsInfCriteria=hspGcsInfExample.createCriteria();
		hspGcsInfCriteria.andGcsSeqEqualTo(emgSeq);
		hspGcsInfCriteria.andTotScoIsNotNull();
		List<HspGcsInf> gcsList = hspGcsInfMapper.selectByExample(hspGcsInfExample);
		if (gcsList.size() != 0) {
			HspGcsInf hspGcsInf1 = null;
			HspGcsInf hspGcsInf2 = null;
			for (HspGcsInf hspGcsInf : gcsList) {
				if (hspGcsInf.getEmgSeq().indexOf("HCS-") != -1) {
					hspGcsInf1 = hspGcsInf;
				}
				if (hspGcsInf.getEmgSeq().indexOf("H-") != -1) {
					hspGcsInf2 = hspGcsInf;
				}
			}
			if (hspGcsInf1 == null && hspGcsInf2 != null) {
				hsphljldCustom.setGcsSeq(hspGcsInf2.getEmgSeq());
				hsphljldCustom.setGcsSco(hspGcsInf2.getTotSco().toString());
			}else if (hspGcsInf2 == null && hspGcsInf1 != null) {
				hsphljldCustom.setGcsSeq(hspGcsInf1.getEmgSeq());
				hsphljldCustom.setGcsSco(hspGcsInf1.getTotSco().toString());
			}else if (hspGcsInf1 != null && hspGcsInf2 != null) {
				if (hspGcsInf1.getCratDat().before(hspGcsInf2.getCratDat())) {
					hsphljldCustom.setGcsSeq(hspGcsInf2.getEmgSeq());
					hsphljldCustom.setGcsSco(hspGcsInf2.getTotSco().toString());
				}else {
					hsphljldCustom.setGcsSeq(hspGcsInf1.getEmgSeq());
					hsphljldCustom.setGcsSco(hspGcsInf1.getTotSco().toString());
				}
			}
		}
		
		HspDdfxpgbInfExample hspDdfxpgbInfExample = new HspDdfxpgbInfExample();
		HspDdfxpgbInfExample.Criteria hspDdfxpgbCriteria = hspDdfxpgbInfExample.createCriteria();
		hspDdfxpgbCriteria.andEmgSeqEqualTo(emgSeq);
		hspDdfxpgbCriteria.andZfIsNotNull();
		List<HspDdfxpgbInf> hspDdfxpgbList = hspDdfxpgbInfMapper.selectByExample(hspDdfxpgbInfExample);
		if (hspDdfxpgbList.size() != 0) {
			HspDdfxpgbInf hspDdfxpgbInf1 = null;
			HspDdfxpgbInf hspDdfxpgbInf2 = null;
			for (HspDdfxpgbInf hspDdfxpgbInf : hspDdfxpgbList) {
				if (hspDdfxpgbInf.getDdfxpgbSeq().indexOf("HCS-") != -1) {
					hspDdfxpgbInf1 = hspDdfxpgbInf;
				}
				if (hspDdfxpgbInf.getDdfxpgbSeq().indexOf("H-") != -1) {
					hspDdfxpgbInf2 = hspDdfxpgbInf;
				}
			}
			if (hspDdfxpgbInf1 == null && hspDdfxpgbInf2 != null) {
				hsphljldCustom.setDdfxpgbSeq(hspDdfxpgbInf2.getDdfxpgbSeq());
				hsphljldCustom.setMorseSco(hspDdfxpgbInf2.getZf());
			}else if (hspDdfxpgbInf2 == null && hspDdfxpgbInf1 != null) {
				hsphljldCustom.setDdfxpgbSeq(hspDdfxpgbInf1.getDdfxpgbSeq());
				hsphljldCustom.setMorseSco(hspDdfxpgbInf1.getZf());
			}else if (hspDdfxpgbInf1 != null && hspDdfxpgbInf2 != null) {
				if (hspDdfxpgbInf1.getCretDat().before(hspDdfxpgbInf2.getCretDat())) {
					hsphljldCustom.setDdfxpgbSeq(hspDdfxpgbInf2.getDdfxpgbSeq());
					hsphljldCustom.setMorseSco(hspDdfxpgbInf2.getZf());
				}else {
					hsphljldCustom.setDdfxpgbSeq(hspDdfxpgbInf1.getDdfxpgbSeq());
					hsphljldCustom.setMorseSco(hspDdfxpgbInf1.getZf());
				}
			}
		}
		return hsphljldCustom;
	}
	
	@Override
	public HspTiInf findTiScoreByXtpgSeq(String xtpgSeq) throws Exception {
		if(StringUtils.isNotNullAndEmptyByTrim(xtpgSeq)){
			return hspTiInfMapper.selectByPrimaryKey(xtpgSeq);
		}
		return null;
	}

	@Override
	public void addTiScore(HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception {
		HspTiInfCustom hspTiInfCustom = hspXtpgInfQueryDto.getHspTiInfCustom();
		if(hspTiInfCustom != null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspTiInfCustom.getTiSeq())){
				HspTiInf hspTiInf = hspTiInfMapper.selectByPrimaryKey(hspTiInfCustom.getTiSeq());
				if(hspTiInf != null){
					hspTiInfCustom.setCratDat(hspTiInf.getCratDat());
					hspTiInfMapper.updateByPrimaryKey(hspTiInfCustom);
				}else{
					hspTiInfCustom.setCratDat(new Date());
					hspTiInfMapper.insert(hspTiInfCustom);
				}

			}else{
				hspTiInfCustom.setTiSeq(UUIDBuild.getUUID());
				hspTiInfCustom.setCratDat(new Date());
				hspTiInfMapper.insert(hspTiInfCustom);
			}
		}
	}

	@Override
	public HspTiInfCustom findTiByEmgSeq(String emgSeq) {
		return hspTiInfCustomMapper.findTiByEmgSeq(emgSeq);
	}

	@Override
	public HspTashInf findTashScoreByTashSeq(String tashSeq) {
		if(StringUtils.isNotNullAndEmptyByTrim(tashSeq)){
			return hspTashInfMapper.selectByPrimaryKey(tashSeq);
		}
		return null;
	}

	@Override
	public void addTashScore(HspXtpgInfQueryDto hspXtpgInfQueryDto) {
		HspTashInfCustom hspTashInfCustom = hspXtpgInfQueryDto.getHspTashInfCustom();
		if(hspTashInfCustom != null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspTashInfCustom.getTashSeq())){
				HspTashInf hspTashInf = hspTashInfMapper.selectByPrimaryKey(hspTashInfCustom.getTashSeq());
				if(hspTashInf != null){
					hspTashInfCustom.setCrtDat(hspTashInf.getCrtDat());
					hspTashInfMapper.updateByPrimaryKey(hspTashInfCustom);
				}else{
					hspTashInfCustom.setCrtDat(new Date());
					hspTashInfMapper.insert(hspTashInfCustom);
				}

			}else{
				hspTashInfCustom.setTashSeq(UUIDBuild.getUUID());
				hspTashInfCustom.setCrtDat(new Date());
				hspTashInfMapper.insert(hspTashInfCustom);
			}
		}
	}
}
