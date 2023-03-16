package activetech.basehis.pojo.dto;

import activetech.base.pojo.dto.PageQuery;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.zyyhospital.pojo.dto.HspDocadviceInfCustom;

import java.util.List;

public class VHemsJyjgQueryDto {

	private VHemsJyjgCustom vHemsJyjgCustom;
	private VHemsJcjgCustom vHemsJcjgCustom;
	private HspDocadviceInfCustom hspDocadviceInfCustom;
	private HspemginfCustom hspemginfCustom;
	private List<String> docadviceSeqList;
	//分页
	private PageQuery pageQuery;
	String sort;
	String order;
	
	
	public HspDocadviceInfCustom getHspDocadviceInfCustom() {
		return hspDocadviceInfCustom;
	}
	public void setHspDocadviceInfCustom(HspDocadviceInfCustom hspDocadviceInfCustom) {
		this.hspDocadviceInfCustom = hspDocadviceInfCustom;
	}
	
	public VHemsJcjgCustom getvHemsJcjgCustom() {
		return vHemsJcjgCustom;
	}
	public void setvHemsJcjgCustom(VHemsJcjgCustom vHemsJcjgCustom) {
		this.vHemsJcjgCustom = vHemsJcjgCustom;
	}
	public VHemsJyjgCustom getvHemsJyjgCustom() {
		return vHemsJyjgCustom;
	}
	public void setvHemsJyjgCustom(VHemsJyjgCustom vHemsJyjgCustom) {
		this.vHemsJyjgCustom = vHemsJyjgCustom;
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
	public HspemginfCustom getHspemginfCustom() {
		return hspemginfCustom;
	}
	public void setHspemginfCustom(HspemginfCustom hspemginfCustom) {
		this.hspemginfCustom = hspemginfCustom;
	}
	public List<String> getDocadviceSeqList() {
		return docadviceSeqList;
	}
	public void setDocadviceSeqList(List<String> docadviceSeqList) {
		this.docadviceSeqList = docadviceSeqList;
	}
}
