package activetech.edpc.service.impl;

import activetech.base.dao.mapper.DstarchivesMapper;
import activetech.base.dbconfig.ApplicationConfig;
import activetech.base.pojo.domain.Dstarchives;
import activetech.base.pojo.domain.DstarchivesExample;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.edpc.dao.mapper.*;
import activetech.edpc.pojo.domain.*;
import activetech.edpc.pojo.dto.*;
import activetech.edpc.service.CsService;
import activetech.hospital.dao.mapper.HspEmgInfMapper;
import activetech.hospital.dao.mapper.HspemginfCustomMapper;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.util.UUIDBuild;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;
import java.util.*;

public class CsServiceImpl implements CsService{
	
	@Autowired
	private HspBodyPartsDefMapper hspBodyPartsDefMapper;
	
	@Autowired
	private HspCsabcDefMapper hspCsabcDefMapper;
	
	@Autowired
	private HspCsabcInfMapper hspCsabcInfMapper;
	
	@Autowired
	private HspCsabcInfMapperCustom hspCsabcInfMapperCustom;
	
	@Autowired
	private HspCsampInfMapper hspCsampInfMapper;
	
	@Autowired
	private HspCsampInfMapperCustom hspCsampInfMapperCustom;
	
	@Autowired
	private HspCsoaeDefMapper hspCsoaeDefMapper;
	
	@Autowired
	private HspCsoaeInfMapper hspCsoaeInfMapper;
	
	@Autowired
	private HspCscpnDefMapper hspCscpnDefMapper;
	
	@Autowired
	private HspCscpnInfMapper hspCscpnInfMapper;
	
	@Autowired
	private HspCscpnInfMapperCustom hspCscpnInfMapperCustom;
	
	@Autowired
	private CpcMapper cpcMapper;
	
	@Autowired
	private HspSbarInfMapper hspSbarInfMapper;
	
	@Autowired
	private HspCsmicDefMapper hspCsmicDefMapper;
	
	@Autowired
	private HspemginfCustomMapper hspemginfCustomMapper;
	
	@Autowired
	private HspZlInfMapper hspZlInfMapper;
	
	@Autowired
	private HspZlInfCustomMapper hspZlInfMapperCustom;
	
	@Autowired
	private HspEmgInfMapper hspEmgInfMapper;
	
	@Autowired
	private HspCspfDefMapperCustom hspCspfDefMapperCustom;
	
	@Autowired
	private HspCspfDtlMapper hspCspfDtlMapper;
	
	@Autowired
	private HspCspfResMapper hspCspfResMapper;

	@Autowired
	private HspDbzlBasMapper hspDbzlBasMapper;
	@Autowired
	private HspDbzlBasMapperCustom hspDbzlBasMapperCustom;

	@Autowired
	private DstarchivesMapper dstarchivesMapper;

	private static String publicNetUrl;

	@Value("${minio.publicNetUrl}")
	public void setPresignedObjectUrl(String publicNetUrl) {
		CsServiceImpl.publicNetUrl = publicNetUrl;
	}


	@Override
	public ResultInfo getHspBodyPartsDef() {
		ResultInfo resultInfo = null;
		
		HspBodyPartsDefExample example = new HspBodyPartsDefExample();
		List<HspBodyPartsDef> list = hspBodyPartsDefMapper.selectByExample(example);
		
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
	public ResultInfo getCsABCDEdefList() {
		
		ResultInfo resultInfo = null;
		
		HspCsabcDefExample example = new HspCsabcDefExample();
		List<HspCsabcDef> list = hspCsabcDefMapper.selectByExample(example);
		
		if(list.size()>0){
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
			Map<String,Object> result = new HashMap<>();
			
			Map<String , JSONObject> map = new HashMap<>();
			for(HspCsabcDef hspCsabcDef :list){
				
				String keyName = "";
				if("0".equals(hspCsabcDef.getAstTyp())){
					keyName = "pgjg";
				}else if("1".equals(hspCsabcDef.getAstTyp())){
					keyName = "zlcs";
				}else{
					continue;
				}
				
				if(map.containsKey(hspCsabcDef.getAbcPrt())){
					JSONObject jsonObj = map.get(hspCsabcDef.getAbcPrt());
					
					if(jsonObj.containsKey(keyName)){
						JSONArray jsArr = (JSONArray) jsonObj.get(keyName);
						jsArr.add(hspCsabcDef);
					}else{
						JSONArray jsArr = new JSONArray();
						jsArr.add(hspCsabcDef);
						jsonObj.put(keyName, jsArr);
					}
					map.put(hspCsabcDef.getAbcPrt(), jsonObj);
				}else{
					JSONObject jsonObj = new JSONObject();
					JSONArray jsArr = new JSONArray();
					jsArr.add(hspCsabcDef);
					
					
					jsonObj.put(keyName, jsArr);
					map.put(hspCsabcDef.getAbcPrt(), jsonObj);
				}
			}
			result.put("abcde", map);
			resultInfo.setSysdata(result);
		}else{
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 902, null);
		}
		
		
		return resultInfo;
	}

