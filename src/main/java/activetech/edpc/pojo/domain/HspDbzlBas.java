package activetech.edpc.pojo.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
    * 多病种诊疗基础信息表
    */
public class HspDbzlBas {
    /**
    * 序列号       |自动产生                            
    */
    private String regSeq;

    /**
    * 登记时间     |急诊时填入EMG_DAT                   
    */
    private Date regTim;

    /**
    * 预检号       |(YYYYMMDD+4位序号)                  
    */
    private String emgSeq;

    /**
    * 院内唯一编号;|患者ID                              
    */
    private String mpi;

    /**
    * 患者类型;    |1:胸痛 2:卒中 3:创伤                
    */
    private String patTyp;

    /**
    * 患者来源;    |0:急诊 1:绕行 2:住院                
    */
    private String wayTyp;

    /**
    * 卡类别;      |dstdicttype(CARD_TYPE_COD)          
    */
    private String cardType;

    /**
    * 就诊卡号     |                                    
    */
    private String vstCad;

    /**
    * 病人姓名     |                                    
    */
    private String cstNam;

    /**
    * 病人性别     |dstdicttype(CST_SEX_COD)            
    */
    private String cstSexCod;

    /**
    * 证件类型     |                                    
    */
    private String idType;

    /**
    * 证件号码     |                                    
    */
    private String idNbr;

    /**
    * 年龄类型     |dstdicttype(CST_AGE_COD)            
    */
    private String cstAgeCod;

    /**
    * 病人年龄     |                                    
    */
    private String cstAge;

    /**
    * 病人体重     |（千克）                            
    */
    private BigDecimal patWgt;

    /**
    * 病人身高     |（CM）                              
    */
    private BigDecimal patHgt;

    /**
    * 出生日期     |(YYYY/MM/DD)                        
    */
    private Date bthDat;

    /**
    * 患者电话     |                                    
    */
    private String pheNbr;

    /**
    * 病人地址     |                                    
    */
    private String cstAdr;

    /**
    * 民族         |                                    
    */
    private String nation;

    /**
    * 职业         |                                    
    */
    private String emgJob;

    /**
    * 婚姻状况     |dstdicttype(MARITAL_STATUS)         
    */
    private String maritalStatus;

    /**
    * 文化程度     |                                    
    */
    private String cstEdu;

    /**
    * 联系人       |                                    
    */
    private String lnkMan;

    /**
    * 联系方式     |                                    
    */
    private String lnkWay;

    /**
    * 绿色通道     |(0=否,1=是)                         
    */
    private String grnChl;

    /**
    * 三无患者     |(0=否,1=是)                         
    */
    private String swChl;

    /**
    * 医院院区     |                                    
    */
    private String hspAra;

    /**
    * 院前ID       |aid_patient(PATID)                  
    */
    private String yqxh;

    /**
    * 就诊ID       |                                    
    */
    private Long jzxh;

    /**
    * 住院ID       |                                    
    */
    private Long zyxh;

    /**
    * 医生就诊时间 |                                    
    */
    private Date docDat;

    /**
    * 医生号       |                                    
    */
    private String jzys;

    /**
    * 医生姓名     |                                    
    */
    private String ysxm;

    /**
    * 就诊科室     |                                    
    */
    private String ksdm;

    /**
    * 创建时间     |                                    
    */
    private Date crtTim;

    /**
    * 创建人员号   |                                    
    */
    private String crtNo;

    /**
    * 创建人员名   |                                    
    */
    private String crtNam;

    /**
    * 修改时间     |                                    
    */
    private Date modTim;

    /**
    * 修改人员号   |                                    
    */
    private String modNo;

    /**
    * 修改人员名   |                                    
    */
    private String modNam;

    /**
    * 记录状态     |1:记录中,2:审核中,3:已退回,4:已审核
    */
    private String rcdSta;

    /**
    * 审核时间     |                                    
    */
    private Date chkTim;

    /**
    * 审核人员号   |                                    
    */
    private String chkNo;

    /**
    * 审核人员名   |                                    
    */
    private String chkNam;

    /**
    * 审核意见     |                                    
    */
    private String chkMsg;

    /**
    * 终止标志     |0:正常,1:终止                       
    */
    private String stpFlg;

    /**
    * 终止时间     |                                    
    */
    private Date stpTim;

    /**
    * 终止人员号   |                                    
    */
    private String stpNo;

    /**
    * 终止人员名   |                                    
    */
    private String stpNam;

    /**
    * 上报状态     |1:未上报,2:上报中,3:上报失败,4:上报驳回,5:上报完成
    */
    private String smtSta;

    /**
    * 上报返回序号 |是由上报平台返回                    
    */
    private String smtSeq;

    /**
    * 上报错误信息 |                                    
    */
    private String smtMsg;

    public String getRegSeq() {
        return regSeq;
    }

    public void setRegSeq(String regSeq) {
        this.regSeq = regSeq;
    }

    public Date getRegTim() {
        return regTim;
    }

    public void setRegTim(Date regTim) {
        this.regTim = regTim;
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq;
    }

    public String getMpi() {
        return mpi;
    }

    public void setMpi(String mpi) {
        this.mpi = mpi;
    }

    public String getPatTyp() {
        return patTyp;
    }

    public void setPatTyp(String patTyp) {
        this.patTyp = patTyp;
    }

    public String getWayTyp() {
        return wayTyp;
    }

