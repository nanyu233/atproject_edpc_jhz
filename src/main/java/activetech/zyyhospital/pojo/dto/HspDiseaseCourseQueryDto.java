package activetech.zyyhospital.pojo.dto;

import java.util.Date;
import java.util.List;

import activetech.base.pojo.dto.PageQuery;

public class HspDiseaseCourseQueryDto {
	
	/**
	 * 分页
	 */
	private PageQuery pageQuery;
	
	/**
	 * 排序字段
	 */
	String sort;
	
	/**
	 * 排序方法
	 */
	String order;

	/**
	 * 开始时间
	 */
	private Date startdate;
	
	/**
	 * 结束时间
	 */
	private Date enddate;
	private HspDiseaseCourseCustom hspDiseaseCourseCustom = new HspDiseaseCourseCustom();

	private String forwardUrl;
	private String observationCode;
	private String printType; //打印类型
	private String printPage; //打印页
	private String emgSeq;
	private List<String> diseaseCourseSeqList;
	private List<String> cfjlSeqList;
	private List<String> jjbjlSeqList;
	private List<String> qjjlSeqList;
	
	/**
	 * 手术操作记录打印List
	 */
	private List<String> operateInfList;
	
	/**
	 * 输血记录打印List
	 */
	private List<String> transfusionSeqList;
	
	
	public HspDiseaseCourseCustom getHspDiseaseCourseCustom() {
		return hspDiseaseCourseCustom;
	}

	public void setHspDiseaseCourseCustom(
			HspDiseaseCourseCustom hspDiseaseCourseCustom) {
		this.hspDiseaseCourseCustom = hspDiseaseCourseCustom;
	}

	public String getForwardUrl() {
		return forwardUrl;
	}

	public void setForwardUrl(String forwardUrl) {
		this.forwardUrl = forwardUrl;
	}

	public String getObservationCode() {
		return observationCode;
	}

	public void setObservationCode(String observationCode) {
		this.observationCode = observationCode;
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

	public String getPrintType() {
		return printType;
	}

	public void setPrintType(String printType) {
		this.printType = printType;
	}

	public String getPrintPage() {
		return printPage;
	}

	public void setPrintPage(String printPage) {
		this.printPage = printPage;
	}

	public List<String> getDiseaseCourseSeqList() {
		return diseaseCourseSeqList;
	}

	public void setDiseaseCourseSeqList(List<String> diseaseCourseSeqList) {
		this.diseaseCourseSeqList = diseaseCourseSeqList;
	}

	public List<String> getCfjlSeqList() {
		return cfjlSeqList;
	}

	public void setCfjlSeqList(List<String> cfjlSeqList) {
		this.cfjlSeqList = cfjlSeqList;
	}

	public List<String> getJjbjlSeqList() {
		return jjbjlSeqList;
	}

	public void setJjbjlSeqList(List<String> jjbjlSeqList) {
		this.jjbjlSeqList = jjbjlSeqList;
	}

	public List<String> getQjjlSeqList() {
		return qjjlSeqList;
	}

	public void setQjjlSeqList(List<String> qjjlSeqList) {
		this.qjjlSeqList = qjjlSeqList;
	}

	public String getEmgSeq() {
		return emgSeq;
	}

	public void setEmgSeq(String emgSeq) {
		this.emgSeq = emgSeq;
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

	public List<String> getOperateInfList() {
		return operateInfList;
	}

	public void setOperateInfList(List<String> operateInfList) {
		this.operateInfList = operateInfList;
	}

	public List<String> getTransfusionSeqList() {
		return transfusionSeqList;
	}

	public void setTransfusionSeqList(List<String> transfusionSeqList) {
		this.transfusionSeqList = transfusionSeqList;
	}
}
