package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspDinggrp;
import activetech.edpc.pojo.domain.HspDinggrpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspDinggrpMapper {
    long countByExample(HspDinggrpExample example);

    int deleteByExample(HspDinggrpExample example);

    int deleteByPrimaryKey(@Param("regSeq") String regSeq, @Param("chatid") String chatid);

    int insert(HspDinggrp record);

    int insertSelective(HspDinggrp record);

    List<HspDinggrp> selectByExample(HspDinggrpExample example);

    HspDinggrp selectByPrimaryKey(@Param("regSeq") String regSeq, @Param("chatid") String chatid);

    int updateByExampleSelective(@Param("record") HspDinggrp record, @Param("example") HspDinggrpExample example);

    int updateByExample(@Param("record") HspDinggrp record, @Param("example") HspDinggrpExample example);

    int updateByPrimaryKeySelective(HspDinggrp record);

    int updateByPrimaryKey(HspDinggrp record);
}