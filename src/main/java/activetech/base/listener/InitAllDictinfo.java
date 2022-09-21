package activetech.base.listener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import activetech.base.dao.mapper.DstdictinfoCustomMapper;
import activetech.base.dao.mapper.RedisMapper;
import activetech.base.pojo.domain.Dstappoption;
import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.service.SpringContextUtil;
import activetech.base.service.SystemConfigService;
/**
 * tomcat启动完成前执行
 */
public class InitAllDictinfo{

	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private DstdictinfoCustomMapper dstdictinfoCustomMapper;
	@Autowired  
	private SpringContextUtil springContextUtil;  
	@Value("${REDIS_DICTINF_KEY}")
	public String REDIS_DICTINF_KEY;
	
	/*若要tomcat启动把数据字典放缓存，则需要打开这个注释 @PostConstruct*/
    public void init() {
		//如果有配置缓存 则默认将数据放入Redis缓存
		try {
			Dstappoption dstappoption = systemConfigService.findAppoptionByOptkey("CACHE");
			if(dstappoption != null && "1".equals(dstappoption.getOptvalue())){
		    	Map<String, Object> mapValue = new HashMap<String, Object>(80);
		    	List<Dstdictinfo> dstdictinfos = dstdictinfoCustomMapper.findAllDictinfo();
		    	for (Dstdictinfo dstdictinfo : dstdictinfos) {
		    		Object value = mapValue.get(dstdictinfo.getTypecode());
		    		if(null == value){
		    			List<Dstdictinfo> valueList = new ArrayList<Dstdictinfo>();
		    			valueList.add(dstdictinfo);
		    			mapValue.put(dstdictinfo.getTypecode(), valueList);
		    		}else{
		    			((List<Dstdictinfo>) value).add(dstdictinfo);
		    		}
				}
				RedisMapper redisMapper = (RedisMapper) springContextUtil.getApplicationContext().getBean("redisMapper");  
				redisMapper.hmsetJson(REDIS_DICTINF_KEY, mapValue, 25920000);	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}


    }  
}
