package activetech.external.dao.mapper;

import activetech.external.pojo.domain.VHemsJyjg;
import activetech.external.pojo.domain.VHemsJyjgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VHemsJyjgMapper {
    int countByExample(VHemsJyjgExample example);

    int deleteByExample(VHemsJyjgExample example);

    int insert(VHemsJyjg record);

    int insertSelective(VHemsJyjg record);

    List<VHemsJyjg> selectByExample(VHemsJyjgExample example);

    int updateByExampleSelective(@Param("record") VHemsJyjg record, @Param("example") VHemsJyjgExample example);

    int updateByExample(@Param("record") VHemsJyjg record, @Param("example") VHemsJyjgExample example);
}