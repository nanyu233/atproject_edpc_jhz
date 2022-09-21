package activetech.hospital.pojo.dto;

import java.util.Date;

import activetech.base.pojo.dto.PageQuery;
import activetech.hospital.pojo.domain.HspMewsInf;
/**
 * 
 * <p>Title:HspmewsinfCustom</p>
 * <p>Description:MEWS评分表自定义类</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年2月20日 下午3:17:30
 *
 */
public class HspmewsinfCustom extends HspMewsInf{

	private String senRctCodStr; //清醒程度

	/* 急诊科患者生命体征完成情况统计报表所用字段 */
	private String infocode;	// 编码
	private String info;		// 名称
	private Integer total;		// 总人数
	private Integer finished;	// 已完成人数
	private Integer unfinished;	// 未完成人数
	private String ksfz;	    // 快速分诊
	//分页
	private PageQuery pageQuery;
	private String emgFkCod;
	private String emgFkName;
	
	private String seriesId;	// highcahrts图表series的id字段
	private Date startdate;//查询开始时间
    private Date enddate;//结束时间
    private HspemginfCustom hspemginfCustom;
	
	
	public String getEmgFkCod() {
		return emgFkCod;
	}

	public void setEmgFkCod(String emgFkCod) {
		this.emgFkCod = emgFkCod;
	}

	public String getEmgFkName() {
		return emgFkName;
	}

	public void setEmgFkName(String emgFkName) {
		this.emgFkName = emgFkName;
	}

	public HspemginfCustom getHspemginfCustom() {
		return hspemginfCustom;
	}

	public void setHspemginfCustom(HspemginfCustom hspemginfCustom) {
		this.hspemginfCustom = hspemginfCustom;
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

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

	public String getKsfz() {
		return ksfz;
	}

	public void setKsfz(String ksfz) {
		this.ksfz = ksfz;
	}

	public void setInfocode(String infocode) {
		this.infocode = infocode;
	}
	
	public String getInfocode() {
		return infocode;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getFinished() {
		return finished;
	}

	public void setFinished(Integer finished) {
		this.finished = finished;
	}

	public Integer getUnfinished() {
		return unfinished;
	}

	public void setUnfinished(Integer unfinished) {
		this.unfinished = unfinished;
	}

	public String getSeriesId() {
		return seriesId;
	}

	public void setSeriesId(String seriesId) {
		this.seriesId = seriesId;
	}

	public String getSenRctCodStr() {
		return senRctCodStr;
	}

	public void setSenRctCodStr(String senRctCodStr) {
		this.senRctCodStr = senRctCodStr;
	}
	
}
