package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspPewsckInf;
import activetech.zyyhospital.pojo.domain.HspPewsckInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspPewsckInfMapper {
    int countByExample(HspPewsckInfExample example);

    int deleteByExample(HspPewsckInfExample example);

    int deleteByPrimaryKey(String emgSeq);

    int insert(HspPewsckInf record);

    int insertSelective(HspPewsckInf record);

    List<HspPewsckInf> selectByExample(HspPewsckInfExample example);

    HspPewsckInf selectByPrimaryKey(String emgSeq);

    int updateByExampleSelective(@Param("record") HspPewsckInf record, @Param("example") HspPewsckInfExample example);

    int updateByExample(@Param("record") HspPewsckInf record, @Param("example") HspPewsckInfExample example);

    int updateByPrimaryKeySelective(HspPewsckInf record);

    int updateByPrimaryKey(HspPewsckInf record);
}