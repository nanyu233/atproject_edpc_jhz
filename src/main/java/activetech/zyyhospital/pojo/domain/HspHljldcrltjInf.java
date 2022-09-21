package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class HspHljldcrltjInf {
    private String hljldcrltjSeq;

    private String emgSeq;

    private Date startDat;

    private Date endDat;

    private String sumRl;

    private String sumCl;

    private String tjNum;

    private String tjNam;

    private Date tjDat;

    private String sumPee;

    private String sjc;

    public String getHljldcrltjSeq() {
        return hljldcrltjSeq;
    }

    public void setHljldcrltjSeq(String hljldcrltjSeq) {
        this.hljldcrltjSeq = hljldcrltjSeq == null ? null : hljldcrltjSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public Date getStartDat() {
        return startDat;
    }

    public void setStartDat(Date startDat) {
        this.startDat = startDat;
    }

    public Date getEndDat() {
        return endDat;
    }

    public void setEndDat(Date endDat) {
        this.endDat = endDat;
    }

    public String getSumRl() {
        return sumRl;
    }

    public void setSumRl(String sumRl) {
        this.sumRl = sumRl == null ? null : sumRl.trim();
    }

    public String getSumCl() {
        return sumCl;
    }

    public void setSumCl(String sumCl) {
        this.sumCl = sumCl == null ? null : sumCl.trim();
    }

    public String getTjNum() {
        return tjNum;
    }

    public void setTjNum(String tjNum) {
        this.tjNum = tjNum == null ? null : tjNum.trim();
    }

    public String getTjNam() {
        return tjNam;
    }

    public void setTjNam(String tjNam) {
        this.tjNam = tjNam == null ? null : tjNam.trim();
    }

    public Date getTjDat() {
        return tjDat;
    }

    public void setTjDat(Date tjDat) {
        this.tjDat = tjDat;
    }

    public String getSumPee() {
        return sumPee;
    }

    public void setSumPee(String sumPee) {
        this.sumPee = sumPee == null ? null : sumPee.trim();
    }

    public String getSjc() {
        return sjc;
    }

    public void setSjc(String sjc) {
        this.sjc = sjc == null ? null : sjc.trim();
    }
}