package activetech.pda.pojo.domain;

import java.math.BigDecimal;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class HspCfxxInfo {
    /**
     * 处方唯一键值
     */
    private String daSeq;

    /**
     * 处方编号
     */
    private String daNo;

    /**
     * 组别编号 医嘱此字段相同为同组数据
     */
    private String daSub;

    /**
     * 就诊号
     */
    private String vstCad;

    /**
     * 开始时间|
     */
    private Date startTime;

    /**
     * 开立医生|
     */
    private String startDoct;

    /**
     * 处方类型 =医嘱类别名 ORDER_CLASS_NAME
     */
    private String daType;

    /**
     * 处方内容|
     */
    private String daInfo;

    /**
     * 剂量|
     */
    private String daDose;

    /**
     * 单位|
     */
    private String daUnit;

    /**
     * 数量|
     */
    private BigDecimal daNumb;

    /**
     * 药方单位|
     */
    private String yfdw;

    /**
     * 给药方式
     */
    private String daWay;

    /**
     * 频次| 举例：BID
     */
    private String daFreq;

    /**
     * 处方来源|0=HIS 1=人工录入
     */
    private String infoSrc;

    /**
     * 核对日期
     */
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm",timezone = "GMT+8")
    private Date hddat;

    /**
     * 核对护士工号
     */
    private String hdhs;

    /**
     * 核对护士姓名
     */
    private String hdhsxm;

    /**
     * 处方状态|0=待核对 1=待生成执行单 2=已生成执行单 9=删除
     */
    private String yzzt;

    /**
     * 创建时间|
     */
    private Date crtTime;

    /**
     * 创建用户|
     */
    private String crtUser;

    /**
     * 修改时间|
     */
    private Date modTime;

    /**
     * 修改用户|
     */
    private String modUser;

    /**
     * 平台MPI值
     */
    private String mpi;

    /**
     * 给药方式代码
     */
    private String daWayCod;

    /**
     * 是否为高危药品
     */
    private String highRisk;

    /**
     * 开立时间
     */
    private Date enterTime;

    /**
     * null
     */
    private Short series;

    /**
     * null
     */
    private String mrn;

    /**
     * 病区代码
     */
    private String wardCode;

    /**
     * 科室代码
     */
    private String deptCode;

    /**
     * 医嘱状态  =在用/撤销/停止
     */
    private String orderStatus;

    /**
     * 医嘱类别
     */
    private String orderClass;

    /**
     * 首日次数=开嘱当日的用药次数
     */
    private Short todayTimes;

    /**
     * 自备药标识 1=是自备药；0=不是自备药
     */
    private Short provideBySelf;

    /**
     * 副药标识 是否副药,0=表示主药,1=表示副药
     */
    private Short isAux;

    /**
     * 嘱托 医生下达医嘱时，对该医嘱使用的说明，可选。
     */
    private String exhortation;

    /**
     * 备注
     */
    private String remark;

    /**
     * 规格
     */
    private String drugSpec;

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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getStartDoct() {
        return startDoct;
    }

    public void setStartDoct(String startDoct) {
        this.startDoct = startDoct == null ? null : startDoct.trim();
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

    public String getDaWay() {
        return daWay;
    }

    public void setDaWay(String daWay) {
        this.daWay = daWay == null ? null : daWay.trim();
    }

    public String getDaFreq() {
        return daFreq;
    }

    public void setDaFreq(String daFreq) {
        this.daFreq = daFreq == null ? null : daFreq.trim();
    }

    public String getInfoSrc() {
        return infoSrc;
    }

    public void setInfoSrc(String infoSrc) {
        this.infoSrc = infoSrc == null ? null : infoSrc.trim();
    }

    public Date getHddat() {
        return hddat;
    }

    public void setHddat(Date hddat) {
        this.hddat = hddat;
    }

    public String getHdhs() {
        return hdhs;
    }

    public void setHdhs(String hdhs) {
        this.hdhs = hdhs == null ? null : hdhs.trim();
    }

    public String getHdhsxm() {
        return hdhsxm;
    }

    public void setHdhsxm(String hdhsxm) {
        this.hdhsxm = hdhsxm == null ? null : hdhsxm.trim();
    }

    public String getYzzt() {
        return yzzt;
    }

    public void setYzzt(String yzzt) {
        this.yzzt = yzzt == null ? null : yzzt.trim();
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

    public String getMpi() {
        return mpi;
    }

    public void setMpi(String mpi) {
        this.mpi = mpi == null ? null : mpi.trim();
    }

    public String getDaWayCod() {
        return daWayCod;
    }

    public void setDaWayCod(String daWayCod) {
        this.daWayCod = daWayCod == null ? null : daWayCod.trim();
    }

    public String getHighRisk() {
        return highRisk;
    }

    public void setHighRisk(String highRisk) {
        this.highRisk = highRisk == null ? null : highRisk.trim();
    }

    public Date getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(Date enterTime) {
        this.enterTime = enterTime;
    }

    public Short getSeries() {
        return series;
    }

    public void setSeries(Short series) {
        this.series = series;
    }

    public String getMrn() {
        return mrn;
    }

    public void setMrn(String mrn) {
        this.mrn = mrn == null ? null : mrn.trim();
    }

    public String getWardCode() {
        return wardCode;
    }

    public void setWardCode(String wardCode) {
        this.wardCode = wardCode == null ? null : wardCode.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    public String getOrderClass() {
        return orderClass;
    }

    public void setOrderClass(String orderClass) {
        this.orderClass = orderClass == null ? null : orderClass.trim();
    }

    public Short getTodayTimes() {
        return todayTimes;
    }

    public void setTodayTimes(Short todayTimes) {
        this.todayTimes = todayTimes;
    }

    public Short getProvideBySelf() {
        return provideBySelf;
    }

    public void setProvideBySelf(Short provideBySelf) {
        this.provideBySelf = provideBySelf;
    }

    public Short getIsAux() {
        return isAux;
    }

    public void setIsAux(Short isAux) {
        this.isAux = isAux;
    }

    public String getExhortation() {
        return exhortation;
    }

    public void setExhortation(String exhortation) {
        this.exhortation = exhortation == null ? null : exhortation.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDrugSpec() {
        return drugSpec;
    }

    public void setDrugSpec(String drugSpec) {
        this.drugSpec = drugSpec == null ? null : drugSpec.trim();
    }
}