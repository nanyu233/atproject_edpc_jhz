package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspHljldcrltjInf;
import activetech.zyyhospital.pojo.domain.HspHljldcrltjInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspHljldcrltjInfMapper {
    int countByExample(HspHljldcrltjInfExample example);

    int deleteByExample(HspHljldcrltjInfExample example);

    int insert(HspHljldcrltjInf record);

    int insertSelective(HspHljldcrltjInf record);

    List<HspHljldcrltjInf> selectByExample(HspHljldcrltjInfExample example);

    int updateByExampleSelective(@Param("record") HspHljldcrltjInf record, @Param("example") HspHljldcrltjInfExample example);

    int updateByExample(@Param("record") HspHljldcrltjInf record, @Param("example") HspHljldcrltjInfExample example);
}