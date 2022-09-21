package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspJjbhzmx;
import activetech.zyyhospital.pojo.domain.HspJjbhzmxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspJjbhzmxMapper {
    int countByExample(HspJjbhzmxExample example);

    int deleteByExample(HspJjbhzmxExample example);

    int insert(HspJjbhzmx record);

    int insertSelective(HspJjbhzmx record);

    List<HspJjbhzmx> selectByExample(HspJjbhzmxExample example);

    int updateByExampleSelective(@Param("record") HspJjbhzmx record, @Param("example") HspJjbhzmxExample example);

    int updateByExample(@Param("record") HspJjbhzmx record, @Param("example") HspJjbhzmxExample example);

    int updateByPrimaryKeySelective(HspJjbhzmx record);

    int updateByPrimaryKey(HspJjbhzmx record);
}