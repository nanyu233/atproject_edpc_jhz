package activetech.eicu.pojo.dto;

import java.math.BigDecimal;

import activetech.eicu.pojo.domain.IcuVsInfo;

public class IcuVsInfoCustom extends IcuVsInfo{
	private String typeInfo;
	private String vsDateStr;
	private String crtTimeStr;
	private String modTimeStr;
	//vsRslt 翻译后的值
	private String vsRsltStr;
	
	//vs_def 定义 体征名称
	private String vsName;
	private String rsltMode;
	private String vsUnit;
	private String rsltCode;
	
	//VS属性 体温单查询中使用 
	private BigDecimal sbp;	//收缩压
	private BigDecimal dbp;	//舒张压
	
	/**
	 *  预警阀上限
	 */
	private BigDecimal uppLmt;
	/**
	 * 预警阀下限
	 */
	private BigDecimal lowLmt;
	/**
	 * 预警阀上限(默认值)
	 */
	private BigDecimal defUpp;
	/**
	 * 预警阀下限(默认值)
	 */
	private BigDecimal defLow;
	/**
	 * 上下限标识
	 */
	private String lmtFlag;
	/**
	 * 预警阈值区间
	 */
	private String threshold;
	/**
	 * 微泵设备医嘱关联键
	 */
	private String mpSeq;
	
	private String seqNo;
	private String nursSign;
	
	private String signimg; //签名图片
	private String vsOrder;	//体温单顺序
	private String pipeSeq;	//管路序号
	private String pipeType;//管路类型
	private String pipeName;//管路名称
	private String bodyPart;//管路身体部位
	private String pipeStat;//管路状态
	
	private String daInfo;	//出入量护理单用
	private String daWay;	//出入量护理单用
	private String daNo;	//出入量护理单用
	
	//ip_rate sp_rate 合并存放列
	private String flowRate;	
	
	/**
	 * SP IP 字典数据  
	 * 微泵信息中使用  
	 * 动态后可以删除
	 */
	private String spSize;
	private String kvoRate;
	private String remain;
	private String spTotal;
	private String spVtbi;
	private String brand;
	private String ipTotal;
	private String ipVtbi;
	private String occlLvl;
	private String ipRate;
	private String rateUnit;
	private String spRate;
	
	/**
	 * 整点数据
	 */
	private String numb00;
	private String numb01;
	private String numb02;
	private String numb03;
	private String numb04;
	private String numb05;
	private String numb06;
	private String numb07;
	private String numb08;
	private String numb09;
	private String numb10;
	private String numb11;
	private String numb12;
	private String numb13;
	private String numb14;
	private String numb15;
	private String numb16;
	private String numb17;
	private String numb18;
	private String numb19;
	private String numb20;
	private String numb21;
	private String numb22;
	private String numb23;
	
