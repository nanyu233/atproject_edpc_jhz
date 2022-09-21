package activetech.zyyhospital.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.annotation.FormToken;
import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.SystemConfigService;
import activetech.basehis.service.OracleHisService;
import activetech.basehis.service.SqlServerHisService;
import activetech.external.pojo.dto.VHemsJcjgCustom;
import activetech.external.pojo.dto.VHemsJyjgCustom;
import activetech.external.pojo.dto.VHemsJyjgQueryDto;
import activetech.hospital.pojo.dto.HspJbzdInfCustom;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.hospital.pojo.dto.HspsqlinfCustom;
import activetech.hospital.service.HspCstInfService;
import activetech.hospital.service.HspsqlinfService;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.zyyhospital.pojo.domain.HspConsentInfWithBLOBs;
import activetech.zyyhospital.pojo.dto.HspCerebralCourseCustom;
import activetech.zyyhospital.pojo.dto.HspCfjlInfCustom;
import activetech.zyyhospital.pojo.dto.HspCgxjInfCustom;
import activetech.zyyhospital.pojo.dto.HspConsentInfCustom;
import activetech.zyyhospital.pojo.dto.HspConsentInfCustomDto;
import activetech.zyyhospital.pojo.dto.HspConsultationRecordsCustom;
import activetech.zyyhospital.pojo.dto.HspConsultationRecordsQueryDto;
import activetech.zyyhospital.pojo.dto.HspCxfxpgbCustom;
import activetech.zyyhospital.pojo.dto.HspDeathRecordCustom;
import activetech.zyyhospital.pojo.dto.HspDeathRecordQueryDto;
import activetech.zyyhospital.pojo.dto.HspDiseaseCourseCustom;
import activetech.zyyhospital.pojo.dto.HspDiseaseCourseQueryDto;
import activetech.zyyhospital.pojo.dto.HspHljldInfCustom;
import activetech.zyyhospital.pojo.dto.HspHljldInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspHlpgbQueryDto;
import activetech.zyyhospital.pojo.dto.HspJjbjlInfCustom;
import activetech.zyyhospital.pojo.dto.HspJmxsfxyspgbCustom;
import activetech.zyyhospital.pojo.dto.HspJmxsfxyspgbCustomDto;
import activetech.zyyhospital.pojo.dto.HspLqblInfCustom;
import activetech.zyyhospital.pojo.dto.HspLqbljlQueryDto;
import activetech.zyyhospital.pojo.dto.HspObsvtfstInfCustom;
import activetech.zyyhospital.pojo.dto.HspQjjlInfCustom;
import activetech.zyyhospital.pojo.dto.HspVtefxpgbCustom;
import activetech.zyyhospital.service.HspCerebralService;
import activetech.zyyhospital.service.HspConsultationRecordsService;
import activetech.zyyhospital.service.HspDeathRecordService;
import activetech.zyyhospital.service.HspDiseaseCourseService;
import activetech.zyyhospital.service.HspHljldInfService;
import activetech.zyyhospital.service.HspHlpgbService;
import activetech.zyyhospital.service.RiskAssSheetService;
import activetech.zyyhospital.service.ZyyConsentService;
import activetech.zyyhospital.service.ZyyHspemginfService;
import activetech.zyyhospital.service.ZyyLqblService;
import sun.misc.BASE64Encoder;

@Controller
@RequestMapping("/zyylqblqrb")
public class ZyyLqblqrbAction {
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
	@Autowired
	private ZyyLqblService zyyLqblService;
	@Autowired
	private OracleHisService oracleHisService;
	@Autowired
	private SqlServerHisService sqlServerHisService;
	@Autowired
	private HspDiseaseCourseService hspDiseaseCourseService;
	@Autowired
	private HspDeathRecordService hspDeathRecordService;
	@Autowired
	private HspCstInfService hspCstInfService;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private HspConsultationRecordsService hspConsultationRecordsService;
	@Autowired
	private ZyyConsentService zyyConsentService;
	@Autowired
	private HspHljldInfService hspHljldInfService;
	
