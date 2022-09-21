package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspTiInf;
import activetech.zyyhospital.pojo.domain.HspTiInfExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HspTiInfMapper {
    int countByExample(HspTiInfExample example);

    int deleteByExample(HspTiInfExample example);

    int deleteByPrimaryKey(String tiSeq);

    int insert(HspTiInf record);

    int insertSelective(HspTiInf record);

    List<HspTiInf> selectByExample(HspTiInfExample example);

    HspTiInf selectByPrimaryKey(String tiSeq);

    int updateByExampleSelective(@Param("record") HspTiInf record, @Param("example") HspTiInfExample example);

    int updateByExample(@Param("record") HspTiInf record, @Param("example") HspTiInfExample example);

    int updateByPrimaryKeySelective(HspTiInf record);

    int updateByPrimaryKey(HspTiInf record);
}