package activetech.edpc.action;

import activetech.aid.service.AidService;
import activetech.base.action.View;
import activetech.base.dbconfig.ApplicationConfig;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.edpc.pojo.domain.HspCrivelInf;
import activetech.edpc.pojo.domain.HspGraceInf;
import activetech.edpc.pojo.domain.HspZlInf;
import activetech.edpc.pojo.dto.*;
import activetech.edpc.service.CrfplaneService;
import activetech.edpc.service.XtService;
import activetech.external.pojo.domain.HspEcgInf;
import activetech.external.service.EsbService;
import activetech.util.DateUtil;
import activetech.util.ExcelExportSXXSSF;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

/**
 * 胸痛中心控制器
 * @author ROG
 *
 */
@Controller
@RequestMapping("/cpc")
public class XtAction {
	
	@Autowired
	private XtService xtService;
	
	@Autowired
	private EsbService esbService;
	
	@Autowired
	private AidService aidService;

	@Autowired
	private CrfplaneService cpcCrfplaneService;


	/**
	 * 跳转胸痛中心首页
	 * @return
	 */
	@RequestMapping("/toCpcHomePage")
	public String toCpcHomePage(){
		return View.toEDPC("/cpc/cpcHome");
	}
	
	/**
	 * 跳转胸痛中心首页
	 * @return
	 */
	@RequestMapping("/toXtHomePage")
	public String toXtHomePage(String emgSeq,String regSeq,String cstNam,Model model){
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("regSeq", regSeq);
		model.addAttribute("cstNam", cstNam);
		return View.toEDPC("/cpc/xtHome2");
	}
	
	/**
	 * 跳转胸痛中心首页
	 * @return
	 */
	@RequestMapping("/toFuvPage")
	public String toFuvPage(){
		return View.toEDPC("/followup/queryfuv");
	}
	
	/**
	 * 跳转胸痛中心流程数据打印页 | 改编辑器页面
	 * @return
	 */
	@RequestMapping("/toXtzlPrintPage")
	public String toXtzlPrintPage(String emgSeq,String regSeq,String cstNam,String tempNo,Model model){
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("regSeq", regSeq);
		model.addAttribute("cstNam", cstNam);
		//前端传来的编号，也可以采用配置来传递编号
		model.addAttribute("tempNo", tempNo);
		return View.toEDPC("/cpc/xthzdjEditor");
//		return View.toEDPC("/cpc/xthzdj");
	}
	
	/**
	 * 跳转胸痛中心流程数据打印页
	 * @return
	 */
	@RequestMapping("/toXtzlTimeLinePage")
	public String toXtzlTimeLinePage(String emgSeq,Model model){
		model.addAttribute("emgSeq", emgSeq);
		return View.toEDPC("/cpc/xtTimeLine");
	}

	/**
	 * 跳转胸痛急救时间轴页面
	 * @return
	 */
	@RequestMapping("/toCpcTimeline")
	public String toCpcTimeline(String emgSeq,String wayTyp, String regSeq, Model model){
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("wayTyp", wayTyp);
		model.addAttribute("regSeq", regSeq);
		return View.toEDPC("/cpc/cpcTimeline");
	}
	
	/**
	 * 跳转Grace评分页面
	 * @return
	 */
	@RequestMapping("/toGracePage")
	public String toGracePage(String emgSeq,String wayTyp,Model model){
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("wayTyp", wayTyp);
		return View.toEDPC("/cpc/grace");
	}
	
	
	/**
	 * 跳转检验页面
	 * @return
	 */
	@RequestMapping("/toJyPage")
	public String toJyPage(String emgSeq,String wayTyp,Model model){
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("wayTyp", wayTyp);
		return View.toEDPC("/cpc/jy");
	}
	
	/**
	 * 跳转检查页面
	 * @return
	 */
	@RequestMapping("/toJcPage")
	public String toJcPage(String emgSeq,String wayTyp,Model model){
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("wayTyp", wayTyp);
		return View.toEDPC("/cpc/jc");
	}
	
	
	/**
	 * 跳转初始药物页面
	 * @return
	 */
	@RequestMapping("/toCsywPage")
	public String toCsywPage(String emgSeq,String wayTyp,Model model){
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("wayTyp", wayTyp);
		return View.toEDPC("/cpc/csyw");
	}