	@Autowired
	private HspsqlinfService hspsqlinfService;
	@Autowired
	private HspCerebralService hspCerebralService;
	// 出血评估
	@Autowired
	private RiskAssSheetService riskAssSheetService;
	@Autowired
	private HspHlpgbService hspHlpgbService;
	//=========================================留抢病历  嵌入版本================================================
	/**
	 * 跳转留抢病历（嵌入版）
	 * @param model
	 * @return
	 * @throws Throwable 
	 */
	@RequestMapping("/querylqblqrb")
	public String querylqblqrb(Model model, String moduleid, String vstcad) throws Exception{
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("vstcad", vstcad);
		model.addAttribute("islgbed", systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue());

		return "/hospital/leaveRecord/leaveRecord";
	}
	
	/**
	 * 急症记录查询列表
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
		List<Dstdictinfo> dstdictinfoList = systemConfigService.findDictinfoByType("SAV_MNG_COD");
		List<String>infos = new ArrayList<String>();
		List<String> infocodes = new ArrayList<String>();
		for (Dstdictinfo dstdictinfo : dstdictinfoList) {
			infos.add(dstdictinfo.getInfo());
			infocodes.add(dstdictinfo.getInfocode());
		}
		
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 留抢病例记录首页
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/qjscasenote")
	public String qjscasenote(Model model, String moduleid,String emgSeq,String pageFlg) throws Exception {
		model.addAttribute("moduleid", moduleid);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hospital/doctor/qjscasenote";
	}
	
	/**
	 * 跳转留观首页
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryobservenote")
	@FormToken(save=true)
	public String queryObsvtfst(Model model,String emgSeq) throws Exception {
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		
		HspsqlinfCustom hspsqlinfCustom=hspsqlinfService.findLastSql(emgSeq);
		model.addAttribute("hspsqlinfCustom", hspsqlinfCustom);
		
		//获取留观首页
		HspObsvtfstInfCustom hspObsvtfstInfCustom=zyyLqblService.findObsvtfstByEmgSeq(emgSeq);
		model.addAttribute("hspObsvtfstInfCustom", hspObsvtfstInfCustom);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hospital/doctor/lxindex/observenote";
	}
	
	/**
	 * 跳转留抢病历
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querylqbl")
	@FormToken(save=true)
	public String querylqbl(Model model,String emgSeq) throws Exception {
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hospital/doctor/lxrecord/recordnote";
	}
	
	/**
	 * 获取留抢病历
	 * @param hspLqbljlQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findLqbl")
	public @ResponseBody HspLqblInfCustom findLqbl(String emgSeq)throws Exception{ 
		//获取留观首页
		HspLqblInfCustom hspLqblInfCustom=zyyLqblService.findLqblByEmgSeq(emgSeq);
		return hspLqblInfCustom;
	}

	/**
	 * 跳转病程记录主页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryDiseaseCourse")
	public String querydiseaseCourse(Model model,String emgSeqDc,String type) throws Exception{
		model.addAttribute("emgSeqDc", emgSeqDc);
		model.addAttribute("type", type);
		return "/hospital/doctor/diseaseCourse/queryDiseaseCourse";
	}
	
	/**
	 * 跳转首次病程页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryFirstDisease") 
	@FormToken(save=true)
	public String queryFirstDisease(Model model,HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto) throws Exception{
		HspDiseaseCourseCustom hspDiseaseCourseCustom  = hspDiseaseCourseService.findHspDiseaseCourse(hspDiseaseCourseQueryDto);
		String emgSeqDc = hspDiseaseCourseQueryDto.getHspDiseaseCourseCustom().getEmgSeqDc();
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeqDc);
		HspLqblInfCustom hspLqblInfCustom = zyyLqblService.findLqblForDisease(emgSeqDc);
		//入院诊断中医
		List<HspJbzdInfCustom> hspJbzdInfCustomList1 = hspCstInfService.findHspJbzdInfHzzd(emgSeqDc,"2");
		HspJbzdInfCustom hspJbzdInfCustom1 = hspCstInfService.findHspJbzdInfComm(emgSeqDc,"2");
		//入院诊断西医
		List<HspJbzdInfCustom> hspJbzdInfCustomList2 = hspCstInfService.findHspJbzdInfHzzd(emgSeqDc,"1");
		HspJbzdInfCustom hspJbzdInfCustom2 = hspCstInfService.findHspJbzdInfComm(emgSeqDc,"1");
		
		model.addAttribute("hspJbzdInfCustomList1", hspJbzdInfCustomList1);
		model.addAttribute("hspJbzdInfCustom1", hspJbzdInfCustom1);
		model.addAttribute("hspJbzdInfCustomList2", hspJbzdInfCustomList2);
		model.addAttribute("hspJbzdInfCustom2", hspJbzdInfCustom2);
		model.addAttribute("hspDiseaseCourseCustom", hspDiseaseCourseCustom);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		model.addAttribute("hspLqblInfCustom", hspLqblInfCustom);
		return "/hospital/doctor/diseaseCourse/queryFirstDisease";
	}
	
	/**
	 * 跳转其他病程
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryOtherDisease")
	public String  queryOtherDisease(Model model,HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto) throws Exception{
		String emgSeqDc = hspDiseaseCourseQueryDto.getHspDiseaseCourseCustom().getEmgSeqDc();
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeqDc);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hospital/doctor/diseaseCourse/query"+hspDiseaseCourseQueryDto.getForwardUrl();
	}
	
	/**
	 * 病程结果集
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryDiseaseCourse_result")
	  public @ResponseBody DataGridResultInfo queryDiseaseCourse(Model model,
			HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto
			) throws Exception{
		int total = hspDiseaseCourseService.findHspDiseaseCourseTotal(hspDiseaseCourseQueryDto);
		PageQuery pageQuery = new PageQuery();
		int rows = total;
		int page = 1;
		pageQuery.setPageParams(total, rows, page);
		hspDiseaseCourseQueryDto.setPageQuery(pageQuery);
		List<HspDiseaseCourseCustom> list = hspDiseaseCourseService.findHspDiseaseCourseList(hspDiseaseCourseQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(total);
		return dataGridResultInfo;
	}

	/**
	 * 跳转脑梗溶栓病程记录
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/brainDisease")
	@FormToken(save=true)
	public String brainDisease(Model model,String emgSeq) throws Exception{
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		HspCerebralCourseCustom hspCerebralCourseCustom=hspCerebralService.findCerebralCourseByEmgSeq(emgSeq);
		model.addAttribute("hspCerebralCourseCustom", hspCerebralCourseCustom);
 		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hospital/doctor/diseaseCourse/brainDisease";
	}
	
	/**
	 * 跳转查房记录
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toquerycfjl")
	public String toquerycfjl(Model model, String moduleid,String emgSeq,String flag) throws Exception {
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("flag", flag);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hospital/doctor/cfjl/querycfjl";
	}
	/**
	 * 查房记录列表结果集
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querycfjl_result")
	public @ResponseBody DataGridResultInfo querycfjl_result(Model mode, 
		HspLqbljlQueryDto hspLqbljlQueryDto,
		String sort,
		String order
		) throws Exception{
		//查询列表的总数
		if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
			hspLqbljlQueryDto.setSort("cfjlDat");
		}
		if(!StringUtils.isNotNullAndEmptyByTrim(order)){
			hspLqbljlQueryDto.setOrder("desc");
		}
		
		int total =zyyLqblService.findhspCfjlInfcount(hspLqbljlQueryDto);	
		PageQuery pageQuery = new PageQuery();
		int rows = total;
		int page = 1;
		pageQuery.setPageParams(total, rows, page);
		hspLqbljlQueryDto.setPageQuery(pageQuery);
		List<HspCfjlInfCustom> list = zyyLqblService.findhspCfjlInfList(hspLqbljlQueryDto);

		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	/**
	 * 跳转交接班记录
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toqueryjjbjl")
	public String toqueryjjbjl(Model model, String moduleid,String emgSeq,String flag) throws Exception {
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("flag", flag);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hospital/doctor/jjbjl/queryjjbjl";
	}
	
	/**
	 * 交接班记录列表结果集
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryjjbjl_result")
	public @ResponseBody DataGridResultInfo queryjjbjl_result(Model mode, 
		HspLqbljlQueryDto hspLqbljlQueryDto,
		String sort,
		String order
		) throws Exception{
		//查询列表的总数
		if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
			hspLqbljlQueryDto.setSort("jjbjlDat");
		}
		if(!StringUtils.isNotNullAndEmptyByTrim(order)){
			hspLqbljlQueryDto.setOrder("desc");
		}
		
		int total =zyyLqblService.findhspJjbjlInfcount(hspLqbljlQueryDto);	
		PageQuery pageQuery = new PageQuery();
		int rows = total;
		int page = 1;
		pageQuery.setPageParams(total, rows, page);
		hspLqbljlQueryDto.setPageQuery(pageQuery);
		List<HspJjbjlInfCustom> list =zyyLqblService.findhspJjbjlInfList(hspLqbljlQueryDto);
	
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	/**
	 * 跳转抢救记录
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toqueryqjjl")
	public String toqueryqjjl(Model model, String moduleid,String emgSeq) throws Exception {
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("emgSeq", emgSeq);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hospital/doctor/qjjl/queryqjjl";
	}

	/**
	 * 抢救记录列表结果集
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryqjjl_result")
	public @ResponseBody DataGridResultInfo queryqjjl_result(Model mode, 
		HspLqbljlQueryDto hspLqbljlQueryDto,
		String sort,
		String order
		) throws Exception{
		//查询列表的总数
		if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
			hspLqbljlQueryDto.setSort("qjjlDat");
		}
		if(!StringUtils.isNotNullAndEmptyByTrim(order)){
			hspLqbljlQueryDto.setOrder("desc");
		}
		
		int total =zyyLqblService.findhspQjjlInfcount(hspLqbljlQueryDto);	
		PageQuery pageQuery = new PageQuery();
		int rows = total;
		int page = 1;
		pageQuery.setPageParams(total, rows, page);
		hspLqbljlQueryDto.setPageQuery(pageQuery);
		List<HspQjjlInfCustom> list =zyyLqblService.findhspQjjlInfList(hspLqbljlQueryDto);
	
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}	
	
	/**
	 * 跳转自定义抬头
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toqueryzdy")
	public String toqueryzdy(Model model, String moduleid,String emgSeq,String flag) throws Exception {
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("flag", flag);//flag传9
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hospital/doctor/cfjl/queryzdy";
	}

		/**
	 * 自定义抬头列表结果集
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryzdy_result")
	public @ResponseBody DataGridResultInfo queryzdy_result(Model mode, 
		HspLqbljlQueryDto hspLqbljlQueryDto,
		String sort,
		String order
		) throws Exception{
		//查询列表的总数
		if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
			hspLqbljlQueryDto.setSort("cfjlDat");
		}
		if(!StringUtils.isNotNullAndEmptyByTrim(order)){
			hspLqbljlQueryDto.setOrder("desc");
		}
		
		int total =zyyLqblService.findhspCfjlInfcount(hspLqbljlQueryDto);	//CFJL_TYPE 传9
		PageQuery pageQuery = new PageQuery();
		int rows = total;
		int page = 1;
		pageQuery.setPageParams(total, rows, page);
		hspLqbljlQueryDto.setPageQuery(pageQuery);
		List<HspCfjlInfCustom> list =zyyLqblService.findhspCfjlInfList(hspLqbljlQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	/**
	 * 跳转会诊记录页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryConsultation")
	public String queryConsultation(Model model,String emgSeqCr) throws Exception {
		HspemginfCustom hspemginfCustom = zyyHspemginfService.findHspemginfByemgSeq(emgSeqCr);
		model.addAttribute("emgSeqCr", emgSeqCr);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hospital/doctor/consultation/queryConsultation";
	}
	
	/**
	 * 会诊记录结果集
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryConsultation_result")
	public @ResponseBody DataGridResultInfo queryConsultation_result(Model model,
			HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto
			) throws Exception{
		int total = hspConsultationRecordsService.findHspConsultationRecordsTotal(hspConsultationRecordsQueryDto);
		PageQuery pageQuery = new PageQuery();
		int rows = total;
		int page = 1;
		pageQuery.setPageParams(total, rows, page);
		hspConsultationRecordsQueryDto.setPageQuery(pageQuery);
		List<HspConsultationRecordsCustom> list = hspConsultationRecordsService.findHspConsultationRecordsList(hspConsultationRecordsQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(total);
		return dataGridResultInfo;
	}

	/**
	 * 跳转死亡记录
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryDeathRecord")
	public String querydiseaseCourse(Model model,String emgSeqDr) throws Exception{
		HspDeathRecordQueryDto hspDeathRecordQueryDto = new HspDeathRecordQueryDto();
		HspDeathRecordCustom swCustom = new HspDeathRecordCustom();
		swCustom.setEmgSeqDr(emgSeqDr);
		hspDeathRecordQueryDto.setHspDeathRecordCustom(swCustom);
		HspDeathRecordCustom hspDeathRecordCustom = hspDeathRecordService.findDeathRecord(hspDeathRecordQueryDto);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeqDr);
		model.addAttribute("hspDeathRecordCustom", hspDeathRecordCustom);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hospital/doctor/deathRecord/queryDeathRecord";
	}

	/**
	 * 跳转出观小结
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querycgxj")
	@FormToken(save=true)
	public String querycgxj(Model model,String emgSeq) throws Exception {
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		//获取出观小结数据
		HspCgxjInfCustom hspCgxjInfCustom=zyyLqblService.findCgxjByEmgSeq(emgSeq);
		model.addAttribute("hspCgxjInfCustom", hspCgxjInfCustom);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hospital/doctor/lxsummary/viewsummary";
	}
	
	/**
	 * 跳转知情同意书列表
	 *@param model
	 *@param refseqno(病人序号)
	 *@return
	 *@throws Exception
	 *@author liulj @date 2018年2月1日 下午1:48:29
	 */
	@RequestMapping("/queryConsentInf")
	public String queryConsentInf(Model model,String refseqno) throws Exception{
		model.addAttribute("refseqno", refseqno);
		return "/hospital/doctor/consent/queryzqtys";
	}

