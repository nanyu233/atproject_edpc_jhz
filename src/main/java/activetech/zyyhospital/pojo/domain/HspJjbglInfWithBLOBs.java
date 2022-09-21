package activetech.zyyhospital.pojo.domain;

public class HspJjbglInfWithBLOBs extends HspJjbglInf {
    private String jiaoPtcontent;

    private String jiaoWzcontent;

    private String jieContent;

    public String getJiaoPtcontent() {
        return jiaoPtcontent;
    }

    public void setJiaoPtcontent(String jiaoPtcontent) {
        this.jiaoPtcontent = jiaoPtcontent == null ? null : jiaoPtcontent.trim();
    }

    public String getJiaoWzcontent() {
        return jiaoWzcontent;
    }

    public void setJiaoWzcontent(String jiaoWzcontent) {
        this.jiaoWzcontent = jiaoWzcontent == null ? null : jiaoWzcontent.trim();
    }

    public String getJieContent() {
        return jieContent;
    }

    public void setJieContent(String jieContent) {
        this.jieContent = jieContent == null ? null : jieContent.trim();
    }
}