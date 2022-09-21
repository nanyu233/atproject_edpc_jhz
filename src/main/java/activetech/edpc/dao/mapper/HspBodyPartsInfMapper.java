package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspBodyPartsInf;
import activetech.edpc.pojo.domain.HspBodyPartsInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspBodyPartsInfMapper {
    int countByExample(HspBodyPartsInfExample example);

    int deleteByExample(HspBodyPartsInfExample example);

    int deleteByPrimaryKey(String partSeq);

    int insert(HspBodyPartsInf record);

    int insertSelective(HspBodyPartsInf record);

    List<HspBodyPartsInf> selectByExample(HspBodyPartsInfExample example);

    HspBodyPartsInf selectByPrimaryKey(String partSeq);

    int updateByExampleSelective(@Param("record") HspBodyPartsInf record, @Param("example") HspBodyPartsInfExample example);

    int updateByExample(@Param("record") HspBodyPartsInf record, @Param("example") HspBodyPartsInfExample example);

    int updateByPrimaryKeySelective(HspBodyPartsInf record);

    int updateByPrimaryKey(HspBodyPartsInf record);
}