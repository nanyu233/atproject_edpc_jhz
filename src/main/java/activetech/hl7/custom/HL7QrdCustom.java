package activetech.hl7.custom;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import activetech.hl7.obiter.Qrd10nCustom;
import activetech.hl7.obiter.Qrd8nCustom;

public class HL7QrdCustom {

	private String qrd1_1;
	private String qrd2;
	private String qrd3;
	private String qrd4;
	private String qrd5;
	private String qrd6_1;
	private String qrd7_1;
	private String qrd7_2_1;
	private List<Qrd8nCustom> qrd8n;
	private String qrd9_1;
	private String qrd9_2;
	private List<Qrd10nCustom> qrd10n;
	private String qrd11n_1;
	private String qrd11n_2;
	private String qrd12;
	
	private String flag;
	public String getQrd1_1() {
		return qrd1_1;
	}
	public void setQrd1_1(String qrd1_1) {
		this.qrd1_1 = qrd1_1;
	}
	public String getQrd2() {
		return qrd2;
	}
	public void setQrd2(String qrd2) {
		this.qrd2 = qrd2;
	}
	public String getQrd3() {
		return qrd3;
	}
	public void setQrd3(String qrd3) {
		this.qrd3 = qrd3;
	}
	public String getQrd4() {
		return qrd4;
	}
	public void setQrd4(String qrd4) {
		this.qrd4 = qrd4;
	}
	public String getQrd5() {
		return qrd5;
	}
	public void setQrd5(String qrd5) {
		this.qrd5 = qrd5;
	}
	public String getQrd6_1() {
		return qrd6_1;
	}
	public void setQrd6_1(String qrd6_1) {
		this.qrd6_1 = qrd6_1;
	}
	public String getQrd7_1() {
		return qrd7_1;
	}
	public void setQrd7_1(String qrd7_1) {
		this.qrd7_1 = qrd7_1;
	}
	public String getQrd7_2_1() {
		return qrd7_2_1;
	}
	public void setQrd7_2_1(String qrd7_2_1) {
		this.qrd7_2_1 = qrd7_2_1;
	}
	public List<Qrd8nCustom> getQrd8n() {
		return qrd8n;
	}
	public void setQrd8n(List<Qrd8nCustom> qrd8n) {
		this.qrd8n = qrd8n;
	}
	public String getQrd9_1() {
		return qrd9_1;
	}
	public void setQrd9_1(String qrd9_1) {
		this.qrd9_1 = qrd9_1;
	}
	public String getQrd9_2() {
		return qrd9_2;
	}
	public void setQrd9_2(String qrd9_2) {
		this.qrd9_2 = qrd9_2;
	}
	public List<Qrd10nCustom> getQrd10n() {
		return qrd10n;
	}
	public void setQrd10n(List<Qrd10nCustom> qrd10n) {
		this.qrd10n = qrd10n;
	}
	public String getQrd11n_1() {
		return qrd11n_1;
	}
	public void setQrd11n_1(String qrd11n_1) {
		this.qrd11n_1 = qrd11n_1;
	}
	public String getQrd11n_2() {
		return qrd11n_2;
	}
	public void setQrd11n_2(String qrd11n_2) {
		this.qrd11n_2 = qrd11n_2;
	}
	public String getQrd12() {
		return qrd12;
	}
	public void setQrd12(String qrd12) {
		this.qrd12 = qrd12;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
	public void getJcQrd(HL7QrdCustom hl7QrdCustom){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String nowDate = sdf.format(new Date());
		hl7QrdCustom.setQrd1_1(nowDate);
		hl7QrdCustom.setQrd2("R");
		hl7QrdCustom.setQrd3("I");
		hl7QrdCustom.setQrd4(nowDate);
		hl7QrdCustom.setQrd7_1("5");
		hl7QrdCustom.setQrd7_2_1("RD");
		hl7QrdCustom.setQrd9_1("R02");
		hl7QrdCustom.setQrd9_2("检查报告");
		hl7QrdCustom.setQrd12("T");
		hl7QrdCustom.setFlag("~");
	}
	
	public void getJzxxQrd(HL7QrdCustom hl7QrdCustom){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String nowDate = sdf.format(new Date());
		hl7QrdCustom.setQrd1_1(nowDate);
		hl7QrdCustom.setQrd2("R");
		hl7QrdCustom.setQrd3("I");
		hl7QrdCustom.setQrd4(nowDate);
		hl7QrdCustom.setQrd7_1("1");
		hl7QrdCustom.setQrd7_2_1("RD");
		hl7QrdCustom.setQrd9_1("A19");
		hl7QrdCustom.setQrd9_2("患者信息");
		hl7QrdCustom.setQrd12("T");
		hl7QrdCustom.setFlag("~");
	}
	
}
