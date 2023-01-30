package activetech.hospital.pojo.dto;

import activetech.hospital.pojo.domain.HspEmgInf;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

/**
 * <p>Title:HspemginfCustom</p>
 * <p>Description:急诊记录信息表自定义类</p>
 * <p>activetech</p>
 *
 * @author liulj
 * @date 2017年2月17日 上午10:47:41
 */
public class HspemginfCustom extends HspEmgInf {

    //循环级别|dstdicttype()
    private String cirLvlCod;

    //呼吸级别|dstdicttype()
    private String breLvlCod;

    //胸腹部级别|dstdicttype()
    private String bdyLvlCod;

    //运动级别|dstdicttype()
    private String sptLvlCod;
    private String lanLvlCod;//语言级别|dstdicttype()
    private String cirLvlCodStr; //循环级别
    private String breLvlCodStr; //呼吸级别
    private String bdyLvlCodStr; //胸腹级别
    private String sptLvlCodStr; //运动级别
    private String lanLvlCodStr; //语言级别
    private Long cramsTotSco;//创伤评分
    private String eyeRctCod;//睁眼反应|dstdicttype()
    private String lanRctCod;//语言反应|dstdicttype()
    private String actRctCod;//活动反应|dstdicttype()
    private String eyeRctCodStr;//睁眼反应
    private String lanRctCodStr;//语言反应
    private String actRctCodStr;//肢体反应
    private Long gcsTotSco;//意识评分
    private String emgFkName;//科室名
    private Short hrtRte;//心跳频率
    // 修改收缩压为收缩上压和收缩下压 2017/3/3
    private Short sbpUpNbr;//收缩上压
    private Short sbpDownNbr;//收缩下压
    private Short breNbr;//呼吸频率
    private BigDecimal tmpNbr;//体温
    private String senRctCod;//意识|dstdicttype()
    private String senRctCodStr; //清醒程度
    private Long mewsTotSco;//MEWS评分
    private String chkLvlCod;//预检分级(根据MEWS评分自动展示)|dstdicttype()
    private String modLvlCod;//修订分级|dstdicttype()
    private String modLvlDes;//修订分级说明
    private String jbbc;//初步印象-疾病名称
    private String sqlDctNam;//处置医生姓名
    private String emgJjd;//急诊记录查询列表紧急度
    //展示页面增加字段
    private String preDgnName;//初步诊断名字
    private String mdate;//间隔日期内的各月份
    private String charge;//收费情况
    //救护车车编号
    private String abnSeq;
    //最新状态编码
    private String cstDspCodNew;
    private String cstDspCodNameNew;//最新状态名字
    private String cstDepCodNew; //最新转归科室
    private String jbbcs; //疾病名称
    private String savMngCodStr; //抢救处理情况名称
    private String iszd; //是否诊断
    private String sqlStaCod; //转归去向
    private String sqlDepCod; //转归科室
    private String sqlDepName;//科室名
    private String sqlDat;//转归日期
    private String sqlDes; //转归说明
    private String cstDepCod; //会诊科室
    private String sqlDct;  //转归医生号码
    private String sqlDctName;  //转归医生的名字
    private String abnSco; //出车范围编码
    private int zgcount;//转归次数
    private String isgl;//是否关联出车
    private Map<String, Object> sfxq; //收费详情
    private String hxknCodStr;  //呼吸困难指标
    private String xtCodStr; //胸痛
    private String xmCodStr; //胸闷
    private String bthDatStr;
    private String emgDatStr;
    //20171019  中医院打印病人信息字段
    private String qxZyh;//住院号
    private String nrsSco;//nrs评分
    private String cstAgeCod;
    private String info;//拼接过敏史中文字段 打印在用
    private String usingBed;
    private String bedid;
    private String bedNum;
    private String enddateStr;
    private String emgAre;//急诊分区字典
    private String cstDsp;//病人去向字典
    private String fl;
    private String checkDocDatStr;//归档病历
    private String checkNurDatStr;//归档病历
    private String rgAttendDocTor;//入观医生，归档病历查询用
    private String cgAttendDocTor;//出观医生，归档病历查询用
    private String czFlg; //卒中
    private String rgDate;
    private String rqDate;
    private String clbzCod;
    private String jzlqblNam;//急诊留抢病历 简称
    private String qtsjNam;//群体事件名称
    private Date sqlDate;
    private String bedPlace;//290留床 291抢床
    //PEWS
    private String actionCod;
    private String xxgSkinCod;
    private String xxgCrtCod;
    private String xxgXlCod;
    private String hxPlCod;
    private String hxXhCod;
    private String hxFio2Cod;
    private Short pewsSco;
    private String islgbed;
    private String mysjStr;
    private String mqsjStr;
    /**
     * 分诊管理患者详情页面 跌倒评估显示
     */
    private String fallAssCod;
    private String sqlDatStr;
    private String bltype;//0：留抢病历 1：门诊病历
    private String mzCbzd;//门诊最初诊断
    private String mzZzzd;//门诊最终诊断
    /**
     * 疾病诊断类型
     */
    private String jbzdType;
    /**
     * 最新转归日期
     */
    private Date sqlDatNew;
    private String wcdyFlag; //是都有蚊虫叮咬
    private String ttgjcxFlag; //有无头痛、关节痛、皮疹及出血点
    private String hxdzzFlag;  //有无呼吸道症状
    private String yqyqFlag;   //有无疫区疫情暴露史
    private String qljcFlag;   //有无禽类接触史
    private String frDatStr;  //发热时间
    private String senStuCodName;
    private String morseSco;
    private String gcsSco;
    private Long jzxhOld;
    private String newEmgSeq;//再分科新生成的emgSeq
    private String scoIdArr;

