package activetech.hospital.dao.mapper;

import activetech.hospital.pojo.domain.HspZjpfInf;
import activetech.hospital.pojo.domain.HspZjpfInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspZjpfInfMapper {
    int countByExample(HspZjpfInfExample example);

    int deleteByExample(HspZjpfInfExample example);

    int deleteByPrimaryKey(String zjpfSeq);

    int insert(HspZjpfInf record);

    int insertSelective(HspZjpfInf record);

    List<HspZjpfInf> selectByExample(HspZjpfInfExample example);

    HspZjpfInf selectByPrimaryKey(String zjpfSeq);

    int updateByExampleSelective(@Param("record") HspZjpfInf record, @Param("example") HspZjpfInfExample example);

    int updateByExample(@Param("record") HspZjpfInf record, @Param("example") HspZjpfInfExample example);

    int updateByPrimaryKeySelective(HspZjpfInf record);

    int updateByPrimaryKey(HspZjpfInf record);
}