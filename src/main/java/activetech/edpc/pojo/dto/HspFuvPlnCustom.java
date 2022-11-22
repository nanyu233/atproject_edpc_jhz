package activetech.edpc.pojo.dto;

import activetech.edpc.pojo.domain.HspFuvPln;

import java.util.Date;

/**
 * @author ROG
 */
public class HspFuvPlnCustom extends HspFuvPln {
    private String plnStaStr;
    private String patNam;
    private Date fuvTim;
    private String fuvSeq;
    /**
     * 随访提醒用户信息
     */
    private String phone;
    private String movephone;

    public String getFuvSeq() {
        return fuvSeq;
    }

    public void setFuvSeq(String fuvSeq) {
        this.fuvSeq = fuvSeq;
    }

    public Date getFuvTim() {
        return fuvTim;
    }

    public void setFuvTim(Date fuvTim) {
        this.fuvTim = fuvTim;
    }

    public String getPlnStaStr() {
        return plnStaStr;
    }

    public void setPlnStaStr(String plnStaStr) {
        this.plnStaStr = plnStaStr;
    }

    public String getPatNam() {
        return patNam;
    }

    public void setPatNam(String patNam) {
        this.patNam = patNam;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMovephone() {
        return movephone;
    }

    public void setMovephone(String movephone) {
        this.movephone = movephone;
    }
}
