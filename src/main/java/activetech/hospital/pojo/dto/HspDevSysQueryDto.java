package activetech.hospital.pojo.dto;

import activetech.base.pojo.dto.PageQuery;

public class HspDevSysQueryDto {
	
	private HspDevSysCustom hspDevSysCustom;
	//分页
	private PageQuery pageQuery;
	
	public HspDevSysCustom getHspDevSysCustom() {
		return hspDevSysCustom;
	}
	public void setHspDevSysCustom(HspDevSysCustom hspDevSysCustom) {
		this.hspDevSysCustom = hspDevSysCustom;
	}
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

}
