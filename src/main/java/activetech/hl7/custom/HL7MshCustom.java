package activetech.hl7.custom;

import java.util.Date;

public class HL7MshCustom {
	private String msh1; //分隔符
	private String msh2;
	private String msh3_1; //发送程序简称
	private String msh3_2; //发送方院区 ID
	private String msh4_1; //发送设备
	private String msh5_1;  //接收程序简称
	private String msh5_2; //接收方院区 ID
	private String msh6_1;  //接收设备
	private Date msh7_1;  //消息发生的时间
	private String msh9_1;  //消息类型
	private String msh9_2; //事件
	private String msh9_3; //消息结构
	private String msh10; //唯一标识
	private String msh11_1;
	private String msh12_1;
	private String msh13_1;
	private String msh15_1;
	private String msh16_1;
	private String msh18_1;
	
	public HL7MshCustom(Date msh7_1, String msh9_1, String msh9_2, String msh9_3, String msh10) {
		super();
		this.msh7_1 = msh7_1;
		this.msh9_1 = msh9_1;
		this.msh9_2 = msh9_2;
		this.msh9_3 = msh9_3;
		this.msh10 = msh10;
		
		msh1 = "|";
		msh2 = "^~\\&";
		msh3_1 = "EMIS";
		msh5_1 = "EMR";
		msh11_1 = "P";
		msh12_1 = "2.6";
		msh15_1 = "NE";
		msh16_1 = "AL";
		msh18_1 = "utf-8";
	}
	
	

	public String getMsh1() {
		return msh1;
	}

	public void setMsh1(String msh1) {
		this.msh1 = msh1;
	}

	public String getMsh2() {
		return msh2;
	}

	public void setMsh2(String msh2) {
		this.msh2 = msh2;
	}

	public String getMsh3_1() {
		return msh3_1;
	}

	public void setMsh3_1(String msh3_1) {
		this.msh3_1 = msh3_1;
	}

	public String getMsh4_1() {
		return msh4_1;
	}

	public void setMsh4_1(String msh4_1) {
		this.msh4_1 = msh4_1;
	}

	public String getMsh5_1() {
		return msh5_1;
	}

	public void setMsh5_1(String msh5_1) {
		this.msh5_1 = msh5_1;
	}

	public String getMsh6_1() {
		return msh6_1;
	}

	public void setMsh6_1(String msh6_1) {
		this.msh6_1 = msh6_1;
	}

	public Date getMsh7_1() {
		return msh7_1;
	}

	public void setMsh7_1(Date msh7_1) {
		this.msh7_1 = msh7_1;
	}

	public String getMsh9_1() {
		return msh9_1;
	}

	public void setMsh9_1(String msh9_1) {
		this.msh9_1 = msh9_1;
	}

	public String getMsh9_2() {
		return msh9_2;
	}

	public void setMsh9_2(String msh9_2) {
		this.msh9_2 = msh9_2;
	}

	public String getMsh9_3() {
		return msh9_3;
	}

	public void setMsh9_3(String msh9_3) {
		this.msh9_3 = msh9_3;
	}

	public String getMsh10() {
		return msh10;
	}

	public void setMsh10(String msh10) {
		this.msh10 = msh10;
	}

	public String getMsh11_1() {
		return msh11_1;
	}

	public void setMsh11_1(String msh11_1) {
		this.msh11_1 = msh11_1;
	}

	public String getMsh12_1() {
		return msh12_1;
	}

	public void setMsh12_1(String msh12_1) {
		this.msh12_1 = msh12_1;
	}

	public String getMsh3_2() {
		return msh3_2;
	}

	public void setMsh3_2(String msh3_2) {
		this.msh3_2 = msh3_2;
	}

	public String getMsh5_2() {
		return msh5_2;
	}

	public void setMsh5_2(String msh5_2) {
		this.msh5_2 = msh5_2;
	}

	public String getMsh13_1() {
		return msh13_1;
	}

	public void setMsh13_1(String msh13_1) {
		this.msh13_1 = msh13_1;
	}

	public String getMsh15_1() {
		return msh15_1;
	}

	public void setMsh15_1(String msh15_1) {
		this.msh15_1 = msh15_1;
	}

	public String getMsh16_1() {
		return msh16_1;
	}

	public void setMsh16_1(String msh16_1) {
		this.msh16_1 = msh16_1;
	}

	public String getMsh18_1() {
		return msh18_1;
	}

	public void setMsh18_1(String msh18_1) {
		this.msh18_1 = msh18_1;
	}
	
}
