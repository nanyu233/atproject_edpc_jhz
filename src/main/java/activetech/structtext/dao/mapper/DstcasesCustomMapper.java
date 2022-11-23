package activetech.structtext.dao.mapper;

import activetech.structtext.pojo.dto.DstcasesCustom;
import activetech.structtext.pojo.dto.DstcasesQueryDto;

import java.util.List;

public interface DstcasesCustomMapper {

    List<DstcasesCustom> queryDstcasesInfo(DstcasesQueryDto dstcasesQueryDto);

}
