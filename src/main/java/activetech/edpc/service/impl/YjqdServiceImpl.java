package activetech.edpc.service.impl;

import activetech.aid.dao.mapper.AidAitInfMapper;
import activetech.aid.dao.mapper.AidDingSendTaskMapper;
import activetech.aid.pojo.domain.AidAitInf;
import activetech.aid.pojo.domain.AidDingSendTask;
import activetech.base.pojo.domain.TreeNode;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.DstuserCustom;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.SystemConfigService;
import activetech.edpc.dao.mapper.HspDbzlBasMapper;
import activetech.edpc.dao.mapper.HspGrpInfMapper;
import activetech.edpc.dao.mapper.HspGrpUsrMapperCustom;
import activetech.edpc.dao.mapper.HspYjqdDtlMapper;
import activetech.edpc.dao.mapper.HspYjqdDtlMapperCustom;
import activetech.edpc.dao.mapper.HspYjqdInfMapper;
import activetech.edpc.dao.mapper.HspYjqdInfMapperCustom;
import activetech.edpc.pojo.domain.HspDbzlBas;
import activetech.edpc.pojo.domain.HspGrpInf;
import activetech.edpc.pojo.domain.HspGrpInfExample;
import activetech.edpc.pojo.domain.HspYjqdInf;
import activetech.edpc.pojo.dto.HspGrpUsrCustom;
import activetech.edpc.pojo.dto.HspYjqdInfCustom;
import activetech.edpc.pojo.dto.HspYjqdInfQueryDto;
import activetech.edpc.service.YjqdService;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.PhoneUtil;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 一键启动service实现类
 *
 * @author Chen Haoyuan
 * @date 2023-03-24 10:29
 */
public class YjqdServiceImpl implements YjqdService {
    private static final String SYSTEM_ID = "edpc";
    private static final String AID_AID_SEND_FLG = "0";

    @Autowired
    private HspYjqdInfMapper hspYjqdInfMapper;

    @Autowired
    private HspYjqdDtlMapper hspYjqdDtlMapper;

    @Autowired
    private HspDbzlBasMapper hspDbzlBasMapper;

    @Autowired
    private HspYjqdDtlMapperCustom hspYjqdDtlMapperCustom;

    @Autowired
    private HspGrpInfMapper hspGrpInfMapper;

    @Autowired
    private HspGrpUsrMapperCustom hspGrpUsrMapperCustom;

    @Autowired
    private HspYjqdInfMapperCustom hspYjqdInfMapperCustom;

    @Resource
    private AidAitInfMapper aidAitInfMapper;
    @Resource
    private AidDingSendTaskMapper aidDingSendTaskMapper;

