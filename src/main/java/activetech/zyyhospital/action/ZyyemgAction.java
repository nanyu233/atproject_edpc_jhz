package activetech.zyyhospital.action;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.domain.Dstcompctl;
import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.DstuserCustom;
import activetech.base.pojo.dto.DstuserQueryDto;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.AjaxInfo;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ExceptionResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.CompctlService;
import activetech.base.service.SystemConfigService;
import activetech.base.service.UserService;
import activetech.basehems.service.BaseHspemgInfService;
import activetech.basehis.service.OracleHisService;
import activetech.hospital.pojo.dto.HspScoCustom;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.hospital.pojo.dto.HspsqlinfCustom;
import activetech.util.DateUtil;
import activetech.util.ExcelExportSXXSSF;
import activetech.util.StringUtils;
import activetech.zyyhospital.pojo.domain.HspFrbrInf;
import activetech.zyyhospital.pojo.domain.HspZyfxpfInf;
import activetech.zyyhospital.pojo.domain.THemsSjz;
import activetech.zyyhospital.pojo.dto.HisCzCustom;
import activetech.zyyhospital.pojo.dto.HspBedInfCustom;
import activetech.zyyhospital.service.HisCzSqlServerService;
import activetech.zyyhospital.service.HspBedInfService;
import activetech.zyyhospital.service.ZyyHspemginfService;

/**
 * 
 * <p>
 * Title:EmgAction
 * </p>
 * <p>
 * Description:杭州市中医院急诊分诊
 * </p>
 * <p>
 * activetech
 * </p>
 * 
 * @author ckb
 * @date 2017年9月21日
 * 
 */
