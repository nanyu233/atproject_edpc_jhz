package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspXxgxtpgInf;
import activetech.zyyhospital.pojo.domain.HspXxgxtpgInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspXxgxtpgInfMapper {
    int countByExample(HspXxgxtpgInfExample example);

    int deleteByExample(HspXxgxtpgInfExample example);

    int deleteByPrimaryKey(String xtpgSeq);

    int insert(HspXxgxtpgInf record);

    int insertSelective(HspXxgxtpgInf record);

    List<HspXxgxtpgInf> selectByExample(HspXxgxtpgInfExample example);

    HspXxgxtpgInf selectByPrimaryKey(String xtpgSeq);

    int updateByExampleSelective(@Param("record") HspXxgxtpgInf record, @Param("example") HspXxgxtpgInfExample example);

    int updateByExample(@Param("record") HspXxgxtpgInf record, @Param("example") HspXxgxtpgInfExample example);

    int updateByPrimaryKeySelective(HspXxgxtpgInf record);

    int updateByPrimaryKey(HspXxgxtpgInf record);
}