	/**
	 *跳转新增院内/绕行发病患者页面
	 * @return
	 */
	@RequestMapping("/toadd")
	public String toadd(String emgSeq,String wayTyp,Model model){
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("wayTyp", wayTyp);
		return View.toEDPC("/cpc/addNewPatient");
	}
	
	
	/**
	 * 获取胸痛急救时间轴数据
	 * @return SubmitResultInfo
	 */
	@RequestMapping("/queryCpcTimeline")
	@ResponseBody
	public SubmitResultInfo queryCpcTimeline(@RequestBody JSONObject jsonObject){
		//急救时间轴数据 - 和胸痛中心的时间轴数据公用同一个方法
		String regSeq="";
		if (jsonObject.containsKey("regSeq"))
			regSeq=jsonObject.getString("regSeq");
		ResultInfo resultInfo = xtService.getXtTimeLine(regSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 时间轴甘特图数据
	 * */
	@RequestMapping("/queryCpcTimelineGt")
	@ResponseBody
	public SubmitResultInfo queryCpcTimelineGt(@RequestBody HspTimDiffQueryDto hspTimDiffQueryDto){
		String regSeq=hspTimDiffQueryDto.getRegSeq();
		//获取当前病人的各个质控时间节点
		ResultInfo xtTimeLine = xtService.getXtTimeLine(regSeq);
		Map<String, Object> sysdata = xtTimeLine.getSysdata();
		List<HspZlInfCustom> list = (List<HspZlInfCustom>) sysdata.get("list");
		//获取甘特图数据
		ResultInfo resultInfo = xtService.getTimelineGt(list,hspTimDiffQueryDto);

		return ResultUtil.createSubmitResult(resultInfo);
	}
	/**
	 * 质控时间标准查询
	 * */
	@RequestMapping("/queryTimeLineCriterion")
	@ResponseBody
	public DataGridResultInfo  queryTimeLineCriterion(HspTimDiffQueryDto hspTimDiffQueryDto)throws Exception{
		DataGridResultInfo dataGridResultInfo = xtService.getTimeLineCriterion(hspTimDiffQueryDto);
		return dataGridResultInfo;
	}
	/**
	 * 质控时间标准修改
	 * */
	@RequestMapping("/updateTimeLineCriterion")
	@ResponseBody
	public SubmitResultInfo updateTimeLineCriterion(@RequestBody HspTimDiffQueryDto hspTimDiffQueryDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = xtService.updateTimeLineCriterion(hspTimDiffQueryDto,activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	/**
	 * 跳转质控时间标准查询历史数据
	 * */
	@RequestMapping("/toQCHistory")
	public String toQCHistory(Model model){

		return View.toEDPC("/cpc/qchistory");
	}
	/**
	 * 质控时间标准查询历史数据
	 * */
	@RequestMapping("/queryTimeLineHis")
	@ResponseBody
	public DataGridResultInfo queryTimeLineHis(HspTimDiffQueryDto hspTimDiffQueryDto)throws Exception{
		DataGridResultInfo dataGridResultInfo = xtService.queryTimeLineHis(hspTimDiffQueryDto);
		return dataGridResultInfo;
	}


	/**
	 * 获取最近1天的胸痛患者列表
	 * @return
	 */
	@RequestMapping("/getCpcPatientListInfo")
	@ResponseBody
	public DataGridResultInfo getCpcPatientListInfo(QueryDto queryDto,ActiveUser activeUser){
		queryDto.setHspAra(activeUser.getHospitalCategory());
		int total = xtService.getCpcPatientInfoListCount(queryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, queryDto.getRows(), queryDto.getPage());
		queryDto.setPageQuery(pageQuery);
		List<HspDbzlBasCustom> list =xtService.getCpcPatientInfoListByPage(queryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}

	/**
	 * 根据病案号获取该胸痛患者的路径的点的集合
	 * @return
	 */
	@RequestMapping("/getCpcPatientRouteInfoByEmgSeq")
	@ResponseBody
	public SubmitResultInfo getCpcPatientRouteInfoByEmgSeq(@RequestBody(required=false) Map<String,Object> map){
		ResultInfo resultInfo = null;  
		String regSeq = "";
		if(map!=null){
			regSeq = (String) map.get("regSeq");
			resultInfo = xtService.getCpcPatientRouteInfoByEmgSeq(regSeq);
		}else{
			resultInfo = ResultUtil.createWarning(Config.MESSAGE, 901, null);
		}
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	@RequestMapping("/getHspXtzlInfoByEmgSeq")
	@ResponseBody
	public SubmitResultInfo getHspXtzlInfoByEmgSeq(@RequestBody(required=false) Map<String,Object> map){
		ResultInfo resultInfo = null;
		String emgSeq = "";
		if(map!=null){
			emgSeq = (String) map.get("emgSeq");
			resultInfo = xtService.getNodeInfoByEmgSeq(emgSeq, null);
		}else{
			resultInfo = ResultUtil.createWarning(Config.MESSAGE, 901, null);
		}
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	/**
	 * 跳转心电图
	 * @return
	 */
	@RequestMapping("/toEcgPage")
	public String toEcgPage(String emgSeq,String wayTyp,Model model){
		// 图片信息
		/*
		DstarchivesExample example = new DstarchivesExample();
		DstarchivesExample.Criteria criteria = example.createCriteria();
		criteria.andRefIdEqualTo(emgSeq);
		criteria.andFileTypeEqualTo("ecg");
		List<Dstarchives> picList = dstarchivesMapper.selectByExample(example);
		Dstarchives dstarchives = null;
		String ecgPath = "export/";
		if(picList.size()>0){
			dstarchives = picList.get(0);
			ecgPath += "ecg/"+dstarchives.getFileName();
		}else{
			ecgPath = null;
		}
		
		model.addAttribute("ecgPath",ecgPath);
		*/
		model.addAttribute("wayTyp",wayTyp);
		model.addAttribute("emgSeq",emgSeq);
		return View.toEDPC("/cpc/ecg");
	}
	
	/**
	 * 获取心电图数据
	 * @param paramMap
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/getEcgDataByEcgSeq")
    @ResponseBody
    public SubmitResultInfo getEcgData(@RequestBody(required=false) Map<String, Object> paramMap) throws IOException {
		
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        List<HspEcg> hspEcgList = null;
        String filePath = "/home/hems/ecg/CM_2206220000.dat";
//      String filePath = "C:\\Users\\ROG\\Desktop\\web前端展示心电图\\ecg\\CM_2206220000.dat";
        
        byte[] buf = new byte[4];

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filePath);

            fis.read(buf);

            // 每导联数据量，最后有100个16位的0填充
            int length = bytes2Int(buf) + 100;

            // 根据公式推导出剩下字节数为4+12*2*(length)

            int total = 12 * 2 * (length);

            System.out.println("total=" + total);

            // 读取剩下的字节

            byte[] buff = new byte[total];

            fis.read(buff);
            
            hspEcgList = new ArrayList<>();

            for (int i = 0; i < length; i++) {
                HspEcg hspEcg = new HspEcg();
                hspEcg.setC1(new BigDecimal((short) (((buff[1 + i * 24] << 8) | buff[i * 24] & 0xff)) * 5.5 / 2048).setScale(3, BigDecimal.ROUND_CEILING));
                hspEcg.setC2(new BigDecimal((short) (((buff[3 + i * 24] << 8) | buff[2 + i * 24] & 0xff)) * 5.5 / 2048).setScale(3, BigDecimal.ROUND_CEILING));
                hspEcg.setV1(new BigDecimal((short) (((buff[5 + i * 24] << 8) | buff[4 + i * 24] & 0xff)) * 5.5 / 2048).setScale(3, BigDecimal.ROUND_CEILING));
                hspEcg.setV2(new BigDecimal((short) (((buff[7 + i * 24] << 8) | buff[6 + i * 24] & 0xff)) * 5.5 / 2048).setScale(3, BigDecimal.ROUND_CEILING));
                hspEcg.setV3(new BigDecimal((short) (((buff[9 + i * 24] << 8) | buff[8 + i * 24] & 0xff)) * 5.5 / 2048).setScale(3, BigDecimal.ROUND_CEILING));
                hspEcg.setV4(new BigDecimal((short) (((buff[11 + i * 24] << 8) | buff[10 + i * 24] & 0xff)) * 5.5 / 2048).setScale(3, BigDecimal.ROUND_CEILING));
                hspEcg.setV5(new BigDecimal((short) (((buff[13 + i * 24] << 8) | buff[12 + i * 24] & 0xff)) * 5.5 / 2048).setScale(3, BigDecimal.ROUND_CEILING));
                hspEcg.setV6(new BigDecimal((short) (((buff[15 + i * 24] << 8) | buff[14 + i * 24] & 0xff)) * 5.5 / 2048).setScale(3, BigDecimal.ROUND_CEILING));
                hspEcg.setC3(new BigDecimal((short) (((buff[17 + i * 24] << 8) | buff[16 + i * 24] & 0xff)) * 5.5 / 2048).setScale(3, BigDecimal.ROUND_CEILING));
                hspEcg.setAvr(new BigDecimal((short) (((buff[19 + i * 24] << 8) | buff[18 + i * 24] & 0xff)) * 5.5 / 2048).setScale(3, BigDecimal.ROUND_CEILING));
                hspEcg.setAvl(new BigDecimal((short) (((buff[21 + i * 24] << 8) | buff[20 + i * 24] & 0xff)) * 5.5 / 2048).setScale(3, BigDecimal.ROUND_CEILING));
                hspEcg.setAvf(new BigDecimal((short) (((buff[23 + i * 24] << 8) | buff[22 + i * 24] & 0xff)) * 5.5 / 2048).setScale(3, BigDecimal.ROUND_CEILING));
                hspEcgList.add(hspEcg);
            }
            
            Map<String,Object> map = new HashMap<>();
            map.put("list", hspEcgList);
            resultInfo.setSysdata(map);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return ResultUtil.createSubmitResult(resultInfo);
    }
	
	public static int bytes2Int(byte[] bytes) {
        //如果不与0xff进行按位与操作，转换结果将出错，有兴趣的同学可以试一下。

        int int1 = bytes[0] & 0xff;
        int int2 = (bytes[1] & 0xff) << 8;
        int int3 = (bytes[2] & 0xff) << 16;
        int int4 = (bytes[3] & 0xff) << 24;

        return int1 | int2 | int3 | int4;
    }
	
	
	/**
	 * 
	 * @param map
	 * @return
	 */
	@RequestMapping("/getNodeInfoByEmgSeq")
	@ResponseBody
	public SubmitResultInfo getNodeInfoByEmgSeq(@RequestBody(required=false) Map<String,Object> map){
		String emgSeq = "";
		String nodeId= "";
		if(map!=null){ 
			emgSeq = (String) map.get("emgSeq");
			nodeId = (String) map.get("nodeId");
		}
		ResultInfo resultInfo = xtService.getNodeInfoByEmgSeq(emgSeq,nodeId);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 
	 * @param emgSeq
	 * @param model
	 * @return
	 */
	@RequestMapping("/toXtxqPage")
	public String toXtxqPage(String emgSeq,String wayTyp, String regSeq,String cstNam,Model model){
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("wayTyp", wayTyp);
		model.addAttribute("regSeq", regSeq);
		model.addAttribute("cstNam", cstNam);
		return View.toEDPC("/cpc/xtxq");
	}
	/**
	 *
	 * @param emgSeq
	 * @param model
	 * @return
	 */
	@RequestMapping("/toXtxqList")
	public String toXtxqList(String emgSeq,String wayTyp, String regSeq,String cstNam,Model model){
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("wayTyp", wayTyp);
		model.addAttribute("regSeq", regSeq);
		model.addAttribute("cstNam", cstNam);
		return View.toEDPC("/cpc/xthz");
	}
	/**
	 *
	 * @param emgSeq
	 * @param model
	 * @return
	 */
	@RequestMapping("/toFollowUpManagement")
	public String toFollowUpManagement(String emgSeq,String wayTyp, String regSeq,String cstNam,Model model){
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("wayTyp", wayTyp);
		model.addAttribute("regSeq", regSeq);
		model.addAttribute("cstNam", cstNam);
		return View.toEDPC("/cpc/followUpManagement");
	}
	/**
	 *
	 * @param emgSeq
	 * @param model
	 * @return
	 */
	@RequestMapping("/toGraceSco")
	public String toGraceSco(String emgSeq,String wayTyp, String regSeq,String cstNam,Model model){
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("wayTyp", wayTyp);
		model.addAttribute("regSeq", regSeq);
		model.addAttribute("cstNam", cstNam);
		return View.toEDPC("/cpc/graceSco");
	}
	/**
	 * 
	 * @param emgSeq
	 * @param model
	 * @return
	 */
	@RequestMapping("/toXthzListPage")
	public String toXthzListPage(Model model, String moduleid){
		model.addAttribute("moduleid", moduleid);
		return View.toEDPC("/cpc/xthzList");
	}
	
	/**
	 * 根据busStep,emgNo获取数据
	 * @param emgSeq
	 * @param busStep
	 * @return
	 */
	@RequestMapping("/getXtPatient")
	@ResponseBody
	public SubmitResultInfo getXtPatient(@RequestBody XtHspEmgInfQueryDto xtHspEmgInfQueryDto){
		ResultInfo resultInfo = xtService.findXtPatientWithCod(xtHspEmgInfQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
//	/**
//	 * 胸痛登记页面提交
//	 * @param xtzlInfs
//	 * @param emgSeq
//	 * @param activeUser
//	 * @return
//	 */
//	@RequestMapping("/xtPatietSubmit")
//	@ResponseBody
//	public SubmitResultInfo xtPatietSubmit(@RequestBody XtHspEmgInfQueryDto xtHspEmgInfQueryDto,ActiveUser activeUser){
//		ResultInfo resultInfo = xtService.xtPatietSubmitBatch(
//				xtHspEmgInfQueryDto.getXtzlInfs(), xtHspEmgInfQueryDto.getEmgSeq(), xtHspEmgInfQueryDto.getRegSeq(), activeUser);
//		return ResultUtil.createSubmitResult(resultInfo);
//	}
//
//	/**
//	 * 胸痛登记页面基本信息提交
//	 * @param hspDbzlBasQueryDto
//	 * @param activeUser
//	 * @return
//	 */
//	@RequestMapping("/xtPatietBasicInfSubmit")
//	@ResponseBody
//	public SubmitResultInfo xtPatietBasicInfSubmit(@RequestBody HspDbzlBasQueryDto hspDbzlBasQueryDto, ActiveUser activeUser){
//		ResultInfo resultInfo = xtService.xtPatietBasicInfSubmit(hspDbzlBasQueryDto, activeUser);
//		return ResultUtil.createSubmitResult(resultInfo);
//	}

	
	/**
	 * 获取胸痛列表
	 * @return
	 */
	@RequestMapping("/getXtPatientList")
	@ResponseBody
	public DataGridResultInfo getXtPatientList(HspDbzlBasQueryDto hspDbzlBasQueryDto,ActiveUser activeUser){
		HspDbzlBasCustom hspDbzlBasCustom=new HspDbzlBasCustom();
		hspDbzlBasCustom.setHspAra(activeUser.getHospitalCategory());
		hspDbzlBasQueryDto.setHspDbzlBasCustom(hspDbzlBasCustom);
		DataGridResultInfo dataGridResultInfo = xtService.getXtPatientList(hspDbzlBasQueryDto);
		return dataGridResultInfo;
	}
	/**
	 * 查询新增院内发病患者
	 */
	@RequestMapping("/judgeNewPatient")
	@ResponseBody
	public SubmitResultInfo judgeNewPatient(String emgSeq){

		ResultInfo resultInfo = xtService.judgeNewPatient(emgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 新增院内发病患者
	 */
	@RequestMapping("/addNewPatient")
	@ResponseBody
	public SubmitResultInfo addNewPatient( HspDbzlBasQueryDto hspDbzlBasQueryDto,ActiveUser activeUser){

		ResultInfo resultInfo = xtService.addNewPatient(hspDbzlBasQueryDto,activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 获取诊疗时间线
	 * @param JSONObject emgSeq
	 * @return SubmitResultInfo
	 */
	@RequestMapping("/xtTimeLine")
	@ResponseBody
	public SubmitResultInfo xtTimeLine(@RequestBody JSONObject jsonObject){
		//急救时间轴数据 - 和胸痛中心的时间轴数据公用同一个方法
		String emgSeq="";
		if (jsonObject.containsKey("emgSeq"))
			emgSeq=jsonObject.getString("emgSeq");
		ResultInfo resultInfo = xtService.getXtTimeLine(emgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	@RequestMapping("/getHspFlowChartDef")
	@ResponseBody
	public SubmitResultInfo getHspFlowChartDef(@RequestBody(required=false) Map<String,Object> map){
		String flowType= "";
		if(map!=null){
			flowType = (String) map.get("flowType");
		}
		
		ResultInfo resultInfo = xtService.getHspFlowChartDef(flowType);
		
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 患者基础信息
	 * @param map {regSeq : ''}
	 * @return SubmitResultInfo
	 */
	@RequestMapping("/getXtPatientDetail")
	@ResponseBody
	public SubmitResultInfo getXtPatientDetail(@RequestBody(required = false) Map<String, Object> map) {
		ResultInfo resultInfo = null;
		String regSeq = "";
		if (map.containsKey("regSeq")) {
			regSeq = (String) map.get("regSeq");
		}
		resultInfo = xtService.queryHspDbzlBasinf(regSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 获取检验检查信息
	 * @param map
	 * @return
	 */
	@RequestMapping("/getJyjcInfo")
	@ResponseBody
	public SubmitResultInfo getJyjcInfo(@RequestBody(required=false) Map<String, Object> map){

		String regSeq = "";

		if(map.containsKey("regSeq")){
			regSeq = (String) map.get("regSeq");
		}
		
		ResultInfo resultInfo = esbService.getJyjcInfo(regSeq);

		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 获取心电图信息
	 * @param map
	 * @return
	 */
	@RequestMapping("/getECGInfo")
	@ResponseBody
	public SubmitResultInfo getECGInfo(@RequestBody(required=false) Map<String, Object> map){
		
		String regSeq = "";
		String wayTyp = "";
		if(map.containsKey("regSeq")){
			regSeq = (String) map.get("regSeq");
		}
		
		if(map.containsKey("wayTyp")){
			wayTyp = (String) map.get("wayTyp");
		}
		
		ResultInfo resultInfo = esbService.getECGInfo(regSeq,wayTyp);
		
		return ResultUtil.createSubmitResult(resultInfo);
	}

//	/**
//	 * 更新心电图信息
//	 * @param hspEcgInf
//	 * @param activeUser
//	 * @return
//	 */
//	@RequestMapping("/addOrUpdateEcgInf")
//	@ResponseBody
//	public SubmitResultInfo addOrUpdateEcgInf(@RequestBody HspEcgInf hspEcgInf, ActiveUser activeUser){
//		ResultInfo resultInfo = esbService.addOrUpdateEcgInf(hspEcgInf, activeUser);
//		return ResultUtil.createSubmitResult(resultInfo);
//	}

//	/**
//	 * 更新Grace信息
//	 * @param hspGraceInf
//	 * @param activeUser
//	 * @return
//	 */
//	@RequestMapping("/updateGraceInf")
//	@ResponseBody
//	public SubmitResultInfo updateGraceInf(@RequestBody HspGraceInf hspGraceInf, ActiveUser activeUser){
//		ResultInfo resultInfo = xtService.updateGraceInf(hspGraceInf, activeUser);
//		return ResultUtil.createSubmitResult(resultInfo);
//	}


	/**
	 * 获取GRACE评分信息
	 * @param hspGraceInf
	 * @return
	 */
	@RequestMapping("/getHspGraceInf")
	@ResponseBody
	public SubmitResultInfo getHspGraceInf(@RequestBody HspGraceInf hspGraceInf){
		
		ResultInfo resultInfo = xtService.getHspGraceInf(hspGraceInf);
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 新增犯罪血管
	 * @param hspXtzlInf
	 * @return
	 */
	@RequestMapping("/addFzxg")
	@ResponseBody
	public SubmitResultInfo addFzxg(@RequestBody HspZlInfCustom hspZlInfCustom,ActiveUser activeUser){
		
		ResultInfo resultInfo = xtService.addFzxg(hspZlInfCustom, activeUser);
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 删除犯罪血管
	 * @param hspXtzlInf
	 * @return
	 */
	@RequestMapping("/delFzxg")
	@ResponseBody
	public SubmitResultInfo delFzxg(@RequestBody HspZlInf hspZlInf){
		
		ResultInfo resultInfo = xtService.delFzxg(hspZlInf);
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 更新某个犯罪血管的信息
	 * @param hspCrivelInf
	 * @param activeUser
	 * @return
	 */
	@RequestMapping("/updateHspCrivelInf")
	@ResponseBody
	public SubmitResultInfo updateHspCrivelInf(@RequestBody HspCrivelInf hspCrivelInf,ActiveUser activeUser){
		
		ResultInfo resultInfo = xtService.updateHspCrivelInf(hspCrivelInf, activeUser);
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 获取手动上传的心电图信息
	 * @param hspGraceInf
	 * @return
	 */
	@RequestMapping("/getManualEcgInf")
	@ResponseBody
	public SubmitResultInfo getManualEcgInf(@RequestBody(required=false) Map<String, Object> map){
		
		String emgSeq = "";
		if(map.containsKey("emgSeq")){
			emgSeq = (String) map.get("emgSeq");
		}
		ResultInfo resultInfo = xtService.getManualEcgInf(emgSeq);
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	
	@RequestMapping("/getAidPatientByEmgSeq")
	@ResponseBody
	public SubmitResultInfo getAidPatientByEmgSeq(@RequestBody(required=false) Map<String,Object> map){
		
		String emgSeq = "";
		String wayTyp = "";
		if(map.containsKey("emgSeq")){
			emgSeq = (String) map.get("emgSeq");
		}
		if(map.containsKey("wayTyp")){
			wayTyp = (String) map.get("wayTyp");
		}
		
		ResultInfo resultInfo = xtService.getAidPatientByEmgSeq(emgSeq,wayTyp);
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	
	/**
	 * 根据emgSeq 获取分诊表的信息
	 * @param emgSeq
	 * @return
	 */
	@RequestMapping("/getHspEmgInfByEmgSeq")
	@ResponseBody
	public SubmitResultInfo getHspEmgInfByEmgSeq(@RequestBody(required=false) Map<String,Object> map){
		
		String emgSeq = "";
		String wayTyp = "";
		if(map.containsKey("emgSeq")){
			emgSeq = (String) map.get("emgSeq");
		}
		if(map.containsKey("wayTyp")){
			wayTyp = (String) map.get("wayTyp");
		}
		
		ResultInfo resultInfo = xtService.getHspEmgInfByEmgSeq(emgSeq,wayTyp);
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	
	/**
	 * 根据emgSeq 获取胸痛诊疗表的信息
	 * @param emgSeq
	 * @return
	 */
	@RequestMapping("/getHspXtzlInfByEmgSeq")
	@ResponseBody
	public SubmitResultInfo getHspXtzlInfByEmgSeq(@RequestBody(required=false) Map<String,Object> map){
		
		String emgSeq = "";
		if(map.containsKey("emgSeq")){
			emgSeq = (String) map.get("emgSeq");
		}

		ResultInfo resultInfo = xtService.getHspXtzlInfByEmgSeq(emgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 根据emgSeq 获取胸痛诊疗表的信息转换成编辑器所求格式
	 * @param jsonObject regSeq
	 * @return SubmitResultInfo
	 */
	@RequestMapping("/getHspXtzlInfByEmgSeqToEdit")
	@ResponseBody
	public SubmitResultInfo getHspXtzlInfByEmgSeqToEdit(@RequestBody JSONObject jsonObject){
		String regSeq = "";
		if (jsonObject.containsKey("regSeq"))
			regSeq = jsonObject.getString("regSeq");
		ResultInfo resultInfo = xtService.getHspXtzlInfByEmgSeqToEdit(regSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 根据emgSeq 获取胸痛诊疗表的信息
	 * @param emgSeq
	 * @return
	 */
	@RequestMapping("/queryHspXtzlInfByEmgSeq")
	@ResponseBody
	public SubmitResultInfo queryHspXtzlInfByEmgSeq(@RequestBody(required=false) Map<String,Object> map){

		String emgSeq = "";
		if(map.containsKey("emgSeq")){
			emgSeq = (String) map.get("emgSeq");
		}

		ResultInfo resultInfo = xtService.queryHspXtzlInfByEmgSeq(emgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 跳转 胸痛质控标准时间设置
	 * */
	@RequestMapping("toXtTimeLineSetup")
	public String toXtTimeLineSetup(Model model) throws Exception{
		return View.toEDPC("/cpc/toXtTimeLineSetup");
	}

	/**
	 * 导出胸痛患者列表
	 * @param hspDbzlBasQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportXtPatinets")
	public @ResponseBody SubmitResultInfo exportXtPatinets(HspDbzlBasQueryDto hspDbzlBasQueryDto) throws Exception {
		//获取虚拟目录指向实际路径
		String filePath = ApplicationConfig.getConfig().get("XNML_PATH");

		// 导出文件的前缀
		String filePrefix = "胸痛患者列表";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("患者类型");
		fieldNames.add("姓名");
		fieldNames.add("性别");
		fieldNames.add("年龄");
		fieldNames.add("发病时间");
		fieldNames.add("首次医疗接触时间");
		fieldNames.add("诊断");
		fieldNames.add("建档时间");
		fieldNames.add("审核状态");
		fieldNames.add("审核时间 ");
		fieldNames.add("审核人");
		fieldNames.add("审核意见");
		fieldNames.add("上报状态");
		fieldNames.add("上报时间");
		fieldNames.add("填报编号");
		fieldNames.add("上报信息");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("wayTyp");
		fieldCodes.add("cstNam");
		fieldCodes.add("cstSexCod");
		fieldCodes.add("cstAge");
		fieldCodes.add("fbsj");
		fieldCodes.add("scyljcsj");
		fieldCodes.add("cbzd");
		fieldCodes.add("crtTim");
		fieldCodes.add("rcdSta");
		fieldCodes.add("chkTim");
		fieldCodes.add("chkNam");
		fieldCodes.add("chkMsg");
		fieldCodes.add("smtSta");
		fieldCodes.add("smtTim");
		fieldCodes.add("smtSeq");
		fieldCodes.add("smtMsg");

		String gd ="查询范围：";
//		String startdateStr = String.valueOf(hspDbzlBasQueryDto.getStartDate());
//		gd = gd + "时间：" + startdateStr;
		String enddateStr = DateUtil.formatDateByFormat(new Date(), "yyyy-MM-dd");
		gd = gd + " 截止至 " + enddateStr;
		String hb = "胸痛患者列表";
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		// 首次查询时默认赋值系统当天日期

		DataGridResultInfo dataGridResultInfo = xtService.exportXtPatientList(hspDbzlBasQueryDto);


		@SuppressWarnings("unchecked")
		List<ReportDataResult> list = dataGridResultInfo.getRows();

		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"胸痛患者列表",
						list.size(),
						webpath//下载地址
				}));
	}

	/**
	 * 保存心电图图片
	 * @param multipartFile
	 * @param fileType
	 * @param patId
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveEcgPicSubmit")
	@ResponseBody
	public SubmitResultInfo saveFileSubmit(@RequestParam("uploadFile") MultipartFile multipartFile,
										   String fileType,
										   String patId,
										   ActiveUser activeUser) throws Exception {
		ResultInfo resultInfo = esbService.saveEcgPicSubmit(multipartFile, fileType, patId, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 胸痛上报患者数据和诊疗信息保存
	 * @param mapObject
	 * @param activeUser
	 * @return
	 */
	@RequestMapping("/xtPatietBasicInfAndZlInfSubmit")
	@ResponseBody
	public SubmitResultInfo xtPatietBasicInfAndZlInfSubmit(@RequestBody(required=false) Map<String,Object> mapObject,ActiveUser activeUser) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		if(mapObject.containsKey("hspDbzlBasCustom")){
			String json1 = JSON.toJSONString(mapObject.get("hspDbzlBasCustom"));
			HspDbzlBasCustom hspDbzlBasCustom = JSON.parseObject(json1, HspDbzlBasCustom.class);
			HspDbzlBasQueryDto hspDbzlBasQueryDto = new HspDbzlBasQueryDto();
			hspDbzlBasQueryDto.setHspDbzlBasCustom(hspDbzlBasCustom);
			xtService.xtPatietBasicInfSubmit(hspDbzlBasQueryDto, activeUser);
		}
		if(mapObject.containsKey("hspEcgInf")){
			String json2 = JSON.toJSONString(mapObject.get("hspEcgInf"));
			HspEcgInf hspEcgInf = JSON.parseObject(json2, HspEcgInf.class);
			esbService.addOrUpdateEcgInf(hspEcgInf, activeUser);
		}
		if(mapObject.containsKey("hspGraceInf")){
			String json3 = JSON.toJSONString(mapObject.get("hspGraceInf"));
			HspGraceInf hspGraceInf = JSON.parseObject(json3, HspGraceInf.class);
			xtService.updateGraceInf(hspGraceInf, activeUser);
		}
		if(mapObject.containsKey("xtzlInfs") && mapObject.containsKey("regSeq") && mapObject.containsKey("emgSeq")){
			String json4 = JSON.toJSONString(mapObject.get("xtzlInfs"));
			String regSeq = (String)mapObject.get("regSeq");
			String emgSeq = (String)mapObject.get("emgSeq");
			List<HspZlInfCustom> xtzlInfs = JSON.parseArray(json4, HspZlInfCustom.class);
			xtService.xtPatietSubmitBatch(xtzlInfs, emgSeq, regSeq, activeUser);
		}
		return ResultUtil.createSubmitResult(resultInfo);
	}

}