	public String getDaInfo() {
		return daInfo;
	}
	public void setDaInfo(String daInfo) {
		this.daInfo = daInfo;
	}
	public String getDaWay() {
		return daWay;
	}
	public void setDaWay(String daWay) {
		this.daWay = daWay;
	}
	public String getDaNo() {
		return daNo;
	}
	public void setDaNo(String daNo) {
		this.daNo = daNo;
	}
	public String getMpSeq() {
		return mpSeq;
	}
	public void setMpSeq(String mpSeq) {
		this.mpSeq = mpSeq;
	}
	public String getSpSize() {
		return spSize;
	}
	public void setSpSize(String spSize) {
		this.spSize = spSize;
	}
	public String getKvoRate() {
		return kvoRate;
	}
	public void setKvoRate(String kvoRate) {
		this.kvoRate = kvoRate;
	}
	public String getRemain() {
		return remain;
	}
	public void setRemain(String remain) {
		this.remain = remain;
	}
	public String getSpVtbi() {
		return spVtbi;
	}
	public void setSpVtbi(String spVtbi) {
		this.spVtbi = spVtbi;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getIpTotal() {
		return ipTotal;
	}
	public void setIpTotal(String ipTotal) {
		this.ipTotal = ipTotal;
	}
	public String getIpVtbi() {
		return ipVtbi;
	}
	public void setIpVtbi(String ipVtbi) {
		this.ipVtbi = ipVtbi;
	}
	public String getOcclLvl() {
		return occlLvl;
	}
	public void setOcclLvl(String occlLvl) {
		this.occlLvl = occlLvl;
	}
	public String getIpRate() {
		return ipRate;
	}
	public void setIpRate(String ipRate) {
		this.ipRate = ipRate;
	}
	public String getRateUnit() {
		return rateUnit;
	}
	public void setRateUnit(String rateUnit) {
		this.rateUnit = rateUnit;
	}
	public String getSpRate() {
		return spRate;
	}
	public void setSpRate(String spRate) {
		this.spRate = spRate;
	}
	public String getNursSign() {
		return nursSign;
	}
	public void setNursSign(String nursSign) {
		this.nursSign = nursSign;
	}
	public String getPipeSeq() {
		return pipeSeq;
	}
	public void setPipeSeq(String pipeSeq) {
		this.pipeSeq = pipeSeq;
	}
	public String getPipeType() {
		return pipeType;
	}
	public String getSpTotal() {
		return spTotal;
	}
	public void setSpTotal(String spTotal) {
		this.spTotal = spTotal;
	}
	public void setPipeType(String pipeType) {
		this.pipeType = pipeType;
	}
	public String getNumb00() {
		return numb00;
	}
	public void setNumb00(String numb00) {
		this.numb00 = numb00;
	}
	public String getNumb01() {
		return numb01;
	}
	public void setNumb01(String numb01) {
		this.numb01 = numb01;
	}
	public String getNumb02() {
		return numb02;
	}
	public void setNumb02(String numb02) {
		this.numb02 = numb02;
	}
	public String getNumb03() {
		return numb03;
	}
	public void setNumb03(String numb03) {
		this.numb03 = numb03;
	}
	public String getNumb04() {
		return numb04;
	}
	public void setNumb04(String numb04) {
		this.numb04 = numb04;
	}
	public String getNumb05() {
		return numb05;
	}
	public void setNumb05(String numb05) {
		this.numb05 = numb05;
	}
	public String getNumb06() {
		return numb06;
	}
	public void setNumb06(String numb06) {
		this.numb06 = numb06;
	}
	public String getNumb07() {
		return numb07;
	}
	public void setNumb07(String numb07) {
		this.numb07 = numb07;
	}
	public String getNumb08() {
		return numb08;
	}
	public void setNumb08(String numb08) {
		this.numb08 = numb08;
	}
	public String getNumb09() {
		return numb09;
	}
	public void setNumb09(String numb09) {
		this.numb09 = numb09;
	}
	public String getNumb10() {
		return numb10;
	}
	public void setNumb10(String numb10) {
		this.numb10 = numb10;
	}
	public String getNumb11() {
		return numb11;
	}
	public void setNumb11(String numb11) {
		this.numb11 = numb11;
	}
	public String getNumb12() {
		return numb12;
	}
	public void setNumb12(String numb12) {
		this.numb12 = numb12;
	}
	public String getNumb13() {
		return numb13;
	}
	public void setNumb13(String numb13) {
		this.numb13 = numb13;
	}
	public String getNumb14() {
		return numb14;
	}
	public void setNumb14(String numb14) {
		this.numb14 = numb14;
	}
	public String getNumb15() {
		return numb15;
	}
	public void setNumb15(String numb15) {
		this.numb15 = numb15;
	}
	public String getNumb16() {
		return numb16;
	}
	public void setNumb16(String numb16) {
		this.numb16 = numb16;
	}
	public String getNumb17() {
		return numb17;
	}
	public void setNumb17(String numb17) {
		this.numb17 = numb17;
	}
	public String getNumb18() {
		return numb18;
	}
	public void setNumb18(String numb18) {
		this.numb18 = numb18;
	}
	public String getNumb19() {
		return numb19;
	}
	public void setNumb19(String numb19) {
		this.numb19 = numb19;
	}
	public String getNumb20() {
		return numb20;
	}
	public void setNumb20(String numb20) {
		this.numb20 = numb20;
	}
	public String getNumb21() {
		return numb21;
	}
	public void setNumb21(String numb21) {
		this.numb21 = numb21;
	}
	public String getNumb22() {
		return numb22;
	}
	public void setNumb22(String numb22) {
		this.numb22 = numb22;
	}
	public String getNumb23() {
		return numb23;
	}
	public void setNumb23(String numb23) {
		this.numb23 = numb23;
	}
	public String getThreshold() {
		return threshold;
	}
	public void setThreshold(String threshold) {
		this.threshold = threshold;
	}
	public String getLmtFlag() {
		return lmtFlag;
	}
	public void setLmtFlag(String lmtFlag) {
		this.lmtFlag = lmtFlag;
	}
	public String getPipeStat() {
		return pipeStat;
	}
	public void setPipeStat(String pipeStat) {
		this.pipeStat = pipeStat;
	}
	public String getPipeName() {
		return pipeName;
	}
	public void setPipeName(String pipeName) {
		this.pipeName = pipeName;
	}
	public String getBodyPart() {
		return bodyPart;
	}
	public void setBodyPart(String bodyPart) {
		this.bodyPart = bodyPart;
	}
	public String getVsOrder() {
		return vsOrder;
	}
	public void setVsOrder(String vsOrder) {
		this.vsOrder = vsOrder;
	}
	public String getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(String seqNo) {
		this.seqNo = seqNo;
	}
	public String getSignimg() {
		return signimg;
	}
	public void setSignimg(String signimg) {
		this.signimg = signimg;
	}
	public String getTypeInfo() {
		return typeInfo;
	}
	public void setTypeInfo(String typeInfo) {
		this.typeInfo = typeInfo;
	}
	public String getVsDateStr() {
		return vsDateStr;
	}
	public void setVsDateStr(String vsDateStr) {
		this.vsDateStr = vsDateStr;
	}
	public String getVsName() {
		return vsName;
	}
	public void setVsName(String vsName) {
		this.vsName = vsName;
	}
	public BigDecimal getSbp() {
		return sbp;
	}
	public void setSbp(BigDecimal sbp) {
		this.sbp = sbp;
	}
	public BigDecimal getDbp() {
		return dbp;
	}
	public void setDbp(BigDecimal dbp) {
		this.dbp = dbp;
	}
	public String getCrtTimeStr() {
		return crtTimeStr;
	}
	public void setCrtTimeStr(String crtTimeStr) {
		this.crtTimeStr = crtTimeStr;
	}
	public String getModTimeStr() {
		return modTimeStr;
	}
	public void setModTimeStr(String modTimeStr) {
		this.modTimeStr = modTimeStr;
	}
	public String getRsltMode() {
		return rsltMode;
	}
	public void setRsltMode(String rsltMode) {
		this.rsltMode = rsltMode;
	}
	public String getRsltCode() {
		return rsltCode;
	}
	public void setRsltCode(String rsltCode) {
		this.rsltCode = rsltCode;
	}
	public String getVsRsltStr() {
		return vsRsltStr;
	}
	public void setVsRsltStr(String vsRsltStr) {
		this.vsRsltStr = vsRsltStr;
	}
	public String getVsUnit() {
		return vsUnit;
	}
	public void setVsUnit(String vsUnit) {
		this.vsUnit = vsUnit;
	}
	public String getFlowRate() {
		return flowRate;
	}
	public void setFlowRate(String flowRate) {
		this.flowRate = flowRate;
	}
	public BigDecimal getUppLmt() {
		return uppLmt;
	}
	public void setUppLmt(BigDecimal uppLmt) {
		this.uppLmt = uppLmt;
	}
	public BigDecimal getLowLmt() {
		return lowLmt;
	}
	public void setLowLmt(BigDecimal lowLmt) {
		this.lowLmt = lowLmt;
	}
	public BigDecimal getDefUpp() {
		return defUpp;
	}
	public void setDefUpp(BigDecimal defUpp) {
		this.defUpp = defUpp;
	}
	public BigDecimal getDefLow() {
		return defLow;
	}
	public void setDefLow(BigDecimal defLow) {
		this.defLow = defLow;
	}
	@Override
	public String toString() {
		return "IcuVsInfoCustom [typeInfo=" + typeInfo + ", vsDateStr=" + vsDateStr + ", crtTimeStr=" + crtTimeStr
				+ ", modTimeStr=" + modTimeStr + ", vsRsltStr=" + vsRsltStr + ", vsName=" + vsName + ", rsltMode="
				+ rsltMode + ", vsUnit=" + vsUnit + ", rsltCode=" + rsltCode + ", sbp=" + sbp + ", dbp=" + dbp
				+ ", lmtFlag=" + lmtFlag + ", threshold=" + threshold + ", seqNo=" + seqNo + ", nursSign=" + nursSign
				+ ", signimg=" + signimg + ", vsOrder=" + vsOrder + ", pipeSeq=" + pipeSeq + ", pipeType=" + pipeType
				+ ", pipeName=" + pipeName + ", bodyPart=" + bodyPart + ", pipeStat=" + pipeStat + ", spSize=" + spSize
				+ ", kvoRate=" + kvoRate + ", remain=" + remain + ", spTotal=" + spTotal + ", spVtbi=" + spVtbi
				+ ", brand=" + brand + ", ipTotal=" + ipTotal + ", ipVtbi=" + ipVtbi + ", occlLvl=" + occlLvl
				+ ", ipRate=" + ipRate + ", rateUnit=" + rateUnit + ", spRate=" + spRate + ", numb00=" + numb00
				+ ", numb01=" + numb01 + ", numb02=" + numb02 + ", numb03=" + numb03 + ", numb04=" + numb04
				+ ", numb05=" + numb05 + ", numb06=" + numb06 + ", numb07=" + numb07 + ", numb08=" + numb08
				+ ", numb09=" + numb09 + ", numb10=" + numb10 + ", numb11=" + numb11 + ", numb12=" + numb12
				+ ", numb13=" + numb13 + ", numb14=" + numb14 + ", numb15=" + numb15 + ", numb16=" + numb16
				+ ", numb17=" + numb17 + ", numb18=" + numb18 + ", numb19=" + numb19 + ", numb20=" + numb20
				+ ", numb21=" + numb21 + ", numb22=" + numb22 + ", numb23=" + numb23 + "]";
	}
	
}