@Controller
@RequestMapping("/hzszyyemg")
public class ZyyemgAction {
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private CompctlService compctlService;
	@Autowired
	private HspBedInfService hspBedInfService;
	@Autowired
	private BaseHspemgInfService baseHspemgInfService;
	@Autowired
	private HisCzSqlServerService hisCzSqlServerService;
	@Autowired
	private UserService userService;
	@Autowired
	private OracleHisService oracleHisService;
	/**
	 * 患者分诊登记-急诊台页面
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryjsbrjz")
	public String queryjsbrjz(Model model) throws Exception {
		String date = DateUtil.formatDateByFormat(new Date(), "yyyyMMdd");
		String emgseq = systemConfigService.findSequences("HSPEMGINF_EMGSEQ","6", date);
		String HSPLP = systemConfigService.findAppoptionByOptkey("HSPLP").getOptvalue();
		if("SD".equals(HSPLP)) {
			//三墩院区预检号标识 SD
			model.addAttribute("emgSeq", "SD"+emgseq);
		}else {
			//灵隐院区预检号标识 LY
			model.addAttribute("emgSeq", "LY"+emgseq);
		}
		//判断是否打开留观室 0：未打开 1：打开
		model.addAttribute("islgbed", systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue());
		model.addAttribute("HSPLP", HSPLP);
		return "/hzszyyhospital/hzszyynurse/precheckPage/precheck";
	}

	/**
	 * 抢救室——急危患者登记
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryjsbrqjs")
	public String queryjsbrqjs(Model model,ActiveUser activeuser) throws Exception {
		String date = DateUtil.formatDateByFormat(new Date(), "yyyyMMdd");
		String emgseq = systemConfigService.findSequences("HSPEMGINF_EMGSEQ",
				"6", date);
		model.addAttribute("emgSeq", emgseq);
		model.addAttribute("cstNam", activeuser.getUsrname());
		model.addAttribute("cstNo", activeuser.getUsrno());
		model.addAttribute("islgbed", systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue());
		return "/hzszyyhospital/hzszyynurse/precheckPage/qjsPrecheck";
	}
	
	/**
	 * 修改/转归（杭州市中医院版本）
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/xgjz")
	public String xgjz(Model model, String emgSeq) throws Exception {
		String HSPLP = systemConfigService.findAppoptionByOptkey("HSPLP").getOptvalue();
		model.addAttribute("HSPLP", HSPLP);
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("islgbed", systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue());
		return "/hzszyyhospital/hzszyynurse/precheckPage/editAndOutcome";
	}
	/**
	 * 严红莉	2019/8/20	高危跌倒评分页面 
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryRisk")
	public String queryRisk(Model model) throws Exception {
		return "/hzszyyhospital/hzszyynurse/rule/queryRisk";
	}
	
	/**
	 * 严红莉	2019/11/5	特殊病人弹框页面
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querySpecial")
	public String querySpecial(Model model) throws Exception {
		return "/hzszyyhospital/hzszyynurse/rule/querySpecial";
	}
	
	/**
	 * 严红莉 2017/9/26 9:16:20 nrs评分页面
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querynrs")
	public String querynrs(Model model) throws Exception {
		return "/hzszyyhospital/hzszyynurse/rule/querynrs";
	}

	/**
	 * 卒中评分页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryczface")
	public String queryfast(Model model) throws Exception {
		return "/hzszyyhospital/hzszyynurse/rule/queryczface";
	}
	
	/**
	 * Morse跌倒评分页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryMorse")
	public String queryMorse(Model model,String typeSource) throws Exception {
		model.addAttribute("typeSource", typeSource);
		return "/hospital/nurse/rule/queryMorse";
	}
	
	/**
	 * 患者分诊登记入库
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addzyyemgsubmit_yjfz")
	public @ResponseBody SubmitResultInfo addemgsubmit_qjset(HspemginfQueryDto hspemginfQueryDto,
				ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		zyyHspemginfService.insertHspemginf_hzzyy(hspemginfQueryDto,activeUser);
		//中医院需要提供自己的视图表
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 急危患者登记入库
	 * 
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addzyyemgsubmit_qjs")
	public @ResponseBody
	SubmitResultInfo addemgsubmit_zyy(HspemginfQueryDto hspemginfQueryDto,
			ActiveUser activeUser) throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		zyyHspemginfService.insertHspemginf_qjs_hzzyy(hspemginfQueryDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 根据预检号查询病人信息 --修改转归的患者所有信息获取
	 * @param emgSeq
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findHspemginfByemgSeq_jzt")
	public @ResponseBody HspemginfQueryDto findHspemginfByemgSeq_jzt(String emgSeq)throws Exception{
		HspemginfQueryDto hspemginfQueryDto=zyyHspemginfService.findHspemginfByemgSeq_zyy(emgSeq);

		return hspemginfQueryDto;
	}

	/**
	 * 修改/转归患者信息提交
	 * 
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/updzyyemgsubmit")
	public @ResponseBody
	SubmitResultInfo updzyyemgsubmit(HspemginfQueryDto hspemginfQueryDto,
			ActiveUser activeUser) throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,
				null);
		String unique  = zyyHspemginfService.updateHspemginf_hzzyy(hspemginfQueryDto, activeUser);
		if("0".equals(unique)){
			 ResultUtil.throwExcepion(ResultUtil.createWarning(Config.MESSAGE, 920, new Object [] {"系统已存在另一笔预检数据与该病历号和就诊次数相关联，当前无法关联!"}));
		 }
		try {
			oracleHisService.sendDjhc(hspemginfQueryDto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultUtil.createSubmitResult(resultInfo);
	}

	@RequestMapping("/findEmgList_zyy")
	public @ResponseBody SubmitResultInfo findEmgList_jzt(String emgSeq,String editbedflg) throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		Map<String, String> params = new HashMap<String, String>(60);
        params.put("CST_SEX_COD", "cstSexCodList");
        params.put("ARV_CHL_COD", "arvChlCodList");
        params.put("CMP_PSN_COD", "cmpPsnCodList");
        params.put("EMG_ARE_COD", "emgAreCodList");
        params.put("MOD_LVL_COD", "emgDepCodList");
        params.put("GRN_CHL_RSN", "grnChlRsnList");
        params.put("CST_DSP_COD", "cstDspCodList");
        params.put("FAL_ASS_COD", "falAssCodList");
        params.put("MNS_SIT_COD", "mnsSitCodList");
        params.put("ALG_TYP_COD", "algTypCodList");
        params.put("SAV_MNG_COD", "savMngCodList");
        params.put("SEN_RCT", "senRctCodList");
        params.put("SEN_STU_COD", "senStuCodList");
        params.put("EYE_RCT_COD", "eyeRctCodList");
        params.put("LAN_RCT_COD", "lanRctCodList");
        params.put("ACT_RCT_COD", "actRctCodList");
        params.put("CIR_LVL_COD", "cirLvlCodList");
        params.put("BRE_LVL_COD", "breLvlCodList");
        params.put("BDY_LVL_COD", "bdyLvlCodList");
        params.put("SPT_LVL_COD", "sptLvlCodList");
        params.put("LAN_LVL_COD", "lanLvlCodList");
        params.put("SQL_STA_COD", "sqlStaCodList");
        params.put("SQL_DEP_COD", "SqlDepCodList");
        params.put("SEN_STU_COD", "senStuCodList");
        params.put("PAST_HIS", "pastHisCodList");
        params.put("CST_AGE_COD", "cstAgeCodList");
        params.put("REFUSED_SURVEY", "refusedSurveyList");
        params.put("HXKNZB", "hxknzbList");
        params.put("XTXMZB", "xtxmzbList");
        params.put("EMG_KSFZ", "ksfzList");
        //儿童FLASS量表数据字典
        params.put("FLACC_MBBQ", "flaccmbbqList");
        params.put("FLACC_TBHD", "flacctbhdList");
        params.put("FLACC_TW", "flacctwList");
        params.put("FLACC_KN", "flaccknList");
        //儿童FLASS量表数据字典
        params.put("FLACC_KAWD", "flacckawdList");
        //儿童PEWS数据字典
        params.put("PEWS_FY", "pewsfyList");
        params.put("PEWS_HX", "pewshxList");
        params.put("PEWS_XH", "pewsxhList");
        // 杭中医院nrs数据字典
        params.put("NRS_TTXZ", "nrsTtxzList");// 疼痛性质
        params.put("NRS_TTSJ", "nrsTtsjList");// 疼痛时间
        params.put("NRS_TTBW", "nrsTtbwList");// 疼痛部位
        params.put("NRS_TTKZ", "nrsTtkzList");//疼痛控制
        // Morse跌倒数据字典
        params.put("JSGYYWDD_COD", "jsgyywddCodList");// 近3月有无跌倒
        params.put("DYYGJBPD_COD", "dyygjbpdCodList");// 多于一个疾病诊断
        params.put("XZFZ_COD", "xzfzCodList");// 行走辅助
        params.put("JMZLSYDDGFXY_COD", "jmzlsyddgfxyCodList");// 静脉治疗/使用跌倒高风险药
        params.put("BT_COD", "btCodList");// 步态
        params.put("RZNL_COD", "rznlCodList");// 认知能力
        //产科指标
        params.put("PREGNANT_YDCX_COD", "pregnantYdcxCodList");// 阴道出血
        params.put("PREGNANT_GSPL_COD", "pregnantGsplCodList");//宫缩频率
        //特殊病人评估
        params.put("SPECIAL_COD","specialOtherList");
        //卡类别
        params.put("CARD_TYPE_COD","cardTypeList");
        //发热项目数据字典
        params.put("FR_COD", "frCodList");
		//gsc评分字典
		params.put("EYE_RCT_COD", "eyeRctCodList");
		params.put("LAN_RCT_COD", "lanRctCodList");
		params.put("ACT_RCT_COD", "actRctCodList");
        
        Map<String, List<Dstdictinfo>> maps = systemConfigService.findDstdictinfos(params);
        Map<String, Object> map = new HashMap<String, Object>(70);
        map.putAll(maps);
        map.put("modLvlCodList", maps.get("emgDepCodList"));
        map.put("chkLvlCodList", maps.get("emgDepCodList"));
        resultInfo.setSysdata(map);
		// 急诊科室列表
		List<Dstcompctl> jzkscompctlList = compctlService.getJzksCompctlList();
		map.put("jzkscompctlList", jzkscompctlList);
		
		//获取床位
		if(emgSeq==null){
			emgSeq="";
		}
		//editbedflg 为1 代表床位列表会把预检时床位加进去，无论这个床有没有被占用。修改界面用
		List<HspBedInfCustom> bedplacecodList=hspBedInfService.findBedPlaceAndNum(emgSeq,editbedflg);
		map.put("bedplacecodList",bedplacecodList);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	

	
	/**
	 * 删除急诊记录
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delzyyemgSubmit")
	public @ResponseBody SubmitResultInfo delemgSubmit(String emgSeq,ActiveUser activeuser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		zyyHspemginfService.deleteHspemginf_hzzyy(emgSeq, activeuser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 急诊记录列表跳转
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryjzjlzyy")
	public String jzjl(Model model, String moduleid) throws Exception{
		//将页面所需数据取出传到页面
		List<Dstdictinfo> stateList = systemConfigService.findDictinfoByType("CST_DSP_COD");
		// 急诊科室列表
		List<Dstcompctl> jzkscompctlList = compctlService.getJzksCompctlList();
		model.addAttribute("jzkscompctlList", jzkscompctlList);
		model.addAttribute("stateList", stateList);
		model.addAttribute("moduleid", moduleid);
		return "/hzszyyhospital/hzszyynurse/queryjzjl";
	}
	/**
	 * 急诊记录查询列表
	 * @param dstuserQueryDto
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryjzjlzyy_result")
	public @ResponseBody DataGridResultInfo queryjzjl_result(
			HspemginfQueryDto hspemginfQueryDto,
			Date today,
			int page,//当前页码
			int rows,//每页显示个数
			String sort,
			String order
			) throws Exception{
		//非空校验
		hspemginfQueryDto = hspemginfQueryDto!=null?hspemginfQueryDto:new HspemginfQueryDto();
		//首次查询时默认赋值系统当天日期
		if(hspemginfQueryDto.getHspemginfCustom()==null){
			HspemginfCustom hspemginfCustom=new HspemginfCustom();
			hspemginfCustom.setStartdate(today);
			hspemginfCustom.setEnddate(today);
			hspemginfQueryDto.setHspemginfCustom(hspemginfCustom);
		}
		//查询列表的总数
		if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
			hspemginfQueryDto.setSort("emgdat");
		}
		if(!StringUtils.isNotNullAndEmptyByTrim(order)){
			hspemginfQueryDto.setOrder("desc");
		}
		//判断是否开启留观室
		hspemginfQueryDto.getHspemginfCustom().setIslgbed(systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue());
		//增加判断条件，pageName等于1 说明是患者列表页面的请求
		hspemginfQueryDto.setPageName("1");
		int total =zyyHspemginfService.findHspemginfCount(hspemginfQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);	
		hspemginfQueryDto.setPageQuery(pageQuery);
		List<HspemginfCustom> list =zyyHspemginfService.findHspemginfList(hspemginfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/exportfzgllbSubmit")
	public  SubmitResultInfo exportfzgllbSubmit(HspemginfQueryDto hspemginfQueryDto,
			Date today,
			String sort,
			String order
			) throws Exception {
		
		
		//非空校验
		hspemginfQueryDto = hspemginfQueryDto!=null?hspemginfQueryDto:new HspemginfQueryDto();
		//首次查询时默认赋值系统当天日期
		if(hspemginfQueryDto.getHspemginfCustom()==null){
			HspemginfCustom hspemginfCustom=new HspemginfCustom();
			hspemginfCustom.setStartdate(today);
			hspemginfCustom.setEnddate(today);
			hspemginfQueryDto.setHspemginfCustom(hspemginfCustom);
		}
		if(hspemginfQueryDto.getHspemginfCustom().getEnddate() != null){
			Date endDate = DateUtil.getNextDay(hspemginfQueryDto.getHspemginfCustom().getEnddate());
			hspemginfQueryDto.getHspemginfCustom().setEnddate(endDate);
		}
		//查询列表的总数
		if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
			hspemginfQueryDto.setSort("emgdat");
		}
		if(!StringUtils.isNotNullAndEmptyByTrim(order)){
			hspemginfQueryDto.setOrder("desc");
		}
		//判断是否开启留观室
		hspemginfQueryDto.getHspemginfCustom().setIslgbed(systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue());
		List<HspemginfCustom> list =zyyHspemginfService.findHspemginfList(hspemginfQueryDto);		
		
		
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "fzgllb";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("收治日期");
		fieldNames.add("病历号");
		fieldNames.add("病人姓名");
		fieldNames.add("性别");
		fieldNames.add("年龄");
		fieldNames.add("主诉症状");
		fieldNames.add("急诊分级");
		fieldNames.add("首诊状态");
		fieldNames.add("分科");
		fieldNames.add("就诊时间");
		fieldNames.add("就诊次数");
		fieldNames.add("首诊医生");
		fieldNames.add("诊断");
		fieldNames.add("退挂号");
		fieldNames.add("转归去向");
		fieldNames.add("转归时间");
		fieldNames.add("送入方式");
		fieldNames.add("120医生");
		fieldNames.add("120驾驶员");
		fieldNames.add("绿色通道");
		fieldNames.add("分诊护士");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("emgDatStr");
		fieldCodes.add("mpi");
		fieldCodes.add("cstNam");
		fieldCodes.add("cstSexCod");
		fieldCodes.add("cstAge");
		fieldCodes.add("preDgnCod");
		fieldCodes.add("emgDepCod");
		fieldCodes.add("cstDspCod");
		fieldCodes.add("emgFkCod");
		fieldCodes.add("docDatStr");
		fieldCodes.add("jzxh");
		fieldCodes.add("sqlDctNbr");
		fieldCodes.add("jbzdDes");
		fieldCodes.add("ghbz");
		fieldCodes.add("cstDspCodNameNew");
		fieldCodes.add("sqlDat");
		fieldCodes.add("arvChlCod");
		fieldCodes.add("abnDoctor");
		fieldCodes.add("abnDriver");
		fieldCodes.add("grnChl");
		fieldCodes.add("preUsrNam");
		
		String hb = "就诊时间分布统计表";
		String gb = "查询范围: ";
		String startTime = DateUtil.formatDateByFormat(hspemginfQueryDto.getHspemginfCustom().getStartdate(), "yyyy-MM-dd");
		String endTime = DateUtil.formatDateByFormat(hspemginfQueryDto.getHspemginfCustom().getEnddate(), "yyyy-MM-dd");
		gb +=  startTime + "-" + endTime;
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gb);		
		
		
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"分诊管理列表",
						list.size(),
						webpath//下载地址
				}));
	}
	
	@ResponseBody
	@RequestMapping(value = "/exportqjsSubmit")
	public  SubmitResultInfo exportqjsSubmit(HspemginfQueryDto hspemginfQueryDto,
			Date today,
			String sort,
			String order
			) throws Exception {
		
		
		//非空校验
		hspemginfQueryDto = hspemginfQueryDto!=null?hspemginfQueryDto:new HspemginfQueryDto();
		//首次查询时默认赋值系统当天日期
		if(hspemginfQueryDto.getHspemginfCustom()==null){
			HspemginfCustom hspemginfCustom=new HspemginfCustom();
			hspemginfCustom.setStartdate(today);
			hspemginfCustom.setEnddate(today);
			hspemginfQueryDto.setHspemginfCustom(hspemginfCustom);
		}
		if(hspemginfQueryDto.getHspemginfCustom().getEnddate() != null){
			Date endDate = DateUtil.getNextDay(hspemginfQueryDto.getHspemginfCustom().getEnddate());
			hspemginfQueryDto.getHspemginfCustom().setEnddate(endDate);
		}
		//查询列表的总数
		if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
			hspemginfQueryDto.setSort("emgdat");
		}
		if(!StringUtils.isNotNullAndEmptyByTrim(order)){
			hspemginfQueryDto.setOrder("desc");
		}
		//判断是否开启留观室
		hspemginfQueryDto.getHspemginfCustom().setIslgbed(systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue());
		List<HspemginfCustom> list =zyyHspemginfService.findHspemginfQjsList(hspemginfQueryDto);		
		
		//病历核对字段赋值
		for (HspemginfCustom hspemginfCustom : list) {
			String flg = hspemginfCustom.getCheckNurStatus();
			if("1".equals(flg)  || !StringUtils.isNotNullAndEmptyByTrim(flg)){
				hspemginfCustom.setCheckNurStatus("未查对");
			}else if("2".equals(flg)){
				hspemginfCustom.setCheckNurStatus("已查对");
			}
		}
		
		//滞留时间计算
		for (HspemginfCustom hspemginfCustom : list) {
			if("1".equals(hspemginfCustom.getIsBed())){
				Date t1 = new Date();
				double t3 = (t1.getTime() - hspemginfCustom.getEmgDat().getTime());
				hspemginfCustom.setIsBed(String.format("%.2f", t3/(3600*1000))+"h");
			}else if("0".equals(hspemginfCustom.getIsBed())){
				if(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getSqlDate()) && (hspemginfCustom.getFirstsqlseq()!=hspemginfCustom.getSqlSeq())){
					double t3 = (hspemginfCustom.getSqlDate().getTime()-hspemginfCustom.getEmgDat().getTime());
					if(t3 > 0 && !"".equals(t3)){
						hspemginfCustom.setIsBed(String.format("%.2f", t3/(3600*1000))+"h");
					}else{
						hspemginfCustom.setIsBed("");
					}
				}else{
					hspemginfCustom.setIsBed("");
				}
			}
		}
		
		//腕带打印赋值
		for (HspemginfCustom hspemginfCustom : list) {
			if("1".equals(hspemginfCustom.getLabelPrintFlg())){
				hspemginfCustom.setLabelPrintFlg("已打印");
			}else{
				hspemginfCustom.setLabelPrintFlg("未打印");
			}
		}
		//赋值转归
		for (HspemginfCustom hspemginfCustom : list) {
			if("2".equals(hspemginfCustom.getCstDspCodNew())){
				hspemginfCustom.setCstDspCodNameNew(hspemginfCustom.getCstDepCodNew());
			}else if("13".equals(hspemginfCustom.getCstDspCodNew())){
				hspemginfCustom.setCstDspCodNameNew(hspemginfCustom.getSqlDes());
			}
		}
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "qjsgllb";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("收治日期");
		fieldNames.add("病历号");
		fieldNames.add("病人姓名");
		fieldNames.add("性别");
		fieldNames.add("年龄");
		fieldNames.add("急诊分级");
		fieldNames.add("床号");
		fieldNames.add("分科");
		fieldNames.add("就诊次数");
		fieldNames.add("转归");
		fieldNames.add("转归时间");
		fieldNames.add("主诉症状");
		fieldNames.add("诊断");
		fieldNames.add("滞留时间");
		fieldNames.add("打印腕带");
		fieldNames.add("病历核对");
		fieldNames.add("分诊护士");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("emgDatStr");
		fieldCodes.add("mpi");
		fieldCodes.add("cstNam");
		fieldCodes.add("cstSexCod");
		fieldCodes.add("cstAge");
		fieldCodes.add("emgDepCod");
		fieldCodes.add("emgBed");
		fieldCodes.add("emgFkCod");
		fieldCodes.add("jzxh");
		fieldCodes.add("cstDspCodNameNew");
		fieldCodes.add("sqlDat");
		fieldCodes.add("preDgnCod");
		fieldCodes.add("jbzdDes");
		fieldCodes.add("isBed");
		fieldCodes.add("labelPrintFlg");
		fieldCodes.add("checkNurStatus");
		fieldCodes.add("preUsrNam");
		
		String hb = "抢救室列表导出";
		String gb = "查询范围: ";
		String startTime = DateUtil.formatDateByFormat(hspemginfQueryDto.getHspemginfCustom().getStartdate(), "yyyy-MM-dd");
		String endTime = DateUtil.formatDateByFormat(hspemginfQueryDto.getHspemginfCustom().getEnddate(), "yyyy-MM-dd");
		gb +=  startTime + "-" + endTime;
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gb);		
		
		
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"留抢患者管理列表",
						list.size(),
						webpath//下载地址
				}));
	}
	
	
	/**
	 * 跳转患者详情页面
	 * @param model
	 * @param emgSeq
	 * @param xxFlag
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryhzxq")
	public String queryhzxq(Model model,String emgSeq,String xxFlag) throws Exception {
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("xxFlag", xxFlag);
		return "/hzszyyhospital/hzszyynurse/hzxq/queryhzxq";
	}
	
	  /**
	   * 患者转归记录跳转
	   * @param model
	   * @return
	   * @throws Exception
	   */
	  @RequestMapping("/queryzginfo")
	  public String queryzginfo(Model model,String emgSeq) throws Exception{
		   //将页面所需数据取出传到页面
		 return "/hzszyyhospital/hzszyynurse/zg/queryzginfo";
	  }
	  
