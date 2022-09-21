package activetech.zyyhospital.service;

import java.util.List;

import activetech.base.pojo.dto.ActiveUser;
import activetech.zyyhospital.pojo.domain.HspHeartRecord;
import activetech.zyyhospital.pojo.dto.HspHeartRecordCustom;
import activetech.zyyhospital.pojo.dto.HspHeartRecordQueryDto;

/**
 * 心肺复苏service
 * @author machaofan
 *
 */
public interface HspHeartRecordService {
	
	
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
	
	/**
	 * 查询一条心肺复苏记录
	 * @param heartSeq
	 * @return
	 */
	HspHeartRecord getRecordByPrimaryKey(String heartSeq) throws Exception;
	
	/**
	 * 心肺复苏新增修改保存
	 * @param hspheartRecordCustom
	 * @param activeUser
	 * @throws Exception
	 */
	void updateRecord(HspHeartRecordCustom hspheartRecordCustom, ActiveUser activeUser) throws Exception;
	
	/**
	 * 心肺复苏删除
	 * @param heartSeq
	 * @throws Exception
	 */
	void deleteRecord(String heartSeq) throws Exception;
}
