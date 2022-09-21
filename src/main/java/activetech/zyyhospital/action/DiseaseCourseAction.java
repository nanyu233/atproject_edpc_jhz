package activetech.zyyhospital.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.annotation.FormToken;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.hospital.pojo.dto.HspJbzdInfCustom;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.service.HspCstInfService;
import activetech.zyyhospital.pojo.dto.HspDiseaseCourseCustom;
import activetech.zyyhospital.pojo.dto.HspDiseaseCourseQueryDto;
import activetech.zyyhospital.pojo.dto.HspLqblInfCustom;
import activetech.zyyhospital.pojo.dto.HspLqbljlQueryDto;
import activetech.zyyhospital.service.HspDiseaseCourseService;
import activetech.zyyhospital.service.ZyyHspemginfService;
import activetech.zyyhospital.service.ZyyLqblService;

/**
 * <p>Title:DiseaseCourseAction</p>
 * <p>Description:病程记录</p>
 * <p>activetech</p>
 * @date 2018年1月31日
 */
@Controller
@RequestMapping("/diseaseCourse")
public class DiseaseCourseAction {
	@Autowired
	private HspDiseaseCourseService hspDiseaseCourseService;
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
	@Autowired
	private HspCstInfService hspCstInfService;
	@Autowired
	private ZyyLqblService zyyLqblService;

