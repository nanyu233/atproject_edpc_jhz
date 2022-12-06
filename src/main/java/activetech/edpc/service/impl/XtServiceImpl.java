package activetech.edpc.service.impl;

import activetech.aid.dao.mapper.AidPatientMapper;
import activetech.aid.dao.mapper.AidPatientXtMapper;
import activetech.aid.pojo.domain.AidPatient;
import activetech.aid.pojo.domain.AidPatientXt;
import activetech.base.dao.mapper.DstarchivesMapper;
import activetech.base.dao.mapper.HspAddrPostMapper;
import activetech.base.pojo.domain.Dstarchives;
import activetech.base.pojo.domain.DstarchivesExample;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.SystemConfigService;
import activetech.edpc.dao.mapper.*;
import activetech.edpc.pojo.domain.*;
import activetech.edpc.pojo.dto.*;
import activetech.edpc.service.CrfplaneService;
import activetech.edpc.service.ExternalDataService;
import activetech.edpc.service.XtService;
import activetech.external.dao.mapper.HspEcgInfMapper;
import activetech.external.dao.mapper.VHemsJcjgMapperCustom;
import activetech.external.dao.mapper.VHemsJyjgMapper;
import activetech.external.dao.mapper.VHemsJyjgMapperCustom;
import activetech.external.pojo.domain.*;
import activetech.hospital.dao.mapper.HspEmgInfMapper;
import activetech.hospital.dao.mapper.HspMewsInfMapper;
import activetech.hospital.pojo.domain.HspEmgInf;
import activetech.hospital.pojo.domain.HspMewsInf;
import activetech.util.DateUtil;
import activetech.websocket.action.WebSocketXT;
import activetech.zyyhospital.dao.mapper.HspConsultationRecordsMapper;
import activetech.zyyhospital.pojo.domain.HspConsultationRecords;
import activetech.zyyhospital.pojo.domain.HspConsultationRecordsExample;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.*;
import java.util.stream.Collectors;

public class XtServiceImpl implements XtService{
	
	@Autowired
	private CpcMapper cpcMapper;
	
	@Autowired
	private HspFlowChartInfMapper hspFlowChartInfMapper;
	
	@Autowired
	private HspXtzlInfCustomMapper hspXtzlInfCustomMapper;
	
	@Autowired
	private HspXtzlInfMapper hspXtzlInfMapper;
	
	@Autowired
	private ExternalDataService externalDataService;
	
	@Autowired
	private HspFlowChartDefMapper hspFlowChartDefMapper;
	
	@Autowired
	private HspEmgInfMapper hspEmgInfMapper;
	
	@Resource
	private VHemsJyjgMapper vHemsJyjgMapper;
	
	@Autowired
	private VHemsJcjgMapperCustom vHemsJcjgMapperCustom;

	@Autowired
	private HspGraceInfMapper hspGraceInfMapper;
	
	@Autowired
	private HspEcgInfMapper hspEcgInfMapper;
	
	@Autowired
	private VHemsJyjgMapperCustom vHemsJyjgMapperCustom;
	
	@Autowired
	private HspCrivelInfMapper hspCrivelInfMapper;
	
	@Autowired
	private HspCrivelInfMapperCustom hspCrivelInfMapperCustom;
	
	@Autowired
	private HspXtAddMapper hspXtAddMapper;
	
	@Autowired
	private DstarchivesMapper dstarchivesMapper;
	
	@Autowired
	private HspConsultationRecordsMapper hspConsultationRecordsMapper;
	
	@Autowired
	private HspMewsInfMapper hspMewsInfMapper;
	
	@Autowired
	private VHemsJyjgHzMapper vHemsJyjgHzMapper;

	@Autowired
	private AidPatientMapper aidPatientMapper;
	
	@Autowired
	private AidPatientXtMapper aidPatientXtMapper;

	@Autowired
	private HspAddrPostMapper hspAddrPostMapper;

	@Autowired
	private HspDbzlBasMapper hspDbzlBasMapper;

	@Autowired
	private HspDbzlBasMapperCustom hspDbzlBasMapperCustom;

	@Autowired
	private SystemConfigService systemConfigService;

	@Autowired
	private CrfplaneService cpcCrfplaneService;
	@Autowired
	private HspTimDiffMapper hspTimDiffMapper;
	@Autowired
	private HspTimDiffCustomMapper hspTimDiffCustomMapper;
	@Autowired
	private HspTimDiffHisMapper hspTimDiffHisMapper;

	@Override
	public ResultInfo getCpcPatientInfoList(QueryDto queryDto) {
		ResultInfo resultInfo = null;
		List<HspDbzlBasCustom> list = cpcMapper.getCpcPatientInfoList(queryDto);
		if(list.size()>0){
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
			Map<String,Object> map = new HashMap<>();
			map.put("list", list);
			resultInfo.setSysdata(map);
		}else{
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 902, null);
		}
		
