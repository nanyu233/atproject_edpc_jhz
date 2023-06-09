package activetech.edpc.dao.mapper;

import java.util.List;

import activetech.edpc.pojo.dto.HspFuvPatCustom;
import activetech.edpc.pojo.dto.HspFuvPatQueryDto;



public interface HspFuvPatMapperCustom {

    /**
     * 查询条数
     * @return
     */
    int countByConditionXt(HspFuvPatQueryDto hspFuvPatQueryDto);
    int countByConditionCz(HspFuvPatQueryDto hspFuvPatQueryDto);
    int countByConditionCs(HspFuvPatQueryDto hspFuvPatQueryDto);

    /**
     * 查询具体数据
     * @return
     */
    List<HspFuvPatCustom> selectByConditionXt(HspFuvPatQueryDto hspFuvPatQueryDto);
    List<HspFuvPatCustom> selectByConditionCz(HspFuvPatQueryDto hspFuvPatQueryDto);
    List<HspFuvPatCustom> selectByConditionCs(HspFuvPatQueryDto hspFuvPatQueryDto);

    
    HspFuvPatCustom selectOneByCondition(HspFuvPatQueryDto hspFuvPatQueryDto);

}