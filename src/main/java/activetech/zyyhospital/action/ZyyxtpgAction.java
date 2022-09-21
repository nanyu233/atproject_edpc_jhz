package activetech.zyyhospital.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.DstdictinfoQueryDto;
import activetech.base.pojo.dto.PageQuery;
import activetech.base.process.context.Config;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.process.result.SubmitResultInfo;
import activetech.base.service.SystemConfigService;
import activetech.basehems.service.BaseHspemgInfService;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.util.DateUtil;
import activetech.util.ResourcesUtil;
import activetech.util.StringUtils;
import activetech.zyyhospital.pojo.domain.HspAdlInf;
import activetech.zyyhospital.pojo.domain.HspBradenInf;
import activetech.zyyhospital.pojo.domain.HspDdfxpgbInf;
import activetech.zyyhospital.pojo.domain.HspDgpgInf;
import activetech.zyyhospital.pojo.domain.HspDgpgclrInf;
import activetech.zyyhospital.pojo.domain.HspFallriskInf;
import activetech.zyyhospital.pojo.domain.HspGgjpfxtInf;
import activetech.zyyhospital.pojo.domain.HspHxxtpgInf;
import activetech.zyyhospital.pojo.domain.HspMnszxtpgInf;
import activetech.zyyhospital.pojo.domain.HspNrsInf;
import activetech.zyyhospital.pojo.domain.HspSjxtpgInf;
import activetech.zyyhospital.pojo.domain.HspXhxtpgInf;
import activetech.zyyhospital.pojo.domain.HspXlshpgInf;
import activetech.zyyhospital.pojo.domain.HspXxgxtpgInf;
import activetech.zyyhospital.pojo.domain.HspZcddexpfInf;
import activetech.zyyhospital.pojo.dto.HspAdlInfCustom;
import activetech.zyyhospital.pojo.dto.HspBradenInfCustom;
import activetech.zyyhospital.pojo.dto.HspDdfxpgbInfCustom;
import activetech.zyyhospital.pojo.dto.HspDgpgInfCustom;
import activetech.zyyhospital.pojo.dto.HspFallriskInfCustom;
import activetech.zyyhospital.pojo.dto.HspGgjpfxtInfCustom;
import activetech.zyyhospital.pojo.dto.HspHxxtpgInfCustom;
import activetech.zyyhospital.pojo.dto.HspMnszxtpgInfCustom;
import activetech.zyyhospital.pojo.dto.HspNrsInfCustom;
import activetech.zyyhospital.pojo.dto.HspSjxtpgInfCustom;
import activetech.zyyhospital.pojo.dto.HspXhxtpgInfCustom;
import activetech.zyyhospital.pojo.dto.HspXlshpgInfCustom;
import activetech.zyyhospital.pojo.dto.HspXtpgInfCustom;
import activetech.zyyhospital.pojo.dto.HspXtpgInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspXxgxtpgInfCustom;
import activetech.zyyhospital.pojo.dto.HspZcddexpfInfCustom;
import activetech.zyyhospital.service.ScoreQueryService;
import activetech.zyyhospital.service.ZyyHspemginfService;
import activetech.zyyhospital.service.ZyyHspxtpgInfService;

/**
 * 
 * <p>Title:ZyyxtpgAction</p>
 * <p>Description:系统评估</p>
 * @author zhangc
 * @date 2017年9月26日 下午4:41:41
 *
 */

@Controller
@RequestMapping("/zyyxtpg")
public class ZyyxtpgAction {
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private ZyyHspxtpgInfService zyyHspxtpgInfService;
	@Autowired
	private BaseHspemgInfService baseHspemgInfService;
	@Autowired
	private ScoreQueryService scoreQueryService;
	@Autowired
	private ZyyHspemginfService zyyHspemginfService;
	
	/**
	 * 新增系统评估获取最新评分数据
	 *@param model
	 *@return
	 *@throws Exception
	 *@author chen
	 */
	@RequestMapping("/getTheFirstScore")
	public @ResponseBody Map<String,Object> getTheFirstScore(String emgSeq)throws Exception{
		Map<String,Object> map=new HashMap<String, Object>(10);
		HspAdlInf hspAdlInf=scoreQueryService.findFirstAdlScore(emgSeq);
		HspBradenInf hspBradenInf=scoreQueryService.findFirstBradenScore(emgSeq);
		HspNrsInf hspNrsInf=scoreQueryService.findFirstNrsScore(emgSeq);
		//HspZcddexpfInf hspZcddexpfInf=scoreQueryService.findFirstZcddScore(emgSeq);
		HspFallriskInf hspFallriskInf=scoreQueryService.findFirstFallriskByEmgSeq(emgSeq);
		HspDdfxpgbInf hspDdfxpgbInf = scoreQueryService.findFirstMorseByEmgSeq(emgSeq);
		map.put("hspDdfxpgbInfCustom", hspDdfxpgbInf);
		map.put("hspAdlInfCustom", hspAdlInf);
		map.put("hspBradenInfCustom", hspBradenInf);
		map.put("hspNrsInfCustom", hspNrsInf);
		//map.put("hspZcddexpfInfCustom", hspZcddexpfInf);
		map.put("hspFallriskInf", hspFallriskInf);
		return map;
	}
	
	/**
	 * 跳转系统评估
	 *@param model
	 *@return
	 *@throws Exception
	 *@author zc 
	 */
	@RequestMapping("/queryxtpg")
	public String queryxtpg(Model model,HttpSession session,String emgSeq,String cstNam) throws Exception{
		model.addAttribute("emgSeq", emgSeq);
		model.addAttribute("cstNam", cstNam);
		String sessionId = session.getId();
		model.addAttribute("sessionId", sessionId);
		String ippost = systemConfigService.findAppoptionByOptkey("IPPOST").getOptvalue();
		model.addAttribute("ippost", ippost);
		return "/hzszyyhospital/hzszyyxtpg/xtpg";
	}
	
