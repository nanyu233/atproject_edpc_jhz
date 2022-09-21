package activetech.zyyhospital.pojo.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class HspHeartRecord {
    private String heartSeq;

    private String emgSeq;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date rescueTime;

    private String senStuCod;

    private String pupilLeft;

    private String pupilRight;

    private String pupilSizeLeft;

    private String pupilSizeRight;

    private String hrtRte;

    private String hrtRhythm;

    private String sbpNbrFlg;

    private String sbpUpNbr;

    private String sbpDownNbr;

    private String breNbrFlg;

    private String breNbr;

    private String xyFlg;

    private String xy;

    private String ventilation;

    private String itchyFlow;

    private String intravenousBolusNam;

    private String intravenousBolusDose;

    private String intravenousDripName;

    private String intravenousDripDose;

    private String rescueRecord;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date recordTime;

    private String recordNam;

    private Date crtDat;

    private String crtUsr;

    private String crtUsrNam;

    private Date modDat;

    private String modUsr;

    private String modUsrNam;

    private String intravenousBolusOther;

    private String intravenousDripOther;

    private String senStuOther;

    private String oxygenType;

    private String pupilLeftOther;

    private String pupilRightOther;

    private String hrtRhythmOther;

    public String getHeartSeq() {
        return heartSeq;
    }

    public void setHeartSeq(String heartSeq) {
        this.heartSeq = heartSeq == null ? null : heartSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public Date getRescueTime() {
        return rescueTime;
    }

    public void setRescueTime(Date rescueTime) {
        this.rescueTime = rescueTime;
    }

    public String getSenStuCod() {
        return senStuCod;
    }

    public void setSenStuCod(String senStuCod) {
        this.senStuCod = senStuCod == null ? null : senStuCod.trim();
    }

    public String getPupilLeft() {
        return pupilLeft;
    }

    public void setPupilLeft(String pupilLeft) {
        this.pupilLeft = pupilLeft == null ? null : pupilLeft.trim();
    }

    public String getPupilRight() {
        return pupilRight;
    }

    public void setPupilRight(String pupilRight) {
        this.pupilRight = pupilRight == null ? null : pupilRight.trim();
    }

    public String getPupilSizeLeft() {
        return pupilSizeLeft;
    }

    public void setPupilSizeLeft(String pupilSizeLeft) {
        this.pupilSizeLeft = pupilSizeLeft == null ? null : pupilSizeLeft.trim();
    }

    public String getPupilSizeRight() {
        return pupilSizeRight;
    }

    public void setPupilSizeRight(String pupilSizeRight) {
        this.pupilSizeRight = pupilSizeRight == null ? null : pupilSizeRight.trim();
    }

    public String getHrtRte() {
        return hrtRte;
    }

    public void setHrtRte(String hrtRte) {
        this.hrtRte = hrtRte == null ? null : hrtRte.trim();
    }

    public String getHrtRhythm() {
        return hrtRhythm;
    }

    public void setHrtRhythm(String hrtRhythm) {
        this.hrtRhythm = hrtRhythm == null ? null : hrtRhythm.trim();
    }

    public String getSbpNbrFlg() {
        return sbpNbrFlg;
    }

    public void setSbpNbrFlg(String sbpNbrFlg) {
        this.sbpNbrFlg = sbpNbrFlg == null ? null : sbpNbrFlg.trim();
    }

    public String getSbpUpNbr() {
        return sbpUpNbr;
    }

    public void setSbpUpNbr(String sbpUpNbr) {
        this.sbpUpNbr = sbpUpNbr == null ? null : sbpUpNbr.trim();
    }

    public String getSbpDownNbr() {
        return sbpDownNbr;
    }

    public void setSbpDownNbr(String sbpDownNbr) {
        this.sbpDownNbr = sbpDownNbr == null ? null : sbpDownNbr.trim();
    }

    public String getBreNbrFlg() {
        return breNbrFlg;
    }

    public void setBreNbrFlg(String breNbrFlg) {
        this.breNbrFlg = breNbrFlg == null ? null : breNbrFlg.trim();
    }

    public String getBreNbr() {
        return breNbr;
    }

    public void setBreNbr(String breNbr) {
        this.breNbr = breNbr == null ? null : breNbr.trim();
    }

    public String getXyFlg() {
        return xyFlg;
    }

    public void setXyFlg(String xyFlg) {
        this.xyFlg = xyFlg == null ? null : xyFlg.trim();
    }

    public String getXy() {
        return xy;
    }

    public void setXy(String xy) {
        this.xy = xy == null ? null : xy.trim();
    }

    public String getVentilation() {
        return ventilation;
    }

    public void setVentilation(String ventilation) {
        this.ventilation = ventilation == null ? null : ventilation.trim();
    }

    public String getItchyFlow() {
        return itchyFlow;
    }

    public void setItchyFlow(String itchyFlow) {
        this.itchyFlow = itchyFlow == null ? null : itchyFlow.trim();
    }

    public String getIntravenousBolusNam() {
        return intravenousBolusNam;
    }

    public void setIntravenousBolusNam(String intravenousBolusNam) {
        this.intravenousBolusNam = intravenousBolusNam == null ? null : intravenousBolusNam.trim();
    }

    public String getIntravenousBolusDose() {
        return intravenousBolusDose;
    }

    public void setIntravenousBolusDose(String intravenousBolusDose) {
        this.intravenousBolusDose = intravenousBolusDose == null ? null : intravenousBolusDose.trim();
    }

    public String getIntravenousDripName() {
        return intravenousDripName;
    }

    public void setIntravenousDripName(String intravenousDripName) {
        this.intravenousDripName = intravenousDripName == null ? null : intravenousDripName.trim();
    }

    public String getIntravenousDripDose() {
        return intravenousDripDose;
    }

    public void setIntravenousDripDose(String intravenousDripDose) {
        this.intravenousDripDose = intravenousDripDose == null ? null : intravenousDripDose.trim();
    }

    public String getRescueRecord() {
        return rescueRecord;
    }

    public void setRescueRecord(String rescueRecord) {
        this.rescueRecord = rescueRecord == null ? null : rescueRecord.trim();
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public String getRecordNam() {
        return recordNam;
    }

    public void setRecordNam(String recordNam) {
        this.recordNam = recordNam == null ? null : recordNam.trim();
    }

    public Date getCrtDat() {
        return crtDat;
    }

    public void setCrtDat(Date crtDat) {
        this.crtDat = crtDat;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr == null ? null : crtUsr.trim();
    }

    public String getCrtUsrNam() {
        return crtUsrNam;
    }

    public void setCrtUsrNam(String crtUsrNam) {
        this.crtUsrNam = crtUsrNam == null ? null : crtUsrNam.trim();
    }

    public Date getModDat() {
        return modDat;
    }

    public void setModDat(Date modDat) {
        this.modDat = modDat;
    }

    public String getModUsr() {
        return modUsr;
    }

    public void setModUsr(String modUsr) {
        this.modUsr = modUsr == null ? null : modUsr.trim();
    }

    public String getModUsrNam() {
        return modUsrNam;
    }

    public void setModUsrNam(String modUsrNam) {
        this.modUsrNam = modUsrNam == null ? null : modUsrNam.trim();
    }

    public String getIntravenousBolusOther() {
        return intravenousBolusOther;
    }

    public void setIntravenousBolusOther(String intravenousBolusOther) {
        this.intravenousBolusOther = intravenousBolusOther == null ? null : intravenousBolusOther.trim();
    }

    public String getIntravenousDripOther() {
        return intravenousDripOther;
    }

    public void setIntravenousDripOther(String intravenousDripOther) {
        this.intravenousDripOther = intravenousDripOther == null ? null : intravenousDripOther.trim();
    }

    public String getSenStuOther() {
        return senStuOther;
    }

    public void setSenStuOther(String senStuOther) {
        this.senStuOther = senStuOther == null ? null : senStuOther.trim();
    }

    public String getOxygenType() {
        return oxygenType;
    }

    public void setOxygenType(String oxygenType) {
        this.oxygenType = oxygenType == null ? null : oxygenType.trim();
    }

    public String getPupilLeftOther() {
        return pupilLeftOther;
    }

    public void setPupilLeftOther(String pupilLeftOther) {
        this.pupilLeftOther = pupilLeftOther == null ? null : pupilLeftOther.trim();
    }

    public String getPupilRightOther() {
        return pupilRightOther;
    }

    public void setPupilRightOther(String pupilRightOther) {
        this.pupilRightOther = pupilRightOther == null ? null : pupilRightOther.trim();
    }

    public String getHrtRhythmOther() {
        return hrtRhythmOther;
    }

    public void setHrtRhythmOther(String hrtRhythmOther) {
        this.hrtRhythmOther = hrtRhythmOther == null ? null : hrtRhythmOther.trim();
    }
}