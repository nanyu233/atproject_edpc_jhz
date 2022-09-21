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
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.zyyhospital.pojo.domain.HspHeartRecord;
import activetech.zyyhospital.pojo.dto.HspHeartRecordCustom;
import activetech.zyyhospital.pojo.dto.HspHeartRecordQueryDto;
import activetech.zyyhospital.pojo.dto.HspJzcspgInfCustom;
import activetech.zyyhospital.pojo.dto.HspXtpgInfCustom;
import activetech.zyyhospital.service.HspHeartRecordService;
import activetech.zyyhospital.service.HspJzcspgInfService;
import activetech.zyyhospital.service.ZyyHspemginfService;
import activetech.zyyhospital.service.ZyyHspxtpgInfService;

/**
 * 心肺记录单
 * @author machaofan
 *
 */
@Controller
@RequestMapping(value = "/heartRecord")
public class HspHeartRecordAction {
	
	@Autowired
	private HspHeartRecordService hspHeartreordService;

	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
	
	@Autowired
	private HspJzcspgInfService hspJzcspgInfService;
	
	@Autowired
	private ZyyHspxtpgInfService zyyHspxtpgInfService;
	
	/**
	 * 跳转心肺复苏记录单页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value ="/to_heartRecord")
	public String to_heartRecord(Model model) {
		return "/hzszyyhospital/hzszyyxtpg/xtpg/heartRecord/heartRecord";
	}
	
	
	/**
	 * 获取心肺复苏记录单列表
	 * @param hspHeartRecordQueryDto
	 * @param page
	 * @param rows
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/queryHeartRecordList")
	public DataGridResultInfo queryHeartRecordList(HspHeartRecordQueryDto hspHeartRecordQueryDto,int page,int rows) {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo(); 
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		try {
			int total = hspHeartreordService.queryHeartRecordListCount(hspHeartRecordQueryDto);
			PageQuery pageQuery = new PageQuery();
			pageQuery.setPageParams(total, rows, page);
			hspHeartRecordQueryDto.setPageQuery(pageQuery);
			List<HspHeartRecordCustom> hspHeartRecordCustomList = hspHeartreordService.queryHeartRecordList(hspHeartRecordQueryDto);
			dataGridResultInfo.setTotal(total);
			dataGridResultInfo.setRows(hspHeartRecordCustomList);
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
	 * @param heartSeq
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value = "/to_updateRecord")
	public String to_updateRecord(Model model, String heartSeq, String emgSeq) throws Exception {
		model.addAttribute("heartSeq",heartSeq);
		model.addAttribute("emgSeq",emgSeq);
		return "/hzszyyhospital/hzszyyxtpg/xtpg/heartRecord/updateRecordMsg";
	}
	
	
	/**
	 * 导入评估内容
	 * @param emgSeq
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/importAssessment")
	public SubmitResultInfo importAssessment(String emgSeq) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String,Object> map = new HashMap<String, Object>();
		try {
			//入院护理评估
			HspemginfCustom hspemginfCustom = zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
			String symSitDes= hspemginfCustom.getSymSitDes()!=null ? hspemginfCustom.getSymSitDes() : "";
			map.put("symSitDes", symSitDes);
			
			//创伤入院评估
			HspJzcspgInfCustom hspJzcspgInfCustom=hspJzcspgInfService.findJzcsrypgbByEmgSeq(emgSeq);
			String traumaDes = hspJzcspgInfCustom.getHzDes()!=null ? hspJzcspgInfCustom.getHzDes() : "";
			map.put("traumaDes", traumaDes);
			
			//系统评估汇总
			HspXtpgInfCustom hspXtpgInfCustom = zyyHspxtpgInfService.getXtpgByemgseq(emgSeq);
			String xtpgDes=hspXtpgInfCustom.getXtpgJlhz()!=null ? hspXtpgInfCustom.getXtpgJlhz() : "";
			map.put("xtpgDes", xtpgDes);
		} catch (Exception e) {
			e.printStackTrace();
			resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, null);
		}
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	
	/**
	 * 查询一条心肺复苏记录
	 * @param heartSeq
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/getRecordByPrimaryKey")
	public ResultInfo getRecordByPrimaryKey(String heartSeq) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			HspHeartRecord hspHeartRecord = hspHeartreordService.getRecordByPrimaryKey(heartSeq);
			map.put("hspHeartRecord", hspHeartRecord);
		} catch (Exception e) {
			e.printStackTrace();
			resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, null);
			
		}
		resultInfo.setSysdata(map);
		return resultInfo;
	}
	
	/**
	 * 心肺复苏记录新增修改保存
	 * @param hspheartRecordCustom
	 * @param activeUser
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/updateRecord")
	public SubmitResultInfo updateRecord(@RequestBody HspHeartRecordCustom hspheartRecordCustom, ActiveUser activeUser) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		try {
			hspHeartreordService.updateRecord(hspheartRecordCustom, activeUser);
		} catch (Exception e) {
			e.printStackTrace();
			resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, null);
		}
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 心肺复苏删除
	 * @param heartSeq
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/deleteRecord")
	public SubmitResultInfo deleteRecord(String heartSeq) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		try {
			hspHeartreordService.deleteRecord(heartSeq);
		} catch (Exception e) {
			e.printStackTrace();
			resultInfo = ResultUtil.createFail(Config.MESSAGE, 900, null);
		}
		return ResultUtil.createSubmitResult(resultInfo);
	}
}
