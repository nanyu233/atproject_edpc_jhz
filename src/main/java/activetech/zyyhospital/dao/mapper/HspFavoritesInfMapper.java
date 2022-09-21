package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspFavoritesInf;
import activetech.zyyhospital.pojo.domain.HspFavoritesInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspFavoritesInfMapper {
    int countByExample(HspFavoritesInfExample example);

    int deleteByExample(HspFavoritesInfExample example);

    int deleteByPrimaryKey(String seqno);

    int insert(HspFavoritesInf record);

    int insertSelective(HspFavoritesInf record);

    List<HspFavoritesInf> selectByExample(HspFavoritesInfExample example);

    HspFavoritesInf selectByPrimaryKey(String seqno);

    int updateByExampleSelective(@Param("record") HspFavoritesInf record, @Param("example") HspFavoritesInfExample example);

    int updateByExample(@Param("record") HspFavoritesInf record, @Param("example") HspFavoritesInfExample example);

    int updateByPrimaryKeySelective(HspFavoritesInf record);

    int updateByPrimaryKey(HspFavoritesInf record);
}