package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class HspJzcsjlbInf {
    private String jzcsId;

    private String emgSeq;

    private String cstNam;

    private String cstSexCod;

    private String cstAge;

    private String cstAgeCod;

    private String cstAdr;
    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date emgDat;

    private String emgFkCod;

    private String sqlDctNbr;

    private BigDecimal csbwT;

    private Long csbwP;

    private Long csbwR;

    private Short sbpUpNbr;

    private String jbzdDes;

    private String algHon;

    private String algTypCod;

    private String algTypDes;

    private String cszsfCod;

    private String csyyCod;

    private String fsddCod;

    private String hsfsCod;

    private String hsrCod;

    private String lxrNam;

    private String lxrTel;

    private String qkCod;

    private String recorderNbr;

    private String recorderNam;

    private Short sbpDownNbr;

    private String cszsfOther;

    private String fsddOther;

    private String csyyOther;

    public String getJzcsId() {
        return jzcsId;
    }

    public void setJzcsId(String jzcsId) {
        this.jzcsId = jzcsId == null ? null : jzcsId.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getCstNam() {
        return cstNam;
    }

    public void setCstNam(String cstNam) {
        this.cstNam = cstNam == null ? null : cstNam.trim();
    }

    public String getCstSexCod() {
        return cstSexCod;
    }

    public void setCstSexCod(String cstSexCod) {
        this.cstSexCod = cstSexCod == null ? null : cstSexCod.trim();
    }

    public String getCstAge() {
        return cstAge;
    }

    public void setCstAge(String cstAge) {
        this.cstAge = cstAge == null ? null : cstAge.trim();
    }

    public String getCstAgeCod() {
        return cstAgeCod;
    }

    public void setCstAgeCod(String cstAgeCod) {
        this.cstAgeCod = cstAgeCod == null ? null : cstAgeCod.trim();
    }

    public String getCstAdr() {
        return cstAdr;
    }

    public void setCstAdr(String cstAdr) {
        this.cstAdr = cstAdr == null ? null : cstAdr.trim();
    }

    public Date getEmgDat() {
        return emgDat;
    }

    public void setEmgDat(Date emgDat) {
        this.emgDat = emgDat;
    }

    public String getEmgFkCod() {
        return emgFkCod;
    }

    public void setEmgFkCod(String emgFkCod) {
        this.emgFkCod = emgFkCod == null ? null : emgFkCod.trim();
    }

    public String getSqlDctNbr() {
        return sqlDctNbr;
    }

    public void setSqlDctNbr(String sqlDctNbr) {
        this.sqlDctNbr = sqlDctNbr == null ? null : sqlDctNbr.trim();
    }

    public BigDecimal getCsbwT() {
        return csbwT;
    }

    public void setCsbwT(BigDecimal csbwT) {
        this.csbwT = csbwT;
    }

    public Long getCsbwP() {
        return csbwP;
    }

    public void setCsbwP(Long csbwP) {
        this.csbwP = csbwP;
    }

    public Long getCsbwR() {
        return csbwR;
    }

    public void setCsbwR(Long csbwR) {
        this.csbwR = csbwR;
    }

    public Short getSbpUpNbr() {
        return sbpUpNbr;
    }

    public void setSbpUpNbr(Short sbpUpNbr) {
        this.sbpUpNbr = sbpUpNbr;
    }

    public String getJbzdDes() {
        return jbzdDes;
    }

    public void setJbzdDes(String jbzdDes) {
        this.jbzdDes = jbzdDes == null ? null : jbzdDes.trim();
    }

    public String getAlgHon() {
        return algHon;
    }

    public void setAlgHon(String algHon) {
        this.algHon = algHon == null ? null : algHon.trim();
    }

    public String getAlgTypCod() {
        return algTypCod;
    }

    public void setAlgTypCod(String algTypCod) {
        this.algTypCod = algTypCod == null ? null : algTypCod.trim();
    }

    public String getAlgTypDes() {
        return algTypDes;
    }

    public void setAlgTypDes(String algTypDes) {
        this.algTypDes = algTypDes == null ? null : algTypDes.trim();
    }

    public String getCszsfCod() {
        return cszsfCod;
    }

    public void setCszsfCod(String cszsfCod) {
        this.cszsfCod = cszsfCod == null ? null : cszsfCod.trim();
    }

    public String getCsyyCod() {
        return csyyCod;
    }

    public void setCsyyCod(String csyyCod) {
        this.csyyCod = csyyCod == null ? null : csyyCod.trim();
    }

    public String getFsddCod() {
        return fsddCod;
    }

    public void setFsddCod(String fsddCod) {
        this.fsddCod = fsddCod == null ? null : fsddCod.trim();
    }

    public String getHsfsCod() {
        return hsfsCod;
    }

    public void setHsfsCod(String hsfsCod) {
        this.hsfsCod = hsfsCod == null ? null : hsfsCod.trim();
    }

    public String getHsrCod() {
        return hsrCod;
    }

    public void setHsrCod(String hsrCod) {
        this.hsrCod = hsrCod == null ? null : hsrCod.trim();
    }

    public String getLxrNam() {
        return lxrNam;
    }

    public void setLxrNam(String lxrNam) {
        this.lxrNam = lxrNam == null ? null : lxrNam.trim();
    }

    public String getLxrTel() {
        return lxrTel;
    }

    public void setLxrTel(String lxrTel) {
        this.lxrTel = lxrTel == null ? null : lxrTel.trim();
    }

    public String getQkCod() {
        return qkCod;
    }

    public void setQkCod(String qkCod) {
        this.qkCod = qkCod == null ? null : qkCod.trim();
    }

    public String getRecorderNbr() {
        return recorderNbr;
    }

    public void setRecorderNbr(String recorderNbr) {
        this.recorderNbr = recorderNbr == null ? null : recorderNbr.trim();
    }

    public String getRecorderNam() {
        return recorderNam;
    }

    public void setRecorderNam(String recorderNam) {
        this.recorderNam = recorderNam == null ? null : recorderNam.trim();
    }

    public Short getSbpDownNbr() {
        return sbpDownNbr;
    }

    public void setSbpDownNbr(Short sbpDownNbr) {
        this.sbpDownNbr = sbpDownNbr;
    }

    public String getCszsfOther() {
        return cszsfOther;
    }

    public void setCszsfOther(String cszsfOther) {
        this.cszsfOther = cszsfOther == null ? null : cszsfOther.trim();
    }

    public String getFsddOther() {
        return fsddOther;
    }

    public void setFsddOther(String fsddOther) {
        this.fsddOther = fsddOther == null ? null : fsddOther.trim();
    }

    public String getCsyyOther() {
        return csyyOther;
    }

    public void setCsyyOther(String csyyOther) {
        this.csyyOther = csyyOther == null ? null : csyyOther.trim();
    }
}