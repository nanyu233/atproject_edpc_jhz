package activetech.zyyhospital.pojo.dto;

import java.util.Date;

import activetech.base.pojo.dto.PageQuery;
import activetech.hospital.pojo.dto.HspemginfCustom;

public class HspQtsjglQueryDto {
	private HspQtsjglCustom hspQtsjglCustom;
	private HspemginfCustom hspemginfCustom;
	//分页
	private PageQuery pageQuery;
	
	private Date startdate;
	private Date enddate;
	private String cstNam;
	private String qtsjFlg;
	/**
	 * 新增时判断请求来自哪一个页面
	 */
	private String pageName;
	
	public String getQtsjFlg() {
		return qtsjFlg;
	}
	public void setQtsjFlg(String qtsjFlg) {
		this.qtsjFlg = qtsjFlg;
	}
	public String getCstNam() {
		return cstNam;
	}
	public void setCstNam(String cstNam) {
		this.cstNam = cstNam;
	}
	public HspQtsjglCustom getHspQtsjglCustom() {
		return hspQtsjglCustom;
	}
	public void setHspQtsjglCustom(HspQtsjglCustom hspQtsjglCustom) {
		this.hspQtsjglCustom = hspQtsjglCustom;
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
	public HspemginfCustom getHspemginfCustom() {
		return hspemginfCustom;
	}
	public void setHspemginfCustom(HspemginfCustom hspemginfCustom) {
		this.hspemginfCustom = hspemginfCustom;
	}
	
	public String getPageName() {
		return pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
}
