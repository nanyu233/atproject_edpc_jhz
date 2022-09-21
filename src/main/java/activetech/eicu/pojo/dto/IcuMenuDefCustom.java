package activetech.eicu.pojo.dto;

import activetech.eicu.pojo.domain.IcuMenuDef;

public class IcuMenuDefCustom extends IcuMenuDef{
	private String idRoot;
	private String nameRoot;
	private String sortRoot;
	
	public String getIdRoot() {
		return idRoot;
	}
	public void setIdRoot(String idRoot) {
		this.idRoot = idRoot;
	}
	public String getNameRoot() {
		return nameRoot;
	}
	public void setNameRoot(String nameRoot) {
		this.nameRoot = nameRoot;
	}
	public String getSortRoot() {
		return sortRoot;
	}
	public void setSortRoot(String sortRoot) {
		this.sortRoot = sortRoot;
	}
	
}