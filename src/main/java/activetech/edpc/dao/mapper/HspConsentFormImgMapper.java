package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspConsentFormImg;
import activetech.edpc.pojo.domain.HspConsentFormImgExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HspConsentFormImgMapper {
    long countByExample(HspConsentFormImgExample example);

    int deleteByExample(HspConsentFormImgExample example);

    int deleteByPrimaryKey(String id);

    int insert(HspConsentFormImg record);

    int insertSelective(HspConsentFormImg record);

    List<HspConsentFormImg> selectByExample(HspConsentFormImgExample example);

    HspConsentFormImg selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HspConsentFormImg record, @Param("example") HspConsentFormImgExample example);

    int updateByExample(@Param("record") HspConsentFormImg record, @Param("example") HspConsentFormImgExample example);

    int updateByPrimaryKeySelective(HspConsentFormImg record);

    int updateByPrimaryKey(HspConsentFormImg record);
}