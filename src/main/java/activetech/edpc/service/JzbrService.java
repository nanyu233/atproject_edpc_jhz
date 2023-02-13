package activetech.edpc.service;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.edpc.pojo.dto.HspDbzlBasQueryDto;
import activetech.hospital.pojo.dto.HspemginfQueryDto;

/**
 * 急诊病人进入多病种中心
 * @author n
 */
public interface JzbrService {
    /**
     * 急诊病人进入多病种中心
     * @param hspemginfQueryDto hspemginfQueryDto
     * @throws Exception Exception
     */
    void enterDbzl(HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser) throws Exception;
    /**
     * 分诊获取dbzl_bas列表
     * @return
     */
    DataGridResultInfo getPatientListForDbzlBas(HspDbzlBasQueryDto hspDbzlBasQueryDto);

    ResultInfo queryHspDbzlBasinf(HspDbzlBasQueryDto hspDbzlBasQueryDto);
}
