package activetech.basehis.pojo.dto;

import activetech.basehis.pojo.domain.HspAotographInfo;

public class HspAotographInfoCustom extends HspAotographInfo {
	private String emgSeq;
	private String templateId;
	private String request172;
	private String tag;

	public String getEmgSeq() {
		return emgSeq;
	}

	public void setEmgSeq(String emgSeq) {
		this.emgSeq = emgSeq;
	}

	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getRequest172() {
		return request172;
	}

	public void setRequest172(String request172) {
		this.request172 = request172;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	
}
