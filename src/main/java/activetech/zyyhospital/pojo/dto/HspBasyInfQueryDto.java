package activetech.zyyhospital.pojo.dto;

import java.util.Date;
import java.util.List;

import activetech.base.pojo.dto.PageQuery;
import activetech.hospital.pojo.dto.HspemginfCustom;

public class HspBasyInfQueryDto {

	/**
	 * 病案首页自定义实体类
	 */
	private HspBasyInfCustom hspBasyCustom;
	
	/**
	 * 预检表自定义实体类
	 */
	private HspemginfCustom hspemginfCustom;
	
	/**
	 * 排序字段
	 */
	private String sort;
	
	/**
	 * 排序类型
	 */
	private String order;
	
	private List<String> scoIdList;
	
	/**
	 * 查询方式
	 */
	private String querytype;
	
	/**
	 * 开始时间
	 */
	private Date startdate;
	
	/**
	 * 结束时间
	 */
	private Date enddate;
	
	/**
	 * 分页
	 */
	private PageQuery pageQuery;
	
	
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
	public String getQuerytype() {
		return querytype;
	}
	public void setQuerytype(String querytype) {
		this.querytype = querytype;
	}
	public List<String> getScoIdList() {
		return scoIdList;
	}
	public void setScoIdList(List<String> scoIdList) {
		this.scoIdList = scoIdList;
	}
	public HspBasyInfCustom getHspBasyCustom() {
		return hspBasyCustom;
	}
	public void setHspBasyCustom(HspBasyInfCustom hspBasyCustom) {
		this.hspBasyCustom = hspBasyCustom;
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
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	public HspemginfCustom getHspemginfCustom() {
		return hspemginfCustom;
	}
	public void setHspemginfCustom(HspemginfCustom hspemginfCustom) {
		this.hspemginfCustom = hspemginfCustom;
	}
	
}
