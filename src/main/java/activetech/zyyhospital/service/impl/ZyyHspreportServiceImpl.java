package activetech.zyyhospital.service.impl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.service.SystemConfigService;
import activetech.hospital.pojo.dto.HspBrbzCustom;
import activetech.hospital.pojo.dto.HspBrbzQueryDto;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.util.DateUtil;
import activetech.zyyhospital.dao.mapper.HspBasyInfCustomMapper;
import activetech.zyyhospital.dao.mapper.HspConsultationRecordsCustomMapper;
import activetech.zyyhospital.dao.mapper.HspHlpgbCustomMapper;
import activetech.zyyhospital.dao.mapper.ZyyHspemginfCustomMapper;
import activetech.zyyhospital.pojo.dto.HspBasyInfCustom;
import activetech.zyyhospital.pojo.dto.HspBasyInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspConsultationRecordsCustom;
import activetech.zyyhospital.pojo.dto.HspConsultationRecordsQueryDto;
import activetech.zyyhospital.pojo.dto.HspFrbrInfCustom;
import activetech.zyyhospital.pojo.dto.HspHlpgbCustom;
import activetech.zyyhospital.pojo.dto.HspHlpgbQueryDto;
import activetech.zyyhospital.pojo.dto.HspOperateInfCustom;
import activetech.zyyhospital.service.ZyyHspreportService;

public class ZyyHspreportServiceImpl implements ZyyHspreportService {
	@Autowired
	private ZyyHspemginfCustomMapper zyyHspemginfCustomMapper;
	@Autowired
	private HspConsultationRecordsCustomMapper hspConsultationRecordsCustomMapper;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private HspBasyInfCustomMapper hspBasyInfCustomMapper;
	@Autowired
	private HspHlpgbCustomMapper hspHlpgbCustomMapper;
	
	/**
	 * 统计抢救措施人数
	 * 
	 */
	@Override
	public List<HspBrbzCustom> getcountFromHlpgb(HspBrbzQueryDto hspBrbzQueryDto) throws Exception {
		//声明list  存储查询到的数据
		List<HspBrbzCustom> list= new ArrayList<HspBrbzCustom>();
		
		/*//查询方式为年
		if("year".equals(hspBrbzQueryDto.getQuerytype())) {
			list = zyyHspemginfCustomMapper.getcountFromHlpgbToYear(hspBrbzQueryDto);
		//查询方式为月
		}else if("month".equals(hspBrbzQueryDto.getQuerytype())) {
			list = zyyHspemginfCustomMapper.getcountFromHlpgbToMonth(hspBrbzQueryDto);
		//查询方式为天
		}else if("day".equals(hspBrbzQueryDto.getQuerytype())) {
			list = zyyHspemginfCustomMapper.getcountFromHlpgbToDay(hspBrbzQueryDto);
		//查询方式为半年	
		}else {
			list = zyyHspemginfCustomMapper.getcountFromHlpgbToHalfYear(hspBrbzQueryDto);
		}*/
		
		list = zyyHspemginfCustomMapper.getcountFromHlpgbToRange(hspBrbzQueryDto);
		
		//遍历数据集合，添加info数据
		for (int i = 0; i < list.size(); i++) {
			Dstdictinfo dstDictInfo = systemConfigService.findDictinfoByInfocode("CLBZ_COD", list.get(i).getName());
			list.get(i).setInfo(dstDictInfo.getInfo());
		}
		return list;
	}
	@Override
	public List<HspemginfCustom> find120tj(HspemginfQueryDto hspemginfQueryDto) {
		if("halfyear".equals(hspemginfQueryDto.getQuerytype())){
			return zyyHspemginfCustomMapper.find120tjHalfYear(hspemginfQueryDto);
		}else{
			if("month".equals(hspemginfQueryDto.getQuerytype())){
				hspemginfQueryDto.setEnddate(DateUtil.getNextMonth(hspemginfQueryDto.getEnddate()));
			}else if("day".equals(hspemginfQueryDto.getQuerytype())){
				hspemginfQueryDto.setEnddate(DateUtil.getNextDay(hspemginfQueryDto.getStartdate()));
			}
			return zyyHspemginfCustomMapper.find120tj(hspemginfQueryDto);
		}
	}

	@Override
	public List<HspemginfCustom> getReturnQjsList(
			HspemginfQueryDto hspemginfQueryDto) {
		hspemginfQueryDto.setEnddate(DateUtil.getNextMonth(hspemginfQueryDto.getEnddate()));
		return zyyHspemginfCustomMapper.findReturnQjsList(hspemginfQueryDto);
	}
	
