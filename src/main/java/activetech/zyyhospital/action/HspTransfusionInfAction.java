package activetech.zyyhospital.action;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.zyyhospital.pojo.domain.HspTransfusionInf;
import activetech.zyyhospital.pojo.dto.HspTransfusionInfCustom;
import activetech.zyyhospital.pojo.dto.HspTransfusionInfQueryDto;
import activetech.zyyhospital.service.HspTransfusionInfService;
import activetech.zyyhospital.service.ZyyHspemginfService;

/**
 * 输血记录
 * @author machaofan
 */
@Controller
@RequestMapping("/transfusion")
public class HspTransfusionInfAction {
	
	@Autowired
	private HspTransfusionInfService hspTransfusionInfService;
	
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
	
	 /**
	  * 跳转输血记录列表页面
	  * @param model
	  * @param emgSeq
	  * @return
	 * @throws Exception 
	  */
	 @RequestMapping(value = "/toTransfusionInf")
	 public String toTransfusionInf(Model model, String emgSeq) throws Exception {
		 HspemginfCustom hspemginfCustom = zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		 model.addAttribute("emgSeq",emgSeq);
		 model.addAttribute("hspemginfCustom",hspemginfCustom);
		 return "/hzszyyhospital/hzszyydoctor/bloodTransRecord/queryBloodTransRecord";
	 }
	 
	 /**
	  * 输血记录列表查询
	  * @param hspTransfusionInfQueryDto
	  * @param page
	  * @param rows
	  * @return
	  */
	 @ResponseBody
	 @RequestMapping(value = "/findTransfusionList")
	 public DataGridResultInfo findTransfusionList(HspTransfusionInfQueryDto hspTransfusionInfQueryDto, int page, int rows) {
		 DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		 ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		 try {
			int total = hspTransfusionInfService.findTransfusionCountByEmgSeq(hspTransfusionInfQueryDto);
			PageQuery pageQuery = new PageQuery();
			pageQuery.setPageParams(total, rows, page);
			hspTransfusionInfQueryDto.setPageQuery(pageQuery);
			List<HspTransfusionInfCustom> transfusionList = hspTransfusionInfService.findTransfusionListByEmgSeq(hspTransfusionInfQueryDto);
			dataGridResultInfo.setTotal(total);
			dataGridResultInfo.setRows(transfusionList);
		} catch (Exception e) {
			e.printStackTrace();
			resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, null);
		}
		 dataGridResultInfo.setResultInfo(resultInfo);
		 return dataGridResultInfo;
	 }
	 
	 /**
	  * 跳转新增修改页面
	  * @param model
	  * @param transfusionSeq
		* @param emgSeq
	  * @return
	  */
	 @RequestMapping(value = "/toUpdateBloodTransRecord")
	 public String toUpdateBloodTransRecord(Model model, String transfusionSeq, String emgSeq) throws Exception{
		 HspemginfCustom hspemginfCustom = zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		 model.addAttribute("transfusionSeq",transfusionSeq);
		 model.addAttribute("emgSeq",emgSeq);
		 model.addAttribute("hspemginfCustom",hspemginfCustom);
		 return "/hzszyyhospital/hzszyydoctor/bloodTransRecord/updateBloodTransRecord";
	 }
	 
	 
	 /**
	  * 获取一条输血记录
	  * @param transfusionSeq
	  * @return
	  */
	 @ResponseBody
	 @RequestMapping(value = "/getTransfusionInf")
	 public SubmitResultInfo getTransfusionInf(String transfusionSeq) {
		 ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		 Map<String,Object> map = new HashMap<String,Object>();
		 try {
			HspTransfusionInf hspTransfusionInf = hspTransfusionInfService.getTransfusionInf(transfusionSeq);
			map.put("hspTransfusionInf", hspTransfusionInf);
		} catch (Exception e) {
			e.printStackTrace();
			resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, null);
		}
		 resultInfo.setSysdata(map);
		 return ResultUtil.createSubmitResult(resultInfo);
	 }
	 
	 /**
	  * 保存输血记录
	  * @param hspTransfusionInfQueryDto
	  * @param activeUser
	  * @return
	  */
	 @ResponseBody
	 @RequestMapping(value ="/updateBloodTransRecord")
	 public SubmitResultInfo updateBloodTransRecord(HspTransfusionInfQueryDto hspTransfusionInfQueryDto, ActiveUser activeUser) {
		 ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		 try {
			String onlySeq = hspTransfusionInfService.updateBloodTransRecord(hspTransfusionInfQueryDto, activeUser);
			Map<String, Object> sysdata = new HashMap<String, Object>();
			sysdata.put("onlySeq", onlySeq);
			resultInfo.setSysdata(sysdata);
		} catch (Exception e) {
			e.printStackTrace();
			resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, null);
		}
		 return ResultUtil.createSubmitResult(resultInfo);
	 }
	 
	 /**
	  * 删除输血记录
	  * @param transfusionSeq
	  * @return
	  */
	 @ResponseBody
	 @RequestMapping(value = "/delBloodTransRecord")
	 public SubmitResultInfo delBloodTransRecord(String transfusionSeq) {
		 ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		 try {
			hspTransfusionInfService.delBloodTransRecord(transfusionSeq);
		} catch (Exception e) {
			e.printStackTrace();
			resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, null);
		}
		 return ResultUtil.createSubmitResult(resultInfo);
	 } 
}
