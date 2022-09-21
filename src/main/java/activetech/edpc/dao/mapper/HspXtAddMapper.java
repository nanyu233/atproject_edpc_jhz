package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspXtAdd;
import activetech.edpc.pojo.domain.HspXtAddExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspXtAddMapper {
    int countByExample(HspXtAddExample example);

    int deleteByExample(HspXtAddExample example);

    int deleteByPrimaryKey(String xtSeq);

    int insert(HspXtAdd record);

    int insertSelective(HspXtAdd record);

    List<HspXtAdd> selectByExample(HspXtAddExample example);

    HspXtAdd selectByPrimaryKey(String xtSeq);

    int updateByExampleSelective(@Param("record") HspXtAdd record, @Param("example") HspXtAddExample example);

    int updateByExample(@Param("record") HspXtAdd record, @Param("example") HspXtAddExample example);

    int updateByPrimaryKeySelective(HspXtAdd record);

    int updateByPrimaryKey(HspXtAdd record);
}