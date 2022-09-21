package activetech.hospital.dao.mapper;

import activetech.hospital.pojo.domain.HspMewsInf;
import activetech.hospital.pojo.domain.HspMewsInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspMewsInfMapper {
    int countByExample(HspMewsInfExample example);

    int deleteByExample(HspMewsInfExample example);

    int deleteByPrimaryKey(String emgSeq);

    int insert(HspMewsInf record);

    int insertSelective(HspMewsInf record);

    List<HspMewsInf> selectByExample(HspMewsInfExample example);

    HspMewsInf selectByPrimaryKey(String emgSeq);

    int updateByExampleSelective(@Param("record") HspMewsInf record, @Param("example") HspMewsInfExample example);

    int updateByExample(@Param("record") HspMewsInf record, @Param("example") HspMewsInfExample example);

    int updateByPrimaryKeySelective(HspMewsInf record);

    int updateByPrimaryKey(HspMewsInf record);
}