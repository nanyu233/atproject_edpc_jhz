package activetech.aid.pojo.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class AidFlowstep {
	
    private String flowseq;

    private String flowentry;

    private String patid;

    private String emgSeq;

    private String steptype;

    private String stepseq;

    private String modflag;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone = "GMT+8")
    private Date flowtime;

    private String flowmemo;

    private String crtuserid;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone = "GMT+8")
    private Date crttime;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm",timezone = "GMT+8")
    private Date modtime;

    public String getFlowseq() {
        return flowseq;
    }

    public void setFlowseq(String flowseq) {
        this.flowseq = flowseq == null ? null : flowseq.trim();
    }

    public String getFlowentry() {
        return flowentry;
    }

    public void setFlowentry(String flowentry) {
        this.flowentry = flowentry == null ? null : flowentry.trim();
    }

    public String getPatid() {
        return patid;
    }

    public void setPatid(String patid) {
        this.patid = patid == null ? null : patid.trim();
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getSteptype() {
        return steptype;
    }

    public void setSteptype(String steptype) {
        this.steptype = steptype == null ? null : steptype.trim();
    }

    public String getStepseq() {
        return stepseq;
    }

    public void setStepseq(String stepseq) {
        this.stepseq = stepseq == null ? null : stepseq.trim();
    }

    public String getModflag() {
        return modflag;
    }

    public void setModflag(String modflag) {
        this.modflag = modflag == null ? null : modflag.trim();
    }

    public Date getFlowtime() {
        return flowtime;
    }

    public void setFlowtime(Date flowtime) {
        this.flowtime = flowtime;
    }

    public String getFlowmemo() {
        return flowmemo;
    }

    public void setFlowmemo(String flowmemo) {
        this.flowmemo = flowmemo == null ? null : flowmemo.trim();
    }

    public String getCrtuserid() {
        return crtuserid;
    }

    public void setCrtuserid(String crtuserid) {
        this.crtuserid = crtuserid == null ? null : crtuserid.trim();
    }

    public Date getCrttime() {
        return crttime;
    }

    public void setCrttime(Date crttime) {
        this.crttime = crttime;
    }

    public Date getModtime() {
        return modtime;
    }

    public void setModtime(Date modtime) {
        this.modtime = modtime;
    }
}