package activetech.hospital.dao.mapper;

import activetech.hospital.pojo.domain.HspHealtheduItem;
import activetech.hospital.pojo.domain.HspHealtheduItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspHealtheduItemMapper {
    int countByExample(HspHealtheduItemExample example);

    int deleteByExample(HspHealtheduItemExample example);

    int deleteByPrimaryKey(String itemno);

    int insert(HspHealtheduItem record);

    int insertSelective(HspHealtheduItem record);

    List<HspHealtheduItem> selectByExample(HspHealtheduItemExample example);

    HspHealtheduItem selectByPrimaryKey(String itemno);

    int updateByExampleSelective(@Param("record") HspHealtheduItem record, @Param("example") HspHealtheduItemExample example);

    int updateByExample(@Param("record") HspHealtheduItem record, @Param("example") HspHealtheduItemExample example);

    int updateByPrimaryKeySelective(HspHealtheduItem record);

    int updateByPrimaryKey(HspHealtheduItem record);
}