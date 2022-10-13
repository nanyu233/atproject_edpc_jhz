package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspDbzlBas;
import activetech.edpc.pojo.domain.HspDbzlBasExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspDbzlBasMapper {
    long countByExample(HspDbzlBasExample example);

    int deleteByExample(HspDbzlBasExample example);

    int deleteByPrimaryKey(String regSeq);

    int insert(HspDbzlBas record);

    int insertSelective(HspDbzlBas record);

    List<HspDbzlBas> selectByExample(HspDbzlBasExample example);

    HspDbzlBas selectByPrimaryKey(String regSeq);

    int updateByExampleSelective(@Param("record") HspDbzlBas record, @Param("example") HspDbzlBasExample example);

    int updateByExample(@Param("record") HspDbzlBas record, @Param("example") HspDbzlBasExample example);

    int updateByPrimaryKeySelective(HspDbzlBas record);

    int updateByPrimaryKey(HspDbzlBas record);
}