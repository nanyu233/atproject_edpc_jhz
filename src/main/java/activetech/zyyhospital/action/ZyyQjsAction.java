package activetech.zyyhospital.action;

import activetech.base.pojo.domain.Dstcompctl;
import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.dto.ActiveUser;
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
import activetech.edpc.pojo.dto.HspDbzlBasCustom;
import activetech.edpc.service.XtService;
import activetech.external.pojo.dto.VHemsJcjgCustom;
import activetech.external.pojo.dto.VHemsJyjgCustom;
import activetech.external.pojo.dto.VHemsJyjgQueryDto;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.hospital.pojo.dto.HspsqlinfCustom;
import activetech.hospital.service.HspemginfService;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.zyyhospital.pojo.dto.HspCheckCaseInfCustom;
import activetech.zyyhospital.pojo.dto.QjsCountCustom;
import activetech.zyyhospital.service.ZyyHspQjsInfService;
import activetech.zyyhospital.service.ZyyHspemginfService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/zyyqjs")
public class ZyyQjsAction {
    @Resource
    private HspemginfService hspemginfService;
    @Resource
    private SystemConfigService systemConfigService;
    @Resource
    private ZyyHspemginfService zyyHspemginfService;
    @Resource
    private ZyyHspQjsInfService zyyHspQjsInfService;

    @Resource
    private UserService userService;
    @Resource
    private CompctlService compctlService;
    @Resource
    private BaseHspemgInfService baseHspemgInfService;
    @Resource
    private XtService xtService;

    /**
     * 跳转转归登记页面
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/querylqxxdjzyy")
    public String querylqxxdjzyy(Model model, String emgSeq) throws Exception {
        HspemginfCustom hspemginfCustom = hspemginfService.findHspemginfCustomLqxxdj(emgSeq);
        model.addAttribute("hspemginfCustom", hspemginfCustom);
        model.addAttribute("islgbed", systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue());
        return "/hzszyyhospital/hzszyyqjs/querylqxxdj";
    }

    /**
     * 转归登记
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("/zyylqxxdj_submit")
    public @ResponseBody SubmitResultInfo zyylqxxdj_submit(HspemginfQueryDto hspemginfQueryDto) throws Exception {
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		zyyHspQjsInfService.sendLgxx(hspemginfQueryDto);
        HspsqlinfCustom hspsqlinfCustom = zyyHspQjsInfService.updateLqxxdj(hspemginfQueryDto);
        Map<String, Object> map = new HashMap<>();
        map.put("hspsqlinfCustom", hspsqlinfCustom);
        resultInfo.setSysdata(map);
        return ResultUtil.createSubmitResult(resultInfo);
    }

    /**
     * 跳转会诊管理列表
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/queryqjszyy")
    public String queryqjs(Model model, String moduleid, ActiveUser activeUser) throws Exception {
        List<String> roleList = userService.findRoleByUsrno(activeUser.getUsrno());
        //如果当前用户角色不包含 1004 会诊医生 则为other 如果用户包含管理员这个角色这 为admin
        String docType = "hzys";
        if (roleList.contains("D20A980F6BF54E8093B71DF096341236")) docType = "admin";
		else if (!roleList.contains("1004")) docType = "other";
        model.addAttribute("moduleid", moduleid);
        model.addAttribute("islgbed", systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue());
        model.addAttribute("apply_src", systemConfigService.findAppoptionByOptkey("HZJL").getOptvalue());
        model.addAttribute("docType", docType);
        return "/hzszyyhospital/hzszyyqjs/queryqjs";
    }

    /**
     * 抢救室列表
     *
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
    ) throws Exception {
        //非空校验
        hspemginfQueryDto = hspemginfQueryDto != null ? hspemginfQueryDto : new HspemginfQueryDto();
        if (!StringUtils.isNotNullAndEmptyByTrim(sort)) hspemginfQueryDto.setSort("emgdat");
        if (!StringUtils.isNotNullAndEmptyByTrim(order)) hspemginfQueryDto.setOrder("desc");
        if (hspemginfQueryDto.getHspemginfCustom().getUsingBed() != null) {
            hspemginfQueryDto.setEnddate(null);
            hspemginfQueryDto.setStartdate(null);
        }
        //查询列表的总数
        int total = zyyHspemginfService.findHspemginfQjsCountzyy(hspemginfQueryDto);
        PageQuery pageQuery = new PageQuery();
        pageQuery.setPageParams(total, rows, page);
        hspemginfQueryDto.setPageQuery(pageQuery);
        List<HspemginfCustom> list = zyyHspemginfService.findHspemginfQjsList(hspemginfQueryDto);
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
//	@RequestMapping("/bedInfo")
//	public @ResponseBody SubmitResultInfo bedInfo(HttpServletResponse response, String isBedType) throws Exception{
//		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
//		List<HspBedInfCustom> hspBedInfCustomList = hspBedInfService.findALLBedPlace(isBedType);
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("hspBedInfCustomList", hspBedInfCustomList);
//		resultInfo.setSysdata(map);
//		return ResultUtil.createSubmitResult(resultInfo);
//	}

    /**
     * 跳转会诊记录
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/toqueryhzjl")
    public String toqueryhzjl(Model model, String moduleid, String emgSeq) throws Exception {
        model.addAttribute("emgSeq", emgSeq);
        model.addAttribute("moduleid", moduleid);
        return "/hzszyyhospital/hzszyyqjs/queryhzjl";
    }

    /**
     * 跳转检查报告
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/queryjcbg")
    public String queryjcbg(Model model, String moduleid, String emgSeq) throws Exception {
        model.addAttribute("emgSeq", emgSeq);
        model.addAttribute("moduleid", moduleid);
        HspemginfCustom hspemginfCustom = baseHspemgInfService.findHspemginfCustom(emgSeq);
        model.addAttribute("cyrqDat", DateUtil.formatDateByFormat(hspemginfCustom.getSqlDate(), "yyyy/MM/dd"));
        model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
        model.addAttribute("vstCad", hspemginfCustom.getVstCad());
        return "/hzszyyhospital/hzszyyqjs/queryjcbg";
    }


    /**
     * 跳转导入检查报告
     *
     * @param model @sourceType 为了知识库而设置
     * @return
     * @throws Exception
     */
    @RequestMapping("/querycheckinfo")
    public String querycheckinfo(Model model, String moduleid, String emgSeq, String valName, String sourceType) throws Exception {
        model.addAttribute("emgSeq", emgSeq);
        model.addAttribute("moduleid", moduleid);
        model.addAttribute("valName", valName);
        HspemginfCustom hspemginfCustom = baseHspemgInfService.findHspemginfCustom(emgSeq);
        model.addAttribute("cyrqDat", DateUtil.formatDateByFormat(hspemginfCustom.getSqlDate(), "yyyy/MM/dd"));
        model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
        model.addAttribute("vstCad", hspemginfCustom.getVstCad());
        model.addAttribute("sourceType", sourceType);
        model.addAttribute("MPI", hspemginfCustom.getMpi());
        return "/hzszyyhospital/hzszyyqjs/checkinfo";
    }