	  /**
		 * 患者详情-跳转时间轴（中医院）
		 * @param model
		 * @param emgSeq
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/timershaft")
		public String timerShaft(Model model,String emgSeq) throws Exception {
			model.addAttribute("emgSeq", emgSeq);
			return "/hzszyyhospital/hzszyynurse/hzxq/timershaft";
		}
		
		/**
		 * 跳转用户管理列表
		 * @param model
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/queryuser")
		public String queryuser(Model model,String sysid,String moduleid) throws Exception{
			model.addAttribute("sysid", sysid);
			model.addAttribute("moduleid", moduleid);
			return "/hzszyyhospital/hzszyynurse/hlpgb/queryuser";
		}
		
		/**
		 * 跳转用户管理列表
		 * @param model
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/querysign")
		public String querysign(Model model,String sysid,String moduleid) throws Exception{
			model.addAttribute("sysid", sysid);
			model.addAttribute("moduleid", moduleid);
			return "/hzszyyhospital/hzszyynurse/hlpgb/querysign";
		}
		
		
		/**
		 * 患者详情-基本信息
		 * @param model
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/basicInformation")
		public String basicInformation(Model model) throws Exception {
			return "/hzszyyhospital/hzszyynurse/hzxq/basicInformation";
		}
		
		/**
		 * 卒中接口调用
		 * @param model
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/cuzhongWork")
		public @ResponseBody SubmitResultInfo cuzhongWork(Model model,HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser) throws Exception{
			System.out.println("-----cuzhong.start");  
		    //编写一些CRUD的代码进行数据库查询，看看用户需不需要弹出消息提醒  
		 	ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		    //1.卒中接口service
		 	try {
		 		HisCzCustom hisCzCustom = hisCzSqlServerService.cuzhongWork(hspemginfQueryDto, activeUser);
		 		if(!"1".equals(hisCzCustom.getReturncode())){
		 			hisCzSqlServerService.cuzhongWork(hspemginfQueryDto, activeUser);
		 		}
		 	} catch (Exception e) {
		 		try {
		 			HisCzCustom hisCzCustom = hisCzSqlServerService.cuzhongWork(hspemginfQueryDto, activeUser);
		 			if(!"1".equals(hisCzCustom.getReturncode())){
		 				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] {"卒中接口失败"}));
			 		}
				} catch (Exception e2) {
					ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] {"卒中接口失败"}));
				}
			}
		    System.out.println("-----cuzhong.end");
		    Map<String, Object> map = new HashMap<String, Object>();
		    map.put("cuzhongcode", "");
		    resultInfo.setSysdata(map);
		    return ResultUtil.createSubmitResult(resultInfo);
		}
		
		/**
		 * 根据首字母动态查询送入医院列表
		 * @return
		 */
		@RequestMapping("/findHspScoListBySzm")
		@ResponseBody
		public DataGridResultInfo findHspScoListBySzm(HspemginfQueryDto hspemginfQueryDto){
			System.out.println(hspemginfQueryDto.getAcronym());
			if(hspemginfQueryDto.getAcronym()==null){
				hspemginfQueryDto.setAcronym("");
			}
		List<HspScoCustom> findHspScoListBySzm = zyyHspemginfService.findHspScoListBySzm(hspemginfQueryDto);
			DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			dataGridResultInfo.setRows(findHspScoListBySzm);
			return dataGridResultInfo;
		}
		
