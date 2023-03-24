package activetech.edpc.pojo.dto;

import activetech.edpc.pojo.domain.HspYjqdInf;

/**
 * 一键启动domain扩展
 *
 * @author Chen Haoyuan
 * @date 2023-03-24 10:53
 */
public class HspYjqdInfCustom extends HspYjqdInf {

    private String yjqdTimeStr;

    public String getYjqdTimeStr() {
        return yjqdTimeStr;
    }

    public void setYjqdTimeStr(String yjqdTimeStr) {
        this.yjqdTimeStr = yjqdTimeStr;
    }
}
