package activetech.base.pojo.dto;

import activetech.base.pojo.domain.HspCbyxgl;


public class HspCbyxglInfCustom extends HspCbyxgl {
	private String funcNam;
	private String brqxname;
	private String fzksname;
	private String yjdjname;
	
	
	public String getYjdjname() {
		return yjdjname;
	}

	public void setYjdjname(String yjdjname) {
		this.yjdjname = yjdjname;
	}

	public String getFzksname() {
		return fzksname;
	}

	public void setFzksname(String fzksname) {
		this.fzksname = fzksname;
	}

	public String getBrqxname() {
		return brqxname;
	}

	public void setBrqxname(String brqxname) {
		this.brqxname = brqxname;
	}

	public String getFuncNam() {
		return funcNam;
	}

	public void setFuncNam(String funcNam) {
		this.funcNam = funcNam;
	}
}
