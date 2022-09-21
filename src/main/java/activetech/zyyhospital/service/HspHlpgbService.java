package activetech.zyyhospital.service;

import java.util.List;

import activetech.base.pojo.dto.ActiveUser;
import activetech.zyyhospital.pojo.domain.HspHlpgb;
import activetech.zyyhospital.pojo.dto.HspHlpgbCustom;
import activetech.zyyhospital.pojo.dto.HspHlpgbQueryDto;

public interface HspHlpgbService {
	public HspHlpgbQueryDto getHlpgbByEmgSeq(String emgSeq)throws Exception ;
	public void updateHlpgb(HspHlpgbQueryDto hspHlpgbQueryDto,ActiveUser activeUser) throws Exception;
	
	public HspHlpgb getZyhByEmgSeq(String emgSeq)throws Exception ;
	
	public HspHlpgbCustom  findHlpgbByEmgSeq(String emgSeq)throws Exception ;
	
	public String submitBradenScore(HspHlpgbQueryDto hspHlpgbQueryDto,ActiveUser activeUser)throws Exception ;
	
	public String submitAdlScore(HspHlpgbQueryDto hspHlpgbQueryDto,ActiveUser activeUser)throws Exception ;
	
	public String submitFallDScore(HspHlpgbQueryDto hspHlpgbQueryDto)throws Exception ;
	
	public String submitFallRisk(HspHlpgbQueryDto hspHlpgbQueryDto,ActiveUser activeUser)throws Exception;
	
	public String submitZyfxpfScore(HspHlpgbQueryDto hspHlpgbQueryDto,ActiveUser activeUser)throws Exception ;
	
	public String submitGcsSco(HspHlpgbQueryDto hspHlpgbQueryDto, ActiveUser activeUser)throws Exception ;

	public String submitNrsScore(HspHlpgbQueryDto hspHlpgbQueryDto, ActiveUser activeUser)throws Exception ;
	
	public String addMorseScore(HspHlpgbQueryDto hspHlpgbQueryDto, ActiveUser activeUser)throws Exception;
	
	public void firstAssignment(String emgSeq, ActiveUser activeUser)throws Exception;
	
	
	/**
	 * 导入生命体征
	 * @param hspHlpgbQueryDto
	 * @return
	 */
	List<HspHlpgbCustom> exportVitalSigns(HspHlpgbQueryDto hspHlpgbQueryDto)throws Exception;
}
