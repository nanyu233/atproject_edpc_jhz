package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;

public class HspConsentTemp {
    private String tempno;

    private String tempname;

    private String memo;

    private BigDecimal ordnumb;

    private String qmHash;

    private String qmTag;

    public String getTempno() {
        return tempno;
    }

    public void setTempno(String tempno) {
        this.tempno = tempno == null ? null : tempno.trim();
    }

    public String getTempname() {
        return tempname;
    }

    public void setTempname(String tempname) {
        this.tempname = tempname == null ? null : tempname.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public BigDecimal getOrdnumb() {
        return ordnumb;
    }

    public void setOrdnumb(BigDecimal ordnumb) {
        this.ordnumb = ordnumb;
    }

    public String getQmHash() {
        return qmHash;
    }

    public void setQmHash(String qmHash) {
        this.qmHash = qmHash == null ? null : qmHash.trim();
    }

    public String getQmTag() {
        return qmTag;
    }

    public void setQmTag(String qmTag) {
        this.qmTag = qmTag == null ? null : qmTag.trim();
    }
}