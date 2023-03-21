package activetech.edpc.service;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.DstuserCustom;
import activetech.edpc.pojo.domain.HspGrpInf;
import activetech.edpc.pojo.dto.HspGrpInfCustom;
import activetech.edpc.pojo.dto.HspGrpInfQueryDto;

import java.util.List;

/**
 * 群组管理service接口
 *
 * @author Chen Haoyuan
 * @date 2023-03-15 15:00
 */
public interface GroupService {

    /**
     * 查询群组列表总记录数
     *
     * @param hspGrpInfQueryDto
     * @return
     */
    int getGroupCount(HspGrpInfQueryDto hspGrpInfQueryDto);

    /**
     * 分页查询获取群组列表
     *
     * @param hspGrpInfQueryDto
     * @return
     */
    List<HspGrpInfCustom> getGroupList(HspGrpInfQueryDto hspGrpInfQueryDto);

    /**
     * 查询群组用户列表总记录数
     *
     * @param hspGrpInfQueryDto
     * @return
     */
    int getGroupUserCount(HspGrpInfQueryDto hspGrpInfQueryDto);

    /**
     * 分页查询获取群组用户列表
     *
     * @param hspGrpInfQueryDto
     * @return
     */
    List<DstuserCustom> getGroupUserList(HspGrpInfQueryDto hspGrpInfQueryDto);

    /**
     * 根据主键获取群组记录
     *
     * @param hspGrpInfQueryDto
     * @return
     * @throws Exception
     */
    HspGrpInf findGroupBySeq(HspGrpInfQueryDto hspGrpInfQueryDto) throws Exception;

    /**
     * 新增群组
     *
     * @param hspGrpInfQueryDto
     * @param activeUser
     * @throws Exception
     */
    void addGroup(HspGrpInfQueryDto hspGrpInfQueryDto, ActiveUser activeUser) throws Exception;

    /**
     * 修改群组
     *
     * @param hspGrpInfQueryDto
     * @param activeUser
     * @throws Exception
     */
    void editGroup(HspGrpInfQueryDto hspGrpInfQueryDto, ActiveUser activeUser) throws Exception;

    /**
     * 删除群组
     *
     * @param hspGrpInfQueryDto
     * @param activeUser
     * @throws Exception
     */
    void delGroup(HspGrpInfQueryDto hspGrpInfQueryDto, ActiveUser activeUser) throws Exception;

    /**
     * 获取用户总记录数
     *
     * @param hspGrpInfQueryDto
     *      hspGrpInfCustom.grpSeq:群组序号
     * @return
     */
    int getUserCount(HspGrpInfQueryDto hspGrpInfQueryDto);

    /**
     * 获取用户列表分页查询（结合当前群组信息）
     *
     * @param hspGrpInfQueryDto
     *      hspGrpInfCustom.grpSeq:群组序号
     * @return
     */
    List<DstuserCustom> getUserList(HspGrpInfQueryDto hspGrpInfQueryDto);

    /**
     * 向群组中添加用户
     *
     * @param hspGrpInfQueryDto
     * @param activeUser
     * @throws Exception
     */
    void addUserToGroup(HspGrpInfQueryDto hspGrpInfQueryDto, ActiveUser activeUser) throws Exception;

    /**
     * 从群组中移除用户
     *
     * @param hspGrpInfQueryDto
     * @param activeUser
     * @throws Exception
     */
    void delUserFromGroup(HspGrpInfQueryDto hspGrpInfQueryDto, ActiveUser activeUser) throws Exception;

}
