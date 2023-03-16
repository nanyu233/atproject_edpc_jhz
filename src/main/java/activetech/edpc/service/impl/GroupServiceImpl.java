package activetech.edpc.service.impl;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.edpc.dao.mapper.HspGrpInfMapper;
import activetech.edpc.dao.mapper.HspGrpInfMapperCustom;
import activetech.edpc.pojo.domain.HspGrpInf;
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
    private HspGrpInfMapperCustom hspGrpInfMapperCustom;
    @Autowired
    private HspGrpInfMapper hspGrpInfMapper;

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
     * 根据主键获取群组记录
     *
     * @param hspGrpInfQueryDto
     * @return
     * @throws Exception
     */
    @Override
    public HspGrpInf findGroupBySeq(HspGrpInfQueryDto hspGrpInfQueryDto) throws Exception {
        // 非空校验
        HspGrpInfCustom hspGrpInfCustom = hspGrpInfQueryDto.getHspGrpInfCustom() != null ? hspGrpInfQueryDto.getHspGrpInfCustom() : new HspGrpInfCustom();
        String grpSeq = hspGrpInfCustom.getGrpSeq();
        if (!StringUtils.isNotNullAndEmptyByTrim(grpSeq)) {
            ResultUtil.throwExcepion(ResultUtil.createWarning(Config.MESSAGE, 922, new Object[]{"群组序号"}));
        }
        HspGrpInf hspGrpInf = hspGrpInfMapper.selectByPrimaryKey(grpSeq);
        return hspGrpInf;
    }

    /**
     * 群组新增修改参数校验
     *
     * @param hspGrpInfCustom
     * @return return
     */
    private String checkNull(HspGrpInfCustom hspGrpInfCustom) {
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
        String fieldName = checkNull(hspGrpInfCustom);
        if (StringUtils.isNotNullAndEmptyByTrim(fieldName)) {
            ResultUtil.throwExcepion(ResultUtil.createWarning(Config.MESSAGE, 922, new Object[]{fieldName}));
        }
        // grpSeq
        hspGrpInfCustom.setGrpSeq(UUIDBuild.getUUID());
        // crtUser
        hspGrpInfCustom.setCrtUser(activeUser.getUsrno());
        // crtTime
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
        String fieldName = checkNull(hspGrpInfCustom);
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
        hspGrpInfMapper.deleteByPrimaryKey(grpSeq);
    }

}
