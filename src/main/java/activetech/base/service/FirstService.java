package activetech.base.service;

import org.springframework.ui.Model;

import activetech.base.pojo.dto.ActiveUser;
import activetech.hospital.pojo.dto.HspemginfCustom;

/**
 * 
 * <p>Title:首页公用Service</p>
 * <p>Description:</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2017-11-13 下午1:30:18
 *
 */
public interface FirstService {
	/**
	 * 跳转首页数据处理
	 * @param activeUser
	 * @return
	 */
	public Model first(Model model,ActiveUser activeUser) throws Exception;
	
	/**
	 * 首页数据获取
	 * @return
	 */
	public void indexmng(Model model) throws Exception;
	
	
	/**
	 * HIS内嵌病历 跳转首页数据处理
	 * @param activeUser
	 * @param type 类型
	 * @return
	 */
	public Model firstHis(Model model,ActiveUser activeUser,HspemginfCustom hspemginfCustom,String type) throws Exception;
}
