package activetech.edpc.pojo.dto;

import activetech.base.pojo.dto.DstuserCustom;
import activetech.base.pojo.dto.PageQuery;

import java.util.List;

/**
 * 一键启动query dto
 *
 * @author Chen Haoyuan
 * @date 2023-03-24 10:54
 */
public class HspYjqdInfQueryDto {

    // 分页对象
    private PageQuery pageQuery;

    // 一键启动doamin扩展
    private HspYjqdInfCustom hspYjqdInfCustom;

    // 用户列表
    private List<DstuserCustom> userList;

    public PageQuery getPageQuery() {
        return pageQuery;
    }

    public void setPageQuery(PageQuery pageQuery) {
        this.pageQuery = pageQuery;
    }

    public HspYjqdInfCustom getHspYjqdInfCustom() {
        return hspYjqdInfCustom;
    }

    public void setHspYjqdInfCustom(HspYjqdInfCustom hspYjqdInfCustom) {
        this.hspYjqdInfCustom = hspYjqdInfCustom;
    }

    public List<DstuserCustom> getUserList() {
        return userList;
    }

    public void setUserList(List<DstuserCustom> userList) {
        this.userList = userList;
    }
}
