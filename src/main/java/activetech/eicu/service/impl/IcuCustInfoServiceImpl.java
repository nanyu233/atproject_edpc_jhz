package activetech.eicu.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.service.SystemConfigService;
import activetech.basehis.service.SqlServerHisService;
import activetech.eicu.dao.mapper.IcuVsDefMapper;
import activetech.eicu.pojo.domain.IcuGradeTotal;
import activetech.eicu.pojo.domain.IcuVsDef;
import activetech.eicu.pojo.domain.IcuVsDefExample;
import activetech.eicu.pojo.domain.IcuVsDefExample.Criteria;
import activetech.eicu.pojo.dto.IcuCustInfoCustom;
import activetech.eicu.pojo.dto.IcuCustInfoQueryDto;
import activetech.eicu.pojo.dto.IcuGradeTotalCustom;
import activetech.eicu.pojo.dto.IcuScoreQueryDto;
import activetech.eicu.pojo.dto.IcuVitlIoQueryDto;
import activetech.eicu.pojo.dto.IcuVsInfoCustom;
import activetech.eicu.service.IcuCustInfoService;
import activetech.eicu.service.IcuScoreService;
import activetech.external.pojo.dto.HspJyjgCustom;
import activetech.external.pojo.dto.HspJyjgQueryDto;
import activetech.external.pojo.dto.VHemsJcjgCustom;
import activetech.external.pojo.dto.VHemsJyjgQueryDto;
import activetech.external.service.HspJyjgService;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.zyyhospital.dao.mapper.HspHljldInfCustomMapper;
import activetech.zyyhospital.pojo.dto.HspDocadviceInfCustom;
import activetech.zyyhospital.pojo.dto.HspHljldInfCustom;
import activetech.zyyhospital.pojo.dto.HspHljldInfQueryDto;
import activetech.zyyhospital.service.ZyyHspemginfService;
import activetech.zyyhospital.service.ZyyLqblService;
/**
 * ICU患者信息ServiceImpl
 * <p>Title: IcuCustInfoServiceImpl.java IcuCustInfoServiceImpl</p>
 * <p>Description: </p>
 * <p>Company: activetech</p>
 * @author 
 * @date 2019年2月21日 上午9:45:32
 *
 */
public class IcuCustInfoServiceImpl implements IcuCustInfoService{
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private IcuVsDefMapper icuVsDefMapper;
	@Autowired
	private HspHljldInfCustomMapper hspHljldInfCustomMapper;
	@Autowired
	private IcuScoreService icuScoreService;
	@Autowired
	private ZyyLqblService zyyLqblService;
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
	
	//@Autowired
	//private HuzHisService huzHisService; //实际使用
	
	//@Autowired
	//private HisJcrwCustomMapper hisJcrwCustomMapper; //本地测试使用
	
	@Autowired
	private HspJyjgService hspJyjgService;//本地测试使用
	
	@Autowired
	private SqlServerHisService sqlServerHisService;
	
