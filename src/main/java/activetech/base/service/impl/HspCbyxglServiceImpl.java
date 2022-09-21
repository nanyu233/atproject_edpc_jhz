package activetech.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.dao.mapper.HspCbyxglCustomMapper;
import activetech.base.dao.mapper.HspCbyxglMapper;
import activetech.base.pojo.domain.HspCbyxgl;
import activetech.base.pojo.dto.HspCbyxglInfCustom;
import activetech.base.pojo.dto.HspCbyxglInfQueryDto;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.HspCbyxglService;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;

public class HspCbyxglServiceImpl implements HspCbyxglService {
	@Autowired
	private HspCbyxglCustomMapper hspCbyxglCustomMapper;
	@Autowired
	private HspCbyxglMapper hspCbyxglMapper;
	@Override
	public void addHspCbyxgl(HspCbyxglInfQueryDto hspCbyxglInfQueryDto)
			throws Exception {
		// 1.非空校验
		String nullstr = this
				.insertHspCbyxglisNotNullAndEmptyByTrim(hspCbyxglInfQueryDto
						.getHspCbyxglInfCustom());
		if (StringUtils.isNotNullAndEmptyByTrim(nullstr)) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,
					new Object[] { nullstr }));
		}
		// 1.cbyx不能已存在
		HspCbyxglInfCustom cbyx = hspCbyxglCustomMapper
				.findHspCbyxglByCbyx(hspCbyxglInfQueryDto);
		if (cbyx != null) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 912,
					new Object[] { "初步印象", cbyx.getCbyx() }));
		}
		String id = UUIDBuild.getUUID();
		hspCbyxglInfQueryDto.getHspCbyxglInfCustom().setId(id);
		hspCbyxglMapper.insertSelective(hspCbyxglInfQueryDto.getHspCbyxglInfCustom());
		
	}
	@Override
	public void updateHspCbyxgl(HspCbyxglInfQueryDto hspCbyxglInfQueryDto)
			throws Exception {
		String nullstr = this
				.insertHspCbyxglisNotNullAndEmptyByTrim(hspCbyxglInfQueryDto
						.getHspCbyxglInfCustom());
		if (StringUtils.isNotNullAndEmptyByTrim(nullstr)) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,
					new Object[] { nullstr }));
		}
		// 1.疾病名称jbbc不能已存在
		HspCbyxglInfCustom cbyx = hspCbyxglCustomMapper
				.findHspCbyxglByCbyx(hspCbyxglInfQueryDto);
		if (cbyx != null) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 912,
					new Object[] { "初步印象", cbyx.getCbyx() }));
		}
		HspCbyxgl hspCbyxgl=hspCbyxglMapper.selectByPrimaryKey(hspCbyxglInfQueryDto.getHspCbyxglInfCustom().getId());
		hspCbyxgl.setCbyx(hspCbyxglInfQueryDto.getHspCbyxglInfCustom().getCbyx());
		hspCbyxgl.setPysm(hspCbyxglInfQueryDto.getHspCbyxglInfCustom().getPysm());
		hspCbyxgl.setYjdj(hspCbyxglInfQueryDto.getHspCbyxglInfCustom().getYjdj());
		hspCbyxgl.setBrqx(hspCbyxglInfQueryDto.getHspCbyxglInfCustom().getBrqx());
		hspCbyxgl.setFzks(hspCbyxglInfQueryDto.getHspCbyxglInfCustom().getFzks());
		hspCbyxgl.setMemo(hspCbyxglInfQueryDto.getHspCbyxglInfCustom().getMemo());
		hspCbyxglMapper.updateByPrimaryKey(hspCbyxgl);
		
	}
	@Override
	public void deleteHspCbyxglById(String id) throws Exception {
		// 1.非空校验
		if (!StringUtils.isNotNullAndEmptyByTrim(id)) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,
					new Object[] { "初步印象ID" }));
		}
		// 2.删除信息是否存在
		HspCbyxgl hspCbyxgl=hspCbyxglMapper.selectByPrimaryKey(id);
		if (hspCbyxgl == null) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 912,
					new Object[] { "初步印象", "" }));
		}
		hspCbyxglMapper.deleteByPrimaryKey(id);
		
	}
	@Override
	public List<HspCbyxglInfCustom> findHspCbyxglByCbyx(
			HspCbyxglInfQueryDto hspCbyxglInfQueryDto) throws Exception {
		List<HspCbyxglInfCustom> list = hspCbyxglCustomMapper
				.findHspCbyxgl(hspCbyxglInfQueryDto);
		return list;
	}
	@Override
	public int findHspCbyxglCount(HspCbyxglInfQueryDto hspCbyxglInfQueryDto)
			throws Exception {
		int total = hspCbyxglCustomMapper.findHspCbyxglCount(hspCbyxglInfQueryDto);
		return total;
	}
	@Override
	public HspCbyxgl findById(HspCbyxglInfQueryDto hspCbyxglInfQueryDto)
			throws Exception {
		HspCbyxgl hspCbyxgl = hspCbyxglMapper.selectByPrimaryKey(hspCbyxglInfQueryDto
				.getHspCbyxglInfCustom().getId());
		return hspCbyxgl;
	}
	/**
	 * 初步印象必填字段项非空校验
	 * 
	 * @param dstroleCustom
	 * @return
	 */
	private String insertHspCbyxglisNotNullAndEmptyByTrim(
			HspCbyxglInfCustom hspCbyxglInfCustom) {
		// 疾病名称
		if (!StringUtils.isNotNullAndEmptyByTrim(hspCbyxglInfCustom.getCbyx())) {
			return "初步印象";
		}
		// 拼音首码
		if (!StringUtils.isNotNullAndEmptyByTrim(hspCbyxglInfCustom.getPysm())) {
			return "拼音首码";
		}
		return null;
	}
	@Override
	public List<HspCbyxglInfCustom> findHspCbyxglByPysm(
			HspCbyxglInfQueryDto hspCbyxglInfQueryDto) throws Exception {
		List<HspCbyxglInfCustom> list = hspCbyxglCustomMapper
				.findCbyxglByPysm(hspCbyxglInfQueryDto);
		return list;
	}
	@Override
	public int queryZsk_resultCount(HspCbyxglInfQueryDto hspCbyxglInfQueryDto) {
		// TODO Auto-generated method stub
		return hspCbyxglCustomMapper.queryZsk_resultCount(hspCbyxglInfQueryDto);
	}
	@Override
	public List<HspCbyxglInfCustom> queryZsk_result(HspCbyxglInfQueryDto hspCbyxglInfQueryDto) {
		// TODO Auto-generated method stub
		return hspCbyxglCustomMapper.queryZsk_result(hspCbyxglInfQueryDto);
	}
	
}
