package activetech.edpc.pojo.dto;

import java.util.Date;
import java.util.List;

import activetech.base.pojo.dto.PageQuery;
import activetech.hospital.pojo.domain.HspEmgInf;

public class XtHspEmgInfQueryDto extends HspEmgInf{
	//分页
	private PageQuery pageQuery;
	String sort;
	String order;
	private Date startDate;		//开始时间
	private Date endDate;		//结束时间
	
	private String cbzd;		//初步诊断
	private String dyfs;		//到院方式
	private String ccdw;		//出车单位
	private String yqrszl;		//院前溶栓治疗
	private	String yqrscs;		//院前溶栓场所
	private String fbsj;			//发病时间
	private String scyljcsj;
	private List<HspXtzlInfCustom> xtzlInfs;
	private String regSeq;   //Hsp_dbzl_bas的主键
	
	private String wayTyp;//区别绕行，院内，普通急诊的胸痛患者
	
	
	public String getWayTyp() {
		return wayTyp;
	}
	public void setWayTyp(String wayTyp) {
		this.wayTyp = wayTyp;
	}
	public List<HspXtzlInfCustom> getXtzlInfs() {
		return xtzlInfs;
	}
	public void setXtzlInfs(List<HspXtzlInfCustom> xtzlInfs) {
		this.xtzlInfs = xtzlInfs;
	}
	
	public String getFbsj() {
		return fbsj;
	}
	public void setFbsj(String fbsj) {
		this.fbsj = fbsj;
	}
	public String getScyljcsj() {
		return scyljcsj;
	}
	public void setScyljcsj(String scyljcsj) {
		this.scyljcsj = scyljcsj;
	}
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
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
	public String getCbzd() {
		return cbzd;
	}
	public void setCbzd(String cbzd) {
		this.cbzd = cbzd;
	}
	public String getDyfs() {
		return dyfs;
	}
	public void setDyfs(String dyfs) {
		this.dyfs = dyfs;
	}
	public String getCcdw() {
		return ccdw;
	}
	public void setCcdw(String ccdw) {
		this.ccdw = ccdw;
	}
	public String getYqrszl() {
		return yqrszl;
	}
	public void setYqrszl(String yqrszl) {
		this.yqrszl = yqrszl;
	}
	public String getYqrscs() {
		return yqrscs;
	}
	public void setYqrscs(String yqrscs) {
		this.yqrscs = yqrscs;
	}

	public String getRegSeq() {
		return regSeq;
	}

	public void setRegSeq(String regSeq) {
		this.regSeq = regSeq;
	}
}
