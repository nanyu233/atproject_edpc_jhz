package activetech.edpc.pojo.dto;

import activetech.edpc.pojo.domain.HspTimDiff;

import java.util.Date;

public class HspTimDiffCustom extends HspTimDiff {
    //患者时间时间差
    private long hzTimDif;
    //开始时间
    private Date beginTim;
    //结束时间
    private Date endTim;

    public long getHzTimDif() {
        return hzTimDif;
    }

    public void setHzTimDif(long hzTimDif) {
        this.hzTimDif = hzTimDif;
    }

    public Date getBeginTim() {
        return beginTim;
    }

    public void setBeginTim(Date beginTim) {
        this.beginTim = beginTim;
    }

    public Date getEndTim() {
        return endTim;
    }

    public void setEndTim(Date endTim) {
        this.endTim = endTim;
    }
}
