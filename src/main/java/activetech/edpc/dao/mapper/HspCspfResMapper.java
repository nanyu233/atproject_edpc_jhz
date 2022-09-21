package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspCspfRes;
import activetech.edpc.pojo.domain.HspCspfResExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspCspfResMapper {
    int countByExample(HspCspfResExample example);

    int deleteByExample(HspCspfResExample example);

    int deleteByPrimaryKey(String emgSeq);

    int insert(HspCspfRes record);

    int insertSelective(HspCspfRes record);

    List<HspCspfRes> selectByExample(HspCspfResExample example);

    HspCspfRes selectByPrimaryKey(String emgSeq);

    int updateByExampleSelective(@Param("record") HspCspfRes record, @Param("example") HspCspfResExample example);

    int updateByExample(@Param("record") HspCspfRes record, @Param("example") HspCspfResExample example);

    int updateByPrimaryKeySelective(HspCspfRes record);

    int updateByPrimaryKey(HspCspfRes record);
}