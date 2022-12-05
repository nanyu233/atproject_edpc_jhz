package activetech.edpc.action;

import activetech.aid.service.AidService;
import activetech.base.action.View;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.edpc.pojo.domain.HspCrivelInf;
import activetech.edpc.pojo.domain.HspGraceInf;
import activetech.edpc.pojo.domain.HspXtzlInf;
import activetech.edpc.pojo.dto.*;
import activetech.edpc.service.CrfplaneService;
import activetech.edpc.service.XtService;
import activetech.external.pojo.domain.HspEcgInf;
import activetech.external.service.EsbService;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	public String toXtHomePage(){
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
		String emgSeq="";
		if (jsonObject.containsKey("emgSeq"))
			emgSeq=jsonObject.getString("emgSeq");
		ResultInfo resultInfo = xtService.getXtTimeLine(emgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 时间轴甘特图数据
	 * */
	@RequestMapping("/queryCpcTimelineGt")
	@ResponseBody
	public SubmitResultInfo queryCpcTimelineGt(@RequestBody HspTimDiffQueryDto hspTimDiffQueryDto){
		String emgSeq=hspTimDiffQueryDto.getEmgSeq();
		//获取当前病人的各个质控时间节点
		ResultInfo xtTimeLine = xtService.getXtTimeLine(emgSeq);
		Map<String, Object> sysdata = xtTimeLine.getSysdata();
		List<HspXtzlInfCustom> list = (List<HspXtzlInfCustom>) sysdata.get("list");
		//获取甘特图数据
		ResultInfo resultInfo = xtService.getTimelineGt(list,hspTimDiffQueryDto);

		return ResultUtil.createSubmitResult(resultInfo);
	}
	/**
	 * 质控时间标准查询
	 * */
	@RequestMapping("queryTimeLineCriterion")
	@ResponseBody
	public SubmitResultInfo queryTimeLineCriterion(@RequestBody HspTimDiffQueryDto hspTimDiffQueryDto)throws Exception{
		ResultInfo resultInfo = xtService.getTimeLineCriterion(hspTimDiffQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
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
		String emgSeq = "";
		if(map!=null){
			emgSeq = (String) map.get("emgSeq");
			resultInfo = xtService.getCpcPatientRouteInfoByEmgSeq(emgSeq);
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
	public String toXtxqPage(String emgSeq,String wayTyp, String regSeq ,Model model){
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("wayTyp", wayTyp);
		model.addAttribute("regSeq", regSeq);
		return View.toEDPC("/cpc/xtxq");
	}
	
	
	/**
	 * 
	 * @param emgSeq
	 * @param model
	 * @return
	 */
	@RequestMapping("/toXthzListPage")
	public String toXthzListPage(Model model){
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
	
	/**
	 * 胸痛登记页面提交
	 * @param xtzlInfs
	 * @param emgSeq
	 * @param activeUser
	 * @return
	 */
	@RequestMapping("/xtPatietSubmit")
	@ResponseBody
	public SubmitResultInfo xtPatietSubmit(@RequestBody XtHspEmgInfQueryDto xtHspEmgInfQueryDto,ActiveUser activeUser){
		ResultInfo resultInfo = xtService.xtPatietSubmitBatch(
				xtHspEmgInfQueryDto.getXtzlInfs(), xtHspEmgInfQueryDto.getEmgSeq(), activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 胸痛登记页面基本信息提交
	 * @param hspDbzlBasQueryDto
	 * @param activeUser
	 * @return
	 */
	@RequestMapping("/xtPatietBasicInfSubmit")
	@ResponseBody
	public SubmitResultInfo xtPatietBasicInfSubmit(@RequestBody HspDbzlBasQueryDto hspDbzlBasQueryDto, ActiveUser activeUser){
		ResultInfo resultInfo = xtService.xtPatietBasicInfSubmit(hspDbzlBasQueryDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	
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
		
		String emgSeq = "";
		String wayTyp = "";
		if(map.containsKey("emgSeq")){
			emgSeq = (String) map.get("emgSeq");
		}
		if(map.containsKey("wayTyp")){
			wayTyp = (String) map.get("wayTyp");
		}
		
		ResultInfo resultInfo = esbService.getJyjcInfo(emgSeq,wayTyp);
		
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
		
		String emgSeq = "";
		String wayTyp = "";
		if(map.containsKey("emgSeq")){
			emgSeq = (String) map.get("emgSeq");
		}
		
		if(map.containsKey("wayTyp")){
			wayTyp = (String) map.get("wayTyp");
		}
		
		ResultInfo resultInfo = esbService.getECGInfo(emgSeq,wayTyp);
		
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 更新心电图信息
	 * @param hspEcgInf
	 * @param activeUser
	 * @return
	 */
	@RequestMapping("/addOrUpdateEcgInf")
	@ResponseBody
	public SubmitResultInfo addOrUpdateEcgInf(@RequestBody HspEcgInf hspEcgInf, ActiveUser activeUser){
		ResultInfo resultInfo = esbService.addOrUpdateEcgInf(hspEcgInf, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}


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
	public SubmitResultInfo addFzxg(@RequestBody HspXtzlInfCustom hspXtzlInfCustom,ActiveUser activeUser){
		
		ResultInfo resultInfo = xtService.addFzxg(hspXtzlInfCustom, activeUser);
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 删除犯罪血管
	 * @param hspXtzlInf
	 * @return
	 */
	@RequestMapping("/delFzxg")
	@ResponseBody
	public SubmitResultInfo delFzxg(@RequestBody HspXtzlInf hspXtzlInf){
		
		ResultInfo resultInfo = xtService.delFzxg(hspXtzlInf);
		
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
		return View.toEDPC("cpc/toXtTimeLineSetup");
	}


}
