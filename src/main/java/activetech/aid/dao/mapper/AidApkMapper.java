package activetech.aid.dao.mapper;

import activetech.aid.pojo.domain.AidApk;
import activetech.aid.pojo.domain.AidApkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AidApkMapper {
    int countByExample(AidApkExample example);

    int deleteByExample(AidApkExample example);

    int deleteByPrimaryKey(String apkSeq);

    int insert(AidApk record);

    int insertSelective(AidApk record);

    List<AidApk> selectByExample(AidApkExample example);

    AidApk selectByPrimaryKey(String apkSeq);

    int updateByExampleSelective(@Param("record") AidApk record, @Param("example") AidApkExample example);

    int updateByExample(@Param("record") AidApk record, @Param("example") AidApkExample example);

    int updateByPrimaryKeySelective(AidApk record);

    int updateByPrimaryKey(AidApk record);
}