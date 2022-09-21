package activetech.hospital.pojo.domain;

import java.util.Date;

public class HspDevSys {
    private String id;

    private String devtypCod;

    private String ipaddr;

    private String devno;

    private String memo;

    private Date crtDat;

    private String crtUsrNbr;

    private Date updDat;

    private String updUsrNbr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDevtypCod() {
        return devtypCod;
    }

    public void setDevtypCod(String devtypCod) {
        this.devtypCod = devtypCod == null ? null : devtypCod.trim();
    }

    public String getIpaddr() {
        return ipaddr;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr == null ? null : ipaddr.trim();
    }

    public String getDevno() {
        return devno;
    }

    public void setDevno(String devno) {
        this.devno = devno == null ? null : devno.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Date getCrtDat() {
        return crtDat;
    }

    public void setCrtDat(Date crtDat) {
        this.crtDat = crtDat;
    }

    public String getCrtUsrNbr() {
        return crtUsrNbr;
    }

    public void setCrtUsrNbr(String crtUsrNbr) {
        this.crtUsrNbr = crtUsrNbr == null ? null : crtUsrNbr.trim();
    }

    public Date getUpdDat() {
        return updDat;
    }

    public void setUpdDat(Date updDat) {
        this.updDat = updDat;
    }

    public String getUpdUsrNbr() {
        return updUsrNbr;
    }

    public void setUpdUsrNbr(String updUsrNbr) {
        this.updUsrNbr = updUsrNbr == null ? null : updUsrNbr.trim();
    }
}