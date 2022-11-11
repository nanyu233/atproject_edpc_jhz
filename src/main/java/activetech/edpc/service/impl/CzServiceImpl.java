package activetech.edpc.service.impl;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import activetech.edpc.dao.mapper.*;
import activetech.edpc.pojo.domain.*;
import activetech.edpc.pojo.dto.*;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import activetech.aid.dao.mapper.AidPatientMapper;
import activetech.aid.dao.mapper.AidPatientXtMapper;
import activetech.aid.pojo.domain.AidPatient;
import activetech.aid.pojo.domain.AidPatientXt;
import activetech.base.dao.mapper.DstarchivesMapper;
import activetech.base.dao.mapper.DstcompctlCustomMapper;
import activetech.base.pojo.domain.Dstarchives;
import activetech.base.pojo.domain.DstarchivesExample;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.DstcompctlCustom;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.util.MinIoUtil;
import activetech.edpc.dao.mapper.*;
import activetech.edpc.pojo.domain.*;
import activetech.edpc.pojo.dto.*;
import activetech.edpc.service.CzService;
import activetech.external.dao.mapper.HspJyjgCustomMapper;
import activetech.external.dao.mapper.VHemsJcjgMapper;
import activetech.external.dao.mapper.VHemsJcjgMapperCustom;
import activetech.external.dao.mapper.VHemsJyjgMapper;
import activetech.external.pojo.domain.VHemsJcjg;
import activetech.external.pojo.domain.VHemsJcjgExample;
import activetech.external.pojo.domain.VHemsJyjg;
import activetech.external.pojo.domain.VHemsJyjgExample;
import activetech.hospital.dao.mapper.HspEmgInfMapper;
import activetech.hospital.dao.mapper.HspemginfCustomMapper;
import activetech.hospital.pojo.domain.HspEmgInf;
import activetech.hospital.pojo.domain.HspEmgInfExample;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.zyyhospital.dao.mapper.HspConsentInfMapper;
import activetech.zyyhospital.dao.mapper.HspConsultationRecordsCustomMapper;
import activetech.zyyhospital.dao.mapper.HspConsultationRecordsMapper;
import activetech.zyyhospital.dao.mapper.HspHljldInfMapper;
import activetech.zyyhospital.dao.mapper.HspLqblInfCustomMapper;
import activetech.zyyhospital.pojo.domain.HspConsentInf;
import activetech.zyyhospital.pojo.domain.HspConsentInfExample;
import activetech.zyyhospital.pojo.domain.HspConsultationRecords;
import activetech.zyyhospital.pojo.domain.HspConsultationRecordsExample;
import activetech.zyyhospital.pojo.domain.HspHljldInf;
import activetech.zyyhospital.pojo.domain.HspHljldInfExample;
import activetech.zyyhospital.pojo.dto.HspConsultationRecordsCustom;
import activetech.zyyhospital.pojo.dto.HspLqblInfCustom;

public class CzServiceImpl implements CzService{
	
	@Autowired
	private HspCzzlInfMapperCustom hspCzzlInfMapperCustom;
	
	@Autowired
	private HspFlowChartInfMapperCustom hspFlowChartInfMapperCustom;
	
	@Autowired
	private HspConsultationRecordsMapper hspConsultationRecordsMapper;
	
	@Autowired
	private DstcompctlCustomMapper dstcompctlCustomMapper;
	
	@Autowired
	private VHemsJcjgMapper vHemsJcjgMapper;
	
	@Autowired
	private VHemsJyjgMapper vHemsJyjgMapper;
	
	@Autowired
	private HspEmgInfMapper hspEmgInfMapper;
	
	@Autowired
	private HspBase64PicMapper hspBase64PicMapper;
	
	@Autowired
	private HspemginfCustomMapper hspemginfCustomMapper;
	
	@Autowired
	private HspLqblInfCustomMapper hspLqblInfCustomMapper;
	
	@Autowired
	private HspHljldInfMapper hspHljldInfMapper;
	
	@Autowired
	private HspCzzlInfMapper hspCzzlInfMapper;
	
	@Autowired
	private AidPatientMapper aidPatientMapper;
	
	@Autowired
	private AidPatientXtMapper aidPatientXtMapper;
	
	@Autowired
	private HspConsentInfMapper hspConsentInfMapper;
	
	@Autowired
	private DstarchivesMapper dstarchivesMapper;
	
	@Autowired
	private HspConsultationRecordsCustomMapper hspConsultationRecordsCustomMapper;
	
	@Autowired
	private VHemsJcjgMapperCustom vHemsJcjgMapperCustom;

