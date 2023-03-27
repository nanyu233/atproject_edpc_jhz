package activetech.base.dao.mapper;

import activetech.base.pojo.domain.Dstarchives;
import activetech.base.pojo.dto.DstarchivesCustom;

import java.util.List;

public interface DstarchivesCustomMapper {
    
    int insert(Dstarchives record);

    List<DstarchivesCustom> selectByIndSeq(String indSeq);

}