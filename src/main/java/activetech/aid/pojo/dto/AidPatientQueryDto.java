package activetech.aid.pojo.dto;

import activetech.aid.pojo.domain.AidPatient;
import activetech.aid.pojo.domain.AidPatientXt;
import activetech.hospital.pojo.domain.HspEmgInf;

public class AidPatientQueryDto {
	
	private HspEmgInf hspEmgInf;
	
	private AidPatient aidPatient;
	
	private AidPatientXt aidPatientXt;
	
	private String kxxbyw;	// 抗血小板药物下拉列表value

	public AidPatient getAidPatient() {
		return aidPatient;
	}

	
	public HspEmgInf getHspEmgInf() {
		return hspEmgInf;
	}


	public void setHspEmgInf(HspEmgInf hspEmgInf) {
		this.hspEmgInf = hspEmgInf;
	}


	public void setAidPatient(AidPatient aidPatient) {
		this.aidPatient = aidPatient;
	}

	public AidPatientXt getAidPatientXt() {
		return aidPatientXt;
	}

	public void setAidPatientXt(AidPatientXt aidPatientXt) {
		this.aidPatientXt = aidPatientXt;
	}

	public String getKxxbyw() {
		return kxxbyw;
	}

	public void setKxxbyw(String kxxbyw) {
		this.kxxbyw = kxxbyw;
	}
	
}
