package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspDocadviceInf;
import activetech.zyyhospital.pojo.domain.HspDocadviceInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspDocadviceInfMapper {
    int countByExample(HspDocadviceInfExample example);

    int deleteByExample(HspDocadviceInfExample example);

    int deleteByPrimaryKey(String docadviceSeq);

    int insert(HspDocadviceInf record);

    int insertSelective(HspDocadviceInf record);

    List<HspDocadviceInf> selectByExampleWithBLOBs(HspDocadviceInfExample example);

    List<HspDocadviceInf> selectByExample(HspDocadviceInfExample example);

    HspDocadviceInf selectByPrimaryKey(String docadviceSeq);

    int updateByExampleSelective(@Param("record") HspDocadviceInf record, @Param("example") HspDocadviceInfExample example);

    int updateByExampleWithBLOBs(@Param("record") HspDocadviceInf record, @Param("example") HspDocadviceInfExample example);

    int updateByExample(@Param("record") HspDocadviceInf record, @Param("example") HspDocadviceInfExample example);

    int updateByPrimaryKeySelective(HspDocadviceInf record);

    int updateByPrimaryKeyWithBLOBs(HspDocadviceInf record);

    int updateByPrimaryKey(HspDocadviceInf record);
}