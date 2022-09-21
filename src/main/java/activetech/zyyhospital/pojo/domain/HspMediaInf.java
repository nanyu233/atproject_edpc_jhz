package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class HspMediaInf {
    private String medSeq;

    private String emgSeq;

    private String medClass;

    private String medName;

    private String medFile;

    private String medExtend;

    private String medType;

    private Date medDate;

    private Long medSize;

    private byte[] medData;

    public String getMedSeq() {
        return medSeq;
    }

    public void setMedSeq(String medSeq) {
        this.medSeq = medSeq == null ? null : medSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getMedClass() {
        return medClass;
    }

    public void setMedClass(String medClass) {
        this.medClass = medClass == null ? null : medClass.trim();
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName == null ? null : medName.trim();
    }

    public String getMedFile() {
        return medFile;
    }

    public void setMedFile(String medFile) {
        this.medFile = medFile == null ? null : medFile.trim();
    }

    public String getMedExtend() {
        return medExtend;
    }

    public void setMedExtend(String medExtend) {
        this.medExtend = medExtend == null ? null : medExtend.trim();
    }

    public String getMedType() {
        return medType;
    }

    public void setMedType(String medType) {
        this.medType = medType == null ? null : medType.trim();
    }

    public Date getMedDate() {
        return medDate;
    }

    public void setMedDate(Date medDate) {
        this.medDate = medDate;
    }

    public Long getMedSize() {
        return medSize;
    }

    public void setMedSize(Long medSize) {
        this.medSize = medSize;
    }

    public byte[] getMedData() {
        return medData;
    }

    public void setMedData(byte[] medData) {
        this.medData = medData;
    }
}