	@Autowired
	private HspDbzlBasMapperCustom hspDbzlBasMapperCustom;


	@Autowired
	private HspDbzlBasMapper hspDbzlBasMapper;

	@Override
	public ResultInfo getCzPatientInfoList(QueryDto queryDto) {
		ResultInfo resultInfo = null;
		//List<HspemginfCustom> list = hspCzzlInfMapperCustom.getCzPatientInfoList(queryDto);
		List<HspDbzlBasCustom> list = hspCzzlInfMapperCustom.getCzPatientInfoListForDbzlBas(queryDto);
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
	public ResultInfo getCzInfoByEmgSeq(String emgSeq) {

		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		//	第一步从cpc_route表获取该病人的关键点组成的路径
		
		HspFlowChartInf hspFlowChartInf = new HspFlowChartInf();
		hspFlowChartInf.setEmgSeq(emgSeq);
		List<HspFlowChartInfCustom> flowChartList = 
				hspFlowChartInfMapperCustom.getHspFlowChartInfCustomList(hspFlowChartInf);
		List<String> paramList = new ArrayList<>();
		
		paramList.add("NZDSJ");
		
		paramList.add("XHYSJ");
		
		paramList.add("YXXJCSJ");
		
		paramList.add("ZDSJ");
		
		paramList.add("RSZLKSSJ");
		
		List<HspCzzlInf> hspCzzlInfList	= hspCzzlInfMapperCustom.getHspCzzlInfByEmgSeqAndProCodeList(emgSeq,paramList);
		Map<String,Object> map = new HashMap<>();
		map.put("flowChartList", flowChartList);
		map.put("hspCzzlInfList", hspCzzlInfList);
		resultInfo.setSysdata(map);
		return resultInfo;
	}

	@Override
	public ResultInfo getCzNodeInfoByEmgSeq(String emgSeq, String nodeId) {
		ResultInfo resultInfo = null;
		resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String,Object> map = new HashMap<String,Object>();
		List<HspCzzlInfCustom> list = null;
		// 神经内科 神经外科 转归 分别处理
		if("tzczyshz".equals(nodeId)||"sjwkhz".equals(nodeId)){
			
			HspConsultationRecordsExample example = new HspConsultationRecordsExample();
			HspConsultationRecordsExample.Criteria criteria = example.createCriteria();
			criteria.andEmgSeqCrEqualTo(emgSeq);
			List<HspConsultationRecords> _list = hspConsultationRecordsMapper.selectByExample(example);
			if(_list.size()>0){
				HspConsultationRecords HspConsultationRecords = _list.get(0);
				list = new ArrayList<>();
				
				HspCzzlInfCustom hspCzzlInfCustom1 = new HspCzzlInfCustom();
				hspCzzlInfCustom1.setProType("time2");
				hspCzzlInfCustom1.setProVal(DateUtil.formatDateByFormat( HspConsultationRecords.getInvitationDate(),DateUtil.DATETIME_FORMAT));
				hspCzzlInfCustom1.setProName("会诊邀请时间");
				list.add(hspCzzlInfCustom1);
				
				HspCzzlInfCustom hspCzzlInfCustom2 = new HspCzzlInfCustom();
				hspCzzlInfCustom2.setProType("input");
				DstcompctlCustom dstcompctlCustom = dstcompctlCustomMapper.selectCompctlByComno(HspConsultationRecords.getInvitationDep());
				hspCzzlInfCustom2.setProVal(dstcompctlCustom.getComcname());
				hspCzzlInfCustom2.setProName("会诊邀请科室");
				list.add(hspCzzlInfCustom2);
				
				HspCzzlInfCustom hspCzzlInfCustom3 = new HspCzzlInfCustom();
				hspCzzlInfCustom3.setProType("input");
				hspCzzlInfCustom3.setProVal(HspConsultationRecords.getInvitationDocNme());
				hspCzzlInfCustom3.setProName("会诊邀请医生");
				list.add(hspCzzlInfCustom3);
				
				
				HspCzzlInfCustom hspCzzlInfCustom4 = new HspCzzlInfCustom();
				hspCzzlInfCustom4.setProType("time2");
				hspCzzlInfCustom4.setProVal(DateUtil.formatDateByFormat( HspConsultationRecords.getConsultationDate(), DateUtil.DATETIME_FORMAT));
				hspCzzlInfCustom4.setProName("会诊签到时间");
				list.add(hspCzzlInfCustom4);
				
			}
			
			
		}else if("yxyxjc".equals(nodeId)){
			//影像学检查节点
			HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(emgSeq);
			VHemsJcjgExample example = new VHemsJcjgExample();
			VHemsJcjgExample.Criteria criteria = example.createCriteria();
			// 就诊卡号
			criteria.andMpiEqualTo(hspEmgInf.getMpi());
			criteria.andShrqBetween(DateUtil.getDateAdd(hspEmgInf.getEmgDat(), -12), DateUtil.getDateAdd(hspEmgInf.getEmgDat(), 24));
			List<VHemsJcjg> jcjgList = vHemsJcjgMapper.selectByExample(example);
			map.put("jcjgList", jcjgList);
			
		}else if("xuehy".equals(nodeId)){
			//血化验
			HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(emgSeq);
			VHemsJyjgExample example = new VHemsJyjgExample();
			VHemsJyjgExample.Criteria criteria = example.createCriteria();
			// 就诊卡号
			criteria.andMpiEqualTo(hspEmgInf.getMpi());
			criteria.andResultDateTimeBetween(DateUtil.getDateAdd(hspEmgInf.getEmgDat(), -12), DateUtil.getDateAdd(hspEmgInf.getEmgDat(), 24));
			List<VHemsJyjg> jyjgList = vHemsJyjgMapper.selectByExample(example);
			map.put("jyjgList", jyjgList);
			
		}else{
			list = hspCzzlInfMapperCustom.getHspCzzlInfByEmgSeqAndStep(emgSeq, nodeId);
		} 
		map.put("list", list);
		resultInfo.setSysdata(map);
		return resultInfo;
	}

	@Override
	public List<HspCzzlInf> getCzNodeInfoByEmgSeqProCode(String emgSeq,List<String> paramList) {
		return hspCzzlInfMapperCustom.getHspCzzlInfByEmgSeqAndProCodeList(emgSeq,paramList);
	}

	@Override
	public ResultInfo getRsInf(String emgSeq) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, Object> map = new HashMap<String, Object>();
		List<String> paramlist = new ArrayList<String>();
		paramlist.add("YWXZ");
		List<HspCzzlInf> YWXZ = hspCzzlInfMapperCustom.getHspCzzlInfByEmgSeqAndProCodeList(emgSeq,paramlist);
		String retStr = "0|暂未查找到该病人溶栓信息";
		if(YWXZ!=null && YWXZ.size()>0){
			if("0".equals(YWXZ.get(0).getProVal())){
				paramlist.clear();
				paramlist.add("RTPAZJL");
				paramlist.add("TIZHONG");
				List<HspCzzlInf> rtPAList = hspCzzlInfMapperCustom.getHspCzzlInfByEmgSeqAndProCodeList(emgSeq,paramlist);
				String TIZHONG = "";
				String RTPAZJL = "";
				for (HspCzzlInf rtPA : rtPAList) {
					if("TIZHONG".equals(rtPA.getProCode())){
						TIZHONG = rtPA.getProVal();
					}
					if("RTPAZJL".equals(rtPA.getProCode())){
						RTPAZJL = rtPA.getProVal();
					}
				}
				if(StringUtils.isNotNullAndEmptyByTrim(TIZHONG)
						&&StringUtils.isNotNullAndEmptyByTrim(RTPAZJL)){
					double rtpaz = Double.valueOf(RTPAZJL);
					double rtpasc = new  BigDecimal(rtpaz/10).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
					double rtpawc = new  BigDecimal(rtpaz*0.9).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
					retStr = "1|溶栓使用药物rtPA,总剂量" + RTPAZJL 
							+ "ml，手推" + rtpasc 
							+ "ml，微泵" + rtpawc
							+ "ml，维持速度" + rtpawc + "ml/小时；";
				}
			}else{
				paramlist.clear();
				paramlist.add("NJMDZL");
				List<HspCzzlInf> njmList = hspCzzlInfMapperCustom.getHspCzzlInfByEmgSeqAndProCodeList(emgSeq,paramlist);
				if(njmList != null 
						&& "NJMDZL".equals( njmList.get(0).getProCode())){
					retStr = "1|溶栓使用药物尿激酶，滴注剂量" + njmList.get(0).getProVal() + "u;";
				}
			}
		}
		map.put("retStr", retStr);
		resultInfo.setSysdata(map);
		return resultInfo;
	}

