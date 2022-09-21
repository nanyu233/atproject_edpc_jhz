package activetech.edpc.pojo.dto;

import java.util.List;

import activetech.edpc.pojo.domain.HspCsoaeInf;

public class HspCsoaeInfQueryDto {
	
	private String emgSeq;
	
	private List<HspCsoaeInf> list;

	public String getEmgSeq() {
		return emgSeq;
	}

	public void setEmgSeq(String emgSeq) {
		this.emgSeq = emgSeq;
	}

	public List<HspCsoaeInf> getList() {
		return list;
	}

	public void setList(List<HspCsoaeInf> list) {
		this.list = list;
	}


}
