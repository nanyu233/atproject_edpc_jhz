package activetech.zyyhospital.service;

import java.util.List;

import activetech.base.pojo.dto.ActiveUser;
import activetech.zyyhospital.pojo.domain.IcuErInfo;
import activetech.zyyhospital.pojo.dto.IcuErInfoQueryDto;


/**
 * 事件提醒 
 * <p>Title: IcuErInfoService.java IcuErInfoService</p>
 * <p>@Description: </p>
 * <p>Company: </p>
 * @author wzl
 * @date 2020年03月13日
 *
 */
public interface IcuErInfoService {
	
	/**
	 * 获取事件提醒列表
	 * @param icuErInfoCustom
	 * @return
	 * @throws Exception
	 */
	List<IcuErInfo> getErInfoList(IcuErInfoQueryDto icuErInfoQueryDto) throws Exception;
	
	/**
	 * 修改事件提醒状态
	 * @param icuErInfoQueryDto
	 * @return
	 */
	public void editErInfoSubmit(IcuErInfoQueryDto icuErInfoQueryDto);

	/**
	 * 查询事件提醒列表结果集数
	 * @param icuErInfoQueryDto
	 * @return
	 */
	public int getErInfoListCount(IcuErInfoQueryDto icuErInfoQueryDto);
	
	/**
	 * 获取事件提醒列表（分页）
	 * @param icuErInfoCustom
	 * @return
	 * @throws Exception
	 */
	List<IcuErInfo> getErInfoListFy(IcuErInfoQueryDto icuErInfoQueryDto) throws Exception;
}
