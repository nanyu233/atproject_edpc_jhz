package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspYjqdDtlExample;
import activetech.edpc.pojo.domain.HspYjqdDtlKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspYjqdDtlMapper {
    long countByExample(HspYjqdDtlExample example);

    int deleteByExample(HspYjqdDtlExample example);

    int deleteByPrimaryKey(HspYjqdDtlKey key);

    int insert(HspYjqdDtlKey record);

    int insertSelective(HspYjqdDtlKey record);

    List<HspYjqdDtlKey> selectByExample(HspYjqdDtlExample example);

    int updateByExampleSelective(@Param("record") HspYjqdDtlKey record, @Param("example") HspYjqdDtlExample example);

    int updateByExample(@Param("record") HspYjqdDtlKey record, @Param("example") HspYjqdDtlExample example);
}