package activetech.eicu.pojo.domain;

public class IcuGradeRisk extends IcuGradeRiskKey {
    private Long lowValue;

    private Long uppValue;

    private String riskDesc;

    public Long getLowValue() {
        return lowValue;
    }

    public void setLowValue(Long lowValue) {
        this.lowValue = lowValue;
    }

    public Long getUppValue() {
        return uppValue;
    }

    public void setUppValue(Long uppValue) {
        this.uppValue = uppValue;
    }

    public String getRiskDesc() {
        return riskDesc;
    }

    public void setRiskDesc(String riskDesc) {
        this.riskDesc = riskDesc == null ? null : riskDesc.trim();
    }
}