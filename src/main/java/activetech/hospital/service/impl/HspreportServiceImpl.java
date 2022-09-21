package activetech.hospital.service.impl;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.domain.Series;
import activetech.base.pojo.dto.HighChartsDemoCustom;
import activetech.base.pojo.dto.HighChartsDemoCustomDto;
import activetech.base.process.result.HighChartsInfo;
import activetech.zyyhospital.pojo.dto.HspJjbglInfQueryDto;
import activetech.hospital.dao.mapper.HspMewsInfCustomMapper;
import activetech.hospital.dao.mapper.HspemginfCustomMapper;
import activetech.hospital.dao.mapper.HspsqlinfCustomMapper;
import activetech.hospital.pojo.dto.HighChartsReportCustom;
import activetech.zyyhospital.pojo.dto.HspBchzhzReportCustom;
import activetech.hospital.pojo.dto.HspBrbzCustom;
import activetech.hospital.pojo.dto.HspBrbzQueryDto;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.hospital.pojo.dto.HspmewsinfCustom;
import activetech.hospital.pojo.dto.HspsqlinfCustom;
import activetech.hospital.pojo.dto.HspsqlinfQueryDto;
import activetech.hospital.service.HspreportService;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.zyyhospital.dao.mapper.HspConsultationRecordsCustomMapper;
import activetech.zyyhospital.dao.mapper.HspJjbglInfCustomMapper;
import activetech.zyyhospital.dao.mapper.ZyyHspemginfCustomMapper;
import activetech.zyyhospital.pojo.dto.HspConsultationRecordsCustom;
import activetech.zyyhospital.pojo.dto.HspConsultationRecordsQueryDto;

public class HspreportServiceImpl implements HspreportService {
	@Autowired
	private HspemginfCustomMapper hspemginfCustomMapper;
	@Autowired
	private HspsqlinfCustomMapper hspsqlinfCustomMapper;
	@Autowired
	private HspConsultationRecordsCustomMapper hspConsultationRecordsCustomMapper;
	@Autowired
	private ZyyHspemginfCustomMapper zyyHspemginfCustomMapper;
	@Autowired
	private HspMewsInfCustomMapper hspMewsInfCustomMapper;
	@Autowired
	private HspJjbglInfCustomMapper hspJjbglInfCustomMapper;
	/**
	 * 获取急诊患者趋势
	 */
	public HighChartsInfo getHighChartsUser(HighChartsDemoCustomDto highChartsDemoCustomDto) throws Exception {
		//获取linux上的日期
		if(!StringUtils.isNotNullAndEmptyByTrim(highChartsDemoCustomDto.getStarttime())){
			highChartsDemoCustomDto.setEndtime(new Date());
			Date starttime=DateUtil.getPreMonth(new Date());
			highChartsDemoCustomDto.setStarttime(starttime);
		}
		Date endtime = DateUtil.getNextDay(highChartsDemoCustomDto.getEndtime());
		highChartsDemoCustomDto.setEndtime(endtime);
		//首次查询时默认赋值系统当天日期
		List<HighChartsDemoCustom> highChartsDtoList = hspemginfCustomMapper.getHighChartsReportCount(highChartsDemoCustomDto);
		HighChartsInfo highChartsInfo = new HighChartsInfo();
		if(highChartsDtoList!=null&&highChartsDtoList.size()>0){
			String[] xcategories = new String[highChartsDtoList.size()];
			double[] data = new double[highChartsDtoList.size()];
			Series series = new Series();
			for(int i =0 ; i<highChartsDtoList.size() ; i++){
				xcategories[i]=highChartsDtoList.get(i).getName();
				data[i] = (double)highChartsDtoList.get(i).getCount();
			}
			series.setData(data);
			List<Series> seriesList = new ArrayList<Series>();
			seriesList.add(series);
			highChartsInfo.setXcategories(xcategories);
			highChartsInfo.setSeries(seriesList);
			return highChartsInfo;
		}
		return null;
	}
	/**
	 * 获取急诊患者趋势统计
	 */
	@Override
	public List<HighChartsDemoCustom> getHighChartsUserb(HighChartsDemoCustomDto highChartsDemoCustomDto) throws Exception {
		List<HighChartsDemoCustom> highChartsDtoList = hspemginfCustomMapper.getHighChartsReportCount(highChartsDemoCustomDto);
		return highChartsDtoList;	
	}
	/**
	 * 获取急诊患者统计天数
	 */
	@Override
	public int getCountHighChartsUser(HighChartsDemoCustomDto highChartsDemoCustomDto) throws Exception {
		return hspemginfCustomMapper.findCount(highChartsDemoCustomDto);
	}

	
		//end-----------------------------------------------------
		//--------------liu start
	/**
	 * 抢救死亡率查询
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public List<HighChartsDemoCustom> getDeathRate(HspemginfQueryDto hs) throws Exception{
		List<HspemginfCustom> list=hspemginfCustomMapper.findDeathList(hs);
		//初始化报表对象
		List<HighChartsDemoCustom> listHig=new ArrayList<HighChartsDemoCustom>();
		//拼接报表数据
		HighChartsDemoCustom hc=new HighChartsDemoCustom();
		hc.setName("死亡率");
		hc.setCount(list.get(0).getDeathNum());
		listHig.add(hc);
		HighChartsDemoCustom hc1=new HighChartsDemoCustom();
		hc1.setName("存活率");
		hc1.setCount((list.get(0).getAllNum()-list.get(0).getDeathNum()));
		listHig.add(hc1);
		return listHig;
	}
	/**
	 * 根据年月查询死亡率列表
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<HspemginfCustom> findDeathRate(HspemginfQueryDto hspemginfQueryDto)
			throws Exception {
		List<String> zgzt = new ArrayList<String>();
		if(StringUtils.isNotNullAndEmptyByTrim(hspemginfQueryDto.getSwflag())){
			if(hspemginfQueryDto.getSwflag().equals("0")){
				zgzt.add("3");//死亡
			}else{
				zgzt.add("14");//来院已死亡
			}
		}else{
			zgzt.add("3");//死亡
			zgzt.add("14");//来院已死亡
		}
		hspemginfQueryDto.setZgztlist(zgzt);
		List<HspemginfCustom> list=hspemginfCustomMapper.findDeathList(hspemginfQueryDto);
		return list;
	}
	
	
		//--------------end----------------------------------------
	    //--------------chen start
	public List<HighChartsDemoCustom> getHighChartsEmg(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		return hspemginfCustomMapper.getHighChartsEmg(hspemginfQueryDto);
	}
	
	@Override
	public List<HighChartsDemoCustom> getHighChartsEmgAgeGroup(
			HighChartsDemoCustomDto highChartsDemoCustomDto) throws Exception {
		return hspemginfCustomMapper.getHighChartsEmgAgeGroup(highChartsDemoCustomDto);
	}
		//--------end---------------------------------------------
		//--------------li start
	/**
	 * 中位数报表获取数据
	 * @param starttime
	 * @param endtime
	 * @return
	 * @throws Exception
	 */
	public HighChartsInfo getMedian(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		//查询各月份抢救室滞留时间中位数
		List<HspemginfCustom> list = hspemginfCustomMapper.findMedianList(hspemginfQueryDto);
		
		//初始化报表对象
		HighChartsInfo highChartsInfo = new HighChartsInfo();
		if(list!=null&&list.size()>0){
			String[] xcategories = new String[list.size()];
			double[] data = new double[list.size()];
			Series series = new Series();
			for(int i=0 ; i<list.size() ; i++){
				xcategories[i] = list.get(i).getMdate();
				data[i] = (double)list.get(i).getMedian();
			}
			series.setData(data);
			List<Series> seriesList = new ArrayList<Series>();
			seriesList.add(series);
			highChartsInfo.setXcategories(xcategories);
			highChartsInfo.setSeries(seriesList);
			return highChartsInfo;
		}
		return null;
	}
	/**
	 * 中位数列表获取数据
	 * @param starttime
	 * @param endtime
	 * @return
	 * @throws Exception
	 */
	public List<HspemginfCustom> getMedianList(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		//查询各月份抢救室滞留时间中位数
		List<HspemginfCustom> list = hspemginfCustomMapper.findMedianList(hspemginfQueryDto);
		return list;
	}
		//----------------------end--------------------------------
	
