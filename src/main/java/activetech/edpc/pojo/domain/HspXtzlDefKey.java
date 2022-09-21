package activetech.edpc.pojo.domain;

public class HspXtzlDefKey {
    private String busStep;

    private String proCode;

    public String getBusStep() {
        return busStep;
    }

    public void setBusStep(String busStep) {
        this.busStep = busStep == null ? null : busStep.trim();
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode == null ? null : proCode.trim();
    }
}