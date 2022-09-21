package activetech.zyyhospital.pojo.dto;

import activetech.base.pojo.dto.PageQuery;

public class ZyyTshljlQueryDto {
	
	/**
	 * 洗胃病情护理记录单自定义实体类
	 */
	private HspXwhljldInfCustom hspXwhljldInfCustom;
	
	/**
	 * 机械通气病情护理记录单自定义实体类
	 */
	private HspJxtqhljldInfCustom hspJxtqhljldInfCustom;
	
	/**
	 * 分页
	 */
	private PageQuery pageQuery;

	public HspJxtqhljldInfCustom getHspJxtqhljldInfCustom() {
		return hspJxtqhljldInfCustom;
	}

	public void setHspJxtqhljldInfCustom(HspJxtqhljldInfCustom hspJxtqhljldInfCustom) {
		this.hspJxtqhljldInfCustom = hspJxtqhljldInfCustom;
	}

	public HspXwhljldInfCustom getHspXwhljldInfCustom() {
		return hspXwhljldInfCustom;
	}

	public void setHspXwhljldInfCustom(HspXwhljldInfCustom hspXwhljldInfCustom) {
		this.hspXwhljldInfCustom = hspXwhljldInfCustom;
	}

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
}
