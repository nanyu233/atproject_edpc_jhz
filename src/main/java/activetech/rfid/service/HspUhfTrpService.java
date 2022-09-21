package activetech.rfid.service;

import activetech.base.process.result.ResultInfo;
import activetech.rfid.pojo.domain.HspUhfTrp;
import activetech.rfid.pojo.dto.HspUhfTrpCustom;
import activetech.rfid.pojo.dto.HspUhfTrpQueryDto;

import java.util.List;

/**
 * 
 * <p>Title:HspUhfTrpService</p>
 * <p>Description:UHF应答器管理Service</p>
 * <p>activetech</p>
 * @author zhanghui
 * @date 2021-3-31 下午20:38:00
 * 
 */
public interface HspUhfTrpService {
	/**
	 * 新增UHF应答器
	 * @param hspUhfTrpCustom
	 * @throws Exception
	 */
	public ResultInfo insertHspUhfTrp(HspUhfTrpCustom hspUhfTrpCustom)throws Exception;
	
	/**
	 * 修改UHF应答器
	 * @param hspUhfTrpCustom
	 * @throws Exception
	 */
	public ResultInfo updateHspUhfTrp(HspUhfTrpCustom hspUhfTrpCustom)throws Exception;
	
	/**
	 * 删除UHF应答器
	 * @param trp
	 * @throws Exception
	 */
	public void deleteHspUhfTrp(String trp)throws Exception;
	
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
	
	/**
	 * 根据trpSeq获取UHF读写器数据
	 * @param trpSeq
	 * @return
	 */
	public HspUhfTrpCustom findHspUhfTrpByHspUhfTrp(String trpSeq);

    ResultInfo getHspUhfTrpByRdrSeq(String trpSeq);
}
