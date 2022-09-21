package activetech.zyyhospital.dao.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import activetech.zyyhospital.pojo.domain.HspLqblInf;
import activetech.zyyhospital.pojo.domain.HspLqblInfExample;

public interface HspLqblInfMapper {
    long countByExample(HspLqblInfExample example);

    int deleteByExample(HspLqblInfExample example);

    int deleteByPrimaryKey(String lqblSeq);

    int insert(HspLqblInf record);

    int insertSelective(HspLqblInf record);

    List<HspLqblInf> selectByExampleWithBLOBs(HspLqblInfExample example);

    List<HspLqblInf> selectByExample(HspLqblInfExample example);

    HspLqblInf selectByPrimaryKey(String lqblSeq);

    int updateByExampleSelective(@Param("record") HspLqblInf record, @Param("example") HspLqblInfExample example);

    int updateByExampleWithBLOBs(@Param("record") HspLqblInf record, @Param("example") HspLqblInfExample example);

    int updateByExample(@Param("record") HspLqblInf record, @Param("example") HspLqblInfExample example);

    int updateByPrimaryKeySelective(HspLqblInf record);

    int updateByPrimaryKeyWithBLOBs(HspLqblInf record);

    int updateByPrimaryKey(HspLqblInf record);
}