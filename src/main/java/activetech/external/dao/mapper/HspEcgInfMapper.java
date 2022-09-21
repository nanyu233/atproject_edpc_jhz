package activetech.external.dao.mapper;

import activetech.external.pojo.domain.HspEcgInf;
import activetech.external.pojo.domain.HspEcgInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspEcgInfMapper {
    int countByExample(HspEcgInfExample example);

    int deleteByExample(HspEcgInfExample example);

    int deleteByPrimaryKey(String ecgSeq);

    int insert(HspEcgInf record);

    int insertSelective(HspEcgInf record);

    List<HspEcgInf> selectByExampleWithBLOBs(HspEcgInfExample example);

    List<HspEcgInf> selectByExample(HspEcgInfExample example);

    HspEcgInf selectByPrimaryKey(String ecgSeq);

    int updateByExampleSelective(@Param("record") HspEcgInf record, @Param("example") HspEcgInfExample example);

    int updateByExampleWithBLOBs(@Param("record") HspEcgInf record, @Param("example") HspEcgInfExample example);

    int updateByExample(@Param("record") HspEcgInf record, @Param("example") HspEcgInfExample example);

    int updateByPrimaryKeySelective(HspEcgInf record);

    int updateByPrimaryKeyWithBLOBs(HspEcgInf record);

    int updateByPrimaryKey(HspEcgInf record);
}