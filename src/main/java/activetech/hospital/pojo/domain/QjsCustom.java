package activetech.hospital.pojo.domain;

import java.util.Date;
import java.util.List;

/**
 * 抢救室病历记录单
 * 
 * @author fy
 * 
 */
public class QjsCustom {
	private String emgSeq; // 预检号
	private String tbSz; // 神志情况
	private String tbCzg; // 有无唇紫绀 0：无 1：有
	private String tbWglx; // 五官流血
	private String tbWglxDes; // 五官流血说明(字段合一)
	private String tbGmhr; // 有无巩膜黄染
	private String tbLefttk; // 左瞳孔(字段合一)
	private String tbRighttk; // 右瞳孔
	private String tbDgfyLeftCod; // 对光反应左（TB_DGFY）
	private String tbDgfyRightCod; // 对光反应右（TB_DGFY）
	private String jbDk; // 有无抵抗
	private String jbQgwzCod; // 气管位置
	private String jbJjmnzCod; // 有无颈静脉怒张
	private String xkJx; // 有无畸形
	private String xkJxDes; // 畸形情况(字段合一)
	private String xkFchx; // 有无反常呼吸
	private String xkFchxDes; // 反常呼吸情况(字段合一)
	private String xkJyt; // 有无挤压痛
	private String xkJytDes;//挤压痛情况
	private String fbHxydLeftCod; // 呼吸运动左(FB_HXYD)(字段合一)
	private String fbHxydRightCod; // 呼吸运动右(FB_HXYD)
	private String fbHxyLeftCod; // 呼吸音左（FB_HXY）(字段合一)
	private String fbHxyRightCod; // 呼吸音右（FB_HXY）
	private String fbLy; // 啰音
	private String fbLyDes; // 啰音情况(字段合一)
	private String xzTimes; // 心率
	private String xzXl; // 心律
	private String xzZy; // 杂音
	private String xzZyDes; // 杂音情况(字段合一)
	private String fbWx; // 外形
	private String fbFbjzd; // 腹壁紧张度
	private String fbBk; // 包块
	private String fbBkDes; // 包块情况(字段合一)
	private String fbFbyt; // 腹部压痛
	private String fbFbytDes; // 腹部压痛情况(字段合一)
	private String fbFtt; // 反跳痛
	private String fbFttDes; // 反跳痛情况(字段合一)
	private String fbYdxzy; // 移动性浊音
	private String fbYdxzyDes; // 移动性浊音情况
	private String fbSqkt; // 肾区叩痛
	private String fbSqktDes; // 肾区叩痛
	private String fbFggzk; // 腹股沟肿块
	private String fbFggzkDes; // 腹股沟肿块情况(字段合一)
	private String fbGmzz; // 肛门指诊
	private String gpjzGpjyt; // 骨盆挤压痛
	private String gpjzJzyt; // 脊柱压痛
	private String gpjzJzytDes;// 脊柱压痛情况(字段合一)
	private String szJx;// 畸形
	private String szJxDes;// 畸形情况(字段合一)
	private String szHzmbbd;// 患肢脉搏搏动
	private String szLxzfz;// 两下肢浮肿
	private String sjLsj; // 颅神经
	private String sjSzjlSzz;// 四肢肌力上肢左(字段合一)
	private String sjSzjlSzy;// 四肢肌力上肢右
	private String sjSzjlXzz;// 四肢肌力下肢左(字段合一)
	private String sjSzjlXzy;// 四肢肌力下肢右
	private String sjSzjlSzDes;//四肢肌力上肢情况
	private String sjSzjlXzDes;//四肢肌力下肢情况
	private String sjJzlLeftCod;// 肌张力左(SJ_JZL)(字段合一)
	private String sjJzlRightCod;// 肌张力右(SJ_JZL)
	private String sjBlfsLeftCod;// 病理反射左(SJ_BLFS)(字段合一)
	private String sjBlfsRightCod;// 病理反射右(SJ_BLFS)
	private String sjSqgj;// 深浅感觉
	private String sjSqgjDes;// 深浅感觉情况(字段合一)
	private String ckCk;// 创口
	private String ckCkDes;// 创口情况(字段合一)
	private String csbwCsbw;// 创伤部位
	
