package activetech.aid.service;

import activetech.aid.pojo.domain.AidApk;
import activetech.aid.pojo.dto.AidApkQueryDto;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import org.springframework.web.multipart.MultipartFile;

public interface AidApkService {
    DataGridResultInfo getAidApkList(AidApkQueryDto aidApkQueryDto);

    ResultInfo uploadAppApk(MultipartFile multipartFile, String apkVer, String apkDes, ActiveUser activeUser);

    ResultInfo delAppApk(AidApk aidApk);

    ResultInfo getDownloadUrl(AidApk aidApk);

    ResultInfo updateAppApk(AidApk aidApk);
}
