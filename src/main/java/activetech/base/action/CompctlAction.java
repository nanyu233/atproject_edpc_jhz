package activetech.base.action;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.domain.Dstappoption;
import activetech.base.pojo.domain.Dstcompctl;
import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.domain.TreeNode;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.DstcompctlCustom;
import activetech.base.pojo.dto.DstcompctlQueryDto;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.process.result.TreeGridResultInfo;
import activetech.base.service.CompctlService;
import activetech.base.service.SystemConfigService;
import activetech.util.ExcelExportSXXSSF;
import activetech.util.StringUtils;
/**
 * 
 * <p>Title:CompctlAction</p>
 * <p>Description:机构管理</p>
 * <p>activetech</p>
 * @author jpj
 * @date 2017-1-18 上午9:02:42
 *
 */
@Controller
@RequestMapping("/compctl")
public class CompctlAction {
	@Autowired
	private CompctlService compctlService;
	@Autowired
	private SystemConfigService systemConfigService;
	/**
	 * 跳转机构管理首页列表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querycompctl")
	public String querycompctl(Model model,String moduleid) throws Exception{
		model.addAttribute("moduleid", moduleid);
		return View.toBase("/compctl/compctl");
	}

	/**
	 * 全量加载机构树表格（一次加载）
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/loadCompctlTreeGrid")
	public @ResponseBody TreeGridResultInfo loadCompctlTreeGrid(ActiveUser activeUser,
			DstcompctlQueryDto dstcompctlQueryDto)throws Exception{
		//session获取数据
		String comno = activeUser.getSysid();
		dstcompctlQueryDto.getDstcompctlCustom().setComno(comno);
		TreeGridResultInfo treeGridResultInfo = new TreeGridResultInfo();
		List<DstcompctlCustom> list = compctlService.getDstcompctlCustomList(dstcompctlQueryDto);
		treeGridResultInfo.setTotal(list.size());
		treeGridResultInfo.setRows(list);
		return treeGridResultInfo;
	}
	/**
	 * 分布加载权限管理树（分布加载）
	 * @param nodeid
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/loadCompctlUserTreeElement")
	public @ResponseBody List<TreeNode> loadCompctlTreeElement(ActiveUser activeUser,String id)throws Exception{
		String comman;
		if(StringUtils.isNotNullAndEmptyByTrim(id)){
			comman=id;
			return compctlService.loadCompctlUserTreeElementChild(comman);
		}else{
			//session获取数据
			comman = activeUser.getSysid();
			return compctlService.loadCompctlUserTreeElement(comman);
		}
		
	}
	/**
	 * 跳转机构新增页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addcompctl")
	public String addcompctl(Model model,String comman) throws Exception{
		//将页面所需数据取出传到页面
		Dstcompctl dstcompctl=compctlService.findCompctlByComno(comman);
		//传上级机构名称与上级机构号
		model.addAttribute("comcname",dstcompctl.getComcname());
		model.addAttribute("comman",comman);
		List<Dstdictinfo> compctlstatList = systemConfigService.findDictinfoByType("USERSTAT");
		model.addAttribute("compctlstatList", compctlstatList);
		return View.toBase("/compctl/addcompctl");
	}
	/**
	 * 机构新增上传
	 * @param dstcompctlQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addcompctlsubmit")
	public @ResponseBody SubmitResultInfo addcompctlsubmit(DstcompctlQueryDto dstcompctlQueryDto)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		compctlService.insertCompctl(dstcompctlQueryDto.getDstcompctlCustom());
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 机构修改跳转
	 * @param model
	 * @param comno
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editcompctl")
	public String editcompctl(Model model,String comno) throws Exception{
		//将页面所需数据取出传到页面
		List<Dstdictinfo> compctlstatList = systemConfigService.findDictinfoByType("USERSTAT");
		model.addAttribute("compctlstatList", compctlstatList);
		//根据comno获取机构信息并传回页面
		DstcompctlCustom dstcompctlCustom=compctlService.selectCompctlByComno(comno);
		model.addAttribute("dstcompctlCustom", dstcompctlCustom);
		//传上级机构名称与上级机构号
		if(dstcompctlCustom.getCommanname()!=null){
		  model.addAttribute("comcname",dstcompctlCustom.getCommanname());
		}else{
			model.addAttribute("comcname","无");
		}
		return View.toBase("/compctl/editcompctl");
	}
	
	/**
	 * 机构修改上传
	 * @param comno
	 * @param dstcompctlQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editcompctlsubmit")
	public @ResponseBody SubmitResultInfo editcompctlsubmit(String comno,DstcompctlQueryDto dstcompctlQueryDto)throws Exception{
		compctlService.updateCompctl(comno,dstcompctlQueryDto.getDstcompctlCustom());	
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
   
	/**
	 * 删除机构
	 * @param comno
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deletecompctl")
	public @ResponseBody SubmitResultInfo deletecompctl(String comno) throws Exception{
		compctlService.deleteCompctl(comno);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	/**
	 * 机构导出
	 * @param comno
	 * @param dstcompctlQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exportcompctlSubmit")
	public @ResponseBody SubmitResultInfo exportcompctlSubmit(String comno) throws Exception{
		//获取虚拟目录指向实际路径
		DstcompctlQueryDto dstcompctlQueryDto=new DstcompctlQueryDto();
		DstcompctlCustom dstcompctlCustom=new DstcompctlCustom();
		dstcompctlCustom.setComno(comno);
		dstcompctlQueryDto.setDstcompctlCustom(dstcompctlCustom);
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "compctl";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("机构号");
		fieldNames.add("机构名称");
		fieldNames.add("所属上级id");
		fieldNames.add("所属区域id");
		fieldNames.add("是否有效");
		fieldNames.add("机构地址");
		fieldNames.add("邮编");
		fieldNames.add("传真");
		fieldNames.add("联系电话");

		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("comno");
		fieldCodes.add("comcname");
		fieldCodes.add("comman");
		fieldCodes.add("areaid");
		fieldCodes.add("isenable");
		fieldCodes.add("addr");
		fieldCodes.add("post");
		fieldCodes.add("fax");
		fieldCodes.add("phone");
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.start(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows);
		
		// 导出的数据通过service取出
		List<DstcompctlCustom> list = compctlService.getDstcompctlCustomList(dstcompctlQueryDto);

		// 执行导出
		excelExportSXXSSF.writeDatasByObject(list);
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(
				ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"机构列表",
						list.size(),
						webpath//下载地址
				}));	
	}
	@RequestMapping("/findCompctlByComman")
	@ResponseBody
	public List<Dstcompctl> findCompctlByComman() throws Exception{
		Dstappoption dstappotion=systemConfigService.findAppoptionByOptkey("TOP_COMNO");
		if(dstappotion!=null){
			return compctlService.findCompctlByComman(dstappotion.getOptvalue());
		}else{
			return null;
		}
	}
	
	/**
	 * 获取急诊科室列表
	 */
	@RequestMapping("getJzksCompctlList")
	public @ResponseBody List<Dstcompctl> getJzksCompctlList() throws Exception {
		List<Dstcompctl> list = compctlService.getJzksCompctlList();
		return list;
	}
	
}

