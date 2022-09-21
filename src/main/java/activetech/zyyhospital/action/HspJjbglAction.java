package activetech.zyyhospital.action;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
import activetech.zyyhospital.service.HspJjbglInfService;
import activetech.zyyhospital.service.ZyyHspemginfService;
import activetech.zyyhospital.pojo.domain.HspJjbglInfWithBLOBs;
import activetech.zyyhospital.pojo.dto.HspJjbglInfCustom;
import activetech.zyyhospital.pojo.dto.HspJjbglInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspJjbhzmxCustom;

@Controller
@RequestMapping("/jjbgl")
public class HspJjbglAction {
	
	@Autowired
	private HspJjbglInfService hspJjbglInfService;
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
	@Autowired
	private SystemConfigService systemConfigService;
	/**
	 * 跳转交接班管理(护士)
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryjjbgl_h")
	public String queryJjbgl_h(Model model, String moduleid )throws Exception{
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("jjbtype", "H");
		return "/hzszyyhospital/jjbgl/queryjjbgl";
	}
	/**
	 * 跳转交接班管理(医生)
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryjjbgl_y")
	public String queryJjbgl_y(Model model, String moduleid)throws Exception{
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("jjbtype", "Y");
		return "/hzszyyhospital/jjbgl/queryjjbgl";
	}
	
	/**
	 * 获取交接班管理列表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryjjbgl_result")
	public @ResponseBody DataGridResultInfo findJjbgl_result(HspJjbglInfQueryDto hspJjbglInfQueryDto,
			int page,//当前页码
			int rows//每页显示个数
			)throws Exception{
		hspJjbglInfQueryDto = hspJjbglInfQueryDto!=null?hspJjbglInfQueryDto:new HspJjbglInfQueryDto();
		int total=hspJjbglInfService.findHspJjbglInfCount(hspJjbglInfQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspJjbglInfQueryDto.setPageQuery(pageQuery);
		List<HspJjbglInfCustom> list=hspJjbglInfService.findHspJjbglInfList(hspJjbglInfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 获取交接班患者列表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryglhz_result")
	public @ResponseBody DataGridResultInfo findGlhz_result(HspJjbglInfQueryDto hspJjbglInfQueryDto,
			int page,//当前页码
			int rows,//每页显示个数
			String sort,
			String order
			)throws Exception{
		HspemginfQueryDto hspemginfQueryDto = new HspemginfQueryDto();
		HspemginfCustom hspemginfCustom = new HspemginfCustom();
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			hspemginfCustom.setJjbglSeq(hspJjbglInfQueryDto.getHspJjbhzmxCustom().getJjbglSeq());
			hspemginfQueryDto.setHspemginfCustom(hspemginfCustom);
			//查询列表的总数
			if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
				hspemginfQueryDto.setSort("emgdat");
			}
			if(!StringUtils.isNotNullAndEmptyByTrim(order)){
				hspemginfQueryDto.setOrder("desc");
			}
			int total =hspJjbglInfService.findHspJjbhzmxCount(hspJjbglInfQueryDto);
			PageQuery pageQuery = new PageQuery();
			pageQuery.setPageParams(total, rows, page);	
			hspemginfQueryDto.setPageQuery(pageQuery);
			List<HspemginfCustom> list = hspJjbglInfService.findJjbhzmxList(hspemginfQueryDto);
			//填充total
			dataGridResultInfo.setTotal(total);
			//填充rows
			dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 交接班管理删除
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/jjbglhzdeleteCommit")
	public @ResponseBody SubmitResultInfo deletejjbgl(String seq) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspJjbglInfService.deleteHspJjbgl(seq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 交班跳转
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/jiaoban")
	public String jiaoban(String jjbglSeq,Model model,String jjbtype)throws Exception{
		HspJjbglInfWithBLOBs hspJjbglInfCustom = new HspJjbglInfWithBLOBs();
		if(jjbglSeq!=null&&!"".equals(jjbglSeq)){
			//获取交接班主表信息
			hspJjbglInfCustom = hspJjbglInfService.findHspJjbglInf(jjbglSeq);
		}else{
			//生成交接班编号并赋值
			Date regdat=new Date();
			String dateStr = DateUtil.formatDateByFormat(regdat, "yyyyMMdd");
			jjbglSeq=systemConfigService.findSequences("HSP_JJBGL_INF_SEQ","8",dateStr);
		}
		model.addAttribute("jjbtype", jjbtype);
		model.addAttribute("jjbglSeq", jjbglSeq);
		model.addAttribute("hspJjbglInfCustom", hspJjbglInfCustom);
		return "/hzszyyhospital/jjbgl/queryjiao";
	}
	
	/**
	 * 添加患者列表跳转
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryadd")
	public String qureyadd(Model model)throws Exception{
		return "/hzszyyhospital/jjbgl/queryaddlist";
	}
	
	
	/**
	 * 接班跳转
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/jieban")
	public String jieban(String jjbglSeq,Model model)throws Exception{
		HspJjbglInfWithBLOBs hspJjbglInfCustom = new HspJjbglInfWithBLOBs();
		if(jjbglSeq!=null&&!"".equals(jjbglSeq)){
			//获取交接班主表信息
			hspJjbglInfCustom = hspJjbglInfService.findHspJjbglInf(jjbglSeq);
		}
		model.addAttribute("jjbglSeq", jjbglSeq);
		model.addAttribute("hspJjbglInfCustom", hspJjbglInfCustom);
		return "/hzszyyhospital/jjbgl/queryjie";
	}
	
	/**
	 * 添加绑定患者列表查询
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querylqlist")
	public @ResponseBody DataGridResultInfo findlqlist_result(HspemginfQueryDto hspemginfQueryDto,
			int page,//当前页码
			int rows,//每页显示个数
			String sort,
			String order
			)throws Exception{
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			//查询列表的总数
			if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
				hspemginfQueryDto.setSort("emgdat");
			}
			if(!StringUtils.isNotNullAndEmptyByTrim(order)){
				hspemginfQueryDto.setOrder("desc");
			}
			int total =zyyHspemginfService.findHspemginfQjsCountzyy(hspemginfQueryDto);
			PageQuery pageQuery = new PageQuery();
			pageQuery.setPageParams(total, rows, page);	
			hspemginfQueryDto.setPageQuery(pageQuery);
			List<HspemginfCustom> list = zyyHspemginfService.findHspemginfQjsList(hspemginfQueryDto);
			//填充total
			dataGridResultInfo.setTotal(total);
			//填充rows
			dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	

	/**
	 * 添加患者  P为普通 W为危重
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("/addpthz")
	public SubmitResultInfo addpthz(@RequestBody HspJjbglInfQueryDto hspJjbglInfQueryDto)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspJjbglInfService.judgelist(hspJjbglInfQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 解除绑定患者
	 * @param hspJjbhzmxCustom
	 * @return
	 */
	@RequestMapping("unbind")
	public @ResponseBody SubmitResultInfo unbindhz(HspJjbhzmxCustom hspJjbhzmxCustom){
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspJjbglInfService.unbindhz(hspJjbhzmxCustom);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 交班信息提交
	 * @param hspJjbglInfCustom
	 * @return
	 */
	@RequestMapping("jiaobancommit")
	public @ResponseBody SubmitResultInfo jiaobancommit(HspJjbglInfWithBLOBs hspJjbglInfCustom){
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspJjbglInfService.judgejjbgl(hspJjbglInfCustom);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 接班信息提交
	 */
	@RequestMapping("jiebancommit")
	public @ResponseBody SubmitResultInfo jiebancommit(HspJjbglInfWithBLOBs hspJjbglInfCustom){
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspJjbglInfService.updatejieban(hspJjbglInfCustom);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转护理记录
	 * @param model
	 * @param emgSeq
	 * @param cstNam
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("hljl")
	public String queryhljl(Model model,String emgSeq ,String cstNam)throws Exception{
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("cstNam", cstNam);
		return "/hzszyyhospital/jjbgl/jjbHljl";
	}
	
}