		return resultInfo;
	}

	@Override
	public ResultInfo getCpcPatientRouteInfoByEmgSeq(String emgSeq) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String,Object> map = new HashMap<>();
		//	第一步从cpc_route表获取该病人的关键点组成的路径
		HspFlowChartInfExample example = new HspFlowChartInfExample();
		HspFlowChartInfExample.Criteria criteria = example.createCriteria();
		criteria.andEmgSeqEqualTo(emgSeq);
		criteria.andFlowTypeEqualTo("xt");
		List<HspFlowChartInf> list = hspFlowChartInfMapper.selectByExample(example);
		map.put("list", list);

		List<String> paramList = new ArrayList<>();
		
		// 首次医疗接触时间
		paramList.add(ProCodeDef.SCYLJCSJ);
		
		// cTNI报告时间  
		// paramList.add(ProCodeDef.JGDBBGSJ);
		
		// 抗血小板药物给药时间 
		paramList.add(ProCodeDef.KXXBYWGYSJ);
		// 启动导管室 
		paramList.add(ProCodeDef.QDDGSSJ);
		// 导管室激活（可以手术）时间
		paramList.add(ProCodeDef.DGSJHSJ);
		
		// 导丝通过时间 
		// paramList.add(ProCodeDef.DSTGSJ);
		
		List<HspXtzlInf> hspXtzlInfList	= hspXtzlInfCustomMapper.getHspXtzlInfByEmgSeqAndProCodeList(emgSeq,paramList);
		
		HspEcgInfExample ecgExample = new HspEcgInfExample();
		HspEcgInfExample.Criteria ecgCriteria = ecgExample.createCriteria();
		ecgExample.setOrderByClause("file_date");
		ecgCriteria.andRefIdEqualTo(emgSeq);
		// 11代表院内心电图
		ecgCriteria.andEcgTypeEqualTo("11");
		List<HspEcgInf> ecgList = hspEcgInfMapper.selectByExample(ecgExample);
		HspEcgInf hspEcgInf = null;
		if(ecgList.size()>0) {
			hspEcgInf = ecgList.get(0);
		}else {
			hspEcgInf = new HspEcgInf();
		}
		
		HspXtzlInf ynsfxdtsj = new HspXtzlInf();
		ynsfxdtsj.setEmgNo(emgSeq);
		ynsfxdtsj.setProCode(ProCodeDef.YNSFXDTSJ);
		ynsfxdtsj.setProVal(DateUtil.formatDateByFormat(hspEcgInf.getFileDate(), DateUtil.DATETIME_FORMAT) );
		hspXtzlInfList.add(ynsfxdtsj);
		
		HspXtzlInf ynsfxdtqzsj = new HspXtzlInf();
		ynsfxdtqzsj.setEmgNo(emgSeq);
		ynsfxdtqzsj.setProCode(ProCodeDef.YNSFXDTQZSJ);
		ynsfxdtqzsj.setProVal(DateUtil.formatDateByFormat(hspEcgInf.getFileDiaDate(), DateUtil.DATETIME_FORMAT) );
		hspXtzlInfList.add(ynsfxdtqzsj);
		
		
		
		String jgdbbgsj = vHemsJyjgMapperCustom.getJgdbDate(emgSeq);
		
		if(jgdbbgsj!=null) {
			HspXtzlInf jgdbbgsjHspXtzlInf = new HspXtzlInf();
			jgdbbgsjHspXtzlInf.setEmgNo(emgSeq);
			jgdbbgsjHspXtzlInf.setProCode(ProCodeDef.JGDBBGSJ);
			jgdbbgsjHspXtzlInf.setProVal(jgdbbgsj);
			hspXtzlInfList.add(jgdbbgsjHspXtzlInf);
		}
		
		// 导丝通过时间
		HspCrivelInfExample hspCrivelInfExample = new HspCrivelInfExample();
		hspCrivelInfExample.setOrderByClause("dstgsj");
		HspCrivelInfExample.Criteria hspCrivelInfcriteria = hspCrivelInfExample.createCriteria();
		hspCrivelInfcriteria.andEmgSeqEqualTo(emgSeq);
		hspCrivelInfcriteria.andDstgsjIsNotNull();
		List<HspCrivelInf> hspCrivelInfList = hspCrivelInfMapper.selectByExample(hspCrivelInfExample);
		if(hspCrivelInfList.size()>0) {
			HspXtzlInf hspCrivelInfHspXtzlInf = new HspXtzlInf();
			hspCrivelInfHspXtzlInf.setEmgNo(emgSeq);
			hspCrivelInfHspXtzlInf.setProCode(ProCodeDef.DSTGSJ);
			hspCrivelInfHspXtzlInf.setProVal(
					DateUtil.formatDateByFormat(hspCrivelInfList.get(0).getDstgsj(), DateUtil.DATETIME_FORMAT));
			hspXtzlInfList.add(hspCrivelInfHspXtzlInf);
		}
		
		map.put("hspXtzlInfList", hspXtzlInfList);
		
		resultInfo.setSysdata(map);
		return resultInfo;
	}

	@Override
	public ResultInfo getNodeInfoByEmgSeq(String emgSeq, String nodeId) {
		ResultInfo resultInfo = null;
		resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String,Object> map = new HashMap<String,Object>();
		// 实验室检查
		if(FlowChartNodeDef.SYSJC.equals(nodeId)) {
			
		}else if(FlowChartNodeDef.XDT.equals(nodeId)) {
			
		}else if(FlowChartNodeDef.YXXJC.equals(nodeId)) {

			
			String mpi = "";
			String jzxh = "";
			// 1获取 mpi 和jzxh
			if(emgSeq!=null) {
				HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(emgSeq);
				mpi = hspEmgInf.getMpi();
				if(hspEmgInf.getJzxh()!=null) {
					jzxh = hspEmgInf.getJzxh().toString();
				}
			}else if(jzxh!=null) {
				// HspXtAdd hspXtAdd = hspXtAddMapper.selectByPrimaryKey(xtSeq);
				// mpi = hspXtAdd.getMpi;
				// jzxh = hspXtAdd.getJzxh;
			}
			
			if(StringUtils.isNotEmpty(mpi) && StringUtils.isNotEmpty(jzxh)) {
				// 获取检查结果
				VHemsJcjgExample example = new VHemsJcjgExample();
				VHemsJcjgExample.Criteria criteria = example.createCriteria();
				criteria.andMpiEqualTo(mpi);
				criteria.andSeekMedicalTimesEqualTo(jzxh);
				List<VHemsJcjg> jcjgList = vHemsJcjgMapperCustom.selectByExample(example);
				map.put("jcjgList", jcjgList);
				
				
				// 获取检验结果
				VHemsJyjgExample jyjgexample = new VHemsJyjgExample();
				VHemsJyjgExample.Criteria jyjgcriteria = jyjgexample.createCriteria();
				jyjgcriteria.andMpiEqualTo(mpi);
				jyjgcriteria.andSeekMedicalTimesEqualTo(jzxh);
				jyjgexample.setDistinct(true);
				jyjgexample.setOrderByClause("XH");
				List<VHemsJyjg> jyjgList = vHemsJyjgMapper.selectByExample(jyjgexample);
				
				// 根据大项分组,判断条件为report_item_name为null
				JSONArray jsonArray = new JSONArray();
				if(jyjgList.size()>0) {
					for(VHemsJyjg vHemsJyjg:jyjgList) {
						if(vHemsJyjg.getReportItemName()==null) {
							JSONObject jsonObject = new JSONObject();
							jsonObject.put("examinaim", vHemsJyjg.getExaminaim());
							jsonObject.put("resultDateTime", vHemsJyjg.getResultDateTime());
							jsonObject.put("sampleno", vHemsJyjg.getSampleno());
							jsonObject.put("data", new JSONArray());
							jsonArray.add(jsonObject);
						}
					}
					for(VHemsJyjg vHemsJyjg:jyjgList) {				
						if(vHemsJyjg.getReportItemName()!=null) {
							for(int i=0; i<jsonArray.size();i++) {
								if(jsonArray.getJSONObject(i).get("sampleno").equals(vHemsJyjg.getSampleno())) {
									JSONObject jsonObject = new JSONObject();
									jsonObject.put("result", vHemsJyjg.getResult());
									jsonObject.put("upperLimit", vHemsJyjg.getUpperLimit());
									jsonObject.put("lowerLimit", vHemsJyjg.getLowerLimit());
									jsonObject.put("reportItemName", vHemsJyjg.getReportItemName());
									jsonObject.put("units", vHemsJyjg.getUnits());
									jsonObject.put("errorFlag", vHemsJyjg.getErrorFlag());
									jsonArray.getJSONObject(i).getJSONArray("data").add(jsonObject);
								}
							}
						}
					}
				}
				
					
				map.put("jyjgList", jsonArray);
				
				
				resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
				resultInfo.setSysdata(map);
			}else {
				resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, new Object[] {
						"未找到符合要求的数据"
				});
			}
			
			
		}else if(FlowChartNodeDef.DGS.equals(nodeId)) {
			
		}else{
			List<HspXtzlInfCustom> list = hspXtzlInfCustomMapper.getHspXtzlInfByEmgSeqAndStep(emgSeq, nodeId);
			map.put("list", list);
		}
		
		resultInfo.setSysdata(map);
		return resultInfo;
	}

	@Override
	public ResultInfo findXtPatientWithCod(XtHspEmgInfQueryDto xtHspEmgInfQueryDto) {
		List<String> busSteps = new ArrayList<String>();
		for (HspXtzlInfCustom HspXtzlInfCustom : xtHspEmgInfQueryDto.getXtzlInfs()) {
			busSteps.add(HspXtzlInfCustom.getBusStep());
		}
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, Object> sysdata = new HashMap<String, Object>();
		List<HspXtzlInfCustom> list = hspXtzlInfCustomMapper.findXtPatientWithCod(busSteps, xtHspEmgInfQueryDto.getEmgSeq());
		sysdata.put("list",list);
		resultInfo.setSysdata(sysdata);
		return resultInfo;
	}

	@Override
	public DataGridResultInfo getXtPatientList(HspDbzlBasQueryDto hspDbzlBasQueryDto){
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		int total = hspDbzlBasMapperCustom.countXtPatientList(hspDbzlBasQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, hspDbzlBasQueryDto.getRows(), hspDbzlBasQueryDto.getPage());
		hspDbzlBasQueryDto.setPageQuery(pageQuery);
		List<HspDbzlBasCustom> list = hspDbzlBasMapperCustom.getXtPatientList(hspDbzlBasQueryDto);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(total);
		return dataGridResultInfo;
	}

	@Override
	public ResultInfo judgeNewPatient(String emgSeq){
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		HspDbzlBasCustom hspDbzlBasCustom=hspDbzlBasMapperCustom.selectByEmgSeq(emgSeq);
		Map<String, Object> sysdata = new HashMap<String, Object>();
		sysdata.put("hspDbzlBasCustom",hspDbzlBasCustom);
		resultInfo.setSysdata(sysdata);
		return resultInfo;
	}

	@Override
	public ResultInfo addNewPatient(HspDbzlBasQueryDto hspDbzlBasQueryDto,ActiveUser activeUser) {

//		String resultJson=HttpClientUtil.doPostJson("http://localhost:8100/emis/sysIntergrating/receiveVHemsJyjg.do", emgSeq);
//		if(StringUtils.isNotNullAndEmptyByTrim(resultJson)){
//			HspDbzlBasCustom hspDbzlBasCustom=JSON.parseObject(resultJson,HspDbzlBasCustom.class);
//			}
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, Object> sysdata = new HashMap<String, Object>();
		if(Objects.nonNull(hspDbzlBasQueryDto)) {
			HspDbzlBasCustom hspDbzlBasCustom = hspDbzlBasQueryDto.getHspDbzlBasCustom();
			HspDbzlBasCustom dbzl = hspDbzlBasMapperCustom.selectByEmgSeq(hspDbzlBasCustom.getEmgSeq());
			if(Objects.nonNull(dbzl)){
				dbzl.setModNo(activeUser.getUsrno());
				dbzl.setModNam(activeUser.getUsrname());
				dbzl.setModTim(new Date());
				dbzl.setCstNam(hspDbzlBasCustom.getCstNam());
				dbzl.setCstSexCod(hspDbzlBasCustom.getCstSexCod());
				dbzl.setCstAge(hspDbzlBasCustom.getCstAge());
				hspDbzlBasMapper.updateByPrimaryKey(dbzl);
			}else{
				String regseq=systemConfigService.findSequences("HSP_DBZL_BAS_REG_SEQ", "8", null);
				hspDbzlBasCustom.setRegSeq(regseq);
				hspDbzlBasCustom.setCrtNam(activeUser.getUsrname());
				hspDbzlBasCustom.setCrtNo(activeUser.getUsrno());
				hspDbzlBasCustom.setCrtTim(new Date());
				hspDbzlBasCustom.setPatTyp("1");
				hspDbzlBasCustom.setWayTyp("2");
				hspDbzlBasCustom.setSwChl("0");
				hspDbzlBasCustom.setGrnChl("0");
				//正式环境区别分诊时间和院内新增
				HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(hspDbzlBasCustom.getEmgSeq());
				hspDbzlBasCustom.setRegTim(hspEmgInf.getEmgDat());
				hspDbzlBasMapper.insert(hspDbzlBasCustom);
			}
		}

		return resultInfo;
	}
	
	@Override
	public ResultInfo xtPatietSubmitBatch(List<HspXtzlInfCustom> xtzlInfs,String emgSeq,ActiveUser activeUser) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		externalDataService.mergeFzInf(xtzlInfs, emgSeq, activeUser.getUsrno());
		String d2w = externalDataService.getD2W(emgSeq);
		HspXtzlInfCustom hspXtzlInfCustom = new HspXtzlInfCustom();
		hspXtzlInfCustom.setProCode("DDYYDMSJ");
		hspXtzlInfCustom.setProVal(d2w);
		hspXtzlInfCustom.setEmgNo(emgSeq);
		hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);
		return resultInfo;
	}

	@Override
	public ResultInfo xtPatietBasicInfSubmit(HspDbzlBasQueryDto hspDbzlBasQueryDto, ActiveUser activeUser){
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		hspDbzlBasQueryDto.getHspDbzlBasCustom().setModNo(activeUser.getUsrno());
		hspDbzlBasMapperCustom.updateHspDbzlBasByRegSeq(hspDbzlBasQueryDto);
		return resultInfo;
	}

	@Override
	public ResultInfo getXtTimeLine(String emgSeq) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, Object> sysdata = new HashMap<String, Object>();
		List<HspXtzlInfCustom> list = hspXtzlInfCustomMapper.getCpcTimeline(emgSeq);
		for (HspXtzlInfCustom hspXtzlInfCustom:list) {
			if(hspXtzlInfCustom.getProCode().equals("ASPLSJ")){
				HspXtzlInfCustom hspXtzlInfCustom2=new HspXtzlInfCustom();
				hspXtzlInfCustom2.setEmgNo(hspXtzlInfCustom.getEmgNo());
				hspXtzlInfCustom2.setProName("抗血小板用药");
				hspXtzlInfCustom2.setProVal(hspXtzlInfCustom.getProVal());
				list.add(hspXtzlInfCustom2);
				break;
			}
		}
		//FIXME 重复次数太多 创建院内心电图时间
		HspEcgInfExample ecgExample = new HspEcgInfExample();
		HspEcgInfExample.Criteria ecgCriteria = ecgExample.createCriteria();
		ecgExample.setOrderByClause("file_date");
		ecgCriteria.andRefIdEqualTo(emgSeq);
		// 11代表院内心电图
		ecgCriteria.andEcgTypeEqualTo("11");
		List<HspEcgInf> ecgList = hspEcgInfMapper.selectByExample(ecgExample);
		if(ecgList.size()>0) {
			HspEcgInf hspEcgInf = ecgList.get(0);
			if(hspEcgInf.getFileDate()!=null) {
				HspXtzlInfCustom ynsfxdtsj = new HspXtzlInfCustom();
				ynsfxdtsj.setEmgNo(emgSeq);
				ynsfxdtsj.setProName("院内首份心电图时间");
				ynsfxdtsj.setProCode(ProCodeDef.YNSFXDTSJ);
				ynsfxdtsj.setProVal(DateUtil.formatDateByFormat(hspEcgInf.getFileDate(), DateUtil.DATETIME_FORMAT) );
				list.add(ynsfxdtsj);
			}
			if(hspEcgInf.getFileDiaDate()!=null) {
				HspXtzlInfCustom ynsfxdtqzsj = new HspXtzlInfCustom();
				ynsfxdtqzsj.setEmgNo(emgSeq);
				ynsfxdtqzsj.setProName("院内首份心电图确诊时间");
				ynsfxdtqzsj.setProCode(ProCodeDef.YNSFXDTQZSJ);
				ynsfxdtqzsj.setProVal(DateUtil.formatDateByFormat(hspEcgInf.getFileDiaDate(), DateUtil.DATETIME_FORMAT) );
				list.add(ynsfxdtqzsj);
			}
		}
		// FIXME 肌酐蛋白报告时间 || 暂未持久到诊疗表中，先保留后期持久化之后删除这段
		String jgdbbgsj = vHemsJyjgMapperCustom.getJgdbDate(emgSeq);
		if(jgdbbgsj!=null) {
			HspXtzlInfCustom jgdbbgsjHspXtzlInf = new HspXtzlInfCustom();
			jgdbbgsjHspXtzlInf.setEmgNo(emgSeq);
			jgdbbgsjHspXtzlInf.setProName("肌钙蛋白报告时间");
			jgdbbgsjHspXtzlInf.setProCode(ProCodeDef.JGDBBGSJ);
			jgdbbgsjHspXtzlInf.setProVal(jgdbbgsj);
			list.add(jgdbbgsjHspXtzlInf);
		}
		// FIXME 结束
		//排序 lambda优化
		list.sort(Comparator.comparing(HspXtzlInf::getProVal));
		sysdata.put("list", list);
		resultInfo.setSysdata(sysdata); 
		return resultInfo;
	}

	@Override
	public ResultInfo getHspFlowChartDef(String flowType) {
		
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		
		HspFlowChartDefExample example = new HspFlowChartDefExample();
		
		HspFlowChartDefExample.Criteria criteria = example.createCriteria();
		criteria.andFlowTypeEqualTo(flowType);
		
		List<HspFlowChartDef> list = hspFlowChartDefMapper.selectByExample(example);
		
		Map<String, Object> sysdata = new HashMap<String, Object>();
		
		sysdata.put("list",list);
		
		resultInfo.setSysdata(sysdata);
		
		return resultInfo;

	}
	
	@Override
	public ResultInfo getHspGraceInf(HspGraceInf hspGraceInf) {
		
		ResultInfo resultInfo = null;
		
		String emgSeq = hspGraceInf.getEmgSeq();
		HspGraceInfExample example = new HspGraceInfExample();
		HspGraceInfExample.Criteria criteria = example.createCriteria();
		criteria.andEmgSeqEqualTo(emgSeq);
		criteria.andGraceTypeEqualTo(hspGraceInf.getGraceType());
		List<HspGraceInf> list = hspGraceInfMapper.selectByExample(example);
		if(list.size()>0) {
			Map<String, Object> sysdata = new HashMap<>();
			sysdata.put("hspGraceInf", list.get(0));
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
			resultInfo.setSysdata(sysdata);
		}else {
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, new Object[]{"未找到符合要求的数据"});
		}
		
		return resultInfo;
	}
	
	@Override
	public ResultInfo addFzxg(HspXtzlInfCustom hspXtzlInfCustom, ActiveUser activeUser) {

		ResultInfo resultInfo = null;

		HspCrivelInf record = new HspCrivelInf();
		record.setEmgSeq(hspXtzlInfCustom.getEmgNo());
		int ret = hspCrivelInfMapperCustom.insertSelective(record);
		if (ret == 1) {
			hspXtzlInfCustom.setProVal(record.getVelSeq());
			hspXtzlInfCustom.setCrtUser(activeUser.getUsrno());
			hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);

			Map<String, Object> sysdata = new HashMap<>();
			sysdata.put("velSeq", record.getVelSeq());
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
			resultInfo.setSysdata(sysdata);
		} else {
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 900, null);
		}

		return resultInfo;
	}

	@Override
	public ResultInfo delFzxg(HspXtzlInf hspXtzlInf) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);

		// 1.删除hsp_crivel_inf表中的对应数据
		hspCrivelInfMapper.deleteByPrimaryKey(hspXtzlInf.getProVal());

		// 2.删除hsp_xtzl_inf表中的对应数据
		HspXtzlInfExample example = new HspXtzlInfExample();
		HspXtzlInfExample.Criteria criteria = example.createCriteria();
		criteria.andEmgNoEqualTo(hspXtzlInf.getEmgNo());
		criteria.andProCodeEqualTo(hspXtzlInf.getProCode());
		hspXtzlInfMapper.deleteByExample(example);

		return resultInfo;
	}

	@Override
	public ResultInfo updateHspCrivelInf(HspCrivelInf hspCrivelInf,ActiveUser activeUser) {
		ResultInfo resultInfo = null;

		/*
		   *   导丝通过时间是否是最小值，如果是的话，推送消息给页面
		 */
		String emgSeq = hspCrivelInf.getEmgSeq();

		// 入参的导丝通过时间
		Date argDstgsj = hspCrivelInf.getDstgsj();
		boolean isMinDstgsj = false;
		
		if(argDstgsj!=null) {
			// 入参的导丝通过时间是否是现有数据里最小的
			//HspCrivelInf dbhspCrivelInf = hspCrivelInfMapper.selectByPrimaryKey(hspCrivelInf.getVelSeq());
			HspCrivelInfExample example = new HspCrivelInfExample();
			example.setOrderByClause("dstgsj");
			HspCrivelInfExample.Criteria criteria = example.createCriteria();
			criteria.andEmgSeqEqualTo(emgSeq);
			criteria.andDstgsjIsNotNull();
			
			List<HspCrivelInf> list = hspCrivelInfMapper.selectByExample(example);
			
			if(list.size()>0) {
				HspCrivelInf _hspCrivelInf = list.get(0);
				// 数据库里最小的导丝通过时间
				Date dbDstgsj = _hspCrivelInf.getDstgsj();
				if(dbDstgsj!=null && argDstgsj.getTime() <= dbDstgsj.getTime()) {
					// 如果当前时间小于 最小的导丝通过时间 需要推送消息
					isMinDstgsj = true;
				}
			}else {
				isMinDstgsj = true;
			}
			// 如果入参是最小导丝通过时间，则发送推送消息
			if(isMinDstgsj) {
				
				try {
					Map<String,Object> map = new HashMap<>();
					map.put("emgSeq", emgSeq);
					map.put("time", DateUtil.formatDateByFormat(argDstgsj, DateUtil.DATETIME_FORMAT));
					map.put("messageCode",ProCodeDef.DSTGSJ);
					WebSocketXT.sendMessageToAllAwaiting(map);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}

		int ret = hspCrivelInfMapper.updateByPrimaryKeySelective(hspCrivelInf);
		
		if (ret == 1) {
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
			
			if(isMinDstgsj) {
				// 更新D2W 时间

				HspXtzlInfExample hspXtzlInfExample = new HspXtzlInfExample();
				hspXtzlInfExample.createCriteria().andEmgNoEqualTo(emgSeq);
				List<HspXtzlInf> hspXtzlInfs = hspXtzlInfMapper.selectByExample(hspXtzlInfExample);
				Map<String, String> mapXtzlInf = new HashMap();
				Date emgDat = null;
				for(HspXtzlInf node : hspXtzlInfs){
					mapXtzlInf.put(node.getProCode(), node.getProVal());
				}
				//根据到达方式不同来区分时间
				if(!StringUtils.isEmpty(mapXtzlInf.get("DYFS"))){
					if("1".equals(mapXtzlInf.get("DYFS"))){
						emgDat = DateUtil.parseDate(mapXtzlInf.get("DDYYDMSJ01"), "yyyy-MM-dd HH:mm");
					}
					if("2".equals(mapXtzlInf.get("DYFS"))){
						emgDat = DateUtil.parseDate(mapXtzlInf.get("DDYYDMSJ02"), "yyyy-MM-dd HH:mm");
					}
					if("3".equals(mapXtzlInf.get("DYFS"))){
						emgDat = DateUtil.parseDate(mapXtzlInf.get("DDYYDMSJ03"), "yyyy-MM-dd HH:mm");
					}
					if("4".equals(mapXtzlInf.get("DYFS"))){
						emgDat = DateUtil.parseDate(mapXtzlInf.get("SCYLJCSJ"), "yyyy-MM-dd HH:mm");
					}
				}

//				HspemginfCustom hspemginfCustomArg = new HspemginfCustom();
//				hspemginfCustomArg.setEmgSeq(emgSeq);
//				HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(emgSeq);
//				Date emgDat = hspEmgInf.getEmgDat();
//
				if(emgDat != null){
					HspXtzlInfCustom hspXtzlInfCustom = new HspXtzlInfCustom();
					hspXtzlInfCustom.setCrtUser(activeUser.getUsrno());
					hspXtzlInfCustom.setModUser(activeUser.getUsrno());
					hspXtzlInfCustom.setEmgNo(emgSeq);
					hspXtzlInfCustom.setProCode(ProCodeDef.D2WSJ);
					String d2wsj = DateUtil.getDateDiff_Minute(emgDat,argDstgsj).toString();
					hspXtzlInfCustom.setProVal(d2wsj);
					hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);

					Map<String,Object> sysdata = new HashMap<>();
					sysdata.put("dstgsj", argDstgsj);
					sysdata.put("d2wsj", d2wsj);
					resultInfo.setSysdata(sysdata);
				}
			}
		} else {
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 900, null);
		}
		return resultInfo;
	}
	
	@Override
	public ResultInfo getManualEcgInf(String emgSeq) {
		
		ResultInfo resultInfo = null;
		
		DstarchivesExample example = new DstarchivesExample();
		DstarchivesExample.Criteria criteria = example.createCriteria();
		criteria.andRefIdEqualTo(emgSeq);
		List<Dstarchives> list = dstarchivesMapper.selectByExample(example);
		if(list.size()>0) {
			Map<String, Object> sysdata = new HashMap<>();
			for(Dstarchives dstarchives:list) {
				sysdata.put(dstarchives.getFileType(), dstarchives);
			}
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
			resultInfo.setSysdata(sysdata);
		}else {
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, new Object[]{"未找到符合要求的数据"});
		}
		
		return resultInfo;
	}

	@Override
	public ResultInfo getHspEmgInfByEmgSeq(String emgSeq,String wayTyp) {
		
		ResultInfo resultInfo =  ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		
		Map<String, Object> sysdata = new HashMap<>();
		JSONObject object = new JSONObject();
		
		String mpi = "";
		
		String jzxh = "";
		
		if("0".equals(wayTyp)) {
			
			HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(emgSeq);
			HspMewsInf hspMewsInf = hspMewsInfMapper.selectByPrimaryKey(emgSeq);
			
			mpi = hspEmgInf.getMpi();
			
			jzxh = hspEmgInf.getJzxh()!=null? String.valueOf(hspEmgInf.getJzxh()):null;
			
			
			object.put("cstNam", hspEmgInf.getCstNam());
			object.put("cstSexCod", hspEmgInf.getCstSexCod());
			object.put("cstAge", hspEmgInf.getCstAge());
			object.put("arvChlCod", hspEmgInf.getArvChlCod());
			object.put("senRctCod", hspMewsInf.getSenRctCod());
			object.put("breNbr", hspMewsInf.getBreNbr());
			object.put("hrtRte", hspMewsInf.getHrtRte());
			object.put("sbpupNbr", hspMewsInf.getSbpupNbr());
			object.put("sbpdownNbr", hspMewsInf.getSbpdownNbr());
			object.put("oxyNbr", hspEmgInf.getOxyNbr());
			object.put("emgDat", hspEmgInf.getEmgDat());
			object.put("cstDspCod", hspEmgInf.getCstDspCod());
			object.put("mpi", hspEmgInf.getMpi());

			
		}else {
			HspXtAdd hspXtAdd = hspXtAddMapper.selectByPrimaryKey(emgSeq);
			if(hspXtAdd!=null) {
				mpi = hspXtAdd.getMpiNo();
				jzxh = hspXtAdd.getSadId();
			}

			object.put("cstNam", hspXtAdd.getCstNam());
			object.put("cstSexCod", hspXtAdd.getCstSexCod());
			object.put("cstAge", hspXtAdd.getCstAge());
			//object.put("arvChlCod", hspXtAdd.getWayTyp());
			object.put("senRctCod", hspXtAdd.getSenRct());
			object.put("breNbr", hspXtAdd.getBreNbr());
			object.put("hrtRte", hspXtAdd.getHrtRte());
			object.put("sbpupNbr", hspXtAdd.getSbpNbr());
			object.put("sbpdownNbr", hspXtAdd.getDbpNbr());
			object.put("oxyNbr", hspXtAdd.getBldOxy());
			object.put("mpi", hspXtAdd.getMpiNo());
			
			//呼吸 app 端没录入
			object.put("breNbr", hspXtAdd.getBreNbr());
		}
		if(mpi!=null && jzxh!=null) {
			VHemsJyjgHzExample example = new VHemsJyjgHzExample();
			VHemsJyjgHzExample.Criteria criteria = example.createCriteria();
			criteria.andMpiEqualTo(mpi);
			// criteria.andSeekMedicalTimesEqualTo(jzxh);
			// criteria.andExaminaimEqualTo("急诊心脏五联（POCT）");
			// 肌酐测定不在心脏五联内，去除限定
			List<VHemsJyjgHz> list = vHemsJyjgHzMapper.selectByExample(example);
			String d2jt = null;
			String bnp = null;
			String ctni = null;
			String cr = null;
			if(list.size()>0) {
				for(VHemsJyjgHz vHemsJyjgHz:list) {
					if("D-二聚体".equals(vHemsJyjgHz.getReportItemName())) {
						d2jt = vHemsJyjgHz.getResult();
					}else if("B型脑钠肽(急)".equals(vHemsJyjgHz.getReportItemName())) {
						bnp = vHemsJyjgHz.getResult();
					}else if("肌钙蛋白I".equals(vHemsJyjgHz.getReportItemName())) {
						ctni = vHemsJyjgHz.getResult();
					}else if("肌酐".equals(vHemsJyjgHz.getReportItemName())) {
						cr = vHemsJyjgHz.getResult();
					}
				}
				
			}
			object.put("d2jt", d2jt);
			object.put("bnp", bnp);
			object.put("ctni", ctni);
			object.put("cr", cr);
		}
		
		
		sysdata.put("hspEmgInf", object);
		
		
		resultInfo.setSysdata(sysdata);
		
		return resultInfo;
	}

	@Override
	public ResultInfo getHspXtzlInfByEmgSeq(String emgSeq) {
		
		ResultInfo resultInfo = null;
		
		
		// 胸痛诊疗表信息
		List<HspXtzlInfCustom> list = hspXtzlInfCustomMapper.getHspXtzlInfByEmgSeq(emgSeq);
		
		// GRACE 评分
		HspGraceInfExample example = new HspGraceInfExample();
		HspGraceInfExample.Criteria criteria = example.createCriteria();
		criteria.andEmgSeqEqualTo(emgSeq);
		List<HspGraceInf> hspGraceInflist = hspGraceInfMapper.selectByExample(example);
		
		// 犯罪血管
		HspCrivelInfExample hspCrivelInfExample = new HspCrivelInfExample();
		HspCrivelInfExample.Criteria hspCrivelInfCriteria = hspCrivelInfExample.createCriteria();
		hspCrivelInfCriteria.andEmgSeqEqualTo(emgSeq);
		List<HspCrivelInf> hspCrivelInfList = hspCrivelInfMapper.selectByExample(hspCrivelInfExample);
		
		// 院内首份心电图时间  和 院内首份心电图确诊时间
		
		HspEcgInfExample ecgExample = new HspEcgInfExample();
		HspEcgInfExample.Criteria ecgCriteria = ecgExample.createCriteria();
		ecgExample.setOrderByClause("file_date");
		ecgCriteria.andRefIdEqualTo(emgSeq);
		// 11代表院内心电图
		ecgCriteria.andEcgTypeEqualTo("11");
		List<HspEcgInf> ecgList = hspEcgInfMapper.selectByExample(ecgExample);
		HspEcgInf hspEcgInf = null;
		if(ecgList.size()>0) {
			hspEcgInf = ecgList.get(0);
		}else {
			hspEcgInf = new HspEcgInf();
		}
		Date ynsfxdtsj = hspEcgInf.getFileDate();
		Date ynsfxdtqzsj = hspEcgInf.getFileDiaDate();
		
		
		
		
        // 会诊时间
		Date invitationDate = null;
		Date consulationDate = null;
		
		HspConsultationRecordsExample hspConsultationRecordsExample = new HspConsultationRecordsExample();
		HspConsultationRecordsExample.Criteria hcrCriteria = hspConsultationRecordsExample.createCriteria();
		hcrCriteria.andEmgSeqCrEqualTo(emgSeq);
		// 约定只显示心内科的
		hspConsultationRecordsExample.setOrderByClause("invitation_date");
		
		List<HspConsultationRecords> hcrList = hspConsultationRecordsMapper.selectByExample(hspConsultationRecordsExample);
		if (hcrList.size() > 0) {
			HspConsultationRecords real = null;
			boolean re = true;
			for(HspConsultationRecords hspConsultationRecords :hcrList) {
				String invitationDep = hspConsultationRecords.getInvitationDep();
				if(invitationDep.indexOf("心血管")>=0
					|| invitationDep.indexOf("心内科")>=0) {
					real = hspConsultationRecords;
					re = false;
					break;
				}
			}
			
			if(re) {
				real = hcrList.get(0);
			}
			
			invitationDate = real.getInvitationDate();
			consulationDate = real.getConsultationDate();
		} 
	
		if(list.size()>0) {
			Map<String, Object> sysdata = new HashMap<>();
			sysdata.put("list", list);
			
			sysdata.put("hspGraceInf", hspGraceInflist);
			
			sysdata.put("hspCrivelInf", hspCrivelInfList.size()>0?hspCrivelInfList.get(0):null);
			
			sysdata.put("invitationDate", invitationDate);
			
			sysdata.put("consulationDate", consulationDate);
			
			sysdata.put("ynsfxdtsj", ynsfxdtsj);
			
			sysdata.put("ynsfxdtqzsj", ynsfxdtqzsj);
			
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
			resultInfo.setSysdata(sysdata);
		}else {
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, new Object[]{"未找到符合要求的数据"});
		}
		
		return resultInfo;
	}

	@Override
	// FIXME 异常 确定不需要可以删除
	public ResultInfo getAidPatientByEmgSeq(String emgSeq, String wayTyp) {
		
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String,Object> sysdata = new HashMap<>();
		JSONObject json = new JSONObject();
		if("0".equals(wayTyp)) {
			// 分诊
			// 判断来院方式，如果是120的，需要填院前
			HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(emgSeq);
			AidPatient aidPatient = aidPatientMapper.selectByPrimaryKey(hspEmgInf.getPatid());
			AidPatientXt aidPatientXt = aidPatientXtMapper.selectByPrimaryKey(hspEmgInf.getPatid());
			sysdata.put("aidPatient", aidPatient);
			sysdata.put("aidPatientXt", aidPatientXt);
		}else if("1".equals(wayTyp)) {
			// 绕行
			HspXtAdd hspXtAdd = hspXtAddMapper.selectByPrimaryKey(emgSeq);
			AidPatient aidPatient = aidPatientMapper.selectByPrimaryKey(emgSeq);
			AidPatientXt aidPatientXt = aidPatientXtMapper.selectByPrimaryKey(emgSeq);
			sysdata.put("aidPatient", aidPatient);
			sysdata.put("aidPatientXt", aidPatientXt);
		}else if("2".equals(wayTyp)) {
			// 院内发病
			HspXtAdd hspXtAdd = hspXtAddMapper.selectByPrimaryKey(emgSeq);
			// 发病科室 不用翻译了，保存的中文
//			String illDep = null;
//			if(hspXtAdd.getIllDep()!=null) {
//				DstcompctlCustom dstcompctlCustom = dstcompctlCustomMapper.selectCompctlByComno(hspXtAdd.getIllDep());
//				illDep = dstcompctlCustom.getComcname();
//			}
			
			json.put("illDep", hspXtAdd.getIllDep());
			// 床位医生接触时间
			json.put("fstTim", hspXtAdd.getFstTim());
			// 离开科室时间
			json.put("lveTim", hspXtAdd.getLveTim());
			// 发病时间
			json.put("illTim", hspXtAdd.getIllTim());
			
			
			
			sysdata.put("ynfb", json);
			
		}
		resultInfo.setSysdata(sysdata);
		return resultInfo;
	}

	private static final Map<String,String>  COMP_MAP =new HashMap<String, String>();
	//初始化对应关系 会有很多,不易维护和管理
	static {
		initCompMap(COMP_MAP);
	}

   // TODO 初始化对应关系 字段修改，或者新增映射
	@SuppressWarnings("SpellCheckingInspection")
	public static void initCompMap (Map<String,String> COMP_MAP){
		//院前 120 网络医院
		COMP_MAP.put("COMP.18.000000","jzxh");//就诊id
		COMP_MAP.put("COMP.18.000001","zyxh");//住院id
		COMP_MAP.put("COMP.18.000002","YBLX");//医保类型
		COMP_MAP.put("COMP.18.000003","cstNam");//姓名
		COMP_MAP.put("COMP.18.000004","cstSexCod");//性别
		COMP_MAP.put("COMP.18.000006","cstAge");//年龄
		COMP_MAP.put("COMP.18.000007","FBDZ01");//发病地址-省
		COMP_MAP.put("COMP.18.000008","FBDZ02");//发病地址-市
		COMP_MAP.put("COMP.18.000009","FBDZ03");//发病地址-县
		COMP_MAP.put("COMP.18.000010","FBSJ");//发病时间
		COMP_MAP.put("COMP.18.000011","HJSJ");//呼救时间
		COMP_MAP.put("COMP.18.000012","SCYLJCSJ");//首次医疗接触时间
		COMP_MAP.put("COMP.18.000013","ZCYYRMSJ");//网络医院入门时间
		COMP_MAP.put("COMP.18.000014","ZCYJCMSJ");//转诊出门时间：
		COMP_MAP.put("COMP.18.000015","fileDateYq");//院前首份心电图时间
		COMP_MAP.put("COMP.18.000016","fileDiaDateYq");//院前首份心电图确诊时间
		COMP_MAP.put("COMP.18.000017","YCXDTCS");//远程传输心电图
		COMP_MAP.put("COMP.18.000018","fileTrsDateYq");//传输时间
		COMP_MAP.put("COMP.18.000019","CSFS");//传输方式
		COMP_MAP.put("COMP.18.000020","KXXBZL");//双联抗血小板药物给药
		COMP_MAP.put("COMP.18.000021","ASPLSJ");//给药时间
		COMP_MAP.put("COMP.18.000022","ASPLJL");//阿司匹林
		COMP_MAP.put("COMP.18.000023","TGRLJL");//替格瑞洛
		COMP_MAP.put("COMP.18.000024","LBGLJL"); //氯吡格雷
		COMP_MAP.put("COMP.18.000025","YQRSSC");//院前溶栓筛查
		COMP_MAP.put("COMP.18.000026","YQRSZL");//是否实施院前溶栓
		COMP_MAP.put("COMP.18.000027","YQRSCS");//溶栓场所
		COMP_MAP.put("COMP.18.000028","YQKSZQTYSJ");//院前溶栓知情同意开始时间
		COMP_MAP.put("COMP.18.000029","YQQSZQTYSSJ");//签署知情同意时间
		COMP_MAP.put("COMP.18.000030","YQKSRSSJ");//院前溶栓开始时间
		COMP_MAP.put("COMP.18.000031","YQRSJSSJ");//院前溶栓结束时间
		COMP_MAP.put("COMP.18.000032","YQRSHZYSJ");//溶栓后造影时间
		COMP_MAP.put("COMP.18.000033","YQRSYW");//院前溶栓药物
		COMP_MAP.put("COMP.18.000034","YQRSYWJL");//院前溶栓药物剂量:
		COMP_MAP.put("COMP.18.000035","YQRSZT");//溶栓再通
		COMP_MAP.put("COMP.18.000036","YQZD");//诊断
		//急诊预检
		COMP_MAP.put("COMP.19.000001","cstNam");//姓名
		COMP_MAP.put("COMP.19.000002","cstSexCod");//性别
		COMP_MAP.put("COMP.19.000003","cstAge");//年龄
		COMP_MAP.put("COMP.19.000004","FBDZ01");//发病地址-省
		COMP_MAP.put("COMP.19.000005","FBDZ02");//发病地址-市
		COMP_MAP.put("COMP.19.000006","FBDZ03");//发病地址-县
		COMP_MAP.put("COMP.18.000039","FBSJ");//发病时间
		COMP_MAP.put("COMP.18.000040","FBSJEDIT");//到达医院大门时间 --字段是虚拟字段，不在定义表里面
		COMP_MAP.put("COMP.18.000041","regTim");//院内接诊时间|分诊时间
		COMP_MAP.put("COMP.18.000042","DYFS");//到达方式
		COMP_MAP.put("COMP.18.000043","FBKS");//发病科室
		COMP_MAP.put("COMP.18.000044","CWYSJCSJ");//床位医生会诊时间
		COMP_MAP.put("COMP.18.000045","LKKSSJ");//离开科室时间
		COMP_MAP.put("COMP.18.000046","YISHI");//意识
		COMP_MAP.put("COMP.18.000047","HUXI");//呼吸
		COMP_MAP.put("COMP.18.000048","MAIB");//脉搏
		COMP_MAP.put("COMP.18.000049","XINL");//心率
		COMP_MAP.put("COMP.18.000050","XUEY");//血压
		//胸痛诊室
		COMP_MAP.put("COMP.18.000051","fileDateYn");//院内首份心电图时间
		COMP_MAP.put("COMP.18.000052","fileDiaDateYn");//院内首份心电图确诊时间
		COMP_MAP.put("COMP.18.000053","BQPG");//病情评估
		COMP_MAP.put("COMP.18.000054","BQPGMX");//病情评估情况
		COMP_MAP.put("COMP.18.000055","CXSJ");//肌钙蛋白抽血时间
		COMP_MAP.put("COMP.18.000056","POCTSJ");//肌钙蛋报告时间
		COMP_MAP.put("COMP.18.000057","JGDBSZ");//肌钙蛋数值
		COMP_MAP.put("COMP.18.000058","XQJGSZ");//血清肌酐
		COMP_MAP.put("COMP.18.000059","DEJTSZ");//D-二聚体
		COMP_MAP.put("COMP.18.000060","BNPNTPROBNPEDIT");//BNP/NT-proBNP --字段是虚拟字段，不在定义表里面
		COMP_MAP.put("COMP.18.000061","TZXCSJ");//通知心超时间
		COMP_MAP.put("COMP.18.000062","XCWCSJ");//心超完成时间
		COMP_MAP.put("COMP.18.000063","TZCTSJ");//通知CT时间
		COMP_MAP.put("COMP.18.000064","ZQCTKSSJ");//增强CT开始时间
		COMP_MAP.put("COMP.18.000065","JZZD");//初步诊断 | 急诊诊断
		COMP_MAP.put("COMP.18.000066","JZZDSJ");//初步诊断 | 急诊诊断 时间
		COMP_MAP.put("COMP.18.000067","XNKHZ");//是否呼叫心内科会诊
		COMP_MAP.put("COMP.18.000068","TZHZSJ");//通知会诊时间
		//心内科
		COMP_MAP.put("COMP.18.000069","HZLX");//会诊时间
		COMP_MAP.put("COMP.18.000070","CBZD");//心内科诊断
		COMP_MAP.put("COMP.18.000071","JDJRSSSJ");//决定介入手术时间
		COMP_MAP.put("COMP.18.000072","QDDGSSJ");//启动导管室时间
		COMP_MAP.put("COMP.18.000073","KSZQTYSJ");//开始知情同意时间
		COMP_MAP.put("COMP.18.000074","QSZQTYSJ");//签署知情同意书时间
		COMP_MAP.put("COMP.18.000075","YNRSSC");//院内溶栓筛查
		COMP_MAP.put("COMP.18.000076","YNRSZL");//是否实施院前溶栓
		COMP_MAP.put("COMP.18.000077","YNKSRSSJ");//溶栓开始时间
		COMP_MAP.put("COMP.18.000078","YNRSJSSJ");//溶栓结束时间
		COMP_MAP.put("COMP.18.000079","YNRSHZYSJ");//溶栓后造影时间
		COMP_MAP.put("COMP.18.000080","YNYW");//溶栓药物
		COMP_MAP.put("COMP.18.000081","YNJL");//溶栓剂量
		COMP_MAP.put("COMP.18.000082","YNRSZT");//溶栓再通
		//留观
		COMP_MAP.put("COMP.18.000083","YNXDTSJ02");//复测心电图时间
		COMP_MAP.put("COMP.18.000084","JGDBFCJG");//肌钙蛋白复测结果
		COMP_MAP.put("COMP.18.000085","FCJGDBSJ");//复测肌钙蛋白抽血完成时间
		COMP_MAP.put("COMP.18.000086","FCJGDBBGSJ");//复测肌钙蛋白报告时间
		COMP_MAP.put("COMP.18.000087","graceWXFCOne");//Grace危险分层
		COMP_MAP.put("COMP.18.000088","gracejgwtjOne");//具备以下任意一条，即为极高危
		COMP_MAP.put("COMP.18.000089","LGZD");//诊 断
		// 胸痛诊疗（胸痛诊室、心内科、留观）
		COMP_MAP.put("COMP.18.000090","KILLIP");//心功能分级
		COMP_MAP.put("COMP.18.000091","ZGNYHA");//NYHA分级
		COMP_MAP.put("COMP.18.000091_1","gracejgwtjZero");//具备以下任意一条，即为极高危
		COMP_MAP.put("COMP.18.000092","YWZGZCS");//STEMI 有无再灌注措施：
		COMP_MAP.put("COMP.18.000093","ZGZCS");//STEMI 再灌注措施：
		COMP_MAP.put("COMP.18.000094","CLCL");//NSTE-ACS 血运重建措施|处理策略
		COMP_MAP.put("COMP.18.000095","QRXCL");//NSTE-ACS 血运重建措施|侵入性策略
		COMP_MAP.put("COMP.18.000096","SJJRZLSJ");//实际介入时间
		COMP_MAP.put("COMP.18.000097","ASPLSJ");//双联抗血小板药物给药时间
		COMP_MAP.put("COMP.18.000098","ASPLJL");//阿司匹林
		COMP_MAP.put("COMP.18.000099","TGRLJL");//替格瑞洛
		COMP_MAP.put("COMP.18.000100","LBGLJL"); //氯吡格雷
		COMP_MAP.put("COMP.18.000101","TTZL"); //他汀治疗
		COMP_MAP.put("COMP.18.000102","BSTZZJ"); //β受体阻滞剂使用
		//导管室
		COMP_MAP.put("COMP.18.000103","JZPCI");//急诊PCI启动方式
		COMP_MAP.put("COMP.18.000104","JRYS");//介入医生
		COMP_MAP.put("COMP.18.000105","DGSJHSJ");//导管室激活时间
		COMP_MAP.put("COMP.18.000106","RULU");//PCI血管路径
		COMP_MAP.put("COMP.18.000107","KSCCSJ");//开始穿刺时间
		COMP_MAP.put("COMP.18.000108","ZYKSSJ");//造影开始时间
		COMP_MAP.put("COMP.18.000109","dstgsj");//导丝通过时间
		COMP_MAP.put("COMP.18.000110","PCISSWCSJ");//PCI 手术完成时间
		COMP_MAP.put("COMP.18.000111","xzcd");//罪犯血管狭窄程度
		COMP_MAP.put("COMP.18.000112","zystimixl");//术前 TIMI
		COMP_MAP.put("COMP.18.000113","shtimixl");//术后 TIMI
		COMP_MAP.put("COMP.18.000114","zjnxs");//支架内血栓
		COMP_MAP.put("COMP.18.000115","sffcbb");//分叉病变
		COMP_MAP.put("COMP.18.000115_1","sfcto");//是否CTO
		COMP_MAP.put("COMP.18.000116","zrzjgs");//植入支架个数
		COMP_MAP.put("COMP.18.000117","SZKNYW");//首次抗凝
		COMP_MAP.put("COMP.18.000118","SZKNYWJLANDDW");//首次抗凝-剂量+单位 --字段是虚拟字段，不在定义表里面
		COMP_MAP.put("COMP.18.000119","SZKNGYSJ");//首次抗凝-时间
		COMP_MAP.put("COMP.18.000120","QNYX");//腔内影像
		COMP_MAP.put("COMP.18.000121","GNJC");//功能检测
		COMP_MAP.put("COMP.18.000122","IABP");//IABP植入
		COMP_MAP.put("COMP.18.000123","xscjEdit");//血栓抽吸  -字段是虚拟字段，不在定义表里面
		COMP_MAP.put("COMP.18.000124","LSQBQ");//临时起搏器植入
		COMP_MAP.put("COMP.18.000125","ECMO");//ECMO
		COMP_MAP.put("COMP.18.000126","ZXSFZZZ");//左心室辅助装置
		COMP_MAP.put("COMP.18.000127","SZBFZ");//术中并发症
		COMP_MAP.put("COMP.18.000128","DSTGSJ");//D2B 时间
		COMP_MAP.put("COMP.18.000129","SFYW");//是否延误
		//出院转归
		COMP_MAP.put("COMP.18.000130","HZZG");//转归
		COMP_MAP.put("COMP.18.000131","CYZD");//出院诊断
		COMP_MAP.put("COMP.18.000132","QZSJ");//确诊时间
		COMP_MAP.put("COMP.18.000133","JGDB72LX");//72h 内肌钙蛋白最高值
		COMP_MAP.put("COMP.18.000134","NNTLX");//脑钠肽类型
		COMP_MAP.put("COMP.18.000135","NNTZGZ");//最高值
		COMP_MAP.put("COMP.18.000136","LVEF");//超声心动图-LVEF
		COMP_MAP.put("COMP.18.000137","ZYQJBFZ");//住院期间并发症
		COMP_MAP.put("COMP.18.000138","XXGJBWXYS");//心血管疾病危险因素
		COMP_MAP.put("COMP.18.000139","YNXFXLSJ");//院内新发心力衰竭
		COMP_MAP.put("COMP.18.000140","CYSJ");//出院时间
		COMP_MAP.put("COMP.18.000141","ZYTS");//住院天数
		COMP_MAP.put("COMP.18.000142","FEIY");//总费用
		COMP_MAP.put("COMP.18.000143","ZLJG");//出院治疗结果
		//出院带药 --字段是虚拟字段，不在定义表里面 DAPT 1 ACEI/ARB 2  β-受体阻滞剂  3  他汀4
		COMP_MAP.put("COMP.18.000144","CYDYFNEDIT");
	}
	/**
	 * 根据emgSeq 获取胸痛诊疗表的信息转换成编辑器所求格式
	 *
	 * @param regSeq regSeq
	 * @return ResultInfo
	 */
	@Override
	@SuppressWarnings("SpellCheckingInspection")
	public ResultInfo getHspXtzlInfByEmgSeqToEdit(String regSeq) {
		// TODO 测试时来改变map的值，之后用static初始化或者每次都改变map的值
//		Map<String, String> COMP_MAP = new HashMap<>();
//		initCompMap(COMP_MAP);
		//结果集
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, Object> result = new HashMap<>();
		//获取患者基本信息
		QueryDto queryDto = new QueryDto(regSeq);
		HspDbzlBasCustom hspDbzlBasCustom = cpcMapper.getHspDbzlBasinf(queryDto);
		JSONObject jsonHspDbzlBasCustom = jsonSerialize(hspDbzlBasCustom);
		//获取诊疗表数据
		List<HspXtzlInfCustom> dataList = hspXtzlInfCustomMapper.getHspXtzlInfByEmgSeq(hspDbzlBasCustom.getEmgSeq());
		//添加一个or多个虚拟对象，用来转换值
		addNewHspXtzlInfCustomFroEdit(dataList, "FBSJEDIT", "BNPNTPROBNPEDIT", "SZKNYWJLANDDW", "CYDYFNEDIT");
		Map<String, Object> otherData = otherSourceForEdit(hspDbzlBasCustom.getEmgSeq());
		JSONObject jsonHspCrivelInf = jsonSerialize(otherData.get("hspCrivelInf"));
		JSONObject jsonHspEcgInfYq = jsonSerialize(otherData.get("hspEcgInfYq"));
		JSONObject jsonHspEcgInfYn = jsonSerialize(otherData.get("hspEcgInfYn"));
		JSONObject jsonHspGraceInfTypOne = jsonSerialize(otherData.get("hspGraceInfTypOne"));
		JSONObject jsonHspGraceInfTypZero = jsonSerialize(otherData.get("hspGraceInfTypZero"));

		// TODO 解析list
		for (String key : COMP_MAP.keySet()) {
			String field = COMP_MAP.get(key);
			for (HspXtzlInfCustom hspXtzlInfCustom : dataList) {
				if (field.equals(hspXtzlInfCustom.getProCode())) {
					if (StringUtils.isNotBlank(hspXtzlInfCustom.getProVal()))
						if (!"checkbox".equals(hspXtzlInfCustom.getProType())) {
							// TODO 地址要返回中文，数据库保存的是编码，要转义
							deCodeForEdit(result, key, field, hspXtzlInfCustom.getProVal());
						} else {
							//多选值转成数组对象
							String[] valArr = hspXtzlInfCustom.getProVal().split(",");
							result.put(key, valArr);
						}
				}
			}
			// 基础信息
			if (jsonHspDbzlBasCustom.containsKey(field))
				if (StringUtils.isNotBlank(jsonHspDbzlBasCustom.getString(field)))
					result.put(key, jsonHspDbzlBasCustom.get(field));
			// 犯罪血管
			if (jsonHspCrivelInf.containsKey(field))
				if (StringUtils.isNotBlank(jsonHspCrivelInf.getString(field)))
					deCodeForEdit(result, key, field, jsonHspCrivelInf.get(field));
			//院前心电图 HspEcgInf.xxYq
			if (jsonHspEcgInfYq.containsKey(field))
				result.put(key, jsonHspEcgInfYq.get(field));
			//院内心电图 HspEcgInf.xxYn
			if (jsonHspEcgInfYn.containsKey(field))
				result.put(key, jsonHspEcgInfYn.get(field));
			//GRACE  评分  key suffix One
			if (jsonHspGraceInfTypOne.containsKey(field))
				if (StringUtils.isNotBlank(jsonHspGraceInfTypOne.getString(field)))
					deCodeForEdit(result, key, field, jsonHspGraceInfTypOne.get(field));
			//GRACE  评分  key suffix Zero
			if (jsonHspGraceInfTypZero.containsKey(field))
				if (StringUtils.isNotBlank(jsonHspGraceInfTypZero.getString(field)))
					deCodeForEdit(result, key, field, jsonHspGraceInfTypZero.get(field));

		}
		resultInfo.setSysdata(result);
		return resultInfo;
	}
	/**
	 *   Object ==>转换成==> JSONObject
	 *
	 * @param obj Object
	 * @return com.alibaba.fastjson.JSONObject
	 * @date 2022/10/8 13:08
	 */
	public JSONObject jsonSerialize(Object obj) {
		Object o = JSON.toJSON(obj);
		JSONObject jsonObj = new JSONObject();
		if (o instanceof JSONObject) {
			jsonObj = (JSONObject) o;
		}
		return jsonObj;
	}

	/**
	 * 对需要进行解码的数据进行解码,或者进行修改val值
	 * if "".equals 太多了,不想优化了
	 *
	 * @param result result
	 * @param field  field
	 * @param value  value
	 * @author chenys
	 * @date 2022/10/20 15:02
	 */
	@SuppressWarnings("SpellCheckingInspection")
	private void deCodeForEdit(Map<String, Object> result, String key, String field, Object value) {
		switch (field) {
			// 发病地址
			case "FBDZ01":
			case "FBDZ02":
			case "FBDZ03":
				String dVal = hspAddrPostMapper.selectByPrimaryKey(value.toString()).getAddrName();
				result.put(key, dVal);
				break;
			//阿司匹林剂量
			case "ASPLJL":
				String asplJl = "";
				if ("1".equals(value))
					asplJl = "0";
				if ("2".equals(value))
					asplJl = "100";
				if ("3".equals(value))
					asplJl = "300";
				result.put(key, asplJl);
				break;
			//替格瑞洛计量
			case "TGRLJL":
				String tgrlJl = "";
				if ("1".equals(value))
					tgrlJl = "0";
				if ("2".equals(value))
					tgrlJl = "300";
				if ("3".equals(value))
					tgrlJl = "600";
				result.put(key, tgrlJl);
				break;
			//氯吡格雷计量
			case "LBGLJL":
				String lbglJl = "";
				if ("1".equals(value))
					lbglJl = "0";
				if ("2".equals(value))
					lbglJl = "90";
				if ("3".equals(value))
					lbglJl = "180";
				result.put(key, lbglJl);
				break;
			//极高危条件
			case "gracejgwtjOne":
			case "gracejgwtjZero":
				String[] valArr = value.toString().split(",");
				result.put(key, valArr);
				break;
			//支架个数
			case "zrzjgs":
				String zjgs = "";
				if ("1".equals(value))
					zjgs = "0";
				if ("2".equals(value))
					zjgs = "1";
				if ("3".equals(value))
					zjgs = "2";
				if ("4".equals(value))
					zjgs = ">=3";
				result.put(key, zjgs);
				break;
			default:
				result.put(key, value);
				break;
		}
	}

	/**
	 * 添加一个或者多个新的对象,根据HspXtzlInfCustom proCode值来创建
	 * @param list list
	 * @param proCode proCode
	 */
	@SuppressWarnings("SpellCheckingInspection")
	private void addNewHspXtzlInfCustomFroEdit(List<HspXtzlInfCustom> list, String... proCode) {
		Map<String, String> map = list.stream().collect(Collectors.toMap(HspXtzlInfCustom::getProCode, HspXtzlInfCustom::getProVal, (key1, key2) -> key2));
		for (String code : proCode) {
			// new HspXtzlInfCustom proVal
			String tempVal = "";
			String proType= "";
			switch (code) {
				case "FBSJEDIT":
					String tagVal = map.get("DYFS");
					if ("1".equals(tagVal))
						tempVal = map.get("DDYYDMSJ01");
					if ("2".equals(tagVal))
						tempVal = map.get("DDYYDMSJ02");
					if ("3".equals(tagVal))
						tempVal = map.get("DDYYDMSJ03");
					break;
				case "BNPNTPROBNPEDIT":
					String nbp=map.get("BNPSZ")!=null?map.get("BNPSZ"):"无";
					String ntProBNP=map.get("NTPROBNPSZ")!=null?map.get("NTPROBNPSZ"):"无";
					tempVal= nbp+"/"+ntProBNP;
					break;
				case "SZKNYWJLANDDW":
					String nOACJL=map.get("SZKNYWJL")!=null?map.get("SZKNYWJL"):"";
					String nOACDW=map.get("SZKNYWDW")!=null?map.get("SZKNYWDW"):"";
					tempVal= nOACJL+" "+nOACDW;
					break;
				case "CYDYFNEDIT":
					proType="checkbox";
					//是否抗血小板药物
					String dATP=map.get("CYDYSFKXXBYW");
					//ACEI/ARB
					String aCEOrARB=map.get("CYDYSFACEI");
					//是否β受体阻滞剂
					String betaBlocker=map.get("CYDYSFSTZZJ");
					//是否调脂药物 | 他汀
					String lipidDrug=map.get("CYDYSFTZYW");
					JSONArray array=new JSONArray();
					if ("1".equals(dATP))
						array.add("1");
					if ("1".equals(aCEOrARB))
						array.add("2");
					if ("1".equals(betaBlocker))
						array.add("3");
					if ("1".equals(lipidDrug))
						array.add("4");
					tempVal=StringUtils.join(array,",");;
					break;
			}
			list.add(new HspXtzlInfCustom(code, proType,tempVal));
		}

	}
	/**
	 * 获取除诊疗表和基础信息之外的数据
	 *
	 * @param emgSeq emgSeq
	 * @return java.util.Map<java.lang.String, java.lang.Object>
	 * @author chenys
	 * @date 2022/10/24 15:37
	 */
	@SuppressWarnings("SpellCheckingInspection")
	private Map<String, Object> otherSourceForEdit(String emgSeq) {
		Map<String, Object> dataMap = new HashMap<>();
		// GRACE 评分 两种类型数据个随机一条数据
		HspGraceInfExample example = new HspGraceInfExample();
		HspGraceInfExample.Criteria criteria = example.createCriteria();
		criteria.andEmgSeqEqualTo(emgSeq);
		List<HspGraceInf> hspGraceInfList = hspGraceInfMapper.selectByExample(example);
		List<HspGraceInf> hspGraceInfTypOneList=hspGraceInfList.stream().filter(hspGraceInf -> hspGraceInf.getGraceType().equals("1")).collect(Collectors.toList());
		List<HspGraceInf> hspGraceInfTypZeroList=hspGraceInfList.stream().filter(hspGraceInf -> hspGraceInf.getGraceType().equals("0")).collect(Collectors.toList());
		JSONObject hspGraceInfTypOne = hspGraceInfTypOneList.size() > 0 ? jsonSerialize(hspGraceInfTypOneList.get(0)) : null;
		// typ 1增加 危险分层
		if (hspGraceInfTypOne != null && hspGraceInfTypOne.size() > 0) {
			//判断危险分层
			String live = "";
			if (hspGraceInfTypOne.get("gracejgwtj") != null) {
				live = "1";
			} else {
				if (hspGraceInfTypOne.containsKey("total")) {
					int total = Integer.parseInt(hspGraceInfTypOne.getString("total"));
					if (total >= 140) {
						live = "2";
					} else if (total >= 108) {
						live = "3";
					} else {
						live = "4";
					}
				}
			}
			hspGraceInfTypOne.put("graceWXFC", live);
		}
		JSONObject hspGraceInfTypZero = hspGraceInfTypZeroList.size() > 0 ? jsonSerialize(hspGraceInfTypZeroList.get(0)) : null;
		// 犯罪血管 随机一条数据
		HspCrivelInfExample hspCrivelInfExample = new HspCrivelInfExample();
		HspCrivelInfExample.Criteria hspCrivelInfCriteria = hspCrivelInfExample.createCriteria();
		hspCrivelInfCriteria.andEmgSeqEqualTo(emgSeq);
		List<HspCrivelInf> hspCrivelInfList = hspCrivelInfMapper.selectByExample(hspCrivelInfExample);
		HspCrivelInf hspCrivelInf = hspCrivelInfList.size() > 0 ? hspCrivelInfList.get(0) : null;
		JSONObject jsonHspCrivelInf=jsonSerialize(hspCrivelInf);
		//判断血栓抽吸是否执行
		if (jsonHspCrivelInf.containsKey("szcl"))
			if (StringUtils.isNotBlank(jsonHspCrivelInf.getString("szcl")))
				if (jsonHspCrivelInf.getString("szcl").contains("3")){
					jsonHspCrivelInf.put("xscjEdit","1");
				}else {
					jsonHspCrivelInf.put("xscjEdit","0");
				}
		// 院内首份心电图
		HspEcgInfExample ecgExample = new HspEcgInfExample();
		HspEcgInfExample.Criteria ecgCriteria = ecgExample.createCriteria();
		ecgCriteria.andRefIdEqualTo(emgSeq);
		List<HspEcgInf> ecgList = hspEcgInfMapper.selectByExample(ecgExample);
		//分组排序 10 院前 11 院内 都只取第一条记录
		List<HspEcgInf> ecgListYq = ecgList.stream().filter(hspEcgInf -> hspEcgInf.getEcgType().equals("10")).sorted(Comparator.comparing(HspEcgInf::getFileDate)).collect(Collectors.toList());
		List<HspEcgInf> ecgListYn = ecgList.stream().filter(hspEcgInf -> hspEcgInf.getEcgType().equals("11")).sorted(Comparator.comparing(HspEcgInf::getFileDate)).collect(Collectors.toList());
		JSONObject hspEcgInfYq = ecgListYq.size() > 0 ? jsonSerialize(ecgListYq.get(0)) : null;
		JSONObject hspEcgInfYn = ecgListYn.size() > 0 ? jsonSerialize(ecgListYn.get(0)) : null;
		dataMap.put("hspEcgInfYq", transObject(hspEcgInfYq, "Yq"));
		dataMap.put("hspEcgInfYn", transObject(hspEcgInfYn, "Yn"));
		dataMap.put("hspGraceInfTypOne", transObject(hspGraceInfTypOne, "One"));
		dataMap.put("hspGraceInfTypZero", transObject(hspGraceInfTypZero, "Zero"));
		dataMap.put("hspCrivelInf", jsonHspCrivelInf);
		return dataMap;
	}

	// 替换 JSONObject的key,统一加后缀
	public static JSONObject transObject(JSONObject o1, String suffix) {
		JSONObject o2 = new JSONObject();
		if (o1 != null)
			o1.forEach((key, value) -> {
				o2.put(key + suffix, o1.get(key));

			});
		return o2;
	}

	@Override
	public ResultInfo queryHspDbzlBasinf(String regSeq) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, Object> sysdata = new HashMap<String, Object>();
		QueryDto queryDto=new QueryDto(regSeq);
		HspDbzlBasCustom hspDbzlBasCustom=cpcMapper.getHspDbzlBasinf(queryDto);
		sysdata.put("hspDbzlBasCustom",hspDbzlBasCustom);
		resultInfo.setSysdata(sysdata);
		return resultInfo;
	}

	@Override
	public ResultInfo queryHspXtzlInfByEmgSeq(String emgSeq){
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, Object> sysdata = new HashMap<>();
		Map<String, String> map = new HashMap<>();
		HspXtzlInfExample example = new HspXtzlInfExample();
		example.createCriteria().andEmgNoEqualTo(emgSeq).andProValIsNotNull();
		List<HspXtzlInf> hspXtzlInfs = hspXtzlInfMapper.selectByExample(example);
		for (HspXtzlInf node : hspXtzlInfs) {
			map.put(node.getProCode(), node.getProVal());
		}
		sysdata.put("hspXtzlInf", map);
		resultInfo.setSysdata(sysdata);
		return resultInfo;
	}

	@Override
	public int getCpcPatientInfoListCount(QueryDto queryDto) {
		return cpcMapper.getCpcPatientInfoListCount(queryDto);
	}

	@Override
	public List<HspDbzlBasCustom> getCpcPatientInfoListByPage(QueryDto queryDto) {
		return cpcMapper.getCpcPatientInfoList(queryDto);
	}

	@Override
	public ResultInfo getTimelineGt(List<HspXtzlInfCustom> list, HspTimDiffQueryDto hspTimDiffQueryDto) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String,Object> map = new HashMap<>();
		//参数校验
		if (!Objects.nonNull(list)|| !(list.size()>0) || !Objects.nonNull(hspTimDiffQueryDto)){
			return resultInfo;
		}

		HspTimDiffCustom questParam = hspTimDiffQueryDto.getHspTimDiffCustom();

		HspTimDiffExample hspTimDiffExample = new HspTimDiffExample();
		HspTimDiffExample.Criteria criteria = hspTimDiffExample.createCriteria();
		criteria.andDisTypEqualTo(questParam.getDisTyp());
		criteria.andObjTypEqualTo(questParam.getObjTyp());
		hspTimDiffExample.setOrderByClause("OBJ_ODR");
		List<HspTimDiff> hspTimDiffs = hspTimDiffMapper.selectByExample(hspTimDiffExample);
		List<HspTimDiffCustom> hspTimDiffCustomList = new ArrayList<>();


		for (HspTimDiff hspTimDiff : hspTimDiffs) {
			//质控开始节点
			String begDateStr = new String();
			//质控结束节点
			String engDateStr = new String();


			HspTimDiffCustom hspTimDiffCustom = new HspTimDiffCustom();
			BeanUtils.copyProperties(hspTimDiff,hspTimDiffCustom);

			//获取质控开始与结束时间
			for (HspXtzlInfCustom hspXtzlInfCustom : list) {
				if (hspTimDiff.getTimBegCod().equals(hspXtzlInfCustom.getProCode())){
					begDateStr = hspXtzlInfCustom.getProVal();
				}
			}
			for (HspXtzlInfCustom hspXtzlInfCustom : list) {
				if (hspTimDiff.getTimEndCod().equals(hspXtzlInfCustom.getProCode())){
					engDateStr = hspXtzlInfCustom.getProVal();
				}
			}

			//计算时间差（分钟）
			if (activetech.util.StringUtils.isNotNullAndEmptyByTrim(begDateStr) && activetech.util.StringUtils.isNotNullAndEmptyByTrim(engDateStr)){
				Date begDat = DateUtil.parseDate(begDateStr, "yyyy-MM-dd HH:mm");
				Date endDat = DateUtil.parseDate(engDateStr, "yyyy-MM-dd HH:mm");
				long diff = (endDat.getTime()-begDat.getTime()) / 1000;
				hspTimDiffCustom.setBeginTim(begDat);
				hspTimDiffCustom.setEndTim(endDat);
				hspTimDiffCustom.setHzTimDif(diff);
				hspTimDiffCustomList.add(hspTimDiffCustom);
			}

		}
		map.put("list",hspTimDiffCustomList);
		resultInfo.setSysdata(map);
		return resultInfo;
	}

	@Override
	public  DataGridResultInfo getTimeLineCriterion(HspTimDiffQueryDto hspTimDiffQueryDto) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		HspTimDiffCustom questParam = hspTimDiffQueryDto.getHspTimDiffCustom();

		HspTimDiffExample hspTimDiffExample = new HspTimDiffExample();
		HspTimDiffExample.Criteria criteria = hspTimDiffExample.createCriteria();
		criteria.andDisTypEqualTo(questParam.getDisTyp());
		//9为查询全部
		if (!"9".equals(questParam.getObjTyp())){
			criteria.andObjTypEqualTo(questParam.getObjTyp());
		}
		hspTimDiffExample.setOrderByClause("OBJ_ODR");
		List<HspTimDiff> hspTimDiffs = hspTimDiffMapper.selectByExample(hspTimDiffExample);

		if (Objects.nonNull(hspTimDiffs)&&hspTimDiffs.size()>0){
			dataGridResultInfo.setRows(hspTimDiffs);
			dataGridResultInfo.setTotal(hspTimDiffs.size());
		}


		return dataGridResultInfo;
	}

	@Override
	public ResultInfo updateTimeLineCriterion(HspTimDiffQueryDto hspTimDiffQueryDto,ActiveUser activeUser) throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE,901,null);
		if (Objects.nonNull(hspTimDiffQueryDto) && Objects.nonNull(hspTimDiffQueryDto.getHspTimDiffCustom())){
			HspTimDiffCustom questParam = hspTimDiffQueryDto.getHspTimDiffCustom();
			questParam.setChgTim(new Date());
			questParam.setChgUsrNam(activeUser.getUsrname());
			questParam.setChgUsrNo(activeUser.getUsrno());
			hspTimDiffCustomMapper.updateBySelective(questParam);

		}


		return resultInfo;
	}

	@Override
	public DataGridResultInfo queryTimeLineHis(HspTimDiffQueryDto hspTimDiffQueryDto) throws Exception {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		if (Objects.nonNull(hspTimDiffQueryDto) && Objects.nonNull(hspTimDiffQueryDto.getHspTimDiffHisCustom())){
			HspTimDiffHisCustom hspTimDiffHisCustom = hspTimDiffQueryDto.getHspTimDiffHisCustom();
			HspTimDiffHisExample hspTimDiffHisExample = new HspTimDiffHisExample();
			HspTimDiffHisExample.Criteria criteria = hspTimDiffHisExample.createCriteria();
			criteria.andDisTypEqualTo(hspTimDiffHisCustom.getDisTyp());
			criteria.andObjTypEqualTo(hspTimDiffHisCustom.getObjTyp());
			hspTimDiffHisExample.setOrderByClause("DAT_DAT DESC");

			List<HspTimDiffHis> hspTimDiffHis = hspTimDiffHisMapper.selectByExample(hspTimDiffHisExample);
			if (Objects.nonNull(hspTimDiffHis)&&hspTimDiffHis.size()>0){
				dataGridResultInfo.setRows(hspTimDiffHis);
				dataGridResultInfo.setTotal(hspTimDiffHis.size());
			}
		}

		return dataGridResultInfo;
	}
}
