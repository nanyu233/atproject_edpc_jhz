package activetech.base.pojo.dto;
/**
 * 
 * <p>Title:DstmoduleQueryDto</p>
 * <p>Description:模块管理分装类</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年1月18日 下午2:59:10
 *
 */
public class DstmoduleQueryDto {
	private DstmoduleCustom dstmoduleCustom;
	//分页
	private PageQuery pageQuery;
	public DstmoduleCustom getDstmoduleCustom() {
		return dstmoduleCustom;
	}
	public void setDstmoduleCustom(DstmoduleCustom dstmoduleCustom) {
		this.dstmoduleCustom = dstmoduleCustom;
	}
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	
	
}
