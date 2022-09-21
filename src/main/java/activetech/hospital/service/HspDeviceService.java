package activetech.hospital.service;

import java.util.List;

import activetech.base.pojo.dto.ActiveUser;
import activetech.hospital.pojo.domain.HspDevSys;
import activetech.hospital.pojo.dto.HspDevSysCustom;
import activetech.hospital.pojo.dto.HspDevSysQueryDto;

public interface HspDeviceService {
	/**
	 * 新增设备配置
	 * @param hspdevsys
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	public void insertHspDevSys(HspDevSysQueryDto hspDevSysQueryDto,ActiveUser activeUser) throws Exception;
	
	public void deleteById(HspDevSysCustom hspDevSysCustom) throws Exception;
	
	public void updateById(HspDevSysQueryDto hspDevSysQueryDto,ActiveUser activeUser) throws Exception;
	
	/**
	 * 查询设备配置记录（按设备类型查询）
	 * @param hspdevsys
	 * @return
	 * @throws Exception
	 */
	public List<HspDevSysCustom> selectHSDByList(HspDevSysQueryDto hspDevSysQueryDto) throws Exception;
	
	public HspDevSysCustom findById(HspDevSysQueryDto hspDevSysQueryDto) throws Exception;
	
	public int findHSDCount(HspDevSysQueryDto hspDevSysQueryDto) throws Exception;
	
	public HspDevSysCustom findByDevnoAndDevtypCod(HspDevSysCustom hspDevSysCustom) throws Exception;
	
	public HspDevSysCustom findByDevnoAndIpadd (HspDevSysCustom hspDevSysCustom) throws Exception;

	/**
	 * 查询设备配置记录（按设备类型查询去分页）
	 * @param hspDevSysQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<HspDevSys> selectHSDByListQFY(HspDevSysCustom hspDevSysCustom) throws Exception;
}