	@Override
	public ResultInfo mergeCsABCDEinf(HspCsabcInfQueryDto hspCsabcInfQueryDto,ActiveUser activeUser) {
		
		ResultInfo resultInfo = null;
		
		// 判断是否是新增，新增没有abc_seq,修改有abc_seq;
		String abcSeq = hspCsabcInfQueryDto.getAbcSeq();
		
		String emgSeq = hspCsabcInfQueryDto.getEmgSeq();
		
		String usrNo = activeUser.getUsrno();
		String usrName = activeUser.getUsrname();
		List<HspCsabcInf> list = hspCsabcInfQueryDto.getList();
		
		
			// 修改 ，先删除原有的记录。
			HspCsabcInfExample example = new HspCsabcInfExample();
			HspCsabcInfExample.Criteria criteria = example.createCriteria();
			//criteria.andAbcSeqEqualTo(abcSeq);
			criteria.andEmgSeqEqualTo(emgSeq);
			hspCsabcInfMapper.deleteByExample(example);
		Date date = new Date();
		for(HspCsabcInf hspCsabcInf: list){
			hspCsabcInf.setAbcSeq(UUIDBuild.getUUID());
			hspCsabcInf.setEmgSeq(emgSeq);
			hspCsabcInf.setCrtTim(date);
			hspCsabcInf.setUsrNo(usrNo);
			hspCsabcInf.setUsrNme(usrName);
			hspCsabcInfMapper.insert(hspCsabcInf);
		}
		
		resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		
		return resultInfo;
	}

	@Override
	public ResultInfo mergeAmpleSubmit(HspCsampInf hspCsampInf) {
		
		ResultInfo resultInfo = null;
		
		hspCsampInf.setCrtTim(new Date());
		
		int ret = hspCsampInfMapperCustom.mergeAmpleSubmit(hspCsampInf);
		
		if(ret==1){
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
			
		}else{
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 902, null);
		}
		
