package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.dto.HspTimDiffCustom;
import activetech.edpc.pojo.dto.HspTimDiffHisCustom;
import activetech.edpc.pojo.dto.HspTimDiffQueryDto;

import java.util.List;

public interface HspTimDiffHisCustomMapper {
    List<HspTimDiffHisCustom> selectByConditions(HspTimDiffQueryDto hspTimDiffQueryDto);

    int selectCountByConditions(HspTimDiffQueryDto hspTimDiffQueryDto);
}
