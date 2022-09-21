package activetech.zyyhospital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.eicu.dao.mapper.IcuVsDefCustomMapper;
import activetech.eicu.dao.mapper.IcuVsDefMapper;
import activetech.eicu.pojo.dto.IcuVsDefCustom;
import activetech.zyyhospital.service.IcuVsDefService;

public class IcuVsDefServiceImpl implements IcuVsDefService{
	@Autowired
	private IcuVsDefCustomMapper icuVsDefCustomMapper;
	@Autowired
	private IcuVsDefMapper icuVsDefMapper;
	/**
	 * 获取生命体征列表
	 * @return
	 */
	@Override
	public List<IcuVsDefCustom> getIcuVsDefList(){
		return icuVsDefCustomMapper.getIcuVsDefList();
	}
	
	/**
	 * 修改保存生命体征
	 */
	@Override
	public void editVsDefSubmit(List<IcuVsDefCustom> vsDefList) {
		if(vsDefList != null && vsDefList.size() > 0) {
			for (IcuVsDefCustom icuVsDefCustom : vsDefList) {
				icuVsDefMapper.updateByPrimaryKey(icuVsDefCustom);
			}
		}
	}
}
