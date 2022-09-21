package activetech.pda.pojo.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class HspCfxxExec {
    /**
     * 执行序号            |EXEC+HSP_CFXX_EXEC_EXEC_SEQ
     */
    private String execSeq;

    /**
     * 处置单编号 执行单此字段相同为同组数据
     */
    private String disposalSeq;

    /**
     * 处方唯一键            |
     */
    private String daSeq;

    /**
     * 处方编号            |
     */
    private String daNo;

    /**
     * 组别编号
     */
    private String daSub;

    /**
     * 就诊号
     */
    private String vstCad;

    /**
     * 执行记录来源        |1=PDA导入 2=手动补入
     */
    private String execSrc;

    /**
     * 计划执行时间        |
     */
    private Date planTime;

    /**
     * 执行开始时间        |
     */
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date execTime;

    /**
     * 执行开始用户        |
     */
    private String execUser;

    /**
     * 执行开始用户姓名
     */
    private String execUserxm;

    /**
     * 执行开始用户2
     */
    private String execUserSecond;

    /**
     * 执行开始用户2姓名
     */
    private String execUserxmSecond;

    /**
     * 执行结束时间        |
     */
    private Date finiTime;

    /**
     * 执行结束用户        |
     */
    private String finiUser;

    /**
     * 执行结束用户姓名
     */
    private String finiUserxm;

    /**
     * 处方类型| 默认放‘药品’，以后看接口实际情况
     */
    private String daType;

    /**
     * 处方内容            |
     */
    private String daInfo;

    /**
     * 剂量            |
     */
    private String daDose;

    /**
     * 单位            |
     */
    private String daUnit;

    /**
     * 给药方式      |  dstdicttype(GYFS)
     */
    private String daWay;

    /**
     * 给药方式COD
     */
    private String daWayCod;

    /**
     * 数量
     */
    private BigDecimal daNumb;

    /**
     * 药方单位
     */
    private String yfdw;

    /**
     * 频次            |
     */
    private String daFreq;

    /**
     * 执行剂量            |
     */
    private String execDose;

    /**
     * 执行单类型   |0=临时输液单  1=临时注射单  9=其他待定（是否要放数据字典）
     */
    private String zxdtype;

    /**
     * 执行单创建时间
     */
    private Date zxddat;

    /**
     * 执行单是否打印  |0=未打印 1=已打印 2=不打印
     */
    private String isprint;

    /**
     * 皮试结果 |0=阴性 1=阳性
     */
    private String psjg;

    /**
     * 皮试结果填写时间
     */
    private Date pstxrdat;

    /**
     * 皮试结果填写人号
     */
    private String pstxr;

    /**
     * 皮试结果填写人姓名
     */
    private String pstxrxm;

    /**
     * 皮试结果审核时间
     */
    private Date psshrdat;

    /**
     * 皮试结果审核人号
     */
    private String psshr;

    /**
     * 皮试结果审核人姓名
     */
    private String psshrxm;

    /**
     * 执行单状态 (EXEC_STATUS)
     */
    private String zxdzt;

    /**
     * 患者唯一标识号
     */
    private String mpi;

    /**
     * 创建时间            |
     */
    private Date crtTime;

    /**
     * 创建用户            |
     */
    private String crtUser;

    /**
     * 修改时间            |
     */
    private Date modTime;

    /**
     * 修改用户            |
     */
    private String modUser;

    /**
     * 配药时间
     */
    private Date dispenseDate;

    /**
     * 配药护士1
     */
    private String dispenseUser;

    /**
     * 配药护士1姓名
     */
    private String dispenseUserxm;

    /**
     * 配药护士2
     */
    private String dispenseUserSecond;

    /**
     * 配药护士2姓名
     */
    private String dispenseUserxmSecond;

    /**
     * 备注
     */
    private String remark;

    /**
     * 写入护理记录单 0-未写入，1-已写入
     */
    private String bookFlag;

    public String getExecSeq() {
        return execSeq;
    }

    public void setExecSeq(String execSeq) {
        this.execSeq = execSeq == null ? null : execSeq.trim();
    }

    public String getDisposalSeq() {
        return disposalSeq;
    }

    public void setDisposalSeq(String disposalSeq) {
        this.disposalSeq = disposalSeq == null ? null : disposalSeq.trim();
    }

    public String getDaSeq() {
        return daSeq;
    }

    public void setDaSeq(String daSeq) {
        this.daSeq = daSeq == null ? null : daSeq.trim();
    }

    public String getDaNo() {
        return daNo;
    }

    public void setDaNo(String daNo) {
        this.daNo = daNo == null ? null : daNo.trim();
    }

    public String getDaSub() {
        return daSub;
    }

    public void setDaSub(String daSub) {
        this.daSub = daSub == null ? null : daSub.trim();
    }

    public String getVstCad() {
        return vstCad;
    }

    public void setVstCad(String vstCad) {
        this.vstCad = vstCad == null ? null : vstCad.trim();
    }

    public String getExecSrc() {
        return execSrc;
    }

    public void setExecSrc(String execSrc) {
        this.execSrc = execSrc == null ? null : execSrc.trim();
    }

    public Date getPlanTime() {
        return planTime;
    }

    public void setPlanTime(Date planTime) {
        this.planTime = planTime;
    }

    public Date getExecTime() {
        return execTime;
    }

    public void setExecTime(Date execTime) {
        this.execTime = execTime;
    }

    public String getExecUser() {
        return execUser;
    }

    public void setExecUser(String execUser) {
        this.execUser = execUser == null ? null : execUser.trim();
    }

    public String getExecUserxm() {
        return execUserxm;
    }

    public void setExecUserxm(String execUserxm) {
        this.execUserxm = execUserxm == null ? null : execUserxm.trim();
    }

    public String getExecUserSecond() {
        return execUserSecond;
    }

    public void setExecUserSecond(String execUserSecond) {
        this.execUserSecond = execUserSecond == null ? null : execUserSecond.trim();
    }

    public String getExecUserxmSecond() {
        return execUserxmSecond;
    }

    public void setExecUserxmSecond(String execUserxmSecond) {
        this.execUserxmSecond = execUserxmSecond == null ? null : execUserxmSecond.trim();
    }

    public Date getFiniTime() {
        return finiTime;
    }

    public void setFiniTime(Date finiTime) {
        this.finiTime = finiTime;
    }

    public String getFiniUser() {
        return finiUser;
    }

    public void setFiniUser(String finiUser) {
        this.finiUser = finiUser == null ? null : finiUser.trim();
    }

    public String getFiniUserxm() {
        return finiUserxm;
    }

    public void setFiniUserxm(String finiUserxm) {
        this.finiUserxm = finiUserxm == null ? null : finiUserxm.trim();
    }

    public String getDaType() {
        return daType;
    }

    public void setDaType(String daType) {
        this.daType = daType == null ? null : daType.trim();
    }

    public String getDaInfo() {
        return daInfo;
    }

    public void setDaInfo(String daInfo) {
        this.daInfo = daInfo == null ? null : daInfo.trim();
    }

    public String getDaDose() {
        return daDose;
    }

    public void setDaDose(String daDose) {
        this.daDose = daDose == null ? null : daDose.trim();
    }

    public String getDaUnit() {
        return daUnit;
    }

    public void setDaUnit(String daUnit) {
        this.daUnit = daUnit == null ? null : daUnit.trim();
    }

    public String getDaWay() {
        return daWay;
    }

    public void setDaWay(String daWay) {
        this.daWay = daWay == null ? null : daWay.trim();
    }

    public String getDaWayCod() {
        return daWayCod;
    }

    public void setDaWayCod(String daWayCod) {
        this.daWayCod = daWayCod == null ? null : daWayCod.trim();
    }

    public BigDecimal getDaNumb() {
        return daNumb;
    }

    public void setDaNumb(BigDecimal daNumb) {
        this.daNumb = daNumb;
    }

    public String getYfdw() {
        return yfdw;
    }

    public void setYfdw(String yfdw) {
        this.yfdw = yfdw == null ? null : yfdw.trim();
    }

    public String getDaFreq() {
        return daFreq;
    }

    public void setDaFreq(String daFreq) {
        this.daFreq = daFreq == null ? null : daFreq.trim();
    }

    public String getExecDose() {
        return execDose;
    }

    public void setExecDose(String execDose) {
        this.execDose = execDose == null ? null : execDose.trim();
    }

    public String getZxdtype() {
        return zxdtype;
    }

    public void setZxdtype(String zxdtype) {
        this.zxdtype = zxdtype == null ? null : zxdtype.trim();
    }

    public Date getZxddat() {
        return zxddat;
    }

    public void setZxddat(Date zxddat) {
        this.zxddat = zxddat;
    }

    public String getIsprint() {
        return isprint;
    }

    public void setIsprint(String isprint) {
        this.isprint = isprint == null ? null : isprint.trim();
    }

    public String getPsjg() {
        return psjg;
    }

    public void setPsjg(String psjg) {
        this.psjg = psjg == null ? null : psjg.trim();
    }

    public Date getPstxrdat() {
        return pstxrdat;
    }

    public void setPstxrdat(Date pstxrdat) {
        this.pstxrdat = pstxrdat;
    }

    public String getPstxr() {
        return pstxr;
    }

    public void setPstxr(String pstxr) {
        this.pstxr = pstxr == null ? null : pstxr.trim();
    }

    public String getPstxrxm() {
        return pstxrxm;
    }

    public void setPstxrxm(String pstxrxm) {
        this.pstxrxm = pstxrxm == null ? null : pstxrxm.trim();
    }

    public Date getPsshrdat() {
        return psshrdat;
    }

    public void setPsshrdat(Date psshrdat) {
        this.psshrdat = psshrdat;
    }

    public String getPsshr() {
        return psshr;
    }

    public void setPsshr(String psshr) {
        this.psshr = psshr == null ? null : psshr.trim();
    }

    public String getPsshrxm() {
        return psshrxm;
    }

    public void setPsshrxm(String psshrxm) {
        this.psshrxm = psshrxm == null ? null : psshrxm.trim();
    }

    public String getZxdzt() {
        return zxdzt;
    }

    public void setZxdzt(String zxdzt) {
        this.zxdzt = zxdzt == null ? null : zxdzt.trim();
    }

    public String getMpi() {
        return mpi;
    }

    public void setMpi(String mpi) {
        this.mpi = mpi == null ? null : mpi.trim();
    }

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    public String getCrtUser() {
        return crtUser;
    }

    public void setCrtUser(String crtUser) {
        this.crtUser = crtUser == null ? null : crtUser.trim();
    }

    public Date getModTime() {
        return modTime;
    }

    public void setModTime(Date modTime) {
        this.modTime = modTime;
    }

    public String getModUser() {
        return modUser;
    }

    public void setModUser(String modUser) {
        this.modUser = modUser == null ? null : modUser.trim();
    }

    public Date getDispenseDate() {
        return dispenseDate;
    }

    public void setDispenseDate(Date dispenseDate) {
        this.dispenseDate = dispenseDate;
    }

    public String getDispenseUser() {
        return dispenseUser;
    }

    public void setDispenseUser(String dispenseUser) {
        this.dispenseUser = dispenseUser == null ? null : dispenseUser.trim();
    }

    public String getDispenseUserxm() {
        return dispenseUserxm;
    }

    public void setDispenseUserxm(String dispenseUserxm) {
        this.dispenseUserxm = dispenseUserxm == null ? null : dispenseUserxm.trim();
    }

    public String getDispenseUserSecond() {
        return dispenseUserSecond;
    }

    public void setDispenseUserSecond(String dispenseUserSecond) {
        this.dispenseUserSecond = dispenseUserSecond == null ? null : dispenseUserSecond.trim();
    }

    public String getDispenseUserxmSecond() {
        return dispenseUserxmSecond;
    }

    public void setDispenseUserxmSecond(String dispenseUserxmSecond) {
        this.dispenseUserxmSecond = dispenseUserxmSecond == null ? null : dispenseUserxmSecond.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getBookFlag() {
        return bookFlag;
    }

    public void setBookFlag(String bookFlag) {
        this.bookFlag = bookFlag == null ? null : bookFlag.trim();
    }
}