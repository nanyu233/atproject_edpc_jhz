package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspCfjlInf;
import activetech.zyyhospital.pojo.domain.HspCfjlInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspCfjlInfMapper {
    int countByExample(HspCfjlInfExample example);

    int deleteByExample(HspCfjlInfExample example);

    int deleteByPrimaryKey(String cfjlSeq);

    int insert(HspCfjlInf record);

    int insertSelective(HspCfjlInf record);

    List<HspCfjlInf> selectByExampleWithBLOBs(HspCfjlInfExample example);

    List<HspCfjlInf> selectByExample(HspCfjlInfExample example);

    HspCfjlInf selectByPrimaryKey(String cfjlSeq);

    int updateByExampleSelective(@Param("record") HspCfjlInf record, @Param("example") HspCfjlInfExample example);

    int updateByExampleWithBLOBs(@Param("record") HspCfjlInf record, @Param("example") HspCfjlInfExample example);

    int updateByExample(@Param("record") HspCfjlInf record, @Param("example") HspCfjlInfExample example);

    int updateByPrimaryKeySelective(HspCfjlInf record);

    int updateByPrimaryKeyWithBLOBs(HspCfjlInf record);

    int updateByPrimaryKey(HspCfjlInf record);
}