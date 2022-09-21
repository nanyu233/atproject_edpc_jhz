package activetech.zyyhospital.service;

import java.util.List;
import java.util.Map;

import activetech.base.pojo.dto.ActiveUser;
import activetech.zyyhospital.pojo.domain.HspQtsjgl;
import activetech.zyyhospital.pojo.dto.HspQtsjglCustom;
import activetech.zyyhospital.pojo.dto.HspQtsjglQueryDto;


/**
 * 群体事件表
 * @author Administrator
 *
 */
public interface HspQtsjglService {
	
	public int findHspCbyxglCount(HspQtsjglQueryDto hspQtsjglQueryDto) throws Exception;
	
	public List<HspQtsjglCustom> findHspQtsjglList(HspQtsjglQueryDto hspQtsjglQueryDto) throws Exception;
	
	public  Map<String,Object> addHspQtsjgl(HspQtsjglQueryDto hspQtsjglQueryDto,ActiveUser activeUser) throws Exception;
	
	public HspQtsjgl findById(HspQtsjglQueryDto hspQtsjglQueryDto) throws Exception;
	
	public void updateHspQtsjgl(HspQtsjglQueryDto hspQtsjglQueryDto) throws Exception;
	
	public void deleteHspQtsjgl(String id) throws Exception;
	
	public HspQtsjglCustom updateEmgQtsj(HspQtsjglQueryDto hspQtsjglQueryDto) throws Exception;
	
	public HspQtsjglCustom updateEmgQtsjjb(HspQtsjglQueryDto hspQtsjglQueryDto) throws Exception;
}