		/**
		 * 查询驾驶人员
		 * @return
		 */
		@RequestMapping("/findAbnDriverList")
		@ResponseBody
		public DataGridResultInfo findAbnDriverList(HspemginfQueryDto hspemginfQueryDto){
			String name;
			if(hspemginfQueryDto.getHspemginfCustom()== null){
				name = "";
			}else{
				name = hspemginfQueryDto.getHspemginfCustom().getAbnDriver();
			}
			DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
				List<HspemginfCustom> findAbnDriverListBySzm = zyyHspemginfService.findAbnDriverList(name);
				dataGridResultInfo.setRows(findAbnDriverListBySzm);
			return dataGridResultInfo;
		}
		
		/**
		 * pews评分产科
		 * @param model
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/queryPewsck")
		public String queryPewsck(Model model) throws Exception {
			return "/hzszyyhospital/hzszyynurse/precheck/pewsSco";
		}
		
		/**
		 * 打开已挂号列表
		 * @param model
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/registeredlist")
		public String toRegisterList(Model model) throws Exception{
			return "/hzszyyhospital/hzszyynurse/precheck/registeredlist";
		}
		

		
		/**
		 * 查询是否今日已分诊
		 * @return
		 */
		@RequestMapping("/findEmgInfByCad")
		@ResponseBody
		public Map<String, Object> findEmgInfByCad(String vstCad) throws Exception{
			Map<String, Object> map = new HashMap<String, Object>();
			Map<String, Object> resultmap = new HashMap<String, Object>();
			if(StringUtils.isNotNullAndEmptyByTrim(vstCad)){
				map.put("vstCad", vstCad);
				map.put("date", DateUtil.formatDateByFormat(new Date(), "yyyyMMdd"));
				List<HspemginfCustom> findEmgInfByCad = zyyHspemginfService.findEmgInfByCad(map);
				if(findEmgInfByCad.size()>0){
					resultmap.put("succ", true);
					resultmap.put("rows", findEmgInfByCad);
				}else {
					resultmap.put("succ", false);
				}
			}else {
				resultmap.put("succ", false);
			}
			return resultmap;
			
		}
		
		
		/**
		 * 查询七天内该就诊卡所有就诊信息
		 * @param model
		 * @return
		 */
		@RequestMapping(value = "/findEmgInfForWeek")
		public String findEmgInfForWeek(Model model,String vstCad) {
			model.addAttribute("vstCad", vstCad);
			return "/hzszyyhospital/hzszyynurse/precheck/findEmgInfForWeek";
		}
		
