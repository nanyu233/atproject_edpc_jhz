package activetech.zyyhospital.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.SystemConfigService;
import activetech.basehems.service.BaseHspemgInfService;
import activetech.hospital.dao.mapper.HspEmgInfMapper;
import activetech.hospital.dao.mapper.HspemginfCustomMapper;
import activetech.hospital.pojo.domain.HspEmgInf;
import activetech.hospital.pojo.domain.HspEmgInfExample;
import activetech.hospital.pojo.dto.HspFastInfCustom;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.zyyhospital.dao.mapper.HspQtsjglCustomMapper;
import activetech.zyyhospital.dao.mapper.HspQtsjglMapper;
import activetech.zyyhospital.pojo.domain.HspQtsjgl;
import activetech.zyyhospital.pojo.dto.HspQtsjglCustom;
import activetech.zyyhospital.pojo.dto.HspQtsjglQueryDto;
import activetech.zyyhospital.service.HspQtsjglService;


public class HspQtsjglServiceImpl implements HspQtsjglService {
	@Autowired
	private HspQtsjglCustomMapper hspQtsjglCustomMapper;
	@Autowired
	private HspQtsjglMapper hspQtsjglMapper;
	@Autowired
	private HspEmgInfMapper hspEmgInfMapper;
	@Autowired
	private BaseHspemgInfService baseHspemgInfService;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private HspemginfCustomMapper hspemginfCustomMapper;
	
	@Override
	public int findHspCbyxglCount(HspQtsjglQueryDto hspQtsjglQueryDto)
			throws Exception {
		int total = hspQtsjglCustomMapper.findHspQtsjglCount(hspQtsjglQueryDto);
		return total;
	}

	@Override
	public List<HspQtsjglCustom> findHspQtsjglList(HspQtsjglQueryDto hspQtsjglQueryDto) throws Exception {
		List<HspQtsjglCustom> list = hspQtsjglCustomMapper.findHspQtsjglList(hspQtsjglQueryDto);
		return list;
	}

