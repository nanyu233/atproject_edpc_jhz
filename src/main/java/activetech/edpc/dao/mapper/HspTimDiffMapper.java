package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspTimDiff;
import activetech.edpc.pojo.domain.HspTimDiffExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HspTimDiffMapper {
    int countByExample(HspTimDiffExample example);

    int deleteByExample(HspTimDiffExample example);

    int insert(HspTimDiff record);

    int insertSelective(HspTimDiff record);

    List<HspTimDiff> selectByExample(HspTimDiffExample example);

    int updateByExampleSelective(@Param("record") HspTimDiff record, @Param("example") HspTimDiffExample example);

    int updateByExample(@Param("record") HspTimDiff record, @Param("example") HspTimDiffExample example);
}