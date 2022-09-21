package activetech.eicu.dao.mapper;

import activetech.eicu.pojo.domain.IcuGradeDef;
import activetech.eicu.pojo.domain.IcuGradeDefExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IcuGradeDefMapper {
    int countByExample(IcuGradeDefExample example);

    int deleteByExample(IcuGradeDefExample example);

    int deleteByPrimaryKey(String itemField);

    int insert(IcuGradeDef record);

    int insertSelective(IcuGradeDef record);

    List<IcuGradeDef> selectByExample(IcuGradeDefExample example);

    IcuGradeDef selectByPrimaryKey(String itemField);

    int updateByExampleSelective(@Param("record") IcuGradeDef record, @Param("example") IcuGradeDefExample example);

    int updateByExample(@Param("record") IcuGradeDef record, @Param("example") IcuGradeDefExample example);

    int updateByPrimaryKeySelective(IcuGradeDef record);

    int updateByPrimaryKey(IcuGradeDef record);
}