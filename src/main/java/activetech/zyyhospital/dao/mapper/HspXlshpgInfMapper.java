package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspXlshpgInf;
import activetech.zyyhospital.pojo.domain.HspXlshpgInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspXlshpgInfMapper {
    int countByExample(HspXlshpgInfExample example);

    int deleteByExample(HspXlshpgInfExample example);

    int deleteByPrimaryKey(String xtpgSeq);

    int insert(HspXlshpgInf record);

    int insertSelective(HspXlshpgInf record);

    List<HspXlshpgInf> selectByExample(HspXlshpgInfExample example);

    HspXlshpgInf selectByPrimaryKey(String xtpgSeq);

    int updateByExampleSelective(@Param("record") HspXlshpgInf record, @Param("example") HspXlshpgInfExample example);

    int updateByExample(@Param("record") HspXlshpgInf record, @Param("example") HspXlshpgInfExample example);

    int updateByPrimaryKeySelective(HspXlshpgInf record);

    int updateByPrimaryKey(HspXlshpgInf record);
}