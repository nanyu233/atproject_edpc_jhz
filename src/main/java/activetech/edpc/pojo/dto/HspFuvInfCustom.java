package activetech.edpc.pojo.dto;

import java.util.List;

import activetech.edpc.pojo.domain.HspFuvInf;
import activetech.edpc.pojo.domain.HspFuvMedInf;
import activetech.edpc.pojo.domain.HspPatInf;

public class HspFuvInfCustom extends HspFuvInf {
	private String patNam;
	private String fuvGrpNam;
	private String docNam;
	private String plnSta;
	private String plnFuvTyp;
	private String nxtFuvDocNme;
	private List<HspFuvMedInf> hspFuvMedInfList;	
	
	public String getPlnFuvTyp() {
		return plnFuvTyp;
	}

	public void setPlnFuvTyp(String plnFuvTyp) {
		this.plnFuvTyp = plnFuvTyp;
	}

	public String getNxtFuvDocNme() {
		return nxtFuvDocNme;
	}

	public void setNxtFuvDocNme(String nxtFuvDocNme) {
		this.nxtFuvDocNme = nxtFuvDocNme;
	}

	public String getPlnSta() {
		return plnSta;
	}

	public void setPlnSta(String plnSta) {
		this.plnSta = plnSta;
	}

	public String getFuvGrpNam() {
		return fuvGrpNam;
	}

	public void setFuvGrpNam(String fuvGrpNam) {
		this.fuvGrpNam = fuvGrpNam;
	}

	public String getDocNam() {
		return docNam;
	}

	public void setDocNam(String docNam) {
		this.docNam = docNam;
	}

	public String getPatNam() {
		return patNam;
	}

	public void setPatNam(String patNam) {
		this.patNam = patNam;
	}

	public List<HspFuvMedInf> getHspFuvMedInfList() {
		return hspFuvMedInfList;
	}

	public void setHspFuvMedInfList(List<HspFuvMedInf> hspFuvMedInfList) {
		this.hspFuvMedInfList = hspFuvMedInfList;
	}
	
}
