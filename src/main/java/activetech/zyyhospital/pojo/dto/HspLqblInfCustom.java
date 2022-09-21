package activetech.zyyhospital.pojo.dto;

import java.util.List;

import activetech.pda.pojo.dto.HspCfxxInfoCustom;
import activetech.zyyhospital.pojo.domain.HspLqblInf;

public class HspLqblInfCustom extends HspLqblInf {		
	private String oprtDatStr;
	private String mcyjDatStr;
	private String lqblDatStr;

	private String xyFlgStr;
	private String sbpVal;
	private String twFlgStr;
	private String hxFlgStr;
	private String nowHis;
	private String xtFlgStr;
	private String vstCad;
	
	private String tgjcMergeStr; //体格检查合并
	
	//20200318
	private String jbzdDes;//首次诊断
	private String zgysNam;//主管医师
	private String jgysNam;//经管医师
	private String zrhsNam;//责任护士
	private String lqscStr;//留观时长拼接
	private String lqzdStr;//离抢诊断拼接
	private String emgDatStr;//预检时间
	
	
	/**
	 * 检验检查数据
	 */
	private List<HspCfxxInfoCustom> jyJcList;
	
	/**
	 * 医嘱数据
	 */
	private List<HspCfxxInfoCustom> adviceList;
	
	private String mbFlgStr;
	private String pulseFlgStr;
	private String xtCodStr;
	
	
	public String getPulseFlgStr() {
		return pulseFlgStr;
	}

	public void setPulseFlgStr(String pulseFlgStr) {
		this.pulseFlgStr = pulseFlgStr;
	}

	public String getXtCodStr() {
		return xtCodStr;
	}

	public void setXtCodStr(String xtCodStr) {
		this.xtCodStr = xtCodStr;
	}

	public String getMbFlgStr() {
		return mbFlgStr;
	}

	public void setMbFlgStr(String mbFlgStr) {
		this.mbFlgStr = mbFlgStr;
	}
	
	public String getEmgDatStr() {
		return emgDatStr;
	}

	public void setEmgDatStr(String emgDatStr) {
		this.emgDatStr = emgDatStr;
	}

	public String getJbzdDes() {
		return jbzdDes;
	}

	public void setJbzdDes(String jbzdDes) {
		this.jbzdDes = jbzdDes;
	}

	public String getZgysNam() {
		return zgysNam;
	}

	public void setZgysNam(String zgysNam) {
		this.zgysNam = zgysNam;
	}

	public String getJgysNam() {
		return jgysNam;
	}

	public void setJgysNam(String jgysNam) {
		this.jgysNam = jgysNam;
	}

	public String getZrhsNam() {
		return zrhsNam;
	}

	public void setZrhsNam(String zrhsNam) {
		this.zrhsNam = zrhsNam;
	}

	public String getLqscStr() {
		return lqscStr;
	}

	public void setLqscStr(String lqscStr) {
		this.lqscStr = lqscStr;
	}

	public String getLqzdStr() {
		return lqzdStr;
	}

	public void setLqzdStr(String lqzdStr) {
		this.lqzdStr = lqzdStr;
	}

	public String getVstCad() {
		return vstCad;
	}

	public void setVstCad(String vstCad) {
		this.vstCad = vstCad;
	}

	public String getXtFlgStr() {
		return xtFlgStr;
	}

	public void setXtFlgStr(String xtFlgStr) {
		this.xtFlgStr = xtFlgStr;
	}

	public String getLqblDatStr() {
		return lqblDatStr;
	}

	public void setLqblDatStr(String lqblDatStr) {
		this.lqblDatStr = lqblDatStr;
	}

	public String getMcyjDatStr() {
		return mcyjDatStr;
	}

	public void setMcyjDatStr(String mcyjDatStr) {
		this.mcyjDatStr = mcyjDatStr;
	}

	public String getOprtDatStr() {
		return oprtDatStr;
	}

	public void setOprtDatStr(String oprtDatStr) {
		this.oprtDatStr = oprtDatStr;
	}

	public String getXyFlgStr() {
		return xyFlgStr;
	}

	public void setXyFlgStr(String xyFlgStr) {
		this.xyFlgStr = xyFlgStr;
	}

	public String getSbpVal() {
		return sbpVal;
	}

	public void setSbpVal(String sbpVal) {
		this.sbpVal = sbpVal;
	}

	public String getTwFlgStr() {
		return twFlgStr;
	}

	public void setTwFlgStr(String twFlgStr) {
		this.twFlgStr = twFlgStr;
	}

	public String getHxFlgStr() {
		return hxFlgStr;
	}

	public void setHxFlgStr(String hxFlgStr) {
		this.hxFlgStr = hxFlgStr;
	}

	public String getTgjcMergeStr() {
		return tgjcMergeStr;
	}

	public void setTgjcMergeStr(String tgjcMergeStr) {
		this.tgjcMergeStr = tgjcMergeStr;
	}

	public String getNowHis() {
		return nowHis;
	}

	public void setNowHis(String nowHis) {
		this.nowHis = nowHis;
	}

	public List<HspCfxxInfoCustom> getJyJcList() {
		return jyJcList;
	}

	public void setJyJcList(List<HspCfxxInfoCustom> jyJcList) {
		this.jyJcList = jyJcList;
	}

	public List<HspCfxxInfoCustom> getAdviceList() {
		return adviceList;
	}

	public void setAdviceList(List<HspCfxxInfoCustom> adviceList) {
		this.adviceList = adviceList;
	}
}
