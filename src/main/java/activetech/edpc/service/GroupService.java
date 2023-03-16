package activetech.edpc.service;

import activetech.edpc.pojo.dto.HspGrpInfCustom;
import activetech.edpc.pojo.dto.HspGrpInfQueryDto;

import java.util.List;

/**
 * @author Chen Haoyuan
 * @description 群组管理service接口
 * @date 2023-03-15 15:00
 */
public interface GroupService {

    int getGroupCount(HspGrpInfQueryDto hspGrpInfQueryDto);

    List<HspGrpInfCustom> getGroupList(HspGrpInfQueryDto hspGrpInfQueryDto);
}
