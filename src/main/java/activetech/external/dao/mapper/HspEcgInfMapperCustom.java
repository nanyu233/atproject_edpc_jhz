package activetech.external.dao.mapper;

import activetech.external.pojo.domain.HspEcgInf;
import activetech.external.pojo.domain.HspEcgInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspEcgInfMapperCustom {
   
    int insert(HspEcgInf record);

}