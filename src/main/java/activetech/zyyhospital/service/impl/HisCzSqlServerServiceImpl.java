package activetech.zyyhospital.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.dto.ActiveUser;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.zyyhospital.dao.mapper.HisCzCustomMapper;
import activetech.zyyhospital.pojo.dto.HisCzCustom;
import activetech.zyyhospital.service.HisCzSqlServerService;


/**
 * 
 * <p>Title:中医院Sqlserver数据库实现类</p>
 * <p>Description:检验信息</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2018-1-11 上午10:35:13
 *
 */
public class HisCzSqlServerServiceImpl implements HisCzSqlServerService {
	@Autowired
	private HisCzCustomMapper hisCzCustomMapper;
	
	@Override
	public HisCzCustom cuzhongWork(HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser)
			throws Exception {
		HspemginfCustom hspemginfCustom = hspemginfQueryDto.getHspemginfCustom();
		HisCzCustom hisCzCustom = new HisCzCustom();
		hisCzCustom.setTriageid(hspemginfCustom.getEmgSeq());
		hisCzCustom.setCardno(hspemginfCustom.getVstCad());
		hisCzCustom.setTriagedate(hspemginfCustom.getEmgDat());
		hisCzCustom.setOperno(activeUser.getUsrno());
		hisCzCustom.setOperid(activeUser.getUsrname());
		hisCzCustom.setName(hspemginfCustom.getCstNam());
		if(hspemginfCustom.getCstSexCod()!=null&&!"".equals(hspemginfCustom.getCstSexCod())){
			if("0".equals(hspemginfCustom.getCstSexCod())){
				hisCzCustom.setSex("男");
			}else if("1".equals(hspemginfCustom.getCstSexCod())){
				hisCzCustom.setSex("女");
			}else if("3".equals(hspemginfCustom.getCstSexCod())){
				hisCzCustom.setSex("未知");
			}
		}
		hisCzCustom.setBirthday(hspemginfCustom.getBthDat());
		hisCzCustom.setContactphone(hspemginfCustom.getPheNbr());
		hisCzCustom.setAddress(hspemginfCustom.getCstAdr());
		if(hspemginfCustom.getChkLvlCod()!=null&&!"".equals(hspemginfCustom.getChkLvlCod())){
			hisCzCustom.setTriagelevel((Integer.parseInt(hspemginfCustom.getChkLvlCod())));;
		}
		if("5".equals(hspemginfCustom.getCstDspCod())){
			hisCzCustom.setTriagedirection(("诊间就诊"));;
		}else if("6".equals(hspemginfCustom.getCstDspCod())){
			hisCzCustom.setTriagedirection("留抢");
		}else if("9".equals(hspemginfCustom.getCstDspCod())){
			hisCzCustom.setTriagedirection("转门诊");
		}else if("10".equals(hspemginfCustom.getCstDspCod())){
			hisCzCustom.setTriagedirection("院前直入");
		}
		hisCzCustom.setGreenroad1(hspemginfCustom.getCzFlg());
		hisCzCustom.setGreenroad2(hspemginfCustom.getXtFlg());
		hisCzCustom.setGreenroad3(hspemginfCustom.getCspgFlg());
		hisCzCustom.setGreenroad4(hspemginfCustom.getHxknFlg());
		hisCzCustom.setRfidcode(hspemginfCustom.getRfidcode());
		hisCzCustom.setShousuoya(hspemginfCustom.getSbpUpNbr()+"");
		hisCzCustom.setShuzhangya(hspemginfCustom.getSbpDownNbr()+"");
		hisCzCustom.setSpo2(hspemginfCustom.getOxyNbr()+"");
		hisCzCustom.setHuxi(hspemginfCustom.getBreNbr()+"");
		hisCzCustom.setTiwen(hspemginfCustom.getTmpNbr()+"");
		hisCzCustomMapper.workHspCzCustom(hisCzCustom);
		return hisCzCustom;
	}

}
