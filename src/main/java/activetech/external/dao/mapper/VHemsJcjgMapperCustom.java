package activetech.external.dao.mapper;

import java.util.List;

import activetech.external.pojo.domain.VHemsJcjg;
import activetech.external.pojo.domain.VHemsJcjgExample;
import activetech.external.pojo.dto.VHemsJcjgCustom;
import activetech.external.pojo.dto.VHemsJyjgQueryDto;

public interface VHemsJcjgMapperCustom {

    List<VHemsJcjg> selectByExample(VHemsJcjgExample example);
    
    public List<VHemsJcjgCustom> findVHemsJcjgList(VHemsJyjgQueryDto vHemsJyjgQueryDto);

}