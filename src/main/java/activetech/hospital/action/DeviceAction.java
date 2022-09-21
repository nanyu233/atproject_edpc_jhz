package activetech.hospital.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.DstdictinfoCustom;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.SystemConfigService;
import activetech.hospital.pojo.dto.HspDevSysCustom;
import activetech.hospital.pojo.dto.HspDevSysQueryDto;
import activetech.hospital.service.HspDeviceService;

@Controller
@RequestMapping("/device")
public class DeviceAction {
	@Autowired
	private HspDeviceService hspDeviceService;
	@Autowired
	private SystemConfigService systemConfigService;
	
	/**
	 * 跳转设备设置新增页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toinsert")
	public String toInsert(Model model)throws Exception{
		List<DstdictinfoCustom> dictList=systemConfigService.findDictinfoByType("DEVTYP_COD");
		model.addAttribute("dictlist", dictList);
		return "/hospital/device/adddevice";
	}
	
	/**
	 * 新增设备设置
	 * @param hspDevSysQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/inserthds")
	public @ResponseBody SubmitResultInfo insertHspDevSys(HspDevSysQueryDto hspDevSysQueryDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspDeviceService.insertHspDevSys(hspDevSysQueryDto,activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	@RequestMapping("/toupdate")
	public String toUpdate(Model model,HspDevSysQueryDto hspDevSysQueryDto)throws Exception{
		List<DstdictinfoCustom> dictList=systemConfigService.findDictinfoByType("DEVTYP_COD");
		HspDevSysCustom hspDevSysCustom=hspDeviceService.findById(hspDevSysQueryDto);
		model.addAttribute("dictlist", dictList);
		model.addAttribute("hspDevSysCustom",hspDevSysCustom);
		return "/hospital/device/editdevice";
	}
	
	@RequestMapping("/updatehds")
	public @ResponseBody SubmitResultInfo updateHDSById(HspDevSysQueryDto hspDevSysQueryDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspDeviceService.updateById(hspDevSysQueryDto,activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	@RequestMapping("/deletehds")
	public @ResponseBody SubmitResultInfo deleteHDSById(HspDevSysCustom hspDevSysCustom)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspDeviceService.deleteById(hspDevSysCustom);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转设备设置列表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querydevice")
	public String queryDevice(Model model, String moduleid) throws Exception{
		List<DstdictinfoCustom> stateList=systemConfigService.findDictinfoByType("DEVTYP_COD");
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("stateList", stateList);
		return "/hospital/device/querydevice";
	}
	
	/**
	 * 查询设备设置（按设备类型查询）
	 * @param model
	 * @param hspDevSysQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querydevice_result")
	public @ResponseBody DataGridResultInfo finHDSList(HspDevSysQueryDto hspDevSysQueryDto,
			int page,//当前页码
			int rows//每页显示个数
			)throws Exception{
		//非空校验
		hspDevSysQueryDto = hspDevSysQueryDto!=null?hspDevSysQueryDto:new HspDevSysQueryDto();
		int total=hspDeviceService.findHSDCount(hspDevSysQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspDevSysQueryDto.setPageQuery(pageQuery);
		List<HspDevSysCustom> hdsList=hspDeviceService.selectHSDByList(hspDevSysQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(hdsList);
		return dataGridResultInfo;
	}
	
}
