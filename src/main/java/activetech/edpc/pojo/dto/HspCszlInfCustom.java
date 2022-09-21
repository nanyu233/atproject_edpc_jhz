package activetech.edpc.pojo.dto;

import activetech.edpc.pojo.domain.HspCszlInf;

public class HspCszlInfCustom extends HspCszlInf {
	//类型
	private String proType;
	//字段名
	private String proName;
	//关键时间
	private String keyTime;
	//排序
	private String valsort;
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
	public String getKeyTime() {
		return keyTime;
	}
	public void setKeyTime(String keyTime) {
		this.keyTime = keyTime;
	}
	public String getValsort() {
		return valsort;
	}
	public void setValsort(String valsort) {
		this.valsort = valsort;
	}
	
	

}
