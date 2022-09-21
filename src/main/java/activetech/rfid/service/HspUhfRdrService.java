package activetech.rfid.service;

import activetech.base.process.result.ResultInfo;
import activetech.rfid.pojo.domain.HspUhfRdr;
import activetech.rfid.pojo.dto.HspUhfRdrCustom;
import activetech.rfid.pojo.dto.HspUhfRdrQueryDto;

import java.util.List;

/**
 * 
 * <p>Title:HspUhfRdrService</p>
 * <p>Description:UHF读写器管理Service</p>
 * <p>activetech</p>
 * @author zhanghui
 * @date 2021-3-25 上午09:57:00
 * 
 */
public interface HspUhfRdrService {
	/**
	 * 新增UHF读写器
	 * @param hspUhfRdrCustom
	 * @throws Exception
	 */
	public ResultInfo insertHspUhfRdr(HspUhfRdrCustom hspUhfRdrCustom)throws Exception;
	
	/**
	 * 修改UHF读写器
	 * @param hspUhfRdrCustom
	 * @throws Exception
	 */
	public ResultInfo updateHspUhfRdr(HspUhfRdrCustom hspUhfRdrCustom)throws Exception;
	
	/**
	 * 删除UHF读写器
	 * @param rdrSeq
	 * @throws Exception
	 */
	public void deleteHspUhfRdr(String rdrSeq)throws Exception;
	
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
	public List<HspUhfRdr> findHspUhfRdrList(HspUhfRdrQueryDto hspUhfRdrQueryDto);
	
	/**
	 * 根据rdrSeq获取UHF读写器数据
	 * @param rdrSeq
	 * @return
	 */
	public HspUhfRdrCustom findHspUhfRdrByHspUhfRdr(String rdrSeq);

	ResultInfo getHspUhfRdrByRdrSeq(String rdrSeq);
}
