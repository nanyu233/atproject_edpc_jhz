package activetech.hospital.dao.mapper;

import activetech.hospital.pojo.domain.HspSco;
import activetech.hospital.pojo.domain.HspScoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspScoMapper {
    int countByExample(HspScoExample example);

    int deleteByExample(HspScoExample example);

    int deleteByPrimaryKey(String id);

    int insert(HspSco record);

    int insertSelective(HspSco record);

    List<HspSco> selectByExample(HspScoExample example);

    HspSco selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HspSco record, @Param("example") HspScoExample example);

    int updateByExample(@Param("record") HspSco record, @Param("example") HspScoExample example);

    int updateByPrimaryKeySelective(HspSco record);

    int updateByPrimaryKey(HspSco record);
}