package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspXhxtpgInf;

public class HspXhxtpgInfCustom extends HspXhxtpgInf{
 
	public String xhxtFlg;

	public String getXhxtFlg() {
		return xhxtFlg;
	}

	public void setXhxtFlg(String xhxtFlg) {
		this.xhxtFlg = xhxtFlg;
	}

	@Override
	public String toString() {
		return (xhxtFlg != null ? "xhxtFlg=" + xhxtFlg + ", " : "")
				+ (getXtpgSeq() != null ? "getXtpgSeq()=" + getXtpgSeq() + ", "
						: "")
				+ (getEmgSeq() != null ? "getEmgSeq()=" + getEmgSeq() + ", "
						: "")
				+ (getXhxtpgYsCod() != null ? "getXhxtpgYsCod()="
						+ getXhxtpgYsCod() + ", " : "")
				+ (getXhxtpgSyCod() != null ? "getXhxtpgSyCod()="
						+ getXhxtpgSyCod() + ", " : "")
				+ (getXhxtpgExFlg() != null ? "getXhxtpgExFlg()="
						+ getXhxtpgExFlg() + ", " : "")
				+ (getXhxtpgOtFlg() != null ? "getXhxtpgOtFlg()="
						+ getXhxtpgOtFlg() + ", " : "")
				+ (getXhxtpgOtYs() != null ? "getXhxtpgOtYs()="
						+ getXhxtpgOtYs() + ", " : "")
				+ (getXhxtpgOtL() != null ? "getXhxtpgOtL()=" + getXhxtpgOtL()
						+ ", " : "")
				+ (getXhxtpgFbpz() != null ? "getXhxtpgFbpz()="
						+ getXhxtpgFbpz() + ", " : "")
				+ (getXhxtpgFbcg() != null ? "getXhxtpgFbcg()="
						+ getXhxtpgFbcg() + ", " : "")
				+ (getXhxtpgFzCod() != null ? "getXhxtpgFzCod()="
						+ getXhxtpgFzCod() + ", " : "")
				+ (getXhxtpgFbytCod() != null ? "getXhxtpgFbytCod()="
						+ getXhxtpgFbytCod() + ", " : "")
				+ (getXhxtpgFbfttFlg() != null ? "getXhxtpgFbfttFlg()="
						+ getXhxtpgFbfttFlg() + ", " : "")
				+ (getXhxtpgCmyCod() != null ? "getXhxtpgCmyCod()="
						+ getXhxtpgCmyCod() + ", " : "")
				+ (getXhxtpgPbCod() != null ? "getXhxtpgPbCod()="
						+ getXhxtpgPbCod() + ", " : "")
				+ (getXhxtpgFqcxFlg() != null ? "getXhxtpgFqcxFlg()="
						+ getXhxtpgFqcxFlg() + ", " : "")
				+ (getXhxtpgFw() != null ? "getXhxtpgFw()=" + getXhxtpgFw()
						+ ", " : "")
				+ (getXhxtpgTpnds() != null ? "getXhxtpgTpnds()="
						+ getXhxtpgTpnds() + ", " : "")
				+ (getXhxtpgPpnds() != null ? "getXhxtpgPpnds()="
						+ getXhxtpgPpnds() + ", " : "")
				+ (getXhxtpgMemo() != null ? "getXhxtpgMemo()="
						+ getXhxtpgMemo() + ", " : "");
	}
	
}
