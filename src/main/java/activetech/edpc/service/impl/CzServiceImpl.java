package activetech.edpc.service.impl;

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
import activetech.base.service.SystemConfigService;
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
import activetech.zyyhospital.dao.mapper.*;
import activetech.zyyhospital.pojo.domain.HspConsentInf;
import activetech.zyyhospital.pojo.domain.HspConsentInfExample;
import activetech.zyyhospital.pojo.domain.HspConsultationRecords;
import activetech.zyyhospital.pojo.domain.HspConsultationRecordsExample;
import activetech.zyyhospital.pojo.dto.HspConsultationRecordsCustom;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.apache.commons.codec.binary.Base64;


import java.io.InputStream;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class CzServiceImpl implements CzService{
	
	@Autowired
	private HspZlInfCustomMapper hspZlInfCustomMapper;
	
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
	private HspHljldInfMapper hspHljldInfMapper;
	
	@Autowired
	private HspZlInfMapper hspZlInfMapper;
	
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
	private SystemConfigService systemConfigService;


	@Autowired
	private HspDbzlBasMapper hspDbzlBasMapper;

	@Override
	public ResultInfo getCzPatientInfoList(QueryDto queryDto) {
		ResultInfo resultInfo = null;
		//List<HspemginfCustom> list = hspZlInfCustomMapper.getCzPatientInfoList(queryDto);
		List<HspDbzlBasCustom> list = hspZlInfCustomMapper.getCzPatientInfoListForDbzlBas(queryDto);
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
		String regSeq = hspDbzlBasMapperCustom.selectByEmgSeq(emgSeq).getRegSeq();
		HspFlowChartInf hspFlowChartInf = new HspFlowChartInf();
		hspFlowChartInf.setEmgSeq(regSeq);
		List<HspFlowChartInfCustom> flowChartList = 
				hspFlowChartInfMapperCustom.getHspFlowChartInfCustomList(hspFlowChartInf);
		List<String> paramList = new ArrayList<>();
		
		paramList.add("NZDSJ");
		
		paramList.add("XHYSJ");
		
		paramList.add("YXXJCSJ");
		
		paramList.add("ZDSJ");
		
		paramList.add("RSZLKSSJ");
		
		List<HspZlInf> hspZlInfList	= hspZlInfCustomMapper.getHspCzzlInfByEmgSeqAndProCodeList(regSeq,paramList);
		Map<String,Object> map = new HashMap<>();
		map.put("flowChartList", flowChartList);
		map.put("hspCzzlInfList", hspZlInfList);
		resultInfo.setSysdata(map);
		return resultInfo;
	}

	@Override
	public ResultInfo getCzNodeInfoByEmgSeq(String emgSeq, String nodeId) {
		ResultInfo resultInfo = null;
		resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String,Object> map = new HashMap<String,Object>();
		String regSeq = hspDbzlBasMapperCustom.selectByEmgSeq(emgSeq).getRegSeq();
		List<HspZlInfCustom> list = null;
		// 神经内科 神经外科 转归 分别处理
		if("tzczyshz".equals(nodeId)||"sjwkhz".equals(nodeId)){
			
			HspConsultationRecordsExample example = new HspConsultationRecordsExample();
			HspConsultationRecordsExample.Criteria criteria = example.createCriteria();
			criteria.andEmgSeqCrEqualTo(emgSeq);
			List<HspConsultationRecords> _list = hspConsultationRecordsMapper.selectByExample(example);
			if(_list.size()>0){
				HspConsultationRecords HspConsultationRecords = _list.get(0);
				list = new ArrayList<>();
				
				HspZlInfCustom hspZlInfCustom1 = new HspZlInfCustom();
				hspZlInfCustom1.setProType("time2");
				hspZlInfCustom1.setProVal(DateUtil.formatDateByFormat( HspConsultationRecords.getInvitationDate(),DateUtil.DATETIME_FORMAT));
				hspZlInfCustom1.setProName("会诊邀请时间");
				list.add(hspZlInfCustom1);
				
				HspZlInfCustom hspZlInfCustom2 = new HspZlInfCustom();
				hspZlInfCustom2.setProType("input");
				DstcompctlCustom dstcompctlCustom = dstcompctlCustomMapper.selectCompctlByComno(HspConsultationRecords.getInvitationDep());
				hspZlInfCustom2.setProVal(dstcompctlCustom.getComcname());
				hspZlInfCustom2.setProName("会诊邀请科室");
				list.add(hspZlInfCustom2);
				
				HspZlInfCustom hspZlInfCustom3 = new HspZlInfCustom();
				hspZlInfCustom3.setProType("input");
				hspZlInfCustom3.setProVal(HspConsultationRecords.getInvitationDocNme());
				hspZlInfCustom3.setProName("会诊邀请医生");
				list.add(hspZlInfCustom3);
				
				
				HspZlInfCustom hspZlInfCustom4 = new HspZlInfCustom();
				hspZlInfCustom4.setProType("time2");
				hspZlInfCustom4.setProVal(DateUtil.formatDateByFormat( HspConsultationRecords.getConsultationDate(), DateUtil.DATETIME_FORMAT));
				hspZlInfCustom4.setProName("会诊签到时间");
				list.add(hspZlInfCustom4);
				
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
			list = hspZlInfCustomMapper.getHspCzzlInfByEmgSeqAndStep(regSeq, nodeId);
		} 
		map.put("list", list);
		resultInfo.setSysdata(map);
		return resultInfo;
	}

	@Override
	public List<HspZlInf> getCzNodeInfoByEmgSeqProCode(String emgSeq,List<String> paramList) {
		return hspZlInfCustomMapper.getHspCzzlInfByEmgSeqAndProCodeList(emgSeq,paramList);
	}

	@Override
	public ResultInfo getRsInf(String emgSeq) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, Object> map = new HashMap<String, Object>();
		List<String> paramlist = new ArrayList<String>();
		paramlist.add("YWXZ");
		List<HspZlInf> YWXZ = hspZlInfCustomMapper.getHspCzzlInfByEmgSeqAndProCodeList(emgSeq,paramlist);
		String retStr = "0|暂未查找到该病人溶栓信息";
		if(YWXZ!=null && YWXZ.size()>0){
			if("0".equals(YWXZ.get(0).getProVal())){
				paramlist.clear();
				paramlist.add("RTPAZJL");
				paramlist.add("TIZHONG");
				List<HspZlInf> rtPAList = hspZlInfCustomMapper.getHspCzzlInfByEmgSeqAndProCodeList(emgSeq,paramlist);
				String TIZHONG = "";
				String RTPAZJL = "";
				for (HspZlInf rtPA : rtPAList) {
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
				List<HspZlInf> njmList = hspZlInfCustomMapper.getHspCzzlInfByEmgSeqAndProCodeList(emgSeq,paramlist);
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
		//获取患者基本信息
		HspDbzlBas hspDbzlBas = hspDbzlBasMapperCustom.selectByPrimaryByEmgSeq(emgSeq);
		sysdata.put("hspDbzlBas", hspDbzlBas);

		//获取卒中诊疗表信息
		HspZlInfExample hspZlInfExample = new HspZlInfExample();
		HspZlInfExample.Criteria hspZlInfCriteria = hspZlInfExample.createCriteria();
		hspZlInfCriteria.andEmgNoEqualTo(emgSeq);
		List<HspZlInf> hspZlInfList = hspZlInfMapper.selectByExample(hspZlInfExample);
		sysdata.put("hspCzzlInfList", hspZlInfList);

		//分诊图片  |   化验项目图片 | 护理记录单截图
		Map<String ,String> hspZlInfMap= hspZlInfList.stream().filter(hspZlInf-> hspZlInf.getProVal()!=null).collect(Collectors.toMap(HspZlInf::getProCode, HspZlInf::getProVal, (key1, key2) -> key2));
		try {
			if (hspZlInfMap.containsKey("FZJT")){
				String fileSeq=hspZlInfMap.get("FZJT");
				sysdata.put("fzPicData",this.getPictureBase64(fileSeq));
			}
			if (hspZlInfMap.containsKey("HYXMJT")){
				String fileSeq=hspZlInfMap.get("HYXMJT");
				sysdata.put("hyPicData",this.getPictureBase64(fileSeq));
			}
			if (hspZlInfMap.containsKey("HLJLDJT")){
				String fileSeq=hspZlInfMap.get("HYXMJT");
				sysdata.put("hlPicData",this.getPictureBase64(fileSeq));
			}
		} catch (Exception e) {
			e.printStackTrace();
			sysdata.put("errMsg",e.getMessage());
			resultInfo.setSysdata(sysdata);
			return resultInfo;
		}
		resultInfo.setSysdata(sysdata);
		return resultInfo;
	}

	/**
	 * 获取minio 图片base64
	 * @param fileSeq fileSeq
	 * @return String
	 * @throws Exception Exception
	 */
	public String getPictureBase64(String fileSeq) throws Exception{
		Dstarchives dstarchives = dstarchivesMapper.selectByPrimaryKey(fileSeq);
		Assert.notNull(dstarchives);
		InputStream fileInputStream= MinIoUtil.getObject(dstarchives.getFileType(),dstarchives.getFileName());
		return Base64.encodeBase64String((IOUtils.toByteArray(fileInputStream)));
	}

	@Override
	public ResultInfo getCzTimeline(String regSeq) {
		// TODO Auto-generated method stub
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, Object> sysdata = new HashMap<String, Object>();
		List<HspZlInfCustom> list = hspZlInfCustomMapper.getCzTimeline(regSeq);
		list.sort(Comparator.comparing(HspZlInfCustom::getProVal));
		sysdata.put("czTimeline", list);
		resultInfo.setSysdata(sysdata);
		return resultInfo;
	}

//	@Override
//	public DataGridResultInfo getCzPatientList(HspCzzlInfQueryDto hspCzzlInfQueryDto,int page,int rows) {
//		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
//		int total = hspZlInfCustomMapper.countCzPatientList(hspCzzlInfQueryDto);
//		PageQuery pageQuery = new PageQuery();
//		pageQuery.setPageParams(total, rows, page);
//		hspCzzlInfQueryDto.setPageQuery(pageQuery);
//		List<HspCzzlInfQueryDto> list = hspZlInfCustomMapper.getCzPatientList(hspCzzlInfQueryDto);
//		dataGridResultInfo.setRows(list);
//		dataGridResultInfo.setTotal(total);
//		return dataGridResultInfo;
//	}

	@Override
	public DataGridResultInfo getCzPatientList(HspDbzlBasQueryDto hspDbzlBasQueryDto) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		int total = hspZlInfCustomMapper.countCzPatientList(hspDbzlBasQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total,hspDbzlBasQueryDto.getRows(), hspDbzlBasQueryDto.getPage());
		hspDbzlBasQueryDto.setPageQuery(pageQuery);
		List<HspDbzlBasCustom> list = hspZlInfCustomMapper.getCzPatientList(hspDbzlBasQueryDto);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(total);
		return dataGridResultInfo;
	}

	@Override
	public ResultInfo getCzhcbInfoByEmgSeq(String emgSeq) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String,Object> sysdata = new HashMap<String, Object>();
		HspemginfCustom hspemginfCustom = hspZlInfCustomMapper.getCzhcbInfoByEmgseq(emgSeq);
		
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
		
		
		
		List<HspZlInf> list = hspZlInfCustomMapper.getHspCzzlInfByEmgSeqAndProCodeList(emgSeq, proList);
		
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
	public ResultInfo getCzPatientDetail(String regSeq) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String,Object> sysdata = new HashMap<String, Object>();
		//患者信息
		HspDbzlBas hspDbzlBas = hspDbzlBasMapper.selectByPrimaryKey(regSeq);
		//卒中表信息
		HspZlInfExample czzlExample = new HspZlInfExample();
		HspZlInfExample.Criteria czzlCriteria = czzlExample.createCriteria();
		czzlCriteria.andEmgNoEqualTo(regSeq);
		List<HspZlInf> czzlList = hspZlInfMapper.selectByExample(czzlExample);
		//会诊信息
		HspConsultationRecordsExample consultationExample = new HspConsultationRecordsExample();
		HspConsultationRecordsExample.Criteria consultationCriteria = consultationExample.createCriteria();
		consultationCriteria.andEmgSeqCrEqualTo(regSeq);
		consultationExample.setOrderByClause("invitation_date");
//		consultationExample.setOrderByClause("consultation_date");
		List<HspConsultationRecords> consultationList = hspConsultationRecordsMapper.selectByExample(consultationExample);
		//介入通知时间，介入到达时间
		HspConsultationRecordsCustom hspConsultationRecordsCustomJr  = hspConsultationRecordsCustomMapper.findCzHzInfEmgSeqJR(regSeq);
		// 图片信息
		DstarchivesExample example = new DstarchivesExample();
		DstarchivesExample.Criteria criteria = example.createCriteria();
		criteria.andRefIdEqualTo(regSeq);
		List<Dstarchives> picList = dstarchivesMapper.selectByExample(example);
		for(Dstarchives dstarchives:picList){
			if("ecg".equals(dstarchives.getFileType())){
				sysdata.put("ecgPicPath", dstarchives.getFileType()+"/"+dstarchives.getFileName());
			}
		}
		
//		sysdata.put("hspemgInfCustom", hspemgInfCustom);
		sysdata.put("hspDbzlBas", hspDbzlBas);
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
	public ResultInfo czPatientSubmit(List<HspZlInfCustom> czzlInfList, String emgSeq, ActiveUser activeUser) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		for(HspZlInfCustom hspZlInfCustom : czzlInfList){
			HspZlInf hspZlInf = new HspZlInf();
			hspZlInf.setProCode(hspZlInfCustom.getProCode());
			hspZlInf.setProVal(hspZlInfCustom.getProVal());
			hspZlInf.setEmgNo(emgSeq);
			hspZlInf.setModUser(activeUser.getUsrno());
			hspZlInf.setCrtUser(activeUser.getUsrno());
			hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
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
		HspDbzlBasQueryDto hspDbzlBasQueryDto = new HspDbzlBasQueryDto();
		hspDbzlBasQueryDto.setRegSeq(regSeq);
		HspDbzlBas hspDbzlBas = hspDbzlBasMapperCustom.getHspDbzlBasinf(hspDbzlBasQueryDto);
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

	@Override
	public int getCzPatientInfoListCount(QueryDto queryDto) {
		return hspZlInfCustomMapper.getCzPatientInfoListCount(queryDto);
	}

	@Override
	public List<HspDbzlBasCustom> getCzPatientInfoListByPage(QueryDto queryDto) {
		return hspZlInfCustomMapper.getCzPatientInfoListForDbzlBas(queryDto);
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
				hspDbzlBasCustom.setPatTyp("2");
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
}
