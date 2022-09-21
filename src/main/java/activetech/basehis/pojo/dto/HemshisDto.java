package activetech.basehis.pojo.dto;

import java.util.Date;
import java.util.List;

import activetech.base.pojo.dto.PageQuery;
import activetech.hospital.pojo.dto.HspemginfCustom;

public class HemshisDto {

	HspemginfCustom hspemginfCustom;
	List<HspemginfCustom> hspemginfCustomList;
	
	private Date startdate;
	private Date enddate;
	//分页
	private PageQuery pageQuery;
	String queryFlag;
	String updateNur;
	String updateName;
	private String brxm;
	public String getUpdateNur() {
		return updateNur;
	}

	public void setUpdateNur(String updateNur) {
		this.updateNur = updateNur;
	}

	public String getUpdateName() {
		return updateName;
	}

	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}

	public HspemginfCustom getHspemginfCustom() {
		return hspemginfCustom;
	}

	public void setHspemginfCustom(HspemginfCustom hspemginfCustom) {
		this.hspemginfCustom = hspemginfCustom;
	}

	public List<HspemginfCustom> getHspemginfCustomList() {
		return hspemginfCustomList;
	}

	public void setHspemginfCustomList(List<HspemginfCustom> hspemginfCustomList) {
		this.hspemginfCustomList = hspemginfCustomList;
	}

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

	public String getQueryFlag() {
		return queryFlag;
	}

	public void setQueryFlag(String queryFlag) {
		this.queryFlag = queryFlag;
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

	public String getBrxm() {
		return brxm;
	}

	public void setBrxm(String brxm) {
		this.brxm = brxm;
	}
	
}