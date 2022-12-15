package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspTimDiff;
import activetech.edpc.pojo.domain.HspXtAdd;

public interface HspTimDiffCustomMapper {
    int updateBySelective(HspTimDiff record);

    int getMedianMonth(HspTimDiff hspTimDiff);

    int getAverageMonth(HspTimDiff hspTimDiff);

    int getMedianYear(HspTimDiff hspTimDiff);

    int getAverageYear(HspTimDiff hspTimDiff);

    void updateOrInsertHspTimDiff(HspTimDiff hspTimDiff);
}
