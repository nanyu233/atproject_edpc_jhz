package activetech.zyyhospital.pojo.domain;

import java.math.BigDecimal;
import java.util.Date;

public class HspBasyInf {
    /**
     * 编号             |
     */
    private String basySeq;

    /**
     * 预检号           |
     */
    private String emgSeq;

    /**
     * 医疗机构         |
     */
    private String yljg;

    /**
     * 组织机构代码     |
     */
    private String zzjgCod;

    /**
     * 医疗付费方式     |dstdicttype(MEDICAL_PAYMENT)
     */
    private String ylffType;

    /**
     * 医疗付费其他     |
     */
    private String ylffOther;

    /**
     * 第N次留抢        |
     */
    private String lqNum;

    /**
     * 关系人名         |
     */
    private String gxrNam;

    /**
     * 关系             |
     */
    private String gx;

    /**
     * 关系人现住址     |
     */
    private String gxrAddres;

    /**
     * 关系人电话       |
     */
    private String gxrTel;

    /**
     * 留抢时间         |
     */
    private Date lqDat;

    /**
     * 留抢科别         |
     */
    private String lqkb;

    /**
     * 留抢时长         |
     */
    private String lqsc;

    /**
     * 离抢时间         |
     */
    private Date sqlDat;

    /**
     * 离抢方式         |
     */
    private String sqlType;

    /**
     * 接受医疗结构名称 |
     */
    private String jsyljgNam;

    /**
     * 转运途径         |dstdicttype(TRANSIT_WAY)
     */
    private String zytj;

    /**
     * 转运途径其他     |
     */
    private String zytjOther;

    /**
     * 药物过敏         |（0-无，1-有）
     */
    private String ywgm;

    /**
     * 药物过敏其他     |
     */
    private String ywgmOther;

    /**
     * 血型             |（1-A,2-B,3-AB,4-O,5-不详，6-未查）
     */
    private String bloodType;

    /**
     * RH               |（1-阴性，2-阳性，3-不评，4-未查）
     */
    private String rh;

    /**
     * 主管医师号       |
     */
    private String zgysCod;

    /**
     * 主管医师名       |
     */
    private String zgysNam;

    /**
     * 经管医师号       |
     */
    private String jgysCod;

    /**
     * 经管医师名       |
     */
    private String jgysNam;

    /**
     * 责任护士号       |
     */
    private String zrhsCod;

    /**
     * 责任护士名       |
     */
    private String zrhsNam;

    /**
     * 备用字段1        |
     */
    private String byzd1;

    /**
     * 备用字段2        |
     */
    private String byzd2;

    /**
     * 备用字段3        |
     */
    private String byzd3;

    /**
     * 创建日期         |
     */
    private Date creDat;

    /**
     * 创建人号         |
     */
    private String creCod;

    /**
     * 创建人名         |
     */
    private String creNam;

    /**
     * 修改日期         |
     */
    private Date updDat;

    /**
     * 修改人号         |
     */
    private String updCod;

    /**
     * 修改人名         |
     */
    private String updNam;

    /**
     * 留抢时长单位     |（0-时，1-天）
     */
    private String lqscType;

    /**
     * 病种 |dstdictinfo(BZ_COD)
     */
    private String bzCod;

    /**
     * 操作技术 |dstdictinfo(CZJS_COD)
     */
    private String czjsCod;

    /**
     * 转院(所转医院)
     */
    private String sqlDes;

    /**
     * 住院(住院科室)
     */
    private String sqlDepCod;

    /**
     * 入院途径|dstdictinfo(ARV_CHL_COD)
     */
    private String arvChlCod;

    /**
     * 其他医院送入
     */
    private String abnScoNme;

    /**
     * 120驾驶员姓名|dstdictinfo(DRIVER_COD)
     */
    private String abnDriver;

    /**
     * 120医生姓名
     */
    private String abnDoctor;

    /**
     * 留抢费用（元）
     */
    private BigDecimal lqfy;

    public String getBasySeq() {
        return basySeq;
    }

