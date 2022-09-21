package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspFuvDocInf;
import activetech.edpc.pojo.domain.HspFuvDocInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspFuvDocInfMapper {
    int countByExample(HspFuvDocInfExample example);

    int deleteByExample(HspFuvDocInfExample example);

    int deleteByPrimaryKey(String fdiSeq);

    int insert(HspFuvDocInf record);

    int insertSelective(HspFuvDocInf record);

    List<HspFuvDocInf> selectByExample(HspFuvDocInfExample example);

    HspFuvDocInf selectByPrimaryKey(String fdiSeq);

    int updateByExampleSelective(@Param("record") HspFuvDocInf record, @Param("example") HspFuvDocInfExample example);

    int updateByExample(@Param("record") HspFuvDocInf record, @Param("example") HspFuvDocInfExample example);

    int updateByPrimaryKeySelective(HspFuvDocInf record);

    int updateByPrimaryKey(HspFuvDocInf record);
}