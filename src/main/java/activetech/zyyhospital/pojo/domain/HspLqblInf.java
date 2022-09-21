package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class HspLqblInf {
    /**
     * 病历ID                   |
     */
    private String lqblSeq;

    /**
     * 预检号                       |
     */
    private String emgSeq;

    /**
     * 有无既往史(原有无疾病史)|(0:无 1:有)
     */
    private String medHisCod;

    /**
     * 既往史(原疾病史)
     */
    private String medHis;

    /**
     * 有无用药史|(0:无 1:有)页面已隐藏
     */
    private String drugHisCod;

    /**
     * 用药史|页面已隐藏
     */
    private String drugHis;

    /**
     * 有无手术史|(0:无 1:有)页面已隐藏
     */
    private String oprtHisCod;

    /**
     * 手术史|页面已隐藏
     */
    private String oprtHis;

    /**
     * 有无外伤史|(0:无 1:有)页面已隐藏
     */
    private String tramHisCod;

    /**
     * 外伤史|页面已隐藏
     */
    private String tramHis;

    /**
     * 有无疫区、禽类、传染病接触史 |(0:无 1:有)页面已隐藏
     */
    private String crbHisCod;

    /**
     * 疫区、禽类、传染病接触史|页面已隐藏
     */
    private String crbHis;

    /**
     * 个人史|(原婚育史)
     */
    private String obstHis;

    /**
     * 末次月经                     |
     */
    private Date mcyjDat;

    /**
     * 家族史                       |
     */
    private String famlHis;

    /**
     * 是否妊娠状态                 |(0:否 1:是)
     */
    private String rsztCod;

    /**
     * 血压扩充                     |(1:正常 2:测不出)
     */
    private String tgjcXyFlg;

    /**
     * 血压上                       |
     */
    private String tgjcXyUp;

    /**
     * 血压下                       |
     */
    private String tgjcXyDown;

    /**
     * 体温扩充                     |(1:耳温 2:测不出)
     */
    private String tgjcTwFlg;

    /**
     * 体温                         |
     */
    private String tgjcTw;

    /**
     * 心率扩充
     */
    private String tgjcMbFlg;

    /**
     * 心率                         |
     */
    private String tgjcMb;

    /**
     * 呼吸扩充                     |(1:正常 2:呼吸机)
     */
    private String tgjcHxFlg;

    /**
     * 呼吸                         |
     */
    private String tgjcHx;

    /**
     * 床边指氧饱和度扩充           |
     */
    private String tgjcCbzyFlg;

    /**
     * 床边指氧饱和度               |
     */
    private String tgjcCbzy;

    /**
     * 查体内容                     |
     */
    private String ctnrDes;

    /**
     * 辅助检查                     |
     */
    private String fzjcDes;

    /**
     * 记录日期                     |
     */
    private Date oprtDat;

    /**
     * 创建时间                     |
     */
    private Date cratDat;

    /**
     * 医生用户号                   |
     */
    private String cratNbr;

    /**
     * 医生用户名                   |
     */
    private String cratNam;

    /**
     * 修改时间                     |
     */
    private Date updtDat;

    /**
     * 修改人用户号                 |
     */
    private String updtNbr;

    /**
     * 修改人用户名                 |
     */
    private String updtNam;

    /**
     * 修改时间2                    |
     */
    private Date updtDat2;

    /**
     * 修改人用户号2                |
     */
    private String updtNbr2;

    /**
     * 修改人用户名2                |
     */
    private String updtNam2;

    /**
     * 修改时间3                    |
     */
    private Date updtDat3;

    /**
     * 修改人用户号3                |
     */
    private String updtNbr3;

    /**
     * 修改人用户名3                |
     */
    private String updtNam3;

    /**
     * 入院日期                     |
     */
    private Date lqblDat;

    /**
     * 有无过敏史| (0:无 1:有)页面已隐藏
     */
    private String gmsFlg;

    /**
     * 过敏史内容|页面已隐藏
     */
    private String gmsDes;

    /**
     * 留抢病历主述                 |
     */
    private String lqblDes;

    /**
     * 病人去向                     | (0：留抢 1：住院 2：出院)
     */
    private String lqblBrqx;

    /**
     * 绝经年龄                     |
     */
    private String menopsAge;

    /**
     * 女性月经史                   | dstdicttype(MNS_SIT_COD)
     */
    private String mnsSitCod;

    /**
     * 妊娠周期                     |
     */
    private String caseHis;

    /**
     * 血糖扩充                     | (1:正常 2:LO/HI)
     */
    private String tgjcXtFlg;

    /**
     * 血糖                         |
     */
    private String tgjcXt;

    /**
     * 脉搏                         |
     */
    private String tgjcPulse;

    /**
     * 病历类型                     |（0：留抢病历，1：门诊病历）
     */
    private String bltype;

    /**
     * 治疗意见                     |
     */
    private String zlyj;

    /**
     * 注意事项                     |
     */
    private String zysx;

    /**
     * 血糖类型dstdicttype(XT_COD)
     */
    private String tgjcXtType;

    /**
     * 疼痛评分
     */
    private String nrsSeq;

    /**
     * 跌倒评估评分
     */
    private String fallSeq;

    /**
     * 健康宣教
     */
    private String healthEducation;

    /**
     * 脉搏扩充
     */
    private String tgjcPulseFlg;

    /**
     * 专项评估(0:无特殊，1：建议)
     */
    private String specialAssess;

    /**
     * 专项评估建议
     */
    private String specialSuggest;

    /**
     * 联系地址
     */
    private String cstAdr;

    /**
     * 现病史
     */
    private String nowHis;

    /**
     * 诊疗计划
     */
    private String treatmentPlan;

    /**
     * 留抢信息大字段               |
     */
    private String lqblCont;

    public String getLqblSeq() {
        return lqblSeq;
    }

    public void setLqblSeq(String lqblSeq) {
        this.lqblSeq = lqblSeq == null ? null : lqblSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getMedHisCod() {
        return medHisCod;
    }

    public void setMedHisCod(String medHisCod) {
        this.medHisCod = medHisCod == null ? null : medHisCod.trim();
    }

    public String getMedHis() {
        return medHis;
    }

    public void setMedHis(String medHis) {
        this.medHis = medHis == null ? null : medHis.trim();
    }

    public String getDrugHisCod() {
        return drugHisCod;
    }

    public void setDrugHisCod(String drugHisCod) {
        this.drugHisCod = drugHisCod == null ? null : drugHisCod.trim();
    }

    public String getDrugHis() {
        return drugHis;
    }

    public void setDrugHis(String drugHis) {
        this.drugHis = drugHis == null ? null : drugHis.trim();
    }

    public String getOprtHisCod() {
        return oprtHisCod;
    }

    public void setOprtHisCod(String oprtHisCod) {
        this.oprtHisCod = oprtHisCod == null ? null : oprtHisCod.trim();
    }

    public String getOprtHis() {
        return oprtHis;
    }

    public void setOprtHis(String oprtHis) {
        this.oprtHis = oprtHis == null ? null : oprtHis.trim();
    }

    public String getTramHisCod() {
        return tramHisCod;
    }

    public void setTramHisCod(String tramHisCod) {
        this.tramHisCod = tramHisCod == null ? null : tramHisCod.trim();
    }

    public String getTramHis() {
        return tramHis;
    }

    public void setTramHis(String tramHis) {
        this.tramHis = tramHis == null ? null : tramHis.trim();
    }

    public String getCrbHisCod() {
        return crbHisCod;
    }

    public void setCrbHisCod(String crbHisCod) {
        this.crbHisCod = crbHisCod == null ? null : crbHisCod.trim();
    }

    public String getCrbHis() {
        return crbHis;
    }

    public void setCrbHis(String crbHis) {
        this.crbHis = crbHis == null ? null : crbHis.trim();
    }

    public String getObstHis() {
        return obstHis;
    }

    public void setObstHis(String obstHis) {
        this.obstHis = obstHis == null ? null : obstHis.trim();
    }

    public Date getMcyjDat() {
        return mcyjDat;
    }

    public void setMcyjDat(Date mcyjDat) {
        this.mcyjDat = mcyjDat;
    }

    public String getFamlHis() {
        return famlHis;
    }

    public void setFamlHis(String famlHis) {
        this.famlHis = famlHis == null ? null : famlHis.trim();
    }

    public String getRsztCod() {
        return rsztCod;
    }

    public void setRsztCod(String rsztCod) {
        this.rsztCod = rsztCod == null ? null : rsztCod.trim();
    }

    public String getTgjcXyFlg() {
        return tgjcXyFlg;
    }

    public void setTgjcXyFlg(String tgjcXyFlg) {
        this.tgjcXyFlg = tgjcXyFlg == null ? null : tgjcXyFlg.trim();
    }

    public String getTgjcXyUp() {
        return tgjcXyUp;
    }

    public void setTgjcXyUp(String tgjcXyUp) {
        this.tgjcXyUp = tgjcXyUp == null ? null : tgjcXyUp.trim();
    }

    public String getTgjcXyDown() {
        return tgjcXyDown;
    }

    public void setTgjcXyDown(String tgjcXyDown) {
        this.tgjcXyDown = tgjcXyDown == null ? null : tgjcXyDown.trim();
    }

    public String getTgjcTwFlg() {
        return tgjcTwFlg;
    }

    public void setTgjcTwFlg(String tgjcTwFlg) {
        this.tgjcTwFlg = tgjcTwFlg == null ? null : tgjcTwFlg.trim();
    }

    public String getTgjcTw() {
        return tgjcTw;
    }

    public void setTgjcTw(String tgjcTw) {
        this.tgjcTw = tgjcTw == null ? null : tgjcTw.trim();
    }

    public String getTgjcMbFlg() {
        return tgjcMbFlg;
    }

    public void setTgjcMbFlg(String tgjcMbFlg) {
        this.tgjcMbFlg = tgjcMbFlg == null ? null : tgjcMbFlg.trim();
    }

    public String getTgjcMb() {
        return tgjcMb;
    }

    public void setTgjcMb(String tgjcMb) {
        this.tgjcMb = tgjcMb == null ? null : tgjcMb.trim();
    }

    public String getTgjcHxFlg() {
        return tgjcHxFlg;
    }

    public void setTgjcHxFlg(String tgjcHxFlg) {
        this.tgjcHxFlg = tgjcHxFlg == null ? null : tgjcHxFlg.trim();
    }

    public String getTgjcHx() {
        return tgjcHx;
    }

    public void setTgjcHx(String tgjcHx) {
        this.tgjcHx = tgjcHx == null ? null : tgjcHx.trim();
    }

    public String getTgjcCbzyFlg() {
        return tgjcCbzyFlg;
    }

    public void setTgjcCbzyFlg(String tgjcCbzyFlg) {
        this.tgjcCbzyFlg = tgjcCbzyFlg == null ? null : tgjcCbzyFlg.trim();
    }

    public String getTgjcCbzy() {
        return tgjcCbzy;
    }

    public void setTgjcCbzy(String tgjcCbzy) {
        this.tgjcCbzy = tgjcCbzy == null ? null : tgjcCbzy.trim();
    }

    public String getCtnrDes() {
        return ctnrDes;
    }

    public void setCtnrDes(String ctnrDes) {
        this.ctnrDes = ctnrDes == null ? null : ctnrDes.trim();
    }

    public String getFzjcDes() {
        return fzjcDes;
    }

    public void setFzjcDes(String fzjcDes) {
        this.fzjcDes = fzjcDes == null ? null : fzjcDes.trim();
    }

    public Date getOprtDat() {
        return oprtDat;
    }

    public void setOprtDat(Date oprtDat) {
        this.oprtDat = oprtDat;
    }

    public Date getCratDat() {
        return cratDat;
    }

    public void setCratDat(Date cratDat) {
        this.cratDat = cratDat;
    }

    public String getCratNbr() {
        return cratNbr;
    }

    public void setCratNbr(String cratNbr) {
        this.cratNbr = cratNbr == null ? null : cratNbr.trim();
    }

    public String getCratNam() {
        return cratNam;
    }

    public void setCratNam(String cratNam) {
        this.cratNam = cratNam == null ? null : cratNam.trim();
    }

    public Date getUpdtDat() {
        return updtDat;
    }

    public void setUpdtDat(Date updtDat) {
        this.updtDat = updtDat;
    }

    public String getUpdtNbr() {
        return updtNbr;
    }

    public void setUpdtNbr(String updtNbr) {
        this.updtNbr = updtNbr == null ? null : updtNbr.trim();
    }

    public String getUpdtNam() {
        return updtNam;
    }

    public void setUpdtNam(String updtNam) {
        this.updtNam = updtNam == null ? null : updtNam.trim();
    }

    public Date getUpdtDat2() {
        return updtDat2;
    }

    public void setUpdtDat2(Date updtDat2) {
        this.updtDat2 = updtDat2;
    }

    public String getUpdtNbr2() {
        return updtNbr2;
    }

    public void setUpdtNbr2(String updtNbr2) {
        this.updtNbr2 = updtNbr2 == null ? null : updtNbr2.trim();
    }

    public String getUpdtNam2() {
        return updtNam2;
    }

    public void setUpdtNam2(String updtNam2) {
        this.updtNam2 = updtNam2 == null ? null : updtNam2.trim();
    }

    public Date getUpdtDat3() {
        return updtDat3;
    }

    public void setUpdtDat3(Date updtDat3) {
        this.updtDat3 = updtDat3;
    }

    public String getUpdtNbr3() {
        return updtNbr3;
    }

    public void setUpdtNbr3(String updtNbr3) {
        this.updtNbr3 = updtNbr3 == null ? null : updtNbr3.trim();
    }

    public String getUpdtNam3() {
        return updtNam3;
    }

    public void setUpdtNam3(String updtNam3) {
        this.updtNam3 = updtNam3 == null ? null : updtNam3.trim();
    }

    public Date getLqblDat() {
        return lqblDat;
    }

    public void setLqblDat(Date lqblDat) {
        this.lqblDat = lqblDat;
    }

    public String getGmsFlg() {
        return gmsFlg;
    }

    public void setGmsFlg(String gmsFlg) {
        this.gmsFlg = gmsFlg == null ? null : gmsFlg.trim();
    }

    public String getGmsDes() {
        return gmsDes;
    }

    public void setGmsDes(String gmsDes) {
        this.gmsDes = gmsDes == null ? null : gmsDes.trim();
    }

    public String getLqblDes() {
        return lqblDes;
    }

    public void setLqblDes(String lqblDes) {
        this.lqblDes = lqblDes == null ? null : lqblDes.trim();
    }

    public String getLqblBrqx() {
        return lqblBrqx;
    }

    public void setLqblBrqx(String lqblBrqx) {
        this.lqblBrqx = lqblBrqx == null ? null : lqblBrqx.trim();
    }

    public String getMenopsAge() {
        return menopsAge;
    }

    public void setMenopsAge(String menopsAge) {
        this.menopsAge = menopsAge == null ? null : menopsAge.trim();
    }

    public String getMnsSitCod() {
        return mnsSitCod;
    }

    public void setMnsSitCod(String mnsSitCod) {
        this.mnsSitCod = mnsSitCod == null ? null : mnsSitCod.trim();
    }

    public String getCaseHis() {
        return caseHis;
    }

    public void setCaseHis(String caseHis) {
        this.caseHis = caseHis == null ? null : caseHis.trim();
    }

    public String getTgjcXtFlg() {
        return tgjcXtFlg;
    }

    public void setTgjcXtFlg(String tgjcXtFlg) {
        this.tgjcXtFlg = tgjcXtFlg == null ? null : tgjcXtFlg.trim();
    }

    public String getTgjcXt() {
        return tgjcXt;
    }

    public void setTgjcXt(String tgjcXt) {
        this.tgjcXt = tgjcXt == null ? null : tgjcXt.trim();
    }

    public String getTgjcPulse() {
        return tgjcPulse;
    }

    public void setTgjcPulse(String tgjcPulse) {
        this.tgjcPulse = tgjcPulse == null ? null : tgjcPulse.trim();
    }

    public String getBltype() {
        return bltype;
    }

    public void setBltype(String bltype) {
        this.bltype = bltype == null ? null : bltype.trim();
    }

    public String getZlyj() {
        return zlyj;
    }

    public void setZlyj(String zlyj) {
        this.zlyj = zlyj == null ? null : zlyj.trim();
    }

    public String getZysx() {
        return zysx;
    }

    public void setZysx(String zysx) {
        this.zysx = zysx == null ? null : zysx.trim();
    }

    public String getTgjcXtType() {
        return tgjcXtType;
    }

    public void setTgjcXtType(String tgjcXtType) {
        this.tgjcXtType = tgjcXtType == null ? null : tgjcXtType.trim();
    }

    public String getNrsSeq() {
        return nrsSeq;
    }

    public void setNrsSeq(String nrsSeq) {
        this.nrsSeq = nrsSeq == null ? null : nrsSeq.trim();
    }

    public String getFallSeq() {
        return fallSeq;
    }

    public void setFallSeq(String fallSeq) {
        this.fallSeq = fallSeq == null ? null : fallSeq.trim();
    }

    public String getHealthEducation() {
        return healthEducation;
    }

    public void setHealthEducation(String healthEducation) {
        this.healthEducation = healthEducation == null ? null : healthEducation.trim();
    }

    public String getTgjcPulseFlg() {
        return tgjcPulseFlg;
    }

    public void setTgjcPulseFlg(String tgjcPulseFlg) {
        this.tgjcPulseFlg = tgjcPulseFlg == null ? null : tgjcPulseFlg.trim();
    }

    public String getSpecialAssess() {
        return specialAssess;
    }

    public void setSpecialAssess(String specialAssess) {
        this.specialAssess = specialAssess == null ? null : specialAssess.trim();
    }

    public String getSpecialSuggest() {
        return specialSuggest;
    }

    public void setSpecialSuggest(String specialSuggest) {
        this.specialSuggest = specialSuggest == null ? null : specialSuggest.trim();
    }

    public String getCstAdr() {
        return cstAdr;
    }

    public void setCstAdr(String cstAdr) {
        this.cstAdr = cstAdr == null ? null : cstAdr.trim();
    }

    public String getNowHis() {
        return nowHis;
    }

    public void setNowHis(String nowHis) {
        this.nowHis = nowHis == null ? null : nowHis.trim();
    }

    public String getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(String treatmentPlan) {
        this.treatmentPlan = treatmentPlan == null ? null : treatmentPlan.trim();
    }

    public String getLqblCont() {
        return lqblCont;
    }

    public void setLqblCont(String lqblCont) {
        this.lqblCont = lqblCont == null ? null : lqblCont.trim();
    }
}