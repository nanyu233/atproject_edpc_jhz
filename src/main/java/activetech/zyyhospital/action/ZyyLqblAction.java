package activetech.zyyhospital.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.annotation.FormToken;
import activetech.base.pojo.domain.Dstcompctl;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.AjaxInfo;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.CompctlService;
import activetech.basehis.pojo.dto.HspAotographInfoCustom;
import activetech.external.pojo.dto.VHemsJyjgQueryDto;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspsqlinfCustom;
import activetech.hospital.service.HspsqlinfService;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.zyyhospital.pojo.domain.HspOperateInf;
import activetech.zyyhospital.pojo.domain.THemsPaperwork;
import activetech.zyyhospital.pojo.dto.HspBasyInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspCfjlInfCustom;
import activetech.zyyhospital.pojo.dto.HspCgxjInfCustom;
import activetech.zyyhospital.pojo.dto.HspDocadviceInfCustom;
import activetech.zyyhospital.pojo.dto.HspJjbjlInfCustom;
import activetech.zyyhospital.pojo.dto.HspLqblInfCustom;
import activetech.zyyhospital.pojo.dto.HspLqbljlQueryDto;
import activetech.zyyhospital.pojo.dto.HspObsvtfstInfCustom;
import activetech.zyyhospital.pojo.dto.HspOperateInfCustom;
import activetech.zyyhospital.pojo.dto.HspOperateInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspQjjlInfCustom;
import activetech.zyyhospital.service.HspBasyInfService;
import activetech.zyyhospital.service.ZyyHspemginfService;
import activetech.zyyhospital.service.ZyyLqblService;
import sun.misc.BASE64Encoder;

@Controller
@RequestMapping("/zyylqbl")
public class ZyyLqblAction {
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
	@Autowired
	private ZyyLqblService zyyLqblService;
//	@Autowired
//	private HspModelInfService hspModelInfService;
	@Autowired
	private HspsqlinfService hspsqlinfService;
	@Autowired
	private CompctlService compctlService;
	@Autowired
	private HspBasyInfService hspBasyInfService;
	
