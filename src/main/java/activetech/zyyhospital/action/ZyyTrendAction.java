package activetech.zyyhospital.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.result.DataGridResultInfo;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.zyyhospital.pojo.dto.HspHljldInfCustom;
import activetech.zyyhospital.pojo.dto.HspHljldInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspXtpgInfQueryDto;
import activetech.zyyhospital.service.HspHljldInfService;
import activetech.zyyhospital.service.ScoreQueryService;

/**
 * 
 * Title:ZyyTrendAction
 * <p>
 * Description:趋势图
 * </p>
 * @author wzl
 * @date 2020年02月26日
 * 
 */

@Controller
@RequestMapping("/zyytrend")
public class ZyyTrendAction {
	
	@Autowired
	private ScoreQueryService scoreQueryService;
	@Autowired
	private HspHljldInfService hspHljldInfService;
	
	/**
	 * 跳转生命体征趋势图页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toVitalSignsPage")
	public String toVitalSignsPage(Model model) throws Exception {
		return "/hzszyyhospital/vitalSigns/vitalSignTable";
	}
	
	/**
	 * 跳转评分趋势图页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toScorePage")
	public String toScorePage(Model model) throws Exception {
		return "/hzszyyhospital/vitalSigns/scoreTable";
	}
	
	/**
	 * 跳转生命体征趋势图结果集
	 *@param hspHljldQueryDto
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/queryVitalSigns_result")
	public @ResponseBody DataGridResultInfo queryhljld_result(HspHljldInfQueryDto hspHljldInfQueryDto) throws Exception{
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//非空校验
		hspHljldInfQueryDto = hspHljldInfQueryDto!=null?hspHljldInfQueryDto:new HspHljldInfQueryDto();
		//时间加一天
		if(StringUtils.isNotNullAndEmptyByTrim(hspHljldInfQueryDto.getEnddate())){
		  hspHljldInfQueryDto.setEnddate(DateUtil.getNextDay(hspHljldInfQueryDto.getEnddate()));
		}
		//查询列表的总数
		List<HspHljldInfCustom> list=hspHljldInfService.getHljldListByemgseqall(hspHljldInfQueryDto);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 获取评分趋势图各个评分项结果集
	 * @param hspXtpgInfQueryDto
	 * @param scoreType 评分类型(0：Braden评分;1：ADL评分;2：成人/儿童坠床跌倒评分;3：疼痛评分;4：GCS评分;5：转运风险评分;6:Morse跌倒评分)
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryScoringTrend_result")
	public @ResponseBody
	DataGridResultInfo queryScoringTrend_result(HspXtpgInfQueryDto hspXtpgInfQueryDto,String scoreType) throws Exception {
		hspXtpgInfQueryDto = hspXtpgInfQueryDto != null ? hspXtpgInfQueryDto: new HspXtpgInfQueryDto();
		List<?> list = null;
		if ("0".equals(scoreType)) {
			list = scoreQueryService.queryBradenList(hspXtpgInfQueryDto);
		}else if ("1".equals(scoreType)) {
			list = scoreQueryService.queryAdlList(hspXtpgInfQueryDto);
		}else if ("2".equals(scoreType)) {
			list = scoreQueryService.findFallriskListByEmgSeq(hspXtpgInfQueryDto);
		}else if ("3".equals(scoreType)) {
			list = scoreQueryService.queryNrsList(hspXtpgInfQueryDto);
		}else if ("4".equals(scoreType)) {
			list = scoreQueryService.queryGcsList(hspXtpgInfQueryDto);
		}else if ("5".equals(scoreType)) {
			list = scoreQueryService.queryZyfxpfList(hspXtpgInfQueryDto);
		}else if ("6".equals(scoreType)) {
			list = scoreQueryService.findMorseListByEmgSeq(hspXtpgInfQueryDto);
		}
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		// 填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
}
