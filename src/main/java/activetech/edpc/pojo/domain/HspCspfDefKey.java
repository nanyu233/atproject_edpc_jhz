package activetech.edpc.pojo.domain;

public class HspCspfDefKey {
    private String prtItem;

    private String subItem;

    private String optCode;

    public String getPrtItem() {
        return prtItem;
    }

    public void setPrtItem(String prtItem) {
        this.prtItem = prtItem == null ? null : prtItem.trim();
    }

    public String getSubItem() {
        return subItem;
    }

    public void setSubItem(String subItem) {
        this.subItem = subItem == null ? null : subItem.trim();
    }

    public String getOptCode() {
        return optCode;
    }

    public void setOptCode(String optCode) {
        this.optCode = optCode == null ? null : optCode.trim();
    }
}