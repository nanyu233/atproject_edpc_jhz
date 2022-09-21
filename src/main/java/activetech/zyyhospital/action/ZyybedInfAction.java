package activetech.zyyhospital.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.DstdictinfoCustom;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.SystemConfigService;
import activetech.basehems.service.BaseHspemgInfService;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.zyyhospital.pojo.domain.HspBedInf;
import activetech.zyyhospital.pojo.dto.HspBedInfCustom;
import activetech.zyyhospital.pojo.dto.HspBedInfCustomDto;
import activetech.zyyhospital.service.HspBedInfService;

/**
 * 
 * <p>
 * Title:ZyybedInfAction
 * </p>
 * <p>
 * Description:床位管理
 * </p>
 * <p>
 * activetech
 * </p>
 * 
 * @author ckb
 * @date 2017年10月18日
 * 
 */
@Controller
@RequestMapping("/bedinf")
public class ZyybedInfAction {
	@Autowired
	private HspBedInfService hspBedInfService;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private BaseHspemgInfService baseHspemgInfService;

	
	
	/**
	 * 跳转床位管理
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querybed")
	public String queryBed(Model model, String moduleid) throws Exception {
		List<Dstdictinfo> stateList = systemConfigService.findDictinfoByType("BED_PLACE_COD");
		model.addAttribute("stateList", stateList);
		model.addAttribute("moduleid", moduleid);
		return "/hzszyyhospital/hzszyybed/queryBed";
	}
	
	/**
	 * 床位管理列表结果集
	 * @param model
	 * @param HspBedInfCustomDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querybed_result")
	public @ResponseBody DataGridResultInfo querybed_result(HspBedInfCustomDto hspBedInfCustomDto,
			int page,//当前页码
			int rows//每页显示个数
			)throws Exception{
		hspBedInfCustomDto=hspBedInfCustomDto!=null?hspBedInfCustomDto:new HspBedInfCustomDto();
		int total=hspBedInfService.findBedListCount(hspBedInfCustomDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspBedInfCustomDto.setPageQuery(pageQuery);
		List<HspBedInfCustom> list=hspBedInfService.getBedList(hspBedInfCustomDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
		
	}
	
	/**
	 * 新增床位
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toinsert")
	public String toInsert(Model model)throws Exception{
		List<DstdictinfoCustom> dictList=systemConfigService.findDictinfoByType("BED_PLACE_COD");
		model.addAttribute("stateList", dictList);
		return "/hzszyyhospital/hzszyybed/addBed";
	}
	
	/**
	 * 新增床位
	 * @param hspDevSysQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/insertbed")
	public @ResponseBody SubmitResultInfo insertbed(HspBedInfCustomDto hspBedInfCustomDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspBedInfService.addBed(hspBedInfCustomDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转修改床位页面
	 * @param model
	 * @param hspBedInfCustomDto
	 * @return
	 */
	@RequestMapping("/toupdate")
	public String toUpdate(Model model,HspBedInfCustomDto hspBedInfCustomDto)throws Exception{
		List<DstdictinfoCustom> dictList=systemConfigService.findDictinfoByType("BED_PLACE_COD");
		HspBedInf hspBedInf=hspBedInfService.findBedById(hspBedInfCustomDto);
		model.addAttribute("stateList", dictList);
		model.addAttribute("hspBedInf",hspBedInf);
		return "/hzszyyhospital/hzszyybed/editBed";
	}
	
	/**
	 * 修改床位
	 * @param hspDevSysQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editbed")
	public @ResponseBody SubmitResultInfo editbed(HspBedInfCustomDto hspBedInfCustomDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspBedInfService.updateBed(hspBedInfCustomDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 删除床位
	 * @param hspDevSysQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deletebed")
	public @ResponseBody SubmitResultInfo deletebed(HspBedInfCustomDto hspBedInfCustomDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspBedInfService.delBed(hspBedInfCustomDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 跳转调配床位页面
	 * @param model
	 * @param hspBedInfCustomDto
	 * @return
	 */
	@RequestMapping("/todeploy")
	public String todeploy(Model model,HspBedInfCustomDto hspBedInfCustomDto,String emgSeq,String emgNam)throws Exception{
		List<HspBedInfCustom> bedplacecodList=hspBedInfService.findBedPlaceAndNum(emgSeq,"");
		model.addAttribute("bedplacecodList",bedplacecodList);
		model.addAttribute("emgNam",emgNam);
		model.addAttribute("emgSeq",emgSeq);
		//判断是否打开留观室 0：未打开 1：打开
		model.addAttribute("islgbed", systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue());
		HspemginfCustom hspemginfCustom=baseHspemgInfService.findHspemginfCustom(emgSeq);
		model.addAttribute("hspemginfCustom",hspemginfCustom);
		return "/hzszyyhospital/hzszyybed/depolybed";
	}
	
	
	/**
	 * 调配床位
	 * @param hspDevSysQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deploybed")
	public @ResponseBody SubmitResultInfo deploybed(HspBedInfCustomDto hspBedInfCustomDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspBedInfService.updatedeployBed(hspBedInfCustomDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 新入病人调配床位
	 * @param hspDevSysQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("/relatedBed")
	public SubmitResultInfo relatedBed(HspBedInfCustomDto hspBedInfCustomDto,ActiveUser activeUser){
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		try {
			hspBedInfService.updateRelatedBed(hspBedInfCustomDto, activeUser);
		} catch (Exception e) {
			e.printStackTrace();
			resultInfo = ResultUtil.createFail(Config.MESSAGE, 900,null);
		}
		return ResultUtil.createSubmitResult(resultInfo);
	}
}
