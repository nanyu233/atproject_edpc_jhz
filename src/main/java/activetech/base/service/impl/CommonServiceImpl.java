package activetech.base.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.dao.mapper.HspAddrPostMapper;
import activetech.base.pojo.domain.HspAddrPost;
import activetech.base.pojo.domain.HspAddrPostExample;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.CommonService;

public class CommonServiceImpl implements CommonService{
	
	@Autowired
	private HspAddrPostMapper hspAddrPostMapper;

	@Override
	public ResultInfo getAddrDict() {

		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		
		HspAddrPostExample example = new HspAddrPostExample();
		
		HspAddrPostExample.Criteria criteria = example.createCriteria();
		
		criteria.andAddrTypeEqualTo("shengji");
		
		example.setOrderByClause("addr_code");
		
		List<HspAddrPost> province = hspAddrPostMapper.selectByExample(example);
		
		
		
		
        HspAddrPostExample example2 = new HspAddrPostExample();
		
		HspAddrPostExample.Criteria criteria2 = example2.createCriteria();
		
		criteria2.andAddrTypeEqualTo("diji");
		
		example2.setOrderByClause("addr_code");
		
		List<HspAddrPost> city = hspAddrPostMapper.selectByExample(example2);
		
		
		
		HspAddrPostExample example3 = new HspAddrPostExample();
			
		HspAddrPostExample.Criteria criteria3 = example3.createCriteria();

		criteria3.andAddrTypeEqualTo("xianji");
		
		example3.setOrderByClause("addr_code");
		
		List<HspAddrPost> cnty = hspAddrPostMapper.selectByExample(example3);
		
		
		Map<String,List<HspAddrPost>> cityMap = new HashMap<String,List<HspAddrPost>>();
		
		for(HspAddrPost hspAddrPost:city){
			String superCode = hspAddrPost.getSuprCode();
			if(cityMap.containsKey(superCode)){
				cityMap.get(superCode).add(hspAddrPost);
			}else{
				List<HspAddrPost> list = new ArrayList<HspAddrPost>();
				list.add(hspAddrPost);
				cityMap.put(superCode, list);
			}
		}
		
        Map<String,List<HspAddrPost>> cntyMap = new HashMap<String,List<HspAddrPost>>();
		
		for(HspAddrPost hspAddrPost:cnty){
			String superCode = hspAddrPost.getSuprCode();
			if(cntyMap.containsKey(superCode)){
				cntyMap.get(superCode).add(hspAddrPost);
			}else{
				List<HspAddrPost> list = new ArrayList<HspAddrPost>();
				list.add(hspAddrPost);
				cntyMap.put(superCode, list);
			}
		}
		
        Map<String,Object> map = new HashMap<String,Object>();
		
		map.put("province", province);
		
		map.put("cityMap", cityMap);
		
		map.put("cntyMap", cntyMap);
		
		resultInfo.setSysdata(map);
		
		return resultInfo;
	}

}
