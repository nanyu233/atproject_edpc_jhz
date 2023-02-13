package activetech.edpc.service.impl;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.SystemConfigService;
import activetech.edpc.dao.mapper.HspDbzlBasMapper;
import activetech.edpc.dao.mapper.HspDbzlBasMapperCustom;
import activetech.edpc.dao.mapper.HspZlInfCustomMapper;
import activetech.edpc.dao.mapper.HspZlInfMapper;
import activetech.edpc.pojo.domain.HspDbzlBas;
import activetech.edpc.pojo.domain.HspZlInf;
import activetech.edpc.pojo.dto.HspDbzlBasCustom;
import activetech.edpc.pojo.dto.HspDbzlBasQueryDto;
import activetech.edpc.pojo.dto.HspZlInfCustom;
import activetech.edpc.pojo.dto.QueryDto;
import activetech.edpc.service.JzbrService;
import activetech.hospital.pojo.domain.HspMewsInf;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

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
    /**
     * 急诊病人进入多病种中心
     * @param hspemginfQueryDto hspemginfQueryDto
     */
    @Override
    public void enterDbzl(HspemginfQueryDto hspemginfQueryDto,ActiveUser activeUser) {
        HspemginfCustom hspemginfCustom = hspemginfQueryDto.getHspemginfCustom();
        //xtlcflag 胸痛流程
        if("1".equals(hspemginfCustom.getXtlcflg())) {
            String regSeq = enterPatInDbzl(hspemginfCustom, "XT",activeUser);
            addMewsInfo(hspemginfCustom, regSeq);
            addXtPg(hspemginfCustom, regSeq);
        }
        //czlsflg 卒中流程标识
        if("1".equals(hspemginfCustom.getCzlcflg())) {
            String regSeq = enterPatInDbzl(hspemginfCustom, "CZ",activeUser);
            addMewsInfo(hspemginfCustom, regSeq);
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
    private void addMewsInfo(HspemginfCustom hspemginfCustom, String regSeq) {
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
     * @param dbFlag dbFlag
     * @return return
     */
    private String enterPatInDbzl(HspemginfCustom hspemginfCustom, String dbFlag, ActiveUser activeUser) {
        String patType = "1";
        switch (dbFlag){
            case "XT":
                patType = "1";
                break;
            case "CZ":
                patType = "2";
                break;
            case "CS":
                patType = "3";
                break;
            default:
                break;
        }

        String regSeq = systemConfigService.findSequences("hsp_dbzl_bas_reg_seq", "8", null);

        HspDbzlBas hspDbzlBas = new HspDbzlBas();
        //唯一ID
        hspDbzlBas.setRegSeq(regSeq);
        hspDbzlBas.setRegTim(hspemginfCustom.getEmgDat());
        hspDbzlBas.setEmgSeq(hspemginfCustom.getEmgSeq());
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
        HspDbzlBasCustom hspDbzlBasCustom=hspDbzlBasMapperCustom.getHspDbzlBasinf(hspDbzlBasQueryDto);
        sysdata.put("hspDbzlBasCustom",hspDbzlBasCustom);
        resultInfo.setSysdata(sysdata);
        return resultInfo;
    }
}
