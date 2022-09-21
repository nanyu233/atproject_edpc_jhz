package activetech.hospital.pojo.domain;

import java.util.Date;

public class HspJbzdInf {
    /**
     * 唯一主键 | UUID 
     */
    private String jbzdSeq;

    /**
     * 预检号   |hsp_emg_inf
     */
    private String emgSeq;

    /**
     * 诊断类型 |（0：初步印象、1：入院诊断西医、2：入院诊断中医、3：出观诊断中医、4：出观诊断西医、5：死亡诊断、 13：门诊初步诊断、14：门诊最终诊断
     */
    private String jbzdType;

    /**
     * 诊断编码
     */
    private String hzzdCod;

    /**
     * 备注
     */
    private String jbzdComm;

    /**
     * 登记日期
     */
    private Date hzzdDat;

    /**
     * 登记人员
     */
    private String hzzdNurNbr;

    /**
     * 修改日期
     */
    private Date hzzdUpdDat;

    /**
     * 修改人员
     */
    private String hzzdUpdNbr;

    /**
     * 疾病库标志（2：来源HSP_JBZD_LZ）
     */
    private String jbzdFlg;

    /**
     * 前缀
     */
    private String jbzdPrefix;

    /**
     * 后缀
     */
    private String jbzdSuffix;

    /**
     * 诊断数据类型   |（0为主要诊断、1为其它诊断）
     */
    private String jbzdStatus;

    /**
     * 疾病首字码
     */
    private String jbzdPysm;

    /**
     * 诊断排序
     */
    private String showOrder;

    /**
     * ICD10码
     */
    private String icd10;

    /**
     * 发病日期
     */
    private Date onsetDat;

    public String getJbzdSeq() {
        return jbzdSeq;
    }

    public void setJbzdSeq(String jbzdSeq) {
        this.jbzdSeq = jbzdSeq == null ? null : jbzdSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getJbzdType() {
        return jbzdType;
    }

    public void setJbzdType(String jbzdType) {
        this.jbzdType = jbzdType == null ? null : jbzdType.trim();
    }

    public String getHzzdCod() {
        return hzzdCod;
    }

    public void setHzzdCod(String hzzdCod) {
        this.hzzdCod = hzzdCod == null ? null : hzzdCod.trim();
    }

    public String getJbzdComm() {
        return jbzdComm;
    }

    public void setJbzdComm(String jbzdComm) {
        this.jbzdComm = jbzdComm == null ? null : jbzdComm.trim();
    }

    public Date getHzzdDat() {
        return hzzdDat;
    }

    public void setHzzdDat(Date hzzdDat) {
        this.hzzdDat = hzzdDat;
    }

    public String getHzzdNurNbr() {
        return hzzdNurNbr;
    }

    public void setHzzdNurNbr(String hzzdNurNbr) {
        this.hzzdNurNbr = hzzdNurNbr == null ? null : hzzdNurNbr.trim();
    }

    public Date getHzzdUpdDat() {
        return hzzdUpdDat;
    }

    public void setHzzdUpdDat(Date hzzdUpdDat) {
        this.hzzdUpdDat = hzzdUpdDat;
    }

    public String getHzzdUpdNbr() {
        return hzzdUpdNbr;
    }

    public void setHzzdUpdNbr(String hzzdUpdNbr) {
        this.hzzdUpdNbr = hzzdUpdNbr == null ? null : hzzdUpdNbr.trim();
    }

    public String getJbzdFlg() {
        return jbzdFlg;
    }

    public void setJbzdFlg(String jbzdFlg) {
        this.jbzdFlg = jbzdFlg == null ? null : jbzdFlg.trim();
    }

    public String getJbzdPrefix() {
        return jbzdPrefix;
    }

    public void setJbzdPrefix(String jbzdPrefix) {
        this.jbzdPrefix = jbzdPrefix == null ? null : jbzdPrefix.trim();
    }

    public String getJbzdSuffix() {
        return jbzdSuffix;
    }

    public void setJbzdSuffix(String jbzdSuffix) {
        this.jbzdSuffix = jbzdSuffix == null ? null : jbzdSuffix.trim();
    }

    public String getJbzdStatus() {
        return jbzdStatus;
    }

    public void setJbzdStatus(String jbzdStatus) {
        this.jbzdStatus = jbzdStatus == null ? null : jbzdStatus.trim();
    }

    public String getJbzdPysm() {
        return jbzdPysm;
    }

    public void setJbzdPysm(String jbzdPysm) {
        this.jbzdPysm = jbzdPysm == null ? null : jbzdPysm.trim();
    }

    public String getShowOrder() {
        return showOrder;
    }

    public void setShowOrder(String showOrder) {
        this.showOrder = showOrder == null ? null : showOrder.trim();
    }

    public String getIcd10() {
        return icd10;
    }

    public void setIcd10(String icd10) {
        this.icd10 = icd10 == null ? null : icd10.trim();
    }

    public Date getOnsetDat() {
        return onsetDat;
    }

    public void setOnsetDat(Date onsetDat) {
        this.onsetDat = onsetDat;
    }
}