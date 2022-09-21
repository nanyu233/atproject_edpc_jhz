package activetech.edpc.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.edpc.service.EDPCReportService;

@Controller
@RequestMapping("/home")
public class XtHomePageAction {
	
	@Autowired
	private EDPCReportService eDPCReportService;
	
	
	
	/**
	 * 诊断统计
	 * @return
	 */
	@RequestMapping("/getZdtjData")
	@ResponseBody
	public SubmitResultInfo getZdtjData(){
		
		ResultInfo resultInfo = eDPCReportService.getZdtjData();
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	/**
	 * 病例数量统计
	 * @return
	 */
	@RequestMapping("/getBlsltjData")
	@ResponseBody
	public SubmitResultInfo getBlsltjData(){
		
		ResultInfo resultInfo = eDPCReportService.getBlsltjData();
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	/**
	 * 来院方式统计
	 * @return
	 */
	@RequestMapping("/getLyfstjData")
	@ResponseBody
	public SubmitResultInfo getLyfstjData(){
		
		ResultInfo resultInfo = eDPCReportService.getLyfstjData();
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	/**
	 * 转归情况统计
	 * @return
	 */
	@RequestMapping("/getZgqktjData")
	@ResponseBody
	public SubmitResultInfo getZgqktjData(){
		
		ResultInfo resultInfo = eDPCReportService.getZgqktjData();
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	
	/**
	 * 关键质控统计
	 * @return
	 */
	@RequestMapping("/getGjzktjData")
	@ResponseBody
	public SubmitResultInfo getGjzktjData(){
		
		ResultInfo resultInfo = eDPCReportService.getGjzktjData();
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	@RequestMapping("/getWlyyData")
	@ResponseBody
	public SubmitResultInfo getWlyyData(){
		
		ResultInfo resultInfo = eDPCReportService.getWlyyData();
		
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	
	
}
