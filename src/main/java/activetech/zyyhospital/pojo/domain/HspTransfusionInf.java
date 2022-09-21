package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class HspTransfusionInf {
    /**
     * 输血记录ID
     */
    private String transfusionSeq;

    /**
     * 预检号
     */
    private String emgSeq;

    /**
     * 输注开始时间
     */
    private Date infusionStartDat;

    /**
     * 输注结束时间
     */
    private Date infusionEndDat;

    /**
     * 输血指征
     */
    private String indication;

    /**
     * 输血成分
     */
    private String composition;

    /**
     * 输血量
     */
    private String amount;

    /**
     * 输血前评估处理
     */
    private String assessment;

    /**
     * 输注过程
     */
    private String infusionProcess;

    /**
     * 体温
     */
    private String tmpNbr;

    /**
     * 体温扩充(1-耳温，2-不升，3-拒测)
     */
    private String tmpNbrFlg;

    /**
     * 脉搏
     */
    private String pulse;

    /**
     * 呼吸
     */
    private String breNbr;

    /**
     * 呼吸扩充(2-机械通气，3-拒测)
     */
    private String breNbrFlg;

    /**
     * 血压收缩压
     */
    private String sbpUpNbr;

    /**
     * 血压舒张压
     */
    private String sbpDownNbr;

    /**
     * 血压扩充(2-测不出，3-拒测)
     */
    private String sbpNbrFlg;

    /**
     * 血氧含量(ml/L)
     */
    private String oxyNbr;

    /**
     * 血氧扩充(2-测不出，3-拒测)
     */
    private String xyFlg;

    /**
     * 末梢血糖
     */
    private String pbgNbr;

    /**
     * 末梢血糖扩充LO/HI
     */
    private String pbgNbrFlg;

    /**
     * 末梢血糖类型dstdicttype(XT_COD)
     */
    private String pbgNbrType;

    /**
     * 心率
     */
    private String hrtRte;

    /**
     * 输血反应（0：无，1：有）
     */
    private String reaction;

    /**
     * 输血反应内容
     */
    private String reactionContent;

    /**
     * 疗效评价计划
     */
    private String evaluationPlan;

    /**
     * 医师编号
     */
    private String docCod;

    /**
     * 医师签名
     */
    private String docNam;

    /**
     * 日期
     */
    private Date transfusionDat;

    /**
     * 打印状态
     */
    private String isprint;

    /**
     * 创建时间
     */
    private Date crtDat;

    /**
     * 创建人编号
     */
    private String crtCod;

    /**
     * 创建人姓名
     */
    private String crtNam;

    /**
     * 修改时间
     */
    private Date updDat;

    /**
     * 修改人编号
     */
    private String updCod;

    /**
     * 修改人姓名
     */
    private String updNam;

    public String getTransfusionSeq() {
        return transfusionSeq;
    }

    public void setTransfusionSeq(String transfusionSeq) {
        this.transfusionSeq = transfusionSeq == null ? null : transfusionSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public Date getInfusionStartDat() {
        return infusionStartDat;
    }

    public void setInfusionStartDat(Date infusionStartDat) {
        this.infusionStartDat = infusionStartDat;
    }

    public Date getInfusionEndDat() {
        return infusionEndDat;
    }

    public void setInfusionEndDat(Date infusionEndDat) {
        this.infusionEndDat = infusionEndDat;
    }

    public String getIndication() {
        return indication;
    }

    public void setIndication(String indication) {
        this.indication = indication == null ? null : indication.trim();
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition == null ? null : composition.trim();
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    public String getAssessment() {
        return assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment == null ? null : assessment.trim();
    }

    public String getInfusionProcess() {
        return infusionProcess;
    }

    public void setInfusionProcess(String infusionProcess) {
        this.infusionProcess = infusionProcess == null ? null : infusionProcess.trim();
    }

    public String getTmpNbr() {
        return tmpNbr;
    }

    public void setTmpNbr(String tmpNbr) {
        this.tmpNbr = tmpNbr == null ? null : tmpNbr.trim();
    }

    public String getTmpNbrFlg() {
        return tmpNbrFlg;
    }

    public void setTmpNbrFlg(String tmpNbrFlg) {
        this.tmpNbrFlg = tmpNbrFlg == null ? null : tmpNbrFlg.trim();
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse == null ? null : pulse.trim();
    }

    public String getBreNbr() {
        return breNbr;
    }

    public void setBreNbr(String breNbr) {
        this.breNbr = breNbr == null ? null : breNbr.trim();
    }

    public String getBreNbrFlg() {
        return breNbrFlg;
    }

    public void setBreNbrFlg(String breNbrFlg) {
        this.breNbrFlg = breNbrFlg == null ? null : breNbrFlg.trim();
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

    public String getSbpNbrFlg() {
        return sbpNbrFlg;
    }

    public void setSbpNbrFlg(String sbpNbrFlg) {
        this.sbpNbrFlg = sbpNbrFlg == null ? null : sbpNbrFlg.trim();
    }

    public String getOxyNbr() {
        return oxyNbr;
    }

    public void setOxyNbr(String oxyNbr) {
        this.oxyNbr = oxyNbr == null ? null : oxyNbr.trim();
    }

    public String getXyFlg() {
        return xyFlg;
    }

    public void setXyFlg(String xyFlg) {
        this.xyFlg = xyFlg == null ? null : xyFlg.trim();
    }

    public String getPbgNbr() {
        return pbgNbr;
    }

    public void setPbgNbr(String pbgNbr) {
        this.pbgNbr = pbgNbr == null ? null : pbgNbr.trim();
    }

    public String getPbgNbrFlg() {
        return pbgNbrFlg;
    }

    public void setPbgNbrFlg(String pbgNbrFlg) {
        this.pbgNbrFlg = pbgNbrFlg == null ? null : pbgNbrFlg.trim();
    }

    public String getPbgNbrType() {
        return pbgNbrType;
    }

    public void setPbgNbrType(String pbgNbrType) {
        this.pbgNbrType = pbgNbrType == null ? null : pbgNbrType.trim();
    }

    public String getHrtRte() {
        return hrtRte;
    }

    public void setHrtRte(String hrtRte) {
        this.hrtRte = hrtRte == null ? null : hrtRte.trim();
    }

    public String getReaction() {
        return reaction;
    }

    public void setReaction(String reaction) {
        this.reaction = reaction == null ? null : reaction.trim();
    }

    public String getReactionContent() {
        return reactionContent;
    }

    public void setReactionContent(String reactionContent) {
        this.reactionContent = reactionContent == null ? null : reactionContent.trim();
    }

    public String getEvaluationPlan() {
        return evaluationPlan;
    }

    public void setEvaluationPlan(String evaluationPlan) {
        this.evaluationPlan = evaluationPlan == null ? null : evaluationPlan.trim();
    }

    public String getDocCod() {
        return docCod;
    }

    public void setDocCod(String docCod) {
        this.docCod = docCod == null ? null : docCod.trim();
    }

    public String getDocNam() {
        return docNam;
    }

    public void setDocNam(String docNam) {
        this.docNam = docNam == null ? null : docNam.trim();
    }

    public Date getTransfusionDat() {
        return transfusionDat;
    }

    public void setTransfusionDat(Date transfusionDat) {
        this.transfusionDat = transfusionDat;
    }

    public String getIsprint() {
        return isprint;
    }

    public void setIsprint(String isprint) {
        this.isprint = isprint == null ? null : isprint.trim();
    }

    public Date getCrtDat() {
        return crtDat;
    }

    public void setCrtDat(Date crtDat) {
        this.crtDat = crtDat;
    }

    public String getCrtCod() {
        return crtCod;
    }

    public void setCrtCod(String crtCod) {
        this.crtCod = crtCod == null ? null : crtCod.trim();
    }

    public String getCrtNam() {
        return crtNam;
    }

    public void setCrtNam(String crtNam) {
        this.crtNam = crtNam == null ? null : crtNam.trim();
    }

    public Date getUpdDat() {
        return updDat;
    }

    public void setUpdDat(Date updDat) {
        this.updDat = updDat;
    }

    public String getUpdCod() {
        return updCod;
    }

    public void setUpdCod(String updCod) {
        this.updCod = updCod == null ? null : updCod.trim();
    }

    public String getUpdNam() {
        return updNam;
    }

    public void setUpdNam(String updNam) {
        this.updNam = updNam == null ? null : updNam.trim();
    }
}