package activetech.structtext.dao.mapper;

import activetech.structtext.pojo.domain.Dstcases;
import activetech.structtext.pojo.domain.DstcasesExample;
import activetech.structtext.pojo.domain.DstcasesWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DstcasesMapper {
    int countByExample(DstcasesExample example);

    int deleteByExample(DstcasesExample example);

    int deleteByPrimaryKey(String caseSeq);

    int insert(DstcasesWithBLOBs record);

    int insertSelective(DstcasesWithBLOBs record);

    List<DstcasesWithBLOBs> selectByExampleWithBLOBs(DstcasesExample example);

    List<Dstcases> selectByExample(DstcasesExample example);

    DstcasesWithBLOBs selectByPrimaryKey(String caseSeq);

    int updateByExampleSelective(@Param("record") DstcasesWithBLOBs record, @Param("example") DstcasesExample example);

    int updateByExampleWithBLOBs(@Param("record") DstcasesWithBLOBs record, @Param("example") DstcasesExample example);

    int updateByExample(@Param("record") Dstcases record, @Param("example") DstcasesExample example);

    int updateByPrimaryKeySelective(DstcasesWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DstcasesWithBLOBs record);

    int updateByPrimaryKey(Dstcases record);
}