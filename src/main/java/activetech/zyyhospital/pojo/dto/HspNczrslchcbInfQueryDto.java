package activetech.zyyhospital.pojo.dto;

import java.util.Date;

public class HspNczrslchcbInfQueryDto {

	private HspNczrslchcbInfCustom hspNczrslchcbInfCustom;	
	
	private Date startdate;
	private Date enddate;

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

	public HspNczrslchcbInfCustom getHspNczrslchcbInfCustom() {
		return hspNczrslchcbInfCustom;
	}

	public void setHspNczrslchcbInfCustom(HspNczrslchcbInfCustom hspNczrslchcbInfCustom) {
		this.hspNczrslchcbInfCustom = hspNczrslchcbInfCustom;
	}
	
}