		@ResponseBody
		@RequestMapping(value = "/findTotal")
		public AjaxInfo findTotal(HspemginfQueryDto hspemginfQueryDto) {
			if(hspemginfQueryDto.getStartdate()==null) {
				Calendar calendar = Calendar.getInstance();  
			    calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - 6);  
			    Date enddate = calendar.getTime();  
			    hspemginfQueryDto.setStartdate(enddate);
			    hspemginfQueryDto.setEnddate(new Date());
			}
		    
			int total =zyyHspemginfService.findEmgInfForRangeCount(hspemginfQueryDto);
			Map<String,Integer> map = new HashMap<String,Integer>();
			map.put("total", total);
			AjaxInfo ajax = new AjaxInfo();
			ajax.setMsg(map);
			return ajax;
		}
		
		/**
		 * 查询七天内该就诊卡所有就诊信息 
		 * @param model
		 * @return
		 */
		@ResponseBody
		@RequestMapping(value = "/findEmgInfForWeek_result")
		public DataGridResultInfo findEmgInfForWeek_result(HspemginfQueryDto hspemginfQueryDto,
				int page,//当前页码
				int rows//每页显示个数
				) throws Exception{
			List<HspemginfCustom> findEmgInfByCad = new ArrayList<HspemginfCustom>();
			if(hspemginfQueryDto.getStartdate()==null) {
				Calendar calendar = Calendar.getInstance();  
			    calendar.set(Calendar.DAY_OF_YEAR, calendar.get(Calendar.DAY_OF_YEAR) - 6);  
			    Date enddate = calendar.getTime();  
			    hspemginfQueryDto.setStartdate(enddate);
			    hspemginfQueryDto.setEnddate(new Date());
			}
		    
			int total =zyyHspemginfService.findEmgInfForRangeCount(hspemginfQueryDto);
			PageQuery pageQuery = new PageQuery();
			pageQuery.setPageParams(total, rows, page);	
			hspemginfQueryDto.setPageQuery(pageQuery);
			if(hspemginfQueryDto!=null && hspemginfQueryDto.getHspemginfCustom()!= null && StringUtils.isNotNullAndEmptyByTrim(hspemginfQueryDto.getHspemginfCustom().getVstCad())){
				findEmgInfByCad = zyyHspemginfService.findEmgInfForRange_result(hspemginfQueryDto);
			}
			DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			dataGridResultInfo.setRows(findEmgInfByCad);
			dataGridResultInfo.setTotal(total);
			return dataGridResultInfo;
		}
		
		/**
		 * 获取急诊留抢病历数据
		 * @param emgSeq
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/getJzlqblAjax")
		public @ResponseBody SubmitResultInfo getJzlqblAjax(String mpi) throws Exception {
			ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
	        Map<String, Object> map = new HashMap<String, Object>(70);
	        //获取急诊留抢病历list
	        List<HspemginfCustom> jzlqblList = zyyHspemginfService.findEmgInfByMpi(mpi);
			map.put("jzlqblList", jzlqblList);
			resultInfo.setSysdata(map);
			return ResultUtil.createSubmitResult(resultInfo);
		}
		
		
		/**
		 * 获取时间轴列表
		 * @param emgSeq
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/getSjzData")
		public @ResponseBody SubmitResultInfo getSjzData(String emgSeq) throws Exception {
			ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
	        Map<String, Object> map = new HashMap<String, Object>(70);
	        //获取时间轴list
	        List<THemsSjz> tHemsSjzList = zyyHspemginfService.getSjzDataByEmgSeq(emgSeq);
			map.put("tHemsSjzList", tHemsSjzList);
			resultInfo.setSysdata(map);
			return ResultUtil.createSubmitResult(resultInfo);
		}
		
		
		/**
		 * 获取出诊医生
		 * @return
		 * @throws Exception 
		 */
		@ResponseBody
		@RequestMapping(value = "/findHspDctNbrList")
		public AjaxInfo findHspDctNbrList(DstuserQueryDto dstuserQueryDto) throws Exception {
			Map<String,Object> map = new HashMap<String,Object>();
			dstuserQueryDto.setSort("outCall");
			dstuserQueryDto.setOrder("asc");
			List<DstuserCustom> findHspDctNbrLsit = userService.findCZGLUserList(dstuserQueryDto);
			map.put("findHspDctNbrLsit", findHspDctNbrLsit);
			AjaxInfo ajaxInfo = new AjaxInfo();
			ajaxInfo.setState("200");
			ajaxInfo.setMsg(map);
			return ajaxInfo;
		}
		
		
		/**
		 * 二次预检
		 * @param model
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/ecyj")
		public String ecyj(Model model, String emgSeq,ActiveUser activeUser) throws Exception {
			// 将页面所需数据取出传到页面
			// 预检号
			String date = DateUtil.formatDateByFormat(new Date(), "yyyyMMdd");
			String newemgseq = systemConfigService.findSequences("HSPEMGINF_EMGSEQ","6", date);
			model.addAttribute("emgSeq", newemgseq);
			model.addAttribute("firstemgseq", emgSeq);
			model.addAttribute("cstNam", activeUser.getUsrname());
			model.addAttribute("cstNo", activeUser.getUsrno());
			model.addAttribute("ecyjFlag", "1");
			model.addAttribute("islgbed", systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue());
			return "/hzszyyhospital/hzszyynurse/precheckPage/qjsPrecheck";
		}
		
		/**
		 * 二次预检登记入库
		 * @param hspemginfQueryDto
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/ecyjsubmit")
		public @ResponseBody SubmitResultInfo ecyjsubmit(HspemginfQueryDto hspemginfQueryDto,
					ActiveUser activeUser,HttpServletRequest req)throws Exception{
			ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
			HspsqlinfCustom hspsqlinfCustom =zyyHspemginfService.insertHspemginf_qjs_ecyj(hspemginfQueryDto, activeUser);
			return ResultUtil.createSubmitResult(resultInfo);
		}
		
		/**
		 * 预检页、修改页获取基础数据
		 * @param emgSeq
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/findecyjAjax")
		public @ResponseBody SubmitResultInfo findecyjAjax(String emgSeq) throws Exception {
			ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
	        Map<String, Object> map = new HashMap<String, Object>(70);
			//获取二次预检的页面数据
			HspemginfCustom hspemginfCustom = baseHspemgInfService.findHspemginfCustom(emgSeq);
			map.put("hspemginfCustom", hspemginfCustom);
			resultInfo.setSysdata(map);
			return ResultUtil.createSubmitResult(resultInfo);
		}

		/**
		 * 危急值结果确认 弹框
		 * @param model
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/confirmCritical")
		public String confirmCritical (Model model) throws Exception {
			return "/base/first/confirmCritical";
		}

		/**
		 * 跳转已预检待完善页面
		 * @param model
		 * @return
		 */
		@RequestMapping(value = "/toBeImproved")
		public String toBeImproved(Model model) {
			return "/hzszyyhospital/hzszyynurse/precheckPage/boxPage/yjwsBox";
		}
		
		/**
		 * 跳转新入病人页面
		 * @param model
		 * @param bedid
		 * @return
		 */
		@RequestMapping(value = "/toBeRelated")
		public String toBeRelated (Model model,String bedid) {
			model.addAttribute("bedid",bedid);
			return "/hzszyyhospital/hzszyyqjs/newPatient/queryNewPatient";
		}
		
		/**
		 * 查询已预检待完善数据（新入病人）
		 * @param hspemginfQueryDto
		 * @return
		 */
		@ResponseBody
		@RequestMapping(value = "/toBeImproved_result")
		public DataGridResultInfo toBeImproved_result(HspemginfQueryDto hspemginfQueryDto) {
			DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			try {
				List<HspemginfCustom> list = zyyHspemginfService.toBeImprovedList(hspemginfQueryDto);
				dataGridResultInfo.setRows(list);
				dataGridResultInfo.setTotal(list.size());
			} catch (Exception e) {
				e.printStackTrace();
				ResultInfo resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, null);
				dataGridResultInfo.setResultInfo(resultInfo);
			}
			return dataGridResultInfo;
		}
		
		/**
		 * 跳转挂号绑定页面
		 * @return
		 */
		@RequestMapping(value = "/toRegistered")
		public String toRegistered(Model mode){
			return "/hzszyyhospital/hzszyynurse/precheckPage/boxPage/ghbdBox";
		}
		
		/**
		 * 跳转再分科页面
		 * @param model
		 * @return
		 */
		@RequestMapping(value = "/toSubdivision")
		public String toSubdivision(Model model,String emgSeq) throws Exception {
			String date = DateUtil.formatDateByFormat(new Date(), "yyyyMMdd");
			String emgseq = systemConfigService.findSequences("HSPEMGINF_EMGSEQ","6", date);
			String HSPLP = systemConfigService.findAppoptionByOptkey("HSPLP").getOptvalue();
			if("SD".equals(HSPLP)) {
				//三墩院区预检号标识 SD
				model.addAttribute("newEmgSeq", "SD"+emgseq);
			}else {
				//灵隐院区预检号标识 LY
				model.addAttribute("newEmgSeq", "LY"+emgseq);
			}
			HspemginfQueryDto hspemginfQueryDto = findHspemginfByemgSeq_jzt(emgSeq);
			HspemginfCustom hspemginfCustom = hspemginfQueryDto.getHspemginfCustom();
			model.addAttribute("emgSeq",emgSeq);
			model.addAttribute("mpi",hspemginfCustom.getMpi());
			model.addAttribute("cstNam",hspemginfCustom.getCstNam());
			model.addAttribute("cstSexCod",hspemginfCustom.getCstSexCod());
			model.addAttribute("cstAge",hspemginfCustom.getCstAge());
			model.addAttribute("cstAgeCod",hspemginfCustom.getCstAgeCod());
			model.addAttribute("pheNbr",hspemginfCustom.getPheNbr());
			model.addAttribute("cstAdr",hspemginfCustom.getCstAdr());
			model.addAttribute("emgFkName",hspemginfCustom.getEmgFkName());
			// 急诊科室列表
			List<Dstcompctl> jzkscompctlList = compctlService.getJzksCompctlList();
			model.addAttribute("jzkscompctlList", jzkscompctlList);
			return "/hzszyyhospital/hzszyynurse/fzjl/fzjlzfk";
		}
		
		/**
		 * 患者再分科入库
		 * @param hspemginfQueryDto
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/addZyyemgSubmit_zfk")
		public @ResponseBody SubmitResultInfo addZyyemgSubmit_zfk(HspemginfQueryDto hspemginfQueryDto,
					ActiveUser activeUser)throws Exception{
			ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
			zyyHspemginfService.addZyyemgSubmit_zfk(hspemginfQueryDto,activeUser);
			return ResultUtil.createSubmitResult(resultInfo);
		}
		
		/**
		 * 跳转发热登记页面
		 * @return
		 */
		@RequestMapping(value = "/toFrRegister")
		public String toFrRegister(Model mode){
			return "/hzszyyhospital/hzszyynurse/precheckPage/boxPage/frdjBox";
		}
		
		/**
		 * 查询病人发热登记信息
		 * @return
		 */
		@RequestMapping("/findFrRegisterByEmgSeq")
		public @ResponseBody HspFrbrInf findFrRegisterByEmgSeq(String emgSeq) throws Exception{
			return zyyHspemginfService.findFrRegisterByEmgSeq(emgSeq);
		}
		
		/**
		 * 患者发热登记入库
		 * @param hspemginfQueryDto
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/addFrRegisterSubmit")
		public @ResponseBody SubmitResultInfo addFrRegisterSubmit(HspemginfQueryDto hspemginfQueryDto,
					ActiveUser activeUser)throws Exception{
			ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
			zyyHspemginfService.addFrRegisterSubmit(hspemginfQueryDto,activeUser);
			return ResultUtil.createSubmitResult(resultInfo);
		}
		
		/**
		 * 预检校验，判断当前患者（就诊卡号+姓名）24小时内是否有当前选择科室的预检数据
		 * @param hspemginfQueryDto
		 * @param activeUser
		 * @throws ExceptionResultInfo
		 */
		@ResponseBody
		@RequestMapping(value = "/emgCheck")
		public SubmitResultInfo emgCheck(HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser){
			ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
			try {
				String result = zyyHspemginfService.emgCheck(hspemginfQueryDto, activeUser);
				if(StringUtils.isNotNullAndEmptyByTrim(result)) {
					resultInfo = ResultUtil.createWarning(Config.MESSAGE, 920, new Object[] {result});
				}
			} catch (Exception e) {
				e.printStackTrace();
				resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, null);
			}
			return ResultUtil.createSubmitResult(resultInfo);
		}
	
	
	/**
	 * 入留观
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/rlgSubmit")
	public @ResponseBody SubmitResultInfo rlgSubmit(String emgSeq,ActiveUser activeuser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		oracleHisService.sendLgxxSd(emgSeq,"1");
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 出留观
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/clgSubmit")
	public @ResponseBody SubmitResultInfo clgSubmit(String emgSeq,ActiveUser activeuser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		oracleHisService.sendLgxxSd(emgSeq,"2");
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 修改页面检查是否进入胸痛/卒中流程
	 * @param emgSeq
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/checkXtCzlcAjax")
	public @ResponseBody SubmitResultInfo checkXtCzlcAjax(String emgSeq,String type) throws Exception {
		int total =zyyHspemginfService.checkXtCzlcAjax(emgSeq,type);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("total", total);
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	
}
