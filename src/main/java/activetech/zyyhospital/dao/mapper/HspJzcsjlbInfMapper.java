package activetech.zyyhospital.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.zyyhospital.pojo.domain.HspJzcsjlbInf;
import activetech.zyyhospital.pojo.domain.HspJzcsjlbInfExample;

public interface HspJzcsjlbInfMapper {
    long countByExample(HspJzcsjlbInfExample example);

    int deleteByExample(HspJzcsjlbInfExample example);

    int deleteByPrimaryKey(String jzcsId);

    int insert(HspJzcsjlbInf record);

    int insertSelective(HspJzcsjlbInf record);

    List<HspJzcsjlbInf> selectByExample(HspJzcsjlbInfExample example);

    HspJzcsjlbInf selectByPrimaryKey(String jzcsId);

    int updateByExampleSelective(@Param("record") HspJzcsjlbInf record, @Param("example") HspJzcsjlbInfExample example);

    int updateByExample(@Param("record") HspJzcsjlbInf record, @Param("example") HspJzcsjlbInfExample example);

    int updateByPrimaryKeySelective(HspJzcsjlbInf record);

    int updateByPrimaryKey(HspJzcsjlbInf record);
}