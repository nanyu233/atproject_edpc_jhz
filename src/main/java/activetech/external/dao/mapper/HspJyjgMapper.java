package activetech.external.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.external.pojo.domain.HspJyjg;
import activetech.external.pojo.domain.HspJyjgExample;

public interface HspJyjgMapper {
    int countByExample(HspJyjgExample example);

    int deleteByExample(HspJyjgExample example);

    int insert(HspJyjg record);

    int insertSelective(HspJyjg record);

    List<HspJyjg> selectByExample(HspJyjgExample example);

    int updateByExampleSelective(@Param("record") HspJyjg record, @Param("example") HspJyjgExample example);

    int updateByExample(@Param("record") HspJyjg record, @Param("example") HspJyjgExample example);
}