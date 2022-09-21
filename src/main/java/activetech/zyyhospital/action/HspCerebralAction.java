package activetech.zyyhospital.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.annotation.FormToken;
import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.SystemConfigService;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.util.StringUtils;
import activetech.zyyhospital.pojo.dto.HspCerebralCourseCustom;
import activetech.zyyhospital.pojo.dto.HspCerebralQueryDto;
import activetech.zyyhospital.service.HspCerebralService;
import activetech.zyyhospital.service.ZyyHspemginfService;
/**
 * <p>Title:HspCerebralAction</p>
 * <p>Description:脑梗溶栓病程</p>
 * <p>activetech</p>
 * @date 2018年7月11日
 */
@Controller
@RequestMapping("/cerebralation")
public class HspCerebralAction {
	@Autowired
	private HspCerebralService hspCerebralService;
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
	@Autowired
	private SystemConfigService systemConfigService;
	
	@RequestMapping("/findCerebralList")
	public @ResponseBody SubmitResultInfo findCerebralList(String emgSeq) throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		Map<String, String> params = new HashMap<String, String>(20);
        params.put("CEREBRAL_IND_COD", "cerebralIndList");//溶栓适应症
        params.put("CEREBRAL_CONT_COD", "cerebralContList");//溶栓禁忌症
        params.put("SHEET_TIME_TYPE", "sheetTimeTypeList");//溶栓评估单时间类型
        params.put("NIHSS_PROJECT_TYPE", "nihssProjectTypeList");//NIHSS评分项目类型
        params.put("NIHSS_TIME_TYPE", "nihssTimeTypeList");//NIHSS评分时间类型
        
        Map<String, List<Dstdictinfo>> maps = systemConfigService.findDstdictinfos(params);
        Map<String, Object> map = new HashMap<String, Object>(20);
        map.putAll(maps);
        resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转脑梗溶栓病程记录
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/brainDisease")
	@FormToken(save=true)
	public String brainDisease(Model model,String emgSeq) throws Exception{
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		HspCerebralCourseCustom hspCerebralCourseCustom=hspCerebralService.findCerebralCourseByEmgSeq(emgSeq);
		model.addAttribute("hspCerebralCourseCustom", hspCerebralCourseCustom);
 		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyydoctor/brainDisease/brainDisease";
	}
	
	/**
	 * 溶栓病程数据获取
	 * @param cerebralCourseSeq
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findCerebralCourse")
	public @ResponseBody HspCerebralQueryDto findCerebralCourse(String emgSeq)throws Exception{
		HspCerebralQueryDto hspCerebralQueryDto=hspCerebralService.findCerebralCourseById(emgSeq);
		return hspCerebralQueryDto;
	}
	
	/**
	 * 溶栓病程提交
	 * @param hspCerebralQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/submitCerebralCourse")
	@FormToken(remove=true)
	public @ResponseBody SubmitResultInfo submitCerebralCourse(HspCerebralQueryDto hspCerebralQueryDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspCerebralService.submitCerebralCourse(hspCerebralQueryDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 删除溶栓病程
	 * @param hspCerebralQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/delCerebralCourse")
	public @ResponseBody SubmitResultInfo delCerebralCourse(String cerebralCourseSeq)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspCerebralService.delCerebralCourse(cerebralCourseSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转溶栓病程列表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryCerebralCourse")
	public String queryCerebralCourse(Model model,String emgSeq) throws Exception{
		model.addAttribute("emgSeq", emgSeq);
		return "/hzszyyhospital/hzszyydoctor/brainDisease/brainList";
	}
	/**
	 * 急诊记录查询列表
	 * @param dstuserQueryDto
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryCerebralCourse_result")
	public @ResponseBody DataGridResultInfo queryCerebralCourse_result(
			HspCerebralQueryDto hspCerebralQueryDto,
			int page,//当前页码
			int rows,//每页显示个数
			String sort,
			String order
			) throws Exception{
		//非空校验
		hspCerebralQueryDto = hspCerebralQueryDto!=null?hspCerebralQueryDto:new HspCerebralQueryDto();
		//查询列表的总数
		if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
			hspCerebralQueryDto.setSort("cerebralDate");//默认溶栓时间
		}
		if(!StringUtils.isNotNullAndEmptyByTrim(order)){
			hspCerebralQueryDto.setOrder("desc");
		}
		
		int total =hspCerebralService.getCerebralCourseCountByEmgSeq(hspCerebralQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);	
		hspCerebralQueryDto.setPageQuery(pageQuery);
		List<HspCerebralCourseCustom> list =hspCerebralService.findCerebralCourseListByEmgSeq(hspCerebralQueryDto);

		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
}
