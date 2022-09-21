package activetech.hospital.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.SystemConfigService;
import activetech.hospital.dao.mapper.HspDevSysCustomMapper;
import activetech.hospital.dao.mapper.HspDevSysMapper;
import activetech.hospital.pojo.domain.HspDevSys;
import activetech.hospital.pojo.domain.HspDevSysExample;
import activetech.hospital.pojo.dto.HspDevSysCustom;
import activetech.hospital.pojo.dto.HspDevSysQueryDto;
import activetech.hospital.service.HspDeviceService;
import activetech.util.DateUtil;
import activetech.util.StringUtils;

public class HspDeviceServiceImpl implements HspDeviceService {
	@Autowired
	private HspDevSysMapper hspDevSysMapper;
	@Autowired
	private HspDevSysCustomMapper hspDevSysCustomMapper;
	@Autowired
	private  SystemConfigService systemConfigService;

	@Override
	public void insertHspDevSys(HspDevSysQueryDto hspDevSysQueryDto,
			ActiveUser activeUser) throws Exception {
		// TODO Auto-generated method stub
		// 参数校验
		// 1.非空校验
		String nullstr = this
				.insertDeviceisNotNullAndEmptyByTrim(hspDevSysQueryDto
						.getHspDevSysCustom());
		if (StringUtils.isNotNullAndEmptyByTrim(nullstr)) {
			// 抛出异常
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,
					new Object[] { nullstr }));
		}

		// 数据业务合法性校验
		// 1.devno与devtypcod不能已存在
		HspDevSysCustom hds1 = hspDevSysCustomMapper
				.findByDevnoAndDevtypCod(hspDevSysQueryDto.getHspDevSysCustom());
		if (hds1 != null) {
			ResultUtil.throwExcepion(ResultUtil.createFail(
					Config.MESSAGE,
					912,
					new Object[] { "设备类型和设备唯一号",
							hds1.getDevtypcodName() + hds1.getDevno() }));
		}
		// 2.ipaddr与devtypcod不能已存在
		HspDevSysCustom hds2 = hspDevSysCustomMapper
				.findByIpaddrAndDevtypCod(hspDevSysQueryDto
						.getHspDevSysCustom());
		if (hds2 != null) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 912,
					new Object[] { "设备类型和绑定客户端IP",
							hds2.getDevtypcodName() + hds2.getIpaddr() }));
		}
		Date date = new Date();
		String dateStr = DateUtil.formatDateByFormat(date, "yyyyMMdd");
		String id = systemConfigService.findSequences("HSPDEVSYS_SEQ", "8",
				dateStr);
		HspDevSysCustom hspDevSysCustom = hspDevSysQueryDto
				.getHspDevSysCustom();
		hspDevSysCustom.setId(id);
		hspDevSysCustom.setCrtUsrNbr(activeUser.getUsrno());
		hspDevSysCustom.setCrtDat(date);

		hspDevSysMapper.insertSelective(hspDevSysCustom);
	}

	/**
	 * 设备配置必填字段项非空校验
	 * 
	 * @param dstroleCustom
	 * @return
	 */
	private String insertDeviceisNotNullAndEmptyByTrim(
			HspDevSysCustom hDevSysCustom) {
		// 设备唯一号
		if (!StringUtils.isNotNullAndEmptyByTrim(hDevSysCustom.getDevno())) {
			return "设备唯一号";
		}
		// 绑定客户端IP
		if (!StringUtils.isNotNullAndEmptyByTrim(hDevSysCustom.getIpaddr())) {
			return "绑定客户端IP";
		}
		return null;
	}

	@Override
	public void deleteById(HspDevSysCustom hspDevSysCustom) throws Exception {
		// TODO Auto-generated method stub
		// 参数校验
		// 1.非空校验
		if (!StringUtils.isNotNullAndEmptyByTrim(hspDevSysCustom.getId())) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,
					new Object[] { "设备配置Id" }));
		}
		// 2.删除用户是否存在
		HspDevSys hds = hspDevSysMapper.selectByPrimaryKey(hspDevSysCustom
				.getId());
		if (hds == null) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 912,
					new Object[] { "设备配置", "" }));
		}
		hspDevSysMapper.deleteByPrimaryKey(hspDevSysCustom.getId());
	}

	@Override
	public void updateById(HspDevSysQueryDto hspDevSysQueryDto,
			ActiveUser activeUser) throws Exception {
		// TODO Auto-generated method stub
		// 参数校验
		// 1.非空校验
		String nullstr = this
				.insertDeviceisNotNullAndEmptyByTrim(hspDevSysQueryDto
						.getHspDevSysCustom());
		if (StringUtils.isNotNullAndEmptyByTrim(nullstr)) {
			// 抛出异常
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,
					new Object[] { nullstr }));
		}

		// 数据业务合法性校验
		// 1.devno与devtypcod不能已存在
		HspDevSysCustom hds1 = hspDevSysCustomMapper
				.findByDevnoAndDevtypCod(hspDevSysQueryDto.getHspDevSysCustom());
		if (hds1 != null) {
			ResultUtil.throwExcepion(ResultUtil.createFail(
					Config.MESSAGE,
					912,
					new Object[] { "设备类型和设备唯一号",
							hds1.getDevtypcodName() + hds1.getDevno() }));
		}
		// 2.ipaddr与devtypcod不能已存在
		HspDevSysCustom hds2 = hspDevSysCustomMapper
				.findByIpaddrAndDevtypCod(hspDevSysQueryDto
						.getHspDevSysCustom());
		if (hds2 != null) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 912,
					new Object[] { "设备类型和绑定客户端IP",
							hds2.getDevtypcodName() + hds2.getIpaddr() }));
		}

		HspDevSys hspDevSys = hspDevSysMapper
				.selectByPrimaryKey(hspDevSysQueryDto.getHspDevSysCustom()
						.getId());
		hspDevSys.setDevtypCod(hspDevSysQueryDto.getHspDevSysCustom()
				.getDevtypCod());
		hspDevSys.setDevno(hspDevSysQueryDto.getHspDevSysCustom().getDevno());
		hspDevSys.setIpaddr(hspDevSysQueryDto.getHspDevSysCustom().getIpaddr());
		hspDevSys.setMemo(hspDevSysQueryDto.getHspDevSysCustom().getMemo());
		hspDevSys.setUpdDat(new Date());
		hspDevSys.setUpdUsrNbr(activeUser.getUsrno());
		hspDevSysMapper.updateByPrimaryKeySelective(hspDevSys);
	}

	/**
	 * 查询设备配置（按设备类型查询）
	 * 
	 * @param hspdevsys
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<HspDevSysCustom> selectHSDByList(
			HspDevSysQueryDto hspDevSysQueryDto) throws Exception {
		// TODO Auto-generated method stub
		List<HspDevSysCustom> hdsList = hspDevSysCustomMapper
				.findHspDevSysByDevtyp_cod(hspDevSysQueryDto);
		return hdsList;
	}

	/**
	 * 根据ID查找表数据（修改）
	 */
	@Override
	public HspDevSysCustom findById(HspDevSysQueryDto hspDevSysQueryDto)
			throws Exception {
		// TODO Auto-generated method stub
		HspDevSysCustom hspDevSysCustom = hspDevSysCustomMapper
				.findById(hspDevSysQueryDto.getHspDevSysCustom());
		return hspDevSysCustom;
	}

	/**
	 * 查询表记录总数
	 */
	@Override
	public int findHSDCount(HspDevSysQueryDto hspDevSysQueryDto)
			throws Exception {
		// TODO Auto-generated method stub
		int result = hspDevSysCustomMapper
				.findHspDevSysCount(hspDevSysQueryDto);
		return result;
	}

	@Override
	public HspDevSysCustom findByDevnoAndDevtypCod(
			HspDevSysCustom hspDevSysCustom) throws Exception {
		return hspDevSysCustomMapper.findByDevnoAndDevtypCod(hspDevSysCustom);
	}

	@Override
	public HspDevSysCustom findByDevnoAndIpadd(HspDevSysCustom hspDevSysCustom)
			throws Exception {
		return hspDevSysCustomMapper.findByDevnoAndIpadd(hspDevSysCustom);
	}

	@Override
	public List<HspDevSys> selectHSDByListQFY(HspDevSysCustom hspDevSysCustom) throws Exception {	
		if (StringUtils.isNotNullAndEmptyByTrim(hspDevSysCustom.getDevtypCod())) {
			HspDevSysExample hspDevSysExample = new HspDevSysExample();
			HspDevSysExample.Criteria criteria = hspDevSysExample.createCriteria();
			criteria.andDevtypCodEqualTo(hspDevSysCustom.getDevtypCod());
			return hspDevSysMapper.selectByExample(hspDevSysExample);
		}
		return null;
	}
}
