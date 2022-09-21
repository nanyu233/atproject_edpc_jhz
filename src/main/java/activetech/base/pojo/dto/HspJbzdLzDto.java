package activetech.base.pojo.dto;

import activetech.base.pojo.domain.HspJbzdLz;

public class HspJbzdLzDto extends HspJbzdLz {
	private HspJbzdLzCustom hspJbzdLzCustom;
	private PageQuery pageQuery;

	public HspJbzdLzCustom getHspJbzdLzCustom() {
		return hspJbzdLzCustom;
	}

	public void setHspJbzdLzCustom(HspJbzdLzCustom hspJbzdLzCustom) {
		this.hspJbzdLzCustom = hspJbzdLzCustom;
	}

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
}
