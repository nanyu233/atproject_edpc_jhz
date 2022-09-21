package activetech.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.dao.mapper.DstappoptionMapper;
import activetech.base.pojo.domain.Dstappoption;
import activetech.base.pojo.domain.DstappoptionExample;
import activetech.base.pojo.dto.DstappoptionCustom;
import activetech.base.pojo.dto.DstappoptionQueryDto;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.AppoptionService;
import activetech.util.StringUtils;
/**
 * 
 * <p>Title:AppoptionServiceImpl</p>
 * <p>Description:基础信息配置实现类Service</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年1月18日 上午10:51:26
 *
 */
public class AppoptionServiceImpl implements AppoptionService{
	@Autowired
	private DstappoptionMapper dstappoptionMapper;
	
	/**
	 * 基础信息查询总数
	 * @param dstappoptionQueryDto
	 * @return
	 * @throws Exception
	 */
	public int findAppoptionCount(DstappoptionQueryDto dstappoptionQueryDto)
			throws Exception {
		DstappoptionExample dstappoptionExample = new DstappoptionExample();
		DstappoptionExample.Criteria criteria = dstappoptionExample.createCriteria();
		return dstappoptionMapper.countByExample(dstappoptionExample);
	}
	
	/**
	 * 查询基础信息列表
	 * @return
	 */
	public List<Dstappoption> findAppoptionList() {
		DstappoptionExample dstappoptionExample = new DstappoptionExample();
		DstappoptionExample.Criteria criteria = dstappoptionExample.createCriteria();
		List<Dstappoption> list = dstappoptionMapper.selectByExample(dstappoptionExample);
		return list;
	}
	
	/**
	 * 根据主键更新基础信息表
	 * @param dstappoptionQueryDto
	 * @throws Exception
	 */
	public void updateAppoption(DstappoptionQueryDto dstappoptionQueryDto) throws Exception {
		//参数校验
		//数据业务合法性校验
		//数据操作
		List<DstappoptionCustom> dstappoptionCustoms=dstappoptionQueryDto.getDstappoptionCustoms();
		for(DstappoptionCustom arg:dstappoptionCustoms){
			//1.非空校验
			String nullstr = this.updateOppoptionisNotNullAndEmptyByTrim(arg);
			if(StringUtils.isNotNullAndEmptyByTrim(nullstr)){
			   ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { nullstr }));
			}
			Dstappoption dstappoption_update=dstappoptionMapper.selectByPrimaryKey(arg.getOptkey());
			dstappoption_update.setOptkey(arg.getOptkey());
			dstappoption_update.setOptvalue(arg.getOptvalue());
			dstappoptionMapper.updateByPrimaryKey(dstappoption_update);
		}
	}
	/**
	 * 基础表必填字段项非空校验
	 * @param dstappoptionCustom
	 * @return
	 */
	 private String updateOppoptionisNotNullAndEmptyByTrim(DstappoptionCustom dstappoptionCustom){
		//参数值
		if(!StringUtils.isNotNullAndEmptyByTrim(dstappoptionCustom.getOptkey())){
			return "参数值";
		}
		//参数值value
		if(!StringUtils.isNotNullAndEmptyByTrim(dstappoptionCustom.getOptvalue())){
			return "参数值value";
		}
		 return null;
	  }
}