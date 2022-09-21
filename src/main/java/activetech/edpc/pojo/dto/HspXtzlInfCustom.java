package activetech.edpc.pojo.dto;

import java.util.List;

import activetech.base.pojo.domain.Dstdictinfo;
import activetech.edpc.pojo.domain.HspCrivelInf;
import activetech.edpc.pojo.domain.HspXtzlInf;

public class HspXtzlInfCustom extends HspXtzlInf{
	
	private String proType;
	
	private String proUnit;
	
	private String proName;
	
	private String proList;
	
	private String keyTime;
	
	private String busStep;
	
	private HspCrivelInf hspCrivelInf;
	
	
	public HspCrivelInf getHspCrivelInf() {
		return hspCrivelInf;
	}

	public void setHspCrivelInf(HspCrivelInf hspCrivelInf) {
		this.hspCrivelInf = hspCrivelInf;
	}

	private List<Dstdictinfo> proLists;
	
	
	public String getBusStep() {
		return busStep;
	}

	public void setBusStep(String busStep) {
		this.busStep = busStep;
	}

	public List<Dstdictinfo> getProLists() {
		return proLists;
	}

	public void setProLists(List<Dstdictinfo> proLists) {
		this.proLists = proLists;
	}

	public String getProList() {
		return proList;
	}

	public void setProList(String proList) {
		this.proList = proList;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProUnit() {
		return proUnit;
	}

	public void setProUnit(String proUnit) {
		this.proUnit = proUnit;
	}

	public String getProType() {
		return proType;
	}

	public void setProType(String proType) {
		this.proType = proType;
	}

	public String getKeyTime() {
		return keyTime;
	}

	public void setKeyTime(String keyTime) {
		this.keyTime = keyTime;
	}
	
	
	
}
