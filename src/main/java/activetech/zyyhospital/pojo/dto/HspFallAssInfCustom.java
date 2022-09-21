package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspFallassInf;

public class HspFallAssInfCustom extends HspFallassInf{
	private String fallAssFlag;

	public String getFallAssFlag() {
		return fallAssFlag;
	}

	public void setFallAssFlag(String fallAssFlag) {
		this.fallAssFlag = fallAssFlag;
	}
	
	@Override
	public String toString() {
		return "HspFallAssInfCustom ["
				+ (getFallassSeq() != null ? "getFallriskSeq()=" + getFallassSeq() + ", " : "")
				+ (getEmgSeq() != null ? "getEmgSeq()=" + getEmgSeq() + ", " : "")
				+ (getFallAssCod() != null ? "getFallAssCod()=" + getFallAssCod() + ", " : "")
				+ (getFallAssess() != null ? "getFallAssess()=" + getFallAssess() + ", " : "")
				+ (getFallMemo() != null ? "getFallMemo()=" + getFallMemo() + ", " : "")
				+ (getFallUsrno() != null ? "getFallUsrno()=" + getFallUsrno() + ", " : "")
				+ (getFallUsrnam() != null ? "getFallUsrnam()=" + getFallUsrnam() + ", " : "")
				+ (getFallDate() != null ? "getFallDate()=" + getFallDate() : "") + "]";
	}
	
	
}
