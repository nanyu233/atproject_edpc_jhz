package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspFavoritesInf;

public class HspFavoritesInfCustom extends HspFavoritesInf{
		
	private String sctypeName;//模板类型名称
	private String crtusrName;//创建人名称
	private String comcName;//所属科室名称
	private String crtDateStr;//创建日期字符串
	private String isTemplateFlag;//模板类型标志位
	private String titleOrContent;//标题或内容

	public String getTitleOrContent() {
		return titleOrContent;
	}

	public void setTitleOrContent(String titleOrContent) {
		this.titleOrContent = titleOrContent;
	}

	public String getIsTemplateFlag() {
		return isTemplateFlag;
	}

	public void setIsTemplateFlag(String isTemplateFlag) {
		this.isTemplateFlag = isTemplateFlag;
	}

	public String getCrtDateStr() {
		return crtDateStr;
	}

	public void setCrtDateStr(String crtDateStr) {
		this.crtDateStr = crtDateStr;
	}

	public String getCrtusrName() {
		return crtusrName;
	}

	public void setCrtusrName(String crtusrName) {
		this.crtusrName = crtusrName;
	}

	public String getComcName() {
		return comcName;
	}

	public void setComcName(String comcName) {
		this.comcName = comcName;
	}

	public String getSctypeName() {
		return sctypeName;
	}

	public void setSctypeName(String sctypeName) {
		this.sctypeName = sctypeName;
	}
	
}
