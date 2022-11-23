package activetech.structtext.pojo.domain;

public class DsttemplateWithBLOBs extends Dsttemplate {
    private String tempHtml;

    private String compList;

    public String getTempHtml() {
        return tempHtml;
    }

    public void setTempHtml(String tempHtml) {
        this.tempHtml = tempHtml == null ? null : tempHtml.trim();
    }

    public String getCompList() {
        return compList;
    }

    public void setCompList(String compList) {
        this.compList = compList == null ? null : compList.trim();
    }
}