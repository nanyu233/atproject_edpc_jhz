package activetech.zyyhospital.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.zyyhospital.pojo.domain.HspJzpsInf;
import activetech.zyyhospital.pojo.domain.HspJzpsInfExample;

public interface HspJzpsInfMapper {
    long countByExample(HspJzpsInfExample example);

    int deleteByExample(HspJzpsInfExample example);

    int deleteByPrimaryKey(String jzpsId);

    int insert(HspJzpsInf record);

    int insertSelective(HspJzpsInf record);

    List<HspJzpsInf> selectByExample(HspJzpsInfExample example);

    HspJzpsInf selectByPrimaryKey(String jzpsId);

    int updateByExampleSelective(@Param("record") HspJzpsInf record, @Param("example") HspJzpsInfExample example);

    int updateByExample(@Param("record") HspJzpsInf record, @Param("example") HspJzpsInfExample example);

    int updateByPrimaryKeySelective(HspJzpsInf record);

    int updateByPrimaryKey(HspJzpsInf record);
}