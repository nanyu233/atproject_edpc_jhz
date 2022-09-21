package activetech.edpc.pojo.domain;

public class HspFuvDocInf {
    private String fdiSeq;

    private String docCod;

    private String docNam;

    private String docFstCod;

    private String fuvGrpCod;

    private String curSta;

    private String memo;

    public String getFdiSeq() {
        return fdiSeq;
    }

    public void setFdiSeq(String fdiSeq) {
        this.fdiSeq = fdiSeq == null ? null : fdiSeq.trim();
    }

    public String getDocCod() {
        return docCod;
    }

    public void setDocCod(String docCod) {
        this.docCod = docCod == null ? null : docCod.trim();
    }

    public String getDocNam() {
        return docNam;
    }

    public void setDocNam(String docNam) {
        this.docNam = docNam == null ? null : docNam.trim();
    }

    public String getDocFstCod() {
        return docFstCod;
    }

    public void setDocFstCod(String docFstCod) {
        this.docFstCod = docFstCod == null ? null : docFstCod.trim();
    }

    public String getFuvGrpCod() {
        return fuvGrpCod;
    }

    public void setFuvGrpCod(String fuvGrpCod) {
        this.fuvGrpCod = fuvGrpCod == null ? null : fuvGrpCod.trim();
    }

    public String getCurSta() {
        return curSta;
    }

    public void setCurSta(String curSta) {
        this.curSta = curSta == null ? null : curSta.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}