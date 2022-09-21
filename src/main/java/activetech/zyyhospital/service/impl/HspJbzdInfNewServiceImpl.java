package activetech.zyyhospital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.hospital.dao.mapper.HspEmgInfMapper;
import activetech.hospital.dao.mapper.HspJbzdInfCustomMapper;
import activetech.hospital.dao.mapper.HspJbzdInfMapper;
import activetech.hospital.pojo.domain.HspEmgInf;
import activetech.hospital.pojo.domain.HspJbzdInfExample;
import activetech.hospital.pojo.dto.HspJbzdInfCustom;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import activetech.zyyhospital.service.HspJbzdInfNewService;

public class HspJbzdInfNewServiceImpl implements HspJbzdInfNewService {
	@Autowired
	private HspJbzdInfMapper hspJbzdInfMapper;
	@Autowired
	private HspJbzdInfCustomMapper hspJbzdInfCustomMapper;
	@Autowired
	private HspEmgInfMapper hspEmgInfMapper;
	

	@Override
	public List<HspJbzdInfCustom> findJbzdListByEmgSeq(
			HspJbzdInfCustom hspJbzdInfCustom) throws Exception {
		if(hspJbzdInfCustom==null)
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920,new Object[] {"数据有误！建议刷新页面重来。"}));
		return hspJbzdInfCustomMapper.findHspJbzdInfHzzd(hspJbzdInfCustom);
	}

	@Override
	public String submitJbzdList(List<HspJbzdInfCustom> jbzdList,ActiveUser activeUser)
			throws Exception {
		if(jbzdList==null || jbzdList.size()<1)
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920,new Object[] {"数据有误！建议刷新页面重来。"}));
		
		HspJbzdInfCustom hspJbzdInfCustom=jbzdList.get(jbzdList.size()-1);
		//删除原有诊断数据
		delJbzd(hspJbzdInfCustom.getEmgSeq(), hspJbzdInfCustom.getJbzdType());
		//新增诊断数据，返回诊断拼接字符串
		String jbzdDes=addJbzdList(jbzdList,hspJbzdInfCustom,activeUser).toString();
		//更新主表jbzdDes
		HspEmgInf  hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(hspJbzdInfCustom.getEmgSeq());
		if("1".equals(hspJbzdInfCustom.getJbzdType())){
			hspEmgInf.setJbzdDes(jbzdDes);
		}else if("2".equals(hspJbzdInfCustom.getJbzdType())){
			hspEmgInf.setRyzdXy(jbzdDes);
		}else if("3".equals(hspJbzdInfCustom.getJbzdType())){
			hspEmgInf.setCyzdZy(jbzdDes);
		}else if("4".equals(hspJbzdInfCustom.getJbzdType())){
			hspEmgInf.setCyzdXy(jbzdDes);
		}else if("5".equals(hspJbzdInfCustom.getJbzdType())){
			hspEmgInf.setDeathDiagnosis(jbzdDes);
		}
		hspEmgInfMapper.updateByPrimaryKey(hspEmgInf);
		return jbzdDes;
	}

	private void delJbzd(String emgSeq,String jbzdType) throws Exception {
		if(StringUtils.isNotNullAndEmptyByTrim(emgSeq)){
			HspJbzdInfExample hspJbzdInfExample=new HspJbzdInfExample();
			HspJbzdInfExample.Criteria criteria=hspJbzdInfExample.createCriteria();
			criteria.andEmgSeqEqualTo(emgSeq);
			criteria.andJbzdTypeEqualTo(jbzdType);
			hspJbzdInfMapper.deleteByExample(hspJbzdInfExample);
		}

	}
	
	
	private StringBuilder addJbzdList(List<HspJbzdInfCustom> list,HspJbzdInfCustom hspJbzdInfCustom,ActiveUser activeUser) throws Exception {
		StringBuilder jbzdDes=new StringBuilder();
		boolean jcFlg=true;
		//诊断排序用
		int showOrder = 0;
		if(list!=null && list.size()>0){
			for (int i=0;i<list.size();i++) {
				showOrder++;
				HspJbzdInfCustom hspJbzdInfCustom2=list.get(i);
				if(i==list.size()-1){
					if(StringUtils.isNotNullAndEmptyByTrim(hspJbzdInfCustom2.getJbzdComm()))
						jbzdDes.append(hspJbzdInfCustom2.getJbzdComm());
					else
						jcFlg=false;
				}else{
					//拼接诊断
					jbzdDes.append(hspJbzdInfCustom2.getJbzdPrefix()!=null?hspJbzdInfCustom2.getJbzdPrefix():"");
					jbzdDes.append(hspJbzdInfCustom2.getHzzdCodname()!=null?hspJbzdInfCustom2.getHzzdCodname():"");
					jbzdDes.append(hspJbzdInfCustom2.getJbzdSuffix()!=null?hspJbzdInfCustom2.getJbzdSuffix()+"；":"；");
				}
				hspJbzdInfCustom2.setEmgSeq(hspJbzdInfCustom.getEmgSeq());
				hspJbzdInfCustom2.setJbzdType(hspJbzdInfCustom.getJbzdType());
				hspJbzdInfCustom2.setJbzdSeq(UUIDBuild.getUUID());
				//hspJbzdInfCustom2.setHzzdUpdDat(hspJbzdInfCustom.getHzzdUpdDat());
				hspJbzdInfCustom2.setHzzdUpdNbr(activeUser.getUsrno());
				hspJbzdInfCustom2.setShowOrder(String.valueOf(showOrder));
				if(jcFlg)
					hspJbzdInfMapper.insert(hspJbzdInfCustom2);
			}
		}
		return jbzdDes;
	}

}