	/**
	 * 医患比列表获取数据
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<HspemginfCustom> findpatient(HspemginfQueryDto hspemginfQueryDto) {
		List<HspemginfCustom> list = hspemginfCustomMapper.findpatient(hspemginfQueryDto);
		return list;
	}

	/**
	 * 获取月急诊人数
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public HighChartsInfo getYjzrs(HighChartsDemoCustomDto highChartsDemoCustomDto) {
		List<HighChartsDemoCustom> highChartsDtoList = getYjzrsList(highChartsDemoCustomDto);
		HighChartsInfo highChartsInfo = new HighChartsInfo();
		if(highChartsDtoList!=null&&highChartsDtoList.size()>0){
			String[] xcategories = new String[highChartsDtoList.size()];
			double[] data = new double[highChartsDtoList.size()];
			Series series = new Series();
			for(int i =0 ; i<highChartsDtoList.size() ; i++){
				if(highChartsDtoList.get(i).getCount() == null){
					data[i] = 0;
					xcategories[i]=highChartsDtoList.get(i).getName();
				}else{
					data[i] = (double)highChartsDtoList.get(i).getCount();
					xcategories[i]=highChartsDtoList.get(i).getName();
				}
			}
			series.setData(data);
			List<Series> seriesList = new ArrayList<Series>();
			seriesList.add(series);
			highChartsInfo.setXcategories(xcategories);
			highChartsInfo.setSeries(seriesList);
			return highChartsInfo;
		}
		return null;
	}
	
	public List<HighChartsDemoCustom> getYjzrsList(HighChartsDemoCustomDto highChartsDemoCustomDto) {
		List<HighChartsDemoCustom> highChartsDtoList = hspemginfCustomMapper.getYjzrsCount(highChartsDemoCustomDto);
		return highChartsDtoList;
	}
	/**
	 * 获取月急诊抢救人数
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public HighChartsInfo getYjzqjrs(HighChartsDemoCustomDto highChartsDemoCustomDto) {
		List<HighChartsDemoCustom> highChartsDtoList = getYjzqjrsList(highChartsDemoCustomDto);
		HighChartsInfo highChartsInfo = new HighChartsInfo();
		if(highChartsDtoList!=null&&highChartsDtoList.size()>0){
			String[] xcategories = new String[highChartsDtoList.size()];
			double[] data = new double[highChartsDtoList.size()];
			Series series = new Series();
			for(int i =0 ; i<highChartsDtoList.size() ; i++){
				if(highChartsDtoList.get(i).getCount() == null){
					data[i] = 0;
					xcategories[i]=highChartsDtoList.get(i).getName();
				}else{
					data[i] = (double)highChartsDtoList.get(i).getCount();
					xcategories[i]=highChartsDtoList.get(i).getName();
				}
			}
			series.setData(data);
			List<Series> seriesList = new ArrayList<Series>();
			seriesList.add(series);
			highChartsInfo.setXcategories(xcategories);
			highChartsInfo.setSeries(seriesList);
			return highChartsInfo;
		}
		return null;
	}
	public List<HighChartsDemoCustom> getYjzqjrsList(HighChartsDemoCustomDto highChartsDemoCustomDto) {
		highChartsDemoCustomDto = highChartsDemoCustomDto!=null?highChartsDemoCustomDto:new HighChartsDemoCustomDto();	
		
		//首次查询时默认赋值系统当天日期
				if(highChartsDemoCustomDto.getHighChartsDemoCustom()==null){
					HighChartsDemoCustom highChartsDemoCustom =new HighChartsDemoCustom();
					/*highChartsDemoCustom.setStarttime(starttime);
					highChartsDemoCustom.setEndtime(endtime);*/
					highChartsDemoCustomDto.setHighChartsDemoCustom(highChartsDemoCustom);
				}
			List<HighChartsDemoCustom> highChartsDtoList = hspemginfCustomMapper.getYjzqjrsCount(highChartsDemoCustomDto);
		return highChartsDtoList;
	}
	
	/**
	 * 获取月急诊死亡人数
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public HighChartsInfo getYjzswrs(HighChartsDemoCustomDto highChartsDemoCustomDto) {
		List<HighChartsDemoCustom> highChartsDtoList = getYjzswrsList(highChartsDemoCustomDto);
		HighChartsInfo highChartsInfo = new HighChartsInfo();
		if(highChartsDtoList!=null&&highChartsDtoList.size()>0){
			String[] xcategories = new String[highChartsDtoList.size()];
			double[] data = new double[highChartsDtoList.size()];
			Series series = new Series();
			for(int i =0 ; i<highChartsDtoList.size() ; i++){
				if(highChartsDtoList.get(i).getCount() == null){
					data[i] = 0;
					xcategories[i]=highChartsDtoList.get(i).getName();
				}else{
					data[i] = (double)highChartsDtoList.get(i).getCount();
					xcategories[i]=highChartsDtoList.get(i).getName();
				}
			}
			series.setData(data);
			List<Series> seriesList = new ArrayList<Series>();
			seriesList.add(series);
			highChartsInfo.setXcategories(xcategories);
			highChartsInfo.setSeries(seriesList);
			return highChartsInfo;
		}
		return null;
	}
	public List<HighChartsDemoCustom> getYjzswrsList(HighChartsDemoCustomDto highChartsDemoCustomDto) {
		highChartsDemoCustomDto = highChartsDemoCustomDto!=null?highChartsDemoCustomDto:new HighChartsDemoCustomDto();	
		
		//首次查询时默认赋值系统当天日期
				if(highChartsDemoCustomDto.getHighChartsDemoCustom()==null){
					HighChartsDemoCustom highChartsDemoCustom =new HighChartsDemoCustom();
					/*highChartsDemoCustom.setStarttime(starttime);
					highChartsDemoCustom.setEndtime(endtime);*/
					highChartsDemoCustomDto.setHighChartsDemoCustom(highChartsDemoCustom);
				}
			List<HighChartsDemoCustom> highChartsDtoList = hspemginfCustomMapper.getYjzswrsCount(highChartsDemoCustomDto);
		return highChartsDtoList;
	}
	
	/**
	 * 获取月急诊住院人数
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public HighChartsInfo getYjzzyrs(HighChartsDemoCustomDto highChartsDemoCustomDto) {
		List<HighChartsDemoCustom> highChartsDtoList = getYjzzyrsList(highChartsDemoCustomDto);
		HighChartsInfo highChartsInfo = new HighChartsInfo();
		if(highChartsDtoList!=null&&highChartsDtoList.size()>0){
			String[] xcategories = new String[highChartsDtoList.size()];
			double[] data = new double[highChartsDtoList.size()];
			Series series = new Series();
			for(int i =0 ; i<highChartsDtoList.size() ; i++){
				if(highChartsDtoList.get(i).getCount() == null){
					data[i] = 0;
					xcategories[i]=highChartsDtoList.get(i).getName();
				}else{
					data[i] = (double)highChartsDtoList.get(i).getCount();
					xcategories[i]=highChartsDtoList.get(i).getName();
				}
			}
			series.setData(data);
			List<Series> seriesList = new ArrayList<Series>();
			seriesList.add(series);
			highChartsInfo.setXcategories(xcategories);
			highChartsInfo.setSeries(seriesList);
			return highChartsInfo;
		}
		return null;
	}
	public List<HighChartsDemoCustom> getYjzzyrsList(HighChartsDemoCustomDto highChartsDemoCustomDto) {
		List<HighChartsDemoCustom> highChartsDtoList = hspemginfCustomMapper.getYjzzyrsCount(highChartsDemoCustomDto);
		return highChartsDtoList;
	}
	/**
	 * 获取病人病症
	 * @param HspBrbzQueryDto
	 * @return
	 * @throws Exception
	 */
 
	public List<HspBrbzCustom> getbrbzxgtjt(HspBrbzQueryDto hspBrbzQueryDto) {
		List<HspBrbzCustom> list = hspemginfCustomMapper.getbrbzxgtjt(hspBrbzQueryDto);
		return list;
	}
	@Override
	public List<HspBrbzCustom> getcountbrbzxgtjt(HspBrbzQueryDto hspBrbzQueryDto) {
		List<HspBrbzCustom> list = hspemginfCustomMapper.getcountbrbzxgtjt(hspBrbzQueryDto);
		return list;
	}
	

	@Override
	public List<HspBrbzCustom> getbrbz() {
		List<HspBrbzCustom> list = hspemginfCustomMapper.getbrbz();
		return list;
	}

	@Override
	public List<HspsqlinfCustom> findZjzyrs(HspsqlinfQueryDto hspsqlinfQueryDto) {
		if("year".equals(hspsqlinfQueryDto.getQuerytype())){
			hspsqlinfQueryDto.setEnddate(DateUtil.getNextYear(hspsqlinfQueryDto.getEnddate(), "yyyy"));
			List<HspsqlinfCustom> list= hspsqlinfCustomMapper.findZjzyrsYear(hspsqlinfQueryDto);
			for(HspsqlinfCustom hspsqlinfCustom:list){
				if(!StringUtils.isNotNullAndEmptyByTrim(hspsqlinfCustom.getSqlDepName())){
					hspsqlinfCustom.setSqlDepName("诊间住院");
				}
			}
			return list;
		}else if("month".equals(hspsqlinfQueryDto.getQuerytype())){
			hspsqlinfQueryDto.setEnddate(DateUtil.getNextMonth(hspsqlinfQueryDto.getEnddate()));
			List<HspsqlinfCustom> list= hspsqlinfCustomMapper.findZjzyrsMonth(hspsqlinfQueryDto);
			for(HspsqlinfCustom hspsqlinfCustom:list){
				if(!StringUtils.isNotNullAndEmptyByTrim(hspsqlinfCustom.getSqlDepName())){
					hspsqlinfCustom.setSqlDepName("诊间住院");
				}
			}
			return list;
		}else if("day".equals(hspsqlinfQueryDto.getQuerytype())){
			if(!StringUtils.isNotNullAndEmptyByTrim(hspsqlinfQueryDto.getStartdate())){
				hspsqlinfQueryDto.setStartdate(new Date());
			}
			List<HspsqlinfCustom> list= hspsqlinfCustomMapper.findZjzyrsDay(hspsqlinfQueryDto);
			for(HspsqlinfCustom hspsqlinfCustom:list){
				if(!StringUtils.isNotNullAndEmptyByTrim(hspsqlinfCustom.getSqlDepName())){
					hspsqlinfCustom.setSqlDepName("诊间住院");
				}
			}
			return list;
		}else{
			List<HspsqlinfCustom> list= hspsqlinfCustomMapper.findZjzyrsHalfyear(hspsqlinfQueryDto);
			for(HspsqlinfCustom hspsqlinfCustom:list){
				if(!StringUtils.isNotNullAndEmptyByTrim(hspsqlinfCustom.getSqlDepName())){
					hspsqlinfCustom.setSqlDepName("诊间住院");
				}
			}
			return list;
		}
	}
	
	@Override
	public List<HspsqlinfCustom> findZjzyrsjz(HspsqlinfQueryDto hspsqlinfQueryDto) {
		if("year".equals(hspsqlinfQueryDto.getQuerytype())){
			hspsqlinfQueryDto.setEnddate(DateUtil.getNextYear(hspsqlinfQueryDto.getEnddate(), "yyyy"));
			return hspsqlinfCustomMapper.findZjzyrsYearjz(hspsqlinfQueryDto);
		}else if("month".equals(hspsqlinfQueryDto.getQuerytype())){
			hspsqlinfQueryDto.setEnddate(DateUtil.getNextMonth(hspsqlinfQueryDto.getEnddate()));
			return hspsqlinfCustomMapper.findZjzyrsMonthjz(hspsqlinfQueryDto);
		}else if("halfyear".equals(hspsqlinfQueryDto.getQuerytype())){
			return hspsqlinfCustomMapper.findZjzyrsHalfyearjz(hspsqlinfQueryDto);
		}else{
			return hspsqlinfCustomMapper.findZjzyrsdayjz(hspsqlinfQueryDto);
		}
	}
	@Override
	public Map<String, Object> findJzkgzlResult(HspemginfQueryDto hspemginfQueryDto) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		HspsqlinfQueryDto hspsqlinfQueryDto = new HspsqlinfQueryDto();
		String querytype = hspemginfQueryDto.getQuerytype();
		hspsqlinfQueryDto.setQuerytype(querytype);
		HighChartsReportCustom highChartsReportCustom;
		if("year".equals(querytype) || "month".equals(querytype) || "day".equals(querytype)){
			if("year".equals(querytype)){
				hspemginfQueryDto.setEnddate(DateUtil.getNextYear(hspemginfQueryDto.getEnddate(), "yyyy"));
				hspsqlinfQueryDto.setStartdate(hspemginfQueryDto.getStartdate());
				hspsqlinfQueryDto.setEnddate(hspemginfQueryDto.getEnddate());
			}else if("month".equals(querytype)){
				hspsqlinfQueryDto.setStartdate(hspemginfQueryDto.getStartdate());
				hspemginfQueryDto.setEnddate(DateUtil.getNextMonth(hspemginfQueryDto.getEnddate()));
				hspsqlinfQueryDto.setEnddate(hspemginfQueryDto.getEnddate());
			}else{
				hspsqlinfQueryDto.setStartdate(hspemginfQueryDto.getStartdate());
			}
			 //住院人数的各个急诊科统计数据
			List<HspsqlinfCustom> hspsqlinfCustomZyList = hspsqlinfCustomMapper.findZYQueryCount(hspsqlinfQueryDto);
			//留抢或院内直入的急诊科统计数据
			List<HspsqlinfCustom> hspsqlinfCustomLqList = hspsqlinfCustomMapper.findLQQueryCount(hspsqlinfQueryDto);
			if("day".equals(querytype)){
				highChartsReportCustom =  hspemginfCustomMapper.findAllCountByDay(hspemginfQueryDto);
			}else{
				highChartsReportCustom =  hspemginfCustomMapper.findAllCount(hspemginfQueryDto);
			}
			map.put("highChartsReportCustom", highChartsReportCustom);
			map.put("hspsqlinfCustomZyList", hspsqlinfCustomZyList);
			map.put("hspsqlinfCustomLqList", hspsqlinfCustomLqList);
		}else{
			String halfdate = hspemginfQueryDto.getHalfdate();
			Date startdate = hspemginfQueryDto.getStartdate();
			hspsqlinfQueryDto.setStartdate(startdate);
			hspsqlinfQueryDto.setEnddate(DateUtil.parseDate(halfdate+"/07/01", "yyyy/MM/dd"));
			//住院
			List<HspsqlinfCustom> hspsqlinfCustomZyListS = hspsqlinfCustomMapper.findZYQueryCount(hspsqlinfQueryDto);
			 //留抢
			List<HspsqlinfCustom> hspsqlinfCustomLqListS = hspsqlinfCustomMapper.findLQQueryCount(hspsqlinfQueryDto);
			hspemginfQueryDto.setEnddate(DateUtil.parseDate(halfdate+"/07/01", "yyyy/MM/dd"));
			HighChartsReportCustom highChartsReportCustomS =  hspemginfCustomMapper.findAllCount(hspemginfQueryDto);
			hspsqlinfQueryDto.setStartdate(hspemginfQueryDto.getEnddate());
			hspsqlinfQueryDto.setEnddate(DateUtil.getNextYear(startdate, "yyyy"));
			//住院
			List<HspsqlinfCustom> hspsqlinfCustomZyListX = hspsqlinfCustomMapper.findZYQueryCount(hspsqlinfQueryDto);
			//留抢
			List<HspsqlinfCustom> hspsqlinfCustomLqListX = hspsqlinfCustomMapper.findLQQueryCount(hspsqlinfQueryDto);
			hspemginfQueryDto.setStartdate(hspemginfQueryDto.getEnddate());
			hspemginfQueryDto.setEnddate(DateUtil.getNextYear(startdate, "yyyy"));
			HighChartsReportCustom highChartsReportCustomX =  hspemginfCustomMapper.findAllCount(hspemginfQueryDto);
			map.put("highChartsReportCustomS", highChartsReportCustomS);
			map.put("highChartsReportCustomX", highChartsReportCustomX);
			map.put("hspsqlinfCustomZyListS", hspsqlinfCustomZyListS);
			map.put("hspsqlinfCustomLqListS", hspsqlinfCustomLqListS);
			map.put("hspsqlinfCustomZyListX", hspsqlinfCustomZyListX);
			map.put("hspsqlinfCustomLqListX", hspsqlinfCustomLqListX);
		}
		return map;
	}

	/**
	 * 急诊科住院人数统计 患者明细总数
	 * @param hspemginfQueryDto
	 * @return
	 */
	public int findjzhzmxCount(HspemginfQueryDto hspemginfQueryDto){
		if("month".equals(hspemginfQueryDto.getQuerytype())){
			hspemginfQueryDto.getHspemginfCustom().setStartdate(DateUtil.getMonthFirstDay(hspemginfQueryDto.getHspemginfCustom().getStartdate()));
			hspemginfQueryDto.getHspemginfCustom().setEnddate(DateUtil.getMonthLastDay(hspemginfQueryDto.getHspemginfCustom().getStartdate()));
		}else if("day".equals(hspemginfQueryDto.getQuerytype())){
			hspemginfQueryDto.getHspemginfCustom().setEnddate(hspemginfQueryDto.getHspemginfCustom().getStartdate());
		}
		return hspsqlinfCustomMapper.findjzhzmxCount(hspemginfQueryDto);
	}
	/**
	 * 急诊科住院人数统计 患者明细
	 */
	public List<HspemginfCustom> findjzhzmx(HspemginfQueryDto hspemginfQueryDto){
		if("month".equals(hspemginfQueryDto.getQuerytype())){
			hspemginfQueryDto.getHspemginfCustom().setStartdate(DateUtil.getMonthFirstDay(hspemginfQueryDto.getHspemginfCustom().getStartdate()));
			hspemginfQueryDto.getHspemginfCustom().setEnddate(DateUtil.getMonthLastDay(hspemginfQueryDto.getHspemginfCustom().getStartdate()));
		}else if("day".equals(hspemginfQueryDto.getQuerytype())){
			hspemginfQueryDto.getHspemginfCustom().setEnddate(hspemginfQueryDto.getHspemginfCustom().getStartdate());
		}
		return hspsqlinfCustomMapper.findjzhzmx(hspemginfQueryDto);
	}
	
	@Override
	public List<HspemginfCustom> findGkhzjztjList(HspemginfQueryDto hspemginfQueryDto) {
		String querytype = hspemginfQueryDto.getQuerytype();
		List<HspemginfCustom> hspEmgInfList = null;
		if("year".equals(querytype)){
			Date enddate = hspemginfQueryDto.getEnddate();
			hspemginfQueryDto.setEnddate(DateUtil.getNextYear(enddate, "yyyy"));
			hspEmgInfList = hspemginfCustomMapper.findGkhzjztjListByYear(hspemginfQueryDto);
		}else if("month".equals(querytype)){
			hspEmgInfList = hspemginfCustomMapper.findGkhzjztjListByMonth(hspemginfQueryDto);
		}else if("halfyear".equals(querytype)){
			hspEmgInfList = hspemginfCustomMapper.findGkhzjztjListByHalfyear(hspemginfQueryDto);
		}else{
			if(hspemginfQueryDto.getStartdate() == null){
				hspemginfQueryDto.setStartdate(new Date());
			}
			hspEmgInfList = hspemginfCustomMapper.findGkhzjztjListByDay(hspemginfQueryDto);
		}
		
		return hspEmgInfList;
	}


	/**
	 * 急诊患者诊断数据
	 * @param hspemginfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> findZdjgtj(HspemginfQueryDto hspemginfQueryDto){
		return null;
	}
	
	@Override
	public List<HspemginfQueryDto> findBqhztj(HspemginfQueryDto hspemginfQueryDto) {
		if("year".equals(hspemginfQueryDto.getQuerytype())){
			return hspemginfCustomMapper.findBqhztjYear(hspemginfQueryDto);
		}else if("month".equals(hspemginfQueryDto.getQuerytype())){
			hspemginfQueryDto.setEnddate(DateUtil.getNextMonth(hspemginfQueryDto.getEnddate()));
			return hspemginfCustomMapper.findBqhztjMonth(hspemginfQueryDto);
		}else if("day".equals(hspemginfQueryDto.getQuerytype())){
			return hspemginfCustomMapper.findBqhztjDay(hspemginfQueryDto);
		}else{
			return hspemginfCustomMapper.findBqhztjHalfyear(hspemginfQueryDto);
		}
	}      
	
	/**
	 * 患者明细
	 */
	public List<HspemginfCustom> findBqhztjHzmx(HspemginfQueryDto hspemginfQueryDto){
		if("month".equals(hspemginfQueryDto.getQuerytype())){
			hspemginfQueryDto.getHspemginfCustom().setStartdate(DateUtil.getMonthFirstDay(hspemginfQueryDto.getHspemginfCustom().getStartdate()));
			hspemginfQueryDto.getHspemginfCustom().setEnddate(DateUtil.getMonthLastDay(hspemginfQueryDto.getHspemginfCustom().getStartdate()));
		}else if("day".equals(hspemginfQueryDto.getQuerytype())){
			hspemginfQueryDto.getHspemginfCustom().setEnddate(hspemginfQueryDto.getHspemginfCustom().getStartdate());
		}
		return hspemginfCustomMapper.findBqhztjHzmx(hspemginfQueryDto);
	}
	/**
	 * 患者明细总数
	 */
	public int findBqhztjHzmxCount(HspemginfQueryDto hspemginfQueryDto){
		if("month".equals(hspemginfQueryDto.getQuerytype())){
			hspemginfQueryDto.getHspemginfCustom().setStartdate(DateUtil.getMonthFirstDay(hspemginfQueryDto.getHspemginfCustom().getStartdate()));
			hspemginfQueryDto.getHspemginfCustom().setEnddate(DateUtil.getMonthLastDay(hspemginfQueryDto.getHspemginfCustom().getStartdate()));
		}else if("day".equals(hspemginfQueryDto.getQuerytype())){
			hspemginfQueryDto.getHspemginfCustom().setEnddate(hspemginfQueryDto.getHspemginfCustom().getStartdate());
		}
		return hspemginfCustomMapper.findBqhztjHzmxCount(hspemginfQueryDto);
	}
	
	/**
	 * 住院科室收住人数统计列表
	 */
	@Override
	public List<HspemginfCustom> findPatientList(HspsqlinfQueryDto hspsqlinfQueryDto) {
		if("month".equals(hspsqlinfQueryDto.getQuerytype())){
			hspsqlinfQueryDto.getHspemginfCustom().setStartdate(DateUtil.getMonthFirstDay(hspsqlinfQueryDto.getHspemginfCustom().getStartdate()));
			hspsqlinfQueryDto.getHspemginfCustom().setEnddate(DateUtil.getMonthLastDay(hspsqlinfQueryDto.getHspemginfCustom().getStartdate()));
		}else if("day".equals(hspsqlinfQueryDto.getQuerytype())){
			hspsqlinfQueryDto.getHspemginfCustom().setEnddate(hspsqlinfQueryDto.getHspemginfCustom().getStartdate());
		}
		List<HspemginfCustom> list=hspsqlinfCustomMapper.findPatients(hspsqlinfQueryDto);
		return list;
	}
	/**
	 * 住院科室收住人数统计总数
	 */
	@Override
	public int findPatientsCount(HspsqlinfQueryDto hspsqlinfQueryDto)throws Exception {
		if("month".equals(hspsqlinfQueryDto.getQuerytype())){
			hspsqlinfQueryDto.getHspemginfCustom().setStartdate(DateUtil.getMonthFirstDay(hspsqlinfQueryDto.getHspemginfCustom().getStartdate()));
			hspsqlinfQueryDto.getHspemginfCustom().setEnddate(DateUtil.getMonthLastDay(hspsqlinfQueryDto.getHspemginfCustom().getStartdate()));
		}else if("day".equals(hspsqlinfQueryDto.getQuerytype())){
			hspsqlinfQueryDto.getHspemginfCustom().setEnddate(hspsqlinfQueryDto.getHspemginfCustom().getStartdate());
		}
		int total=hspsqlinfCustomMapper.findPatientsCount(hspsqlinfQueryDto);
		return total;
	}
	
	@Override
	public Map<String, Object> findDrhzrsZyy() throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		Date datetime = new Date();
		HighChartsDemoCustom highChartsDemoCustom = new HighChartsDemoCustom();
		int rscount = hspemginfCustomMapper.fingDrhzrs(datetime);//今日接收病人
		int ylqcount=hspemginfCustomMapper.fingylqcount(datetime);//月留抢病人
		int rlqcount=hspemginfCustomMapper.fingrlqcount(datetime);//日留抢
		//日发热人数
		int dayHeat = hspemginfCustomMapper.findDayHeatCount(datetime);
		
		//日绿色通道人数
		DecimalFormat df = new DecimalFormat("#.0");
		HspemginfQueryDto hspemginfQueryDto = new HspemginfQueryDto();
		hspemginfQueryDto.setStartdate(new Date());
		hspemginfQueryDto.setEnddate(new Date());
		HspemginfCustom hspemginfCustomLstd = zyyHspemginfCustomMapper.getGrnChlCount(hspemginfQueryDto);
		//绿色通道人数
		int lstdCount = 0;
		if(hspemginfCustomLstd!=null) {
			lstdCount = Integer.valueOf(hspemginfCustomLstd.getLstdCount());
		}
		//绿色通道占留抢人数比例
		String lstdRtio = "0";
		if(lstdCount>0 && rlqcount>0) {
			lstdRtio =  df.format(((double)lstdCount / rlqcount) * 100);
		}
		
		//日会诊人数
		HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto = new HspConsultationRecordsQueryDto();
		hspConsultationRecordsQueryDto.setStartdate(new Date());
		hspConsultationRecordsQueryDto.setEnddate(new Date());
		hspConsultationRecordsQueryDto.setQuerytype("day");
		hspConsultationRecordsQueryDto.setRecordFlag("hzdj");
		//会诊人数
		int hzCount = hspConsultationRecordsCustomMapper.findHspConsultationRecordsTotal(hspConsultationRecordsQueryDto);
		//会诊人数占留抢人数比列
		String hzRito = "0";
		if(hzCount > 0 && rlqcount > 0) {
			hzRito = df.format(((double)hzCount / rlqcount) * 100);
		}
		
		//今日住院人数
		int dayInHospital = 0;
		HspsqlinfQueryDto hspsqlinfQueryDto = new HspsqlinfQueryDto();
		hspsqlinfQueryDto.setStartdate(new Date());
		List<HspsqlinfCustom> dayInHospitalList= hspsqlinfCustomMapper.findZjzyrsDay(hspsqlinfQueryDto);
		if(dayInHospitalList != null && dayInHospitalList.size()>0) {
			dayInHospital = dayInHospitalList.get(0).getCounts();
		}
		//住院人数占留抢总数比例
		String dayInHospitalRito = "0";
		if(dayInHospital > 0 && rlqcount > 0) {
			dayInHospitalRito = df.format(((double)dayInHospital / rlqcount) * 100);
		}
		
		//今日死亡数
		HspemginfQueryDto hs=new HspemginfQueryDto();
		hs.setStartdate(new Date());
		hs.setEnddate(DateUtil.getNextDay(new Date()));
		List<String> zgztlist = new ArrayList<String>();
		zgztlist.add("3");//死亡
		zgztlist.add("14");//来院已死亡
		hs.setZgztlist(zgztlist);
		List<HspemginfCustom> hspemginfCustomList=hspemginfCustomMapper.findDeathList(hs);
		int deathCount  =hspemginfCustomList.get(0).getDeathNum();
		//死亡人数占留抢总数比例
		String deathCountRito = "0";
		if(deathCount > 0 && rlqcount > 0) {
			deathCountRito = df.format(((double) deathCount / rlqcount) * 100);
		}
		//当月死亡人数
		Date start=DateUtil.getMonthFirstDay(new Date());
		Date end = DateUtil.getNextMonth(start);
		hs.setStartdate(start);
		hs.setEnddate(end);
		hs.setZgztlist(zgztlist);
		List<HspemginfCustom> hspemginfCustomList2=hspemginfCustomMapper.findDeathList(hs);
		int srlcount =hspemginfCustomList2.get(0).getDeathNum();
		
		
		
		//获取月急诊人数
		HighChartsDemoCustomDto highChartsDemoCustomDto = new HighChartsDemoCustomDto();
		highChartsDemoCustomDto.setStarttime(start);
		highChartsDemoCustomDto.setEndtime(end);
		List<HighChartsDemoCustom>  highChartsDtoList2 = getYjzrsList(highChartsDemoCustomDto);
		HighChartsDemoCustom yjzrs = null;
		int jzrs = 0;
		if(highChartsDtoList2 != null && highChartsDtoList2.size()>0){
			 yjzrs=highChartsDtoList2.get(0);
			 jzrs = highChartsDtoList2.get(0).getCount();
		}
		
		//获取月急诊住院人数
		List<HighChartsDemoCustom> highChartsDtoList  = getYjzzyrsList(highChartsDemoCustomDto);
		HighChartsDemoCustom yjzzyrs = null;  
		if(highChartsDtoList != null && highChartsDtoList.size()>0){
			yjzzyrs = highChartsDtoList.get(0);
		}
		
		//查询各月份抢救室滞留时间中位数
		hs.setStartdate(start);
		hs.setEnddate(end);
		List<HspemginfCustom> list = hspemginfCustomMapper.findMedianList(hs);
		double qjzwscount=  list.get(0).getMedian();
		
		//获取月会诊平均时间
		hspConsultationRecordsQueryDto.setStartdate(DateUtil.getMonthFirstDay(new Date()));
		hspConsultationRecordsQueryDto.setEnddate(DateUtil.getNextMonth(hspConsultationRecordsQueryDto.getStartdate()));
		List<HspConsultationRecordsCustom> countList = hspConsultationRecordsCustomMapper.findHspConsultationRecordsAvgTotalList(hspConsultationRecordsQueryDto);
		int yhzavgtime = 0;
		if(countList != null && countList.size() > 0) {
			yhzavgtime = countList.get(0).getAvgtime();
		}
		
		
		//月胸痛、卒中、创伤人数
		highChartsDemoCustom = hspemginfCustomMapper.findXtAndCzAndCsCount(datetime);
		
		highChartsDemoCustom.setRscount(rscount);
		highChartsDemoCustom.setYlqcount(ylqcount);
		highChartsDemoCustom.setJrlqcount(rlqcount);
		highChartsDemoCustom.setDayHeat(dayHeat);
		highChartsDemoCustom.setLstdCount(lstdCount);
		highChartsDemoCustom.setLstdRtio(lstdRtio);
		highChartsDemoCustom.setHzCount(hzCount);
		highChartsDemoCustom.setHzRito(hzRito);
		highChartsDemoCustom.setDayInHospital(dayInHospital);
		highChartsDemoCustom.setDayInHospitalRito(dayInHospitalRito);
		highChartsDemoCustom.setDeathCount(deathCount);
		highChartsDemoCustom.setDeathCountRito(deathCountRito);
		highChartsDemoCustom.setSrlcount(srlcount);
		highChartsDemoCustom.setQjzwscount(qjzwscount);
		highChartsDemoCustom.setYhzavgtime(yhzavgtime);
		highChartsDemoCustom.setYjzrs(jzrs);
		map.put("highChartsDemoCustom", highChartsDemoCustom);
		map.put("yjzzyrs", yjzzyrs);
		map.put("yjzrs", yjzrs);
		return map;
	}
	@Override
	public List<HspemginfCustom> findVisDatList(
			HspemginfQueryDto hspemginfQueryDto) {
		List<HspemginfCustom> list=null;
		if(hspemginfQueryDto!=null){
			//获取日期格式
			if("day".equals(hspemginfQueryDto.getQuerytype()))
				hspemginfQueryDto.setQuerytype("yyyy/mm/dd");
			else
				hspemginfQueryDto.setQuerytype("yyyy/mm");
			//判断时间模式
			if("0".equals(hspemginfQueryDto.getTimetype()))
				list= hspemginfCustomMapper.findVisDatByOneList(hspemginfQueryDto);
			else
				list= hspemginfCustomMapper.findVisDatByTwoList(hspemginfQueryDto);
		}
		return list;
	}

	
	@Override
	public List<HspemginfCustom> findZjzyrsPat(HspsqlinfQueryDto hspsqlinfQueryDto) {
		if("month".equals(hspsqlinfQueryDto.getQuerytype())){
			hspsqlinfQueryDto.setEnddate(DateUtil.getNextMonth(hspsqlinfQueryDto.getEnddate()));
		}else if("day".equals(hspsqlinfQueryDto.getQuerytype())){
			if(!StringUtils.isNotNullAndEmptyByTrim(hspsqlinfQueryDto.getStartdate())){
				hspsqlinfQueryDto.setStartdate(new Date());
			}
			hspsqlinfQueryDto.setEnddate(DateUtil.getNextDay(hspsqlinfQueryDto.getStartdate()));
		}
		return hspsqlinfCustomMapper.findZjzyrsPat(hspsqlinfQueryDto);
	}
	@Override
	public List<HighChartsReportCustom> findqjsrbbList(HspsqlinfQueryDto hspsqlinfQueryDto ) {
		return hspsqlinfCustomMapper.findqjsrbbList(hspsqlinfQueryDto);
	}
	@Override
	public List<HighChartsReportCustom> findqjsrbbListRange(HspsqlinfQueryDto hspsqlinfQueryDto) {
		return hspsqlinfCustomMapper.findqjsrbbListRange(hspsqlinfQueryDto);
	}
	
	@Override
	public HspemginfCustom findQjspjzlsj(HspemginfQueryDto hspemginfQueryDto) {
		String querytype = hspemginfQueryDto.getQuerytype();
		HspemginfCustom back = hspemginfCustomMapper.findQjspjzlsj(hspemginfQueryDto);
		return back;
	}
	
	@Override
	public HspemginfCustom findQjszll(HspemginfQueryDto hspemginfQueryDto) {
		String querytype = hspemginfQueryDto.getQuerytype();
		HspemginfCustom back = hspemginfCustomMapper.findQjszll(hspemginfQueryDto);
		return back;
	}
	@Override
	public List<HspemginfCustom> findQjszlhzList(
			HspemginfQueryDto hspemginfQueryDto) {
		List<HspemginfCustom> list = hspemginfCustomMapper.findQjszlhzList(hspemginfQueryDto);
		return list;
	}
	@Override
	public int findQjszlhzCount(HspemginfQueryDto hspemginfQueryDto) {
		return hspemginfCustomMapper.findQjszlhzCount(hspemginfQueryDto);
	}
	
	/**
	 * 急诊患者统计列表总数
	 * @throws Exception 
	 */
	@Override
	public int findJzhztjlbCount(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		if(!"year".equals(hspemginfQueryDto.getQuerytype())) {
			hspemginfQueryDto.getHspemginfCustom().setEnddate(hspemginfQueryDto.getHspemginfCustom().getStartdate());
		}
		if (StringUtils.isNotNullAndEmptyByTrim(hspemginfQueryDto.getHspemginfCustom().getScoIdArr())) {
			String scoIdArr = hspemginfQueryDto.getHspemginfCustom().getScoIdArr();
			String subString = scoIdArr.substring(scoIdArr.indexOf("[")+1, scoIdArr.indexOf("]"));
			String[] strings = subString.split(",");
			if (0 != strings.length) {
				List<String> list = Arrays.asList(strings);
				hspemginfQueryDto.setScoIdList(list);
			}
		}
		return zyyHspemginfCustomMapper.findHspemginfCount(hspemginfQueryDto);
	}
	
	/**
	 * 急诊患者统计列表
	 */
	@Override
	public List<HspemginfCustom> findJzhztjlbList(HspemginfQueryDto hspemginfQueryDto) {
		hspemginfQueryDto.setXtdate(new Date());
		if(!"year".equals(hspemginfQueryDto.getQuerytype())) {
			hspemginfQueryDto.getHspemginfCustom().setEnddate(hspemginfQueryDto.getHspemginfCustom().getStartdate());
		}
		if (StringUtils.isNotNullAndEmptyByTrim(hspemginfQueryDto.getHspemginfCustom().getScoIdArr())) {
			String scoIdArr = hspemginfQueryDto.getHspemginfCustom().getScoIdArr();
			String subString = scoIdArr.substring(scoIdArr.indexOf("[")+1, scoIdArr.indexOf("]"));
			String[] strings = subString.split(",");
			if (0 != strings.length) {
				List<String> list = Arrays.asList(strings);
				hspemginfQueryDto.setScoIdList(list);
			}
		}
		List<HspemginfCustom> list=zyyHspemginfCustomMapper.findHspemginfList(hspemginfQueryDto);
		return list;
	}
	
	@Override
	public List<HspemginfCustom> findJzkfrbrtjList(HspemginfQueryDto hspemginfQueryDto) {
		List<HspemginfCustom> hspEmgInfList = hspemginfCustomMapper.findJzkfrbrtjList(hspemginfQueryDto);
		return hspEmgInfList;
	}
	
	/**
	 * 今日就诊年龄性别统计
	 * @param hspemginfQueryDto
	 * @return
	 */
	@Override
	public List<HspemginfCustom> findAgeAndSexTjList(HspemginfQueryDto hspemginfQueryDto) {
		List<HspemginfCustom> columnList = hspemginfCustomMapper.findAgeAndSexTjList(hspemginfQueryDto);
		//处理list中数据
		if(columnList != null && columnList.size()>0) {
			columnList = countAge(columnList);
		}
		return columnList;
	}
	
	/**
     * sql查询使用Group By方法,如果数据库本身没有那条记录的话,就不会返回相应的总数,所以需要定死数组,再通过遍历的方式去查找
     * @return
     */
    public List<HspemginfCustom> countAge(List<HspemginfCustom> columnList){
        String[] ageArr = new String[]{"0-6","7-17","18-40","41-65","66+"};
        //首先初始化
        List<HspemginfCustom> countAgeDtoList = new ArrayList<>();
            for(String age: ageArr){
            	HspemginfCustom countAgeDto = new HspemginfCustom();
                //遍历数据库查出来的集合
                if(columnList != null && columnList.size() > 0){
                    for(HspemginfCustom d : columnList){
                    	//如果存在则将数据添加进去
                    	if(age.equals(d.getInter())) {
                    		countAgeDto.setInter(d.getInter());
                    		countAgeDto.setZgcount(d.getZgcount());
                    		countAgeDto.setHzcount(d.getHzcount());
                            break;
                    	}else {
                    		//不存在则将数据添加为0
                    		countAgeDto.setInter(age);
                    		countAgeDto.setZgcount(0);
                    		countAgeDto.setHzcount(0);
                    	}
                    }
                }
                countAgeDtoList.add(countAgeDto);
            }
        return countAgeDtoList;
    }
    
    /**
	 * 急诊科患者生命体征完成情况统计
	 * @param hspemginfQueryDto
	 * @return
	 */
	@Override
	public List<HspmewsinfCustom> querySmtzwcqktj(HspmewsinfCustom hspmewsinfCustom) {
		return hspMewsInfCustomMapper.querySmtzwcqktj(hspmewsinfCustom);
	}
	
	@Override
	public int queryEmgCountBySmtz(HspmewsinfCustom hspmewsinfCustom) {
		return hspMewsInfCustomMapper.queryEmgCountBySmtz(hspmewsinfCustom);
	}
	/**
	 * 急诊科患者生命体征完成情况统计	患者列表
	 * @param hspemginfQueryDto
	 * @return
	 */
	@Override
	public List<HspemginfCustom> queryEmgListBySmtz(HspmewsinfCustom hspmewsinfCustom) {
		return hspMewsInfCustomMapper.queryEmgListBySmtz(hspmewsinfCustom);
	}
	
	/**
	 * 班次患者汇总列表
	 */
	@Override
	public List<HspBchzhzReportCustom> findbchzhzList(HspJjbglInfQueryDto hspJjbglInfQueryDto) {
		List<HspBchzhzReportCustom> list = hspJjbglInfCustomMapper.findbchzhzList(hspJjbglInfQueryDto);
		if(list.size() == 0){
			HspBchzhzReportCustom a = new HspBchzhzReportCustom();
			a.setJiaobc("RB");
			list.add(a);
			HspBchzhzReportCustom b = new HspBchzhzReportCustom();
			b.setJiaobc("QYB");
			list.add(b);
			HspBchzhzReportCustom c = new HspBchzhzReportCustom();
			c.setJiaobc("HYB");
			list.add(c);
		}else if(list.size() == 1){
			HspBchzhzReportCustom a = list.get(0);
			if("RB".equals(a.getJiaobc())){
				HspBchzhzReportCustom b = new HspBchzhzReportCustom();
				b.setJiaobc("QYB");
				list.add(b);
				HspBchzhzReportCustom c = new HspBchzhzReportCustom();
				c.setJiaobc("HYB");
				list.add(c);
			}
			if("QYB".equals(a.getJiaobc())){
				HspBchzhzReportCustom b = new HspBchzhzReportCustom();
				b.setJiaobc("RB");
				list.add(0,b);
				HspBchzhzReportCustom c = new HspBchzhzReportCustom();
				c.setJiaobc("HYB");
				list.add(2,c);
			}
			if("HYB".equals(a.getJiaobc())){
				HspBchzhzReportCustom b = new HspBchzhzReportCustom();
				b.setJiaobc("RB");
				list.add(0,b);
				HspBchzhzReportCustom c = new HspBchzhzReportCustom();
				c.setJiaobc("QYB");
				list.add(1,c);
			}
		}else if(list.size() == 2){
			HspBchzhzReportCustom a = list.get(0);
			HspBchzhzReportCustom b = list.get(1);
			if("RB".equals(a.getJiaobc())){
				if("QYB".equals(b.getJiaobc())){
					HspBchzhzReportCustom c = new HspBchzhzReportCustom();
					c.setJiaobc("HYB");
					list.add(2,c);
				}else{
					HspBchzhzReportCustom c = new HspBchzhzReportCustom();
					c.setJiaobc("QYB");
					list.add(1,c);
				}
			}else if("QYB".equals(a.getJiaobc())){
				HspBchzhzReportCustom c = new HspBchzhzReportCustom();
				c.setJiaobc("RB");
				list.add(0,c);
			}
		}
		for(HspBchzhzReportCustom a : list){
			String jiaobc = a.getJiaobc();
			if("RB".equals(jiaobc)){
				jiaobc = "日班";
			}else if("QYB".equals(jiaobc)){
				jiaobc = "前夜班";
			}else if("HYB".equals(jiaobc)){
				jiaobc = "后夜班";
			}
			a.setJiaobc(jiaobc);
		}
		return list;
	}
	@Override
	public List<HspBchzhzReportCustom> findbchzhzListRange(HspJjbglInfQueryDto hspJjbglInfQueryDto) {
		List<HspBchzhzReportCustom> list = hspJjbglInfCustomMapper.findbchzhzListRange(hspJjbglInfQueryDto);
		if(list.size() == 0){
			HspBchzhzReportCustom a = new HspBchzhzReportCustom();
			a.setJiaobc("RB");
			list.add(a);
			HspBchzhzReportCustom b = new HspBchzhzReportCustom();
			b.setJiaobc("QYB");
			list.add(b);
			HspBchzhzReportCustom c = new HspBchzhzReportCustom();
			c.setJiaobc("HYB");
			list.add(c);
		}else if(list.size() == 1){
			HspBchzhzReportCustom a = list.get(0);
			if("RB".equals(a.getJiaobc())){
				HspBchzhzReportCustom b = new HspBchzhzReportCustom();
				b.setJiaobc("QYB");
				list.add(b);
				HspBchzhzReportCustom c = new HspBchzhzReportCustom();
				c.setJiaobc("HYB");
				list.add(c);
			}
			if("QYB".equals(a.getJiaobc())){
				HspBchzhzReportCustom b = new HspBchzhzReportCustom();
				b.setJiaobc("RB");
				list.add(0,b);
				HspBchzhzReportCustom c = new HspBchzhzReportCustom();
				c.setJiaobc("HYB");
				list.add(2,c);
			}
			if("HYB".equals(a.getJiaobc())){
				HspBchzhzReportCustom b = new HspBchzhzReportCustom();
				b.setJiaobc("RB");
				list.add(0,b);
				HspBchzhzReportCustom c = new HspBchzhzReportCustom();
				c.setJiaobc("QYB");
				list.add(1,c);
			}
		}else if(list.size() == 2){
			HspBchzhzReportCustom a = list.get(0);
			HspBchzhzReportCustom b = list.get(1);
			if("RB".equals(a.getJiaobc())){
				if("QYB".equals(b.getJiaobc())){
					HspBchzhzReportCustom c = new HspBchzhzReportCustom();
					c.setJiaobc("HYB");
					list.add(2,c);
				}else{
					HspBchzhzReportCustom c = new HspBchzhzReportCustom();
					c.setJiaobc("QYB");
					list.add(1,c);
				}
			}else if("QYB".equals(a.getJiaobc())){
				HspBchzhzReportCustom c = new HspBchzhzReportCustom();
				c.setJiaobc("RB");
				list.add(0,c);
			}
		}
		for(HspBchzhzReportCustom a : list){
			String jiaobc = a.getJiaobc();
			if("RB".equals(jiaobc)){
				jiaobc = "日班";
			}else if("QYB".equals(jiaobc)){
				jiaobc = "前夜班";
			}else if("HYB".equals(jiaobc)){
				jiaobc = "后夜班";
			}
			a.setJiaobc(jiaobc);
		}
		return list;
	}
	
	/**
	 * 120收住人数统计报表列表查询
	 */
	@Override
	public List<HspsqlinfCustom> find120szy(HspsqlinfQueryDto hspsqlinfQueryDto) {
		if("year".equals(hspsqlinfQueryDto.getQuerytype())){
			hspsqlinfQueryDto.setEnddate(DateUtil.getNextYear(hspsqlinfQueryDto.getEnddate(), "yyyy"));
			return hspsqlinfCustomMapper.find120szyYear(hspsqlinfQueryDto);
		}else if("month".equals(hspsqlinfQueryDto.getQuerytype())){
			hspsqlinfQueryDto.setEnddate(DateUtil.getNextMonth(hspsqlinfQueryDto.getEnddate()));
			return hspsqlinfCustomMapper.find120szyMonth(hspsqlinfQueryDto);
		}else if("day".equals(hspsqlinfQueryDto.getQuerytype())){
			if(!StringUtils.isNotNullAndEmptyByTrim(hspsqlinfQueryDto.getStartdate())){
				hspsqlinfQueryDto.setStartdate(new Date());
			}
			return hspsqlinfCustomMapper.find120szyDay(hspsqlinfQueryDto);
		}else{
			return hspsqlinfCustomMapper.find120szyHalfyear(hspsqlinfQueryDto);
		}
	}
	
	/**
	 * 120收住人数患者明细统计列表
	 */
	@Override
	public List<HspemginfCustom> find120PatientList(HspsqlinfQueryDto hspsqlinfQueryDto) {
		if("month".equals(hspsqlinfQueryDto.getQuerytype())){
			hspsqlinfQueryDto.getHspemginfCustom().setStartdate(DateUtil.getMonthFirstDay(hspsqlinfQueryDto.getHspemginfCustom().getStartdate()));
			hspsqlinfQueryDto.getHspemginfCustom().setEnddate(DateUtil.getMonthLastDay(hspsqlinfQueryDto.getHspemginfCustom().getStartdate()));
		}else if("day".equals(hspsqlinfQueryDto.getQuerytype())){
			hspsqlinfQueryDto.getHspemginfCustom().setEnddate(hspsqlinfQueryDto.getHspemginfCustom().getStartdate());
		}
		List<HspemginfCustom> list=hspsqlinfCustomMapper.find120Patients(hspsqlinfQueryDto);
		return list;
	}
	/**
	 * 120收住人数统计总数
	 */
	@Override
	public int find120PatientsCount(HspsqlinfQueryDto hspsqlinfQueryDto)throws Exception {
		if("month".equals(hspsqlinfQueryDto.getQuerytype())){
			hspsqlinfQueryDto.getHspemginfCustom().setStartdate(DateUtil.getMonthFirstDay(hspsqlinfQueryDto.getHspemginfCustom().getStartdate()));
			hspsqlinfQueryDto.getHspemginfCustom().setEnddate(DateUtil.getMonthLastDay(hspsqlinfQueryDto.getHspemginfCustom().getStartdate()));
		}else if("day".equals(hspsqlinfQueryDto.getQuerytype())){
			hspsqlinfQueryDto.getHspemginfCustom().setEnddate(hspsqlinfQueryDto.getHspemginfCustom().getStartdate());
		}
		int total=hspsqlinfCustomMapper.find120PatientsCount(hspsqlinfQueryDto);
		return total;
	}
	/**
	 * 护士站病种患者明细列表数据
	 */
	@Override
	public List<HspemginfCustom> findhszbzList(HspsqlinfQueryDto hspsqlinfQueryDto) throws Exception {
		if("month".equals(hspsqlinfQueryDto.getQuerytype())){
			hspsqlinfQueryDto.getHspemginfCustom().setStartdate(DateUtil.getMonthFirstDay(hspsqlinfQueryDto.getHspemginfCustom().getStartdate()));
			hspsqlinfQueryDto.getHspemginfCustom().setEnddate(DateUtil.getMonthLastDay(hspsqlinfQueryDto.getHspemginfCustom().getStartdate()));
		}else if("day".equals(hspsqlinfQueryDto.getQuerytype())){
			hspsqlinfQueryDto.getHspemginfCustom().setEnddate(hspsqlinfQueryDto.getHspemginfCustom().getStartdate());
		}
		List<HspemginfCustom> list=hspsqlinfCustomMapper.findhszbzPatients(hspsqlinfQueryDto);
		return list;
	}
	/**
	 * 护士站病种统计总数
	 */
	@Override
	public int findhszbzCount(HspsqlinfQueryDto hspsqlinfQueryDto) throws Exception {
		if("month".equals(hspsqlinfQueryDto.getQuerytype())){
			hspsqlinfQueryDto.getHspemginfCustom().setStartdate(DateUtil.getMonthFirstDay(hspsqlinfQueryDto.getHspemginfCustom().getStartdate()));
			hspsqlinfQueryDto.getHspemginfCustom().setEnddate(DateUtil.getMonthLastDay(hspsqlinfQueryDto.getHspemginfCustom().getStartdate()));
		}else if("day".equals(hspsqlinfQueryDto.getQuerytype())){
			hspsqlinfQueryDto.getHspemginfCustom().setEnddate(hspsqlinfQueryDto.getHspemginfCustom().getStartdate());
		}
		int total=hspsqlinfCustomMapper.findhszbzCount(hspsqlinfQueryDto);
		return total;
	}
	@Override
	public List<HspemginfCustom> findhszbztjHzmx(HspsqlinfQueryDto hspsqlinfQueryDto) {
		hspsqlinfQueryDto.getHspemginfCustom().setEnddate(hspsqlinfQueryDto.getHspemginfCustom().getStartdate());
		return hspemginfCustomMapper.findhszbztjHzmx(hspsqlinfQueryDto);
	}
	
	/**
	 * IVa级患者达标率
	 * @param starttime
	 * @param endtime
	 * @return
	 * @throws Exception
	 */
	public HighChartsInfo getFourA(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		//查询各月份IVa级患者达标率
		List<HspemginfCustom> list = hspemginfCustomMapper.findQualifiedList(hspemginfQueryDto);
		
		for (HspemginfCustom hspemginfCustom : list) {
			int foura = hspemginfCustom.getWzhzs();
			int count = hspemginfCustom.getPthzs();
			double median;
			if(count == 0 || foura == 0){
				median = 0.00;
			}else{
				  median=(double)foura/count*100; 
				  DecimalFormat r=new DecimalFormat();  
				  r.applyPattern("#0.00");//保留小数位数，不足会补零 
				  median = new Double(r.format(median)).doubleValue();
			}
			hspemginfCustom.setMedian(median);
		}
		
		//初始化报表对象
		HighChartsInfo highChartsInfo = new HighChartsInfo();
		if(list!=null&&list.size()>0){
			String[] xcategories = new String[list.size()];
			double[] data = new double[list.size()];
			Series series = new Series();
			for(int i=0 ; i<list.size() ; i++){
				xcategories[i] = list.get(i).getMdate();
				data[i] = (double)list.get(i).getMedian();
			}
			series.setData(data);
			List<Series> seriesList = new ArrayList<Series>();
			seriesList.add(series);
			highChartsInfo.setXcategories(xcategories);
			highChartsInfo.setSeries(seriesList);
			return highChartsInfo;
		}
		return null;
	}
	/**
	 * IVa级患者达标率获取数据
	 * @param starttime
	 * @param endtime
	 * @return
	 * @throws Exception
	 */
	public List<HspemginfCustom> getFourAList(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		//查询各月份IVa级患者达标率
		List<HspemginfCustom> list = hspemginfCustomMapper.findQualifiedList(hspemginfQueryDto);
		for (HspemginfCustom hspemginfCustom : list) {
			int foura = hspemginfCustom.getWzhzs();
			int count = hspemginfCustom.getPthzs();
			double median;
			if(count == 0 || foura == 0){
				median = 0.00;
			}else{
				  median=(double)foura/count*100; 
				  DecimalFormat r=new DecimalFormat();  
				  r.applyPattern("#0.00");//保留小数位数，不足会补零 
				  median = new Double(r.format(median)).doubleValue();
			}
			hspemginfCustom.setMedian(median);
		}
		return list;
	}
}
