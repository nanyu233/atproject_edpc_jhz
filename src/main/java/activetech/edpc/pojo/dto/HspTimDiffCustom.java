package activetech.edpc.pojo.dto;

import activetech.edpc.pojo.domain.HspTimDiff;

public class HspTimDiffCustom extends HspTimDiff {
    //患者时间时间差
    private long hzTimDif;

    public long getHzTimDif() {
        return hzTimDif;
    }

    public void setHzTimDif(long hzTimDif) {
        this.hzTimDif = hzTimDif;
    }
}
