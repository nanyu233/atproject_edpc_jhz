package activetech.base.dao.mapper;


import java.util.List;
import org.apache.ibatis.annotations.Param;

import activetech.base.pojo.domain.HspYsczlsjlInf;
import activetech.base.pojo.domain.HspYsczlsjlInfExample;

public interface HspYsczlsjlInfMapper {
    long countByExample(HspYsczlsjlInfExample example);

    int deleteByExample(HspYsczlsjlInfExample example);

    int deleteByPrimaryKey(String lsSeq);

    int insert(HspYsczlsjlInf record);

    int insertSelective(HspYsczlsjlInf record);

    List<HspYsczlsjlInf> selectByExample(HspYsczlsjlInfExample example);

    HspYsczlsjlInf selectByPrimaryKey(String lsSeq);

    int updateByExampleSelective(@Param("record") HspYsczlsjlInf record, @Param("example") HspYsczlsjlInfExample example);

    int updateByExample(@Param("record") HspYsczlsjlInf record, @Param("example") HspYsczlsjlInfExample example);

    int updateByPrimaryKeySelective(HspYsczlsjlInf record);

    int updateByPrimaryKey(HspYsczlsjlInf record);
}