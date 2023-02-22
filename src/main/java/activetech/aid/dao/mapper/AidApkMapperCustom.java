package activetech.aid.dao.mapper;

import activetech.aid.pojo.domain.AidApk;
import activetech.aid.pojo.dto.AidApkCustom;
import activetech.aid.pojo.dto.AidApkQueryDto;

import java.util.List;

public interface AidApkMapperCustom {

    int countByQueryDto(AidApkQueryDto aidApkQueryDto);

    List<AidApkCustom> selectByQueryDto(AidApkQueryDto aidApkQueryDto);

    void insert(AidApk aidApk);
}