package activetech.base.pojo.dto;

import java.util.List;

/**
 * <p>Title:DstappoptionQueryDto</p>
 * <p>Description:基础设置配置表查询列表</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年1月17日 下午1:59:15
 *
 */
public class DstappoptionQueryDto {
     private DstappoptionCustom dstappoptionCustom;
     private List<DstappoptionCustom> dstappoptionCustoms; 
     //分页
    private PageQuery pageQuery;
	public DstappoptionCustom getDstappoptionCustom() {
		return dstappoptionCustom;
	}
	public void setDstappoptionCustom(DstappoptionCustom dstappoptionCustom) {
		this.dstappoptionCustom = dstappoptionCustom;
	}
	public List<DstappoptionCustom> getDstappoptionCustoms() {
		return dstappoptionCustoms;
	}
	public void setDstappoptionCustoms(List<DstappoptionCustom> dstappoptionCustoms) {
		this.dstappoptionCustoms = dstappoptionCustoms;
	}
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

}
