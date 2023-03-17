package activetech.edpc.pojo.dto;

import activetech.base.pojo.dto.DstuserCustom;
import activetech.base.pojo.dto.PageQuery;

import java.util.List;

/**
 * 群组管理query dto
 *
 * @author Chen Haoyuan
 * @date 2023-03-15 15:00
 */
public class HspGrpInfQueryDto {

    // 分页对象
    private PageQuery pageQuery;

    // 群组信息表domain扩展
    private HspGrpInfCustom hspGrpInfCustom;

    // 用户列表
    private List<DstuserCustom> userList;

    public PageQuery getPageQuery() {
        return pageQuery;
    }

    public void setPageQuery(PageQuery pageQuery) {
        this.pageQuery = pageQuery;
    }

    public HspGrpInfCustom getHspGrpInfCustom() {
        return hspGrpInfCustom;
    }

    public void setHspGrpInfCustom(HspGrpInfCustom hspGrpInfCustom) {
        this.hspGrpInfCustom = hspGrpInfCustom;
    }

    public List<DstuserCustom> getUserList() {
        return userList;
    }

    public void setUserList(List<DstuserCustom> userList) {
        this.userList = userList;
    }
}
