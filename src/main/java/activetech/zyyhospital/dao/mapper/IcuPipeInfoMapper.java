package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.IcuPipeInfo;
import activetech.zyyhospital.pojo.domain.IcuPipeInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IcuPipeInfoMapper {
    int countByExample(IcuPipeInfoExample example);

    int deleteByExample(IcuPipeInfoExample example);

    int deleteByPrimaryKey(String pipeSeq);

    int insert(IcuPipeInfo record);

    int insertSelective(IcuPipeInfo record);

    List<IcuPipeInfo> selectByExample(IcuPipeInfoExample example);

    IcuPipeInfo selectByPrimaryKey(String pipeSeq);

    int updateByExampleSelective(@Param("record") IcuPipeInfo record, @Param("example") IcuPipeInfoExample example);

    int updateByExample(@Param("record") IcuPipeInfo record, @Param("example") IcuPipeInfoExample example);

    int updateByPrimaryKeySelective(IcuPipeInfo record);

    int updateByPrimaryKey(IcuPipeInfo record);
}