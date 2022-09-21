package activetech.zyyhospital.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
import activetech.hospital.pojo.domain.HspDevSys;
import activetech.hospital.pojo.dto.HspDevSysCustom;
import activetech.hospital.service.HspDeviceService;
import activetech.util.IpUtil;
import activetech.zyyhospital.pojo.domain.IcuErInfo;
import activetech.zyyhospital.pojo.dto.HspFavoritesInfCustom;
import activetech.zyyhospital.pojo.dto.HspFavoritesInfCustomDto;
import activetech.zyyhospital.pojo.dto.IcuErInfoQueryDto;
import activetech.zyyhospital.service.IcuErInfoService;


/**
 * 事件提醒 
 * <p>Title: IcuErInfoAction.java IcuErInfoAction</p>
 * <p>@Description: </p>
 * <p>Company: </p>
 * @author wzl
 * @date 2020年03月13日
 *
 */
@Controller
@RequestMapping("/icuer")
public class IcuErInfoAction {
	
	@Autowired
	private IcuErInfoService icuErInfoService;
	
	@Autowired
	private HspDeviceService hspDeviceService;
	
	/**
	 * 判断当前机器是否能够推送危急值弹框
	 * @return
	 * @throws Exception
	 */	
	@RequestMapping("/isMachineJudgment")
	public @ResponseBody Map<String, String> isMachineJudgment(HttpServletRequest request) throws Exception{
		String ipaddr = IpUtil.getClientIp(request);
		Map<String, String> result = new HashMap<String, String>();
		HspDevSysCustom hspDevSysCustom = new HspDevSysCustom();
		hspDevSysCustom.setDevtypCod("WJZ");
		List<HspDevSys> hspDevSysList = hspDeviceService.selectHSDByListQFY(hspDevSysCustom);
		for (HspDevSys hspDevSys : hspDevSysList) {
			if (ipaddr.equals(hspDevSys.getIpaddr())) {
				result.put("isMachineJudgment", "true");
				return result;
			}
		}
		result.put("isMachineJudgment", "false");
		return result;
	}
	
	/**
	 * 事件提醒确认提交
	 * @param icuErInfoCustom
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editErInfoSubmit")
	public @ResponseBody SubmitResultInfo editErInfoSubmit(IcuErInfoQueryDto icuErInfoQueryDto) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		icuErInfoService.editErInfoSubmit(icuErInfoQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转事件提醒页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toErInfo")
	public String toErInfo(Model model,String moduleid) throws Exception {
		model.addAttribute("moduleid", moduleid);
		return "/hzszyyhospital/icuPipe/icuEr/erInfo";
	}
	
	/**
	 * 查询事件提醒列表（分页）
	 * @param hspLqbljlQueryDto
	 * @return
	 */
	@RequestMapping("/getErInfoListFy")
	public @ResponseBody DataGridResultInfo findHspFavoritesInfListFy(IcuErInfoQueryDto icuErInfoQueryDto,
			int page,//当前页码
			int rows//每页显示个数
			) throws Exception {
		icuErInfoQueryDto = icuErInfoQueryDto != null ? icuErInfoQueryDto:new IcuErInfoQueryDto();
		int total = icuErInfoService.getErInfoListCount(icuErInfoQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		icuErInfoQueryDto.setPageQuery(pageQuery);
		List<IcuErInfo> erInfoList = icuErInfoService.getErInfoListFy(icuErInfoQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(erInfoList);		
		return dataGridResultInfo;
	}
}
