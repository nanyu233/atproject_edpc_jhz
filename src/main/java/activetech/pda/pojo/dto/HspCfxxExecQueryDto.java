package activetech.pda.pojo.dto;


import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import activetech.base.pojo.dto.PageQuery;

/**
 * 处方信息执行单自定义QueryDto
 * @author machaofan
 *
 */
public class HspCfxxExecQueryDto{
	
	/**
	 * 分页
	 */
	private PageQuery pageQuery;

	/**
	 * 处方信息执行单自定义实体类
	 */
	private HspCfxxExecCustom hspCfxxExecCustom;
	
	/**
	 * 开始时间
	 */
	@JsonFormat(pattern = "yyyy/MM/dd HH:mm",timezone = "GMT+8")
	private Date startdate;
	
	/**
	 * 结束时间
	 */
	@JsonFormat(pattern = "yyyy/MM/dd HH:mm",timezone = "GMT+8")
	private Date enddate;
	
	/**
	 * 医嘱执行List
	 */
	private List<HspCfxxExecCustom> execList;
	
	/**
	 * 查询类型（end 查询已执行列表，并剔除当前，execRecord 查询已经执行过的输液单 ）
	 */
	private String type;
	
	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

	public HspCfxxExecCustom getHspCfxxExecCustom() {
		return hspCfxxExecCustom;
	}

	public void setHspCfxxExecCustom(HspCfxxExecCustom hspCfxxExecCustom) {
		this.hspCfxxExecCustom = hspCfxxExecCustom;
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

	public List<HspCfxxExecCustom> getExecList() {
		return execList;
	}

	public void setExecList(List<HspCfxxExecCustom> execList) {
		this.execList = execList;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}