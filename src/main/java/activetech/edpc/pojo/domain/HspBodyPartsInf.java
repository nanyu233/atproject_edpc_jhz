package activetech.edpc.pojo.domain;

import java.math.BigDecimal;
import java.util.Date;

public class HspBodyPartsInf {
    private String partSeq;

    private String emgSeq;

    private BigDecimal clickAxisX;

    private BigDecimal clickAxisY;

    private String partId;

    private String memo;

    private Date crtTime;

    private String crtUser;

    private Date modTime;

    private String modUser;

    public String getPartSeq() {
        return partSeq;
    }

    public void setPartSeq(String partSeq) {
        this.partSeq = partSeq == null ? null : partSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public BigDecimal getClickAxisX() {
        return clickAxisX;
    }

    public void setClickAxisX(BigDecimal clickAxisX) {
        this.clickAxisX = clickAxisX;
    }

    public BigDecimal getClickAxisY() {
        return clickAxisY;
    }

    public void setClickAxisY(BigDecimal clickAxisY) {
        this.clickAxisY = clickAxisY;
    }

    public String getPartId() {
        return partId;
    }

    public void setPartId(String partId) {
        this.partId = partId == null ? null : partId.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    public String getCrtUser() {
        return crtUser;
    }

    public void setCrtUser(String crtUser) {
        this.crtUser = crtUser == null ? null : crtUser.trim();
    }

    public Date getModTime() {
        return modTime;
    }

    public void setModTime(Date modTime) {
        this.modTime = modTime;
    }

    public String getModUser() {
        return modUser;
    }

    public void setModUser(String modUser) {
        this.modUser = modUser == null ? null : modUser.trim();
    }
}