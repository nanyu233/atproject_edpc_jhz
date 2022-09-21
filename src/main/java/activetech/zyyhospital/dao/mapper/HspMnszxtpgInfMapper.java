package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspMnszxtpgInf;
import activetech.zyyhospital.pojo.domain.HspMnszxtpgInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspMnszxtpgInfMapper {
    int countByExample(HspMnszxtpgInfExample example);

    int deleteByExample(HspMnszxtpgInfExample example);

    int deleteByPrimaryKey(String xtpgSeq);

    int insert(HspMnszxtpgInf record);

    int insertSelective(HspMnszxtpgInf record);

    List<HspMnszxtpgInf> selectByExample(HspMnszxtpgInfExample example);

    HspMnszxtpgInf selectByPrimaryKey(String xtpgSeq);

    int updateByExampleSelective(@Param("record") HspMnszxtpgInf record, @Param("example") HspMnszxtpgInfExample example);

    int updateByExample(@Param("record") HspMnszxtpgInf record, @Param("example") HspMnszxtpgInfExample example);

    int updateByPrimaryKeySelective(HspMnszxtpgInf record);

    int updateByPrimaryKey(HspMnszxtpgInf record);
}