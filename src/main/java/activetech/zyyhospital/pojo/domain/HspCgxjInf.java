package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class HspCgxjInf {
    /**
     * 出观小结ID
     */
    private String cgxjSeq;

    /**
     * 预检号
     */
    private String emgSeq;

    /**
     * 入院日期
     */
    private Date ryrqDat;

    /**
     * 出院日期
     */
    private Date cyrqDat;

    /**
     * 留观时长
     */
    private Short lgscLen;

    /**
     * 入院情况
     */
    private String ryqkDes;

    /**
     * 诊疗经过
     */
    private String zljgDes;

    /**
     * 出院情况
     */
    private String cyqkDes;

    /**
     * 出院医嘱
     */
    private String cyyzDes;

    /**
     * 记录日期
     */
    private Date oprtDat;

    /**
     * 创建时间
     */
    private Date cratDat;

    /**
     * 医生用户号
     */
    private String cratNbr;

    /**
     * 医生用户名
     */
    private String cratNam;

    /**
     * 修改时间
     */
    private Date updtDat;

    /**
     * 修改人用户号
     */
    private String updtNbr;

    /**
     * 修改人用户名
     */
    private String updtNam;

    /**
     * 留观时长类型  （0：时 1：天）
     */
    private String cgxjDatTyp;

    /**
     * 患者去向
     */
    private String sqlType;

    /**
     * 转院(所转医院)
     */
    private String sqlDes;

    /**
     * 住院(住院科室)
     */
    private String sqlDepCod;

    public String getCgxjSeq() {
        return cgxjSeq;
    }

    public void setCgxjSeq(String cgxjSeq) {
        this.cgxjSeq = cgxjSeq == null ? null : cgxjSeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public Date getRyrqDat() {
        return ryrqDat;
    }

    public void setRyrqDat(Date ryrqDat) {
        this.ryrqDat = ryrqDat;
    }

    public Date getCyrqDat() {
        return cyrqDat;
    }

    public void setCyrqDat(Date cyrqDat) {
        this.cyrqDat = cyrqDat;
    }

    public Short getLgscLen() {
        return lgscLen;
    }

    public void setLgscLen(Short lgscLen) {
        this.lgscLen = lgscLen;
    }

    public String getRyqkDes() {
        return ryqkDes;
    }

    public void setRyqkDes(String ryqkDes) {
        this.ryqkDes = ryqkDes == null ? null : ryqkDes.trim();
    }

    public String getZljgDes() {
        return zljgDes;
    }

    public void setZljgDes(String zljgDes) {
        this.zljgDes = zljgDes == null ? null : zljgDes.trim();
    }

    public String getCyqkDes() {
        return cyqkDes;
    }

    public void setCyqkDes(String cyqkDes) {
        this.cyqkDes = cyqkDes == null ? null : cyqkDes.trim();
    }

    public String getCyyzDes() {
        return cyyzDes;
    }

    public void setCyyzDes(String cyyzDes) {
        this.cyyzDes = cyyzDes == null ? null : cyyzDes.trim();
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

    public String getCgxjDatTyp() {
        return cgxjDatTyp;
    }

    public void setCgxjDatTyp(String cgxjDatTyp) {
        this.cgxjDatTyp = cgxjDatTyp == null ? null : cgxjDatTyp.trim();
    }

    public String getSqlType() {
        return sqlType;
    }

    public void setSqlType(String sqlType) {
        this.sqlType = sqlType == null ? null : sqlType.trim();
    }

    public String getSqlDes() {
        return sqlDes;
    }

    public void setSqlDes(String sqlDes) {
        this.sqlDes = sqlDes == null ? null : sqlDes.trim();
    }

    public String getSqlDepCod() {
        return sqlDepCod;
    }

    public void setSqlDepCod(String sqlDepCod) {
        this.sqlDepCod = sqlDepCod == null ? null : sqlDepCod.trim();
    }
}