package activetech.edpc.pojo.domain;

public class HspFuvMedInf {
    private String fmiSeq;

    private String medNam;

    private String medSpe;

    private String medQty;

    private String medMtd;

    private String fuvSeq;

    public String getFmiSeq() {
        return fmiSeq;
    }

    public void setFmiSeq(String fmiSeq) {
        this.fmiSeq = fmiSeq == null ? null : fmiSeq.trim();
    }

    public String getMedNam() {
        return medNam;
    }

    public void setMedNam(String medNam) {
        this.medNam = medNam == null ? null : medNam.trim();
    }

    public String getMedSpe() {
        return medSpe;
    }

    public void setMedSpe(String medSpe) {
        this.medSpe = medSpe == null ? null : medSpe.trim();
    }

    public String getMedQty() {
        return medQty;
    }

    public void setMedQty(String medQty) {
        this.medQty = medQty == null ? null : medQty.trim();
    }

    public String getMedMtd() {
        return medMtd;
    }

    public void setMedMtd(String medMtd) {
        this.medMtd = medMtd == null ? null : medMtd.trim();
    }

    public String getFuvSeq() {
        return fuvSeq;
    }

    public void setFuvSeq(String fuvSeq) {
        this.fuvSeq = fuvSeq == null ? null : fuvSeq.trim();
    }
}