package activetech.base.pojo.dto;
/**
 * 
 * <p>Title:DstoperationQueryDto</p>
 * <p>Description:操作管理分装类</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年1月18日 下午2:58:19
 *
 */
public class DstoperationQueryDto {
 private DstoperationCustom dstoperationCustom;
//分页
	private PageQuery pageQuery;
	
	
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	public DstoperationCustom getDstoperationCustom() {
		return dstoperationCustom;
	}
	public void setDstoperationCustom(DstoperationCustom dstoperationCustom) {
		this.dstoperationCustom = dstoperationCustom;
	}
	
	
}
