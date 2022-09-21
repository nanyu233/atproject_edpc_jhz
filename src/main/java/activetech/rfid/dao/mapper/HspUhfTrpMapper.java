package activetech.rfid.dao.mapper;

import activetech.rfid.pojo.domain.HspUhfTrp;
import activetech.rfid.pojo.domain.HspUhfTrpExample;
import activetech.rfid.pojo.dto.HspUhfTrpQueryDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HspUhfTrpMapper {
    long countByExample(HspUhfTrpExample example);

    int deleteByExample(HspUhfTrpExample example);

    int deleteByPrimaryKey(String rdrSeq);

    int insert(HspUhfTrp record);

    int insertSelective(HspUhfTrp record);

    List<HspUhfTrp> selectByExample(HspUhfTrpExample example);

    HspUhfTrp selectByPrimaryKey(String trpSeq);

    int updateByExampleSelective(@Param("record") HspUhfTrp record, @Param("example") HspUhfTrpExample example);

    int updateByExample(@Param("record") HspUhfTrp record, @Param("example") HspUhfTrpExample example);

    int updateByPrimaryKeySelective(HspUhfTrp record);

    int updateByPrimaryKey(HspUhfTrp record);

    int findHspUhfTrpCount(HspUhfTrpQueryDto hspUhfTrpQueryDto);

    List<HspUhfTrp> findHspUhfTrpList(HspUhfTrpQueryDto hspUhfTrpQueryDto);

}