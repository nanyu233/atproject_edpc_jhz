package activetech.base.dao.mapper;

import activetech.base.pojo.domain.Dstcompctl;
import activetech.base.pojo.domain.DstcompctlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DstcompctlMapper {
    int countByExample(DstcompctlExample example);

    int deleteByExample(DstcompctlExample example);

    int deleteByPrimaryKey(String comno);

    int insert(Dstcompctl record);

    int insertSelective(Dstcompctl record);

    List<Dstcompctl> selectByExample(DstcompctlExample example);

    Dstcompctl selectByPrimaryKey(String comno);

    int updateByExampleSelective(@Param("record") Dstcompctl record, @Param("example") DstcompctlExample example);

    int updateByExample(@Param("record") Dstcompctl record, @Param("example") DstcompctlExample example);

    int updateByPrimaryKeySelective(Dstcompctl record);

    int updateByPrimaryKey(Dstcompctl record);
}