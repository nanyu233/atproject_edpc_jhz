package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.dto.HspConsentFormImgCustom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HspConsentFormImgMapperCustom {
    /**
     * 存储过程，获取文书列表
     *
     * @param patientId patientId
     * @param sceneType sceneType
     * @throws Exception Exception
     * @author chenys
     * @date 2023/4/7 13:24
     */
    void proc_his_ConsentFormData(@Param("patientId") String patientId, @Param("sceneType") String sceneType) throws Exception;

    /**
     * 查询同意书列表
     *
     * @param hspConsentFormImgCustom hspConsentFormImgCustom
     * @return java.util.List<activetech.edpc.pojo.dto.HspConsentFormImgCustom>
     * @author chenys
     * @date 2023/4/6 18:27
     */
    List<HspConsentFormImgCustom> queryHspConsentFormImgCustomInfo(HspConsentFormImgCustom hspConsentFormImgCustom);

    /**
     * 查询同意书下的 图片列表
     *
     * @param consentFormSeq consentFormSeq
     * @return java.util.List<activetech.edpc.pojo.dto.HspConsentFormImgCustom>
     * @author chenys
     * @date 2023/4/6 18:28
     */
    List<HspConsentFormImgCustom> selectByConsentFormSeqCustom(@Param("consentFormSeq") String consentFormSeq);

}
