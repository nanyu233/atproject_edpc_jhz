package activetech.external.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.external.pojo.domain.HspJcrw;
import activetech.external.pojo.domain.HspJcrwExample;

public interface HspJcrwMapper {
    int countByExample(HspJcrwExample example);

    int deleteByExample(HspJcrwExample example);

    int deleteByPrimaryKey(String lsh);

    int insert(HspJcrw record);

    int insertSelective(HspJcrw record);

    List<HspJcrw> selectByExample(HspJcrwExample example);

    HspJcrw selectByPrimaryKey(String lsh);

    int updateByExampleSelective(@Param("record") HspJcrw record, @Param("example") HspJcrwExample example);

    int updateByExample(@Param("record") HspJcrw record, @Param("example") HspJcrwExample example);

    int updateByPrimaryKeySelective(HspJcrw record);

    int updateByPrimaryKey(HspJcrw record);
}