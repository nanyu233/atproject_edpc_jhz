package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspMediaInf;
import activetech.zyyhospital.pojo.domain.HspMediaInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspMediaInfMapper {
    int countByExample(HspMediaInfExample example);

    int deleteByExample(HspMediaInfExample example);

    int deleteByPrimaryKey(String medSeq);

    int insert(HspMediaInf record);

    int insertSelective(HspMediaInf record);

    List<HspMediaInf> selectByExampleWithBLOBs(HspMediaInfExample example);

    List<HspMediaInf> selectByExample(HspMediaInfExample example);

    HspMediaInf selectByPrimaryKey(String medSeq);

    int updateByExampleSelective(@Param("record") HspMediaInf record, @Param("example") HspMediaInfExample example);

    int updateByExampleWithBLOBs(@Param("record") HspMediaInf record, @Param("example") HspMediaInfExample example);

    int updateByExample(@Param("record") HspMediaInf record, @Param("example") HspMediaInfExample example);

    int updateByPrimaryKeySelective(HspMediaInf record);

    int updateByPrimaryKeyWithBLOBs(HspMediaInf record);

    int updateByPrimaryKey(HspMediaInf record);
}