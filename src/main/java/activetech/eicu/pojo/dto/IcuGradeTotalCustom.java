package activetech.eicu.pojo.dto;

import java.util.List;

import activetech.eicu.pojo.domain.IcuGradeTotal;

public class IcuGradeTotalCustom extends IcuGradeTotal {
	private String crtTimeStr;
    private String crtUserStr;
    private String modTimeStr;
    private String modUserStr;
    private String gradeTimeStr;
    private String gradeUserStr;
    private String typeName;
    private List<IcuGradeSubitemCustom> itemList;
    private String itemName;
    private String riskName;
    private String riskColor;
    private String riskType;
    private String riskDesc;
    private String yAxisVal;
    
    private String fldCod;//创伤中心评分更新必须字段
    
	public String getFldCod() {
		return fldCod;
	}
	public void setFldCod(String fldCod) {
		this.fldCod = fldCod;
	}
	public String getyAxisVal() {
		return yAxisVal;
	}
	public void setyAxisVal(String yAxisVal) {
		this.yAxisVal = yAxisVal;
	}
	public String getRiskType() {
		return riskType;
	}
	public void setRiskType(String riskType) {
		this.riskType = riskType;
	}
	public String getRiskDesc() {
		return riskDesc;
	}
	public void setRiskDesc(String riskDesc) {
		this.riskDesc = riskDesc;
	}
	public String getRiskName() {
		return riskName;
	}
	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}
	public String getRiskColor() {
		return riskColor;
	}
	public void setRiskColor(String riskColor) {
		this.riskColor = riskColor;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getGradeTimeStr() {
		return gradeTimeStr;
	}
	public void setGradeTimeStr(String gradeTimeStr) {
		this.gradeTimeStr = gradeTimeStr;
	}
	public String getGradeUserStr() {
		return gradeUserStr;
	}
	public void setGradeUserStr(String gradeUserStr) {
		this.gradeUserStr = gradeUserStr;
	}
	public List<IcuGradeSubitemCustom> getItemList() {
		return itemList;
	}
	public void setItemList(List<IcuGradeSubitemCustom> itemList) {
		this.itemList = itemList;
	}
	public String getCrtTimeStr() {
		return crtTimeStr;
	}
	public void setCrtTimeStr(String crtTimeStr) {
		this.crtTimeStr = crtTimeStr;
	}
	public String getCrtUserStr() {
		return crtUserStr;
	}
	public void setCrtUserStr(String crtUserStr) {
		this.crtUserStr = crtUserStr;
	}
	public String getModUserStr() {
		return modUserStr;
	}
	public void setModUserStr(String modUserStr) {
		this.modUserStr = modUserStr;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getModTimeStr() {
		return modTimeStr;
	}
	public void setModTimeStr(String modTimeStr) {
		this.modTimeStr = modTimeStr;
	}
}