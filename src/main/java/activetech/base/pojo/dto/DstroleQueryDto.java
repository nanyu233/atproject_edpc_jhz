package activetech.base.pojo.dto;

/**
 * 
 * <p>Title:DstroleQueryVo</p>
 * <p>Description:角色管理包装类</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2017-1-4 上午10:46:52
 * 
 */
public class DstroleQueryDto {
	private DstroleCustom dstroleCustom;
	//分页
	private PageQuery pageQuery;
	
	public DstroleCustom getDstroleCustom() {
		return dstroleCustom;
	}
	public void setDstroleCustom(DstroleCustom dstroleCustom) {
		this.dstroleCustom = dstroleCustom;
	}
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
}
