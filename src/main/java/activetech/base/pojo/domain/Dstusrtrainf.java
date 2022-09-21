package activetech.base.pojo.domain;

import java.util.Date;

public class Dstusrtrainf {
    private String seqno;

    private String usrno;

    private String usrname;

    private String comnoA;

    private String comcnameA;

    private String comnoB;

    private String comcnameB;

    private String dusrno;

    private String dusrname;

    private String dcomno;

    private String dcomcname;

    private Date optdate;

    private String memo;

    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno == null ? null : seqno.trim();
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

    public String getComnoA() {
        return comnoA;
    }

    public void setComnoA(String comnoA) {
        this.comnoA = comnoA == null ? null : comnoA.trim();
    }

    public String getComcnameA() {
        return comcnameA;
    }

    public void setComcnameA(String comcnameA) {
        this.comcnameA = comcnameA == null ? null : comcnameA.trim();
    }

    public String getComnoB() {
        return comnoB;
    }

    public void setComnoB(String comnoB) {
        this.comnoB = comnoB == null ? null : comnoB.trim();
    }

    public String getComcnameB() {
        return comcnameB;
    }

    public void setComcnameB(String comcnameB) {
        this.comcnameB = comcnameB == null ? null : comcnameB.trim();
    }

    public String getDusrno() {
        return dusrno;
    }

    public void setDusrno(String dusrno) {
        this.dusrno = dusrno == null ? null : dusrno.trim();
    }

    public String getDusrname() {
        return dusrname;
    }

    public void setDusrname(String dusrname) {
        this.dusrname = dusrname == null ? null : dusrname.trim();
    }

    public String getDcomno() {
        return dcomno;
    }

    public void setDcomno(String dcomno) {
        this.dcomno = dcomno == null ? null : dcomno.trim();
    }

    public String getDcomcname() {
        return dcomcname;
    }

    public void setDcomcname(String dcomcname) {
        this.dcomcname = dcomcname == null ? null : dcomcname.trim();
    }

    public Date getOptdate() {
        return optdate;
    }

    public void setOptdate(Date optdate) {
        this.optdate = optdate;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}