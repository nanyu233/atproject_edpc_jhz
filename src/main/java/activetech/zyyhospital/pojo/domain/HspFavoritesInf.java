package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class HspFavoritesInf {
    private String seqno;

    private String title;

    private String content;

    private String crtusrno;

    private Date crtdate;

    private String memo;

    private String sctype;

    private String ksdm;

    private Integer showorder;

    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno == null ? null : seqno.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getCrtusrno() {
        return crtusrno;
    }

    public void setCrtusrno(String crtusrno) {
        this.crtusrno = crtusrno == null ? null : crtusrno.trim();
    }

    public Date getCrtdate() {
        return crtdate;
    }

    public void setCrtdate(Date crtdate) {
        this.crtdate = crtdate;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getSctype() {
        return sctype;
    }

    public void setSctype(String sctype) {
        this.sctype = sctype == null ? null : sctype.trim();
    }

    public String getKsdm() {
        return ksdm;
    }

    public void setKsdm(String ksdm) {
        this.ksdm = ksdm == null ? null : ksdm.trim();
    }

    public Integer getShoworder() {
        return showorder;
    }

    public void setShoworder(Integer showorder) {
        this.showorder = showorder;
    }
}