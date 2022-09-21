package activetech.eicu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.eicu.dao.mapper.DstparameterCustomMapper;
import activetech.eicu.dao.mapper.DstparameterMapper;
import activetech.eicu.pojo.domain.Dstparameter;
import activetech.eicu.pojo.domain.DstparameterExample;
import activetech.eicu.pojo.domain.DstparameterKey;
import activetech.eicu.service.DstparameterService;
import activetech.util.StringUtils;

public class DstparameterServiceImpl implements DstparameterService{

	@Autowired
	private DstparameterMapper dstparameterMapper;
	@Autowired
	private DstparameterCustomMapper dstparameterCustomMapper;
	/**
	 * 根据partype 和 parcode 获取相关参数
	 */
	@Override
	public List<Dstparameter> getParamByTypeAndCode(String partype, String parcode, String order) throws Exception {
		DstparameterExample example = new DstparameterExample();
		DstparameterExample.Criteria criteria = example.createCriteria();
		if(StringUtils.isNotNullAndEmptyByTrim(partype)) {
			criteria.andPartypeEqualTo(partype);
		}
		if(StringUtils.isNotNullAndEmptyByTrim(parcode)) {
			criteria.andParcodeEqualTo(parcode);
		}
		if(StringUtils.isNotNullAndEmptyByTrim(order)) {
			example.setOrderByClause(order);
		}
		List<Dstparameter> list = dstparameterMapper.selectByExample(example);
		return list;
	}
	
	/**
	 * 根据partype 和 parcode 删除相关参数
	 */
	@Override
	public void delParamByTypeAndCode(String partype, String parcode) throws Exception {
		DstparameterExample example = new DstparameterExample();
		DstparameterExample.Criteria criteria = example.createCriteria();
		criteria.andPartypeEqualTo(partype);
		criteria.andParcodeEqualTo(parcode);
		dstparameterMapper.deleteByExample(example);
	}
	
	/**
	 * 批量新增修改dstparameter
	 */
	@Override
	public void mergeParameter(List<Dstparameter> paramList) throws Exception {
		dstparameterCustomMapper.mergeParameter(paramList);
	}

	@Override
	public Dstparameter getQualityGs(String partype, String parcode, String parvalue1) {
		DstparameterKey dstparameterKey=new DstparameterKey();
		dstparameterKey.setPartype(partype);
		dstparameterKey.setParcode(parcode);
		dstparameterKey.setParvalue1(parvalue1);	
		return  dstparameterMapper.selectByPrimaryKey(dstparameterKey);
		
	}



}
