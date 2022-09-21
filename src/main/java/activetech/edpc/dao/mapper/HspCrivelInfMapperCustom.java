package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspCrivelInf;
import activetech.edpc.pojo.domain.HspCrivelInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspCrivelInfMapperCustom {

    int insertSelective(HspCrivelInf record);

}