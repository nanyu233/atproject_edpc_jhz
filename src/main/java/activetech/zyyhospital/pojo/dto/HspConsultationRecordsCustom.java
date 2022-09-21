package activetech.zyyhospital.pojo.dto;

import java.util.List;

import activetech.basehis.pojo.dto.HspAotographInfoCustom;
import activetech.zyyhospital.pojo.domain.HspConsultationRecords;

public class HspConsultationRecordsCustom extends HspConsultationRecords {

	private String cstNam;
	private String cstAge;
	private String emgBed;
	private String cstSexCod; 
	private String vstCad;
	private String observationCode; //留观号
	private String applyCreateDateStr;  //申请创建时间字符
	private String invitationDateStr;  //邀请会诊时间字符
	private String consultationDateStr; //会诊时间字符
	private String replyCreateDateStr; //答复创建时间
	private String applyUpdateDateStr; //申请修改时间
	private String replyUpdateDateStr; //答复修改时间
	private String applyUpdateDocName; //申请修改医生名字
	private String replyUpdateDocName; //答复修改医生名字
	private String invitationDepStr; //被邀请医生科室字符
	private String applyDepStr; //申请医生科室字符
	private String replyDepStr; //答复医生科室字符
	
	private int zgcount;
	private int avgtime;//会诊平均时间
	private String querydate; //查询日期
	//判断是从在那个页面请求的数据（判断是否需要分页 queryQjs则不需要分页）
	private String pageName;
	private String mpi;
	
	private List<HspAotographInfoCustom> hspAotographInfoApplyList;
	private List<HspAotographInfoCustom> hspAotographInfoReplyList;
	
	private String qdFlg;//签到Flag
	
	public String getQdFlg() {
		return qdFlg;
	}
	public void setQdFlg(String qdFlg) {
		this.qdFlg = qdFlg;
	}
	public List<HspAotographInfoCustom> getHspAotographInfoApplyList() {
		return hspAotographInfoApplyList;
	}
	public void setHspAotographInfoApplyList(List<HspAotographInfoCustom> hspAotographInfoApplyList) {
		this.hspAotographInfoApplyList = hspAotographInfoApplyList;
	}
	public List<HspAotographInfoCustom> getHspAotographInfoReplyList() {
		return hspAotographInfoReplyList;
	}
	public void setHspAotographInfoReplyList(List<HspAotographInfoCustom> hspAotographInfoReplyList) {
		this.hspAotographInfoReplyList = hspAotographInfoReplyList;
	}
	public String getMpi() {
		return mpi;
	}
	public void setMpi(String mpi) {
		this.mpi = mpi;
	}
	public String getVstCad() {
		return vstCad;
	}
	public void setVstCad(String vstCad) {
		this.vstCad = vstCad;
	}
	public String getCstNam() {
		return cstNam;
	}
	public void setCstNam(String cstNam) {
		this.cstNam = cstNam;
	}
	public String getCstAge() {
		return cstAge;
	}
	public void setCstAge(String cstAge) {
		this.cstAge = cstAge;
	}
	public String getEmgBed() {
		return emgBed;
	}
	public void setEmgBed(String emgBed) {
		this.emgBed = emgBed;
	}
	public String getCstSexCod() {
		return cstSexCod;
	}
	public void setCstSexCod(String cstSexCod) {
		this.cstSexCod = cstSexCod;
	}
	public String getObservationCode() {
		return observationCode;
	}
	public void setObservationCode(String observationCode) {
		this.observationCode = observationCode;
	}
	public String getApplyCreateDateStr() {
		return applyCreateDateStr;
	}
	public void setApplyCreateDateStr(String applyCreateDateStr) {
		this.applyCreateDateStr = applyCreateDateStr;
	}
	public String getInvitationDateStr() {
		return invitationDateStr;
	}
	public void setInvitationDateStr(String invitationDateStr) {
		this.invitationDateStr = invitationDateStr;
	}
	public String getConsultationDateStr() {
		return consultationDateStr;
	}
	public void setConsultationDateStr(String consultationDateStr) {
		this.consultationDateStr = consultationDateStr;
	}
	public String getReplyCreateDateStr() {
		return replyCreateDateStr;
	}
	public void setReplyCreateDateStr(String replyCreateDateStr) {
		this.replyCreateDateStr = replyCreateDateStr;
	}
	public String getApplyUpdateDateStr() {
		return applyUpdateDateStr;
	}
	public void setApplyUpdateDateStr(String applyUpdateDateStr) {
		this.applyUpdateDateStr = applyUpdateDateStr;
	}
	public String getReplyUpdateDateStr() {
		return replyUpdateDateStr;
	}
	public void setReplyUpdateDateStr(String replyUpdateDateStr) {
		this.replyUpdateDateStr = replyUpdateDateStr;
	}
	public String getApplyUpdateDocName() {
		return applyUpdateDocName;
	}
	public void setApplyUpdateDocName(String applyUpdateDocName) {
		this.applyUpdateDocName = applyUpdateDocName;
	}
	public String getReplyUpdateDocName() {
		return replyUpdateDocName;
	}
	public void setReplyUpdateDocName(String replyUpdateDocName) {
		this.replyUpdateDocName = replyUpdateDocName;
	}
	public String getInvitationDepStr() {
		return invitationDepStr;
	}
	public void setInvitationDepStr(String invitationDepStr) {
		this.invitationDepStr = invitationDepStr;
	}
	public String getApplyDepStr() {
		return applyDepStr;
	}
	public void setApplyDepStr(String applyDepStr) {
		this.applyDepStr = applyDepStr;
	}
	public String getReplyDepStr() {
		return replyDepStr;
	}
	public void setReplyDepStr(String replyDepStr) {
		this.replyDepStr = replyDepStr;
	}
	public int getZgcount() {
		return zgcount;
	}
	public void setZgcount(int zgcount) {
		this.zgcount = zgcount;
	}
	public int getAvgtime() {
		return avgtime;
	}
	public void setAvgtime(int avgtime) {
		this.avgtime = avgtime;
	}
	public String getQuerydate() {
		return querydate;
	}
	public void setQuerydate(String querydate) {
		this.querydate = querydate;
	}
	
	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
}
