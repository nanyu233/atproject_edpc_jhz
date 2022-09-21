package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspCzzlInf;
import activetech.edpc.pojo.domain.HspCzzlInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspCzzlInfMapper {
    long countByExample(HspCzzlInfExample example);

    int deleteByExample(HspCzzlInfExample example);

    int deleteByPrimaryKey(String seqNo);

    int insert(HspCzzlInf record);

    int insertSelective(HspCzzlInf record);

    List<HspCzzlInf> selectByExample(HspCzzlInfExample example);

    HspCzzlInf selectByPrimaryKey(String seqNo);

    int updateByExampleSelective(@Param("record") HspCzzlInf record, @Param("example") HspCzzlInfExample example);

    int updateByExample(@Param("record") HspCzzlInf record, @Param("example") HspCzzlInfExample example);

    int updateByPrimaryKeySelective(HspCzzlInf record);

    int updateByPrimaryKey(HspCzzlInf record);
}