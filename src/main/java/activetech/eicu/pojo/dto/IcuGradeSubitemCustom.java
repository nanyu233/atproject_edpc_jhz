package activetech.eicu.pojo.dto;

import activetech.eicu.pojo.domain.IcuGradeSubitem;

public class IcuGradeSubitemCustom extends IcuGradeSubitem {
	private String itemFlag;
	private String fieldSort;
	private String itemRoot;
	
	public String getFieldSort() {
		return fieldSort;
	}
	public void setFieldSort(String fieldSort) {
		this.fieldSort = fieldSort;
	}
	public String getItemFlag() {
		return itemFlag;
	}
	public void setItemFlag(String itemFlag) {
		this.itemFlag = itemFlag;
	}
	public String getItemRoot() {
		return itemRoot;
	}
	public void setItemRoot(String itemRoot) {
		this.itemRoot = itemRoot;
	}
}