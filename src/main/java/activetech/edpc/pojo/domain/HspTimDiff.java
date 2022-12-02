package activetech.edpc.pojo.domain;

import java.util.Date;

public class HspTimDiff {
    private String disTyp;

    private String objTyp;

    private String objEnm;

    private String objNam;

    private String objDes;

    private Short objOdr;

    private String timBegCod;

    private String timBegNam;

    private String timEndCod;

    private String timEndNam;

    private Integer timDif;

    private String objMem;

    private Date chgTim;

    private String chgUsrNo;

    private String chgUsrNam;

    public String getDisTyp() {
        return disTyp;
    }

    public void setDisTyp(String disTyp) {
        this.disTyp = disTyp == null ? null : disTyp.trim();
    }

    public String getObjTyp() {
        return objTyp;
    }

    public void setObjTyp(String objTyp) {
        this.objTyp = objTyp == null ? null : objTyp.trim();
    }

    public String getObjEnm() {
        return objEnm;
    }

    public void setObjEnm(String objEnm) {
        this.objEnm = objEnm == null ? null : objEnm.trim();
    }

    public String getObjNam() {
        return objNam;
    }

    public void setObjNam(String objNam) {
        this.objNam = objNam == null ? null : objNam.trim();
    }

    public String getObjDes() {
        return objDes;
    }

    public void setObjDes(String objDes) {
        this.objDes = objDes == null ? null : objDes.trim();
    }

    public Short getObjOdr() {
        return objOdr;
    }

    public void setObjOdr(Short objOdr) {
        this.objOdr = objOdr;
    }

    public String getTimBegCod() {
        return timBegCod;
    }

    public void setTimBegCod(String timBegCod) {
        this.timBegCod = timBegCod == null ? null : timBegCod.trim();
    }

    public String getTimBegNam() {
        return timBegNam;
    }

    public void setTimBegNam(String timBegNam) {
        this.timBegNam = timBegNam == null ? null : timBegNam.trim();
    }

    public String getTimEndCod() {
        return timEndCod;
    }

    public void setTimEndCod(String timEndCod) {
        this.timEndCod = timEndCod == null ? null : timEndCod.trim();
    }

    public String getTimEndNam() {
        return timEndNam;
    }

    public void setTimEndNam(String timEndNam) {
        this.timEndNam = timEndNam == null ? null : timEndNam.trim();
    }

    public Integer getTimDif() {
        return timDif;
    }

    public void setTimDif(Integer timDif) {
        this.timDif = timDif;
    }

    public String getObjMem() {
        return objMem;
    }

    public void setObjMem(String objMem) {
        this.objMem = objMem == null ? null : objMem.trim();
    }

    public Date getChgTim() {
        return chgTim;
    }

    public void setChgTim(Date chgTim) {
        this.chgTim = chgTim;
    }

    public String getChgUsrNo() {
        return chgUsrNo;
    }

    public void setChgUsrNo(String chgUsrNo) {
        this.chgUsrNo = chgUsrNo == null ? null : chgUsrNo.trim();
    }

    public String getChgUsrNam() {
        return chgUsrNam;
    }

    public void setChgUsrNam(String chgUsrNam) {
        this.chgUsrNam = chgUsrNam == null ? null : chgUsrNam.trim();
    }
}