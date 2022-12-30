package activetech.edpc.pojo.dto;

import activetech.base.pojo.dto.PageQuery;
import activetech.hospital.pojo.dto.HspemginfCustom;

import java.util.Date;
import java.util.List;

public class HspZlInfQueryDto {
    private String emgSeq;
    private String vstCad;
    private String cstNam;
    private String cstSexCod;
    private String bthDat;
    private String cstAge;
    private String idNbr;
    private String pheNbr;
    private String zyhdj;
    private List<HspZlInfCustom> zlList;
    private PageQuery pageQuery;
    private Date startdate;
    private Date enddate;
    private String zd;
    private String zdys;
    private Date fbsj;
    private Date emgDat;

    private HspemginfCustom hspemginfCustom;
    private HspZlInfCustom hspZlInfCustom;
    private List<HspZlInfCustom> zlInfList;
    private String jbzdDes;
    private String arvChlCod;
    private List<HspZlInfCustom> czzlInfList;

    public String getEmgSeq() {
        return emgSeq;
    }
    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq;
    }
    public String getVstCad() {
        return vstCad;
    }
    public void setVstCad(String vstCad) {
        this.vstCad = vstCad;
    }
    public String getCstNam() {
        return cstNam;
    }
    public void setCstNam(String cstNam) {
        this.cstNam = cstNam;
    }
    public String getCstSexCod() {
        return cstSexCod;
    }
    public void setCstSexCod(String cstSexCod) {
        this.cstSexCod = cstSexCod;
    }
    public String getBthDat() {
        return bthDat;
    }
    public void setBthDat(String bthDat) {
        this.bthDat = bthDat;
    }
    public String getCstAge() {
        return cstAge;
    }
    public void setCstAge(String cstAge) {
        this.cstAge = cstAge;
    }
    public String getIdNbr() {
        return idNbr;
    }
    public void setIdNbr(String idNbr) {
        this.idNbr = idNbr;
    }
    public String getPheNbr() {
        return pheNbr;
    }
    public void setPheNbr(String pheNbr) {
        this.pheNbr = pheNbr;
    }
    public String getZyhdj() {
        return zyhdj;
    }
    public void setZyhdj(String zyhdj) {
        this.zyhdj = zyhdj;
    }

    public List<HspZlInfCustom> getZlList() {
        return zlList;
    }

    public void setZlList(List<HspZlInfCustom> zlList) {
        this.zlList = zlList;
    }

    public PageQuery getPageQuery() {
        return pageQuery;
    }

    public void setPageQuery(PageQuery pageQuery) {
        this.pageQuery = pageQuery;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public String getZd() {
        return zd;
    }

    public void setZd(String zd) {
        this.zd = zd;
    }

    public String getZdys() {
        return zdys;
    }

    public void setZdys(String zdys) {
        this.zdys = zdys;
    }

    public Date getFbsj() {
        return fbsj;
    }

    public void setFbsj(Date fbsj) {
        this.fbsj = fbsj;
    }

    public Date getEmgDat() {
        return emgDat;
    }

    public void setEmgDat(Date emgDat) {
        this.emgDat = emgDat;
    }

    public HspemginfCustom getHspemginfCustom() {
        return hspemginfCustom;
    }

    public void setHspemginfCustom(HspemginfCustom hspemginfCustom) {
        this.hspemginfCustom = hspemginfCustom;
    }

    public HspZlInfCustom getHspZlInfCustom() {
        return hspZlInfCustom;
    }

    public void setHspZlInfCustom(HspZlInfCustom hspZlInfCustom) {
        this.hspZlInfCustom = hspZlInfCustom;
    }

    public List<HspZlInfCustom> getZlInfList() {
        return zlInfList;
    }

    public void setZlInfList(List<HspZlInfCustom> zlInfList) {
        this.zlInfList = zlInfList;
    }

    public String getJbzdDes() {
        return jbzdDes;
    }

    public void setJbzdDes(String jbzdDes) {
        this.jbzdDes = jbzdDes;
    }

    public String getArvChlCod() {
        return arvChlCod;
    }

    public void setArvChlCod(String arvChlCod) {
        this.arvChlCod = arvChlCod;
    }

    public List<HspZlInfCustom> getCzzlInfList() {
        return czzlInfList;
    }

    public void setCzzlInfList(List<HspZlInfCustom> czzlInfList) {
        this.czzlInfList = czzlInfList;
    }
}
