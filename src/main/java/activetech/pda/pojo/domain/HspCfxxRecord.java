package activetech.pda.pojo.domain;

import java.util.Date;

public class HspCfxxRecord {
    /**
     * 主键
     */
    private String recordSeq;

    /**
     * 处置单编号 执行单此字段相同为同组数据
     */
    private String disposalSeq;

    /**
     * 患者ID号
     */
    private String mpi;

    /**
     * 巡视情况 0-正常，1-其他
     */
    private String situation;

    /**
     * 药物类型
     */
    private String drugType;

    /**
     * 滴速
     */
    private String dripRate;

    /**
     * 类型 滴/分
     */
    private String dripRateDrop;

    /**
     * 余液量
     */
    private String margin;

    /**
     * 类型 ml
     */
    private String marginDrop;

    /**
     * 处理方式（数字字典）
     */
    private String disposeWay;

    /**
     * 处理结果（数字字典）
     */
    private String disposeResult;

    /**
     * 记录时间
     */
    private Date recordDate;

    /**
     * 记录人
     */
    private String recordUsrno;

    /**
     * 记录人名
     */
    private String recordUsrnam;

    /**
     * 操作状态
     */
    private String recordStatus;

    /**
     * 备注
     */
    private String remaker;

    /**
     * 备用字段
     */
    private String remaker1;

    public String getRecordSeq() {
        return recordSeq;
    }

    public void setRecordSeq(String recordSeq) {
        this.recordSeq = recordSeq == null ? null : recordSeq.trim();
    }

    public String getDisposalSeq() {
        return disposalSeq;
    }

    public void setDisposalSeq(String disposalSeq) {
        this.disposalSeq = disposalSeq == null ? null : disposalSeq.trim();
    }

    public String getMpi() {
        return mpi;
    }

    public void setMpi(String mpi) {
        this.mpi = mpi == null ? null : mpi.trim();
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation == null ? null : situation.trim();
    }

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType == null ? null : drugType.trim();
    }

    public String getDripRate() {
        return dripRate;
    }

    public void setDripRate(String dripRate) {
        this.dripRate = dripRate == null ? null : dripRate.trim();
    }

    public String getDripRateDrop() {
        return dripRateDrop;
    }

    public void setDripRateDrop(String dripRateDrop) {
        this.dripRateDrop = dripRateDrop == null ? null : dripRateDrop.trim();
    }

    public String getMargin() {
        return margin;
    }

    public void setMargin(String margin) {
        this.margin = margin == null ? null : margin.trim();
    }

    public String getMarginDrop() {
        return marginDrop;
    }

    public void setMarginDrop(String marginDrop) {
        this.marginDrop = marginDrop == null ? null : marginDrop.trim();
    }

    public String getDisposeWay() {
        return disposeWay;
    }

    public void setDisposeWay(String disposeWay) {
        this.disposeWay = disposeWay == null ? null : disposeWay.trim();
    }

    public String getDisposeResult() {
        return disposeResult;
    }

    public void setDisposeResult(String disposeResult) {
        this.disposeResult = disposeResult == null ? null : disposeResult.trim();
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public String getRecordUsrno() {
        return recordUsrno;
    }

    public void setRecordUsrno(String recordUsrno) {
        this.recordUsrno = recordUsrno == null ? null : recordUsrno.trim();
    }

    public String getRecordUsrnam() {
        return recordUsrnam;
    }

    public void setRecordUsrnam(String recordUsrnam) {
        this.recordUsrnam = recordUsrnam == null ? null : recordUsrnam.trim();
    }

    public String getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus == null ? null : recordStatus.trim();
    }

    public String getRemaker() {
        return remaker;
    }

    public void setRemaker(String remaker) {
        this.remaker = remaker == null ? null : remaker.trim();
    }

    public String getRemaker1() {
        return remaker1;
    }

    public void setRemaker1(String remaker1) {
        this.remaker1 = remaker1 == null ? null : remaker1.trim();
    }
}