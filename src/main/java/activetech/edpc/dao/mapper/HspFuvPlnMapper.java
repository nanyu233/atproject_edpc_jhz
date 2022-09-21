package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspFuvPln;
import activetech.edpc.pojo.domain.HspFuvPlnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspFuvPlnMapper {
    int countByExample(HspFuvPlnExample example);

    int deleteByExample(HspFuvPlnExample example);

    int deleteByPrimaryKey(String plnSeq);

    int insert(HspFuvPln record);

    int insertSelective(HspFuvPln record);

    List<HspFuvPln> selectByExample(HspFuvPlnExample example);

    HspFuvPln selectByPrimaryKey(String plnSeq);

    int updateByExampleSelective(@Param("record") HspFuvPln record, @Param("example") HspFuvPlnExample example);

    int updateByExample(@Param("record") HspFuvPln record, @Param("example") HspFuvPlnExample example);

    int updateByPrimaryKeySelective(HspFuvPln record);

    int updateByPrimaryKey(HspFuvPln record);
}