package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspObsvtfstInf;
import activetech.zyyhospital.pojo.domain.HspObsvtfstInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspObsvtfstInfMapper {
    int countByExample(HspObsvtfstInfExample example);

    int deleteByExample(HspObsvtfstInfExample example);

    int deleteByPrimaryKey(String obsvtfstSeq);

    int insert(HspObsvtfstInf record);

    int insertSelective(HspObsvtfstInf record);

    List<HspObsvtfstInf> selectByExample(HspObsvtfstInfExample example);

    HspObsvtfstInf selectByPrimaryKey(String obsvtfstSeq);

    int updateByExampleSelective(@Param("record") HspObsvtfstInf record, @Param("example") HspObsvtfstInfExample example);

    int updateByExample(@Param("record") HspObsvtfstInf record, @Param("example") HspObsvtfstInfExample example);

    int updateByPrimaryKeySelective(HspObsvtfstInf record);

    int updateByPrimaryKey(HspObsvtfstInf record);
}