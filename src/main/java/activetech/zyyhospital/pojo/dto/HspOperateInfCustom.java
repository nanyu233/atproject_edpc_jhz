package activetech.zyyhospital.pojo.dto;

import java.util.Date;

import activetech.base.pojo.dto.PageQuery;
import activetech.zyyhospital.pojo.domain.HspOperateInf;

public class HspOperateInfCustom extends HspOperateInf {
	
	private String operateCount;
	private String queryDate; //查询日期
	private Date emgDat;
	private String vstCad;
	private String cstNam;
	private String cstAge;
	private String cstAgeCod;
	private String preDgnCod;
	private String emgFkCod;
	private String emgDepCod;
	private String cstSexCod;
	private Date startdate;//查询开始时间
    private Date enddate;//结束时间
    private String querytype;
    private PageQuery pageQuery;
    private String arvChlCod;
    private String grnChl;
    private String preUsrNam;
    private String cstDspCod;
    private String cstDspCodNameNew;
    private String sqlDat;
    private String cstDspCodNew;
    private String cstDepCodNew;
    private String firstsqlseq;
	private String sort;
    private String order;
    private String emgDatStr;
    private String pageName;
    private String mpi;
    private String jbzd_des;
    private String abnDriver;
    private String abnDoctor;
    private String emgJjd;
    private String sqlDes;
    private String sqlSeq;
    
	public String getMpi() {
		return mpi;
	}

	public void setMpi(String mpi) {
		this.mpi = mpi;
	}

	public String getJbzd_des() {
		return jbzd_des;
	}

	public void setJbzd_des(String jbzd_des) {
		this.jbzd_des = jbzd_des;
	}

	public String getAbnDriver() {
		return abnDriver;
	}

	public void setAbnDriver(String abnDriver) {
		this.abnDriver = abnDriver;
	}

	public String getAbnDoctor() {
		return abnDoctor;
	}

	public void setAbnDoctor(String abnDoctor) {
		this.abnDoctor = abnDoctor;
	}

	public String getEmgJjd() {
		return emgJjd;
	}

	public void setEmgJjd(String emgJjd) {
		this.emgJjd = emgJjd;
	}

	public String getSqlDes() {
		return sqlDes;
	}

	public void setSqlDes(String sqlDes) {
		this.sqlDes = sqlDes;
	}

	public String getSqlSeq() {
		return sqlSeq;
	}

	public void setSqlSeq(String sqlSeq) {
		this.sqlSeq = sqlSeq;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getEmgDatStr() {
		return emgDatStr;
	}

	public void setEmgDatStr(String emgDatStr) {
		this.emgDatStr = emgDatStr;
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

	public String getFirstsqlseq() {
		return firstsqlseq;
	}

	public void setFirstsqlseq(String firstsqlseq) {
		this.firstsqlseq = firstsqlseq;
	}

	public String getCstDepCodNew() {
		return cstDepCodNew;
	}

	public void setCstDepCodNew(String cstDepCodNew) {
		this.cstDepCodNew = cstDepCodNew;
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

	public String getSqlDat() {
		return sqlDat;
	}

	public void setSqlDat(String sqlDat) {
		this.sqlDat = sqlDat;
	}

	public String getCstDspCod() {
		return cstDspCod;
	}

	public void setCstDspCod(String cstDspCod) {
		this.cstDspCod = cstDspCod;
	}

	public String getPreUsrNam() {
		return preUsrNam;
	}

	public void setPreUsrNam(String preUsrNam) {
		this.preUsrNam = preUsrNam;
	}

	public String getGrnChl() {
		return grnChl;
	}

	public void setGrnChl(String grnChl) {
		this.grnChl = grnChl;
	}

	public String getArvChlCod() {
		return arvChlCod;
	}

	public void setArvChlCod(String arvChlCod) {
		this.arvChlCod = arvChlCod;
	}

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

	public String getQuerytype() {
		return querytype;
	}

	public void setQuerytype(String querytype) {
		this.querytype = querytype;
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

	public String getCstSexCod() {
		return cstSexCod;
	}

	public void setCstSexCod(String cstSexCod) {
		this.cstSexCod = cstSexCod;
	}

	public Date getEmgDat() {
		return emgDat;
	}

	public void setEmgDat(Date emgDat) {
		this.emgDat = emgDat;
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

	public String getCstAgeCod() {
		return cstAgeCod;
	}

	public void setCstAgeCod(String cstAgeCod) {
		this.cstAgeCod = cstAgeCod;
	}

	public String getPreDgnCod() {
		return preDgnCod;
	}

	public void setPreDgnCod(String preDgnCod) {
		this.preDgnCod = preDgnCod;
	}

	public String getEmgFkCod() {
		return emgFkCod;
	}

	public void setEmgFkCod(String emgFkCod) {
		this.emgFkCod = emgFkCod;
	}

	public String getEmgDepCod() {
		return emgDepCod;
	}

	public void setEmgDepCod(String emgDepCod) {
		this.emgDepCod = emgDepCod;
	}

	public String getOperateCount() {
		return operateCount;
	}

	public void setOperateCount(String operateCount) {
		this.operateCount = operateCount;
	}

	public String getQueryDate() {
		return queryDate;
	}

	public void setQueryDate(String queryDate) {
		this.queryDate = queryDate;
	}
	
	
}
