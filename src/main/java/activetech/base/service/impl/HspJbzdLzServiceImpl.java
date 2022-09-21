package activetech.base.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.dao.mapper.HspJbzdLzCustomMapper;
import activetech.base.dao.mapper.HspJbzdLzMapper;
import activetech.base.pojo.domain.HspCbyxgl;
import activetech.base.pojo.domain.HspJbzdLz;
import activetech.base.pojo.dto.HspCbyxglInfCustom;
import activetech.base.pojo.dto.HspCbyxglInfQueryDto;
import activetech.base.pojo.dto.HspJbzdLzCustom;
import activetech.base.pojo.dto.HspJbzdLzDto;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.HspJbzdLzService;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;

public class HspJbzdLzServiceImpl implements HspJbzdLzService {
	@Autowired
	private HspJbzdLzMapper hspJbzdLzMapper;
	@Autowired
	private HspJbzdLzCustomMapper hspJbzdLzCustomMapper;

	@Override
	public int findhspJbzdLzCount(HspJbzdLzDto hspJbzdLzDto) throws Exception {
		int total = hspJbzdLzCustomMapper.findHspJbzdLzCount(hspJbzdLzDto);
		return total;
	}

	@Override
	public List<HspJbzdLzCustom> findhspJbzdLzByPysm(HspJbzdLzDto hspJbzdLzDto)
			throws Exception {
		List<HspJbzdLzCustom> list = hspJbzdLzCustomMapper
				.findHspJbzdLzByPysm(hspJbzdLzDto);
		return list;
	}

	@Override
	public List<HspJbzdLzCustom> findhspJbzdLzByJbzd(HspJbzdLzDto hspJbzdLzDto)
			throws Exception {
		List<HspJbzdLzCustom> list = hspJbzdLzCustomMapper.findHspJbzdLz(hspJbzdLzDto);
		return list;
	}

	@Override
	public List<HspJbzdLzCustom> findHspJbzdLz(HspJbzdLzDto hspJbzdLzDto)
			throws Exception {
		return hspJbzdLzCustomMapper.findHspJbzdLz(hspJbzdLzDto);
	}

	@Override
	public void addJbzdLz(HspJbzdLzDto hspJbzdLzDto) throws Exception {
		// 1.非空校验
		String nullstr = this.insertHspJbzdLzNotNullAndEmptyByTrim(hspJbzdLzDto
				.getHspJbzdLzCustom());
		if (StringUtils.isNotNullAndEmptyByTrim(nullstr)) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,
					new Object[] { nullstr }));
		}
		// 1.jbbc不能已存在
		HspJbzdLzCustom jbbc = hspJbzdLzCustomMapper
				.findHspJbzdLzByjbzd(hspJbzdLzDto);
		if (jbbc != null) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 912,
					new Object[] { "疾病名称", jbbc.getJbbc() }));
		}
		hspJbzdLzMapper.insert(hspJbzdLzDto.getHspJbzdLzCustom());

	}

	/* 必填字段验证 */
	private String insertHspJbzdLzNotNullAndEmptyByTrim(
			HspJbzdLzCustom hspJbzdLzCustom) {
		// id
		if (!StringUtils.isNotNullAndEmptyByTrim(hspJbzdLzCustom.getId())) {
			return "id";
		}
		// icd10
		if (!StringUtils.isNotNullAndEmptyByTrim(hspJbzdLzCustom.getIcd10())) {
			return "icd10";
		}
		// 疾病名称
		if (!StringUtils.isNotNullAndEmptyByTrim(hspJbzdLzCustom.getJbbc())) {
			return "疾病名称";
		}
		// 拼音首码
		if (!StringUtils.isNotNullAndEmptyByTrim(hspJbzdLzCustom.getPysm())) {
			return "拼音首码";
		}
		// 疾病类型
		if (!StringUtils.isNotNullAndEmptyByTrim(hspJbzdLzCustom
				.getJibingtype())) {
			return "疾病类型";
		}
		return null;
	}

	@Override
	public void updateJbzdLz(HspJbzdLzDto hspJbzdLzDto) throws Exception {
		String nullstr = this
				.insertHspJbzdLzNotNullAndEmptyByTrim(hspJbzdLzDto
						.getHspJbzdLzCustom());
		if (StringUtils.isNotNullAndEmptyByTrim(nullstr)) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,
					new Object[] { nullstr }));
		}
		// 1.jbbc不能已存在
				HspJbzdLzCustom jbbc = hspJbzdLzCustomMapper
						.findHspJbzdLzByjbzd(hspJbzdLzDto);
				if (jbbc != null) {
					ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 912,
							new Object[] { "疾病名称", jbbc.getJbbc() }));
				}
		HspJbzdLz hspJbzdLz = hspJbzdLzMapper
				.selectByPrimaryKey(hspJbzdLzDto.getHspJbzdLzCustom().getId());
		hspJbzdLz.setJbbc(hspJbzdLzDto.getHspJbzdLzCustom().getJbbc());
		hspJbzdLz.setPysm(hspJbzdLzDto.getHspJbzdLzCustom().getPysm());
		hspJbzdLz.setIcd10(hspJbzdLzDto.getHspJbzdLzCustom().getIcd10());
		hspJbzdLz.setJibingtype(hspJbzdLzDto.getHspJbzdLzCustom().getJibingtype());
		hspJbzdLzMapper.updateByPrimaryKey(hspJbzdLz);
	}

	@Override
	public void deleteJbzdLz(String id) throws Exception {
		// 1.非空校验
		if (!StringUtils.isNotNullAndEmptyByTrim(id)) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,
					new Object[] { "疾病管理ID" }));
		}
		// 2.删除信息是否存在
		HspJbzdLz hspJbzdLz = hspJbzdLzMapper
				.selectByPrimaryKey(id);
		if (hspJbzdLz == null) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 912,
					new Object[] { "疾病管理", "" }));
		}
		hspJbzdLzMapper.deleteByPrimaryKey(id);

	}

	@Override
	public HspJbzdLz findById(HspJbzdLzDto hspJbzdLzDto) throws Exception {
		HspJbzdLz hspJbzdLz = hspJbzdLzMapper.selectByPrimaryKey(hspJbzdLzDto
				.getHspJbzdLzCustom().getId());
		return hspJbzdLz;
	}

}
