package activetech.edpc.pojo.domain;

import java.io.Serializable;

public class HspYjqdDtlKey implements Serializable {
    private String yjqdSeq;

    private String usrno;

    private static final long serialVersionUID = 1L;

    public String getYjqdSeq() {
        return yjqdSeq;
    }

    public void setYjqdSeq(String yjqdSeq) {
        this.yjqdSeq = yjqdSeq == null ? null : yjqdSeq.trim();
    }

    public String getUsrno() {
        return usrno;
    }

    public void setUsrno(String usrno) {
        this.usrno = usrno == null ? null : usrno.trim();
    }
}