package activetech.rfid.dao.mapper;

import activetech.rfid.pojo.domain.HspUhfRdr;
import activetech.rfid.pojo.dto.HspUhfRdrCustom;
import activetech.rfid.pojo.dto.HspUhfRdrQueryDto;

import java.util.List;


/**
 * 
 * <p>Title:HspUhfRdrCustomMapper</p>
 * <p>Description:UHF读写器管理用户自定义Dao类</p>
 * <p>activetech</p>
 * @author zhanghui
 * @date 2021-3-25 上午10:20:00
 *
 */
public interface HspUhfRdrCustomMapper {
	/**
	 * 查询UHF读写器列表总数
	 * @param hspUhfRdrQueryDto
	 * @return
	 * @throws Exception
	 */
	public int findHspUhfRdrCount(HspUhfRdrQueryDto hspUhfRdrQueryDto) throws Exception;
	/**
	 * 查询UHF读写器列表
	 * @param hspUhfRdrQueryDto
	 * @return
	 */
	public List<HspUhfRdrCustom> findHspUhfRdrList(HspUhfRdrQueryDto hspUhfRdrQueryDto);


	int updateByPrimaryKey(HspUhfRdr record);

	int insert(HspUhfRdr record);
	
}