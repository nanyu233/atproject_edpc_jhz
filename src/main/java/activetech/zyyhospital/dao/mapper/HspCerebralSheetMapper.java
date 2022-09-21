package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspCerebralSheet;
import activetech.zyyhospital.pojo.domain.HspCerebralSheetExample;
import activetech.zyyhospital.pojo.domain.HspCerebralSheetKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspCerebralSheetMapper {
    int countByExample(HspCerebralSheetExample example);

    int deleteByExample(HspCerebralSheetExample example);

    int deleteByPrimaryKey(HspCerebralSheetKey key);

    int insert(HspCerebralSheet record);

    int insertSelective(HspCerebralSheet record);

    List<HspCerebralSheet> selectByExample(HspCerebralSheetExample example);

    HspCerebralSheet selectByPrimaryKey(HspCerebralSheetKey key);

    int updateByExampleSelective(@Param("record") HspCerebralSheet record, @Param("example") HspCerebralSheetExample example);

    int updateByExample(@Param("record") HspCerebralSheet record, @Param("example") HspCerebralSheetExample example);

    int updateByPrimaryKeySelective(HspCerebralSheet record);

    int updateByPrimaryKey(HspCerebralSheet record);
}