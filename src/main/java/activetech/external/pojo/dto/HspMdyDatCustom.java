package activetech.external.pojo.dto;

import java.math.BigDecimal;
import java.util.Date;

import activetech.external.pojo.domain.HspMdyDat;

public class HspMdyDatCustom extends HspMdyDat{

	private String datTimStr;
	private Date readtime;
	private String emgSeq;		// 预检号
//	private Short breNbr;		// 呼吸频率		|HSP_MEWS_INF.BRE_NBR
//	private Double tmpNbr;		// 体温			|HSP_MEWS_INF.TMP_NBR
	private String senRctCod;	// 清醒程度		|HSP_MEWS_INF.SEN_RCT_COD, 关联DSTDICTTYPE.TYPECODE = 'SEN_RCT'
	private String bedid;		// 床位id		|HSP_BED_INF.BEDID

	/*------------------------------------留抢大屏预检分级所需字段 -----------------------------------------*/
	// Fields from HSP_EMG_INF
	private String patientTyp;		// 患者类型
	private String cstAge;			// 年龄
	private String cstAgeCod;		// 年龄类型
	private String cspgFlg;			// 创伤标志
	private String hxknFlg;			// 呼吸困难标志
	private String hxknCod;
	private String xtFlg;			// 胸痛标志
	private String xtCod;
	private String xmFlg;			// 胸闷标志
	private String xfztFlg;			// 心肺骤停
	private String pregnantYdcxCod;	// 阴道出血
	private String pregnantGsplCod;	// 宫缩频率
	private Short oxyNbr;			// 血氧含量
	private String emgDepCod;		// 急诊分级
	// Fields from HSP_FAST_INF
	private String czFlag;			// 卒中标志
	// Fields from HSP_MEWS_INF
	private BigDecimal tmpNbr;		// 体温
	private Short breNbr;			// 呼吸
	private Long totSco;			// mews评分
	private Short hrtRte;			// 心跳频率
	private Short sbpupNbr;			// 血压上压
	private Short sbpdownNbr;		// 血压下压
	// Fields from HSP_NRS_INF
	private Long nrsSco;			// 疼痛评分
	// Fields from HSP_PEWSCK_INF
	private Short pewsSco;			// pews评分 
	// 心率
	private Short hrtRtePr;
	// 脉率
	private Short hrtRteHr;
	
	
	/*------------------------------------留抢大屏预检分级所需字段 -----------------------------------------*/
	
	
	public Short getHrtRtePr() {
		return hrtRtePr;
	}
	public void setHrtRtePr(Short hrtRtePr) {
		this.hrtRtePr = hrtRtePr;
	}
	public Short getHrtRteHr() {
		return hrtRteHr;
	}
	public void setHrtRteHr(Short hrtRteHr) {
		this.hrtRteHr = hrtRteHr;
	}
	
	public String getDatTimStr() {
		return datTimStr;
	}
	
	public void setDatTimStr(String datTimStr) {
		this.datTimStr = datTimStr;
	}

	public String getEmgSeq() {
		return emgSeq;
	}
	public void setEmgSeq(String emgSeq) {
		this.emgSeq = emgSeq;
	}
	public Short getBreNbr() {
		return breNbr;
	}
	public void setBreNbr(Short breNbr) {
		this.breNbr = breNbr;
	}
	public BigDecimal getTmpNbr() {
		return tmpNbr;
	}
	public void setTmpNbr(BigDecimal tmpNbr) {
		this.tmpNbr = tmpNbr;
	}
	public String getSenRctCod() {
		return senRctCod;
	}
	public void setSenRctCod(String senRctCod) {
		this.senRctCod = senRctCod;
	}
	public Date getReadtime() {
		return readtime;
	}
	public void setReadtime(Date readtime) {
		this.readtime = readtime;
	}
	public String getBedid() {
		return bedid;
	}
	public void setBedid(String bedid) {
		this.bedid = bedid;
	}
	public String getCstAge() {
		return cstAge;
	}
	public void setCstAge(String cstAge) {
		this.cstAge = cstAge;
	}
	public String getCstAgeCod() {
		return cstAgeCod;
	}
	public void setCstAgeCod(String cstAgeCod) {
		this.cstAgeCod = cstAgeCod;
	}
	public String getCspgFlg() {
		return cspgFlg;
	}
	public void setCspgFlg(String cspgFlg) {
		this.cspgFlg = cspgFlg;
	}
	public String getHxknFlg() {
		return hxknFlg;
	}
	public void setHxknFlg(String hxknFlg) {
		this.hxknFlg = hxknFlg;
	}
	public String getXtFlg() {
		return xtFlg;
	}
	public void setXtFlg(String xtFlg) {
		this.xtFlg = xtFlg;
	}
	public String getXmFlg() {
		return xmFlg;
	}
	public void setXmFlg(String xmFlg) {
		this.xmFlg = xmFlg;
	}
	public String getPregnantYdcxCod() {
		return pregnantYdcxCod;
	}
	public void setPregnantYdcxCod(String pregnantYdcxCod) {
		this.pregnantYdcxCod = pregnantYdcxCod;
	}
	public String getPregnantGsplCod() {
		return pregnantGsplCod;
	}
	public void setPregnantGsplCod(String pregnantGsplCod) {
		this.pregnantGsplCod = pregnantGsplCod;
	}
	public String getCzFlag() {
		return czFlag;
	}
	public void setCzFlag(String czFlag) {
		this.czFlag = czFlag;
	}
	public Long getTotSco() {
		return totSco;
	}
	public void setTotSco(Long totSco) {
		this.totSco = totSco;
	}
	public Long getNrsSco() {
		return nrsSco;
	}
	public void setNrsSco(Long nrsSco) {
		this.nrsSco = nrsSco;
	}
	public Short getPewsSco() {
		return pewsSco;
	}
	public void setPewsSco(Short pewsSco) {
		this.pewsSco = pewsSco;
	}
	public String getPatientTyp() {
		return patientTyp;
	}
	public void setPatientTyp(String patientTyp) {
		this.patientTyp = patientTyp;
	}
	public Short getOxyNbr() {
		return oxyNbr;
	}
	public void setOxyNbr(Short oxyNbr) {
		this.oxyNbr = oxyNbr;
	}
	public Short getHrtRte() {
		return hrtRte;
	}
	public void setHrtRte(Short hrtRte) {
		this.hrtRte = hrtRte;
	}
	public Short getSbpupNbr() {
		return sbpupNbr;
	}
	public void setSbpupNbr(Short sbpupNbr) {
		this.sbpupNbr = sbpupNbr;
	}
	public Short getSbpdownNbr() {
		return sbpdownNbr;
	}
	public void setSbpdownNbr(Short sbpdownNbr) {
		this.sbpdownNbr = sbpdownNbr;
	}
	public String getEmgDepCod() {
		return emgDepCod;
	}
	public void setEmgDepCod(String emgDepCod) {
		this.emgDepCod = emgDepCod;
	}
	public String getXfztFlg() {
		return xfztFlg;
	}
	public void setXfztFlg(String xfztFlg) {
		this.xfztFlg = xfztFlg;
	}
	public String getHxknCod() {
		return hxknCod;
	}
	public void setHxknCod(String hxknCod) {
		this.hxknCod = hxknCod;
	}
	public String getXtCod() {
		return xtCod;
	}
	public void setXtCod(String xtCod) {
		this.xtCod = xtCod;
	}
	
}
