package activetech.hospital.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.dto.ActiveUser;
import activetech.hospital.service.HspFavoriteInfService;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import activetech.zyyhospital.dao.mapper.HspDzblDictCustomMapper;
import activetech.zyyhospital.dao.mapper.HspDzblDictMapper;
import activetech.zyyhospital.dao.mapper.HspFavoritesInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspFavoritesInfMapper;
import activetech.zyyhospital.pojo.domain.HspBasyCzjsExample;
import activetech.zyyhospital.pojo.domain.HspDzblDict;
import activetech.zyyhospital.pojo.domain.HspDzblDictExample;
import activetech.zyyhospital.pojo.domain.HspFavoritesInf;
import activetech.zyyhospital.pojo.domain.HspFavoritesInfExample;
import activetech.zyyhospital.pojo.dto.HspDzblDictCustom;
import activetech.zyyhospital.pojo.dto.HspDzblDictDto;
import activetech.zyyhospital.pojo.dto.HspFavoritesInfCustom;
import activetech.zyyhospital.pojo.dto.HspFavoritesInfCustomDto;
import activetech.zyyhospital.pojo.dto.HspLqbljlQueryDto;

public class HspFavoriteInfServiceImpl implements HspFavoriteInfService {
	@Autowired
	private HspFavoritesInfMapper hspFavoritesInfMapper;
	@Autowired
	private HspFavoritesInfCustomMapper hspFavoritesInfCustomMapper;
	@Autowired
	private HspDzblDictMapper hspDzblDictMapper;
	@Autowired
	private HspDzblDictCustomMapper hspDzblDictCustomMapper;

	@Override
	public void editFavoritesSubmit(
			HspFavoritesInfCustom hspFavoritesInfCustom,ActiveUser activeUser) throws Exception {
		if (StringUtils.isNotNullAndEmptyByTrim(hspFavoritesInfCustom.getSeqno())) {
			HspFavoritesInf hspFavoritesInf = hspFavoritesInfMapper.selectByPrimaryKey(hspFavoritesInfCustom.getSeqno());
			if (hspFavoritesInf != null) {
				hspFavoritesInf.setCrtusrno(activeUser.getUsrno());
				hspFavoritesInf.setContent(hspFavoritesInfCustom.getContent());
				//病历知识库管理更新判断
				if (StringUtils.isNotNullAndEmptyByTrim(hspFavoritesInfCustom.getTitle())) {
					hspFavoritesInf.setTitle(hspFavoritesInfCustom.getTitle());
				}
				if (StringUtils.isNotNullAndEmptyByTrim(hspFavoritesInfCustom.getSctype())) {
					hspFavoritesInf.setSctype(hspFavoritesInfCustom.getSctype());
				}
				if (hspFavoritesInfCustom.getShoworder() != null) {
					hspFavoritesInf.setShoworder(hspFavoritesInfCustom.getShoworder());
				}
				hspFavoritesInfMapper.updateByPrimaryKey(hspFavoritesInf);
			}
		}else {
			hspFavoritesInfCustom.setSeqno(UUIDBuild.getUUID());
			hspFavoritesInfCustom.setCrtdate(new Date());
			hspFavoritesInfCustom.setCrtusrno(activeUser.getUsrno());
			if (!StringUtils.isNotNullAndEmptyByTrim(hspFavoritesInfCustom.getKsdm())) {
				hspFavoritesInfCustom.setKsdm(activeUser.getSysid());
			}
			hspFavoritesInfMapper.insertSelective(hspFavoritesInfCustom);
		}	
	}

	@Override
	public void delHspFavoritesInf(HspFavoritesInfCustom hspFavoritesInfCustom)
			throws Exception {
		if (null != hspFavoritesInfCustom && StringUtils.isNotNullAndEmptyByTrim(hspFavoritesInfCustom.getSeqno())) {
			hspFavoritesInfMapper.deleteByPrimaryKey(hspFavoritesInfCustom.getSeqno());
		}
	}
	
