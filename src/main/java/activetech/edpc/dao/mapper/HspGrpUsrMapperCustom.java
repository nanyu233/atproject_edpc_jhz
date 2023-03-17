package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.dto.HspGrpInfQueryDto;

/**
 * 用户群组关系表mapper扩展
 *
 * @author Chen Haoyuan
 * @date 2023-03-17 14:00
 */
public interface HspGrpUsrMapperCustom {

    void addUser(HspGrpInfQueryDto hspGrpInfQueryDto);
}