	private String tgjcCreateNbr;//体格检查创建医生
	private Date tgjcCreateDat;//体格检查创建日期
	private String fzjcCreateNbr;//医嘱信息创建医生
	private Date fzjcCreateDat;//医嘱信息创建日期

	private String nowHis; // 现病史
	private String pastHis; // 既往史
	private String caseHis; // 病历
	private String isFetation; // 是否怀孕（IS_FETATION）
	private String symSitDes; // 主述症状

	private String updateDat;// 修改时间
	private String updateNbr; // 修改人

	private String cstNam;// 患者姓名
	private String cstSexCod;// 患者性别
	private String cstAge;// 患者年龄
	private String emgJob; // 工作
	private String maritalStatus; // 结婚状况
	private String emgBed; // 床位

	private String daodFs;// 到达方式
	private String arvChlCod;// 入院方式
	private String grnChl;// 绿色通道
	private String emgDepCod;// 预检分级
	private String preDgnCod;// 初步诊断
	private String tgjcOther;// 体格 其他
	
	private String fzjcOther;// 皮试 其他
	private String fzjcPs1;// 皮试项目1
	private String fzjcPsDes1;// 皮试结果1
	private String fzjcPs2;// 皮试项目2
	private String fzjcPsDes2;// 皮试结果2
	private String fzjcXgtlWzjm;//外周静脉
	private String fzjcXgtlWzjmDes;//外周静脉部位(字段合一)
	private String fzjcXgtlDm;//动脉
	private String fzjcXgtlDmDes;//动脉部位
	private String fzjcXgtlZxjm;//中心静脉
	private String fzjcXgtlZxjmDes;//中心静脉部位
	private String fzjcXgtlDes;//其他检查项
	private String fzjcXdt12dxdt;//12导心电图(字段合一)
    private String fzjcXdt18dxdt;//18导心电图
    
    private String fzjcBxShxb;//输红细胞（备血：字段归一）
    private String fzjcBxShxbDes;//输红细胞量
    private String fzjcBxSxj;//输血浆
    private String fzjcBxSxjDes;//输血浆量
    private String fzjcBxSxqyy;//输血前用药
    private String fzjcBxSxqyyDes;//输血前用药量
    
    private String blbcDat;//病程时间
    private String bqDes;//病情记录
    private String crtusrnme;//登记用户名（签名）
    
    private String cstDepCod;//会诊科室
    private String cstDat;//会诊日期
    private String cstDctNme;//会诊医生
    private String cstTzDat;//通知时间
    private String cstDdDat;//到达时间
    private String cstNurNbr;//责任护士
    private String cstComn;//会诊意见
    
    private String yzDat;//日期
    private String yzTyp;//类型
    private String yzProject;//项目
    private String yzDoctor;//医生
    private String yzExeDat;//执行时间
    private String yzExeNur;//护士
    private String yzDrugSpec;//剂量
    private String yzRoute;//用法
    private String yzDrugNum;//数量
    private String yzGroup;//组别
    private String yzCheckNur;//核对护士
    
    private List<QjsCustom> qjssublist;// 留抢病历病程记录
    private List<QjsCustom> yzsublist;// 抢救室医嘱
    private List<QjsCustom> hzqksublist;// 会诊情况记录
    
    //add 20180726
    private String fzjcExeNurnam;//皮试护士签名
    private String fzjcCheckNurnam;//核对护士签名
    
	public String getYzDrugSpec() {
		return yzDrugSpec;
	}

	public void setYzDrugSpec(String yzDrugSpec) {
		this.yzDrugSpec = yzDrugSpec;
	}

	public String getYzRoute() {
		return yzRoute;
	}

	public void setYzRoute(String yzRoute) {
		this.yzRoute = yzRoute;
	}

	public String getYzDrugNum() {
		return yzDrugNum;
	}

	public void setYzDrugNum(String yzDrugNum) {
		this.yzDrugNum = yzDrugNum;
	}

