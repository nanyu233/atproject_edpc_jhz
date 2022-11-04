package activetech.edpc.service;

import activetech.base.process.result.ResultInfo;

public interface CpcCrfplaneService {
	public ResultInfo cpcCrfplane(String emgNo,String patFlg);

    ResultInfo registerInfoCrfplane(String emgSeq) throws Exception;
}
