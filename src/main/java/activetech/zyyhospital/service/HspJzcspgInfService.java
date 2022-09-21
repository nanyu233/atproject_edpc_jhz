package activetech.zyyhospital.service;

import activetech.base.pojo.dto.ActiveUser;
import activetech.zyyhospital.pojo.dto.HspJzcspgInfCustom;
import activetech.zyyhospital.pojo.dto.HspJzcspgInfQueryDto;

public interface HspJzcspgInfService {

	public HspJzcspgInfQueryDto getJzcsrypgbByEmgSeq(String emgSeq) throws Exception;

	public void updateJzcsrypgb(HspJzcspgInfQueryDto hspJzcspgInfQueryDto, ActiveUser activeUser) throws Exception;

	public String submitBradenScore(HspJzcspgInfQueryDto hspJzcspgInfQueryDto, ActiveUser activeUser) throws Exception;

	public String submitAdlScore(HspJzcspgInfQueryDto hspJzcspgInfQueryDto, ActiveUser activeUser) throws Exception;

	public String submitNrsScore(HspJzcspgInfQueryDto hspJzcspgInfQueryDto, ActiveUser activeUser) throws Exception;

	public String submitZyfxpfScore(HspJzcspgInfQueryDto hspJzcspgInfQueryDto, ActiveUser activeUser) throws Exception;

	public String submitGcsSco(HspJzcspgInfQueryDto hspJzcspgInfQueryDto, ActiveUser activeUser) throws Exception;

	public String addMorseScore(HspJzcspgInfQueryDto hspJzcspgInfQueryDto, ActiveUser activeUser) throws Exception;

	public HspJzcspgInfCustom findJzcsrypgbByEmgSeq(String emgSeq) throws Exception;

}
