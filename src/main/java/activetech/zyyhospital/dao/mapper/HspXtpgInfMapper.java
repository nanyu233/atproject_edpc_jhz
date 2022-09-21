package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspXtpgInf;
import activetech.zyyhospital.pojo.domain.HspXtpgInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspXtpgInfMapper {
    int countByExample(HspXtpgInfExample example);

    int deleteByExample(HspXtpgInfExample example);

    int deleteByPrimaryKey(String xtpgSeq);

    int insert(HspXtpgInf record);

    int insertSelective(HspXtpgInf record);

    List<HspXtpgInf> selectByExampleWithBLOBs(HspXtpgInfExample example);

    List<HspXtpgInf> selectByExample(HspXtpgInfExample example);

    HspXtpgInf selectByPrimaryKey(String xtpgSeq);

    int updateByExampleSelective(@Param("record") HspXtpgInf record, @Param("example") HspXtpgInfExample example);

    int updateByExampleWithBLOBs(@Param("record") HspXtpgInf record, @Param("example") HspXtpgInfExample example);

    int updateByExample(@Param("record") HspXtpgInf record, @Param("example") HspXtpgInfExample example);

    int updateByPrimaryKeySelective(HspXtpgInf record);

    int updateByPrimaryKeyWithBLOBs(HspXtpgInf record);

    int updateByPrimaryKey(HspXtpgInf record);
}