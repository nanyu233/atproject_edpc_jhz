package activetech.base.pojo.domain;

import java.util.Date;

public class Dstuser {
    private String userid;

    private String usrno;

    private String usrname;

    private String usrpass;

    private String userstate;

    private String phone;

    private String movephone;

    private String addr;

    private String email;

    private String fax;

    private String groupid;

    private String sysid;

    private String vchar1;

    private String vchar2;

    private String vchar3;

    private String vchar4;

    private String outCall;

    private String emgsysid;

    private String ysh;

    private Date expDat;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
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

    public String getUsrpass() {
        return usrpass;
    }

    public void setUsrpass(String usrpass) {
        this.usrpass = usrpass == null ? null : usrpass.trim();
    }

    public String getUserstate() {
        return userstate;
    }

    public void setUserstate(String userstate) {
        this.userstate = userstate == null ? null : userstate.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMovephone() {
        return movephone;
    }

    public void setMovephone(String movephone) {
        this.movephone = movephone == null ? null : movephone.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getSysid() {
        return sysid;
    }

    public void setSysid(String sysid) {
        this.sysid = sysid == null ? null : sysid.trim();
    }

    public String getVchar1() {
        return vchar1;
    }

    public void setVchar1(String vchar1) {
        this.vchar1 = vchar1 == null ? null : vchar1.trim();
    }

    public String getVchar2() {
        return vchar2;
    }

    public void setVchar2(String vchar2) {
        this.vchar2 = vchar2 == null ? null : vchar2.trim();
    }

    public String getVchar3() {
        return vchar3;
    }

    public void setVchar3(String vchar3) {
        this.vchar3 = vchar3 == null ? null : vchar3.trim();
    }

    public String getVchar4() {
        return vchar4;
    }

    public void setVchar4(String vchar4) {
        this.vchar4 = vchar4 == null ? null : vchar4.trim();
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

    public String getYsh() {
        return ysh;
    }

    public void setYsh(String ysh) {
        this.ysh = ysh == null ? null : ysh.trim();
    }

    public Date getExpDat() {
        return expDat;
    }

    public void setExpDat(Date expDat) {
        this.expDat = expDat;
    }
}