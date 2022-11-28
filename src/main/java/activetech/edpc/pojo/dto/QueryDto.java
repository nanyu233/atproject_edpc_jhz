package activetech.edpc.pojo.dto;

import activetech.base.pojo.domain.PageCond;
import activetech.base.pojo.dto.PageQuery;

public class QueryDto  extends PageCond {
	//搜素患者姓名 模糊
	private String cstNam;
	//是否展示全部患者 false 一天 ，true | '' 全部
	private Boolean bhls;
    // 患者类型  1胸痛 2 卒中 3 创伤
	private String patTyp;
	//hspDbzlBas- 主键
	private String regSeq;

	//院区 1三墩 2灵隐

	private String hspAra;
	private PageQuery pageQuery;

	public String getHspAra() {
		return hspAra;
	}

	public void setHspAra(String hspAra) {
		this.hspAra = hspAra;
	}

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

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

	public String getRegSeq() {
		return regSeq;
	}

	public void setRegSeq(String regSeq) {
		this.regSeq = regSeq;
	}

	public QueryDto(String regSeq) {
		this.regSeq = regSeq;
	}

	public QueryDto() {
	}
}
