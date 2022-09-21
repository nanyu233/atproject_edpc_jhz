package activetech.zyyhospital.pojo.dto;

import java.util.List;

import activetech.basehis.pojo.dto.HspAotographInfoCustom;
import activetech.zyyhospital.pojo.domain.HspQjjlInf;

public class HspQjjlInfCustom extends HspQjjlInf{
	
	private String qjjlDatString;
	private String qjjlJldatString;
	private Long comparatorVal; //排序用
	/**
	 * 电子签名对象
	 */
	private List<HspAotographInfoCustom> hspAotographInfoList;
	
	public List<HspAotographInfoCustom> getHspAotographInfoList() {
		return hspAotographInfoList;
	}
	public void setHspAotographInfoList(List<HspAotographInfoCustom> hspAotographInfoList) {
		this.hspAotographInfoList = hspAotographInfoList;
	}
	public String getQjjlDatString() {
		return qjjlDatString;
	}
	public void setQjjlDatString(String qjjlDatString) {
		this.qjjlDatString = qjjlDatString;
	}
	public String getQjjlJldatString() {
		return qjjlJldatString;
	}
	public void setQjjlJldatString(String qjjlJldatString) {
		this.qjjlJldatString = qjjlJldatString;
	}
	public Long getComparatorVal() {
		return comparatorVal;
	}
	public void setComparatorVal(Long comparatorVal) {
		this.comparatorVal = comparatorVal;
	}

}
