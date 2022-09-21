package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspXwhljldInf;

public class HspXwhljldInfCustom extends HspXwhljldInf{
	
	/*
	 * 血压拼接
	 */
	private String sbp;
	
	/*
	 * 症状体征拼接
	 */
	private String zztzDes;
	
	/*
	 * 洗胃液拼接
	 */
	private String xwyDes;
	
	/*
	 * 毒物拼接
	 */
	private String dwDes;

	public String getSbp() {
		return sbp;
	}

	public void setSbp(String sbp) {
		this.sbp = sbp;
	}

	public String getZztzDes() {
		return zztzDes;
	}

	public void setZztzDes(String zztzDes) {
		this.zztzDes = zztzDes;
	}

	public String getXwyDes() {
		return xwyDes;
	}

	public void setXwyDes(String xwyDes) {
		this.xwyDes = xwyDes;
	}

	public String getDwDes() {
		return dwDes;
	}

	public void setDwDes(String dwDes) {
		this.dwDes = dwDes;
	}

}