    /**
     * 跳转导入检查报告(门诊病历)
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/mzQuerycheckinfo")
    public String mzQuerycheckinfo(Model model, String moduleid, String emgSeq, String valName) throws Exception {
        model.addAttribute("emgSeq", emgSeq);
        model.addAttribute("moduleid", moduleid);
        model.addAttribute("valName", valName);
        HspemginfCustom hspemginfCustom = baseHspemgInfService.findHspemginfCustom(emgSeq);
        model.addAttribute("cyrqDat", DateUtil.formatDateByFormat(hspemginfCustom.getSqlDate(), "yyyy/MM/dd"));
        model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
        model.addAttribute("vstCad", hspemginfCustom.getVstCad());
        model.addAttribute("MPI", hspemginfCustom.getMpi());
        return "/hzszyyhospital/hzszyyqjs/MZcheckinfo";
    }

    /**
     * 跳转检验信息
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/toexamine")
    public String toexamine(Model model, String moduleid, String emgSeq) throws Exception {
        model.addAttribute("emgSeq", emgSeq);
        model.addAttribute("moduleid", moduleid);
        HspemginfCustom hspemginfCustom = baseHspemgInfService.findHspemginfCustom(emgSeq);
        model.addAttribute("cyrqDat", DateUtil.formatDateByFormat(hspemginfCustom.getSqlDate(), "yyyy/MM/dd"));
        model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
        model.addAttribute("vstCad", hspemginfCustom.getVstCad());
        return "/hzszyyhospital/hzszyyqjs/queryexamine";
    }

    /**
     * 跳转检验信息详细
     *
     * @param model @sourceType 为了知识库而设置
     * @return
     * @throws Exception
     */
    @RequestMapping("/toexamineinfo")
    public String toexamineinfo(Model model, String moduleid, String emgSeq, String valName, String sourceType) throws Exception {
        model.addAttribute("emgSeq", emgSeq);
        model.addAttribute("moduleid", moduleid);
        HspemginfCustom hspemginfCustom = baseHspemgInfService.findHspemginfCustom(emgSeq);
        model.addAttribute("cyrqDat", DateUtil.formatDateByFormat(hspemginfCustom.getSqlDate(), "yyyy/MM/dd"));
        model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
        model.addAttribute("vstCad", hspemginfCustom.getVstCad());
        model.addAttribute("valName", valName);
        model.addAttribute("sourceType", sourceType);
        model.addAttribute("MPI", hspemginfCustom.getMpi());
        return "/hzszyyhospital/hzszyyqjs/examineinfo";
    }

