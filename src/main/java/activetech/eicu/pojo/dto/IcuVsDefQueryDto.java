package activetech.eicu.pojo.dto;

import java.util.List;

import activetech.eicu.pojo.domain.IcuVsDef;

public class IcuVsDefQueryDto extends IcuVsDef{
	
	/**
	 * 修改保存list
	 */
	private List<IcuVsDefCustom> vsDefList;

	public List<IcuVsDefCustom> getVsDefList() {
		return vsDefList;
	}

	public void setVsDefList(List<IcuVsDefCustom> vsDefList) {
		this.vsDefList = vsDefList;
	}

	
   
}