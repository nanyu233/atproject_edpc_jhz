package activetech.aid.pojo.dto;

import activetech.aid.pojo.domain.AidFlowstep;

public class AidFlowstepCustom extends  AidFlowstep {
	
	private String crtUserName;
	
	private String stepname;
	
	public String getStepname() {
		return stepname;
	}

	public void setStepname(String stepname) {
		this.stepname = stepname;
	}

	public String getCrtUserName() {
		return crtUserName;
	}

	public void setCrtUserName(String crtUserName) {
		this.crtUserName = crtUserName;
	}
	
	
	
}
