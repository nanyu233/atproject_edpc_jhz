package activetech.eicu.dao.mapper;

import activetech.eicu.pojo.domain.IcuGradeRisk;
import activetech.eicu.pojo.domain.IcuGradeRiskExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IcuGradeRiskMapper {
    int countByExample(IcuGradeRiskExample example);

    int deleteByExample(IcuGradeRiskExample example);

    int deleteByPrimaryKey(String itemField);

    int insert(IcuGradeRisk record);

    int insertSelective(IcuGradeRisk record);

    List<IcuGradeRisk> selectByExample(IcuGradeRiskExample example);

    IcuGradeRisk selectByPrimaryKey(String itemField);

    int updateByExampleSelective(@Param("record") IcuGradeRisk record, @Param("example") IcuGradeRiskExample example);

    int updateByExample(@Param("record") IcuGradeRisk record, @Param("example") IcuGradeRiskExample example);

    int updateByPrimaryKeySelective(IcuGradeRisk record);

    int updateByPrimaryKey(IcuGradeRisk record);
}