    public void setWayTyp(String wayTyp) {
        this.wayTyp = wayTyp;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
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

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdNbr() {
        return idNbr;
    }

    public void setIdNbr(String idNbr) {
        this.idNbr = idNbr;
    }

    public String getCstAgeCod() {
        return cstAgeCod;
    }

    public void setCstAgeCod(String cstAgeCod) {
        this.cstAgeCod = cstAgeCod;
    }

    public String getCstAge() {
        return cstAge;
    }

    public void setCstAge(String cstAge) {
        this.cstAge = cstAge;
    }

    public BigDecimal getPatWgt() {
        return patWgt;
    }

    public void setPatWgt(BigDecimal patWgt) {
        this.patWgt = patWgt;
    }

    public BigDecimal getPatHgt() {
        return patHgt;
    }

    public void setPatHgt(BigDecimal patHgt) {
        this.patHgt = patHgt;
    }

    public Date getBthDat() {
        return bthDat;
    }

    public void setBthDat(Date bthDat) {
        this.bthDat = bthDat;
    }

    public String getPheNbr() {
        return pheNbr;
    }

    public void setPheNbr(String pheNbr) {
        this.pheNbr = pheNbr;
    }

    public String getCstAdr() {
        return cstAdr;
    }

    public void setCstAdr(String cstAdr) {
        this.cstAdr = cstAdr;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getEmgJob() {
        return emgJob;
    }

    public void setEmgJob(String emgJob) {
        this.emgJob = emgJob;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getCstEdu() {
        return cstEdu;
    }

    public void setCstEdu(String cstEdu) {
        this.cstEdu = cstEdu;
    }

    public String getLnkMan() {
        return lnkMan;
    }

    public void setLnkMan(String lnkMan) {
        this.lnkMan = lnkMan;
    }

    public String getLnkWay() {
        return lnkWay;
    }

    public void setLnkWay(String lnkWay) {
        this.lnkWay = lnkWay;
    }

    public String getGrnChl() {
        return grnChl;
    }

    public void setGrnChl(String grnChl) {
        this.grnChl = grnChl;
    }

    public String getSwChl() {
        return swChl;
    }

    public void setSwChl(String swChl) {
        this.swChl = swChl;
    }

    public String getHspAra() {
        return hspAra;
    }

    public void setHspAra(String hspAra) {
        this.hspAra = hspAra;
    }

    public String getYqxh() {
        return yqxh;
    }

    public void setYqxh(String yqxh) {
        this.yqxh = yqxh;
    }

    public Long getJzxh() {
        return jzxh;
    }

    public void setJzxh(Long jzxh) {
        this.jzxh = jzxh;
    }

    public Long getZyxh() {
        return zyxh;
    }

    public void setZyxh(Long zyxh) {
        this.zyxh = zyxh;
    }

    public Date getDocDat() {
        return docDat;
    }

    public void setDocDat(Date docDat) {
        this.docDat = docDat;
    }

    public String getJzys() {
        return jzys;
    }

    public void setJzys(String jzys) {
        this.jzys = jzys;
    }

    public String getYsxm() {
        return ysxm;
    }

    public void setYsxm(String ysxm) {
        this.ysxm = ysxm;
    }

    public String getKsdm() {
        return ksdm;
    }

    public void setKsdm(String ksdm) {
        this.ksdm = ksdm;
    }

    public Date getCrtTim() {
        return crtTim;
    }

    public void setCrtTim(Date crtTim) {
        this.crtTim = crtTim;
    }

    public String getCrtNo() {
        return crtNo;
    }

    public void setCrtNo(String crtNo) {
        this.crtNo = crtNo;
    }

    public String getCrtNam() {
        return crtNam;
    }

    public void setCrtNam(String crtNam) {
        this.crtNam = crtNam;
    }

    public Date getModTim() {
        return modTim;
    }

    public void setModTim(Date modTim) {
        this.modTim = modTim;
    }

    public String getModNo() {
        return modNo;
    }

    public void setModNo(String modNo) {
        this.modNo = modNo;
    }

    public String getModNam() {
        return modNam;
    }

    public void setModNam(String modNam) {
        this.modNam = modNam;
    }

    public String getRcdSta() {
        return rcdSta;
    }

    public void setRcdSta(String rcdSta) {
        this.rcdSta = rcdSta;
    }

    public Date getChkTim() {
        return chkTim;
    }

    public void setChkTim(Date chkTim) {
        this.chkTim = chkTim;
    }

    public String getChkNo() {
        return chkNo;
    }

    public void setChkNo(String chkNo) {
        this.chkNo = chkNo;
    }

    public String getChkNam() {
        return chkNam;
    }

    public void setChkNam(String chkNam) {
        this.chkNam = chkNam;
    }

    public String getChkMsg() {
        return chkMsg;
    }

    public void setChkMsg(String chkMsg) {
        this.chkMsg = chkMsg;
    }

    public String getStpFlg() {
        return stpFlg;
    }

    public void setStpFlg(String stpFlg) {
        this.stpFlg = stpFlg;
    }

    public Date getStpTim() {
        return stpTim;
    }

    public void setStpTim(Date stpTim) {
        this.stpTim = stpTim;
    }

    public String getStpNo() {
        return stpNo;
    }

    public void setStpNo(String stpNo) {
        this.stpNo = stpNo;
    }

    public String getStpNam() {
        return stpNam;
    }

    public void setStpNam(String stpNam) {
        this.stpNam = stpNam;
    }

    public String getSmtSta() {
        return smtSta;
    }

    public void setSmtSta(String smtSta) {
        this.smtSta = smtSta;
    }

    public String getSmtSeq() {
        return smtSeq;
    }

    public void setSmtSeq(String smtSeq) {
        this.smtSeq = smtSeq;
    }

    public String getSmtMsg() {
        return smtMsg;
    }

    public void setSmtMsg(String smtMsg) {
        this.smtMsg = smtMsg;
    }
}