package activetech.zyyhospital.pojo.dto;

import java.util.Date;

import activetech.zyyhospital.pojo.domain.Pdatransfusionrecord;

public class PdatransfusionrecordCustom extends Pdatransfusionrecord{
	
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
	
	
}
