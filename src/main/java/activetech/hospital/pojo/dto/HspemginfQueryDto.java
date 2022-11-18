package activetech.hospital.pojo.dto;

import java.util.Date;
import java.util.List;
import java.util.Map;

import activetech.base.pojo.dto.PageQuery;
import activetech.zyyhospital.pojo.dto.HspDdfxpgbInfCustom;
import activetech.zyyhospital.pojo.dto.HspFallAssInfCustom;
import activetech.zyyhospital.pojo.dto.HspFrbrInfCustom;
import activetech.zyyhospital.pojo.dto.HspGcsInfCustom;
import activetech.zyyhospital.pojo.dto.HspHlpgbCustom;
import activetech.zyyhospital.pojo.dto.HspNrsInfCustom;
import activetech.zyyhospital.pojo.dto.HspPewsckInfCustom;

/**
 * 
 * <p>Title:HspemginfQueryDto</p>
 * <p>Description:急诊记录信息分装类</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年2月17日 上午10:48:45
 *
 */
public class HspemginfQueryDto {
	/**
	 * 分页
	 */
	private PageQuery pageQuery;
	private HspsqlinfCustom hspsqlinfCustom;//转归自定义类
	private HspemginfCustom hspemginfCustom;
	private HspNrsInfCustom hspNrsInfCustom;//NRS疼痛评分
	private HspHlpgbCustom hspHlpgbCustom;//护理评估表
	private HspGcsInfCustom hspGcsInfCustom;//Gcs
	//跌倒评估表
	private HspFallAssInfCustom hspFallAssInfCustom;
	//Morse评分表
	private HspDdfxpgbInfCustom hspDdfxpgbInfCustom;
	
	private HspPewsckInfCustom hspPewsckInfCustom;//产科pews评分
	
//	private List<HspJjbhzmxCustom> hspJjbhzmxCustom;
	
	private HspFrbrInfCustom hspFrbrInfCustom;//发热登记
	
	private Date startdate;//查询开始时间
    private Date enddate;//结束时间
    private String halfdate;
    private String lqflag;//留抢患者标志
    private String swflag;//0:死亡 1：来院已死亡 
    private String checkStatus;//归档病历审核状态
    private List<String> zgztlist;//状态
    private List<String> scoIdList;//病种及其操作技术
    private Map<String, String> scoIdMap;//病种分值选择项
    String sort;
    String order;
    String acronym;
    
    private String querytype;
    private String queryDate;
    private String querytypext;
    private String querytypexm;
    private String querytypecs;

    /**
     * 急诊门诊病历
     * isJzmzType 0为候诊患者，1为已写病历
     */
    private String isJzmzType;
    
    private HspJbzdInfCustom hspJbzdInfCustom;

	private Date xtdate;//系统时间
	private String csflag;    //超时标志
	private HspFastInfCustom hspFastInfCustom;
	
	
	private String timetype;//时间点类型
	
	/**
	 * 门药报表、门球报表查询字段类型(门药时间、门球时间)
	 */
	private String filedType;
	
	/**
	 * 绿色通道标志
	 */
	private String grnChlFlag;
	
	/**
	 * 转归去向（0-住院，1-转院）
	 */
	private String cstDspFlag;
	
	/**
	 * 判断请求来自那一个页面
	 */
	private String pageName;
	
	/**
	 * 群体事件标志
	 */
	private String qtsjFlg;
	
	/**
	 * 死亡标志
	 */
	private String swFlg;
	
	/**
	 * 三无标志
	 */
	private String swChlFlag;
	
	/**
	 * 去除儿童标志位（0-去除）
	 */
	private String childFlag;

	/**
	 * 未关联挂号标志（0-勾选，1-不勾选）
	 */
	private String notLinked;
	
	/**
	 * 已挂号关联标志
	 */
	private String linked;
	
	/**
	 * 入出转id
	 */
	private String rczId;
	
	/**
	 * 核对病历(1-未核对，2-已核对)
	 */
	private String checkRecord;
	
	/**
	 * 到院方式（院内120）
	 */
	private String arvChlFlag;
	
	/**
	 * 请求来源(HIS_NO_PATIENT:HIS请求病历且未查到患者数据)
	 */
	private String requestSource;
	
