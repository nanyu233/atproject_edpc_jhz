package activetech.eicu.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.SystemConfigService;
import activetech.edpc.dao.mapper.HspCsabcInfMapper;
import activetech.edpc.dao.mapper.HspCscpnInfMapper;
import activetech.edpc.pojo.domain.HspCsabcInf;
import activetech.edpc.pojo.domain.HspCsabcInfExample;
import activetech.edpc.pojo.domain.HspCscpnInf;
import activetech.edpc.pojo.domain.HspCscpnInfExample;
import activetech.eicu.dao.mapper.IcuGradeDefCustomMapper;
import activetech.eicu.dao.mapper.IcuGradeDefMapper;
import activetech.eicu.dao.mapper.IcuGradeRiskMapper;
import activetech.eicu.dao.mapper.IcuGradeSubitemMapper;
import activetech.eicu.dao.mapper.IcuGradeTotalMapper;
import activetech.eicu.dao.mapper.IcuMenuDefCustomMapper;
import activetech.eicu.dao.mapper.IcuScoreCustomMapper;
import activetech.eicu.dao.mapper.IcuVsDefMapper;
import activetech.eicu.pojo.domain.IcuGradeDef;
import activetech.eicu.pojo.domain.IcuGradeSubitem;
import activetech.eicu.pojo.domain.IcuGradeSubitemExample;
import activetech.eicu.pojo.domain.IcuGradeTotal;
import activetech.eicu.pojo.domain.IcuGradeTotalExample;
import activetech.eicu.pojo.domain.IcuGradeTotalExample.Criteria;
import activetech.eicu.pojo.domain.IcuVsDef;
import activetech.eicu.pojo.domain.IcuVsDefExample;
import activetech.eicu.pojo.dto.IcuGradeRiskCustom;
import activetech.eicu.pojo.dto.IcuGradeSubitemCustom;
import activetech.eicu.pojo.dto.IcuGradeTotalCustom;
import activetech.eicu.pojo.dto.IcuMenuDefCustom;
import activetech.eicu.pojo.dto.IcuScoreQueryDto;
import activetech.eicu.service.IcuScoreService;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import activetech.zyyhospital.dao.mapper.HspHlpgbMapper;
import activetech.zyyhospital.pojo.domain.HspHlpgb;

public class IcuScoreServiceImpl implements IcuScoreService{
	@Autowired
	private IcuGradeTotalMapper icuGradeTotalMapper;
	@Autowired
	private IcuGradeSubitemMapper icuGradeSubitemMapper;
	@Autowired
	private IcuScoreCustomMapper icuScoreCustomMapper;
	@Autowired
	private IcuGradeDefMapper icuGradeDefMapper;
	@Autowired
	private IcuGradeDefCustomMapper icuGradeDefCustomMapper;
	@Autowired
	private IcuVsDefMapper icuVsDefMapper;
	@Autowired
	private IcuGradeRiskMapper icuGradeRiskMapper;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private IcuMenuDefCustomMapper icuMenuDefCustomMapper;
	@Autowired
	private HspHlpgbMapper hspHlpgbMapper;	
	@Autowired
	private HspCsabcInfMapper hspCsabcInfMapper;
	@Autowired
	private HspCscpnInfMapper hspCscpnInfMapper;
	/**
	 * 获取对应评分的列表数据
	 */
	@Override
	public List<IcuGradeTotalCustom> queryGradeList(IcuScoreQueryDto icuScoreQueryDto) throws Exception {
		return icuScoreCustomMapper.queryGradeList(icuScoreQueryDto);
	}
	/**
	 * 
	 */
	@Override
	public Map<String,Object> findGradeInfo(IcuScoreQueryDto icuScoreQueryDto) throws Exception {
		Map<String,Object> map = new HashMap<String,Object>();
		if("doc".equals(icuScoreQueryDto.getFlag())) {
			//护理单类型
			IcuGradeTotalExample example = new IcuGradeTotalExample();
			Criteria criteria = example.createCriteria();
			criteria.andLiveNoEqualTo(icuScoreQueryDto.getLiveNo());
			criteria.andGradeSeqEqualTo(icuScoreQueryDto.getGradeSeq());
			criteria.andGradeTypeEqualTo(icuScoreQueryDto.getGradeType());
			List<IcuGradeTotal> list = icuGradeTotalMapper.selectByExampleWithBLOBs(example);
			if(list.size() != 0) {
				map.put("totalInfo", list.get(0));
				return map;
			}
			return null;
		} else {
			//普通评分类型  gcs vte apache等
			List<String> typeList = new ArrayList<String>();
			if(null != icuScoreQueryDto.getGradeSeq()) {
				IcuGradeTotalCustom totalInfo = icuScoreCustomMapper.findTotalInfo(icuScoreQueryDto);
				map.put("totalInfo", totalInfo);
			}
			
			if("VTE1".equals(icuScoreQueryDto.getGradeType())) {
				typeList = Arrays.asList("CAPRINI","VTE_SECOND","VTE_THIRD");
			}else if("VTE2".equals(icuScoreQueryDto.getGradeType())) {
				typeList = Arrays.asList("PADUA","VTE_SECOND","VTE_THIRD");
			} else {
				typeList.add(icuScoreQueryDto.getGradeType());
			}
			icuScoreQueryDto.setTypeList(typeList);
			
			List<IcuGradeSubitem> itemlist = icuScoreCustomMapper.querySubItemListByItemDef(icuScoreQueryDto);
			map.put("itemlist", itemlist);
		}
		return map;
	}
	
