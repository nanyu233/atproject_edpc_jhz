package activetech.eicu.pojo.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import activetech.base.pojo.dto.PageQuery;

public class IcuCustInfoQueryDto{
	
	private IcuCustInfoCustom icuCustInfoCustom;
	private PageQuery pageQuery;
	@JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
	private Date startDate;
	@JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
	private Date endDate;
	private String paramDate;
	private String custNo;
	private String liveNo;
	private String status;
	private List<String> typeList;
	private String vsType;
	/**
	 * 用户自定义编码标识符
	 * 整体护理获取班次小结标识符(字段借用)
	 */
	private String udefFlag;	
	/**
	 * 班次标识符
	 */
	private String shiftFlag;
	
	private String interval;//生命体征interval
	
	private String intervalIo;//除入量interval
	
	public String getIntervalIo() {
		return intervalIo;
	}
	public void setIntervalIo(String intervalIo) {
		this.intervalIo = intervalIo;
	}
	public String getInterval() {
		return interval;
	}
	public void setInterval(String interval) {
		this.interval = interval;
	}
	public String getShiftFlag() {
		return shiftFlag;
	}
	public void setShiftFlag(String shiftFlag) {
		this.shiftFlag = shiftFlag;
	}
	public String getUdefFlag() {
		return udefFlag;
	}
	public void setUdefFlag(String udefFlag) {
		this.udefFlag = udefFlag;
	}
	public String getVsType() {
		return vsType;
	}
	public void setVsType(String vsType) {
		this.vsType = vsType;
	}
	public List<String> getTypeList() {
		return typeList;
	}
	public void setTypeList(List<String> typeList) {
		this.typeList = typeList;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public IcuCustInfoCustom getIcuCustInfoCustom() {
		return icuCustInfoCustom;
	}
	public void setIcuCustInfoCustom(IcuCustInfoCustom icuCustInfoCustom) {
		this.icuCustInfoCustom = icuCustInfoCustom;
	}
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getParamDate() {
		return paramDate;
	}
	public void setParamDate(String paramDate) {
		this.paramDate = paramDate;
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getLiveNo() {
		return liveNo;
	}
	public void setLiveNo(String liveNo) {
		this.liveNo = liveNo;
	}
}
