package activetech.hospital.dao.mapper;

import activetech.hospital.pojo.domain.HspHealtheduInf;
import activetech.hospital.pojo.domain.HspHealtheduInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspHealtheduInfMapper {
    int countByExample(HspHealtheduInfExample example);

    int deleteByExample(HspHealtheduInfExample example);

    int deleteByPrimaryKey(String eduSeq);

    int insert(HspHealtheduInf record);

    int insertSelective(HspHealtheduInf record);

    List<HspHealtheduInf> selectByExample(HspHealtheduInfExample example);

    HspHealtheduInf selectByPrimaryKey(String eduSeq);

    int updateByExampleSelective(@Param("record") HspHealtheduInf record, @Param("example") HspHealtheduInfExample example);

    int updateByExample(@Param("record") HspHealtheduInf record, @Param("example") HspHealtheduInfExample example);

    int updateByPrimaryKeySelective(HspHealtheduInf record);

    int updateByPrimaryKey(HspHealtheduInf record);
}