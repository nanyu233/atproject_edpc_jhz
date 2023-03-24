package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.dto.HspGrpInfQueryDto;
import activetech.edpc.pojo.dto.HspYjqdInfQueryDto;

/**
 * 一键启动用户明细表mapper扩展
 *
 * @author Chen Haoyuan
 * @date 2023-03-24 13:22
 */
public interface HspYjqdDtlMapperCustom {

    /**
     * 向群组中添加用户
     * @param hspYjqdInfQueryDto
     *      hspYjqdInfCustom.yjqdSeq:群组主键
     *      userList: 用户集合
     */
    void addUserToYjqd(HspYjqdInfQueryDto hspYjqdInfQueryDto);
}
