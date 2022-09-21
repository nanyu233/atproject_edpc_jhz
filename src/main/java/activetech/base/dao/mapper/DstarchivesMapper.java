package activetech.base.dao.mapper;

import activetech.base.pojo.domain.Dstarchives;
import activetech.base.pojo.domain.DstarchivesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DstarchivesMapper {
    int countByExample(DstarchivesExample example);

    int deleteByExample(DstarchivesExample example);

    int deleteByPrimaryKey(String fileSeq);

    int insert(Dstarchives record);

    int insertSelective(Dstarchives record);

    List<Dstarchives> selectByExample(DstarchivesExample example);

    Dstarchives selectByPrimaryKey(String fileSeq);

    int updateByExampleSelective(@Param("record") Dstarchives record, @Param("example") DstarchivesExample example);

    int updateByExample(@Param("record") Dstarchives record, @Param("example") DstarchivesExample example);

    int updateByPrimaryKeySelective(Dstarchives record);

    int updateByPrimaryKey(Dstarchives record);
}