	/**
	 * 跳转系统评估结果集
	 *@param hspHljldQueryDto
	 *@return
	 *@throws Exception
	 *@author zc 
	 */
	@RequestMapping("/queryxtpg_result")
	public @ResponseBody DataGridResultInfo queryxtpg_result(HspXtpgInfQueryDto hspXtpgInfQueryDto,
			int page,//当前页码
			int rows,//每页显示个数
			String sort,
			String order) throws Exception{
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//非空校验
		hspXtpgInfQueryDto = hspXtpgInfQueryDto!=null?hspXtpgInfQueryDto:new HspXtpgInfQueryDto();
		//首次查询时默认赋值系统当天日期
//		Date endDate = DateUtil.getNextDay(hspXtpgInfQueryDto.getEnddate());
//		hspXtpgInfQueryDto.setEnddate(endDate);
		//查询列表的总数
		int total = zyyHspxtpgInfService.findXtpgCount(hspXtpgInfQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspXtpgInfQueryDto.setPageQuery(pageQuery);
		List<HspXtpgInfCustom> list=zyyHspxtpgInfService.getXtpgListByemgseq(hspXtpgInfQueryDto);
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(list);
	
		return dataGridResultInfo;
	}
	
	/**
	 * 新增系统评估跳转
	 *@param model
	 *@param parentid
	 *@return
	 *@throws Exception
	 *@author zc
	 */
	@RequestMapping("/addxtpg")
	public String addxtpg(Model model,String emgSeq,ActiveUser activeuser) throws Exception{
		HspemginfCustom hspemginfCustom=baseHspemgInfService.findHspemginfCustom(emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		model.addAttribute("crtName", activeuser.getUsrname());
		model.addAttribute("hsUsrno",activeuser.getUsrno());
		return "/hzszyyhospital/hzszyyxtpg/queryxtpg";
	}
	
	
	@RequestMapping("/findXtpgList") 
	public @ResponseBody SubmitResultInfo findXtpgList()throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		List<String> types = new ArrayList<String>(52);
		//系统评估数据字典
		types.add("XTPG_AQCS_COD");
		types.add("XTPG_SX");
		types.add("XTPG_ST");
		types.add("XTPG_MX");
		types.add("XTPG_BM");
		
		//Braden评分数据字典
		types.add("BRADEN_GJ_COD");
		types.add("BRADEN_CS_COD");
		types.add("BRADEN_HDNL_COD");
		types.add("BRADEN_YDNL_COD");
		types.add("BRADEN_YY_COD");
		types.add("BRADEN_MCHJQL_COD");
		//疼痛评估数据字典
		types.add("NRS_TTBW");
		types.add("NRS_TTXZ");
		types.add("NRS_TTSJ");
		types.add("NRS_TTKZ");
		//神经系统评估数据字典
		types.add("SJXTPG_YS_COD");
		types.add("SJXTPG_YSSUB_COD");
		types.add("SJXTPG_YSSUB_CODB");
		types.add("SJXTPG_YY_COD");
		types.add("JL_SZ_COD");
		types.add("SJ_JZL");
		types.add("TB_DGFY");
		//呼吸系统评估数据字典
		types.add("HXXTPG_KS_COD");
		types.add("HXXTPG_TXXZ_COD");
		types.add("HXXTPG_TL_COD");
		types.add("HXXTPG_GYFS_COD");
		types.add("HXXTPG_HXY_COD");
		//心血管系统评估数据字典
		types.add("XXGXTPG_XL_ZT_COD");
		types.add("XXGXTPG_BDMBD_COD");
		//消化系统评估数据字典
		types.add("XHXTPG_YS_COD");
		types.add("XHXTPG_SY_COD");
		types.add("XHXTPG_FZ_COD");
		types.add("XHXTPG_FBYT_COD");
		types.add("XHXTPG_CMY_COD");
		types.add("XHXTPG_PB_COD");
		//泌尿生殖系统评估数据字典
		types.add("MNSZXTPG_PN_COD");
		types.add("MNSZXTPG_NYXZ_COD");
		types.add("MNSZXTPG_TX_COD");
		types.add("MNSZXTPG_DJMW_COD");
		types.add("MNSZXTPG_RSZT_COD");
		types.add("MNSZXTPG_YJ_COD");
		types.add("MNSZXTPG_BD_COD");
		//骨骼、肌、皮肤系统评估数据字典
		types.add("GGJPFXT_PFYS_COD");
		types.add("GGJPFXT_PFWD_COD");
		types.add("GGJPFXT_SZFW_COD");
		types.add("GGJPFXT_SZXZ_COD");
		types.add("GGJPFXT_SZCD_COD");
		types.add("GGJPFXT_BTT_COD");
		types.add("GGJPFXT_KQNM_COD");
		types.add("GGJPFXT_ZKNM_COD");
		types.add("GGJPFXT_SKBW_COD");
		types.add("GGJPFXT_SK_COD");
		types.add("GGJPFXT_GD_COD");
		types.add("GGJPFXT_HDFS_COD");
		types.add("GGJPFXT_KQY_COD");
		//心理社会评估数据字典
		types.add("XLSHPG_JSZT_COD");
		//导管评估数据字典
		types.add("DGPG_CCTJ_COD");
		types.add("DGPG_DGXH_COD");
		types.add("YLG_DGMC_COD");
		// Morse跌倒数据字典
		types.add("JSGYYWDD_COD");// 近3月有无跌倒
        types.add("DYYGJBPD_COD");// 多于一个疾病诊断
        types.add("XZFZ_COD");// 行走辅助
        types.add("JMZLSYDDGFXY_COD");// 静脉治疗/使用跌倒高风险药
        types.add("BT_COD");// 步态
        types.add("RZNL_COD");// 认知能力
		
		List<Dstdictinfo> dstdictinfos = systemConfigService.findDstdictinfos(types);
		Map<String, Object> map=new HashMap<String, Object>(52);
		
		//系统评估数据字典1
		List<Dstdictinfo> xtpgAqcsCodList = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> xtpgSxList = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> xtpgStList = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> xtpgMxList = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> xtpgBmList = new ArrayList<Dstdictinfo>();
		//Braden评分数据字典6
		List<Dstdictinfo> bradenGjCodList = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> bradenCsCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> bradenHdnlCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> bradenYdnlCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> bradenYyCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> bradenMchjqlCodList= new ArrayList<Dstdictinfo>();
		//疼痛评估数据字典3
		List<Dstdictinfo> nrsTtbwList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> nrsTtxzList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> nrsTtsjList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> nrsTtkzList= new ArrayList<Dstdictinfo>();
		//神经系统评估数据字典6
		List<Dstdictinfo> sjxtpgYsCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> sjxtpgYssubCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> sjxtpgYssubCodbList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> sjxtpgYyCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> leftTbDgfy= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> rightTbDgfy= new ArrayList<Dstdictinfo>();
		
		List<Dstdictinfo> leftsJzSzCod = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> rightsJzSzCod= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> leftxJzSzCod = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> rightxJzSzCod= new ArrayList<Dstdictinfo>();
		
		List<Dstdictinfo> leftsSjJzl= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> rightsSjJzl= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> leftxSjJzl= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> rightxSjJzl= new ArrayList<Dstdictinfo>();
		
		//呼吸系统评估数据字典4
		List<Dstdictinfo> hxxtpgKsCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> hxxtpgTxxzCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> hxxtpgTlCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> hxxtpgGyfsCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> leftHxxtpgHxyCod= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> rightHxxtpgHxyCod= new ArrayList<Dstdictinfo>();
		
		//心血管系统评估数据字典2
		List<Dstdictinfo> xxgxtpgXlZtCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> yzXxgxtpgBdmbdCod= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> zzXxgxtpgBdmbdCod= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> zrXxgxtpgBdmbdCod= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> yrXxgxtpgBdmbdCod= new ArrayList<Dstdictinfo>();
		
		//消化系统评估数据字典6
		List<Dstdictinfo> xhxtpgYsCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> xhxtpgSyCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> xhxtpgFzCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> xhxtpgFbytCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> xhxtpgCmyCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> xhxtpgPbCodList= new ArrayList<Dstdictinfo>();
		//泌尿生殖系统评估数据字典	7	
		List<Dstdictinfo> mnszxtpgPnCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> mnszxtpgNyxzCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> mnszxtpgTxCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> mnszxtpgDjmwCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> mnszxtpgRsztCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> mnszxtpgYjCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> mnszxtpgBdCodList= new ArrayList<Dstdictinfo>();
		//骨骼、肌、皮肤系统评估数据字典13
		List<Dstdictinfo> ggjpfxtPfysCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> ggjpfxtPfwdCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> ggjpfxtSzfwCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> ggjpfxtSzxzCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> ggjpfxtSzcdCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> ggjpfxtBttCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> ggjpfxtKqnmCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> ggjpfxtZknmZodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> ggjpfxtSkbwCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> ggjpfxtSkCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> ggjpfxtGdCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> ggjpfxtHdfsCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> ggjpfxtKqyCodList= new ArrayList<Dstdictinfo>();
		//心理社会评估数据字典1
		List<Dstdictinfo> xlshpgJsztCodList= new ArrayList<Dstdictinfo>();
		//导管评估数据字典3
		List<Dstdictinfo> dgpgDgxhCodList= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> ylgDgmcCodList= new ArrayList<Dstdictinfo>();	
		List<Dstdictinfo> cvcDgpgCctjDod= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> sygDgpgCctjDod= new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> piccDgxhCodList= new ArrayList<Dstdictinfo>();
		// Morse跌倒数据字典6
		List<Dstdictinfo> jsgyywddCodList = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> dyygjbpdCodList = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> xzfzCodList = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> jmzlsyddgfxyCodList = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> btCodList = new ArrayList<Dstdictinfo>();
		List<Dstdictinfo> rznlCodList = new ArrayList<Dstdictinfo>();		
		
		if(dstdictinfos != null && dstdictinfos.size() != 0){
			for (Dstdictinfo dstdictinfo : dstdictinfos) {
				//系统评估数据字典
				if("XTPG_AQCS_COD".equals(dstdictinfo.getTypecode())){
					xtpgAqcsCodList.add(dstdictinfo);
				}else if("XTPG_SX".equals(dstdictinfo.getTypecode())){
					xtpgSxList.add(dstdictinfo);
				}else if("XTPG_ST".equals(dstdictinfo.getTypecode())){
					xtpgStList.add(dstdictinfo);
				}else if("XTPG_MX".equals(dstdictinfo.getTypecode())){
					xtpgMxList.add(dstdictinfo);
				}else if("XTPG_BM".equals(dstdictinfo.getTypecode())){
					xtpgBmList.add(dstdictinfo);
				}
				
				//Braden评分数据字典
				else if("BRADEN_GJ_COD".equals(dstdictinfo.getTypecode())){
					bradenGjCodList.add(dstdictinfo);
				}else if("BRADEN_CS_COD".equals(dstdictinfo.getTypecode())){
					bradenCsCodList.add(dstdictinfo);
				}else if("BRADEN_HDNL_COD".equals(dstdictinfo.getTypecode())){
					bradenHdnlCodList.add(dstdictinfo);
				}else if("BRADEN_YDNL_COD".equals(dstdictinfo.getTypecode())){
					bradenYdnlCodList.add(dstdictinfo);
				}else if("BRADEN_YY_COD".equals(dstdictinfo.getTypecode())){
					bradenYyCodList.add(dstdictinfo);
				}else if("BRADEN_MCHJQL_COD".equals(dstdictinfo.getTypecode())){
					bradenMchjqlCodList.add(dstdictinfo);
				}
				//疼痛评估数据字典
				else if("NRS_TTBW".equals(dstdictinfo.getTypecode())){
					nrsTtbwList.add(dstdictinfo);
				}else if("NRS_TTXZ".equals(dstdictinfo.getTypecode())){
					nrsTtxzList.add(dstdictinfo);
				}else if("NRS_TTSJ".equals(dstdictinfo.getTypecode())){
					nrsTtsjList.add(dstdictinfo);
				}else if("NRS_TTKZ".equals(dstdictinfo.getTypecode())){
					nrsTtkzList.add(dstdictinfo);
				}
				//神经系统评估数据字典
				else if("SJXTPG_YS_COD".equals(dstdictinfo.getTypecode())){
					sjxtpgYsCodList.add(dstdictinfo);
				}else if("SJXTPG_YSSUB_COD".equals(dstdictinfo.getTypecode())){
					sjxtpgYssubCodList.add(dstdictinfo);
				}else if("SJXTPG_YSSUB_CODB".equals(dstdictinfo.getTypecode())){
					sjxtpgYssubCodbList.add(dstdictinfo);
				}else if("SJXTPG_YY_COD".equals(dstdictinfo.getTypecode())){
					sjxtpgYyCodList.add(dstdictinfo);
				}else if("JL_SZ_COD".equals(dstdictinfo.getTypecode())){
					leftsJzSzCod.add(dstdictinfo);
					rightsJzSzCod.add(dstdictinfo);
					leftxJzSzCod.add(dstdictinfo);
					rightxJzSzCod.add(dstdictinfo);
				}else if("SJ_JZL".equals(dstdictinfo.getTypecode())){
					leftsSjJzl.add(dstdictinfo);
					rightsSjJzl.add(dstdictinfo);
					leftxSjJzl.add(dstdictinfo);
					rightxSjJzl.add(dstdictinfo);
				}else if("TB_DGFY".equals(dstdictinfo.getTypecode())){
					leftTbDgfy.add(dstdictinfo);
					rightTbDgfy.add(dstdictinfo);
				}
				//呼吸系统评估数据字典
				else if("HXXTPG_KS_COD".equals(dstdictinfo.getTypecode())){
					hxxtpgKsCodList.add(dstdictinfo);
				}else if("HXXTPG_TXXZ_COD".equals(dstdictinfo.getTypecode())){
					hxxtpgTxxzCodList.add(dstdictinfo);
				}else if("HXXTPG_TL_COD".equals(dstdictinfo.getTypecode())){
					hxxtpgTlCodList.add(dstdictinfo);
				}else if("HXXTPG_GYFS_COD".equals(dstdictinfo.getTypecode())){
					hxxtpgGyfsCodList.add(dstdictinfo);
				}else if("HXXTPG_HXY_COD".equals(dstdictinfo.getTypecode())){
					leftHxxtpgHxyCod.add(dstdictinfo);
					rightHxxtpgHxyCod.add(dstdictinfo);
				}
				//心血管系统评估数据字典
				else if("XXGXTPG_XL_ZT_COD".equals(dstdictinfo.getTypecode())){
					xxgxtpgXlZtCodList.add(dstdictinfo);
				}else if("XXGXTPG_BDMBD_COD".equals(dstdictinfo.getTypecode())){
					yzXxgxtpgBdmbdCod.add(dstdictinfo);
					zzXxgxtpgBdmbdCod.add(dstdictinfo);
					zrXxgxtpgBdmbdCod.add(dstdictinfo);
					yrXxgxtpgBdmbdCod.add(dstdictinfo);
					
				}
				//消化系统评估数据字典
				else if("XHXTPG_YS_COD".equals(dstdictinfo.getTypecode())){
					xhxtpgYsCodList.add(dstdictinfo);
				}else if("XHXTPG_SY_COD".equals(dstdictinfo.getTypecode())){
					xhxtpgSyCodList.add(dstdictinfo);
				}else if("XHXTPG_FZ_COD".equals(dstdictinfo.getTypecode())){
					xhxtpgFzCodList.add(dstdictinfo);
				}else if("XHXTPG_FBYT_COD".equals(dstdictinfo.getTypecode())){
					xhxtpgFbytCodList.add(dstdictinfo);
				}else if("XHXTPG_CMY_COD".equals(dstdictinfo.getTypecode())){
					xhxtpgCmyCodList.add(dstdictinfo);
				}else if("XHXTPG_PB_COD".equals(dstdictinfo.getTypecode())){
					xhxtpgPbCodList.add(dstdictinfo);
				}
				//泌尿生殖系统评估数据字典
				else if("MNSZXTPG_PN_COD".equals(dstdictinfo.getTypecode())){
					mnszxtpgPnCodList.add(dstdictinfo);
				}else if("MNSZXTPG_NYXZ_COD".equals(dstdictinfo.getTypecode())){
					mnszxtpgNyxzCodList.add(dstdictinfo);
				}else if("MNSZXTPG_TX_COD".equals(dstdictinfo.getTypecode())){
					mnszxtpgTxCodList.add(dstdictinfo);
				}else if("MNSZXTPG_DJMW_COD".equals(dstdictinfo.getTypecode())){
					mnszxtpgDjmwCodList.add(dstdictinfo);
				}else if("MNSZXTPG_RSZT_COD".equals(dstdictinfo.getTypecode())){
					mnszxtpgRsztCodList.add(dstdictinfo);
				}else if("MNSZXTPG_YJ_COD".equals(dstdictinfo.getTypecode())){
					mnszxtpgYjCodList.add(dstdictinfo);
				}else if("MNSZXTPG_BD_COD".equals(dstdictinfo.getTypecode())){
					mnszxtpgBdCodList.add(dstdictinfo);
				}
				//骨骼、肌、皮肤系统评估数据字典
				else if("GGJPFXT_PFYS_COD".equals(dstdictinfo.getTypecode())){
					ggjpfxtPfysCodList.add(dstdictinfo);
				}else if("GGJPFXT_PFWD_COD".equals(dstdictinfo.getTypecode())){
					ggjpfxtPfwdCodList.add(dstdictinfo);
				}else if("GGJPFXT_SZFW_COD".equals(dstdictinfo.getTypecode())){
					ggjpfxtSzfwCodList.add(dstdictinfo);
				}else if("GGJPFXT_SZXZ_COD".equals(dstdictinfo.getTypecode())){
					ggjpfxtSzxzCodList.add(dstdictinfo);
				}else if("GGJPFXT_SZCD_COD".equals(dstdictinfo.getTypecode())){
					ggjpfxtSzcdCodList.add(dstdictinfo);
				}else if("GGJPFXT_BTT_COD".equals(dstdictinfo.getTypecode())){
					ggjpfxtBttCodList.add(dstdictinfo);
				}else if("GGJPFXT_KQNM_COD".equals(dstdictinfo.getTypecode())){
					ggjpfxtKqnmCodList.add(dstdictinfo);
				}else if("GGJPFXT_ZKNM_COD".equals(dstdictinfo.getTypecode())){
					ggjpfxtZknmZodList.add(dstdictinfo);
				}else if("GGJPFXT_SKBW_COD".equals(dstdictinfo.getTypecode())){
					ggjpfxtSkbwCodList.add(dstdictinfo);
				}else if("GGJPFXT_SK_COD".equals(dstdictinfo.getTypecode())){
					ggjpfxtSkCodList.add(dstdictinfo);
				}else if("GGJPFXT_GD_COD".equals(dstdictinfo.getTypecode())){
					ggjpfxtGdCodList.add(dstdictinfo);
				}else if("GGJPFXT_HDFS_COD".equals(dstdictinfo.getTypecode())){
					ggjpfxtHdfsCodList.add(dstdictinfo);
				}else if("GGJPFXT_KQY_COD".equals(dstdictinfo.getTypecode())){
					ggjpfxtKqyCodList.add(dstdictinfo);
				}
				//心理社会评估数据字典
				else if("XLSHPG_JSZT_COD".equals(dstdictinfo.getTypecode())){
					xlshpgJsztCodList.add(dstdictinfo);
				}
				//导管评估数据字典
				else if("DGPG_CCTJ_COD".equals(dstdictinfo.getTypecode())){
					cvcDgpgCctjDod.add(dstdictinfo);
					sygDgpgCctjDod.add(dstdictinfo);
				}else if("DGPG_DGXH_COD".equals(dstdictinfo.getTypecode())){
					dgpgDgxhCodList.add(dstdictinfo);
					piccDgxhCodList.add(dstdictinfo);
				}else if("YLG_DGMC_COD".equals(dstdictinfo.getTypecode())){
					ylgDgmcCodList.add(dstdictinfo);
				}
				// Morse跌倒数据字典
				else if ("JSGYYWDD_COD".equals(dstdictinfo.getTypecode())) {
					jsgyywddCodList.add(dstdictinfo);
				} else if ("DYYGJBPD_COD".equals(dstdictinfo.getTypecode())) {
					dyygjbpdCodList.add(dstdictinfo);
				} else if ("XZFZ_COD".equals(dstdictinfo.getTypecode())) {
					xzfzCodList.add(dstdictinfo);
				} else if ("JMZLSYDDGFXY_COD".equals(dstdictinfo.getTypecode())) {
					jmzlsyddgfxyCodList.add(dstdictinfo);
				} else if ("BT_COD".equals(dstdictinfo.getTypecode())) {
					btCodList.add(dstdictinfo);
				} else if ("RZNL_COD".equals(dstdictinfo.getTypecode())) {
					rznlCodList.add(dstdictinfo);
				}
			}
		}
		//系统评估数据字典1
		map.put("xtpgAqcsCodList", xtpgAqcsCodList);
		map.put("xtpgSxList", xtpgSxList);
		map.put("xtpgStList", xtpgStList);
		map.put("xtpgMxList", xtpgMxList);
		map.put("xtpgBmList", xtpgBmList);
		
		//Braden评分数据字典6
		map.put("bradenGjCodList", bradenGjCodList);
		map.put("bradenCsCodList", bradenCsCodList);
		map.put("bradenHdnlCodList", bradenHdnlCodList);
		map.put("bradenYdnlCodList", bradenYdnlCodList);
		map.put("bradenYyCodList", bradenYyCodList);
		map.put("bradenMchjqlCodList", bradenMchjqlCodList);
		//疼痛评估数据字典3
		map.put("nrsTtbwList", nrsTtbwList);
		map.put("nrsTtxzList", nrsTtxzList);
		map.put("nrsTtsjList", nrsTtsjList);
		map.put("nrsTtkzList", nrsTtkzList);
		//神经系统评估数据字典6
		map.put("sjxtpgYsCodList", sjxtpgYsCodList);
		map.put("sjxtpgYssubCodList", sjxtpgYssubCodList);
		map.put("sjxtpgYssubCodbList", sjxtpgYssubCodbList);
		map.put("sjxtpgYyCodList", sjxtpgYyCodList);
		map.put("leftTbDgfyList", leftTbDgfy);
		map.put("rightTbDgfyList", rightTbDgfy);
		
		map.put("leftsJzSzCodList", leftsJzSzCod);
		map.put("rightsJzSzCodList", rightsJzSzCod);
		map.put("leftxJzSzCodList", leftxJzSzCod);
		map.put("rightxJzSzCodList", rightxJzSzCod);
		
		map.put("leftsSjJzlList", leftsSjJzl);
		map.put("rightsSjJzlList", rightsSjJzl);
		map.put("leftxSjJzlList", leftxSjJzl);
		map.put("rightxSjJzlList", rightxSjJzl);
		
		
		//呼吸系统评估数据字典4
		map.put("hxxtpgKsCodList", hxxtpgKsCodList);
		map.put("hxxtpgTxxzCodList", hxxtpgTxxzCodList);
		map.put("hxxtpgTlCodList", hxxtpgTlCodList);
		map.put("hxxtpgGyfsCodList", hxxtpgGyfsCodList);
		map.put("leftHxxtpgHxyCodList", leftHxxtpgHxyCod);
		map.put("rightHxxtpgHxyCodList", rightHxxtpgHxyCod);
		
		//心血管系统评估数据字典2
		map.put("xxgxtpgXlZtCodList", xxgxtpgXlZtCodList);
		map.put("yzXxgxtpgBdmbdCodList", yzXxgxtpgBdmbdCod);
		map.put("zzXxgxtpgBdmbdCodList", zzXxgxtpgBdmbdCod);
		map.put("zrXxgxtpgBdmbdCodList", zrXxgxtpgBdmbdCod);
		map.put("yrXxgxtpgBdmbdCodList", yrXxgxtpgBdmbdCod);
		//消化系统评估数据字典6
		map.put("xhxtpgYsCodList", xhxtpgYsCodList);
		map.put("xhxtpgSyCodList", xhxtpgSyCodList);
		map.put("xhxtpgFzCodList", xhxtpgFzCodList);
		map.put("xhxtpgFbytCodList", xhxtpgFbytCodList);
		map.put("xhxtpgCmyCodList", xhxtpgCmyCodList);
		map.put("xhxtpgPbCodList", xhxtpgPbCodList);
		//泌尿生殖系统评估数据字典	7	
		map.put("mnszxtpgPnCodList", mnszxtpgPnCodList);
		map.put("mnszxtpgNyxzCodList", mnszxtpgNyxzCodList);
		map.put("mnszxtpgTxCodList", mnszxtpgTxCodList);
		map.put("mnszxtpgDjmwCodList", mnszxtpgDjmwCodList);
		map.put("mnszxtpgRsztCodList", mnszxtpgRsztCodList);
		map.put("mnszxtpgYjCodList", mnszxtpgYjCodList);
		map.put("mnszxtpgBdCodList", mnszxtpgBdCodList);
		//骨骼、肌、皮肤系统评估数据字典13
		map.put("ggjpfxtPfysCodList", ggjpfxtPfysCodList);
		map.put("ggjpfxtPfwdCodList", ggjpfxtPfwdCodList);
		map.put("ggjpfxtSzfwCodList", ggjpfxtSzfwCodList);
		map.put("ggjpfxtSzxzCodList", ggjpfxtSzxzCodList);
		map.put("ggjpfxtSzcdCodList", ggjpfxtSzcdCodList);
		map.put("ggjpfxtBttCodList",  ggjpfxtBttCodList);
		map.put("ggjpfxtKqnmCodList", ggjpfxtKqnmCodList);
		map.put("ggjpfxtZknmCodList", ggjpfxtZknmZodList);
		map.put("ggjpfxtSkbwCodList", ggjpfxtSkbwCodList);
		map.put("ggjpfxtSkCodList", ggjpfxtSkCodList);
		map.put("ggjpfxtGdCodList", ggjpfxtGdCodList);
		map.put("ggjpfxtHdfsCodList", ggjpfxtHdfsCodList);
		map.put("ggjpfxtKqyCodList", ggjpfxtKqyCodList);
		//心理社会评估数据字典1
		map.put("xlshpgJsztCodList", xlshpgJsztCodList);
		//导管评估数据字典3
		map.put("cvcDgpgCctjCodList", cvcDgpgCctjDod);
		map.put("sygDgpgCctjCodList", sygDgpgCctjDod);
		map.put("cvcDgxhCodList", dgpgDgxhCodList);
		map.put("ylgDgmcCodList", ylgDgmcCodList);
		map.put("piccDgxhList", piccDgxhCodList);
		// Morse跌倒数据字典6
		map.put("jsgyywddCodList", jsgyywddCodList);
		map.put("dyygjbpdCodList", dyygjbpdCodList);
		map.put("xzfzCodList", xzfzCodList);
		map.put("jmzlsyddgfxyCodList", jmzlsyddgfxyCodList);
		map.put("btCodList", btCodList);
		map.put("rznlCodList", rznlCodList);
		
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * ajax根据XTPG_SEQ查询系統評估表,braden评分，ADL评分，坠床/跌倒评分，疼痛评分
	 *@param behiSeq
	 *@return
	 *@throws Exception
	 *@author zc
	 */
	@RequestMapping("/findxtpgByxtpgSeq_pf")
	public @ResponseBody SubmitResultInfo findxtpgByXtpgSeq_pf(String xtpgSeq,String emgSeq) throws Exception{
        ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
        //获取患者详情
        HspemginfCustom hspemginfCustom=baseHspemgInfService.findHspemginfCustom(emgSeq);
        //获取系统评估数据
        HspXtpgInfCustom hspXtpgInfCustom=zyyHspxtpgInfService.findxtpgByXtpgSeq(xtpgSeq);
        //获取Braden评分
        HspBradenInf hspBradenInf=zyyHspxtpgInfService.fingBradenByXtpgSeq(xtpgSeq);
        HspBradenInfCustom hspBradenInfCustom = new HspBradenInfCustom();
        if(hspBradenInf!=null){
        	hspBradenInfCustom.setBradenFlg("1");
        }else {
        	hspBradenInfCustom.setBradenFlg("0");
        	hspBradenInf= new HspBradenInf();
		}
        BeanUtils.copyProperties(hspBradenInfCustom, hspBradenInf);
        //获取ADL评分
        HspAdlInf hspAdlInf = zyyHspxtpgInfService.findadlByXtpgSeq(xtpgSeq);
        HspAdlInfCustom hspAdlInfCustom = new HspAdlInfCustom();
        if(hspAdlInf!=null){
        	hspAdlInfCustom.setAldFlg("1");
        }else {
        	hspAdlInfCustom.setAldFlg("0");
        	hspAdlInf= new HspAdlInf();
		}
        BeanUtils.copyProperties(hspAdlInfCustom, hspAdlInf);
        /*//坠床跌倒评分
        HspZcddexpfInf hspZcddexpfInf =zyyHspxtpgInfService.findzcddByXtpgSeq(xtpgSeq);
        HspZcddexpfInfCustom hspZcddexpfInfCustom = new HspZcddexpfInfCustom();
        if(hspZcddexpfInf!=null){
        	hspZcddexpfInfCustom.setZcddFlg("1");
        }else {
        	hspZcddexpfInfCustom.setZcddFlg("0");
        	hspZcddexpfInf= new HspZcddexpfInf();
		}
        BeanUtils.copyProperties(hspZcddexpfInfCustom, hspZcddexpfInf);
        //新版坠床跌倒
        HspFallriskInfCustom hspFallriskInfCustom = zyyHspxtpgInfService.findFallRiskByXtpgSeq(xtpgSeq);
        if(hspFallriskInfCustom!=null){
        	hspFallriskInfCustom.setFallRiskFlg("1");
        }else{
        	hspFallriskInfCustom=new HspFallriskInfCustom();
        	hspFallriskInfCustom.setFallRiskFlg("0");
        }*/
        HspDdfxpgbInf hspDdfxpgbInf = scoreQueryService.findMorseByDdfxpgbSeq(xtpgSeq);
        HspDdfxpgbInfCustom hspDdfxpgbInfCustom = new HspDdfxpgbInfCustom();
        if(hspDdfxpgbInf != null){	
        	hspDdfxpgbInfCustom.setMorseFlg("1");
        	if (!StringUtils.isNotNullAndEmptyByTrim(hspDdfxpgbInf.getZf()) && !StringUtils.isNotNullAndEmptyByTrim(hspDdfxpgbInf.getHlcsCod())) {
        		hspDdfxpgbInfCustom.setMorseFlg("0");
			}
        }else {
        	hspDdfxpgbInfCustom.setMorseFlg("0");
        	hspDdfxpgbInf = new HspDdfxpgbInf();
		}
        BeanUtils.copyProperties(hspDdfxpgbInfCustom, hspDdfxpgbInf);
        //疼痛评估
        HspNrsInf hspNrsInf = zyyHspxtpgInfService.findNrsByXtpgSeq(xtpgSeq);//有数据
        HspNrsInfCustom hspNrsInfCustom = new HspNrsInfCustom();
        HspNrsInf hspNrsInf1 =  zyyHspxtpgInfService.findNrsByXtpgSeqnotinsco(xtpgSeq);//有疼痛评分
        HspNrsInf hspNrsInf2 =  zyyHspxtpgInfService.findNrsByXtpgSeqinsco(xtpgSeq);//无疼痛评分
        
        if(hspNrsInf ==null){
        	hspNrsInf = new HspNrsInf();
        	hspNrsInfCustom.setNrsFlg("0");
    		hspNrsInfCustom.setNrsscoFlg("0");
        }else if(hspNrsInf!=null){
        	if(hspNrsInf1!=null&&hspNrsInf2==null){
        		hspNrsInfCustom.setNrsFlg("0");
        		hspNrsInfCustom.setNrsscoFlg("1");
        	}else if(hspNrsInf1==null&&hspNrsInf2!=null){
        		hspNrsInfCustom.setNrsFlg("1");
        		hspNrsInfCustom.setNrsscoFlg("0");
        	}else if(hspNrsInf1!=null&&hspNrsInf2!=null){
        		hspNrsInfCustom.setNrsFlg("1");
        		hspNrsInfCustom.setNrsscoFlg("1");
        	}
        }
        
        BeanUtils.copyProperties(hspNrsInfCustom, hspNrsInf);
        
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("hspemginfCustom", hspemginfCustom);
        map.put("hspXtpgInfCustom", hspXtpgInfCustom);
        map.put("hspBradenInfCustom", hspBradenInfCustom);
        map.put("hspAdlInfCustom", hspAdlInfCustom);
        map.put("hspDdfxpgbInfCustom", hspDdfxpgbInfCustom);
        map.put("hspNrsInfCustom", hspNrsInfCustom);
        resultInfo.setSysdata(map);
        return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * ajax根据XTPG_SEQ查询神经系统评估表，呼吸系统评估表，心血管系统评估表，消化系统评估表，泌尿生殖系统评估表，骨骼、肌、皮肤系统表 ，心理社会评估表，导管评估
	 *@param behiSeq
	 *@return
	 *@throws Exception
	 *@author zc
	 */
	@RequestMapping("/findxtpgByxtpgSeq_Pgo")
	public @ResponseBody SubmitResultInfo findxtpgByXtpgSeq_Pgo(String xtpgSeq) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		//获取神经系统评估表
		HspSjxtpgInf hspSjxtpgInf=zyyHspxtpgInfService.findSjxtByXtpgSeq(xtpgSeq);
        HspSjxtpgInfCustom hspSjxtpgInfCustom = new HspSjxtpgInfCustom();
        if(hspSjxtpgInf!=null){
        	hspSjxtpgInfCustom.setSjxtFlg("1");
		}else{
			hspSjxtpgInfCustom.setSjxtFlg("0");
			hspSjxtpgInf = new HspSjxtpgInf();
		}
        BeanUtils.copyProperties(hspSjxtpgInfCustom, hspSjxtpgInf);
        //获取呼吸系统评估表
        HspHxxtpgInf hspHxxtpgInf = zyyHspxtpgInfService.findHxxtByXtpgSeq(xtpgSeq);
        HspHxxtpgInfCustom hspHxxtpgInfCustom = new HspHxxtpgInfCustom();
        if(hspHxxtpgInf!=null){
        	hspHxxtpgInfCustom.setHxxtFlg("1");
		}else{
			hspHxxtpgInfCustom.setHxxtFlg("0");
			hspHxxtpgInf = new HspHxxtpgInf();
		}
        BeanUtils.copyProperties(hspHxxtpgInfCustom, hspHxxtpgInf);
        //心血管系统评估表
        HspXxgxtpgInf hspXxgxtpgInf =zyyHspxtpgInfService.findXxgxtByXtpgSeq(xtpgSeq);
        HspXxgxtpgInfCustom hspXxgxtpgInfCustom = new HspXxgxtpgInfCustom();
        if(hspXxgxtpgInf!=null){
        	hspXxgxtpgInfCustom.setXxgxtFlg("1");
		}else{
			hspXxgxtpgInfCustom.setXxgxtFlg("0");
			hspXxgxtpgInf = new HspXxgxtpgInf();
		}
        BeanUtils.copyProperties(hspXxgxtpgInfCustom, hspXxgxtpgInf);
        //消化系统评估表
        HspXhxtpgInf hspXhxtpgInf =zyyHspxtpgInfService.findxhxtByXtpgSeq(xtpgSeq);
        HspXhxtpgInfCustom hspXhxtpgInfCustom =new HspXhxtpgInfCustom();
        if(hspXhxtpgInf!=null){
        	hspXhxtpgInfCustom.setXhxtFlg("1");
		}else{
			hspXhxtpgInfCustom.setXhxtFlg("0");
			hspXhxtpgInf= new HspXhxtpgInf();
		}
        BeanUtils.copyProperties(hspXhxtpgInfCustom, hspXhxtpgInf);
        //泌尿生殖系统评估表
        HspMnszxtpgInf hspMnszxtpgInf = zyyHspxtpgInfService.findMnszxtByXtpgSeq(xtpgSeq);
        HspMnszxtpgInfCustom hspMnszxtpgInfCustom = new HspMnszxtpgInfCustom();
        if(hspMnszxtpgInf!=null){
        	hspMnszxtpgInfCustom.setMnszxtFlg("1");
		}else{
			hspMnszxtpgInfCustom.setMnszxtFlg("0");
			hspMnszxtpgInf = new HspMnszxtpgInf();
		}
        BeanUtils.copyProperties(hspMnszxtpgInfCustom, hspMnszxtpgInf);
        //骨骼、肌、皮肤系统表 
        HspGgjpfxtInf hspGgjpfxtInf =zyyHspxtpgInfService.findpGgjpfxtByXtpgSeq(xtpgSeq);
        HspGgjpfxtInfCustom hspGgjpfxtInfCustom =new HspGgjpfxtInfCustom();
        if(hspGgjpfxtInf!=null){
        	hspGgjpfxtInfCustom.setGgjpfxtFlg("1");
		}else{
			hspGgjpfxtInfCustom.setGgjpfxtFlg("0");
			hspGgjpfxtInf = new HspGgjpfxtInf();
		}
        BeanUtils.copyProperties(hspGgjpfxtInfCustom, hspGgjpfxtInf);
        //心理社会评估表
        HspXlshpgInf hspXlshpgInf = zyyHspxtpgInfService.findXlshpgByXtpgSeq(xtpgSeq);
        HspXlshpgInfCustom hspXlshpgInfCustom = new HspXlshpgInfCustom();
        if(hspXlshpgInf!=null){
        	hspXlshpgInfCustom.setXlshpgFlg("1");
		}else{
			hspXlshpgInfCustom.setXlshpgFlg("0");
			hspXlshpgInf = new HspXlshpgInf();
		}
        BeanUtils.copyProperties(hspXlshpgInfCustom, hspXlshpgInf);
        //导管评估
        HspDgpgInf hspDgpgInf =zyyHspxtpgInfService.finDgpgByXtpgSeq(xtpgSeq);
        HspDgpgInfCustom hspDgpgInfCustom = new HspDgpgInfCustom();
        if(hspDgpgInf!=null){
        	hspDgpgInfCustom.setDgpgFlg("1");
		}else{
			hspDgpgInfCustom.setDgpgFlg("0");
			hspDgpgInf = new HspDgpgInf();
		}
        BeanUtils.copyProperties(hspDgpgInfCustom, hspDgpgInf);
        
        //多项引流管
        List<HspDgpgclrInf> hspDgpgclrInfs = zyyHspxtpgInfService.finDgpgclrByXtpgSeq(xtpgSeq);
        
        
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("hspSjxtpgInfCustom", hspSjxtpgInfCustom);
        map.put("hspHxxtpgInfCustom", hspHxxtpgInfCustom);
        map.put("hspXxgxtpgInfCustom", hspXxgxtpgInfCustom);
        map.put("hspXhxtpgInfCustom", hspXhxtpgInfCustom);
        map.put("hspMnszxtpgInfCustom", hspMnszxtpgInfCustom);
        map.put("hspGgjpfxtInfCustom", hspGgjpfxtInfCustom);
        map.put("hspXlshpgInfCustom", hspXlshpgInfCustom);
        map.put("hspDgpgInfCustom", hspDgpgInfCustom);
        map.put("hspDgpgclrInfs", hspDgpgclrInfs);
        resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
		
	}
	
	
	@RequestMapping("/querysjxtys")
	public @ResponseBody List<Dstdictinfo> querydictSub(DstdictinfoQueryDto dstdictinfoQueryDto) throws Exception{
		List<Dstdictinfo> dstdictinfos = systemConfigService.findDictinfoSub(dstdictinfoQueryDto);
		return dstdictinfos;
	}
	
	/**
	 * 新增系统评估提交
	 *@param hspHljldInfQueryDto
	 *@return
	 *@throws Exception
	 *@author zc 
	 */
	@RequestMapping("/addxtpgsubmit")
	public @ResponseBody SubmitResultInfo addxtpgsubmit(HspXtpgInfQueryDto hspXtpgInfQueryDto,ActiveUser activeuser)throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		//赋值操作人
		hspXtpgInfQueryDto.getHspXtpgInfCustom().setCrtNur(activeuser.getUsrno());
		hspXtpgInfQueryDto.getHspXtpgInfCustom().setCrtName(activeuser.getUsrname());
		hspXtpgInfQueryDto.getHspXtpgInfCustom().setUpNur(activeuser.getUsrno());
		hspXtpgInfQueryDto.getHspXtpgInfCustom().setUpName(activeuser.getUsrname());
		//赋值时间
		//hspXtpgInfQueryDto.getHspXtpgInfCustom().setCrtDat(new Date());
		hspXtpgInfQueryDto.getHspXtpgInfCustom().setUpDat(new Date());
		
		//生成系统评估号
		Date createdate = new Date();
		String dateStr = DateUtil.formatDateByFormat(createdate, "yyyyMMdd");
		String xtpgSeq=systemConfigService.findSequences("HSPXTPG_SEQ","8",dateStr);
		
		zyyHspxtpgInfService.insertxtpg(hspXtpgInfQueryDto,activeuser,xtpgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 修改系统评估跳转
	 *@param model
	 *@return
	 *@throws Exception
	 *@author zc
	 */
	@RequestMapping("/editxtpg")
	public String editxtpg(Model model,String xtpgSeq,String emgSeq) throws Exception{
		model.addAttribute("xtpgSeq", xtpgSeq);
		model.addAttribute("emgSeq", emgSeq);
		HspemginfCustom hspemginfCustom=baseHspemgInfService.findHspemginfCustom(emgSeq);
		model.addAttribute("hspemginfCustom", hspemginfCustom);
		return "/hzszyyhospital/hzszyyxtpg/editxtpg";
	}
	
	/**
	 * 系统评估单删除提交
	 *@param activeuser
	 *@return
	 *@throws Exception
	 *@author zc
	 */
	@RequestMapping("/deletextpg")
	public @ResponseBody SubmitResultInfo deletextpg(String xtpgSeq) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		zyyHspxtpgInfService.delxtpgsubmit(xtpgSeq);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	/**
	 * 系统评估单修改提交
	 *@param activeuser
	 *@return
	 *@throws Exception
	 *@author zc
	 */
	@RequestMapping("/editxtpgsubmit")
	public @ResponseBody SubmitResultInfo editxtpgsubmit(HspXtpgInfQueryDto hspXtpgInfQueryDto,ActiveUser activeuser
			) throws Exception{
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		//赋值修改
		hspXtpgInfQueryDto.getHspXtpgInfCustom().setUpNur(activeuser.getUsrno());
		hspXtpgInfQueryDto.getHspXtpgInfCustom().setUpName(activeuser.getUsrname());
		hspXtpgInfQueryDto.getHspXtpgInfCustom().setUpDat(new Date());
		zyyHspxtpgInfService.editxtpgsubmit(hspXtpgInfQueryDto,activeuser);
		return ResultUtil.createSubmitResult(resultInfo);
	}
	
	@RequestMapping("/queryduct")
	public String queryduct(Model model,String xtpgSeq,String emgSeq) throws Exception{
		
		return "/hzszyyhospital/hzszyyxtpg/queryduct";
	}
	
	@RequestMapping("/queryduct_result")
	  public @ResponseBody DataGridResultInfo querydep_result(
			  DstdictinfoQueryDto dstdictinfoQueryDto,
				int page,//当前页码
				int rows//每页显示个数
				) throws Exception{
			//非空校验
		    dstdictinfoQueryDto = dstdictinfoQueryDto!=null?dstdictinfoQueryDto:new DstdictinfoQueryDto();
		    //查询列表的总数
			int total =zyyHspxtpgInfService.findDictinfoSubdcount(dstdictinfoQueryDto);
			PageQuery pageQuery = new PageQuery();
			pageQuery.setPageParams(total, rows, page);
			dstdictinfoQueryDto.setPageQuery(pageQuery);
			List<Dstdictinfo> dstdictinfos = zyyHspxtpgInfService.findDictinfoSubd(dstdictinfoQueryDto);
			DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
			//填充total
			dataGridResultInfo.setTotal(total);
			//填充rows
			dataGridResultInfo.setRows(dstdictinfos);
			return dataGridResultInfo;
		}
	
	
	/**
	 * 跳转护理记录页面左侧患者列表
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
	@RequestMapping(value = "/toLeftWrap")
	public String toLeftWrap(Model model, String emgSeq, String cstNam, String zgcount, String pageSrc, String pageFlg, String requestSource, String mpi, String jzxh) {
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
	 * 护理记录页面左侧患者列表数据
	 * @param hspemginfQueryDto
	 * @param page 当前页码
	 * @param rows 每页显示行数
	 * @return
	 * @throws Exception 
	 */
	@ResponseBody
	@RequestMapping(value ="/leftWrap_result")
	public DataGridResultInfo leftWrap_result(HspemginfQueryDto hspemginfQueryDto, int page, int rows) throws Exception {
		//非空校验
		hspemginfQueryDto = hspemginfQueryDto!=null?hspemginfQueryDto:new HspemginfQueryDto();
		hspemginfQueryDto.getHspemginfCustom().setIslgbed(systemConfigService.findAppoptionByOptkey("LG_BED").getOptvalue());
		//列表总数
		int total = zyyHspemginfService.leftWrapCount(hspemginfQueryDto);
		PageQuery pageQuery = new PageQuery();
		pageQuery.setPageParams(total, rows, page);
		hspemginfQueryDto.setPageQuery(pageQuery);
		if(	hspemginfQueryDto.getHspemginfCustom() !=null && hspemginfQueryDto.getHspemginfCustom().getQueryType().equals("0")){
			hspemginfQueryDto.setSort("to_number(showorder)"); 
			hspemginfQueryDto.setOrder("ASC");
		}else{
			hspemginfQueryDto.setSort("EMG_DAT");
			hspemginfQueryDto.setOrder("DESC");
		}
		List<HspemginfCustom> leftWrapList = zyyHspemginfService.leftWrapList(hspemginfQueryDto);
		DataGridResultInfo dataGridResultInfo = new DataGridResultInfo();
		//填充total
		dataGridResultInfo.setTotal(total);
		//填充rows
		dataGridResultInfo.setRows(leftWrapList);
		return dataGridResultInfo;
	}
	
	/**
	 * 点击获取患者信息
	 * @param emgSeq
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/findEmgInfByEmgSeq")
	public SubmitResultInfo findEmgInfByEmgSeq(String emgSeq) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		Map<String,Object> map = new HashMap<String, Object>();
		HspemginfCustom hspemginfCustom = zyyHspemginfService.findEmgInfByEmgSeq(emgSeq);
		map.put("hspemginfCustom",hspemginfCustom);
		resultInfo.setSysdata(map);
		return ResultUtil.createSubmitResult(resultInfo);
	}
}
