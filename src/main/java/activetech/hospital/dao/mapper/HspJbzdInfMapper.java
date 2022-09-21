package activetech.hospital.dao.mapper;

import activetech.hospital.pojo.domain.HspJbzdInf;
import activetech.hospital.pojo.domain.HspJbzdInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspJbzdInfMapper {
    int countByExample(HspJbzdInfExample example);

    int deleteByExample(HspJbzdInfExample example);

    int deleteByPrimaryKey(String jbzdSeq);

    int insert(HspJbzdInf record);

    int insertSelective(HspJbzdInf record);

    List<HspJbzdInf> selectByExample(HspJbzdInfExample example);

    HspJbzdInf selectByPrimaryKey(String jbzdSeq);

    int updateByExampleSelective(@Param("record") HspJbzdInf record, @Param("example") HspJbzdInfExample example);

    int updateByExample(@Param("record") HspJbzdInf record, @Param("example") HspJbzdInfExample example);

    int updateByPrimaryKeySelective(HspJbzdInf record);

    int updateByPrimaryKey(HspJbzdInf record);
}