	@Override
	public ResultInfo saveBase64pic(HspBase64Pic hspBase64Pic) {
		
		ResultInfo resultInfo = null;
		
		HspBase64PicExample example = new HspBase64PicExample();
		HspBase64PicExample.Criteria criteria = example.createCriteria();
		criteria.andEmgSeqEqualTo(hspBase64Pic.getEmgSeq());
		criteria.andPicTypeEqualTo(hspBase64Pic.getPicType());
		
		Integer count = hspBase64PicMapper.countByExample(example);
		if(count < 1){
			int ret = hspBase64PicMapper.insert(hspBase64Pic);
		}else{
			hspBase64PicMapper.updateByPrimaryKeyWithBLOBs(hspBase64Pic);
		}
		
		
		resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		
		Map<String, Object> sysdata = new HashMap<String, Object>();
		resultInfo.setSysdata(sysdata);
		return resultInfo;
	}

	@Override
	public ResultInfo getBase64pic(HspBase64Pic hspBase64Pic) {
		
		ResultInfo resultInfo = null;
		HspBase64PicKey key = new HspBase64PicKey();
		key.setEmgSeq(hspBase64Pic.getEmgSeq());
		key.setPicType(hspBase64Pic.getPicType());
//		HspBase64Pic _hspBase64Pic = hspBase64PicMapper.selectByPrimaryKey(key);
		HspBase64Pic _hspBase64Pic = new HspBase64Pic();
		
		if(_hspBase64Pic !=null){
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
			Map<String, Object> sysdata = new HashMap<String, Object>();
			sysdata.put("hspBase64Pic", _hspBase64Pic);
			resultInfo.setSysdata(sysdata);
		}else{
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 902, null);
		}
		
		
		return resultInfo;
	}

	@Override
	public ResultInfo getCzReportHelperData(String emgSeq) {
		
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		
		Map<String,Object> sysdata = new HashMap<>();
		
		
		HspEmgInf hspEmgInf = hspemginfCustomMapper.findHspemginfByemgSql_jzt(emgSeq);
		sysdata.put("hspEmgInf", hspEmgInf);
		
		// JSONObject baseInfo = new JSONObject();
		/*
		List<String> paramlist = new ArrayList<String>();
		// 体重
		paramlist.add("TIZHONG");
		// 发病时间
		paramlist.add("FBSJ");
		// 溶栓前NHISS评分
		paramlist.add("NIHSSPF01");
		
		// 平时服用药
		paramlist.add("PSFYY");
		
		// 诊断结果
		paramlist.add("YXXZDJG");
		
		List<HspCzzlInf> list = hspCzzlInfMapperCustom.getHspCzzlInfByEmgSeqAndProCodeList(emgSeq,paramlist);
		
		*/
		
		HspCzzlInfExample hspCzzlInfExample = new HspCzzlInfExample();
		HspCzzlInfExample.Criteria hspCzzlInfCriteria = hspCzzlInfExample.createCriteria();
		hspCzzlInfCriteria.andEmgNoEqualTo(emgSeq);
		
		
		List<HspCzzlInf> hspCzzlInfList = hspCzzlInfMapper.selectByExample(hspCzzlInfExample);
		
		sysdata.put("hspCzzlInfList", hspCzzlInfList);
		// 主诉
		HspLqblInfCustom hspLqblInfCustom = hspLqblInfCustomMapper.findLqblByEmgSeq(emgSeq);
		if(hspLqblInfCustom!=null) {
			sysdata.put("zhusu", hspLqblInfCustom.getLqblDes());
		}else {
			sysdata.put("zhusu", null);
		}
		
		//分诊截图
//		HspBase64PicKey key = new HspBase64PicKey();
//		key.setEmgSeq(emgSeq);
//		key.setPicType("fz");
//		HspBase64Pic _hspBase64Pic = hspBase64PicMapper.selectByPrimaryKey(key);
		
		/*
		HspBase64PicExample hspBase64PicExample = new HspBase64PicExample();
		HspBase64PicExample.Criteria hspBase64PicCriteria = hspBase64PicExample.createCriteria();
		hspBase64PicCriteria.andEmgSeqEqualTo(emgSeq);
		List<String> values = new ArrayList<>();
		values.add("fz");
		values.add("rs");
		hspBase64PicCriteria.andPicTypeIn(values);
		List<HspBase64Pic> hspBase64PicList = hspBase64PicMapper.selectByExampleWithBLOBs(hspBase64PicExample);
		*/
//		if(_hspBase64Pic!=null) {
//			sysdata.put("fzPicData", _hspBase64Pic.getData());
//		}else {
			sysdata.put("fzPicData", null);
//		}
		
		
		
//		key.setPicType("rs");
		
//		HspBase64Pic rsPicData = hspBase64PicMapper.selectByPrimaryKey(key);
//		
//		if(rsPicData!=null) {
//			sysdata.put("rsPicData", rsPicData.getData());
//		}else {
			sysdata.put("rsPicData", null);
//		}
		
		
		
		HspHljldInfExample example = new HspHljldInfExample();
		HspHljldInfExample.Criteria criteria = example.createCriteria();
		criteria.andEmgSeqEqualTo(emgSeq);
		criteria.andJchlLike("121");
		List<HspHljldInf> hspHljldInfList = hspHljldInfMapper.selectByExample(example);
		HspHljldInf hspHljldInf = null;
		if(hspHljldInfList.size()>0) {
			hspHljldInf = hspHljldInfList.get(0);
		}
		
		sysdata.put("hspHljldInf", hspHljldInf);
		
		resultInfo.setSysdata(sysdata);
		return resultInfo;
	}
	
	
	@Override
	public ResultInfo getCzTimeline(String emgSeq) {
		// TODO Auto-generated method stub
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, Object> sysdata = new HashMap<String, Object>();
		List<HspCzzlInfCustom> list = hspCzzlInfMapperCustom.getCzTimeline(emgSeq);
		
		HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(emgSeq);
		// 根据hspEmgInf 是否是null 判断是分诊的病人还是 hsp_xt_add 的病人
		AidPatient aidPatient = null;
		if(hspEmgInf!=null) {
			if(hspEmgInf.getEmgDat() != null){
				HspCzzlInfCustom fbsj = new HspCzzlInfCustom();
				fbsj.setEmgNo(emgSeq);
				fbsj.setProName("到达大门时间");
				fbsj.setProCode(ProCode.DDDMSJ);
				fbsj.setProVal(DateUtil.formatDateByFormat(hspEmgInf.getEmgDat(), DateUtil.DATETIME_FORMAT) );
				list.add(fbsj);
			}
			// 分诊病人
			aidPatient = aidPatientMapper.selectByPrimaryKey(hspEmgInf.getPatid());
		}else {
			aidPatient = aidPatientMapper.selectByPrimaryKey(emgSeq);
		}
		
		//保险点判断下aidPatient是否为null
		if(aidPatient!=null) {
			//发病时间 FBSJ
			if(aidPatient.getIllTim()!=null) {
				HspCzzlInfCustom fbsj = new HspCzzlInfCustom();
				fbsj.setEmgNo(emgSeq);
				fbsj.setProName("发病时间");
				fbsj.setProCode(ProCodeDef.FBSJ);
				fbsj.setProVal(DateUtil.formatDateByFormat(aidPatient.getIllTim(), DateUtil.DATETIME_FORMAT) );
				list.add(fbsj);
			}
			
			//呼救时间 HJSJ
			if(aidPatient.getAlmtime()!=null) {
				HspCzzlInfCustom hjsj = new HspCzzlInfCustom();
				hjsj.setEmgNo(emgSeq);
				hjsj.setProName("呼救时间");
				hjsj.setProCode(ProCodeDef.HJSJ);
				hjsj.setProVal(DateUtil.formatDateByFormat(aidPatient.getAlmtime(), DateUtil.DATETIME_FORMAT) );
				list.add(hjsj);
			}
		}
		
		
		
		list.sort(new Comparator<HspCzzlInfCustom>() {

			@Override
			public int compare(HspCzzlInfCustom o1, HspCzzlInfCustom o2) {

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
		sysdata.put("czTimeline", list);
		resultInfo.setSysdata(sysdata);
		return resultInfo;
	}

//	@Override
//	public DataGridResultInfo getCzPatientList(HspCzzlInfQueryDto hspCzzlInfQueryDto,int page,int rows) {
//		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
//		int total = hspCzzlInfMapperCustom.countCzPatientList(hspCzzlInfQueryDto);
//		PageQuery pageQuery = new PageQuery();
//		pageQuery.setPageParams(total, rows, page);
//		hspCzzlInfQueryDto.setPageQuery(pageQuery);
//		List<HspCzzlInfQueryDto> list = hspCzzlInfMapperCustom.getCzPatientList(hspCzzlInfQueryDto);
//		dataGridResultInfo.setRows(list);
//		dataGridResultInfo.setTotal(total);
//		return dataGridResultInfo;
//	}

	@Override
	public DataGridResultInfo getCzPatientList(HspDbzlBasQueryDto hspDbzlBasQueryDto, int page, int rows) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		int total = hspCzzlInfMapperCustom.countCzPatientList(hspDbzlBasQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspDbzlBasQueryDto.setPageQuery(pageQuery);
		List<HspDbzlBasCustom> list = hspCzzlInfMapperCustom.getCzPatientList(hspDbzlBasQueryDto);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(total);
		return dataGridResultInfo;
	}

	@Override
	public ResultInfo getCzhcbInfoByEmgSeq(String emgSeq) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String,Object> sysdata = new HashMap<String, Object>();
		HspemginfCustom hspemginfCustom = hspCzzlInfMapperCustom.getCzhcbInfoByEmgseq(emgSeq);
		
		String clbzCod = hspemginfCustom.getClbzCod();
		String clbzFlg = "0";
		if(clbzCod != null && clbzCod.length() >0){
			String[] clbzStrs = clbzCod.split(",");
			for(String clbz : clbzStrs){
				if("1".equals(clbz)
						||"2".equals(clbz)){
					clbzFlg = "1";
				}
			}
		}
		
		List<String> proList = new ArrayList<String>();
		proList.add("WQDDSJ");//外勤到达时间
		proList.add("XDTSJ");//心电图时间
		proList.add("QSZQTYSJ01");//签署溶栓知情同意时间
		proList.add("TLYXSJ");//头颅影像时间
		proList.add("RSZLKSSJ");//溶栓治疗开始时间
		proList.add("RSZLJSSJ");//溶栓治疗结束时间
		
		
		
		List<HspCzzlInf> list = hspCzzlInfMapperCustom.getHspCzzlInfByEmgSeqAndProCodeList(emgSeq, proList);
		
		HspConsentInfExample consentExample = new HspConsentInfExample();
		HspConsentInfExample.Criteria  consentCriteria = consentExample.createCriteria();
		consentCriteria.andRefseqnoEqualTo(emgSeq);
		List<HspConsentInf> consentInfList = hspConsentInfMapper.selectByExample(consentExample);
		String djtysFlg = "0";
		String sqsFlg = "0";
		String bwbzgzsFlg = "0";
		String wzbrzytzsFlg = "0";
		for(HspConsentInf consentInf : consentInfList){
			if("M005".equals(consentInf.getRefseqno())){
				djtysFlg = "1";
			}
			else if("M001".equals(consentInf.getRefseqno())){
				sqsFlg = "1";
			}
			else if("M002".equals(consentInf.getRefseqno())){
				bwbzgzsFlg = "1";
			}
			else if("M063".equals(consentInf.getRefseqno())){
				wzbrzytzsFlg = "1";
			}
		}
		
		//院前
		AidPatient aidPatient = null;
		if(hspemginfCustom.getPatid() != null){
			aidPatient = aidPatientMapper.selectByPrimaryKey(hspemginfCustom.getPatid());
		}
		//主表信息
		sysdata.put("hspemginfCustom", hspemginfCustom);
		//院前信息
		sysdata.put("aidPatient", aidPatient);
		//处理步骤
		sysdata.put("clbzFlg", clbzFlg);
		//卒中表信息
		sysdata.put("list", list);
		//碘剂同意书
		sysdata.put("djtysFlg", djtysFlg);
		//授权书
		sysdata.put("sqsFlg", sqsFlg);
		//病危病重告知书
		sysdata.put("bwbzgzsFlg", bwbzgzsFlg);
		//危重病人转运通知书
		sysdata.put("wzbrzytzsFlg", wzbrzytzsFlg);
		
		
		resultInfo.setSysdata(sysdata);
		return resultInfo;
	}

	@Override
	public ResultInfo getCzPatientDetail(String emgSeq) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String,Object> sysdata = new HashMap<String, Object>();
		//患者信息
//		HspemginfCustom hspemgInfCustom = hspemginfCustomMapper.findHspemginfCustom(emgSeq);
		//卒中表信息
		HspCzzlInfExample czzlExample = new HspCzzlInfExample();
		HspCzzlInfExample.Criteria czzlCriteria = czzlExample.createCriteria();
		czzlCriteria.andEmgNoEqualTo(emgSeq);
		List<HspCzzlInf> czzlList = hspCzzlInfMapper.selectByExample(czzlExample);
		//会诊信息
		HspConsultationRecordsExample consultationExample = new HspConsultationRecordsExample();
		HspConsultationRecordsExample.Criteria consultationCriteria = consultationExample.createCriteria();
		consultationCriteria.andEmgSeqCrEqualTo(emgSeq);
		consultationExample.setOrderByClause("invitation_date");
//		consultationExample.setOrderByClause("consultation_date");
		List<HspConsultationRecords> consultationList = hspConsultationRecordsMapper.selectByExample(consultationExample);
		//介入通知时间，介入到达时间
		HspConsultationRecordsCustom hspConsultationRecordsCustomJr  = hspConsultationRecordsCustomMapper.findCzHzInfEmgSeqJR(emgSeq);
		// 图片信息
		DstarchivesExample example = new DstarchivesExample();
		DstarchivesExample.Criteria criteria = example.createCriteria();
		criteria.andRefIdEqualTo(emgSeq);
		List<Dstarchives> picList = dstarchivesMapper.selectByExample(example);
		for(Dstarchives dstarchives:picList){
			if("ecg".equals(dstarchives.getFileType())){
				sysdata.put("ecgPicPath", dstarchives.getFileType()+"/"+dstarchives.getFileName());
			}
		}
		
//		sysdata.put("hspemgInfCustom", hspemgInfCustom);
		sysdata.put("czzlList", czzlList);
		sysdata.put("consultationList", consultationList);
		sysdata.put("hspConsultationRecordsCustomJr", hspConsultationRecordsCustomJr);
		resultInfo.setSysdata(sysdata);
		return resultInfo;
	}

	@Override
	public ResultInfo czPatietBasicInfSubmit(HspDbzlBasQueryDto hspDbzlBasQueryDto, ActiveUser activeUser){
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		hspDbzlBasQueryDto.getHspDbzlBasCustom().setModNo(activeUser.getUsrno());
		hspDbzlBasMapperCustom.updateHspDbzlBasByRegSeq(hspDbzlBasQueryDto);
		return resultInfo;
	}

	@Override
	public ResultInfo czPatientSubmit(List<HspCzzlInfCustom> czzlInfList, String emgSeq, ActiveUser activeUser) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		for(HspCzzlInfCustom hspCzzlInfCustom : czzlInfList){
			HspCzzlInf hspCzzlInf = new HspCzzlInf();
			hspCzzlInf.setProCode(hspCzzlInfCustom.getProCode());
			hspCzzlInf.setProVal(hspCzzlInfCustom.getProVal());
			hspCzzlInf.setEmgNo(emgSeq);
			hspCzzlInf.setModUser(activeUser.getUsrno());
			hspCzzlInf.setCrtUser(activeUser.getUsrno());
			hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
		}
		return resultInfo;
	}

	@Override
	public Map<Integer, String> getYljgczzlqkdcb(HspemginfQueryDto hspemginfQueryDto) {
		//注：数据内容按表格结构注入
		Map<Integer,String> map = new HashMap<Integer, String>();
		
		return map;
	}

	@Override
	public ResultInfo getCzPatientBasicInfo(String regSeq) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		HspDbzlBas hspDbzlBas = hspDbzlBasMapper.selectByPrimaryKey(regSeq);
		Map<String,Object> sysdata = new HashMap<>();
		sysdata.put("hspDbzlBasInf", hspDbzlBas);
		resultInfo.setSysdata(sysdata);
		return resultInfo;
	}

	@Override
	public ResultInfo getAidPatientByEmgSeq(String emgSeq) {
		
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String,Object> sysdata = new HashMap<>();
		JSONObject json = new JSONObject();
			// 分诊
			HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(emgSeq);
			AidPatient aidPatient = aidPatientMapper.selectByPrimaryKey(hspEmgInf.getPatid());
			AidPatientXt aidPatientXt = aidPatientXtMapper.selectByPrimaryKey(hspEmgInf.getPatid());
			sysdata.put("aidPatient", aidPatient);
			sysdata.put("aidPatientXt", aidPatientXt);
		resultInfo.setSysdata(sysdata);
		return resultInfo;
	}
	
	@Override
	public ResultInfo getCzJyjcInfo(String emgSeq) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String,Object> sysdata = new HashMap<String, Object>();
		String mpi = "";