	/**
	 * 是否勾选 AUTO（0-勾选，1-不勾选）
	 */
	private String autoFlag;
	
	public Map<String, String> getScoIdMap() {
		return scoIdMap;
	}
	public void setScoIdMap(Map<String, String> scoIdMap) {
		this.scoIdMap = scoIdMap;
	}
	public List<String> getScoIdList() {
		return scoIdList;
	}
	public void setScoIdList(List<String> scoIdList) {
		this.scoIdList = scoIdList;
	}
	public HspFrbrInfCustom getHspFrbrInfCustom() {
		return hspFrbrInfCustom;
	}
	public void setHspFrbrInfCustom(HspFrbrInfCustom hspFrbrInfCustom) {
		this.hspFrbrInfCustom = hspFrbrInfCustom;
	}
	public HspDdfxpgbInfCustom getHspDdfxpgbInfCustom() {
		return hspDdfxpgbInfCustom;
	}
	public void setHspDdfxpgbInfCustom(HspDdfxpgbInfCustom hspDdfxpgbInfCustom) {
		this.hspDdfxpgbInfCustom = hspDdfxpgbInfCustom;
	}
//	public List<HspJjbhzmxCustom> getHspJjbhzmxCustom() {
//		return hspJjbhzmxCustom;
//	}
//	public void setHspJjbhzmxCustom(List<HspJjbhzmxCustom> emglist) {
//		this.hspJjbhzmxCustom = emglist;
//	}
	public String getSwChlFlag() {
		return swChlFlag;
	}
	public void setSwChlFlag(String swChlFlag) {
		this.swChlFlag = swChlFlag;
	}
	public String getChildFlag() {
		return childFlag;
	}
	public void setChildFlag(String childFlag) {
		this.childFlag = childFlag;
	}
	public String getSwFlg() {
		return swFlg;
	}
	public void setSwFlg(String swFlg) {
		this.swFlg = swFlg;
	}
	public String getIsJzmzType() {
		return isJzmzType;
	}
	public void setIsJzmzType(String isJzmzType) {
		this.isJzmzType = isJzmzType;
	}
	public String getCheckStatus() {
		return checkStatus;
	}
	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}
	public HspPewsckInfCustom getHspPewsckInfCustom() {
		return hspPewsckInfCustom;
	}
	public void setHspPewsckInfCustom(HspPewsckInfCustom hspPewsckInfCustom) {
		this.hspPewsckInfCustom = hspPewsckInfCustom;
	}
	public String getQuerytypext() {
		return querytypext;
	}
	public void setQuerytypext(String querytypext) {
		this.querytypext = querytypext;
	}
	public String getQuerytypexm() {
		return querytypexm;
	}
	public void setQuerytypexm(String querytypexm) {
		this.querytypexm = querytypexm;
	}
	public String getQuerytypecs() {
		return querytypecs;
	}
	public void setQuerytypecs(String querytypecs) {
		this.querytypecs = querytypecs;
	}
	public String getTimetype() {
		return timetype;
	}
	public void setTimetype(String timetype) {
		this.timetype = timetype;
	}
	public HspHlpgbCustom getHspHlpgbCustom() {
		return hspHlpgbCustom;
	}
	public void setHspHlpgbCustom(HspHlpgbCustom hspHlpgbCustom) {
		this.hspHlpgbCustom = hspHlpgbCustom;
	}
	public HspNrsInfCustom getHspNrsInfCustom() {
		return hspNrsInfCustom;
	}
	public void setHspNrsInfCustom(HspNrsInfCustom hspNrsInfCustom) {
		this.hspNrsInfCustom = hspNrsInfCustom;
	}
	public HspFastInfCustom getHspFastInfCustom() {
		return hspFastInfCustom;
	}
	public void setHspFastInfCustom(HspFastInfCustom hspFastInfCustom) {
		this.hspFastInfCustom = hspFastInfCustom;
	}
	public Date getXtdate() {
		return xtdate;
	}
	public void setXtdate(Date xtdate) {
		this.xtdate = xtdate;
	}
	public List<String> getZgztlist() {
		return zgztlist;
	}
	public void setZgztlist(List<String> zgztlist) {
		this.zgztlist = zgztlist;
	}
	public String getSwflag() {
		return swflag;
	}
	public void setSwflag(String swflag) {
		this.swflag = swflag;
	}
	public String getLqflag() {
		return lqflag;
	}
	public void setLqflag(String lqflag) {
		this.lqflag = lqflag;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public HspsqlinfCustom getHspsqlinfCustom() {
		return hspsqlinfCustom;
	}
	public void setHspsqlinfCustom(HspsqlinfCustom hspsqlinfCustom) {
		this.hspsqlinfCustom = hspsqlinfCustom;
	}
	public HspemginfCustom getHspemginfCustom() {
		return hspemginfCustom;
	}
	public void setHspemginfCustom(HspemginfCustom hspemginfCustom) {
		this.hspemginfCustom = hspemginfCustom;
	}
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public HspJbzdInfCustom getHspJbzdInfCustom() {
		return hspJbzdInfCustom;
	}
	public void setHspJbzdInfCustom(HspJbzdInfCustom hspJbzdInfCustom) {
		this.hspJbzdInfCustom = hspJbzdInfCustom;
	}
	public String getQuerytype() {
		return querytype;
	}
	public void setQuerytype(String querytype) {
		this.querytype = querytype;
	}
	public String getHalfdate() {
		return halfdate;
	}
	public void setHalfdate(String halfdate) {
		this.halfdate = halfdate;
	}

	public String getCsflag() {
		return csflag;
	}
	public void setCsflag(String csflag) {
		this.csflag = csflag;
	}

	public HspGcsInfCustom getHspGcsInfCustom() {
		return hspGcsInfCustom;
	}
	public void setHspGcsInfCustom(HspGcsInfCustom hspGcsInfCustom) {
		this.hspGcsInfCustom = hspGcsInfCustom;
	}
	public String getAcronym() {
		return acronym;
	}
	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}
	public String getFiledType() {
		return filedType;
	}
	public void setFiledType(String filedType) {
		this.filedType = filedType;
	}
	public String getGrnChlFlag() {
		return grnChlFlag;
	}
	public void setGrnChlFlag(String grnChlFlag) {
		this.grnChlFlag = grnChlFlag;
	}
	public String getQueryDate() {
		return queryDate;
	}
	public void setQueryDate(String queryDate) {
		this.queryDate = queryDate;
	}
	public HspFallAssInfCustom getHspFallAssInfCustom() {
		return hspFallAssInfCustom;
	}
	public void setHspFallAssInfCustom(HspFallAssInfCustom hspFallAssInfCustom) {
		this.hspFallAssInfCustom = hspFallAssInfCustom;
	}
	public String getCstDspFlag() {
		return cstDspFlag;
	}
	public void setCstDspFlag(String cstDspFlag) {
		this.cstDspFlag = cstDspFlag;
	}
	public String getPageName() {
		return pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	public String getQtsjFlg() {
		return qtsjFlg;
	}
	public void setQtsjFlg(String qtsjFlg) {
		this.qtsjFlg = qtsjFlg;
	}
	public String getNotLinked() {
		return notLinked;
	}
	public void setNotLinked(String notLinked) {
		this.notLinked = notLinked;
	}
	public String getRczId() {
		return rczId;
	}
	public void setRczId(String rczId) {
		this.rczId = rczId;
	}
	public String getCheckRecord() {
		return checkRecord;
	}
	public void setCheckRecord(String checkRecord) {
		this.checkRecord = checkRecord;
	}
	public String getArvChlFlag() {
		return arvChlFlag;
	}
	public void setArvChlFlag(String arvChlFlag) {
		this.arvChlFlag = arvChlFlag;
	}
	public String getRequestSource() {
		return requestSource;
	}
	public void setRequestSource(String requestSource) {
		this.requestSource = requestSource;
	}
	public String getAutoFlag() {
		return autoFlag;
	}
	public void setAutoFlag(String autoFlag) {
		this.autoFlag = autoFlag;
	}
	public String getLinked() {
		return linked;
	}
	public void setLinked(String linked) {
		this.linked = linked;
	}
	
	
}
