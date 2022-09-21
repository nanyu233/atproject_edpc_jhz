package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspGraceInf;
import activetech.edpc.pojo.domain.HspGraceInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspGraceInfMapper {
    int countByExample(HspGraceInfExample example);

    int deleteByExample(HspGraceInfExample example);

    int insert(HspGraceInf record);

    int insertSelective(HspGraceInf record);

    List<HspGraceInf> selectByExample(HspGraceInfExample example);

    int updateByExampleSelective(@Param("record") HspGraceInf record, @Param("example") HspGraceInfExample example);

    int updateByExample(@Param("record") HspGraceInf record, @Param("example") HspGraceInfExample example);
}