package activetech.edpc.pojo.dto;

import activetech.edpc.pojo.domain.HspGrpUsr;

/**
 * 群组用户关系表domain扩展
 *
 * @author Chen Haoyuan
 * @date 2023-03-27 17:22
 */
public class HspGrpUsrCustom extends HspGrpUsr {

    private String usrname;

    public String getUsrname() {
        return usrname;
    }

    public void setUsrname(String usrname) {
        this.usrname = usrname;
    }
}