	@Override
	public Map<String, List<HspConsultationRecordsCustom>> findHspConsultationRecordsAvgList(
			HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto) throws Exception{
		String querytype = hspConsultationRecordsQueryDto.getQuerytype();
		Map<String, List<HspConsultationRecordsCustom>> map = new HashMap<String, List<HspConsultationRecordsCustom>>();
		List<HspConsultationRecordsCustom> list;
		List<HspConsultationRecordsCustom> countList;
		if("year".equals(querytype)){
			hspConsultationRecordsQueryDto.setQuerytype(DateUtil.formatDateByFormat(hspConsultationRecordsQueryDto.getStartdate(), "yyyy"));
			hspConsultationRecordsQueryDto.setEnddate(DateUtil.getNextYear(hspConsultationRecordsQueryDto.getStartdate(), "yyyy"));
			list = hspConsultationRecordsCustomMapper.findHspConsultationRecordsAvgListByYear(hspConsultationRecordsQueryDto);
			countList = hspConsultationRecordsCustomMapper.findHspConsultationRecordsAvgTotalList(hspConsultationRecordsQueryDto);
		}else if("month".equals(querytype)){
			hspConsultationRecordsQueryDto.setEnddate(DateUtil.getNextMonth(hspConsultationRecordsQueryDto.getEnddate()));
			list = hspConsultationRecordsCustomMapper.findHspConsultationRecordsAvgListByMonth(hspConsultationRecordsQueryDto);
			countList = hspConsultationRecordsCustomMapper.findHspConsultationRecordsAvgTotalList(hspConsultationRecordsQueryDto);
		}else if("day".equals(querytype)){
			hspConsultationRecordsQueryDto.setEnddate(DateUtil.getNextDay(hspConsultationRecordsQueryDto.getStartdate()));
			list = hspConsultationRecordsCustomMapper.findHspConsultationRecordsAvgListByDay(hspConsultationRecordsQueryDto);
			countList = hspConsultationRecordsCustomMapper.findHspConsultationRecordsAvgTotalList(hspConsultationRecordsQueryDto);
		}else{
			list = hspConsultationRecordsCustomMapper.findHspConsultationRecordsAvgListByHalfyear(hspConsultationRecordsQueryDto);
			countList = hspConsultationRecordsCustomMapper.findHspConsultationRecordsAvgTotalListHalfyear(hspConsultationRecordsQueryDto);
			if(countList.size()!=2){
				HspConsultationRecordsCustom custom=new HspConsultationRecordsCustom();
				custom.setAvgtime(0);
				if(countList.size()==0){
					countList.add(custom);
					countList.add(custom);
				}else{
					if(countList.get(0).getQuerydate().indexOf("上半年")>0){
						countList.add(custom);
					}else{
						countList.add(0, custom);
					}
				}
				
			}
		}
		map.put("consultationlist", list);
		map.put("countList", countList);
		return map;
	}
	
	
	/**
	 * 门药时间报表
	 */
	public Map<String, List<HspemginfCustom>> findaverageDrugList(HspemginfQueryDto hspemginfQueryDto) throws Exception{
		Map<String, List<HspemginfCustom>> map = new HashMap<String, List<HspemginfCustom>>();
		
		hspemginfQueryDto.setEnddate(hspemginfQueryDto.getStartdate());
		//柱状图
		List<HspemginfCustom> columnList = zyyHspemginfCustomMapper.findaverageDrugColumnList(hspemginfQueryDto);
		//饼图
		List<HspemginfCustom>  pieList = zyyHspemginfCustomMapper.findaverageDrugPieList(hspemginfQueryDto);
		//平均时间
		List<HspemginfCustom> countList = zyyHspemginfCustomMapper.findaverageDrugAvgTimeList(hspemginfQueryDto);
		
		//处理list中数据
		if(columnList !=null && columnList.size()>0) {
			columnList = returnInter(columnList);
		}
		map.put("columnList", columnList);
		map.put("pieList", pieList);
		map.put("countList", countList);
		return map;
	}
	
	
	
