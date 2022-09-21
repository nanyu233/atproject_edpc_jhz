package activetech.hospital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.hospital.dao.mapper.HspJbzdInfCustomMapper;
import activetech.hospital.dao.mapper.HspJbzdInfMapper;
import activetech.hospital.dao.mapper.HspOperationDictCustomMapper;
import activetech.hospital.pojo.dto.HspJbzdInfCustom;
import activetech.hospital.pojo.dto.HspJbzdInfQueryDto;
import activetech.hospital.pojo.dto.HspOperationDictCustom;
import activetech.hospital.service.HspCstInfService;
import activetech.util.StringUtils;


public class HspCstInfServiceImpl implements HspCstInfService {

	@Autowired
	private HspJbzdInfCustomMapper hspJbzdInfCustomMapper;
	@Autowired
	private HspJbzdInfMapper hspJbzdInfMapper;
	@Autowired
	private HspOperationDictCustomMapper hspOperationDictCustomMapper;
	

	@Override
	public void deleteHspjbzdinf(HspJbzdInfCustom hspJbzdInfCustom) {
		hspJbzdInfMapper.deleteByPrimaryKey(hspJbzdInfCustom.getJbzdSeq());
	}

	@Override
	public List<HspJbzdInfCustom> findJbzdInfByPysm(HspJbzdInfQueryDto hspJbzdInfQueryDto) {
		return hspJbzdInfCustomMapper.findJbzdInfByPysm(hspJbzdInfQueryDto);
	}

	@Override
	public List<HspJbzdInfCustom> findHspJbzdInfHzzd(String emgSeq,String jbzdType) {
		HspJbzdInfCustom hspJbzdInfCustom=new HspJbzdInfCustom();
		hspJbzdInfCustom.setEmgSeq(emgSeq);
		hspJbzdInfCustom.setJbzdType(jbzdType);
		return hspJbzdInfCustomMapper.findHspJbzdInfHzzd(hspJbzdInfCustom);
	}

	@Override
	public HspJbzdInfCustom findHspJbzdInfComm(String emgSeq,String jbzdType) {
		return hspJbzdInfCustomMapper.findHspJbzdInfComm(emgSeq,jbzdType);
	}
	
	@Override
	public List<HspOperationDictCustom> findOperationByPysm(HspJbzdInfQueryDto hspJbzdInfQueryDto) {
		if(StringUtils.isNotNullAndEmptyByTrim(hspJbzdInfQueryDto.getHspOperationDictCustom().getPinyinCode())){
			return hspOperationDictCustomMapper.findOperationByPysm(hspJbzdInfQueryDto);
		}else{
			return null;
		}
	}
}
