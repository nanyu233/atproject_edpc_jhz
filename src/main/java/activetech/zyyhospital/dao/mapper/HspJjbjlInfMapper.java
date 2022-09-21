package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspJjbjlInf;
import activetech.zyyhospital.pojo.domain.HspJjbjlInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspJjbjlInfMapper {
    int countByExample(HspJjbjlInfExample example);

    int deleteByExample(HspJjbjlInfExample example);

    int deleteByPrimaryKey(String jjbjlSeq);

    int insert(HspJjbjlInf record);

    int insertSelective(HspJjbjlInf record);

    List<HspJjbjlInf> selectByExampleWithBLOBs(HspJjbjlInfExample example);

    List<HspJjbjlInf> selectByExample(HspJjbjlInfExample example);

    HspJjbjlInf selectByPrimaryKey(String jjbjlSeq);

    int updateByExampleSelective(@Param("record") HspJjbjlInf record, @Param("example") HspJjbjlInfExample example);

    int updateByExampleWithBLOBs(@Param("record") HspJjbjlInf record, @Param("example") HspJjbjlInfExample example);

    int updateByExample(@Param("record") HspJjbjlInf record, @Param("example") HspJjbjlInfExample example);

    int updateByPrimaryKeySelective(HspJjbjlInf record);

    int updateByPrimaryKeyWithBLOBs(HspJjbjlInf record);

    int updateByPrimaryKey(HspJjbjlInf record);
}