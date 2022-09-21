package activetech.pda.action;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.pda.pojo.dto.HspCfxxExecCustom;
import activetech.pda.pojo.dto.HspCfxxExecQueryDto;
import activetech.pda.pojo.dto.HspCfxxInfoCustom;
import activetech.pda.pojo.dto.HspCfxxInfoQueryDto;
import activetech.pda.service.HspCfxxExecService;
import activetech.pda.service.HspCfxxInfoService;
import activetech.util.BeanUtil;


/**
 * 处方信息Action
 * @author machaofan
 *
 */
@Controller
@RequestMapping(value = "/cfxx")
public class HspCfxxInfoAction {

	@Autowired
	private HspCfxxInfoService hspCfxxInfoService;
	
	@Autowired
	private HspCfxxExecService hspCfxxExecService;
	
	/**
	 * 跳转输液管理外页面
	 * @param model
	 * @param emgSeq 预检号
	 * @param cstNam 姓名
	 * @return
	 */
	@RequestMapping(value = "/toTransManager")
	public String toTransManager(Model model, String emgSeq, String cstNam) {
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("cstNam", cstNam);
		return "/hzszyyhospital/hzszyyqjs/transManager/transManager";
	}
	
	/**
	 * 跳转医嘱核对页面
	 * @param mode
	 * @param emgSeq 预检号
	 * @return
	 */
	@RequestMapping(value = "/toDocAdcCheck")
	public String toDocAdcCheck(Model model, String emgSeq) {
		model.addAttribute("emgSeq", emgSeq);
		return "/hzszyyhospital/hzszyyqjs/transManager/docAdcCheck";
	}
	
