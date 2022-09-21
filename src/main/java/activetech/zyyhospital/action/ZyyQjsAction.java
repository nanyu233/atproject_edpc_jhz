package activetech.zyyhospital.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.domain.Dstcompctl;
import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.DstcompctlCustom;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.CompctlService;
import activetech.base.service.SystemConfigService;
import activetech.base.service.UserService;
import activetech.basehems.service.BaseHspemgInfService;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.hospital.pojo.dto.HspsqlinfCustom;
import activetech.hospital.service.HspemginfService;
import activetech.util.DateUtil;
import activetech.util.ExcelExportSXXSSF;
import activetech.util.StringUtils;
import activetech.zyyhospital.pojo.dto.HspBedInfCustom;
import activetech.zyyhospital.pojo.dto.HspCheckCaseInfCustom;
import activetech.zyyhospital.pojo.dto.HspObsvtfstInfCustom;
import activetech.zyyhospital.pojo.dto.QjsCountCustom;
import activetech.zyyhospital.service.HspBedInfService;
import activetech.zyyhospital.service.ZyyHspQjsInfService;
import activetech.zyyhospital.service.ZyyHspemginfService;
import activetech.zyyhospital.service.ZyyLqblService;

@Controller
@RequestMapping("/zyyqjs")
public class ZyyQjsAction {
	@Autowired
	private HspemginfService hspemginfService;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
	@Autowired
	private HspBedInfService hspBedInfService;
	@Autowired
	private ZyyHspQjsInfService zyyHspQjsInfService;
	@Autowired
	private ZyyLqblService zyyLqblService;
	@Autowired
	private UserService userService;
	@Autowired
	private CompctlService compctlService;
	@Autowired
	private BaseHspemgInfService baseHspemgInfService;
	/**
	 * 跳转转归登记页面
	 * @param model
	 * @return
	 * @throws Exception
	 * 
	 */
	@RequestMapping("/querylqxxdjzyy")
	public String querylqxxdjzyy(Model model,String emgSeq) throws Exception {
		HspemginfCustom hspemginfCustom = hspemginfService.findHspemginfCustomLqxxdj(emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		model.addAttribute("islgbed", systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue());
		return "/hzszyyhospital/hzszyyqjs/querylqxxdj";
	}
	
	/**
	 * 转归登记
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/zyylqxxdj_submit")
	public @ResponseBody SubmitResultInfo zyylqxxdj_submit(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		zyyHspQjsInfService.sendLgxx(hspemginfQueryDto);
		HspsqlinfCustom hspsqlinfCustom = zyyHspQjsInfService.updateLqxxdj(hspemginfQueryDto);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("hspsqlinfCustom", hspsqlinfCustom);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转会诊管理列表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryqjszyy")
	public String queryqjs(Model model, String moduleid, ActiveUser activeUser) throws Exception{
		List<String> roleList = userService.findRoleByUsrno(activeUser.getUsrno());
		//如果当前用户角色不包含 1004 会诊医生 则为other 如果用户包含管理员这个角色这 为admin 
		String docType = "hzys";
		if(roleList.contains("D20A980F6BF54E8093B71DF096341236")) {
			docType = "admin";
		}else if(!roleList.contains("1004")) {
			docType = "other";
		}
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("islgbed", systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue());
		model.addAttribute("apply_src",systemConfigService.findAppoptionByOptkey("HZJL").getOptvalue());
		model.addAttribute("docType",docType);
		return "/hzszyyhospital/hzszyyqjs/queryqjs";
	}
	
	/**
	 * 抢救室列表
	 * @param dstuserQueryDto
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryqjszyy_result")
	public @ResponseBody DataGridResultInfo queryqjs_result(
			HspemginfQueryDto hspemginfQueryDto,
			int page,//当前页码
			int rows,//每页显示个数
			String sort,
			String order
			) throws Exception{
		//非空校验
		hspemginfQueryDto = hspemginfQueryDto!=null?hspemginfQueryDto:new HspemginfQueryDto();
		if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
			hspemginfQueryDto.setSort("emgdat");
		}
		if(!StringUtils.isNotNullAndEmptyByTrim(order)){
			hspemginfQueryDto.setOrder("desc");
		}
		if(hspemginfQueryDto.getHspemginfCustom().getUsingBed()!= null){
			hspemginfQueryDto.getHspemginfCustom().setEnddate(null);
			hspemginfQueryDto.getHspemginfCustom().setStartdate(null);
		}
		//查询列表的总数
		int total =zyyHspemginfService.findHspemginfQjsCountzyy(hspemginfQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspemginfQueryDto.setPageQuery(pageQuery);
		List<HspemginfCustom> list =zyyHspemginfService.findHspemginfQjsList(hspemginfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	/**
	 * ajax查询当前所有床位信息
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/bedInfo")
	public @ResponseBody SubmitResultInfo bedInfo(HttpServletResponse response, String isBedType) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		List<HspBedInfCustom> hspBedInfCustomList = hspBedInfService.findALLBedPlace(isBedType);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("hspBedInfCustomList", hspBedInfCustomList);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转会诊记录
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toqueryhzjl")
	public String toqueryhzjl(Model model,String moduleid,String emgSeq) throws Exception {
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("moduleid", moduleid);
		return "/hzszyyhospital/hzszyyqjs/queryhzjl";
	}
	
	/**
	 * 跳转检查报告
	 * @param model 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryjcbg")
	public String queryjcbg(Model model,String moduleid,String emgSeq) throws Exception {
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("moduleid", moduleid);
		HspemginfCustom  hspemginfCustom = baseHspemgInfService.findHspemginfCustom(emgSeq);
		model.addAttribute("cyrqDat",DateUtil.formatDateByFormat(hspemginfCustom.getSqlDate(), "yyyy/MM/dd"));
		model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
		model.addAttribute("vstCad", hspemginfCustom.getVstCad());
		return "/hzszyyhospital/hzszyyqjs/queryjcbg";
	}
	
	
	
	/**
	 * 跳转导入检查报告
	 * @param model @sourceType 为了知识库而设置
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querycheckinfo")
	public String querycheckinfo(Model model,String moduleid,String emgSeq,String valName, String sourceType) throws Exception {
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("valName", valName);
		HspemginfCustom  hspemginfCustom = baseHspemgInfService.findHspemginfCustom(emgSeq);
		model.addAttribute("cyrqDat",DateUtil.formatDateByFormat(hspemginfCustom.getSqlDate(), "yyyy/MM/dd"));
		model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
		model.addAttribute("vstCad", hspemginfCustom.getVstCad());
		model.addAttribute("sourceType", sourceType);
		model.addAttribute("MPI", hspemginfCustom.getMpi());
		return "/hzszyyhospital/hzszyyqjs/checkinfo";
	}
	
	/**
	 * 跳转导入检查报告(门诊病历)
	 * @param model 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/mzQuerycheckinfo")
	public String mzQuerycheckinfo(Model model,String moduleid,String emgSeq,String valName) throws Exception {
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("valName", valName);
		HspemginfCustom  hspemginfCustom = baseHspemgInfService.findHspemginfCustom(emgSeq);
		model.addAttribute("cyrqDat",DateUtil.formatDateByFormat(hspemginfCustom.getSqlDate(), "yyyy/MM/dd"));
		model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
		model.addAttribute("vstCad", hspemginfCustom.getVstCad());
		model.addAttribute("MPI", hspemginfCustom.getMpi());
		return "/hzszyyhospital/hzszyyqjs/MZcheckinfo";
	}
	
	/**
	 * 跳转检验信息
	 * @param model 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toexamine")
	public String toexamine(Model model,String moduleid,String emgSeq) throws Exception {
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("moduleid", moduleid);
		HspemginfCustom  hspemginfCustom = baseHspemgInfService.findHspemginfCustom(emgSeq);
		model.addAttribute("cyrqDat",DateUtil.formatDateByFormat(hspemginfCustom.getSqlDate(), "yyyy/MM/dd"));
		model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
		model.addAttribute("vstCad", hspemginfCustom.getVstCad());
		return "/hzszyyhospital/hzszyyqjs/queryexamine";
	}
	
	/**
	 * 跳转检验信息详细
	 * @param model  @sourceType 为了知识库而设置 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toexamineinfo")
	public String toexamineinfo(Model model,String moduleid,String emgSeq,String valName, String sourceType) throws Exception {
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("moduleid", moduleid); 
		HspemginfCustom  hspemginfCustom = baseHspemgInfService.findHspemginfCustom(emgSeq);
		model.addAttribute("cyrqDat",DateUtil.formatDateByFormat(hspemginfCustom.getSqlDate(), "yyyy/MM/dd"));
		model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
		model.addAttribute("vstCad", hspemginfCustom.getVstCad());
		model.addAttribute("valName",valName);
		model.addAttribute("sourceType", sourceType);
		model.addAttribute("MPI", hspemginfCustom.getMpi());
		return "/hzszyyhospital/hzszyyqjs/examineinfo";
	}
	
	/**
	 * 跳转检验信息详细(门诊病历)
	 * @param model 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/mzToexamineinfo")
	public String mzToexamineinfo(Model model,String moduleid,String emgSeq,String valName) throws Exception {
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("moduleid", moduleid);
		HspemginfCustom  hspemginfCustom = baseHspemgInfService.findHspemginfCustom(emgSeq);
		model.addAttribute("cyrqDat",DateUtil.formatDateByFormat(hspemginfCustom.getSqlDate(), "yyyy/MM/dd"));
		model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
		model.addAttribute("vstCad", hspemginfCustom.getVstCad());
		model.addAttribute("valName",valName);
		model.addAttribute("MPI", hspemginfCustom.getMpi());
		return "/hzszyyhospital/hzszyyqjs/MZexamineinfo";
	}
	
	/**
	 * 跳转特殊符号
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/tsfhinfo")
	public String tsfhinfo(Model model, String moduleid) throws Exception {
		model.addAttribute("moduleid", moduleid);
		return "/hzszyyhospital/hzszyyqjs/tsfhinfo";
	}
	/**
	 * 留抢病例记录首页
	 * @param model
	 * @param relevanceModule 判断是哪一个目录---病程录列表
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/qjscasenote")
	public String qjscasenote(Model model, String moduleid,String emgSeq,ActiveUser activeUser,String pageFlg, String relevanceModule) throws Exception {
		List<String> roles = userService.findRoleByUsrno(activeUser.getUsrno());
		//归档病历判断护士或医生
		String a_roles = roles.toString();
		String userFlg="";
		if(a_roles.contains("1012")){//质控护士
			userFlg="1";
		}

		if(a_roles.contains("1011") || "admin".equals(activeUser.getUsrno())){
			userFlg="2";
		}
		model.addAttribute("userFlg", userFlg);
		model.addAttribute("pageFlg", pageFlg);
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("relevanceModule", relevanceModule);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyydoctor/qjscasenote";
	}
	
	/**
	 * 外挂病历-内嵌his
	 * http://localhost:8080/atproject/zyyqjs/qjscasenoteWg.do?hisjzid=222222a&usrno=1314&pageFlg=wg
	 * 如果挂号id能查到预检信息则直接跳转病历，否则进入床位页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/qjscasenoteWg")
	public String qjscasenoteWg(HttpSession session,Model model,String emgSeq,String ghid,String usrno,String pageFlg) throws Exception {
		if("wg".equals(pageFlg)) {
			ActiveUser activeUser = userService.insertUserByHis(usrno);
			session.setAttribute(Config.ACTIVEUSER_KEY, activeUser);
			HspemginfCustom hspemginfCustom = zyyHspemginfService.findHspemginfByGhid(ghid);
			if(hspemginfCustom == null) {
				model.addAttribute("moduleid", "8b5749cf0d91413d9391be90cbaae6a2");
				return "/hzszyyhospital/hzszyydoctor/qjscaseWg";
			}
		 // 将用户身份信息写入session
			model.addAttribute("hspemginfCustom", hspemginfCustom);
			return "/hzszyyhospital/hzszyydoctor/qjscasenoteWg";
		}else if("cwwg".equals(pageFlg)){
			ActiveUser activeUser = (ActiveUser) session.getAttribute(Config.ACTIVEUSER_KEY);
			if(activeUser != null) {
				HspemginfCustom hspemginfCustom = zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
				model.addAttribute("hspemginfCustom", hspemginfCustom);
				return "/hzszyyhospital/hzszyydoctor/qjscasenoteWg";
			}
		}
		return "/base/refuse";
		
	}
	
	/**
	 * 留抢病例首页
	 * @param model
	 * @param requestSource请求来源(HIS_NO_PATIENT:HIS请求病历且未查到患者数据)
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/qjscase")
	public String qjscase(Model model, String moduleid, String requestSource) throws Exception{
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("requestSource", requestSource);
		model.addAttribute("islgbed", systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue());
		return "/hzszyyhospital/hzszyydoctor/qjscase";
	}
	
	/**
	 * 跳转留抢病例检验信息
	 * @param model 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toqjscaseexamine")
	public String toqjscaseexamine(Model model,String moduleid,String emgSeq) throws Exception {
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("moduleid", moduleid);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		HspObsvtfstInfCustom hspObsvtfstInfCustom=zyyLqblService.findObsvtfstByEmgSeq(emgSeq);
		model.addAttribute("cyrqDat",hspObsvtfstInfCustom.getDscgDatStr());
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
		model.addAttribute("vstCad", hspemginfCustom.getVstCad());
		return "/hzszyyhospital/hzszyydoctor/qjscaseexamine";
	}
	
	/**
	 * 跳转检查报告
	 * @param model 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/qjsjcbg")
	public String qjsjcbg(Model model,String moduleid,String emgSeq) throws Exception {
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("moduleid", moduleid);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		HspObsvtfstInfCustom hspObsvtfstInfCustom=zyyLqblService.findObsvtfstByEmgSeq(emgSeq);
		model.addAttribute("cyrqDat",hspObsvtfstInfCustom.getDscgDatStr());
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
		model.addAttribute("vstCad", hspemginfCustom.getVstCad());
		model.addAttribute("MPI", hspemginfCustom.getMpi());
		return "/hzszyyhospital/hzszyydoctor/qjsjcbg";
	}

	/**
	 * 跳转医嘱信息
	 * @param model 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/qjsyzxx")
	public String qjsyzxx(Model model,String moduleid,String emgSeq) throws Exception {
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("sqlDat",DateUtil.formatDateByFormat( hspemginfCustom.getSqlDate(), "yyyy/MM/dd HH:mm"));
		model.addAttribute("emgDat",DateUtil.formatDateByFormat( hspemginfCustom.getEmgDat(), "yyyy/MM/dd HH:mm"));
		model.addAttribute("mpi", hspemginfCustom.getMpi());
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyyqjs/qjsyzxx";
	}	
	

	
	/**
	 * 跳转留抢病例检验信息(新)
	 * @param model 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toqjscaseexaminenew")
	public String toqjscaseexaminenew(Model model,String moduleid,String emgSeq) throws Exception {
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("moduleid", moduleid);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		HspObsvtfstInfCustom hspObsvtfstInfCustom=zyyLqblService.findObsvtfstByEmgSeq(emgSeq);
		model.addAttribute("cyrqDat",hspObsvtfstInfCustom.getDscgDatStr());
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
		model.addAttribute("vstCad", hspemginfCustom.getVstCad());
		model.addAttribute("MPI", hspemginfCustom.getMpi());
		return "/hzszyyhospital/hzszyydoctor/newqjscaseexamine";
	}
	
	

	/**
	 * 跳转留抢大屏
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/qjsScreen")
	public String qjsScreen(Model model, String moduleid) throws Exception{
		model.addAttribute("moduleid", moduleid);
		return "/hzszyyhospital/hzszyyqjs/qjsScreen";
	}
	
	/**
	 * 归档病历
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryAMRecord")
	public String queryAMRecord(Model model, String moduleid) throws Exception{
		// 急诊科室列表
		List<Dstcompctl> jzkscompctlList = compctlService.getJzksCompctlList();
		model.addAttribute("jzkscompctlList", jzkscompctlList);
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("islgbed", systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue());
		return "/hzszyyhospital/hzszyyqjs/queryAMRecord";
	}
	
	/**
	 * 归档病历结果集
	 * @param HspemginfQueryDto
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryAMRecord_result")
	public @ResponseBody DataGridResultInfo queryAMRecord_result(
			HspemginfQueryDto hspemginfQueryDto,
			int page,//当前页码
			int rows,//每页显示个数
			String sort,
			String order
			) throws Exception{
		//非空校验
		hspemginfQueryDto = hspemginfQueryDto!=null?hspemginfQueryDto:new HspemginfQueryDto();
		//首次查询时默认赋值系统当天日期
		if(hspemginfQueryDto.getHspemginfCustom().getEnddate() != null){
			Date endDate = DateUtil.getNextDay(hspemginfQueryDto.getHspemginfCustom().getEnddate());
			hspemginfQueryDto.getHspemginfCustom().setEnddate(endDate);
		}
		if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
			hspemginfQueryDto.setSort("emgdat");
		}
		if(!StringUtils.isNotNullAndEmptyByTrim(order)){
			hspemginfQueryDto.setOrder("desc");
		}
		if(hspemginfQueryDto.getHspemginfCustom().getUsingBed()!= null){
			hspemginfQueryDto.getHspemginfCustom().setEnddate(null);
			hspemginfQueryDto.getHspemginfCustom().setStartdate(null);
		}
		//查询列表的总数
		int total =zyyHspemginfService.findAMRecordListCount(hspemginfQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspemginfQueryDto.setPageQuery(pageQuery);
		List<HspemginfCustom> list =zyyHspemginfService.findAMRecordList(hspemginfQueryDto);
		
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 审核通过
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/submitCheckRecord")
	public @ResponseBody SubmitResultInfo submitCheckRecord(HspemginfCustom hspemginfCustom,ActiveUser activeUser,String userFlg) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		zyyHspemginfService.submitCheckRecord(hspemginfCustom,userFlg);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 获取归档病历审核按钮checkbox的值
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getCheckCase")
	public @ResponseBody HspCheckCaseInfCustom getCheckCase(String emgSeq) throws Exception{
		return zyyHspemginfService.getCheckCase(emgSeq);
	}
	
	/**
	 * 归档病历各项功能检查状态提交
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/submiCheckCase")
	public @ResponseBody SubmitResultInfo submiCheckCase(HspCheckCaseInfCustom hspCheckCaseInfCustom,ActiveUser activeUser) throws Exception{
		//HspCheckCaseInfCustom hspCheckCaseInfCustom=(HspCheckCaseInfCustom) JSON.parse(jsonStr);
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		zyyHspemginfService.submitCheckCase(hspCheckCaseInfCustom, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 归档病历导出
	 * @param hspCstInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportAMRecord")
	public @ResponseBody SubmitResultInfo exportAMRecord(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		HspemginfCustom hspemginfCustom=hspemginfQueryDto.getHspemginfCustom();
		//查询条件拼接
		String gd="查询方式：";
			if("day".equals(hspemginfQueryDto.getQuerytype())){
				gd+="天 "+DateUtil.formatDateByFormat(hspemginfCustom.getStartdate(),"yyyy/MM/dd");
			}else if("month".equals(hspemginfQueryDto.getQuerytype())){
				gd+="月 "+DateUtil.formatDateByFormat(hspemginfCustom.getStartdate(),"yyyy/MM");
			}else{
				gd+="范围 ";
				gd += DateUtil.formatDateByFormat(hspemginfCustom.getStartdate(),"yyyy/MM/dd")+"-"+
			            DateUtil.formatDateByFormat(hspemginfCustom.getEnddate(),"yyyy/MM/dd");
			}
			   String hb="归档病历";
			   gd += " 状态：";
			   if("0".equals(hspemginfQueryDto.getCheckStatus())){
				   gd += "全部";
			   }else if("1".equals(hspemginfQueryDto.getCheckStatus())){
				   gd += "医生未审核";
			   }else if("4".equals(hspemginfQueryDto.getCheckStatus())){
				   gd += "护士未审核";
			   }else if("5".equals(hspemginfQueryDto.getCheckStatus())){
				   gd += "审核未通过";
			   }
			   else if("2".equals(hspemginfQueryDto.getCheckStatus())){
				   gd += "审核通过";
			   }else if("3".equals(hspemginfQueryDto.getCheckStatus())){
				   gd += "未写病历";
			   }
			   if(hspemginfCustom!=null){
				   if(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getEmgFkCod())){
					   DstcompctlCustom dstcompctlCustom=compctlService.selectCompctlByComno(hspemginfCustom.getEmgFkCod());
					   gd += " 科室："+dstcompctlCustom.getComcname();
				   }
				   if(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getRgAttendDocTor())){
					   gd += " 入观医生："+hspemginfCustom.getRgAttendDocTor();
				   }
				   if(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getCgAttendDocTor())){
					   gd += " 出观医生："+hspemginfCustom.getCgAttendDocTor();
				   }
			   }
		// 首次查询时默认赋值系统当天日期
		if (hspemginfQueryDto.getHspemginfCustom().getEnddate() != null) {
			Date endDate = DateUtil.getNextDay(hspemginfQueryDto.getHspemginfCustom().getEnddate());
			hspemginfQueryDto.getHspemginfCustom().setEnddate(endDate);
		}
		hspemginfQueryDto.setSort("emgdat");
		hspemginfQueryDto.setOrder("desc");
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "AMRECORD";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("审核状态");
		fieldNames.add("收治日期");
		fieldNames.add("病历号");
		fieldNames.add("病人姓名");
		fieldNames.add("年龄");
		fieldNames.add("年龄单位");
		fieldNames.add("性别");
		fieldNames.add("分级");
		fieldNames.add("床号");
		fieldNames.add("分科");
		fieldNames.add("初步印象");
		fieldNames.add("分诊护士");
		fieldNames.add("入观医生");
		fieldNames.add("出观医生");
		fieldNames.add("质控医生");
		fieldNames.add("医生审核日期");
		fieldNames.add("质控护士");
		fieldNames.add("护士审核日期");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("recordFlag");
		fieldCodes.add("emgDatStr");
		fieldCodes.add("mpi");
		fieldCodes.add("cstNam");
		fieldCodes.add("cstAge");
		fieldCodes.add("cstAgeCod");
		fieldCodes.add("cstSexCod");
		fieldCodes.add("emgDepCod");
		fieldCodes.add("emgBed");
		fieldCodes.add("emgFkCod");
		fieldCodes.add("preDgnCod");
		fieldCodes.add("preUsrNam");
		fieldCodes.add("rgAttendDocTor");
		fieldCodes.add("cgAttendDocTor");
		fieldCodes.add("checkDoctor");
		fieldCodes.add("checkDocDatStr");
		fieldCodes.add("checkNurse");
		fieldCodes.add("checkNurDatStr");

		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		List<HspemginfCustom> list = zyyHspemginfService.findAMRecordList(hspemginfQueryDto);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"归档病历",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 * 诊断可编辑表格跳转
	 * @param model
	 * @param canEditZd 是否可以修改诊断
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querylrNew")
	public String querylrNew(Model model,String trnumber,String emgSeq,String jbzdType, String canEditZd) throws Exception {
		model.addAttribute("trnumber", trnumber);
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("jbzdType", jbzdType);
		model.addAttribute("canEditZd", canEditZd);
		return "/hzszyyhospital/hzszyydoctor/lxindex/querylr";
	}
	
	@RequestMapping("/findBedAndSqlStaCod")
	public @ResponseBody SubmitResultInfo findBedAndSqlStaCod(String emgSeq)throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		//单独取床位
		List<HspBedInfCustom> bedplacecodList=hspBedInfService.findBedPlaceAndNum(emgSeq,"");
        Map<String, Object> map = new HashMap<String, Object>(70);
		map.put("bedplacecodList",bedplacecodList);
		//单独取转归去向
		List<Dstdictinfo> sqlStaCodList = systemConfigService.findDictinfoByType("CST_DSP_COD");
		map.put("sqlStaCodList", sqlStaCodList);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 抢救室数据统计
	 * @param emgSeq
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getqjsDataCount")
	public @ResponseBody SubmitResultInfo getqjsDataCount(HspemginfQueryDto hspemginfQueryDto)throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		QjsCountCustom qjsCountCustom=zyyHspQjsInfService.getqjsDataCount(hspemginfQueryDto);
        Map<String, Object> map = new HashMap<String, Object>(70);
		map.put("qjsCountCustom",qjsCountCustom);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * @author machaofan
	 * 门药录入
	 * @param model
	 * @param emgSeq
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/querymylr")
	public String querymylr(Model model, String emgSeq) throws Exception {
		HspemginfQueryDto hspemginfQueryDto = hspemginfService.findHspemginfByemgSeq_jzt(emgSeq);
		model.addAttribute("hspemginfCustom",hspemginfQueryDto.getHspemginfCustom());
		return "/hzszyyhospital/hzszyyqjs/querymylr";
	}
	
	/**
	 * 门药录入提交
	 * @param hspemginfQueryDto
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/querymylr_submit")
	public SubmitResultInfo querymylr_submit(HspemginfQueryDto hspemginfQueryDto) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		zyyHspemginfService.updateEmgInfMylrByEmgSeq(hspemginfQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 核对病历
	 * @param emgSeq
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/updateCheckRecord")
	public SubmitResultInfo updateCheckRecord(String emgSeq,ActiveUser activeUser) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, new Object[] {"核对成功"});
		try {
			zyyHspemginfService.updateChechRecord(emgSeq, activeUser);
		} catch (Exception e) {
			e.printStackTrace();
			resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, new Object[] {"核对失败，请重试"});
		}
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 标签打印
	 * @param emgSeq
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/updateLabelPrinting")
	public SubmitResultInfo updateLabelPrinting(String emgSeq) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, new Object[] {"标签打印成功"});
		try {
			zyyHspemginfService.updateLabelPrinting(emgSeq);
		} catch (Exception e) {
			e.printStackTrace();
			resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, new Object[] {"标签打印失败，请重试"});
		}
		return ResultUtil.createSubmitResult(resultInfo);
	}
}
