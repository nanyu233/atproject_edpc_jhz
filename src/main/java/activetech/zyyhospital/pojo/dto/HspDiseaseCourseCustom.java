package activetech.zyyhospital.pojo.dto;

import java.util.Date;
import java.util.List;

import activetech.basehis.pojo.dto.HspAotographInfoCustom;
import activetech.zyyhospital.pojo.domain.HspDiseaseCourseWithBLOBs;

public class HspDiseaseCourseCustom extends HspDiseaseCourseWithBLOBs {
	
	private String cstNam;
	private String cstAge;
	private String emgBed;
	private String cstSexCod;
	private String observationCode;
	private String createDocName;
	private String updateDocName;
	private String courseDateStr;
	private Long comparatorVal; //排序用
	private String jbzdDes;  //西医
	private String ryzdXy;  //中医
	
	private List<HspAotographInfoCustom> hspAotographInfoList;
	
	
	public List<HspAotographInfoCustom> getHspAotographInfoList() {
		return hspAotographInfoList;
	}
	public void setHspAotographInfoList(List<HspAotographInfoCustom> hspAotographInfoList) {
		this.hspAotographInfoList = hspAotographInfoList;
	}
	public String getCstNam() {
		return cstNam;
	}
	public void setCstNam(String cstNam) {
		this.cstNam = cstNam;
	}
	public String getCstAge() {
		return cstAge;
	}
	public void setCstAge(String cstAge) {
		this.cstAge = cstAge;
	}
	public String getEmgBed() {
		return emgBed;
	}
	public void setEmgBed(String emgBed) {
		this.emgBed = emgBed;
	}
	public String getCstSexCod() {
		return cstSexCod;
	}
	public void setCstSexCod(String cstSexCod) {
		this.cstSexCod = cstSexCod;
	}
	public String getObservationCode() {
		return observationCode;
	}
	public void setObservationCode(String observationCode) {
		this.observationCode = observationCode;
	}
	public String getCreateDocName() {
		return createDocName;
	}
	public void setCreateDocName(String createDocName) {
		this.createDocName = createDocName;
	}
	public String getUpdateDocName() {
		return updateDocName;
	}
	public void setUpdateDocName(String updateDocName) {
		this.updateDocName = updateDocName;
	}
	public String getCourseDateStr() {
		return courseDateStr;
	}
	public void setCourseDateStr(String courseDateStr) {
		this.courseDateStr = courseDateStr;
	}
	public Long getComparatorVal() {
		return comparatorVal;
	}
	public void setComparatorVal(Long comparatorVal) {
		this.comparatorVal = comparatorVal;
	}
	public String getJbzdDes() {
		return jbzdDes;
	}
	public void setJbzdDes(String jbzdDes) {
		this.jbzdDes = jbzdDes;
	}
	public String getRyzdXy() {
		return ryzdXy;
	}
	public void setRyzdXy(String ryzdXy) {
		this.ryzdXy = ryzdXy;
	}
	
}
