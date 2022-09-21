package activetech.zyyhospital.pojo.dto;

import activetech.base.pojo.dto.PageQuery;

public class HspModelInfQueryDto {
	private HspModelInfCustom hspModelInfCustom;
	private HspModelcontInfCustom hspModelcontInfCustom;
	//分页
	private PageQuery pageQuery;
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	public HspModelInfCustom getHspModelInfCustom() {
		return hspModelInfCustom;
	}
	public void setHspModelInfCustom(HspModelInfCustom hspModelInfCustom) {
		this.hspModelInfCustom = hspModelInfCustom;
	}
	public HspModelcontInfCustom getHspModelcontInfCustom() {
		return hspModelcontInfCustom;
	}
	public void setHspModelcontInfCustom(HspModelcontInfCustom hspModelcontInfCustom) {
		this.hspModelcontInfCustom = hspModelcontInfCustom;
	}

}
