package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class HspDzblDict {
    private String mbSeq;

    private String mbTitle;

    private String mbType;

    private String tyType;

    private String emgFkCod;

    private String mbContent;

    private Integer mbSort;

    private String mbCrtUser;

    private Date mbCrtTime;

    private String mbCrtName;

    public String getMbSeq() {
        return mbSeq;
    }

    public void setMbSeq(String mbSeq) {
        this.mbSeq = mbSeq == null ? null : mbSeq.trim();
    }

    public String getMbTitle() {
        return mbTitle;
    }

    public void setMbTitle(String mbTitle) {
        this.mbTitle = mbTitle == null ? null : mbTitle.trim();
    }

    public String getMbType() {
        return mbType;
    }

    public void setMbType(String mbType) {
        this.mbType = mbType == null ? null : mbType.trim();
    }

    public String getTyType() {
        return tyType;
    }

    public void setTyType(String tyType) {
        this.tyType = tyType == null ? null : tyType.trim();
    }

    public String getEmgFkCod() {
        return emgFkCod;
    }

    public void setEmgFkCod(String emgFkCod) {
        this.emgFkCod = emgFkCod == null ? null : emgFkCod.trim();
    }

    public String getMbContent() {
        return mbContent;
    }

    public void setMbContent(String mbContent) {
        this.mbContent = mbContent == null ? null : mbContent.trim();
    }

    public Integer getMbSort() {
        return mbSort;
    }

    public void setMbSort(Integer mbSort) {
        this.mbSort = mbSort;
    }

    public String getMbCrtUser() {
        return mbCrtUser;
    }

    public void setMbCrtUser(String mbCrtUser) {
        this.mbCrtUser = mbCrtUser == null ? null : mbCrtUser.trim();
    }

    public Date getMbCrtTime() {
        return mbCrtTime;
    }

    public void setMbCrtTime(Date mbCrtTime) {
        this.mbCrtTime = mbCrtTime;
    }

    public String getMbCrtName() {
        return mbCrtName;
    }

    public void setMbCrtName(String mbCrtName) {
        this.mbCrtName = mbCrtName == null ? null : mbCrtName.trim();
    }
}