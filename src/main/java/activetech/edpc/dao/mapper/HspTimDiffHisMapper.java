package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspTimDiffHis;
import activetech.edpc.pojo.domain.HspTimDiffHisExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HspTimDiffHisMapper {
    int countByExample(HspTimDiffHisExample example);

    int deleteByExample(HspTimDiffHisExample example);

    int insert(HspTimDiffHis record);

    int insertSelective(HspTimDiffHis record);

    List<HspTimDiffHis> selectByExample(HspTimDiffHisExample example);

    int updateByExampleSelective(@Param("record") HspTimDiffHis record, @Param("example") HspTimDiffHisExample example);

    int updateByExample(@Param("record") HspTimDiffHis record, @Param("example") HspTimDiffHisExample example);
}