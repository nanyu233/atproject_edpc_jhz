package activetech.zyyhospital.dao.mapper;

import activetech.zyyhospital.pojo.domain.HspDzblDict;
import activetech.zyyhospital.pojo.domain.HspDzblDictExample;
import activetech.zyyhospital.pojo.dto.HspDzblDictCustom;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HspDzblDictMapper {
    int countByExample(HspDzblDictExample example);

    int deleteByExample(HspDzblDictExample example);

    int insert(HspDzblDict record);

    int insertSelective(HspDzblDict record);

    List<HspDzblDict> selectByExample(HspDzblDictExample example);

    int updateByExampleSelective(@Param("record") HspDzblDict record, @Param("example") HspDzblDictExample example);

    int updateByExample(@Param("record") HspDzblDict record, @Param("example") HspDzblDictExample example);

	List<HspDzblDictCustom> findHspDzblDictList(HspDzblDictCustom hspDzblDictCustom);
}