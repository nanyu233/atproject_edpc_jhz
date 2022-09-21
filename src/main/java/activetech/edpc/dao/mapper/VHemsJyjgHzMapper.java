package activetech.edpc.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import activetech.edpc.pojo.domain.VHemsJyjgHz;
import activetech.edpc.pojo.domain.VHemsJyjgHzExample;

public interface VHemsJyjgHzMapper {
    int countByExample(VHemsJyjgHzExample example);

    int deleteByExample(VHemsJyjgHzExample example);

    int insert(VHemsJyjgHz record);

    int insertSelective(VHemsJyjgHz record);

    List<VHemsJyjgHz> selectByExample(VHemsJyjgHzExample example);

    int updateByExampleSelective(@Param("record") VHemsJyjgHz record, @Param("example") VHemsJyjgHzExample example);

    int updateByExample(@Param("record") VHemsJyjgHz record, @Param("example") VHemsJyjgHzExample example);
}