	@RequestMapping("/queryConsentInf_Result")
	public @ResponseBody DataGridResultInfo queryConsentInf_Result(HspConsentInfCustomDto hspConsentInfCustomDto,
			int page,//当前页码
			int rows,//每页显示个数
			String sort,
			String order) throws Exception{
		//非空检验
		hspConsentInfCustomDto=hspConsentInfCustomDto!=null?hspConsentInfCustomDto:new HspConsentInfCustomDto();
		int total =zyyConsentService.findHspConsentInfByRefseqnoCount(hspConsentInfCustomDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspConsentInfCustomDto.setPageQuery(pageQuery);
		List<HspConsentInfCustom> list =zyyConsentService.findHspConsentInfByRefseqno(hspConsentInfCustomDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}

	/**
		* 跳转知情同意书页面
		*@param model
		*@param refseqno
		*@return
		*@throws Exception
		*@author liulj @date 2018年2月1日 下午2:19:53
		*/
	@RequestMapping("/ConsentInf")
	public String ConsentInf(Model model,String seqno) throws Exception{
		HspConsentInfWithBLOBs hspConsentInf =zyyConsentService.findHspConsentInfBySeqno(seqno);
		model.addAttribute("seqno", seqno);
		model.addAttribute("tempno",hspConsentInf.getTempno());
		model.addAttribute("tempname",hspConsentInf.getTempname());
		model.addAttribute("refseqno",hspConsentInf.getRefseqno());
		model.addAttribute("texthtml",hspConsentInf.getTexthtml());
		return "/hospital/doctor/consent/ConsentInfBase";
	}
  
	/*---------------------------------出血风险------------------------------------------------------*/
	/**
	 * 跳转內科住院患者出血风险评估
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/riskAssSheet")
	@FormToken(save = true)
	public String riskAssSheet(Model model, String emgSeq) throws Exception {
		HspemginfCustom hspemginfCustom = zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		HspCxfxpgbCustom hspCxfxpgbCustom = riskAssSheetService.findCxfxpgbByEmgSeq(emgSeq);
		model.addAttribute("hspCxfxpgbCustom", hspCxfxpgbCustom);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hospital/doctor/riskRecord/patientBleed";
	}
		/* 数据字典页面展示 */
	@RequestMapping("/findRiskAssSheetList")
	public @ResponseBody SubmitResultInfo findRiskAssSheetList(String emgSeq) throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, String> params = new HashMap<String, String>(20);
		params.put("HIGHRISK1_COD", "highrisk1CodList");// 满足一项高出血
		params.put("HIGHRISK2_COD", "highrisk2CodList");// 满足二项高出血
		params.put("FXYZ_COD", "fxyzCodList");// VTE
		params.put("MGWXYS_A_COD", "mgwxysACodList");// A每个危险因素1分
		params.put("MGWXYS_B_COD", "mgwxysBCodList");// B每个危险因素2分
		params.put("MGWXYS_C_COD", "mgwxysCCodList");// C每个危险因素3分
		params.put("MGWXYS_D_COD", "mgwxysDCodList");// D每个危险因素5分

		Map<String, List<Dstdictinfo>> maps = systemConfigService.findDstdictinfos(params);
		Map<String, Object> map = new HashMap<String, Object>(20);
		map.putAll(maps);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	/*---------------------------------vte------------------------------------------------------*/
	// 跳转到VTE评估
	@RequestMapping("/VteAssSheet")
	@FormToken(save = true)
	public String vteAssSheet(Model model, String emgSeq) throws Exception {
		HspemginfCustom hspemginfCustom = zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		HspVtefxpgbCustom hspVtefxpgbCustom = riskAssSheetService.findVtefxpgbByEmgSeq(emgSeq);
		model.addAttribute("hspVtefxpgbCustom", hspVtefxpgbCustom);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hospital/doctor/riskRecord/VteRisk";
	}

	/*---------------------------------静脉血栓------------------------------------------------------*/
	// 跳转到静脉血栓评估
	@RequestMapping("/jmxsAssSheet")
	@FormToken(save = true)
	public String jmxsAssSheet(Model model, String emgSeq) throws Exception {
		HspemginfCustom hspemginfCustom = zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		HspJmxsfxyspgbCustom hspJmxsfxyspgbCustom = riskAssSheetService.findJmxsfxpgbByEmgSeq(emgSeq);
		model.addAttribute("hspJmxsfxyspgbCustom", hspJmxsfxyspgbCustom);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hospital/doctor/riskRecord/bloodRiskAssess";
	}

	// 静脉血栓获取
	@RequestMapping("/findJmxsAssSheet")
	public @ResponseBody HspJmxsfxyspgbCustomDto findJmxsAssSheet(String emgSeq) throws Exception {
		HspJmxsfxyspgbCustomDto hspJmxsfxyspgbCustomDto = riskAssSheetService.findJmxsfxpgbById(emgSeq);
		return hspJmxsfxyspgbCustomDto;
	}

	/**
	 * 跳转医嘱信息
	 * @param model 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toquerycfxx")
	public String toquerycfxx(Model model,String moduleid,String emgSeq) throws Exception {
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("moduleid", moduleid);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		HspObsvtfstInfCustom hspObsvtfstInfCustom=zyyLqblService.findObsvtfstByEmgSeq(emgSeq);
		model.addAttribute("cyrqDat",hspObsvtfstInfCustom.getDscgDatStr());
		model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
		model.addAttribute("vstCad", hspemginfCustom.getVstCad());
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hospital/doctor/yzxx/queryyzxx";
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
		return "/hospital/doctor/newqjscaseexamine";
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
		return "/hospital/doctor/qjsjcbg";
	}
	
	/**
	 * 检验信息结果集
	 * @param model
	 * @param HspBedInfCustomDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryexamine_result")
	public @ResponseBody DataGridResultInfo queryexamine_result(Model mode, 
			                VHemsJyjgQueryDto vHemsJyjgQueryDto,
							String sort,
							String order
		) throws Exception{
		//首次查询时默认赋值系统当天日期
		if(vHemsJyjgQueryDto.getvHemsJyjgCustom().getEnddate() != null){
			Date endDate = DateUtil.getNextDay(vHemsJyjgQueryDto.getvHemsJyjgCustom().getEnddate());
			vHemsJyjgQueryDto.getvHemsJyjgCustom().setEnddate(endDate);
		}
		//查询列表的总数
		if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
			vHemsJyjgQueryDto.setSort("resultDateTime");
		}
		if(!StringUtils.isNotNullAndEmptyByTrim(order)){
			vHemsJyjgQueryDto.setOrder("asc");
		}
		
		int total =oracleHisService.findvhemsjyjgcount(vHemsJyjgQueryDto);	
		List<VHemsJyjgCustom> list =oracleHisService.findvhemsjyjgList(vHemsJyjgQueryDto);
	
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	/**
	 * 检验信息详细结果集
	 * @param model
	 * @param HspBedInfCustomDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryexamineinfo_result")
	public @ResponseBody DataGridResultInfo queryexamineinfo_result(Model mode, 
			VHemsJyjgQueryDto vHemsJyjgQueryDto,
			int page,//当前页码
			int rows//每页显示个数
		) throws Exception{
		//首次查询时默认赋值系统当天日期
		if(vHemsJyjgQueryDto.getvHemsJyjgCustom().getEnddate() != null){
			Date endDate = DateUtil.getNextDay(vHemsJyjgQueryDto.getvHemsJyjgCustom().getEnddate());
			vHemsJyjgQueryDto.getvHemsJyjgCustom().setEnddate(endDate);
		}
		int total =oracleHisService.findvhemsjyjginfocount(vHemsJyjgQueryDto);	
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		vHemsJyjgQueryDto.setPageQuery(pageQuery);
		List<VHemsJyjgCustom> list =oracleHisService.findvhemsjyjginfoList(vHemsJyjgQueryDto);
	
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}

	/**
	 * 检查报告结果集
	 * @param model
	 * @param HspBedInfCustomDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryjcbg_result")
	public @ResponseBody DataGridResultInfo queryjcbg_result( 
			VHemsJyjgQueryDto vHemsJyjgQueryDto,
			String sort,
			String order
		) throws Exception{
		//首次查询时默认赋值系统当天日期
		if(vHemsJyjgQueryDto.getvHemsJcjgCustom().getEnddate() != null){
			Date endDate = DateUtil.getNextDay(vHemsJyjgQueryDto.getvHemsJcjgCustom().getEnddate());
			vHemsJyjgQueryDto.getvHemsJcjgCustom().setEnddate(endDate);
		}
		List<VHemsJcjgCustom> list =sqlServerHisService.findVHemsJcjgList(vHemsJyjgQueryDto);
	
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(list.size());
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	/**
	* 留抢病历体温单
	*@param model
	*@return
	*@author 
	*/
	@RequestMapping("/lqbltpct")
	public String lqbltpct(Model model,String emgSeq){
		model.addAttribute("emgSeq", emgSeq);
		return "/hospital/doctor/lqbltpct";
	}
	/**
	* 留抢病历体温单获取流
	*@param model
	*@return
	*@author 
	*/
	@RequestMapping("/lqbltpctbyte")
	public @ResponseBody SubmitResultInfo lqbltpctbyte(String emgSeq) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		byte[] byt= zyyLqblService.lqbltpctbyte(emgSeq);
		Map<String, Object> map=new HashMap<String, Object>(3);
		if(byt!=null){
			BASE64Encoder encoder = new BASE64Encoder();
			String str=encoder.encode(byt);		
			map.put("str", str);
		}else{
			map.put("str", "无数据");
		}
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 跳转留抢病历护理记录列表
	 *@param model
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/lqblquerynote")
	public String lqblquerynote(Model model,String emgSeq,String moduleid) throws Exception{
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("moduleid", moduleid);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		HspObsvtfstInfCustom hspObsvtfstInfCustom=zyyLqblService.findObsvtfstByEmgSeq(emgSeq);
		model.addAttribute("cyrqDat",hspObsvtfstInfCustom.getDscgDatStr());
		model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
		return "/hospital/doctor/lqblquerynote";
	}
	/**
	 * 跳转护理记录单结果集
	 *@param hspHljldQueryDto
	 *@return
	 *@throws Exception
	 *@author liulj @date 2017年9月25日 下午6:47:26
	 */
	@RequestMapping("/queryhljld_result")
	public @ResponseBody DataGridResultInfo queryhljld_result(HspHljldInfQueryDto hspHljldInfQueryDto) throws Exception{
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//非空校验
		hspHljldInfQueryDto = hspHljldInfQueryDto!=null?hspHljldInfQueryDto:new HspHljldInfQueryDto();
		//时间加一天
		if(StringUtils.isNotNullAndEmptyByTrim(hspHljldInfQueryDto.getEnddate())){
		  hspHljldInfQueryDto.setEnddate(DateUtil.getNextDay(hspHljldInfQueryDto.getEnddate()));
		}
		//查询列表的总数
		int total = hspHljldInfService.findHljldCountandcrl(hspHljldInfQueryDto);
		PageQuery pageQuery = new PageQuery();
		int rows = total;
		int page = 1;
		pageQuery.setPageParams(total, rows, page);
		hspHljldInfQueryDto.setPageQuery(pageQuery);
		List<HspHljldInfCustom> list=hspHljldInfService.getHljldListByemgseq(hspHljldInfQueryDto);
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}

	/**
	 * 查询病情护理记录单打印信息
	 *@param bqhiSeq
	 *@return
	 *@throws Exception
	 *@author liulj @date 2017年10月19日 下午2:36:17
	 */
	@RequestMapping("findPrinInf")
	public @ResponseBody SubmitResultInfo findPrinInf(String emgSeq) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		//根据emgseq查询病人信息
		HspemginfCustom hspemginfCustom = hspHljldInfService.findemghljldByemgSeq(emgSeq);
		//获取护理记录单的信息
		HspHljldInfQueryDto hspHljldInfQueryDto=new HspHljldInfQueryDto();
		HspHljldInfCustom   hspHljldInfCustom=new HspHljldInfCustom();
		hspHljldInfCustom.setEmgSeq(emgSeq);
		hspHljldInfQueryDto.setHsphljldinfCustom(hspHljldInfCustom);
		List<HspHljldInfCustom> list=hspHljldInfService.getHljldListByemgseqandflg(hspHljldInfQueryDto);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("emg", hspemginfCustom);
		map.put("printlist", list);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	/**
	 * 跳转系统评估入院评估单
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryhlpgNote")
	//@FormToken(save=true)
	public String queryhlpgNote(Model model,String emgSeq) throws Exception {
		model.addAttribute("emgSeq", emgSeq);
		return "/hospital/doctor/hlpgNote";
	}

	/**
	 * 入院护理评估表结果集
	 * @param pysm
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryhlpgb_result")
	public @ResponseBody Map<String, Object> queryhlpgb_result(String emgSeq
			) throws Exception{
		List<Dstdictinfo> senStuCodList = systemConfigService.findDictinfoByType("SEN_STU_COD");
		List<Dstdictinfo> sqlStaCodList = systemConfigService.findDictinfoByType("CST_DSP_COD");
		List<Dstdictinfo> clbzCodList = systemConfigService.findDictinfoByType("CLBZ_COD");

		HspHlpgbQueryDto hspHlpgbQueryDto=hspHlpgbService.getHlpgbByEmgSeq(emgSeq);
		Map<String, Object> map = new HashMap<String, Object>();
		String symSitDes=hspHlpgbQueryDto.getHspemginfCustom().getSymSitDes();
		int zsFlag=0;
		if(StringUtils.isNotNullAndEmptyByTrim(symSitDes)){
			zsFlag=1;
		}
		map.put("zsFlag", zsFlag);
		map.put("hspemginfCustom", hspHlpgbQueryDto.getHspemginfCustom());
		map.put("hspHlpgbCustom", hspHlpgbQueryDto.getHspHlpgbCustom());
		map.put("senStuCodList", senStuCodList);
		map.put("sqlStaCodList", sqlStaCodList);
		map.put("clbzCodList", clbzCodList);
		return map;
	}
	
	/**
	 * 医嘱结果集
	 * @param model
	 * @param HspBedInfCustomDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querycfxx_result")
	public @ResponseBody DataGridResultInfo querycfxx_result( 
		VHemsJyjgQueryDto vHemsJyjgQueryDto,
		String sort,
		String order
		) throws Exception{
		//首次查询时默认赋值系统当天日期
		if(vHemsJyjgQueryDto.getHspDocadviceInfCustom().getEnddate() != null){
			Date endDate = DateUtil.getNextDay(vHemsJyjgQueryDto.getHspDocadviceInfCustom().getEnddate());
			vHemsJyjgQueryDto.getHspDocadviceInfCustom().setEnddate(endDate);
		}
		
		//List<HspDocadviceInfCustom> list =oracleHisService.findvhemsypxxinfoanddocadviceList(vHemsJyjgQueryDto);	
	
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		//dataGridResultInfo.setTotal(list.size());
		//填充rows
		//dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	
}
