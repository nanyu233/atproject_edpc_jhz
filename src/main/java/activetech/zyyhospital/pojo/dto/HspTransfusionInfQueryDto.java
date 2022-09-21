package activetech.zyyhospital.pojo.dto;

import java.util.Date;

import activetech.base.pojo.dto.PageQuery;

public class HspTransfusionInfQueryDto{
    
	/**
	 * 输血记录自定义实体类
	 */
	private HspTransfusionInfCustom hspTransfusionInfCustom;
	
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
	
	/**
	 * 排序字段
	 */
	private String sort;
	
	/**
	 * 排序类型
	 */
	private String order;

	public HspTransfusionInfCustom getHspTransfusionInfCustom() {
		return hspTransfusionInfCustom;
	}

	public void setHspTransfusionInfCustom(HspTransfusionInfCustom hspTransfusionInfCustom) {
		this.hspTransfusionInfCustom = hspTransfusionInfCustom;
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
	
}