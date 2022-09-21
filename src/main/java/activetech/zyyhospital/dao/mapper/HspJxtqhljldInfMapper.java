package activetech.zyyhospital.dao.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Param;
import activetech.zyyhospital.pojo.domain.HspJxtqhljldInf;
import activetech.zyyhospital.pojo.domain.HspJxtqhljldInfExample;

public interface HspJxtqhljldInfMapper {
    long countByExample(HspJxtqhljldInfExample example);

    int deleteByExample(HspJxtqhljldInfExample example);

    int deleteByPrimaryKey(String jxtqSeq);

    int insert(HspJxtqhljldInf record);

    int insertSelective(HspJxtqhljldInf record);

    List<HspJxtqhljldInf> selectByExample(HspJxtqhljldInfExample example);

    HspJxtqhljldInf selectByPrimaryKey(String jxtqSeq);

    int updateByExampleSelective(@Param("record") HspJxtqhljldInf record, @Param("example") HspJxtqhljldInfExample example);

    int updateByExample(@Param("record") HspJxtqhljldInf record, @Param("example") HspJxtqhljldInfExample example);

    int updateByPrimaryKeySelective(HspJxtqhljldInf record);

    int updateByPrimaryKey(HspJxtqhljldInf record);
}