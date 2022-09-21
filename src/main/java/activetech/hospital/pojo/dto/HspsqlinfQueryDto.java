package activetech.hospital.pojo.dto;

import java.util.Date;

import activetech.base.pojo.dto.PageQuery;

/**
 * 
 * <p>Title:HspsqlinfQueryDto</p>
 * <p>Description:转归功能分装类</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年2月17日 上午10:50:42
 *
 */
public class HspsqlinfQueryDto {
	private HspsqlinfCustom hspsqlinfCustom;
	private HspemginfCustom hspemginfCustom;
	//分页
	private PageQuery pageQuery;
	
	private Date startdate;
	private Date enddate;
	private String halfdate;
	private String querytype;
	private String sort;
    private String order;
    
    /**
     * 判断请求来自那一个页面
     */
    private String pageName;
    /**
     * 判断是否是绿色通道（住院科室收住人数患者明细）
     */
    private String grnChlFlag;
    /**
     * 判断是否是三无人员（住院科室收住人数患者明细）
     */
    private String swChlFlag;
    /**
     * 判断是住院或转院（住院科室收住人数患者明细）
     */
    private String cstDspFlag;
	/**
	 * 判断是留抢或非留抢（住院科室收住人数患者明细）
	 */
    private String lqflag;
    /**
     * 判断是否死亡（住院科室收住人数患者明细）
     */
    private String swFlg;
    
    
	public String getSwFlg() {
		return swFlg;
	}
	public void setSwFlg(String swFlg) {
		this.swFlg = swFlg;
	}
	public String getSwChlFlag() {
		return swChlFlag;
	}
	public void setSwChlFlag(String swChlFlag) {
		this.swChlFlag = swChlFlag;
	}
	public HspemginfCustom getHspemginfCustom() {
		return hspemginfCustom;
	}
	public void setHspemginfCustom(HspemginfCustom hspemginfCustom) {
		this.hspemginfCustom = hspemginfCustom;
	}
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
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public String getHalfdate() {
		return halfdate;
	}
	public void setHalfdate(String halfdate) {
		this.halfdate = halfdate;
	}
	public String getQuerytype() {
		return querytype;
	}
	public void setQuerytype(String querytype) {
		this.querytype = querytype;
	}
	public HspsqlinfCustom getHspsqlinfCustom() {
		return hspsqlinfCustom;
	}
	public void setHspsqlinfCustom(HspsqlinfCustom hspsqlinfCustom) {
		this.hspsqlinfCustom = hspsqlinfCustom;
	}
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	public String getPageName() {
		return pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	public String getGrnChlFlag() {
		return grnChlFlag;
	}
	public void setGrnChlFlag(String grnChlFlag) {
		this.grnChlFlag = grnChlFlag;
	}
	public String getCstDspFlag() {
		return cstDspFlag;
	}
	public void setCstDspFlag(String cstDspFlag) {
		this.cstDspFlag = cstDspFlag;
	}
	public String getLqflag() {
		return lqflag;
	}
	public void setLqflag(String lqflag) {
		this.lqflag = lqflag;
	}
	
}
