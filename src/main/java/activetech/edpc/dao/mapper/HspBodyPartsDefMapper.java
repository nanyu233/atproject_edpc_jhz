package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspBodyPartsDef;
import activetech.edpc.pojo.domain.HspBodyPartsDefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspBodyPartsDefMapper {
    int countByExample(HspBodyPartsDefExample example);

    int deleteByExample(HspBodyPartsDefExample example);

    int deleteByPrimaryKey(String partId);

    int insert(HspBodyPartsDef record);

    int insertSelective(HspBodyPartsDef record);

    List<HspBodyPartsDef> selectByExample(HspBodyPartsDefExample example);

    HspBodyPartsDef selectByPrimaryKey(String partId);

    int updateByExampleSelective(@Param("record") HspBodyPartsDef record, @Param("example") HspBodyPartsDefExample example);

    int updateByExample(@Param("record") HspBodyPartsDef record, @Param("example") HspBodyPartsDefExample example);

    int updateByPrimaryKeySelective(HspBodyPartsDef record);

    int updateByPrimaryKey(HspBodyPartsDef record);
}