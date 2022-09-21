package activetech.hospital.pojo.dto;

import activetech.hospital.pojo.domain.HspHealtheduInf;

public class HspHealtheduInfCustom extends HspHealtheduInf {
	private String eduDatStr;
	private String eduObjStr;
	private String eduContStr;
	private String eduMethodStr;
	private String eduTimeStr;
	private String eduResStr;
	private String eduItemStr;

	public String getEduItemStr() {
		return eduItemStr;
	}

	public void setEduItemStr(String eduItemStr) {
		this.eduItemStr = eduItemStr;
	}

	public String getEduResStr() {
		return eduResStr;
	}

	public void setEduResStr(String eduResStr) {
		this.eduResStr = eduResStr;
	}

	public String getEduTimeStr() {
		return eduTimeStr;
	}

	public void setEduTimeStr(String eduTimeStr) {
		this.eduTimeStr = eduTimeStr;
	}

	public String getEduObjStr() {
		return eduObjStr;
	}

	public void setEduObjStr(String eduObjStr) {
		this.eduObjStr = eduObjStr;
	}

	public String getEduContStr() {
		return eduContStr;
	}

	public void setEduContStr(String eduContStr) {
		this.eduContStr = eduContStr;
	}

	public String getEduMethodStr() {
		return eduMethodStr;
	}

	public void setEduMethodStr(String eduMethodStr) {
		this.eduMethodStr = eduMethodStr;
	}

	public String getEduDatStr() {
		return eduDatStr;
	}

	public void setEduDatStr(String eduDatStr) {
		this.eduDatStr = eduDatStr;
	}

}
