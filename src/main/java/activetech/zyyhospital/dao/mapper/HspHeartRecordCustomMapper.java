package activetech.zyyhospital.dao.mapper;

import java.util.List;
import activetech.zyyhospital.pojo.dto.HspHeartRecordCustom;
import activetech.zyyhospital.pojo.dto.HspHeartRecordQueryDto;

public interface HspHeartRecordCustomMapper {
   
	/**
	 * 获取心肺复苏记录单列表总条数
	 * @param hspHeartRecordQueryDto
	 * @return
	 */
	int queryHeartRecordListCount(HspHeartRecordQueryDto hspHeartRecordQueryDto) throws Exception;
	
	/**
	 * 获取心肺复苏记录单列表
	 * @param hspHeartRecordQueryDto
	 * @return
	 */
	List<HspHeartRecordCustom> queryHeartRecordList(HspHeartRecordQueryDto hspHeartRecordQueryDto) throws Exception;
}