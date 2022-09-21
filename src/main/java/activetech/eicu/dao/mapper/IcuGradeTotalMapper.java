package activetech.eicu.dao.mapper;

import activetech.eicu.pojo.domain.IcuGradeTotal;
import activetech.eicu.pojo.domain.IcuGradeTotalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IcuGradeTotalMapper {
    int countByExample(IcuGradeTotalExample example);

    int deleteByExample(IcuGradeTotalExample example);

    int deleteByPrimaryKey(String gradeSeq);

    int insert(IcuGradeTotal record);

    int insertSelective(IcuGradeTotal record);

    List<IcuGradeTotal> selectByExampleWithBLOBs(IcuGradeTotalExample example);

    List<IcuGradeTotal> selectByExample(IcuGradeTotalExample example);

    IcuGradeTotal selectByPrimaryKey(String gradeSeq);

    int updateByExampleSelective(@Param("record") IcuGradeTotal record, @Param("example") IcuGradeTotalExample example);

    int updateByExampleWithBLOBs(@Param("record") IcuGradeTotal record, @Param("example") IcuGradeTotalExample example);

    int updateByExample(@Param("record") IcuGradeTotal record, @Param("example") IcuGradeTotalExample example);

    int updateByPrimaryKeySelective(IcuGradeTotal record);

    int updateByPrimaryKeyWithBLOBs(IcuGradeTotal record);

    int updateByPrimaryKey(IcuGradeTotal record);
}