//		long jzxh = 0;
		Date date = new Date();
		HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(emgSeq);
		if(hspEmgInf != null){
			mpi = hspEmgInf.getMpi();
//			jzxh = hspEmgInf.getJzxh();
			date = hspEmgInf.getEmgDat();
		}
		VHemsJcjgExample example = new VHemsJcjgExample();
		VHemsJcjgExample.Criteria criteria = example.createCriteria();
		criteria.andMpiEqualTo(mpi);
		criteria.andShrqGreaterThanOrEqualTo(date);
		criteria.andShrqLessThanOrEqualTo(DateUtils.addDays(date, 2));
		List<VHemsJcjg> jcjgList = vHemsJcjgMapperCustom.selectByExample(example);
		sysdata.put("jcjgList", jcjgList);
		
		VHemsJyjgExample jyjgexample = new VHemsJyjgExample();
		VHemsJyjgExample.Criteria jyjgcriteria = jyjgexample.createCriteria();
		jyjgcriteria.andMpiEqualTo(mpi);
		jyjgcriteria.andResultDateTimeGreaterThan(date);
		jyjgcriteria.andResultDateTimeLessThanOrEqualTo(DateUtils.addDays(date, 2));
		jyjgexample.setDistinct(true);
		jyjgexample.setOrderByClause("RESULT_DATE_TIME ,XH");
		List<VHemsJyjg> jyjglist = vHemsJyjgMapper.selectByExample(jyjgexample);
		// 根据大项分组,判断条件为report_item_name为null
					JSONArray jsonArray = new JSONArray();
					if(jyjglist.size()>0) {
						for(VHemsJyjg vHemsJyjg:jyjglist) {
							if(vHemsJyjg.getReportItemName()==null) {
								JSONObject jsonObject = new JSONObject();
								jsonObject.put("examinaim", vHemsJyjg.getExaminaim());
								jsonObject.put("resultDateTime", vHemsJyjg.getResultDateTime());
								jsonObject.put("sampleno", vHemsJyjg.getSampleno());
								jsonObject.put("data", new JSONArray());
								jsonArray.add(jsonObject);
							}
						}
						for(VHemsJyjg vHemsJyjg:jyjglist) {				
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
		sysdata.put("jyjgList", jsonArray);
		
		resultInfo.setSysdata(sysdata);
		return resultInfo;
	}

	@Override
	public ResultInfo getCzFirstPageInfo() {
		// TODO Auto-generated method stub
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, Object> sysdata = new HashMap<String, Object>();
		
		//新增病历
		String con_xzbl = "where czlcflg = '1'" 
				+ "and emg_dat < trunc(sysdate)+1"
				+ "and emg_dat > trunc(sysdate)";
		int num_xzbl = hspemginfCustomMapper.findEmgByCon(con_xzbl);
		sysdata.put("num_xzbl", num_xzbl);
		
		//本周新增
		String con_bzxz = "where czlcflg = '1'"
				+ "and emg_dat < trunc(next_day(sysdate -8,1))+1"
				+ "and emg_dat > trunc(next_day(sysdate -1,1))+1";
		int num_bzxz = hspemginfCustomMapper.findEmgByCon(con_bzxz);
		sysdata.put("num_bzxz", num_bzxz);
		
		//本月新增
		String con_byxz = "where czlcflg = '1'"
				+ "and emg_dat < trunc(add_months(sysdate,1),'mm')"
				+ "and emg_dat > trunc(sysdate,'mm')";
		int num_byxz = hspemginfCustomMapper.findEmgByCon(con_byxz);
		sysdata.put("num_byxz", num_byxz);
		
		//本年累计
		String con_bnlj = "where czlcflg = '1'"
				+ "and emg_dat < trunc(add_months(sysdate,12),'yyyy')"
				+ "and emg_dat > trunc(sysdate,'yyyy')";
		int num_bnlj = hspemginfCustomMapper.findEmgByCon(con_bnlj);
		sysdata.put("num_bnlj", num_bnlj);
		
		//患者总数
		String con_hzzs = "where czlcflg = '1'";
		int num_hzzs = hspemginfCustomMapper.findEmgByCon(con_hzzs);
		sysdata.put("num_hzzs",num_hzzs);
		
		//溶栓总数
		String con_rszs = "where czlcflg = '1'"
				+ "and exists (select 1 from hsp_czzl_inf where emg_no = hsp_emg_inf.emg_seq and  pro_code = 'ISRS' and pro_val = '1')";
		int num_rszs = hspemginfCustomMapper.findEmgByCon(con_rszs);
		sysdata.put("num_rszs",num_rszs);
		
		//介入总数
		String con_jrzs = "where czlcflg = '1'"
				+ "and exists (select 1 from hsp_czzl_inf where emg_no = hsp_emg_inf.emg_seq and  pro_code = 'ISQS' and pro_val = '1')";
		int num_jrzs = hspemginfCustomMapper.findEmgByCon(con_jrzs);
		sysdata.put("num_jrzs",num_jrzs);
		
		//住院总数（急诊转归）
		String con_zyzs = "where czlcflg = '1'"
				+ "and exists (select 1 from hsp_sql_inf where emg_seq = hsp_emg_inf.emg_seq and sql_sta_cod = '2')";
		int num_zyzs = hspemginfCustomMapper.findEmgByCon(con_zyzs);
		sysdata.put("num_zyzs",num_zyzs);
		
		resultInfo.setSysdata(sysdata);
		return resultInfo;
	}
}
