package activetech.pda.pojo.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import activetech.base.pojo.dto.PageQuery;

/**
 * 处方信息自定义QueryDto
 * @author machaofan
 *
 */
public class HspCfxxInfoQueryDto{
	
	/**
	 * 分页
	 */
	private PageQuery pageQuery;

	/**
	 * 处方信息自定义实体类
	 */
	private HspCfxxInfoCustom hspCfxxInfoCustom;
	
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
	 * 医嘱核对、执行单生成List
	 */
	private List<HspCfxxInfoCustom> cfxxList;
	
	
	/**
	 * 患者唯一标识号，平台MPI值
	 */
	private String MPI;

	/**
	 * 就诊号
	 */
	private String vstCad;
	
	/**
	 * 医嘱查询类型（nursing：病情护理记录单，只查药疗，门诊病历治疗意见 inspection：检验检查数据，advice：医嘱数据）
	 */
	private String queryType;

	/**
	 * 院区标识
	 */
	private String hspLp;

	public String getHspLp() {
		return hspLp;
	}

	public void setHspLp(String hspLp) {
		this.hspLp = hspLp;
	}

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

	public HspCfxxInfoCustom getHspCfxxInfoCustom() {
		return hspCfxxInfoCustom;
	}

	public void setHspCfxxInfoCustom(HspCfxxInfoCustom hspCfxxInfoCustom) {
		this.hspCfxxInfoCustom = hspCfxxInfoCustom;
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

	public List<HspCfxxInfoCustom> getCfxxList() {
		return cfxxList;
	}

	public void setCfxxList(List<HspCfxxInfoCustom> cfxxList) {
		this.cfxxList = cfxxList;
	}

	public String getMPI() {
		return MPI;
	}

	public void setMPI(String mPI) {
		MPI = mPI;
	}

	public String getVstCad() {
		return vstCad;
	}

	public void setVstCad(String vstCad) {
		this.vstCad = vstCad;
	}

	public String getQueryType() {
		return queryType;
	}

	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}
	
}