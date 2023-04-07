package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.dto.HspConsentFormImgCustom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HspConsentFormImgMapperCustom {

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
