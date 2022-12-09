package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspDbzlBas;
import activetech.edpc.pojo.dto.HspDbzlBasCustom;
import activetech.edpc.pojo.dto.HspDbzlBasQueryDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HspDbzlBasMapperCustom {
    /**
     * 胸痛登记页面基本信息更新
     * @param hspDbzlBasQueryDto
     */
    public void updateHspDbzlBasByRegSeq(HspDbzlBasQueryDto hspDbzlBasQueryDto);

    public List<HspDbzlBasCustom> selectHspDbzlBasPatient(HspDbzlBasQueryDto hspDbzlBasQueryDto);

    int countByCondition(HspDbzlBasQueryDto hspDbzlBasQueryDto);

    public HspDbzlBas selectByPrimaryByEmgSeq(String emgNo);

    public HspDbzlBasCustom selectByEmgSeq(String emgSeq);

    void reviewSubmitBySeqArr(@Param(value = "hspDbzlBasCustom") HspDbzlBasCustom hspDbzlBasCustom, @Param(value = "seqArr") String[] seqArr) throws Exception;

    /**
     * 上报
     * @param hspDbzlBasCustom hspDbzlBasCustom
     */
    void editDbzlBasByReport(HspDbzlBasCustom hspDbzlBasCustom) throws Exception;

    /**
     * 统计胸痛患者数目
     * @param hspDbzlBasQueryDto
     * @return
     */
    int countXtPatientList(HspDbzlBasQueryDto hspDbzlBasQueryDto);

    /**
     * 查询hspDbzlBas的胸痛患者列表请求
     * @param hspDbzlBasQueryDto
     * @return
     */
    List<HspDbzlBasCustom> getXtPatientList(HspDbzlBasQueryDto hspDbzlBasQueryDto);

    HspDbzlBasCustom getHspDbzlBasinf(HspDbzlBasQueryDto hspDbzlBasQueryDto);
}