	/**
	 * 跳转病程记录主页面二维码
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryDiseaseCourseQrcode")
	public String queryDiseaseCourseQrcode(Model model,String emgSeqDc) throws Exception{
		model.addAttribute("emgSeqDc", emgSeqDc);
		return "/hzszyyhospital/hzszyydoctor/diseaseCourse/queryDiseaseCourseQrcode";
	}
	
	/**
	 * 跳转病程记录主页面二维码
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryDiseaseCourse")
	public String querydiseaseCourse(Model model,String emgSeqDc,String type) throws Exception{
		model.addAttribute("emgSeqDc", emgSeqDc);
		model.addAttribute("type", type);
		return "/hzszyyhospital/hzszyydoctor/diseaseCourse/queryDiseaseCourse";
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
		
		model.addAttribute("hspDiseaseCourseCustom", hspDiseaseCourseCustom);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		model.addAttribute("hspLqblInfCustom", hspLqblInfCustom);
		return "/hzszyyhospital/hzszyydoctor/diseaseCourse/queryFirstDisease";
	}
	
	/**
	 * 跳转首次病程页面二维码
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryFirstDiseaseQrcode")
	public String queryFirstDiseaseQrcode(Model model,HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto) throws Exception{
		HspDiseaseCourseCustom hspDiseaseCourseCustom  = hspDiseaseCourseService.findHspDiseaseCourse(hspDiseaseCourseQueryDto);
		String emgSeqDc = hspDiseaseCourseQueryDto.getHspDiseaseCourseCustom().getEmgSeqDc();
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeqDc);
		//入院诊断中医
		List<HspJbzdInfCustom> hspJbzdInfCustomList1 = hspCstInfService.findHspJbzdInfHzzd(emgSeqDc,"2");
		HspJbzdInfCustom hspJbzdInfCustom1 = hspCstInfService.findHspJbzdInfComm(emgSeqDc,"2");
		//入院诊断西医
		List<HspJbzdInfCustom> hspJbzdInfCustomList2 = hspCstInfService.findHspJbzdInfHzzd(emgSeqDc,"1");
		HspJbzdInfCustom hspJbzdInfCustom2 = hspCstInfService.findHspJbzdInfComm(emgSeqDc,"1");

		model.addAttribute("hspDiseaseCourseCustom", hspDiseaseCourseCustom);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		model.addAttribute("hspJbzdInfCustomList1", hspJbzdInfCustomList1);
		model.addAttribute("hspJbzdInfCustom1", hspJbzdInfCustom1);
		model.addAttribute("hspJbzdInfCustomList2", hspJbzdInfCustomList2);
		model.addAttribute("hspJbzdInfCustom2", hspJbzdInfCustom2);
		return "/hzszyyhospital/hzszyydoctor/diseaseCourse/queryFirstDiseaseQrcode";
	}
	
	/**
	 * 跳转新增或修改界面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toAddOrEdit")
	public String toAddOrEdit(Model model,HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto) throws Exception{
		HspDiseaseCourseCustom hspDiseaseCourseCustom = null;
		String emgSeqDc = hspDiseaseCourseQueryDto.getHspDiseaseCourseCustom().getEmgSeqDc();
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeqDc);
		HspLqblInfCustom hspLqblInfCustom = zyyLqblService.findLqblForDisease(emgSeqDc);
		if(null != hspDiseaseCourseQueryDto.getHspDiseaseCourseCustom().getDiseaseCourseSeq()){
			hspDiseaseCourseCustom = hspDiseaseCourseService.findHspDiseaseCourse(hspDiseaseCourseQueryDto);
		}
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		model.addAttribute("hspDiseaseCourseCustom", hspDiseaseCourseCustom);
		model.addAttribute("hspLqblInfCustom", hspLqblInfCustom);
		return "/hzszyyhospital/hzszyydoctor/diseaseCourse/update"+hspDiseaseCourseQueryDto.getForwardUrl();
	}
	
	/**
	 * 删除首次病程记录
	 * @param hspLqbljlQueryDto
	 * @throws Exception
	 */
	@RequestMapping("/deleteFirstForm")
	public @ResponseBody SubmitResultInfo deleteFirstForm(String diseaseCourseSeq)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspDiseaseCourseService.deleteDiseaseCourse(diseaseCourseSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 病程结果集
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryDiseaseCourse_result")
	public @ResponseBody DataGridResultInfo queryDiseaseCourse(Model model,
			HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto,
			int page,//当前页码
			int rows//每页显示个数
			) throws Exception{
		int total = hspDiseaseCourseService.findHspDiseaseCourseTotal(hspDiseaseCourseQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspDiseaseCourseQueryDto.setPageQuery(pageQuery);
		List<HspDiseaseCourseCustom> list = hspDiseaseCourseService.findHspDiseaseCourseList(hspDiseaseCourseQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(total);
		return dataGridResultInfo;
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
		return "/hzszyyhospital/hzszyydoctor/diseaseCourse/query"+hspDiseaseCourseQueryDto.getForwardUrl();
	}
	
	/**
	 * 新增或修改提交
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addOrEditSubmit")
	public @ResponseBody SubmitResultInfo addOrEditSubmit(Model model,
			HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String onlySeq = hspDiseaseCourseService.saveOrUpdate(hspDiseaseCourseQueryDto,activeUser);
		Map<String, Object> sysdata = new HashMap<String, Object>();
		sysdata.put("onlySeq", onlySeq);
		resultInfo.setSysdata(sysdata);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 首次病程新增或修改提交
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addOrEditFirstSubmit")
	@FormToken(remove=true)
	public @ResponseBody SubmitResultInfo addOrEditFirstSubmit(Model model,HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto,
			HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspDiseaseCourseService.saveOrUpdateFirst(hspDiseaseCourseQueryDto,hspLqbljlQueryDto,activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 删除提交
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delDiseaseCourse")
	public @ResponseBody SubmitResultInfo deleteDiseaseCourse(Model model,String diseaseCourseSeq) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspDiseaseCourseService.deleteDiseaseCourse(diseaseCourseSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 为打印准备数据（病程，查房，交接班，抢救, 手术操作、输血记录）
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryAllDiseaseCourse_result")
	public @ResponseBody SubmitResultInfo queryAllDiseaseCourse_result(Model model,
			HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto,String printType
			) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		List<Object> list = hspDiseaseCourseService.findAllHspDiseaseCourseList(hspDiseaseCourseQueryDto);
		//获取打印页
		HspemginfCustom hspemginfCustom = zyyHspemginfService.findHspemginfCustom(hspDiseaseCourseQueryDto.getHspDiseaseCourseCustom().getEmgSeqDc(),printType,hspDiseaseCourseQueryDto.getStartdate(),new Date());
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("diseaseCourseList", list);
		map.put("hspemginfCustom", hspemginfCustom);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	/**
	 * 打印后操作，置打印页数，置是否打印
	 * @param model
	 * @param hspDiseaseCourseQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/afterPrint")
	public @ResponseBody SubmitResultInfo afterPrint(Model model,
			@RequestBody HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto
			) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspDiseaseCourseService.afterPrint(hspDiseaseCourseQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}
}
