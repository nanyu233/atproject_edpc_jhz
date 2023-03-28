package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspYjqdInf;
import activetech.edpc.pojo.domain.HspYjqdInfExample;
import activetech.edpc.pojo.dto.HspGrpInfCustom;
import activetech.edpc.pojo.dto.HspYjqdInfCustom;
import activetech.edpc.pojo.dto.HspYjqdInfQueryDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HspYjqdInfMapperCustom {


    /**
     * 获取一键启动总记录数
     *
     * @param hspYjqdInfQueryDto
     * @return
     */
    int getYjqdCount(HspYjqdInfQueryDto hspYjqdInfQueryDto);

    /**
     * 分页查询一键启动记录
     *
     * @param hspYjqdInfQueryDto
     * @return
     */
    List<HspYjqdInfCustom> getYjqdList(HspYjqdInfQueryDto hspYjqdInfQueryDto);
}