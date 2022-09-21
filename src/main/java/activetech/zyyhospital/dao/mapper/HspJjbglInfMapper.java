package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspJjbglInf;
import activetech.zyyhospital.pojo.domain.HspJjbglInfExample;
import activetech.zyyhospital.pojo.domain.HspJjbglInfWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspJjbglInfMapper {
    int countByExample(HspJjbglInfExample example);

    int deleteByExample(HspJjbglInfExample example);

    int deleteByPrimaryKey(String jjbglSeq);

    int insert(HspJjbglInfWithBLOBs record);

    int insertSelective(HspJjbglInfWithBLOBs record);

    List<HspJjbglInfWithBLOBs> selectByExampleWithBLOBs(HspJjbglInfExample example);

    List<HspJjbglInf> selectByExample(HspJjbglInfExample example);

    HspJjbglInfWithBLOBs selectByPrimaryKey(String jjbglSeq);

    int updateByExampleSelective(@Param("record") HspJjbglInfWithBLOBs record, @Param("example") HspJjbglInfExample example);

    int updateByExampleWithBLOBs(@Param("record") HspJjbglInfWithBLOBs record, @Param("example") HspJjbglInfExample example);

    int updateByExample(@Param("record") HspJjbglInf record, @Param("example") HspJjbglInfExample example);

    int updateByPrimaryKeySelective(HspJjbglInfWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HspJjbglInfWithBLOBs record);

    int updateByPrimaryKey(HspJjbglInf record);
}