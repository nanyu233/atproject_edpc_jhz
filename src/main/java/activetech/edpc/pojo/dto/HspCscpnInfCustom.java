package activetech.edpc.pojo.dto;

import activetech.edpc.pojo.domain.HspCscpnInf;

public class HspCscpnInfCustom extends HspCscpnInf{
	
	private String fldTyp;
	
	private String gradeSco;
	
	private String fldNme;
	
	private String lstNme;

	public String getLstNme() {
		return lstNme;
	}

	public void setLstNme(String lstNme) {
		this.lstNme = lstNme;
	}

	public String getFldNme() {
		return fldNme;
	}

	public void setFldNme(String fldNme) {
		this.fldNme = fldNme;
	}

	public String getGradeSco() {
		return gradeSco;
	}

	public void setGradeSco(String gradeSco) {
		this.gradeSco = gradeSco;
	}

	public String getFldTyp() {
		return fldTyp;
	}

	public void setFldTyp(String fldTyp) {
		this.fldTyp = fldTyp;
	}

}
