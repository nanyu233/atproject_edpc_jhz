package activetech.base.pojo.domain;

public class Dstappoption {
    private String optkey;

    private String optname;

    private String opttype;

    private String optvalue;

    private String vchar1;

    private String vchar2;

    private String vchar3;

    private String vchar4;

    public String getOptkey() {
        return optkey;
    }

    public void setOptkey(String optkey) {
        this.optkey = optkey == null ? null : optkey.trim();
    }

    public String getOptname() {
        return optname;
    }

    public void setOptname(String optname) {
        this.optname = optname == null ? null : optname.trim();
    }

    public String getOpttype() {
        return opttype;
    }

    public void setOpttype(String opttype) {
        this.opttype = opttype == null ? null : opttype.trim();
    }

    public String getOptvalue() {
        return optvalue;
    }

    public void setOptvalue(String optvalue) {
        this.optvalue = optvalue == null ? null : optvalue.trim();
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