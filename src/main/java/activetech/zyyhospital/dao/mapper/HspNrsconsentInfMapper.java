package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspNrsconsentInf;
import activetech.zyyhospital.pojo.domain.HspNrsconsentInfExample;
import activetech.zyyhospital.pojo.domain.HspNrsconsentInfWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspNrsconsentInfMapper {
    int countByExample(HspNrsconsentInfExample example);

    int deleteByExample(HspNrsconsentInfExample example);

    int deleteByPrimaryKey(String seqno);

    int insert(HspNrsconsentInfWithBLOBs record);

    int insertSelective(HspNrsconsentInfWithBLOBs record);

    List<HspNrsconsentInfWithBLOBs> selectByExampleWithBLOBs(HspNrsconsentInfExample example);

    List<HspNrsconsentInf> selectByExample(HspNrsconsentInfExample example);

    HspNrsconsentInfWithBLOBs selectByPrimaryKey(String seqno);

    int updateByExampleSelective(@Param("record") HspNrsconsentInfWithBLOBs record, @Param("example") HspNrsconsentInfExample example);

    int updateByExampleWithBLOBs(@Param("record") HspNrsconsentInfWithBLOBs record, @Param("example") HspNrsconsentInfExample example);

    int updateByExample(@Param("record") HspNrsconsentInf record, @Param("example") HspNrsconsentInfExample example);

    int updateByPrimaryKeySelective(HspNrsconsentInfWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HspNrsconsentInfWithBLOBs record);

    int updateByPrimaryKey(HspNrsconsentInf record);
}