package activetech.zyyhospital.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import activetech.hospital.dao.mapper.HspemginfCustomMapper;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import activetech.zyyhospital.dao.mapper.HspJjchqkInfMapper;
import activetech.zyyhospital.dao.mapper.HspJzcsjlbInfMapper;
import activetech.zyyhospital.dao.mapper.HspJzpsInfMapper;
import activetech.zyyhospital.pojo.domain.HspJjchqkInf;
import activetech.zyyhospital.pojo.domain.HspJjchqkInfExample;
import activetech.zyyhospital.pojo.domain.HspJzcsjlbInf;
import activetech.zyyhospital.pojo.domain.HspJzcsjlbInfExample;
import activetech.zyyhospital.pojo.domain.HspJzpsInf;
import activetech.zyyhospital.pojo.domain.HspJzpsInfExample;
import activetech.zyyhospital.pojo.dto.HspJzcsjlbInfCustom;
import activetech.zyyhospital.pojo.dto.HspJzcsjlbInfQueryDto;
import activetech.zyyhospital.service.HspJzcsjlbInfService;

public class HspJzcsjlbInfServiceImpl implements HspJzcsjlbInfService {
	
	@Autowired
	private HspJzcsjlbInfMapper hspJzcsjlbInfMapper;
	@Autowired
	private HspJjchqkInfMapper hspJjchqkInfMapper;
	@Autowired
	private HspJzpsInfMapper hspJzpsInfMapper;
	@Autowired
	private HspemginfCustomMapper hspemginfCustomMapper;

	@Override
	public HspJzcsjlbInfQueryDto getJzcsjlbByJzcsId(String emgSeq) throws Exception {
		HspJzcsjlbInfQueryDto hspJzcsjlbInfQueryDto = new HspJzcsjlbInfQueryDto();
		HspJzcsjlbInf hspJzcsjlbInf = null;
		HspJzcsjlbInfExample hspJzcsjlbInfExample = new HspJzcsjlbInfExample();
		HspJzcsjlbInfExample.Criteria criteria = hspJzcsjlbInfExample.createCriteria();
		criteria.andEmgSeqEqualTo(emgSeq);
		List<HspJzcsjlbInf> hspJzcsjlbInfList = hspJzcsjlbInfMapper.selectByExample(hspJzcsjlbInfExample);
		if (hspJzcsjlbInfList.size() != 0) {
			hspJzcsjlbInf = hspJzcsjlbInfList.get(0);
		}		
		if (hspJzcsjlbInf != null) {
			HspJjchqkInfExample hspJjchqkInfExample = new HspJjchqkInfExample();
			HspJjchqkInfExample.Criteria criteria2 = hspJjchqkInfExample.createCriteria();
			criteria2.andJzcsIdEqualTo(hspJzcsjlbInf.getJzcsId());
			hspJjchqkInfExample.setOrderByClause("to_number(INDEX_NUM)");
			List<HspJjchqkInf> hspJjchqkInfList = hspJjchqkInfMapper.selectByExample(hspJjchqkInfExample);
			
			HspJzpsInfExample hspJzpsInfExample = new HspJzpsInfExample();
			HspJzpsInfExample.Criteria criteria3 = hspJzpsInfExample.createCriteria();
			criteria3.andJzcsIdEqualTo(hspJzcsjlbInf.getJzcsId());
			hspJzpsInfExample.setOrderByClause("to_number(INDEX_NUM)");
			List<HspJzpsInf> hspJzpsInfList = hspJzpsInfMapper.selectByExample(hspJzpsInfExample);
							
			if (hspJjchqkInfList.size() == 0) {
				hspJjchqkInfList = new ArrayList<HspJjchqkInf>();
			}
			if (hspJzpsInfList.size() == 0) {
				hspJzpsInfList = new ArrayList<HspJzpsInf>();
			}
			HspJzcsjlbInfCustom hspJzcsjlbInfCustom = new HspJzcsjlbInfCustom();
			BeanUtils.copyProperties(hspJzcsjlbInf, hspJzcsjlbInfCustom);
			hspJzcsjlbInfQueryDto.setHspJzcsjlbInfCustom(hspJzcsjlbInfCustom);	
			hspJzcsjlbInfQueryDto.setHspJjchqkInfList(hspJjchqkInfList);
			hspJzcsjlbInfQueryDto.setHspJzpsInfList(hspJzpsInfList);
		}
		HspemginfCustom hspemginfCustom = hspemginfCustomMapper.findHspemginfByemgSql_jzt(emgSeq);
		if(hspemginfCustom == null){
			hspemginfCustom = new HspemginfCustom();
		}
		hspJzcsjlbInfQueryDto.setHspemginfCustom(hspemginfCustom);
		return hspJzcsjlbInfQueryDto;
	}

