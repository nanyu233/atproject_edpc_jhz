package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspFallriskInf;
import activetech.zyyhospital.pojo.domain.HspFallriskInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspFallriskInfMapper {
    int countByExample(HspFallriskInfExample example);

    int deleteByExample(HspFallriskInfExample example);

    int deleteByPrimaryKey(String fallriskSeq);

    int insert(HspFallriskInf record);

    int insertSelective(HspFallriskInf record);

    List<HspFallriskInf> selectByExample(HspFallriskInfExample example);

    HspFallriskInf selectByPrimaryKey(String fallriskSeq);

    int updateByExampleSelective(@Param("record") HspFallriskInf record, @Param("example") HspFallriskInfExample example);

    int updateByExample(@Param("record") HspFallriskInf record, @Param("example") HspFallriskInfExample example);

    int updateByPrimaryKeySelective(HspFallriskInf record);

    int updateByPrimaryKey(HspFallriskInf record);
}