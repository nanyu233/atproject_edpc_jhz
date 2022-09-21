package activetech.zyyhospital.pojo.dto;

import java.util.Date;

import activetech.base.pojo.dto.PageQuery;
/**
 * 心肺复苏DTO
 * @author machaofan
 *
 */
public class HspHeartRecordQueryDto {
	
	/**
	 * 分页
	 */
	private PageQuery pageQuery;
	
	/**
	 * 开始时间
	 */
	private Date startdate;
	
	/**
	 * 结束时间
	 */
	private Date enddate;
	
	/**
	 * 心肺复苏自定义实体类
	 */
	private HspHeartRecordCustom hspHeartRecordCustom;
	
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

	public HspHeartRecordCustom getHspHeartRecordCustom() {
		return hspHeartRecordCustom;
	}

	public void setHspHeartRecordCustom(HspHeartRecordCustom hspHeartRecordCustom) {
		this.hspHeartRecordCustom = hspHeartRecordCustom;
	}
	
}
