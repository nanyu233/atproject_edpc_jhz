package activetech.hospital.pojo.domain;

public class HspCramsInf {
    private String emgSeq;

    private String cirLvlCod;

    private String breLvlCod;

    private String bdyLvlCod;

    private String sptLvlCod;

    private String lanLvlCod;

    private Long totSco;

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getCirLvlCod() {
        return cirLvlCod;
    }

    public void setCirLvlCod(String cirLvlCod) {
        this.cirLvlCod = cirLvlCod == null ? null : cirLvlCod.trim();
    }

    public String getBreLvlCod() {
        return breLvlCod;
    }

    public void setBreLvlCod(String breLvlCod) {
        this.breLvlCod = breLvlCod == null ? null : breLvlCod.trim();
    }

    public String getBdyLvlCod() {
        return bdyLvlCod;
    }

    public void setBdyLvlCod(String bdyLvlCod) {
        this.bdyLvlCod = bdyLvlCod == null ? null : bdyLvlCod.trim();
    }

    public String getSptLvlCod() {
        return sptLvlCod;
    }

    public void setSptLvlCod(String sptLvlCod) {
        this.sptLvlCod = sptLvlCod == null ? null : sptLvlCod.trim();
    }

    public String getLanLvlCod() {
        return lanLvlCod;
    }

    public void setLanLvlCod(String lanLvlCod) {
        this.lanLvlCod = lanLvlCod == null ? null : lanLvlCod.trim();
    }

    public Long getTotSco() {
        return totSco;
    }

    public void setTotSco(Long totSco) {
        this.totSco = totSco;
    }
}