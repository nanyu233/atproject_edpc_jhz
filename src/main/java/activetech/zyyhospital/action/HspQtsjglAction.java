package activetech.zyyhospital.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.zyyhospital.pojo.domain.HspQtsjgl;
import activetech.zyyhospital.pojo.dto.HspQtsjglCustom;
import activetech.zyyhospital.pojo.dto.HspQtsjglQueryDto;
import activetech.zyyhospital.service.HspQtsjglService;
import activetech.zyyhospital.service.ZyyHspemginfService;

@Controller
@RequestMapping("/qtsjgl")
public class HspQtsjglAction {
	@Autowired
	private HspQtsjglService hspQtsjglService;
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
	@Autowired
	private SystemConfigService systemConfigService;
	/**
	 * 跳转群体事件管理
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryqtsjgl")
	public String queryQtsjgl(Model model, String moduleid)throws Exception{
		model.addAttribute("moduleid", moduleid);
		return "/hzszyyhospital/qtsjgl/queryqtsjgl";
	}
	/**
	 * 获取群体事件管理列表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryqtsjgl_result")
	public @ResponseBody DataGridResultInfo findQtsjgl_result(HspQtsjglQueryDto hspQtsjglQueryDto,
			int page,//当前页码
			int rows//每页显示个数
			)throws Exception{
		hspQtsjglQueryDto = hspQtsjglQueryDto!=null?hspQtsjglQueryDto:new HspQtsjglQueryDto();
		int total=hspQtsjglService.findHspCbyxglCount(hspQtsjglQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspQtsjglQueryDto.setPageQuery(pageQuery);
		List<HspQtsjglCustom> list=hspQtsjglService.findHspQtsjglList(hspQtsjglQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 获取群体事件管理患者列表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryglhz_result")
	public @ResponseBody DataGridResultInfo findGlhz_result(HspQtsjglQueryDto hspQtsjglQueryDto,
			int page,//当前页码
			int rows,//每页显示个数
			String sort,
			String order
			)throws Exception{
		HspemginfQueryDto hspemginfQueryDto = new HspemginfQueryDto();
		HspemginfCustom hspemginfCustom = new HspemginfCustom();
		hspemginfCustom.setQtsjSeq(hspQtsjglQueryDto.getHspQtsjglCustom().getQtsjSeq());
		hspemginfQueryDto.setHspemginfCustom(hspemginfCustom);
		//查询列表的总数
		if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
			hspemginfQueryDto.setSort("emgdat");
		}
		if(!StringUtils.isNotNullAndEmptyByTrim(order)){
			hspemginfQueryDto.setOrder("desc");
		}
		
		int total =zyyHspemginfService.findHspemginfCount(hspemginfQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);	
		hspemginfQueryDto.setPageQuery(pageQuery);
		List<HspemginfCustom> list =zyyHspemginfService.findHspemginfList(hspemginfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	@RequestMapping("/toadd")
	public String toAdd()throws Exception{
		return "/hzszyyhospital/qtsjgl/addqtsj";
	}
	
	@RequestMapping("/addqtsj")
	public @ResponseBody SubmitResultInfo addHspQtsjgl(HspQtsjglQueryDto hspQtsjglQueryDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		Map<String,Object> map = hspQtsjglService.addHspQtsjgl(hspQtsjglQueryDto,activeUser);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	@RequestMapping("/toupdate")
	public String toUpdate(HspQtsjglQueryDto hspQtsjglQueryDto,Model model)throws Exception{
		HspQtsjgl hspQtsjgl=hspQtsjglService.findById(hspQtsjglQueryDto);
		model.addAttribute("hspQtsjgl", hspQtsjgl);
		return "/hzszyyhospital/qtsjgl/updateqtsjgl";
	}
	
	@RequestMapping("/updateqtsj")
	public @ResponseBody SubmitResultInfo updateHspQtsjgl(HspQtsjglQueryDto hspQtsjglQueryDto)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspQtsjglService.updateHspQtsjgl(hspQtsjglQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	@RequestMapping("/deleteqtsj")
	public @ResponseBody SubmitResultInfo deleteqtsj(HspQtsjglQueryDto hspQtsjglQueryDto)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspQtsjglService.deleteHspQtsjgl(hspQtsjglQueryDto.getHspQtsjglCustom().getQtsjSeq());
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * Ajax获取群体事件页面编码数据
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryqtsjglinfo")
	public @ResponseBody SubmitResultInfo queryQtsjglinfo(String typecode)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		Map<String, String> params = new HashMap<String, String>(60);
        params.put("QTSJ_TYPE", "qtsjtypeList");
        Map<String, List<Dstdictinfo>> maps = systemConfigService.findDstdictinfos(params);
        Map<String, Object> map = new HashMap<String, Object>(70);
        map.putAll(maps);
        map.put("qtsjtypeList", maps.get("qtsjtypeList"));
        resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	/**
	 * 绑定患者跳转
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/tobdhz")
	public String toBdhz(HspQtsjglQueryDto hspQtsjglQueryDto,Model model)throws Exception{
		model.addAttribute("qtsjSeq", hspQtsjglQueryDto.getHspQtsjglCustom().getQtsjSeq());
		return "/hzszyyhospital/qtsjgl/bdhz";
	}
	
	/**
	 * 获取患者列表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryemg_result")
	public @ResponseBody DataGridResultInfo queryemg_result(HspQtsjglQueryDto hspQtsjglQueryDto,
			Date today,
			int page,//当前页码
			int rows,//每页显示个数
			String sort,
			String order
			)throws Exception{
		HspemginfQueryDto hspemginfQueryDto = new HspemginfQueryDto();
		//首次查询时默认赋值系统当天日期
		if(hspQtsjglQueryDto.getHspQtsjglCustom()==null){
			HspemginfCustom hspemginfCustom=new HspemginfCustom();
			hspemginfCustom.setStartdate(today);
			hspemginfCustom.setEnddate(today);
			hspemginfQueryDto.setHspemginfCustom(hspemginfCustom);
		}
		if(hspQtsjglQueryDto.getStartdate() != null){
			hspemginfQueryDto.getHspemginfCustom().setStartdate(hspQtsjglQueryDto.getStartdate());
		}
		if(hspQtsjglQueryDto.getEnddate() != null){
			Date endDate = DateUtil.getNextDay(hspQtsjglQueryDto.getEnddate());
			hspemginfQueryDto.getHspemginfCustom().setEnddate(endDate);
		}
		//查询列表的总数
		if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
			hspemginfQueryDto.setSort("emgdat");
		}
		if(!StringUtils.isNotNullAndEmptyByTrim(order)){
			hspemginfQueryDto.setOrder("desc");
		}
		if(hspQtsjglQueryDto.getCstNam()!=null){
			hspemginfQueryDto.getHspemginfCustom().setCstNam(hspQtsjglQueryDto.getCstNam());
		}
		if(hspQtsjglQueryDto.getQtsjFlg()!=null){
			hspemginfQueryDto.getHspemginfCustom().setQtsjFlg(hspQtsjglQueryDto.getQtsjFlg());
		}
		int total =zyyHspemginfService.findHspemginfCount(hspemginfQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);	
		hspemginfQueryDto.setPageQuery(pageQuery);
		List<HspemginfCustom> list =zyyHspemginfService.findHspemginfList(hspemginfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	/**
	 * 患者绑定
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/qtsjhzbdCommit")
	public @ResponseBody SubmitResultInfo qtsjhzbdCommit(HspQtsjglQueryDto hspQtsjglQueryDto)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		HspQtsjglCustom hspQtsjglCustom = hspQtsjglService.updateEmgQtsj(hspQtsjglQueryDto);
		Map<String, Object> sysdata = new HashMap<String, Object>();
		sysdata.put("qtsjSeq", hspQtsjglCustom.getQtsjSeq());
		resultInfo.setSysdata(sysdata);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 绑定群体事件页面跳转
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/tobdqtsj")
	public String toBdqtsj(HspQtsjglQueryDto hspQtsjglQueryDto,Model model)throws Exception{
		model.addAttribute("qtsjseq", hspQtsjglQueryDto.getHspQtsjglCustom().getQtsjSeq());
		return "/hzszyyhospital/qtsjgl/bdqtsj";
	}
	
	/**
	 * 绑定群体事件页面跳转 (新)
	 * @param hspQtsjglQueryDto
	 * @param model
	 * @return
	 */
	@RequestMapping(value ="/toBdqtsjNew")
	public String toBdqtsjNew(HspQtsjglQueryDto hspQtsjglQueryDto,Model model) {
		model.addAttribute("qtsjseq", hspQtsjglQueryDto.getHspQtsjglCustom().getQtsjSeq());
		return "/hzszyyhospital/qtsjgl/massEventBox";
	}
	
	/**
	 * 患者解绑
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/qtsjhzjbCommit")
	public @ResponseBody SubmitResultInfo qtsjhzjbCommit(HspQtsjglQueryDto hspQtsjglQueryDto)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		HspQtsjglCustom hspQtsjglCustom = hspQtsjglService.updateEmgQtsjjb(hspQtsjglQueryDto);
		Map<String, Object> sysdata = new HashMap<String, Object>();
		sysdata.put("qtsjSeq", hspQtsjglCustom.getQtsjSeq());
		resultInfo.setSysdata(sysdata);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
}
