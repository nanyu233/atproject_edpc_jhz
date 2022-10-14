package activetech.edpc.pojo.dto;

public class QueryDto {
	//搜素患者姓名 模糊
	private String cstNam;
	//是否展示全部患者 false 一天 ，true | '' 全部
	private Boolean bhls;
    // 患者类型  1胸痛 2 卒中 3 创伤
	private String patTyp;

	public String getCstNam() {
		return cstNam;
	}

	public void setCstNam(String cstNam) {
		this.cstNam = cstNam;
	}

	public Boolean getBhls() {
		return bhls;
	}

	public void setBhls(Boolean bhls) {
		this.bhls = bhls;
	}

	public String getPatTyp() {
		return patTyp;
	}

	public void setPatTyp(String patTyp) {
		this.patTyp = patTyp;
	}
}
