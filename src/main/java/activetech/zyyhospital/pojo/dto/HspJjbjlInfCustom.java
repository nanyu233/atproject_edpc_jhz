package activetech.zyyhospital.pojo.dto;

import java.util.Date;

import activetech.zyyhospital.pojo.domain.HspJjbjlInf;

public class HspJjbjlInfCustom extends HspJjbjlInf{
	
	private String jjbjlDatString;
	private Long comparatorVal; //排序用
	
	public String getJjbjlDatString() {
		return jjbjlDatString;
	}

	public void setJjbjlDatString(String jjbjlDatString) {
		this.jjbjlDatString = jjbjlDatString;
	}

	public Long getComparatorVal() {
		return comparatorVal;
	}

	public void setComparatorVal(Long comparatorVal) {
		this.comparatorVal = comparatorVal;
	}

}