    private String deathRate;//死亡率

    private String surRate;//存活率

    public String getDeathRate() {
        return deathRate;
    }

    public void setDeathRate(String deathRate) {
        this.deathRate = deathRate;
    }

    public String getSurRate() {
        return surRate;
    }

    public void setSurRate(String surRate) {
        this.surRate = surRate;
    }

    /**
     * 到院方式名称
     */
    private String arvChlCodNam;

    /**
     * 陪送人员名称
     */
    private String cmpPsnCodNam;

    /**
     * 病种及其操作技术统计类型
     */
    private String scoIdType;

    /**
     * 脉搏
     */
    private String pulse;

    /**
     * 血糖(护理评估)
     */
    private String pbgNbr;

    /**
     * 血糖扩充(护理评估)
     */
    private String pbgNbrFlg;

    /**
     * 就诊时间
     */
    private String docDatStr;
    /**
     * 挂号时间
     */
    private String ghsjStr;


    /**
     * 创建人COD
     */
    private String cratNbr;
    //病历医生签名
    private String cratNam;
    //导入病历功能新增字段
    private String medHis;
    private String drugHis;
    private String gmsDes;
    private String oprtHis;
    private String tramHis;
    private String crbHis;
    private String obstHis;
    private String lqblDes;
    private String famlHis;
    private String ctnrDes;
    private String fzjcDes;
    private String zysx;
    private String healthEducation;
    private String lqblBrqx;
    private String tgjcMergeStr;
    private String lqblDatStr;
    private String lqblSeq;

    /**
     * 留抢病历创建时间
     */
    private String oprtDatStr;

    /**
     * 是否在床
     */
    private String isBed;

    /**
     * 该患者是否留抢过（大于0则是留抢过）
     */
    private int lqFlag;

    private Date ghsj;

    private String wayTyp;

    /**
     * killip分级
     */
    private String killip;

    private Date consultationDate;

    private String recordFlag;

    public String getCirLvlCod() {
        return cirLvlCod;
    }

    public void setCirLvlCod(String cirLvlCod) {
        this.cirLvlCod = cirLvlCod;
    }

    public String getBreLvlCod() {
        return breLvlCod;
    }

    public void setBreLvlCod(String breLvlCod) {
        this.breLvlCod = breLvlCod;
    }

    public String getBdyLvlCod() {
        return bdyLvlCod;
    }

