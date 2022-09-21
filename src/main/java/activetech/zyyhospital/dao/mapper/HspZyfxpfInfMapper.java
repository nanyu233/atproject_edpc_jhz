package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspZyfxpfInf;
import activetech.zyyhospital.pojo.domain.HspZyfxpfInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspZyfxpfInfMapper {
    int countByExample(HspZyfxpfInfExample example);

    int deleteByExample(HspZyfxpfInfExample example);

    int deleteByPrimaryKey(String zyfxpfSeq);

    int insert(HspZyfxpfInf record);

    int insertSelective(HspZyfxpfInf record);

    List<HspZyfxpfInf> selectByExample(HspZyfxpfInfExample example);

    HspZyfxpfInf selectByPrimaryKey(String zyfxpfSeq);

    int updateByExampleSelective(@Param("record") HspZyfxpfInf record, @Param("example") HspZyfxpfInfExample example);

    int updateByExample(@Param("record") HspZyfxpfInf record, @Param("example") HspZyfxpfInfExample example);

    int updateByPrimaryKeySelective(HspZyfxpfInf record);

    int updateByPrimaryKey(HspZyfxpfInf record);
}