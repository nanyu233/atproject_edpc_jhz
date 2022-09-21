package activetech.zyyhospital.dao.mapper;

import java.util.List;

import activetech.zyyhospital.pojo.domain.IcuErInfo;
import activetech.zyyhospital.pojo.dto.IcuErInfoQueryDto;

/**
 * 事件提醒dao
 * <p>Title: IcuErInfoCustomMapper.java IcuErInfoCustomMapper</p>
 * <p>@Description: </p>
 * <p>Company: </p>
 * @author wzl
 * @date 2020年03月13日
 *
 */
public interface IcuErInfoCustomMapper {

	List<IcuErInfo> getErInfoList(IcuErInfoQueryDto icuErInfoQueryDto) throws Exception;

	public int getErInfoListCount(IcuErInfoQueryDto icuErInfoQueryDto);
	
	List<IcuErInfo> getErInfoListFy(IcuErInfoQueryDto icuErInfoQueryDto) throws Exception;
}
