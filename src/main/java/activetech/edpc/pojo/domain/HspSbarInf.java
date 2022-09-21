package activetech.edpc.pojo.domain;

import java.io.Serializable;
import java.util.Date;

public class HspSbarInf implements Serializable {
    private String emgSeq;

    private Date crtTim;

    private String crtUsr;

    private Date modTim;

    private String modUsr;

    private String sbarcontent;

    private static final long serialVersionUID = 1L;

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public Date getCrtTim() {
        return crtTim;
    }

    public void setCrtTim(Date crtTim) {
        this.crtTim = crtTim;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr == null ? null : crtUsr.trim();
    }

    public Date getModTim() {
        return modTim;
    }

    public void setModTim(Date modTim) {
        this.modTim = modTim;
    }

    public String getModUsr() {
        return modUsr;
    }

    public void setModUsr(String modUsr) {
        this.modUsr = modUsr == null ? null : modUsr.trim();
    }

    public String getSbarcontent() {
        return sbarcontent;
    }

    public void setSbarcontent(String sbarcontent) {
        this.sbarcontent = sbarcontent == null ? null : sbarcontent.trim();
    }
}