package activetech.base.dao.mapper;

import activetech.base.pojo.domain.HspAddrPost;
import activetech.base.pojo.domain.HspAddrPostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspAddrPostMapper {
    int countByExample(HspAddrPostExample example);

    int deleteByExample(HspAddrPostExample example);

    int deleteByPrimaryKey(String addrCode);

    int insert(HspAddrPost record);

    int insertSelective(HspAddrPost record);

    List<HspAddrPost> selectByExample(HspAddrPostExample example);

    HspAddrPost selectByPrimaryKey(String addrCode);

    int updateByExampleSelective(@Param("record") HspAddrPost record, @Param("example") HspAddrPostExample example);

    int updateByExample(@Param("record") HspAddrPost record, @Param("example") HspAddrPostExample example);

    int updateByPrimaryKeySelective(HspAddrPost record);

    int updateByPrimaryKey(HspAddrPost record);
}