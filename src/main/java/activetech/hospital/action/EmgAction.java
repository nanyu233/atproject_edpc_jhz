package activetech.hospital.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.dto.DstdictinfoQueryDto;
import activetech.base.service.SystemConfigService;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.service.HspemginfService;
import activetech.util.StringUtils;

/**
 * 
 * <p>Title:EmgAction</p>
 * <p>Description:急诊记录功能</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年2月17日 上午10:34:40
 *
 */
@Controller
@RequestMapping("/emg")
public class EmgAction {
	@Autowired
	private HspemginfService hspemginfService;
	@Autowired
	private SystemConfigService systemConfigService;
		/**
		 * 根据预检号查询病人信息用于打印
		 * @param emgSeq
		 * @return
		 * @throws Exception
		 */
		@RequestMapping("/findHspemginfByemgSeq2Print")
		public @ResponseBody Map<String, Object> findHspemginfByemgSeq2Print(String emgSeq)throws Exception{
			Map<String, Object> map = new HashMap<String, Object>();
			HspemginfCustom hspemginfCustom=hspemginfService.getEmginfForPrint(emgSeq);
		
			List<Dstdictinfo> dstdictinfoList = systemConfigService.findDictinfoByType("REFUSED_SURVEY");
			List<String>infos = new ArrayList<String>();
			List<String> infocodes = new ArrayList<String>();
			for (Dstdictinfo dstdictinfo : dstdictinfoList) {
				infos.add(dstdictinfo.getInfo());
				infocodes.add(dstdictinfo.getInfocode());
			}
			StringBuffer buffer;
			if(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getRefusedSurvey())){
				String[] refusedSurveys =  hspemginfCustom.getRefusedSurvey().split(",");
				buffer = new StringBuffer();
				for (int j = 0; j < refusedSurveys.length; j++) {
					for(int k =0; k<infos.size();k++){
						if(refusedSurveys[j].equals(infocodes.get(k))){
							buffer.append(infos.get(k));
							buffer.append(",");
						}
					}
				}
				String refusedSurvey=buffer.toString().substring(0, buffer.toString().length()-1);
				hspemginfCustom.setRefusedSurvey(refusedSurvey);
			}
			map.put("hspemginfCustom", hspemginfCustom);
			return map;
		}
		
	
	/**
	 * 获取患者详情基本信息
	 * @param emgSeq
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryhzxq_result")
	public @ResponseBody HspemginfCustom queryhzxq_result(String emgSeq) throws Exception{
		HspemginfCustom hspemginfCustom = hspemginfService.findhzxqByEmgSeq(emgSeq);
		return hspemginfCustom;
	}

	/**
     * 接收病人-mews页面
     * @param model
     * @return
     * @throws Exception
     */
	@RequestMapping("/querymews")
	public String querymews(Model model) throws Exception{
		return "/hospital/nurse/rule/querymews";
	}
	
	/**
     * 接收病人-rems页面
     * @param model
     * @return
     * @throws Exception
     */
	@RequestMapping("/queryrems")
	public String queryrems(Model model) throws Exception{
		return "/hospital/nurse/rule/queryrems";
	}

	/**
     * 接收病人-GCS页面
     * @param model
     * @return
     * @throws Exception
     */
	@RequestMapping("/querygcs")
	public String querygcs(Model model) throws Exception{
		return "/hospital/nurse/rule/querygcs";
	}
	
	/**
     * 接收病人-CRAMS页面
     * @param model
     * @return
     * @throws Exception
     */
	@RequestMapping("/querycrams")
	public String querycrams(Model model) throws Exception{
		return "/hospital/nurse/rule/querycrams";
	}
	
	/**
     * 接收病人-HXKNZB页面
     * @param model
     * @return
     * @throws Exception
     */
	@RequestMapping("/queryhxknzb")
	public String queryhxknzb(Model model) throws Exception{
		return "/hospital/nurse/rule/queryhxknzb";
	}
	
	/**
     * 接收病人-跳转创伤评估页面
     * @param model
     * @return
     * @throws Exception
     */
	@RequestMapping("/querycspg")
	public String querycspg(Model model) throws Exception{
		return "/hospital/nurse/rule/querycspg";
	}
	
	/**
     * 接收病人-xtzbpg页面
     * @param model
     * @return
     * @throws Exception
     */
	@RequestMapping("/queryxtzbpg")
	public String queryxtzbpg(Model model) throws Exception{
		return "/hospital/nurse/rule/queryxtzbpg";
	}
	
	/**
     * 接收病人-xmzbpg页面
     * @param model
     * @return
     * @throws Exception
     */
	@RequestMapping("/queryxmzbpg")
	public String queryxmzbpg(Model model) throws Exception{
		return "/hospital/nurse/rule/queryxmzbpg";
	}
	
	@RequestMapping("/querydictSub")
	public @ResponseBody List<Dstdictinfo> querydictSub(DstdictinfoQueryDto dstdictinfoQueryDto) throws Exception{
		List<Dstdictinfo> dstdictinfos = systemConfigService.findDictinfoSub(dstdictinfoQueryDto);
		return dstdictinfos;
	}

}
