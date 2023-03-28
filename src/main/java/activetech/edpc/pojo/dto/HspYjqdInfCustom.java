package activetech.edpc.pojo.dto;

import activetech.edpc.pojo.domain.HspYjqdInf;

import java.util.Date;

/**
 * 一键启动domain扩展
 *
 * @author Chen Haoyuan
 * @date 2023-03-24 10:53
 */
public class HspYjqdInfCustom extends HspYjqdInf {

    private String yjqdTimeStr;

    private Date startDate;

    private Date endDate;

    // 一键启动患者姓名
    private String cstNam;

    // 一键启动通知对象
    private String yjqdUser;

    // 创建用户姓名
    private String crtUserName;
    // 修改用户姓名
    private String modUserName;

    public String getYjqdTimeStr() {
        return yjqdTimeStr;
    }

    public void setYjqdTimeStr(String yjqdTimeStr) {
        this.yjqdTimeStr = yjqdTimeStr;
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

    public String getCstNam() {
        return cstNam;
    }

    public void setCstNam(String cstNam) {
        this.cstNam = cstNam;
    }

    public String getYjqdUser() {
        return yjqdUser;
    }

    public void setYjqdUser(String yjqdUser) {
        this.yjqdUser = yjqdUser;
    }

    public String getCrtUserName() {
        return crtUserName;
    }

    public void setCrtUserName(String crtUserName) {
        this.crtUserName = crtUserName;
    }

    public String getModUserName() {
        return modUserName;
    }

    public void setModUserName(String modUserName) {
        this.modUserName = modUserName;
    }
}
