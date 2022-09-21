package activetech.external.pojo.dto;

import java.util.Date;
import java.util.List;

import activetech.external.pojo.domain.HspJyjg;

public class HspJyjgCustom extends HspJyjg{
	private String emgSeq;		//预检号
	private String xtFlg;		//胸痛标志
	private String czFlg;		//卒中标志
	private String cspgFlg;		//创伤标志
	
	private String resultDateTimeStr;
	
	//查询条件
	private Date startdate;//查询开始时间
    private Date enddate;//结束时间
    
    //
    private String rownums;
    private List<HspJyjgCustom> vlist;
    private String sign;
    
	public String getResultDateTimeStr() {
		return resultDateTimeStr;
	}
	public void setResultDateTimeStr(String resultDateTimeStr) {
		this.resultDateTimeStr = resultDateTimeStr;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public String getRownums() {
		return rownums;
	}
	public void setRownums(String rownums) {
		this.rownums = rownums;
	}
	public List<HspJyjgCustom> getVlist() {
		return vlist;
	}
	public void setVlist(List<HspJyjgCustom> vlist) {
		this.vlist = vlist;
	}
	public String getEmgSeq() {
		return emgSeq;
	}
	public void setEmgSeq(String emgSeq) {
		this.emgSeq = emgSeq;
	}
	public String getXtFlg() {
		return xtFlg;
	}
	public void setXtFlg(String xtFlg) {
		this.xtFlg = xtFlg;
	}
	public String getCzFlg() {
		return czFlg;
	}
	public void setCzFlg(String czFlg) {
		this.czFlg = czFlg;
	}
	public String getCspgFlg() {
		return cspgFlg;
	}
	public void setCspgFlg(String cspgFlg) {
		this.cspgFlg = cspgFlg;
	}
	
}
