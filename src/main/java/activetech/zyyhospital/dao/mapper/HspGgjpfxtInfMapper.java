package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspGgjpfxtInf;
import activetech.zyyhospital.pojo.domain.HspGgjpfxtInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspGgjpfxtInfMapper {
    int countByExample(HspGgjpfxtInfExample example);

    int deleteByExample(HspGgjpfxtInfExample example);

    int deleteByPrimaryKey(String xtpgSeq);

    int insert(HspGgjpfxtInf record);

    int insertSelective(HspGgjpfxtInf record);

    List<HspGgjpfxtInf> selectByExample(HspGgjpfxtInfExample example);

    HspGgjpfxtInf selectByPrimaryKey(String xtpgSeq);

    int updateByExampleSelective(@Param("record") HspGgjpfxtInf record, @Param("example") HspGgjpfxtInfExample example);

    int updateByExample(@Param("record") HspGgjpfxtInf record, @Param("example") HspGgjpfxtInfExample example);

    int updateByPrimaryKeySelective(HspGgjpfxtInf record);

    int updateByPrimaryKey(HspGgjpfxtInf record);
}