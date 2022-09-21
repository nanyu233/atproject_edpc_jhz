package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspXhxtpgInf;
import activetech.zyyhospital.pojo.domain.HspXhxtpgInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspXhxtpgInfMapper {
    int countByExample(HspXhxtpgInfExample example);

    int deleteByExample(HspXhxtpgInfExample example);

    int deleteByPrimaryKey(String xtpgSeq);

    int insert(HspXhxtpgInf record);

    int insertSelective(HspXhxtpgInf record);

    List<HspXhxtpgInf> selectByExample(HspXhxtpgInfExample example);

    HspXhxtpgInf selectByPrimaryKey(String xtpgSeq);

    int updateByExampleSelective(@Param("record") HspXhxtpgInf record, @Param("example") HspXhxtpgInfExample example);

    int updateByExample(@Param("record") HspXhxtpgInf record, @Param("example") HspXhxtpgInfExample example);

    int updateByPrimaryKeySelective(HspXhxtpgInf record);

    int updateByPrimaryKey(HspXhxtpgInf record);
}