    @Resource
    private SystemConfigService systemConfigService;

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
     * 查询群组用户树
     *
     * @return
     * @throws Exception
     */
    @Override
    public List<TreeNode> queryGroupUserTree() throws Exception {
        List<TreeNode> groupNodes = new ArrayList<>();
        List<TreeNode> userNodes = new ArrayList<>();
        // 群组用户关系列表
        List<HspGrpUsrCustom> groupUserList = hspGrpUsrMapperCustom.getAllGroupUser();
        for (HspGrpUsrCustom hspGrpUsrCustom : groupUserList) {
            TreeNode userNode = new TreeNode();
            userNode.setId(hspGrpUsrCustom.getUserid());
            userNode.setParentId(hspGrpUsrCustom.getGrpSeq());
            userNode.setText(hspGrpUsrCustom.getUsrname());
            userNode.setIconCls("icon icon-user");
            userNode.setState("open");
            userNode.setChecked(false);
            userNodes.add(userNode);
        }

        // 获取群组列表
        HspGrpInfExample example = new HspGrpInfExample();
        HspGrpInfExample.Criteria criteria = example.createCriteria();
        criteria.andIsenableEqualTo("1");
        example.setOrderByClause("showorder");
        List<HspGrpInf> groupList = hspGrpInfMapper.selectByExample(example);
        for (HspGrpInf hspGrpInf : groupList) {
            TreeNode groupNode = new TreeNode();
            groupNode.setId(hspGrpInf.getGrpSeq());
            // 群组parentid设为0
            groupNode.setParentId("0");
            groupNode.setText(hspGrpInf.getGrpName());
            groupNode.setIconCls("icon-user-manage");
            groupNode.setState("open");
            groupNode.setChecked(false);
            groupNode.setChildren(userNodes.stream().filter(t -> t.getParentId().equals(hspGrpInf.getGrpSeq())).collect(Collectors.toList()));
            groupNodes.add(groupNode);
        }
        return groupNodes;
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
        // 通知对象用户号非空验证
        List<DstuserCustom> userCollect = userList.stream().filter(user -> !StringUtils.isNotNullAndEmptyByTrim(user.getUserid())).collect(Collectors.toList());
        if (!userCollect.isEmpty()) {
            ResultUtil.throwExcepion(ResultUtil.createWarning(Config.MESSAGE, 920, new Object[]{"请求参数userList存在用户id为空的记录，保存失败。"}));
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
        //通知用户
        insetNoticeTask(activeUser,userList, hspYjqdInfCustom);
    }



    private void insetNoticeTask(ActiveUser activeUser, List<DstuserCustom> userList, HspYjqdInfCustom hspYjqdInfCustom) {
        /*
          场景 待定
         */
        String aitTyp = "1";
        /*
          1 短信 2 电话
         */
        String dxTyp = "1";
        /*
         电话和短信的  参数 | 有序分割
         */
        String aitPar = "11111|1111";
        /*
        消息内容，或者信息注释
         */
        String aitCon = hspYjqdInfCustom.getNoticeContent();
        /*
        钉钉消息内容
         */
        String dingCon = hspYjqdInfCustom.getNoticeContent();

        userList.forEach(dstuserCustom -> {
                    if (PhoneUtil.isPhone(dstuserCustom.getMovephone())) {
                        //同义词序列
                        String aidAitInfAitSeq = systemConfigService.findSequences("aid_ait_inf_ait_seq", "20", "");
                        //短信
                        noticeSmsAndPhone(activeUser, aidAitInfAitSeq, aitTyp, dxTyp, aitPar, aitCon, dstuserCustom);
                    }
                }
        );
        List<String> userIds = userList.stream().map(DstuserCustom::getUserid).collect(Collectors.toList());
        //钉钉文本通知
        AidDingSendTask aidDingSendTask = new AidDingSendTask();
        aidDingSendTask.setId(UUIDBuild.getUUID());
        aidDingSendTask.setRecipients(CollUtil.join(userIds, ","));
        aidDingSendTask.setRecipientsType("3");
        aidDingSendTask.setSender(activeUser.getUsrno());
        aidDingSendTask.setSenderType("usrno");
        aidDingSendTask.setMsgType("text");
        aidDingSendTask.setText(dingCon);
        aidDingSendTask.setSendFlg(AID_AID_SEND_FLG);
        aidDingSendTask.setCreatTime(new Date());
        aidDingSendTask.setSystemId(SYSTEM_ID);
        //同义词插入
        aidDingSendTaskMapper.insertSelective(aidDingSendTask);

    }

    /**
     * 短信或者电话通知
     *
     * @param activeUser      activeUser
     * @param aidAitInfAitSeq aidAitInfAitSeq
     * @param aitTyp          aitTyp
     * @param chlTyp          chlTyp
     * @param aitPar          aitPar
     * @param aitCon          aitCon
     * @param dstuserCustom   dstuserCustom
     * @author chenys
     * @date 2023/4/11 17:15
     */
    private void noticeSmsAndPhone(ActiveUser activeUser, String aidAitInfAitSeq, String aitTyp, String chlTyp, String aitPar, String aitCon, DstuserCustom dstuserCustom) {
        AidAitInf aidAitInf = new AidAitInf();
        aidAitInf.setAitSeq(aidAitInfAitSeq);
        aidAitInf.setSndTim(new Date());
        aidAitInf.setSndCom(activeUser.getSysid());
        aidAitInf.setSndComNam(activeUser.getSysmc());
        aidAitInf.setSndUsr(activeUser.getUsrno());
        aidAitInf.setSndUsrNam(activeUser.getUsrname());
        aidAitInf.setAitTyp(aitTyp);
        aidAitInf.setAitCon(aitCon);
        aidAitInf.setRsvTel(dstuserCustom.getMovephone());
        aidAitInf.setRsvCom(dstuserCustom.getComno());
        aidAitInf.setRsvComNam(dstuserCustom.getComcname());
        aidAitInf.setRsvUsr(dstuserCustom.getUsrno());
        aidAitInf.setRsvUsrNam(dstuserCustom.getUsrname());
        aidAitInf.setSndFlg(AID_AID_SEND_FLG);
        aidAitInf.setAitPar(aitPar);
        aidAitInf.setChlTyp(chlTyp);
        aidAitInf.setAitSce(aitTyp);
        aidAitInf.setSystemId(SYSTEM_ID);
        //同义词插入
        aidAitInfMapper.insertSelective(aidAitInf);
    }

    /**
     * 查询一键启动列表总记录数
     *
     * @param hspYjqdInfQueryDto
     * @return
     */
    @Override
    public int getYjqdCount(HspYjqdInfQueryDto hspYjqdInfQueryDto) {
        return hspYjqdInfMapperCustom.getYjqdCount(hspYjqdInfQueryDto);
    }

    /**
     * 分页查询获取一键启动列表
     *
     * @param hspYjqdInfQueryDto
     * @return
     */
    @Override
    public List<HspYjqdInfCustom> getYjqdList(HspYjqdInfQueryDto hspYjqdInfQueryDto) {
        return hspYjqdInfMapperCustom.getYjqdList(hspYjqdInfQueryDto);
    }
}
