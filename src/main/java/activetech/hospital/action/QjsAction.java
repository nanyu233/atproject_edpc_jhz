package activetech.hospital.action;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.domain.Dstuser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.SystemConfigService;
import activetech.base.service.UserService;
import activetech.basehems.service.BaseHspemgInfService;
import activetech.hospital.pojo.dto.HspJbzdInfCustom;
import activetech.hospital.pojo.dto.HspJbzdInfQueryDto;
import activetech.hospital.pojo.dto.HspOperationDictCustom;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.service.HspCstInfService;
import activetech.hospital.service.HspemginfService;
import activetech.util.DateUtil;
import activetech.util.ExcelExportSXXSSF;
import activetech.util.StringUtils;
import activetech.zyyhospital.pojo.dto.HspConsultationRecordsCustom;
import activetech.zyyhospital.pojo.dto.HspConsultationRecordsQueryDto;
import activetech.zyyhospital.service.HspConsultationRecordsService;

/**
 * 
 * <p>Title:QjsAction</p>
 * <p>Description:抢救室管理</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2017-5-15 上午11:15:34
 *
 */
@Controller
@RequestMapping("/qjs")
public class QjsAction {
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private HspCstInfService hspCstInfService;
	@Autowired
	private UserService userService;
	@Autowired
	private BaseHspemgInfService baseHspemgInfService;
	@Autowired
	private HspConsultationRecordsService hspConsultationRecordsService;

