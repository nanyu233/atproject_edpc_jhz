package activetech.base.dao.mapper;

import activetech.base.pojo.domain.HspCbyxgl;
import activetech.base.pojo.domain.HspCbyxglExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspCbyxglMapper {
    int countByExample(HspCbyxglExample example);

    int deleteByExample(HspCbyxglExample example);

    int deleteByPrimaryKey(String id);

    int insert(HspCbyxgl record);

    int insertSelective(HspCbyxgl record);

    List<HspCbyxgl> selectByExample(HspCbyxglExample example);

    HspCbyxgl selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HspCbyxgl record, @Param("example") HspCbyxglExample example);

    int updateByExample(@Param("record") HspCbyxgl record, @Param("example") HspCbyxglExample example);

    int updateByPrimaryKeySelective(HspCbyxgl record);

    int updateByPrimaryKey(HspCbyxgl record);
}