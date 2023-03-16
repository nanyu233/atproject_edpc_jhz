package activetech.edpc.service.impl;

import activetech.edpc.dao.mapper.HspGrpInfMapper;
import activetech.edpc.dao.mapper.HspGrpInfMapperCustom;
import activetech.edpc.pojo.dto.HspGrpInfCustom;
import activetech.edpc.pojo.dto.HspGrpInfQueryDto;
import activetech.edpc.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Chen Haoyuan
 * @description 群组管理service实现类
 * @date 2023-03-15 15:00
 */
public class GroupServiceImpl implements GroupService {

    @Autowired
    private HspGrpInfMapperCustom hspGrpInfCustomMapper;

    @Override
    public int getGroupCount(HspGrpInfQueryDto hspGrpInfQueryDto) {
        return hspGrpInfCustomMapper.getGroupCount(hspGrpInfQueryDto);
    }

    @Override
    public List<HspGrpInfCustom> getGroupList(HspGrpInfQueryDto hspGrpInfQueryDto) {
        return hspGrpInfCustomMapper.getGroupList(hspGrpInfQueryDto);
    }
}
