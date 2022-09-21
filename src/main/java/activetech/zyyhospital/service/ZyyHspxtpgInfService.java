package activetech.zyyhospital.service;

import java.util.List;

import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.DstdictinfoQueryDto;
import activetech.zyyhospital.pojo.domain.HspAdlInf;
import activetech.zyyhospital.pojo.domain.HspBradenInf;
import activetech.zyyhospital.pojo.domain.HspDgpgInf;
import activetech.zyyhospital.pojo.domain.HspDgpgclrInf;
import activetech.zyyhospital.pojo.domain.HspGgjpfxtInf;
import activetech.zyyhospital.pojo.domain.HspHxxtpgInf;
import activetech.zyyhospital.pojo.domain.HspMnszxtpgInf;
import activetech.zyyhospital.pojo.domain.HspNrsInf;
import activetech.zyyhospital.pojo.domain.HspSjxtpgInf;
import activetech.zyyhospital.pojo.domain.HspXhxtpgInf;
import activetech.zyyhospital.pojo.domain.HspXlshpgInf;
import activetech.zyyhospital.pojo.domain.HspXxgxtpgInf;
import activetech.zyyhospital.pojo.domain.HspZcddexpfInf;
import activetech.zyyhospital.pojo.dto.HspFallriskInfCustom;
import activetech.zyyhospital.pojo.dto.HspXtpgInfCustom;
import activetech.zyyhospital.pojo.dto.HspXtpgInfQueryDto;



public interface ZyyHspxtpgInfService {
	/**
	 * 根据预检号查询系统评估表
	 *@param HspXtpgInfQueryDto
	 *@return
	 *@throws Exception
	 *@author zc
	 */
	public List<HspXtpgInfCustom> getXtpgListByemgseq(HspXtpgInfQueryDto hspXtpgInfCustomDto) throws Exception;
	/**
	 * 根据预检号查询系统评估表总数
	 *@param HspXtpgInfQueryDto
	 *@return
	 *@author zc
	 */
	public int findXtpgCount(HspXtpgInfQueryDto hspXtpgInfCustomDto);
		
	public HspXtpgInfCustom findxtpgByXtpgSeq(String xtpgSeq)throws Exception;
	public HspBradenInf fingBradenByXtpgSeq(String xtpgSeq)throws Exception;
	public HspAdlInf findadlByXtpgSeq(String xtpgSeq)throws Exception;
	public HspZcddexpfInf findzcddByXtpgSeq(String xtpgSeq)throws Exception;
	public HspFallriskInfCustom findFallRiskByXtpgSeq(String xtpgSeq) throws Exception;
	public HspNrsInf findNrsByXtpgSeq(String xtpgSeq)throws Exception;
	public HspSjxtpgInf findSjxtByXtpgSeq(String xtpgSeq)throws Exception;
	public HspHxxtpgInf findHxxtByXtpgSeq(String xtpgSeq)throws Exception;
	public HspXxgxtpgInf findXxgxtByXtpgSeq(String xtpgSeq)throws Exception;
	public HspXhxtpgInf findxhxtByXtpgSeq(String xtpgSeq)throws Exception;
	public HspMnszxtpgInf findMnszxtByXtpgSeq(String xtpgSeq)throws Exception;
	public HspGgjpfxtInf findpGgjpfxtByXtpgSeq(String xtpgSeq)throws Exception;
	public HspXlshpgInf findXlshpgByXtpgSeq(String xtpgSeq)throws Exception;
	public HspDgpgInf finDgpgByXtpgSeq(String xtpgSeq)throws Exception;
	public List<HspDgpgclrInf> finDgpgclrByXtpgSeq(String xtpgSeq)throws Exception;
	
	public HspNrsInf findNrsByXtpgSeqinsco(String xtpgSeq)throws Exception;
	public HspNrsInf findNrsByXtpgSeqnotinsco(String xtpgSeq)throws Exception;
	
	public void editxtpgsubmit(HspXtpgInfQueryDto hspXtpgInfCustomDto,ActiveUser activeuser)throws Exception;
	
	public void insertxtpg(HspXtpgInfQueryDto hspXtpgInfCustomDto,ActiveUser activeuser,String xtpgSeq)throws Exception;
	/**
	 * 根据预检号查询 最近一次的系统评估
	 *@param emgseq
	 *@return
	 *@throws Exception
	 *@author liulj @date 2017年10月18日 下午3:44:40
	 */
	public HspXtpgInfCustom getXtpgByemgseq(String emgseq) throws Exception;
	
	/**
	 * 导管评估内容
	 * @param：dstdictinfo
	 * @return：List<Dstdictinfo>
	 */
	public List<Dstdictinfo> findDictinfoSubd(DstdictinfoQueryDto dstdictinfoQueryDto);
	
	/**
	 * 导管评估的数量
	 * @param：dstdictinfo
	 * @return：List<Dstdictinfo>
	 */
	public int findDictinfoSubdcount(DstdictinfoQueryDto dstdictinfoQueryDto);
	
	/**
	 * 删除系统评估
	 * @param xtpgSeq
	 * @throws Exception
	 */
	public void delxtpgsubmit(String xtpgSeq)throws Exception;
	
}
