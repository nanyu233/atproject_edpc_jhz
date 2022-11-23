package activetech.edpc.service.impl;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.service.SystemConfigService;
import activetech.edpc.dao.mapper.HspDbzlBasMapper;
import activetech.edpc.dao.mapper.HspXtzlInfCustomMapper;
import activetech.edpc.dao.mapper.HspXtzlInfMapper;
import activetech.edpc.pojo.domain.HspDbzlBas;
import activetech.edpc.pojo.domain.HspXtzlInf;
import activetech.edpc.pojo.dto.HspXtzlInfCustom;
import activetech.edpc.service.JzbrService;
import activetech.hospital.pojo.domain.HspMewsInf;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

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
    private HspXtzlInfMapper hspXtzlInfMapper;
    @Autowired
    private HspXtzlInfCustomMapper hspXtzlInfCustomMapper;

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
        HspXtzlInf hspXtzlInf = new HspXtzlInf();
        hspXtzlInf.setEmgNo(regSeq);
        hspXtzlInf.setCrtTime(new Date());
        hspXtzlInf.setModUser(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getPreUsrNbr()) ? hspemginfCustom.getPreUsrNbr() : "admin");
        hspXtzlInf.setModTime(new Date());
        hspXtzlInf.setModUser(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getModUsrNbr()) ? hspemginfCustom.getModUsrNbr() : "admin");
        if(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getXtCod())) {
            String seqNo = systemConfigService.findSequences("HSPXTZLINF_SEQ", "6", null);
            hspXtzlInf.setSeqNo(seqNo);
            hspXtzlInf.setProCode("BQPG");
            hspXtzlInf.setProVal(hspemginfCustom.getXtCod());
            hspXtzlInfMapper.insert(hspXtzlInf);
        }
        if(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getXtSubCod())) {
            String seqNo = systemConfigService.findSequences("HSPXTZLINF_SEQ", "6", null);
            hspXtzlInf.setSeqNo(seqNo);
            hspXtzlInf.setProCode("BQPGMX");
            hspXtzlInf.setProVal(hspemginfCustom.getXtSubCod());
            hspXtzlInfMapper.insert(hspXtzlInf);
        }

    }

    /**
     * 增加生命体征信息
     * @param hspemginfCustom hspemginfCustom
     * @param regSeq regSeq
     * @throws Exception Exception
     */
    private void addMewsInfo(HspemginfCustom hspemginfCustom, String regSeq) {
        HspXtzlInfCustom baseXtzlInf = new HspXtzlInfCustom();
        baseXtzlInf.setEmgNo(regSeq);
        //血压
        if(hspemginfCustom.getSbpUpNbr() != null && hspemginfCustom.getSbpUpNbr() != null){
            baseXtzlInf.setProCode("XUEY");
            baseXtzlInf.setProVal(hspemginfCustom.getSbpUpNbr() + "/" + hspemginfCustom.getSbpDownNbr());
            hspXtzlInfCustomMapper.mergeHspXtzlInf(baseXtzlInf);
        }
        //脉搏
        if(hspemginfCustom.getHrtRte() != null) {
            baseXtzlInf.setProCode("MAIB");
            baseXtzlInf.setProVal(hspemginfCustom.getHrtRte().toString());
            hspXtzlInfCustomMapper.mergeHspXtzlInf(baseXtzlInf);
        }
        //血氧
//        if(hspemginfCustom.getOxyNbr() != null) {
//            baseXtzlInf.setProCode("");
//            baseXtzlInf.setProVal(hspemginfCustom.getOxyNbr().toString());
//            hspXtzlInfCustomMapper.mergeHspXtzlInf(baseXtzlInf);
//        }

        //意识
        if(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getSenRctCod())) {
            baseXtzlInf.setProCode("YISHI");
            baseXtzlInf.setProVal(hspemginfCustom.getSenRctCod());
            hspXtzlInfCustomMapper.mergeHspXtzlInf(baseXtzlInf);
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

}
