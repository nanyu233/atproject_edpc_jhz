package activetech.rfid.pojo.dto;

import activetech.base.pojo.domain.PageCond;
import activetech.base.pojo.dto.PageQuery;

/**
 * 
 * <p>Title:HspUhfRdrQueryDto</p>
 * <p>Description:UHF读写器管理包装类</p>
 * <p>activetech</p>
 * @author zhanghui
 * @date 2021-3-25 上午09:51:00
 * 
 */
public class HspUhfRdrQueryDto extends PageCond {

	private HspUhfRdrCustom hspUhfRdrCustom;

	public HspUhfRdrCustom getHspUhfRdrCustom() {
		return hspUhfRdrCustom;
	}

	public void setHspUhfRdrCustom(HspUhfRdrCustom hspUhfRdrCustom) {
		this.hspUhfRdrCustom = hspUhfRdrCustom;
	}

}
