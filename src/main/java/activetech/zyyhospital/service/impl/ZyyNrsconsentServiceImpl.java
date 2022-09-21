package activetech.zyyhospital.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import activetech.zyyhospital.dao.mapper.HspNczrslchcbInfMapper;
import activetech.zyyhospital.dao.mapper.HspNrsconsentInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspNrsconsentInfMapper;
import activetech.zyyhospital.pojo.domain.HspNczrslchcbInf;
import activetech.zyyhospital.pojo.domain.HspNczrslchcbInfExample;
import activetech.zyyhospital.pojo.domain.HspNrsconsentInfWithBLOBs;
import activetech.zyyhospital.pojo.dto.HspNczrslchcbInfCustom;
import activetech.zyyhospital.pojo.dto.HspNczrslchcbInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspNrsconsentInfCustom;
import activetech.zyyhospital.pojo.dto.HspNrsconsentInfQueryDto;
import activetech.zyyhospital.service.ZyyNrsconsentService;

public class ZyyNrsconsentServiceImpl implements ZyyNrsconsentService {
	@Autowired
	private HspNrsconsentInfMapper hspNrsconsentInfMapper;
	@Autowired
	private HspNrsconsentInfCustomMapper hspNrsconsentInfCustomMapper;
	@Autowired
	private HspNczrslchcbInfMapper hspNczrslchcbInfMapper;
	
