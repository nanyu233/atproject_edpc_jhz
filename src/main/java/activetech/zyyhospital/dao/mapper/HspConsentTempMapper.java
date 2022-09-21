package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspConsentTemp;
import activetech.zyyhospital.pojo.domain.HspConsentTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspConsentTempMapper {
    int countByExample(HspConsentTempExample example);

    int deleteByExample(HspConsentTempExample example);

    int deleteByPrimaryKey(String tempno);

    int insert(HspConsentTemp record);

    int insertSelective(HspConsentTemp record);

    List<HspConsentTemp> selectByExample(HspConsentTempExample example);

    HspConsentTemp selectByPrimaryKey(String tempno);

    int updateByExampleSelective(@Param("record") HspConsentTemp record, @Param("example") HspConsentTempExample example);

    int updateByExample(@Param("record") HspConsentTemp record, @Param("example") HspConsentTempExample example);

    int updateByPrimaryKeySelective(HspConsentTemp record);

    int updateByPrimaryKey(HspConsentTemp record);
}