package activetech.zyyhospital.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.dto.ActiveUser;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import activetech.zyyhospital.dao.mapper.HspModelInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspModelInfMapper;
import activetech.zyyhospital.dao.mapper.HspModelcontInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspModelcontInfMapper;
import activetech.zyyhospital.pojo.domain.HspModelInf;
import activetech.zyyhospital.pojo.domain.HspModelcontInf;
import activetech.zyyhospital.pojo.dto.HspModelInfCustom;
import activetech.zyyhospital.pojo.dto.HspModelInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspModelcontInfCustom;
import activetech.zyyhospital.service.HspModelInfService;

public class HspModelInfServiceImpl implements HspModelInfService {
	@Autowired
	private HspModelcontInfMapper hspModelcontInfMapper;
	@Autowired
	private HspModelcontInfCustomMapper hspModelcontInfCustomMapper;
	@Autowired
	private HspModelInfMapper hspModelInfMapper;
	@Autowired
	private HspModelInfCustomMapper hspModelInfCustomMapper;

	/**
	 * 根据模板号获取大类
	 */
	@Override
	public List<HspModelcontInfCustom> findMajorClsByModelSeq(
			HspModelInfQueryDto hspModelInfQueryDto) throws Exception {
		HspModelcontInfCustom hspModelcontInfCustom=hspModelInfQueryDto.getHspModelcontInfCustom();
		List<HspModelcontInfCustom> list=null;
		if(hspModelcontInfCustom!=null){
			list=hspModelcontInfCustomMapper.findMajorClsByModelSeq(hspModelcontInfCustom.getModelSeq());
		}
		return list;
	}
	
	/**
	 * 根据大类获取子类
	 */
	@Override
	public List<HspModelcontInfCustom> findSubClsByMajor(
			HspModelInfQueryDto hspModelInfQueryDto) {
		List<HspModelcontInfCustom> list=hspModelcontInfCustomMapper.findSubClsByMajor(hspModelInfQueryDto);
		return list;
	}
	
	@Override
	public void addModelContent(HspModelcontInfCustom hspModelcontInfCustom,
			ActiveUser activeUser) throws Exception {
		if(hspModelcontInfCustom!=null){
			hspModelcontInfCustom.setModelcontSeq(UUIDBuild.getUUID());
			hspModelcontInfCustom.setCrtDat(new Date());
			hspModelcontInfCustom.setCrtNbr(activeUser.getUsrno());
			hspModelcontInfMapper.insert(hspModelcontInfCustom);
		}
		
	}
	
