package activetech.edpc.pojo.dto;

import activetech.base.pojo.domain.PageCond;

public class HspTimDiffQueryDto extends PageCond {
    private HspTimDiffCustom hspTimDiffCustom;
    private HspTimDiffHisCustom hspTimDiffHisCustom;
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

    public HspTimDiffHisCustom getHspTimDiffHisCustom() {
        return hspTimDiffHisCustom;
    }

    public void setHspTimDiffHisCustom(HspTimDiffHisCustom hspTimDiffHisCustom) {
        this.hspTimDiffHisCustom = hspTimDiffHisCustom;
    }
}
