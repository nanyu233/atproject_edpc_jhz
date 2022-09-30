package activetech.edpc.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import activetech.aid.dao.mapper.AidPatientMapper;
import activetech.aid.dao.mapper.AidPatientXtMapper;
import activetech.aid.pojo.domain.AidPatient;
import activetech.aid.pojo.domain.AidPatientXt;
import activetech.base.dao.mapper.DstarchivesMapper;
import activetech.base.dao.mapper.DstcompctlCustomMapper;
import activetech.base.dao.mapper.DstdictinfoMapper;
import activetech.base.pojo.domain.Dstarchives;
import activetech.base.pojo.domain.DstarchivesExample;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.DstcompctlCustom;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.edpc.dao.mapper.CpcMapper;
import activetech.edpc.dao.mapper.HspCrivelInfMapper;
import activetech.edpc.dao.mapper.HspCrivelInfMapperCustom;
import activetech.edpc.dao.mapper.HspFlowChartDefMapper;
import activetech.edpc.dao.mapper.HspFlowChartInfMapper;
import activetech.edpc.dao.mapper.HspGraceInfMapper;
import activetech.edpc.dao.mapper.HspXtAddMapper;
import activetech.edpc.dao.mapper.HspXtzlInfCustomMapper;
import activetech.edpc.dao.mapper.HspXtzlInfMapper;
import activetech.edpc.dao.mapper.VHemsJyjgHzMapper;
import activetech.edpc.pojo.domain.HspCrivelInf;
import activetech.edpc.pojo.domain.HspCrivelInfExample;
import activetech.edpc.pojo.domain.HspFlowChartDef;
import activetech.edpc.pojo.domain.HspFlowChartDefExample;
import activetech.edpc.pojo.domain.HspFlowChartInf;
import activetech.edpc.pojo.domain.HspFlowChartInfExample;
import activetech.edpc.pojo.domain.HspGraceInf;
import activetech.edpc.pojo.domain.HspGraceInfExample;
import activetech.edpc.pojo.domain.HspXtAdd;
import activetech.edpc.pojo.domain.HspXtzlInf;
import activetech.edpc.pojo.domain.HspXtzlInfExample;
import activetech.edpc.pojo.domain.VHemsJyjgHz;
import activetech.edpc.pojo.domain.VHemsJyjgHzExample;
import activetech.edpc.pojo.dto.FlowChartNodeDef;
import activetech.edpc.pojo.dto.HspXtzlInfCustom;
import activetech.edpc.pojo.dto.ProCodeDef;
import activetech.edpc.pojo.dto.QueryDto;
import activetech.edpc.pojo.dto.XtHspEmgInfQueryDto;
import activetech.edpc.service.ExternalDataService;
import activetech.edpc.service.XtService;
import activetech.external.dao.mapper.HspEcgInfMapper;
import activetech.external.dao.mapper.VHemsJcjgMapperCustom;
import activetech.external.dao.mapper.VHemsJyjgMapper;
import activetech.external.dao.mapper.VHemsJyjgMapperCustom;
import activetech.external.pojo.domain.HspEcgInf;
import activetech.external.pojo.domain.HspEcgInfExample;
import activetech.external.pojo.domain.VHemsJcjg;
import activetech.external.pojo.domain.VHemsJcjgExample;
import activetech.external.pojo.domain.VHemsJyjg;
import activetech.external.pojo.domain.VHemsJyjgExample;
import activetech.hospital.dao.mapper.HspEmgInfMapper;
import activetech.hospital.dao.mapper.HspMewsInfMapper;
import activetech.hospital.pojo.domain.HspEmgInf;
import activetech.hospital.pojo.domain.HspEmgInfExample;
import activetech.hospital.pojo.domain.HspMewsInf;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.util.DateUtil;
import activetech.websocket.action.WebSocketXT;
import activetech.zyyhospital.dao.mapper.HspConsultationRecordsMapper;
import activetech.zyyhospital.pojo.domain.HspConsultationRecords;
import activetech.zyyhospital.pojo.domain.HspConsultationRecordsExample;

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
	private DstcompctlCustomMapper dstcompctlCustomMapper;
	
	@Autowired
	private AidPatientMapper aidPatientMapper;
	
	@Autowired
	private AidPatientXtMapper aidPatientXtMapper;
	
	@Override
	public ResultInfo getCpcPatientInfoList(QueryDto queryDto) {
		ResultInfo resultInfo = null;
		List<HspemginfCustom> list = cpcMapper.getCpcPatientInfoList(queryDto);
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
	public ResultInfo getCpcTimeline(String emgSeq) {
		// TODO Auto-generated method stub
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, Object> sysdata = new HashMap<String, Object>();
		List<HspXtzlInfCustom> list = hspXtzlInfCustomMapper.getCpcTimeline(emgSeq);
		
		HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(emgSeq);
		// 根据hspEmgInf 是否是null 判断是分诊的病人还是 hsp_xt_add 的病人
		AidPatient aidPatient = null;
		if(hspEmgInf!=null) {
			// 分诊病人
			aidPatient = aidPatientMapper.selectByPrimaryKey(hspEmgInf.getPatid());
		}else {
			aidPatient = aidPatientMapper.selectByPrimaryKey(emgSeq);
		}
		
		//保险点判断下aidPatient是否为null
		if(aidPatient!=null) {
			//发病时间 FBSJ
			if(aidPatient.getIllTim()!=null) {
				HspXtzlInfCustom fbsj = new HspXtzlInfCustom();
				fbsj.setEmgNo(emgSeq);
				fbsj.setProName("发病时间");
				fbsj.setProCode(ProCodeDef.FBSJ);
				fbsj.setProVal(DateUtil.formatDateByFormat(aidPatient.getIllTim(), DateUtil.DATETIME_FORMAT) );
				list.add(fbsj);
			}
			
			//呼救时间 HJSJ
			if(aidPatient.getAlmtime()!=null) {
				HspXtzlInfCustom hjsj = new HspXtzlInfCustom();
				hjsj.setEmgNo(emgSeq);
				hjsj.setProName("呼救时间");
				hjsj.setProCode(ProCodeDef.HJSJ);
				hjsj.setProVal(DateUtil.formatDateByFormat(aidPatient.getAlmtime(), DateUtil.DATETIME_FORMAT) );
				list.add(hjsj);
			}
		}
		
		
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
		
		String jgdbbgsj = vHemsJyjgMapperCustom.getJgdbDate(emgSeq);
		if(jgdbbgsj!=null) {
			HspXtzlInfCustom jgdbbgsjHspXtzlInf = new HspXtzlInfCustom();
			jgdbbgsjHspXtzlInf.setEmgNo(emgSeq);
			jgdbbgsjHspXtzlInf.setProName("肌钙蛋白报告时间");
			jgdbbgsjHspXtzlInf.setProCode(ProCodeDef.JGDBBGSJ);
			jgdbbgsjHspXtzlInf.setProVal(jgdbbgsj);
			list.add(jgdbbgsjHspXtzlInf);
		}
		list.sort(new Comparator<HspXtzlInfCustom>() {

			@Override
			public int compare(HspXtzlInfCustom o1, HspXtzlInfCustom o2) {

				// 数据库保存有2种格式的时间字符串，要排序，坑爹啊
				SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
				
				String dateString1 = o1.getProVal();
				String dateString2 = o2.getProVal();
				Date date1 = null;
				Date date2 = null;
				try {
					date1 = format1.parse(dateString1);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					try {
						date1 = format2.parse(dateString1);
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				try {
					date2 = format1.parse(dateString2);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					try {
						date2 = format2.parse(dateString2);
					} catch (ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				
				return date1.compareTo(date2);
			}
		});
		sysdata.put("cpcTimeline", list);
		resultInfo.setSysdata(sysdata);
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
	public DataGridResultInfo getXtPatientList(XtHspEmgInfQueryDto xtHspEmgInfQueryDto,
			int page,//当前页码
			int rows//每页显示个数
			) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		int total = hspXtzlInfCustomMapper.countXtPatientList(xtHspEmgInfQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		xtHspEmgInfQueryDto.setPageQuery(pageQuery);
		List<XtHspEmgInfQueryDto> list = hspXtzlInfCustomMapper.getXtPatientList(xtHspEmgInfQueryDto);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(total);
		
		return dataGridResultInfo;
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
	public ResultInfo getXtTimeLine(XtHspEmgInfQueryDto xtHspEmgInfQueryDto) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		String emgSeq = xtHspEmgInfQueryDto.getEmgSeq();
		Map<String, Object> sysdata = new HashMap<String, Object>();
		List<HspXtzlInfCustom> list = hspXtzlInfCustomMapper.getCpcTimeline(xtHspEmgInfQueryDto.getEmgSeq());
				//hspXtzlInfCustomMapper.getXtTimeLine(xtHspEmgInfQueryDto);
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
		
		HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(emgSeq);
		AidPatient aidPatient = null;
		if(hspEmgInf!=null) {
			// 分诊病人
			aidPatient = aidPatientMapper.selectByPrimaryKey(hspEmgInf.getPatid());
		}else {
			aidPatient = aidPatientMapper.selectByPrimaryKey(emgSeq);
		}
		if(aidPatient!=null) {
			
			//发病时间 FBSJ
			HspXtzlInfCustom fbsj = new HspXtzlInfCustom();
			fbsj.setEmgNo(emgSeq);
			fbsj.setProName("发病时间");
			fbsj.setProCode(ProCodeDef.FBSJ);
			fbsj.setProVal(DateUtil.formatDateByFormat(aidPatient.getIllTim(), DateUtil.DATETIME_FORMAT) );
			list.add(fbsj);
			
			
			//呼救时间 HJSJ
			HspXtzlInfCustom hjsj = new HspXtzlInfCustom();
			hjsj.setEmgNo(emgSeq);
			hjsj.setProName("呼救时间");
			hjsj.setProCode(ProCodeDef.HJSJ);
			hjsj.setProVal(DateUtil.formatDateByFormat(aidPatient.getAlmtime(), DateUtil.DATETIME_FORMAT) );
			list.add(hjsj);
		}
		
		
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
		
		String jgdbbgsj = vHemsJyjgMapperCustom.getJgdbDate(emgSeq);
		if(jgdbbgsj!=null) {
			HspXtzlInfCustom jgdbbgsjHspXtzlInf = new HspXtzlInfCustom();
			jgdbbgsjHspXtzlInf.setEmgNo(emgSeq);
			jgdbbgsjHspXtzlInf.setProName("肌钙蛋白报告时间");
			jgdbbgsjHspXtzlInf.setProCode(ProCodeDef.JGDBBGSJ);
			jgdbbgsjHspXtzlInf.setProVal(jgdbbgsj);
			list.add(jgdbbgsjHspXtzlInf);
		}
		
		//排序
		Collections.sort(list, new Comparator<HspXtzlInfCustom>() {
			@Override
			public int compare(HspXtzlInfCustom o1, HspXtzlInfCustom o2) {
				// TODO Auto-generated method stub
				return  o1.getProVal().compareTo(o2.getProVal());
			}
        });
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
	public ResultInfo queryXtPatientDetail(String emgSeq){
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, Object> sysdata = new HashMap<String, Object>();
		if(StringUtils.isNotBlank(emgSeq)){
			
			HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(emgSeq);
			
			HspMewsInf hspMewsInf = hspMewsInfMapper.selectByPrimaryKey(emgSeq);
			
			HspemginfCustom hspemginfCustom = new HspemginfCustom();
			try {
				PropertyUtils.copyProperties(hspemginfCustom, hspEmgInf);
				hspemginfCustom.setSenRctCod(hspMewsInf.getSenRctCod());
				hspemginfCustom.setHrtRte(hspMewsInf.getHrtRte());
				hspemginfCustom.setSbpUpNbr(hspMewsInf.getSbpupNbr());
				hspemginfCustom.setSbpDownNbr(hspMewsInf.getSbpdownNbr());
				hspemginfCustom.setBreNbr(hspMewsInf.getBreNbr());
				hspemginfCustom.setTmpNbr(hspMewsInf.getTmpNbr());
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			sysdata.put("hspEmgInf", hspemginfCustom);
			
			resultInfo.setSysdata(sysdata);
		}
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
			
				HspemginfCustom hspemginfCustomArg = new HspemginfCustom();
				hspemginfCustomArg.setEmgSeq(emgSeq);
				HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(emgSeq);
				Date emgDat = hspEmgInf.getEmgDat();
				
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
		} else {
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 900, null);
		}
		return resultInfo;
	}

	@Override
	public ResultInfo queryHspXtAddDetail(String emgSeq) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, Object> sysdata = new HashMap<String, Object>();
		if(StringUtils.isNotBlank(emgSeq)){
		    HspXtAdd hspXtAdd = hspXtAddMapper.selectByPrimaryKey(emgSeq);
		    
		    HspemginfCustom hspemginfCustom = new HspemginfCustom();
		    
		    hspemginfCustom.setCstNam(hspXtAdd.getCstNam());
		    hspemginfCustom.setCstSexCod(hspXtAdd.getCstSexCod());
		    hspemginfCustom.setIdNbr(hspXtAdd.getIdNbr());
		    hspemginfCustom.setCstAge(hspXtAdd.getCstAge());
		    hspemginfCustom.setBthDat(hspXtAdd.getBthDat());
		    hspemginfCustom.setPheNbr(hspXtAdd.getPheNbr());
		    
		    hspemginfCustom.setSbpUpNbr(hspXtAdd.getSbpNbr());
		    hspemginfCustom.setSbpDownNbr(hspXtAdd.getDbpNbr());
		    
		    hspemginfCustom.setHrtRte(hspXtAdd.getHrtRte());
		    
		    hspemginfCustom.setSenRctCod(hspXtAdd.getSenRct());
		    hspemginfCustom.setBreNbr(hspXtAdd.getBreNbr());
		    hspemginfCustom.setTmpNbr(hspXtAdd.getTmpNbr());
		    
			sysdata.put("hspEmgInf", hspemginfCustom);
			resultInfo.setSysdata(sysdata);
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
}
