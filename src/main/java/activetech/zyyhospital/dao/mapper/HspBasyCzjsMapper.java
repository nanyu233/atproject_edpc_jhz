package activetech.zyyhospital.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import activetech.zyyhospital.pojo.domain.HspBasyCzjs;
import activetech.zyyhospital.pojo.domain.HspBasyCzjsExample;

public interface HspBasyCzjsMapper {
    long countByExample(HspBasyCzjsExample example);

    int deleteByExample(HspBasyCzjsExample example);

    int deleteByPrimaryKey(String czjsSeq);

    int insert(HspBasyCzjs record);

    int insertSelective(HspBasyCzjs record);

    List<HspBasyCzjs> selectByExample(HspBasyCzjsExample example);

    HspBasyCzjs selectByPrimaryKey(String czjsSeq);

    int updateByExampleSelective(@Param("record") HspBasyCzjs record, @Param("example") HspBasyCzjsExample example);

    int updateByExample(@Param("record") HspBasyCzjs record, @Param("example") HspBasyCzjsExample example);

    int updateByPrimaryKeySelective(HspBasyCzjs record);

    int updateByPrimaryKey(HspBasyCzjs record);
}