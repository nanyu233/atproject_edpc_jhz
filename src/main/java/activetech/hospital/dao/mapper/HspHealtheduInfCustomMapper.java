package activetech.hospital.dao.mapper;

import activetech.hospital.pojo.dto.HspHealtheduInfCustom;
import activetech.hospital.pojo.dto.HspHealtheduInfQueryDto;
import activetech.hospital.pojo.dto.HspemginfCustom;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface HspHealtheduInfCustomMapper {
    List<HspHealtheduInfCustom> findHealtheduListByEmgSeq(HspHealtheduInfQueryDto hspHealtheduInfQueryDto);
    
    List<HspemginfCustom> findEmgListInQjs(HspHealtheduInfQueryDto hspHealtheduQueryDto);
}