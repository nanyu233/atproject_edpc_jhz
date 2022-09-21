package activetech.aid.pojo.dto;

import java.util.Date;

import activetech.aid.pojo.domain.AidPatient;

public class AidPatientCustom extends AidPatient{
	
	private String crtuseridName;
	
	private String vstCad;
	
	private String emgSeq;
	
	private Date fbsj;
	
	private Date jssj;
	
	private String isHaveVoice;
	
	public String getIsHaveVoice() {
		return isHaveVoice;
	}

	public void setIsHaveVoice(String isHaveVoice) {
		this.isHaveVoice = isHaveVoice;
	}

	public Date getFbsj() {
		return fbsj;
	}

	public void setFbsj(Date fbsj) {
		this.fbsj = fbsj;
	}

	public Date getJssj() {
		return jssj;
	}

	public void setJssj(Date jssj) {
		this.jssj = jssj;
	}

	public String getEmgSeq() {
		return emgSeq;
	}

	public void setEmgSeq(String emgSeq) {
		this.emgSeq = emgSeq;
	}

	public String getCrtuseridName() {
		return crtuseridName;
	}

	public void setCrtuseridName(String crtuseridName) {
		this.crtuseridName = crtuseridName;
	}

	public String getVstCad() {
		return vstCad;
	}

	public void setVstCad(String vstCad) {
		this.vstCad = vstCad;
	}
	
	

}
