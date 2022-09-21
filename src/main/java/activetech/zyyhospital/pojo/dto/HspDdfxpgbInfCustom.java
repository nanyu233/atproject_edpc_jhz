package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspDdfxpgbInf;

public class HspDdfxpgbInfCustom extends HspDdfxpgbInf{
	private String morseFlg;
	/**
	 * 病情护理记录单Id
	 */
	public String bqhiSeq;
	
	
	public String getBqhiSeq() {
		return bqhiSeq;
	}

	public void setBqhiSeq(String bqhiSeq) {
		this.bqhiSeq = bqhiSeq;
	}
	public String getMorseFlg() {
		return morseFlg;
	}

	public void setMorseFlg(String morseFlg) {
		this.morseFlg = morseFlg;
	}

	@Override
	public String toString() {
		return (getDdfxpgbSeq() != null ? "getDdfxpgbSeq()=" + getDdfxpgbSeq() + ", " : "")
				+ (getEmgSeq() != null ? "getEmgSeq()=" + getEmgSeq() + ", " : "")
				+ (getJsgyywddCod() != null ? "getJsgyywddCod()=" + getJsgyywddCod() + ", " : "")
				+ (getDyygjbpdCod() != null ? "getDyygjbpdCod()=" + getDyygjbpdCod() + ", " : "")
				+ (getXzfzCod() != null ? "getXzfzCod()=" + getXzfzCod() + ", " : "")
				+ (getJmzlsyddgfxyCod() != null ? "getJmzlsyddgfxyCod()=" + getJmzlsyddgfxyCod() + ", " : "")
				+ (getBtCod() != null ? "getBtCod()=" + getBtCod() + ", " : "")
				+ (getRznlCod() != null ? "getRznlCod()=" + getRznlCod() + ", " : "")
				+ (getMemo() != null ? "getMemo()=" + getMemo() + ", " : "")
				+ (getZf() != null ? "getZf()=" + getZf() + ", " : "")
				+ (getCretDat() != null ? "getCretDat()=" + getCretDat() + ", " : "")
				+ (getCrtUsrNo() != null ? "getCrtUsrNo()=" + getCrtUsrNo() + ", " : "")
				+ (getCrtUsrNme() != null ? "getCrtUsrNme()=" + getCrtUsrNme() + ", " : "")
				+ (getUpdUsrNo() != null ? "getUpdUsrNo()=" + getUpdUsrNo() + ", " : "")
				+ (getUpdUsrNme() != null ? "getUpdUsrNme()=" + getUpdUsrNme() + ", " : "")
				+ (getUpdTime() != null ? "getUpdTime()=" + getUpdTime() + ", " : "")
				+ (getHlcsCod() != null ? "getHlcsCod()=" + getHlcsCod() : "");
	}
}
