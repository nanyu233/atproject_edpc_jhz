package activetech.zyyhospital.pojo.dto;

import java.util.Date;

import activetech.base.pojo.dto.PageQuery;

public class HspConsultationRecordsQueryDto {

	//分页
	private PageQuery pageQuery;
	String sort;
	String order;
	
	private HspConsultationRecordsCustom hspConsultationRecordsCustom;
	private String observationCode;
	private String recordFlag;

	private Date startdate;
	private Date enddate;
	private String querytype;
	private String halfdate;
	
	
	/**
	 * 判断请求来自哪一个页面
	 */
	private String pageName;

	
	
	
	public HspConsultationRecordsCustom getHspConsultationRecordsCustom() {
		return hspConsultationRecordsCustom;
	}

	public void setHspConsultationRecordsCustom(
			HspConsultationRecordsCustom hspConsultationRecordsCustom) {
		this.hspConsultationRecordsCustom = hspConsultationRecordsCustom;
	}

	public String getRecordFlag() {
		return recordFlag;
	}

	public void setRecordFlag(String recordFlag) {
		this.recordFlag = recordFlag;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getQuerytype() {
		return querytype;
	}

	public void setQuerytype(String querytype) {
		this.querytype = querytype;
	}

	public String getHalfdate() {
		return halfdate;
	}

	public void setHalfdate(String halfdate) {
		this.halfdate = halfdate;
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

	public String getObservationCode() {
		return observationCode;
	}

	public void setObservationCode(String observationCode) {
		this.observationCode = observationCode;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	
	
}
