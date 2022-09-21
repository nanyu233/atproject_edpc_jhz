package activetech.base.dao.mapper;

import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.domain.DstdictinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DstdictinfoMapper {
    int countByExample(DstdictinfoExample example);

    int deleteByExample(DstdictinfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(Dstdictinfo record);

    int insertSelective(Dstdictinfo record);

    List<Dstdictinfo> selectByExample(DstdictinfoExample example);

    Dstdictinfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Dstdictinfo record, @Param("example") DstdictinfoExample example);

    int updateByExample(@Param("record") Dstdictinfo record, @Param("example") DstdictinfoExample example);

    int updateByPrimaryKeySelective(Dstdictinfo record);

    int updateByPrimaryKey(Dstdictinfo record);
    
    int getMaxinfocode(String typecode);
}