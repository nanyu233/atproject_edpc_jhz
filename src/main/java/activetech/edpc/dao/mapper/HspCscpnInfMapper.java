package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspCscpnInf;
import activetech.edpc.pojo.domain.HspCscpnInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspCscpnInfMapper {
    long countByExample(HspCscpnInfExample example);

    int deleteByExample(HspCscpnInfExample example);

    int insert(HspCscpnInf record);

    int insertSelective(HspCscpnInf record);

    List<HspCscpnInf> selectByExample(HspCscpnInfExample example);

    int updateByExampleSelective(@Param("record") HspCscpnInf record, @Param("example") HspCscpnInfExample example);

    int updateByExample(@Param("record") HspCscpnInf record, @Param("example") HspCscpnInfExample example);
}