package activetech.external.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.external.pojo.domain.HspMdyDat;
import activetech.external.pojo.domain.HspMdyDatExample;

public interface HspMdyDatMapper {
    int countByExample(HspMdyDatExample example);

    int deleteByExample(HspMdyDatExample example);

    int insert(HspMdyDat record);

    int insertSelective(HspMdyDat record);

    List<HspMdyDat> selectByExample(HspMdyDatExample example);

    int updateByExampleSelective(@Param("record") HspMdyDat record, @Param("example") HspMdyDatExample example);

    int updateByExample(@Param("record") HspMdyDat record, @Param("example") HspMdyDatExample example);
}