package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspYjqdInf;
import activetech.edpc.pojo.domain.HspYjqdInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspYjqdInfMapper {
    long countByExample(HspYjqdInfExample example);

    int deleteByExample(HspYjqdInfExample example);

    int deleteByPrimaryKey(String yjqdSeq);

    int insert(HspYjqdInf record);

    int insertSelective(HspYjqdInf record);

    List<HspYjqdInf> selectByExampleWithBLOBs(HspYjqdInfExample example);

    List<HspYjqdInf> selectByExample(HspYjqdInfExample example);

    HspYjqdInf selectByPrimaryKey(String yjqdSeq);

    int updateByExampleSelective(@Param("record") HspYjqdInf record, @Param("example") HspYjqdInfExample example);

    int updateByExampleWithBLOBs(@Param("record") HspYjqdInf record, @Param("example") HspYjqdInfExample example);

    int updateByExample(@Param("record") HspYjqdInf record, @Param("example") HspYjqdInfExample example);

    int updateByPrimaryKeySelective(HspYjqdInf record);

    int updateByPrimaryKeyWithBLOBs(HspYjqdInf record);

    int updateByPrimaryKey(HspYjqdInf record);
}