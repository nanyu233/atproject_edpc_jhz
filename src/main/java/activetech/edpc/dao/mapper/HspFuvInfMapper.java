package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspFuvInf;
import activetech.edpc.pojo.domain.HspFuvInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspFuvInfMapper {
    int countByExample(HspFuvInfExample example);

    int deleteByExample(HspFuvInfExample example);

    int deleteByPrimaryKey(String fuvSeq);

    int insert(HspFuvInf record);

    int insertSelective(HspFuvInf record);

    List<HspFuvInf> selectByExample(HspFuvInfExample example);

    HspFuvInf selectByPrimaryKey(String fuvSeq);

    int updateByExampleSelective(@Param("record") HspFuvInf record, @Param("example") HspFuvInfExample example);

    int updateByExample(@Param("record") HspFuvInf record, @Param("example") HspFuvInfExample example);

    int updateByPrimaryKeySelective(HspFuvInf record);

    int updateByPrimaryKey(HspFuvInf record);
}