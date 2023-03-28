package activetech.edpc.service;

import activetech.base.pojo.domain.TreeNode;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.result.ExceptionResultInfo;
import activetech.edpc.pojo.dto.HspYjqdInfQueryDto;

import java.util.List;

/**
 * 一键启动service接口
 *
 * @author Chen Haoyuan
 * @date 2023-03-24 10:25
 */
public interface YjqdService {

    /**
     * 查询群组用户树
     *
     * @return
     * @throws Exception
     */
    List<TreeNode> queryGroupUserTree() throws Exception;

    /**
     * 新增一键启动
     *
     * @param hspYjqdInfQueryDto
     * @param activeUser
     * @throws Exception
     */
    void addYjqd(HspYjqdInfQueryDto hspYjqdInfQueryDto, ActiveUser activeUser) throws Exception;
}
