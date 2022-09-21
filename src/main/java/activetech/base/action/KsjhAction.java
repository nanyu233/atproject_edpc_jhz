package activetech.base.action;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.DstKsjhCustom;
import activetech.base.pojo.dto.DstKsjhQueryDto;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.KsjhService;
import activetech.util.StringUtils;

@Controller
@RequestMapping("/ksjh")
public class KsjhAction {
	@Autowired
	private KsjhService ksjhService;

	/**
	 * 跳转物资维护列表
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryksjh")
	public String queryksjh(Model model, String moduleid) throws Exception {
		model.addAttribute("moduleid", moduleid);
		return View.toBase("/ksjh/queryksjh");
	}

	/**
	 * 物资维护列表查询结果集
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryksjh_result")
	public @ResponseBody
	DataGridResultInfo queryKsjh_result(DstKsjhQueryDto dstksjhQueryDto,
			Date today, int page,// 当前页码
			int rows,// 每页显示个数
			String sort, String order) throws Exception {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dstksjhQueryDto = dstksjhQueryDto != null ? dstksjhQueryDto
				: new DstKsjhQueryDto();
		if (!StringUtils.isNotNullAndEmptyByTrim(sort)) {
			dstksjhQueryDto.setSort("lendDat");
		}
		if (!StringUtils.isNotNullAndEmptyByTrim(order)) {
			dstksjhQueryDto.setOrder("asc");
		}
		if (dstksjhQueryDto.getDstKsjhCustom() == null) {
			DstKsjhCustom dstKsjhCustom = new DstKsjhCustom();
			dstKsjhCustom.setStartdate(today);
			dstKsjhCustom.setEnddate(today);
			dstksjhQueryDto.setDstKsjhCustom(dstKsjhCustom);
		}
		int total = ksjhService.findKsjhListCount(dstksjhQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		dstksjhQueryDto.setPageQuery(pageQuery);
		List<DstKsjhCustom> list = ksjhService.findKsjhList(dstksjhQueryDto);
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(total);
		return dataGridResultInfo;

	}

	/**
	 * 跳转物资维护新增界面
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addksjh")
	public String addksjh(Model model) throws Exception {
		return View.toBase("/ksjh/addksjh");
	}

	/**
	 * 物资维护新增提交
	 * 
	 * @param dstksjhQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addksjhsubmit")
	public @ResponseBody
	SubmitResultInfo addksjhsubmit(DstKsjhQueryDto dstksjhQueryDto,
			ActiveUser activeUser) throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,
				null);
		ksjhService.insertKsjh(activeUser, dstksjhQueryDto.getDstKsjhCustom());
		return ResultUtil.createSubmitResult(resultInfo);
	}

	/**
	 * 跳转物资维护修改界面
	 * 
	 * @param model
	 * @param roleid
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editksjh")
	public String editksjh(Model model, String id) throws Exception {
		// 根据roleid获取角色信息并传回页面
		DstKsjhCustom dstKsjhCustom = ksjhService.findKsjhByid(id);
		model.addAttribute("dstKsjhCustom", dstKsjhCustom);
		return View.toBase("/ksjh/editksjh");
	}

	/**
	 * 物资维护修改提交
	 * 
	 * @param roleid
	 * @param dstroleQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/editksjhsubmit")
	public @ResponseBody
	SubmitResultInfo editksjhsubmit(DstKsjhQueryDto dstksjhQueryDto,
			ActiveUser activeUser) throws Exception {
		ksjhService.updateKsjh(activeUser, dstksjhQueryDto.getDstKsjhCustom());
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 906, null));
	}

	/**
	 * 删除物资维护
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deleteksjh")
	public @ResponseBody
	SubmitResultInfo deleterole(String id) throws Exception {
		ksjhService.deleteKsjh(id);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 906, null));
	}

}
