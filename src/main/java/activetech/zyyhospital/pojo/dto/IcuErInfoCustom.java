package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.IcuErInfo;

public class IcuErInfoCustom extends IcuErInfo{
	private String crtTimeStr;
	private String modTimeStr;
	
	public String getCrtTimeStr() {
		return crtTimeStr;
	}
	public void setCrtTimeStr(String crtTimeStr) {
		this.crtTimeStr = crtTimeStr;
	}
	public String getModTimeStr() {
		return modTimeStr;
	}
	public void setModTimeStr(String modTimeStr) {
		this.modTimeStr = modTimeStr;
	}

}
