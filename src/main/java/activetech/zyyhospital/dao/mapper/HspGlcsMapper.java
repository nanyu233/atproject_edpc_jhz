package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspGlcs;
import activetech.zyyhospital.pojo.domain.HspGlcsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspGlcsMapper {
    int countByExample(HspGlcsExample example);

    int deleteByExample(HspGlcsExample example);

    int deleteByPrimaryKey(String emgSeq);

    int insert(HspGlcs record);

    int insertSelective(HspGlcs record);

    List<HspGlcs> selectByExample(HspGlcsExample example);

    HspGlcs selectByPrimaryKey(String emgSeq);

    int updateByExampleSelective(@Param("record") HspGlcs record, @Param("example") HspGlcsExample example);

    int updateByExample(@Param("record") HspGlcs record, @Param("example") HspGlcsExample example);

    int updateByPrimaryKeySelective(HspGlcs record);

    int updateByPrimaryKey(HspGlcs record);
}