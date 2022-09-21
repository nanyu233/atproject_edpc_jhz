package activetech.zyyhospital.pojo.dto;

import java.util.Date;

import activetech.base.pojo.dto.PageQuery;

public class HspHljldInfQueryDto {
	/**
	 * 病情护理记录单自定义实体类
	 */
	private HspHljldInfCustom hsphljldinfCustom;
	
	/**
	 * braden评分自定义实体类
	 */
	private HspBradenInfCustom hspBradenInfCustom;
	
	/**
	 * adl评分自定义实体类
	 */
	private HspAdlInfCustom hspAdlInfCustom;
	
	/**
	 * 转运风险评分自定义实体类
	 */
	private HspZyfxpfInfCustom hspZyfxpfInfCustom;
	
	/**
	 * gcs评分自定义实体类
	 */
	private HspGcsInfCustom hspGcsInfCustom;
	
	/**
	 * 疼痛评分自定义实体类
	 */
	private HspNrsInfCustom hspNrsInfCustom;
	
	/**
	 * 坠床跌倒自定义实体类
	 */
	private HspDdfxpgbInfCustom hspDdfxpgbInfCustom;
	
	/**
	 * 输血记录自定义实体类
	 */
	private PdatransfusionrecordCustom pdatransfusionrecordCustom;
	
	/**
	 * 排序字段
	 */
	private String sort;
	
	/**
	 * 排序类型
	 */
	private String order;
	
	/**
	 * 开始时间
	 */
	private Date startdate;
	
	/**
	 * 结束时间
	 */
    private Date enddate;
    
	/**
	 * 分页
	 */
	private PageQuery pageQuery;
	
	//图表查询方式
	private String interval;
	//查询来源0-生命体征，1-出入量
	private String enterSource;
	
	public String getInterval() {
		return interval;
	}
	public void setInterval(String interval) {
		this.interval = interval;
	}
	public String getEnterSource() {
		return enterSource;
	}
	public void setEnterSource(String enterSource) {
		this.enterSource = enterSource;
	}
	public PdatransfusionrecordCustom getPdatransfusionrecordCustom() {
		return pdatransfusionrecordCustom;
	}
	public void setPdatransfusionrecordCustom(PdatransfusionrecordCustom pdatransfusionrecordCustom) {
		this.pdatransfusionrecordCustom = pdatransfusionrecordCustom;
	}
	public HspBradenInfCustom getHspBradenInfCustom() {
		return hspBradenInfCustom;
	}
	public void setHspBradenInfCustom(HspBradenInfCustom hspBradenInfCustom) {
		this.hspBradenInfCustom = hspBradenInfCustom;
	}
	public HspAdlInfCustom getHspAdlInfCustom() {
		return hspAdlInfCustom;
	}
	public void setHspAdlInfCustom(HspAdlInfCustom hspAdlInfCustom) {
		this.hspAdlInfCustom = hspAdlInfCustom;
	}
	public HspZyfxpfInfCustom getHspZyfxpfInfCustom() {
		return hspZyfxpfInfCustom;
	}
	public void setHspZyfxpfInfCustom(HspZyfxpfInfCustom hspZyfxpfInfCustom) {
		this.hspZyfxpfInfCustom = hspZyfxpfInfCustom;
	}
	public HspGcsInfCustom getHspGcsInfCustom() {
		return hspGcsInfCustom;
	}
	public void setHspGcsInfCustom(HspGcsInfCustom hspGcsInfCustom) {
		this.hspGcsInfCustom = hspGcsInfCustom;
	}
	public HspNrsInfCustom getHspNrsInfCustom() {
		return hspNrsInfCustom;
	}
	public void setHspNrsInfCustom(HspNrsInfCustom hspNrsInfCustom) {
		this.hspNrsInfCustom = hspNrsInfCustom;
	}
	public HspDdfxpgbInfCustom getHspDdfxpgbInfCustom() {
		return hspDdfxpgbInfCustom;
	}
	public void setHspDdfxpgbInfCustom(HspDdfxpgbInfCustom hspDdfxpgbInfCustom) {
		this.hspDdfxpgbInfCustom = hspDdfxpgbInfCustom;
	}
	public HspHljldInfCustom getHsphljldinfCustom() {
		return hsphljldinfCustom;
	}
	public void setHsphljldinfCustom(HspHljldInfCustom hsphljldinfCustom) {
		this.hsphljldinfCustom = hsphljldinfCustom;
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
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
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
	
}