	@Override
	public HspNrsconsentInfCustom findHspNrsconsentInfBySeqno(String seqno) throws Exception {
		 //非空判断
		if(!StringUtils.isNotNullAndEmptyByTrim(seqno)){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { "文书序号不能为空"}));
		}
		HspNrsconsentInfWithBLOBs withBLOBs = hspNrsconsentInfMapper.selectByPrimaryKey(seqno);
		HspNrsconsentInfCustom custom = new HspNrsconsentInfCustom();
		BeanUtils.copyProperties(withBLOBs, custom);
		return custom;
	}

	@Override
	public HspNrsconsentInfCustom updateDocumentBySeqno(HspNrsconsentInfQueryDto hspNrsConsentInfQueryDto,
			ActiveUser activeUser) throws Exception {
		HspNrsconsentInfCustom nrsConsentInfCustom = hspNrsConsentInfQueryDto.getHspNrsconsentInfCustom();
		String nullstr = this.updateHspNrsconsentInfCustomNotNullAndEmptyByTrim(nrsConsentInfCustom);
	   if(StringUtils.isNotNullAndEmptyByTrim(nullstr)){
			 ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { nullstr}));
		}
	   nrsConsentInfCustom.setUpddate(new Date());
	   nrsConsentInfCustom.setUpdusrno(activeUser.getUsrno());
	   nrsConsentInfCustom.setUpdusrname(activeUser.getUsrname());
	   if(StringUtils.isNotNullAndEmptyByTrim(nrsConsentInfCustom.getSeqno())){
		   HspNrsconsentInfWithBLOBs withBLOBs = hspNrsconsentInfMapper.selectByPrimaryKey(nrsConsentInfCustom.getSeqno());
		   nrsConsentInfCustom.setCrtdate(withBLOBs.getCrtdate());
		   nrsConsentInfCustom.setCrtusrno(withBLOBs.getCrtusrno());
		   nrsConsentInfCustom.setCrtusrname(withBLOBs.getUpdusrname());
		   hspNrsconsentInfMapper.updateByPrimaryKeyWithBLOBs(nrsConsentInfCustom);
	   }else{
		   nrsConsentInfCustom.setSeqno(UUIDBuild.getUUID());
		   nrsConsentInfCustom.setCrtdate(new Date());
		   nrsConsentInfCustom.setCrtusrno(activeUser.getUsrno());
		   nrsConsentInfCustom.setCrtusrname(activeUser.getUsrname());
		   hspNrsconsentInfMapper.insert(nrsConsentInfCustom);
	   }
		return nrsConsentInfCustom;
	}

	private String updateHspNrsconsentInfCustomNotNullAndEmptyByTrim(HspNrsconsentInfCustom nrsConsentInfCustom) {
		if(!StringUtils.isNotNullAndEmptyByTrim(nrsConsentInfCustom.getTexthtml())){
			return "文书内容";
		}
		return null;
	}

	@Override
	public int findDocumentTotal(HspNrsconsentInfQueryDto hspNrsconsentInfQueryDto) {
		return hspNrsconsentInfCustomMapper.findDocumentTotal(hspNrsconsentInfQueryDto);
	}

	@Override
	public List<HspNrsconsentInfCustom> findfindDocumentList(HspNrsconsentInfQueryDto hspNrsconsentInfQueryDto) {
		return hspNrsconsentInfCustomMapper.findfindDocumentList(hspNrsconsentInfQueryDto);
	}

	@Override
	public void deleteDocumentBySeqno(String seqno) {
		hspNrsconsentInfMapper.deleteByPrimaryKey(seqno);
	}

	@Override
	public List<HspNczrslchcbInf> findNczrslchcbListByRefseqno(HspNczrslchcbInfQueryDto hspNczrslchcbInfQueryDto) throws Exception{
		List<HspNczrslchcbInf> list = new ArrayList<HspNczrslchcbInf>();
		if(hspNczrslchcbInfQueryDto.getHspNczrslchcbInfCustom() == null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920,new Object[] {"数据有误，请刷新重来!"}));
		}
		String refseqno = hspNczrslchcbInfQueryDto.getHspNczrslchcbInfCustom().getRefseqno();
		if(StringUtils.isNotNullAndEmptyByTrim(refseqno)){
			HspNczrslchcbInfExample hspNczrslchcbInfExample = new HspNczrslchcbInfExample();
			HspNczrslchcbInfExample.Criteria criteria = hspNczrslchcbInfExample.createCriteria();
			criteria.andRefseqnoEqualTo(refseqno);
			if (hspNczrslchcbInfQueryDto.getStartdate() != null) {
				criteria.andCrtdateGreaterThanOrEqualTo(hspNczrslchcbInfQueryDto.getStartdate());
			}
			if (hspNczrslchcbInfQueryDto.getEnddate() != null) {
				criteria.andCrtdateLessThanOrEqualTo(hspNczrslchcbInfQueryDto.getEnddate());
			}	
			hspNczrslchcbInfExample.setOrderByClause("CRTDATE DESC NULLS LAST");
			list = hspNczrslchcbInfMapper.selectByExample(hspNczrslchcbInfExample);
		}
		return list;
	}

	@Override
	public HspNczrslchcbInf findNczrslchcbBySeqno(String seqno) throws Exception{
		//非空判断
		if(!StringUtils.isNotNullAndEmptyByTrim(seqno)){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { "ID序号不能为空"}));
		}
		return hspNczrslchcbInfMapper.selectByPrimaryKey(seqno);
	}

	@Override
	public String addNczrslchcbTable(HspNczrslchcbInfQueryDto hspNczrslchcbInfQueryDto) throws Exception {
		HspNczrslchcbInfCustom hspNczrslchcbInfCustom = hspNczrslchcbInfQueryDto.getHspNczrslchcbInfCustom();
		if(hspNczrslchcbInfCustom != null){
			if (StringUtils.isNotNullAndEmptyByTrim(hspNczrslchcbInfCustom.getSeqno())) {
				HspNczrslchcbInf hspNczrslchcbInf = hspNczrslchcbInfMapper.selectByPrimaryKey(hspNczrslchcbInfCustom.getSeqno());
				if (hspNczrslchcbInf != null) {
					hspNczrslchcbInfCustom.setUpdusrno(hspNczrslchcbInfCustom.getCrtusrno());
					hspNczrslchcbInfCustom.setUpdusrname(hspNczrslchcbInfCustom.getCrtusrname());
					hspNczrslchcbInfCustom.setUpddate(new Date());
					hspNczrslchcbInfCustom.setCrtusrno(hspNczrslchcbInf.getCrtusrno());
					hspNczrslchcbInfCustom.setCrtusrname(hspNczrslchcbInf.getCrtusrname());
					hspNczrslchcbInfCustom.setCrtdate(hspNczrslchcbInf.getCrtdate());							
					hspNczrslchcbInfMapper.updateByPrimaryKey(hspNczrslchcbInfCustom);
				}
			}else {
				hspNczrslchcbInfCustom.setSeqno(UUIDBuild.getUUID());				
				hspNczrslchcbInfCustom.setCrtdate(new Date());
				hspNczrslchcbInfCustom.setUpdusrno(hspNczrslchcbInfCustom.getCrtusrno());
				hspNczrslchcbInfCustom.setUpdusrname(hspNczrslchcbInfCustom.getCrtusrname());
				hspNczrslchcbInfCustom.setUpddate(hspNczrslchcbInfCustom.getCrtdate());
				hspNczrslchcbInfMapper.insertSelective(hspNczrslchcbInfCustom);
			}
		}
		return hspNczrslchcbInfCustom.getSeqno();
	}

	@Override
	public void delNczrslchcbTable(String seqno) throws Exception {
		if(StringUtils.isNotNullAndEmptyByTrim(seqno)){
			hspNczrslchcbInfMapper.deleteByPrimaryKey(seqno);
		}
	}
	
}
