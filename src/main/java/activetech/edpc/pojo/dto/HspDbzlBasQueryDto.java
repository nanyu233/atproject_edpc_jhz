package activetech.edpc.pojo.dto;

import activetech.base.pojo.dto.PageQuery;
import activetech.edpc.pojo.domain.HspDbzlBas;

import java.util.Date;

public class HspDbzlBasQueryDto extends HspDbzlBas {

    //分页
    private PageQuery pageQuery;
    //开始时间
    private Date startDate;

    //结束时间
    private Date endDate;

    //初步诊断
    private String cbzd;

    //到院方式
    private String dyfs;

    //出车单位
    private String ccdw;

    //院前溶栓场所
    private	String yqrscs;

    //院前溶栓治疗
    private String yqrszl;

    public PageQuery getPageQuery() {
        return pageQuery;
    }

    public void setPageQuery(PageQuery pageQuery) {
        this.pageQuery = pageQuery;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getCbzd() {
        return cbzd;
    }

    public void setCbzd(String cbzd) {
        this.cbzd = cbzd;
    }

    public String getDyfs() {
        return dyfs;
    }

    public void setDyfs(String dyfs) {
        this.dyfs = dyfs;
    }

    public String getCcdw() {
        return ccdw;
    }

    public void setCcdw(String ccdw) {
        this.ccdw = ccdw;
    }

    public String getYqrscs() {
        return yqrscs;
    }

    public void setYqrscs(String yqrscs) {
        this.yqrscs = yqrscs;
    }

    public String getYqrszl() {
        return yqrszl;
    }

    public void setYqrszl(String yqrszl) {
        this.yqrszl = yqrszl;
    }
}
