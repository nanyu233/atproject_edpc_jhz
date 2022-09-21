package activetech.zyyhospital.pojo.domain;

public class HspNrsconsentInfWithBLOBs extends HspNrsconsentInf {
    private String content;

    private String texthtml;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getTexthtml() {
        return texthtml;
    }

    public void setTexthtml(String texthtml) {
        this.texthtml = texthtml == null ? null : texthtml.trim();
    }
}