package activetech.websocket.task;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import activetech.base.pojo.dto.HighChartsDemoCustom;
import activetech.base.pojo.dto.HighChartsDemoCustomDto;
import activetech.basehis.service.OracleHisService;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.hospital.service.HspreportService;
import activetech.websocket.action.WebSocketBigScreen;

@Component
public class BigScreenTask {
//	@Autowired
//	private WebSocketBigScreen webSocketBigScreen;
//	@Autowired
//	private OracleHisService oracleHisService;
//	@Autowired
//	private HspreportService hspreportService;
//	
////    @Scheduled(cron = "0 0/1 * * * ?")
//    public void taskBigScreenData() throws Exception {
//    	if(WebSocketBigScreen.getAwaiting().size() < 1){
//    		return;
//    	}
//		HspemginfQueryDto hspemginfQueryDto = new HspemginfQueryDto();
//		hspemginfQueryDto.setEnddate(new Date());
//		hspemginfQueryDto.setStartdate(new Date());
//		hspemginfQueryDto.setQuerytype("day");
//		//今日各级患者比例
//		List<HighChartsDemoCustom> gjhzblList=hspreportService.getHighChartsEmg(hspemginfQueryDto);
//		HighChartsDemoCustomDto highChartsDemoCustomDto = new HighChartsDemoCustomDto();
//		highChartsDemoCustomDto.setStarttime(hspemginfQueryDto.getStartdate());
//		highChartsDemoCustomDto.setEndtime(hspemginfQueryDto.getEnddate());
//		highChartsDemoCustomDto.setQuerytype(hspemginfQueryDto.getQuerytype());
//		for (int i=0;i<gjhzblList.size();i++) {
//			highChartsDemoCustomDto.setHighChartsDemoCustom(new HighChartsDemoCustom(gjhzblList.get(i).getName()));
//			List<HighChartsDemoCustom> gjhzblnlList=hspreportService.getHighChartsEmgAgeGroup(highChartsDemoCustomDto);
//			gjhzblList.get(i).setAgeGroup(gjhzblnlList);
//		}
//		//今日就诊科室
//		List<HspemginfCustom> jrjzksList = hspreportService.findGkhzjztjList(hspemginfQueryDto);
//		//月急诊统计
//		Map<String,Object> yjztjMap = hspreportService.findDrhzrsZyy();
//		hspemginfQueryDto.setTimetype("1");
//		HspemginfCustom hspemginfCustom = new HspemginfCustom();
//		hspemginfQueryDto.setHspemginfCustom(hspemginfCustom);
//		//今日就诊年龄性别统计
//		List<HspemginfCustom> jznlxbList = hspreportService.findAgeAndSexTjList(hspemginfQueryDto);
//		//24小时就诊分布图
//		List<HspemginfCustom> jzfbt24List = hspreportService.findVisDatList(hspemginfQueryDto);
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("gjhzblList", gjhzblList);
//		map.put("jrjzksList",jrjzksList);
//		map.put("yjztjMap",yjztjMap);
//		map.put("jzfbt24List",jzfbt24List);
//		map.put("jznlxbList",jznlxbList);
//		webSocketBigScreen.sendMessageToAllAwaiting(map);
//    }
	
}