package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspCsoaeInf;
import activetech.edpc.pojo.domain.HspCsoaeInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspCsoaeInfMapper {
    int countByExample(HspCsoaeInfExample example);

    int deleteByExample(HspCsoaeInfExample example);

    int insert(HspCsoaeInf record);

    int insertSelective(HspCsoaeInf record);

    List<HspCsoaeInf> selectByExample(HspCsoaeInfExample example);

    int updateByExampleSelective(@Param("record") HspCsoaeInf record, @Param("example") HspCsoaeInfExample example);

    int updateByExample(@Param("record") HspCsoaeInf record, @Param("example") HspCsoaeInfExample example);
}