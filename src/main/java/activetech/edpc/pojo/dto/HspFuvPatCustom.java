package activetech.edpc.pojo.dto;

import activetech.edpc.pojo.domain.HspFuvPat;

public class HspFuvPatCustom extends HspFuvPat {
	
	private String cstSexCodStr;
	private String patNatCodStr;
	private String marStaCodStr;
	private String fuvStaStr;
	
	public String getCstSexCodStr() {
		return cstSexCodStr;
	}
	public void setCstSexCodStr(String cstSexCodStr) {
		this.cstSexCodStr = cstSexCodStr;
	}
	public String getPatNatCodStr() {
		return patNatCodStr;
	}
	public void setPatNatCodStr(String patNatCodStr) {
		this.patNatCodStr = patNatCodStr;
	}
	public String getMarStaCodStr() {
		return marStaCodStr;
	}
	public void setMarStaCodStr(String marStaCodStr) {
		this.marStaCodStr = marStaCodStr;
	}
	public String getFuvStaStr() {
		return fuvStaStr;
	}
	public void setFuvStaStr(String fuvStaStr) {
		this.fuvStaStr = fuvStaStr;
	}
	
}
