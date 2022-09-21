package activetech.base.pojo.dto;

import java.util.List;

/**
 * 
 * <p>Title:DstdictinfoQueryDto</p>
 * <p>Description:数据字典包装类</p>
 * <p>activetech</p>
 * @author lpp
 * @date 2017-1-9 下午5:17:59
 *
 */
public class DstdictinfoQueryDto {
	private DstdictinfoCustom dstdictinfoCustom;
	private List<DstdictinfoCustom> dstdictinfoCustoms;
	//分页
	private PageQuery pageQuery;
	
	
	private String isenable;
	private String indexs;
	
	public DstdictinfoCustom getDstdictinfoCustom() {
		return dstdictinfoCustom;
	}
	public void setDstdictinfoCustom(DstdictinfoCustom dstdictinfoCustom) {
		this.dstdictinfoCustom = dstdictinfoCustom;
	}
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	public List<DstdictinfoCustom> getDstdictinfoCustoms() {
		return dstdictinfoCustoms;
	}
	public void setDstdictinfoCustoms(List<DstdictinfoCustom> dstdictinfoCustoms) {
		this.dstdictinfoCustoms = dstdictinfoCustoms;
	}
	public String getIsenable() {
		return isenable;
	}
	public void setIsenable(String isenable) {
		this.isenable = isenable;
	}
	public String getIndexs() {
		return indexs;
	}
	public void setIndexs(String indexs) {
		this.indexs = indexs;
	}
    
}
