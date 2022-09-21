package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspFuvGrpInf;
import activetech.edpc.pojo.domain.HspFuvGrpInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspFuvGrpInfMapper {
    int countByExample(HspFuvGrpInfExample example);

    int deleteByExample(HspFuvGrpInfExample example);

    int deleteByPrimaryKey(String fgiSeq);

    int insert(HspFuvGrpInf record);

    int insertSelective(HspFuvGrpInf record);

    List<HspFuvGrpInf> selectByExample(HspFuvGrpInfExample example);

    HspFuvGrpInf selectByPrimaryKey(String fgiSeq);

    int updateByExampleSelective(@Param("record") HspFuvGrpInf record, @Param("example") HspFuvGrpInfExample example);

    int updateByExample(@Param("record") HspFuvGrpInf record, @Param("example") HspFuvGrpInfExample example);

    int updateByPrimaryKeySelective(HspFuvGrpInf record);

    int updateByPrimaryKey(HspFuvGrpInf record);
}