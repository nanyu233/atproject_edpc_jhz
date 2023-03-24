package activetech.edpc.service.impl;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.DstuserCustom;
import activetech.base.process.context.Config;
import activetech.base.process.result.ExceptionResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.edpc.dao.mapper.HspDbzlBasMapper;
import activetech.edpc.dao.mapper.HspYjqdDtlMapper;
import activetech.edpc.dao.mapper.HspYjqdDtlMapperCustom;
import activetech.edpc.dao.mapper.HspYjqdInfMapper;
import activetech.edpc.pojo.domain.HspDbzlBas;
import activetech.edpc.pojo.domain.HspYjqdInf;
import activetech.edpc.pojo.dto.HspYjqdInfCustom;
import activetech.edpc.pojo.dto.HspYjqdInfQueryDto;
import activetech.edpc.service.YjqdService;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * 一键启动service实现类
 *
 * @author Chen Haoyuan
 * @date 2023-03-24 10:29
 */
public class YjqdServiceImpl implements YjqdService {

    @Autowired
    private HspYjqdInfMapper hspYjqdInfMapper;

    @Autowired
    private HspYjqdDtlMapper hspYjqdDtlMapper;

    @Autowired
    private HspDbzlBasMapper hspDbzlBasMapper;

    @Autowired
    private HspYjqdDtlMapperCustom hspYjqdDtlMapperCustom;

    private String checkParam(HspYjqdInfCustom hspYjqdInfCustom) {
        // 患者编号
        if (!StringUtils.isNotNullAndEmptyByTrim(hspYjqdInfCustom.getRegSeq())) {
            return "患者编号";
        }
        // 启动时间
        if (!StringUtils.isNotNullAndEmptyByTrim(hspYjqdInfCustom.getYjqdTimeStr())) {
            return "启动时间";
        }
        // 通知内容
        if (!StringUtils.isNotNullAndEmptyByTrim(hspYjqdInfCustom.getNoticeContent())) {
            return "通知内容";
        }
        // 通知方式
        if (!StringUtils.isNotNullAndEmptyByTrim(hspYjqdInfCustom.getNoticeType())) {
            return "通知方式";
        }
        return null;
    }

    /**
     * 新增一键启动
     *
     * @param hspYjqdInfQueryDto
     * @param activeUser
     * @throws Exception
     */
    @Override
    public void addYjqd(HspYjqdInfQueryDto hspYjqdInfQueryDto, ActiveUser activeUser) throws Exception {
        // 一键启动参数非空校验
        HspYjqdInfCustom hspYjqdInfCustom = hspYjqdInfQueryDto.getHspYjqdInfCustom() != null ? hspYjqdInfQueryDto.getHspYjqdInfCustom() : new HspYjqdInfCustom();
        String fieldName = checkParam(hspYjqdInfCustom);
        if (StringUtils.isNotNullAndEmptyByTrim(fieldName)) {
            ResultUtil.throwExcepion(ResultUtil.createWarning(Config.MESSAGE, 922, new Object[]{fieldName}));
        }
        // 验证患者编号是否有效   hsp_yjqd_inf.reg_seq
        HspDbzlBas hspDbzlBas = hspDbzlBasMapper.selectByPrimaryKey(hspYjqdInfCustom.getRegSeq());
        if (hspDbzlBas == null) {
            ResultUtil.throwExcepion(ResultUtil.createWarning(Config.MESSAGE, 920, new Object[]{"系统中未找到对应患者记录，请检查患者编号是否正确"}));
        }
        // 通知对象不可为空
        List<DstuserCustom> userList = hspYjqdInfQueryDto.getUserList();
        if (userList == null || userList.isEmpty()) {
            ResultUtil.throwExcepion(ResultUtil.createWarning(Config.MESSAGE, 922, new Object[]{"通知对象"}));
        }
        // 插入hsp_yjqd_inf
        HspYjqdInf record = new HspYjqdInf();
        record.setYjqdSeq(UUIDBuild.getUUID());
        record.setRegSeq(hspYjqdInfCustom.getRegSeq());
        record.setYjqdTime(DateUtil.parseDateCom(hspYjqdInfCustom.getYjqdTimeStr()));
        record.setNoticeContent(hspYjqdInfCustom.getNoticeContent());
        record.setNoticeType(hspYjqdInfCustom.getNoticeType());
        record.setCrtUser(activeUser.getUsrno());
        record.setCrtTime(new Date());
        hspYjqdInfMapper.insert(record);
        // 将主键赋值给hspYjqdInfCustom.yjqdSeq,插入hsp_yjqd_dtl
        hspYjqdInfCustom.setYjqdSeq(record.getYjqdSeq());
        hspYjqdInfQueryDto.setHspYjqdInfCustom(hspYjqdInfCustom);
        hspYjqdDtlMapperCustom.addUserToYjqd(hspYjqdInfQueryDto);
    }
}