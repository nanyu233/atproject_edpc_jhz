package activetech.zyyhospital.service;

import java.util.List;

import activetech.base.pojo.dto.ActiveUser;
import activetech.zyyhospital.pojo.domain.HspConsentInfWithBLOBs;
import activetech.zyyhospital.pojo.dto.HspConsentInfCustom;
import activetech.zyyhospital.pojo.dto.HspConsentInfCustomDto;
import activetech.zyyhospital.pojo.dto.HspConsentTempCustom;
import activetech.zyyhospital.pojo.dto.HspConsentTempCustomDto;
/**
 * 知情通知书service
 * <p>Title:</p>
 * <p>Description:</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2018年2月1日 上午11:53:11
 *
 */
public interface ZyyConsentService {
	/**
	 * 根据refseqno 患者号查询 知情书数量
	 *@param hspConsentInfCustomDto
	 *@return
	 *@author liulj @date 2018年2月1日 上午10:56:17
	 */
    public int findHspConsentInfByRefseqnoCount(HspConsentInfCustomDto hspConsentInfCustomDto) throws Exception;
   
    /**
     * 根据refseqno 患者号查询知情书列表
     *@param hspConsentInfCustomDto
     *@return
     *@author liulj @date 2018年2月1日 上午10:58:44
     */
    public List<HspConsentInfCustom>  findHspConsentInfByRefseqno(HspConsentInfCustomDto hspConsentInfCustomDto) throws Exception;
    
    /**
     * 根据seqno查询知情同意书
     *@param 
     *@return
     *@throws Exception
     *@author liulj @date 2018年2月1日 下午2:38:48
     */
    public HspConsentInfWithBLOBs findHspConsentInfBySeqno(String seqno) throws Exception;
    
    /**
     * 根据主键删除
     *@param seqno
     *@throws Exception
     *@author liulj @date 2018年2月5日 下午3:24:18
     */
    public void delHspConsentInfBySeqno(String seqno) throws Exception;
    
    /**
     * 根据主键修改内容
     *@param hspConsentInfCustom
     *@throws Exception
     *@author liulj @date 2018年2月5日 下午3:27:43
     */
    public HspConsentInfCustom updateHspConsentInfBySeqno(HspConsentInfCustom hspConsentInfCustom,ActiveUser activeuser) throws Exception;
    
    /**
     * 查询知情同意书模板列表 数量
     *@param hspConsenttempCustomDto
     *@return
     *@throws Exception
     *@author liulj @date 2018年2月6日 上午10:29:41
     */
    public int findHspConsentTempCount(HspConsentTempCustomDto hspConsenttempCustomDto) throws Exception;
    
    /**
     * 查询知情同意书列表
     *@param hspConsentTempCustomDto
     *@return
     *@throws Exception
     *@author liulj @date 2018年2月6日 上午10:32:00
     */
    public List<HspConsentTempCustom>  findHspConsentTemp(HspConsentTempCustomDto hspConsentTempCustomDto) throws Exception;
}
