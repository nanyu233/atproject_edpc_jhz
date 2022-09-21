package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspMnszxtpgInf;

public class HspMnszxtpgInfCustom extends HspMnszxtpgInf{

	public String  mnszxtFlg;

	public String getMnszxtFlg() {
		return mnszxtFlg;
	}

	public void setMnszxtFlg(String mnszxtFlg) {
		this.mnszxtFlg = mnszxtFlg;
	}

	@Override
	public String toString() {
		return (mnszxtFlg != null ? "mnszxtFlg=" + mnszxtFlg + ", " : "")
				+ (getXtpgSeq() != null ? "getXtpgSeq()=" + getXtpgSeq() + ", "
						: "")
				+ (getEmgSeq() != null ? "getEmgSeq()=" + getEmgSeq() + ", "
						: "")
				+ (getMnszxtpgPnCod() != null ? "getMnszxtpgPnCod()="
						+ getMnszxtpgPnCod() + ", " : "")
				+ (getMnszxtpgNyxzCod() != null ? "getMnszxtpgNyxzCod()="
						+ getMnszxtpgNyxzCod() + ", " : "")
				+ (getMnszxtpgPgcxFlg() != null ? "getMnszxtpgPgcxFlg()="
						+ getMnszxtpgPgcxFlg() + ", " : "")
				+ (getMnszxtpgTxCod() != null ? "getMnszxtpgTxCod()="
						+ getMnszxtpgTxCod() + ", " : "")
				+ (getMnszxtpgDjmwCod() != null ? "getMnszxtpgDjmwCod()="
						+ getMnszxtpgDjmwCod() + ", " : "")
				+ (getMnszxtpgRsztCod() != null ? "getMnszxtpgRsztCod()="
						+ getMnszxtpgRsztCod() + ", " : "")
				+ (getMnszxtpgYjCod() != null ? "getMnszxtpgYjCod()="
						+ getMnszxtpgYjCod() + ", " : "")
				+ (getMnszxtpgBdCod() != null ? "getMnszxtpgBdCod()="
						+ getMnszxtpgBdCod() + ", " : "")
				+ (getMnszxtpgBdQt() != null ? "getMnszxtpgBdQt()="
						+ getMnszxtpgBdQt() + ", " : "")
				+ (getMnszxtpgMeno() != null ? "getMnszxtpgMeno()="
						+ getMnszxtpgMeno() + ", " : "");
	}
	
}
