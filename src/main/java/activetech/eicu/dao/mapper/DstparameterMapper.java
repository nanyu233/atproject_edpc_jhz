package activetech.eicu.dao.mapper;

import activetech.eicu.pojo.domain.Dstparameter;
import activetech.eicu.pojo.domain.DstparameterExample;
import activetech.eicu.pojo.domain.DstparameterKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DstparameterMapper {
    int countByExample(DstparameterExample example);

    int deleteByExample(DstparameterExample example);

    int deleteByPrimaryKey(DstparameterKey key);

    int insert(Dstparameter record);

    int insertSelective(Dstparameter record);

    List<Dstparameter> selectByExample(DstparameterExample example);

    Dstparameter selectByPrimaryKey(DstparameterKey key);

    int updateByExampleSelective(@Param("record") Dstparameter record, @Param("example") DstparameterExample example);

    int updateByExample(@Param("record") Dstparameter record, @Param("example") DstparameterExample example);

    int updateByPrimaryKeySelective(Dstparameter record);

    int updateByPrimaryKey(Dstparameter record);
}