package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspObsvtfstInf;

public class HspObsvtfstInfCustom extends HspObsvtfstInf {
	private String admtDatStr;
	private String dscgDatStr;
	private String oprtDatStr;
	public String getAdmtDatStr() {
		return admtDatStr;
	}
	public void setAdmtDatStr(String admtDatStr) {
		this.admtDatStr = admtDatStr;
	}
	public String getDscgDatStr() {
		return dscgDatStr;
	}
	public void setDscgDatStr(String dscgDatStr) {
		this.dscgDatStr = dscgDatStr;
	}
	public String getOprtDatStr() {
		return oprtDatStr;
	}
	public void setOprtDatStr(String oprtDatStr) {
		this.oprtDatStr = oprtDatStr;
	}
}
