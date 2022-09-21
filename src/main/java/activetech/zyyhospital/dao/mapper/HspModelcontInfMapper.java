package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspModelcontInf;
import activetech.zyyhospital.pojo.domain.HspModelcontInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspModelcontInfMapper {
    int countByExample(HspModelcontInfExample example);

    int deleteByExample(HspModelcontInfExample example);

    int deleteByPrimaryKey(String modelcontSeq);

    int insert(HspModelcontInf record);

    int insertSelective(HspModelcontInf record);

    List<HspModelcontInf> selectByExample(HspModelcontInfExample example);

    HspModelcontInf selectByPrimaryKey(String modelcontSeq);

    int updateByExampleSelective(@Param("record") HspModelcontInf record, @Param("example") HspModelcontInfExample example);

    int updateByExample(@Param("record") HspModelcontInf record, @Param("example") HspModelcontInfExample example);

    int updateByPrimaryKeySelective(HspModelcontInf record);

    int updateByPrimaryKey(HspModelcontInf record);
}