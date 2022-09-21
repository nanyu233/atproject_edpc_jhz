package activetech.base.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.domain.HspJbzdLz;
import activetech.base.pojo.dto.HspJbzdLzCustom;
import activetech.base.pojo.dto.HspJbzdLzDto;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.HspJbzdLzService;

@Controller
@RequestMapping("/jbgl")
public class NewJbgLAction {
	@Autowired
	private HspJbzdLzService hspJbzdLzService;

	/* 跳转查询界面 */
	@RequestMapping("/queryJbzdLz")
	public String queryJbzdLz(Model model, String moduleid) throws Exception {
		model.addAttribute("moduleid", moduleid);
		return View.toBase("/Jbzdlz/queryJbzdLz");
	}

	/* 查询返回集 */
	@RequestMapping("/queryJbzdlz_result")
	public @ResponseBody DataGridResultInfo queryJbzdlz_result(
			HspJbzdLzDto hspJbzdLzDto, int page,// 当前页码
			int rows// 每页显示个数
	) throws Exception {
		hspJbzdLzDto = hspJbzdLzDto != null ? hspJbzdLzDto : new HspJbzdLzDto();
		int total = hspJbzdLzService.findhspJbzdLzCount(hspJbzdLzDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspJbzdLzDto.setPageQuery(pageQuery);
		List<HspJbzdLzCustom> list = hspJbzdLzService
				.findhspJbzdLzByJbzd(hspJbzdLzDto);
		if (hspJbzdLzDto.getHspJbzdLzCustom() != null
				&& hspJbzdLzDto.getHspJbzdLzCustom().getPysm() != ""
				&& hspJbzdLzDto.getHspJbzdLzCustom().getPysm() != null) {
			list = hspJbzdLzService.findhspJbzdLzByPysm(hspJbzdLzDto);
		}
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		// 填充total
		dataGridResultInfo.setTotal(total);
		// 填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}

	// 跳转新增界面
	@RequestMapping("/toadd")
	public String toAdd() throws Exception {
		return "/base/Jbzdlz/addJbzdLz";
	}

	@RequestMapping("/addJbzdLz")
	public @ResponseBody SubmitResultInfo addJbzdLz(HspJbzdLzDto hspJbzdLzDto)
			throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,
				null);
		hspJbzdLzService.addJbzdLz(hspJbzdLzDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}

	// 跳转修改界面
	@RequestMapping("/toupdate")
	public String toUpdate(HspJbzdLzDto hspJbzdLzDto,
			Model model) throws Exception {
		HspJbzdLz hspJbzdLz = hspJbzdLzService.findById(hspJbzdLzDto);
		model.addAttribute("hspJbzdLz", hspJbzdLz);
		return "/base/Jbzdlz/updateJbzdLz";
	}

	// 修改
	@RequestMapping("/updateJbzdLz")
	public @ResponseBody SubmitResultInfo updateHspJbzd(
			HspJbzdLzDto hspJbzdLzDto) throws Exception {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,
				null);
		hspJbzdLzService.updateJbzdLz(hspJbzdLzDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	//删除                               
	@RequestMapping("/deleteJbzdLz")
	public @ResponseBody SubmitResultInfo deleteJbzdLz(HspJbzdLzCustom hspJbzdLzCustom)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		hspJbzdLzService.deleteJbzdLz(hspJbzdLzCustom.getId());
		return ResultUtil.createSubmitResult(resultInfo);
	}

	@RequestMapping("/queryJbzdlz_resultLike")
	public @ResponseBody DataGridResultInfo queryJbzdlz_resultLike(
			HspJbzdLzDto hspJbzdLzDto) throws Exception {
		List<HspJbzdLzCustom> list = null;
		if (hspJbzdLzDto.getHspJbzdLzCustom() != null
				&& hspJbzdLzDto.getHspJbzdLzCustom().getPysm() != ""
				&& hspJbzdLzDto.getHspJbzdLzCustom().getPysm() != null) {
			list = hspJbzdLzService.findhspJbzdLzByPysm(hspJbzdLzDto);
		}
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		// 填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
}
