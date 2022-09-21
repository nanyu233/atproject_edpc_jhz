package activetech.base.pojo.dto;

import activetech.base.pojo.dto.PageQuery;

public class HspCbyxglInfQueryDto {
	private HspCbyxglInfCustom hspCbyxglInfCustom;
	//分页
	private PageQuery pageQuery;
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	public HspCbyxglInfCustom getHspCbyxglInfCustom() {
		return hspCbyxglInfCustom;
	}
	public void setHspCbyxglInfCustom(HspCbyxglInfCustom hspCbyxglInfCustom) {
		this.hspCbyxglInfCustom = hspCbyxglInfCustom;
	}


}
