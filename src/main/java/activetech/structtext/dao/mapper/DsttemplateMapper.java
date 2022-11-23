package activetech.structtext.dao.mapper;

import activetech.structtext.pojo.domain.Dsttemplate;
import activetech.structtext.pojo.domain.DsttemplateExample;
import activetech.structtext.pojo.domain.DsttemplateWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DsttemplateMapper {
    int countByExample(DsttemplateExample example);

    int deleteByExample(DsttemplateExample example);

    int deleteByPrimaryKey(String tempSeq);

    int insert(DsttemplateWithBLOBs record);

    int insertSelective(DsttemplateWithBLOBs record);

    List<DsttemplateWithBLOBs> selectByExampleWithBLOBs(DsttemplateExample example);

    List<Dsttemplate> selectByExample(DsttemplateExample example);

    DsttemplateWithBLOBs selectByPrimaryKey(String tempSeq);

    int updateByExampleSelective(@Param("record") DsttemplateWithBLOBs record, @Param("example") DsttemplateExample example);

    int updateByExampleWithBLOBs(@Param("record") DsttemplateWithBLOBs record, @Param("example") DsttemplateExample example);

    int updateByExample(@Param("record") Dsttemplate record, @Param("example") DsttemplateExample example);

    int updateByPrimaryKeySelective(DsttemplateWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DsttemplateWithBLOBs record);

    int updateByPrimaryKey(Dsttemplate record);
}