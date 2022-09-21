package activetech.edpc.pojo.dto;

import java.util.Date;

import activetech.base.pojo.domain.PageCond;

public class HspFuvPatQueryDto extends PageCond{

    private Date startDate;
    private Date endDate;
    private HspFuvPatCustom hspFuvPatCustom;
    
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
	public HspFuvPatCustom getHspFuvPatCustom() {
		return hspFuvPatCustom;
	}
	public void setHspFuvPatCustom(HspFuvPatCustom hspFuvPatCustom) {
		this.hspFuvPatCustom = hspFuvPatCustom;
	}
}
