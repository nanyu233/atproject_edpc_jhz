package activetech.edpc.dao.mapper;

import activetech.base.pojo.dto.DstuserCustom;
import activetech.edpc.pojo.dto.HspGrpInfQueryDto;

import java.util.List;

/**
 * 用户群组关系表mapper扩展
 *
 * @author Chen Haoyuan
 * @date 2023-03-17 14:00
 */
public interface HspGrpUsrMapperCustom {

    /**
     * 查询群组用户列表总记录数
     *
     * @param hspGrpInfQueryDto
     *      hspGrpInfCustom.grpSeq:群组主键
     * @return
     */
    int getGroupUserCount(HspGrpInfQueryDto hspGrpInfQueryDto);

    /**
     * 分页查询群组用户列表
     *
     * @param hspGrpInfQueryDto
     *      hspGrpInfCustom.grpSeq:群组主键
     * @return
     */
    List<DstuserCustom> getGroupUserList(HspGrpInfQueryDto hspGrpInfQueryDto);

    /**
     * 从群组中删除用户
     * @param hspGrpInfQueryDto
     *      hspGrpInfCustom.grpSeq:群组主键
     *      userList: 用户集合
     */
    void delUserFromGroup(HspGrpInfQueryDto hspGrpInfQueryDto);

    /**
     * 向群组中添加用户
     * @param hspGrpInfQueryDto
     *      hspGrpInfCustom.grpSeq:群组主键
     *      userList: 用户集合
     */
    void addUserToGroup(HspGrpInfQueryDto hspGrpInfQueryDto);
}
