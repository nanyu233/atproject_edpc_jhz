package activetech.structtext.pojo.domain;

public class DstcasesWithBLOBs extends Dstcases {
    private String caseHtml;

    private String caseAns;

    private String compList;

    public String getCaseHtml() {
        return caseHtml;
    }

    public void setCaseHtml(String caseHtml) {
        this.caseHtml = caseHtml == null ? null : caseHtml.trim();
    }

    public String getCaseAns() {
        return caseAns;
    }

    public void setCaseAns(String caseAns) {
        this.caseAns = caseAns == null ? null : caseAns.trim();
    }

    public String getCompList() {
        return compList;
    }

    public void setCompList(String compList) {
        this.compList = compList == null ? null : compList.trim();
    }
}