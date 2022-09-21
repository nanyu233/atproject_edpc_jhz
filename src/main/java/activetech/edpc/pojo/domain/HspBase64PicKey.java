package activetech.edpc.pojo.domain;

import java.io.Serializable;

public class HspBase64PicKey implements Serializable {
    private String emgSeq;

    private String picType;

    private static final long serialVersionUID = 1L;

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq == null ? null : emgSeq.trim();
    }

    public String getPicType() {
        return picType;
    }

    public void setPicType(String picType) {
        this.picType = picType == null ? null : picType.trim();
    }
}