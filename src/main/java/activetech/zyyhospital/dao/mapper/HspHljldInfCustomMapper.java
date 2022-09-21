package activetech.zyyhospital.dao.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.zyyhospital.pojo.dto.HspHljldInfCustom;
import activetech.zyyhospital.pojo.dto.HspHljldInfQueryDto;

public interface HspHljldInfCustomMapper {
	/**
	 * 根据emgseq查询护理记录单数据  杭州中医院
	 *@param hsphljldinfQueryDto
	 *@return
	 *@author liulj @date 2017年9月26日 上午10:15:21
	 */
	public List<HspHljldInfCustom> getHljldListByemgseq(HspHljldInfQueryDto hsphljldinfQueryDto);
	/**
	 * 根据emgseq查询护理记录单数据列表总数  杭州中医院
	 *@param hsphljldinfQueryDto
	 *@return
	 *@author liulj @date 2017年9月26日 上午10:39:01
	 */
	public int findHljldCount(HspHljldInfQueryDto hsphljldinfQueryDto);
	/**
	 * 根据emgseq查询护理记录单数据  杭州中医院 无分页
	 *@param hsphljldinfQueryDto
	 *@return
	 */
	public List<HspHljldInfCustom> getHljldListByemgseqall(HspHljldInfQueryDto hsphljldinfQueryDto);
	
	public List<HspHljldInfCustom> findemghljldByemgSeqanddate(@Param("startDat")Date startDat,
			@Param("endDat")Date endDat,@Param("emgSeq")String emgSeq);
	
	public List<HspHljldInfCustom> findemghljldByemgSeqanddateNl(@Param("startDat")Date startDat,
			@Param("endDat")Date endDat,@Param("emgSeq")String emgSeq);
	
	public int findHljldCountandcrl(HspHljldInfQueryDto hsphljldinfQueryDto);
	
	public HspHljldInfCustom getHljldInfxtByemgseq(HspHljldInfQueryDto hsphljldinfQueryDto);
	
	public List<HspHljldInfCustom> getHljldinfListByemgseq(HspHljldInfQueryDto hsphljldinfQueryDto);
	
	/**
	 * 护理记录单查询counts
	 */
	public HspHljldInfCustom findHljldById(String behiseq);
	
	/**
	 * 出入量平衡区间合计数据
	 * @param hsphljldinfQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<HspHljldInfCustom> queryIntervalInfo(HspHljldInfQueryDto hsphljldinfQueryDto) throws Exception;
	
	/**
	 * 根据emgseq查询护理记录单数据  全览图图表管理列表
	 */
	public List<HspHljldInfCustom> getIcuHljldListByemgseq(HspHljldInfQueryDto hsphljldinfQueryDto);
	
	public int findIcuHljldCount(HspHljldInfQueryDto hsphljldinfQueryDto);
	
	/**
	 * 生命体征数据
	 * @param hsphljldinfQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<HspHljldInfCustom> getHljldVitlListByemgseq(HspHljldInfQueryDto hsphljldinfQueryDto) throws Exception;
}