	@Override
	public Map<String, Object> getOverviewInfo(IcuCustInfoQueryDto icuCustInfoQueryDto) throws Exception {
		//当前日期  //上一天日期  体征、出入量用于获取当前时间前24小时相关数据(默认24小时，可由前端传入时间区间)
		Date endDate = new Date();
		Date startDate = DateUtil.getPrevDay(endDate);
		if(StringUtils.isNotNullAndEmptyByTrim(icuCustInfoQueryDto.getEndDate())&&StringUtils.isNotNullAndEmptyByTrim(icuCustInfoQueryDto.getStartDate())){
			 endDate = icuCustInfoQueryDto.getEndDate(); 
			 startDate = icuCustInfoQueryDto.getStartDate();  
		}    
		//获取当前日期yyyy/MM/dd
		String curDateStr = DateUtil.formatDateByFormat(endDate, "yyyy/MM/dd");
		
		String liveNo = icuCustInfoQueryDto.getLiveNo();
		
		//24小时每个时间点最近一条体征、出入量数据
		HspHljldInfQueryDto hsphljldinfQueryDto = new HspHljldInfQueryDto();
		hsphljldinfQueryDto.setStartdate(startDate);
		hsphljldinfQueryDto.setEnddate(endDate);
		hsphljldinfQueryDto.setInterval(icuCustInfoQueryDto.getIntervalIo());
		HspHljldInfCustom hljldInfCustom = new HspHljldInfCustom();
		hljldInfCustom.setEmgSeq(liveNo);
		hsphljldinfQueryDto.setHsphljldinfCustom(hljldInfCustom);
		
		//24小时出入量平衡区间合计数据
		List<HspHljldInfCustom> ioList = hspHljldInfCustomMapper.queryIntervalInfo(hsphljldinfQueryDto);
		//血气分析
		//List<IcuVsInfoCustom> bgList = icuVsInfoCustomMapper.queryLatestBgInfo(icuVitlIoQueryDto);
		
		//获取体征相关数据 含三个对象	//定义展示数据  //时间坐标点 //时间点对应的相关定义数据map
		hsphljldinfQueryDto.setInterval(icuCustInfoQueryDto.getInterval());
		Map<String, Object> vitlMap = queryVitlChartInfo(hsphljldinfQueryDto);
		//图标查询时间区间    传递前端用于首页体征图标x轴最大最小值  
		vitlMap.put("minDate", startDate.getTime());
		vitlMap.put("maxDate", endDate.getTime());
		
		//totalScoMap
		IcuScoreQueryDto icuScoreQueryDto = new IcuScoreQueryDto();
		icuScoreQueryDto.setStartDate(startDate);
		icuScoreQueryDto.setEndDate(endDate);
		icuScoreQueryDto.setLiveNo(liveNo);
		Map<String, Object> totalScoMap = queryTotalScoChartInfo(icuScoreQueryDto);
		totalScoMap.put("minDate", startDate.getTime());
		totalScoMap.put("maxDate", endDate.getTime());		
		
		//医嘱、检查、检验
		VHemsJyjgQueryDto vHemsJyjgQueryDto = new VHemsJyjgQueryDto();
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(liveNo);
		//医嘱
		//List<IcuInspRsltCustom> inspList = icuInspInfoCustomMapper.queryFavInfoList(icuInspInfoQueryDto);
		HspDocadviceInfCustom hspDocadviceInfCustom = new HspDocadviceInfCustom();
		hspDocadviceInfCustom.setStartdate(startDate);
		hspDocadviceInfCustom.setEnddate(DateUtil.getNextDay(endDate));
		if(hspemginfCustom!=null){
			hspDocadviceInfCustom.setVstCad(hspemginfCustom.getVstCad());
		}

		vHemsJyjgQueryDto.setHspDocadviceInfCustom(hspDocadviceInfCustom);		
		List<HspDocadviceInfCustom> daExecList = new ArrayList<>();
				//zyyLqblService.findvhemsypxxinfoanddocadviceList(vHemsJyjgQueryDto);	
		//检查检验实体类
		//检验指标 
		//List<IcuInspRsltCustom> inspList = icuInspInfoCustomMapper.queryFavInfoList(icuInspInfoQueryDto);
		HspJyjgQueryDto hspJyjgQueryDto = new HspJyjgQueryDto();
		HspJyjgCustom hspJyjgCustom = new HspJyjgCustom();
		hspJyjgCustom.setMark("1");//1-已收藏  0或空-为收藏
		//hspJyjgCustom.setStartdate(startDate);
		//hspJyjgCustom.setEnddate(endDate);
		hspJyjgQueryDto.setHspJyjgCustom(hspJyjgCustom);
		List<HspJyjgCustom> inspList = hspJyjgService.findhspjyjginfoListajax(hspJyjgQueryDto);
		//检查报告
		
	    
		List<VHemsJcjgCustom> examList = new ArrayList<>();
				//hisJcrwCustomMapper.findHisJcrwList(vHemsJyjgQueryDto);//本地测试使用
		// List<HisJcrwCustom> examList = huzHisService.findHisJcrwList(vHemsJyjgQueryDto);
		
		
		List<IcuCustInfoCustom> list= new ArrayList<>();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("vitlMap", vitlMap);//生命体征
		map.put("totalScoMap", totalScoMap);//评分总览
		map.put("ioList", ioList);//出入量
		map.put("daExecList", daExecList);//医嘱
		map.put("inspList",inspList);
		map.put("bgList", list);
		map.put("examList", examList);
		return map;
	}
	
