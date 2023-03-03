package activetech.websocket.task;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import activetech.basehis.pojo.domain.VHemsJyjg;
import activetech.edpc.pojo.domain.VHemsJyjgs;
import activetech.edpc.service.SysIntergratingService;
import activetech.util.HttpClientUtil;

@Component
public class JyJcTask {

	@Autowired
	private SysIntergratingService sysIntergratingService;

	public static String getUrl(){
		 
		ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		 
		HttpServletRequest request = requestAttributes.getRequest();
		 
		String localAddr = request.getLocalAddr();
		 
		int serverPort = request.getServerPort();
		 
		return "http://"+localAddr +":"+ serverPort;
	 
	}
	
	
//    @Scheduled(cron = "0 */1 * * * ?")
    public void jyjgTask() throws Exception {
    	System.out.println("--------------jyjg检验定时任务开始---------------");
    	List<VHemsJyjg> jyjglist = null;

				// oracleHisService.findRecentJyjg();
    	List<activetech.external.pojo.domain.VHemsJyjg> vHemsJyjgs = 
    			new ArrayList<activetech.external.pojo.domain.VHemsJyjg>();
    	String samStr = "|";
    	for (VHemsJyjg vHemsJyjg : jyjglist) {
    		activetech.external.pojo.domain.VHemsJyjg jyjg = new activetech.external.pojo.domain.VHemsJyjg();
    		jyjg.setMpi(vHemsJyjg.getPatientId());
    		jyjg.setName(vHemsJyjg.getName());
    		jyjg.setSampleno(vHemsJyjg.getSampleno());
    		jyjg.setResult(vHemsJyjg.getResult());
    		jyjg.setResultDateTime(vHemsJyjg.getResultDateTime());
    		jyjg.setUpperLimit(vHemsJyjg.getUpperLimit());
    		jyjg.setLowerLimit(vHemsJyjg.getLowerLimit());
    		jyjg.setReportItemName(vHemsJyjg.getReportItemName());
    		jyjg.setUnits(vHemsJyjg.getUnits());
    		jyjg.setExaminaim(vHemsJyjg.getExaminaim());
    		jyjg.setErrorFlag(vHemsJyjg.getHint());
    		jyjg.setExamineDocName(vHemsJyjg.getShr());	
    		jyjg.setJyjgId(UUID.randomUUID().toString());
    		try {
    			sysIntergratingService.vHemsJyjgInsert(jyjg);
			} catch (Exception e) {
				// TODO: handle exception
			}
    		if(samStr.indexOf(jyjg.getSampleno())<=0){
    			samStr = samStr + "|" + jyjg.getSampleno();
    			vHemsJyjgs.add(jyjg);
    		}
		}
    	
    	String vHemsJyjgsStr = "{\"jyjgList\":"+ JSON.toJSONString(vHemsJyjgs)+"}";
//    	System.out.println(vHemsJyjgsStr);
    	HttpClientUtil.doPostJson("http://localhost:8100/emis/sysIntergrating/receiveVHemsJyjg.do", vHemsJyjgsStr);
    	
    }
    
    public static void main(String[] args) {
		String a = "{jyjgList:[{'errorFlag':'','examinaim':'肿瘤标志物（9项男)','examineDocName':'吴向民','jyjgId':'c2a9ff9b-2519-4438-b44f-ff3b6b277daa','lowerLimit':'0.00','mpi':'2103210138','name':'丁方红','reportItemName':'甲胎蛋白（AFP）','result':'4.01','resultDateTime':1616739507000,'sampleno':'20210326ATT0103','units':'ng/ml','upperLimit':'10.0'},{'errorFlag':'','examinaim':'肿瘤标志物全套（女12项）','examineDocName':'吴向民','jyjgId':'8175a16b-f696-4546-ace0-d4c1064040dd','lowerLimit':'0.0','mpi':'00151698','name':'陈琴芝','reportItemName':'糖类抗原125（CA125）','result':'9.0','resultDateTime':1616739465000,'sampleno':'20210326ATT0019','units':'U/mL','upperLimit':'35.0'}]}";
		VHemsJyjgs v = JSONObject.parseObject(a,VHemsJyjgs.class);
//		VHemsJyjgs v = (VHemsJyjgs) JSON.parse(a);
		System.out.println(v);
	}
    
    
    
}