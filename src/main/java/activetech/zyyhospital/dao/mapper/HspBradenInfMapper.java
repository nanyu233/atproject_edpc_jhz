package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspBradenInf;
import activetech.zyyhospital.pojo.domain.HspBradenInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspBradenInfMapper {
    int countByExample(HspBradenInfExample example);

    int deleteByExample(HspBradenInfExample example);

    int deleteByPrimaryKey(String xtpgSeq);

    int insert(HspBradenInf record);

    int insertSelective(HspBradenInf record);

    List<HspBradenInf> selectByExample(HspBradenInfExample example);

    HspBradenInf selectByPrimaryKey(String xtpgSeq);

    int updateByExampleSelective(@Param("record") HspBradenInf record, @Param("example") HspBradenInfExample example);

    int updateByExample(@Param("record") HspBradenInf record, @Param("example") HspBradenInfExample example);

    int updateByPrimaryKeySelective(HspBradenInf record);

    int updateByPrimaryKey(HspBradenInf record);
}