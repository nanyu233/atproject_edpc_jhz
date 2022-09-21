package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspXlshpgInf;

public class HspXlshpgInfCustom extends HspXlshpgInf{

	public String xlshpgFlg;

	public String getXlshpgFlg() {
		return xlshpgFlg;
	}

	public void setXlshpgFlg(String xlshpgFlg) {
		this.xlshpgFlg = xlshpgFlg;
	}

	@Override
	public String toString() {
		return (xlshpgFlg != null ? "xlshpgFlg=" + xlshpgFlg + ", " : "")
				+ (getXtpgSeq() != null ? "getXtpgSeq()=" + getXtpgSeq() + ", "
						: "")
				+ (getEmgSeq() != null ? "getEmgSeq()=" + getEmgSeq() + ", "
						: "")
				+ (getXlshpgJsztCod() != null ? "getXlshpgJsztCod()="
						+ getXlshpgJsztCod() + ", " : "")
				+ (getXlshpgJsztQt() != null ? "getXlshpgJsztQt()="
						+ getXlshpgJsztQt() + ", " : "")
				+ (getXlshpgMemo() != null ? "getXlshpgMemo()="
						+ getXlshpgMemo() + ", " : "");
	}
	
	
}
