package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspOperateInf;
import activetech.zyyhospital.pojo.domain.HspOperateInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspOperateInfMapper {
    int countByExample(HspOperateInfExample example);

    int deleteByExample(HspOperateInfExample example);

    int deleteByPrimaryKey(String operSeq);

    int insert(HspOperateInf record);

    int insertSelective(HspOperateInf record);

    List<HspOperateInf> selectByExample(HspOperateInfExample example);

    HspOperateInf selectByPrimaryKey(String operSeq);

    int updateByExampleSelective(@Param("record") HspOperateInf record, @Param("example") HspOperateInfExample example);

    int updateByExample(@Param("record") HspOperateInf record, @Param("example") HspOperateInfExample example);

    int updateByPrimaryKeySelective(HspOperateInf record);

    int updateByPrimaryKey(HspOperateInf record);
}