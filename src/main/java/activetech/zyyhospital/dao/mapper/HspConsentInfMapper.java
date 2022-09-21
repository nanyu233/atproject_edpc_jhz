package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspConsentInf;
import activetech.zyyhospital.pojo.domain.HspConsentInfExample;
import activetech.zyyhospital.pojo.domain.HspConsentInfWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspConsentInfMapper {
    int countByExample(HspConsentInfExample example);

    int deleteByExample(HspConsentInfExample example);

    int deleteByPrimaryKey(String seqno);

    int insert(HspConsentInfWithBLOBs record);

    int insertSelective(HspConsentInfWithBLOBs record);

    List<HspConsentInfWithBLOBs> selectByExampleWithBLOBs(HspConsentInfExample example);

    List<HspConsentInf> selectByExample(HspConsentInfExample example);

    HspConsentInfWithBLOBs selectByPrimaryKey(String seqno);

    int updateByExampleSelective(@Param("record") HspConsentInfWithBLOBs record, @Param("example") HspConsentInfExample example);

    int updateByExampleWithBLOBs(@Param("record") HspConsentInfWithBLOBs record, @Param("example") HspConsentInfExample example);

    int updateByExample(@Param("record") HspConsentInf record, @Param("example") HspConsentInfExample example);

    int updateByPrimaryKeySelective(HspConsentInfWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HspConsentInfWithBLOBs record);

    int updateByPrimaryKey(HspConsentInf record);
}