package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspCgxjInf;
import activetech.zyyhospital.pojo.domain.HspCgxjInfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspCgxjInfMapper {
    int countByExample(HspCgxjInfExample example);

    int deleteByExample(HspCgxjInfExample example);

    int deleteByPrimaryKey(String cgxjSeq);

    int insert(HspCgxjInf record);

    int insertSelective(HspCgxjInf record);

    List<HspCgxjInf> selectByExample(HspCgxjInfExample example);

    HspCgxjInf selectByPrimaryKey(String cgxjSeq);

    int updateByExampleSelective(@Param("record") HspCgxjInf record, @Param("example") HspCgxjInfExample example);

    int updateByExample(@Param("record") HspCgxjInf record, @Param("example") HspCgxjInfExample example);

    int updateByPrimaryKeySelective(HspCgxjInf record);

    int updateByPrimaryKey(HspCgxjInf record);
}