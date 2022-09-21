package activetech.zyyhospital.pojo.dto;

import java.util.Date;

public class HspBchzhzReportCustom {
	private Date datetime;
	private Integer count;
	private Date startdate;
	private Date enddate;
	
	private String jiaobc;//班次
	private int jbcs; //交班次数
	private int jbzrcs; //交班总人次数
	private int pthzzrcs;//普通患者总人次数
	private int wzhzzrcs;//危重患者总人次数
	private int xrqcount;//新入抢总人次数
	private int cgcount;//出观总人次数
	private int cgzycount;//住院总人次数
	private int cgswcount;//死亡总人次数
	private int cghjcount;//回家总人次数
	private int cgzdlycount;//自动离院总人次数
	private int zyuancount;//转院总人次数
	private String asd;
	
	
	public String getAsd() {
		return asd;
	}
	public void setAsd(String asd) {
		this.asd = asd;
	}
	public String getJiaobc() {
		return jiaobc;
	}
	public void setJiaobc(String jiaobc) {
		this.jiaobc = jiaobc;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public int getJbcs() {
		return jbcs;
	}
	public void setJbcs(int jbcs) {
		this.jbcs = jbcs;
	}
	public int getJbzrcs() {
		return jbzrcs;
	}
	public void setJbzrcs(int jbzrcs) {
		this.jbzrcs = jbzrcs;
	}
	public int getPthzzrcs() {
		return pthzzrcs;
	}
	public void setPthzzrcs(int pthzzrcs) {
		this.pthzzrcs = pthzzrcs;
	}
	public int getWzhzzrcs() {
		return wzhzzrcs;
	}
	public void setWzhzzrcs(int wzhzzrcs) {
		this.wzhzzrcs = wzhzzrcs;
	}
	public int getXrqcount() {
		return xrqcount;
	}
	public void setXrqcount(int xrqcount) {
		this.xrqcount = xrqcount;
	}
	public int getCgcount() {
		return cgcount;
	}
	public void setCgcount(int cgcount) {
		this.cgcount = cgcount;
	}
	public int getCgzycount() {
		return cgzycount;
	}
	public void setCgzycount(int cgzycount) {
		this.cgzycount = cgzycount;
	}
	public int getCgswcount() {
		return cgswcount;
	}
	public void setCgswcount(int cgswcount) {
		this.cgswcount = cgswcount;
	}
	public int getCghjcount() {
		return cghjcount;
	}
	public void setCghjcount(int cghjcount) {
		this.cghjcount = cghjcount;
	}
	public int getCgzdlycount() {
		return cgzdlycount;
	}
	public void setCgzdlycount(int cgzdlycount) {
		this.cgzdlycount = cgzdlycount;
	}
	public int getZyuancount() {
		return zyuancount;
	}
	public void setZyuancount(int zyuancount) {
		this.zyuancount = zyuancount;
	}
	
	
}
