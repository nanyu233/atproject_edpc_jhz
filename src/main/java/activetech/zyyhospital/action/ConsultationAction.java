package activetech.zyyhospital.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.hospital.pojo.domain.HspEmgInf;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.zyyhospital.pojo.dto.HspConsultationRecordsCustom;
import activetech.zyyhospital.pojo.dto.HspConsultationRecordsQueryDto;
import activetech.zyyhospital.service.HspConsultationRecordsService;
import activetech.zyyhospital.service.ZyyHspemginfService;

/**
 * <p>Title:ConsultationAction</p>
 * <p>Description:会诊记录</p>
 * <p>activetech</p>
 * @date 2018年1月31日
 */
@Controller
@RequestMapping("/consultation")
public class ConsultationAction {
	@Autowired
	private HspConsultationRecordsService hspConsultationRecordsService;
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
//	@Autowired
//	private ZyyLqblService zyyLqblService;
	/**
	 * 跳转会诊记录主页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryMainConsultation")
	public String queryMainConsultation(Model model,String emgSeqCr) throws Exception{
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeqCr);
		model.addAttribute("emgSeqCr", emgSeqCr);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyydoctor/consultation/queryMainConsultation";
	}
	
	/**
	 * 跳转会诊记录弹出框
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryModelConsultation")
	public String queryModelConsultation(Model model,String emgSeqCr) throws Exception{
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeqCr);
		model.addAttribute("emgSeqCr", emgSeqCr);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyydoctor/consultation/queryModelConsultation";
	}
	
	/**
	 * 跳转会诊记录页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryConsultation")
	public String queryConsultation(Model model,String emgSeqCr) throws Exception{
		model.addAttribute("emgSeqCr", emgSeqCr);
		return "/hzszyyhospital/hzszyydoctor/consultation/queryConsultation";
	}
	
	/**
	 * 会诊记录结果集
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryConsultation_result")
	public @ResponseBody DataGridResultInfo queryConsultation_result(Model model,
			HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto,
			int page,//当前页码
			int rows//每页显示个数
			) throws Exception{
		int total = hspConsultationRecordsService.findHspConsultationRecordsTotal(hspConsultationRecordsQueryDto);
		//判断是否需要分页 不等于 queryQjs 则分页
		if(!"queryQjs".equals(hspConsultationRecordsQueryDto.getHspConsultationRecordsCustom().getPageName())) {
			PageQuery pageQuery = new PageQuery();
			pageQuery.setPageParams(total, rows, page);
			hspConsultationRecordsQueryDto.setPageQuery(pageQuery);
		}
		List<HspConsultationRecordsCustom> list = hspConsultationRecordsService.findHspConsultationRecordsList(hspConsultationRecordsQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(total);
		return dataGridResultInfo;
	}
	
	/**
	 * 跳转新增或修改界面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toAddOrEdit")
	public String toAddOrEdit(Model model,
			HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto) throws Exception{
		HspConsultationRecordsCustom hspConsultationRecordsCustom = null;
		String emgSeqCr = hspConsultationRecordsQueryDto.getHspConsultationRecordsCustom().getEmgSeqCr();
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeqCr);
		if(null != hspConsultationRecordsQueryDto.getHspConsultationRecordsCustom().getConsultationRecordsSeq()){
			hspConsultationRecordsCustom = hspConsultationRecordsService.findHspConsultationRecords(hspConsultationRecordsQueryDto);
		}
//		HspLqblInfCustom hspLqblInfCustom = zyyLqblService.findLqblForDisease(emgSeqCr);
		model.addAttribute("hspConsultationRecordsCustom", hspConsultationRecordsCustom);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		model.addAttribute("recordFlag", hspConsultationRecordsQueryDto.getRecordFlag());
//		model.addAttribute("hspLqblInfCustom", hspLqblInfCustom);
		return "/hzszyyhospital/hzszyydoctor/consultation/updateConsultation";
	}
	
	/**
	 * 新增或修改提交
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addOrEditSubmit")
	public @ResponseBody SubmitResultInfo addOrEditSubmit(Model model,ActiveUser activeUser,
			HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String onlySeq = hspConsultationRecordsService.saveOrUpdate(hspConsultationRecordsQueryDto,activeUser);
		Map<String, Object> sysdata = new HashMap<String, Object>();
		sysdata.put("onlySeq", onlySeq);
		resultInfo.setSysdata(sysdata);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 会诊删除提交
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delConsultation")
	public @ResponseBody SubmitResultInfo consultation(Model model,String consultationRecordsSeq) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspConsultationRecordsService.deleteConsultation(consultationRecordsSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	
	
	
	
	
	//以下为留抢管理中的会诊登记按钮功能
	
	
	/**
	 * 跳转会诊登记
	 * @author machaofan
	 * @param model
	 * @param emgSeq
	 * @param hzType （会诊操作类型:add -新增，edit-修改，reply-会诊回复）
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/tabhzdj")
	public String tabhzdj(Model model, String emgSeq, String hzType, String conRecordsSeq,ActiveUser activeUser) throws Exception {
		model.addAttribute("hzType",hzType);
		model.addAttribute("emgSeq",emgSeq);
		model.addAttribute("conRecordsSeq",conRecordsSeq);
		model.addAttribute("username",activeUser.getUsrname());
		model.addAttribute("userno", activeUser.getUsrno());
		return "/hzszyyhospital/hzszyyqjs/tabhzdj";
	}
	
	/**
	 * 会诊登记获取数据
	 * @author machaofan
	 * @param emgSeq (预检号)
	 * @param conRecordsSeq  (会诊id)
	 * @return
	 * @throws Exception 
	 */
	@ResponseBody
	@RequestMapping(value ="/findhzdj")
	public ResultInfo findhzdj(HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto,ActiveUser activeUser) throws Exception {
		ResultInfo resultInfo = new ResultInfo();
		Map<String,Object> map = new HashMap<String,Object>();
		
		HspConsultationRecordsCustom hspConsultationRecordsCustom = null;
		String emgSeqCr = hspConsultationRecordsQueryDto.getHspConsultationRecordsCustom().getEmgSeqCr();
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeqCr);
		if(null != hspConsultationRecordsQueryDto.getHspConsultationRecordsCustom().getConsultationRecordsSeq()){
			hspConsultationRecordsCustom = hspConsultationRecordsService.findHspConsultationRecords(hspConsultationRecordsQueryDto);
			/*//当前会诊回复为空
			if(hspConsultationRecordsCustom == null || hspConsultationRecordsCustom.getReplyDep()==null || "".equals(hspConsultationRecordsCustom.getReplyDep())) {
				//获取当前登录用户所属科室
				Dstcompctl dstcompctl=compctlService.findCompctlByComno(activeUser.getSysid());
				hspConsultationRecordsCustom.setReplyDepStr(dstcompctl.getComcname());
				hspConsultationRecordsCustom.setReplyDep(dstcompctl.getComno());
			}*/
		}
		
		map.put("hspEmgInf",hspemginfCustom);
		map.put("hspConsultationRecords",hspConsultationRecordsCustom);
		resultInfo.setSysdata(map);
		return resultInfo;
	}
	
	
	
	/**
	 * 心内科获取会诊发起时间，会诊签到时间
	 * @param dstuser
	 * @return
	 */
	@RequestMapping("/getConsulationInf")
	@ResponseBody
	public SubmitResultInfo getConsulationInf(@RequestBody HspEmgInf hspEmgInf) {
		
		ResultInfo resultInfo = hspConsultationRecordsService.getConsulationInf(hspEmgInf.getEmgSeq());
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
}
