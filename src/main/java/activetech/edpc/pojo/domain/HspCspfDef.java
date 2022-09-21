package activetech.edpc.pojo.domain;

public class HspCspfDef extends HspCspfDefKey {
    private String subName;

    private String optName;

    private Short optScoe;

    private String prtName;

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName == null ? null : subName.trim();
    }

    public String getOptName() {
        return optName;
    }

    public void setOptName(String optName) {
        this.optName = optName == null ? null : optName.trim();
    }

    public Short getOptScoe() {
        return optScoe;
    }

    public void setOptScoe(Short optScoe) {
        this.optScoe = optScoe;
    }

    public String getPrtName() {
        return prtName;
    }

    public void setPrtName(String prtName) {
        this.prtName = prtName == null ? null : prtName.trim();
    }
}