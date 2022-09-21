package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspBase64Pic;
import activetech.edpc.pojo.domain.HspBase64PicExample;
import activetech.edpc.pojo.domain.HspBase64PicKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspBase64PicMapper {
    int countByExample(HspBase64PicExample example);

    int deleteByExample(HspBase64PicExample example);

    int deleteByPrimaryKey(HspBase64PicKey key);

    int insert(HspBase64Pic record);

    int insertSelective(HspBase64Pic record);

    List<HspBase64Pic> selectByExampleWithBLOBs(HspBase64PicExample example);

    List<HspBase64Pic> selectByExample(HspBase64PicExample example);

    HspBase64Pic selectByPrimaryKey(HspBase64PicKey key);

    int updateByExampleSelective(@Param("record") HspBase64Pic record, @Param("example") HspBase64PicExample example);

    int updateByExampleWithBLOBs(@Param("record") HspBase64Pic record, @Param("example") HspBase64PicExample example);

    int updateByExample(@Param("record") HspBase64Pic record, @Param("example") HspBase64PicExample example);

    int updateByPrimaryKeySelective(HspBase64Pic record);

    int updateByPrimaryKeyWithBLOBs(HspBase64Pic record);
}