	/**
	 * 跳转会诊登记汇总表
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryhzdjhz")
	public String queryhzdjhz(Model model, String moduleid,String emgSeqCr) throws Exception{
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("emgSeqCr", emgSeqCr);
		return "/hospital/qjs/queryhzdjhz";
	}
	
	@RequestMapping("/queryhzdjhz2")
	public String queryhzdjhz2(Model model, String moduleid,String emgSeqCr) throws Exception{
		model.addAttribute("moduleid", moduleid);
		model.addAttribute("emgSeqCr", emgSeqCr);
		return "/hospital/qjs/queryhzdjhz2";
	}

	
	/**
	 * 跳转科室列表
	 * 
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querydep")
	public String selectDep(Model model,String inviteFlg, String inviteValue, String selectType) throws Exception {
		model.addAttribute("inviteFlg", inviteFlg);
		model.addAttribute("inviteValue", inviteValue);
		model.addAttribute("selectType", selectType);
		return "/hospital/qjs/querydep";
	}
	
	/**
	 * 根据pysm查询疾病字典列表
	 * @param pysm
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryJbzdInfbyPysm")
	public @ResponseBody List<HspJbzdInfCustom> queryJbzdInfbyPysm(HspJbzdInfQueryDto hspJbzdInfQueryDto
			) throws Exception{
		List<HspJbzdInfCustom> list = hspCstInfService.findJbzdInfByPysm(hspJbzdInfQueryDto);
		return list;
	}
	
	/**
	 * 会诊记录查询列表
	 * @param hspConsultationRecordsQueryDto
	 * @param page
	 * @param rows
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryhzdjhz_result")
	public @ResponseBody DataGridResultInfo queryhzdjhz_result(
			HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto,
			int page,//当前页码
			int rows,//每页显示个数
			String sort,
			String order,
			String emgSeqCr
			) throws Exception{
		//非空校验
		hspConsultationRecordsQueryDto = hspConsultationRecordsQueryDto!=null?hspConsultationRecordsQueryDto:new HspConsultationRecordsQueryDto();
		if(!StringUtils.isNotNullAndEmptyByTrim(sort)){
			hspConsultationRecordsQueryDto.setSort("INVITATION_DATE");
		}
		if(!StringUtils.isNotNullAndEmptyByTrim(order)){
			hspConsultationRecordsQueryDto.setOrder("asc");
		}
		//查询列表的总数
		int total = hspConsultationRecordsService.findHspConsultationRecordsTotal(hspConsultationRecordsQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspConsultationRecordsQueryDto.setPageQuery(pageQuery);
		if(StringUtils.isNotNullAndEmptyByTrim(emgSeqCr)){
			hspConsultationRecordsQueryDto.getHspConsultationRecordsCustom().setEmgSeqCr(emgSeqCr);
		}
		List<HspConsultationRecordsCustom> list = hspConsultationRecordsService.findHspConsultationRecordsList(hspConsultationRecordsQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		dataGridResultInfo.setTotal(total);
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	/**
	 * 会诊登记导出
	 * @param hspCstInfQueryDto
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/exporthzdj_result")
	public @ResponseBody SubmitResultInfo exporthzdj_result(HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto) throws Exception {
		hspConsultationRecordsQueryDto.setSort("INVITATION_DATE");
		hspConsultationRecordsQueryDto.setOrder("asc");
		//获取虚拟目录指向实际路径
		String filePath = systemConfigService.findAppoptionByOptkey("XNML_PATH").getOptvalue();
		// 导出文件的前缀
		String filePrefix = "hzdj";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;
		// 定义导出数据的title
		List<String> fieldNames = new ArrayList<String>();
		fieldNames.add("会诊医嘱时间");
		fieldNames.add("病人姓名");
		fieldNames.add("病历号");
		fieldNames.add("性别");
		fieldNames.add("申请人");
		fieldNames.add("签到时间");
		fieldNames.add("会诊记录时间");
		fieldNames.add("会诊科室");
		fieldNames.add("会诊医生");
		fieldNames.add("会诊意见");
		//导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		//fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应
		List<String> fieldCodes = new ArrayList<String>();
		fieldCodes.add("invitationDateStr");
		fieldCodes.add("cstNam");
		fieldCodes.add("mpi");
		fieldCodes.add("cstSexCod");
		fieldCodes.add("applyDocName");
		fieldCodes.add("consultationDateStr");
		fieldCodes.add("replyCreateDateStr");
		fieldCodes.add("invitationDep");
		fieldCodes.add("replyDocName");
		fieldCodes.add("consultationOpinion");


		String hb="会诊登记";
		String gd="查询方式：";
		if(StringUtils.isNotNullAndEmptyByTrim(hspConsultationRecordsQueryDto.getQuerytype())){
			if("day".equals(hspConsultationRecordsQueryDto.getQuerytype())){
				gd+="天 会诊日期："+DateUtil.formatDateByFormat(hspConsultationRecordsQueryDto.getStartdate(), "yyyy/MM/dd");
			}else if("month".equals(hspConsultationRecordsQueryDto.getQuerytype())){
				gd+="月 会诊日期："+DateUtil.formatDateByFormat(hspConsultationRecordsQueryDto.getStartdate(), "yyyy/MM");
			}else{
				gd+="范围 会诊日期："+DateUtil.formatDateByFormat(hspConsultationRecordsQueryDto.getStartdate(), "yyyy/MM/dd")
						+'-'+DateUtil.formatDateByFormat(hspConsultationRecordsQueryDto.getEnddate(), "yyyy/MM/dd");
			}
		}
		HspConsultationRecordsCustom hspConsultationRecordsCustom=hspConsultationRecordsQueryDto.getHspConsultationRecordsCustom();
		if(hspConsultationRecordsCustom!=null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspConsultationRecordsCustom.getReplyDocName())){
				gd+=" 会诊医生："+hspConsultationRecordsCustom.getReplyDocName();
			}
			if(StringUtils.isNotNullAndEmptyByTrim(hspConsultationRecordsCustom.getInvitationDepStr())){
				gd+=" 会诊科室："+hspConsultationRecordsCustom.getInvitationDepStr();
			}
		}
		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.startHbGd(filePath,
				"/export/", filePrefix, fieldNames, fieldCodes, flushRows,hb,gd);
		List<HspConsultationRecordsCustom> list = hspConsultationRecordsService.findHspConsultationRecordsList(hspConsultationRecordsQueryDto);
		// 执行导出
		excelExportSXXSSF.writeDatasByObjectSy(list);
		
		// 输出文件，返回下载文件的http地址，已经包括虚拟目录
		String webpath = excelExportSXXSSF.exportFile();
		System.out.println(webpath);
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(
				Config.MESSAGE, 914, new Object[] {
						"会诊登记列表",
						list.size(),
						webpath//下载地址
				}));
	}
	
	/**
	 * 根据首拼音码或首字查询手术操作字典列表
	 * @param pysm
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryOperationbyPysm")
	public @ResponseBody List<HspOperationDictCustom> queryOperationbyPysm(HspJbzdInfQueryDto hspJbzdInfQueryDto
			) throws Exception{
		List<HspOperationDictCustom> list = hspCstInfService.findOperationByPysm(hspJbzdInfQueryDto);
		return list;
	}
}
