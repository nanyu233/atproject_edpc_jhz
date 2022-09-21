package activetech.base.service.impl;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import activetech.base.dao.mapper.DstoperationCustomMapper;
import activetech.base.dao.mapper.DstoperationMapper;
import activetech.base.dao.mapper.DstroleoperateMapper;
import activetech.base.pojo.domain.Dstoperation;
import activetech.base.pojo.domain.Dstroleoperate;
import activetech.base.pojo.domain.DstroleoperateExample;
import activetech.base.pojo.dto.DstoperationCustom;
import activetech.base.pojo.dto.DstoperationQueryDto;
import activetech.base.process.context.Config;
import activetech.base.process.result.ExceptionResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.OperationService;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
/**
 * 
 * <p>Title:OperateServiceImpl</p>
 * <p>Description:操作管理实现类Service</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年1月10日 下午4:40:33
 *
 */
public class OperationServiceImpl implements OperationService {
	@Autowired
	private DstoperationMapper dstoperationMapper;
	@Autowired
	private DstoperationCustomMapper dstoperationCustomMapper;
	@Autowired
	private DstroleoperateMapper dstroleoperateMapper;
	/**
	 * 查询操作列表数据总数
	 * @param moduleid
	 * @return
	 * @throws Exception
	 */
	public int findOperationCount(String moduleid)
			throws Exception {
	  //1.非空校验
	  if(!StringUtils.isNotNullAndEmptyByTrim(moduleid)){
	  //抛出异常
		  ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { "所属模块id" }));
	  }
	  return dstoperationCustomMapper.findOperationCount(moduleid);
	}

	/**
	 * 查询操作管理列表
	 * @param dstoperationQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<DstoperationCustom> findOperationList(
			DstoperationQueryDto dstoperationQueryDto) throws Exception {
  	 //1.非空校验
     if(!StringUtils.isNotNullAndEmptyByTrim(dstoperationQueryDto.getDstoperationCustom().getModuleid())){
	 //抛出异常
	    ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { "所属模块id" }));
	 }
	  List<DstoperationCustom> list=dstoperationCustomMapper.findOperationList(dstoperationQueryDto);
	  return list;
	}

	/**
	 * 新增操作管理
	 * @param moduleid
	 * @param dstoperationCustom
	 * @throws Exception
	 */
	public void insertOperation(String moduleid, DstoperationCustom dstoperationCustom)
			throws Exception {
	//参数校验
	//1.非空校验
	  if(!StringUtils.isNotNullAndEmptyByTrim(moduleid)){
	  //抛出异常
	    ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { "所属模块id" }));
	  }
	  dstoperationCustom.setModuleid(moduleid);
	  dstoperationCustom.setOperateid(UUIDBuild.getUUID());
	  String nullstr = this.insertOperationisNotNullAndEmptyByTrim(dstoperationCustom);
	  if(StringUtils.isNotNullAndEmptyByTrim(nullstr)){
		//抛出异常
		ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { nullstr }));
	  }
	  //数据业务合法性校验
	  //数据操作
	  dstoperationMapper.insert(dstoperationCustom);   
	}

	/**
	 * 修改操作
	 * @param operateid
	 * @param dstoperationCustom
	 * @throws Exception
	 */
	public void updateOperation(String operateid,
			DstoperationCustom dstoperationCustom) throws Exception {
	  //参数校验
	  //1.非空校验
	  dstoperationCustom.setOperateid(operateid);
	  String nullstr = this.updateOperationisNotNullAndEmptyByTrim(dstoperationCustom);
	  if(StringUtils.isNotNullAndEmptyByTrim(nullstr)){
	    ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { nullstr }));
	  }
	  //数据业务合法性校验
	  //数据操作
	  Dstoperation dstoperation_update = dstoperationMapper.selectByPrimaryKey(operateid);
	  dstoperation_update.setOperateid(dstoperationCustom.getOperateid());
	  dstoperation_update.setOperatename(dstoperationCustom.getOperatename());
	  dstoperation_update.setUrl(dstoperationCustom.getUrl());
	  dstoperation_update.setIcon(dstoperationCustom.getIcon());
	  dstoperation_update.setShoworder(dstoperationCustom.getShoworder());
	  dstoperation_update.setOpertype(dstoperationCustom.getOpertype());
	  dstoperationMapper.updateByPrimaryKey(dstoperation_update);
	}

	/**
	 * 删除操作
	 * @param operationid
	 * @throws Exception
	 */
	public void deleteOperation(String operateid) throws Exception {
	  //参数校验
      //1.非空校验
	  if(!StringUtils.isNotNullAndEmptyByTrim(operateid)){
		ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { "操作id" }));
	  }
	  //根据操作是否被使用 确定是否可以删除，暂定已使用则不可以被删除
	  /*if(isUsedOperation(operateid)){
		  
	  }*/
	  //2.删除用户是否存在
	  Dstoperation dstoperation_delete = dstoperationMapper.selectByPrimaryKey(operateid);
	  if(dstoperation_delete == null){
		ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 912, new Object[] { "操作信息","" }));
	  }
	  //数据业务合法性校验
	  dstoperationMapper.deleteByPrimaryKey(operateid);
	}
	
	/**
	 * 操作管理必填字段项非空校验
	 * @param dstoperationCustom
	 * @return
	 */
	 private String insertOperationisNotNullAndEmptyByTrim(DstoperationCustom dstoperationCustom) {
	   //操作id
	   if(!StringUtils.isNotNullAndEmptyByTrim(dstoperationCustom.getOperateid())){
	     return "操作id";
		}
		//操作名称
		if(!StringUtils.isNotNullAndEmptyByTrim(dstoperationCustom.getOperatename())){
			return "操作名称";
		}
		//访问地址
		if(!StringUtils.isNotNullAndEmptyByTrim(dstoperationCustom.getUrl())){
			return "访问地址";
		}
		//所属模块id
		if(!StringUtils.isNotNullAndEmptyByTrim(dstoperationCustom.getModuleid())){
			return "所属模块id";
		}
		//显示顺序
		if(!StringUtils.isNotNullAndEmptyByTrim((dstoperationCustom.getShoworder()==null?"":dstoperationCustom.getShoworder()+""))){
			return "显示顺序";
		}
		return null;
	 }
	 /**
	  * 操作修改更新字段控制
	  * @param dstoperationCustom
	  * @return
	  */
	 private String updateOperationisNotNullAndEmptyByTrim(DstoperationCustom dstoperationCustom) {
		//操作id
		if(!StringUtils.isNotNullAndEmptyByTrim(dstoperationCustom.getOperateid())){
			return "操作id";
		}
		//操作名称
		if(!StringUtils.isNotNullAndEmptyByTrim(dstoperationCustom.getOperatename())){
			return "操作名称";
		}
		//访问地址
		if(!StringUtils.isNotNullAndEmptyByTrim(dstoperationCustom.getUrl())){
			return "访问地址";
		}
		//显示顺序
		if(!StringUtils.isNotNullAndEmptyByTrim((dstoperationCustom.getShoworder()==null?"":dstoperationCustom.getShoworder()+""))){
			return "显示顺序";
		}
		return null;
	}

	 /**
	 * 根据operateid查询操作信息
	 * @param operateid
	 * @return
	 * @throws Exception
	 */
	public DstoperationCustom findOperationByOperateid(String operateid)
			throws Exception {
	  Dstoperation dstoperation= dstoperationMapper.selectByPrimaryKey(operateid);
	  DstoperationCustom dstoperationCustom = new DstoperationCustom();
	  BeanUtils.copyProperties(dstoperation, dstoperationCustom);
	  return dstoperationCustom;
	}
	/**
	 * 根据操作是否被使用 判断是否可以被删除
	 * @param operateid
	 * @return
	 * @throws ExceptionResultInfo 
	 */
	public boolean isUsedOperation(String operateid) throws ExceptionResultInfo{
		DstroleoperateExample dstroleoperateExample=new DstroleoperateExample();
		DstroleoperateExample.Criteria criteria=dstroleoperateExample.createCriteria();
		criteria.andOperateidEqualTo(operateid);
		List<Dstroleoperate> list=dstroleoperateMapper.selectByExample(dstroleoperateExample);
		if(list!=null&&list.size()>0){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 129,null));
			return true;	
		}else{
			return false;
		}
	}
}
