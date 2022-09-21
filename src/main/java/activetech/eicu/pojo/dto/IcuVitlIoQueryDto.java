package activetech.eicu.pojo.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import activetech.base.pojo.dto.PageQuery;


public class IcuVitlIoQueryDto{
	private PageQuery pageQuery;
	
	private IcuVsInfoCustom icuVsInfoCustom;
	//private IcuIoInfoCustom icuIoInfoCustom;
	//private List<IcuIoInfoCustom> icuIoInfoList;
	private List<IcuVsInfoCustom> icuVsInfoList;
	/**
	 * 医嘱信息
	 */
	//private IcuDaExecCustom icuDaExecCustom;
	private String paramDate;
	@JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
	private Date startDate;
	@JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
	private Date endDate;
	private String custNo;
	private String liveNo;
	private String ioType;
	private String ioCode;
	private String vsType;
	private String vsCode;
	
	private List<String> typeCode;
	/**
	 * 班次标识符
	 */
	private String shiftFlag;
	/**
	 * 删除序号数组
	 */
	private List<String> delSeqArr;
	/**
	 * NC信息在医嘱标识符 
	 */
	private String linkSeq;	
	/**
	 * 异常体征标识符    1 异常
	 */
	private String abnormalFlag;
	/**
	 * 排序字段
	 */
	private String fileId;
	/**
	 * 体征维护时间拍寻
	 */
	private String order;
	
	/**
	 * 只查询定义数据  
	 * 不查询serah框、select框、NC_CHAR  NC_UNIT
	 */
	private String onlyDef;
	/**
	 * 整体维护标识
	 */
	private String wholMain;
	private String interval;
	
	public String getInterval() {
		return interval;
	}
	public void setInterval(String interval) {
		this.interval = interval;
	}
	public String getWholMain() {
		return wholMain;
	}
	public void setWholMain(String wholMain) {
		this.wholMain = wholMain;
	}
	public String getOnlyDef() {
		return onlyDef;
	}
	public void setOnlyDef(String onlyDef) {
		this.onlyDef = onlyDef;
	}
	public String getAbnormalFlag() {
		return abnormalFlag;
	}
	public void setAbnormalFlag(String abnormalFlag) {
		this.abnormalFlag = abnormalFlag;
	}
	
	public String getLinkSeq() {
		return linkSeq;
	}
	public void setLinkSeq(String linkSeq) {
		this.linkSeq = linkSeq;
	}
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public List<String> getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(List<String> typeCode) {
		this.typeCode = typeCode;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public IcuVsInfoCustom getIcuVsInfoCustom() {
		return icuVsInfoCustom;
	}
	public void setIcuVsInfoCustom(IcuVsInfoCustom icuVsInfoCustom) {
		this.icuVsInfoCustom = icuVsInfoCustom;
	}

	public String getParamDate() {
		return paramDate;
	}
	public void setParamDate(String paramDate) {
		this.paramDate = paramDate;
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
	public String getIoType() {
		return ioType;
	}
	public void setIoType(String ioType) {
		this.ioType = ioType;
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getIoCode() {
		return ioCode;
	}
	public void setIoCode(String ioCode) {
		this.ioCode = ioCode;
	}
	public String getShiftFlag() {
		return shiftFlag;
	}
	public void setShiftFlag(String shiftFlag) {
		this.shiftFlag = shiftFlag;
	}
	public String getLiveNo() {
		return liveNo;
	}
	public void setLiveNo(String liveNo) {
		this.liveNo = liveNo;
	}
	public String getVsCode() {
		return vsCode;
	}
	public void setVsCode(String vsCode) {
		this.vsCode = vsCode;
	}
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	public String getVsType() {
		return vsType;
	}
	public void setVsType(String vsType) {
		this.vsType = vsType;
	}
	public List<IcuVsInfoCustom> getIcuVsInfoList() {
		return icuVsInfoList;
	}
	public void setIcuVsInfoList(List<IcuVsInfoCustom> icuVsInfoList) {
		this.icuVsInfoList = icuVsInfoList;
	}
	public List<String> getDelSeqArr() {
		return delSeqArr;
	}
	public void setDelSeqArr(List<String> delSeqArr) {
		this.delSeqArr = delSeqArr;
	}
	
}
