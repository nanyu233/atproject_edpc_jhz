package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspCspfDtl;
import activetech.edpc.pojo.domain.HspCspfDtlExample;
import activetech.edpc.pojo.domain.HspCspfDtlKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspCspfDtlMapper {
    int countByExample(HspCspfDtlExample example);

    int deleteByExample(HspCspfDtlExample example);

    int deleteByPrimaryKey(HspCspfDtlKey key);

    int insert(HspCspfDtl record);

    int insertSelective(HspCspfDtl record);

    List<HspCspfDtl> selectByExample(HspCspfDtlExample example);

    HspCspfDtl selectByPrimaryKey(HspCspfDtlKey key);

    int updateByExampleSelective(@Param("record") HspCspfDtl record, @Param("example") HspCspfDtlExample example);

    int updateByExample(@Param("record") HspCspfDtl record, @Param("example") HspCspfDtlExample example);

    int updateByPrimaryKeySelective(HspCspfDtl record);

    int updateByPrimaryKey(HspCspfDtl record);
}