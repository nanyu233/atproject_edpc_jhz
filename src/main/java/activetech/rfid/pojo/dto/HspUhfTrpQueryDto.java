package activetech.rfid.pojo.dto;

import activetech.base.pojo.domain.PageCond;
import activetech.base.pojo.dto.PageQuery;

/**
 * 
 * <p>Title:HspUhfTrpQueryDto</p>
 * <p>Description:UHF应答器管理包装类</p>
 * <p>activetech</p>
 * @author zhanghui
 * @date 2021-3-31 下午20:38:00
 * 
 */
public class HspUhfTrpQueryDto extends PageCond {

	private HspUhfTrpCustom hspUhfTrpCustom;

	public HspUhfTrpCustom getHspUhfTrpCustom() {
		return hspUhfTrpCustom;
	}

	public void setHspUhfTrpCustom(HspUhfTrpCustom hspUhfTrpCustom) {
		this.hspUhfTrpCustom = hspUhfTrpCustom;
	}

}
