package activetech.zyyhospital.pojo.dto;

import java.util.Date;

import activetech.zyyhospital.pojo.domain.HspDocadviceInf;

public class HspDocadviceInfCustom extends HspDocadviceInf{

	private String docadviceDatString;
	private String docadviceDatisString;
	private String docadviceDatbeString;
	private String docadviceNuimdatString;
	private String docadviceDocstdatString;
	private String docadviceNustdatString;
	
	private Date startdate;//查询开始时间
    private Date enddate;//结束时间
    private String docadviceContents;
    private String shapeString;
    private String counts;
    private String datString;
    
    private String mark;
    private String flgsString;
    private String pl;
    private String emgSeq;
    private Date sqlDate;
    
	public Date getSqlDate() {
		return sqlDate;
	}

	public void setSqlDate(Date sqlDate) {
		this.sqlDate = sqlDate;
	}

	public String getEmgSeq() {
		return emgSeq;
	}

	public void setEmgSeq(String emgSeq) {
		this.emgSeq = emgSeq;
	}

	public String getPl() {
		return pl;
	}

	public void setPl(String pl) {
		this.pl = pl;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getFlgsString() {
		return flgsString;
	}

	public void setFlgsString(String flgsString) {
		this.flgsString = flgsString;
	}

	public String getDatString() {
		return datString;
	}

	public void setDatString(String datString) {
		this.datString = datString;
	}

	public String getCounts() {
		return counts;
	}

	public void setCounts(String counts) {
		this.counts = counts;
	}

	public String getShapeString() {
		return shapeString;
	}

	public void setShapeString(String shapeString) {
		this.shapeString = shapeString;
	}

	public String getDocadviceNuimdatString() {
		return docadviceNuimdatString;
	}

	public void setDocadviceNuimdatString(String docadviceNuimdatString) {
		this.docadviceNuimdatString = docadviceNuimdatString;
	}

	public String getDocadviceDocstdatString() {
		return docadviceDocstdatString;
	}

	public void setDocadviceDocstdatString(String docadviceDocstdatString) {
		this.docadviceDocstdatString = docadviceDocstdatString;
	}

	public String getDocadviceNustdatString() {
		return docadviceNustdatString;
	}

	public void setDocadviceNustdatString(String docadviceNustdatString) {
		this.docadviceNustdatString = docadviceNustdatString;
	}

	public String getDocadviceDatisString() {
		return docadviceDatisString;
	}

	public void setDocadviceDatisString(String docadviceDatisString) {
		this.docadviceDatisString = docadviceDatisString;
	}

	public String getDocadviceDatbeString() {
		return docadviceDatbeString;
	}

	public void setDocadviceDatbeString(String docadviceDatbeString) {
		this.docadviceDatbeString = docadviceDatbeString;
	}

	public String getDocadviceContents() {
		return docadviceContents;
	}

	public void setDocadviceContents(String docadviceContents) {
		this.docadviceContents = docadviceContents;
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

	public String getDocadviceDatString() {
		return docadviceDatString;
	}

	public void setDocadviceDatString(String docadviceDatString) {
		this.docadviceDatString = docadviceDatString;
	}
	
}
