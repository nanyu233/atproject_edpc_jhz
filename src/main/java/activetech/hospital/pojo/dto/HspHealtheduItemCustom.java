package activetech.hospital.pojo.dto;

import activetech.hospital.pojo.domain.HspHealtheduItem;

public class HspHealtheduItemCustom extends HspHealtheduItem {
	private String parentname;//模块父类名称
	private String _parentId;
	public String get_parentId() {
		return _parentId;
	}

	public void set_parentId(String _parentId) {
		this._parentId = _parentId;
	}

	public String getParentname() {
		return parentname;
	}

	public void setParentname(String parentname) {
		this.parentname = parentname;
	}

}
