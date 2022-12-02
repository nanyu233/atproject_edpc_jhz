package activetech.edpc.pojo.dto;

public class HspTimDiffQueryDto {
    private HspTimDiffCustom hspTimDiffCustom;
    private String emgSeq;

    public HspTimDiffCustom getHspTimDiffCustom() {
        return hspTimDiffCustom;
    }

    public void setHspTimDiffCustom(HspTimDiffCustom hspTimDiffCustom) {
        this.hspTimDiffCustom = hspTimDiffCustom;
    }

    public String getEmgSeq() {
        return emgSeq;
    }

    public void setEmgSeq(String emgSeq) {
        this.emgSeq = emgSeq;
    }
}
