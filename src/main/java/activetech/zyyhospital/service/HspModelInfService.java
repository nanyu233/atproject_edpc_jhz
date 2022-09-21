package activetech.zyyhospital.service;

import java.util.List;

import activetech.base.pojo.dto.ActiveUser;
import activetech.zyyhospital.pojo.dto.HspModelInfCustom;
import activetech.zyyhospital.pojo.dto.HspModelInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspModelcontInfCustom;

public interface HspModelInfService {
	public HspModelcontInfCustom findModelcontBySeq(String modelcontSeq);
		
	public List<HspModelcontInfCustom> findMajorClsByModelSeq(HspModelInfQueryDto hspModelInfQueryDto)throws Exception;
	
	public List<HspModelcontInfCustom> findSubClsByMajor(HspModelInfQueryDto hspModelInfQueryDto)throws Exception;
	
	public void addModelContent(HspModelcontInfCustom hspModelcontInfCustom,ActiveUser activeUser)throws Exception;
	
	public void editModelContent(HspModelcontInfCustom hspModelcontInfCustom,ActiveUser activeUser)throws Exception;
	
	public void delModelContent(HspModelcontInfCustom hspModelcontInfCustom)throws Exception;
	
	public int findSubClsByMajorCount(HspModelInfQueryDto hspModelInfQueryDto)throws Exception;
		
	public List<HspModelInfCustom> finddocadviceList(String modelContent)throws Exception;
	
	public List<HspModelcontInfCustom> finddocadviceconList(HspModelInfQueryDto hspModelInfQueryDto)throws Exception;
	
	public int finddocadviceconListCount(HspModelInfQueryDto hspModelInfQueryDto)throws Exception;
	
	public void addDoc(HspModelInfCustom hspModelInfCustom ,ActiveUser activeUser)throws Exception;
	
	public void delDoc(HspModelInfCustom hspModelInfCustom )throws Exception;
	
	public  HspModelInfCustom finddocBySeq(String modelSeq)throws Exception;
	
	public void editdoc(HspModelInfCustom hspModelInfCustom )throws Exception;
	
	public void adddoccontent(HspModelcontInfCustom hspModelcontInfCustom,ActiveUser activeUser)throws Exception;
	
	public List<HspModelcontInfCustom> finddocadviceconallList(HspModelInfQueryDto hspModelInfQueryDto)throws Exception;
	
	public int finddocadviceconListallCount(HspModelInfQueryDto hspModelInfQueryDto)throws Exception;
	
	public void deldoccontent(HspModelcontInfCustom hspModelcontInfCustom )throws Exception; 
	
	public  HspModelcontInfCustom finddoccontentBySeq(String modelcontSeq)throws Exception; 
	
	public void editdoccontent(HspModelcontInfCustom hspModelcontInfCustom,ActiveUser activeUser)throws Exception; 
	
}
