package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspGrpInf;
import activetech.edpc.pojo.domain.HspGrpInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspGrpInfMapper {
    long countByExample(HspGrpInfExample example);

    int deleteByExample(HspGrpInfExample example);

    int deleteByPrimaryKey(String grpSeq);

    int insert(HspGrpInf record);

    int insertSelective(HspGrpInf record);

    List<HspGrpInf> selectByExample(HspGrpInfExample example);

    HspGrpInf selectByPrimaryKey(String grpSeq);

    int updateByExampleSelective(@Param("record") HspGrpInf record, @Param("example") HspGrpInfExample example);

    int updateByExample(@Param("record") HspGrpInf record, @Param("example") HspGrpInfExample example);

    int updateByPrimaryKeySelective(HspGrpInf record);

    int updateByPrimaryKey(HspGrpInf record);
}