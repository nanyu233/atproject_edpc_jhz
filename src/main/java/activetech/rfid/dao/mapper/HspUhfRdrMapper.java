package activetech.rfid.dao.mapper;

import activetech.rfid.pojo.domain.HspUhfRdr;
import activetech.rfid.pojo.domain.HspUhfRdrExample;
import activetech.rfid.pojo.dto.HspUhfRdrQueryDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HspUhfRdrMapper {
    long countByExample(HspUhfRdrExample example);

    int deleteByExample(HspUhfRdrExample example);

    int deleteByPrimaryKey(String rdrSeq);

    int insert(HspUhfRdr record);

    int insertSelective(HspUhfRdr record);

    List<HspUhfRdr> selectByExample(HspUhfRdrExample example);

    HspUhfRdr selectByPrimaryKey(String rdrSeq);

    int updateByExampleSelective(@Param("record") HspUhfRdr record, @Param("example") HspUhfRdrExample example);

    int updateByExample(@Param("record") HspUhfRdr record, @Param("example") HspUhfRdrExample example);

    int updateByPrimaryKeySelective(HspUhfRdr record);

    int updateByPrimaryKey(HspUhfRdr record);

    int findHspUhfRdrCount(HspUhfRdrQueryDto hspUhfRdrQueryDto);

    List<HspUhfRdr> findHspUhfRdrList(HspUhfRdrQueryDto hspUhfRdrQueryDto);

}