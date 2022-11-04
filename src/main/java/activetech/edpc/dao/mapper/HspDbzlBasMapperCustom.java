package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.domain.HspDbzlBas;
import activetech.edpc.pojo.dto.HspDbzlBasCustom;
import activetech.edpc.pojo.dto.HspDbzlBasQueryDto;

import java.util.List;

public interface HspDbzlBasMapperCustom {
    /**
     * 胸痛登记页面基本信息更新
     * @param hspDbzlBasQueryDto
     */
    public void updateHspDbzlBasByRegSeq(HspDbzlBasQueryDto hspDbzlBasQueryDto);

    public List<HspDbzlBasCustom> selectHspDbzlBasPatient(HspDbzlBasQueryDto hspDbzlBasQueryDto);

    int countByCondition(HspDbzlBasQueryDto hspDbzlBasQueryDto);

    HspDbzlBas selectByPrimaryByEmgSeq(String emgNo);
}
