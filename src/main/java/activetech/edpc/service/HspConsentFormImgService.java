package activetech.edpc.service;

import activetech.base.pojo.dto.ActiveUser;
import activetech.edpc.pojo.dto.HspConsentFormImgQueryDto;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public interface HspConsentFormImgService {
    /**
     * 查询患者同意书历史 以及是否已拍照上传
     *
     * @param hspConsentFormImgQueryDto hspConsentFormImgQueryDto
     * @return java.util.Map<java.lang.String, java.lang.Object>
     * @author chenys
     * @date 2023/4/6 18:25
     */
    Map<String, Object> queryHspConsentFormImgCustomInfo(HspConsentFormImgQueryDto hspConsentFormImgQueryDto);

    /**
     * 同意书拍照上传 存放minio
     *
     * @param multipartFile             multipartFile
     * @param hspConsentFormImgQueryDto hspConsentFormImgQueryDto
     * @param activeUser                activeUser
     * @throws Exception Exception
     * @author chenys
     * @date 2023/4/6 18:26
     */
    String uploadConsentFormImg(MultipartFile multipartFile, HspConsentFormImgQueryDto hspConsentFormImgQueryDto, ActiveUser activeUser) throws Exception;

    /**
     * 查询同意书下的拍照图片
     *
     * @param hspConsentFormImgQueryDto hspConsentFormImgQueryDto
     * @return java.util.Map<java.lang.String, java.lang.Object>
     * @author chenys
     * @date 2023/4/6 18:26
     */
    Map<String, Object> queryConsentFormImgInfo(HspConsentFormImgQueryDto hspConsentFormImgQueryDto);


    /**
     * 删除文书图片
     *
     * @param hspConsentFormImgQueryDto hspConsentFormImgQueryDto
     * @throws Exception Exception
     * @author chenys
     * @date 2023/4/11 11:06
     */
    void deleteConsentFormImgInfo(HspConsentFormImgQueryDto hspConsentFormImgQueryDto) throws Exception;

    /**
     * 图片下载
     *
     * @param id       id
     * @param response response
     * @throws Exception Exception
     * @author chenys
     * @date 2023/4/11 11:06
     */
    void conFmImgDownload(String id, HttpServletResponse response) throws Exception;

}
