package activetech.zyyhospital.service;

import java.util.List;

import activetech.base.pojo.dto.ActiveUser;
import activetech.zyyhospital.pojo.dto.HspCerebralCourseCustom;
import activetech.zyyhospital.pojo.dto.HspCerebralQueryDto;

public interface HspCerebralService {
	/**
	 * 提交溶栓记录
	 * @param hspCerebralQueryDto
	 * @param activeUser
	 * @throws Exception
	 */
	public void submitCerebralCourse(HspCerebralQueryDto hspCerebralQueryDto,ActiveUser activeUser)throws Exception;
	
	/**
	 * 删除溶栓记录
	 * @param activeUser
	 * @throws Exception
	 */
	public void delCerebralCourse(String cerebralCourseSeq)throws Exception;
	
	/**
	 * 获取溶栓记录
	 * @param hspCerebralCourseCustom
	 * @return
	 * @throws Exception
	 */
	public HspCerebralQueryDto findCerebralCourseById(String cerebralCourseSeq)throws Exception;
	
	/**
	 * @param hspCerebralQueryDto
	 * @return
	 * @throws Exception
	 */
	public int getCerebralCourseCountByEmgSeq(HspCerebralQueryDto hspCerebralQueryDto)throws Exception;
	
	/**
	 * 脑梗溶栓列表获取
	 * @param hspCerebralQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<HspCerebralCourseCustom> findCerebralCourseListByEmgSeq(HspCerebralQueryDto hspCerebralQueryDto) throws Exception;
	
	public HspCerebralCourseCustom findCerebralCourseByEmgSeq(String emgSeq) throws Exception;


}
