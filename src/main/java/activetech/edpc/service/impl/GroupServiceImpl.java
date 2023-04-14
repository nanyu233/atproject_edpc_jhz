package activetech.edpc.service.impl;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.DstuserCustom;
import activetech.base.process.context.Config;
import activetech.base.process.result.ExceptionResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.edpc.dao.mapper.HspGrpInfMapper;
import activetech.edpc.dao.mapper.HspGrpInfMapperCustom;
import activetech.edpc.dao.mapper.HspGrpUsrMapper;
import activetech.edpc.dao.mapper.HspGrpUsrMapperCustom;
import activetech.edpc.pojo.domain.HspGrpInf;
import activetech.edpc.pojo.domain.HspGrpUsrExample;
import activetech.edpc.pojo.dto.HspGrpInfCustom;
import activetech.edpc.pojo.dto.HspGrpInfQueryDto;
import activetech.edpc.service.GroupService;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * 群组管理service实现类
 *
 * @author Chen Haoyuan
 * @date 2023-03-15 15:00
 */
public class GroupServiceImpl implements GroupService {

    @Autowired
    private HspGrpInfMapper hspGrpInfMapper;
    @Autowired
    private HspGrpInfMapperCustom hspGrpInfMapperCustom;
    @Autowired
    private HspGrpUsrMapper hspGrpUsrMapper;
    @Autowired
    private HspGrpUsrMapperCustom hspGrpUsrMapperCustom;

    /**
     * 查询群组列表总记录数
     *
     * @param hspGrpInfQueryDto
     * @return
     */
    @Override
    public int getGroupCount(HspGrpInfQueryDto hspGrpInfQueryDto) {
        return hspGrpInfMapperCustom.getGroupCount(hspGrpInfQueryDto);
    }

    /**
     * 分页查询获取群组列表
     *
     * @param hspGrpInfQueryDto
     * @return
     */
    @Override
    public List<HspGrpInfCustom> getGroupList(HspGrpInfQueryDto hspGrpInfQueryDto) {
        return hspGrpInfMapperCustom.getGroupList(hspGrpInfQueryDto);
    }

    /**
     * 查询群组用户列表总记录数
     *
     * @param hspGrpInfQueryDto
     * @return
     */
    @Override
    public int getGroupUserCount(HspGrpInfQueryDto hspGrpInfQueryDto) {
        return hspGrpUsrMapperCustom.getGroupUserCount(hspGrpInfQueryDto);
    }

    /**
     * 分页查询获取群组用户列表
     *
     * @param hspGrpInfQueryDto
     * @return
     */
    @Override
    public List<DstuserCustom> getGroupUserList(HspGrpInfQueryDto hspGrpInfQueryDto) {
        return hspGrpUsrMapperCustom.getGroupUserList(hspGrpInfQueryDto);
    }
    /**
     * 根据主键获取群组记录
     *
     * @param hspGrpInfQueryDto
     * @return
     * @throws Exception
     */
    @Override
    public HspGrpInf findGroupBySeq(HspGrpInfQueryDto hspGrpInfQueryDto) throws Exception {
        // 参数校验
        HspGrpInfCustom hspGrpInfCustom = hspGrpInfQueryDto.getHspGrpInfCustom() != null ? hspGrpInfQueryDto.getHspGrpInfCustom() : new HspGrpInfCustom();
        String grpSeq = hspGrpInfCustom.getGrpSeq();
        if (!StringUtils.isNotNullAndEmptyByTrim(grpSeq)) {
            ResultUtil.throwExcepion(ResultUtil.createWarning(Config.MESSAGE, 922, new Object[]{"群组序号"}));
        }
        HspGrpInf hspGrpInf = hspGrpInfMapper.selectByPrimaryKey(grpSeq);
        if (hspGrpInf == null) {
            ResultUtil.throwExcepion(ResultUtil.createWarning(Config.MESSAGE, 902, new Object[]{}));
        }
        return hspGrpInf;
    }

