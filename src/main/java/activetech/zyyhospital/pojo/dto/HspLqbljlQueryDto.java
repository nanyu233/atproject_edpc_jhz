package activetech.zyyhospital.pojo.dto;

import activetech.base.pojo.dto.PageQuery;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspsqlinfCustom;

public class HspLqbljlQueryDto {
	
	/**
	 * 分页
	 */
	private PageQuery pageQuery;
	
	/**
	 * 排序字段
	 */
	private String sort;
	
	/**
	 * 排序类型
	 */
	private String order;
	
	/**
	 * 查房记录
	 */
//	private HspCfjlInfCustom hspCfjlInfCustom;
	
	/**
	 * 留观首页
	 */
	private HspObsvtfstInfCustom hspObsvtfstInfCustom;
	
	/**
	 * 患者信息
	 */
	private HspemginfCustom hspemginfCustom;
	
	/**
	 * 交接班记录
	 */
//	private HspJjbjlInfCustom hspJjbjlInfCustom;
	
	/**
	 * 留抢病历
	 */
	private HspLqblInfCustom hspLqblInfCustom;
	
	/**
	 * 出观小结
	 */
	private HspCgxjInfCustom hspCgxjInfCustom;
	
	/**
	 * 抢救记录
	 */
//	private HspQjjlInfCustom hspQjjlInfCustom;
	
	/**
	 * 转归记录
	 */
	private HspsqlinfCustom hspsqlinfCustom;
	
	/**
	 * 知识库
	 */
	private HspFavoritesInfCustom hspFavoritesInfCustom;
	
	/**
	 * 手术操作记录自定义实体类
	 */
//	private HspOperateInfCustom hspOperateInfCustom;
	
	/**
	 * 疼痛评分
	 */
	private HspNrsInfCustom hspNrsInfCustom;
	
	/**
	 * 预检登记 跌倒评估
	 */
	private HspFallAssInfCustom hspFallAssInfCustom;
	
	/**
	 * 输血记录
	 */
//	private HspTransfusionInfCustom hspTransfusionInfCustom;
	
	/**
	 * 请求来源(HIS_NO_PATIENT:HIS请求病历且未查到患者数据)
	 */
	private String requestSource;
	
	public HspFavoritesInfCustom getHspFavoritesInfCustom() {
		return hspFavoritesInfCustom;
	}

	public void setHspFavoritesInfCustom(HspFavoritesInfCustom hspFavoritesInfCustom) {
		this.hspFavoritesInfCustom = hspFavoritesInfCustom;
	}

	public HspsqlinfCustom getHspsqlinfCustom() {
		return hspsqlinfCustom;
	}

	public void setHspsqlinfCustom(HspsqlinfCustom hspsqlinfCustom) {
		this.hspsqlinfCustom = hspsqlinfCustom;
	}

//	public HspQjjlInfCustom getHspQjjlInfCustom() {
//		return hspQjjlInfCustom;
//	}

//	public void setHspQjjlInfCustom(HspQjjlInfCustom hspQjjlInfCustom) {
//		this.hspQjjlInfCustom = hspQjjlInfCustom;
//	}

	public HspCgxjInfCustom getHspCgxjInfCustom() {
		return hspCgxjInfCustom;
	}

	public void setHspCgxjInfCustom(HspCgxjInfCustom hspCgxjInfCustom) {
		this.hspCgxjInfCustom = hspCgxjInfCustom;
	}

	public HspLqblInfCustom getHspLqblInfCustom() {
		return hspLqblInfCustom;
	}

	public void setHspLqblInfCustom(HspLqblInfCustom hspLqblInfCustom) {
		this.hspLqblInfCustom = hspLqblInfCustom;
	}

//	public HspJjbjlInfCustom getHspJjbjlInfCustom() {
//		return hspJjbjlInfCustom;
//	}

//	public void setHspJjbjlInfCustom(HspJjbjlInfCustom hspJjbjlInfCustom) {
//		this.hspJjbjlInfCustom = hspJjbjlInfCustom;
//	}

	public HspemginfCustom getHspemginfCustom() {
		return hspemginfCustom;
	}

	public void setHspemginfCustom(HspemginfCustom hspemginfCustom) {
		this.hspemginfCustom = hspemginfCustom;
	}

	public HspObsvtfstInfCustom getHspObsvtfstInfCustom() {
		return hspObsvtfstInfCustom;
	}

	public void setHspObsvtfstInfCustom(HspObsvtfstInfCustom hspObsvtfstInfCustom) {
		this.hspObsvtfstInfCustom = hspObsvtfstInfCustom;
	}
	
	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
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

//	public HspCfjlInfCustom getHspCfjlInfCustom() {
//		return hspCfjlInfCustom;
//	}

//	public void setHspCfjlInfCustom(HspCfjlInfCustom hspCfjlInfCustom) {
//		this.hspCfjlInfCustom = hspCfjlInfCustom;
//	}

//	public HspOperateInfCustom getHspOperateInfCustom() {
//		return hspOperateInfCustom;
//	}

//	public void setHspOperateInfCustom(HspOperateInfCustom hspOperateInfCustom) {
//		this.hspOperateInfCustom = hspOperateInfCustom;
//	}

	public HspNrsInfCustom getHspNrsInfCustom() {
		return hspNrsInfCustom;
	}

	public void setHspNrsInfCustom(HspNrsInfCustom hspNrsInfCustom) {
		this.hspNrsInfCustom = hspNrsInfCustom;
	}

	public HspFallAssInfCustom getHspFallAssInfCustom() {
		return hspFallAssInfCustom;
	}

	public void setHspFallAssInfCustom(HspFallAssInfCustom hspFallAssInfCustom) {
		this.hspFallAssInfCustom = hspFallAssInfCustom;
	}

//	public HspTransfusionInfCustom getHspTransfusionInfCustom() {
//		return hspTransfusionInfCustom;
//	}
//
//	public void setHspTransfusionInfCustom(HspTransfusionInfCustom hspTransfusionInfCustom) {
//		this.hspTransfusionInfCustom = hspTransfusionInfCustom;
//	}

	public String getRequestSource() {
		return requestSource;
	}

	public void setRequestSource(String requestSource) {
		this.requestSource = requestSource;
	}
	
}
