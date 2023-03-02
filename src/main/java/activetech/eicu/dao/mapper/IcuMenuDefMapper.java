package activetech.eicu.dao.mapper;

import activetech.eicu.pojo.domain.IcuMenuDef;
import activetech.eicu.pojo.domain.IcuMenuDefExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IcuMenuDefMapper {
    int countByExample(IcuMenuDefExample example);

    int deleteByExample(IcuMenuDefExample example);

    int deleteByPrimaryKey(String menuId);

    int insert(IcuMenuDef record);

    int insertSelective(IcuMenuDef record);

    List<IcuMenuDef> selectByExample(IcuMenuDefExample example);

    IcuMenuDef selectByPrimaryKey(String menuId);

    int updateByExampleSelective(@Param("record") IcuMenuDef record, @Param("example") IcuMenuDefExample example);

    int updateByExample(@Param("record") IcuMenuDef record, @Param("example") IcuMenuDefExample example);

    int updateByPrimaryKeySelective(IcuMenuDef record);

    int updateByPrimaryKey(IcuMenuDef record);
}