	/**
	 * 门药、门球报表处理list中数据
	 * @param list
	 * @return
	 */
	public List<HspemginfCustom> returnInter(List<HspemginfCustom> list) {
		//list排序 根据取值范围排序
		Collections.sort(list, new Comparator<HspemginfCustom>() {
			@Override
			public int compare(HspemginfCustom o1, HspemginfCustom o2) {
				return Integer.valueOf(o1.getInter())-Integer.valueOf(o2.getInter());
			}
		});
		for (HspemginfCustom hspemginfCustom : list) {
			//如果a1则是<10
			if("1".equals(hspemginfCustom.getInter())) {
				hspemginfCustom.setInter("<10");
			}else if("2".equals(hspemginfCustom.getInter())) {
				hspemginfCustom.setInter("10-30");
			}else if("3".equals(hspemginfCustom.getInter())) {
				hspemginfCustom.setInter("30-60");
			}else if("4".equals(hspemginfCustom.getInter())) {
				hspemginfCustom.setInter("60-90");
			}else if("5".equals(hspemginfCustom.getInter())) {
				hspemginfCustom.setInter(">90");
			}
		}
		return list;
	}

	




	@Override
	public HspemginfCustom findDocNurseRatio(HspemginfQueryDto hspemginfQueryDto) {
		return zyyHspemginfCustomMapper.findDocNurseRatio(hspemginfQueryDto);
	}



	@Override
	public HspemginfCustom findFjhcfqjsl(HspemginfQueryDto hspemginfQueryDto) {
		if("year".equals(hspemginfQueryDto.getQuerytype())){
			hspemginfQueryDto.setEnddate(DateUtil.getNextYear(hspemginfQueryDto.getStartdate(), "yyyy"));
		}else if("month".equals(hspemginfQueryDto.getQuerytype())){
			hspemginfQueryDto.setEnddate(DateUtil.getNextMonth(hspemginfQueryDto.getStartdate()));
		}else if("day".equals(hspemginfQueryDto.getQuerytype())){
			hspemginfQueryDto.setEnddate(DateUtil.getNextDay(hspemginfQueryDto.getStartdate()));
		}
		return zyyHspemginfCustomMapper.findFjhcfqjsl(hspemginfQueryDto);
	}



	@Override
	public List<HspemginfCustom> findFjhcfqjslList(
			HspemginfQueryDto hspemginfQueryDto) {
		if("year".equals(hspemginfQueryDto.getQuerytype())){
			hspemginfQueryDto.setEnddate(DateUtil.getNextYear(hspemginfQueryDto.getStartdate(), "yyyy"));
		}else if("month".equals(hspemginfQueryDto.getQuerytype())){
			hspemginfQueryDto.setEnddate(DateUtil.getNextMonth(hspemginfQueryDto.getStartdate()));
		}else if("day".equals(hspemginfQueryDto.getQuerytype())){
			hspemginfQueryDto.setEnddate(DateUtil.getNextDay(hspemginfQueryDto.getStartdate()));
		}
		return zyyHspemginfCustomMapper.findFjhcfqjslList(hspemginfQueryDto);
	}
	/**
	 * 分诊人员统计
	 */
	@Override
	public Map<String, List<HspemginfCustom>> triagePersonList(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		List<HspemginfCustom> list = zyyHspemginfCustomMapper.triagePersonList(hspemginfQueryDto);
		Map<String,List<HspemginfCustom>> map = new HashMap<String,List<HspemginfCustom>>();
		map.put("list", list);
		return map;
	}
	@Override
	public List<HspBasyInfCustom> getcountFromHspBasyInf(HspBasyInfQueryDto hspBasyInfQueryDto) throws Exception {
		//声明list  存储查询到的数据
		List<HspBasyInfCustom> list = new ArrayList<HspBasyInfCustom>();
		//查询方式为病种
		if("bz".equals(hspBasyInfQueryDto.getQuerytype())) {
			list = hspBasyInfCustomMapper.getcountFromHspBasyInfToBz(hspBasyInfQueryDto);
			//遍历数据集合，添加info数据
			for (int i = 0; i < list.size(); i++) {
				Dstdictinfo dstDictInfo = systemConfigService.findDictinfoByInfocode("BZ_COD", list.get(i).getName());	
				list.get(i).setInfo(dstDictInfo.getInfo());
			}
		//查询方式为操作技术
		}else if("czjs".equals(hspBasyInfQueryDto.getQuerytype())) {
			list = hspBasyInfCustomMapper.getcountFromHspBasyInfToCzjs(hspBasyInfQueryDto);
			//遍历数据集合，添加info数据
			for (int i = 0; i < list.size(); i++) {
				Dstdictinfo dstDictInfo = systemConfigService.findDictinfoByInfocode("CZJS_COD", list.get(i).getName());	
				list.get(i).setInfo(dstDictInfo.getInfo());
			}
		}	
		return list;
	}
	
