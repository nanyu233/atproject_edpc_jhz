package activetech.edpc.pojo.domain;

import java.io.Serializable;

public class HspCsabcDef implements Serializable {
    private String abcPrt;

    private String fldTyp;

    private String fldCod;

    private String fldNme;

    private String lstNme;

    private String varNme;

    private String memCod;

    private String astTyp;

    private static final long serialVersionUID = 1L;

    public String getAbcPrt() {
        return abcPrt;
    }

    public void setAbcPrt(String abcPrt) {
        this.abcPrt = abcPrt == null ? null : abcPrt.trim();
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

    public String getAstTyp() {
        return astTyp;
    }

    public void setAstTyp(String astTyp) {
        this.astTyp = astTyp == null ? null : astTyp.trim();
    }
}