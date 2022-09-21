package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspQtsjgl;

public class HspQtsjglCustom extends HspQtsjgl {
	private String qtsjseqContents;
	private String emgSeq;
	/**
	 * 群体事件类型cod
	 */
	private String qtsjTypeCod;
	
	public String getEmgSeq() {
		return emgSeq;
	}
	public void setEmgSeq(String emgSeq) {
		this.emgSeq = emgSeq;
	}
	public String getQtsjseqContents() {
		return qtsjseqContents;
	}

	public void setQtsjseqContents(String qtsjseqContents) {
		this.qtsjseqContents = qtsjseqContents;
	}
	public String getQtsjTypeCod() {
		return qtsjTypeCod;
	}
	public void setQtsjTypeCod(String qtsjTypeCod) {
		this.qtsjTypeCod = qtsjTypeCod;
	}
	
}
