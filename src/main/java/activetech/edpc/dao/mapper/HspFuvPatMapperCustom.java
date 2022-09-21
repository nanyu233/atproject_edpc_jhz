package activetech.edpc.dao.mapper;

import java.util.List;

import activetech.edpc.pojo.dto.HspFuvPatCustom;
import activetech.edpc.pojo.dto.HspFuvPatQueryDto;



public interface HspFuvPatMapperCustom {

    /**
     * 查询条数
     * @return
     */
    int countByCondition(HspFuvPatQueryDto hspFuvPatQueryDto);

    /**
     * 查询具体数据
     * @return
     */
    List<HspFuvPatCustom> selectByCondition(HspFuvPatQueryDto hspFuvPatQueryDto);
    
    HspFuvPatCustom selectOneByCondition(HspFuvPatQueryDto hspFuvPatQueryDto);

}