package activetech.edpc.pojo.dto;

import activetech.edpc.pojo.domain.HspGrpInf;

/**
 * @author Chen Haoyuan
 * @description 群组信息表domain扩展
 * @date 2023-03-15 15:00
 */
public class HspGrpInfCustom extends HspGrpInf {

    // 创建用户姓名
    private String crtUserName;
    // 修改用户姓名
    private String modUserName;

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
