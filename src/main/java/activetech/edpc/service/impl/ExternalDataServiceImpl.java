package activetech.edpc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.service.SystemConfigService;
import activetech.edpc.dao.mapper.HspCrivelInfMapper;
import activetech.edpc.dao.mapper.HspZlInfCustomMapper;
import activetech.edpc.pojo.domain.HspCrivelInf;
import activetech.edpc.pojo.dto.HspZlInfCustom;
import activetech.edpc.service.ExternalDataService;
import activetech.util.StringUtils;

public class ExternalDataServiceImpl implements ExternalDataService{
	
	@Autowired
	private HspZlInfCustomMapper hspZlInfCustomMapper;
	@Autowired
	private HspCrivelInfMapper hspCrivelInfMapper;
	@Autowired
	private SystemConfigService systemConfigService;

	@Override
	public void mergeFzInf(List<HspZlInfCustom> list, String emgSeq, String regSeq, String crtUser) {
		
		if(regSeq!=null && list!=null && list.size()>0) {
			for(HspZlInfCustom hspZlInfCustom:list) {
				hspZlInfCustom.setCrtUser(crtUser);
				hspZlInfCustom.setEmgNo(regSeq);
				//冠脉造影
				if(hspZlInfCustom.getProCode().indexOf("GMZY")>0){
					HspCrivelInf criVel = hspZlInfCustom.getHspCrivelInf();
					if(criVel != null){
						if(StringUtils.isNotNullAndEmptyByTrim(criVel.getVelSeq())){
							hspCrivelInfMapper.updateByPrimaryKey(criVel);
						}else{
							String velSeq = systemConfigService.findSequences("HSP_CRIVEL_INF_SEQ", "10", null);
							criVel.setVelSeq(velSeq);
							hspZlInfCustom.setProVal(velSeq);
							hspCrivelInfMapper.insert(criVel);
						}
						
					}
				}
				hspZlInfCustomMapper.mergeHspXtzlInf(hspZlInfCustom);
			}
			
		}
		
	}

	@Override
	public String getD2W(String emgSeq) {
		return hspZlInfCustomMapper.getD2W(emgSeq);
	}

}
