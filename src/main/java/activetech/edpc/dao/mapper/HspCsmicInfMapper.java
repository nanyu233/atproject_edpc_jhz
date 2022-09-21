package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspCsmicInf;
import activetech.edpc.pojo.domain.HspCsmicInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspCsmicInfMapper {
    int countByExample(HspCsmicInfExample example);

    int deleteByExample(HspCsmicInfExample example);

    int deleteByPrimaryKey(String micSeq);

    int insert(HspCsmicInf record);

    int insertSelective(HspCsmicInf record);

    List<HspCsmicInf> selectByExample(HspCsmicInfExample example);

    HspCsmicInf selectByPrimaryKey(String micSeq);

    int updateByExampleSelective(@Param("record") HspCsmicInf record, @Param("example") HspCsmicInfExample example);

    int updateByExample(@Param("record") HspCsmicInf record, @Param("example") HspCsmicInfExample example);

    int updateByPrimaryKeySelective(HspCsmicInf record);

    int updateByPrimaryKey(HspCsmicInf record);
}