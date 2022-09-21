package activetech.edpc.pojo.dto;

import activetech.edpc.pojo.domain.HspCzzlInf;

public class HspCzzlInfCustom extends HspCzzlInf{
	
	private String proType;
	
	private String proName;
	
	private String proList;
	
	private String proUnit;
	
	private String keyTime;
	

	public String getKeyTime() {
		return keyTime;
	}

	public void setKeyTime(String keyTime) {
		this.keyTime = keyTime;
	}

	public String getProUnit() {
		return proUnit;
	}

	public void setProUnit(String proUnit) {
		this.proUnit = proUnit;
	}

	public String getProList() {
		return proList;
	}

	public void setProList(String proList) {
		this.proList = proList;
	}

	public String getProType() {
		return proType;
	}

	public void setProType(String proType) {
		this.proType = proType;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}
	
	

}
