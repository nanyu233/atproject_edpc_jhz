package activetech.zyyhospital.pojo.dto;

import java.util.Date;

import activetech.zyyhospital.pojo.domain.HspBedInf;

public class HspBedInfCustom extends HspBedInf {
	private String bedRemark;
	private String emgNam;//当前使用患者
	private String bedPlcNam;//位置名
	//部分病人信息
	private String emgDepCod;
	private String zgcount;
	private String cstNam;
	private String cstAge;
	private String cstSexCod;
	private String cstAgeCod;
	private Date emgDat; 	
	private String pheNbr;
	private String preDgnCod;
	private String emgFkCod;	
	private String preUsrNam;
	private String vstCad;
	private String observationCode;
	private String mewsTotSco;//MEWS评分
	private String nrsSco;//nrs评分
	private String gcsTotSco;//意识评分
	private String bedLgs;
	private String emgBed;
	private String glcs;
	private String cstDspCodNew;//转归去向代码
	private String rqDate;//入抢时间
	private String rgDate;//入观时间
	private String islgbed;//是否留观 0：否 1：是
	private String jbzdDes;//西医诊断
	private String jzxh;//就诊次数
	private String mpi;//平台mpi值,患者ID
	
	/**
	 * 绿色通道标识
	 */
	private String grnChl;
	
	/**
	 * 护士审核状态
	 */
	private String checkNurStatus;
	
	/**
	 * 标签打印状态
	 */
	private String labelPrintFlg;
	
	
	public String getJzxh() {
		return jzxh;
	}

	public void setJzxh(String jzxh) {
		this.jzxh = jzxh;
	}

	public String getLabelPrintFlg() {
		return labelPrintFlg;
	}

	public void setLabelPrintFlg(String labelPrintFlg) {
		this.labelPrintFlg = labelPrintFlg;
	}

	public String getMpi() {
		return mpi;
	}

	public void setMpi(String mpi) {
		this.mpi = mpi;
	}

	public String getJbzdDes() {
		return jbzdDes;
	}

	public void setJbzdDes(String jbzdDes) {
		this.jbzdDes = jbzdDes;
	}

	public String getIslgbed() {
		return islgbed;
	}

	public void setIslgbed(String islgbed) {
		this.islgbed = islgbed;
	}

	public String getRqDate() {
		return rqDate;
	}

	public void setRqDate(String rqDate) {
		this.rqDate = rqDate;
	}

	public String getRgDate() {
		return rgDate;
	}

	public void setRgDate(String rgDate) {
		this.rgDate = rgDate;
	}

	public String getCstDspCodNew() {
		return cstDspCodNew;
	}

	public void setCstDspCodNew(String cstDspCodNew) {
		this.cstDspCodNew = cstDspCodNew;
	}

	public String getGlcs() {
		return glcs;
	}

	public void setGlcs(String glcs) {
		this.glcs = glcs;
	}

	public String getBedLgs() {
		return bedLgs;
	}

	public void setBedLgs(String bedLgs) {
		this.bedLgs = bedLgs;
	}

	public String getEmgBed() {
		return emgBed;
	}

	public void setEmgBed(String emgBed) {
		this.emgBed = emgBed;
	}


	public String getMewsTotSco() {
		return mewsTotSco;
	}

	public void setMewsTotSco(String mewsTotSco) {
		this.mewsTotSco = mewsTotSco;
	}

	public String getNrsSco() {
		return nrsSco;
	}

	public void setNrsSco(String nrsSco) {
		this.nrsSco = nrsSco;
	}

	public String getGcsTotSco() {
		return gcsTotSco;
	}

	public void setGcsTotSco(String gcsTotSco) {
		this.gcsTotSco = gcsTotSco;
	}

	public String getObservationCode() {
		return observationCode;
	}

	public void setObservationCode(String observationCode) {
		this.observationCode = observationCode;
	}

	public String getVstCad() {
		return vstCad;
	}

	public void setVstCad(String vstCad) {
		this.vstCad = vstCad;
	}

	public String getPheNbr() {
		return pheNbr;
	}

	public void setPheNbr(String pheNbr) {
		this.pheNbr = pheNbr;
	}

	public String getPreDgnCod() {
		return preDgnCod;
	}

	public void setPreDgnCod(String preDgnCod) {
		this.preDgnCod = preDgnCod;
	}

	public String getEmgFkCod() {
		return emgFkCod;
	}

	public void setEmgFkCod(String emgFkCod) {
		this.emgFkCod = emgFkCod;
	}


	public String getPreUsrNam() {
		return preUsrNam;
	}

	public void setPreUsrNam(String preUsrNam) {
		this.preUsrNam = preUsrNam;
	}

	public String getCstAge() {
		return cstAge;
	}

	public void setCstAge(String cstAge) {
		this.cstAge = cstAge;
	}

	public String getCstSexCod() {
		return cstSexCod;
	}

	public void setCstSexCod(String cstSexCod) {
		this.cstSexCod = cstSexCod;
	}

	public String getCstAgeCod() {
		return cstAgeCod;
	}

	public void setCstAgeCod(String cstAgeCod) {
		this.cstAgeCod = cstAgeCod;
	}

	public Date getEmgDat() {
		return emgDat;
	}

	public void setEmgDat(Date emgDat) {
		this.emgDat = emgDat;
	}

	public String getCstNam() {
		return cstNam;
	}

	public void setCstNam(String cstNam) {
		this.cstNam = cstNam;
	}

	public String getZgcount() {
		return zgcount;
	}

	public void setZgcount(String zgcount) {
		this.zgcount = zgcount;
	}

	public String getEmgDepCod() {
		return emgDepCod;
	}

	public void setEmgDepCod(String emgDepCod) {
		this.emgDepCod = emgDepCod;
	}

	public String getBedPlcNam() {
		return bedPlcNam;
	}

	public void setBedPlcNam(String bedPlcNam) {
		this.bedPlcNam = bedPlcNam;
	}

	public String getEmgNam() {
		return emgNam;
	}

	public void setEmgNam(String emgNam) {
		this.emgNam = emgNam;
	}

	public String getBedRemark() {
		return bedRemark;
	}

	public void setBedRemark(String bedRemark) {
		this.bedRemark = bedRemark;
	}

	public String getGrnChl() {
		return grnChl;
	}

	public void setGrnChl(String grnChl) {
		this.grnChl = grnChl;
	}

	public String getCheckNurStatus() {
		return checkNurStatus;
	}

	public void setCheckNurStatus(String checkNurStatus) {
		this.checkNurStatus = checkNurStatus;
	}
	
}
