package activetech.edpc.dao.mapper;

import java.util.List;

import activetech.edpc.pojo.dto.HspPatInfCustom;
import activetech.edpc.pojo.dto.HspPatInfQueryDto;



public interface HspPatInfMapperCustom {

    /**
     * 查询条数
     * @return
     */
    int countByCondition(HspPatInfQueryDto hspPatInfQueryDto);

    /**
     * 查询具体数据
     * @return
     */
    List<HspPatInfCustom> selectByCondition(HspPatInfQueryDto hspPatInfQueryDto);

}