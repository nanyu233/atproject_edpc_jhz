package activetech.hospital.dao.mapper;

import activetech.hospital.pojo.domain.HspEmgInfhis;
import activetech.hospital.pojo.domain.HspEmgInfhisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspEmgInfhisMapper {
    int countByExample(HspEmgInfhisExample example);

    int deleteByExample(HspEmgInfhisExample example);

    int insert(HspEmgInfhis record);

    int insertSelective(HspEmgInfhis record);

    List<HspEmgInfhis> selectByExample(HspEmgInfhisExample example);

    int updateByExampleSelective(@Param("record") HspEmgInfhis record, @Param("example") HspEmgInfhisExample example);

    int updateByExample(@Param("record") HspEmgInfhis record, @Param("example") HspEmgInfhisExample example);
}