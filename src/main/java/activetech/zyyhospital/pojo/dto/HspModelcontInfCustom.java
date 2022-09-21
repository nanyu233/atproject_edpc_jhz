package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspModelcontInf;

public class HspModelcontInfCustom extends HspModelcontInf {
	private String modelType;
	private String infoCode;
	private String[] majorClses;

	public String getModelType() {
		return modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	public String getInfoCode() {
		return infoCode;
	}

	public void setInfoCode(String infoCode) {
		this.infoCode = infoCode;
	}

	public String[] getMajorClses() {
		return majorClses;
	}

	public void setMajorClses(String[] majorClses) {
		this.majorClses = majorClses;
	}

}
