package activetech.rfid.dao.mapper;

import activetech.rfid.pojo.domain.HspUhfTrp;
import activetech.rfid.pojo.dto.HspUhfTrpCustom;
import activetech.rfid.pojo.dto.HspUhfTrpQueryDto;

import java.util.List;


/**
 * 
 * <p>Title:HspUhfTrpCustomMapper</p>
 * <p>Description:UHF应答器管理用户自定义Dao类</p>
 * <p>activetech</p>
 * @author zhanghui
 * @date 2021-3-31 下午20:38:00
 *
 */
public interface HspUhfTrpCustomMapper {
	/**
	 * 查询UHF应答器列表总数
	 * @param hspUhfTrpQueryDto
	 * @return
	 * @throws Exception
	 */
	public int findHspUhfTrpCount(HspUhfTrpQueryDto hspUhfTrpQueryDto) throws Exception;
	/**
	 * 查询UHF应答器列表
	 * @param hspUhfTrpQueryDto
	 * @return
	 */
	public List<HspUhfTrp> findHspUhfTrpList(HspUhfTrpQueryDto hspUhfTrpQueryDto);

	int updateByPrimaryKey(HspUhfTrp record);

    void insert(HspUhfTrpCustom hspUhfTrpCustom);

	/**
	 * 手环解绑
	 * @param hspUhfTrp
	 * @return
	 */
    void updateHspUhfTrpForUnbindPatient(HspUhfTrp hspUhfTrp);
}