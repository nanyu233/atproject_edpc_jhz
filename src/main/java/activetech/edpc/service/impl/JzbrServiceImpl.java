package activetech.edpc.service.impl;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ExceptionResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.SystemConfigService;
import activetech.edpc.dao.mapper.*;
import activetech.edpc.pojo.domain.*;
import activetech.edpc.pojo.dto.HspDbzlBasCustom;
import activetech.edpc.pojo.dto.HspDbzlBasQueryDto;
import activetech.edpc.pojo.dto.HspZlInfCustom;
import activetech.edpc.service.JzbrService;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 急诊病人进入多病种中心
 * @author n
 */
public class JzbrServiceImpl implements JzbrService {

    @Autowired
    private SystemConfigService systemConfigService;
    @Autowired
    private HspDbzlBasMapper hspDbzlBasMapper;
    @Autowired
    private HspZlInfMapper hspZlInfMapper;
    @Autowired
    private HspZlInfCustomMapper hspZlInfCustomMapper;
    @Autowired
    private HspDbzlBasMapperCustom hspDbzlBasMapperCustom;

    @Resource
    private HspDinggrpMapper hspDinggrpMapper;
    /**
     * 急诊病人进入多病种中心
     * @param hspemginfQueryDto hspemginfQueryDto
     */
    @Override
    public void enterDbzl(HspemginfQueryDto hspemginfQueryDto,ActiveUser activeUser) throws ExceptionResultInfo {
        HspemginfCustom hspemginfCustom = hspemginfQueryDto.getHspemginfCustom();
        //xtlcflag 胸痛流程
        if("1".equals(hspemginfCustom.getXtlcflg())) {
            String regSeq = enterPatInDbzl(hspemginfCustom, "1",activeUser);
            addMewsInfo(hspemginfCustom, regSeq);
            addXtPg(hspemginfCustom, regSeq);
        }
        //czlsflg 卒中流程标识
        if("1".equals(hspemginfCustom.getCzlcflg())) {
            String regSeq = enterPatInDbzl(hspemginfCustom, "2",activeUser);
            addMewsInfo(hspemginfCustom, regSeq);
        }

        if("1".equals(hspemginfCustom.getCspgFlg())) {
            String regSeq = enterPatInDbzl(hspemginfCustom, "3",activeUser);
            //addMewsInfo(hspemginfCustom, regSeq);
        }

    }

