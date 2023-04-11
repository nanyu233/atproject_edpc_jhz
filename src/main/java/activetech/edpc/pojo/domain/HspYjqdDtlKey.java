package activetech.edpc.pojo.domain;

import java.io.Serializable;

public class HspYjqdDtlKey implements Serializable {
    private String yjqdSeq;

    private String userid;

    private static final long serialVersionUID = 1L;

    public String getYjqdSeq() {
        return yjqdSeq;
    }

    public void setYjqdSeq(String yjqdSeq) {
        this.yjqdSeq = yjqdSeq == null ? null : yjqdSeq.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}