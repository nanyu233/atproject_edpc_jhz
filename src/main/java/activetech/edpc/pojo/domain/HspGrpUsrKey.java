package activetech.edpc.pojo.domain;

import java.io.Serializable;

public class HspGrpUsrKey implements Serializable {
    private String grpSeq;

    private String userid;

    private static final long serialVersionUID = 1L;

    public String getGrpSeq() {
        return grpSeq;
    }

    public void setGrpSeq(String grpSeq) {
        this.grpSeq = grpSeq == null ? null : grpSeq.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}