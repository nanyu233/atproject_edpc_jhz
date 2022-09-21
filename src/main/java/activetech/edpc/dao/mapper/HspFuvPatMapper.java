package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspFuvPat;
import activetech.edpc.pojo.domain.HspFuvPatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspFuvPatMapper {
    int countByExample(HspFuvPatExample example);

    int deleteByExample(HspFuvPatExample example);

    int deleteByPrimaryKey(String patId);

    int insert(HspFuvPat record);

    int insertSelective(HspFuvPat record);

    List<HspFuvPat> selectByExample(HspFuvPatExample example);

    HspFuvPat selectByPrimaryKey(String patId);

    int updateByExampleSelective(@Param("record") HspFuvPat record, @Param("example") HspFuvPatExample example);

    int updateByExample(@Param("record") HspFuvPat record, @Param("example") HspFuvPatExample example);

    int updateByPrimaryKeySelective(HspFuvPat record);

    int updateByPrimaryKey(HspFuvPat record);
}