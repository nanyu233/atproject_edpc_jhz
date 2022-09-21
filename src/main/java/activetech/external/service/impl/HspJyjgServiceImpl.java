package activetech.external.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.external.dao.mapper.HspJyjgCustomMapper;
import activetech.external.dao.mapper.HspJyjgMapper;
import activetech.external.pojo.domain.HspJyjg;
import activetech.external.pojo.domain.HspJyjgExample;
import activetech.external.pojo.dto.HspJyjgCustom;
import activetech.external.pojo.dto.HspJyjgQueryDto;
import activetech.external.service.HspJyjgService;
import activetech.util.DateUtil;
import activetech.util.StringUtils;

public class HspJyjgServiceImpl implements HspJyjgService{
	
	@Autowired
	private HspJyjgCustomMapper hspJyjgCustomMapper;
	@Autowired
	private HspJyjgMapper hspJyjgMapper;

	@Override
	public int findhspjyjgcount(HspJyjgQueryDto hspJyjgQueryDto) throws Exception {		
		return hspJyjgCustomMapper.findhspjyjgcount(hspJyjgQueryDto);
	}

	@Override
	public List<HspJyjgCustom> findhspjyjgList(HspJyjgQueryDto hspJyjgQueryDto) throws Exception {		
		hspJyjgQueryDto.setSort("resultDateTime");
		hspJyjgQueryDto.setOrder("asc");
		List<HspJyjgCustom> list = hspJyjgCustomMapper.findhspjyjgList(hspJyjgQueryDto);
		return list;
	}

	@Override
	public int findhspjyjginfocount(HspJyjgQueryDto hspJyjgQueryDto) throws Exception {		
		return hspJyjgCustomMapper.findhspjyjginfocount(hspJyjgQueryDto);
	}

	@Override
	public List<HspJyjgCustom> findhspjyjginfoList(HspJyjgQueryDto hspJyjgQueryDto) throws Exception {		
		return hspJyjgCustomMapper.findhspjyjginfoList(hspJyjgQueryDto);
	}

	@Override
	public List<HspJyjgCustom> findhspjyjginfoListqfy(HspJyjgQueryDto hspJyjgQueryDto) throws Exception {
		List<HspJyjgCustom> list= hspJyjgCustomMapper.findhspjyjginfoListqfy(hspJyjgQueryDto);
		for (HspJyjgCustom hspJyjgCustom : list) {
			if(StringUtils.isNotNullAndEmptyByTrim(hspJyjgCustom.getUnits())&&hspJyjgCustom.getUnits().length()>=3){
				if(hspJyjgCustom.getUnits().substring(0,2).equals("10")){
					hspJyjgCustom.setSign("*");
				}
			}
		}
		return list;
	}

	@Override
	public List<HspJyjgCustom> findhspjyjginfoListajax(HspJyjgQueryDto hspJyjgQueryDto) throws Exception {		
		return hspJyjgCustomMapper.findhspjyjginfoListajax(hspJyjgQueryDto);
	}

	@Override
	public List<HspJyjgCustom> findhspjyjginfoListajaxnew(HspJyjgQueryDto hspJyjgQueryDto) throws Exception {
		hspJyjgQueryDto.setSort("resultDateTime");
		hspJyjgQueryDto.setOrder("asc");
		hspJyjgQueryDto.getHspJyjgCustom().setEnddate(DateUtil.getNextDay(hspJyjgQueryDto.getHspJyjgCustom().getEnddate()));
		List<HspJyjgCustom> list1 = hspJyjgCustomMapper.findhspjyjgList(hspJyjgQueryDto);
		for (HspJyjgCustom hspJyjgCustom : list1) {
			 HspJyjgQueryDto hspJyjgQueryDto1 = new HspJyjgQueryDto();
			 hspJyjgQueryDto1.setHspJyjgCustom(hspJyjgCustom);
			 List<HspJyjgCustom> list2= hspJyjgCustomMapper.findhspjyjginfoList(hspJyjgQueryDto1);
			 hspJyjgCustom.setVlist(list2);
		}
		return list1;
	}

	@Override
	public void updateHspJyjgBySelective(HspJyjgQueryDto hspJyjgQueryDto) throws Exception {
		if(hspJyjgQueryDto==null||hspJyjgQueryDto.getHspJyjgCustom()==null)
			return;
		HspJyjgExample example = new HspJyjgExample();
		HspJyjgExample.Criteria criteria = example.createCriteria();
		
		criteria.andParentIdEqualTo(hspJyjgQueryDto.getHspJyjgCustom().getParentId());
		criteria.andSamplenoEqualTo(hspJyjgQueryDto.getHspJyjgCustom().getSampleno());
		criteria.andReportItemNameEqualTo(hspJyjgQueryDto.getHspJyjgCustom().getReportItemName());
		criteria.andExaminaimEqualTo(hspJyjgQueryDto.getHspJyjgCustom().getExaminaim());
		criteria.andResultDateTimeEqualTo(hspJyjgQueryDto.getHspJyjgCustom().getResultDateTime());
		
		List<HspJyjg> hspJyjgs = hspJyjgMapper.selectByExample(example);
		if(hspJyjgs!=null&&!hspJyjgs.isEmpty()){
			HspJyjg hspJyjg = hspJyjgs.get(0);
			hspJyjg.setMark(hspJyjgQueryDto.getHspJyjgCustom().getMark());
			hspJyjgMapper.updateByExample(hspJyjg, example);
			//hspJyjgMapper.updateByExampleSelective(hspJyjg, example);
		}
		
	}	

}
