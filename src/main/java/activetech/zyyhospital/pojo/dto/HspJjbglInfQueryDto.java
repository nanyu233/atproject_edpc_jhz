package activetech.zyyhospital.pojo.dto;

import java.util.Date;
import java.util.List;

import activetech.base.pojo.dto.PageQuery;
import activetech.hospital.pojo.dto.HspemginfCustom;

public class HspJjbglInfQueryDto {
	private HspJjbglInfCustom hspJjbglInfCustom;
	private HspemginfCustom hspemginfCustom;
	private HspJjbhzmxCustom hspJjbhzmxCustom;
	private List<HspJjbhzmxCustom> hspJjbhzmxCustomList;
	private List<String> emgSeq;
	private String jjbglSeq;
	private String emgType;
	//分页
	private PageQuery pageQuery;
	
	private Date startdate;
	private Date enddate;
	private String querytype;
	private String cstNam;
	
	private String jiaoBc;
	
    String sort;
    String order;
    String acronym;
	
    
	public String getQuerytype() {
		return querytype;
	}
	public void setQuerytype(String querytype) {
		this.querytype = querytype;
	}
	public String getJiaoBc() {
		return jiaoBc;
	}
	public void setJiaoBc(String jiaoBc) {
		this.jiaoBc = jiaoBc;
	}
	public String getJjbglSeq() {
		return jjbglSeq;
	}
	public void setJjbglSeq(String jjbglSeq) {
		this.jjbglSeq = jjbglSeq;
	}
	public String getEmgType() {
		return emgType;
	}
	public void setEmgType(String emgType) {
		this.emgType = emgType;
	}
	public List<String> getEmgSeq() {
		return emgSeq;
	}
	public void setEmgSeq(List<String> emgSeq) {
		this.emgSeq = emgSeq;
	}
	public List<HspJjbhzmxCustom> getHspJjbhzmxCustomList() {
		return hspJjbhzmxCustomList;
	}
	public void setHspJjbhzmxCustomList(List<HspJjbhzmxCustom> hspJjbhzmxCustomList) {
		this.hspJjbhzmxCustomList = hspJjbhzmxCustomList;
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
	public String getAcronym() {
		return acronym;
	}
	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}
	public HspJjbhzmxCustom getHspJjbhzmxCustom() {
		return hspJjbhzmxCustom;
	}
	public void setHspJjbhzmxCustom(HspJjbhzmxCustom hspJjbhzmxCustom) {
		this.hspJjbhzmxCustom = hspJjbhzmxCustom;
	}
	public HspJjbglInfCustom getHspJjbglInfCustom() {
		return hspJjbglInfCustom;
	}
	public void setHspJjbglInfCustom(HspJjbglInfCustom hspJjbglInfCustom) {
		this.hspJjbglInfCustom = hspJjbglInfCustom;
	}
	public HspemginfCustom getHspemginfCustom() {
		return hspemginfCustom;
	}
	public void setHspemginfCustom(HspemginfCustom hspemginfCustom) {
		this.hspemginfCustom = hspemginfCustom;
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
	public String getCstNam() {
		return cstNam;
	}
	public void setCstNam(String cstNam) {
		this.cstNam = cstNam;
	}
	
	
}
