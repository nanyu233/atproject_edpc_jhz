package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspBedInf;
import activetech.zyyhospital.pojo.domain.HspBedInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspBedInfMapper {
    int countByExample(HspBedInfExample example);

    int deleteByExample(HspBedInfExample example);

    int deleteByPrimaryKey(String bedid);

    int insert(HspBedInf record);

    int insertSelective(HspBedInf record);

    List<HspBedInf> selectByExample(HspBedInfExample example);

    HspBedInf selectByPrimaryKey(String bedid);

    int updateByExampleSelective(@Param("record") HspBedInf record, @Param("example") HspBedInfExample example);

    int updateByExample(@Param("record") HspBedInf record, @Param("example") HspBedInfExample example);

    int updateByPrimaryKeySelective(HspBedInf record);

    int updateByPrimaryKey(HspBedInf record);
}