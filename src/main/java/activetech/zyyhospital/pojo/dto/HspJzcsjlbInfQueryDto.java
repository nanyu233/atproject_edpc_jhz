package activetech.zyyhospital.pojo.dto;

import java.util.List;

import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.zyyhospital.pojo.domain.HspJjchqkInf;
import activetech.zyyhospital.pojo.domain.HspJzpsInf;

public class HspJzcsjlbInfQueryDto {

	private HspJzcsjlbInfCustom hspJzcsjlbInfCustom;
	private HspemginfCustom hspemginfCustom;
	private List<HspJjchqkInf> hspJjchqkInfList;
	private List<HspJzpsInf> hspJzpsInfList;

	public List<HspJjchqkInf> getHspJjchqkInfList() {
		return hspJjchqkInfList;
	}

	public void setHspJjchqkInfList(List<HspJjchqkInf> hspJjchqkInfList) {
		this.hspJjchqkInfList = hspJjchqkInfList;
	}

	public List<HspJzpsInf> getHspJzpsInfList() {
		return hspJzpsInfList;
	}

	public void setHspJzpsInfList(List<HspJzpsInf> hspJzpsInfList) {
		this.hspJzpsInfList = hspJzpsInfList;
	}

	public HspemginfCustom getHspemginfCustom() {
		return hspemginfCustom;
	}

	public void setHspemginfCustom(HspemginfCustom hspemginfCustom) {
		this.hspemginfCustom = hspemginfCustom;
	}

	public HspJzcsjlbInfCustom getHspJzcsjlbInfCustom() {
		return hspJzcsjlbInfCustom;
	}

	public void setHspJzcsjlbInfCustom(HspJzcsjlbInfCustom hspJzcsjlbInfCustom) {
		this.hspJzcsjlbInfCustom = hspJzcsjlbInfCustom;
	}
	
}
