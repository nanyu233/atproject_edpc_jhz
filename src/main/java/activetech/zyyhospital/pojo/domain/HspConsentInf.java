package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class HspConsentInf {
    private String seqno;

    private String refseqno;

    private String tempno;

    private String tempname;

    private String memo;

    private String crtusrno;

    private String crtusrname;

    private Date crtdate;

    private String updusrno;

    private String updusrname;

    private Date upddate;

    private String textparam;

    private String qmHash;

    private String qmTag;

    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno == null ? null : seqno.trim();
    }

    public String getRefseqno() {
        return refseqno;
    }

    public void setRefseqno(String refseqno) {
        this.refseqno = refseqno == null ? null : refseqno.trim();
    }

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

    public String getCrtusrno() {
        return crtusrno;
    }

    public void setCrtusrno(String crtusrno) {
        this.crtusrno = crtusrno == null ? null : crtusrno.trim();
    }

    public String getCrtusrname() {
        return crtusrname;
    }

    public void setCrtusrname(String crtusrname) {
        this.crtusrname = crtusrname == null ? null : crtusrname.trim();
    }

    public Date getCrtdate() {
        return crtdate;
    }

    public void setCrtdate(Date crtdate) {
        this.crtdate = crtdate;
    }

    public String getUpdusrno() {
        return updusrno;
    }

    public void setUpdusrno(String updusrno) {
        this.updusrno = updusrno == null ? null : updusrno.trim();
    }

    public String getUpdusrname() {
        return updusrname;
    }

    public void setUpdusrname(String updusrname) {
        this.updusrname = updusrname == null ? null : updusrname.trim();
    }

    public Date getUpddate() {
        return upddate;
    }

    public void setUpddate(Date upddate) {
        this.upddate = upddate;
    }

    public String getTextparam() {
        return textparam;
    }

    public void setTextparam(String textparam) {
        this.textparam = textparam == null ? null : textparam.trim();
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