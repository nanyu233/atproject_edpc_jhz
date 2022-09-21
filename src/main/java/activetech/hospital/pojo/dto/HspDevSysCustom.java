package activetech.hospital.pojo.dto;

import activetech.hospital.pojo.domain.HspDevSys;

public class HspDevSysCustom extends HspDevSys{
	private String crtDatStr;
	private String updDatStr;
	private String crtUsrName;
	private String updUsrName;
	private String devtypcodName;

	public String getDevtypcodName() {
		return devtypcodName;
	}

	public void setDevtypcodName(String devtypcodName) {
		this.devtypcodName = devtypcodName;
	}

	public String getCrtDatStr() {
		return crtDatStr;
	}

	public void setCrtDatStr(String crtDatStr) {
		this.crtDatStr = crtDatStr;
	}

	public String getUpdDatStr() {
		return updDatStr;
	}

	public void setUpdDatStr(String updDatStr) {
		this.updDatStr = updDatStr;
	}

	public String getCrtUsrName() {
		return crtUsrName;
	}

	public void setCrtUsrName(String crtUsrName) {
		this.crtUsrName = crtUsrName;
	}

	public String getUpdUsrName() {
		return updUsrName;
	}

	public void setUpdUsrName(String updUsrName) {
		this.updUsrName = updUsrName;
	}
	
	
}
