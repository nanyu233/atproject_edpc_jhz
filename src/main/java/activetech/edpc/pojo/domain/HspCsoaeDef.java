package activetech.edpc.pojo.domain;

public class HspCsoaeDef {
    private String oaePrt;

    private String fldTyp;

    private String fldCod;

    private String fldNme;

    private String lstNme;

    private String varNme;

    private String memCod;

    private String oaeNme;

    public String getOaePrt() {
        return oaePrt;
    }

    public void setOaePrt(String oaePrt) {
        this.oaePrt = oaePrt == null ? null : oaePrt.trim();
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

    public String getOaeNme() {
        return oaeNme;
    }

    public void setOaeNme(String oaeNme) {
        this.oaeNme = oaeNme == null ? null : oaeNme.trim();
    }
}