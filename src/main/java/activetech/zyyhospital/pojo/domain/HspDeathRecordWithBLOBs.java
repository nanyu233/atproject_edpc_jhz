package activetech.zyyhospital.pojo.domain;

public class HspDeathRecordWithBLOBs extends HspDeathRecord {
    private String comeSituation;

    private String treatmentProcess;

    public String getComeSituation() {
        return comeSituation;
    }

    public void setComeSituation(String comeSituation) {
        this.comeSituation = comeSituation == null ? null : comeSituation.trim();
    }

    public String getTreatmentProcess() {
        return treatmentProcess;
    }

    public void setTreatmentProcess(String treatmentProcess) {
        this.treatmentProcess = treatmentProcess == null ? null : treatmentProcess.trim();
    }
}