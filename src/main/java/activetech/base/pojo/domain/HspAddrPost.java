package activetech.base.pojo.domain;

public class HspAddrPost {
    private String addrCode;

    private String addrType;

    private String addrName;

    private String addrStat;

    private String postCode;

    private String pheCode;

    private String suprCode;

    private String suprName;

    private String provCode;

    private String provName;

    public String getAddrCode() {
        return addrCode;
    }

    public void setAddrCode(String addrCode) {
        this.addrCode = addrCode == null ? null : addrCode.trim();
    }

    public String getAddrType() {
        return addrType;
    }

    public void setAddrType(String addrType) {
        this.addrType = addrType == null ? null : addrType.trim();
    }

    public String getAddrName() {
        return addrName;
    }

    public void setAddrName(String addrName) {
        this.addrName = addrName == null ? null : addrName.trim();
    }

    public String getAddrStat() {
        return addrStat;
    }

    public void setAddrStat(String addrStat) {
        this.addrStat = addrStat == null ? null : addrStat.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getPheCode() {
        return pheCode;
    }

    public void setPheCode(String pheCode) {
        this.pheCode = pheCode == null ? null : pheCode.trim();
    }

    public String getSuprCode() {
        return suprCode;
    }

    public void setSuprCode(String suprCode) {
        this.suprCode = suprCode == null ? null : suprCode.trim();
    }

    public String getSuprName() {
        return suprName;
    }

    public void setSuprName(String suprName) {
        this.suprName = suprName == null ? null : suprName.trim();
    }

    public String getProvCode() {
        return provCode;
    }

    public void setProvCode(String provCode) {
        this.provCode = provCode == null ? null : provCode.trim();
    }

    public String getProvName() {
        return provName;
    }

    public void setProvName(String provName) {
        this.provName = provName == null ? null : provName.trim();
    }
}