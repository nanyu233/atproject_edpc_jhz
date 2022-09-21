package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspHljldclrInf;
import activetech.zyyhospital.pojo.domain.HspHljldclrInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspHljldclrInfMapper {
    int countByExample(HspHljldclrInfExample example);

    int deleteByExample(HspHljldclrInfExample example);

    int insert(HspHljldclrInf record);

    int insertSelective(HspHljldclrInf record);

    List<HspHljldclrInf> selectByExample(HspHljldclrInfExample example);

    int updateByExampleSelective(@Param("record") HspHljldclrInf record, @Param("example") HspHljldclrInfExample example);

    int updateByExample(@Param("record") HspHljldclrInf record, @Param("example") HspHljldclrInfExample example);
}