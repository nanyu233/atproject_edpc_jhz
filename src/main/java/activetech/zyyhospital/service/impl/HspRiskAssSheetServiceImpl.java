package activetech.zyyhospital.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import activetech.zyyhospital.dao.mapper.HspCxfxpgbCustomMapper;
import activetech.zyyhospital.dao.mapper.HspCxfxpgbMapper;
import activetech.zyyhospital.dao.mapper.HspJmxsfxyspgbCustomMapper;
import activetech.zyyhospital.dao.mapper.HspJmxsfxyspgbMapper;
import activetech.zyyhospital.dao.mapper.HspVtefxpgbCustomMapper;
import activetech.zyyhospital.dao.mapper.HspVtefxpgbMapper;
import activetech.zyyhospital.pojo.domain.HspCxfxpgb;
import activetech.zyyhospital.pojo.domain.HspCxfxpgbExample;
import activetech.zyyhospital.pojo.domain.HspJmxsfxyspgb;
import activetech.zyyhospital.pojo.domain.HspJmxsfxyspgbExample;
import activetech.zyyhospital.pojo.domain.HspVtefxpgb;
import activetech.zyyhospital.pojo.domain.HspVtefxpgbExample;
import activetech.zyyhospital.pojo.dto.HspCxfxpgbCustom;
import activetech.zyyhospital.pojo.dto.HspCxfxpgbCustomDto;
import activetech.zyyhospital.pojo.dto.HspJmxsfxyspgbCustom;
import activetech.zyyhospital.pojo.dto.HspJmxsfxyspgbCustomDto;
import activetech.zyyhospital.pojo.dto.HspVtefxpgbCustom;
import activetech.zyyhospital.pojo.dto.HspVtefxpgbCustomDto;
import activetech.zyyhospital.service.RiskAssSheetService;

public class HspRiskAssSheetServiceImpl implements RiskAssSheetService {
	@Autowired
	private HspCxfxpgbCustomMapper hspCxfxpgbCustomMapper;
	@Autowired
	private HspCxfxpgbMapper hspCxfxpgbMapper;
	@Autowired
	private HspVtefxpgbMapper hspVtefxpgbMapper;
	@Autowired
	private HspVtefxpgbCustomMapper hspVtefxpgbCustomMapper;
	@Autowired
	private HspJmxsfxyspgbMapper hspJmxsfxyspgbMapper;
	@Autowired
	private HspJmxsfxyspgbCustomMapper hspJmxsfxyspgbCustomMapper;

	@Override
	public HspCxfxpgbCustom findCxfxpgbByEmgSeq(String emgSeq) {
		return hspCxfxpgbCustomMapper.getCxfxpgbByEmgSeq(emgSeq);
	}

