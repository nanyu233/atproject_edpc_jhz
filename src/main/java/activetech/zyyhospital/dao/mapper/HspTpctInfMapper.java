package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspTpctInf;
import activetech.zyyhospital.pojo.domain.HspTpctInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspTpctInfMapper {
    int countByExample(HspTpctInfExample example);

    int deleteByExample(HspTpctInfExample example);

    int deleteByPrimaryKey(String temperatureChartSeq);

    int insert(HspTpctInf record);

    int insertSelective(HspTpctInf record);

    List<HspTpctInf> selectByExample(HspTpctInfExample example);

    HspTpctInf selectByPrimaryKey(String temperatureChartSeq);

    int updateByExampleSelective(@Param("record") HspTpctInf record, @Param("example") HspTpctInfExample example);

    int updateByExample(@Param("record") HspTpctInf record, @Param("example") HspTpctInfExample example);

    int updateByPrimaryKeySelective(HspTpctInf record);

    int updateByPrimaryKey(HspTpctInf record);
}