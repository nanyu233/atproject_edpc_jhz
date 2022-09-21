package activetech.base.pojo.domain;

import java.util.Date;

public class HspYsczlsjlInf {
    private String lsSeq;

    private String usrno;

    private String usrname;

    private String outCall;

    private String emgsysid;

    private String operateNo;

    private String operateName;

    private Date operateDate;

    public String getLsSeq() {
        return lsSeq;
    }

    public void setLsSeq(String lsSeq) {
        this.lsSeq = lsSeq == null ? null : lsSeq.trim();
    }

    public String getUsrno() {
        return usrno;
    }

    public void setUsrno(String usrno) {
        this.usrno = usrno == null ? null : usrno.trim();
    }

    public String getUsrname() {
        return usrname;
    }

    public void setUsrname(String usrname) {
        this.usrname = usrname == null ? null : usrname.trim();
    }

    public String getOutCall() {
        return outCall;
    }

    public void setOutCall(String outCall) {
        this.outCall = outCall == null ? null : outCall.trim();
    }

    public String getEmgsysid() {
        return emgsysid;
    }

    public void setEmgsysid(String emgsysid) {
        this.emgsysid = emgsysid == null ? null : emgsysid.trim();
    }

    public String getOperateNo() {
        return operateNo;
    }

    public void setOperateNo(String operateNo) {
        this.operateNo = operateNo == null ? null : operateNo.trim();
    }

    public String getOperateName() {
        return operateName;
    }

    public void setOperateName(String operateName) {
        this.operateName = operateName == null ? null : operateName.trim();
    }

    public Date getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(Date operateDate) {
        this.operateDate = operateDate;
    }
}