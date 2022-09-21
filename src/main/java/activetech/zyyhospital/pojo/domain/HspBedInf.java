package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class HspBedInf {
    private String bedid;

    private String emgSeq;

    private String bedPlace;

    private String bedNum;

    private Date crtDat;

    private String crtNbr;

    private String crtNam;

    private Date updDat;

    private String updNbr;

    private String updNam;

    private String bedStatus;

    private String showorder;

    public String getBedid() {
        return bedid;
    }

    public void setBedid(String bedid) {
        this.bedid = bedid == null ? null : bedid.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getBedPlace() {
        return bedPlace;
    }

    public void setBedPlace(String bedPlace) {
        this.bedPlace = bedPlace == null ? null : bedPlace.trim();
    }

    public String getBedNum() {
        return bedNum;
    }

    public void setBedNum(String bedNum) {
        this.bedNum = bedNum == null ? null : bedNum.trim();
    }

    public Date getCrtDat() {
        return crtDat;
    }

    public void setCrtDat(Date crtDat) {
        this.crtDat = crtDat;
    }

    public String getCrtNbr() {
        return crtNbr;
    }

    public void setCrtNbr(String crtNbr) {
        this.crtNbr = crtNbr == null ? null : crtNbr.trim();
    }

    public String getCrtNam() {
        return crtNam;
    }

    public void setCrtNam(String crtNam) {
        this.crtNam = crtNam == null ? null : crtNam.trim();
    }

    public Date getUpdDat() {
        return updDat;
    }

    public void setUpdDat(Date updDat) {
        this.updDat = updDat;
    }

    public String getUpdNbr() {
        return updNbr;
    }

    public void setUpdNbr(String updNbr) {
        this.updNbr = updNbr == null ? null : updNbr.trim();
    }

    public String getUpdNam() {
        return updNam;
    }

    public void setUpdNam(String updNam) {
        this.updNam = updNam == null ? null : updNam.trim();
    }

    public String getBedStatus() {
        return bedStatus;
    }

    public void setBedStatus(String bedStatus) {
        this.bedStatus = bedStatus == null ? null : bedStatus.trim();
    }

    public String getShoworder() {
        return showorder;
    }

    public void setShoworder(String showorder) {
        this.showorder = showorder == null ? null : showorder.trim();
    }
}