package activetech.edpc.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import activetech.edpc.pojo.domain.VHemsJcjgHz;
import activetech.edpc.pojo.domain.VHemsJcjgHzExample;

public interface VHemsJcjgHzMapper {
    int countByExample(VHemsJcjgHzExample example);

    int deleteByExample(VHemsJcjgHzExample example);

    int deleteByPrimaryKey(String applicationNo);

    int insert(VHemsJcjgHz record);

    int insertSelective(VHemsJcjgHz record);

    List<VHemsJcjgHz> selectByExample(VHemsJcjgHzExample example);

    VHemsJcjgHz selectByPrimaryKey(String applicationNo);

    int updateByExampleSelective(@Param("record") VHemsJcjgHz record, @Param("example") VHemsJcjgHzExample example);

    int updateByExample(@Param("record") VHemsJcjgHz record, @Param("example") VHemsJcjgHzExample example);

    int updateByPrimaryKeySelective(VHemsJcjgHz record);

    int updateByPrimaryKey(VHemsJcjgHz record);
}