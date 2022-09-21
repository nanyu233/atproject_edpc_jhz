package activetech.base.pojo.dto;

import java.util.Date;

import activetech.base.pojo.domain.Dstksjh;

public class DstKsjhCustom extends Dstksjh {
	private Date startdate;//查询开始时间
	private Date enddate;//查询结束时间
	private String lendDatStr;
	private String oprtDatStr;
	private String oprtUsrNam;
	public String getOprtUsrNam() {
		return oprtUsrNam;
	}
	public void setOprtUsrNam(String oprtUsrNam) {
		this.oprtUsrNam = oprtUsrNam;
	}
	public String getLendDatStr() {
		return lendDatStr;
	}
	public void setLendDatStr(String lendDatStr) {
		this.lendDatStr = lendDatStr;
	}
	public String getOprtDatStr() {
		return oprtDatStr;
	}
	public void setOprtDatStr(String oprtDatStr) {
		this.oprtDatStr = oprtDatStr;
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
	

}