    /**
     * 跳转检验信息详细(门诊病历)
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/mzToexamineinfo")
    public String mzToexamineinfo(Model model, String moduleid, String emgSeq, String valName) throws Exception {
        model.addAttribute("emgSeq", emgSeq);
        model.addAttribute("moduleid", moduleid);
        HspemginfCustom hspemginfCustom = baseHspemgInfService.findHspemginfCustom(emgSeq);
        model.addAttribute("cyrqDat", DateUtil.formatDateByFormat(hspemginfCustom.getSqlDate(), "yyyy/MM/dd"));
        model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
        model.addAttribute("vstCad", hspemginfCustom.getVstCad());
        model.addAttribute("valName", valName);
        model.addAttribute("MPI", hspemginfCustom.getMpi());
        return "/hzszyyhospital/hzszyyqjs/MZexamineinfo";
    }

    /**
     * 跳转特殊符号
     *
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
     *
     * @param model
     * @param relevanceModule 判断是哪一个目录---病程录列表
     * @return
     * @throws Exception
     */
    @RequestMapping("/qjscasenote")
    public String qjscasenote(Model model, String moduleid, String emgSeq, ActiveUser activeUser, String pageFlg, String relevanceModule) throws Exception {
        List<String> roles = userService.findRoleByUsrno(activeUser.getUsrno());
        //归档病历判断护士或医生
        String a_roles = roles.toString();
        String userFlg = "";
        //质控护士
        if (a_roles.contains("1012")) userFlg = "1";

        if (a_roles.contains("1011") || "admin".equals(activeUser.getUsrno())) userFlg = "2";
        model.addAttribute("userFlg", userFlg);
        model.addAttribute("pageFlg", pageFlg);
        model.addAttribute("moduleid", moduleid);
        model.addAttribute("relevanceModule", relevanceModule);
        HspemginfCustom hspemginfCustom = zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
        model.addAttribute("hspemginfCustom", hspemginfCustom);
        return "/hzszyyhospital/hzszyydoctor/qjscasenote";
    }

