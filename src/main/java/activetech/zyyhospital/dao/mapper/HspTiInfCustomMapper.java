package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.dto.HspTiInfCustom;
import org.apache.ibatis.annotations.Param;

public interface HspTiInfCustomMapper {
    public HspTiInfCustom findTiByEmgSeq(@Param("emgSeq") String emgSeq);
}
