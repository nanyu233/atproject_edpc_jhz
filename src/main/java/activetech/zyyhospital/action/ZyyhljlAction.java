package activetech.zyyhospital.action;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.SystemConfigService;
import activetech.basehems.service.BaseHspemgInfService;
import activetech.hospital.dao.mapper.HspSqlInfMapper;
import activetech.hospital.pojo.domain.HspEmgInf;
import activetech.hospital.pojo.domain.HspSqlInf;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.util.DateUtil;
import activetech.util.ExcelExportSXXSSF;
import activetech.util.StringUtils;
import activetech.zyyhospital.pojo.domain.HspHljldInf;
import activetech.zyyhospital.pojo.domain.HspHljldclrInf;
import activetech.zyyhospital.pojo.domain.Pdatransfusionrecord;
import activetech.zyyhospital.pojo.dto.HspHljldInfCustom;
import activetech.zyyhospital.pojo.dto.HspHljldInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspHljldcrltjInfCustom;
import activetech.zyyhospital.pojo.dto.HspHljldcrltjInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspHlpgbCustom;
import activetech.zyyhospital.pojo.dto.HspJzcspgInfCustom;
import activetech.zyyhospital.pojo.dto.PdatransfusionrecordCustom;
import activetech.zyyhospital.service.HspHljldInfService;
import activetech.zyyhospital.service.HspHlpgbService;
import activetech.zyyhospital.service.HspJzcspgInfService;
import activetech.zyyhospital.service.ScoreQueryService;
import activetech.zyyhospital.service.ZyyHspemginfService;

/**
 * 
 * <p>Title:ZyyhljlAction</p>
 * <p>Description:护理记录</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年9月25日 下午4:41:41
 *
 */
@Controller
@RequestMapping("/zjszyyhljld")
public class ZyyhljlAction {
	@Autowired
	private HspHljldInfService hspHljldInfService;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
	@Autowired
	private HspHlpgbService hspHlpgbService;
	@Autowired
	private ScoreQueryService scoreQueryService;
	@Autowired
	private HspJzcspgInfService hspJzcspgInfService;
	@Autowired
	private BaseHspemgInfService baseHspemgInfService;
	@Autowired
	private HspSqlInfMapper hspSqlInfMapper;
	
	/**
	 * 跳转护理记录列表
	 *@param model
	 *@return
	 *@throws Exception
	 *@author liulj @date 2017年9月25日 下午4:51:38
	 */
	@RequestMapping("/querynote")
	public String queryjsbrjz(Model model,String cstNam,String emgSeq,String moduleid) throws Exception{
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("cstNam", cstNam);
		return "/hzszyyhospital/hzszyynote/querynote";
	}
	
