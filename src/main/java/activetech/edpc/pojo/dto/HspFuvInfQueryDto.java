package activetech.edpc.pojo.dto;


import java.util.Date;

import activetech.base.pojo.domain.PageCond;
import activetech.base.pojo.dto.PageQuery;

/**
 *
 * @author ROG
 * @date 2021/1/25 10:33
 */
public class HspFuvInfQueryDto extends PageCond {
	
	private HspFuvInfCustom hspFuvInfCustom;
    private Date startDate;
    private Date endDate;
    	
	public HspFuvInfCustom getHspFuvInfCustom() {
		return hspFuvInfCustom;
	}
	public void setHspFuvInfCustom(HspFuvInfCustom hspFuvInfCustom) {
		this.hspFuvInfCustom = hspFuvInfCustom;
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
