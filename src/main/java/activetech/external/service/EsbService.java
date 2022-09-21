package activetech.external.service;

import activetech.base.process.result.ResultInfo;

public interface EsbService {
	
	public ResultInfo getJyjcInfo(String emgSeq, String wayTyp);
	
	public ResultInfo getECGInfo(String emgSeq, String wayTyp);
	

}
