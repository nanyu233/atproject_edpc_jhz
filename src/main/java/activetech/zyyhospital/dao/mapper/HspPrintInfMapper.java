package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspPrintInf;
import activetech.zyyhospital.pojo.domain.HspPrintInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspPrintInfMapper {
    int countByExample(HspPrintInfExample example);

    int deleteByExample(HspPrintInfExample example);

    int deleteByPrimaryKey(String printId);

    int insert(HspPrintInf record);

    int insertSelective(HspPrintInf record);

    List<HspPrintInf> selectByExample(HspPrintInfExample example);

    HspPrintInf selectByPrimaryKey(String printId);

    int updateByExampleSelective(@Param("record") HspPrintInf record, @Param("example") HspPrintInfExample example);

    int updateByExample(@Param("record") HspPrintInf record, @Param("example") HspPrintInfExample example);

    int updateByPrimaryKeySelective(HspPrintInf record);

    int updateByPrimaryKey(HspPrintInf record);
}