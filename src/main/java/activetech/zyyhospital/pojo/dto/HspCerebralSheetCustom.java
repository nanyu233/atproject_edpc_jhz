package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspCerebralSheet;

public class HspCerebralSheetCustom extends HspCerebralSheet {
	private String cerebralDateStr;
	private String sheetAssessDocNam;

	public String getSheetAssessDocNam() {
		return sheetAssessDocNam;
	}

	public void setSheetAssessDocNam(String sheetAssessDocNam) {
		this.sheetAssessDocNam = sheetAssessDocNam;
	}

	public String getCerebralDateStr() {
		return cerebralDateStr;
	}

	public void setCerebralDateStr(String cerebralDateStr) {
		this.cerebralDateStr = cerebralDateStr;
	}
	

}
