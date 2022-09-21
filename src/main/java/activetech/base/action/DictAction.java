package activetech.base.action;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.domain.Dstdicttype;
import activetech.base.pojo.dto.DstdictinfoCustom;
import activetech.base.pojo.dto.DstdictinfoQueryDto;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ExceptionResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.DictService;
import activetech.base.service.SystemConfigService;

/**
 * 
 * <p>Title:DicAction</p>
 * <p>Description:数据字典</p>
 * <p>activetech</p>
 * @author lpp
 * @date 2017-1-10 上午8:45:20
 *
 */
@Controller
@RequestMapping("/dict")
public class DictAction {
	@Autowired
	private DictService dictService;
	@Autowired
	private SystemConfigService systemConfigService;
	/**
	 * 跳转数据字典列表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querydict")
	public String querydict(Model model,String typecode,String moduleid) throws Exception{
		model.addAttribute("typecode", typecode);
		model.addAttribute("moduleid", moduleid);
		return View.toBase("/dict/querydict");
	}
	
	@RequestMapping("/querydicttype")
	public String querydicttype(Model model,String moduleid) throws Exception{
		model.addAttribute("moduleid", moduleid);
		return View.toBase("/dict/querydicttype");
	}
	
	
	/**
	 * 数据字典查询结果集
	 * @param dstdictinfoQueryDto
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querydict_result")
	public @ResponseBody DataGridResultInfo querydict_result(
			DstdictinfoQueryDto dstdictinfoQueryDto,
			int page,//当前页码
			int rows//每页显示个数
			) throws Exception{
		//非空校验
		dstdictinfoQueryDto = dstdictinfoQueryDto!=null?dstdictinfoQueryDto:new DstdictinfoQueryDto();
		
		//查询列表的总数
		int total = dictService.findDictCount(dstdictinfoQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		dstdictinfoQueryDto.setPageQuery(pageQuery);
		List<DstdictinfoCustom> list = dictService.findDictList(dstdictinfoQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 跳转数据字典新增
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/adddict")
	public String adddict(Model model,String typecode) throws Exception{
		Dstdicttype dstdicttype = dictService.findDicttypeByTypecode(typecode);
		int max=dictService.getMaxinfocodeByTypecode(typecode)+1;
		model.addAttribute("typename", dstdicttype.getTypename());
		model.addAttribute("typecode", typecode);
		model.addAttribute("dictsort", max);
		return View.toBase("/dict/adddict");
	}
	/**
	 * 跳转新增提交（提交结果转json输出页面、提交表单数据统一使用包装类）
	 * @param dstdictinfoQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/adddictsubmit")
	public @ResponseBody SubmitResultInfo adddictsubmit(DstdictinfoQueryDto dstdictinfoQueryDto)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		//获取数据字典类型
		//typecode = dstdictinfoQueryDto.getDstdictinfoCustom().getTypecode();
		dictService.insertDict(dstdictinfoQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 跳转数据字典修改
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editdict")
	public String editdict(Model model,String id)throws Exception{
		//根据id获取数据字典信息并传回页面
		DstdictinfoCustom dstdictinfoCustom = dictService.findDictById(id);
		String typecode = dstdictinfoCustom.getTypecode();
		Dstdicttype dstdicttype = dictService.findDicttypeByTypecode(typecode);
		model.addAttribute("typename", dstdicttype.getTypename());
		model.addAttribute("dstdictinfoCustom", dstdictinfoCustom);
		return View.toBase("/dict/editdict");
	}
	/**
	 * 数据字典修改提交
	 * @param id
	 * @param dstdictinfoQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editdictsubmit")
	public @ResponseBody SubmitResultInfo editdictsubmit(String id,DstdictinfoQueryDto dstdictinfoQueryDto)throws Exception{
		id = dstdictinfoQueryDto.getDstdictinfoCustom().getId();
		dictService.updateDict(id, dstdictinfoQueryDto.getDstdictinfoCustom());
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	
	/**
	 * 删除数据字典
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deletedict")
	public @ResponseBody SubmitResultInfo deletedict(String id) throws Exception{
		dictService.deleteDict(id);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	
	/**
	 * 查询数据字典
	 */
	@RequestMapping("/querydicttype_result")
	public @ResponseBody DataGridResultInfo queryRole_result() throws Exception{
		List<Dstdicttype> list = dictService.findDictTypeList();
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	/**
	 * 批量提交设置
	 * @param dstdictinfoQueryDto
	 * @param types
	 * @param indexs
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/plszsubmit")
	public @ResponseBody SubmitResultInfo shezhikysubmit(DstdictinfoQueryDto dstdictinfoQueryDto)throws Exception{
	  // 页面提交的业务数据（多个），要处理的业务数据，页面中传入的参数
	  List<DstdictinfoCustom> list = dstdictinfoQueryDto.getDstdictinfoCustoms();
	  String[] array=dstdictinfoQueryDto.getIndexs().split(",");
      // 处理数据的总数
	  int count = array.length;
	  // 处理成功的数量
	  int count_success = 0;
	  // 处理失败的数量
	  int count_error = 0;
	  // 处理失败的原因
	 List<ResultInfo> msgs_error = new ArrayList<ResultInfo>();
     for (int i = 0; i < count; i++) {
		 ResultInfo resultInfo = null;
         // 根据选中行的序号获取要处理的业务数据(单个)
		 DstdictinfoCustom dstdictinfoCustom = list.get(Integer.parseInt(array[i]));
		 //获取主键值
		 String id = dstdictinfoCustom.getId();
		 try {
			 DstdictinfoCustom  dstdictinfoCustom_edit=dictService.findDictById(id);
			 dstdictinfoCustom_edit.setIsenable(dstdictinfoQueryDto.getIsenable());
			 dictService.updateDict(id, dstdictinfoCustom_edit);
		} catch (Exception e) {
			e.printStackTrace();
			// 进行异常解析
			if (e instanceof ExceptionResultInfo) {
				resultInfo = ((ExceptionResultInfo) e).getResultInfo();
			 } else {
				// 构造未知错误异常
				resultInfo = ResultUtil.createFail(Config.MESSAGE, 900,
						null);
			}
		}
		if (resultInfo == null) {
			// 说明成功
			count_success++;
		} else {
			count_error++;
			// 记录失败原因
			msgs_error.add(resultInfo);
		}
	 }
	 // 提示用户成功数量、失败数量、失败原因
	 // 改成返回详细信息
	 return ResultUtil.createSubmitResult(
			 ResultUtil.createSuccess(Config.MESSAGE, 907, new Object[] {
	 count_success, count_error }), msgs_error);
	}
	/**
	 * 公共查询下拉列表
	 * @param typecode
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findDictinfoByType")
	public @ResponseBody List<Dstdictinfo> findDictinfoByType(String typecode) throws Exception{
		List<Dstdictinfo> statList = systemConfigService.findDictinfoByType(typecode);
		return statList;
	}
	
	
	/**
	 * 登录时获取所有字典信息
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("/allDictInfo")
	public Map<String,List<Dstdictinfo>> allDictInfo() throws Exception{
		List<Dstdictinfo> list = dictService.getAllDictInfo();
		Map<String,List<Dstdictinfo>> map = new HashMap<String,List<Dstdictinfo>>();
		for(Dstdictinfo dstdictinfo:list){
			if(map.containsKey(dstdictinfo.getTypecode())){
				map.get(dstdictinfo.getTypecode()).add(dstdictinfo);
			}else{
				List<Dstdictinfo> _list = new ArrayList<Dstdictinfo>();
				_list.add(dstdictinfo);
				map.put(dstdictinfo.getTypecode(), _list);
			}
		}
		return map;
	}
}
