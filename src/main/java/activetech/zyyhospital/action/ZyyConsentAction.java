package activetech.zyyhospital.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.zyyhospital.pojo.domain.HspConsentInfWithBLOBs;
import activetech.zyyhospital.pojo.dto.HspConsentInfCustom;
import activetech.zyyhospital.pojo.dto.HspConsentInfCustomDto;
import activetech.zyyhospital.pojo.dto.HspConsentTempCustom;
import activetech.zyyhospital.pojo.dto.HspConsentTempCustomDto;
import activetech.zyyhospital.service.ZyyConsentService;
import activetech.zyyhospital.service.ZyyHspemginfService;

/**
 * 
 * <p>
 * Title:ZyyConsentAction
 * </p>
 * <p>
 * Description:知情同意书
 * </p>
 * <p>
 * activetech
 * </p>
 * 
 * @author sq
 * @date 2018年1月30日
 * 
 */
@Controller
@RequestMapping("/zyyconsent")
public class ZyyConsentAction {
	@Autowired
	private ZyyConsentService zyyConsentService;
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
	
	//liulijun 代码
	/**
	 * 跳转知情同意书列表
	 *@param model
	 *@param refseqno(病人序号)
	 *@return
	 *@throws Exception
	 *@author liulj @date 2018年2月1日 下午1:48:29
	 */
	@RequestMapping("/queryConsentInf")
	public String queryConsentInf(Model model,String refseqno) throws Exception{
		model.addAttribute("refseqno", refseqno);
		return "/hzszyyhospital/hzszyydoctor/consent/queryzqtys";
	}

