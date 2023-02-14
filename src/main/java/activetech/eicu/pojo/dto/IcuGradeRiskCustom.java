package activetech.eicu.pojo.dto;

import activetech.eicu.pojo.domain.IcuGradeRisk;

import java.util.List;

public class IcuGradeRiskCustom extends IcuGradeRisk{
	/**
	 * 名称
	 */
	private String riskName;
	/**
	 * 颜色
	 */
	private String riskColor;

	private List<IcuGradeRiskCustom> riskDetail;

	public List<IcuGradeRiskCustom> getRiskDetail() {
		return riskDetail;
	}

	public void setRiskDetail(List<IcuGradeRiskCustom> riskDetail) {
		this.riskDetail = riskDetail;
	}

	public String getRiskName() {
		return riskName;
	}
	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}
	public String getRiskColor() {
		return riskColor;
	}
	public void setRiskColor(String riskColor) {
		this.riskColor = riskColor;
	}
}
