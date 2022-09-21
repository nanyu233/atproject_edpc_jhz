package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspZcddexpfInf;

public class HspZcddexpfInfCustom extends HspZcddexpfInf{

	public String zcddFlg;

	public String getZcddFlg() {
		return zcddFlg;
	}

	public void setZcddFlg(String zcddFlg) {
		this.zcddFlg = zcddFlg;
	}

	@Override
	public String toString() {
		return (zcddFlg != null ? "zcddFlg=" + zcddFlg + ", " : "")
				+ (getXtpgSeq() != null ? "getXtpgSeq()=" + getXtpgSeq() + ", "
						: "")
				+ (getEmgSeq() != null ? "getEmgSeq()=" + getEmgSeq() + ", "
						: "")
				+ (getZcddexpfYnbmdd() != null ? "getZcddexpfYnbmdd()="
						+ getZcddexpfYnbmdd() + ", " : "")
				+ (getZcddexpfYsza() != null ? "getZcddexpfYsza()="
						+ getZcddexpfYsza() + ", " : "")
				+ (getZcddexpfSlza() != null ? "getZcddexpfSlza()="
						+ getZcddexpfSlza() + ", " : "")
				+ (getZcddexpfHdza() != null ? "getZcddexpfHdza()="
						+ getZcddexpfHdza() + ", " : "")
				+ (getZcddexpfNl() != null ? "getZcddexpfNl()="
						+ getZcddexpfNl() + ", " : "")
				+ (getZcddexpfTnxr() != null ? "getZcddexpfTnxr()="
						+ getZcddexpfTnxr() + ", " : "")
				+ (getZcddexpfTyxy() != null ? "getZcddexpfTyxy()="
						+ getZcddexpfTyxy() + ", " : "")
				+ (getZcddexpfZyywjr() != null ? "getZcddexpfZyywjr()="
						+ getZcddexpfZyywjr() + ", " : "")
				+ (getZcddexpfJrpb() != null ? "getZcddexpfJrpb()="
						+ getZcddexpfJrpb() + ", " : "")
				+ (getZcddexpfMy() != null ? "getZcddexpfMy()="
						+ getZcddexpfMy() + ", " : "")
				+ (getZcddexpfSco() != null ? "getZcddexpfSco()="
						+ getZcddexpfSco() + ", " : "")
				+ (getZcddexpfMemo() != null ? "getZcddexpfMemo()="
						+ getZcddexpfMemo() + ", " : "");
	}
	
}