    public void setBdyLvlCod(String bdyLvlCod) {
        this.bdyLvlCod = bdyLvlCod;
    }

    public String getSptLvlCod() {
        return sptLvlCod;
    }

    public void setSptLvlCod(String sptLvlCod) {
        this.sptLvlCod = sptLvlCod;
    }

    public String getLanLvlCod() {
        return lanLvlCod;
    }

    public void setLanLvlCod(String lanLvlCod) {
        this.lanLvlCod = lanLvlCod;
    }

    public String getCirLvlCodStr() {
        return cirLvlCodStr;
    }

    public void setCirLvlCodStr(String cirLvlCodStr) {
        this.cirLvlCodStr = cirLvlCodStr;
    }

    public String getBreLvlCodStr() {
        return breLvlCodStr;
    }

    public void setBreLvlCodStr(String breLvlCodStr) {
        this.breLvlCodStr = breLvlCodStr;
    }

    public String getBdyLvlCodStr() {
        return bdyLvlCodStr;
    }

    public void setBdyLvlCodStr(String bdyLvlCodStr) {
        this.bdyLvlCodStr = bdyLvlCodStr;
    }

    public String getSptLvlCodStr() {
        return sptLvlCodStr;
    }

    public void setSptLvlCodStr(String sptLvlCodStr) {
        this.sptLvlCodStr = sptLvlCodStr;
    }

    public String getLanLvlCodStr() {
        return lanLvlCodStr;
    }

    public void setLanLvlCodStr(String lanLvlCodStr) {
        this.lanLvlCodStr = lanLvlCodStr;
    }

    public Long getCramsTotSco() {
        return cramsTotSco;
    }

    public void setCramsTotSco(Long cramsTotSco) {
        this.cramsTotSco = cramsTotSco;
    }

    public String getEyeRctCod() {
        return eyeRctCod;
    }

    public void setEyeRctCod(String eyeRctCod) {
        this.eyeRctCod = eyeRctCod;
    }

    public String getLanRctCod() {
        return lanRctCod;
    }

    public void setLanRctCod(String lanRctCod) {
        this.lanRctCod = lanRctCod;
    }

    public String getActRctCod() {
        return actRctCod;
    }

    public void setActRctCod(String actRctCod) {
        this.actRctCod = actRctCod;
    }

    public String getEyeRctCodStr() {
        return eyeRctCodStr;
    }

    public void setEyeRctCodStr(String eyeRctCodStr) {
        this.eyeRctCodStr = eyeRctCodStr;
    }

    public String getLanRctCodStr() {
        return lanRctCodStr;
    }

    public void setLanRctCodStr(String lanRctCodStr) {
        this.lanRctCodStr = lanRctCodStr;
    }

    public String getActRctCodStr() {
        return actRctCodStr;
    }

    public void setActRctCodStr(String actRctCodStr) {
        this.actRctCodStr = actRctCodStr;
    }

    public Long getGcsTotSco() {
        return gcsTotSco;
    }

    public void setGcsTotSco(Long gcsTotSco) {
        this.gcsTotSco = gcsTotSco;
    }

    public String getEmgFkName() {
        return emgFkName;
    }

    public void setEmgFkName(String emgFkName) {
        this.emgFkName = emgFkName;
    }

    public Short getHrtRte() {
        return hrtRte;
    }

    public void setHrtRte(Short hrtRte) {
        this.hrtRte = hrtRte;
    }

    public Short getSbpUpNbr() {
        return sbpUpNbr;
    }

    public void setSbpUpNbr(Short sbpUpNbr) {
        this.sbpUpNbr = sbpUpNbr;
    }

    public Short getSbpDownNbr() {
        return sbpDownNbr;
    }

    public void setSbpDownNbr(Short sbpDownNbr) {
        this.sbpDownNbr = sbpDownNbr;
    }

    public Short getBreNbr() {
        return breNbr;
    }

    public void setBreNbr(Short breNbr) {
        this.breNbr = breNbr;
    }

    public BigDecimal getTmpNbr() {
        return tmpNbr;
    }

    public void setTmpNbr(BigDecimal tmpNbr) {
        this.tmpNbr = tmpNbr;
    }