	@Override
	public List<HspFavoritesInfCustom> findHspFavoritesInfList(HspFavoritesInfCustomDto hspFavoritesInfCustomDto) {
		return hspFavoritesInfCustomMapper.findHspFavoritesInfList(hspFavoritesInfCustomDto);
	}

	@Override
	public int findHspFavoritesInfListCount(HspFavoritesInfCustomDto hspFavoritesInfCustomDto) {
		return hspFavoritesInfCustomMapper.findHspFavoritesInfListCount(hspFavoritesInfCustomDto);
	}

	@Override
	public List<HspFavoritesInfCustom> findHspFavoritesInfListFy(HspFavoritesInfCustomDto hspFavoritesInfCustomDto) {
		return hspFavoritesInfCustomMapper.findHspFavoritesInfListFy(hspFavoritesInfCustomDto);
	}

	@Override
	public HspFavoritesInf findHspFavoritesInfBySeqno(String seqno) {
		return hspFavoritesInfMapper.selectByPrimaryKey(seqno);
	}

	@Override
	public List<HspDzblDictCustom> findhspDzblDictList(HspDzblDictDto hspDzblDictDto) {
		return hspDzblDictCustomMapper.findHspDzblDictList(hspDzblDictDto);
	}

	@Override
	public void editDictListSubmit(HspDzblDictDto hspDzblDictDto, ActiveUser activeUser) {
		if(hspDzblDictDto != null){
			HspDzblDictCustom hspDzblDictCustom = hspDzblDictDto.getHspDzblDictCustom();
			if(hspDzblDictCustom != null){
				if (StringUtils.isNotNullAndEmptyByTrim(hspDzblDictCustom.getMbSeq())) {
					HspDzblDict hspDzblDict = hspDzblDictCustomMapper.findHspDzblDict(hspDzblDictCustom.getMbSeq());
					if (hspDzblDict != null) {
						if(!StringUtils.isNotNullAndEmptyByTrim(hspDzblDict.getMbCrtTime())){
							hspDzblDict.setMbCrtTime(new Date());
						}
						hspDzblDict.setTyType(hspDzblDictCustom.getTyType());
						hspDzblDict.setMbContent(hspDzblDictCustom.getMbContent());
						hspDzblDict.setMbTitle(hspDzblDictCustom.getMbTitle());
						hspDzblDictCustomMapper.updateByPrimaryKey(hspDzblDict);
					}
				}else {
					//排序
					Integer sort;
					hspDzblDictCustom.setMbCrtUser(activeUser.getUsrno());
					hspDzblDictCustom.setMbCrtName(activeUser.getUsrname());
					List<HspDzblDictCustom> list = hspDzblDictCustomMapper.findHspDzblDictListByDesc(hspDzblDictDto);
					if(list != null && list.size() != 0){
						sort = list.get(0).getMbSort();
						sort += 1;
					}else{
						sort = 1;
					}
					//添加（个人）或者（名字）
					String name = activeUser.getUsrname();
					String mbname = hspDzblDictCustom.getMbTitle();
					if("2".equals(hspDzblDictCustom.getTyType())){
						mbname = mbname + "(" + name + ")";
					}else if("0".equals(hspDzblDictCustom.getTyType())){
						mbname = mbname + "(个人)" ;
					}
					hspDzblDictCustom.setMbTitle(mbname);
					hspDzblDictCustom.setMbSeq(UUIDBuild.getUUID());
					hspDzblDictCustom.setMbCrtTime(new Date());
					hspDzblDictCustom.setMbType("0");
					hspDzblDictCustom.setMbSort(sort);
					hspDzblDictMapper.insert(hspDzblDictCustom);
				}	
			}
		}
	}

	@Override
	public void delHspDictList(HspDzblDictCustom hspDzblDictCustom) {
		if (null != hspDzblDictCustom && StringUtils.isNotNullAndEmptyByTrim(hspDzblDictCustom.getMbSeq())) {
			hspDzblDictCustomMapper.deleteByPrimaryKey(hspDzblDictCustom.getMbSeq());
		}
	}

	@Override
	public List<HspDzblDictCustom> findAllDict() {
		return hspDzblDictCustomMapper.findAllDict();
	}
}
