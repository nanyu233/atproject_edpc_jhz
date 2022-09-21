package activetech.edpc.pojo.dto;

import java.util.Date;
import java.util.List;

import activetech.base.pojo.dto.PageQuery;
import activetech.hospital.pojo.dto.HspemginfCustom;

public class HspCzzlInfQueryDto {
	private PageQuery pageQuery;
	private Date startdate;
	private Date enddate;
	private String zd;
	private String zdys;
	private String cstNam;
	private Date fbsj;
	private String cstSexCod;
	private Date emgDat;
	private String cstAge;
	private String emgSeq;
	
	private HspemginfCustom hspemginfCustom;
	private HspCzzlInfCustom hspCzzlInfCustom;
	private List<HspCzzlInfCustom> czzlInfList;
	
	public String getEmgSeq() {
		return emgSeq;
	}
	public void setEmgSeq(String emgSeq) {
		this.emgSeq = emgSeq;
	}
	public List<HspCzzlInfCustom> getCzzlInfList() {
		return czzlInfList;
	}
	public void setCzzlInfList(List<HspCzzlInfCustom> czzlInfList) {
		this.czzlInfList = czzlInfList;
	}
	public Date getFbsj() {
		return fbsj;
	}
	public void setFbsj(Date fbsj) {
		this.fbsj = fbsj;
	}
	public String getCstSexCod() {
		return cstSexCod;
	}
	public void setCstSexCod(String cstSexCod) {
		this.cstSexCod = cstSexCod;
	}
	public Date getEmgDat() {
		return emgDat;
	}
	public void setEmgDat(Date emgDat) {
		this.emgDat = emgDat;
	}
	public String getCstAge() {
		return cstAge;
	}
	public void setCstAge(String cstAge) {
		this.cstAge = cstAge;
	}
	public String getZdys() {
		return zdys;
	}
	public void setZdys(String zdys) {
		this.zdys = zdys;
	}
	public String getCstNam() {
		return cstNam;
	}
	public void setCstNam(String cstNam) {
		this.cstNam = cstNam;
	}
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
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
	public String getZd() {
		return zd;
	}
	public void setZd(String zd) {
		this.zd = zd;
	}
	public HspemginfCustom getHspemginfCustom() {
		return hspemginfCustom;
	}
	public void setHspemginfCustom(HspemginfCustom hspemginfCustom) {
		this.hspemginfCustom = hspemginfCustom;
	}
	public HspCzzlInfCustom getHspCzzlInfCustom() {
		return hspCzzlInfCustom;
	}
	public void setHspCzzlInfCustom(HspCzzlInfCustom hspCzzlInfCustom) {
		this.hspCzzlInfCustom = hspCzzlInfCustom;
	}
	
}