	@Override
	public void editModelContent(HspModelcontInfCustom hspModelcontInfCustom,
			ActiveUser activeUser) throws Exception {
		if(hspModelcontInfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspModelcontInfCustom.getModelcontSeq())){
				HspModelcontInf hspModelcontInf=hspModelcontInfMapper.selectByPrimaryKey(hspModelcontInfCustom.getModelcontSeq());
			    if(hspModelcontInf!=null){
			    	hspModelcontInf.setMajorCls(hspModelcontInfCustom.getMajorCls());
			    	hspModelcontInf.setRemark(hspModelcontInfCustom.getRemark());
			    	hspModelcontInf.setModelSeq(hspModelcontInfCustom.getModelSeq());
			    	hspModelcontInf.setClsCont(hspModelcontInfCustom.getClsCont());
			    	hspModelcontInf.setUpdDat(new Date());
			    	hspModelcontInf.setUpdNbr(activeUser.getUsrno());
			    	hspModelcontInfMapper.updateByPrimaryKey(hspModelcontInf);
			    }
			}
		}
		
	}
	
	@Override
	public void delModelContent(HspModelcontInfCustom hspModelcontInfCustom)
			throws Exception {
		if(hspModelcontInfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspModelcontInfCustom.getModelcontSeq())){
				hspModelcontInfMapper.deleteByPrimaryKey(hspModelcontInfCustom.getModelcontSeq());
			}
		}		
	}
	
	@Override
	public int findSubClsByMajorCount(HspModelInfQueryDto hspModelInfQueryDto)
			throws Exception {
		HspModelcontInfCustom hspModelcontInfCustom=hspModelInfQueryDto.getHspModelcontInfCustom();
		if(hspModelcontInfCustom!=null){
			String[] majorClses=hspModelcontInfCustom.getMajorClses();
			if(majorClses!=null){
				if(majorClses.length<1){
					majorClses=null;
					hspModelInfQueryDto.getHspModelcontInfCustom().setMajorClses(majorClses);
				}
			}
		}
		int total=hspModelcontInfCustomMapper.findSubClsByMajorCount(hspModelInfQueryDto);
		return total;
	}
	@Override
	public HspModelcontInfCustom findModelcontBySeq(String modelcontSeq) {
		HspModelcontInfCustom hspModelcontInfCustom=new HspModelcontInfCustom();
		HspModelcontInf hspModelcontInf=hspModelcontInfMapper.selectByPrimaryKey(modelcontSeq);
		if(hspModelcontInf!=null){
			hspModelcontInfCustom.setModelcontSeq(hspModelcontInf.getModelcontSeq());
			hspModelcontInfCustom.setModelSeq(hspModelcontInf.getModelSeq());
			hspModelcontInfCustom.setMajorCls(hspModelcontInf.getMajorCls());
			hspModelcontInfCustom.setClsCont(hspModelcontInf.getClsCont());
			hspModelcontInfCustom.setSubCls(hspModelcontInf.getSubCls());
			hspModelcontInfCustom.setRemark(hspModelcontInf.getRemark());
		}
		return hspModelcontInfCustom;
	}

	@Override
	public List<HspModelInfCustom> finddocadviceList(String modelContent) throws Exception {
		List<HspModelInfCustom> list= hspModelInfCustomMapper.findModelList(modelContent);
		return list;
	}
	@Override
	public List<HspModelcontInfCustom> finddocadviceconList(
			HspModelInfQueryDto hspModelInfQueryDto) throws Exception {
		List<HspModelcontInfCustom> list=hspModelcontInfCustomMapper.finddocadviceconList(hspModelInfQueryDto);
		return list;
	}
	@Override
	public int finddocadviceconListCount(HspModelInfQueryDto hspModelInfQueryDto)
			throws Exception {
		int total=hspModelcontInfCustomMapper.finddocadviceconListCount(hspModelInfQueryDto);
		return total;
	}
	@Override
	public void addDoc(HspModelInfCustom hspModelInfCustom,
			ActiveUser activeUser) throws Exception {
		if(hspModelInfCustom!=null){
			hspModelInfCustom.setModelSeq(UUIDBuild.getUUID());
			hspModelInfCustom.setModelContent("1");
			hspModelInfMapper.insert(hspModelInfCustom);
		}
	}
	@Override
	public void delDoc(HspModelInfCustom hspModelInfCustom) throws Exception {
		if(hspModelInfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspModelInfCustom.getModelSeq())){
				hspModelInfMapper.deleteByPrimaryKey(hspModelInfCustom.getModelSeq());
			}
		}	
	}
	@Override
	public HspModelInfCustom finddocBySeq(String modelSeq) throws Exception {
		// TODO Auto-generated method stub
		HspModelInfCustom hspModelInfCustom = new HspModelInfCustom();
		HspModelInf hspModelInf= hspModelInfMapper.selectByPrimaryKey(modelSeq);
		if(hspModelInf!=null){
			 BeanUtils.copyProperties(hspModelInfCustom, hspModelInf);
		}
		 return hspModelInfCustom;
	}
	@Override
	public void editdoc(HspModelInfCustom hspModelInfCustom) throws Exception {
		if(hspModelInfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspModelInfCustom.getModelSeq())){
				HspModelInf hspModelInf= hspModelInfMapper.selectByPrimaryKey(hspModelInfCustom.getModelSeq());
			    if(hspModelInf!=null){
			    	hspModelInf.setModelNam(hspModelInfCustom.getModelNam());
			    	hspModelInfMapper.updateByPrimaryKey(hspModelInf);
			    }
			}
		}
	}
	@Override
	public void adddoccontent(HspModelcontInfCustom hspModelcontInfCustom,
			ActiveUser activeUser) throws Exception {
		if(hspModelcontInfCustom!=null){
			hspModelcontInfCustom.setModelcontSeq(UUIDBuild.getUUID());
			hspModelcontInfCustom.setCrtDat(new Date());
			hspModelcontInfCustom.setCrtNbr(activeUser.getUsrno());
			hspModelcontInfMapper.insert(hspModelcontInfCustom);
		}
	}
	@Override
	public List<HspModelcontInfCustom> finddocadviceconallList(
			HspModelInfQueryDto hspModelInfQueryDto) throws Exception {
		List<HspModelcontInfCustom> list=hspModelcontInfCustomMapper.finddocadviceconallList(hspModelInfQueryDto);
		return list;
	}
	@Override
	public int finddocadviceconListallCount(HspModelInfQueryDto hspModelInfQueryDto)
			throws Exception {
		int total=hspModelcontInfCustomMapper.finddocadviceconListallCount(hspModelInfQueryDto);
		return total;
	}
	@Override
	public void deldoccontent(HspModelcontInfCustom hspModelcontInfCustom)
			throws Exception {
		if(hspModelcontInfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspModelcontInfCustom.getModelcontSeq())){
				hspModelcontInfMapper.deleteByPrimaryKey(hspModelcontInfCustom.getModelcontSeq());
			}
		}	
	}
	@Override
	public HspModelcontInfCustom finddoccontentBySeq(String modelcontSeq)
			throws Exception {
		HspModelcontInfCustom hspModelcontInfCustom = new HspModelcontInfCustom();
		HspModelcontInf hspModelcontInf=hspModelcontInfMapper.selectByPrimaryKey(modelcontSeq);
		if(hspModelcontInf!=null){
			 BeanUtils.copyProperties(hspModelcontInfCustom, hspModelcontInf);
		}
		return hspModelcontInfCustom;
	}
	@Override
	public void editdoccontent(HspModelcontInfCustom hspModelcontInfCustom,ActiveUser activeUser)
			throws Exception {
		if(hspModelcontInfCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspModelcontInfCustom.getModelcontSeq())){
				HspModelcontInf hspModelcontInf=hspModelcontInfMapper.selectByPrimaryKey(hspModelcontInfCustom.getModelcontSeq());
				hspModelcontInf.setClsCont(hspModelcontInfCustom.getClsCont());
				hspModelcontInf.setUpdDat(new Date());
				hspModelcontInf.setUpdNbr(activeUser.getUsrno());
			    hspModelcontInfMapper.updateByPrimaryKey(hspModelcontInf);
			}
		}
	}
}
