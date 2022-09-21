package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspFallriskInf;

public class HspFallriskInfCustom extends HspFallriskInf {
	private String fallRiskFlg;

	public String getFallRiskFlg() {
		return fallRiskFlg;
	}

	public void setFallRiskFlg(String fallRiskFlg) {
		this.fallRiskFlg = fallRiskFlg;
	}

	@Override
	public String toString() {
		return (fallRiskFlg != null ? "fallRiskFlg=" + fallRiskFlg + ", "
						: "")
				+ (getFallriskSeq() != null ? "getFallriskSeq()="
						+ getFallriskSeq() + ", " : "")
				+ (getEmgSeq() != null ? "getEmgSeq()=" + getEmgSeq() + ", "
						: "")
				+ (getRiskClassCod() != null ? "getRiskClassCod()="
						+ getRiskClassCod() + ", " : "")
				+ (getRiskAgeCod() != null ? "getRiskAgeCod()="
						+ getRiskAgeCod() + ", " : "")
				+ (getRiskSexCod() != null ? "getRiskSexCod()="
						+ getRiskSexCod() + ", " : "")
				+ (getRiskHisCod() != null ? "getRiskHisCod()="
						+ getRiskHisCod() + ", " : "")
				+ (getRiskExcreteCod() != null ? "getRiskExcreteCod()="
						+ getRiskExcreteCod() + ", " : "")
				+ (getRiskDrugCod() != null ? "getRiskDrugCod()="
						+ getRiskDrugCod() + ", " : "")
				+ (getRiskMacCod() != null ? "getRiskMacCod()="
						+ getRiskMacCod() + ", " : "")
				+ (getRiskActionCod() != null ? "getRiskActionCod()="
						+ getRiskActionCod() + ", " : "")
				+ (getRiskCognizeCod() != null ? "getRiskCognizeCod()="
						+ getRiskCognizeCod() + ", " : "")
				+ (getRiskDiagnoseCod() != null ? "getRiskDiagnoseCod()="
						+ getRiskDiagnoseCod() + ", " : "")
				+ (getRiskHjysCod() != null ? "getRiskHjysCod()="
						+ getRiskHjysCod() + ", " : "")
				+ (getRiskZjmzhCod() != null ? "getRiskZjmzhCod()="
						+ getRiskZjmzhCod() + ", " : "")
				+ (getRiskDruguseCod() != null ? "getRiskDruguseCod()="
						+ getRiskDruguseCod() + ", " : "")
				+ (getRiskOtherCod() != null ? "getRiskOtherCod()="
						+ getRiskOtherCod() + ", " : "")
				+ (getRiskSpare1() != null ? "getRiskSpare1()="
						+ getRiskSpare1() + ", " : "")
				+ (getRiskSpare2() != null ? "getRiskSpare2()="
						+ getRiskSpare2() + ", " : "")
				+ (getRiskSco() != null ? "getRiskSco()=" + getRiskSco() + ", "
						: "")
				+ (getCretDat() != null ? "getCretDat()=" + getCretDat() + ", "
						: "")
				+ (getDanxSco() != null ? "getDanxSco()=" + getDanxSco() + ", "
						: "")
				+ (getDuoxSco() != null ? "getDuoxSco()=" + getDuoxSco() + ", "
						: "")
				+ (getClass() != null ? "getClass()=" + getClass() + ", " : "");
	}

	
	
}
