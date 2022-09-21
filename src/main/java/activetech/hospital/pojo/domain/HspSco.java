package activetech.hospital.pojo.domain;

public class HspSco {
    private String id;

    private String scoName;

    private String scoPysm;

    private String isTj;

    private String isYx;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getScoName() {
        return scoName;
    }

    public void setScoName(String scoName) {
        this.scoName = scoName == null ? null : scoName.trim();
    }

    public String getScoPysm() {
        return scoPysm;
    }

    public void setScoPysm(String scoPysm) {
        this.scoPysm = scoPysm == null ? null : scoPysm.trim();
    }

    public String getIsTj() {
        return isTj;
    }

    public void setIsTj(String isTj) {
        this.isTj = isTj == null ? null : isTj.trim();
    }

    public String getIsYx() {
        return isYx;
    }

    public void setIsYx(String isYx) {
        this.isYx = isYx == null ? null : isYx.trim();
    }
}