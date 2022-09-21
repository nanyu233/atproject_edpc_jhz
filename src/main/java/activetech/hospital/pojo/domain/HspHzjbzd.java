package activetech.hospital.pojo.domain;

public class HspHzjbzd {
    private String id;

    private String icd10;

    private String jbbc;

    private String pysm;

    private String lmtSex;

    private String lmtLx;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getIcd10() {
        return icd10;
    }

    public void setIcd10(String icd10) {
        this.icd10 = icd10 == null ? null : icd10.trim();
    }

    public String getJbbc() {
        return jbbc;
    }

    public void setJbbc(String jbbc) {
        this.jbbc = jbbc == null ? null : jbbc.trim();
    }

    public String getPysm() {
        return pysm;
    }

    public void setPysm(String pysm) {
        this.pysm = pysm == null ? null : pysm.trim();
    }

    public String getLmtSex() {
        return lmtSex;
    }

    public void setLmtSex(String lmtSex) {
        this.lmtSex = lmtSex == null ? null : lmtSex.trim();
    }

    public String getLmtLx() {
        return lmtLx;
    }

    public void setLmtLx(String lmtLx) {
        this.lmtLx = lmtLx == null ? null : lmtLx.trim();
    }
}