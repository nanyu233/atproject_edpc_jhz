package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspSbarInf;
import activetech.edpc.pojo.domain.HspSbarInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspSbarInfMapper {
    long countByExample(HspSbarInfExample example);

    int deleteByExample(HspSbarInfExample example);

    int deleteByPrimaryKey(String emgSeq);

    int insert(HspSbarInf record);

    int insertSelective(HspSbarInf record);

    List<HspSbarInf> selectByExampleWithBLOBs(HspSbarInfExample example);

    List<HspSbarInf> selectByExample(HspSbarInfExample example);

    HspSbarInf selectByPrimaryKey(String emgSeq);

    int updateByExampleSelective(@Param("record") HspSbarInf record, @Param("example") HspSbarInfExample example);

    int updateByExampleWithBLOBs(@Param("record") HspSbarInf record, @Param("example") HspSbarInfExample example);

    int updateByExample(@Param("record") HspSbarInf record, @Param("example") HspSbarInfExample example);

    int updateByPrimaryKeySelective(HspSbarInf record);

    int updateByPrimaryKeyWithBLOBs(HspSbarInf record);

    int updateByPrimaryKey(HspSbarInf record);
}