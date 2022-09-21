package activetech.edpc.pojo.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class HspFuvInf {
    private String fuvSeq;

    private String patId;
    private Date outTim;

    private String diaRst;

    private String fuvWayCod;

    private String fuvTyp;
    private Date fuvTim;

    private String fuvGrp;

    private String fuvDoc;

    private Short dgrStf;

    private String patSymCod;

    private Short patWgt;

    private String smkCon;

    private String alcCon;

    private String fodCon;

    private String sltConCod;

    private Short sptConWek;

    private Short sptConTim;

    private String mtlSetCod;

    private String comActCod;

    private String assExmCod;

    private String exmRst;

    private String medCon;

    private String cooMbtCod;

    private String scdVstCod;

    private String takMedCod;

    private String medRftFlg;

    private String havBldFlg;

    private String addExp;

    private String fuvAgnFlg;
    
    private Date nxtFuvTim;

    private String nxtFuvGrp;

    private String nxtFuvDoc;

    private Short patCoo;

    private String plnSeq;

    public String getFuvSeq() {
        return fuvSeq;
    }

    public void setFuvSeq(String fuvSeq) {
        this.fuvSeq = fuvSeq == null ? null : fuvSeq.trim();
    }

    public String getPatId() {
        return patId;
    }

    public void setPatId(String patId) {
        this.patId = patId == null ? null : patId.trim();
    }

    public Date getOutTim() {
        return outTim;
    }

    public void setOutTim(Date outTim) {
        this.outTim = outTim;
    }

    public String getDiaRst() {
        return diaRst;
    }

    public void setDiaRst(String diaRst) {
        this.diaRst = diaRst == null ? null : diaRst.trim();
    }

    public String getFuvWayCod() {
        return fuvWayCod;
    }

    public void setFuvWayCod(String fuvWayCod) {
        this.fuvWayCod = fuvWayCod == null ? null : fuvWayCod.trim();
    }

    public String getFuvTyp() {
        return fuvTyp;
    }

    public void setFuvTyp(String fuvTyp) {
        this.fuvTyp = fuvTyp == null ? null : fuvTyp.trim();
    }

    public Date getFuvTim() {
        return fuvTim;
    }

    public void setFuvTim(Date fuvTim) {
        this.fuvTim = fuvTim;
    }

    public String getFuvGrp() {
        return fuvGrp;
    }

    public void setFuvGrp(String fuvGrp) {
        this.fuvGrp = fuvGrp == null ? null : fuvGrp.trim();
    }

    public String getFuvDoc() {
        return fuvDoc;
    }

    public void setFuvDoc(String fuvDoc) {
        this.fuvDoc = fuvDoc == null ? null : fuvDoc.trim();
    }

    public Short getDgrStf() {
        return dgrStf;
    }

    public void setDgrStf(Short dgrStf) {
        this.dgrStf = dgrStf;
    }

    public String getPatSymCod() {
        return patSymCod;
    }

    public void setPatSymCod(String patSymCod) {
        this.patSymCod = patSymCod == null ? null : patSymCod.trim();
    }

    public Short getPatWgt() {
        return patWgt;
    }

    public void setPatWgt(Short patWgt) {
        this.patWgt = patWgt;
    }

    public String getSmkCon() {
        return smkCon;
    }

    public void setSmkCon(String smkCon) {
        this.smkCon = smkCon == null ? null : smkCon.trim();
    }

    public String getAlcCon() {
        return alcCon;
    }

    public void setAlcCon(String alcCon) {
        this.alcCon = alcCon == null ? null : alcCon.trim();
    }

    public String getFodCon() {
        return fodCon;
    }

    public void setFodCon(String fodCon) {
        this.fodCon = fodCon == null ? null : fodCon.trim();
    }

    public String getSltConCod() {
        return sltConCod;
    }

    public void setSltConCod(String sltConCod) {
        this.sltConCod = sltConCod == null ? null : sltConCod.trim();
    }

    public Short getSptConWek() {
        return sptConWek;
    }

    public void setSptConWek(Short sptConWek) {
        this.sptConWek = sptConWek;
    }

    public Short getSptConTim() {
        return sptConTim;
    }

    public void setSptConTim(Short sptConTim) {
        this.sptConTim = sptConTim;
    }

    public String getMtlSetCod() {
        return mtlSetCod;
    }

    public void setMtlSetCod(String mtlSetCod) {
        this.mtlSetCod = mtlSetCod == null ? null : mtlSetCod.trim();
    }

    public String getComActCod() {
        return comActCod;
    }

    public void setComActCod(String comActCod) {
        this.comActCod = comActCod == null ? null : comActCod.trim();
    }

    public String getAssExmCod() {
        return assExmCod;
    }

    public void setAssExmCod(String assExmCod) {
        this.assExmCod = assExmCod == null ? null : assExmCod.trim();
    }

    public String getExmRst() {
        return exmRst;
    }

    public void setExmRst(String exmRst) {
        this.exmRst = exmRst == null ? null : exmRst.trim();
    }

    public String getMedCon() {
        return medCon;
    }

    public void setMedCon(String medCon) {
        this.medCon = medCon == null ? null : medCon.trim();
    }

    public String getCooMbtCod() {
        return cooMbtCod;
    }

    public void setCooMbtCod(String cooMbtCod) {
        this.cooMbtCod = cooMbtCod == null ? null : cooMbtCod.trim();
    }

    public String getScdVstCod() {
        return scdVstCod;
    }

    public void setScdVstCod(String scdVstCod) {
        this.scdVstCod = scdVstCod == null ? null : scdVstCod.trim();
    }

    public String getTakMedCod() {
        return takMedCod;
    }

    public void setTakMedCod(String takMedCod) {
        this.takMedCod = takMedCod == null ? null : takMedCod.trim();
    }

    public String getMedRftFlg() {
        return medRftFlg;
    }

    public void setMedRftFlg(String medRftFlg) {
        this.medRftFlg = medRftFlg == null ? null : medRftFlg.trim();
    }

    public String getHavBldFlg() {
        return havBldFlg;
    }

    public void setHavBldFlg(String havBldFlg) {
        this.havBldFlg = havBldFlg == null ? null : havBldFlg.trim();
    }

    public String getAddExp() {
        return addExp;
    }

    public void setAddExp(String addExp) {
        this.addExp = addExp == null ? null : addExp.trim();
    }

    public String getFuvAgnFlg() {
        return fuvAgnFlg;
    }

    public void setFuvAgnFlg(String fuvAgnFlg) {
        this.fuvAgnFlg = fuvAgnFlg == null ? null : fuvAgnFlg.trim();
    }

    public Date getNxtFuvTim() {
        return nxtFuvTim;
    }

    public void setNxtFuvTim(Date nxtFuvTim) {
        this.nxtFuvTim = nxtFuvTim;
    }

    public String getNxtFuvGrp() {
        return nxtFuvGrp;
    }

    public void setNxtFuvGrp(String nxtFuvGrp) {
        this.nxtFuvGrp = nxtFuvGrp == null ? null : nxtFuvGrp.trim();
    }

    public String getNxtFuvDoc() {
        return nxtFuvDoc;
    }

    public void setNxtFuvDoc(String nxtFuvDoc) {
        this.nxtFuvDoc = nxtFuvDoc == null ? null : nxtFuvDoc.trim();
    }

    public Short getPatCoo() {
        return patCoo;
    }

    public void setPatCoo(Short patCoo) {
        this.patCoo = patCoo;
    }

    public String getPlnSeq() {
        return plnSeq;
    }

    public void setPlnSeq(String plnSeq) {
        this.plnSeq = plnSeq == null ? null : plnSeq.trim();
    }
}