    public String getSenRctCod() {
        return senRctCod;
    }

    public void setSenRctCod(String senRctCod) {
        this.senRctCod = senRctCod;
    }

    public String getSenRctCodStr() {
        return senRctCodStr;
    }

    public void setSenRctCodStr(String senRctCodStr) {
        this.senRctCodStr = senRctCodStr;
    }

    public Long getMewsTotSco() {
        return mewsTotSco;
    }

    public void setMewsTotSco(Long mewsTotSco) {
        this.mewsTotSco = mewsTotSco;
    }

    public String getChkLvlCod() {
        return chkLvlCod;
    }

    public void setChkLvlCod(String chkLvlCod) {
        this.chkLvlCod = chkLvlCod;
    }

    public String getModLvlCod() {
        return modLvlCod;
    }

    public void setModLvlCod(String modLvlCod) {
        this.modLvlCod = modLvlCod;
    }

    public String getModLvlDes() {
        return modLvlDes;
    }

    public void setModLvlDes(String modLvlDes) {
        this.modLvlDes = modLvlDes;
    }

    public String getJbbc() {
        return jbbc;
    }

    public void setJbbc(String jbbc) {
        this.jbbc = jbbc;
    }

    public String getSqlDctNam() {
        return sqlDctNam;
    }

    public void setSqlDctNam(String sqlDctNam) {
        this.sqlDctNam = sqlDctNam;
    }

    public String getEmgJjd() {
        return emgJjd;
    }

    public void setEmgJjd(String emgJjd) {
        this.emgJjd = emgJjd;
    }

    public String getPreDgnName() {
        return preDgnName;
    }

    public void setPreDgnName(String preDgnName) {
        this.preDgnName = preDgnName;
    }

    public String getMdate() {
        return mdate;
    }

