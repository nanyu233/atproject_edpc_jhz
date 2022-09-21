package activetech.eicu.dao.mapper;

import activetech.eicu.pojo.domain.IcuGradeRisk;
import activetech.eicu.pojo.domain.IcuGradeRiskExample;
import activetech.eicu.pojo.domain.IcuGradeRiskKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IcuGradeRiskMapper {
    int countByExample(IcuGradeRiskExample example);

    int deleteByExample(IcuGradeRiskExample example);

    int deleteByPrimaryKey(IcuGradeRiskKey key);

    int insert(IcuGradeRisk record);

    int insertSelective(IcuGradeRisk record);

    List<IcuGradeRisk> selectByExample(IcuGradeRiskExample example);

    IcuGradeRisk selectByPrimaryKey(IcuGradeRiskKey key);

    int updateByExampleSelective(@Param("record") IcuGradeRisk record, @Param("example") IcuGradeRiskExample example);

    int updateByExample(@Param("record") IcuGradeRisk record, @Param("example") IcuGradeRiskExample example);

    int updateByPrimaryKeySelective(IcuGradeRisk record);

    int updateByPrimaryKey(IcuGradeRisk record);
}