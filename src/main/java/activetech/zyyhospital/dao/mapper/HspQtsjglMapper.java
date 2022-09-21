package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspQtsjgl;
import activetech.zyyhospital.pojo.domain.HspQtsjglExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspQtsjglMapper {
    int countByExample(HspQtsjglExample example);

    int deleteByExample(HspQtsjglExample example);

    int deleteByPrimaryKey(String qtsjSeq);

    int insert(HspQtsjgl record);

    int insertSelective(HspQtsjgl record);

    List<HspQtsjgl> selectByExample(HspQtsjglExample example);

    HspQtsjgl selectByPrimaryKey(String qtsjSeq);

    int updateByExampleSelective(@Param("record") HspQtsjgl record, @Param("example") HspQtsjglExample example);

    int updateByExample(@Param("record") HspQtsjgl record, @Param("example") HspQtsjglExample example);

    int updateByPrimaryKeySelective(HspQtsjgl record);

    int updateByPrimaryKey(HspQtsjgl record);
}