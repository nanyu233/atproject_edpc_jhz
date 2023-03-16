package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.dto.HspGrpInfCustom;
import activetech.edpc.pojo.dto.HspGrpInfQueryDto;

import java.util.List;

/**
 * @author Chen Haoyuan
 * @description 群组信息表mapper扩展
 * @date 2023-03-15 15:23
 */
public interface HspGrpInfMapperCustom {

    int getGroupCount(HspGrpInfQueryDto hspGrpInfQueryDto);

    List<HspGrpInfCustom> getGroupList(HspGrpInfQueryDto hspGrpInfQueryDto);
}
