package activetech.external.dao.mapper;

import activetech.external.pojo.domain.VHemsJcjg;
import activetech.external.pojo.domain.VHemsJcjgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VHemsJcjgMapper {
    int countByExample(VHemsJcjgExample example);

    int deleteByExample(VHemsJcjgExample example);

    int deleteByPrimaryKey(String applicationNo);

    int insert(VHemsJcjg record);

    int insertSelective(VHemsJcjg record);

    List<VHemsJcjg> selectByExample(VHemsJcjgExample example);

    VHemsJcjg selectByPrimaryKey(String applicationNo);

    int updateByExampleSelective(@Param("record") VHemsJcjg record, @Param("example") VHemsJcjgExample example);

    int updateByExample(@Param("record") VHemsJcjg record, @Param("example") VHemsJcjgExample example);

    int updateByPrimaryKeySelective(VHemsJcjg record);

    int updateByPrimaryKey(VHemsJcjg record);
}