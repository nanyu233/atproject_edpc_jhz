package activetech.zyyhospital.action;


import java.io.File;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.JavaType;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ExceptionResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.RedisService;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.util.DateUtil;
import activetech.util.JacksonUtil;
import activetech.util.StringUtils;
import activetech.zyyhospital.dao.mapper.HspTpctInfCustomMapper;
import activetech.zyyhospital.pojo.dto.HisCzCustom;
import activetech.zyyhospital.pojo.dto.HspTpctInfCustom;
import activetech.zyyhospital.pojo.dto.HspTpctInfQueryDto;
import activetech.zyyhospital.service.ZyyHspTpctInfService;
import activetech.zyyhospital.service.ZyyHspemginfService;

@Controller
@RequestMapping("/zyytpct")
public class ZyytpctAction {
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
	@Autowired
	private ZyyHspTpctInfService zyyHspTpctInfService;
	@Autowired
	private HspTpctInfCustomMapper hspTpctInfCustomMapper;
	/**
	 * 跳转体温单首页
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toRightTwdPage")
	public String toRightTwdPage(HttpServletRequest request,HttpServletResponse response,
			Model model,String emgSeq, String moduleid,String flag,String sessionId) throws Exception{
		if(!StringUtils.isNotNullAndEmptyByTrim(flag)) {
			JavaType javaType = JacksonUtil.getCollectionType(HashMap.class, String.class,Object.class);
			Map<String, Object> map = JacksonUtil.json2Obj(emgSeq, javaType);
			sessionId = map.get("sessionId").toString();
			emgSeq = map.get("emgSeq").toString();
			Cookie cookie = new Cookie("SESSION",sessionId); 
			cookie.setVersion(100); 
			cookie.setMaxAge(24*3600); 
			response.addCookie(cookie); 
            return "redirect:toRightTwdPage.do?sessionId="+sessionId+"&emgSeq="+emgSeq+"&flag=1";
		}
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("cstNam", hspemginfCustom.getCstNam());
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("sessionId", sessionId);
		model.addAttribute("flag", flag);
		return "/hzszyyhospital/hzszyyTemperature/rightTemp";
	}
	/**
	 * 跳转体温单图表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryhzszyyTemperature")
	public String queryzyytpct(Model model, String moduleid,String emgSeq) throws Exception {
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		model.addAttribute("moduleid", moduleid);
		return "/hzszyyhospital/hzszyyTemperature/hzszyyTemperature";
	}
	
	/**
	 * 跳转体温单录入页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryvitalSigns")
	public String queryvitalSigns(Model model,String emgSeq,String cstNam,String moduleid) throws Exception{
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		HspTpctInfQueryDto hspTpctInfQueryDto = new HspTpctInfQueryDto();
		HspTpctInfCustom hspTpctInfCustom =new HspTpctInfCustom();
		hspTpctInfCustom.setEmgSeq(emgSeq);
		hspTpctInfQueryDto.setHspTpctInfCustom(hspTpctInfCustom);
		List<HspTpctInfCustom> list = hspTpctInfCustomMapper.findhspTpctInfList(hspTpctInfQueryDto);
		if(!StringUtils.isNotNullAndZero(list)){
			//初始化默认赋值护理护理记录单第一条数据,如果没有则赋值预检数据
			hspTpctInfCustom = zyyHspTpctInfService.findtpct_csh(hspTpctInfQueryDto);
			if(StringUtils.isNotNullAndEmptyByTrim(hspTpctInfCustom.getEnteringDat())){
				model.addAttribute("enteringDat", hspTpctInfCustom.getEnteringDat());
			}else{
				model.addAttribute("enteringDat", new Date());
			}
		}else{
			model.addAttribute("enteringDat", new Date());
		}
		model.addAttribute("cstNam", cstNam);
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		model.addAttribute("moduleid", moduleid);
		return "/hzszyyhospital/hzszyyTemperature/vitalSigns";
	}
	
	/**
	 * 跳转体温单录入详情页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querytempItems")
	public String querytempItems(Model model,String emgSeq,String temperatureChartSeq) throws Exception{
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("temperatureChartSeq", temperatureChartSeq);
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyyTemperature/tempItems";
	}


	/**
	 * 保存体温单
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/submitzyytpct")
	public @ResponseBody SubmitResultInfo submitzyytpct(Model model,HspTpctInfQueryDto hspTpctInfQueryDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		if(activeUser==null||"".equals(activeUser)){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 921, new Object[] {"体温单登录用户已过期，请重新点击体温单"}));
		}
		String xsteam=zyyHspTpctInfService.submitzyytpct(hspTpctInfQueryDto, activeUser);
		model.addAttribute("xsteam",xsteam);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 体温单列表结果集
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryzyytpct_result")
	public @ResponseBody DataGridResultInfo queryzyytpct_result(Model mode, 
			HspTpctInfQueryDto hspTpctInfQueryDto
			) throws Exception{
		    Date enddate = DateUtil.getNextDay(hspTpctInfQueryDto.getStartdate());
		    hspTpctInfQueryDto.setEnddate(enddate);
			//查询列表的总数
			int total =zyyHspTpctInfService.findhspTpctInfcount(hspTpctInfQueryDto);	
			List<HspTpctInfCustom> list =zyyHspTpctInfService.findhspTpctInfList(hspTpctInfQueryDto);
			DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			//填充total
			dataGridResultInfo.setTotal(total);
			//填充rows
			dataGridResultInfo.setRows(list);
			return dataGridResultInfo;
	}
	
	/**
	 * 获取体温单详情
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findzyytpct")
	public @ResponseBody HspTpctInfCustom findzyytpct(HspTpctInfQueryDto hspTpctInfQueryDto)throws Exception{
		//获取留观首页
		HspTpctInfCustom hspTpctInfCustom=zyyHspTpctInfService.findzyytpctBySeq(hspTpctInfQueryDto);
		if(hspTpctInfCustom.getTemperatureChartSeq()==null&&!"".equals(hspTpctInfCustom.getTemperatureChartSeq())){
			//初始化默认赋值护理护理记录单第一条数据,如果没有则赋值预检数据
			hspTpctInfCustom = zyyHspTpctInfService.findtpct_csh(hspTpctInfQueryDto);
		}
		return hspTpctInfCustom;
	}
	
	
	/**
	 * 删除体温单
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/deletezyytpct")
	public @ResponseBody SubmitResultInfo deletezyytpct(HspTpctInfQueryDto hspTpctInfQueryDto)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		zyyHspTpctInfService.deletezyytpct(hspTpctInfQueryDto);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 获取体温单json数据
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findtpxtjson")
	public @ResponseBody String findtpxtjson(String emgSeq)throws Exception{
		String tpctjson=zyyHspTpctInfService.findtpxtjson(emgSeq);
		return tpctjson;
	}
	

	/**
	 * 体温单图片入库
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/insertmedia")
	public  @ResponseBody SubmitResultInfo  insertmedia(String imgStr,String emgSeq)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		zyyHspTpctInfService.insertmedia(imgStr,emgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
		
	}
	
	/**
	 *  体温单数据导入护理记录
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/leadtcpt")
	public  @ResponseBody SubmitResultInfo  leadtcpt(HspTpctInfQueryDto hspTpctInfQueryDto)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		HspTpctInfCustom hspTpctInfCustom = zyyHspTpctInfService.leadtcpt(hspTpctInfQueryDto);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("hspTpctInfCustom", hspTpctInfCustom);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 *  护理记录导入体温单
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exporttcpt")
	public  @ResponseBody SubmitResultInfo  exporttcpt(HspTpctInfQueryDto hspTpctInfQueryDto,ActiveUser activeUser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		HspTpctInfCustom hspTpctInfCustom =zyyHspTpctInfService.exporttcpt(hspTpctInfQueryDto,activeUser);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("hspTpctInfCustom", hspTpctInfCustom);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
}
