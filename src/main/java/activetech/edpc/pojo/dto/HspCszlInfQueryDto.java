package activetech.edpc.pojo.dto;

import java.util.Date;
import java.util.List;

import activetech.base.pojo.dto.PageQuery;
import activetech.hospital.pojo.dto.HspemginfCustom;

public class HspCszlInfQueryDto {
	private PageQuery pageQuery;
	private Date startdate;
	private Date enddate;
	private String jbzdDes;
	private String cstNam;
	private Date fbsj;
	private String cstSexCod;
	private Date emgDat;
	private String cstAge;
	private String emgSeq;
	private String vstCad;
	private Date bthDat;
	private String arvChlCod;
	
	private HspCszlInfCustom hspCszlInfCustom;
	private List<HspCszlInfCustom> cszlInfList;
	
	private HspemginfCustom hspemginfCustom;

	public HspCszlInfCustom getHspCszlInfCustom() {
		return hspCszlInfCustom;
	}

	public void setHspCszlInfCustom(HspCszlInfCustom hspCszlInfCustom) {
		this.hspCszlInfCustom = hspCszlInfCustom;
	}

	public List<HspCszlInfCustom> getCszlInfList() {
		return cszlInfList;
	}

	public void setCszlInfList(List<HspCszlInfCustom> cszlInfList) {
		this.cszlInfList = cszlInfList;
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

	public String getJbzdDes() {
		return jbzdDes;
	}

	public void setJbzdDes(String jbzdDes) {
		this.jbzdDes = jbzdDes;
	}

	public String getCstNam() {
		return cstNam;
	}

	public void setCstNam(String cstNam) {
		this.cstNam = cstNam;
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

	public String getEmgSeq() {
		return emgSeq;
	}

	public void setEmgSeq(String emgSeq) {
		this.emgSeq = emgSeq;
	}

	public String getVstCad() {
		return vstCad;
	}

	public void setVstCad(String vstCad) {
		this.vstCad = vstCad;
	}

	public Date getBthDat() {
		return bthDat;
	}

	public void setBthDat(Date bthDat) {
		this.bthDat = bthDat;
	}

	public String getArvChlCod() {
		return arvChlCod;
	}

	public void setArvChlCod(String arvChlCod) {
		this.arvChlCod = arvChlCod;
	}

	public HspemginfCustom getHspemginfCustom() {
		return hspemginfCustom;
	}

	public void setHspemginfCustom(HspemginfCustom hspemginfCustom) {
		this.hspemginfCustom = hspemginfCustom;
	}

	
	
}
