package activetech.zyyhospital.service;

import java.util.List;

import activetech.base.pojo.dto.ActiveUser;
import activetech.zyyhospital.pojo.domain.HspBedInf;
import activetech.zyyhospital.pojo.dto.HspBedInfCustom;
import activetech.zyyhospital.pojo.dto.HspBedInfCustomDto;

public interface HspBedInfService {
	/**
	 * 新增床位
	 * @param hspBedInfCustomDto
	 * @throws Exception
	 */
	public void addBed(HspBedInfCustomDto hspBedInfCustomDto,ActiveUser activeUser)throws Exception;
	
	/**
	 * 修改床位
	 * @param hspBedInfCustomDto
	 * @throws Exception
	 */
	public void updateBed(HspBedInfCustomDto hspBedInfCustomDto,ActiveUser activeUser)throws Exception;
	
	/**
	 * 删除床位
	 * @param hspBedInfCustomDto
	 * @throws Exception
	 */
	public void delBed(HspBedInfCustomDto hspBedInfCustomDto,ActiveUser activeUser)throws Exception;
	/**
	 * 获取床位列表
	 * @param hspBedInfCustomDto
	 * @return
	 * @throws Exception
	 */
	public List<HspBedInfCustom> getBedList(HspBedInfCustomDto hspBedInfCustomDto)throws Exception;
	
	public int findBedListCount(HspBedInfCustomDto hspBedInfCustomDto)throws Exception;
	
	public HspBedInf findBedById(HspBedInfCustomDto hspBedInfCustomDto)throws Exception;
	
	/**
	 * 获取床位列表(位置+床号)
	 * @param hspBedInfCustomDto
	 * @return
	 * @throws Exception
	 */
	public List<HspBedInfCustom> findBedPlaceAndNum(String emgSeq,String editbedflg)throws Exception;
	
	
	public void  updatedeployBed(HspBedInfCustomDto hspBedInfCustomDto,ActiveUser activeUser)throws Exception;

	/**
	 * 获取所有床位信息(包括部分患者信息)
	 * @param hspBedInfCustomDto
	 * @return
	 * @throws Exception
	 */
	public List<HspBedInfCustom> findALLBedPlace(String isBedType)throws Exception;
	
	/**
	 * 新入病人调配床位
	 * @param hspBedInfCustomDto
	 * @param activeUser
	 * @throws Exception
	 */
	void updateRelatedBed(HspBedInfCustomDto hspBedInfCustomDto,ActiveUser activeUser)throws Exception;
}
