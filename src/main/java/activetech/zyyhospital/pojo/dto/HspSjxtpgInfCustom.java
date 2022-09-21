package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspSjxtpgInf;

public class HspSjxtpgInfCustom extends HspSjxtpgInf{

	public String sjxtFlg;

	public String getSjxtFlg() {
		return sjxtFlg;
	}

	public void setSjxtFlg(String sjxtFlg) {
		this.sjxtFlg = sjxtFlg;
	}

	@Override
	public String toString() {
		return  (getXtpgSeq() != null ? "getXtpgSeq()=" + getXtpgSeq() + ", "
						: "")
				+ (getEmgSeq() != null ? "getEmgSeq()=" + getEmgSeq() + ", "
						: "")
				+ (getSjxtpgYsCod() != null ? "getSjxtpgYsCod()="
						+ getSjxtpgYsCod() + ", " : "")
				+ (getSjxtpgYssubCod() != null ? "getSjxtpgYssubCod()="
						+ getSjxtpgYssubCod() + ", " : "")
				+ (getSjxtpgYyCod() != null ? "getSjxtpgYyCod()="
						+ getSjxtpgYyCod() + ", " : "")
				+ (getTkLefttkZj() != null ? "getTkLefttkZj()="
						+ getTkLefttkZj() + ", " : "")
				+ (getTkLefttkZtCod() != null ? "getTkLefttkZtCod()="
						+ getTkLefttkZtCod() + ", " : "")
				+ (getLeftTbDgfy() != null ? "getLeftTbDgfy()="
						+ getLeftTbDgfy() + ", " : "")
				+ (getTkRighttkZj() != null ? "getTkRighttkZj()="
						+ getTkRighttkZj() + ", " : "")
				+ (getTkRighttkZtCod() != null ? "getTkRighttkZtCod()="
						+ getTkRighttkZtCod() + ", " : "")
				+ (getRightTbDgfy() != null ? "getRightTbDgfy()="
						+ getRightTbDgfy() + ", " : "")
				+ (getLeftsJzSzCod() != null ? "getLeftsJzSzCod()="
						+ getLeftsJzSzCod() + ", " : "")
				+ (getRightsJzSzCod() != null ? "getRightsJzSzCod()="
						+ getRightsJzSzCod() + ", " : "")
				+ (getLeftxJzSzCod() != null ? "getLeftxJzSzCod()="
						+ getLeftxJzSzCod() + ", " : "")
				+ (getRightxJzSzCod() != null ? "getRightxJzSzCod()="
						+ getRightxJzSzCod() + ", " : "")
				+ (getLeftsSjJzl() != null ? "getLeftsSjJzl()="
						+ getLeftsSjJzl() + ", " : "")
				+ (getRightsSjJzl() != null ? "getRightsSjJzl()="
						+ getRightsSjJzl() + ", " : "")
				+ (getLeftxSjJzl() != null ? "getLeftxSjJzl()="
						+ getLeftxSjJzl() + ", " : "")
				+ (getRightxSjJzl() != null ? "getRightxSjJzl()="
						+ getRightxSjJzl() + ", " : "")
				+ (getSjxtpgMemo() != null ? "getSjxtpgMemo()="
						+ getSjxtpgMemo() + ", " : "")
				+ (getSjxtpgYssubCodb() != null ? "getSjxtpgYssubCodb()="
						+ getSjxtpgYssubCodb() : "") ;
	}

	
	
	
}
