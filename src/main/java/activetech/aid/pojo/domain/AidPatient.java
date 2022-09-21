package activetech.aid.pojo.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AidPatient {
    private String patid;

    private String patname;

    private String idcard;

    private String patnat;

    private Date birthday;

    private String patsex;

    private String patage;

    private String agecode;

    private String patmtel;

    private String conntel;

    private String pataddr;

    private String ocrflag;

    private String pattype;

    private String patmemo;

    private BigDecimal tmpNbr;

    private Short hrtRte;

    private Short breNbr;

    private Short sbpNbr;

    private String senRct;

    private Short dbpNbr;

    private Short bldOxy;

    private Short mewssco;

    private String mewslvl;

    private String isbind;

    private String crtuserid;

    private Date crttime;

    private String havFmy;

    private String cstOccCod;

    private String sceAr1Cod;

    private String sceAr2Cod;

    private String sceAdr;

    private String lnkMan;

    private String almSeq;

    private String drrNo;

    private String drrNme;

    private String carNo;

    private String docNo;

    private String docNme;

    private String nurNo;

    private String nurNme;
    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date illTim;

    private String illperd;
    @JsonFormat(pattern="yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date almtime;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone = "GMT+8")
    private Date outtime;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone = "GMT+8")
    private Date aastime;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone = "GMT+8")
    private Date lestime;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone = "GMT+8")
    private Date aahtime;

    private BigDecimal sceLng;

    private BigDecimal sceLat;

    private BigDecimal sceHgt;

    private String scePrvCod;

    private String sceCtyCod;

    private String sceAr0Cod;

    private String illTimFlg;

    public String getPatid() {
        return patid;
    }

    public void setPatid(String patid) {
        this.patid = patid == null ? null : patid.trim();
    }

    public String getPatname() {
        return patname;
    }

    public void setPatname(String patname) {
        this.patname = patname == null ? null : patname.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getPatnat() {
        return patnat;
    }

    public void setPatnat(String patnat) {
        this.patnat = patnat == null ? null : patnat.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPatsex() {
        return patsex;
    }

    public void setPatsex(String patsex) {
        this.patsex = patsex == null ? null : patsex.trim();
    }

    public String getPatage() {
        return patage;
    }

    public void setPatage(String patage) {
        this.patage = patage == null ? null : patage.trim();
    }

    public String getAgecode() {
        return agecode;
    }

    public void setAgecode(String agecode) {
        this.agecode = agecode == null ? null : agecode.trim();
    }

    public String getPatmtel() {
        return patmtel;
    }

    public void setPatmtel(String patmtel) {
        this.patmtel = patmtel == null ? null : patmtel.trim();
    }

    public String getConntel() {
        return conntel;
    }

    public void setConntel(String conntel) {
        this.conntel = conntel == null ? null : conntel.trim();
    }

    public String getPataddr() {
        return pataddr;
    }

    public void setPataddr(String pataddr) {
        this.pataddr = pataddr == null ? null : pataddr.trim();
    }

    public String getOcrflag() {
        return ocrflag;
    }

    public void setOcrflag(String ocrflag) {
        this.ocrflag = ocrflag == null ? null : ocrflag.trim();
    }

    public String getPattype() {
        return pattype;
    }

    public void setPattype(String pattype) {
        this.pattype = pattype == null ? null : pattype.trim();
    }

    public String getPatmemo() {
        return patmemo;
    }

    public void setPatmemo(String patmemo) {
        this.patmemo = patmemo == null ? null : patmemo.trim();
    }

    public BigDecimal getTmpNbr() {
        return tmpNbr;
    }

    public void setTmpNbr(BigDecimal tmpNbr) {
        this.tmpNbr = tmpNbr;
    }

    public Short getHrtRte() {
        return hrtRte;
    }

    public void setHrtRte(Short hrtRte) {
        this.hrtRte = hrtRte;
    }

    public Short getBreNbr() {
        return breNbr;
    }

    public void setBreNbr(Short breNbr) {
        this.breNbr = breNbr;
    }

    public Short getSbpNbr() {
        return sbpNbr;
    }

    public void setSbpNbr(Short sbpNbr) {
        this.sbpNbr = sbpNbr;
    }

    public String getSenRct() {
        return senRct;
    }

    public void setSenRct(String senRct) {
        this.senRct = senRct == null ? null : senRct.trim();
    }

    public Short getDbpNbr() {
        return dbpNbr;
    }

    public void setDbpNbr(Short dbpNbr) {
        this.dbpNbr = dbpNbr;
    }

    public Short getBldOxy() {
        return bldOxy;
    }

    public void setBldOxy(Short bldOxy) {
        this.bldOxy = bldOxy;
    }

    public Short getMewssco() {
        return mewssco;
    }

    public void setMewssco(Short mewssco) {
        this.mewssco = mewssco;
    }

    public String getMewslvl() {
        return mewslvl;
    }

    public void setMewslvl(String mewslvl) {
        this.mewslvl = mewslvl == null ? null : mewslvl.trim();
    }

    public String getIsbind() {
        return isbind;
    }

    public void setIsbind(String isbind) {
        this.isbind = isbind == null ? null : isbind.trim();
    }

    public String getCrtuserid() {
        return crtuserid;
    }

    public void setCrtuserid(String crtuserid) {
        this.crtuserid = crtuserid == null ? null : crtuserid.trim();
    }

    public Date getCrttime() {
        return crttime;
    }

    public void setCrttime(Date crttime) {
        this.crttime = crttime;
    }

    public String getHavFmy() {
        return havFmy;
    }

    public void setHavFmy(String havFmy) {
        this.havFmy = havFmy == null ? null : havFmy.trim();
    }

    public String getCstOccCod() {
        return cstOccCod;
    }

    public void setCstOccCod(String cstOccCod) {
        this.cstOccCod = cstOccCod == null ? null : cstOccCod.trim();
    }

    public String getSceAr1Cod() {
        return sceAr1Cod;
    }

    public void setSceAr1Cod(String sceAr1Cod) {
        this.sceAr1Cod = sceAr1Cod == null ? null : sceAr1Cod.trim();
    }

    public String getSceAr2Cod() {
        return sceAr2Cod;
    }

    public void setSceAr2Cod(String sceAr2Cod) {
        this.sceAr2Cod = sceAr2Cod == null ? null : sceAr2Cod.trim();
    }

    public String getSceAdr() {
        return sceAdr;
    }

    public void setSceAdr(String sceAdr) {
        this.sceAdr = sceAdr == null ? null : sceAdr.trim();
    }

    public String getLnkMan() {
        return lnkMan;
    }

    public void setLnkMan(String lnkMan) {
        this.lnkMan = lnkMan == null ? null : lnkMan.trim();
    }

    public String getAlmSeq() {
        return almSeq;
    }

    public void setAlmSeq(String almSeq) {
        this.almSeq = almSeq == null ? null : almSeq.trim();
    }

    public String getDrrNo() {
        return drrNo;
    }

    public void setDrrNo(String drrNo) {
        this.drrNo = drrNo == null ? null : drrNo.trim();
    }

    public String getDrrNme() {
        return drrNme;
    }

    public void setDrrNme(String drrNme) {
        this.drrNme = drrNme == null ? null : drrNme.trim();
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo == null ? null : carNo.trim();
    }

    public String getDocNo() {
        return docNo;
    }

    public void setDocNo(String docNo) {
        this.docNo = docNo == null ? null : docNo.trim();
    }

    public String getDocNme() {
        return docNme;
    }

    public void setDocNme(String docNme) {
        this.docNme = docNme == null ? null : docNme.trim();
    }

    public String getNurNo() {
        return nurNo;
    }

    public void setNurNo(String nurNo) {
        this.nurNo = nurNo == null ? null : nurNo.trim();
    }

    public String getNurNme() {
        return nurNme;
    }

    public void setNurNme(String nurNme) {
        this.nurNme = nurNme == null ? null : nurNme.trim();
    }

    public Date getIllTim() {
        return illTim;
    }

    public void setIllTim(Date illTim) {
        this.illTim = illTim;
    }

    public String getIllperd() {
        return illperd;
    }

    public void setIllperd(String illperd) {
        this.illperd = illperd == null ? null : illperd.trim();
    }

    public Date getAlmtime() {
        return almtime;
    }

    public void setAlmtime(Date almtime) {
        this.almtime = almtime;
    }

    public Date getOuttime() {
        return outtime;
    }

    public void setOuttime(Date outtime) {
        this.outtime = outtime;
    }

    public Date getAastime() {
        return aastime;
    }

    public void setAastime(Date aastime) {
        this.aastime = aastime;
    }

    public Date getLestime() {
        return lestime;
    }

    public void setLestime(Date lestime) {
        this.lestime = lestime;
    }

    public Date getAahtime() {
        return aahtime;
    }

    public void setAahtime(Date aahtime) {
        this.aahtime = aahtime;
    }

    public BigDecimal getSceLng() {
        return sceLng;
    }

    public void setSceLng(BigDecimal sceLng) {
        this.sceLng = sceLng;
    }

    public BigDecimal getSceLat() {
        return sceLat;
    }

    public void setSceLat(BigDecimal sceLat) {
        this.sceLat = sceLat;
    }

    public BigDecimal getSceHgt() {
        return sceHgt;
    }

    public void setSceHgt(BigDecimal sceHgt) {
        this.sceHgt = sceHgt;
    }

    public String getScePrvCod() {
        return scePrvCod;
    }

    public void setScePrvCod(String scePrvCod) {
        this.scePrvCod = scePrvCod == null ? null : scePrvCod.trim();
    }

    public String getSceCtyCod() {
        return sceCtyCod;
    }

    public void setSceCtyCod(String sceCtyCod) {
        this.sceCtyCod = sceCtyCod == null ? null : sceCtyCod.trim();
    }

    public String getSceAr0Cod() {
        return sceAr0Cod;
    }

    public void setSceAr0Cod(String sceAr0Cod) {
        this.sceAr0Cod = sceAr0Cod == null ? null : sceAr0Cod.trim();
    }

    public String getIllTimFlg() {
        return illTimFlg;
    }

    public void setIllTimFlg(String illTimFlg) {
        this.illTimFlg = illTimFlg == null ? null : illTimFlg.trim();
    }
}