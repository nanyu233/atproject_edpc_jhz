package activetech.edpc.pojo.domain;

public class HspCsabcInfKey {
    private String abcSeq;

    private String emgSeq;

    private String fldCod;

    public String getAbcSeq() {
        return abcSeq;
    }

    public void setAbcSeq(String abcSeq) {
        this.abcSeq = abcSeq == null ? null : abcSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getFldCod() {
        return fldCod;
    }

    public void setFldCod(String fldCod) {
        this.fldCod = fldCod == null ? null : fldCod.trim();
    }
}