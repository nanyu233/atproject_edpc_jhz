package activetech.zyyhospital.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.hospital.pojo.dto.HspJbzdInfCustom;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.service.HspCstInfService;
import activetech.zyyhospital.pojo.domain.HspHlpgb;
import activetech.zyyhospital.pojo.domain.HspNczrslchcbInf;
import activetech.zyyhospital.pojo.dto.HspNczrslchcbInfCustom;
import activetech.zyyhospital.pojo.dto.HspNczrslchcbInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspNrsconsentInfCustom;
import activetech.zyyhospital.pojo.dto.HspNrsconsentInfQueryDto;
import activetech.zyyhospital.service.HspHlpgbService;
import activetech.zyyhospital.service.ZyyHspemginfService;
import activetech.zyyhospital.service.ZyyNrsconsentService;

/**
 * <p>Title:ZyyNrsConsentAction</p>
 * <p>Description:文书</p>
 * <p>activetech</p>
 * @date 2018年3月29日
 */
@Controller
@RequestMapping("/zyynrsconsent")
public class ZyyNrsConsentAction {
	@Autowired
	private ZyyNrsconsentService zyyNrsconsentService;
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
	@Autowired
	private HspCstInfService hspCstInfService;
	@Autowired
	private HspHlpgbService hspHlpgbService;
	
	/**
	 * 交接单新旧页面可控制跳转
	 * @param model
	 * @param emgSeq
	 * @param tempno
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/baseRightPage")
	public String baseRightPage(Model model,String emgSeq,String tempno)throws Exception {
		return "/hzszyyhospital/hzszyynurse/nrsconsent/documentRight";
	}
	
	/**
	 * 跳转知文书基础页面
	 *@param model
	 *@param tempno 模板号
	 *@param refseqno 预检号
	 *@param tempname 模板名
	 *@return
	 *
	 *@throws Exception
	 */
	@RequestMapping("/documentRight")
	public String documentRight(Model model) throws Exception{
		return "/hzszyyhospital/hzszyynurse/nrsconsent/documentRight";
	}
	
