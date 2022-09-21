package activetech.base.pojo.dto;

import java.util.List;

import activetech.base.pojo.domain.Dstuser;

/**
 * 
 * <p>Title:DstuserQueryDto</p>
 * <p>Description:用户包装类</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年1月9日 上午11:24:49
 *
 */
public class DstuserQueryDto {
	private DstuserCustom dstuserCustom;
	private DstuserroleCustom dstuserroleCustom;
	private DstroleCustom dstroleCustom;
	private List<Dstuser> dstuserCustoms;
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
	public DstroleCustom getDstroleCustom() {
		return dstroleCustom;
	}
	public void setDstroleCustom(DstroleCustom dstroleCustom) {
		this.dstroleCustom = dstroleCustom;
	}
	public DstuserroleCustom getDstuserroleCustom() {
		return dstuserroleCustom;
	}
	public void setDstuserroleCustom(DstuserroleCustom dstuserroleCustom) {
		this.dstuserroleCustom = dstuserroleCustom;
	}
	public DstuserCustom getDstuserCustom() {
		return dstuserCustom;
	}
	public void setDstuserCustom(DstuserCustom dstuserCustom) {
		this.dstuserCustom = dstuserCustom;
	}
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	public List<Dstuser> getDstuserCustoms() {
		return dstuserCustoms;
	}
	public void setDstuserCustoms(List<Dstuser> dstuserCustoms) {
		this.dstuserCustoms = dstuserCustoms;
	}
	
}
