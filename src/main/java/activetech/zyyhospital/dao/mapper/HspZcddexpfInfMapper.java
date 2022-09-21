package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspZcddexpfInf;
import activetech.zyyhospital.pojo.domain.HspZcddexpfInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspZcddexpfInfMapper {
    int countByExample(HspZcddexpfInfExample example);

    int deleteByExample(HspZcddexpfInfExample example);

    int deleteByPrimaryKey(String xtpgSeq);

    int insert(HspZcddexpfInf record);

    int insertSelective(HspZcddexpfInf record);

    List<HspZcddexpfInf> selectByExample(HspZcddexpfInfExample example);

    HspZcddexpfInf selectByPrimaryKey(String xtpgSeq);

    int updateByExampleSelective(@Param("record") HspZcddexpfInf record, @Param("example") HspZcddexpfInfExample example);

    int updateByExample(@Param("record") HspZcddexpfInf record, @Param("example") HspZcddexpfInfExample example);

    int updateByPrimaryKeySelective(HspZcddexpfInf record);

    int updateByPrimaryKey(HspZcddexpfInf record);
}