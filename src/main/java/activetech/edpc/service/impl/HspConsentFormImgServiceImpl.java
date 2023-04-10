package activetech.edpc.service.impl;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.util.MinIoUtil;
import activetech.edpc.dao.mapper.HspConsentFormImgMapper;
import activetech.edpc.dao.mapper.HspConsentFormImgMapperCustom;
import activetech.edpc.pojo.domain.HspConsentFormImg;
import activetech.edpc.pojo.dto.HspConsentFormImgCustom;
import activetech.edpc.pojo.dto.HspConsentFormImgQueryDto;
import activetech.edpc.service.HspConsentFormImgService;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.util.Assert;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HspConsentFormImgServiceImpl implements HspConsentFormImgService {

    @Resource
    private HspConsentFormImgMapperCustom hspConsentFormImgMapperCustom;

    @Resource
    private HspConsentFormImgMapper hspConsentFormImgMapper;

    @Resource(name = "transactionManager")
    private PlatformTransactionManager platformTransactionManager;

    /**
     * 存放同意书照片的 桶名
     */
    private static final String BUCKET_NAME = "consent-form-img";

    @Override
    public Map<String, Object> queryHspConsentFormImgCustomInfo(HspConsentFormImgQueryDto hspConsentFormImgQueryDto) {
        Map<String, Object> map = new HashMap<>();
        HspConsentFormImgCustom hspConsentFormImgCustom = hspConsentFormImgQueryDto.getHspConsentFormImgCustom();
        Assert.isTrue(StringUtils.isNotNullAndEmptyByTrim(hspConsentFormImgCustom.getPatientId()), "PatientId is not null");
        List<HspConsentFormImgCustom> hspConsentFormImgCustoms;
        //PROPAGATION_REQUIRES_NEW [开始一个新事务。如果当前有事务，则该事务挂起]
        DefaultTransactionDefinition def = new DefaultTransactionDefinition();
        def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRES_NEW);
        //获得事务状态
        TransactionStatus status = platformTransactionManager.getTransaction(def);
        //执行存储过程
        try {
            String sceneType = !StringUtils.isNotNullAndEmptyByTrim(hspConsentFormImgCustom.getSceneType()) ? "1" : hspConsentFormImgCustom.getSceneType();
            hspConsentFormImgMapperCustom.proc_his_ConsentFormData(hspConsentFormImgCustom.getPatientId(), sceneType);
            hspConsentFormImgCustoms = hspConsentFormImgMapperCustom.queryHspConsentFormImgCustomInfo(hspConsentFormImgCustom);
            platformTransactionManager.commit(status);
        } catch (Exception e) {
            platformTransactionManager.rollback(status);
            throw new RuntimeException(e);
        }
        map.put("ConsentFormImgInfos", hspConsentFormImgCustoms);
        return map;
    }

    @Override
    public void uploadConsentFormImg(MultipartFile multipartFile, HspConsentFormImgQueryDto hspConsentFormImgQueryDto, ActiveUser activeUser) throws Exception {
        HspConsentFormImgCustom hspConsentFormImgCustom = hspConsentFormImgQueryDto.getHspConsentFormImgCustom();
        String uuid = UUIDBuild.getUUID();
        hspConsentFormImgCustom.setId(uuid);
        //判断是否存在桶
        boolean b = MinIoUtil.bucketExists(BUCKET_NAME);
        if (!b) {
            MinIoUtil.createBucket(BUCKET_NAME);
        }
        //上传图片  命名规则 [患者ID + "/" + 同意书ID + "/" + UUID + .文件后缀]
        String fileName = getFileName(hspConsentFormImgCustom, multipartFile);
        MinIoUtil.putObject(BUCKET_NAME, multipartFile, fileName, multipartFile.getContentType());
        hspConsentFormImgCustom.setFileName(fileName);
        hspConsentFormImgCustom.setSaveTime(new Date());
        hspConsentFormImgCustom.setCreatedBy(activeUser.getUsrno());
        hspConsentFormImgCustom.setCreatedTime(new Date());
        hspConsentFormImgCustom.setUpdatedBy(activeUser.getUsrno());
        hspConsentFormImgCustom.setUpdatedTime(new Date());
        hspConsentFormImgMapper.insertSelective(hspConsentFormImgCustom);
    }

    @Override
    public Map<String, Object> queryConsentFormImgInfo(HspConsentFormImgQueryDto hspConsentFormImgQueryDto) {
        Map<String, Object> map = new HashMap<>();
        HspConsentFormImgCustom hspConsentFormImgCustom = hspConsentFormImgQueryDto.getHspConsentFormImgCustom();
        List<HspConsentFormImgCustom> hspConsentFormImgCustoms = hspConsentFormImgMapperCustom.selectByConsentFormSeqCustom(hspConsentFormImgCustom.getConsentFormSeq());
        if (hspConsentFormImgCustoms != null) {
            hspConsentFormImgCustoms.forEach(consentFormImgInfo -> {
                String presignedObjectUrl = MinIoUtil.getPresignedObjectUrl(BUCKET_NAME, consentFormImgInfo.getFileName(), 1);
                consentFormImgInfo.setImgUri(presignedObjectUrl);
            });
        }
        map.put("consentFormImgInfo", hspConsentFormImgCustoms);
        return map;
    }

    @Override
    public void deleteConsentFormImgInfo(HspConsentFormImgQueryDto hspConsentFormImgQueryDto) throws Exception {
        HspConsentFormImgCustom hspConsentFormImgCustom = hspConsentFormImgQueryDto.getHspConsentFormImgCustom();
        String id = hspConsentFormImgCustom.getId();
        HspConsentFormImg hspConsentFormImg = hspConsentFormImgMapper.selectByPrimaryKey(id);
        if (hspConsentFormImg != null) {
            String fileName = hspConsentFormImg.getFileName();
            MinIoUtil.removeObject(BUCKET_NAME, fileName);
            hspConsentFormImgMapper.deleteByPrimaryKey(id);
        }
    }

    private String getFileName(HspConsentFormImgCustom hspConsentFormImgCustom, MultipartFile multipartFile) {
        String patientId = hspConsentFormImgCustom.getPatientId();
        String consentFormId = hspConsentFormImgCustom.getConsentFormId();
        String id = hspConsentFormImgCustom.getId();
        String originalFilename = multipartFile.getOriginalFilename();
        String suffixFileName = originalFilename.substring(originalFilename.lastIndexOf("."));
        return patientId + "/" + consentFormId + "/" + id + suffixFileName;
    }
}
