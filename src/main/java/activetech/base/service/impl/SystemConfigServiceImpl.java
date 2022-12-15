package activetech.base.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import activetech.base.process.context.Config;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.domain.Dstappoption;
import activetech.base.pojo.domain.Dstdictinfo;
import activetech.base.pojo.domain.DstdictinfoExample;
import activetech.base.pojo.dto.DstdictinfoQueryDto;
import activetech.base.dao.mapper.DstdictinfoCustomMapper;
import activetech.base.dao.mapper.DstdictinfoMapper;
import activetech.base.dao.mapper.DstappoptionMapper;
import activetech.base.service.SystemConfigService;

/**
 * 
 * <p>Title:SystemConfigServiceImpl</p>
 * <p>Description:系统级Service实现类</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2016-12-29 下午4:37:38
 * 、
 */
public class SystemConfigServiceImpl  implements SystemConfigService{

	@Autowired
	DstdictinfoMapper DstdictinfoMapper;
	
	@Autowired
	DstappoptionMapper DstappoptionMapper;
	
	@Autowired
	DstdictinfoCustomMapper DstdictinfoCustomMapper;

	/**
	 * 根据typecode获取数据字典的信息
	 * @param：编码类型
	 * @return：编码类型对应数据字典信息
	 */
	public List findDictinfoByType(String typecode) throws Exception {
		DstdictinfoExample  dstdictinfoExample  =  new DstdictinfoExample();
		DstdictinfoExample.Criteria criteria = dstdictinfoExample.createCriteria();
		criteria.andTypecodeEqualTo(typecode);
		criteria.andIsenableEqualTo("1");
		dstdictinfoExample.setOrderByClause("dictsort asc");
		return DstdictinfoMapper.selectByExample(dstdictinfoExample);
	}

	/**
	 * 根据数据字典中的typecode，和infocode获取一条信息
	 * @param：编码类型，子编码
	 * @return：子编码对应单条信息
	 */
	public Dstdictinfo findDictinfoByInfocode(String typecode, String infocode)
			throws Exception {
		DstdictinfoExample  dstdictinfoExample  =  new DstdictinfoExample();
		DstdictinfoExample.Criteria criteria = dstdictinfoExample.createCriteria();
		criteria.andTypecodeEqualTo(typecode);
		criteria.andInfocodeEqualTo(infocode);
		List<Dstdictinfo> list = DstdictinfoMapper.selectByExample(dstdictinfoExample);
		if(list!=null && list.size()==1){
			return list.get(0);
		}
		return null;
	}

	/**
	 * 根据系统参数id获取系统参数表信息
	 * @param：参数值
	 * @return：参数信息
	 */
	public Dstappoption findAppoptionByOptkey(String optkey) throws Exception {
		return DstappoptionMapper.selectByPrimaryKey(optkey);
	}

	/**
	 * 获取集合包含字符串的字典信息
	 * @param：types
	 * @return：List<Dstdictinfo>
	 */
	public List<Dstdictinfo> findDstdictinfos(List<String> types) throws Exception {
		return DstdictinfoCustomMapper.findDictListByTypes(types);
	}

	/**
	 * 获取数据字典的内含
	 * @param：dstdictinfo
	 * @return：List<Dstdictinfo>
	 */
	public List<Dstdictinfo> findDictinfoSub(DstdictinfoQueryDto dstdictinfoQueryDto) {
		List<Dstdictinfo> list = DstdictinfoCustomMapper.findDictinfoSub(dstdictinfoQueryDto);
		return list;
	}
	
	 /**
	  * 查询sequences 公用方法
	  * @param Sequnences
	  * @return
	  */
	 public String findSequences(String Sequences,String weishu,String Date){
		 String Seq=DstdictinfoCustomMapper.findSequences(Sequences,weishu);
		 if(Date!=null){
			 Seq=Date+Seq;
		 }
		 return Seq;
	 }

	 /**
	  * 查询多数据字典公用方法params<数据字典表typecode字段，返回给前端的字段名>
	  * @param params
	  * @return Map<String, List<Dstdictinfo>>
	  */
	public Map<String, List<Dstdictinfo>> findDstdictinfos(Map<String,String> params) throws Exception {
		Map<String, List<Dstdictinfo>> map = new HashMap<String, List<Dstdictinfo>>();
		List<String> types = new ArrayList<String>(params.keySet());
		
		for (String type : types) {
			map.put(params.get(type), new ArrayList<Dstdictinfo>());
		}
		
		List<Dstdictinfo> dstdictinfos = this.findDstdictinfos(types);
		if(dstdictinfos != null && dstdictinfos.size() != 0){
			  for (Dstdictinfo dstdictinfo : dstdictinfos) {
				  for(String type : types){
					  if(type.equals(dstdictinfo.getTypecode())){
						 map.get(params.get(type)).add(dstdictinfo);
					  }
				  }
			  }
		}
		return map;
	}
	@Override
	public ResultInfo getPasswordRule() throws IOException {
		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("password-rule.json");
		JSONObject passwordRule = JSON.parseObject(is,Object.class);
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE,906,null);
		Map<String,Object> sysdata = new HashMap<>(16);
		sysdata.put("passwordRule",passwordRule);
		resultInfo.setSysdata(sysdata);
		return resultInfo;
	}


	/**
	 * 钉钉权鉴获取accessToken
	 * accessToken 有效去7200秒
	 * 判断6500秒后过期重新获取
	 * @param appKey appKey
	 * @return return
	 * @throws Exception Exception
	 */
	@Override
	public String queryDingAccessToken(String appKey) throws Exception {
		long minDate = System.currentTimeMillis() - 6500000;
		Dstappoption app = DstappoptionMapper.selectByPrimaryKey(appKey);
		if(null == app || Long.parseLong(app.getVchar3()) < minDate) {
			return "";
		}
		return app.getOptvalue();
	}

	/**
	 * 钉钉权鉴存储accessToken
	 * @param appKey appKey
	 * @param accessToken accessToken
	 * @throws Exception
	 */
	@Override
	public void saveDingAccessToken(String appKey, String accessToken) throws Exception {
		//删除原来的
		DstappoptionMapper.deleteByPrimaryKey(appKey);
		//重新插入
		long curDate = System.currentTimeMillis();
		Dstappoption app = new Dstappoption();
		app.setOptkey(appKey);
		app.setOptname("dingAccessToken");
		app.setOpttype("0");
		app.setOptvalue(accessToken);
		app.setVchar3(String.valueOf(curDate));
		DstappoptionMapper.insert(app);
	}

}