	@RequestMapping("/queryConsentInf_Result")
	public @ResponseBody DataGridResultInfo queryConsentInf_Result(HspConsentInfCustomDto hspConsentInfCustomDto,
			int page,//当前页码
			int rows,//每页显示个数
			String sort,
			String order) throws Exception{
		//非空检验
		hspConsentInfCustomDto=hspConsentInfCustomDto!=null?hspConsentInfCustomDto:new HspConsentInfCustomDto();
		int total =zyyConsentService.findHspConsentInfByRefseqnoCount(hspConsentInfCustomDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspConsentInfCustomDto.setPageQuery(pageQuery);
		List<HspConsentInfCustom> list =zyyConsentService.findHspConsentInfByRefseqno(hspConsentInfCustomDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
		return dataGridResultInfo;
	}
	
	
		/**
		 * 跳转知情同意书页面
		 *@param model
		 *@param refseqno
		 *@return
		 *@throws Exception
		 *@author liulj @date 2018年2月1日 下午2:19:53
		 */
		@RequestMapping("/ConsentInf")
		public String ConsentInf(Model model,String seqno) throws Exception{
			HspConsentInfWithBLOBs hspConsentInf =zyyConsentService.findHspConsentInfBySeqno(seqno);
			model.addAttribute("seqno", seqno);
			model.addAttribute("tempno",hspConsentInf.getTempno());
		    model.addAttribute("tempname",hspConsentInf.getTempname());
		    model.addAttribute("refseqno",hspConsentInf.getRefseqno());
		    model.addAttribute("texthtml",hspConsentInf.getTexthtml());
		    model.addAttribute("qmHash",hspConsentInf.getQmHash());
		    model.addAttribute("qmTag",hspConsentInf.getQmTag());
		    model.addAttribute("cratNbr",hspConsentInf.getCrtusrno());
			return "/hzszyyhospital/hzszyydoctor/consent/ConsentInfBase";
		}
		
		/**
		 * 根据emgSeq查询病人信息
		 *@param response
		 *@return
		 *@throws Exception
		 *@author liulj @date 2018年2月1日 下午2:33:37
		 */
		@RequestMapping("/findHspemginfCustombyAjax")
		public @ResponseBody SubmitResultInfo findHspemginfCustombyAjax(HttpServletResponse response,String emgSeq) throws Exception{
			ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
			//获去知情同意书
            HspemginfCustom hspemginfCustom= zyyHspemginfService.findHspemginfByemgSeq(emgSeq);;
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("hspemginfCustom", hspemginfCustom);
			resultInfo.setSysdata(map);
			return ResultUtil.createSubmitResult(resultInfo);
		}
	
	
	 /**
	  * 知情同意书保存提交
	  *@param hspConsentInfCustomdto
	  *@param activeuser
	  *@return
	  *@throws Exception
	  *@author liulj @date 2018年2月6日 上午10:00:44
	  */
	 @RequestMapping("/addConsentInfSubmit")
	 public @ResponseBody SubmitResultInfo addConsentInfSubmit(HspConsentInfCustomDto hspConsentInfCustomdto,ActiveUser activeuser) throws Exception{
		 ResultInfo resultInfo=ResultUtil.createSuccess(Config.MESSAGE,906,null);
		 hspConsentInfCustomdto.setHspConsentInfCustom(hspConsentInfCustomdto.getHspConsentInfCustom()!=null?hspConsentInfCustomdto.getHspConsentInfCustom():new HspConsentInfCustom());
		 //保存知情同意书
		 HspConsentInfCustom hspConsentInfCustom= zyyConsentService.updateHspConsentInfBySeqno(hspConsentInfCustomdto.getHspConsentInfCustom(), activeuser);
		  resultInfo.setMessage(hspConsentInfCustom.getSeqno());
		  return ResultUtil.createSubmitResult(resultInfo);
	 }
	 
	 /**
	  * 根据seqno删除知情同意书
	  *@param seqno
	  *@return
	  *@throws Exception
	  *@author liulj @date 2018年2月6日 上午10:07:16
	  */
	 @RequestMapping("/delConsentInfBySeqnoSubmit")
	 public @ResponseBody SubmitResultInfo delConsentInfBySeqnoSubmit(String seqno) throws Exception{
		 ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		 zyyConsentService.delHspConsentInfBySeqno(seqno);
		 return ResultUtil.createSubmitResult(resultInfo);
	 }
	 
	 //模块
	 /**
	  * 跳转模板列表
	  *@param model
	  *@return
	  *@author liulj @date 2018年2月6日 上午10:15:03
	  */
	 @RequestMapping("/queryHspConsentTemp")
	 public String queryHspConsentTemp(Model model,String refseqno){
		 model.addAttribute("refseqno", refseqno);
		 return "/hzszyyhospital/hzszyydoctor/consent/queryzqtysmb";
	 }
	 
	 /**
	  * 查询模板列表
	  *@param hspConsentTempCustomDto
	  *@param page
	  *@param rows
	  *@param sort
	  *@param order
	  *@return
	  *@throws Exception
	  *@author liulj @date 2018年2月6日 上午10:41:09
	  */
	 @RequestMapping("/queryHspConsentTemp_result")
	 public @ResponseBody DataGridResultInfo queryHspConsentTemp_result(HspConsentTempCustomDto hspConsentTempCustomDto,
				int page,//当前页码
				int rows,//每页显示个数
				String sort,
				String order) throws Exception{
			//非空检验
		    hspConsentTempCustomDto=hspConsentTempCustomDto!=null?hspConsentTempCustomDto:new HspConsentTempCustomDto();
			int total =zyyConsentService.findHspConsentTempCount(hspConsentTempCustomDto);
			PageQuery pageQuery = new PageQuery();
			pageQuery.setPageParams(total, rows, page);
			hspConsentTempCustomDto.setPageQuery(pageQuery);
			List<HspConsentTempCustom> list =zyyConsentService.findHspConsentTemp(hspConsentTempCustomDto);
			DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			//填充total
			dataGridResultInfo.setTotal(total);
			//填充rows
			dataGridResultInfo.setRows(list);
			return dataGridResultInfo;
		}
	 
	 @RequestMapping("/ConsentInfByTempno")
		public String ConsentInfByTempno(Model model,String tempno,String refseqno,String tempname
				,String qmHash,String qmTag) throws Exception{
			 String conturl="/WEB-INF/jsp/hzszyyhospital/hzszyydoctor/consent/sentbase/"+tempno+".jsp";
		     model.addAttribute("conturl", conturl);
		     model.addAttribute("tempno",tempno);
		     model.addAttribute("tempname",tempname);
		     model.addAttribute("refseqno",refseqno);
		     model.addAttribute("qmHash",qmHash);
		     model.addAttribute("qmTag",qmTag);
			 return "/hzszyyhospital/hzszyydoctor/consent/ConsentInfBase";
		}
	//结束
}
