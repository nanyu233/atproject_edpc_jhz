package activetech.aid.pojo.dto;

import activetech.aid.pojo.domain.AidQcnode;

public class AidQcnodeQueryDto {
	
	private AidQcnode aidQcnode;
	
    private String usrno;
	
	private String startDate;
	
	private String endDate;

	public AidQcnode getAidQcnode() {
		return aidQcnode;
	}

	public void setAidQcnode(AidQcnode aidQcnode) {
		this.aidQcnode = aidQcnode;
	}

	public String getUsrno() {
		return usrno;
	}

	public void setUsrno(String usrno) {
		this.usrno = usrno;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	} 
	
	

}
