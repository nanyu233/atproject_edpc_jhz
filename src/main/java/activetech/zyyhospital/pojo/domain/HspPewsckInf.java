package activetech.zyyhospital.pojo.domain;

public class HspPewsckInf {
    private String emgSeq;

    private String actionCod;

    private String xxgSkinCod;

    private String xxgCrtCod;

    private String xxgXlCod;

    private String hxPlCod;

    private String hxXhCod;

    private String hxFio2Cod;

    private Short pewsSco;

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getActionCod() {
        return actionCod;
    }

    public void setActionCod(String actionCod) {
        this.actionCod = actionCod == null ? null : actionCod.trim();
    }

    public String getXxgSkinCod() {
        return xxgSkinCod;
    }

    public void setXxgSkinCod(String xxgSkinCod) {
        this.xxgSkinCod = xxgSkinCod == null ? null : xxgSkinCod.trim();
    }

    public String getXxgCrtCod() {
        return xxgCrtCod;
    }

    public void setXxgCrtCod(String xxgCrtCod) {
        this.xxgCrtCod = xxgCrtCod == null ? null : xxgCrtCod.trim();
    }

    public String getXxgXlCod() {
        return xxgXlCod;
    }

    public void setXxgXlCod(String xxgXlCod) {
        this.xxgXlCod = xxgXlCod == null ? null : xxgXlCod.trim();
    }

    public String getHxPlCod() {
        return hxPlCod;
    }

    public void setHxPlCod(String hxPlCod) {
        this.hxPlCod = hxPlCod == null ? null : hxPlCod.trim();
    }

    public String getHxXhCod() {
        return hxXhCod;
    }

    public void setHxXhCod(String hxXhCod) {
        this.hxXhCod = hxXhCod == null ? null : hxXhCod.trim();
    }

    public String getHxFio2Cod() {
        return hxFio2Cod;
    }

    public void setHxFio2Cod(String hxFio2Cod) {
        this.hxFio2Cod = hxFio2Cod == null ? null : hxFio2Cod.trim();
    }

    public Short getPewsSco() {
        return pewsSco;
    }

    public void setPewsSco(Short pewsSco) {
        this.pewsSco = pewsSco;
    }
}