    public void setMdate(String mdate) {
        this.mdate = mdate;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getAbnSeq() {
        return abnSeq;
    }

    public void setAbnSeq(String abnSeq) {
        this.abnSeq = abnSeq;
    }

    public String getCstDspCodNew() {
        return cstDspCodNew;
    }

    public void setCstDspCodNew(String cstDspCodNew) {
        this.cstDspCodNew = cstDspCodNew;
    }

    public String getCstDspCodNameNew() {
        return cstDspCodNameNew;
    }

    public void setCstDspCodNameNew(String cstDspCodNameNew) {
        this.cstDspCodNameNew = cstDspCodNameNew;
    }

    public String getCstDepCodNew() {
        return cstDepCodNew;
    }

    public void setCstDepCodNew(String cstDepCodNew) {
        this.cstDepCodNew = cstDepCodNew;
    }

    public String getJbbcs() {
        return jbbcs;
    }

    public void setJbbcs(String jbbcs) {
        this.jbbcs = jbbcs;
    }

    public String getSavMngCodStr() {
        return savMngCodStr;
    }

    public void setSavMngCodStr(String savMngCodStr) {
        this.savMngCodStr = savMngCodStr;
    }

    public String getIszd() {
        return iszd;
    }

    public void setIszd(String iszd) {
        this.iszd = iszd;
    }

    public String getSqlStaCod() {
        return sqlStaCod;
    }

    public void setSqlStaCod(String sqlStaCod) {
        this.sqlStaCod = sqlStaCod;
    }

    public String getSqlDepCod() {
        return sqlDepCod;
    }

    public void setSqlDepCod(String sqlDepCod) {
        this.sqlDepCod = sqlDepCod;
    }

    public String getSqlDepName() {
        return sqlDepName;
    }

    public void setSqlDepName(String sqlDepName) {
        this.sqlDepName = sqlDepName;
    }

    public String getSqlDat() {
        return sqlDat;
    }

    public void setSqlDat(String sqlDat) {
        this.sqlDat = sqlDat;
    }

    public String getSqlDes() {
        return sqlDes;
    }

    public void setSqlDes(String sqlDes) {
        this.sqlDes = sqlDes;
    }

    public String getCstDepCod() {
        return cstDepCod;
    }

    public void setCstDepCod(String cstDepCod) {
        this.cstDepCod = cstDepCod;
    }

    public String getSqlDct() {
        return sqlDct;
    }

    public void setSqlDct(String sqlDct) {
        this.sqlDct = sqlDct;
    }

    public String getSqlDctName() {
        return sqlDctName;
    }

    public void setSqlDctName(String sqlDctName) {
        this.sqlDctName = sqlDctName;
    }

    public String getAbnSco() {
        return abnSco;
    }

    public void setAbnSco(String abnSco) {
        this.abnSco = abnSco;
    }

    public int getZgcount() {
        return zgcount;
    }

    public void setZgcount(int zgcount) {
        this.zgcount = zgcount;
    }

    public String getIsgl() {
        return isgl;
    }

    public void setIsgl(String isgl) {
        this.isgl = isgl;
    }

    public Map<String, Object> getSfxq() {
        return sfxq;
    }

    public void setSfxq(Map<String, Object> sfxq) {
        this.sfxq = sfxq;
    }

    public String getHxknCodStr() {
        return hxknCodStr;
    }

    public void setHxknCodStr(String hxknCodStr) {
        this.hxknCodStr = hxknCodStr;
    }

    public String getXtCodStr() {
        return xtCodStr;
    }

    public void setXtCodStr(String xtCodStr) {
        this.xtCodStr = xtCodStr;
    }

    public String getXmCodStr() {
        return xmCodStr;
    }

    public void setXmCodStr(String xmCodStr) {
        this.xmCodStr = xmCodStr;
    }

    public String getBthDatStr() {
        return bthDatStr;
    }

    public void setBthDatStr(String bthDatStr) {
        this.bthDatStr = bthDatStr;
    }

    public String getEmgDatStr() {
        return emgDatStr;
    }

    public void setEmgDatStr(String emgDatStr) {
        this.emgDatStr = emgDatStr;
    }

    public String getQxZyh() {
        return qxZyh;
    }

    public void setQxZyh(String qxZyh) {
        this.qxZyh = qxZyh;
    }

    public String getNrsSco() {
        return nrsSco;
    }

    public void setNrsSco(String nrsSco) {
        this.nrsSco = nrsSco;
    }

    @Override
    public String getCstAgeCod() {
        return cstAgeCod;
    }

    @Override
    public void setCstAgeCod(String cstAgeCod) {
        this.cstAgeCod = cstAgeCod;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getUsingBed() {
        return usingBed;
    }

    public void setUsingBed(String usingBed) {
        this.usingBed = usingBed;
    }

    public String getBedid() {
        return bedid;
    }

    public void setBedid(String bedid) {
        this.bedid = bedid;
    }

    public String getBedNum() {
        return bedNum;
    }

    public void setBedNum(String bedNum) {
        this.bedNum = bedNum;
    }

    public String getEnddateStr() {
        return enddateStr;
    }

    public void setEnddateStr(String enddateStr) {
        this.enddateStr = enddateStr;
    }

    public String getEmgAre() {
        return emgAre;
    }

    public void setEmgAre(String emgAre) {
        this.emgAre = emgAre;
    }

    public String getCstDsp() {
        return cstDsp;
    }

    public void setCstDsp(String cstDsp) {
        this.cstDsp = cstDsp;
    }

    public String getFl() {
        return fl;
    }

    public void setFl(String fl) {
        this.fl = fl;
    }

    public String getCheckDocDatStr() {
        return checkDocDatStr;
    }

    public void setCheckDocDatStr(String checkDocDatStr) {
        this.checkDocDatStr = checkDocDatStr;
    }

    public String getCheckNurDatStr() {
        return checkNurDatStr;
    }

    public void setCheckNurDatStr(String checkNurDatStr) {
        this.checkNurDatStr = checkNurDatStr;
    }

    public String getRgAttendDocTor() {
        return rgAttendDocTor;
    }

    public void setRgAttendDocTor(String rgAttendDocTor) {
        this.rgAttendDocTor = rgAttendDocTor;
    }

    public String getCgAttendDocTor() {
        return cgAttendDocTor;
    }

    public void setCgAttendDocTor(String cgAttendDocTor) {
        this.cgAttendDocTor = cgAttendDocTor;
    }

    public String getCzFlg() {
        return czFlg;
    }

    public void setCzFlg(String czFlg) {
        this.czFlg = czFlg;
    }

    public String getRgDate() {
        return rgDate;
    }

    public void setRgDate(String rgDate) {
        this.rgDate = rgDate;
    }

    public String getRqDate() {
        return rqDate;
    }

    public void setRqDate(String rqDate) {
        this.rqDate = rqDate;
    }

    public String getClbzCod() {
        return clbzCod;
    }

    public void setClbzCod(String clbzCod) {
        this.clbzCod = clbzCod;
    }

    public String getJzlqblNam() {
        return jzlqblNam;
    }

    public void setJzlqblNam(String jzlqblNam) {
        this.jzlqblNam = jzlqblNam;
    }

    public String getQtsjNam() {
        return qtsjNam;
    }

    public void setQtsjNam(String qtsjNam) {
        this.qtsjNam = qtsjNam;
    }

    public Date getSqlDate() {
        return sqlDate;
    }

    public void setSqlDate(Date sqlDate) {
        this.sqlDate = sqlDate;
    }

    public String getBedPlace() {
        return bedPlace;
    }

    public void setBedPlace(String bedPlace) {
        this.bedPlace = bedPlace;
    }

    public String getActionCod() {
        return actionCod;
    }

    public void setActionCod(String actionCod) {
        this.actionCod = actionCod;
    }

    public String getXxgSkinCod() {
        return xxgSkinCod;
    }

    public void setXxgSkinCod(String xxgSkinCod) {
        this.xxgSkinCod = xxgSkinCod;
    }

    public String getXxgCrtCod() {
        return xxgCrtCod;
    }

    public void setXxgCrtCod(String xxgCrtCod) {
        this.xxgCrtCod = xxgCrtCod;
    }

    public String getXxgXlCod() {
        return xxgXlCod;
    }

    public void setXxgXlCod(String xxgXlCod) {
        this.xxgXlCod = xxgXlCod;
    }

    public String getHxPlCod() {
        return hxPlCod;
    }

    public void setHxPlCod(String hxPlCod) {
        this.hxPlCod = hxPlCod;
    }

    public String getHxXhCod() {
        return hxXhCod;
    }

    public void setHxXhCod(String hxXhCod) {
        this.hxXhCod = hxXhCod;
    }

    public String getHxFio2Cod() {
        return hxFio2Cod;
    }

    public void setHxFio2Cod(String hxFio2Cod) {
        this.hxFio2Cod = hxFio2Cod;
    }

    public Short getPewsSco() {
        return pewsSco;
    }

    public void setPewsSco(Short pewsSco) {
        this.pewsSco = pewsSco;
    }

    public String getIslgbed() {
        return islgbed;
    }

    public void setIslgbed(String islgbed) {
        this.islgbed = islgbed;
    }

    public String getMysjStr() {
        return mysjStr;
    }

    public void setMysjStr(String mysjStr) {
        this.mysjStr = mysjStr;
    }

    public String getMqsjStr() {
        return mqsjStr;
    }

    public void setMqsjStr(String mqsjStr) {
        this.mqsjStr = mqsjStr;
    }

    public String getFallAssCod() {
        return fallAssCod;
    }

    public void setFallAssCod(String fallAssCod) {
        this.fallAssCod = fallAssCod;
    }

    public String getSqlDatStr() {
        return sqlDatStr;
    }

    public void setSqlDatStr(String sqlDatStr) {
        this.sqlDatStr = sqlDatStr;
    }

    public String getBltype() {
        return bltype;
    }

    public void setBltype(String bltype) {
        this.bltype = bltype;
    }

    public String getMzCbzd() {
        return mzCbzd;
    }

    public void setMzCbzd(String mzCbzd) {
        this.mzCbzd = mzCbzd;
    }

    public String getMzZzzd() {
        return mzZzzd;
    }

    public void setMzZzzd(String mzZzzd) {
        this.mzZzzd = mzZzzd;
    }

    public String getJbzdType() {
        return jbzdType;
    }

    public void setJbzdType(String jbzdType) {
        this.jbzdType = jbzdType;
    }

    public Date getSqlDatNew() {
        return sqlDatNew;
    }

    public void setSqlDatNew(Date sqlDatNew) {
        this.sqlDatNew = sqlDatNew;
    }

    public String getWcdyFlag() {
        return wcdyFlag;
    }

    public void setWcdyFlag(String wcdyFlag) {
        this.wcdyFlag = wcdyFlag;
    }

    public String getTtgjcxFlag() {
        return ttgjcxFlag;
    }

    public void setTtgjcxFlag(String ttgjcxFlag) {
        this.ttgjcxFlag = ttgjcxFlag;
    }

    public String getHxdzzFlag() {
        return hxdzzFlag;
    }

    public void setHxdzzFlag(String hxdzzFlag) {
        this.hxdzzFlag = hxdzzFlag;
    }

    public String getYqyqFlag() {
        return yqyqFlag;
    }

    public void setYqyqFlag(String yqyqFlag) {
        this.yqyqFlag = yqyqFlag;
    }

    public String getQljcFlag() {
        return qljcFlag;
    }

    public void setQljcFlag(String qljcFlag) {
        this.qljcFlag = qljcFlag;
    }

    public String getFrDatStr() {
        return frDatStr;
    }

    public void setFrDatStr(String frDatStr) {
        this.frDatStr = frDatStr;
    }

    public String getSenStuCodName() {
        return senStuCodName;
    }

    public void setSenStuCodName(String senStuCodName) {
        this.senStuCodName = senStuCodName;
    }

    public String getMorseSco() {
        return morseSco;
    }

    public void setMorseSco(String morseSco) {
        this.morseSco = morseSco;
    }

    public String getGcsSco() {
        return gcsSco;
    }

    public void setGcsSco(String gcsSco) {
        this.gcsSco = gcsSco;
    }

    public Long getJzxhOld() {
        return jzxhOld;
    }

    public void setJzxhOld(Long jzxhOld) {
        this.jzxhOld = jzxhOld;
    }

    public String getNewEmgSeq() {
        return newEmgSeq;
    }

    public void setNewEmgSeq(String newEmgSeq) {
        this.newEmgSeq = newEmgSeq;
    }

    public String getScoIdArr() {
        return scoIdArr;
    }

    public void setScoIdArr(String scoIdArr) {
        this.scoIdArr = scoIdArr;
    }

    public String getArvChlCodNam() {
        return arvChlCodNam;
    }

    public void setArvChlCodNam(String arvChlCodNam) {
        this.arvChlCodNam = arvChlCodNam;
    }

    public String getCmpPsnCodNam() {
        return cmpPsnCodNam;
    }

    public void setCmpPsnCodNam(String cmpPsnCodNam) {
        this.cmpPsnCodNam = cmpPsnCodNam;
    }

    public String getScoIdType() {
        return scoIdType;
    }

    public void setScoIdType(String scoIdType) {
        this.scoIdType = scoIdType;
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }

    public String getPbgNbr() {
        return pbgNbr;
    }

    public void setPbgNbr(String pbgNbr) {
        this.pbgNbr = pbgNbr;
    }

    public String getPbgNbrFlg() {
        return pbgNbrFlg;
    }

    public void setPbgNbrFlg(String pbgNbrFlg) {
        this.pbgNbrFlg = pbgNbrFlg;
    }

    public String getDocDatStr() {
        return docDatStr;
    }

    public void setDocDatStr(String docDatStr) {
        this.docDatStr = docDatStr;
    }

    public String getGhsjStr() {
        return ghsjStr;
    }

    public void setGhsjStr(String ghsjStr) {
        this.ghsjStr = ghsjStr;
    }

    public String getCratNbr() {
        return cratNbr;
    }

    public void setCratNbr(String cratNbr) {
        this.cratNbr = cratNbr;
    }

    public String getCratNam() {
        return cratNam;
    }

    public void setCratNam(String cratNam) {
        this.cratNam = cratNam;
    }

    public String getMedHis() {
        return medHis;
    }

    public void setMedHis(String medHis) {
        this.medHis = medHis;
    }

    public String getDrugHis() {
        return drugHis;
    }

    public void setDrugHis(String drugHis) {
        this.drugHis = drugHis;
    }

    public String getGmsDes() {
        return gmsDes;
    }

    public void setGmsDes(String gmsDes) {
        this.gmsDes = gmsDes;
    }

    public String getOprtHis() {
        return oprtHis;
    }

    public void setOprtHis(String oprtHis) {
        this.oprtHis = oprtHis;
    }

    public String getTramHis() {
        return tramHis;
    }

    public void setTramHis(String tramHis) {
        this.tramHis = tramHis;
    }

    public String getCrbHis() {
        return crbHis;
    }

    public void setCrbHis(String crbHis) {
        this.crbHis = crbHis;
    }

    public String getObstHis() {
        return obstHis;
    }

    public void setObstHis(String obstHis) {
        this.obstHis = obstHis;
    }

    public String getLqblDes() {
        return lqblDes;
    }

    public void setLqblDes(String lqblDes) {
        this.lqblDes = lqblDes;
    }

    public String getFamlHis() {
        return famlHis;
    }

    public void setFamlHis(String famlHis) {
        this.famlHis = famlHis;
    }

    public String getCtnrDes() {
        return ctnrDes;
    }

    public void setCtnrDes(String ctnrDes) {
        this.ctnrDes = ctnrDes;
    }

    public String getFzjcDes() {
        return fzjcDes;
    }

    public void setFzjcDes(String fzjcDes) {
        this.fzjcDes = fzjcDes;
    }

    public String getZysx() {
        return zysx;
    }

    public void setZysx(String zysx) {
        this.zysx = zysx;
    }

    public String getHealthEducation() {
        return healthEducation;
    }

    public void setHealthEducation(String healthEducation) {
        this.healthEducation = healthEducation;
    }

    public String getLqblBrqx() {
        return lqblBrqx;
    }

    public void setLqblBrqx(String lqblBrqx) {
        this.lqblBrqx = lqblBrqx;
    }

    public String getTgjcMergeStr() {
        return tgjcMergeStr;
    }

    public void setTgjcMergeStr(String tgjcMergeStr) {
        this.tgjcMergeStr = tgjcMergeStr;
    }

    public String getLqblDatStr() {
        return lqblDatStr;
    }

    public void setLqblDatStr(String lqblDatStr) {
        this.lqblDatStr = lqblDatStr;
    }

    public String getLqblSeq() {
        return lqblSeq;
    }

    public void setLqblSeq(String lqblSeq) {
        this.lqblSeq = lqblSeq;
    }

    public String getOprtDatStr() {
        return oprtDatStr;
    }

    public void setOprtDatStr(String oprtDatStr) {
        this.oprtDatStr = oprtDatStr;
    }

    public String getIsBed() {
        return isBed;
    }

    public void setIsBed(String isBed) {
        this.isBed = isBed;
    }

    public int getLqFlag() {
        return lqFlag;
    }

    public void setLqFlag(int lqFlag) {
        this.lqFlag = lqFlag;
    }

    public Date getGhsj() {
        return ghsj;
    }

    public void setGhsj(Date ghsj) {
        this.ghsj = ghsj;
    }

    public String getWayTyp() {
        return wayTyp;
    }

    public void setWayTyp(String wayTyp) {
        this.wayTyp = wayTyp;
    }

    public String getKillip() {
        return killip;
    }

    public void setKillip(String killip) {
        this.killip = killip;
    }

    public Date getConsultationDate() {
        return consultationDate;
    }

    public void setConsultationDate(Date consultationDate) {
        this.consultationDate = consultationDate;
    }

    public String getRecordFlag() {
        return recordFlag;
    }

    public void setRecordFlag(String recordFlag) {
        this.recordFlag = recordFlag;
    }
}
