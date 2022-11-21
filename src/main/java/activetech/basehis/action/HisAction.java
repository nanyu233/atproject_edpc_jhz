package activetech.basehis.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
import activetech.basehems.service.BaseHspemgInfService;
import activetech.basehis.pojo.domain.VHemsEmpi;
import activetech.basehis.pojo.dto.HemshisDto;
import activetech.basehis.pojo.dto.VHemsGhlbCustom;
import activetech.basehis.pojo.dto.VHemsGhlbQueryDto;
import activetech.basehis.pojo.dto.VHemsRczCustom;
import activetech.basehis.pojo.dto.VHemsSfxxCustom;
import activetech.basehis.pojo.dto.VHemsSfxxDto;
import activetech.basehis.service.OracleHisService;
import activetech.external.pojo.dto.VHemsJcjgCustom;
import activetech.external.pojo.dto.VHemsJyjgCustom;
import activetech.external.pojo.dto.VHemsJyjgQueryDto;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.pda.pojo.dto.HspCfxxInfoCustom;
import activetech.pda.pojo.dto.HspCfxxInfoQueryDto;
import activetech.util.BeanUtil;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.websocket.action.WebSocketHz;

/**
 * 
 * Title:Oracle对接公用Controller
 * Description:
 * activetech
 * @author chenkb
 * @date 2018-3-28
 * 
 */
@Controller
@RequestMapping("/his")
public class HisAction {
	private static Logger logger = Logger.getLogger(HisAction.class);

	@Autowired
	private OracleHisService oracleHisService;
	@Autowired
	private BaseHspemgInfService baseHspemgInfService;


	/**
	 * 获取已挂号列表
	 * @param vHemsGhlbCustomDto
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryregisteredlist")
	public @ResponseBody DataGridResultInfo querybed_result(VHemsGhlbQueryDto vHemsGhlbQueryDto,
			int page,int rows) throws Exception{
		vHemsGhlbQueryDto = vHemsGhlbQueryDto!=null? vHemsGhlbQueryDto:new VHemsGhlbQueryDto();
		int total = oracleHisService.getRegisteredCount(vHemsGhlbQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		vHemsGhlbQueryDto.setPageQuery(pageQuery);
		List<VHemsGhlbCustom> list = oracleHisService.getRegisteredList(vHemsGhlbQueryDto);
		
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setRows(list);
		dataGridResultInfo.setTotal(total);
		return dataGridResultInfo;
	}

	@RequestMapping(value = "/sfjl")
	public String getSfjlList(String vstCad, Date emgDat, Model model,
			String emgSeq) {
		model.addAttribute("vstCad", vstCad);
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("emgDat",
				DateUtil.formatDateByFormat(emgDat, "yyyy/MM/dd"));

		HspemginfCustom  hspemginfCustom = baseHspemgInfService.findHspemginfCustom(emgSeq);
		model.addAttribute("cyrqDat",DateUtil.formatDateByFormat(hspemginfCustom.getSqlDate(), "yyyy/MM/dd"));
		return "/hzszyyhospital/hzszyynurse/his/sfjl";
	}
	

	
}
