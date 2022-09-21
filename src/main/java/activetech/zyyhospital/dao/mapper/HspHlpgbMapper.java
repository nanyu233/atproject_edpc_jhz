package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspHlpgb;
import activetech.zyyhospital.pojo.domain.HspHlpgbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspHlpgbMapper {
    int countByExample(HspHlpgbExample example);

    int deleteByExample(HspHlpgbExample example);

    int deleteByPrimaryKey(String emgSeq);

    int insert(HspHlpgb record);

    int insertSelective(HspHlpgb record);

    List<HspHlpgb> selectByExample(HspHlpgbExample example);

    HspHlpgb selectByPrimaryKey(String emgSeq);

    int updateByExampleSelective(@Param("record") HspHlpgb record, @Param("example") HspHlpgbExample example);

    int updateByExample(@Param("record") HspHlpgb record, @Param("example") HspHlpgbExample example);

    int updateByPrimaryKeySelective(HspHlpgb record);

    int updateByPrimaryKey(HspHlpgb record);
}