package activetech.edpc.dao.mapper;

import java.util.List;

import activetech.edpc.pojo.dto.HspFuvPlnCustom;
import activetech.edpc.pojo.dto.HspFuvPlnQueryDto;
import activetech.edpc.pojo.dto.HspPatInfCustom;



public interface HspFuvPlnMapperCustom {

    /**
     * 查询条数
     * @return
     */
    int countByCondition(HspFuvPlnQueryDto hspFuvPlnQueryDto);

    /**
     * 查询具体数据
     * @return
     */
    List<HspFuvPlnCustom> selectByCondition(HspFuvPlnQueryDto hspFuvPlnQueryDto);
    HspFuvPlnCustom selectOneByCondition(HspFuvPlnQueryDto hspFuvPlnQueryDto);

	int checkUnFinishPln(HspFuvPlnQueryDto hspFuvPlnQueryDto);

}