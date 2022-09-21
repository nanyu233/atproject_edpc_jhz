package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class HspPrintInf {
    private String printId;

    private String emgSeq;

    private String printType;

    private String printPage;

    private Date crtTime;

    public String getPrintId() {
        return printId;
    }

    public void setPrintId(String printId) {
        this.printId = printId == null ? null : printId.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType == null ? null : printType.trim();
    }

    public String getPrintPage() {
        return printPage;
    }

    public void setPrintPage(String printPage) {
        this.printPage = printPage == null ? null : printPage.trim();
    }

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }
}