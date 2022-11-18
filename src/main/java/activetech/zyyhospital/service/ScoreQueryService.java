package activetech.zyyhospital.service;

import java.util.List;

import activetech.base.pojo.dto.ActiveUser;
import activetech.edpc.pojo.domain.HspTashInf;
import activetech.hospital.pojo.domain.HspGcsInf;
import activetech.hospital.pojo.domain.HspZjpfInf;
import activetech.zyyhospital.pojo.domain.HspAdlInf;
import activetech.zyyhospital.pojo.domain.HspBradenInf;
import activetech.zyyhospital.pojo.domain.HspDdfxpgbInf;
import activetech.zyyhospital.pojo.domain.HspFallriskInf;
import activetech.zyyhospital.pojo.domain.HspNrsInf;
import activetech.zyyhospital.pojo.domain.HspTiInf;
import activetech.zyyhospital.pojo.domain.HspZcddexpfInf;
import activetech.zyyhospital.pojo.domain.HspZyfxpfInf;
import activetech.zyyhospital.pojo.dto.HspHljldInfCustom;
import activetech.zyyhospital.pojo.dto.HspTiInfCustom;
import activetech.zyyhospital.pojo.dto.HspXtpgInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspZyfxpfInfCustom;

public interface ScoreQueryService {
	//-----------------------------Braden评分------------------------
	public List<HspBradenInf> queryBradenList(HspXtpgInfQueryDto hspXtpgInfQueryDto)throws Exception;
	
	public void addBradenScore(HspXtpgInfQueryDto hspXtpgInfQueryDto,ActiveUser activeUser)throws Exception;
	
	public void delBradenScore(String xtpgSeq)throws Exception;
	
	public HspBradenInf findBradenScoreByXtpgSeq(String xtpgSeq)throws Exception;
	public HspBradenInf findFirstBradenScore(String emgSeq) throws Exception ;
	
	//-----------------------------ADL评分----------------------------
	public List<HspAdlInf> queryAdlList(HspXtpgInfQueryDto hspXtpgInfQueryDto)throws Exception;
		
	public void addAdlScore(HspXtpgInfQueryDto hspXtpgInfQueryDto,ActiveUser activeUser)throws Exception;
		
	public void delAdlScore(String xtpgSeq)throws Exception;
		
	public HspAdlInf findAdlScoreByXtpgSeq(String xtpgSeq)throws Exception;
	
	public HspAdlInf findFirstAdlScore(String emgSeq) throws Exception;
	
	//-----------------------------坠床跌倒评分----------------------------
	public List<HspZcddexpfInf> queryZcddList(HspXtpgInfQueryDto hspXtpgInfQueryDto)throws Exception;
			
	public void addZcddScore(HspXtpgInfQueryDto hspXtpgInfQueryDto)throws Exception;
			
	public void delZcddScore(String xtpgSeq)throws Exception;
			
	public HspZcddexpfInf findZcddScoreByXtpgSeq(String xtpgSeq)throws Exception;
	
	public HspZcddexpfInf findFirstZcddScore(String emgSeq) throws Exception;
	
	//-----------------------------nrs评分----------------------------
	public List<HspNrsInf> queryNrsList(HspXtpgInfQueryDto hspXtpgInfQueryDto)throws Exception;
				
	public void addNrsScore(HspXtpgInfQueryDto hspXtpgInfQueryDto,ActiveUser activeUser)throws Exception;
				
	public void delNrsScore(String xtpgSeq)throws Exception;
				
	public HspNrsInf findNrsScoreByXtpgSeq(String xtpgSeq)throws Exception;
	
	public HspNrsInf findFirstNrsScore(String emgSeq) throws Exception;
	
	//-----------------------------Gcs评分------------------------
	public List<HspGcsInf> queryGcsList(HspXtpgInfQueryDto hspXtpgInfQueryDto)throws Exception;
	
	public void addGcsScore(HspXtpgInfQueryDto hspXtpgInfQueryDto,ActiveUser activeUser)throws Exception;
	
	public void delGcsScore(String xtpgSeq)throws Exception;
	
	public HspGcsInf findGcsScoreByXtpgSeq(String xtpgSeq)throws Exception;
	public HspGcsInf findFirstGcsScore(String emgSeq) throws Exception ;
	
	//-------------------------跌倒风险-------------------------------
	public HspFallriskInf findFallriskById(String xtpgSeq)throws Exception;
	
	public HspFallriskInf findFirstFallriskByEmgSeq(String emgSeq) throws Exception;
	
	public List<HspFallriskInf> findFallriskListByEmgSeq(HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception;
	
	public void addFallRisk(HspXtpgInfQueryDto hspXtpgInfQueryDto,ActiveUser activeUser)throws Exception;
	
	public void delFallRisk(String fallriskSeq)throws Exception;
	
	//-------------------------转院风险评分-------------------------------
	public HspZyfxpfInf findZyfxpfScoreByZyfxpfSeq(String zyfxpfSeq) throws Exception;

	public List<HspZyfxpfInf> queryZyfxpfList(HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception;
	
	public void addZyfxpfScore(HspXtpgInfQueryDto hspXtpgInfQueryDto,ActiveUser activeUser)throws Exception;
	
	public void delZyfxpfScore(String zyfxpfSeq)throws Exception;
	
	public List<HspZyfxpfInfCustom> printfxpfScoreList(HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception;

	//--------------------Morse跌倒评分------------------------------
	public List<HspDdfxpgbInf> findMorseListByEmgSeq(HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception;

	public HspDdfxpgbInf findMorseByDdfxpgbSeq(String ddfxpgbSeq) throws Exception;

	public void addMorseScore(HspXtpgInfQueryDto hspXtpgInfQueryDto, ActiveUser activeUser) throws Exception;

	public void delMorseScore(String ddfxpgbSeq) throws Exception;

	public HspDdfxpgbInf findFirstMorseByEmgSeq(String emgSeq) throws Exception;
	
	//-----------------------------Zjpf评分------------------------
	
	public void addZjpfScore(HspXtpgInfQueryDto hspXtpgInfQueryDto, ActiveUser activeUser) throws Exception;

	public List<HspZjpfInf> queryZjpfList(HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception;

	public void delZjpfScore(String zjpfSeq)throws Exception;

	public HspZjpfInf findZjpfScoreByXtpgSeq(String zjpfSeq) throws Exception;

	public HspHljldInfCustom findFirstScoByEmgSeq(String emgSeq) throws Exception;
	
	public HspTiInf findTiScoreByXtpgSeq(String xtpgSeq) throws Exception;

	public void addTiScore(HspXtpgInfQueryDto hspXtpgInfQueryDto) throws Exception;

	public HspTiInfCustom findTiByEmgSeq(String emgSeq);

	public HspTashInf findTashScoreByTashSeq(String tashSeq);

	void addTashScore(HspXtpgInfQueryDto hspXtpgInfQueryDto);
}
