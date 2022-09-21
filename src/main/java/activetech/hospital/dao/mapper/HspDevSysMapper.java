package activetech.hospital.dao.mapper;

import activetech.hospital.pojo.domain.HspDevSys;
import activetech.hospital.pojo.domain.HspDevSysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspDevSysMapper {
    int countByExample(HspDevSysExample example);

    int deleteByExample(HspDevSysExample example);

    int deleteByPrimaryKey(String id);

    int insert(HspDevSys record);

    int insertSelective(HspDevSys record);

    List<HspDevSys> selectByExample(HspDevSysExample example);

    HspDevSys selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HspDevSys record, @Param("example") HspDevSysExample example);

    int updateByExample(@Param("record") HspDevSys record, @Param("example") HspDevSysExample example);

    int updateByPrimaryKeySelective(HspDevSys record);

    int updateByPrimaryKey(HspDevSys record);
}