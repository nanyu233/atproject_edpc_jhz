package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspCgxjInf;

public class HspCgxjInfCustom extends HspCgxjInf {
	
	/**
	 * 住院科室
	 */
	private String sqlDepName;

	public String getSqlDepName() {
		return sqlDepName;
	}

	public void setSqlDepName(String sqlDepName) {
		this.sqlDepName = sqlDepName;
	}
	
}
