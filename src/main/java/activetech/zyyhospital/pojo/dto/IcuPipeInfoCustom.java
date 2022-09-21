package activetech.zyyhospital.pojo.dto;


import java.util.Date;
import java.util.List;

import activetech.zyyhospital.pojo.domain.IcuPipeInfo;

public class IcuPipeInfoCustom extends IcuPipeInfo{
	private String inUserStr;
	private String inTimeStr;
	private String chgUserStr;
	private String chgTimeStr;
	private String outUserStr;
	private String outTimeStr;
	private String modTimeStr;
	private String pipeStatName;
	private String chkTimeStr;
	private Date chkTime;
	private String pipeFixe;
	private String pipeOpen;
	private String pipeFlag;
	private String pipeMemo;
	private String pipeDet;
	private String cuffPres;
	private String overDay;
	private String seqNo;
	private String vsDateStr;
	private Date vsDate;
	private String vsSeq;
	private String nursSeq;
	private String nursSign;
	private String nursNameImg;
	private String inPipeDays;		//置管天数
	private String chgPipeDays; 	//换管天数
	private String backPump;
	private String washInfo;
	/**
	 * 皮肤情况
	 */
	private String skinSitu;
	/**
	 * 操作人
	 */
	private String modUserStr;
	private String aeCount;
	
	public String getModUserStr() {
		return modUserStr;
	}
	public void setModUserStr(String modUserStr) {
		this.modUserStr = modUserStr;
	}
	public String getSkinSitu() {
		return skinSitu;
	}
	public void setSkinSitu(String skinSitu) {
		this.skinSitu = skinSitu;
	}
	public String getBackPump() {
		return backPump;
	}
	public void setBackPump(String backPump) {
		this.backPump = backPump;
	}
	public String getWashInfo() {
		return washInfo;
	}
	public void setWashInfo(String washInfo) {
		this.washInfo = washInfo;
	}
	public String getChgPipeDays() {
		return chgPipeDays;
	}
	public void setChgPipeDays(String chgPipeDays) {
		this.chgPipeDays = chgPipeDays;
	}
	public String getInPipeDays() {
		return inPipeDays;
	}
	public void setInPipeDays(String inPipeDays) {
		this.inPipeDays = inPipeDays;
	}
	public Date getVsDate() {
		return vsDate;
	}
	public void setVsDate(Date vsDate) {
		this.vsDate = vsDate;
	}
	public String getNursSign() {
		return nursSign;
	}
	public void setNursSign(String nursSign) {
		this.nursSign = nursSign;
	}
	public String getNursNameImg() {
		return nursNameImg;
	}
	public void setNursNameImg(String nursNameImg) {
		this.nursNameImg = nursNameImg;
	}
	public String getNursSeq() {
		return nursSeq;
	}
	public void setNursSeq(String nursSeq) {
		this.nursSeq = nursSeq;
	}
	public String getVsSeq() {
		return vsSeq;
	}
	public void setVsSeq(String vsSeq) {
		this.vsSeq = vsSeq;
	}
	public String getVsDateStr() {
		return vsDateStr;
	}
	public void setVsDateStr(String vsDateStr) {
		this.vsDateStr = vsDateStr;
	}
	public String getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}
	public String getOverDay() {
		return overDay;
	}
	public void setOverDay(String overDay) {
		this.overDay = overDay;
	}
	public String getInUserStr() {
		return inUserStr;
	}
	public void setInUserStr(String inUserStr) {
		this.inUserStr = inUserStr;
	}
	public String getInTimeStr() {
		return inTimeStr;
	}
	public void setInTimeStr(String inTimeStr) {
		this.inTimeStr = inTimeStr;
	}
	public String getChgUserStr() {
		return chgUserStr;
	}
	public void setChgUserStr(String chgUserStr) {
		this.chgUserStr = chgUserStr;
	}
	public String getChgTimeStr() {
		return chgTimeStr;
	}
	public void setChgTimeStr(String chgTimeStr) {
		this.chgTimeStr = chgTimeStr;
	}
	public String getOutUserStr() {
		return outUserStr;
	}
	public void setOutUserStr(String outUserStr) {
		this.outUserStr = outUserStr;
	}
	public String getOutTimeStr() {
		return outTimeStr;
	}
	public void setOutTimeStr(String outTimeStr) {
		this.outTimeStr = outTimeStr;
	}
	public String getModTimeStr() {
		return modTimeStr;
	}
	public void setModTimeStr(String modTimeStr) {
		this.modTimeStr = modTimeStr;
	}
	public String getPipeStatName() {
		return pipeStatName;
	}
	public void setPipeStatName(String pipeStatName) {
		this.pipeStatName = pipeStatName;
	}
	public String getChkTimeStr() {
		return chkTimeStr;
	}
	public void setChkTimeStr(String chkTimeStr) {
		this.chkTimeStr = chkTimeStr;
	}
	public Date getChkTime() {
		return chkTime;
	}
	public void setChkTime(Date chkTime) {
		this.chkTime = chkTime;
	}
	public String getPipeFixe() {
		return pipeFixe;
	}
	public void setPipeFixe(String pipeFixe) {
		this.pipeFixe = pipeFixe;
	}
	public String getPipeOpen() {
		return pipeOpen;
	}
	public void setPipeOpen(String pipeOpen) {
		this.pipeOpen = pipeOpen;
	}
	public String getPipeFlag() {
		return pipeFlag;
	}
	public void setPipeFlag(String pipeFlag) {
		this.pipeFlag = pipeFlag;
	}
	public String getPipeMemo() {
		return pipeMemo;
	}
	public void setPipeMemo(String pipeMemo) {
		this.pipeMemo = pipeMemo;
	}
	public String getPipeDet() {
		return pipeDet;
	}
	public void setPipeDet(String pipeDet) {
		this.pipeDet = pipeDet;
	}
	public String getCuffPres() {
		return cuffPres;
	}
	public void setCuffPres(String cuffPres) {
		this.cuffPres = cuffPres;
	}
	public String getAeCount() {
		return aeCount;
	}
	public void setAeCount(String aeCount) {
		this.aeCount = aeCount;
	}
}
