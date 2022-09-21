package activetech.zyyhospital.dao.mapper;

import java.util.List;

import activetech.zyyhospital.pojo.dto.HspConsentInfCustom;
import activetech.zyyhospital.pojo.dto.HspConsentInfCustomDto;

/**
 * 知情同意书
 * <p>Title:</p>
 * <p>Description:</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2018年2月1日 上午10:52:48
 *
 */
public interface HspConsentInfCustomMapper {
	/**
	 * 根据refseqno 患者号查询 知情书数量
	 *@param hspConsentInfCustomDto
	 *@return
	 *@author liulj @date 2018年2月1日 上午10:56:17
	 */
    public int findHspConsentInfByRefseqnoCount(HspConsentInfCustomDto hspConsentInfCustomDto);
   
    /**
     * 根据refseqno 患者号查询知情书列表
     *@param hspConsentInfCustomDto
     *@return
     *@author liulj @date 2018年2月1日 上午10:58:44
     */
    public List<HspConsentInfCustom>  findHspConsentInfByRefseqno(HspConsentInfCustomDto hspConsentInfCustomDto);
}