	public String getYzGroup() {
		return yzGroup;
	}

	public void setYzGroup(String yzGroup) {
		this.yzGroup = yzGroup;
	}

	public String getYzCheckNur() {
		return yzCheckNur;
	}

	public void setYzCheckNur(String yzCheckNur) {
		this.yzCheckNur = yzCheckNur;
	}

	public String getFzjcExeNurnam() {
		return fzjcExeNurnam;
	}

	public void setFzjcExeNurnam(String fzjcExeNurnam) {
		this.fzjcExeNurnam = fzjcExeNurnam;
	}

	public String getFzjcCheckNurnam() {
		return fzjcCheckNurnam;
	}

	public void setFzjcCheckNurnam(String fzjcCheckNurnam) {
		this.fzjcCheckNurnam = fzjcCheckNurnam;
	}

	public String getFzjcCreateNbr() {
		return fzjcCreateNbr;
	}

	public void setFzjcCreateNbr(String fzjcCreateNbr) {
		this.fzjcCreateNbr = fzjcCreateNbr;
	}

	public Date getFzjcCreateDat() {
		return fzjcCreateDat;
	}

	public void setFzjcCreateDat(Date fzjcCreateDat) {
		this.fzjcCreateDat = fzjcCreateDat;
	}

	public String getTgjcCreateNbr() {
		return tgjcCreateNbr;
	}

	public void setTgjcCreateNbr(String tgjcCreateNbr) {
		this.tgjcCreateNbr = tgjcCreateNbr;
	}

	public Date getTgjcCreateDat() {
		return tgjcCreateDat;
	}

	public void setTgjcCreateDat(Date tgjcCreateDat) {
		this.tgjcCreateDat = tgjcCreateDat;
	}

	public String getXkJytDes() {
		return xkJytDes;
	}

	public void setXkJytDes(String xkJytDes) {
		this.xkJytDes = xkJytDes;
	}

	public String getFbYdxzyDes() {
		return fbYdxzyDes;
	}

	public void setFbYdxzyDes(String fbYdxzyDes) {
		this.fbYdxzyDes = fbYdxzyDes;
	}

	public String getFbSqktDes() {
		return fbSqktDes;
	}

	public void setFbSqktDes(String fbSqktDes) {
		this.fbSqktDes = fbSqktDes;
	}

	public String getSjSzjlSzDes() {
		return sjSzjlSzDes;
	}

	public void setSjSzjlSzDes(String sjSzjlSzDes) {
		this.sjSzjlSzDes = sjSzjlSzDes;
	}

	public String getSjSzjlXzDes() {
		return sjSzjlXzDes;
	}

	public void setSjSzjlXzDes(String sjSzjlXzDes) {
		this.sjSzjlXzDes = sjSzjlXzDes;
	}

	public String getYzTyp() {
		return yzTyp;
	}

	public void setYzTyp(String yzTyp) {
		this.yzTyp = yzTyp;
	}

	public String getCstComn() {
		return cstComn;
	}

	public void setCstComn(String cstComn) {
		this.cstComn = cstComn;
	}

	public String getYzDat() {
		return yzDat;
	}

	public void setYzDat(String yzDat) {
		this.yzDat = yzDat;
	}

	public String getYzProject() {
		return yzProject;
	}

	public void setYzProject(String yzProject) {
		this.yzProject = yzProject;
	}

	public String getYzDoctor() {
		return yzDoctor;
	}

	public void setYzDoctor(String yzDoctor) {
		this.yzDoctor = yzDoctor;
	}

	public String getYzExeDat() {
		return yzExeDat;
	}

	public void setYzExeDat(String yzExeDat) {
		this.yzExeDat = yzExeDat;
	}

	public String getYzExeNur() {
		return yzExeNur;
	}

	public void setYzExeNur(String yzExeNur) {
		this.yzExeNur = yzExeNur;
	}

	public List<QjsCustom> getYzsublist() {
		return yzsublist;
	}

	public void setYzsublist(List<QjsCustom> yzsublist) {
		this.yzsublist = yzsublist;
	}

