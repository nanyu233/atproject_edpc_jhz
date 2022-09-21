package activetech.hospital.dao.mapper;

import activetech.hospital.pojo.domain.HspOperationDict;
import activetech.hospital.pojo.domain.HspOperationDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspOperationDictMapper {
    int countByExample(HspOperationDictExample example);

    int deleteByExample(HspOperationDictExample example);

    int insert(HspOperationDict record);

    int insertSelective(HspOperationDict record);

    List<HspOperationDict> selectByExample(HspOperationDictExample example);

    int updateByExampleSelective(@Param("record") HspOperationDict record, @Param("example") HspOperationDictExample example);

    int updateByExample(@Param("record") HspOperationDict record, @Param("example") HspOperationDictExample example);
}