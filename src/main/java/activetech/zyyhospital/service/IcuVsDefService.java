package activetech.zyyhospital.service;

import java.util.List;

import activetech.eicu.pojo.dto.IcuVsDefCustom;

public interface IcuVsDefService {
	/**
	 * 获取生命体征列表
	 * @return
	 */
	public List<IcuVsDefCustom> getIcuVsDefList();
	
	/**
	 * 修改保存生命体征
	 */
	public void editVsDefSubmit(List<IcuVsDefCustom> vsDefList);
}
