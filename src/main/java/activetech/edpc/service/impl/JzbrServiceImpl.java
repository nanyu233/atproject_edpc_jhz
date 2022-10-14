package activetech.edpc.service.impl;

import activetech.base.service.SystemConfigService;
import activetech.edpc.dao.mapper.HspDbzlBasMapper;
import activetech.edpc.pojo.domain.HspDbzlBas;
import activetech.edpc.service.JzbrService;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
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
    /**
     * 急诊病人进入多病种中心
     * @param hspemginfQueryDto hspemginfQueryDto
     */
    @Override
    public void enterDbzl(HspemginfQueryDto hspemginfQueryDto) {
        HspemginfCustom hspemginfCustom = hspemginfQueryDto.getHspemginfCustom();
        //xtlcflag 胸痛流程
        if("1".equals(hspemginfCustom.getXtlcflg())) {
            enterPatInDbzl(hspemginfCustom, "XT");
        }
        //czlsflg 卒中流程标识
        if("1".equals(hspemginfCustom.getCzlcflg())) {
            enterPatInDbzl(hspemginfCustom, "CZ");
        }
    }

    private void enterPatInDbzl(HspemginfCustom hspemginfCustom, String dbFlag) {
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

        String regSeq = systemConfigService.findSequences("hsp_dbzl_bas_reg_seq", "10", null);

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
        hspDbzlBas.setCrtNo("admin");
        hspDbzlBas.setCrtNam("系统管理员");
        hspDbzlBas.setModTim(new Date());
        hspDbzlBas.setModNo("admin");
        hspDbzlBas.setModNam("系统管理员");
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
        hspDbzlBasMapper.insert(hspDbzlBas);
    }

}
