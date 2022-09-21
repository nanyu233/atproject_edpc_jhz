package activetech.edpc.pojo.dto;


import java.util.Date;

import activetech.base.pojo.domain.PageCond;
import activetech.base.pojo.dto.PageQuery;

public class HspPatInfQueryDto extends PageCond {
    private HspPatInfCustom hspPatInfCustom;
    private Date startDate;
    private Date endDate;

	public HspPatInfCustom getHspPatInfCustom() {
		return hspPatInfCustom;
	}
	public void setHspPatInfCustom(HspPatInfCustom hspPatInfCustom) {
		this.hspPatInfCustom = hspPatInfCustom;
	}
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