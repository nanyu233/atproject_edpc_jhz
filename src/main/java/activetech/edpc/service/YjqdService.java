package activetech.edpc.service;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.result.ExceptionResultInfo;
import activetech.edpc.pojo.dto.HspYjqdInfQueryDto;

/**
 * 一键启动service接口
 *
 * @author Chen Haoyuan
 * @date 2023-03-24 10:25
 */
public interface YjqdService {

    /**
     * 新增一键启动
     *
     * @param hspYjqdInfQueryDto
     * @param activeUser
     * @throws Exception
     */
    void addYjqd(HspYjqdInfQueryDto hspYjqdInfQueryDto, ActiveUser activeUser) throws Exception;
}
