package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspDgpgclrInf;

public class HspDgpgclrInfCustom extends HspDgpgclrInf{

	public String ylgDgmcNam;
	public String dgpgclrTcNam;

	public String getDgpgclrTcNam() {
		return dgpgclrTcNam;
	}

	public void setDgpgclrTcNam(String dgpgclrTcNam) {
		this.dgpgclrTcNam = dgpgclrTcNam;
	}

	public String getYlgDgmcNam() {
		return ylgDgmcNam;
	}

	public void setYlgDgmcNam(String ylgDgmcNam) {
		this.ylgDgmcNam = ylgDgmcNam;
	}
}
