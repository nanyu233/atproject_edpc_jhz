package activetech.hospital.dao.mapper;

import activetech.hospital.pojo.domain.HspDevdataKm;
import activetech.hospital.pojo.domain.HspDevdataKmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspDevdataKmMapper {
    int countByExample(HspDevdataKmExample example);

    int deleteByExample(HspDevdataKmExample example);

    int insert(HspDevdataKm record);

    int insertSelective(HspDevdataKm record);

    List<HspDevdataKm> selectByExample(HspDevdataKmExample example);

    int updateByExampleSelective(@Param("record") HspDevdataKm record, @Param("example") HspDevdataKmExample example);

    int updateByExample(@Param("record") HspDevdataKm record, @Param("example") HspDevdataKmExample example);
}