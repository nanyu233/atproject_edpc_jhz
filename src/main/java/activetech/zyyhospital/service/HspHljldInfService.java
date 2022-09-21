package activetech.zyyhospital.service;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSONObject;

import activetech.base.pojo.dto.ActiveUser;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.pda.pojo.dto.HspCfxxInfoCustom;
import activetech.pda.pojo.dto.HspCfxxInfoQueryDto;
import activetech.zyyhospital.pojo.domain.HspHljldInf;
import activetech.zyyhospital.pojo.domain.HspHljldclrInf;
import activetech.zyyhospital.pojo.domain.Pdatransfusionrecord;
import activetech.zyyhospital.pojo.dto.HspHljldInfCustom;
import activetech.zyyhospital.pojo.dto.HspHljldInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspHljldcrltjInfCustom;
import activetech.zyyhospital.pojo.dto.HspHlpgbCustom;
/**
 * 
 * <p>Title:HspHljldInfService</p>
 * <p>Description:中医院病情护理记录单Service接口</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年9月25日 下午6:52:09
 *
 */
public interface HspHljldInfService {
	/**
	 * 根据预检号查询护理记录单列表
	 *@param hspHljldInfQueryDto
	 *@return
	 *@throws Exception
	 *@author liulj @date 2017年9月26日 上午10:34:29
	 */
	public List<HspHljldInfCustom> getHljldListByemgseq(HspHljldInfQueryDto hspHljldInfQueryDto) throws Exception;
	
	/**
	 * 根据预检号查询护理记录单数据(无分页)
	 *@param hspHljldInfQueryDto
	 *@return
	 *@throws Exception
	 *@author wzl @date 2020年03月09日
	 */
	public List<HspHljldInfCustom> getHljldListByemgseqall(HspHljldInfQueryDto hspHljldInfQueryDto) throws Exception;
	
	/**
	 * 根据预检号查询护理记录单列表总数
	 *@param hspJbzdInfQueryDto
	 *@return
	 *@author liulj @date 2017年9月26日 上午10:34:56
	 */
	public int findHljldCount(HspHljldInfQueryDto hspHljldInfQueryDto);
	
	/**
	 * 新增护理记录单提交
	 *@param hspHljldInfQueryDto
	 *@throws Exception
	 *@author liulj @date 2017年9月26日 下午2:49:13
	 */
	public void addhljldsubmit(HspHljldInfQueryDto hspHljldInfQueryDto)throws Exception;
	
	/**
	 * 根据bqhiseq查询基础护理数据
	 *@param bqhiseq
	 *@return
	 *@throws Exception
	 *@author liulj @date 2017年9月27日 上午10:37:45
	 */
	public HspHljldInf findHspHljldInfbyHqhiseq(String bqhiseq)throws Exception;
	/**
	 * 根据bqhiseq查询出入量数据
	 *@param bqhiseq
	 *@param type
	 *@return
	 *@throws Exception
	 *@author liulj @date 2017年9月27日 上午10:41:38
	 */
	public List<HspHljldclrInf>  findHspHljldclrInfbyHqhiseq(String bqhiseq,String type )throws Exception;
	/**
	 * 护理记录单修改提交
	 *@param hspHljldInfQueryDto
	 *@throws Exception
	 *@author liulj @date 2017年9月27日 下午2:08:20
	 */
	public void edithljldsubmit(HspHljldInfQueryDto hspHljldInfQueryDto,ActiveUser activeuser)throws Exception;
	/**
	 * 根据护理记录单单号删除数据
	 *@param bqhiseq
	 *@throws Exception
	 *@author liulj @date 2017年9月27日 下午3:25:39
	 */
	public void delhljldSubmit(String bqhiSeq)throws Exception;
	/**
	 * 根据emgSeq查询病人护理记录单 病人信息
	 *@param emgSeq
	 *@return
	 *@throws Exception
	 *@author liulj @date 2017年10月19日 下午3:12:48
	 */
	public HspemginfCustom findemghljldByemgSeq(String emgSeq)throws Exception;
	
	public List<HspHljldInfCustom> findemghljldByemgSeqanddate(Date startDat,Date endDate,String emgSeq)throws Exception;
	public List<HspHljldInfCustom> findemghljldByemgSeqanddateNl(Date startDat,Date endDate,String emgSeq)throws Exception;
	public int addsumcrlsubmit(HspHljldcrltjInfCustom hspHljldcrltjInfCustom,ActiveUser activeuser)throws Exception;
	public int findHljldCountandcrl(HspHljldInfQueryDto hspHljldInfQueryDto);
	
	public List<HspHljldInfCustom> getHljldListByemgseqandflg(HspHljldInfQueryDto hspHljldInfQueryDto) throws Exception;
	public List<JSONObject> getJhyxx();
	
	/**
	 * 6项评分 fzz 
	 * @param hspHlpgbQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	public String submitBradenScore(HspHljldInfQueryDto hspHljldInfQueryDto,ActiveUser activeUser)throws Exception ;
	
	public String submitAdlScore(HspHljldInfQueryDto hspHljldInfQueryDto,ActiveUser activeUser)throws Exception ;
	
	public String submitZyfxpfScore(HspHljldInfQueryDto hspHljldInfQueryDto,ActiveUser activeUser)throws Exception ;
	
	public String submitGcsSco(HspHljldInfQueryDto hspHljldInfQueryDto, ActiveUser activeUser)throws Exception ;

	public String submitNrsScore(HspHljldInfQueryDto hspHljldInfQueryDto, ActiveUser activeUser)throws Exception ;
	
	public String addMorseScore(HspHljldInfQueryDto hspHljldInfQueryDto, ActiveUser activeUser)throws Exception;
	
	/**
	 * 病情护理记录单导出医嘱数据
	 * @param hspCfxxInfoQueryDto
	 * @return
	 */
	List<HspCfxxInfoCustom> cfxxInfoResult(HspCfxxInfoQueryDto hspCfxxInfoQueryDto);
	
	/**
	 * 病情护理记录单导入输血数据
	 * @param hspCfxxInfoQueryDto
	 * @return
	 */
	List<Pdatransfusionrecord> findPdatransfusionrecordList(HspHljldInfQueryDto hspHljldInfQueryDto);
	
	/**
	 * 导入护理评估单评分
	 * @param emgSeq
	 * @param activeUser
	 * @return
	 */
	HspHlpgbCustom getScore(String emgSeq, ActiveUser activeUser) throws Exception;
	public List<HspHljldInfCustom> getIcuHljldListByemgseq(HspHljldInfQueryDto hspHljldInfQueryDto) throws Exception;
	public int findIcuHljldCount(HspHljldInfQueryDto hspHljldInfQueryDto) throws Exception;

}
