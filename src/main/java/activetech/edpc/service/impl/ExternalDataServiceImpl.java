package activetech.edpc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.service.SystemConfigService;
import activetech.edpc.dao.mapper.HspCrivelInfMapper;
import activetech.edpc.dao.mapper.HspXtzlInfCustomMapper;
import activetech.edpc.pojo.domain.HspCrivelInf;
import activetech.edpc.pojo.dto.HspXtzlInfCustom;
import activetech.edpc.service.ExternalDataService;
import activetech.util.StringUtils;

public class ExternalDataServiceImpl implements ExternalDataService{
	
	@Autowired
	private HspXtzlInfCustomMapper hspXtzlInfCustomMapper; 
	@Autowired
	private HspCrivelInfMapper hspCrivelInfMapper;
	@Autowired
	private SystemConfigService systemConfigService;

	@Override
	public void mergeFzInf(List<HspXtzlInfCustom> list, String emgSeq, String regSeq, String crtUser) {
		
		if(emgSeq!=null && list!=null && list.size()>0) {
			for(HspXtzlInfCustom hspXtzlInfCustom:list) {
				hspXtzlInfCustom.setCrtUser(crtUser);
				hspXtzlInfCustom.setEmgNo(regSeq);
				//冠脉造影
				if(hspXtzlInfCustom.getProCode().indexOf("GMZY")>0){
					HspCrivelInf criVel = hspXtzlInfCustom.getHspCrivelInf();
					if(criVel != null){
						if(StringUtils.isNotNullAndEmptyByTrim(criVel.getVelSeq())){
							hspCrivelInfMapper.updateByPrimaryKey(criVel);
						}else{
							String velSeq = systemConfigService.findSequences("HSP_CRIVEL_INF_SEQ", "10", null);
							criVel.setVelSeq(velSeq);
							hspXtzlInfCustom.setProVal(velSeq);
							hspCrivelInfMapper.insert(criVel);
						}
						
					}
				}
				if(StringUtils.isNotNullAndEmptyByTrim(hspXtzlInfCustom.getProVal())) {
					hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);
				}
			}
			
		}
		
	}

	@Override
	public String getD2W(String emgSeq) {
		return hspXtzlInfCustomMapper.getD2W(emgSeq);
	}

}