	public List<QjsCustom> getHzqksublist() {
		return hzqksublist;
	}

	public void setHzqksublist(List<QjsCustom> hzqksublist) {
		this.hzqksublist = hzqksublist;
	}

	public String getCstDepCod() {
		return cstDepCod;
	}

	public void setCstDepCod(String cstDepCod) {
		this.cstDepCod = cstDepCod;
	}

	public String getCstDat() {
		return cstDat;
	}

	public void setCstDat(String cstDat) {
		this.cstDat = cstDat;
	}

	public String getCstDctNme() {
		return cstDctNme;
	}

	public void setCstDctNme(String cstDctNme) {
		this.cstDctNme = cstDctNme;
	}

	public String getCstTzDat() {
		return cstTzDat;
	}

	public void setCstTzDat(String cstTzDat) {
		this.cstTzDat = cstTzDat;
	}

	public String getCstDdDat() {
		return cstDdDat;
	}

	public void setCstDdDat(String cstDdDat) {
		this.cstDdDat = cstDdDat;
	}

	public String getCstNurNbr() {
		return cstNurNbr;
	}

	public void setCstNurNbr(String cstNurNbr) {
		this.cstNurNbr = cstNurNbr;
	}

	public String getDaodFs() {
		return daodFs;
	}

	public void setDaodFs(String daodFs) {
		this.daodFs = daodFs;
	}

	public String getArvChlCod() {
		return arvChlCod;
	}

	public void setArvChlCod(String arvChlCod) {
		this.arvChlCod = arvChlCod;
	}

	public String getGrnChl() {
		return grnChl;
	}

	public void setGrnChl(String grnChl) {
		this.grnChl = grnChl;
	}

	public String getEmgDepCod() {
		return emgDepCod;
	}

	public void setEmgDepCod(String emgDepCod) {
		this.emgDepCod = emgDepCod;
	}

	public String getPreDgnCod() {
		return preDgnCod;
	}

	public void setPreDgnCod(String preDgnCod) {
		this.preDgnCod = preDgnCod;
	}

	public String getTgjcOther() {
		return tgjcOther;
	}

	public void setTgjcOther(String tgjcOther) {
		this.tgjcOther = tgjcOther;
	}

	public String getFzjcOther() {
		return fzjcOther;
	}

	public void setFzjcOther(String fzjcOther) {
		this.fzjcOther = fzjcOther;
	}

	public String getFzjcPs1() {
		return fzjcPs1;
	}

	public void setFzjcPs1(String fzjcPs1) {
		this.fzjcPs1 = fzjcPs1;
	}

	public String getFzjcPsDes1() {
		return fzjcPsDes1;
	}

	public void setFzjcPsDes1(String fzjcPsDes1) {
		this.fzjcPsDes1 = fzjcPsDes1;
	}

	public String getFzjcPs2() {
		return fzjcPs2;
	}

	public void setFzjcPs2(String fzjcPs2) {
		this.fzjcPs2 = fzjcPs2;
	}

	public String getFzjcPsDes2() {
		return fzjcPsDes2;
	}

	public void setFzjcPsDes2(String fzjcPsDes2) {
		this.fzjcPsDes2 = fzjcPsDes2;
	}

	public String getFzjcXgtlWzjm() {
		return fzjcXgtlWzjm;
	}

	public void setFzjcXgtlWzjm(String fzjcXgtlWzjm) {
		this.fzjcXgtlWzjm = fzjcXgtlWzjm;
	}

	public String getFzjcXgtlWzjmDes() {
		return fzjcXgtlWzjmDes;
	}

	public void setFzjcXgtlWzjmDes(String fzjcXgtlWzjmDes) {
		this.fzjcXgtlWzjmDes = fzjcXgtlWzjmDes;
	}

	public String getFzjcXgtlDm() {
		return fzjcXgtlDm;
	}

	public void setFzjcXgtlDm(String fzjcXgtlDm) {
		this.fzjcXgtlDm = fzjcXgtlDm;
	}

	public String getFzjcXgtlDmDes() {
		return fzjcXgtlDmDes;
	}

