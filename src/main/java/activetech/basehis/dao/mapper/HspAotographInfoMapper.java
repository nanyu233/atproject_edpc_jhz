package activetech.basehis.dao.mapper;

import activetech.basehis.pojo.domain.HspAotographInfo;
import activetech.basehis.pojo.domain.HspAotographInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspAotographInfoMapper {
    int countByExample(HspAotographInfoExample example);

    int deleteByExample(HspAotographInfoExample example);

    int deleteByPrimaryKey(String aotographId);

    int insert(HspAotographInfo record);

    int insertSelective(HspAotographInfo record);

    List<HspAotographInfo> selectByExampleWithBLOBs(HspAotographInfoExample example);

    List<HspAotographInfo> selectByExample(HspAotographInfoExample example);

    HspAotographInfo selectByPrimaryKey(String aotographId);

    int updateByExampleSelective(@Param("record") HspAotographInfo record, @Param("example") HspAotographInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") HspAotographInfo record, @Param("example") HspAotographInfoExample example);

    int updateByExample(@Param("record") HspAotographInfo record, @Param("example") HspAotographInfoExample example);

    int updateByPrimaryKeySelective(HspAotographInfo record);

    int updateByPrimaryKeyWithBLOBs(HspAotographInfo record);

    int updateByPrimaryKey(HspAotographInfo record);
}