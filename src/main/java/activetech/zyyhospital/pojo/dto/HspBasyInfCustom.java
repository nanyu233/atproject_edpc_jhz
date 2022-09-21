package activetech.zyyhospital.pojo.dto;


import activetech.zyyhospital.pojo.domain.HspBasyInf;

public class HspBasyInfCustom extends HspBasyInf {
	
	/**
	 * 病案首页操作技术字符串
	 */
	private String basyCzjsList;
	
	/**
	 * 到院方式
	 */
	private String arvCHlStr;
	
	/**
	 * 查询日期
	 */
	private String querydate;
	
	private String name;
	
	private int count;
	
	private String info;
	
	/**
	 * 最终转归护士COD
	 */
	private String finallyNur;
	
	/**
	 * 最后转归护士姓名
	 */
	private String finallyNam;
	
	/**
	 * 科室名称
	 */
	private String sqlDepName;
	
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getQuerydate() {
		return querydate;
	}

	public void setQuerydate(String querydate) {
		this.querydate = querydate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getArvCHlStr() {
		return arvCHlStr;
	}

	public void setArvCHlStr(String arvCHlStr) {
		this.arvCHlStr = arvCHlStr;
	}

	public String getFinallyNur() {
		return finallyNur;
	}

	public void setFinallyNur(String finallyNur) {
		this.finallyNur = finallyNur;
	}

	public String getFinallyNam() {
		return finallyNam;
	}

	public void setFinallyNam(String finallyNam) {
		this.finallyNam = finallyNam;
	}

	public String getSqlDepName() {
		return sqlDepName;
	}

	public void setSqlDepName(String sqlDepName) {
		this.sqlDepName = sqlDepName;
	}

	public String getBasyCzjsList() {
		return basyCzjsList;
	}

	public void setBasyCzjsList(String basyCzjsList) {
		this.basyCzjsList = basyCzjsList;
	}

}
