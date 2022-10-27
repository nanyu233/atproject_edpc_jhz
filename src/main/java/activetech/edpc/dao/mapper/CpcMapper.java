package activetech.edpc.dao.mapper;

import activetech.edpc.pojo.dto.HspDbzlBasCustom;
import activetech.edpc.pojo.dto.QueryDto;
import activetech.hospital.pojo.dto.HspemginfCustom;

import java.util.List;

public interface CpcMapper {
	/**
	 * 获取胸痛 卒中  创伤 患者列表
	 * @param queryDto queryDto {castName , dfflg ,patTyp}
	 * @return list
	 */
	List<HspDbzlBasCustom> getCpcPatientInfoList(QueryDto queryDto);
	/**
	 * 获取创伤患者列表  -- 即将作废
	 * @param queryDto queryDto {castName , dfflg}
	 * @return list
	 */
	List<HspemginfCustom> getCsPatientInfoList(QueryDto queryDto);
	/**
	 * 急救时间轴 and 胸痛上报 获取胸痛患者基础信息
	 * @param queryDto  regSeq
	 * @return HspDbzlBasCustom hspDbzlBasCustom
	 */
	HspDbzlBasCustom getHspDbzlBasinf(QueryDto queryDto);


	int getCpcPatientInfoListCount(QueryDto queryDto);
}
