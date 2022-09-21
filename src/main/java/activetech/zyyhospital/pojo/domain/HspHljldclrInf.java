package activetech.zyyhospital.pojo.domain;

public class HspHljldclrInf {
    private String bqhiSeq;

    private String type;

    private String crlname;

    private String crll;

    private String code;

    private String other;

    private String xz;

    public String getBqhiSeq() {
        return bqhiSeq;
    }

    public void setBqhiSeq(String bqhiSeq) {
        this.bqhiSeq = bqhiSeq == null ? null : bqhiSeq.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getCrlname() {
        return crlname;
    }

    public void setCrlname(String crlname) {
        this.crlname = crlname == null ? null : crlname.trim();
    }

    public String getCrll() {
        return crll;
    }

    public void setCrll(String crll) {
        this.crll = crll == null ? null : crll.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    public String getXz() {
        return xz;
    }

    public void setXz(String xz) {
        this.xz = xz == null ? null : xz.trim();
    }
}