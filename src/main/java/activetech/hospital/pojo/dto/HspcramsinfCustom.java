package activetech.hospital.pojo.dto;

import activetech.hospital.pojo.domain.HspCramsInf;

/**
 * 
 * <p>Title:HspcramsinfCustom</p>
 * <p>Description:CRAMS创伤评分自定义类</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年2月20日 下午3:21:32
 *
 */
public class HspcramsinfCustom extends HspCramsInf {
  
	private String cirLvlCodStr; //循环级别
	private String breLvlCodStr; //呼吸级别
	private String bdyLvlCodStr; //胸腹级别
	private String sptLvlCodStr; //运动级别
	private String lanLvlCodStr; //语言级别
	public String getCirLvlCodStr() {
		return cirLvlCodStr;
	}
	public void setCirLvlCodStr(String cirLvlCodStr) {
		this.cirLvlCodStr = cirLvlCodStr;
	}
	public String getBreLvlCodStr() {
		return breLvlCodStr;
	}
	public void setBreLvlCodStr(String breLvlCodStr) {
		this.breLvlCodStr = breLvlCodStr;
	}
	public String getBdyLvlCodStr() {
		return bdyLvlCodStr;
	}
	public void setBdyLvlCodStr(String bdyLvlCodStr) {
		this.bdyLvlCodStr = bdyLvlCodStr;
	}
	public String getSptLvlCodStr() {
		return sptLvlCodStr;
	}
	public void setSptLvlCodStr(String sptLvlCodStr) {
		this.sptLvlCodStr = sptLvlCodStr;
	}
	public String getLanLvlCodStr() {
		return lanLvlCodStr;
	}
	public void setLanLvlCodStr(String lanLvlCodStr) {
		this.lanLvlCodStr = lanLvlCodStr;
	}
	
}
