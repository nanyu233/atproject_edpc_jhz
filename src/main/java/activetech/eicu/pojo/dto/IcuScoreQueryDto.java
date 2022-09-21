package activetech.eicu.pojo.dto;

import java.util.Date;
import java.util.List;

public class IcuScoreQueryDto {
	private IcuGradeTotalCustom icuGradeTotalCustom;
	private IcuGradeSubitemCustom icuGradeSubitem;
	private String liveNo;
	private String gradeSeq;
	private String gradeType;
	private List<IcuGradeSubitemCustom> itemList;
	private List<String> timeList;
	private Date startDate;
	private Date endDate;
	//gradeType类型列表
	private List<String> typeList;
		
	/**
	 * 相关标识符
	 */
	private String flag;
	
	private String enterSource;
	
	private String fldCod;
	
	public String getFldCod() {
		return fldCod;
	}
	public void setFldCod(String fldCod) {
		this.fldCod = fldCod;
	}
	public String getEnterSource() {
		return enterSource;
	}
	public void setEnterSource(String enterSource) {
		this.enterSource = enterSource;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public List<String> getTypeList() {
		return typeList;
	}
	public void setTypeList(List<String> typeList) {
		this.typeList = typeList;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public List<String> getTimeList() {
		return timeList;
	}
	public void setTimeList(List<String> timeList) {
		this.timeList = timeList;
	}
	public List<IcuGradeSubitemCustom> getItemList() {
		return itemList;
	}
	public void setItemList(List<IcuGradeSubitemCustom> itemList) {
		this.itemList = itemList;
	}
	public String getGradeSeq() {
		return gradeSeq;
	}
	public void setGradeSeq(String gradeSeq) {
		this.gradeSeq = gradeSeq;
	}
	public String getGradeType() {
		return gradeType;
	}
	public void setGradeType(String gradeType) {
		this.gradeType = gradeType;
	}
	public String getLiveNo() {
		return liveNo;
	}
	public void setLiveNo(String liveNo) {
		this.liveNo = liveNo;
	}
	public IcuGradeTotalCustom getIcuGradeTotalCustom() {
		return icuGradeTotalCustom;
	}
	public void setIcuGradeTotalCustom(IcuGradeTotalCustom icuGradeTotalCustom) {
		this.icuGradeTotalCustom = icuGradeTotalCustom;
	}
	public IcuGradeSubitemCustom getIcuGradeSubitem() {
		return icuGradeSubitem;
	}
	public void setIcuGradeSubitem(IcuGradeSubitemCustom icuGradeSubitem) {
		this.icuGradeSubitem = icuGradeSubitem;
	}
	
}
