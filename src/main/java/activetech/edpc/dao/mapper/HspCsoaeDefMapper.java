package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspCsoaeDef;
import activetech.edpc.pojo.domain.HspCsoaeDefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspCsoaeDefMapper {
    int countByExample(HspCsoaeDefExample example);

    int deleteByExample(HspCsoaeDefExample example);

    int insert(HspCsoaeDef record);

    int insertSelective(HspCsoaeDef record);

    List<HspCsoaeDef> selectByExample(HspCsoaeDefExample example);

    int updateByExampleSelective(@Param("record") HspCsoaeDef record, @Param("example") HspCsoaeDefExample example);

    int updateByExample(@Param("record") HspCsoaeDef record, @Param("example") HspCsoaeDefExample example);
}