package activetech.aid.service.impl;

import activetech.aid.dao.mapper.AidEptGrpMapper;
import activetech.aid.dao.mapper.AidEptGrpMapperCustom;
import activetech.aid.pojo.domain.AidEptGrp;
import activetech.aid.pojo.domain.AidEptGrpExample;
import activetech.aid.pojo.dto.AidEptGrpCustom;
import activetech.aid.service.OndutyService;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class OndutyServiceImpl implements OndutyService{
	
	
//	@Autowired
//	private HspOndutyMapperCustom hspOndutyMapperCustom;
//
	@Autowired
	private AidEptGrpMapperCustom aidEptGrpMapperCustom;
	
	@Autowired
	private AidEptGrpMapper aidEptGrpMapper;

//	@Override
//	public List<HspOndutyCustom> getOndutyList(String date) {
//		// TODO Auto-generated method stub
//		List<HspOndutyCustom> list = hspOndutyMapperCustom.selectByExample(date);
//
//		List<HspOndutyCustom> rootList = hspOndutyMapperCustom.generateRootNodeList(date);
//
//		list.addAll(rootList);
//
//		return list;
//	}

	@Override
	public List<AidEptGrpCustom> getExpertGroupList() {
		return aidEptGrpMapperCustom.getExpertGroupList();
	}

	@Override
	public ResultInfo addExpertGroupSubmit(AidEptGrpCustom aidEptGrpCustom) {
		ResultInfo resultInfo = null;
		//插入组节点
		aidEptGrpCustom.setGrpNo("0");
		//节点类型
		aidEptGrpCustom.setEptTyp("0");
		aidEptGrpCustom.setEptNo("0");
		aidEptGrpCustom.setWxpFlg("0");
		aidEptGrpCustom.setCrtTim(new Date());
		aidEptGrpCustom.setEptCom("#");
		if(aidEptGrpMapperCustom.addExpertGroup(aidEptGrpCustom)==1){
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		}else{
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 900,null);
		}
		return resultInfo;
	}

	@Override
	public ResultInfo updateExpertGroupSubmit(AidEptGrpCustom aidEptGrpCustom) {
		ResultInfo resultInfo = null;

		aidEptGrpCustom.setModTim(new Date());
		
		if(aidEptGrpMapperCustom.updateByExample(aidEptGrpCustom)==1){
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		}else{
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 900,null);
		}
		
		return resultInfo;
	}

	@Override
	public ResultInfo deleteExpertGroupSubmit(AidEptGrpCustom aidEptGrpCustom) {
		ResultInfo resultInfo = null;
		//先查询该专家组下有没有专家，如果有则不能删除
		AidEptGrpExample example = new AidEptGrpExample();
		AidEptGrpExample.Criteria criteria = example.createCriteria();
		criteria.andGrpNoEqualTo(aidEptGrpCustom.getGrpSeq());
		List<AidEptGrp> list  = aidEptGrpMapper.selectByExample(example);
		if(list.size()>0){
			resultInfo = ResultUtil.createFail(Config.MESSAGE, 906,new Object[]{"该专家组下还有专家，请先删除专家再删除专家组"});
		}else{
			//如果没有专家则执行删除
			if(aidEptGrpMapper.deleteByPrimaryKey(aidEptGrpCustom.getGrpSeq())==1){
				resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
			}else{
				resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 900,null);
			}
		}
		return resultInfo;
	}

	@Override
	public ResultInfo deleteExpertGroupMemberSubmit(AidEptGrpCustom aidEptGrpCustom) {
		ResultInfo resultInfo = null;
		if(aidEptGrpMapper.deleteByPrimaryKey(aidEptGrpCustom.getGrpSeq())==1){
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		}else{
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 900,null);
		}
		return resultInfo;
	}

	@Override
	public ResultInfo updateExpertGroupMemberSubmit(AidEptGrpCustom aidEptGrpCustom) {
		
		ResultInfo resultInfo = null;

		AidEptGrp aidEptGrp = new AidEptGrp();
		aidEptGrp.setGrpSeq(aidEptGrpCustom.getGrpSeq());
		aidEptGrp.setEptTyp(aidEptGrpCustom.getEptTyp());
		aidEptGrp.setWxpFlg(aidEptGrpCustom.getWxpFlg());
		aidEptGrp.setModUsr(aidEptGrpCustom.getModUsr());
		aidEptGrp.setModTim(new Date());
		
		if(aidEptGrpMapper.updateByPrimaryKeySelective(aidEptGrp)==1){
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		}else{
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 900,null);
		}
		
		return resultInfo;
	}

	@Override
	public ResultInfo addExpertGroupMemberSubmit(AidEptGrpCustom aidEptGrpCustom) {
		ResultInfo resultInfo = null;
		aidEptGrpCustom.setGrpNo(aidEptGrpCustom.getGrpSeq());
		aidEptGrpCustom.setCrtTim(new Date());
		aidEptGrpCustom.setEptCom("#");
		if(aidEptGrpMapperCustom.addExpertGroup(aidEptGrpCustom)==1){
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906,null);
		}else{
			resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 900,null);
		}
		return resultInfo;
	}

}
