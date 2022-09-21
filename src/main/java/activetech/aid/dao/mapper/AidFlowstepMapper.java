package activetech.aid.dao.mapper;

import activetech.aid.pojo.domain.AidFlowstep;
import activetech.aid.pojo.domain.AidFlowstepExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AidFlowstepMapper {
    int countByExample(AidFlowstepExample example);

    int deleteByExample(AidFlowstepExample example);

    int deleteByPrimaryKey(String flowseq);

    int insert(AidFlowstep record);

    int insertSelective(AidFlowstep record);

    List<AidFlowstep> selectByExample(AidFlowstepExample example);

    AidFlowstep selectByPrimaryKey(String flowseq);

    int updateByExampleSelective(@Param("record") AidFlowstep record, @Param("example") AidFlowstepExample example);

    int updateByExample(@Param("record") AidFlowstep record, @Param("example") AidFlowstepExample example);

    int updateByPrimaryKeySelective(AidFlowstep record);

    int updateByPrimaryKey(AidFlowstep record);
}