    public void setBasySeq(String basySeq) {
        this.basySeq = basySeq == null ? null : basySeq.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getYljg() {
        return yljg;
    }

    public void setYljg(String yljg) {
        this.yljg = yljg == null ? null : yljg.trim();
    }

    public String getZzjgCod() {
        return zzjgCod;
    }

    public void setZzjgCod(String zzjgCod) {
        this.zzjgCod = zzjgCod == null ? null : zzjgCod.trim();
    }

    public String getYlffType() {
        return ylffType;
    }

    public void setYlffType(String ylffType) {
        this.ylffType = ylffType == null ? null : ylffType.trim();
    }

    public String getYlffOther() {
        return ylffOther;
    }

    public void setYlffOther(String ylffOther) {
        this.ylffOther = ylffOther == null ? null : ylffOther.trim();
    }

    public String getLqNum() {
        return lqNum;
    }

    public void setLqNum(String lqNum) {
        this.lqNum = lqNum == null ? null : lqNum.trim();
    }

    public String getGxrNam() {
        return gxrNam;
    }

    public void setGxrNam(String gxrNam) {
        this.gxrNam = gxrNam == null ? null : gxrNam.trim();
    }

    public String getGx() {
        return gx;
    }

    public void setGx(String gx) {
        this.gx = gx == null ? null : gx.trim();
    }

    public String getGxrAddres() {
        return gxrAddres;
    }

    public void setGxrAddres(String gxrAddres) {
        this.gxrAddres = gxrAddres == null ? null : gxrAddres.trim();
    }

    public String getGxrTel() {
        return gxrTel;
    }

    public void setGxrTel(String gxrTel) {
        this.gxrTel = gxrTel == null ? null : gxrTel.trim();
    }

    public Date getLqDat() {
        return lqDat;
    }

    public void setLqDat(Date lqDat) {
        this.lqDat = lqDat;
    }

    public String getLqkb() {
        return lqkb;
    }

    public void setLqkb(String lqkb) {
        this.lqkb = lqkb == null ? null : lqkb.trim();
    }

    public String getLqsc() {
        return lqsc;
    }

    public void setLqsc(String lqsc) {
        this.lqsc = lqsc == null ? null : lqsc.trim();
    }

    public Date getSqlDat() {
        return sqlDat;
    }

    public void setSqlDat(Date sqlDat) {
        this.sqlDat = sqlDat;
    }

    public String getSqlType() {
        return sqlType;
    }

    public void setSqlType(String sqlType) {
        this.sqlType = sqlType == null ? null : sqlType.trim();
    }

    public String getJsyljgNam() {
        return jsyljgNam;
    }

    public void setJsyljgNam(String jsyljgNam) {
        this.jsyljgNam = jsyljgNam == null ? null : jsyljgNam.trim();
    }

    public String getZytj() {
        return zytj;
    }

    public void setZytj(String zytj) {
        this.zytj = zytj == null ? null : zytj.trim();
    }

    public String getZytjOther() {
        return zytjOther;
    }

    public void setZytjOther(String zytjOther) {
        this.zytjOther = zytjOther == null ? null : zytjOther.trim();
    }

    public String getYwgm() {
        return ywgm;
    }

    public void setYwgm(String ywgm) {
        this.ywgm = ywgm == null ? null : ywgm.trim();
    }

    public String getYwgmOther() {
        return ywgmOther;
    }

    public void setYwgmOther(String ywgmOther) {
        this.ywgmOther = ywgmOther == null ? null : ywgmOther.trim();
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType == null ? null : bloodType.trim();
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh == null ? null : rh.trim();
    }

    public String getZgysCod() {
        return zgysCod;
    }

    public void setZgysCod(String zgysCod) {
        this.zgysCod = zgysCod == null ? null : zgysCod.trim();
    }

    public String getZgysNam() {
        return zgysNam;
    }

    public void setZgysNam(String zgysNam) {
        this.zgysNam = zgysNam == null ? null : zgysNam.trim();
    }

    public String getJgysCod() {
        return jgysCod;
    }

    public void setJgysCod(String jgysCod) {
        this.jgysCod = jgysCod == null ? null : jgysCod.trim();
    }

    public String getJgysNam() {
        return jgysNam;
    }

    public void setJgysNam(String jgysNam) {
        this.jgysNam = jgysNam == null ? null : jgysNam.trim();
    }

    public String getZrhsCod() {
        return zrhsCod;
    }

    public void setZrhsCod(String zrhsCod) {
        this.zrhsCod = zrhsCod == null ? null : zrhsCod.trim();
    }

    public String getZrhsNam() {
        return zrhsNam;
    }

    public void setZrhsNam(String zrhsNam) {
        this.zrhsNam = zrhsNam == null ? null : zrhsNam.trim();
    }

    public String getByzd1() {
        return byzd1;
    }

    public void setByzd1(String byzd1) {
        this.byzd1 = byzd1 == null ? null : byzd1.trim();
    }

    public String getByzd2() {
        return byzd2;
    }

    public void setByzd2(String byzd2) {
        this.byzd2 = byzd2 == null ? null : byzd2.trim();
    }

    public String getByzd3() {
        return byzd3;
    }

    public void setByzd3(String byzd3) {
        this.byzd3 = byzd3 == null ? null : byzd3.trim();
    }

    public Date getCreDat() {
        return creDat;
    }

    public void setCreDat(Date creDat) {
        this.creDat = creDat;
    }

    public String getCreCod() {
        return creCod;
    }

    public void setCreCod(String creCod) {
        this.creCod = creCod == null ? null : creCod.trim();
    }

    public String getCreNam() {
        return creNam;
    }

    public void setCreNam(String creNam) {
        this.creNam = creNam == null ? null : creNam.trim();
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

    public String getLqscType() {
        return lqscType;
    }

    public void setLqscType(String lqscType) {
        this.lqscType = lqscType == null ? null : lqscType.trim();
    }

    public String getBzCod() {
        return bzCod;
    }

    public void setBzCod(String bzCod) {
        this.bzCod = bzCod == null ? null : bzCod.trim();
    }

    public String getCzjsCod() {
        return czjsCod;
    }

    public void setCzjsCod(String czjsCod) {
        this.czjsCod = czjsCod == null ? null : czjsCod.trim();
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

    public String getArvChlCod() {
        return arvChlCod;
    }

    public void setArvChlCod(String arvChlCod) {
        this.arvChlCod = arvChlCod == null ? null : arvChlCod.trim();
    }

    public String getAbnScoNme() {
        return abnScoNme;
    }

    public void setAbnScoNme(String abnScoNme) {
        this.abnScoNme = abnScoNme == null ? null : abnScoNme.trim();
    }

    public String getAbnDriver() {
        return abnDriver;
    }

    public void setAbnDriver(String abnDriver) {
        this.abnDriver = abnDriver == null ? null : abnDriver.trim();
    }

    public String getAbnDoctor() {
        return abnDoctor;
    }

    public void setAbnDoctor(String abnDoctor) {
        this.abnDoctor = abnDoctor == null ? null : abnDoctor.trim();
    }

    public BigDecimal getLqfy() {
        return lqfy;
    }

    public void setLqfy(BigDecimal lqfy) {
        this.lqfy = lqfy;
    }
}