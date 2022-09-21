package activetech.edpc.pojo.dto;

import java.util.Date;

import activetech.edpc.pojo.domain.HspFuvPln;

/**
 * 
 * @author ROG
 *
 */
public class HspFuvPlnCustom extends HspFuvPln {
	private String plnStaStr;
	private String patNam;
	private Date fuvTim;
	private String fuvSeq;
		
	public String getFuvSeq() {
		return fuvSeq;
	}

	public void setFuvSeq(String fuvSeq) {
		this.fuvSeq = fuvSeq;
	}

	public Date getFuvTim() {
		return fuvTim;
	}

	public void setFuvTim(Date fuvTim) {
		this.fuvTim = fuvTim;
	}

	public String getPlnStaStr() {
		return plnStaStr;
	}

	public void setPlnStaStr(String plnStaStr) {
		this.plnStaStr = plnStaStr;
	}

	public String getPatNam() {
		return patNam;
	}

	public void setPatNam(String patNam) {
		this.patNam = patNam;
	}
	
}