	@Override
	public List<HspHlpgbCustom> getcountFromHspHlpgb(HspHlpgbQueryDto hspHlpgbQueryDto) throws Exception {
		//声明list  存储查询到的数据
		List<HspHlpgbCustom> list = new ArrayList<HspHlpgbCustom>();
		//查询方式为病种
		list = hspHlpgbCustomMapper.getcountFromHspHlpgbToBz(hspHlpgbQueryDto);
		//遍历数据集合，添加info数据
		for (int i = 0; i < list.size(); i++) {
			Dstdictinfo dstDictInfo = systemConfigService.findDictinfoByInfocode("HLBZ_COD", list.get(i).getName());	
			list.get(i).setInfo(dstDictInfo.getInfo());
		}
		//查询方式为操作技术
		return list;
	}
	
	/**
	 * 手术操作统计
	 */
	@Override
	public Map<String, List<HspOperateInfCustom>> operationList(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		List<HspOperateInfCustom> list = zyyHspemginfCustomMapper.operationList(hspemginfQueryDto);
		Map<String,List<HspOperateInfCustom>> map = new HashMap<String,List<HspOperateInfCustom>>();
		map.put("list", list);
		return map;
	}
	
	@Override
	public int queryEmgCountBySscz(HspOperateInfCustom hspOperateInfCustom) {
		return zyyHspemginfCustomMapper.queryEmgCountBySscz(hspOperateInfCustom);
	}
	@Override
	public List<HspOperateInfCustom> queryEmgListBySscz(HspOperateInfCustom hspOperateInfCustom) {
		return zyyHspemginfCustomMapper.queryEmgListBySscz(hspOperateInfCustom);
	}
	@Override
	public List<HspFrbrInfCustom> queryfrdjList(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int queryfrdjListCount(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int findBztjmxCount(HspemginfQueryDto hspemginfQueryDto) {
		return zyyHspemginfCustomMapper.findBztjmxCount(hspemginfQueryDto);
	}
	@Override
	public int findQjcshzmxCount(HspemginfQueryDto hspemginfQueryDto) {
		return zyyHspemginfCustomMapper.findQjcshzmxCount(hspemginfQueryDto);
	}
	@Override
	public List<HspemginfCustom> getfindBztjmxList(HspemginfQueryDto hspemginfQueryDto) {
		return zyyHspemginfCustomMapper.getfindBztjmxList(hspemginfQueryDto);
	}
	@Override
	public List<HspemginfCustom> getfindQjcshzmxList(HspemginfQueryDto hspemginfQueryDto) {
		return zyyHspemginfCustomMapper.getfindQjcshzmxList(hspemginfQueryDto);
	}
	@Override
	public int findCzjstjmxCount(HspemginfQueryDto hspemginfQueryDto) {
		return zyyHspemginfCustomMapper.findCzjstjmxCount(hspemginfQueryDto);
	}
	@Override
	public List<HspemginfCustom> getfindCzjstjmxList(HspemginfQueryDto hspemginfQueryDto) {
		return zyyHspemginfCustomMapper.getfindCzjstjmxList(hspemginfQueryDto);
	}
	@Override
	public int findHszbztjmxCount(HspemginfQueryDto hspemginfQueryDto) {
		return zyyHspemginfCustomMapper.findHszbztjmxCount(hspemginfQueryDto);
	}
	@Override
	public List<HspemginfCustom> getfindHszbztjmxList(HspemginfQueryDto hspemginfQueryDto) {
		return zyyHspemginfCustomMapper.getfindHszbztjmxList(hspemginfQueryDto);
	}
	@Override
	public List<HspemginfCustom> getDytjList(HspemginfQueryDto hspemginfQueryDto) {
		//声明list  存储查询到的数据
		List<HspemginfCustom> list = new ArrayList<HspemginfCustom>();
		//查询方式为驾驶员
		if("jsy".equals(hspemginfQueryDto.getQuerytype())) {
			hspemginfQueryDto.setQuerytype("ABN_DRIVER");
		//查询方式为120医生
		}else if("ys".equals(hspemginfQueryDto.getQuerytype())) {
			hspemginfQueryDto.setQuerytype("ABN_DOCTOR");
		}
		list = zyyHspemginfCustomMapper.getDytjFromHspEmgInf(hspemginfQueryDto);
		return list;
	}
	@Override
	public int findDytjmxCount(HspemginfQueryDto hspemginfQueryDto) {
		return zyyHspemginfCustomMapper.findDytjmxCount(hspemginfQueryDto);
	}
	@Override
	public List<HspemginfCustom> getfindDytjmxList(HspemginfQueryDto hspemginfQueryDto) {
		return zyyHspemginfCustomMapper.getfindDytjmxList(hspemginfQueryDto);
	}

}