    /**
     * 群组新增修改参数校验
     *
     * @param hspGrpInfCustom
     * @return return
     */
    private String checkParam(HspGrpInfCustom hspGrpInfCustom) {
        // 群组名称
        if (!StringUtils.isNotNullAndEmptyByTrim(hspGrpInfCustom.getGrpName())) {
            return "群组名称";
        }
        // 群组类型
        if (!StringUtils.isNotNullAndEmptyByTrim(hspGrpInfCustom.getGrpName())) {
            return "群组类型";
        }
        // 状态
        if (!StringUtils.isNotNullAndEmptyByTrim(hspGrpInfCustom.getGrpName())) {
            return "状态";
        }
        return null;
    }

    /**
     * 新增群组
     *
     * @param hspGrpInfQueryDto
     * @param activeUser
     * @throws Exception
     */
    @Override
    public void addGroup(HspGrpInfQueryDto hspGrpInfQueryDto, ActiveUser activeUser) throws Exception {
        // 参数校验
        HspGrpInfCustom hspGrpInfCustom = hspGrpInfQueryDto.getHspGrpInfCustom() != null ? hspGrpInfQueryDto.getHspGrpInfCustom() : new HspGrpInfCustom();
        String fieldName = checkParam(hspGrpInfCustom);
        if (StringUtils.isNotNullAndEmptyByTrim(fieldName)) {
            ResultUtil.throwExcepion(ResultUtil.createWarning(Config.MESSAGE, 922, new Object[]{fieldName}));
        }
        // 主键
        hspGrpInfCustom.setGrpSeq(UUIDBuild.getUUID());
        // 创建用户号
        hspGrpInfCustom.setCrtUser(activeUser.getUsrno());
        // 创建时间
        hspGrpInfCustom.setCrtTime(new Date());
        hspGrpInfMapper.insertSelective(hspGrpInfCustom);
    }

    /**
     * 修改群组
     *
     * @param hspGrpInfQueryDto
     * @param activeUser
     * @throws Exception
     */
    @Override
    public void editGroup(HspGrpInfQueryDto hspGrpInfQueryDto, ActiveUser activeUser) throws Exception {
        // 参数校验
        HspGrpInfCustom hspGrpInfCustom = hspGrpInfQueryDto.getHspGrpInfCustom() != null ? hspGrpInfQueryDto.getHspGrpInfCustom() : new HspGrpInfCustom();
        String fieldName = checkParam(hspGrpInfCustom);
        if (StringUtils.isNotNullAndEmptyByTrim(fieldName)) {
            ResultUtil.throwExcepion(ResultUtil.createWarning(Config.MESSAGE, 911, new Object[]{fieldName}));
        }
        String grpSeq = hspGrpInfCustom.getGrpSeq();
        if (!StringUtils.isNotNullAndEmptyByTrim(grpSeq)) {
            ResultUtil.throwExcepion(ResultUtil.createWarning(Config.MESSAGE, 922, new Object[]{"群组序号"}));
        }
        HspGrpInf record = hspGrpInfMapper.selectByPrimaryKey(grpSeq);
        if (record == null) {
            ResultUtil.throwExcepion(ResultUtil.createWarning(Config.MESSAGE, 902, new Object[]{}));
        }
        // 群组名称
        record.setGrpName(hspGrpInfCustom.getGrpName());
        // 群组类型
        record.setGrpType(hspGrpInfCustom.getGrpType());
        // 群组状态
        record.setIsenable(hspGrpInfCustom.getIsenable());
        // 排序
        record.setShoworder(hspGrpInfCustom.getShoworder());
        // 备注
        record.setRemark(hspGrpInfCustom.getRemark());
        // 修改用户号
        record.setModUser(activeUser.getUsrno());
        // 修改时间
        record.setModTime(new Date());
        hspGrpInfMapper.updateByPrimaryKey(record);
    }

