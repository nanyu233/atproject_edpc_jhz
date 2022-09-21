package activetech.base.pojo.dto;

public class DstKsjhQueryDto {
	private DstKsjhCustom dstKsjhCustom;
	//分页
	private PageQuery pageQuery;
	String sort;
	String order;

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

	public DstKsjhCustom getDstKsjhCustom() {
		return dstKsjhCustom;
	}

	public void setDstKsjhCustom(DstKsjhCustom dstKsjhCustom) {
		this.dstKsjhCustom = dstKsjhCustom;
	}
	

}
