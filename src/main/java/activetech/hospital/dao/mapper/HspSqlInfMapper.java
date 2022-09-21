package activetech.hospital.dao.mapper;

import activetech.hospital.pojo.domain.HspSqlInf;
import activetech.hospital.pojo.domain.HspSqlInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspSqlInfMapper {
    int countByExample(HspSqlInfExample example);

    int deleteByExample(HspSqlInfExample example);

    int deleteByPrimaryKey(String sqlSeq);

    int insert(HspSqlInf record);

    int insertSelective(HspSqlInf record);

    List<HspSqlInf> selectByExample(HspSqlInfExample example);

    HspSqlInf selectByPrimaryKey(String sqlSeq);

    int updateByExampleSelective(@Param("record") HspSqlInf record, @Param("example") HspSqlInfExample example);

    int updateByExample(@Param("record") HspSqlInf record, @Param("example") HspSqlInfExample example);

    int updateByPrimaryKeySelective(HspSqlInf record);

    int updateByPrimaryKey(HspSqlInf record);
}