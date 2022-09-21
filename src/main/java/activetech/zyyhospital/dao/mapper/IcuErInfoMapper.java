package activetech.zyyhospital.dao.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import activetech.zyyhospital.pojo.domain.IcuErInfo;
import activetech.zyyhospital.pojo.domain.IcuErInfoExample;

public interface IcuErInfoMapper {
    int countByExample(IcuErInfoExample example);

    int deleteByExample(IcuErInfoExample example);

    int deleteByPrimaryKey(String erSeq);

    int insert(IcuErInfo record);

    int insertSelective(IcuErInfo record);

    List<IcuErInfo> selectByExample(IcuErInfoExample example);

    IcuErInfo selectByPrimaryKey(String erSeq);

    int updateByExampleSelective(@Param("record") IcuErInfo record, @Param("example") IcuErInfoExample example);

    int updateByExample(@Param("record") IcuErInfo record, @Param("example") IcuErInfoExample example);

    int updateByPrimaryKeySelective(IcuErInfo record);

    int updateByPrimaryKey(IcuErInfo record);
}