	/**
	 * 获取患者数据
	 * @param emgSeq
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getEmgInfData")
	public ResultInfo getEmgInfData(String emgSeq) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			//患者数据
			HspemginfCustom hspemginfCustom = hspCfxxInfoService.getEmgInfData(emgSeq);
			map.put("hspemginfCustom",hspemginfCustom);
		} catch (Exception e) {
			e.printStackTrace();
			resultInfo = ResultUtil.createFail(Config.MESSAGE, 900,null);
		}
		resultInfo.setSysdata(map);
		return resultInfo;
	}
	
	
	
	/**
	 * 获取处方信息（临时表+本地处方表）
	 * @param hspCfxxInfoQueryDto
	 */
	@ResponseBody
	@RequestMapping(value = "/getCfxxDataAndProc")
	public DataGridResultInfo getCfxxDataAndProc(HspCfxxInfoQueryDto hspCfxxInfoQueryDto){
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		if(null != hspCfxxInfoQueryDto.getHspCfxxInfoCustom()) {
			if(!BeanUtil.validated(hspCfxxInfoQueryDto.getHspCfxxInfoCustom().getMpi())) {
				return null;
			}
		}
		try {
			//列表数据
			List<HspCfxxInfoCustom> cfxxList = hspCfxxInfoService.getCfxxDataAndHIS(hspCfxxInfoQueryDto);
			dataGridResultInfo.setTotal(cfxxList.size());
			dataGridResultInfo.setRows(cfxxList);
		} catch (Exception e) {
			e.printStackTrace();
			ResultInfo resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, null);
			dataGridResultInfo.setResultInfo(resultInfo);
		}
		return dataGridResultInfo;
	}
	
	/**
	 * 医嘱核对
	 * @param hspCfxxInfoQueryDto
	 * @param activeUser 用户信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/docAdcSubmit")
	public SubmitResultInfo docAdcSubmit(@RequestBody HspCfxxInfoQueryDto hspCfxxInfoQueryDto, ActiveUser activeUser) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		try {
			hspCfxxInfoService.saveDocAdcSubmit(hspCfxxInfoQueryDto, activeUser);
		} catch (Exception e) {
			resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, null);
			e.printStackTrace();
		}
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转执行单页面
	 * @param model
	 * @param emgSeq
	 * @return
	 */
	@RequestMapping(value = "/toListGenerate")
	public String toListGenerate(Model model, String emgSeq) {
		model.addAttribute("emgSeq", emgSeq);
		return "/hzszyyhospital/hzszyyqjs/transManager/listGenerate";
	}
	
	/**
	 * 获取患者时间段内所有给药方式
	 * @param emgSeq
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getDaWayByDate")
	public ResultInfo getDaWayByDate(HspCfxxExecQueryDto hspCfxxExecQueryDto) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			//患者时间段内所有给药方式
			List<HspCfxxExecCustom> daWayList = hspCfxxExecService.getDaWayByDate(hspCfxxExecQueryDto);
			map.put("daWayList", daWayList);
		} catch (Exception e) {
			resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, null);
			e.printStackTrace();
		}
		resultInfo.setSysdata(map);
		return resultInfo;
	}
	

	/**
	 * 获取执行单列表（已取消分页）
	 * @param hspCfxxExecQueryDto
	 * @param page 当前页码
	 * @param rows 每页显示个数
	 */
	@ResponseBody
	@RequestMapping(value = "/getCfxxExecList")
	public DataGridResultInfo getCfxxExecList(HspCfxxExecQueryDto hspCfxxExecQueryDto){
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		if(null != hspCfxxExecQueryDto.getHspCfxxExecCustom()) {
			if(!BeanUtil.validated(hspCfxxExecQueryDto.getHspCfxxExecCustom().getMpi())) {
				return null;
			}
		}
		try {
			if(null != hspCfxxExecQueryDto && null != hspCfxxExecQueryDto.getHspCfxxExecCustom()) {
				//列表数据
				List<HspCfxxExecCustom> execList = hspCfxxExecService.getCfxxExecList(hspCfxxExecQueryDto);
				dataGridResultInfo.setRows(execList);
			}
		} catch (Exception e) {
			e.printStackTrace();
			ResultInfo resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, null);
			dataGridResultInfo.setResultInfo(resultInfo);
		}
		return dataGridResultInfo;
	}
	
	/**
	 * 跳转医嘱拆分打印页面
	 * @param model
	 * @param disposalSeq 处置单编号
	 * @return
	 */
	@RequestMapping(value = "/toListPrint")
	public String toListPrint(Model model, String disposalSeq) {
		model.addAttribute("disposalSeq", disposalSeq);
		return "/hzszyyhospital/hzszyyqjs/transManager/listPrint/listPrint";
	}
	
	/**
	 * @Description 医嘱拆分、(更新最新医嘱、执行单的数据)
	 * @author machaofan
	 * @date 2020年7月21日上午11:05:20
	 * @param hspCfxxExecQueryDto
	 * @param activeUser
	 * @return
	 * @return SubmitResultInfo
	 */
	@ResponseBody
	@RequestMapping(value = "/adviceSplit")
	public SubmitResultInfo adviceSplit(HspCfxxExecQueryDto hspCfxxExecQueryDto,ActiveUser activeUser) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		if(null != hspCfxxExecQueryDto.getHspCfxxExecCustom()) {
			if(!BeanUtil.validated(hspCfxxExecQueryDto.getHspCfxxExecCustom().getMpi())) {
				return ResultUtil.createSubmitResult(resultInfo);
			}
		}
		try {
			hspCfxxExecService.updateAdviceSplit(hspCfxxExecQueryDto,activeUser);
		} catch (Exception e) {
			resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, null);
			e.printStackTrace();
		}
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 医嘱拆分打印列表
	 * @param hspCfxxExecQueryDto
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/adviceSplitPrint")
	public ResultInfo adviceSplitPrint(HspCfxxExecQueryDto hspCfxxExecQueryDto){
		if(null != hspCfxxExecQueryDto.getHspCfxxExecCustom()) {
			if(!BeanUtil.validated(hspCfxxExecQueryDto.getHspCfxxExecCustom().getMpi())) {
				return null;
			}
		}
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			List<HspCfxxExecCustom> execList = hspCfxxExecService.adviceSplitPrint(hspCfxxExecQueryDto);
			map.put("execList", execList);
		} catch (Exception e) {
			resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, null);
			e.printStackTrace();
		}
		resultInfo.setSysdata(map);
		return resultInfo;
	}
	
	
	/**
	 * 打印执行单
	 * @param execSeqStr
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/printExec")
	public SubmitResultInfo printExec(HspCfxxExecQueryDto hspCfxxExecQueryDto) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		if(null != hspCfxxExecQueryDto.getHspCfxxExecCustom()) {
			if(!BeanUtil.validated(hspCfxxExecQueryDto.getHspCfxxExecCustom().getDisposalSeq())) {
				return ResultUtil.createSubmitResult(resultInfo);
			}
		}
		try {
			hspCfxxExecService.printExec(hspCfxxExecQueryDto);
		} catch (Exception e) {
			resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, null);
			e.printStackTrace();
		}
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	
	/**
	 * 跳转医嘱执行确认页面
	 * @param model
	 * @param emgSeq
	 * @return
	 */
	@RequestMapping(value = "/adEcConfirm")
	public String adEcConfirm(Model model, String emgSeq) {
		model.addAttribute("emgSeq", emgSeq);
		return "/hzszyyhospital/hzszyyqjs/transManager/adEcConfirm";
	}
	
	
	/**
	 * 获取医嘱执行列表
	 * @param hspCfxxExecQueryDto
	 * @param page 当前页码
	 * @param rows 每页显示个数
	 */
	@ResponseBody
	@RequestMapping(value = "/getAdviceExecList")
	public DataGridResultInfo getAdviceExecList(HspCfxxExecQueryDto hspCfxxExecQueryDto,int page,int rows){
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		if(null != hspCfxxExecQueryDto.getHspCfxxExecCustom()) {
			if(!BeanUtil.validated(hspCfxxExecQueryDto.getHspCfxxExecCustom().getMpi())) {
				return null;
			}
		}
		try {
			//总条数
			int total = hspCfxxExecService.getAdviceExecListCount(hspCfxxExecQueryDto);
			PageQuery pageQuery = new PageQuery();
			pageQuery.setPageParams(total, rows, page);
			hspCfxxExecQueryDto.setPageQuery(pageQuery);
			//列表数据
			List<HspCfxxExecCustom> execList = hspCfxxExecService.getAdviceExecList(hspCfxxExecQueryDto);
			dataGridResultInfo.setTotal(total);
			dataGridResultInfo.setRows(execList);
		} catch (Exception e) {
			e.printStackTrace();
			ResultInfo resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, null);
			dataGridResultInfo.setResultInfo(resultInfo);
		}
		return dataGridResultInfo;
	}
	
	
	/**
	 * 医嘱执行
	 * @param hspCfxxExecQueryDto
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/adviceExec")
	public SubmitResultInfo adviceExec(@RequestBody HspCfxxExecQueryDto hspCfxxExecQueryDto, ActiveUser activeUser){
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		try {
			hspCfxxExecService.updateAdviceExec(hspCfxxExecQueryDto, activeUser);
		} catch (Exception e) {
			e.printStackTrace();
			resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, null);
		}
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	/**
	 * 跳转医嘱查询页面
	 * @param model
	 * @param emgSeq
	 * @return
	 */
	@RequestMapping(value = "/adviceQuery")
	public String adviceQuery(Model model, String emgSeq) {
		model.addAttribute("emgSeq", emgSeq);
		return "/hzszyyhospital/hzszyyqjs/transManager/adviceQuery";
	}
	
	/**
	 * 医嘱查询
	 * @param hspCfxxInfoQueryDto
	 * @param page 当前页码
	 * @param rows 每页显示个数
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/adviceQueryList")
	public DataGridResultInfo adviceQueryList(HspCfxxInfoQueryDto hspCfxxInfoQueryDto,int page,int rows){
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		if(null != hspCfxxInfoQueryDto.getHspCfxxInfoCustom()) {
			if(!BeanUtil.validated(hspCfxxInfoQueryDto.getHspCfxxInfoCustom().getMpi())) {
				return null;
			}
		}
		try {
			//列表数据
			List<HspCfxxInfoCustom> cfxxList = hspCfxxInfoService.getCfxxDataAndHIS(hspCfxxInfoQueryDto);
			dataGridResultInfo.setTotal(cfxxList.size());
			cfxxList = cfxxList.stream().skip((page-1) * rows).limit(rows).collect(Collectors.toList());
			dataGridResultInfo.setRows(cfxxList);
		} catch (Exception e) {
			e.printStackTrace();
			ResultInfo resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, null);
			dataGridResultInfo.setResultInfo(resultInfo);
		}
		return dataGridResultInfo;
	}
}
