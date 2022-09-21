package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class HspTiInf {
    private String tiSeq;

    private String tiPartCod;

    private String tiTrmCod;

    private String tiSbuCod;

    private String tiPulCod;

    private String tiCscCod;

    private String tiBreCod;

    private String tiWcxCod;

    private Date cratDat;

    private String emgSeq;

    private String tiTrmOther;

    private String tiSco;

    public String getTiSeq() {
        return tiSeq;
    }

    public void setTiSeq(String tiSeq) {
        this.tiSeq = tiSeq == null ? null : tiSeq.trim();
    }

    public String getTiPartCod() {
        return tiPartCod;
    }

    public void setTiPartCod(String tiPartCod) {
        this.tiPartCod = tiPartCod == null ? null : tiPartCod.trim();
    }

    public String getTiTrmCod() {
        return tiTrmCod;
    }

    public void setTiTrmCod(String tiTrmCod) {
        this.tiTrmCod = tiTrmCod == null ? null : tiTrmCod.trim();
    }

    public String getTiSbuCod() {
        return tiSbuCod;
    }

    public void setTiSbuCod(String tiSbuCod) {
        this.tiSbuCod = tiSbuCod == null ? null : tiSbuCod.trim();
    }

    public String getTiPulCod() {
        return tiPulCod;
    }

    public void setTiPulCod(String tiPulCod) {
        this.tiPulCod = tiPulCod == null ? null : tiPulCod.trim();
    }

    public String getTiCscCod() {
        return tiCscCod;
    }

    public void setTiCscCod(String tiCscCod) {
        this.tiCscCod = tiCscCod == null ? null : tiCscCod.trim();
    }

    public String getTiBreCod() {
        return tiBreCod;
    }

    public void setTiBreCod(String tiBreCod) {
        this.tiBreCod = tiBreCod == null ? null : tiBreCod.trim();
    }

    public String getTiWcxCod() {
        return tiWcxCod;
    }

    public void setTiWcxCod(String tiWcxCod) {
        this.tiWcxCod = tiWcxCod == null ? null : tiWcxCod.trim();
    }

    public Date getCratDat() {
        return cratDat;
    }

    public void setCratDat(Date cratDat) {
        this.cratDat = cratDat;
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getTiTrmOther() {
        return tiTrmOther;
    }

    public void setTiTrmOther(String tiTrmOther) {
        this.tiTrmOther = tiTrmOther == null ? null : tiTrmOther.trim();
    }

    public String getTiSco() {
        return tiSco;
    }

    public void setTiSco(String tiSco) {
        this.tiSco = tiSco == null ? null : tiSco.trim();
    }
}