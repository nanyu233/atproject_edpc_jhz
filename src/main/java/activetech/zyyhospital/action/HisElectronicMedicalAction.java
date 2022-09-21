package activetech.zyyhospital.action;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.dao.mapper.DstuserroleMapper;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.FirstService;
import activetech.basehems.service.BaseHspemgInfService;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.util.DateUtil;
import activetech.zyyhospital.pojo.dto.HspObsvtfstInfCustom;
import activetech.zyyhospital.service.ZyyHspemginfService;
import activetech.zyyhospital.service.ZyyLqblService;

/**
 * HIS请求病历且未查到患者数据
 * @author machaofan
 *
 */
@Controller
@RequestMapping(value = "/hisMedical")
public class HisElectronicMedicalAction {
	
	@Autowired
	protected DstuserroleMapper dstuserroleMapper;
	
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
	
	@Autowired
	public FirstService firstService;
	
	@Autowired
	private BaseHspemgInfService baseHspemgInfService;
	
	@Autowired
	private ZyyLqblService zyyLqblService;
	


	/**
	 * HIS请求病历 跳转护理记录页面左侧患者列表
	 * @param model
	 * @param emgSeq 预检号
	 * @param cstNam 患者姓名
	 * @param zgcount 转归次数
	 * @param pageSrc 判断页面来源 如果是医生端则加历史病历
	 * @param pageFlg 判断页面来源 判断是否是留抢病历的日志---日志默认按钮只显示打印 [dailyRecord: 日志]
	 * @param requestSource 请求来源(HIS_NO_PATIENT:HIS请求病历且未查到患者数据)
	 * @param mpi 患者病历号
	 * @param jzxh 就诊次数
	 * @return
	 */
	@RequestMapping(value = "/toLeftWrap_HIS")
	public String toLeftWrap_HIS(Model model, String emgSeq, String cstNam, String zgcount, String pageSrc, String pageFlg, String requestSource, String mpi, String jzxh) {
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("cstNam", cstNam);
		model.addAttribute("zgcount", zgcount);
		model.addAttribute("pageSrc", pageSrc);
		model.addAttribute("pageFlg", pageFlg);
		model.addAttribute("requestSource", requestSource);
		model.addAttribute("mpi", mpi);
		model.addAttribute("jzxh", jzxh);
		return "/hzszyyhospital/hzszyyxtpg/leftWrap/leftWrap";
	}
	
	
	/**
	 * HIS请求病历且未查到患者数据 跳转检验信息详细
	 * @param model  
	 * @param sourceType 为了知识库而设置 
	 * @param mpi 病历号
	 * @param requestSource 请求来源(HIS_NO_PATIENT:HIS请求病历且未查到患者数据)
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toexamineinfo_HIS")
	public String toexamineinfo_HIS(Model model,String moduleid,String emgSeq,String valName, String sourceType, String mpi,String requestSource) throws Exception {
		HspemginfCustom  hspemginfCustom = baseHspemgInfService.findHspemginfCustom(emgSeq);
		if(null == hspemginfCustom) {
			hspemginfCustom = new HspemginfCustom();
			hspemginfCustom.setMpi(mpi);
			hspemginfCustom.setSqlDate(new Date());
			hspemginfCustom.setEmgDat(new Date());
		}
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("moduleid", moduleid); 
		model.addAttribute("cyrqDat",DateUtil.formatDateByFormat(hspemginfCustom.getSqlDate(), "yyyy/MM/dd"));
		model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
		model.addAttribute("vstCad", hspemginfCustom.getVstCad());
		model.addAttribute("valName",valName);
		model.addAttribute("sourceType", sourceType);
		model.addAttribute("MPI", hspemginfCustom.getMpi());
		model.addAttribute("requestSource",requestSource);
		return "/hzszyyhospital/hzszyyqjs/examineinfo";
	}
	
	/**
	 * HIS请求病历且未查到患者数据 跳转导入检查报告
	 * @param model 
	 * @param sourceType 为了知识库而设置
	 * @param mpi 病历号 
	 * @param requestSource 请求来源(HIS_NO_PATIENT:HIS请求病历且未查到患者数据)
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querycheckinfo_HIS")
	public String querycheckinfo_HIS(Model model,String moduleid,String emgSeq,String valName, String sourceType, String mpi,String requestSource) throws Exception {
		HspemginfCustom  hspemginfCustom = baseHspemgInfService.findHspemginfCustom(emgSeq);
		if(null == hspemginfCustom) {
			hspemginfCustom = new HspemginfCustom();
			hspemginfCustom.setMpi(mpi);
			hspemginfCustom.setSqlDate(new Date());
			hspemginfCustom.setEmgDat(new Date());
		}
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("valName", valName);
		model.addAttribute("cyrqDat",DateUtil.formatDateByFormat(hspemginfCustom.getSqlDate(), "yyyy/MM/dd"));
		model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
		model.addAttribute("vstCad", hspemginfCustom.getVstCad());
		model.addAttribute("sourceType", sourceType);
		model.addAttribute("MPI", hspemginfCustom.getMpi());
		model.addAttribute("requestSource",requestSource);
		return "/hzszyyhospital/hzszyyqjs/checkinfo";
	}
	
	/**
	 * HIS请求病历且未查到患者数据 跳转医嘱信息
	 * @param model 
	 * @param mpi 病历号
	 * @param requestSource 请求来源(HIS_NO_PATIENT:HIS请求病历且未查到患者数据)
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toquerycfxx_HIS")
	public String toquerycfxx_HIS(Model model,String moduleid,String emgSeq,String pageFlag, String mpi,String requestSource) throws Exception {
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		if(null == hspemginfCustom) {
			hspemginfCustom = new HspemginfCustom();
			hspemginfCustom.setMpi(mpi);
			hspemginfCustom.setSqlDate(new Date());
			hspemginfCustom.setEmgDat(new Date());
		}
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("pageFlag", pageFlag);
		model.addAttribute("sqlDat",DateUtil.formatDateByFormat( hspemginfCustom.getSqlDate(), "yyyy/MM/dd HH:mm"));
		model.addAttribute("emgDat",DateUtil.formatDateByFormat( hspemginfCustom.getEmgDat(), "yyyy/MM/dd HH:mm"));
		model.addAttribute("mpi", hspemginfCustom.getMpi());
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		model.addAttribute("requestSource",requestSource);
		return "/hzszyyhospital/hzszyydoctor/yzxx/queryyzxx";
	}
	
	/**
	 * HIS请求病历且未查到患者数据 跳转留抢病例检验信息
	 * @param model 
	 * @param mpi 病历号
	 * @param requestSource 请求来源(HIS_NO_PATIENT:HIS请求病历且未查到患者数据)
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toqjscaseexaminenew_HIS")
	public String toqjscaseexaminenew_HIS(Model model,String moduleid,String emgSeq, String mpi,String requestSource) throws Exception {
		HspemginfCustom hspemginfCustom = zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		HspObsvtfstInfCustom hspObsvtfstInfCustom = zyyLqblService.findObsvtfstByEmgSeq(emgSeq);
		if(null == hspemginfCustom) {
			hspemginfCustom = new HspemginfCustom();
			hspemginfCustom.setMpi(mpi);
			hspemginfCustom.setSqlDate(new Date());
			hspemginfCustom.setEmgDat(new Date());
		}
		if(null == hspObsvtfstInfCustom) {
			hspObsvtfstInfCustom = new HspObsvtfstInfCustom();
			hspObsvtfstInfCustom.setDscgDatStr(DateUtil.formatDateByFormat(new Date(), "yyyy/MM/dd"));
		}
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("cyrqDat",hspObsvtfstInfCustom.getDscgDatStr());
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
		model.addAttribute("vstCad", hspemginfCustom.getVstCad());
		model.addAttribute("MPI", hspemginfCustom.getMpi());
		return "/hzszyyhospital/hzszyydoctor/newqjscaseexamine";
	}
	
	/**
	 * HIS请求病历且未查到患者数据 跳转检查报告
	 * @param model 
	 * @param mpi 病历号
	 * @param requestSource 请求来源(HIS_NO_PATIENT:HIS请求病历且未查到患者数据)
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/qjsjcbg_HIS")
	public String qjsjcbg_HIS(Model model,String moduleid,String emgSeq, String mpi, String requestSource) throws Exception {
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		HspObsvtfstInfCustom hspObsvtfstInfCustom=zyyLqblService.findObsvtfstByEmgSeq(emgSeq);
		if(null == hspemginfCustom) {
			hspemginfCustom = new HspemginfCustom();
			hspemginfCustom.setMpi(mpi);
			hspemginfCustom.setSqlDate(new Date());
			hspemginfCustom.setEmgDat(new Date());
		}
		if(null == hspObsvtfstInfCustom) {
			hspObsvtfstInfCustom = new HspObsvtfstInfCustom();
			hspObsvtfstInfCustom.setDscgDatStr(DateUtil.formatDateByFormat(new Date(), "yyyy/MM/dd"));
		}
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("cyrqDat",hspObsvtfstInfCustom.getDscgDatStr());
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		model.addAttribute("emgDat", DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy/MM/dd"));
		model.addAttribute("vstCad", hspemginfCustom.getVstCad());
		model.addAttribute("MPI", hspemginfCustom.getMpi());
		return "/hzszyyhospital/hzszyydoctor/qjsjcbg";
	}
	
	
	/**
	 * HIS请求病历且未查到患者数据 知情同意根据emgSeq查询病人信息
	 * @param emgSeq 预检号
	 * @param requestSource 请求来源(HIS_NO_PATIENT:HIS请求病历且未查到患者数据)
	 * @param mpi 病历号
	 * @param cstNam 患者姓名
	 *@return
	 *@throws Exception
	 */
	@ResponseBody
	@RequestMapping("/findHspemginfCustombyAjax_HIS")
	public SubmitResultInfo findHspemginfCustombyAjax(String emgSeq, String cstNam, String mpi, String requestSource){
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			HspemginfCustom hspemginfCustom = zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
			if(null == hspemginfCustom) {
				hspemginfCustom = new HspemginfCustom();
				hspemginfCustom.setEmgSeq(emgSeq);
				hspemginfCustom.setCstNam(cstNam);
				hspemginfCustom.setMpi(mpi);
			}
			map.put("hspemginfCustom", hspemginfCustom);
		} catch (Exception e) {
			resultInfo = ResultUtil.createFail(Config.MESSAGE,900, null);
			e.printStackTrace();
		}
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
}