	public Map<String, Object> queryVitlChartInfo(HspHljldInfQueryDto hsphljldinfQueryDto) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		IcuVsDefExample example = new IcuVsDefExample();
		Criteria criteria = example.createCriteria();
		criteria.andVsTypeEqualTo("VS");
		criteria.andCustShowEqualTo("1");
		example.setOrderByClause("vs_sort asc");
		List<IcuVsDef> defList = icuVsDefMapper.selectByExample(example);
		Map<String, IcuVsDef> defMap = new HashMap<String, IcuVsDef>();
		for (IcuVsDef vsDef : defList) {
			defMap.put(vsDef.getVsCode(), vsDef);
		}				
		
		List<HspHljldInfCustom> list = hspHljldInfCustomMapper.getHljldVitlListByemgseq(hsphljldinfQueryDto);
		
		Map<String,Map<String,IcuVsInfoCustom>> dateMap = new HashMap<String,Map<String,IcuVsInfoCustom>>();
		Set<Long> dateSet = new HashSet<Long>();
		IcuVsInfoCustom vsInfo;
		for (HspHljldInfCustom hlInfo : list) {
			if(StringUtils.isNotNullAndEmptyByTrim(hlInfo.getTmpNbr()+"")){
				dateSet.add(hlInfo.getCrtDat().getTime());
				vsInfo = getBySetVsInfo(hlInfo,hlInfo.getTmpNbr()+"","BT","体温","℃");
				dateMap = getBySetDateMap(dateMap,vsInfo);	
			} 
			if(StringUtils.isNotNullAndEmptyByTrim(hlInfo.getSbpUpNbr()+"")){
				dateSet.add(hlInfo.getCrtDat().getTime());
				vsInfo = getBySetVsInfo(hlInfo,hlInfo.getSbpUpNbr()+"","SBP","收缩压","mmHg");
				dateMap = getBySetDateMap(dateMap,vsInfo);
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hlInfo.getSbpDownNbr()+"")){
				dateSet.add(hlInfo.getCrtDat().getTime());
				vsInfo = getBySetVsInfo(hlInfo,hlInfo.getSbpDownNbr()+"","DBP","舒张压","mmHg");
				dateMap = getBySetDateMap(dateMap,vsInfo);	
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hlInfo.getBreNbr()+"")){
				dateSet.add(hlInfo.getCrtDat().getTime());
				vsInfo = getBySetVsInfo(hlInfo,hlInfo.getBreNbr()+"","RR","呼吸","次/分");
				dateMap = getBySetDateMap(dateMap,vsInfo);	
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hlInfo.getHrtRte()+"")){
				dateSet.add(hlInfo.getCrtDat().getTime());
				vsInfo = getBySetVsInfo(hlInfo,hlInfo.getHrtRte()+"","HR","心率","次/分");
				dateMap = getBySetDateMap(dateMap,vsInfo);
			} 
			if(StringUtils.isNotNullAndEmptyByTrim(hlInfo.getXy()+"")){
				dateSet.add(hlInfo.getCrtDat().getTime());
				vsInfo = getBySetVsInfo(hlInfo,hlInfo.getXy()+"","SPO2","血氧","%");
				dateMap = getBySetDateMap(dateMap,vsInfo);
			}/*else if(StringUtils.isNotNullAndEmptyByTrim(hlInfo.getXt()+"")){
				vsInfo.setVsCode("XT");
				vsInfo.setVsRslt(hlInfo.getXt()+"");
			}*/
			
				
		}
		
		List<Long> dateList = new ArrayList<Long>(dateSet);
		Collections.sort(dateList);
		//定义展示数据
		result.put("defMap", defMap);
		//时间坐标点
		result.put("dateList", dateList);
		//时间点对应的相关定义数据map
		result.put("dateMap", dateMap);
		return result;
	}
	
	@Override
	public Map<String, Object> queryVitlChartInfo(IcuVitlIoQueryDto icuVitlIoQueryDto) throws Exception{
		if(StringUtils.isNotNullAndEmptyByTrim(icuVitlIoQueryDto.getLiveNo())){
			HspHljldInfQueryDto hsphljldinfQueryDto = new HspHljldInfQueryDto();
			hsphljldinfQueryDto.setStartdate(icuVitlIoQueryDto.getStartDate());
			hsphljldinfQueryDto.setEnddate(icuVitlIoQueryDto.getEndDate());
			HspHljldInfCustom hljldInfCustom = new HspHljldInfCustom();
			hljldInfCustom.setEmgSeq(icuVitlIoQueryDto.getLiveNo());
			hsphljldinfQueryDto.setHsphljldinfCustom(hljldInfCustom);
			Map<String, Object> vitlMap = queryVitlChartInfo(hsphljldinfQueryDto);
			return vitlMap;
		}				
		return null;
	}
	
	private IcuVsInfoCustom getBySetVsInfo(HspHljldInfCustom hlInfo,String rslt,String vsCode,String vsName,String vsUnit){
		IcuVsInfoCustom vsInfo = new IcuVsInfoCustom();
		vsInfo.setVsDate(hlInfo.getCrtDat());
		vsInfo.setVsDateStr(hlInfo.getCrtDateStr());
		vsInfo.setVsRslt(rslt);
		vsInfo.setVsCode(vsCode);
		vsInfo.setVsName(vsName);
		vsInfo.setVsUnit(vsUnit);
		return vsInfo;
	}
	
	private Map<String,Map<String,IcuVsInfoCustom>> getBySetDateMap(Map<String,Map<String,IcuVsInfoCustom>> map,IcuVsInfoCustom vsInfo){
		if(!map.containsKey(String.valueOf(vsInfo.getVsDate().getTime()))) {
			Map<String,IcuVsInfoCustom> temp = new HashMap<String,IcuVsInfoCustom>();
			map.put(String.valueOf(vsInfo.getVsDate().getTime()), temp);
		}
		map.get(String.valueOf(vsInfo.getVsDate().getTime())).put(vsInfo.getVsCode(), vsInfo);	
		return map;
	}

	@Override
	public Map<String, Object> queryTotalScoChartInfo(IcuScoreQueryDto icuScoreQueryDto) throws Exception {
		Map<String, Object> totalScoMap = new HashMap<String, Object>();
		List<IcuGradeTotalCustom> icuGradeTotals = icuScoreService.getIcuGradeTotalByLiveNo(icuScoreQueryDto);
		
		Set<Long> dateSet = new HashSet<Long>();
		Map<String,List<IcuGradeTotal>> dataMap = new HashMap<String, List<IcuGradeTotal>>();
		for(IcuGradeTotal gradeTotal:icuGradeTotals){
			dateSet.add(gradeTotal.getCrtTime().getTime());
			if(dataMap.containsKey(gradeTotal.getGradeType())){
				List<IcuGradeTotal> tempList = dataMap.get(gradeTotal.getGradeType());
				tempList.add(gradeTotal);
				dataMap.put(gradeTotal.getGradeType(), tempList);
			}else{
				List<IcuGradeTotal> tempList = new ArrayList<IcuGradeTotal>();
				tempList.add(gradeTotal);
				dataMap.put(gradeTotal.getGradeType(), tempList);
			}
		}
		
		List<Long> dateList = new ArrayList<Long>(dateSet);
		Collections.sort(dateList);
		totalScoMap.put("dateList", dateList);
		totalScoMap.put("dateMap", dataMap);
		
		return totalScoMap;
	}

	@Override
	public List<HspHljldInfCustom> queryIoChartInfo(IcuVitlIoQueryDto icuVitlIoQueryDto) throws Exception {
		HspHljldInfQueryDto hsphljldinfQueryDto = new HspHljldInfQueryDto();
		hsphljldinfQueryDto.setStartdate(icuVitlIoQueryDto.getStartDate());
		hsphljldinfQueryDto.setEnddate(icuVitlIoQueryDto.getEndDate());
		hsphljldinfQueryDto.setInterval(icuVitlIoQueryDto.getInterval());
		HspHljldInfCustom hljldInfCustom = new HspHljldInfCustom();
		hljldInfCustom.setEmgSeq(icuVitlIoQueryDto.getLiveNo());
		hsphljldinfQueryDto.setHsphljldinfCustom(hljldInfCustom);
		return hspHljldInfCustomMapper.queryIntervalInfo(hsphljldinfQueryDto);
	}
	
}
