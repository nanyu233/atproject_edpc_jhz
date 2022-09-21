package activetech.edpc.pojo.domain;

public class HspFuvGrpInf {
    private String fgiSeq;

    private String fuvGrpCod;

    private String fuvGrpNam;

    private String fuvGrpFstCod;

    private String curSta;

    private String memo;

    public String getFgiSeq() {
        return fgiSeq;
    }

    public void setFgiSeq(String fgiSeq) {
        this.fgiSeq = fgiSeq == null ? null : fgiSeq.trim();
    }

    public String getFuvGrpCod() {
        return fuvGrpCod;
    }

    public void setFuvGrpCod(String fuvGrpCod) {
        this.fuvGrpCod = fuvGrpCod == null ? null : fuvGrpCod.trim();
    }

    public String getFuvGrpNam() {
        return fuvGrpNam;
    }

    public void setFuvGrpNam(String fuvGrpNam) {
        this.fuvGrpNam = fuvGrpNam == null ? null : fuvGrpNam.trim();
    }

    public String getFuvGrpFstCod() {
        return fuvGrpFstCod;
    }

    public void setFuvGrpFstCod(String fuvGrpFstCod) {
        this.fuvGrpFstCod = fuvGrpFstCod == null ? null : fuvGrpFstCod.trim();
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