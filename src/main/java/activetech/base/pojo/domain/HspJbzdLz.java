package activetech.base.pojo.domain;

public class HspJbzdLz {
    private String id;

    private String jbbc;

    private String icd10;

    private String pysm;

    private String srm2;

    private String srm3;

    private String jibingtype;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getJbbc() {
        return jbbc;
    }

    public void setJbbc(String jbbc) {
        this.jbbc = jbbc == null ? null : jbbc.trim();
    }

    public String getIcd10() {
        return icd10;
    }

    public void setIcd10(String icd10) {
        this.icd10 = icd10 == null ? null : icd10.trim();
    }

    public String getPysm() {
        return pysm;
    }

    public void setPysm(String pysm) {
        this.pysm = pysm == null ? null : pysm.trim();
    }

    public String getSrm2() {
        return srm2;
    }

    public void setSrm2(String srm2) {
        this.srm2 = srm2 == null ? null : srm2.trim();
    }

    public String getSrm3() {
        return srm3;
    }

    public void setSrm3(String srm3) {
        this.srm3 = srm3 == null ? null : srm3.trim();
    }

    public String getJibingtype() {
        return jibingtype;
    }

    public void setJibingtype(String jibingtype) {
        this.jibingtype = jibingtype == null ? null : jibingtype.trim();
    }
}