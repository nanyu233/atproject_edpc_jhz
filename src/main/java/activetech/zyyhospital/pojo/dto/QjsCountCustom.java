package activetech.zyyhospital.pojo.dto;

import java.util.Date;

/**
 * 抢救室统计对象
 */
public class QjsCountCustom {

	private Date startDate;
	private Date endDate;
    private String qjsbedcount;//抢救室床位
    private String lgsbedcount;//留观室床位
    private int zlcount;//大于24小时滞留人数
    private int lstdcount;//绿色通道人数
    private int cscount;//创伤人数
    private int xtcount;//胸痛人数
    private int czcount;//卒中人数
    private int hxkncount;//呼吸困难人数
    private int xfztcount;//心肺骤停人数
    private int qtsjcount;//群体伤人数
    
    
	
	public int getQtsjcount() {
		return qtsjcount;
	}
	public void setQtsjcount(int qtsjcount) {
		this.qtsjcount = qtsjcount;
	}
	public String getQjsbedcount() {
		return qjsbedcount;
	}
	public String getLgsbedcount() {
		return lgsbedcount;
	}
	public void setQjsbedcount(String qjsbedcount) {
		this.qjsbedcount = qjsbedcount;
	}
	public void setLgsbedcount(String lgsbedcount) {
		this.lgsbedcount = lgsbedcount;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getZlcount() {
		return zlcount;
	}
	public void setZlcount(int zlcount) {
		this.zlcount = zlcount;
	}
	public int getLstdcount() {
		return lstdcount;
	}
	public void setLstdcount(int lstdcount) {
		this.lstdcount = lstdcount;
	}
	public int getCscount() {
		return cscount;
	}
	public void setCscount(int cscount) {
		this.cscount = cscount;
	}
	public int getXtcount() {
		return xtcount;
	}
	public void setXtcount(int xtcount) {
		this.xtcount = xtcount;
	}
	public int getCzcount() {
		return czcount;
	}
	public void setCzcount(int czcount) {
		this.czcount = czcount;
	}
	public int getHxkncount() {
		return hxkncount;
	}
	public void setHxkncount(int hxkncount) {
		this.hxkncount = hxkncount;
	}
	public int getXfztcount() {
		return xfztcount;
	}
	public void setXfztcount(int xfztcount) {
		this.xfztcount = xfztcount;
	}
	@Override
	public String toString() {
		return "QjsCountCustom [qjsbedcount=" + qjsbedcount + ", lgsbedcount=" + lgsbedcount + ", zlcount=" + zlcount
				+ ", lstdcount=" + lstdcount + ", cscount=" + cscount + ", xtcount=" + xtcount + ", czcount=" + czcount
				+ ", hxkncount=" + hxkncount + ", xfztcount=" + xfztcount + "]";
	}
}