	public void setFzjcXgtlDmDes(String fzjcXgtlDmDes) {
		this.fzjcXgtlDmDes = fzjcXgtlDmDes;
	}

	public String getFzjcXgtlZxjm() {
		return fzjcXgtlZxjm;
	}

	public void setFzjcXgtlZxjm(String fzjcXgtlZxjm) {
		this.fzjcXgtlZxjm = fzjcXgtlZxjm;
	}

	public String getFzjcXgtlZxjmDes() {
		return fzjcXgtlZxjmDes;
	}

	public void setFzjcXgtlZxjmDes(String fzjcXgtlZxjmDes) {
		this.fzjcXgtlZxjmDes = fzjcXgtlZxjmDes;
	}

	public String getFzjcXgtlDes() {
		return fzjcXgtlDes;
	}

	public void setFzjcXgtlDes(String fzjcXgtlDes) {
		this.fzjcXgtlDes = fzjcXgtlDes;
	}

	public String getFzjcXdt12dxdt() {
		return fzjcXdt12dxdt;
	}

	public void setFzjcXdt12dxdt(String fzjcXdt12dxdt) {
		this.fzjcXdt12dxdt = fzjcXdt12dxdt;
	}

	public String getFzjcXdt18dxdt() {
		return fzjcXdt18dxdt;
	}

	public void setFzjcXdt18dxdt(String fzjcXdt18dxdt) {
		this.fzjcXdt18dxdt = fzjcXdt18dxdt;
	}

	public String getFzjcBxShxb() {
		return fzjcBxShxb;
	}

	public void setFzjcBxShxb(String fzjcBxShxb) {
		this.fzjcBxShxb = fzjcBxShxb;
	}

	public String getFzjcBxShxbDes() {
		return fzjcBxShxbDes;
	}

	public void setFzjcBxShxbDes(String fzjcBxShxbDes) {
		this.fzjcBxShxbDes = fzjcBxShxbDes;
	}

	public String getFzjcBxSxj() {
		return fzjcBxSxj;
	}

	public void setFzjcBxSxj(String fzjcBxSxj) {
		this.fzjcBxSxj = fzjcBxSxj;
	}

	public String getFzjcBxSxjDes() {
		return fzjcBxSxjDes;
	}

	public void setFzjcBxSxjDes(String fzjcBxSxjDes) {
		this.fzjcBxSxjDes = fzjcBxSxjDes;
	}

	public String getFzjcBxSxqyy() {
		return fzjcBxSxqyy;
	}

	public void setFzjcBxSxqyy(String fzjcBxSxqyy) {
		this.fzjcBxSxqyy = fzjcBxSxqyy;
	}

	public String getFzjcBxSxqyyDes() {
		return fzjcBxSxqyyDes;
	}

	public void setFzjcBxSxqyyDes(String fzjcBxSxqyyDes) {
		this.fzjcBxSxqyyDes = fzjcBxSxqyyDes;
	}

	public String getBlbcDat() {
		return blbcDat;
	}

	public void setBlbcDat(String blbcDat) {
		this.blbcDat = blbcDat;
	}

	public String getBqDes() {
		return bqDes;
	}

	public void setBqDes(String bqDes) {
		this.bqDes = bqDes;
	}

	public String getCrtusrnme() {
		return crtusrnme;
	}