	/*-------------------------------chen-----------------------*/
	/**
	 * 跳转留抢信息登记
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querylr")
	public String querylr(Model model,String trnumber) throws Exception {
		model.addAttribute("trnumber", trnumber);
		return "/hzszyyhospital/hzszyydoctor/lxindex/notelr";
	}
	/**
	 * 跳转留观首页
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryobservenote")
	@FormToken(save=true)
	public String queryObsvtfst(Model model,String emgSeq) throws Exception {
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		
		HspsqlinfCustom hspsqlinfCustom=hspsqlinfService.findLastSql(emgSeq);
		model.addAttribute("hspsqlinfCustom", hspsqlinfCustom);
		
		//获取留观首页
		HspObsvtfstInfCustom hspObsvtfstInfCustom=zyyLqblService.findObsvtfstByEmgSeq(emgSeq);
		model.addAttribute("hspObsvtfstInfCustom", hspObsvtfstInfCustom);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyydoctor/lxindex/observenote";
	}
	
	/**
	 * 保存留观首页
	 * @param hspLqbljlQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/submitlgsy")
	@FormToken(remove=true)
	public @ResponseBody SubmitResultInfo submitlgsy(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		zyyLqblService.submitObsvtfst(hspLqbljlQueryDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 删除留观首页
	 * @param hspLqbljlQueryDto
	 * @throws Exception
	 */
	@RequestMapping("/deletelgsy")
	public @ResponseBody SubmitResultInfo deletelgsy(String obsvtfstSeq)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		zyyLqblService.deleteObsvtfst(obsvtfstSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	/**
	 * 跳转留抢病历
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querylqbl")
	@FormToken(save=true)
	public String querylqbl(Model model,String emgSeq) throws Exception {
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyydoctor/lxrecord/recordnote";
	}
	
	/**
	 * 获取留抢病历
	 * @param hspLqbljlQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findLqbl") 
	public @ResponseBody HspLqblInfCustom findLqbl(String emgSeq)throws Exception{	
		//获取留观首页
		HspLqblInfCustom hspLqblInfCustom=zyyLqblService.findLqblByEmgSeq(emgSeq);
		//获取其它相关数据
		//Map<String, Object> resMap = new HashMap<String, Object>();
		//HspLqbljlQueryDto hspLqbljlQueryDto = zyyLqblService.findRelatedDataByEmgSeq(emgSeq);
		//resMap.put("hspNrsInfCustom",  null == hspLqbljlQueryDto.getHspNrsInfCustom() ? new HspNrsInfCustom() : hspLqbljlQueryDto.getHspNrsInfCustom());
		//resMap.put("hspLqblInfCustom", hspLqblInfCustom);
		return hspLqblInfCustom; 
	}
	
	/**
	 * 保存留抢病历
	 * @param hspLqbljlQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/submitlqbl")
	@FormToken(remove=true)
	public @ResponseBody SubmitResultInfo submitlqbl(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		zyyLqblService.submitLqbl(hspLqbljlQueryDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 删除留观首页
	 * @param hspLqbljlQueryDto
	 * @throws Exception
	 */
	@RequestMapping("/deletelqbl")
	public @ResponseBody SubmitResultInfo deletelqbl(String lqblSeq)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		zyyLqblService.deletelqbl(lqblSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转出观小结
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querycgxj")
	@FormToken(save=true)
	public String querycgxj(Model model) {
		return "/hzszyyhospital/hzszyydoctor/lxsummary/viewsummary";
	}
	
	/**
	 * @Description 获取出观小结数据
	 * @author machaofan
	 * @date 2020年8月13日上午10:39:53
	 * @param emgSeq 预检号
	 * @return
	 * @return SubmitResultInfo
	 */
	@ResponseBody
	@RequestMapping(value = "/getCgxjByEmgSeq")
	public SubmitResultInfo getCgxjByEmgSeq(String emgSeq) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
			HspCgxjInfCustom hspCgxjInfCustom=zyyLqblService.findCgxjByEmgSeq(emgSeq);
			map.put("hspemginfCustom", hspemginfCustom);
			map.put("hspCgxjInfCustom", hspCgxjInfCustom);
		} catch (Exception e) {
			resultInfo = ResultUtil.createFail(Config.MESSAGE, 900,null);
			e.printStackTrace();
		}
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 保存出观小结
	 * @param hspLqbljlQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/submitcgxj")
	@FormToken(remove=true)
	public @ResponseBody SubmitResultInfo submitcgxj(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		zyyLqblService.submitCgxj(hspLqbljlQueryDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 删除出观小结
	 * @param hspLqbljlQueryDto
	 * @throws Exception
	 */
	@RequestMapping("/deletecgxj")
	public @ResponseBody SubmitResultInfo deletecgxj(String cgxjSeq)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		zyyLqblService.deletecgxj(cgxjSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/*-------------------------------zhang----------------------*/
	/**
	 * 跳转查房记录
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toquerycfjl")
	public String toquerycfjl(Model model, String moduleid,String emgSeq,String flag) throws Exception {
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("flag", flag);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyydoctor/cfjl/querycfjl";
	}
	
	/**
	 * 查房记录列表结果集
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querycfjl_result")
	public @ResponseBody DataGridResultInfo querycfjl_result(Model mode, 
			HspLqbljlQueryDto hspLqbljlQueryDto,
			String sort,
			String order,
			int page,//当前页码
			int rows//每页显示个数
			) throws Exception{
			//查询列表的总数
			if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
				hspLqbljlQueryDto.setSort("cfjlDat");
			}
			if(!StringUtils.isNotNullAndEmptyByTrim(order)){
				hspLqbljlQueryDto.setOrder("desc");
			}
			
			int total =zyyLqblService.findhspCfjlInfcount(hspLqbljlQueryDto);	
			PageQuery pageQuery = new PageQuery();
			pageQuery.setPageParams(total, rows, page);
			hspLqbljlQueryDto.setPageQuery(pageQuery);
			List<HspCfjlInfCustom> list =zyyLqblService.findhspCfjlInfList(hspLqbljlQueryDto);
		
			DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			//填充total
			dataGridResultInfo.setTotal(total);
			//填充rows
			dataGridResultInfo.setRows(list);
			return dataGridResultInfo;
			}
	
	/**
	 * 跳转新增查房记录
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toinsertcfjl")
	public String toinsertcfjl(Model model, String moduleid,String emgSeq,String flag) throws Exception {
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("flag", flag);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyydoctor/cfjl/addcfjl";
	}
	
	/**
	 * 新增查房记录提交
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/insertcfjl")
	public @ResponseBody SubmitResultInfo insertcfjl(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String onlySeq = zyyLqblService.addcfjlsubmit(hspLqbljlQueryDto);
		Map<String, Object> sysdata = new HashMap<String, Object>();
		sysdata.put("onlySeq", onlySeq);
		resultInfo.setSysdata(sysdata);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	/**
	 * 删除查房记录
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deletecfjl")
	public @ResponseBody SubmitResultInfo deletecfjl(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		zyyLqblService.delcfjl(hspLqbljlQueryDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转修改查房记录
	 * @param model
	 * @return
	 */
	@RequestMapping("/toupdatecfjl")
	public String toUpdate(Model model,String cfjlSeq,String emgSeq)throws Exception{
		HspCfjlInfCustom hspCfjlInfCustom = zyyLqblService.findHspCfjlInfbyid(cfjlSeq);
		model.addAttribute("hspCfjlInfCustom",hspCfjlInfCustom);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyydoctor/cfjl/editcfjl";
	}
	
	/**
	 * 修改查房记录
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editcfjl")
	public @ResponseBody SubmitResultInfo editcfjl(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String onlySeq = zyyLqblService.updatecfjl(hspLqbljlQueryDto, activeUser);
		Map<String, Object> sysdata = new HashMap<String, Object>();
		sysdata.put("onlySeq", onlySeq);
		resultInfo.setSysdata(sysdata);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转交接班记录
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toqueryjjbjl")
	public String toqueryjjbjl(Model model, String moduleid,String emgSeq,String flag) throws Exception {
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("flag", flag);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyydoctor/jjbjl/queryjjbjl";
	}
	
	/**
	 * 交接班记录列表结果集
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryjjbjl_result")
	public @ResponseBody DataGridResultInfo queryjjbjl_result(Model mode, 
			HspLqbljlQueryDto hspLqbljlQueryDto,
			String sort,
			String order,
			int page,//当前页码
			int rows//每页显示个数
			) throws Exception{
			//查询列表的总数
			if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
				hspLqbljlQueryDto.setSort("jjbjlDat");
			}
			if(!StringUtils.isNotNullAndEmptyByTrim(order)){
				hspLqbljlQueryDto.setOrder("desc");
			}
			
			int total =zyyLqblService.findhspJjbjlInfcount(hspLqbljlQueryDto);	
			PageQuery pageQuery = new PageQuery();
			pageQuery.setPageParams(total, rows, page);
			hspLqbljlQueryDto.setPageQuery(pageQuery);
			List<HspJjbjlInfCustom> list =zyyLqblService.findhspJjbjlInfList(hspLqbljlQueryDto);
		
			DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			//填充total
			dataGridResultInfo.setTotal(total);
			//填充rows
			dataGridResultInfo.setRows(list);
			return dataGridResultInfo;
			}
	
	/**
	 * 跳转新增交接班记录
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toinsertjjbjl")
	public String oinsertjjbjl(Model model, String moduleid,String emgSeq, String flag) throws Exception {
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("flag", flag);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyydoctor/jjbjl/addjjbjl";
	}
	
	/**
	 * 新增交接班记录提交
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/insertjjbjl")
	public @ResponseBody SubmitResultInfo insertjjbjl(HspLqbljlQueryDto hspLqbljlQueryDto)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		zyyLqblService.addjjbjlsubmit(hspLqbljlQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	/**
	 * 删除交接班记录
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deletejjbjl")
	public @ResponseBody SubmitResultInfo deletejjbjl(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		zyyLqblService.deljjbjl(hspLqbljlQueryDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转修改交接班记录
	 * @param model
	 * @return
	 */
	@RequestMapping("/toupdatejjbjl")
	public String toupdatejjbjl(Model model,String jjbjlSeq,String emgSeq)throws Exception{
		HspJjbjlInfCustom hspJjbjlInfCustom = zyyLqblService.findHspjjbjlInfbyid(jjbjlSeq);
		model.addAttribute("hspJjbjlInfCustom",hspJjbjlInfCustom);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyydoctor/jjbjl/editjjbjl";
	}
	
	/**
	 * 修改交接班记录
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editjjbjl")
	public @ResponseBody SubmitResultInfo editjjbjl(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		zyyLqblService.updatejjbjl(hspLqbljlQueryDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转抢救记录
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toqueryqjjl")
	public String toqueryqjjl(Model model, String moduleid,String emgSeq) throws Exception {
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("emgSeq", emgSeq);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyydoctor/qjjl/queryqjjl";
	}
	
	/**
	 * 抢救记录列表结果集
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryqjjl_result")
	public @ResponseBody DataGridResultInfo queryqjjl_result(Model mode, 
			HspLqbljlQueryDto hspLqbljlQueryDto,
			String sort,
			String order,
			int page,//当前页码
			int rows//每页显示个数
			) throws Exception{
			//查询列表的总数
			if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
				hspLqbljlQueryDto.setSort("QJJL_DAT_START");
			}
			if(!StringUtils.isNotNullAndEmptyByTrim(order)){
				hspLqbljlQueryDto.setOrder("desc");
			}
			
			int total =zyyLqblService.findhspQjjlInfcount(hspLqbljlQueryDto);	
			PageQuery pageQuery = new PageQuery();
			pageQuery.setPageParams(total, rows, page);
			hspLqbljlQueryDto.setPageQuery(pageQuery);
			List<HspQjjlInfCustom> list =zyyLqblService.findhspQjjlInfList(hspLqbljlQueryDto);
		
			DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			//填充total
			dataGridResultInfo.setTotal(total);
			//填充rows
			dataGridResultInfo.setRows(list);
			return dataGridResultInfo;
		}	
	
	/**
	 * 跳转新增抢救记录
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toinsertqjjl")
	public String toinsertqjjl(Model model, String moduleid,String emgSeq) throws Exception {
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("emgSeq", emgSeq);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyydoctor/qjjl/addjqjjl";
	}
	
	/**
	 * 新增抢救记录提交
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/insertqjjl")
	public @ResponseBody SubmitResultInfo insertqjjl(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String onlySeq = zyyLqblService.addqjjlsubmit(hspLqbljlQueryDto);
		Map<String, Object> sysdata = new HashMap<String, Object>();
		sysdata.put("onlySeq", onlySeq);
		resultInfo.setSysdata(sysdata);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	/**
	 * 删除抢救记录
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deleteqjjl")
	public @ResponseBody SubmitResultInfo deleteqjjl(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		zyyLqblService.delqjjl(hspLqbljlQueryDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转修改抢救记录
	 * @param model
	 * @return
	 */
	@RequestMapping("/toupdateqjjl")
	public String toupdateqjjl(Model model,String qjjlSeq,String emgSeq)throws Exception{
		HspQjjlInfCustom hspQjjlInfCustom = zyyLqblService.findHspqjjlInfbyid(qjjlSeq);
		model.addAttribute("hspQjjlInfCustom",hspQjjlInfCustom);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyydoctor/qjjl/editqjjl";
	}
	
	/**
	 * 修改抢救记录
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editqjjl")
	public @ResponseBody SubmitResultInfo editqjjl(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String onlySeq = zyyLqblService.updateqjjl(hspLqbljlQueryDto, activeUser);
		Map<String, Object> sysdata = new HashMap<String, Object>();
		sysdata.put("onlySeq", onlySeq);
		resultInfo.setSysdata(sysdata);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转医嘱信息
	 * @param model 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toquerycfxx")
	public String toquerycfxx(Model model,String moduleid,String emgSeq,String pageFlag) throws Exception {
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("pageFlag", pageFlag);
		model.addAttribute("sqlDat",DateUtil.formatDateByFormat( hspemginfCustom.getSqlDate(), "yyyy/MM/dd HH:mm"));
		model.addAttribute("emgDat",DateUtil.formatDateByFormat( hspemginfCustom.getEmgDat(), "yyyy/MM/dd HH:mm"));
		model.addAttribute("mpi", hspemginfCustom.getMpi());
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyydoctor/yzxx/queryyzxx";
	}
	
	
	/**
	 * 跳转医嘱信息
	 * @param model 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toaddyzxx")
	public String toaddyzxx(Model model,String moduleid,String emgSeq) throws Exception {
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
		model.addAttribute("vstCad", hspemginfCustom.getVstCad());
		model.addAttribute("moduleid", moduleid);
		return "/hzszyyhospital/hzszyydoctor/yzxx/addyzxx";
	}
	
	/**
	 * 医嘱信息提交
	 * @param model 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/insertyzxx")
	public @ResponseBody SubmitResultInfo insertyzxx(VHemsJyjgQueryDto vHemsJyjgQueryDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		zyyLqblService.insertyzxx(vHemsJyjgQueryDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 医嘱信息获取医嘱导入模板大类
	 * @param model 
	 * @return
	 * @throws Exception
	 */
//	@RequestMapping("/querydocadvicelist")
//	public @ResponseBody List<HspModelInfCustom> querydocadvicelist()throws Exception{
//		String modelContent="1";
//		List<HspModelInfCustom> list=hspModelInfService.finddocadviceList(modelContent);
//		return list;
//	}
	
	/**
	 * 医嘱信息根据大类获取内容
	 * @param model 
	 * @return
	 * @throws Exception
	 */
//	@RequestMapping("/querydocadviceconlist")
//	public @ResponseBody DataGridResultInfo querydocadviceconlist(HspModelInfQueryDto hspModelInfQueryDto)throws Exception{
//		hspModelInfQueryDto=hspModelInfQueryDto!=null?hspModelInfQueryDto:new HspModelInfQueryDto();
//
//		int total=hspModelInfService.finddocadviceconListallCount(hspModelInfQueryDto);
//		List<HspModelcontInfCustom> list=hspModelInfService.finddocadviceconallList(hspModelInfQueryDto);
//		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
//		//填充total
//		dataGridResultInfo.setTotal(total);
//		//填充rows
//		dataGridResultInfo.setRows(list);
//		return dataGridResultInfo;
//	}
	
	/**
	 * 跳转医嘱信息修改
	 * @param model 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toupdateyzxx")
	public String toupdateyzxx(Model model,String docadviceSeq) throws Exception {
		HspDocadviceInfCustom hspDocadviceInfCustom = new HspDocadviceInfCustom();
		if(StringUtils.isNotNullAndEmptyByTrim(docadviceSeq)){
			hspDocadviceInfCustom=zyyLqblService.findyzxxbyid(docadviceSeq);
		}
		model.addAttribute("hspDocadviceInfCustom",hspDocadviceInfCustom);
		return "/hzszyyhospital/hzszyydoctor/yzxx/edityzxx";
	}
	
	/**
	 * 修改医嘱记录提交
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/edityzxx")
	public @ResponseBody SubmitResultInfo edityzxx(VHemsJyjgQueryDto vHemsJyjgQueryDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		zyyLqblService.updateyzxx(vHemsJyjgQueryDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	/**
	 * 删除医嘱信息
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deleteyzxx")
	public @ResponseBody SubmitResultInfo deleteyzxx(@RequestBody List<HspDocadviceInfCustom> hspDocadviceInfCustomlist,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		zyyLqblService.delyzxx(hspDocadviceInfCustomlist, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	


	
	/**
	 * 跳转用户签名
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/zyyqueryuser")
	public String queryuser(Model mode, String emgSeq,String userid) throws Exception{
		mode.addAttribute("emgSeq", emgSeq);
		mode.addAttribute("userid", userid);
		return "/hzszyyhospital/hzszyydoctor/yzxx/zyyqueryuser";
	}
	
	/**
	 * 医嘱信息保存ajax
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/insertyzxxajax")
	public @ResponseBody SubmitResultInfo insertyzxxajax(@RequestBody List<HspDocadviceInfCustom> hspDocadviceInfCustomlist,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		zyyLqblService.insertyzxxajax(hspDocadviceInfCustomlist, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	/**
	 * 医嘱信息批量入库
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/inseryzxxbatch")
	public @ResponseBody SubmitResultInfo inseryzxxbatch(VHemsJyjgQueryDto vHemsJyjgQueryDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		zyyLqblService.inseryzxxbatch(vHemsJyjgQueryDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转留抢病历护理记录列表
	 *@param model
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/lqblquerynote")
	public String lqblquerynote(Model model,String emgSeq,String moduleid) throws Exception{
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("moduleid", moduleid);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		HspObsvtfstInfCustom hspObsvtfstInfCustom=zyyLqblService.findObsvtfstByEmgSeq(emgSeq);
		model.addAttribute("cyrqDat",hspObsvtfstInfCustom.getDscgDatStr());
		model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
		return "/hzszyyhospital/hzszyydoctor/lqblquerynote";
	}
	
	/**
	  * 留抢病历体温单
	  *@param model
	  *@return
	  *@author 
	  */
	 @RequestMapping("/lqbltpct")
	 public String lqbltpct(Model model,String emgSeq){
		 model.addAttribute("emgSeq", emgSeq);
		 return "/hzszyyhospital/hzszyydoctor/lqbltpct";
	 }
	 /**
	  * 留抢病历体温单获取流
	  *@param model
	  *@return
	  *@author 
	  */
	 @RequestMapping("/lqbltpctbyte")
	 public @ResponseBody SubmitResultInfo lqbltpctbyte(String emgSeq) throws Exception{
		 ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		 byte[] byt= zyyLqblService.lqbltpctbyte(emgSeq);
		 Map<String, Object> map=new HashMap<String, Object>(3);
		 if(byt!=null){
			 BASE64Encoder encoder = new BASE64Encoder();
			 String str=encoder.encode(byt);		
			 map.put("str", str);
		 }else{
			 map.put("str", "无数据");
		 }
		 resultInfo.setSysdata(map);
		 return ResultUtil.createSubmitResult(resultInfo);
	 }
	
	/*-------------------------------wu-------------------------*/
	
	/**
	 * 查询登陆用户是否有权限操作
	 * @param model
	 * @param cratNbr 创建用户
	 * @param activeuser 当前登录用户信息
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/checkRoleAjax")
	 public @ResponseBody SubmitResultInfo checkRoleAjax(String cratNbr,ActiveUser activeuser) throws Exception{
		 ResultInfo resultInfo=ResultUtil.createSuccess(Config.MESSAGE,906,null);
		 //权限参数（tourist:游客无任何操作权限，nurse：护士有打印权限，doctor：医生（与创建人不为同一人）拥有签名和打印权限，doctorSelf医生（与创建人为同一人）拥有保存修改、签名、打印权限，admin:管理员权限拥有所有权限）
		 //默认无权限
		 String permissions = "tourist";
		 //登陆人员若是系统管理员，则直接开发权限
		 if("admin".equals(activeuser.getUsrno())){
			 permissions = "admin";
		 }else {
			 //登陆用户的角色
			 String a_roles = activeuser.getDstroleList().toString();
			 //拥有角色
			 if(StringUtils.isNotNullAndEmptyByTrim(a_roles)) {
				//登陆用户角色是否包含护士、护士长、护士操作组长 、急救中心主任或者是病历查看角色，则有打印权限
				 //如果是会诊医生在会诊列表页面上有 会诊回复权限（会诊医生权限判断在页面上做），其他页面则与护士相同
				 if(a_roles.contains("1001") || a_roles.contains("1002") || a_roles.contains("1003") || a_roles.contains("1004") || a_roles.contains("1901") || a_roles.contains("1014") ){
					 permissions = "nurse";
				 }
				 //拥有日常医生角色 则有新增、签名、打印权限
				 if(a_roles.contains("1009")) {
					 permissions = "doctor";
					//创建人等于当前登录人则有 新增、修改、签名、打印等所有权限
					 if(activeuser.getUsrno().equals(cratNbr)) {
						 permissions = "doctorSelf";
					 }
				 }
			 }
		 }
		 resultInfo.setMessage(permissions);
		 return ResultUtil.createSubmitResult(resultInfo);
	 }
	
	/**
	 * 跳转系统评估入院评估单
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryhlpgNote")
	//@FormToken(save=true)
	public String queryhlpgNote(Model model,String emgSeq) throws Exception {
		model.addAttribute("emgSeq", emgSeq);
		return "/hzszyyhospital/hzszyydoctor/hlpgNote";
	}
	
	
	/**
	 * 跳转自定义抬头
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toqueryzdy")
	public String toqueryzdy(Model model, String moduleid,String emgSeq,String flag) throws Exception {
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("flag", flag);//flag传9
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyydoctor/cfjl/queryzdy";
	}
	
	/**
	 * 自定义抬头列表结果集
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryzdy_result")
	public @ResponseBody DataGridResultInfo queryzdy_result(Model mode, 
			HspLqbljlQueryDto hspLqbljlQueryDto,
			String sort,
			String order,
			int page,//当前页码
			int rows//每页显示个数
			) throws Exception{
			//查询列表的总数
			if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
				hspLqbljlQueryDto.setSort("cfjlDat");
			}
			if(!StringUtils.isNotNullAndEmptyByTrim(order)){
				hspLqbljlQueryDto.setOrder("desc");
			}
			
			int total =zyyLqblService.findhspCfjlInfcount(hspLqbljlQueryDto);	//CFJL_TYPE 传9
			PageQuery pageQuery = new PageQuery();
			pageQuery.setPageParams(total, rows, page);
			hspLqbljlQueryDto.setPageQuery(pageQuery);
			List<HspCfjlInfCustom> list =zyyLqblService.findhspCfjlInfList(hspLqbljlQueryDto);
		
			DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			//填充total
			dataGridResultInfo.setTotal(total);
			//填充rows
			dataGridResultInfo.setRows(list);
			return dataGridResultInfo;
			}
	
	/**
	 * 跳转新增自定义页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toinsertzdy")
	public String toinsertzdy(Model model, String moduleid,String emgSeq,String flag) throws Exception {
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("flag", flag);//传9
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyydoctor/cfjl/addzdy";
	}
	
	/**
	 * 新增自定义记录提交
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/insertzdy")
	public @ResponseBody SubmitResultInfo insertzdy(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String onlySeq = zyyLqblService.addcfjlsubmit(hspLqbljlQueryDto);
		Map<String, Object> sysdata = new HashMap<String, Object>();
		sysdata.put("onlySeq", onlySeq);
		resultInfo.setSysdata(sysdata);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	/**
	 * 删除自定义记录
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deletezdy")
	public @ResponseBody SubmitResultInfo deletezdy(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		zyyLqblService.delcfjl(hspLqbljlQueryDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转修改自定义记录
	 * @param model
	 * @return
	 */
	@RequestMapping("/toupdatezdy")
	public String toUpdateZdy(Model model,String cfjlSeq,String emgSeq)throws Exception{
		HspCfjlInfCustom hspCfjlInfCustom = zyyLqblService.findHspCfjlInfbyid(cfjlSeq);
		model.addAttribute("hspCfjlInfCustom",hspCfjlInfCustom);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyydoctor/cfjl/editzdy";
	}
	
	/**
	 * 修改自定义记录
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editzdy")
	public @ResponseBody SubmitResultInfo editzdy(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String onlySeq = zyyLqblService.updatecfjl(hspLqbljlQueryDto, activeUser);
		Map<String, Object> sysdata = new HashMap<String, Object>();
		sysdata.put("onlySeq", onlySeq);
		resultInfo.setSysdata(sysdata);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	/**
	 * 跳转病案首页
	 * @param model
	 * @param emgSeq
	 * @return
	 */
	@RequestMapping(value = "/medicalRecord")
	public String medicalRecord(Model model,String emgSeq) {
		model.addAttribute("emgSeq",emgSeq);
		return "/hzszyyhospital/hzszyydoctor/medicalRecord/medicalRecord";
	}
	
	
	/**
	 * 病案首页数据返回
	 * @param hspBasyQueryDto
	 * @return
	 * @throws Exception 
	 */
	@ResponseBody
	@RequestMapping(value = "/medicalRecord_result")
	public AjaxInfo medicalRecord_result(HspBasyInfQueryDto hspBasyQueryDto) throws Exception {
		AjaxInfo ajaxInfo = new AjaxInfo();
		Map<String,Object> map = new HashMap<String,Object>();
		//病案首页数据
		hspBasyQueryDto = hspBasyInfService.medicalRecord_result(hspBasyQueryDto);
		//急诊科室列表
		List<Dstcompctl> jzkscompctlList = compctlService.getJzksCompctlList();
		
		map.put("hspBasyQueryDto", hspBasyQueryDto);
		map.put("jzkscompctlList", jzkscompctlList);
		ajaxInfo.setMsg(map);
		return ajaxInfo;
	}
	
	/**
	 * 保存病案首页
	 * @param hspBasyQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/addMedicalRecord")
	public SubmitResultInfo  addMedicalRecord(HspBasyInfQueryDto hspBasyQueryDto, ActiveUser activeUser) throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspBasyInfService.addMedicalRecord(hspBasyQueryDto, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
	/**
	 * 跳转手术操作记录页面
	 * @param model
	 * @param emgSeq
	 * @return
	 */
	@RequestMapping(value = "/operate")
	public String operate(Model model ,String emgSeq)  throws Exception {	
		HspemginfCustom hspEmgInfCustom = zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("emgSeq",emgSeq);
		model.addAttribute("hspemginfCustom",hspEmgInfCustom);
		return "/hzszyyhospital/hzszyydoctor/diseaseCourse/queryOperation";
	}
	
	
	/**
	 * 跳转手术操作记录页面
	 * @param model
	 * @param emgSeq
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping(value = "/saveAndEditOperate")
	public String saveAndEditOperate(Model model, String operSeq, String emgSeq) throws Exception {
		HspemginfCustom hspEmgInfCustom = zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("operSeq",operSeq);
		model.addAttribute("hspemginfCustom",hspEmgInfCustom);
		return "/hzszyyhospital/hzszyydoctor/diseaseCourse/updateOperation";
	}
	
	/**
	 * 跳转手术诊断录入
	 * @param model
	 * @param emgSeq
	 * @return
	 */
	@RequestMapping(value ="/operatelr")
	public String operatelr(Model model ,String emgSeq, String operSeq) {
		model.addAttribute("emgSeq",emgSeq);
		model.addAttribute("operSeq",operSeq);
		return "/hzszyyhospital/hzszyydoctor/medicalRecord/operatelr";
	}
	
	
	/**
	 * 通过operSeq获取手术操作数据
	 * @param operSeq
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/findOperateBySeq")
	public SubmitResultInfo findOperateBySeq(String operSeq) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		Map<String,Object> map = new HashMap<String, Object>();
		HspOperateInf operateInf = hspBasyInfService.findOperateBySeq(operSeq);
		map.put("operateInf", operateInf);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 通过emg_seq查询该患者的手术操作列表数据
	 * @param hspOperateInfQueryDto
	 * @param page 当前页码
	 * @param rows 每页显示个数
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/findOperateListByEmgSeq")
	public DataGridResultInfo findOperateListByEmgSeq(HspOperateInfQueryDto hspOperateInfQueryDto,int page,int rows) {
 		int total = hspBasyInfService.findOperateListCount(hspOperateInfQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspOperateInfQueryDto.setPageQuery(pageQuery);
		List<HspOperateInfCustom> hspOperateList = hspBasyInfService.findOperateListByEmgSeq(hspOperateInfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(hspOperateList);
		return dataGridResultInfo;
	}
	
	/**
	 * 新增/修改手术操作情况
	 * @param hspSsczqkCustom
	 * @param activeUser
	 * @return
	 * @throws Exception 
	 */
	@ResponseBody
	@RequestMapping(value = "/addOperatelr")
	public SubmitResultInfo addOperatelr(HspOperateInfCustom hspOperateCustom, ActiveUser activeUser) throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String onlySeq = hspBasyInfService.addOperatelr(hspOperateCustom,activeUser);
		Map<String, Object> sysdata = new HashMap<String, Object>();
		sysdata.put("onlySeq", onlySeq);
		resultInfo.setSysdata(sysdata);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 通过oper_seq删除手术操作数据
	 * @param operSeq
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/deloperateBySeq")
	public SubmitResultInfo deloperateBySeq(String operSeq) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspBasyInfService.delOperateBySeq(operSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 医嘱打印后续操作
	 * 更新打印页，更新打印内容标志
	 * @param vHemsJyjgQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/afterprint")
	public @ResponseBody SubmitResultInfo afterPrint(@RequestBody VHemsJyjgQueryDto vHemsJyjgQueryDto) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		zyyLqblService.afterPrint(vHemsJyjgQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 获取医嘱打印页
	 * @param emgSeq
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findyzdyy")
	public @ResponseBody String findYzdyy(String emgSeq,String printType,Date startdate)throws Exception{
		HspemginfCustom hspemginfCustom = zyyHspemginfService.findHspemginfCustom(emgSeq,printType,startdate,new Date());
		return hspemginfCustom.getPrintPage();
	}
	
	
	/**
	 * 获取历史病历数据-知识库
	 * @param hspBasyQueryDto
	 * @return
	 * @throws Exception 
	 */
	@ResponseBody
	@RequestMapping(value = "/getlslqblListAjax")
	public AjaxInfo getlslqblListAjax(String vstCad) throws Exception {
		AjaxInfo ajaxInfo = new AjaxInfo();
		Map<String,Object> map = new HashMap<String,Object>();
		List<HspLqblInfCustom> lslqblList = zyyLqblService.getLslqblList(vstCad);
		map.put("lslqblList", lslqblList);
		ajaxInfo.setMsg(map);
		return ajaxInfo;
	}
	
	

	/**
	 * 导入今日门急诊病历
	 * @param emgSeq
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/findMzblByEmgSeq")
	public ResultInfo findMzblByEmgSeq(String emgSeq) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, Object> map = new HashMap<String,Object>();
		try {
			HspLqblInfCustom hspLqblInfCustom = zyyLqblService.findMzblByEmgSeq(emgSeq);
			map.put("hspLqblInfCustom", hspLqblInfCustom);
		} catch (Exception e) {
			resultInfo = ResultUtil.createFail(Config.MESSAGE,900, null);
			e.printStackTrace();
		}
		resultInfo.setSysdata(map);
		return resultInfo;
	}
	
	/**
	 * 留抢病历签名
	 * @param hspLqbljlQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getSign")
	public @ResponseBody SubmitResultInfo submitDzqm(HspAotographInfoCustom hspAotographInfoCustom, ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		zyyLqblService.submitDzqm(hspAotographInfoCustom, activeUser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 留抢病历签名
	 * @param hspLqbljlQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findDzqmImg")
	public @ResponseBody SubmitResultInfo findDzqmImg(HspAotographInfoCustom hspAotographInfoCustom)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		List<HspAotographInfoCustom> hspAotographInfoCustomList = zyyLqblService.findDzqmImg(hspAotographInfoCustom);
		Map<String, Object> sysdata = new HashMap<String, Object>();
		sysdata.put("hspAotographInfoCustomList", hspAotographInfoCustomList);
		resultInfo.setSysdata(sysdata);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转病历导入页面
	 * @param model
	 * @param mpi
	 * @return
	 */
	@RequestMapping("/medicalmport")
	public String Medicalmport(Model model,String typeSource) {
		model.addAttribute("typeSource",typeSource);
		return "/hzszyyhospital/hzszyydoctor/lxrecord/historyRecord";
	}
	

	/**
	 * 获取病程录列表
	 * @param emgSeq
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getBclAjax")
	public @ResponseBody SubmitResultInfo getBclAjax(String emgSeq) throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
        Map<String, Object> map = new HashMap<String, Object>();
        //获取急诊留抢病历list
        List<THemsPaperwork> bclList = zyyLqblService.findBclbBySeq(emgSeq);
		map.put("bclList", bclList);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	
}
