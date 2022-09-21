package activetech.zyyhospital.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.dto.ActiveUser;
import activetech.zyyhospital.dao.mapper.HspGlcsMapper;
import activetech.zyyhospital.pojo.domain.HspGlcs;
import activetech.zyyhospital.pojo.dto.HspGlcsCustom;
import activetech.zyyhospital.pojo.dto.HspGlcsCustomDto;
import activetech.zyyhospital.service.ZyyGlcsService;

public class ZyyGlcsServiceImpl implements ZyyGlcsService {
	@Autowired
	private HspGlcsMapper hspGlcsMapper;
 
	@Override
	public HspGlcsCustom findGlcs(String emgSeq) throws Exception {
		HspGlcs hspGlcs = hspGlcsMapper.selectByPrimaryKey(emgSeq);
		HspGlcsCustom hspGlcsCustom = new HspGlcsCustom();
		if(hspGlcs != null){
			hspGlcsCustom.setJcgl(hspGlcs.getJcgl());
			hspGlcsCustom.setFmgl(hspGlcs.getFmgl());
			hspGlcsCustom.setBhxgl(hspGlcs.getBhxgl());
			hspGlcsCustom.setKqgl(hspGlcs.getKqgl());
			hspGlcsCustom.setEmgSeq(emgSeq);
		}
		return hspGlcsCustom;
	}

	@Override
	public void insertGlcs(HspGlcsCustomDto hspGlcsCustomDto, ActiveUser activeUser) throws Exception {
		HspGlcsCustom hspGlcsCustom = hspGlcsCustomDto.getHspGlcsCustom();
		String emgSeq = hspGlcsCustom.getEmgSeq();
		if (hspGlcsCustom.getBhxgl() != null || hspGlcsCustom.getFmgl() != null || hspGlcsCustom.getKqgl() != null
				|| hspGlcsCustom.getJcgl() != null) {
			hspGlcsMapper.deleteByPrimaryKey(emgSeq);
			hspGlcsCustom.setCrtdat(new Date());
			hspGlcsCustom.setCrtnbr(activeUser.getUsrname());
			hspGlcsCustom.setUpddat(new Date());
			hspGlcsCustom.setUpdnbr(activeUser.getUsrname());
			hspGlcsMapper.insert(hspGlcsCustom);

		} else {
			hspGlcsMapper.deleteByPrimaryKey(emgSeq);
		}
	}

}
