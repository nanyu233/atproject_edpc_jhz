package activetech.edpc.pojo.dto;

import activetech.edpc.pojo.domain.HspCsabcInf;

public class HspCsabcInfCustom extends HspCsabcInf{
	
	private String fldTyp;
	private String gradeSco;

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
