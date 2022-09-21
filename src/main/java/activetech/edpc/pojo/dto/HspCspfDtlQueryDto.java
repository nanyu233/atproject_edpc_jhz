package activetech.edpc.pojo.dto;

import java.util.List;

import activetech.edpc.pojo.domain.HspCspfDtl;

public class HspCspfDtlQueryDto {
	
	private String emgSeq;
	
	private List<HspCspfDtl> list;

	public String getEmgSeq() {
		return emgSeq;
	}

	public void setEmgSeq(String emgSeq) {
		this.emgSeq = emgSeq;
	}

	public List<HspCspfDtl> getList() {
		return list;
	}

	public void setList(List<HspCspfDtl> list) {
		this.list = list;
	}
	
	
	

}