    /**
     * xtzlInfo 增加 BQPG BQPGMX
     * @param hspemginfCustom hspemginfCustom
     * @param regSeq regSeq
     * @throws Exception Exception
     */
    private void addXtPg(HspemginfCustom hspemginfCustom, String regSeq) {
        HspZlInf hspZlInf = new HspZlInf();
        hspZlInf.setEmgNo(regSeq);
        hspZlInf.setCrtTime(new Date());
        hspZlInf.setModUser(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getPreUsrNbr()) ? hspemginfCustom.getPreUsrNbr() : "admin");
        hspZlInf.setModTime(new Date());
        hspZlInf.setModUser(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getModUsrNbr()) ? hspemginfCustom.getModUsrNbr() : "admin");
        if(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getXtCod())) {
            String seqNo = systemConfigService.findSequences("HSPZlInf_SEQ", "6", null);
            hspZlInf.setSeqNo(seqNo);
            hspZlInf.setProCode("BQPG");
            hspZlInf.setProVal(hspemginfCustom.getXtCod());
            hspZlInfMapper.insert(hspZlInf);
        }
        if(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getXtSubCod())) {
            String seqNo = systemConfigService.findSequences("HSPZlInf_SEQ", "6", null);
            hspZlInf.setSeqNo(seqNo);
            hspZlInf.setProCode("BQPGMX");
            hspZlInf.setProVal(hspemginfCustom.getXtSubCod());
            hspZlInfMapper.insert(hspZlInf);
        }

    }

    /**
     * 增加生命体征信息
     * @param hspemginfCustom hspemginfCustom
     * @param regSeq regSeq
     * @throws Exception Exception
     */
    private void addMewsInfo(HspemginfCustom hspemginfCustom, String    regSeq) {
        HspZlInfCustom baseZlInf = new HspZlInfCustom();
        baseZlInf.setEmgNo(regSeq);
        //血压
        if(hspemginfCustom.getSbpUpNbr() != null && hspemginfCustom.getSbpUpNbr() != null){
            baseZlInf.setProCode("XUEY");
            baseZlInf.setProVal(hspemginfCustom.getSbpUpNbr() + "/" + hspemginfCustom.getSbpDownNbr());
            hspZlInfCustomMapper.mergeHspXtzlInf(baseZlInf);
        }
        //脉搏
        if(hspemginfCustom.getHrtRte() != null) {
            baseZlInf.setProCode("MAIB");
            baseZlInf.setProVal(hspemginfCustom.getHrtRte().toString());
            hspZlInfCustomMapper.mergeHspXtzlInf(baseZlInf);
        }
        //血氧
//        if(hspemginfCustom.getOxyNbr() != null) {
//            baseXtzlInf.setProCode("");
//            baseXtzlInf.setProVal(hspemginfCustom.getOxyNbr().toString());
//            hspXtzlInfCustomMapper.mergeHspXtzlInf(baseXtzlInf);
//        }

        //意识
        if(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getSenRctCod())) {
            baseZlInf.setProCode("YISHI");
            baseZlInf.setProVal(hspemginfCustom.getSenRctCod());
            hspZlInfCustomMapper.mergeHspXtzlInf(baseZlInf);
        }
    }

    /**
     * 增加患者信息
     * @param hspemginfCustom hspemginfCustom
     * @param patType patType
     * @return return
     */
    private String enterPatInDbzl(HspemginfCustom hspemginfCustom, String patType, ActiveUser activeUser) throws ExceptionResultInfo {
        // 这里需要做幂等，同一个患者多次请求，只保存一次。

        // 查看当前患者是否已经入库
        String emgSeq = hspemginfCustom.getEmgSeq();
        HspDbzlBasExample example = new HspDbzlBasExample();
        HspDbzlBasExample.Criteria criteria = example.createCriteria();
        criteria.andEmgSeqEqualTo(emgSeq);
        List<HspDbzlBas> ret = hspDbzlBasMapper.selectByExample(example);
        if(ret.size()>0){
            ResultUtil.throwExcepion(ResultUtil.createWarning(Config.MESSAGE, 920, new Object[]{"该患者已同步，请勿重复提交"}));
        }

        String regSeq = systemConfigService.findSequences("hsp_dbzl_bas_reg_seq", "8", null);

        // 1.创建以该患者为中心的钉钉群组 todo
        // DingUtil

        // 2.更新hsp_dinggrp表 todo
        HspDinggrp record = new HspDinggrp();
        record.setRegSeq(regSeq);
        //record.setChatid();
        //record.setOpenConversationId();
        hspDinggrpMapper.insert(record);

        // 3.根据不同的患者类型创建不同的延迟任务 todo


        HspDbzlBas hspDbzlBas = new HspDbzlBas();
        //唯一ID
        hspDbzlBas.setRegSeq(regSeq);
        hspDbzlBas.setRegTim(hspemginfCustom.getEmgDat());
        hspDbzlBas.setEmgSeq(emgSeq);
        hspDbzlBas.setMpi(hspemginfCustom.getMpi());
        hspDbzlBas.setPatTyp(patType);
        //急诊
        hspDbzlBas.setWayTyp("0");
        hspDbzlBas.setCardType(hspemginfCustom.getCardType());
        hspDbzlBas.setVstCad(hspemginfCustom.getVstCad());
        hspDbzlBas.setCstNam(hspemginfCustom.getCstNam());
        hspDbzlBas.setCstSexCod(hspemginfCustom.getCstSexCod());
        hspDbzlBas.setIdType(hspemginfCustom.getCardType());
        hspDbzlBas.setIdNbr(hspemginfCustom.getIdNbr());
        hspDbzlBas.setCstAgeCod(hspemginfCustom.getCstAgeCod());
        hspDbzlBas.setCstAge(hspemginfCustom.getCstAge());
        hspDbzlBas.setPatWgt(null);
        hspDbzlBas.setPatHgt(null);
        hspDbzlBas.setBthDat(hspemginfCustom.getBthDat());
        hspDbzlBas.setPheNbr(hspemginfCustom.getPheNbr());
        hspDbzlBas.setCstAdr(hspemginfCustom.getCstAdr());
        hspDbzlBas.setNation(hspemginfCustom.getNation());
        hspDbzlBas.setEmgJob(hspemginfCustom.getEmgJob());
        hspDbzlBas.setMaritalStatus(hspemginfCustom.getMaritalStatus());
        hspDbzlBas.setCstEdu(null);
        hspDbzlBas.setLnkMan(null);
        hspDbzlBas.setLnkWay(null);
        hspDbzlBas.setGrnChl(hspemginfCustom.getGrnChl());
        hspDbzlBas.setSwChl(hspemginfCustom.getSwChl());
        hspDbzlBas.setHspAra(null);
        hspDbzlBas.setYqxh(null);
        hspDbzlBas.setJzxh(hspemginfCustom.getJzxh());
        hspDbzlBas.setZyxh(null);
        hspDbzlBas.setDocDat(hspemginfCustom.getDocDat());
        hspDbzlBas.setJzys(hspemginfCustom.getJzys());
        hspDbzlBas.setYsxm(hspemginfCustom.getYsxm());
        hspDbzlBas.setKsdm(hspemginfCustom.getKsdm());
        hspDbzlBas.setCrtTim(new Date());
        hspDbzlBas.setCrtNo(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getPreUsrNbr()) ? hspemginfCustom.getPreUsrNbr() : "admin");
        hspDbzlBas.setCrtNam(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getPreUsrNam()) ? hspemginfCustom.getPreUsrNam() : "系统管理员");
        hspDbzlBas.setModTim(new Date());
        hspDbzlBas.setModNo(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getModUsrNbr()) ? hspemginfCustom.getModUsrNbr() : "admin");
        hspDbzlBas.setModNam(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getModUsrNam()) ? hspemginfCustom.getModUsrNam() : "系统管理员");
        hspDbzlBas.setRcdSta(null);
        hspDbzlBas.setChkTim(null);
        hspDbzlBas.setChkNo(null);
        hspDbzlBas.setChkNam(null);
        hspDbzlBas.setChkMsg(null);
        hspDbzlBas.setStpFlg(null);
        hspDbzlBas.setStpTim(null);
        hspDbzlBas.setStpNo(null);
        hspDbzlBas.setStpNam(null);
        hspDbzlBas.setSmtSta("1");
        hspDbzlBas.setSmtSeq(null);
        hspDbzlBas.setSmtMsg(null);
        if("1".equals(activeUser.getHospitalCategory())){
            hspDbzlBas.setHspAra("1");
        }else{
            hspDbzlBas.setHspAra("2");
        }
        hspDbzlBasMapper.insert(hspDbzlBas);
        return regSeq;
    }


    @Override
    public DataGridResultInfo getPatientListForDbzlBas(HspDbzlBasQueryDto hspDbzlBasQueryDto) {
        DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
        int total = hspDbzlBasMapperCustom.countPatientListForDbzlBas(hspDbzlBasQueryDto);
        PageQuery pageQuery = new PageQuery();
        pageQuery.setPageParams(total, hspDbzlBasQueryDto.getRows(), hspDbzlBasQueryDto.getPage());
        hspDbzlBasQueryDto.setPageQuery(pageQuery);
        List<HspDbzlBasCustom> list = hspDbzlBasMapperCustom.getPatientListForDbzlBas(hspDbzlBasQueryDto);
        dataGridResultInfo.setRows(list);
        dataGridResultInfo.setTotal(total);
        return dataGridResultInfo;
    }

    @Override
    public ResultInfo queryHspDbzlBasinf(HspDbzlBasQueryDto hspDbzlBasQueryDto) {
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        Map<String, Object> sysdata = new HashMap<String, Object>();
        hspDbzlBasQueryDto.setRegSeq(hspDbzlBasQueryDto.getHspDbzlBasCustom().getRegSeq());
        HspDbzlBasCustom hspDbzlBasCustom=hspDbzlBasMapperCustom.getHspDbzlBasinf(hspDbzlBasQueryDto);

        HspZlInfExample hspZlInfExample = new HspZlInfExample();
        hspZlInfExample.createCriteria().andEmgNoEqualTo(hspDbzlBasQueryDto.getHspDbzlBasCustom().getRegSeq());
        List<HspZlInf> hspZlInfs = hspZlInfMapper.selectByExample(hspZlInfExample);
        Map<String, String> mapZlInf = new HashMap();
        for(HspZlInf node : hspZlInfs){
            mapZlInf.put(node.getProCode(), node.getProVal());
        }

        sysdata.put("hspDbzlBasCustom",hspDbzlBasCustom);
        sysdata.put("mapZlInf",mapZlInf);

        resultInfo.setSysdata(sysdata);
        return resultInfo;
    }
}
