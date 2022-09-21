package activetech.zyyhospital.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.dto.DstdictinfoQueryDto;
import activetech.zyyhospital.pojo.dto.HspXtpgInfCustom;
import activetech.zyyhospital.pojo.dto.HspXtpgInfQueryDto;

public interface HspXtpgInfCustomMapper {

	/**
	 * 根据emgseq查询系统评估表数据  杭州中医院
	 *@param hspXtpgInfCustomDto
	 *@return
	 *@author zc
	 */
	public List<HspXtpgInfCustom> getXtpgListByemgseq(HspXtpgInfQueryDto hspXtpgInfCustomDto);
	/**
	 * 根据emgseq查询系统评估表列表总数  杭州中医院
	 *@param hspXtpgInfCustomDto
	 *@return
	 *@author zc
	 */
	public int findXtpgCount(HspXtpgInfQueryDto hspXtpgInfCustomDto);
	
    public List<Dstdictinfo> findDictinfoSubd(DstdictinfoQueryDto dstdictinfoQueryDto);
	
	public int findDictinfoSubdcount(DstdictinfoQueryDto dstdictinfoQueryDto);
	
	public HspXtpgInfCustom findXtpgByXtpgSeq(String xtpgSeq);
}
