package activetech.zyyhospital.pojo.dto;

import java.util.Date;
import java.util.List;

import activetech.basehis.pojo.dto.HspAotographInfoCustom;
import activetech.zyyhospital.pojo.domain.HspCfjlInf;

public class HspCfjlInfCustom extends HspCfjlInf{
	
	private String cfjlDatString;
	private Long comparatorVal; //排序用
	
	private List<HspAotographInfoCustom> hspAotographInfoList;
	
	public List<HspAotographInfoCustom> getHspAotographInfoList() {
		return hspAotographInfoList;
	}

	public void setHspAotographInfoList(List<HspAotographInfoCustom> hspAotographInfoList) {
		this.hspAotographInfoList = hspAotographInfoList;
	}

	public String getCfjlDatString() {
		return cfjlDatString;
	}

	public void setCfjlDatString(String cfjlDatString) {
		this.cfjlDatString = cfjlDatString;
	}

	public Long getComparatorVal() {
		return comparatorVal;
	}

	public void setComparatorVal(Long comparatorVal) {
		this.comparatorVal = comparatorVal;
	}

}
