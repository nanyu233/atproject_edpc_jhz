package activetech.edpc.pojo.domain;

import java.io.Serializable;

public class HspGrpUsrKey implements Serializable {
    private String grpSeq;

    private String usrno;

    private static final long serialVersionUID = 1L;

    public String getGrpSeq() {
        return grpSeq;
    }

    public void setGrpSeq(String grpSeq) {
        this.grpSeq = grpSeq == null ? null : grpSeq.trim();
    }

    public String getUsrno() {
        return usrno;
    }

    public void setUsrno(String usrno) {
        this.usrno = usrno == null ? null : usrno.trim();
    }
}