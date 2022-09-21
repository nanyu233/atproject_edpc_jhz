package activetech.zyyhospital.pojo.dto;

import java.util.Date;
import java.util.List;

import activetech.base.pojo.dto.PageQuery;

public class IcuPipeInfoQueryDto{
	private IcuPipeInfoCustom icuPipeInfoCustom;
	private PageQuery pageQuery;
	private List<IcuPipeInfoCustom> pipeList;
	private String paramPipeType;
	private Date startDate;
	private Date endDate;
	private String pipeStat;
	private String pipeSeq;
	private String pipeFlag;
	private String paramDate;
	private List<String> delSeqList;
	private String paramStr; //输入值
	//班次标识符
	private String shiftFlag;
	private String pipeType;
	public String getPipeType() {
		return pipeType;
	}
	public void setPipeType(String pipeType) {
		this.pipeType = pipeType;
	}
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	public String getParamStr() {
		return paramStr;
	}
	public void setParamStr(String paramStr) {
		this.paramStr = paramStr;
	}
	public List<String> getDelSeqList() {
		return delSeqList;
	}
	public void setDelSeqList(List<String> delSeqList) {
		this.delSeqList = delSeqList;
	}
	public String getShiftFlag() {
		return shiftFlag;
	}
	public void setShiftFlag(String shiftFlag) {
		this.shiftFlag = shiftFlag;
	}
	public IcuPipeInfoCustom getIcuPipeInfoCustom() {
		return icuPipeInfoCustom;
	}
	public void setIcuPipeInfoCustom(IcuPipeInfoCustom icuPipeInfoCustom) {
		this.icuPipeInfoCustom = icuPipeInfoCustom;
	}
	public String getParamPipeType() {
		return paramPipeType;
	}
	public void setParamPipeType(String paramPipeType) {
		this.paramPipeType = paramPipeType;
	}
	public String getPipeStat() {
		return pipeStat;
	}
	public void setPipeStat(String pipeStat) {
		this.pipeStat = pipeStat;
	}
	public String getPipeSeq() {
		return pipeSeq;
	}
	public void setPipeSeq(String pipeSeq) {
		this.pipeSeq = pipeSeq;
	}
	public String getPipeFlag() {
		return pipeFlag;
	}
	public void setPipeFlag(String pipeFlag) {
		this.pipeFlag = pipeFlag;
	}
	public String getParamDate() {
		return paramDate;
	}
	public void setParamDate(String paramDate) {
		this.paramDate = paramDate;
	}
	public List<IcuPipeInfoCustom> getPipeList() {
		return pipeList;
	}
	public void setPipeList(List<IcuPipeInfoCustom> pipeList) {
		this.pipeList = pipeList;
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
	
}
