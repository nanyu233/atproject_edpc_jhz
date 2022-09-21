package activetech.hospital.pojo.dto;

import activetech.hospital.pojo.domain.HspSqlInf;

/**
 * 
 * <p>Title:HspsqlinfCustom</p>
 * <p>Description:转归自定义类</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年2月17日 上午10:52:42
 *
 */
public class HspsqlinfCustom extends HspSqlInf {

	private String cstNam;
	private String SqlDepName;
	private String sqlStaStr;
	private String comno;
	private String comcname;
	private String queryDate;
	private int counts;
	private int zycounts;//住院人数
	private int wzcounts;//危重病人人数
	private int zhuanycounts;//转院人数
	
	private String stanbr; //转归类型
	private String bedNam;//床位名字
	
	private String firstSqlSeq;//转归表第一条数据（首次预检录入）
	
	public String getFirstSqlSeq() {
		return firstSqlSeq;
	}

	public void setFirstSqlSeq(String firstSqlSeq) {
		this.firstSqlSeq = firstSqlSeq;
	}

	public String getBedNam() {
		return bedNam;
	}

	public void setBedNam(String bedNam) {
		this.bedNam = bedNam;
	}

	public int getZhuanycounts() {
		return zhuanycounts;
	}

	public void setZhuanycounts(int zhuanycounts) {
		this.zhuanycounts = zhuanycounts;
	}

	public int getZycounts() {
		return zycounts;
	}

	public void setZycounts(int zycounts) {
		this.zycounts = zycounts;
	}

	public int getWzcounts() {
		return wzcounts;
	}

	public void setWzcounts(int wzcounts) {
		this.wzcounts = wzcounts;
	}

	public String getQueryDate() {
		return queryDate;
	}

	public void setQueryDate(String queryDate) {
		this.queryDate = queryDate;
	}

	public int getCounts() {
		return counts;
	}

	public void setCounts(int counts) {
		this.counts = counts;
	}

	public String getComno() {
		return comno;
	}

	public void setComno(String comno) {
		this.comno = comno;
	}

	public String getComcname() {
		return comcname;
	}

	public void setComcname(String comcname) {
		this.comcname = comcname;
	}

	public String getCstNam() {
		return cstNam;
	}

	public void setCstNam(String cstNam) {
		this.cstNam = cstNam;
	}

	public String getSqlDepName() {
		return SqlDepName;
	}

	public void setSqlDepName(String sqlDepName) {
		SqlDepName = sqlDepName;
	}

	public String getStanbr() {
		return stanbr;
	}

	public void setStanbr(String stanbr) {
		this.stanbr = stanbr;
	}

	public String getSqlStaStr() {
		return sqlStaStr;
	}

	public void setSqlStaStr(String sqlStaStr) {
		this.sqlStaStr = sqlStaStr;
	}

	public HspsqlinfCustom() {
		super();
	}
	
}