	@Override
	public void submitCxfxpgb(HspCxfxpgbCustomDto hspCxfxpgbCustomDto, ActiveUser activeUser) throws Exception {
		// 保存出血风险评估表
		HspCxfxpgbCustom hspCxfxpgbCustom = hspCxfxpgbCustomDto.getHspCxfxpgbCustom();
		HspCxfxpgbExample example = new HspCxfxpgbExample();
		HspCxfxpgbExample.Criteria criteria = example.createCriteria();
		criteria.andEmgSeqEqualTo(hspCxfxpgbCustom.getEmgSeq());
		List<HspCxfxpgb> cxfxpgbList = hspCxfxpgbMapper.selectByExample(example);
		HspCxfxpgb hspCxfxpgb = null;
		if (StringUtils.isNotNullAndZero(cxfxpgbList)) {
			hspCxfxpgb = cxfxpgbList.get(0);
		}

		if (hspCxfxpgb != null) {
			String nullstr = this.updateHspCxfxpgbNotNullAndEmptyByTrim(hspCxfxpgbCustom);
			if (StringUtils.isNotNullAndEmptyByTrim(nullstr)) {
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911, new Object[] { nullstr }));
			}
			hspCxfxpgbCustom.setCreateDate(hspCxfxpgb.getCreateDate());
			hspCxfxpgbCustom.setCreateDoc(hspCxfxpgb.getCreateDoc());
			hspCxfxpgbCustom.setUpdateDate(new Date());
			hspCxfxpgbCustom.setUpdateDoc(activeUser.getUsrno());
			hspCxfxpgbMapper.updateByPrimaryKey(hspCxfxpgbCustom);
		} else {
			// 1.非空校验
			String nullstr = this.insertHspCxfxpgbNotNullAndEmptyByTrim(hspCxfxpgbCustom);
			if (StringUtils.isNotNullAndEmptyByTrim(nullstr)) {
				// 抛出异常
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911, new Object[] { nullstr }));
			}
			hspCxfxpgbCustom.setRiskSeq(UUIDBuild.getUUID());
			hspCxfxpgbCustom.setCreateDate(new Date());
			hspCxfxpgbCustom.setCreateDoc(activeUser.getUsrno());
			hspCxfxpgbMapper.insert(hspCxfxpgbCustom);
		}

	}

	private String insertHspCxfxpgbNotNullAndEmptyByTrim(HspCxfxpgbCustom hspCxfxpgbCustom) {
		if (!StringUtils.isNotNullAndEmptyByTrim(hspCxfxpgbCustom.getEmgSeq())) {
			return "预检号";
		}
		return null;
	}

	private String updateHspCxfxpgbNotNullAndEmptyByTrim(HspCxfxpgbCustom hspCxfxpgbCustom) {
		if (!StringUtils.isNotNullAndEmptyByTrim(hspCxfxpgbCustom.getEmgSeq())) {
			return "预检号";
		}
		if (!StringUtils.isNotNullAndEmptyByTrim(hspCxfxpgbCustom.getRiskSeq())) {
			return "风险因素id";
		}
		return null;
	}

	@Override
	public HspCxfxpgbCustomDto findCxfxpgbById(String emgSeq) throws Exception {

		HspCxfxpgbCustomDto hspCxfxpgbCustomDto = new HspCxfxpgbCustomDto();
		HspCxfxpgbCustom hspCxfxpgbCustom = hspCxfxpgbCustomMapper.getCxfxpgbByEmgSeq(emgSeq);
		hspCxfxpgbCustomDto.setHspCxfxpgbCustom(hspCxfxpgbCustom);
		return hspCxfxpgbCustomDto;

	}

	// ------------------------------------vte---------------------------------------
	@Override
	public HspVtefxpgbCustom findVtefxpgbByEmgSeq(String emgSeq) {
		return hspVtefxpgbCustomMapper.getVtefxpgbByEmgSeq(emgSeq);
	}

	@Override
	public void submitVtefxpgb(HspVtefxpgbCustomDto hspVtefxpgbCustomDto, ActiveUser activeUser) {
		// 保存VTE风险评估表
		HspVtefxpgbCustom hspVtefxpgbCustom = hspVtefxpgbCustomDto.getHspVtefxpgbCustom();
		String emgSeq = hspVtefxpgbCustom.getEmgSeq();
		if (hspVtefxpgbCustom != null) {
			HspVtefxpgbExample hspVtefxpgbExample = new HspVtefxpgbExample();
			HspVtefxpgbExample.Criteria criteria =  hspVtefxpgbExample.createCriteria();
			criteria.andEmgSeqEqualTo(hspVtefxpgbCustom.getEmgSeq());
			List<HspVtefxpgb> HspVtefxpgb = hspVtefxpgbMapper.selectByExample(hspVtefxpgbExample);
			String riskSeq = hspVtefxpgbCustom.getRiskSeq();
			if(HspVtefxpgb !=null && HspVtefxpgb.size()>0){
				HspVtefxpgb hspVtefxpgb = hspVtefxpgbMapper.selectByPrimaryKey(HspVtefxpgb.get(0).getRiskSeq());
				if (!StringUtils.isNotNullAndEmptyByTrim(riskSeq)) {
					hspVtefxpgbCustom.setRiskSeq(HspVtefxpgb.get(0).getRiskSeq());
				} 
				hspVtefxpgbCustom.setCreateDate(hspVtefxpgb.getCreateDate());
				hspVtefxpgbCustom.setCreateDoc(hspVtefxpgb.getCreateDoc());
				hspVtefxpgbCustom.setUpdateDate(new Date());
				hspVtefxpgbCustom.setUpdateDoc(activeUser.getUsrno());
				hspVtefxpgbMapper.updateByPrimaryKey(hspVtefxpgbCustom);
			}else {
				riskSeq = UUIDBuild.getUUID();
				hspVtefxpgbCustom.setRiskSeq(riskSeq);
				hspVtefxpgbCustom.setCreateDate(new Date());
				hspVtefxpgbCustom.setCreateDoc(activeUser.getUsrno());
				hspVtefxpgbMapper.insert(hspVtefxpgbCustom);
			}
		}
	}

	@Override
	public HspVtefxpgbCustomDto findVtefxpgbById(String emgSeq) throws Exception {
		HspVtefxpgbCustomDto hspVtefxpgbCustomDto = new HspVtefxpgbCustomDto();
		HspVtefxpgbCustom hspVtefxpgbCustom = hspVtefxpgbCustomMapper.getVtefxpgbByEmgSeq(emgSeq);
		hspVtefxpgbCustomDto.setHspVtefxpgbCustom(hspVtefxpgbCustom);
		return hspVtefxpgbCustomDto;
	}

	// -------------------------------静脉血栓--------------------------------
	@Override
	public HspJmxsfxyspgbCustom findJmxsfxpgbByEmgSeq(String emgSeq) {
		return hspJmxsfxyspgbCustomMapper.getJmxsfxpgbByEmgSeq(emgSeq);
	}

	@Override
	public void submitJmxsfxpgb(HspJmxsfxyspgbCustomDto hspJmxsfxyspgbCustomDto, ActiveUser activeUser) {
		// 保存静脉血栓风险评估表
		HspJmxsfxyspgbCustom hspJmxsfxyspgbCustom = hspJmxsfxyspgbCustomDto.getHspJmxsfxyspgbCustom();
		if (hspJmxsfxyspgbCustom != null) {
			HspJmxsfxyspgbExample hspJmxsfxyspgbExample = new HspJmxsfxyspgbExample();
			HspJmxsfxyspgbExample.Criteria criteria =  hspJmxsfxyspgbExample.createCriteria();
			criteria.andEmgSeqEqualTo(hspJmxsfxyspgbCustom.getEmgSeq());
			List<HspJmxsfxyspgb> HspJmxsfxyspgb = hspJmxsfxyspgbMapper.selectByExample(hspJmxsfxyspgbExample);
			String riskSeq = hspJmxsfxyspgbCustom.getRiskSeq();
			if(HspJmxsfxyspgb !=null && HspJmxsfxyspgb.size()>0){
				HspJmxsfxyspgb hspJmxsfxyspgb = hspJmxsfxyspgbMapper.selectByPrimaryKey(HspJmxsfxyspgb.get(0).getRiskSeq());
				if (!StringUtils.isNotNullAndEmptyByTrim(riskSeq)) {
					hspJmxsfxyspgbCustom.setRiskSeq(HspJmxsfxyspgb.get(0).getRiskSeq());
				} 
				hspJmxsfxyspgbCustom.setCreateDate(hspJmxsfxyspgb.getCreateDate());
				hspJmxsfxyspgbCustom.setCreateDoc(hspJmxsfxyspgb.getCreateDoc());
				hspJmxsfxyspgbCustom.setUpdateDate(new Date());
				hspJmxsfxyspgbCustom.setUpdateDoc(activeUser.getUsrno());
				hspJmxsfxyspgbMapper.updateByPrimaryKey(hspJmxsfxyspgbCustom);
			}
			else {
				riskSeq = UUIDBuild.getUUID();
				hspJmxsfxyspgbCustom.setRiskSeq(riskSeq);
				hspJmxsfxyspgbCustom.setCreateDate(new Date());
				hspJmxsfxyspgbCustom.setCreateDoc(activeUser.getUsrno());
				hspJmxsfxyspgbMapper.insert(hspJmxsfxyspgbCustom);
			}
		}
	}

	@Override
	public HspJmxsfxyspgbCustomDto findJmxsfxpgbById(String emgSeq) throws Exception {
		HspJmxsfxyspgbCustomDto hspJmxsfxyspgbCustomDto = new HspJmxsfxyspgbCustomDto();
		HspJmxsfxyspgbCustom hspJmxsfxyspgbCustom = hspJmxsfxyspgbCustomMapper.getJmxsfxpgbByEmgSeq(emgSeq);
		hspJmxsfxyspgbCustomDto.setHspJmxsfxyspgbCustom(hspJmxsfxyspgbCustom);
		return hspJmxsfxyspgbCustomDto;
	}
}
