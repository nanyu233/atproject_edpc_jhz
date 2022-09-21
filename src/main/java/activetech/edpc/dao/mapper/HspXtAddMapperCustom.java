package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspXtAdd;
import activetech.edpc.pojo.domain.HspXtAddExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspXtAddMapperCustom {
    
    int insert(HspXtAdd record);

}