	public void setCrtusrnme(String crtusrnme) {
		this.crtusrnme = crtusrnme;
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

	public String getCstAge() {
		return cstAge;
	}

	public void setCstAge(String cstAge) {
		this.cstAge = cstAge;
	}

	public List<QjsCustom> getQjssublist() {
		return qjssublist;
	}

	public void setQjssublist(List<QjsCustom> qjssublist) {
		this.qjssublist = qjssublist;
	}

	public String getEmgSeq() {
		return emgSeq;
	}

	public void setEmgSeq(String emgSeq) {
		this.emgSeq = emgSeq;
	}

	public String getTbSz() {
		return tbSz;
	}

	public void setTbSz(String tbSz) {
		this.tbSz = tbSz;
	}

	public String getTbCzg() {
		return tbCzg;
	}

	public void setTbCzg(String tbCzg) {
		this.tbCzg = tbCzg;
	}

	public String getTbWglx() {
		return tbWglx;
	}

	public void setTbWglx(String tbWglx) {
		this.tbWglx = tbWglx;
	}

	public String getTbWglxDes() {
		return tbWglxDes;
	}

	public void setTbWglxDes(String tbWglxDes) {
		this.tbWglxDes = tbWglxDes;
	}

	public String getTbGmhr() {
		return tbGmhr;
	}

	public void setTbGmhr(String tbGmhr) {
		this.tbGmhr = tbGmhr;
	}

	public String getTbLefttk() {
		return tbLefttk;
	}

	public void setTbLefttk(String tbLefttk) {
		this.tbLefttk = tbLefttk;
	}

	public String getTbRighttk() {
		return tbRighttk;
	}

	public void setTbRighttk(String tbRighttk) {
		this.tbRighttk = tbRighttk;
	}

	public String getTbDgfyLeftCod() {
		return tbDgfyLeftCod;
	}

	public void setTbDgfyLeftCod(String tbDgfyLeftCod) {
		this.tbDgfyLeftCod = tbDgfyLeftCod;
	}

	public String getTbDgfyRightCod() {
		return tbDgfyRightCod;
	}

	public void setTbDgfyRightCod(String tbDgfyRightCod) {
		this.tbDgfyRightCod = tbDgfyRightCod;
	}

	public String getJbDk() {
		return jbDk;
	}

	public void setJbDk(String jbDk) {
		this.jbDk = jbDk;
	}

	public String getJbQgwzCod() {
		return jbQgwzCod;
	}

	public void setJbQgwzCod(String jbQgwzCod) {
		this.jbQgwzCod = jbQgwzCod;
	}

	public String getJbJjmnzCod() {
		return jbJjmnzCod;
	}

	public void setJbJjmnzCod(String jbJjmnzCod) {
		this.jbJjmnzCod = jbJjmnzCod;
	}

	public String getXkJx() {
		return xkJx;
	}

	public void setXkJx(String xkJx) {
		this.xkJx = xkJx;
	}

	public String getXkJxDes() {
		return xkJxDes;
	}

	public void setXkJxDes(String xkJxDes) {
		this.xkJxDes = xkJxDes;
	}

	public String getXkFchx() {
		return xkFchx;
	}

	public void setXkFchx(String xkFchx) {
		this.xkFchx = xkFchx;
	}

	public String getXkFchxDes() {
		return xkFchxDes;
	}

	public void setXkFchxDes(String xkFchxDes) {
		this.xkFchxDes = xkFchxDes;
	}

	public String getXkJyt() {
		return xkJyt;
	}

	public void setXkJyt(String xkJyt) {
		this.xkJyt = xkJyt;
	}

	public String getFbHxydLeftCod() {
		return fbHxydLeftCod;
	}

	public void setFbHxydLeftCod(String fbHxydLeftCod) {
		this.fbHxydLeftCod = fbHxydLeftCod;
	}

	public String getFbHxydRightCod() {
		return fbHxydRightCod;
	}

	public void setFbHxydRightCod(String fbHxydRightCod) {
		this.fbHxydRightCod = fbHxydRightCod;
	}

	public String getFbHxyLeftCod() {
		return fbHxyLeftCod;
	}

	public void setFbHxyLeftCod(String fbHxyLeftCod) {
		this.fbHxyLeftCod = fbHxyLeftCod;
	}

	public String getFbHxyRightCod() {
		return fbHxyRightCod;
	}

	public void setFbHxyRightCod(String fbHxyRightCod) {
		this.fbHxyRightCod = fbHxyRightCod;
	}

	public String getFbLy() {
		return fbLy;
	}

	public void setFbLy(String fbLy) {
		this.fbLy = fbLy;
	}

	public String getFbLyDes() {
		return fbLyDes;
	}

	public void setFbLyDes(String fbLyDes) {
		this.fbLyDes = fbLyDes;
	}

	public String getXzTimes() {
		return xzTimes;
	}

	public void setXzTimes(String xzTimes) {
		this.xzTimes = xzTimes;
	}

	public String getXzXl() {
		return xzXl;
	}

	public void setXzXl(String xzXl) {
		this.xzXl = xzXl;
	}

	public String getXzZy() {
		return xzZy;
	}

	public void setXzZy(String xzZy) {
		this.xzZy = xzZy;
	}

	public String getXzZyDes() {
		return xzZyDes;
	}

	public void setXzZyDes(String xzZyDes) {
		this.xzZyDes = xzZyDes;
	}

	public String getFbWx() {
		return fbWx;
	}

	public void setFbWx(String fbWx) {
		this.fbWx = fbWx;
	}

	public String getFbFbjzd() {
		return fbFbjzd;
	}

	public void setFbFbjzd(String fbFbjzd) {
		this.fbFbjzd = fbFbjzd;
	}

	public String getFbBk() {
		return fbBk;
	}

	public void setFbBk(String fbBk) {
		this.fbBk = fbBk;
	}

	public String getFbBkDes() {
		return fbBkDes;
	}

	public void setFbBkDes(String fbBkDes) {
		this.fbBkDes = fbBkDes;
	}

	public String getFbFbyt() {
		return fbFbyt;
	}

	public void setFbFbyt(String fbFbyt) {
		this.fbFbyt = fbFbyt;
	}

	public String getFbFbytDes() {
		return fbFbytDes;
	}

	public void setFbFbytDes(String fbFbytDes) {
		this.fbFbytDes = fbFbytDes;
	}

	public String getFbFtt() {
		return fbFtt;
	}

	public void setFbFtt(String fbFtt) {
		this.fbFtt = fbFtt;
	}

	public String getFbFttDes() {
		return fbFttDes;
	}

	public void setFbFttDes(String fbFttDes) {
		this.fbFttDes = fbFttDes;
	}

	public String getFbYdxzy() {
		return fbYdxzy;
	}

	public void setFbYdxzy(String fbYdxzy) {
		this.fbYdxzy = fbYdxzy;
	}

	public String getFbSqkt() {
		return fbSqkt;
	}

	public void setFbSqkt(String fbSqkt) {
		this.fbSqkt = fbSqkt;
	}

	public String getFbFggzk() {
		return fbFggzk;
	}

	public void setFbFggzk(String fbFggzk) {
		this.fbFggzk = fbFggzk;
	}

	public String getFbFggzkDes() {
		return fbFggzkDes;
	}

	public void setFbFggzkDes(String fbFggzkDes) {
		this.fbFggzkDes = fbFggzkDes;
	}

	public String getFbGmzz() {
		return fbGmzz;
	}

	public void setFbGmzz(String fbGmzz) {
		this.fbGmzz = fbGmzz;
	}

	public String getGpjzGpjyt() {
		return gpjzGpjyt;
	}

	public void setGpjzGpjyt(String gpjzGpjyt) {
		this.gpjzGpjyt = gpjzGpjyt;
	}

	public String getGpjzJzyt() {
		return gpjzJzyt;
	}

	public void setGpjzJzyt(String gpjzJzyt) {
		this.gpjzJzyt = gpjzJzyt;
	}

	public String getGpjzJzytDes() {
		return gpjzJzytDes;
	}

	public void setGpjzJzytDes(String gpjzJzytDes) {
		this.gpjzJzytDes = gpjzJzytDes;
	}

	public String getSzJx() {
		return szJx;
	}

	public void setSzJx(String szJx) {
		this.szJx = szJx;
	}

	public String getSzJxDes() {
		return szJxDes;
	}

	public void setSzJxDes(String szJxDes) {
		this.szJxDes = szJxDes;
	}

	public String getSzHzmbbd() {
		return szHzmbbd;
	}

	public void setSzHzmbbd(String szHzmbbd) {
		this.szHzmbbd = szHzmbbd;
	}

	public String getSzLxzfz() {
		return szLxzfz;
	}

	public void setSzLxzfz(String szLxzfz) {
		this.szLxzfz = szLxzfz;
	}

	public String getSjLsj() {
		return sjLsj;
	}

	public void setSjLsj(String sjLsj) {
		this.sjLsj = sjLsj;
	}

	public String getSjSzjlSzz() {
		return sjSzjlSzz;
	}

	public void setSjSzjlSzz(String sjSzjlSzz) {
		this.sjSzjlSzz = sjSzjlSzz;
	}

	public String getSjSzjlSzy() {
		return sjSzjlSzy;
	}

	public void setSjSzjlSzy(String sjSzjlSzy) {
		this.sjSzjlSzy = sjSzjlSzy;
	}

	public String getSjSzjlXzz() {
		return sjSzjlXzz;
	}

	public void setSjSzjlXzz(String sjSzjlXzz) {
		this.sjSzjlXzz = sjSzjlXzz;
	}

	public String getSjSzjlXzy() {
		return sjSzjlXzy;
	}

	public void setSjSzjlXzy(String sjSzjlXzy) {
		this.sjSzjlXzy = sjSzjlXzy;
	}

	public String getSjJzlLeftCod() {
		return sjJzlLeftCod;
	}

	public void setSjJzlLeftCod(String sjJzlLeftCod) {
		this.sjJzlLeftCod = sjJzlLeftCod;
	}

	public String getSjJzlRightCod() {
		return sjJzlRightCod;
	}

	public void setSjJzlRightCod(String sjJzlRightCod) {
		this.sjJzlRightCod = sjJzlRightCod;
	}

	public String getSjBlfsLeftCod() {
		return sjBlfsLeftCod;
	}

	public void setSjBlfsLeftCod(String sjBlfsLeftCod) {
		this.sjBlfsLeftCod = sjBlfsLeftCod;
	}

	public String getSjBlfsRightCod() {
		return sjBlfsRightCod;
	}

	public void setSjBlfsRightCod(String sjBlfsRightCod) {
		this.sjBlfsRightCod = sjBlfsRightCod;
	}

	public String getSjSqgj() {
		return sjSqgj;
	}

	public void setSjSqgj(String sjSqgj) {
		this.sjSqgj = sjSqgj;
	}

	public String getSjSqgjDes() {
		return sjSqgjDes;
	}

	public void setSjSqgjDes(String sjSqgjDes) {
		this.sjSqgjDes = sjSqgjDes;
	}

	public String getCkCk() {
		return ckCk;
	}

	public void setCkCk(String ckCk) {
		this.ckCk = ckCk;
	}

	public String getCkCkDes() {
		return ckCkDes;
	}

	public void setCkCkDes(String ckCkDes) {
		this.ckCkDes = ckCkDes;
	}

	public String getCsbwCsbw() {
		return csbwCsbw;
	}

	public void setCsbwCsbw(String csbwCsbw) {
		this.csbwCsbw = csbwCsbw;
	}

	public String getUpdateDat() {
		return updateDat;
	}

	public void setUpdateDat(String updateDat) {
		this.updateDat = updateDat;
	}

	public String getUpdateNbr() {
		return updateNbr;
	}

	public void setUpdateNbr(String updateNbr) {
		this.updateNbr = updateNbr;
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

	public String getEmgBed() {
		return emgBed;
	}

	public void setEmgBed(String emgBed) {
		this.emgBed = emgBed;
	}

	public String getNowHis() {
		return nowHis;
	}

	public void setNowHis(String nowHis) {
		this.nowHis = nowHis;
	}

	public String getPastHis() {
		return pastHis;
	}

	public void setPastHis(String pastHis) {
		this.pastHis = pastHis;
	}

	public String getCaseHis() {
		return caseHis;
	}

	public void setCaseHis(String caseHis) {
		this.caseHis = caseHis;
	}

	public String getIsFetation() {
		return isFetation;
	}

	public void setIsFetation(String isFetation) {
		this.isFetation = isFetation;
	}

	public String getSymSitDes() {
		return symSitDes;
	}

	public void setSymSitDes(String symSitDes) {
		this.symSitDes = symSitDes;
	}

}
