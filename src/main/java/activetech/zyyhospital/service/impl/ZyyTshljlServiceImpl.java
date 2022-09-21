package activetech.zyyhospital.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.dto.ActiveUser;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import activetech.zyyhospital.dao.mapper.HspJxtqhljldInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspJxtqhljldInfMapper;
import activetech.zyyhospital.dao.mapper.HspXwhljldInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspXwhljldInfMapper;
import activetech.zyyhospital.pojo.domain.HspJxtqhljldInf;
import activetech.zyyhospital.pojo.domain.HspXwhljldInf;
import activetech.zyyhospital.pojo.dto.HspJxtqhljldInfCustom;
import activetech.zyyhospital.pojo.dto.HspXwhljldInfCustom;
import activetech.zyyhospital.pojo.dto.ZyyTshljlQueryDto;
import activetech.zyyhospital.service.ZyyTshljlService;

public class ZyyTshljlServiceImpl implements ZyyTshljlService{

	@Autowired
	private HspXwhljldInfMapper hspXwhljldInfMapper;
	@Autowired
	private HspXwhljldInfCustomMapper hspXwhljldInfCustomMapper;
	@Autowired
	private HspJxtqhljldInfMapper hspJxtqhljldInfMapper;
	@Autowired
	private HspJxtqhljldInfCustomMapper hspJxtqhljldInfCustomMapper;

	@Override
	public int findXwhljldCount(ZyyTshljlQueryDto zyyTshljlQueryDto) throws Exception {
		return hspXwhljldInfCustomMapper.findXwhljldCount(zyyTshljlQueryDto);			
	}

	@Override
	public List<HspXwhljldInfCustom> findXwhljldList(ZyyTshljlQueryDto zyyTshljlQueryDto) throws Exception {
		List<HspXwhljldInfCustom> hspXwhljldInfCustoms = hspXwhljldInfCustomMapper.findXwhljldList(zyyTshljlQueryDto);
		for (HspXwhljldInfCustom hspXwhljldInfCustom : hspXwhljldInfCustoms) {
			//症状体征拼接结果去除逗号
			if (StringUtils.isNotNullAndEmptyByTrim(hspXwhljldInfCustom.getZztzDes())) {
				String zztzDes = hspXwhljldInfCustom.getZztzDes();	
				if (",".equals(zztzDes.substring(zztzDes.length()-1))) {
					hspXwhljldInfCustom.setZztzDes(zztzDes.substring(0, zztzDes.length() - 1));
				}
			}
			//洗胃液拼接结果将其他选项去掉，替换为其他的内容
			if (StringUtils.isNotNullAndEmptyByTrim(hspXwhljldInfCustom.getXwyDes())) {
				String xwyDes = hspXwhljldInfCustom.getXwyDes();
				if (StringUtils.isNotNullAndEmptyByTrim(hspXwhljldInfCustom.getXwyQt())) {
					hspXwhljldInfCustom.setXwyDes(xwyDes.replace("其他", hspXwhljldInfCustom.getXwyQt()));
				}
			}
			//毒物拼接结果将其他选项去掉，替换为其他的内容
			if (StringUtils.isNotNullAndEmptyByTrim(hspXwhljldInfCustom.getDwDes())) {
				String dwDes = hspXwhljldInfCustom.getDwDes();
				if (StringUtils.isNotNullAndEmptyByTrim(hspXwhljldInfCustom.getDwYm3())) {
					hspXwhljldInfCustom.setDwDes(dwDes.replace("其他", hspXwhljldInfCustom.getDwYm3()));
				}
			}
		}
		return hspXwhljldInfCustoms;
	}

	@Override
	public void editXwhljldSubmit(ZyyTshljlQueryDto zyyTshljlQueryDto, ActiveUser activeuser) throws Exception {
		HspXwhljldInfCustom hspXwhljldInfCustom = zyyTshljlQueryDto.getHspXwhljldInfCustom();
		if (hspXwhljldInfCustom != null) {
			if (StringUtils.isNotNullAndEmptyByTrim(hspXwhljldInfCustom.getXwhiSeq())) {
				HspXwhljldInf hspXwhljldInf = hspXwhljldInfMapper.selectByPrimaryKey(hspXwhljldInfCustom.getXwhiSeq());
				if (hspXwhljldInf != null) {
					hspXwhljldInfCustom.setEmgSeq(hspXwhljldInf.getEmgSeq());
					hspXwhljldInfCustom.setCrtDat(hspXwhljldInf.getCrtDat());
					hspXwhljldInfCustom.setCrtNur(hspXwhljldInf.getCrtNur());
					hspXwhljldInfCustom.setCrtName(hspXwhljldInf.getCrtName());
					hspXwhljldInfCustom.setUpDat(new Date());
					hspXwhljldInfCustom.setUpNur(activeuser.getUsrno());
					hspXwhljldInfCustom.setUpName(activeuser.getUsrname());
					hspXwhljldInfMapper.updateByPrimaryKey(hspXwhljldInfCustom);
				}
			}else {
				//洗胃护理评估号
				hspXwhljldInfCustom.setXwhiSeq(UUIDBuild.getUUID());
				hspXwhljldInfCustom.setCrtDat(new Date());
				hspXwhljldInfCustom.setCrtNur(activeuser.getUsrno());
				hspXwhljldInfCustom.setCrtName(activeuser.getUsrname());
				hspXwhljldInfMapper.insert(hspXwhljldInfCustom);
			}
		}
	}

