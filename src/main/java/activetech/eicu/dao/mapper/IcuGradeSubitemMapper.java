package activetech.eicu.dao.mapper;

import activetech.eicu.pojo.domain.IcuGradeSubitem;
import activetech.eicu.pojo.domain.IcuGradeSubitemExample;
import activetech.eicu.pojo.domain.IcuGradeSubitemKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IcuGradeSubitemMapper {
    int countByExample(IcuGradeSubitemExample example);

    int deleteByExample(IcuGradeSubitemExample example);

    int deleteByPrimaryKey(IcuGradeSubitemKey key);

    int insert(IcuGradeSubitem record);

    int insertSelective(IcuGradeSubitem record);

    List<IcuGradeSubitem> selectByExample(IcuGradeSubitemExample example);

    IcuGradeSubitem selectByPrimaryKey(IcuGradeSubitemKey key);

    int updateByExampleSelective(@Param("record") IcuGradeSubitem record, @Param("example") IcuGradeSubitemExample example);

    int updateByExample(@Param("record") IcuGradeSubitem record, @Param("example") IcuGradeSubitemExample example);

    int updateByPrimaryKeySelective(IcuGradeSubitem record);

    int updateByPrimaryKey(IcuGradeSubitem record);
}