    /**
     * 删除群组
     *
     * @param hspGrpInfQueryDto
     * @param activeUser
     * @throws Exception
     */
    @Override
    public void delGroup(HspGrpInfQueryDto hspGrpInfQueryDto, ActiveUser activeUser) throws Exception {
        // 参数校验
        HspGrpInfCustom hspGrpInfCustom = hspGrpInfQueryDto.getHspGrpInfCustom() != null ? hspGrpInfQueryDto.getHspGrpInfCustom() : new HspGrpInfCustom();
        String grpSeq = hspGrpInfCustom.getGrpSeq();
        if (!StringUtils.isNotNullAndEmptyByTrim(grpSeq)) {
            ResultUtil.throwExcepion(ResultUtil.createWarning(Config.MESSAGE, 922, new Object[]{"群组序号"}));
        }
        HspGrpInf record = hspGrpInfMapper.selectByPrimaryKey(grpSeq);
        if (record == null) {
            ResultUtil.throwExcepion(ResultUtil.createWarning(Config.MESSAGE, 902, new Object[]{}));
        }
        // 删除群组信息表
        hspGrpInfMapper.deleteByPrimaryKey(grpSeq);
        // 删除群组用户关系表
        HspGrpUsrExample hspGrpUsrExample = new HspGrpUsrExample();
        HspGrpUsrExample.Criteria criteria = hspGrpUsrExample.createCriteria();
        criteria.andGrpSeqEqualTo(grpSeq);
        hspGrpUsrMapper.deleteByExample(hspGrpUsrExample);
    }

    /**
     * 获取用户总记录数
     *
     * @param hspGrpInfQueryDto hspGrpInfCustom.grpSeq:群组序号
     * @return
     */
    @Override
    public int getUserCount(HspGrpInfQueryDto hspGrpInfQueryDto) {
        return hspGrpUsrMapperCustom.getUserCount(hspGrpInfQueryDto);
    }

    /**
     * 获取用户列表分页查询（结合当前群组信息）
     *
     * @param hspGrpInfQueryDto hspGrpInfCustom.grpSeq:群组序号
     * @return
     */
    @Override
    public List<DstuserCustom> getUserList(HspGrpInfQueryDto hspGrpInfQueryDto) {
        return hspGrpUsrMapperCustom.getUserList(hspGrpInfQueryDto);
    }

    /**
     * 向群组中添加用户
     *
     * @param hspGrpInfQueryDto
     * @param activeUser
     * @throws Exception
     */
    @Override
    public void addUserToGroup(HspGrpInfQueryDto hspGrpInfQueryDto, ActiveUser activeUser) throws Exception {
        // 参数校验
        delUserFromGroupByUsrno(hspGrpInfQueryDto);
        // 插入hsp_grp_usr
        hspGrpUsrMapperCustom.addUserToGroup(hspGrpInfQueryDto);
    }

    /**
     * 从群组中移除用户
     *
     * @param hspGrpInfQueryDto
     * @param activeUser
     * @throws Exception
     */
    @Override
    public void delUserFromGroup(HspGrpInfQueryDto hspGrpInfQueryDto, ActiveUser activeUser) throws Exception {
        delUserFromGroupByUsrno(hspGrpInfQueryDto);
    }

    private void delUserFromGroupByUsrno(HspGrpInfQueryDto hspGrpInfQueryDto) throws ExceptionResultInfo {
        // 参数校验
        HspGrpInfCustom hspGrpInfCustom = hspGrpInfQueryDto.getHspGrpInfCustom() != null ? hspGrpInfQueryDto.getHspGrpInfCustom() : new HspGrpInfCustom();
        String grpSeq = hspGrpInfCustom.getGrpSeq();
        // 群组序号为空时提示
        if (!StringUtils.isNotNullAndEmptyByTrim(grpSeq)) {
            ResultUtil.throwExcepion(ResultUtil.createWarning(Config.MESSAGE, 922, new Object[]{"群组序号"}));
        }
        // 用户列表为空时提示
        List<DstuserCustom> userList = hspGrpInfQueryDto.getUserList();
        if (userList == null || userList.isEmpty()) {
            ResultUtil.throwExcepion(ResultUtil.createWarning(Config.MESSAGE, 922, new Object[]{"用户列表"}));
        }
        // 校验群组是否存在
        HspGrpInf hspGrpInf = hspGrpInfMapper.selectByPrimaryKey(grpSeq);
        if (hspGrpInf == null) {
            ResultUtil.throwExcepion(ResultUtil.createWarning(Config.MESSAGE, 920, new Object[]{"系统中未找到对应群组信息，请检查群组序号是否正确"}));
        }
        // 根据grpSeq和usrno从hsp_grp_usr中删除
        hspGrpUsrMapperCustom.delUserFromGroup(hspGrpInfQueryDto);
    }

}
