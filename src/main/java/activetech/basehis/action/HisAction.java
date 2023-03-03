package activetech.basehis.action;

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
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.util.DateUtil;
import activetech.util.HttpClientUtil;
import activetech.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	private BaseHspemgInfService baseHspemgInfService;
	@Autowired
	private SystemConfigService systemConfigService;


	/**
	 * 跳转入出转挂号信息页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toRczGhxx")
	public String toRczGhxx(Model model,String emgSeq,String mpi,String jzxhOld,String cstNam) throws Exception{
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("mpi", mpi);
		model.addAttribute("jzxhOld", jzxhOld);
		model.addAttribute("cstNam", cstNam);
		return "/hzszyyhospital/hzszyynurse/precheckPage/boxPage/ghbdBox";
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



	private ResultInfo getPatientInf_jk(String cardNo) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		String JKXM_IP = systemConfigService.findAppoptionByOptkey("JKXM_IP").getOptvalue();
		String url = JKXM_IP+"his/getPatientInfo.do";
		JSONObject param = new JSONObject();
		param.put("cardNo", cardNo);
		logger.info("患者信息请求："+param);
		String reVal = HttpClientUtil.doPostJson(url, param.toJSONString(),10*1000);
		logger.info("患者信息返回："+reVal);
		if(reVal != null){
			JSONObject dataObject = JSONObject.parseObject(reVal).getJSONObject("resultInfo");
			String code = dataObject.getString("code");
			if("200".equals(code)){
				JSONObject data = dataObject.getJSONObject("data");
				JSONObject sysdata = new JSONObject();
				sysdata.put("vHemsEmpi", data);
				resultInfo.setSysdata(sysdata);
			}else if(code != null) {
				String msg = dataObject.getString("msg");
				logger.info("患者信息报错："+msg);
			}
		}
		return resultInfo;
	}



}
