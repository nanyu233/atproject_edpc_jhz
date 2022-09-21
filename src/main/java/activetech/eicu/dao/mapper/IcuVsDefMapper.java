package activetech.eicu.dao.mapper;

import activetech.eicu.pojo.domain.IcuVsDef;
import activetech.eicu.pojo.domain.IcuVsDefExample;
import activetech.eicu.pojo.domain.IcuVsDefKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IcuVsDefMapper {
    int countByExample(IcuVsDefExample example);

    int deleteByExample(IcuVsDefExample example);

    int deleteByPrimaryKey(IcuVsDefKey key);

    int insert(IcuVsDef record);

    int insertSelective(IcuVsDef record);

    List<IcuVsDef> selectByExample(IcuVsDefExample example);

    IcuVsDef selectByPrimaryKey(IcuVsDefKey key);

    int updateByExampleSelective(@Param("record") IcuVsDef record, @Param("example") IcuVsDefExample example);

    int updateByExample(@Param("record") IcuVsDef record, @Param("example") IcuVsDefExample example);

    int updateByPrimaryKeySelective(IcuVsDef record);

    int updateByPrimaryKey(IcuVsDef record);
}