package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspBradenInf;

public class HspBradenInfCustom extends HspBradenInf{

	public String bradenFlg;
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

	public String getBradenFlg() {
		return bradenFlg;
	}

	public void setBradenFlg(String bradenFlg) {
		this.bradenFlg = bradenFlg;
	}

	@Override
	public String toString() {
		return  (bradenFlg != null ? "bradenFlg=" + bradenFlg + ", " : "")
				+ (getBradenFlg() != null ? "getBradenFlg()=" + getBradenFlg()
						+ ", " : "")
				+ (getXtpgSeq() != null ? "getXtpgSeq()=" + getXtpgSeq() + ", "
						: "")
				+ (getEmgSeq() != null ? "getEmgSeq()=" + getEmgSeq() + ", "
						: "")
				+ (getBradenGjCod() != null ? "getBradenGjCod()="
						+ getBradenGjCod() + ", " : "")
				+ (getBradenCsCod() != null ? "getBradenCsCod()="
						+ getBradenCsCod() + ", " : "")
				+ (getBradenHdnlCod() != null ? "getBradenHdnlCod()="
						+ getBradenHdnlCod() + ", " : "")
				+ (getBradenYdnlCod() != null ? "getBradenYdnlCod()="
						+ getBradenYdnlCod() + ", " : "")
				+ (getBradenYyCod() != null ? "getBradenYyCod()="
						+ getBradenYyCod() + ", " : "")
				+ (getBradenMchjqlCod() != null ? "getBradenMchjqlCod()="
						+ getBradenMchjqlCod() + ", " : "")
				+ (getBradenSco() != null ? "getBradenSco()=" + getBradenSco()
						+ ", " : "")
				+ (getMemo() != null ? "getMemo()=" + getMemo() : "") ;
	}

	
	
	
}
