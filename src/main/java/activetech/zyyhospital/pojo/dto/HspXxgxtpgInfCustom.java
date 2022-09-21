package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspXxgxtpgInf;

public class HspXxgxtpgInfCustom extends HspXxgxtpgInf{

	public String xxgxtFlg;

	public String getXxgxtFlg() {
		return xxgxtFlg;
	}

	public void setXxgxtFlg(String xxgxtFlg) {
		this.xxgxtFlg = xxgxtFlg;
	}

	@Override
	public String toString() {
		return  (getXtpgSeq() != null ? "getXtpgSeq()=" + getXtpgSeq() + ", "
						: "")
				+ (getEmgSeq() != null ? "getEmgSeq()=" + getEmgSeq() + ", "
						: "")
				+ (getXxgxtpgXdjhFlg() != null ? "getXxgxtpgXdjhFlg()="
						+ getXxgxtpgXdjhFlg() + ", " : "")
				+ (getXxgxtpgXlCs() != null ? "getXxgxtpgXlCs()="
						+ getXxgxtpgXlCs() + ", " : "")
				+ (getXxgxtpgXlZtCod() != null ? "getXxgxtpgXlZtCod()="
						+ getXxgxtpgXlZtCod() + ", " : "")
				+ (getXxgxtpgXmFlg() != null ? "getXxgxtpgXmFlg()="
						+ getXxgxtpgXmFlg() + ", " : "")
				+ (getXxgxtpgXtFlg() != null ? "getXxgxtpgXtFlg()="
						+ getXxgxtpgXtFlg() + ", " : "")
				+ (getXxgxtpgXjFlg() != null ? "getXxgxtpgXjFlg()="
						+ getXxgxtpgXjFlg() + ", " : "")
				+ (getZzXxgxtpgBdmbdCod() != null ? "getZzXxgxtpgBdmbdCod()="
						+ getZzXxgxtpgBdmbdCod() + ", " : "")
				+ (getYzXxgxtpgBdmbdCod() != null ? "getYzXxgxtpgBdmbdCod()="
						+ getYzXxgxtpgBdmbdCod() + ", " : "")
				+ (getXxgxtpgMxxgcy() != null ? "getXxgxtpgMxxgcy()="
						+ getXxgxtpgMxxgcy() + ", " : "")
				+ (getXxgxtpgMemo() != null ? "getXxgxtpgMemo()="
						+ getXxgxtpgMemo() + ", " : "")
				+ (getZrXxgxtpgBdmbdCod() != null ? "getZrXxgxtpgBdmbdCod()="
						+ getZrXxgxtpgBdmbdCod() + ", " : "")
				+ (getYrXxgxtpgBdmbdCod() != null ? "getYrXxgxtpgBdmbdCod()="
						+ getYrXxgxtpgBdmbdCod() : "") ;
	}

	
	
}
