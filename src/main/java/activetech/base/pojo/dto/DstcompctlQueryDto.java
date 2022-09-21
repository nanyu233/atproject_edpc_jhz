package activetech.base.pojo.dto;
/**
 * 
 * <p>Title:DstcompctlQueryDto</p>
 * <p>Description:机构管理分装类</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年1月22日 上午9:28:12
 *
 */
public class DstcompctlQueryDto {
    private DstcompctlCustom dstcompctlCustom;
	private PageQuery pageQuery;

	
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	public DstcompctlCustom getDstcompctlCustom() {
		return dstcompctlCustom;
	}
	public void setDstcompctlCustom(DstcompctlCustom dstcompctlCustom) {
		this.dstcompctlCustom = dstcompctlCustom;
	}
}
