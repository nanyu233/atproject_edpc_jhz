package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspGrpUsrExample;
import activetech.edpc.pojo.domain.HspGrpUsrKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspGrpUsrMapper {
    long countByExample(HspGrpUsrExample example);

    int deleteByExample(HspGrpUsrExample example);

    int deleteByPrimaryKey(HspGrpUsrKey key);

    int insert(HspGrpUsrKey record);

    int insertSelective(HspGrpUsrKey record);

    List<HspGrpUsrKey> selectByExample(HspGrpUsrExample example);

    int updateByExampleSelective(@Param("record") HspGrpUsrKey record, @Param("example") HspGrpUsrExample example);

    int updateByExample(@Param("record") HspGrpUsrKey record, @Param("example") HspGrpUsrExample example);
}