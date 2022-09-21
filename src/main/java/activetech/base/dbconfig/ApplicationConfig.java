package activetech.base.dbconfig;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.domain.Dstappoption;
import activetech.base.service.AppoptionService;

public class ApplicationConfig implements InitializingBean{
	
	private final static Logger logger = LoggerFactory.getLogger(ApplicationConfig.class);
	
	@Autowired
	private AppoptionService appoptionService;
	
	private static Map<String,String> config;
	
	public static Map<String, String> getConfig() {
		return config;
	}


	public static void setConfig(Map<String, String> config) {
		ApplicationConfig.config = config;
	}


	static{
		config = new HashMap<>();
	}
	

	@Override
	public void afterPropertiesSet() throws Exception {
		List<Dstappoption> list = appoptionService.findAppoptionList();
		
		for(Dstappoption dstappoption:list){
			config.put(dstappoption.getOptkey(), dstappoption.getOptvalue());
		}
		
		logger.info("缓存为"+config);
		
	}
}