    /**
     * 外挂病历-内嵌his
     * http://localhost:8080/atproject/zyyqjs/qjscasenoteWg.do?hisjzid=222222a&usrno=1314&pageFlg=wg
     * 如果挂号id能查到预检信息则直接跳转病历，否则进入床位页面
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/qjscasenoteWg")
    public String qjscasenoteWg(HttpSession session, Model model, String emgSeq, String ghid, String usrno, String pageFlg) throws Exception {
        if ("wg".equals(pageFlg)) {
            ActiveUser activeUser = userService.insertUserByHis(usrno);
            session.setAttribute(Config.ACTIVEUSER_KEY, activeUser);
            HspemginfCustom hspemginfCustom = zyyHspemginfService.findHspemginfByGhid(ghid);
            if (hspemginfCustom == null) {
                model.addAttribute("moduleid", "8b5749cf0d91413d9391be90cbaae6a2");
                return "/hzszyyhospital/hzszyydoctor/qjscaseWg";
            }
            // 将用户身份信息写入session
            model.addAttribute("hspemginfCustom", hspemginfCustom);
            return "/hzszyyhospital/hzszyydoctor/qjscasenoteWg";
        } else if ("cwwg".equals(pageFlg)) {
            ActiveUser activeUser = (ActiveUser) session.getAttribute(Config.ACTIVEUSER_KEY);
            if (activeUser != null) {
                HspemginfCustom hspemginfCustom = zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
                model.addAttribute("hspemginfCustom", hspemginfCustom);
                return "/hzszyyhospital/hzszyydoctor/qjscasenoteWg";
            }
        }
        return "/base/refuse";

    }

    /**
     * 留抢病例首页
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/qjscase")
    public String qjscase(Model model, String moduleid, String requestSource) throws Exception {
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
//	@RequestMapping("/toqjscaseexamine")
//	public String toqjscaseexamine(Model model,String moduleid,String emgSeq) throws Exception {
//		model.addAttribute("emgSeq", emgSeq);
//		model.addAttribute("moduleid", moduleid);
//		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
//		HspObsvtfstInfCustom hspObsvtfstInfCustom=zyyLqblService.findObsvtfstByEmgSeq(emgSeq);
//		model.addAttribute("cyrqDat",hspObsvtfstInfCustom.getDscgDatStr());
//		model.addAttribute("hspemginfCustom", hspemginfCustom);
//		model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
//		model.addAttribute("vstCad", hspemginfCustom.getVstCad());
//		return "/hzszyyhospital/hzszyydoctor/qjscaseexamine";
//	}

    /**
     * 跳转检查报告
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/qjsjcbg")
    public String qjsjcbg(Model model,String moduleid,String regSeq) throws Exception {
        model.addAttribute("regSeq", regSeq);
        model.addAttribute("moduleid", moduleid);
        HspDbzlBasCustom hspDbzlBasCustom = xtService.getDbzlBasBYRegSeq(regSeq);
		/*HspObsvtfstInfCustom hspObsvtfstInfCustom=zyyLqblService.findObsvtfstByEmgSeq(emgSeq);
		model.addAttribute("cyrqDat",hspObsvtfstInfCustom.getDscgDatStr());*/
        model.addAttribute("hspemginfCustom", hspDbzlBasCustom);
        model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspDbzlBasCustom.getRegTim(), "yyyy/MM/dd"));
        model.addAttribute("vstCad", hspDbzlBasCustom.getVstCad());
        model.addAttribute("MPI", hspDbzlBasCustom.getMpi());
        return "/hzszyyhospital/hzszyydoctor/qjsjcbg";
    }

    /**
     * 跳转医嘱信息
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/qjsyzxx")
    public String qjsyzxx(Model model, String moduleid, String regSeq) throws Exception {
        HspDbzlBasCustom hspDbzlBasCustom = xtService.getDbzlBasBYRegSeq(regSeq);
        model.addAttribute("regSeq", regSeq);
        model.addAttribute("moduleid", moduleid);
        model.addAttribute("sqlDat", DateUtil.formatDateByFormat(new Date(), "yyyy/MM/dd HH:mm"));
        model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspDbzlBasCustom.getRegTim(), "yyyy/MM/dd HH:mm"));
        model.addAttribute("mpi", hspDbzlBasCustom.getMpi());
        model.addAttribute("hspemginfCustom", hspDbzlBasCustom);
        return "/hzszyyhospital/hzszyyqjs/qjsyzxx";
    }


    /**
     * 跳转留抢病例检验信息(新)
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/toqjscaseexaminenew")
    public String toqjscaseexaminenew(Model model,String moduleid,String regSeq) throws Exception {
        model.addAttribute("regSeq", regSeq);
        model.addAttribute("moduleid", moduleid);
        //HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		/*HspObsvtfstInfCustom hspObsvtfstInfCustom=zyyLqblService.findObsvtfstByEmgSeq(emgSeq);
		model.addAttribute("cyrqDat",hspObsvtfstInfCustom.getDscgDatStr());
		model.addAttribute("hspemginfCustom", hspemginfCustom);*/
        HspDbzlBasCustom hspDbzlBasCustom = xtService.getDbzlBasBYRegSeq(regSeq);
        model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspDbzlBasCustom.getRegTim(), "yyyy/MM/dd"));
        model.addAttribute("vstCad", hspDbzlBasCustom.getVstCad());
        model.addAttribute("MPI", hspDbzlBasCustom.getMpi());
        return "/hzszyyhospital/hzszyydoctor/newqjscaseexamine";
    }

    /**
     * 检验信息结果集
     * @return
     * @throws Exception
     */
    //@RequestMapping("/queryexamine_result")
    //public @ResponseBody DataGridResultInfo queryexamine_result(Model mode,
    //                                                            VHemsJyjgQueryDto vHemsJyjgQueryDto,
    //                                                            String sort,
    //                                                            String order
    //) throws Exception{
    //    //首次查询时默认赋值系统当天日期
    //    if(vHemsJyjgQueryDto.getvHemsJyjgCustom().getEnddate() != null){
    //        Date endDate = DateUtil.getNextDay(vHemsJyjgQueryDto.getvHemsJyjgCustom().getEnddate());
    //        vHemsJyjgQueryDto.getvHemsJyjgCustom().setEnddate(endDate);
    //    }
    //    //查询列表的总数
    //    if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
    //        vHemsJyjgQueryDto.setSort("resultDateTime");
    //    }
    //    if(!StringUtils.isNotNullAndEmptyByTrim(order)){
    //        vHemsJyjgQueryDto.setOrder("asc");
    //    }
    //    //int total =oracleHisService.findJyxxCount(vHemsJyjgQueryDto);
    //    //List<VHemsJyjgCustom> list =oracleHisService.findJyxx(vHemsJyjgQueryDto);
    //
    //    DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
    //
    //    //填充total
    //    dataGridResultInfo.setTotal(0);
    //
    //    //填充rows
    //    dataGridResultInfo.setRows(null);
    //
    //    return dataGridResultInfo;
    //}

    /**
     * 检验信息详细结果集
     * @return
     * @throws Exception
     */
    //@RequestMapping("/queryexamineinfo_result")
    //public @ResponseBody DataGridResultInfo queryexamineinfo_result(Model mode,
    //                                                                VHemsJyjgQueryDto vHemsJyjgQueryDto,
    //                                                                int page,//当前页码
    //                                                                int rows//每页显示个数
    //) throws Exception{
    //    //首次查询时默认赋值系统当天日期
    //    if(vHemsJyjgQueryDto.getvHemsJyjgCustom().getEnddate() != null){
    //        Date endDate = DateUtil.getNextDay(vHemsJyjgQueryDto.getvHemsJyjgCustom().getEnddate());
    //        vHemsJyjgQueryDto.getvHemsJyjgCustom().setEnddate(endDate);
    //    }
    //    int total =oracleHisService.findJyxxInfoCount(vHemsJyjgQueryDto);
    //    PageQuery pageQuery = new PageQuery();
    //    pageQuery.setPageParams(total, rows, page);
    //    vHemsJyjgQueryDto.setPageQuery(pageQuery);
    //    List<VHemsJyjgCustom> list =oracleHisService.findJyxxInfo(vHemsJyjgQueryDto);
    //
    //    DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
    //    //填充total
    //    dataGridResultInfo.setTotal(total);
    //    //填充rows
    //    dataGridResultInfo.setRows(list);
    //    return dataGridResultInfo;
    //}

    /**
     * 检查报告结果集
     * @return
     * @throws Exception
     */
    //@RequestMapping("/queryjcbg_result")
    //public @ResponseBody DataGridResultInfo queryjcbg_result(
    //        VHemsJyjgQueryDto vHemsJyjgQueryDto,
    //        String sort,
    //        String order
    //) throws Exception{
    //    //首次查询时默认赋值系统当天日期
    //    if(vHemsJyjgQueryDto.getvHemsJcjgCustom().getEnddate() != null){
    //        Date endDate = DateUtil.getNextDay(vHemsJyjgQueryDto.getvHemsJcjgCustom().getEnddate());
    //        vHemsJyjgQueryDto.getvHemsJcjgCustom().setEnddate(endDate);
    //    }
    //    List<VHemsJcjgCustom> list =oracleHisService.findJcjg(vHemsJyjgQueryDto);
    //
    //    DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
    //    //填充total
    //    dataGridResultInfo.setTotal(list.size());
    //    //填充rows
    //    dataGridResultInfo.setRows(list);
    //    return dataGridResultInfo;
    //}



    /**
     * 跳转留抢大屏
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/qjsScreen")
    public String qjsScreen(Model model, String moduleid) throws Exception {
        model.addAttribute("moduleid", moduleid);
        return "/hzszyyhospital/hzszyyqjs/qjsScreen";
    }

    /**
     * 归档病历
     *
     * @param model
     * @return
     * @throws Exception
     */
    @RequestMapping("/queryAMRecord")
    public String queryAMRecord(Model model, String moduleid) throws Exception {
        // 急诊科室列表
        List<Dstcompctl> jzkscompctlList = compctlService.getJzksCompctlList();
        model.addAttribute("jzkscompctlList", jzkscompctlList);
        model.addAttribute("moduleid", moduleid);
        model.addAttribute("islgbed", systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue());
        return "/hzszyyhospital/hzszyyqjs/queryAMRecord";
    }


    /**
     * 审核通过
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("/submitCheckRecord")
    public @ResponseBody SubmitResultInfo submitCheckRecord(HspemginfCustom hspemginfCustom, ActiveUser activeUser, String userFlg) throws Exception {
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		zyyHspemginfService.submitCheckRecord(hspemginfCustom, userFlg);
        return ResultUtil.createSubmitResult(resultInfo);
    }

    /**
     * 获取归档病历审核按钮checkbox的值
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("/getCheckCase")
    public @ResponseBody HspCheckCaseInfCustom getCheckCase(String emgSeq) throws Exception {
        return zyyHspemginfService.getCheckCase(emgSeq);
    }

    /**
     * 归档病历各项功能检查状态提交
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("/submiCheckCase")
    public @ResponseBody SubmitResultInfo submiCheckCase(HspCheckCaseInfCustom hspCheckCaseInfCustom, ActiveUser activeUser) throws Exception {
        //HspCheckCaseInfCustom hspCheckCaseInfCustom=(HspCheckCaseInfCustom) JSON.parse(jsonStr);
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		zyyHspemginfService.submitCheckCase(hspCheckCaseInfCustom, activeUser);
        return ResultUtil.createSubmitResult(resultInfo);
    }


    /**
     * 诊断可编辑表格跳转
     *
     * @param model
     * @param canEditZd 是否可以修改诊断
     * @return
     * @throws Exception
     */
    @RequestMapping("/querylrNew")
    public String querylrNew(Model model, String trnumber, String emgSeq, String jbzdType, String canEditZd) throws Exception {
        model.addAttribute("trnumber", trnumber);
        model.addAttribute("emgSeq", emgSeq);
        model.addAttribute("jbzdType", jbzdType);
        model.addAttribute("canEditZd", canEditZd);
        return "/hzszyyhospital/hzszyydoctor/lxindex/querylr";
    }

    @RequestMapping("/findBedAndSqlStaCod")
    public @ResponseBody SubmitResultInfo findBedAndSqlStaCod(String emgSeq) throws Exception {
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        //单独取床位
//		List<HspBedInfCustom> bedplacecodList=hspBedInfService.findBedPlaceAndNum(emgSeq,"");
        Map<String, Object> map = new HashMap<>(70);
//		map.put("bedplacecodList",bedplacecodList);
        //单独取转归去向
        List<Dstdictinfo> sqlStaCodList = systemConfigService.findDictinfoByType("CST_DSP_COD");
        map.put("sqlStaCodList", sqlStaCodList);
        resultInfo.setSysdata(map);
        return ResultUtil.createSubmitResult(resultInfo);
    }

    /**
     * 抢救室数据统计
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("/getqjsDataCount")
    public @ResponseBody SubmitResultInfo getqjsDataCount(HspemginfQueryDto hspemginfQueryDto) throws Exception {
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        QjsCountCustom qjsCountCustom = zyyHspQjsInfService.getqjsDataCount(hspemginfQueryDto);
        Map<String, Object> map = new HashMap<>(70);
        map.put("qjsCountCustom", qjsCountCustom);
        resultInfo.setSysdata(map);
        return ResultUtil.createSubmitResult(resultInfo);
    }

    /**
     * @param model
     * @param emgSeq
     * @return
     * @throws Exception
     * @author machaofan
     * 门药录入
     */
    @RequestMapping(value = "/querymylr")
    public String querymylr(Model model, String emgSeq) throws Exception {
        HspemginfQueryDto hspemginfQueryDto = hspemginfService.findHspemginfByemgSeq_jzt(emgSeq);
        model.addAttribute("hspemginfCustom", hspemginfQueryDto.getHspemginfCustom());
        return "/hzszyyhospital/hzszyyqjs/querymylr";
    }

    /**
     * 门药录入提交
     *
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
     *
     * @param emgSeq
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateCheckRecord")
    public SubmitResultInfo updateCheckRecord(String emgSeq, ActiveUser activeUser) {
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, new Object[]{"核对成功"});
        try {
			zyyHspemginfService.updateChechRecord(emgSeq, activeUser);
        } catch (Exception e) {
            e.printStackTrace();
            resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, new Object[]{"核对失败，请重试"});
        }
        return ResultUtil.createSubmitResult(resultInfo);
    }

    /**
     * 标签打印
     *
     * @param emgSeq
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/updateLabelPrinting")
    public SubmitResultInfo updateLabelPrinting(String emgSeq) {
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, new Object[]{"标签打印成功"});
        try {
			zyyHspemginfService.updateLabelPrinting(emgSeq);
        } catch (Exception e) {
            e.printStackTrace();
            resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, new Object[]{"标签打印失败，请重试"});
        }
        return ResultUtil.createSubmitResult(resultInfo);
    }
}