	/**
	 * 跳转知文书基础页面
	 *@param model
	 *@param tempno 模板号
	 *@param refseqno 预检号
	 *@param tempname 模板名
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/documentByTempno")
	public String ConsentInfByTempno(Model model,HspNrsconsentInfQueryDto hspNrsconsentInfQueryDto) throws Exception{
		HspNrsconsentInfCustom hspNrsConsentInfCustom = hspNrsconsentInfQueryDto.getHspNrsconsentInfCustom();
		String refseqno = hspNrsConsentInfCustom.getRefseqno();
		HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(refseqno);
		HspHlpgb hspHlpgb=hspHlpgbService.getZyhByEmgSeq(refseqno);
		//入院诊断西医
		String tempno = hspNrsConsentInfCustom.getTempno();
		if("2001".equals(tempno)) {
			List<HspJbzdInfCustom> hspJbzdInfCustomList = hspCstInfService.findHspJbzdInfHzzd(refseqno,"1");
			HspJbzdInfCustom hspJbzdInfCustom = hspCstInfService.findHspJbzdInfComm(refseqno,"1");
			model.addAttribute("hspJbzdInfCustom", hspJbzdInfCustom);
			model.addAttribute("hspJbzdInfCustomList", hspJbzdInfCustomList);
		}
		String conturl="/WEB-INF/jsp/hzszyyhospital/hzszyynurse/nrsconsent/sentbase/"+hspNrsConsentInfCustom.getTempno()+".jsp";
		hspNrsConsentInfCustom.setConturl(conturl);
		model.addAttribute("hspNrsConsentInfCustom", hspNrsConsentInfCustom);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		model.addAttribute("hspHlpgb", hspHlpgb);
		return "/hzszyyhospital/hzszyynurse/nrsconsent/documentBase";
	}
	
	/**
	 * 跳转文书页面
	 *@param model
	 *@param refseqno
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/toUpdateDocument")
	public String ConsentInf(Model model,String seqno) throws Exception{
		HspNrsconsentInfCustom hspNrsConsentInfCustom = zyyNrsconsentService.findHspNrsconsentInfBySeqno(seqno);
		String refseqno = hspNrsConsentInfCustom.getRefseqno();
		String tempno = hspNrsConsentInfCustom.getTempno();
		if("2001".equals(tempno)) {
			List<HspJbzdInfCustom> hspJbzdInfCustomList = hspCstInfService.findHspJbzdInfHzzd(refseqno,"1");
			HspJbzdInfCustom hspJbzdInfCustom = hspCstInfService.findHspJbzdInfComm(refseqno,"1");
			model.addAttribute("hspJbzdInfCustom", hspJbzdInfCustom);
			model.addAttribute("hspJbzdInfCustomList", hspJbzdInfCustomList);
		}
		model.addAttribute("hspNrsConsentInfCustom", hspNrsConsentInfCustom);
		return "/hzszyyhospital/hzszyynurse/nrsconsent/documentBase";
	}
	
	/**
	 * 文书提交
	 *@param model
	 *@param hspNrsconsentInfQueryDto
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/addDocumentSubmit")
	public @ResponseBody SubmitResultInfo addDocumentSubmit(@RequestBody HspNrsconsentInfQueryDto hspNrsconsentInfQueryDto,
			ActiveUser activeUser) throws Exception{
		ResultInfo resultInfo=ResultUtil.createSuccess(Config.MESSAGE,906,null);
		HspNrsconsentInfCustom consentInfCustom =  zyyNrsconsentService
				.updateDocumentBySeqno(hspNrsconsentInfQueryDto,activeUser);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("seqno", consentInfCustom.getSeqno());
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	@RequestMapping("/queryDocumentResult")
	public @ResponseBody DataGridResultInfo queryDocumentResult(HspNrsconsentInfQueryDto hspNrsconsentInfQueryDto,
			Integer page, Integer rows) throws Exception {
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		if(page != null && rows !=null){
			int total = zyyNrsconsentService.findDocumentTotal(hspNrsconsentInfQueryDto);
			PageQuery pageQuery = new PageQuery();
			pageQuery.setPageParams(total, rows, page);
			hspNrsconsentInfQueryDto.setPageQuery(pageQuery);
			dataGridResultInfo.setTotal(total);
		}
		List<HspNrsconsentInfCustom> list = zyyNrsconsentService.findfindDocumentList(hspNrsconsentInfQueryDto);
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo; 
	}
	
	/**
	 * 文书删除
	 *@param model
	 *@param refseqno
	 *@return
	 *@throws Exception
	 */
	@RequestMapping("/delDocumentSubmit")
	public @ResponseBody SubmitResultInfo delDocumentSubmit(String seqno) throws Exception{
		ResultInfo resultInfo=ResultUtil.createSuccess(Config.MESSAGE,906,null);
		zyyNrsconsentService.deleteDocumentBySeqno(seqno);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/*==========================急诊科脑卒中溶栓流程核查表==========================*/
	/**
	 * 跳转新增急诊科脑卒中溶栓流程核查表页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toAddNczrslchcb")
	public String toAddNczrslchcb(Model model,String emgSeq) throws Exception {
		HspemginfCustom hspemginfCustom = zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
		String conturl = "/WEB-INF/jsp/hzszyyhospital/hzszyynurse/nrsconsent/sentbase/2029.jsp";
		HspNczrslchcbInfCustom hspNczrslchcbInfCustom = new HspNczrslchcbInfCustom();
		hspNczrslchcbInfCustom.setConturl(conturl);
		model.addAttribute("hspNczrslchcbInfCustom", hspNczrslchcbInfCustom);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyynurse/nrsconsent/documentBase";
	}
	
	/**
	 * 跳转修改急诊科脑卒中溶栓流程核查表页面
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/toUpdateNczrslchcb")
	public String toUpdateNczrslchcb(Model model,String emgSeq,String seqno) throws Exception {
		HspemginfCustom hspemginfCustom = zyyHspemginfService.findHspemginfByemgSeq(emgSeq);		
		HspNczrslchcbInf hspNczrslchcbInf = zyyNrsconsentService.findNczrslchcbBySeqno(seqno);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		model.addAttribute("hspNczrslchcbInfCustom", hspNczrslchcbInf);
		return "/hzszyyhospital/hzszyynurse/nrsconsent/documentBase";
	}
	
	/**
	 * 获取急诊科脑卒中溶栓流程核查列表
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryNczrslchcb_result")
	public @ResponseBody
	DataGridResultInfo queryNczrslchcb_result(HspNczrslchcbInfQueryDto hspNczrslchcbInfQueryDto) throws Exception {
		hspNczrslchcbInfQueryDto = hspNczrslchcbInfQueryDto != null ? hspNczrslchcbInfQueryDto: new HspNczrslchcbInfQueryDto();
		int total = 0;
		List<HspNczrslchcbInf> list = zyyNrsconsentService.findNczrslchcbListByRefseqno(hspNczrslchcbInfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		// 填充total
		dataGridResultInfo.setTotal(total);
		// 填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 获取急诊科脑卒中溶栓流程核查表信息
	 * @param seqno 急诊科脑卒中溶栓流程核查表唯一约束
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/findNczrslchcbBySeqno")
	public @ResponseBody HspNczrslchcbInf findNczrslchcbBySeqno(String seqno) throws Exception{
		return zyyNrsconsentService.findNczrslchcbBySeqno(seqno);
	}
	
	/**
	 * 新增急诊科脑卒中溶栓流程核查表
	 * @param hspXtpgInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addNczrslchcbTable")
	public @ResponseBody SubmitResultInfo addNczrslchcbTable(@RequestBody HspNczrslchcbInfQueryDto hspNczrslchcbInfQueryDto) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		Map<String,Object> sysdata = new HashMap<String, Object>();
		sysdata.put("seqno", zyyNrsconsentService.addNczrslchcbTable(hspNczrslchcbInfQueryDto));
		resultInfo.setSysdata(sysdata);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 急诊科脑卒中溶栓流程核查表删除
	 * @param seqno 急诊科脑卒中溶栓流程核查表唯一约束
	 * @return
	 * @throws Exception 
	 */
	@RequestMapping("/delNczrslchcbTable")
	public @ResponseBody SubmitResultInfo delNczrslchcbTable(String seqno) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		zyyNrsconsentService.delNczrslchcbTable(seqno);
		return ResultUtil.createSubmitResult(resultInfo);
	}
}