	@Override
	public Map<String,Object> addHspQtsjgl(HspQtsjglQueryDto hspQtsjglQueryDto,ActiveUser activeUser)
			throws Exception {
		String date = DateUtil.formatDateByFormat(new Date(), "yyyyMMdd");
		String id = systemConfigService.findSequences("HSPQTSGL_QTSSEQ","6", date);
		List<Integer> triageList = new ArrayList<Integer>();
		//如果qtsj为空则说明是新增的群体事件
		if(!StringUtils.isNotNullAndEmptyByTrim(hspQtsjglQueryDto.getHspQtsjglCustom().getQtsjSeq())) {
			// 1.非空校验
			String nullstr = this.insertHspCbyxglisNotNullAndEmptyByTrim(hspQtsjglQueryDto.getHspQtsjglCustom());
			if (StringUtils.isNotNullAndEmptyByTrim(nullstr)) {
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,
						new Object[] { nullstr }));
			}
			if("precheckPage".equals(hspQtsjglQueryDto.getPageName())) {
				hspQtsjglQueryDto.getHspQtsjglCustom().setDjdat(new Date());
				hspQtsjglQueryDto.getHspQtsjglCustom().setDjrnam(activeUser.getUsrname());
			}
			hspQtsjglQueryDto.getHspQtsjglCustom().setQtsjSeq(id);
			hspQtsjglMapper.insertSelective(hspQtsjglQueryDto.getHspQtsjglCustom());
			triageList = insertHspemginf(id,hspQtsjglQueryDto,activeUser,true);
		}else {
			id = hspQtsjglQueryDto.getHspQtsjglCustom().getQtsjSeq();
			triageList = insertHspemginf(id,hspQtsjglQueryDto,activeUser,false);
		}
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", id);
		map.put("triageList", triageList);
		return map;
	}
	
	
	/**
	 * 群体事件必填字段项非空校验
	 * 
	 * @param dstroleCustom
	 * @return
	 */
	private String insertHspCbyxglisNotNullAndEmptyByTrim(
			HspQtsjglCustom hspQtsjglCustom) {
		// 事件名称
		if (!StringUtils.isNotNullAndEmptyByTrim(hspQtsjglCustom.getQtsjNam())) {
			return "事件名称";
		}
		// 发生时间
		if (!StringUtils.isNotNullAndEmptyByTrim(hspQtsjglCustom.getQtsjDat())) {
			return "发生时间";
		}
		return null;
	}

	@Override
	public HspQtsjgl findById(HspQtsjglQueryDto hspQtsjglQueryDto)
			throws Exception {
		HspQtsjgl hspQtsjgl = hspQtsjglMapper.selectByPrimaryKey(hspQtsjglQueryDto.getHspQtsjglCustom().getQtsjSeq());
		return hspQtsjgl;
	}

	@Override
	public void updateHspQtsjgl(HspQtsjglQueryDto hspQtsjglQueryDto)
			throws Exception {
		// 1.非空校验
		String nullstr = this.insertHspCbyxglisNotNullAndEmptyByTrim(hspQtsjglQueryDto.getHspQtsjglCustom());
		if (StringUtils.isNotNullAndEmptyByTrim(nullstr)) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,
					new Object[] { nullstr }));
		}
		HspQtsjgl hspQtsjgl=hspQtsjglMapper.selectByPrimaryKey(hspQtsjglQueryDto.getHspQtsjglCustom().getQtsjSeq());
		hspQtsjgl.setQtsjNam(hspQtsjglQueryDto.getHspQtsjglCustom().getQtsjNam());
		hspQtsjgl.setQtsjType(hspQtsjglQueryDto.getHspQtsjglCustom().getQtsjType());
		hspQtsjgl.setQtsjDat(hspQtsjglQueryDto.getHspQtsjglCustom().getQtsjDat());
		hspQtsjgl.setAdrr(hspQtsjglQueryDto.getHspQtsjglCustom().getAdrr());
		hspQtsjgl.setJyjg(hspQtsjglQueryDto.getHspQtsjglCustom().getJyjg());
		hspQtsjgl.setQjgc(hspQtsjglQueryDto.getHspQtsjglCustom().getQjgc());
		hspQtsjgl.setQjxj(hspQtsjglQueryDto.getHspQtsjglCustom().getQjxj());
		hspQtsjgl.setBgbm(hspQtsjglQueryDto.getHspQtsjglCustom().getBgbm());
		hspQtsjgl.setBgrnam(hspQtsjglQueryDto.getHspQtsjglCustom().getBgrnam());
		hspQtsjgl.setDjdat(hspQtsjglQueryDto.getHspQtsjglCustom().getDjdat());
		hspQtsjgl.setDjrnam(hspQtsjglQueryDto.getHspQtsjglCustom().getDjrnam());
		hspQtsjgl.setGlks(hspQtsjglQueryDto.getHspQtsjglCustom().getGlks());
		hspQtsjgl.setYhry(hspQtsjglQueryDto.getHspQtsjglCustom().getYhry());
		hspQtsjgl.setQtsjTypeOther(hspQtsjglQueryDto.getHspQtsjglCustom().getQtsjTypeOther());
		hspQtsjglMapper.updateByPrimaryKey(hspQtsjgl);
	}

	/**
	 * 删除群体事件
	 */
	@Override
	public void deleteHspQtsjgl(String id) throws Exception {
		// 1.非空校验
		if (!StringUtils.isNotNullAndEmptyByTrim(id)) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,
					new Object[] { "群体事件管理ID" }));
		}
		// 2.删除信息是否存在
		HspQtsjgl hspQtsjgl=hspQtsjglMapper.selectByPrimaryKey(id);
		if (hspQtsjgl == null) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 912,
					new Object[] { "群体事件", "" }));
		}
		hspQtsjglMapper.deleteByPrimaryKey(id);
		//3.关联患者的qtsj_seq清空
		HspEmgInfExample example = new HspEmgInfExample();
		HspEmgInfExample.Criteria criteria = example.createCriteria();
		criteria.andQtsjSeqEqualTo(id);
		List<HspEmgInf> emgList = hspEmgInfMapper.selectByExample(example);
		if(emgList!=null&&emgList.size()>0){
			for(int i=0;i<emgList.size();i++){
				HspEmgInf emg = emgList.get(i);
				if(null!=emg &&!"".equals(emg)){
					emg.setQtsjFlg("0");
					emg.setQtsjSeq("");
					emg.setTriageNum("");
					hspEmgInfMapper.updateByPrimaryKeySelective(emg);
				}
			}
		}
		
	}
	/**
	 * 患者绑定
	 * 
	 * @return
	 */
	@Override
	public HspQtsjglCustom updateEmgQtsj(HspQtsjglQueryDto hspQtsjglQueryDto)
			throws Exception {
		HspQtsjglCustom hspQtsjglCustom = hspQtsjglQueryDto.getHspQtsjglCustom();
		if(hspQtsjglCustom != null){
			if(StringUtils.isNotNullAndEmptyByTrim(hspQtsjglCustom.getQtsjseqContents())){
				String[] a = hspQtsjglCustom.getQtsjseqContents().split(",");  
				for (int i = 0; i < a.length; i++) {
					if(a[i]!=null&&!"".equals(a[i])){
						HspEmgInf back = hspEmgInfMapper.selectByPrimaryKey(a[i]);
						if(back!=null){
							//获取该群体事件是否有患者绑定，如果有则取到最大的分组序号
							Integer maxTriage = hspemginfCustomMapper.findMaxTriage(hspQtsjglCustom.getQtsjSeq());
							if(null != maxTriage) {
								maxTriage += 1;
							}else {
								maxTriage = 1;
							}
							back.setTriageNum(maxTriage.toString());
							back.setQtsjFlg("1");
							back.setQtsjSeq(hspQtsjglCustom.getQtsjSeq());
							hspEmgInfMapper.updateByPrimaryKeySelective(back);
						}
					}
				}
				return hspQtsjglCustom;
			}
		}
		return null;
	}
	/**
	 * 患者解绑
	 * 
	 * @return
	 */
	@Override
	public HspQtsjglCustom updateEmgQtsjjb(HspQtsjglQueryDto hspQtsjglQueryDto)
			throws Exception {
		HspQtsjglCustom hspQtsjglCustom = hspQtsjglQueryDto.getHspQtsjglCustom();
		HspEmgInf back = hspEmgInfMapper.selectByPrimaryKey(hspQtsjglCustom.getEmgSeq());
		if(back!=null){
			back.setQtsjFlg("0");
			back.setQtsjSeq("");
			back.setTriageNum("");
			hspEmgInfMapper.updateByPrimaryKeySelective(back);
			return hspQtsjglCustom;
		}
		return null;
	}
	
	
	/**
	 * 预检、留抢登记页面 群体事件管理
	 * @param id
	 * @param hspQtsjglQueryDto
	 * @param activeUser
	 * @throws Exception
	 */
	public List<Integer> insertHspemginf (String id,HspQtsjglQueryDto hspQtsjglQueryDto,ActiveUser activeUser,boolean flag) throws Exception {
		List<Integer> triageList = new ArrayList<Integer>();
		//预检、留抢登记页面 群体事件
		if(null != hspQtsjglQueryDto.getHspemginfCustom() && null!=hspQtsjglQueryDto.getHspemginfCustom().getTriageNum()){
			HspemginfQueryDto hspemginfQueryDto = new HspemginfQueryDto();
			hspemginfQueryDto.setHspFastInfCustom(new HspFastInfCustom());
			int triageNum = Integer.valueOf(hspQtsjglQueryDto.getHspemginfCustom().getTriageNum());
			Integer maxTriage = 1;
			if(!flag) {
				//获取该群体事件是否有患者绑定，如果有则取到最大的分组序号
				maxTriage = hspemginfCustomMapper.findMaxTriage(id);
				//如果分组序号不为空则说明有绑定
				if(null != maxTriage) {
					triageNum +=maxTriage;
					maxTriage += 1;
				}else {
					maxTriage = 1;
				}
			}
			HspemginfCustom hspemginfCustom = hspQtsjglQueryDto.getHspemginfCustom();
			hspemginfCustom.setQtsjFlg("1");
			hspemginfCustom.setQtsjSeq(id);
			String name = hspemginfCustom.getCstNam();
			//如果事件类型为其他
			if("9".equals(hspQtsjglQueryDto.getHspQtsjglCustom().getQtsjType())) {
				name = hspQtsjglQueryDto.getHspQtsjglCustom().getQtsjTypeOther();
			}
			
			//循环添加数据
			for(int i = maxTriage; i<=triageNum ; i++) {
				String date = DateUtil.formatDateByFormat(new Date(), "yyyyMMdd");
				String emgseq = systemConfigService.findSequences("HSPEMGINF_EMGSEQ","6", date);
				String observationCode =systemConfigService.findSequences("HSPEMGINF_OBSERVATIONCODE","6","QTS");
				hspemginfCustom.setEmgSeq(emgseq);
				hspemginfCustom.setVstCad(observationCode);
				hspemginfCustom.setTriageNum(String.valueOf(i));
				hspemginfCustom.setCstNam(name+i);
				hspemginfQueryDto.setHspemginfCustom(hspemginfCustom);
				baseHspemgInfService.insertBaseHspemginf(hspemginfQueryDto,activeUser);
				triageList.add(i);
			}
		}
		
		return triageList;
	}
}
