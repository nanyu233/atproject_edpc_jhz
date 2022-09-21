package activetech.edpc.pojo.domain;

public class HspCsmicDef {
    private String micPrt;

    private String fldTyp;

    private String fldCod;

    private String fldNme;

    private String fldSrt;

    private String lstNme;

    private String varNme;

    private String memCod;

    private String datSrc;

    public String getMicPrt() {
        return micPrt;
    }

    public void setMicPrt(String micPrt) {
        this.micPrt = micPrt == null ? null : micPrt.trim();
    }

    public String getFldTyp() {
        return fldTyp;
    }

    public void setFldTyp(String fldTyp) {
        this.fldTyp = fldTyp == null ? null : fldTyp.trim();
    }

    public String getFldCod() {
        return fldCod;
    }

    public void setFldCod(String fldCod) {
        this.fldCod = fldCod == null ? null : fldCod.trim();
    }

    public String getFldNme() {
        return fldNme;
    }

    public void setFldNme(String fldNme) {
        this.fldNme = fldNme == null ? null : fldNme.trim();
    }

    public String getFldSrt() {
        return fldSrt;
    }

    public void setFldSrt(String fldSrt) {
        this.fldSrt = fldSrt == null ? null : fldSrt.trim();
    }

    public String getLstNme() {
        return lstNme;
    }

    public void setLstNme(String lstNme) {
        this.lstNme = lstNme == null ? null : lstNme.trim();
    }

    public String getVarNme() {
        return varNme;
    }

    public void setVarNme(String varNme) {
        this.varNme = varNme == null ? null : varNme.trim();
    }

    public String getMemCod() {
        return memCod;
    }

    public void setMemCod(String memCod) {
        this.memCod = memCod == null ? null : memCod.trim();
    }

    public String getDatSrc() {
        return datSrc;
    }

    public void setDatSrc(String datSrc) {
        this.datSrc = datSrc == null ? null : datSrc.trim();
    }
}