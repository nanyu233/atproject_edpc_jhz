package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspHxxtpgInf;
import activetech.zyyhospital.pojo.domain.HspHxxtpgInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspHxxtpgInfMapper {
    int countByExample(HspHxxtpgInfExample example);

    int deleteByExample(HspHxxtpgInfExample example);

    int deleteByPrimaryKey(String xtpgSeq);

    int insert(HspHxxtpgInf record);

    int insertSelective(HspHxxtpgInf record);

    List<HspHxxtpgInf> selectByExample(HspHxxtpgInfExample example);

    HspHxxtpgInf selectByPrimaryKey(String xtpgSeq);

    int updateByExampleSelective(@Param("record") HspHxxtpgInf record, @Param("example") HspHxxtpgInfExample example);

    int updateByExample(@Param("record") HspHxxtpgInf record, @Param("example") HspHxxtpgInfExample example);

    int updateByPrimaryKeySelective(HspHxxtpgInf record);

    int updateByPrimaryKey(HspHxxtpgInf record);
}