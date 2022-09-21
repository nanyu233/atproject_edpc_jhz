package activetech.edpc.dao.mapper;

import java.util.List;

import activetech.edpc.pojo.domain.HspFuvMedInf;
import activetech.edpc.pojo.domain.HspPatInf;
import activetech.edpc.pojo.dto.HspFuvInfCustom;
import activetech.edpc.pojo.dto.HspFuvInfQueryDto;

public interface HspFuvInfMapperCustom {
	
	/**
     * 查询条数
     * @return
     */
    int countByCondition(HspFuvInfQueryDto hspFuvInfQueryDto);

    /**
     * 查询具体数据
     * @return
     */
    List<HspFuvInfCustom> selectByCondition(HspFuvInfQueryDto hspFuvInfQueryDto);
    
    HspFuvInfCustom selectOneByCondition(HspFuvInfQueryDto hspFuvInfQueryDto);
}
