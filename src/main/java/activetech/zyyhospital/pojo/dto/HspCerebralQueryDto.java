package activetech.zyyhospital.pojo.dto;

import java.util.List;

import activetech.base.pojo.dto.PageQuery;

public class HspCerebralQueryDto {
	private HspCerebralCourseCustom hspCerebralCourseCustom;
	private HspNihssInfCustom hspNihssInfCustom;
	private List<HspCerebralSheetCustom> sheetList;
	private String jsonList;
	
	private String sheetAssessDoc;
	private String sheetAssessDate;
	private String sheetAssessDocNam;

	//分页
	private PageQuery pageQuery;
	private String sort;
    private String order;
    
    public String getSheetAssessDocNam() {
		return sheetAssessDocNam;
	}

	public void setSheetAssessDocNam(String sheetAssessDocNam) {
		this.sheetAssessDocNam = sheetAssessDocNam;
	}

	public String getSheetAssessDoc() {
		return sheetAssessDoc;
	}

	public void setSheetAssessDoc(String sheetAssessDoc) {
		this.sheetAssessDoc = sheetAssessDoc;
	}

	public String getSheetAssessDate() {
		return sheetAssessDate;
	}

	public void setSheetAssessDate(String sheetAssessDate) {
		this.sheetAssessDate = sheetAssessDate;
	}

	public String getJsonList() {
		return jsonList;
	}

	public void setJsonList(String jsonList) {
		this.jsonList = jsonList;
	}

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public HspNihssInfCustom getHspNihssInfCustom() {
		return hspNihssInfCustom;
	}

	public void setHspNihssInfCustom(HspNihssInfCustom hspNihssInfCustom) {
		this.hspNihssInfCustom = hspNihssInfCustom;
	}

	public List<HspCerebralSheetCustom> getSheetList() {
		return sheetList;
	}

	public void setSheetList(List<HspCerebralSheetCustom> sheetList) {
		this.sheetList = sheetList;
	}

	public HspCerebralCourseCustom getHspCerebralCourseCustom() {
		return hspCerebralCourseCustom;
	}

	public void setHspCerebralCourseCustom(
			HspCerebralCourseCustom hspCerebralCourseCustom) {
		this.hspCerebralCourseCustom = hspCerebralCourseCustom;
	}

}