	@Override
	public void updateJzcsjlb(HspJzcsjlbInfQueryDto hspJzcsjlbInfQueryDto) throws Exception {
		if (hspJzcsjlbInfQueryDto != null) {
			HspJzcsjlbInfCustom hspJzcsjlbInfCustom = hspJzcsjlbInfQueryDto.getHspJzcsjlbInfCustom();
			if (StringUtils.isNotNullAndEmptyByTrim(hspJzcsjlbInfCustom.getJzcsId())) {
				HspJzcsjlbInf hspJzcsjlbInf = hspJzcsjlbInfMapper.selectByPrimaryKey(hspJzcsjlbInfCustom.getJzcsId());
				if (hspJzcsjlbInf != null) {
					hspJzcsjlbInfMapper.updateByPrimaryKey(hspJzcsjlbInfCustom);
				}
			}else {
				hspJzcsjlbInfCustom.setJzcsId(UUIDBuild.getUUID());
				hspJzcsjlbInfMapper.insert(hspJzcsjlbInfCustom);
			}
			//删除原有急救传呼情况
			delJjchqk(hspJzcsjlbInfCustom.getJzcsId());
			//删除原有急诊皮试
			delJzps(hspJzcsjlbInfCustom.getJzcsId());
			
			List<HspJjchqkInf> hspJjchqkInfList = hspJzcsjlbInfQueryDto.getHspJjchqkInfList();
			List<HspJzpsInf> hspJzpsInfList = hspJzcsjlbInfQueryDto.getHspJzpsInfList();
			for (HspJjchqkInf hspJjchqkInf : hspJjchqkInfList) {
				hspJjchqkInf.setChqkId(UUIDBuild.getUUID());
				hspJjchqkInf.setJzcsId(hspJzcsjlbInfCustom.getJzcsId());
				hspJjchqkInfMapper.insert(hspJjchqkInf);
			}
			for (HspJzpsInf hspJzpsInf : hspJzpsInfList) {
				hspJzpsInf.setJzpsId(UUIDBuild.getUUID());
				hspJzpsInf.setJzcsId(hspJzcsjlbInfCustom.getJzcsId());
				hspJzpsInfMapper.insert(hspJzpsInf);
			}
		}
	}

	private void delJjchqk(String jzcsId) throws Exception {
		if(StringUtils.isNotNullAndEmptyByTrim(jzcsId)){
			HspJjchqkInfExample hspJjchqkInfExample = new HspJjchqkInfExample();
			HspJjchqkInfExample.Criteria criteria = hspJjchqkInfExample.createCriteria();
			criteria.andJzcsIdEqualTo(jzcsId);
			hspJjchqkInfMapper.deleteByExample(hspJjchqkInfExample);
		}
	}
	
	private void delJzps(String jzcsId) throws Exception {
		if(StringUtils.isNotNullAndEmptyByTrim(jzcsId)){
			HspJzpsInfExample hspJzpsInfExample = new HspJzpsInfExample();
			HspJzpsInfExample.Criteria criteria = hspJzpsInfExample.createCriteria();
			criteria.andJzcsIdEqualTo(jzcsId);
			hspJzpsInfMapper.deleteByExample(hspJzpsInfExample);
		}
	}
}