	@Override
	public String editGradSco(IcuScoreQueryDto icuScoreQueryDto, ActiveUser activeUser) throws Exception {
		IcuGradeTotalCustom gradeTotalCustom = icuScoreQueryDto.getIcuGradeTotalCustom();
		if(!StringUtils.isNotNullAndEmptyByTrim(gradeTotalCustom.getLiveNo())) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920, new Object[] {"住院号不能为空"}));
		}
		
		String uuid = gradeTotalCustom.getGradeSeq();
		if(!StringUtils.isNotNullAndEmptyByTrim(uuid)) {
			uuid = UUIDBuild.getUUID();
		}
		String gradeType = gradeTotalCustom.getGradeType();
		
		gradeTotalCustom.setGradeSeq(uuid); 
		gradeTotalCustom.setCrtUser(activeUser.getUsrno());
		gradeTotalCustom.setModUser(activeUser.getUsrno()); 
		icuScoreCustomMapper.addOrEditGradeTotal(gradeTotalCustom);
		
		if(gradeTotalCustom.getHtmlText() != null) {
			IcuGradeTotal upHtml = new IcuGradeTotal();
			upHtml.setHtmlText(gradeTotalCustom.getHtmlText());
			
			IcuGradeTotalExample example = new IcuGradeTotalExample();
			Criteria criteria = example.createCriteria();
			criteria.andGradeSeqEqualTo(uuid);
			icuGradeTotalMapper.updateByExampleSelective(upHtml, example);
		//	icuGradeTotalMapper.updateByExampleWithBLOBs(gradeTotalCustom, example);
		}
		
		List<IcuGradeSubitemCustom> itemList = icuScoreQueryDto.getItemList();
		
		//删除所有评分子项
		IcuGradeSubitemExample subExample = new IcuGradeSubitemExample();
		IcuGradeSubitemExample.Criteria subCriteria = subExample.createCriteria();
		subCriteria.andGradeSeqEqualTo(uuid);
		if("VTE1".equals(gradeType)) {
			subCriteria.andGradeTypeIn(Arrays.asList("CAPRINI","VTE_SECOND","VTE_THIRD"));
		} else if("VTE2".equals(gradeType)) {
			subCriteria.andGradeTypeIn(Arrays.asList("PADUA","VTE_SECOND","VTE_THIRD"));
		} else {
			subCriteria.andGradeTypeEqualTo(gradeType);
		}
		icuGradeSubitemMapper.deleteByExample(subExample);
		
		if(itemList != null) {
			for (IcuGradeSubitemCustom subItem : itemList) {
				subItem.setGradeSeq(uuid);
				if(!StringUtils.isNotNullAndEmptyByTrim(subItem.getGradeType())) {
					subItem.setGradeType(gradeType);
				}
				
				icuGradeSubitemMapper.insert(subItem);
			}
		}
		return uuid;
	}
	/**
	 * 删除评分
	 */
	@Override
	public void delGradeScore(IcuScoreQueryDto icuScoreQueryDto) throws Exception {
		if(!StringUtils.isNotNullAndEmptyByTrim(icuScoreQueryDto.getGradeSeq())) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920, new Object[] {"评分序号为空,无法删除"}));
		}			
		
		IcuGradeTotalExample totalexample = new IcuGradeTotalExample();
		IcuGradeTotalExample.Criteria totalCriteria = totalexample.createCriteria();
		totalCriteria.andLiveNoEqualTo(icuScoreQueryDto.getLiveNo());
		totalCriteria.andGradeSeqEqualTo(icuScoreQueryDto.getGradeSeq());
		totalCriteria.andGradeTypeEqualTo(icuScoreQueryDto.getGradeType());
		icuGradeTotalMapper.deleteByExample(totalexample);
		
		IcuGradeSubitemExample subitemExample = new IcuGradeSubitemExample();
		IcuGradeSubitemExample.Criteria itemCriteria = subitemExample.createCriteria();
		itemCriteria.andGradeSeqEqualTo(icuScoreQueryDto.getGradeSeq());
		if("VTE1".equals(icuScoreQueryDto.getGradeType())) {
			itemCriteria.andGradeTypeIn(Arrays.asList("CAPRINI","VTE_SECOND","VTE_THIRD"));
		} else if("VTE2".equals(icuScoreQueryDto.getGradeType())) {
			itemCriteria.andGradeTypeIn(Arrays.asList("PADUA","VTE_SECOND","VTE_THIRD"));
		} else {
			itemCriteria.andGradeTypeEqualTo(icuScoreQueryDto.getGradeType());
		}
		
		icuGradeSubitemMapper.deleteByExample(subitemExample);
		
		//删除关联记录
		if(icuScoreQueryDto.getGradeSeq().contains("H-")){
			//清空护理评估单对应数据
			HspHlpgb hspHlpgb=hspHlpgbMapper.selectByPrimaryKey(icuScoreQueryDto.getLiveNo());
			if(hspHlpgb!=null){
				if(icuScoreQueryDto.getGradeType().equals("GCS")){
					hspHlpgb.setGcsSeq(null);
				}else if(icuScoreQueryDto.getGradeType().equals("BRADEN")){
					hspHlpgb.setBradenSeq(null);;
				}else if(icuScoreQueryDto.getGradeType().equals("ADL")){
					hspHlpgb.setAdlSeq(null);;
				}else if(icuScoreQueryDto.getGradeType().equals("FALL")){
					hspHlpgb.setFalldSeq(null);
				}
				
				hspHlpgbMapper.updateByPrimaryKey(hspHlpgb);
			}
			
		}else if(icuScoreQueryDto.getGradeSeq().contains("CSABC-")){
			//删除创伤中心ABCDE数据
			HspCsabcInfExample example = new HspCsabcInfExample();
			HspCsabcInfExample.Criteria criteria = example.createCriteria();
			//criteria.andAbcSeqEqualTo(abcSeq);
			criteria.andEmgSeqEqualTo(icuScoreQueryDto.getLiveNo());
			criteria.andFldValEqualTo(icuScoreQueryDto.getGradeSeq());				
			hspCsabcInfMapper.deleteByExample(example);
		}
		else if(icuScoreQueryDto.getGradeSeq().contains("CSCPN-")){
			//删除创伤中心体格检查数据
			HspCscpnInfExample example = new HspCscpnInfExample();
			HspCscpnInfExample.Criteria criteria = example.createCriteria();
			criteria.andEmgSeqEqualTo(icuScoreQueryDto.getLiveNo());
			criteria.andFldValEqualTo(icuScoreQueryDto.getGradeSeq());
			hspCscpnInfMapper.deleteByExample(example);
		}
	}
	/**
	 * 获取最近6次或根据时间获取评分数据(时间不存在则获取最近6次数据)
	 */
	@Override
	public Map<String, Object> queryScoreInfo(IcuScoreQueryDto icuScoreQueryDto) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		//获取6次总数据(头数据)
		List<IcuGradeTotalCustom> gradeList = icuScoreCustomMapper.queryGradeHead(icuScoreQueryDto);
		
		//获取6次数据
		List<IcuGradeSubitemCustom> itemList = icuScoreCustomMapper.queryGradeItemList(icuScoreQueryDto);
		Map<String, List<IcuGradeSubitemCustom>> itemMap = new HashMap<String,List<IcuGradeSubitemCustom>>();
		for (IcuGradeSubitemCustom subItem : itemList) {
			if(!itemMap.containsKey(subItem.getGradeSeq())) {
				List<IcuGradeSubitemCustom> list = new ArrayList<IcuGradeSubitemCustom>();
				itemMap.put(subItem.getGradeSeq(), list);
			}
			itemMap.get(subItem.getGradeSeq()).add(subItem);
		}
		
		for (IcuGradeTotalCustom gradeTot : gradeList) {
			gradeTot.setItemList(itemMap.get(gradeTot.getGradeSeq()));
		}
		//反转
		Collections.reverse(gradeList);
		map.put("gradeList", gradeList);
		return map;
	}
	
	/**
	 * 获取评分项目定义表
	 * @throws Exception 
	 */
	@Override
	public Map<String, Object> getGradeItemDef(String gradeType) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		List<String> gradeTypeList = new ArrayList<String>();
		if("VTE1".equals(gradeType)) {
			gradeTypeList = Arrays.asList("CAPRINI","VTE_SECOND","VTE_THIRD");
		} else if("VTE2".equals(gradeType)) {
			gradeTypeList = Arrays.asList("PADUA","VTE_SECOND","VTE_THIRD");
		} else {
			gradeTypeList.add(gradeType);
		}
		
		//获取评分项目定义
		List<IcuGradeDef> list = icuGradeDefCustomMapper.getGradeItemDef(gradeTypeList);
		
		if(!Arrays.asList("APACHE","VTE1","VTE2","INICU","OUTICU","BP").contains(gradeType)){
			List<IcuGradeDef> orderList = new ArrayList<IcuGradeDef>();
			//获取分数数据
			for (IcuGradeDef itemDef : list) {
				if(null != itemDef.getScoreCol()) {
					orderList.add(itemDef);
				}
			}
			
			//所有的分值
			//去重 排序  排序规则（长度，acsii）
			if(orderList.size() != 0) {
				Set<IcuGradeDef> scoreset = new TreeSet<IcuGradeDef>(new Comparator<IcuGradeDef>() {
					@Override
					public int compare(IcuGradeDef a, IcuGradeDef b) {
						if(a.getScoreCol() < b.getScoreCol()) {
							return -1;
						} else if(a.getScoreCol() > b.getScoreCol()) {
							return 1;
						} else {
							//a.getScoreValue().compareTo(b.getScoreValue())
							return 0;
						}
					}
				});
				scoreset.addAll(orderList);
				map.put("scoreList", scoreset);
			}
		}
		
		map.put("itemDef", list);
		return map;
	}
	/**
	 * 获取评分评估最新的评分情况 icu_menu_def ovflag = 1
	 */
	@Override
	public Map<String, Object> queryTotalScoByMenu(IcuScoreQueryDto icuScoreQueryDto) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		List<IcuGradeTotalCustom> gradeList = icuScoreCustomMapper.queryTotalScoByMenu(icuScoreQueryDto);
		if(!"basic".equals(icuScoreQueryDto.getFlag())) {
			Map<String, List<IcuGradeTotalCustom>> gradeMap = new HashMap<String, List<IcuGradeTotalCustom>>();
			List<String> typeList = new ArrayList<String>();
			for (IcuGradeTotalCustom gradeTot : gradeList) {
				if(!typeList.contains(gradeTot.getGradeType())) {
					typeList.add(gradeTot.getGradeType());
				}
				if(!gradeMap.containsKey(gradeTot.getGradeType())) {
					List<IcuGradeTotalCustom> tmpList = new ArrayList<IcuGradeTotalCustom>();
					gradeMap.put(gradeTot.getGradeType(), tmpList);
				}
				if(StringUtils.isNotNullAndEmptyByTrim(gradeTot.getLiveNo())) {
					gradeMap.get(gradeTot.getGradeType()).add(gradeTot);
				}
			}
			map.put("gradeMap", gradeMap);
			map.put("typeList", typeList);
		} else {
			map.put("gradeList", gradeList);
		}
		return map;
	}
	
	/**
	 * 获取患者评估单中定义的评分类型
	 * @return
	 * @throws Exception
	 */
	private List<String> getVsDefGradeType() throws Exception {
		IcuVsDefExample defExample = new IcuVsDefExample();
		IcuVsDefExample.Criteria defCriteria = defExample.createCriteria();
		defCriteria.andVsTypeEqualTo("CE");
		defCriteria.andRsltModeEqualTo("modal");
		List<IcuVsDef> list = icuVsDefMapper.selectByExample(defExample);
		List<String> result = new ArrayList<String>();
		for (IcuVsDef icuVsDef : list) {
			result.add(icuVsDef.getVsCode());
		}
		return result;
	}
	
	/**
	 * 获取评分总项信息
	 */
	@Override
	public IcuGradeTotal queryGradeTotBySeq(IcuGradeTotal gradeTot) throws Exception {
		IcuGradeTotalExample example = new IcuGradeTotalExample();
		Criteria criteria = example.createCriteria();
		criteria.andLiveNoEqualTo(gradeTot.getLiveNo());
		criteria.andGradeSeqEqualTo(gradeTot.getGradeSeq());
		criteria.andGradeTypeEqualTo(gradeTot.getGradeType());
		List<IcuGradeTotal> list = icuGradeTotalMapper.selectByExampleWithBLOBs(example);
		if(list.size() != 0) {
			return list.get(0);
		}
		return null;
	}
	
	/**
	 * 获取评分风险度列表
	 */
	@Override
	public Map<String, List<IcuGradeRiskCustom>> queryGradeRisk(String gradeType) throws Exception {
		
		List<IcuGradeRiskCustom> riskList = icuScoreCustomMapper.queryGradeRisk(gradeType);
		
		Map<String,List<IcuGradeRiskCustom>> map = new HashMap<String, List<IcuGradeRiskCustom>>();
		for (IcuGradeRiskCustom risk : riskList) {
			if(!map.containsKey(risk.getGradeType())) {
				List<IcuGradeRiskCustom> temp = new ArrayList<IcuGradeRiskCustom>();
				map.put(risk.getGradeType(), temp);
			}
			map.get(risk.getGradeType()).add(risk);
		}
		return map;
	}
	
	/**
	 * 获取icu功能菜单
	 */
	@Override
	public List<IcuMenuDefCustom> findIcuCustMenu(String moduleId) throws Exception{
		/*List<IcuMenuDefCustom> menuList = icuMenuDefCustomMapper.findIcuCustMenu();
		return menuList;*/
		if(!StringUtils.isNotNullAndEmptyByTrim(moduleId)) {
			moduleId = "200001";
		}
		List<IcuMenuDefCustom> menuList = icuMenuDefCustomMapper.findIcuCustMenu(moduleId);
		//递归
		IcuMenuDefCustom rootDef = null;
		for (IcuMenuDefCustom menuDefCustom : menuList) {
			if(moduleId.equals(menuDefCustom.getMenuRoot())) {
				rootDef = menuDefCustom;
			}
		}
		findChildren(rootDef, menuList);
		return menuList;
	}
	private void findChildren(IcuMenuDefCustom rootDef, List<IcuMenuDefCustom> menuList) {
		for (IcuMenuDefCustom menuDef : menuList) {
			if (rootDef.getMenuId().equals(menuDef.getMenuRoot())) {
				menuDef.setIdRoot(rootDef.getMenuId());
				menuDef.setNameRoot(rootDef.getMenuName());
				findChildren(menuDef, menuList);
			}
		}
	}
	@Override
	public IcuGradeTotalCustom editGradeScoWithOth(IcuScoreQueryDto icuScoreQueryDto, ActiveUser activeUser)
			throws Exception {
		IcuGradeTotalCustom gradeTotalCustom = icuScoreQueryDto.getIcuGradeTotalCustom();
		if(!StringUtils.isNotNullAndEmptyByTrim(gradeTotalCustom.getLiveNo())) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920, new Object[] {"住院号不能为空"}));
		}
		
		//生成专用系统评估号
		Date createdate = new Date();
		String dateStr = DateUtil.formatDateByFormat(createdate, "yyyyMMdd");
		String xtpgSeq=systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
				
		String uuid = gradeTotalCustom.getGradeSeq();
		if(!StringUtils.isNotNullAndEmptyByTrim(uuid)) {
			if(StringUtils.isNotNullAndEmptyByTrim(icuScoreQueryDto.getEnterSource())){
				xtpgSeq = icuScoreQueryDto.getEnterSource()+"-"+xtpgSeq;
				uuid = xtpgSeq;
			}else{
				uuid = UUIDBuild.getUUID();				
			}
		}
		String gradeType = gradeTotalCustom.getGradeType();
		
		gradeTotalCustom.setGradeSeq(uuid); 
		gradeTotalCustom.setCrtUser(activeUser.getUsrno());
		gradeTotalCustom.setModUser(activeUser.getUsrno()); 
		icuScoreCustomMapper.addOrEditGradeTotal(gradeTotalCustom);
		
		if(gradeTotalCustom.getHtmlText() != null) {
			IcuGradeTotal upHtml = new IcuGradeTotal();
			upHtml.setHtmlText(gradeTotalCustom.getHtmlText());
			
			IcuGradeTotalExample example = new IcuGradeTotalExample();
			Criteria criteria = example.createCriteria();
			criteria.andGradeSeqEqualTo(uuid);
			icuGradeTotalMapper.updateByExampleSelective(upHtml, example);
		//	icuGradeTotalMapper.updateByExampleWithBLOBs(gradeTotalCustom, example);
		}
		
		List<IcuGradeSubitemCustom> itemList = icuScoreQueryDto.getItemList();
		
		//删除所有评分子项
		IcuGradeSubitemExample subExample = new IcuGradeSubitemExample();
		IcuGradeSubitemExample.Criteria subCriteria = subExample.createCriteria();
		subCriteria.andGradeSeqEqualTo(uuid);
		if("VTE1".equals(gradeType)) {
			subCriteria.andGradeTypeIn(Arrays.asList("CAPRINI","VTE_SECOND","VTE_THIRD"));
		} else if("VTE2".equals(gradeType)) {
			subCriteria.andGradeTypeIn(Arrays.asList("PADUA","VTE_SECOND","VTE_THIRD"));
		} else {
			subCriteria.andGradeTypeEqualTo(gradeType);
		}
		icuGradeSubitemMapper.deleteByExample(subExample);
		
		if(itemList != null) {
			for (IcuGradeSubitemCustom subItem : itemList) {
				subItem.setGradeSeq(uuid);
				if(!StringUtils.isNotNullAndEmptyByTrim(subItem.getGradeType())) {
					subItem.setGradeType(gradeType);
				}
				
				icuGradeSubitemMapper.insert(subItem);
			}
		}
		
		//判断入口并更新关联表字段
		if(StringUtils.isNotNullAndEmptyByTrim(icuScoreQueryDto.getEnterSource())){
			//生成专用系统评估号
			if(icuScoreQueryDto.getEnterSource().equals("H")){//护理评估单
				updateHlpg(uuid,gradeTotalCustom);
			}else if(icuScoreQueryDto.getEnterSource().equals("CSABC")){
				updateCSABC(gradeTotalCustom,icuScoreQueryDto,createdate,activeUser);
			}else if(icuScoreQueryDto.getEnterSource().equals("CSCPN")){
				updateCSCPN(gradeTotalCustom,icuScoreQueryDto,createdate,activeUser);
			}
		}
		
		return gradeTotalCustom;
	}
	
	private void updateHlpg(String uuid,IcuGradeTotalCustom gradeTotalCustom){
		HspHlpgb hspHlpgb=hspHlpgbMapper.selectByPrimaryKey(gradeTotalCustom.getLiveNo());				
		if(hspHlpgb!=null){	
			if(gradeTotalCustom.getGradeType().equals("GCS")){
				hspHlpgb.setGcsSeq(uuid);
			}else if(gradeTotalCustom.getGradeType().equals("BRADEN")){
				hspHlpgb.setBradenSeq(uuid);
			}else if(gradeTotalCustom.getGradeType().equals("ADL")){
				hspHlpgb.setAdlSeq(uuid);
			}else if(gradeTotalCustom.getGradeType().equals("FALL")){
				hspHlpgb.setFalldSeq(uuid);;
			}
			hspHlpgbMapper.updateByPrimaryKey(hspHlpgb);
		}else{
			hspHlpgb=new HspHlpgb();
			if(gradeTotalCustom.getGradeType().equals("GCS")){
				hspHlpgb.setGcsSeq(uuid);
			}else if(gradeTotalCustom.getGradeType().equals("BRADEN")){
				hspHlpgb.setBradenSeq(uuid);
			}else if(gradeTotalCustom.getGradeType().equals("ADL")){
				hspHlpgb.setAdlSeq(uuid);
			}else if(gradeTotalCustom.getGradeType().equals("FALL")){
				hspHlpgb.setFalldSeq(uuid);;
			}
			hspHlpgb.setEmgSeq(gradeTotalCustom.getLiveNo());
			hspHlpgbMapper.insert(hspHlpgb);
		}
	}
	
	private void updateCSABC(IcuGradeTotalCustom gradeTotalCustom,IcuScoreQueryDto icuScoreQueryDto,Date createdate,ActiveUser activeUser){
		//创伤中心				
		//先删除原有的记录。
		HspCsabcInfExample example = new HspCsabcInfExample();
		HspCsabcInfExample.Criteria criteria = example.createCriteria();	
		criteria.andEmgSeqEqualTo(gradeTotalCustom.getLiveNo());
		criteria.andFldCodEqualTo(icuScoreQueryDto.getFldCod());
		hspCsabcInfMapper.deleteByExample(example);
		//插入
		HspCsabcInf hspCsabcInf = new HspCsabcInf();
		hspCsabcInf.setCrtTim(createdate);
		hspCsabcInf.setEmgSeq(gradeTotalCustom.getLiveNo());
		hspCsabcInf.setUsrNo(activeUser.getUsrno());
		hspCsabcInf.setUsrNme(activeUser.getUsrname());
		hspCsabcInf.setFldVal(gradeTotalCustom.getGradeSeq());
		hspCsabcInf.setFldCod(icuScoreQueryDto.getFldCod());
		hspCsabcInf.setAbcSeq(UUIDBuild.getUUID());
		hspCsabcInfMapper.insert(hspCsabcInf);
	}
	
	private void updateCSCPN(IcuGradeTotalCustom gradeTotalCustom,IcuScoreQueryDto icuScoreQueryDto,Date createdate,ActiveUser activeUser){
		//创伤中心				
		// 先删除原有的记录。
		HspCscpnInfExample example = new HspCscpnInfExample();
		HspCscpnInfExample.Criteria criteria = example.createCriteria();
		criteria.andEmgSeqEqualTo(gradeTotalCustom.getLiveNo());
		criteria.andFldCodEqualTo(icuScoreQueryDto.getFldCod());
		hspCscpnInfMapper.deleteByExample(example);
		//插入
		HspCscpnInf hspCscpnInf = new HspCscpnInf();
		hspCscpnInf.setEmgSeq(gradeTotalCustom.getLiveNo());
		hspCscpnInf.setCrtTim(createdate);
		hspCscpnInf.setUsrNo(activeUser.getUsrno());
		hspCscpnInf.setUsrNme(activeUser.getUsrname());
		hspCscpnInf.setFldVal(gradeTotalCustom.getGradeSeq());
		hspCscpnInf.setFldCod(icuScoreQueryDto.getFldCod());
		hspCscpnInfMapper.insert(hspCscpnInf);
	}
	
	@Override
	public List<IcuGradeTotalCustom> getIcuGradeTotalByLiveNo(IcuScoreQueryDto icuScoreQueryDto) throws Exception{
		return icuScoreCustomMapper.queryGradeListByLiveNo(icuScoreQueryDto);
	}
	
}