	/**
	 * 获取护理记录单列表
	 * @param hspHljldInfQueryDto
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("/queryhljld_result")
	public DataGridResultInfo queryhljld_result(HspHljldInfQueryDto hspHljldInfQueryDto, int page, int rows) throws Exception{
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//非空校验
		hspHljldInfQueryDto = hspHljldInfQueryDto!=null?hspHljldInfQueryDto:new HspHljldInfQueryDto();
		//查询列表的总数
		int total = hspHljldInfService.findHljldCountandcrl(hspHljldInfQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspHljldInfQueryDto.setPageQuery(pageQuery);
		List<HspHljldInfCustom> list=hspHljldInfService.getHljldListByemgseq(hspHljldInfQueryDto);
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
	
		return dataGridResultInfo;
	}
	/**
	 * 查询护理记录单总条数
	 *@param emgSeq
	 *@return
	 *@throws Exception
	 *@author wzl @date 2020年03月25日
	 */
	@RequestMapping("/queryHljldCount")
	public @ResponseBody int queryHljldCount(String emgSeq) throws Exception{
		HspHljldInfQueryDto hspHljldInfQueryDto = new HspHljldInfQueryDto();
	    HspHljldInfCustom hsphljldinfCustom = new HspHljldInfCustom();
		hsphljldinfCustom.setEmgSeq(emgSeq);
		hspHljldInfQueryDto.setHsphljldinfCustom(hsphljldinfCustom);
		int counts = hspHljldInfService.findHljldCount(hspHljldInfQueryDto);
        return counts;
	}
	
	
	/**
	 * 新增护理记录单跳转
	 *@param model
	 *@return
	 *@throws Exception
	 *@author liulj @date 2017年9月26日 下午2:33:29
	 */
	@RequestMapping("/addhljld")
	public String addhljld(Model model,String emgSeq,String moduleid,ActiveUser activeuser) throws Exception{
		//如果用户已做过护理记录单，则评估内容不赋值
		HspHljldInfQueryDto hspHljldInfQueryDto = new HspHljldInfQueryDto();
	    HspHljldInfCustom hsphljldinfCustom = new HspHljldInfCustom();
		hsphljldinfCustom.setEmgSeq(emgSeq);
		hspHljldInfQueryDto.setHsphljldinfCustom(hsphljldinfCustom);
		int counts = hspHljldInfService.findHljldCount(hspHljldInfQueryDto);
		
		HspHlpgbCustom arg3 = new HspHlpgbCustom();
		HspHljldInfCustom arg4 = new HspHljldInfCustom();
		
		Object bradenSeq = "";
		Object bradenSco = "";
		Object adlSeq = "";
		Object adlSco = "";
		Object nrsSeq = "";
		Object nrsSco = "";		
		Object zyfxpfSeq = "";
		Object zyfxpfSco = "";
		Object gcsSeq = "";
		Object gcsSco = "";
		Object morseSeq = "";	
		Object morseSco = "";
		if(counts == 0){
			//获取评分数据
			arg3 = hspHlpgbService.findHlpgbByEmgSeq(emgSeq); 
			arg4=scoreQueryService.findFirstScoByEmgSeq(emgSeq);
			
			if(arg3 != null){	
				nrsSco = arg3.getNrsSco()!=null?arg3.getNrsSco():"";
				gcsSco = arg3.getGcsSco()!=null?arg3.getGcsSco():"";
			}else{
				gcsSco = "";
				nrsSco = "";
			}
			if (arg4 != null) {
				bradenSeq = arg4.getBradenSeq()!=null?arg4.getBradenSeq():"";
				bradenSco = arg4.getBradenSco()!=null?arg4.getBradenSco():"";
				adlSeq = arg4.getAdlSeq()!=null?arg4.getAdlSeq():"";
				adlSco = arg4.getAdlSco()!=null?arg4.getAdlSco():"";
				nrsSeq = arg4.getNrsSeq()!=null?arg4.getNrsSeq():"";
				nrsSco = arg4.getNrsSco()!=null?arg4.getNrsSco():"";		
				zyfxpfSeq = arg4.getZyfxpfSeq()!=null?arg4.getZyfxpfSeq():"";
				zyfxpfSco = arg4.getZyfxpfSco()!=null?arg4.getZyfxpfSco():"";
				gcsSeq = arg4.getGcsSeq()!=null?arg4.getGcsSeq():"";
				gcsSco = arg4.getGcsSco()!=null?arg4.getGcsSco():"";
				morseSeq = arg4.getDdfxpgbSeq()!=null?arg4.getDdfxpgbSeq():"";
				morseSco = arg4.getMorseSco()!=null?arg4.getMorseSco():"";
			}
		}
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("crtName", activeuser.getUsrname());
		model.addAttribute("hsUsrno",activeuser.getUsrno());
		model.addAttribute("counts", counts);
		
		model.addAttribute("bradenSeq", bradenSeq);
		model.addAttribute("bradenSco", bradenSco);
		model.addAttribute("adlSeq", adlSeq);
		model.addAttribute("adlSco", adlSco);
		model.addAttribute("nrsSeq", nrsSeq);
		model.addAttribute("nrsSco", nrsSco);
		model.addAttribute("zyfxpfSeq", zyfxpfSeq);
		model.addAttribute("zyfxpfSco", zyfxpfSco);
		model.addAttribute("gcsSeq", gcsSeq);
		model.addAttribute("gcsSco", gcsSco);
		model.addAttribute("morseSeq", morseSeq);
		model.addAttribute("morseSco", morseSco);
		return "/hzszyyhospital/hzszyynote/nursenote";
	}
	/**
	 * 新增护理记录单提交
	 *@param hspHljldInfQueryDto
	 *@return
	 *@throws Exception
	 *@author liulj @date 2017年9月26日 下午4:48:06
	 */
	@RequestMapping("/addhljldsubmit")
	public @ResponseBody SubmitResultInfo addhljldsubmit(HspHljldInfQueryDto hspHljldInfQueryDto,ActiveUser activeuser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		//赋值操作人
		hspHljldInfQueryDto.getHsphljldinfCustom().setCrtNur(activeuser.getUsrno());
		hspHljldInfQueryDto.getHsphljldinfCustom().setCrtName(activeuser.getUsrname());
		hspHljldInfQueryDto.getHsphljldinfCustom().setUpNur(activeuser.getUsrno());
		hspHljldInfQueryDto.getHsphljldinfCustom().setUpName(activeuser.getUsrname());
		//赋值时间
		//hspHljldInfQueryDto.getHsphljldinfCustom().setCrtDat(new Date());
		hspHljldInfQueryDto.getHsphljldinfCustom().setUpDat(new Date());
		hspHljldInfService.addhljldsubmit(hspHljldInfQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	/**
	 * 修改护理记录单跳转
	 *@param model
	 *@param emgSeq
	 *@param moduleid
	 *@return
	 *@throws Exception
	 *@author liulj @date 2017年9月27日 上午10:26:09
	 */
	@RequestMapping("/edithljld")
	public String edithljld(Model model,String bqhiSeq,String moduleid,String emgSeq) throws Exception{
		model.addAttribute("bqhiSeq", bqhiSeq);
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("emgSeq", emgSeq);
		return "/hzszyyhospital/hzszyynote/editnote";
	}
	/**
	 * ajax根据behiSeq查询护理登记表数据
	 *@return
	 *@throws Exception
	 *@author liulj @date 2017年9月27日 上午11:48:37
	 */
	@RequestMapping("/findhljldBybehiSeq")
	public @ResponseBody SubmitResultInfo findhljldBybehiSeq(String bqhiSeq) throws Exception{
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        //获取护理记录单信息
        HspHljldInf hsphljldinf =hspHljldInfService.findHspHljldInfbyHqhiseq(bqhiSeq);
        //获取入量数据
        List<HspHljldclrInf> rllist=hspHljldInfService.findHspHljldclrInfbyHqhiseq(bqhiSeq,"0");
        //获取出量数据
        List<HspHljldclrInf> cllist=hspHljldInfService.findHspHljldclrInfbyHqhiseq(bqhiSeq,"1");
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("hsphljldinf", hsphljldinf);
        map.put("rllist", rllist);
        map.put("cllist", cllist);
        resultInfo.setSysdata(map);
        return ResultUtil.createSubmitResult(resultInfo);
	}
	/**
	 * 护理记录单ajax获取下拉列表
	 *@return
	 *@throws Exception
	 */
	@ResponseBody
	@RequestMapping("/ajaxlist")
	public SubmitResultInfo ajaxlist(String emgSeq) throws Exception{
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        Map<String, String> params = new HashMap<String, String>();
        params.put("HSPHLJLD_CL_COD", "clbaseList");
        params.put("HSPHLJLD_JCHL_COD", "jchlbaseList");
        params.put("HSPHLJLD_RL_COD", "rlbaseList");
        params.put("SEN_STU_COD", "senRctCodList");
        
		Map<String, List<Dstdictinfo>> maps = systemConfigService.findDstdictinfos(params);
		HspemginfCustom hspemginfCustom = zyyHspemginfService.findEmgInfByEmgSeq(emgSeq); 
		//如果是诊间转留抢的患者，则时间取转归为留抢时的转归时间
		if (StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getSqlSeq())) {
			HspSqlInf hspsqlinf = hspSqlInfMapper.selectByPrimaryKey(hspemginfCustom.getSqlSeq());
			if (hspsqlinf != null) {
				hspemginfCustom.setSqlDate(hspsqlinf.getSqlDat());
			}
		}
		Map<String, Object> map = new HashMap<String, Object>();
        map.putAll(maps);
        map.put("hspemginfCustom", hspemginfCustom);
        resultInfo.setSysdata(map);
        return ResultUtil.createSubmitResult(resultInfo);
	}
	/**
	 * 护理记录单修改提交
	 *@param hspHljldInfQueryDto
	 *@param activeuser
	 *@return
	 *@throws Exception
	 *@author liulj @date 2017年9月27日 下午3:09:58
	 */
	@RequestMapping("/edithljldsubmit")
	public @ResponseBody SubmitResultInfo edithljldsubmit(HspHljldInfQueryDto hspHljldInfQueryDto,ActiveUser activeuser
			) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		
		hspHljldInfService.edithljldsubmit(hspHljldInfQueryDto,activeuser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	/**
	 * 护理记录单删除提交
	 *@param bqhiSeq
	 *@return
	 *@throws Exception
	 *@author liulj @date 2017年9月27日 下午3:53:42
	 */
	@RequestMapping("/delhljldSubmit")
	public @ResponseBody SubmitResultInfo delhljldSubmit(String bqhiSeq) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspHljldInfService.delhljldSubmit(bqhiSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	@RequestMapping("/exportHljldSubmit")
	public @ResponseBody SubmitResultInfo exportHljldSubmit(HspHljldInfQueryDto hspHljldInfQueryDto) throws Exception {
		String startStr =DateUtil.formatDateByFormat(hspHljldInfQueryDto.getStartdate(), "yyyy/MM/dd");
		String endStr = DateUtil.formatDateByFormat(hspHljldInfQueryDto.getEnddate(), "yyyy/MM/dd");
		//增加一日
		if(StringUtils.isNotNullAndEmptyByTrim(hspHljldInfQueryDto.getEnddate())){
			  hspHljldInfQueryDto.setEnddate(DateUtil.getNextDay(hspHljldInfQueryDto.getEnddate()));
			}
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "hljld";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("创建时间");
		fieldNames.add("体温（℃）");
		fieldNames.add("心率(次/分)");
		fieldNames.add("呼吸(次/分)");
		fieldNames.add("血压(mmHg)");
		fieldNames.add("氧饱和度(SpO2)");
		fieldNames.add("血糖(mmol/L) ");
		fieldNames.add("意识");
		fieldNames.add("单位入量(ml)");
		fieldNames.add("单位出量(ml)");
		fieldNames.add("基础护理");
		fieldNames.add("病情观察、护理措施和效果");
		fieldNames.add("护士签名");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("crtDateStr");
		fieldCodes.add("tmpNbrFlg");
		fieldCodes.add("hrtRte");
		fieldCodes.add("breNbrFlg");
		fieldCodes.add("sbpNbrFlg");
		fieldCodes.add("xyFlg");
		fieldCodes.add("xtFlg");
		fieldCodes.add("senRctCod");
		fieldCodes.add("rl");
		fieldCodes.add("cl");
		fieldCodes.add("jchl");
		fieldCodes.add("bqgc");
		fieldCodes.add("hsusrnames");
		
		String hb = "病情护理记录单";
		String gd="查询条件："+startStr+"-" + endStr;
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);

		
		
		//非空校验
		hspHljldInfQueryDto = hspHljldInfQueryDto!=null?hspHljldInfQueryDto:new HspHljldInfQueryDto();
		List<HspHljldInfCustom> list=hspHljldInfService.getHljldListByemgseqandflg(hspHljldInfQueryDto);
		
		// 执行导出
		excelExportSXXSSF.writeDatasByObject(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"护理记录表",
						list.size(),
						webpath//下载地址
				}));
	}
	/**
	 * 查询病情护理记录单打印信息
	 *@return
	 *@throws Exception
	 *@author liulj @date 2017年10月19日 下午2:36:17
	 */
	@RequestMapping("findPrinInf")
	public @ResponseBody SubmitResultInfo findPrinInf(HspHljldInfQueryDto hspHljldInfQueryDto) throws Exception{
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        //根据emgseq查询病人信息
        HspemginfCustom hspemginf =hspHljldInfService.findemghljldByemgSeq(hspHljldInfQueryDto.getHsphljldinfCustom().getEmgSeq());
       //获取护理记录单的信息
        List<HspHljldInfCustom> list=hspHljldInfService.getHljldListByemgseqandflg(hspHljldInfQueryDto);
        
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("emg", hspemginf);
        map.put("printlist", list);
        resultInfo.setSysdata(map);
        return ResultUtil.createSubmitResult(resultInfo);
	}
	/**
	 * 出入量统计跳转
	 *@param model
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/querysumcrl")
	public String querysumcrl(Model model,String cstNam,String emgSeq,String moduleid) throws Exception{
		//根据emgseq查询病人信息,入院类型统计时,开始时间优先护理记录单第一笔时间,其次护理评估单时间,再次预检时间
        HspEmgInf hspemginf =zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
        HspHlpgbCustom hspHlpgbCustom = hspHlpgbService.findHlpgbByEmgSeq(emgSeq);
        if(StringUtils.isNotNullAndEmptyByTrim(hspHlpgbCustom.getOprDat())){
        	hspemginf.setEmgDat(hspHlpgbCustom.getOprDat()); 
        }
        HspHljldInfQueryDto hspHljldInfQueryDto = new HspHljldInfQueryDto();
        HspHljldInfCustom hspHljldInfCustom = new HspHljldInfCustom();
        hspHljldInfCustom.setEmgSeq(emgSeq);
        hspHljldInfQueryDto.setHsphljldinfCustom(hspHljldInfCustom);
        List<HspHljldInfCustom> list=hspHljldInfService.getHljldListByemgseq(hspHljldInfQueryDto);
        if(list.size()>0){
        	hspemginf.setEmgDat(list.get(0).getCrtDat());
        }
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("cstNam", cstNam);
		model.addAttribute("hspemginf", hspemginf);
		return "/hzszyyhospital/hzszyynurse/hlpgb/hlpgcrltj";
	}
	/**
	 * ajax获取出入量统计
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/sumcrl")
	public @ResponseBody SubmitResultInfo sumcrl(HttpServletResponse response,Date startDat,Date endDat,String emgSeq,String type) throws Exception{
		 ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		 List<HspHljldInfCustom> hspemginfCustomList = new ArrayList<HspHljldInfCustom>(); 
		 if(type.equals("2")){
			 hspemginfCustomList = hspHljldInfService.findemghljldByemgSeqanddateNl(startDat, endDat, emgSeq);
			 if(hspemginfCustomList!=null){
				 HspHljldInfCustom hspHljldInfCustom1 = new HspHljldInfCustom();
				 hspHljldInfCustom1.setTypecrl("0");
				 hspHljldInfCustom1.setSumcrl("");
				 HspHljldInfCustom hspHljldInfCustom2 = new HspHljldInfCustom();
				 hspHljldInfCustom2.setTypecrl("1");
				 hspHljldInfCustom2.setSumcrl("");
				 hspemginfCustomList.add(hspHljldInfCustom1);
				 hspemginfCustomList.add(hspHljldInfCustom2);
			 }
		 }else{
			 hspemginfCustomList=hspHljldInfService.findemghljldByemgSeqanddate(startDat, endDat, emgSeq);
		 }
		 Map<String, Object> map = new HashMap<String, Object>();
		 map.put("hspemginfCustomList", hspemginfCustomList);
		 resultInfo.setSysdata(map);
		 return ResultUtil.createSubmitResult(resultInfo);
		
	}
	
	
	
	@RequestMapping("/sumcrl_submit")
	public @ResponseBody SubmitResultInfo sumcrl_submit(HspHljldcrltjInfQueryDto hspHljldcrltjInfQueryDto,ActiveUser activeuser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		HspHljldcrltjInfCustom hspHljldcrltjInfCustom=hspHljldcrltjInfQueryDto.getHspHljldcrltjInfCustom();
		hspHljldInfService.addsumcrlsubmit(hspHljldcrltjInfCustom,activeuser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 出入量统计跳转
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/toVitalSigns")
	public String toVitalSigns() throws Exception{
		return "/hzszyyhospital/hzszyynote/vitalSigns";
	}
	
	@RequestMapping("/getJhyxx")
	public @ResponseBody DataGridResultInfo getJhyxx()throws Exception{
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		List<JSONObject> vitalSignsList = hspHljldInfService.getJhyxx();
		dataGridResultInfo.setRows(vitalSignsList);
		return dataGridResultInfo;
	}
	
	/**
	 * 护理记录单转运风险评分表提交
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/subZyfxpfSco")
	public @ResponseBody SubmitResultInfo addZyfxpfSco(HspHljldInfQueryDto hspHljldInfQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String zyfxpg=hspHljldInfService.submitZyfxpfScore(hspHljldInfQueryDto,activeUser);
		resultInfo.setMessage(zyfxpg);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	/**
	 * 护理记录单GCS评分表提交
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/subGcsSco")
	public @ResponseBody SubmitResultInfo addGcsSco(HspHljldInfQueryDto hspHljldInfQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String gcsSeq = hspHljldInfService.submitGcsSco(hspHljldInfQueryDto,activeUser);
		resultInfo.setMessage(gcsSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 护理记录单疼痛评分提交
	 * @param hspHljldInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/subNrsScore")
	public @ResponseBody SubmitResultInfo addNrscore(HspHljldInfQueryDto hspHljldInfQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String nrsSeq=hspHljldInfService.submitNrsScore(hspHljldInfQueryDto,activeUser);
		resultInfo.setMessage(nrsSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 护理记录单Morse评分提交
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/subMorseScore")
	public @ResponseBody SubmitResultInfo addMorseScore(HspHljldInfQueryDto hspHljldInfQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		String ddfxpgbSeq = hspHljldInfService.addMorseScore(hspHljldInfQueryDto,activeUser);
		resultInfo.setMessage(ddfxpgbSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 护理记录单braden评分提交
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/subBradenScore")
	public @ResponseBody SubmitResultInfo addBradenScore(HspHljldInfQueryDto hspHljldInfQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String bradenSeq=hspHljldInfService.submitBradenScore(hspHljldInfQueryDto,activeUser);
		resultInfo.setMessage(bradenSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 护理记录单adl评分提交
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/subAdlScore")
	public @ResponseBody SubmitResultInfo addAdlScore(HspHljldInfQueryDto hspHljldInfQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String adlSeq = hspHljldInfService.submitAdlScore(hspHljldInfQueryDto,activeUser);
		resultInfo.setMessage(adlSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 患者会诊列表跳转
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/toPatientConsultationPage")
	public String toPatientConsultationPage() throws Exception{
		return "/hzszyyhospital/hzszyynote/queryhzjl";
	}
	
	
	/**
	 * 病情护理记录单医嘱数据导入页面跳转
	 * @param model
	 * @param emgSeq
	 * @param valName 需要赋值的父页面的id
	 * @return
	 */
	@RequestMapping(value = "/to_cfxxInfo")
	public String to_cfxxInfo(Model model,String emgSeq, String valName) {
		model.addAttribute("emgSeq",emgSeq);
		model.addAttribute("valName",valName);
		return "/hzszyyhospital/hzszyynote/drugDocAdvice";
	}
	

	
	/**
	 * 导入入院护理评估表ajax
	 *@return
	 *@throws Exception
	 */
	@RequestMapping(value  = "/impRyhlpgb")
	public @ResponseBody SubmitResultInfo impRyhlpgb(String emgSeq,String pgdType) throws Exception{
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, Object> map = new HashMap<String, Object>();

        if(StringUtils.isNotNullAndEmptyByTrim(pgdType) && "0".equals(pgdType)){
            HspHlpgbCustom hspHlpgbCustom = hspHlpgbService.findHlpgbByEmgSeq(emgSeq); 
    		if(hspHlpgbCustom != null){
    			hspHlpgbCustom.setXy(hspHlpgbCustom.getOxyNbr());
    			hspHlpgbCustom.setXt(hspHlpgbCustom.getPbgNbr());
    			hspHlpgbCustom.setXtFlg(hspHlpgbCustom.getPbgNbrFlg());
    		}
    		map.put("hspHlpgbCustom", hspHlpgbCustom);
        }else{
        	HspJzcspgInfCustom hspJzcspgInfCustom = hspJzcspgInfService.findJzcsrypgbByEmgSeq(emgSeq);
        	if(hspJzcspgInfCustom != null){
        		hspJzcspgInfCustom.setXy(hspJzcspgInfCustom.getOxyNbr());
        		hspJzcspgInfCustom.setXt(hspJzcspgInfCustom.getPbgNbr());
        		hspJzcspgInfCustom.setXtFlg(hspJzcspgInfCustom.getPbgNbrFlg());
        	}
        	map.put("hspJzcspgInfCustom", hspJzcspgInfCustom);
        }

		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 导入输血记录按钮跳转
	 *@param model
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/toPdatransfusionrecordPage")
	public String toPdatransfusionrecordPage(Model model,String emgSeq) throws Exception{
		HspemginfCustom  hspemginfCustom = baseHspemgInfService.findHspemginfCustom(emgSeq);
		if(!hspemginfCustom.getFirstsqlseq().equals(hspemginfCustom.getSqlSeq())){
			model.addAttribute("zgsjDat",DateUtil.formatDateByFormat(hspemginfCustom.getSqlDate(), "yyyy/MM/dd HH:mm:ss"));
		}
		model.addAttribute("emgSeq", emgSeq);
		return "/hzszyyhospital/hzszyynote/transfusionRecord";
	}
	
	/**
	 * 查询输血记录结果集
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/queryPdatransfusionrecord_result")
	public @ResponseBody DataGridResultInfo queryPdatransfusionrecord_result(HspHljldInfQueryDto hspHljldInfQueryDto) throws Exception{
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//非空校验
		hspHljldInfQueryDto = hspHljldInfQueryDto!=null?hspHljldInfQueryDto:new HspHljldInfQueryDto();
		List<Pdatransfusionrecord> pdatransfusionrecordList = new ArrayList<Pdatransfusionrecord>();
		if (hspHljldInfQueryDto.getPdatransfusionrecordCustom() != null) {
			PdatransfusionrecordCustom pdatransfusionrecordCustom = hspHljldInfQueryDto.getPdatransfusionrecordCustom();
			//时间加一天
			if(StringUtils.isNotNullAndEmptyByTrim(pdatransfusionrecordCustom.getEnddate())){
				pdatransfusionrecordCustom.setEnddate(DateUtil.getNextDay(pdatransfusionrecordCustom.getEnddate()));
			}
			if (StringUtils.isNotNullAndEmptyByTrim(pdatransfusionrecordCustom.getOutpatientid())) {
				pdatransfusionrecordList = hspHljldInfService.findPdatransfusionrecordList(hspHljldInfQueryDto);
			}
		}	
		//填充rows
		dataGridResultInfo.setRows(pdatransfusionrecordList);
		return dataGridResultInfo;
	}
	
	
	/**
	 * 导入护理评估表评分
	 * @param emgSeq
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value ="/getScore")
	public SubmitResultInfo getScore(String emgSeq,ActiveUser activeUser) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			HspHlpgbCustom hspHlpgbCustom = hspHljldInfService.getScore(emgSeq,activeUser);
			map.put("hspHlpgbCustom", hspHlpgbCustom);
		} catch (Exception e) {
			e.printStackTrace();
			resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, null);
		}
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
}
