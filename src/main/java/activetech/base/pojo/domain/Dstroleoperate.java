package activetech.base.pojo.domain;

public class Dstroleoperate {
    private String id;

    private String rmid;

    private String operateid;

    private String vchar1;

    private String vchar2;

    private String vchar3;

    private String vchar4;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRmid() {
        return rmid;
    }

    public void setRmid(String rmid) {
        this.rmid = rmid == null ? null : rmid.trim();
    }

    public String getOperateid() {
        return operateid;
    }

    public void setOperateid(String operateid) {
        this.operateid = operateid == null ? null : operateid.trim();
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
}