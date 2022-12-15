package activetech.base.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import activetech.base.pojo.domain.Dstappoption;
import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.dto.DstdictinfoQueryDto;
import activetech.base.process.result.ResultInfo;

/**
 * 
 * <p>Title:SystemConfigService</p>
 * <p>Description:系统级别Service</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2016-12-29 下午4:15:11
 * 
 */
public interface SystemConfigService {
	/**
	 * 根据typecode获取数据字典的信息
	 * @param：编码类型
	 * @return：编码类型对应数据字典信息
	 */
	public List findDictinfoByType(String typecode) throws Exception;
	
	/**
	 * 根据数据字典中的typecode，和infocode获取一条信息
	 * @param：编码类型，子编码
	 * @return：子编码对应单条信息
	 */
	public Dstdictinfo  findDictinfoByInfocode(String typecode,String infocode) throws Exception;
	
	/**
	 * 根据系统参数id获取系统参数表信息
	 * @param：参数值
	 * @return：参数信息
	 */
	public Dstappoption findAppoptionByOptkey(String optkey)throws Exception;

	/**
	 * 获取集合包含字符串的字典信息
	 * @param：types
	 * @return：List<Dstdictinfo>
	 */
	public List<Dstdictinfo> findDstdictinfos(List<String> types) throws Exception;

	/**
	 * 获取数据字典的内含
	 * @param：dstdictinfo
	 * @return：List<Dstdictinfo>
	 */
	public List<Dstdictinfo> findDictinfoSub(DstdictinfoQueryDto dstdictinfoQueryDto);
	
	 /**
	  * 查询sequences 公用方法
	  * @param Sequnences
	  * @return
	  */
	 public String findSequences(String Sequences,String weishu,String Date);

	 /**
	  * 查询多个数据字典数据公用方法
	  * @param params <数据字典名称，传给map的key值>
	  * @return
	  */
	public Map<String, List<Dstdictinfo>> findDstdictinfos(Map<String, String> params) throws Exception;

	/**
	 * 获取密码规则
	 * @return
	 */
	public ResultInfo getPasswordRule() throws IOException;

	/**
	 * 钉钉获取accessToken
	 * @return return
	 * @throws Exception Exception
	 */
	String queryDingAccessToken(String appKey) throws Exception;

	/**
	 * 钉钉保存accessToken
	 * @param appKey appKey
	 * @param accessToken accessToken
	 * @throws Exception Exception
	 */
	void saveDingAccessToken(String appKey, String accessToken) throws Exception;
}
