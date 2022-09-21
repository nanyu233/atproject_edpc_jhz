package activetech.edpc.pojo.dto;

import java.util.List;

import activetech.edpc.pojo.domain.HspCscpnInf;

public class HspCscpnInfQueryDto {
	
	private String emgSeq;
	
	private List<HspCscpnInf> list;

	public String getEmgSeq() {
		return emgSeq;
	}

	public void setEmgSeq(String emgSeq) {
		this.emgSeq = emgSeq;
	}

	public List<HspCscpnInf> getList() {
		return list;
	}

	public void setList(List<HspCscpnInf> list) {
		this.list = list;
	}

}
