package activetech.base.pojo.dto;

import java.util.List;

public class HighChartsDemoCustom {
	private String name;
	private String infocode;
	private Integer count;
	private List<HighChartsDemoCustom> ageGroup; //年龄组
	
	private int rscount;//当日患者人数
		
	private int srlcount;//月死亡率
	
	private double qjzwscount;//月抢救中位数
	
	private int ylqcount;//月留抢人数
	
	private int yhzavgtime;//月会诊平均时间
	
	private int jrlqcount;//今日留抢人数
	
	/**
	 * 日发热人数
	 */
	private int dayHeat;
	
	/**
	 * 日绿色通道人数
	 */
	private int lstdCount;
	
	/**
	 * 绿色通道占留抢总数的百分比 
	 */
	private String lstdRtio;
	
	/**
	 * 日会诊人数
	 */
	private int hzCount;
	
	/**
	 * 会诊人数占留抢总数百分比
	 */
	private String hzRito;
	
	/**
	 * 日住院人数
	 */
	private int dayInHospital;
	
	/**
	 * 住院人数占留抢总数百分比
	 */
	private String dayInHospitalRito;
	
	/**
	 * 日死亡数
	 */
	private int deathCount;
	
	/**
	 * 死亡数占留抢总数百分比
	 */
	private String deathCountRito;
	
	/**
	 * 月急诊人数
	 */
	private int yjzrs;
	
	/**
	 * 月胸痛人数
	 */
	private int xtCount;
	
	/**
	 * 月卒中人数
	 */
	private int czCont;
	
	/**
	 * 月创伤人数
	 */
	private int csCount;
	
	
	public String getInfocode() {
		return infocode;
	}
	public void setInfocode(String infocode) {
		this.infocode = infocode;
	}
	public int getJrlqcount() {
		return jrlqcount;
	}
	public void setJrlqcount(int jrlqcount) {
		this.jrlqcount = jrlqcount;
	}
	public int getYhzavgtime() {
		return yhzavgtime;
	}
	public void setYhzavgtime(int yhzavgtime) {
		this.yhzavgtime = yhzavgtime;
	}
	public int getYlqcount() {
		return ylqcount;
	}
	public void setYlqcount(int ylqcount) {
		this.ylqcount = ylqcount;
	}
	public double getQjzwscount() {
		return qjzwscount;
	}
	public void setQjzwscount(double qjzwscount) {
		this.qjzwscount = qjzwscount;
	}
	public int getSrlcount() {
		return srlcount;
	}
	public void setSrlcount(int srlcount) {
		this.srlcount = srlcount;
	}
	public int getRscount() {
		return rscount;
	}
	public void setRscount(int rscount) {
		this.rscount = rscount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public List<HighChartsDemoCustom> getAgeGroup() {
		return ageGroup;
	}
	public void setAgeGroup(List<HighChartsDemoCustom> ageGroup) {
		this.ageGroup = ageGroup;
	}
	public HighChartsDemoCustom(String name) {
		super();
		this.name = name;
	}
	public HighChartsDemoCustom() {
		super();
	}
	public int getDayHeat() {
		return dayHeat;
	}
	public void setDayHeat(int dayHeat) {
		this.dayHeat = dayHeat;
	}
	public int getLstdCount() {
		return lstdCount;
	}
	public void setLstdCount(int lstdCount) {
		this.lstdCount = lstdCount;
	}
	public String getLstdRtio() {
		return lstdRtio;
	}
	public void setLstdRtio(String lstdRtio) {
		this.lstdRtio = lstdRtio;
	}
	public int getHzCount() {
		return hzCount;
	}
	public void setHzCount(int hzCount) {
		this.hzCount = hzCount;
	}
	public String getHzRito() {
		return hzRito;
	}
	public void setHzRito(String hzRito) {
		this.hzRito = hzRito;
	}
	public int getDayInHospital() {
		return dayInHospital;
	}
	public void setDayInHospital(int dayInHospital) {
		this.dayInHospital = dayInHospital;
	}
	public String getDayInHospitalRito() {
		return dayInHospitalRito;
	}
	public void setDayInHospitalRito(String dayInHospitalRito) {
		this.dayInHospitalRito = dayInHospitalRito;
	}
	public int getDeathCount() {
		return deathCount;
	}
	public void setDeathCount(int deathCount) {
		this.deathCount = deathCount;
	}
	public String getDeathCountRito() {
		return deathCountRito;
	}
	public void setDeathCountRito(String deathCountRito) {
		this.deathCountRito = deathCountRito;
	}
	public int getYjzrs() {
		return yjzrs;
	}
	public void setYjzrs(int yjzrs) {
		this.yjzrs = yjzrs;
	}
	public int getXtCount() {
		return xtCount;
	}
	public void setXtCount(int xtCount) {
		this.xtCount = xtCount;
	}
	public int getCzCont() {
		return czCont;
	}
	public void setCzCont(int czCont) {
		this.czCont = czCont;
	}
	public int getCsCount() {
		return csCount;
	}
	public void setCsCount(int csCount) {
		this.csCount = csCount;
	}
	
	
}
