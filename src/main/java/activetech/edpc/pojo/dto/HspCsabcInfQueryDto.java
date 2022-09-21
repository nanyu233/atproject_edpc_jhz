package activetech.edpc.pojo.dto;

import java.util.List;

import activetech.edpc.pojo.domain.HspCsabcInf;

public class HspCsabcInfQueryDto {
	
	private String abcSeq;
	
	private String emgSeq;
	
	private List<HspCsabcInf> list;

	public String getAbcSeq() {
		return abcSeq;
	}

	public void setAbcSeq(String abcSeq) {
		this.abcSeq = abcSeq;
	}

	public String getEmgSeq() {
		return emgSeq;
	}

	public void setEmgSeq(String emgSeq) {
		this.emgSeq = emgSeq;
	}

	public List<HspCsabcInf> getList() {
		return list;
	}

	public void setList(List<HspCsabcInf> list) {
		this.list = list;
	}
	
	

}
