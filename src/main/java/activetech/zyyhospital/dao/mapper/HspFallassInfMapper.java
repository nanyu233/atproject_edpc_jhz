package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspFallassInf;
import activetech.zyyhospital.pojo.domain.HspFallassInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspFallassInfMapper {
    long countByExample(HspFallassInfExample example);

    int deleteByExample(HspFallassInfExample example);

    int deleteByPrimaryKey(String fallriskSeq);

    int insert(HspFallassInf record);

    int insertSelective(HspFallassInf record);

    List<HspFallassInf> selectByExample(HspFallassInfExample example);

    HspFallassInf selectByPrimaryKey(String fallassSeq);

    int updateByExampleSelective(@Param("record") HspFallassInf record, @Param("example") HspFallassInfExample example);

    int updateByExample(@Param("record") HspFallassInf record, @Param("example") HspFallassInfExample example);

    int updateByPrimaryKeySelective(HspFallassInf record);

    int updateByPrimaryKey(HspFallassInf record);
}