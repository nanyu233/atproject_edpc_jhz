package activetech.basehis.pojo.dto;

import java.util.Date;

import activetech.basehis.pojo.domain.VHemsSfxx;

public class VHemsSfxxCustom extends VHemsSfxx{
	private Date startDate;//查询开始时间
    private Date endDate;//结束时间
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
