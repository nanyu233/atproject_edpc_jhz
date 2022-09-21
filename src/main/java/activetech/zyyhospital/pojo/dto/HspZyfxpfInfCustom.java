package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspZyfxpfInf;

public class HspZyfxpfInfCustom extends HspZyfxpfInf{
	private String crttimeStr;

	/**
	 * 病情护理记录单Id
	 */
	public String bqhiSeq;
	
	
	public String getBqhiSeq() {
		return bqhiSeq;
	}

	public void setBqhiSeq(String bqhiSeq) {
		this.bqhiSeq = bqhiSeq;
	}

	public String getCrttimeStr() {
		return crttimeStr;
	}

	public void setCrttimeStr(String crttimeStr) {
		this.crttimeStr = crttimeStr;
	}
	
	
	
}