		return resultInfo;
	}

	@Override
	public ResultInfo getAmpleSubmit(HspCsampInf hspCsampInf) {
		
		ResultInfo resultInfo = null;
		
		HspCsampInf ret = hspCsampInfMapper.selectByPrimaryKey(hspCsampInf.getEmgSeq());
		
		if(ret!=null){
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
			Map<String,Object> map = new HashMap<>();
			map.put("hspCsampInf", ret);
			resultInfo.setSysdata(map);
		}else{
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 902, null);
		}
		
		return resultInfo;
	}

	@Override
	public ResultInfo getCsABCDEinfList(HspCsabcInfQueryDto hspCsabcInfQueryDto) {
		
		ResultInfo resultInfo = null;
		
		String emgSeq = hspCsabcInfQueryDto.getEmgSeq();
		String abcSeq = hspCsabcInfQueryDto.getAbcSeq();
		
		List<HspCsabcInfCustom> list = hspCsabcInfMapperCustom.getHspCsabcInfList(hspCsabcInfQueryDto);
		
		if(list.size()>0){
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
			Map<String,Object> map = new HashMap<>();
			map.put("hspCsampInfList", list);
			resultInfo.setSysdata(map);
		}else{
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 902, null);
		}
		
		return resultInfo;
	}

	@Override
	public ResultInfo getHspCsoaeDefList() {
		ResultInfo resultInfo = null;
		List<HspCsoaeDef> list = hspCsoaeDefMapper.selectByExample(new HspCsoaeDefExample());
		if(list.size()>0){
			JSONArray jsonArray = new JSONArray();
			for(HspCsoaeDef hspCsoaeDef:list){
				
				// 要新增的对象
				JSONObject _json = new JSONObject();
				_json.put("fldCod", hspCsoaeDef.getFldCod());
				_json.put("fldNme", hspCsoaeDef.getFldNme());
				
				
				boolean haskey = false;
				for(int i=0;i<jsonArray.size();i++){
					JSONObject json = jsonArray.getJSONObject(i);
					if(json.get("oaePrt").equals(hspCsoaeDef.getOaePrt())){
						json.getJSONArray("child").add(_json);
						haskey = true;
						break;
					}
				}
				
				if(!haskey){
					JSONObject json = new JSONObject();
					json.put("oaePrt", hspCsoaeDef.getOaePrt());
					json.put("oaeNme", hspCsoaeDef.getOaeNme());
					JSONArray _jsonArray = new JSONArray();
					_jsonArray.add(_json);
					
					json.put("child", _jsonArray);
					
					jsonArray.add(json);
				}
				
				
			}
			
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
			Map<String,Object> map = new HashMap<>();
			map.put("fzjc", jsonArray);
			resultInfo.setSysdata(map);
		}else{
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 902, null);
		}
		return resultInfo;
	}

	@Override
	public ResultInfo mergeHspCsoaeInf(HspCsoaeInfQueryDto hspCsoaeInfQueryDto,ActiveUser activeUser) {
		ResultInfo resultInfo = null;
		
		String emgSeq = hspCsoaeInfQueryDto.getEmgSeq();
		List<HspCsoaeInf> list = hspCsoaeInfQueryDto.getList();
		if(list.size()>0){
			
			HspCsoaeInfExample example = new HspCsoaeInfExample();
			HspCsoaeInfExample.Criteria criteria = example.createCriteria();
			criteria.andEmgSeqEqualTo(emgSeq);
			hspCsoaeInfMapper.deleteByExample(example);
			Date date = new Date();
			for(HspCsoaeInf hspCsoaeInf:list){
				hspCsoaeInf.setEmgSeq(emgSeq);
				hspCsoaeInf.setCrtTim(date);
				hspCsoaeInf.setUsrNo(activeUser.getUsrno());
				hspCsoaeInf.setUsrNme(activeUser.getUsrname());
				hspCsoaeInfMapper.insert(hspCsoaeInf);
			}
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		}else{
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 902, null);
		}
		
		return resultInfo;
	}

	@Override
	public ResultInfo getHspCsoaeInfList(HspCsoaeInfQueryDto hspCsoaeInfQueryDto) {
		ResultInfo resultInfo = null;
		String emgSeq = hspCsoaeInfQueryDto.getEmgSeq();
		HspCsoaeInfExample example = new HspCsoaeInfExample();
		HspCsoaeInfExample.Criteria criteria = example.createCriteria();
		criteria.andEmgSeqEqualTo(emgSeq);
		List<HspCsoaeInf> list = hspCsoaeInfMapper.selectByExample(example);
		if(list.size()>0){
			Map<String,Object> map = new HashMap<>();
			map.put("list", list);
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
			resultInfo.setSysdata(map);
		}else{
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 902, null);
		}
		
		return resultInfo;
	}

	@Override
	public ResultInfo mergeHspCscpnInf(HspCscpnInfQueryDto hspCscpnInfQueryDto,
			ActiveUser activeUser) {
		ResultInfo resultInfo = null;
		
		String emgSeq = hspCscpnInfQueryDto.getEmgSeq();
		List<HspCscpnInf> list = hspCscpnInfQueryDto.getList();
		if(list.size()>0){
			HspCscpnInfExample example = new HspCscpnInfExample();
			HspCscpnInfExample.Criteria criteria = example.createCriteria();
			criteria.andEmgSeqEqualTo(emgSeq);
			hspCscpnInfMapper.deleteByExample(example);
			Date date = new Date();
			for(HspCscpnInf hspCscpnInf:list){
				hspCscpnInf.setEmgSeq(emgSeq);
				hspCscpnInf.setCrtTim(date);
				hspCscpnInf.setUsrNo(activeUser.getUsrno());
				hspCscpnInf.setUsrNme(activeUser.getUsrname());
				hspCscpnInfMapper.insert(hspCscpnInf);
			}
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		}else{
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 902, null);
		}
		
		return resultInfo;
	}

	@Override
	public ResultInfo getHspCscpnDefList() {
		ResultInfo resultInfo = null;
		HspCscpnDefExample example = new HspCscpnDefExample();
		example.setOrderByClause("cpn_prt,fld_cod");
		HspCscpnDefExample.Criteria criteria = example.createCriteria();
		criteria.andFldTypEqualTo("RADIO");
		HspCscpnDefExample.Criteria criteriaOr = example.createCriteria();
		criteriaOr.andFldTypEqualTo("QUOTE");
		example.or(criteriaOr);
		List<HspCscpnDef> list = hspCscpnDefMapper.selectByExample(example);
		if(list.size()>0){
			Map<String,List<HspCscpnDef>> map = new TreeMap<>();
			for(HspCscpnDef hspCscpnDef:list){
				String key = "f"+hspCscpnDef.getFldCod().substring(0, 2);
				if(map.containsKey(key)){
					map.get(key).add(hspCscpnDef);
				}else{
					List<HspCscpnDef> _list = new ArrayList<>();
					_list.add(hspCscpnDef);
					map.put(key, _list);
				}
				
			}
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
			Map<String,Object> ret = new HashMap<>();
			ret.put("crasmplainDef", map);
			resultInfo.setSysdata(ret);
		}else{
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 902, null);
		}
		return resultInfo;
	
	}

	@Override
	public ResultInfo getHspCscpnInfList(HspCscpnInfQueryDto hspCscpnInfQueryDto) {
		ResultInfo resultInfo = null;
		String emgSeq = hspCscpnInfQueryDto.getEmgSeq();
		
		List<HspCscpnInfCustom> list = hspCscpnInfMapperCustom.selectByExample(emgSeq);
		if(list.size()>0){
			Map<String,Object> map = new HashMap<>();
			map.put("list", list);
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
			resultInfo.setSysdata(map);
		}else{
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 902, null);
		}
		
		return resultInfo;
	}

	@Override
	public ResultInfo getCsPatientInfoList(QueryDto queryDto) {
		ResultInfo resultInfo = null;
		//List<HspemginfCustom> list = cpcMapper.getCsPatientInfoList(queryDto);
		List<HspDbzlBasCustom> list = cpcMapper.getCsPatientInfoListForDbzlBas(queryDto);
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
	public ResultInfo mergeHspSbarInf(HspSbarInf hspSbarInf,ActiveUser activeUser) {
		ResultInfo resultInfo = null;
		
		HspSbarInf resultHspSbarInf = hspSbarInfMapper.selectByPrimaryKey(hspSbarInf.getEmgSeq());
		
		if(resultHspSbarInf!=null){
			hspSbarInf.setModTim(new Date());
			hspSbarInf.setModUsr(activeUser.getUsrno());
			hspSbarInfMapper.updateByPrimaryKeyWithBLOBs(hspSbarInf);
		}else{
			hspSbarInf.setCrtTim(new Date());
			hspSbarInf.setCrtUsr(activeUser.getUsrno());
			hspSbarInfMapper.insert(hspSbarInf);
		}
		resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		
		return resultInfo;
	}

	@Override
	public ResultInfo getHspSbarInfByEmgSeq(HspSbarInf hspSbarInf) {
		ResultInfo resultInfo = null;
		HspSbarInf _hspSbarInf = hspSbarInfMapper.selectByPrimaryKey(hspSbarInf.getEmgSeq());
		if(_hspSbarInf!=null){
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
			Map<String,Object> map = new HashMap<>();
			map.put("hspSbarInf", _hspSbarInf);
			resultInfo.setSysdata(map);
		}else{
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 900, null);
		}
		return resultInfo;
	}

	/**
	 * 获取《浙江医院创伤诊疗流程核查表》定义列表
	 */
	@Override
	public ResultInfo getCsmicDefList() {
		// TODO Auto-generated method stub
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		HspCsmicDefExample example = new HspCsmicDefExample();
		example.setOrderByClause("mic_prt asc, fld_srt asc");
		
		Map<String, Object> sysdata = new HashMap<>();
		List<HspCsmicDef> list = hspCsmicDefMapper.selectByExample(example);
		sysdata.put("hspCsmicDefList", list);
		resultInfo.setSysdata(sysdata);
		return resultInfo;
	}

	@Override
	public ResultInfo getCsinf(HspDbzlBasCustom hspDbzlBasCustom, ActiveUser activeUser) throws Exception {
		// TODO Auto-generated method stub
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, Object> sysdata = new HashMap<String , Object>();
		//String emgSeq = hspemginfCustom.getEmgSeq();
		//HspemginfCustom hspEmgInf = hspemginfCustomMapper.findEmgByEmgSeq(hspemginfCustom);
		//sysdata.put("hspEmgInf",hspEmgInf);

		String regSeq = hspDbzlBasCustom.getRegSeq();
		//患者信息
		HspDbzlBas hspDbzlBas = hspDbzlBasMapper.selectByPrimaryKey(regSeq);
		sysdata.put("hspDbzlBas",hspDbzlBas);

		HspZlInfExample example = new HspZlInfExample();
		HspZlInfExample.Criteria criteria = example.createCriteria();
		criteria.andEmgNoEqualTo(regSeq);

		DstarchivesExample arcExample = new DstarchivesExample();
		arcExample.createCriteria().andRefIdEqualTo(regSeq).andFileTypeEqualTo("ecg");
		List<Dstarchives> dstarchives = dstarchivesMapper.selectByExample(arcExample);
		for(Dstarchives node : dstarchives){
			String fileName = node.getFileName();
			fileName = publicNetUrl + "/" + node.getFileType() + "/" + fileName;
			node.setFileName(fileName);
		}

		List<HspZlInf> cszlList = hspZlInfMapper.selectByExample(example);
		sysdata.put("cszlList", cszlList);

		String locProvinceCity = ApplicationConfig.getConfig().get("LOC_PROVINCE_CITY");
		sysdata.put("locProvinceCity", locProvinceCity);

		sysdata.put("ecg", dstarchives);

		resultInfo.setSysdata(sysdata);
		return resultInfo;
	}

	@Override
	public DataGridResultInfo getCsPatientList(HspZlInfQueryDto hspZlInfQueryDto, int page, int rows) {
		// TODO Auto-generated method stub
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		int total = hspZlInfMapperCustom.countCsPatientList(hspZlInfQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspZlInfQueryDto.setPageQuery(pageQuery);
		List<HspDbzlBasCustom> list = hspZlInfMapperCustom.getCsPatientList(hspZlInfQueryDto);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(total);
		return dataGridResultInfo;
	}

	@Override
	public ResultInfo getCsTimeline(String regSeq) {
		// TODO Auto-generated method stub
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, Object> sysdata = new HashMap<String, Object>();
		List<HspZlInfCustom> list = hspZlInfMapperCustom.getCsTimeline(regSeq);
		
		
		
//		list.sort(new Comparator<HspCzzlInfCustom>() {
//
//			@Override
//			public int compare(HspCzzlInfCustom o1, HspCzzlInfCustom o2) {
//
//				// 数据库保存有2种格式的时间字符串，要排序，坑爹啊
//				SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//				SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//				
//				String dateString1 = o1.getProVal();
//				String dateString2 = o2.getProVal();
//				Date date1 = null;
//				Date date2 = null;
//				try {
//					date1 = format1.parse(dateString1);
//				} catch (ParseException e) {
//					// TODO Auto-generated catch block
//					try {
//						date1 = format2.parse(dateString1);
//					} catch (ParseException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
//				}
//				try {
//					date2 = format1.parse(dateString2);
//				} catch (ParseException e) {
//					// TODO Auto-generated catch block
//					try {
//						date2 = format2.parse(dateString2);
//					} catch (ParseException e1) {
//						// TODO Auto-generated catch block
//						e1.printStackTrace();
//					}
//				}
//				
//				
//				return date1.compareTo(date2);
//			}
//		});
		sysdata.put("csTimeline", list);
		resultInfo.setSysdata(sysdata);
		return resultInfo;
	}

	@Override
	public ResultInfo submitCsInf(List<HspZlInfCustom> cszlInfList, String emgSeq, ActiveUser activeUser) {
		// TODO Auto-generated method stub
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		for(HspZlInfCustom hspZlInfCustom : cszlInfList){
			HspZlInf hspZlInf = new HspZlInf();
			hspZlInf.setSeqNo(UUIDBuild.getUUID());
			hspZlInf.setProCode(hspZlInfCustom.getProCode());
			hspZlInf.setProVal(hspZlInfCustom.getProVal());
			hspZlInf.setEmgNo(emgSeq);
			hspZlInf.setModUser(activeUser.getUsrno());
			hspZlInf.setCrtUser(activeUser.getUsrno());
			hspZlInfMapperCustom.mergeHspCszlInf(hspZlInf);
		}
		return resultInfo;
	}
	
	@Override
	public ResultInfo getHspCsfDef(String emgSeq) {
		
		ResultInfo resultInfo = null;
		
		List<HspCspfDefCustom> list = hspCspfDefMapperCustom.getHspCsInfListWithChecked(emgSeq);
		
		
		if (list.size() > 0) {
			Map<String, Object> sysdata = new HashMap<String, Object>();
			
			//已经选中记录传递给前端
			HspCspfDtlExample example = new HspCspfDtlExample();
			HspCspfDtlExample.Criteria criteria = example.createCriteria();
			criteria.andEmgSeqEqualTo(emgSeq);
			List<HspCspfDtl> hspCspfDtlList = hspCspfDtlMapper.selectByExample(example);
			sysdata.put("hadChecked", hspCspfDtlList);
			
			JSONArray result = new JSONArray();
			
			for(HspCspfDefCustom hspCspfDef:list){
				
				boolean hasKey = false;
				for(int i=0;i<result.size();i++){
					if(result.getJSONObject(i).get("prtItem").equals(hspCspfDef.getPrtItem())){
						hasKey = true;
						JSONArray json1 = result.getJSONObject(i).getJSONArray("prtList");
						
						boolean haskey2 = false;
						for(int j=0;j<json1.size();j++){
							if(json1.getJSONObject(j).get("subItem").equals(hspCspfDef.getSubItem())){
								haskey2 = true;
								JSONObject sMap = new JSONObject();
								sMap.put("optCode", hspCspfDef.getOptCode());
								sMap.put("optName", hspCspfDef.getOptName());
								sMap.put("optScoe", hspCspfDef.getOptScoe());
								sMap.put("checked", hspCspfDef.getChecked()!=null? true:false);
								json1.getJSONObject(j).getJSONArray("subList").add(sMap);
								break;
							}
						}
						
						if(!haskey2){
							JSONObject map = new JSONObject();
							JSONArray _list = new JSONArray();
							JSONObject sMap = new JSONObject();
							sMap.put("optCode", hspCspfDef.getOptCode());
							sMap.put("optName", hspCspfDef.getOptName());
							sMap.put("optScoe", hspCspfDef.getOptScoe());
							sMap.put("checked", hspCspfDef.getChecked()!=null? true:false);
							_list.add(sMap);
							map.put("subItem", hspCspfDef.getSubItem());
							map.put("subName", hspCspfDef.getSubName());
							map.put("subList", _list);
							json1.add(map);
						}
						
						
						break;
					}
				}
				
				if(!hasKey){
					
					JSONObject json1 = new JSONObject();
					json1.put("prtItem", hspCspfDef.getPrtItem());
					json1.put("prtName", hspCspfDef.getPrtName());
					
				
				
						JSONArray json2 = new JSONArray();
							JSONObject map = new JSONObject();
							JSONArray _list = new JSONArray();
							JSONObject sMap = new JSONObject();
							sMap.put("optCode", hspCspfDef.getOptCode());
							sMap.put("optName", hspCspfDef.getOptName());
							sMap.put("optScoe", hspCspfDef.getOptScoe());
							sMap.put("checked", hspCspfDef.getChecked()!=null? true:false);
							_list.add(sMap);
							map.put("subItem", hspCspfDef.getSubItem());
							map.put("subName", hspCspfDef.getSubName());
							map.put("subList", _list);
					
						json2.add(map);
						
						
					json1.put("prtList", json2);
		
					result.add(json1);

				}
			}
			sysdata.put("body", result);

			
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
			resultInfo.setSysdata(sysdata);
		} else {
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 902, null);
		}
		return resultInfo;
	}

	@Override
	public ResultInfo addHspCspfDtl(HspCspfDtlQueryDto hspCspfDtlQueryDto,ActiveUser activeUser) {
		
		ResultInfo resultInfo = null;
		
		HspCspfDtlExample example = new HspCspfDtlExample();
		HspCspfDtlExample.Criteria criteria = example.createCriteria();
		List<HspCspfDtl> list = hspCspfDtlQueryDto.getList();
		if(list!=null){
			// 1.先删除该用户HSP_CSPF_DTL表的数据
			criteria.andEmgSeqEqualTo(hspCspfDtlQueryDto.getEmgSeq());
			hspCspfDtlMapper.deleteByExample(example);
			
			HspCspfRes record = new HspCspfRes();
			Date crtTime = new Date();
			
			if(list.size()>0){
				
				// 2.循环插入HSP_CSPF_DTL表数据
				int aisScore = 0;
				int issScore = 0;
				Map<String,Integer> aisMap = new HashMap<>();
				Map<String,Integer> issMap = new HashMap<>();
				for(HspCspfDtl hspCspfDtl:list){
					
					int score = hspCspfDtl.getOptScoe();
					String prtItme = hspCspfDtl.getPrtItem();
					String subItme = hspCspfDtl.getSubItem();
					if(issMap.containsKey(prtItme)){
						if(issMap.get(prtItme)<score){
							issMap.put(prtItme, score);
						}
					}else{
						issMap.put(prtItme, score);
					}
					
					if(aisMap.containsKey(prtItme+subItme)){
						if(aisMap.get(prtItme+subItme)<score){
							aisMap.put(prtItme+subItme, score);
						}
					}else{
						aisMap.put(prtItme+subItme, score);
					}
					
					hspCspfDtl.setEmgSeq(hspCspfDtlQueryDto.getEmgSeq());
					hspCspfDtl.setUsrNo(activeUser.getUsrno());
					hspCspfDtl.setUsrName(activeUser.getUsrname());
					hspCspfDtl.setCrtTime(crtTime);
					hspCspfDtlMapper.insert(hspCspfDtl);
				}
				// 3.计算分值插入HSP_CSPF_RES
				
				/**
				 * ais iss 评分规则
				 * ais 大类中取小类中的最大值作为大类的评分，所有大类加起来
				 * iss 3个最高ais 评分的平方和 ，最高为75分
				 * 
				 */
				List<Integer> _list = new ArrayList<>();
				for(Integer i :aisMap.values()){
					aisScore +=i;
				}
				
				
				for(Integer i :issMap.values()){
					_list.add(i);
				}
				Collections.sort(_list,new Comparator<Integer>() {

		            @Override
		            public int compare(Integer o1, Integer o2) {
		                // 返回值为int类型，大于0表示正序，小于0表示逆序
		                return o2-o1;
		            }
		        });
				if(_list.size()==0){
					issScore = 0;
				}else if(_list.size()==1){
					issScore = _list.get(0)*_list.get(0);
				}else if(_list.size()==2){
					issScore = _list.get(0)*_list.get(0) + _list.get(1)*_list.get(1);
				}else{
					issScore = _list.get(0)*_list.get(0) + _list.get(1)*_list.get(1) + _list.get(2)*_list.get(2);
				}
				
				String resDesc = "";
				if(issScore<16){
					resDesc = "1";
				}else if(issScore<25){
					resDesc = "2";
				}else{
					resDesc = "3";
				}
				record.setAisScoe((short)aisScore);
				record.setIssScoe((short)issScore);
				record.setResDesc(resDesc);
				record.setEmgSeq(hspCspfDtlQueryDto.getEmgSeq());
				record.setCrtTime(crtTime);
				record.setUsrNo(activeUser.getUsrno());
				record.setUsrName(activeUser.getUsrname());
				
				HspCspfRes hspCspfRes = hspCspfResMapper.selectByPrimaryKey(hspCspfDtlQueryDto.getEmgSeq());
				if(hspCspfRes!=null){
					hspCspfResMapper.updateByPrimaryKey(record);
				}else{
					hspCspfResMapper.insert(record);
				}
				
			}else{		
				hspCspfResMapper.deleteByPrimaryKey(hspCspfDtlQueryDto.getEmgSeq());
			}

		}
		resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		
		return resultInfo;
	}

	@Override
	public int getCsPatientInfoListCount(QueryDto queryDto) {
		return cpcMapper.getCsPatientInfoListCount(queryDto);
	}

	@Override
	public List<HspDbzlBasCustom> getCsPatientInfoListByPage(QueryDto queryDto) {
		return cpcMapper.getCsPatientInfoListForDbzlBas(queryDto);
	}

	@Override
	public ResultInfo csPatietBasicInfSubmit(HspDbzlBasQueryDto hspDbzlBasQueryDto, ActiveUser activeUser){
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		hspDbzlBasQueryDto.getHspDbzlBasCustom().setModNo(activeUser.getUsrno());
		hspDbzlBasMapperCustom.updateHspDbzlBasByRegSeq(hspDbzlBasQueryDto);
		return resultInfo;
	}

	@Override
	public ResultInfo csBRQXdataFromEmis(HspDbzlBasQueryDto hspDbzlBasQueryDto, ActiveUser activeUser) throws IOException {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
//		JSONObject jsonObject = new JSONObject();

		//调用急诊接口 url为测试用 暂不用
//		try {
//			HttpPost httpPost = new HttpPost("http://localhost:15007/atproject_edpc_war_exploded/cs/getCsinf.do");
//			CloseableHttpClient client = HttpClients.createDefault();
//			String respContent = null;
//			//json方式
//			JSONObject jsonParam = new JSONObject();
//			jsonParam.put("regSeq", hspDbzlBasQueryDto.getRegSeq());
//
//			StringEntity entity = new StringEntity(JSONObject.toJSONString(jsonParam), "utf-8");//解决中文乱码问题
//			entity.setContentEncoding("UTF-8");
//			entity.setContentType("application/json");
//			httpPost.setEntity(entity);
//			HttpResponse resp = client.execute(httpPost);//执行时机
//			if (resp.getStatusLine().getStatusCode() == 200) {
//				HttpEntity ent = resp.getEntity();
//				respContent = EntityUtils.toString(ent, "UTF-8");
//			}
//			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
//			jsonObject = JSONObject.parseObject(respContent);
//		}
//		catch (IOException e) {
//			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 920, null);
//		}

		Map<String, Object> BRQXMap = new HashMap<String, Object>();
		BRQXMap.put("BRQX", "01");
		BRQXMap.put("JZLYSJ", "1999-01-01 00:00");
		BRQXMap.put("ZLJG", "1");
		BRQXMap.put("QTLYYY", "QTLYYY");
		BRQXMap.put("ZYKS", "1");
		BRQXMap.put("BLZYSJ", "1999-01-02 00:00");
		BRQXMap.put("JSZYSJ", "1999-01-03 00:00");
		BRQXMap.put("ISZYHSW", "1");
		BRQXMap.put("ISDDICU", "0");
		BRQXMap.put("DDICUSJ", "1999-01-04 00:00");
		BRQXMap.put("LKICUSJ", "1999-01-05 00:00");
		BRQXMap.put("JJSJ", "1999-01-06 00:00");
		BRQXMap.put("JSYY", "yiyuan");
		BRQXMap.put("SWYYMS", "SWYYMS");
		BRQXMap.put("LGSJ", "1999-01-07 00:00");
		BRQXMap.put("ISLGHSW", "1");
		BRQXMap.put("LGYYMS", "LGYYMS");
		BRQXMap.put("ZGSJ", "1999-01-08 00:00");
		BRQXMap.put("JTQX", "JTQX");

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("BRQXMap", BRQXMap);
		resultInfo.setSysdata(map);

		return resultInfo;
	}

	@Override
	public ResultInfo csZYXXdataFromEmis(HspDbzlBasQueryDto hspDbzlBasQueryDto, ActiveUser activeUser) throws IOException {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
//		JSONObject jsonObject = new JSONObject();

		//调用急诊接口 url为测试用 暂不用
//		try {
//			HttpPost httpPost = new HttpPost("http://localhost:15007/atproject_edpc_war_exploded/cs/getCsinf.do");
//			CloseableHttpClient client = HttpClients.createDefault();
//			String respContent = null;
//			//json方式
//			JSONObject jsonParam = new JSONObject();
//			jsonParam.put("regSeq", hspDbzlBasQueryDto.getRegSeq());
//
//			StringEntity entity = new StringEntity(JSONObject.toJSONString(jsonParam), "utf-8");//解决中文乱码问题
//			entity.setContentEncoding("UTF-8");
//			entity.setContentType("application/json");
//			httpPost.setEntity(entity);
//			HttpResponse resp = client.execute(httpPost);//执行时机
//			if (resp.getStatusLine().getStatusCode() == 200) {
//				HttpEntity ent = resp.getEntity();
//				respContent = EntityUtils.toString(ent, "UTF-8");
//			}
//			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
//			jsonObject = JSONObject.parseObject(respContent);
//		}
//		catch (IOException e) {
//			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 920, null);
//		}

		Map<String, Object> ZYXXMap = new HashMap<String, Object>();
		ZYXXMap.put("YQZD", "院前诊断");
		ZYXXMap.put("CYZD", "出院诊断");
		ZYXXMap.put("ISCRYZDFH", "0");

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("ZYXXMap", ZYXXMap);
		resultInfo.setSysdata(map);

		return resultInfo;
	}

	@Override
	public ResultInfo csQJQKdataFromEmis(HspDbzlBasQueryDto hspDbzlBasQueryDto, ActiveUser activeUser) throws IOException {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
//		JSONObject jsonObject = new JSONObject();

		//调用急诊接口 url为测试用 暂不用
//		try {
//			HttpPost httpPost = new HttpPost("http://localhost:15007/atproject_edpc_war_exploded/cs/getCsinf.do");
//			CloseableHttpClient client = HttpClients.createDefault();
//			String respContent = null;
//			//json方式
//			JSONObject jsonParam = new JSONObject();
//			jsonParam.put("regSeq", hspDbzlBasQueryDto.getRegSeq());
//
//			StringEntity entity = new StringEntity(JSONObject.toJSONString(jsonParam), "utf-8");//解决中文乱码问题
//			entity.setContentEncoding("UTF-8");
//			entity.setContentType("application/json");
//			httpPost.setEntity(entity);
//			HttpResponse resp = client.execute(httpPost);//执行时机
//			if (resp.getStatusLine().getStatusCode() == 200) {
//				HttpEntity ent = resp.getEntity();
//				respContent = EntityUtils.toString(ent, "UTF-8");
//			}
//			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
//			jsonObject = JSONObject.parseObject(respContent);
//		}
//		catch (IOException e) {
//			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 920, null);
//		}

		Map<String, Object> QJQKMap = new HashMap<String, Object>();
		QJQKMap.put("QJJG", "0");
		QJQKMap.put("SSCS", "10");
		QJQKMap.put("ZYFY", "10000");

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("QJQKMap", QJQKMap);
		resultInfo.setSysdata(map);

		return resultInfo;
	}
}