	@Override
	public void deleteXwhljldSubmit(ZyyTshljlQueryDto zyyTshljlQueryDto) throws Exception {
		HspXwhljldInfCustom hspXwhljldInfCustom = zyyTshljlQueryDto.getHspXwhljldInfCustom();
		if (hspXwhljldInfCustom != null) {
			if (StringUtils.isNotNullAndEmptyByTrim(hspXwhljldInfCustom.getXwhiSeq())) {
				hspXwhljldInfMapper.deleteByPrimaryKey(hspXwhljldInfCustom.getXwhiSeq());
			}
		}
	}

	@Override
	public HspXwhljldInf findXwhljldByXwhiSeq(String xwhiSeq) throws Exception {
		if (StringUtils.isNotNullAndEmptyByTrim(xwhiSeq)) {
			return hspXwhljldInfMapper.selectByPrimaryKey(xwhiSeq);
		}else {
			return null;
		}	
	}

	@Override
	public int findJxtqhljldCount(ZyyTshljlQueryDto zyyTshljlQueryDto) throws Exception {
		return hspJxtqhljldInfCustomMapper.findJxtqhljldCount(zyyTshljlQueryDto);
	}

	@Override
	public List<HspJxtqhljldInfCustom> findJxtqhljldList(ZyyTshljlQueryDto zyyTshljlQueryDto) throws Exception {
		return hspJxtqhljldInfCustomMapper.findJxtqhljldList(zyyTshljlQueryDto);
	}

	@Override
	public void editJxtqhljldSubmit(ZyyTshljlQueryDto zyyTshljlQueryDto, ActiveUser activeuser) throws Exception {
		HspJxtqhljldInfCustom hspJxtqhljldInfCustom = zyyTshljlQueryDto.getHspJxtqhljldInfCustom();
		if (hspJxtqhljldInfCustom != null) {
			if (StringUtils.isNotNullAndEmptyByTrim(hspJxtqhljldInfCustom.getJxtqSeq())) {
				HspJxtqhljldInf hspJxtqhljldInf = hspJxtqhljldInfMapper.selectByPrimaryKey(hspJxtqhljldInfCustom.getJxtqSeq());
				if (hspJxtqhljldInf != null) {
					hspJxtqhljldInfCustom.setEmgSeq(hspJxtqhljldInf.getEmgSeq());
					hspJxtqhljldInfCustom.setCrtDat(hspJxtqhljldInf.getCrtDat());
					hspJxtqhljldInfCustom.setCrtNur(hspJxtqhljldInf.getCrtNur());
					hspJxtqhljldInfCustom.setCrtName(hspJxtqhljldInf.getCrtName());
					hspJxtqhljldInfCustom.setUpDat(new Date());
					hspJxtqhljldInfCustom.setUpNur(activeuser.getUsrno());
					hspJxtqhljldInfCustom.setUpName(activeuser.getUsrname());
					hspJxtqhljldInfMapper.updateByPrimaryKey(hspJxtqhljldInfCustom);
				}
			}else {
				//机械通气护理评估号
				hspJxtqhljldInfCustom.setJxtqSeq(UUIDBuild.getUUID());
				hspJxtqhljldInfCustom.setCrtDat(new Date());
				hspJxtqhljldInfCustom.setCrtNur(activeuser.getUsrno());
				hspJxtqhljldInfCustom.setCrtName(activeuser.getUsrname());
				hspJxtqhljldInfMapper.insert(hspJxtqhljldInfCustom);
			}
		}		
	}

	@Override
	public void deleteJxtqhljldSubmit(ZyyTshljlQueryDto zyyTshljlQueryDto) throws Exception {
		HspJxtqhljldInfCustom hspJxtqhljldInfCustom = zyyTshljlQueryDto.getHspJxtqhljldInfCustom();
		if (hspJxtqhljldInfCustom != null) {
			if (StringUtils.isNotNullAndEmptyByTrim(hspJxtqhljldInfCustom.getJxtqSeq())) {
				hspJxtqhljldInfMapper.deleteByPrimaryKey(hspJxtqhljldInfCustom.getJxtqSeq());
			}
		}
	}

	@Override
	public HspJxtqhljldInf findJxtqhljldByJxtqSeq(String jxtqSeq) throws Exception {
		if (StringUtils.isNotNullAndEmptyByTrim(jxtqSeq)) {
			return hspJxtqhljldInfMapper.selectByPrimaryKey(jxtqSeq);
		}else {
			return null;
		}	
	}

}
