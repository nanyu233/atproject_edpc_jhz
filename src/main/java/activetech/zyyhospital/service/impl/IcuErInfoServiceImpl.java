package activetech.zyyhospital.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.dto.ActiveUser;
import activetech.util.StringUtils;
import activetech.zyyhospital.dao.mapper.IcuErInfoCustomMapper;
import activetech.zyyhospital.dao.mapper.IcuErInfoMapper;
import activetech.zyyhospital.pojo.domain.IcuErInfo;
import activetech.zyyhospital.pojo.domain.IcuErInfoExample;
import activetech.zyyhospital.pojo.dto.IcuErInfoCustom;
import activetech.zyyhospital.pojo.dto.IcuErInfoQueryDto;
import activetech.zyyhospital.service.IcuErInfoService;

/**
 * 事件提醒实现类
 * <p>Title: IcuErInfoServiceImpl.java IcuErInfoServiceImpl</p>
 * <p>@Description: </p>
 * <p>Company: </p>
 * @author wzl
 * @date 2020年03月13日
 *
 */
public class IcuErInfoServiceImpl implements IcuErInfoService {

	@Autowired
	private IcuErInfoMapper icuErInfoMapper;
	
	@Autowired
	private IcuErInfoCustomMapper icuErInfoCustomMapper;

	@Override
	public List<IcuErInfo> getErInfoList(IcuErInfoQueryDto icuErInfoQueryDto) throws Exception {
		return icuErInfoCustomMapper.getErInfoList(icuErInfoQueryDto);
	}

	@Override
	public void editErInfoSubmit(IcuErInfoQueryDto icuErInfoQueryDto) {
		IcuErInfoCustom icuErInfoCustom = icuErInfoQueryDto.getIcuErInfoCustom();
		if (StringUtils.isNotNullAndEmptyByTrim(icuErInfoCustom.getErSeq())) {
			IcuErInfo icuErInfo = icuErInfoMapper.selectByPrimaryKey(icuErInfoCustom.getErSeq());
			icuErInfo.setErStat("2");
			icuErInfo.setModTime(new Date());
			icuErInfo.setModUser(icuErInfoCustom.getModUser());
			icuErInfoMapper.updateByPrimaryKey(icuErInfo);
		}
	}

	@Override
	public int getErInfoListCount(IcuErInfoQueryDto icuErInfoQueryDto) {
		return icuErInfoCustomMapper.getErInfoListCount(icuErInfoQueryDto);
	}

	@Override
	public List<IcuErInfo> getErInfoListFy(IcuErInfoQueryDto icuErInfoQueryDto) throws Exception {
		return icuErInfoCustomMapper.getErInfoListFy(icuErInfoQueryDto);
	}
}
