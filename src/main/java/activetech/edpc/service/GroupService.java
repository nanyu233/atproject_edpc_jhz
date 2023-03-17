package activetech.edpc.service;

import activetech.base.pojo.dto.ActiveUser;
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
     * 向群组中添加用户
     *
     * @param hspGrpInfQueryDto
     * @param activeUser
     * @throws Exception
     */
    void addUser(HspGrpInfQueryDto hspGrpInfQueryDto, ActiveUser activeUser) throws Exception;
}
