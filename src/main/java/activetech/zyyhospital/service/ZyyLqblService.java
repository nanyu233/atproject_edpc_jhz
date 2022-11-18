package activetech.zyyhospital.service;

import java.util.List;

import activetech.base.pojo.dto.ActiveUser;
import activetech.basehis.pojo.dto.HspAotographInfoCustom;
import activetech.external.pojo.dto.VHemsJyjgQueryDto;
import activetech.zyyhospital.pojo.domain.THemsPaperwork;
import activetech.zyyhospital.pojo.dto.HspCgxjInfCustom;
import activetech.zyyhospital.pojo.dto.HspDocadviceInfCustom;
import activetech.zyyhospital.pojo.dto.HspLqblInfCustom;
import activetech.zyyhospital.pojo.dto.HspLqbljlQueryDto;
import activetech.zyyhospital.pojo.dto.HspObsvtfstInfCustom;

public interface ZyyLqblService {
	
	/*-------------------------------chen-----------------------*/
	public HspObsvtfstInfCustom findObsvtfstByEmgSeq(String emgSeq)throws Exception;
	
	public void submitObsvtfst(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser)throws Exception;
	
	public void deleteObsvtfst(String obsvtfstSeq)throws Exception;
	
	public HspLqblInfCustom findLqblByEmgSeq(String emgSeq)throws Exception;
	
	public void submitLqbl(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser)throws Exception;
	
	public void deletelqbl(String lqblSeq)throws Exception;
	
	public HspCgxjInfCustom findCgxjByEmgSeq(String emgSeq)throws Exception;
	
	public void submitCgxj(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser)throws Exception;
	
	public void deletecgxj(String cgxjSeq)throws Exception;
	
	/*-------------------------------zhang----------------------*/
//	public int findhspCfjlInfcount(HspLqbljlQueryDto hspLqbljlQueryDto ) throws Exception;
	
//	public List<HspCfjlInfCustom> findhspCfjlInfList(
//			HspLqbljlQueryDto hspLqbljlQueryDto ) throws Exception;
	
//	public String addcfjlsubmit(
//			HspLqbljlQueryDto hspLqbljlQueryDto) throws Exception;
	
//	public void delcfjl(
//			HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser ) throws Exception;
	
//	public HspCfjlInfCustom findHspCfjlInfbyid(String cfjlSeq)throws Exception;
	
//	public String updatecfjl(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser)throws Exception;

//	public int findhspJjbjlInfcount(HspLqbljlQueryDto hspLqbljlQueryDto ) throws Exception;
	
//	public List<HspJjbjlInfCustom> findhspJjbjlInfList(
//			HspLqbljlQueryDto hspLqbljlQueryDto ) throws Exception;
	
//	public int addjjbjlsubmit(
//			HspLqbljlQueryDto hspLqbljlQueryDto) throws Exception;
	
//	public void deljjbjl(
//			HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser ) throws Exception;
	
//	public HspJjbjlInfCustom findHspjjbjlInfbyid(String jjbjlSeq)throws Exception;
	
//	public void updatejjbjl(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser)throws Exception;
	
//	public int findhspQjjlInfcount(HspLqbljlQueryDto hspLqbljlQueryDto ) throws Exception;
//
//	public List<HspQjjlInfCustom> findhspQjjlInfList(
//			HspLqbljlQueryDto hspLqbljlQueryDto ) throws Exception;
//
//	public String addqjjlsubmit(
//			HspLqbljlQueryDto hspLqbljlQueryDto) throws Exception;
//
//	public void delqjjl(
//			HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser ) throws Exception;
//
//	public HspQjjlInfCustom findHspqjjlInfbyid(String qjjlSeq)throws Exception;
//
//	public String updateqjjl(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser)throws Exception;
//

	
	public  void insertyzxx(VHemsJyjgQueryDto vHemsJyjgQueryDto,ActiveUser activeUser)throws Exception;
	
	public HspDocadviceInfCustom findyzxxbyid(String docadviceSeq)throws Exception;
	
	public void updateyzxx(VHemsJyjgQueryDto vHemsJyjgQueryDto,ActiveUser activeUser)throws Exception;
	
	public void delyzxx(List<HspDocadviceInfCustom> hspDocadviceInfCustomlist,ActiveUser activeUser)throws Exception;
	
	public void insertyzxxajax(List<HspDocadviceInfCustom> hspDocadviceInfCustomlist,ActiveUser activeUser)throws Exception;
	
	public void inseryzxxbatch(VHemsJyjgQueryDto vHemsJyjgQueryDto,ActiveUser activeUser)throws Exception;
	
	public byte[] lqbltpctbyte(String emgSeq)throws Exception;
	
	/*-------------------------------wu-------------------------*/
	/**
	 * 为首次病程准备病例数据
	 * @param emgSeqDc
	 * @return
	 */
	public HspLqblInfCustom findLqblForDisease(String emgSeqDc);

	public void afterPrint(VHemsJyjgQueryDto vHemsJyjgQueryDto);
	
	public List<HspLqblInfCustom> getLslqblList(String vstCad);
	
	/**
	 * 导入今日门急诊病历
	 * @param emgSeq
	 * @return
	 * @throws Exception
	 */
	public HspLqblInfCustom findMzblByEmgSeq(String emgSeq) throws Exception;

	public void submitDzqm(HspAotographInfoCustom hspAotographInfoCustom, ActiveUser activeUser) throws Exception;

	public List<HspAotographInfoCustom> findDzqmImg(HspAotographInfoCustom hspAotographInfoCustom);

	public HspLqbljlQueryDto findRelatedDataByEmgSeq(String emgSeq) throws Exception ;
	
	public HspLqblInfCustom findAllLqblForDisease(String lqblSeq);
	
	public List<THemsPaperwork> findBclbBySeq(String emgSeq) throws Exception ;
	
	public List<HspDocadviceInfCustom> findvhemsypxxinfoanddocadviceList(VHemsJyjgQueryDto vHemsJyjgQueryDto)throws Exception;
	
}
