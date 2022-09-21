package activetech.base.service.impl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.dao.mapper.DstmoduleCustomMapper;
import activetech.base.dao.mapper.DstmoduleMapper;
import activetech.base.dao.mapper.DstoperationCustomMapper;
import activetech.base.dao.mapper.DstoperationMapper;
import activetech.base.dao.mapper.DstrolemoduleMapper;
import activetech.base.dao.mapper.DstroleoperateCustomMapper;
import activetech.base.pojo.domain.Dstmodule;
import activetech.base.pojo.domain.DstmoduleExample;
import activetech.base.pojo.domain.Dstoperation;
import activetech.base.pojo.domain.DstoperationExample;
import activetech.base.pojo.domain.Dstrolemodule;
import activetech.base.pojo.domain.DstrolemoduleExample;
import activetech.base.pojo.domain.Dstroleoperate;
import activetech.base.pojo.domain.TreeNode;
import activetech.base.pojo.domain.TreenodeAttributes;
import activetech.base.pojo.dto.DstmoduleCustom;
import activetech.base.pojo.dto.DstmoduleQueryDto;
import activetech.base.pojo.dto.DstoperationCustom;
import activetech.base.process.context.Config;
import activetech.base.process.result.ExceptionResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.ModuleService;
import activetech.base.service.SystemConfigService;
import activetech.util.ResourcesUtil;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;

/**
 * 
 * <p>Title:AuthorityServiceImpl</p>
 * <p>Description:权限分配Service实现类</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2017-1-6 上午11:06:16
 *
 */
public class ModuleServiceImpl implements ModuleService {
	
	@Autowired
	private DstmoduleCustomMapper dstmoduleCustomMapper;
	@Autowired
	private DstmoduleMapper dstmoduleMapper;
	@Autowired
	private DstrolemoduleMapper dstrolemoduleMapper;
	@Autowired
	private DstroleoperateCustomMapper dstroleoperateCustomMapper;
	@Autowired
	private DstoperationMapper dstoperationMapper;
	@Autowired
	private DstoperationCustomMapper dstoperationCustomMapper;
	@Autowired
	private SystemConfigService systemConfigService;
	/**
	 * 角色分配权限树（整棵树一次抓取）
	 * @param loginUser
	 * @param roleId
	 * @return
	 * @throws Exception
	 */
	public List<TreeNode> loadAuthModuleTree(String roleId)
			throws Exception {
		List<TreeNode> moduleTree = new ArrayList<TreeNode>();
		List<TreeNode> moduleChildTree = new ArrayList<TreeNode>();
		List<TreeNode> operationTree = new ArrayList<TreeNode>();
		//获取当前角色对应已分配的父类模块操作
		List<String> rolemoduleList = loadModuleListByRoleid(roleId,"0");
		//获取所有操作按钮
		getAllOperationBtn(operationTree, roleId);
		//获取所有模块
		List<DstmoduleCustom> moduleList = loadModuleList();
		
		//获取所有子模块
		getAllMdlNode(moduleChildTree, operationTree, rolemoduleList,
				moduleList);
		//为所有父模块添加子模块
		addForParentNode(moduleTree, moduleChildTree, rolemoduleList,
				moduleList);
		return moduleTree;
	}
	
	private void getAllOperationBtn(List<TreeNode> operationTree,
			String roleId) {
		List<DstoperationCustom> operationList = dstoperationCustomMapper.getButtonOperationList("0");
		List<String> dstroleoperateList = dstroleoperateCustomMapper.getUserButtonOperationList("0",roleId);
		
		for (DstoperationCustom dstoperationCustom : operationList) {
			TreeNode operationNode= new TreeNode();
			operationNode.setId(dstoperationCustom.getOperateid());
			operationNode.setParentId(dstoperationCustom.getModuleid());
			operationNode.setText(dstoperationCustom.getOperatename());
			operationNode.setIconCls("icon-node-module-bottom");
			//设置权限分配状态
			if (dstroleoperateList.contains(dstoperationCustom.getOperateid())) {
				operationNode.setChecked(true);
			}
			operationNode.setState("open");
			operationNode.setAttributes(new TreenodeAttributes(ResourcesUtil.getValue(Config.SYSCONFIG, "url_operatelist")));
			operationTree.add(operationNode);
		}
	}
	
	private void getAllMdlNode(List<TreeNode> moduleChildTree,
			List<TreeNode> operationTree, List<String> rolemoduleList,
			List<DstmoduleCustom> moduleList) {
		for (Dstmodule module : moduleList) {
			if(!"0".equals(module.getParentid())){
				TreeNode mdlNode = new TreeNode();
				mdlNode.setId(module.getModuleid());
				mdlNode.setParentId(module.getParentid());
				mdlNode.setText(module.getModulename());
				mdlNode.setIconCls("icon-node-module-bottom");
				mdlNode.setState("open");
				mdlNode.setAttributes(new TreenodeAttributes(ResourcesUtil.getValue(Config.SYSCONFIG, "url_operatelist")));
				List<TreeNode> children = new ArrayList<TreeNode>();
				for (TreeNode operationNode : operationTree) {
					if(operationNode.getParentId().equals(module.getModuleid())){
						children.add(operationNode);
					}
				}
				TreeNode urlNode = new TreeNode();
				urlNode.setId(ResourcesUtil.getValue(Config.SYSCONFIG, "URL"));
				urlNode.setText(ResourcesUtil.getValue(Config.SYSCONFIG, "URL"));
				urlNode.setState("open");
				//如果子节点全部都存在 才checked 
				boolean allchecked = checkChildren(children);
				if (rolemoduleList.contains(module.getModuleid()) && allchecked) {
					mdlNode.setChecked(true);
					urlNode.setChecked(true);
				}else if (rolemoduleList.contains(module.getModuleid())) {
					urlNode.setChecked(true);
				}
				children.add(urlNode);
				mdlNode.setChildren(children);
				moduleChildTree.add(mdlNode);
			}
		}
	}

	private void addForParentNode(List<TreeNode> moduleTree,
			List<TreeNode> moduleChildTree, List<String> rolemoduleList,
			List<DstmoduleCustom> moduleList) {
		for (Dstmodule module : moduleList) {
			TreeNode moduleNode; 
			if("0".equals(module.getParentid())){
				moduleNode = new TreeNode();
				moduleNode.setId(module.getModuleid());
				moduleNode.setText(module.getModulename());
				moduleNode.setIconCls("icon-node-module");
				moduleNode.setState("open");
				moduleNode.setAttributes(new TreenodeAttributes(ResourcesUtil.getValue(Config.SYSCONFIG, "url_modulelist")));
				List<TreeNode> children = new ArrayList<TreeNode>();
				for (TreeNode moduleChildNode : moduleChildTree) {
					if(module.getModuleid().equals(moduleChildNode.getParentId())){
						children.add(moduleChildNode);
					}
				}
				moduleNode.setChildren(children);
				moduleTree.add(moduleNode);
				//如果子节点全部都存在 才checked 
				boolean allchecked = checkChildren(children);
				if (rolemoduleList.contains(module.getModuleid()) && allchecked) {
					moduleNode.setChecked(true);
				}
			}
		}
	}
	
	private List<DstmoduleCustom> loadModuleList() {
		return dstmoduleCustomMapper.getModuleList();
	}
	
	/**
	 * 检查是否所有子节点全部都checked 如果是返回true，否则返回false
	 * @param children
	 * @return
	 */
	private boolean checkChildren(List<TreeNode> children) {
		for(TreeNode node :children){
			if(!node.isChecked()){
				return false;
			}
		}
		return true;
	}

	/**
	 * 获取指定角色码对应模块
	 * @param userRole
	 * @return
	 */
	public List<String> loadModuleListByRoleid(String roleId,String parentid) {
		return dstmoduleCustomMapper.getModuleListByRoleid(roleId);
	}

	/**
	 * 根据父类模块获取子集
	 * @param userRole
	 * @return
	 */
	public List<DstmoduleCustom> loadModuleList(String parentid) {
		return dstmoduleCustomMapper.getModuleList(parentid);
	}
	
	/**
	 * 根据父类模块获取子集个数
	 * @param userRole
	 * @return
	 */
	public int getChildModuleListCount(String parentid) {
		return dstmoduleCustomMapper.getChildModuleListCount(parentid);
	}
	
	/**
	 * 加载二层模块
	 * @param role id
	 * @param moduleId
	 * @return
	 */
	private List<TreeNode> loadBottomModuleTree(String roleid,String moduleId) {
		List<TreeNode> moduleTree = new ArrayList<TreeNode>();
		//获取指定父级模块类子集
		List<DstmoduleCustom> moduleList =  loadModuleList(moduleId);
		List<String> authModuleIds = loadModuleListByRoleid(roleid, moduleId);
		for (Dstmodule module : moduleList) {
			TreeNode mdlNode = new TreeNode();
			mdlNode.setId(module.getModuleid());
			mdlNode.setText(module.getModulename());
			mdlNode.setIconCls("icon-node-module-bottom");
			//设置权限分配状态
			if (authModuleIds.contains(module.getModuleid())) {
				mdlNode.setChecked(true);
			}
			mdlNode.setState("open");
			mdlNode.setAttributes(new TreenodeAttributes(ResourcesUtil.getValue(Config.SYSCONFIG, "url_operatelist")));
			moduleTree.add(mdlNode);
		}

		return moduleTree;
	}
	
	/**
	 * 根据父类模块获取子集
	 * @param userRole
	 * @return
	 */
	public List<DstmoduleCustom> loadModuleListByParentid(String parentid) {
		return dstmoduleCustomMapper.getModuleListByParentid(parentid);
	}
	/**
	 * 分布加载模块操作树入口
	 * @param nodeid
	 * @return
	 * @throws Exception
	 */
	public List<TreeNode> loadModuleTreeElement(String nodeid)
			throws Exception {
		String sysName  = systemConfigService.findAppoptionByOptkey("HSPTYPE").getOptvalue();
		List<TreeNode> moduleTree = new ArrayList<TreeNode>();
		//父节点调用第一层
		if(!StringUtils.isNotNullAndEmptyByTrim(nodeid)){
			return  loadFather(sysName);
		}else{
			List<DstmoduleCustom> moduleList = loadModuleListByParentid(nodeid);
			for (Dstmodule module : moduleList) {
				TreeNode mdlNode = new TreeNode();
				mdlNode.setId(module.getModuleid());
				mdlNode.setText(module.getModulename());
				mdlNode.setIconCls("icon-node-module");
				//查询当前结点下是否还有子结点
				int childcount = this.getChildModuleListCount(module.getModuleid());
				if(childcount != 0){
					mdlNode.setState("closed");
				}
				//二级放model，三级放操作
				if(nodeid.equals("0")){
					mdlNode.setAttributes(new TreenodeAttributes(ResourcesUtil.getValue(Config.SYSCONFIG, "url_modulelist")));
				}else{
					mdlNode.setAttributes(new TreenodeAttributes(ResourcesUtil.getValue(Config.SYSCONFIG, "url_operatelist")));
				}
				moduleTree.add(mdlNode);
			}
			return moduleTree;
		}
	}

	/**
	 * 加载最高级父节点
	 * @return
	 */
	private List<TreeNode> loadFather(String sysName) {
		List<TreeNode> moduleTree = new ArrayList<TreeNode>();
		TreeNode mdlNode = new TreeNode();
		if("LSSRMYY".equalsIgnoreCase(sysName)){
			mdlNode.setText(ResourcesUtil.getValue(Config.MESSAGE, "title"));
		}else if("LQSRMYY".equalsIgnoreCase(sysName)){
			mdlNode.setText(ResourcesUtil.getValue(Config.MESSAGE, "lqsrmyytitle"));
		}else if("HZSZYY".equalsIgnoreCase(sysName)){
			mdlNode.setText(ResourcesUtil.getValue(Config.MESSAGE, "hzszyytitle"));
		}
		mdlNode.setId("0");
		mdlNode.setIconCls("icon-node-root");
		mdlNode.setState("closed");
		mdlNode.setAttributes(new TreenodeAttributes(ResourcesUtil.getValue(Config.SYSCONFIG, "url_modulelist")));
		moduleTree.add(mdlNode);
		return  moduleTree;
	}
	/**
	 * 全量加载模块操作树（一次加载）
	 */
	public List<TreeNode> loadModuleTree()throws Exception {
		List<TreeNode> moduleTree = new ArrayList<TreeNode>();
		//获取父类所有模块
		List<DstmoduleCustom> moduleList = loadModuleList("0");
		for (Dstmodule module : moduleList) {
			TreeNode mdlNode = new TreeNode();
			mdlNode.setId(module.getModuleid());
			mdlNode.setText(module.getModulename());
			mdlNode.setIconCls("icon-node-module");
			mdlNode.setState("open");
			mdlNode.setAttributes(new TreenodeAttributes(ResourcesUtil.getValue(Config.SYSCONFIG, "url_modulelist")));
			mdlNode.setChildren(loadBottomModuleTree(module.getModuleid()));
			moduleTree.add(mdlNode);
		}
		return moduleTree;
	}
	
	/**
	 * 加载三层操作
	 * @param role id
	 * @param moduleId
	 * @return
	 */
	private List<TreeNode> loadBottomModuleTree(String moduleId) {
		List<TreeNode> moduleTree = new ArrayList<TreeNode>();
		//获取指定父级模块类子集
		List<DstmoduleCustom> moduleList =  loadModuleList(moduleId);
		for (Dstmodule module : moduleList) {
			TreeNode mdlNode = new TreeNode();
			mdlNode.setId(module.getModuleid());
			mdlNode.setText(module.getModulename());
			mdlNode.setIconCls("icon-node-module-bottom");
			mdlNode.setState("open");
			mdlNode.setAttributes(new TreenodeAttributes(ResourcesUtil.getValue(Config.SYSCONFIG, "url_operatelist")));
			moduleTree.add(mdlNode);
		}

		return moduleTree;
	}

	/**
	 * 根据parentid查询模块管理总数
	 * @param parentid
	 * @param dstmoduleQueryDto
	 * @return int
	 * @throws Exception
	 */
	public int findModuleCount(DstmoduleQueryDto dstmoduleQueryDto) throws Exception {
	  return dstmoduleCustomMapper.findModuleCount(dstmoduleQueryDto);
	}

	/**
	 * 根据parentid查询模块列表
	 * @param parentid
	 * @param dstmoduleQueryDto
	 * @return List<DstmoduleCustom>
	 */
	public List<DstmoduleCustom> findModuleList(DstmoduleQueryDto dstmoduleQueryDto) throws Exception {
	  return dstmoduleCustomMapper.findModuleList(dstmoduleQueryDto);
	}

	/**
	 * 新增模块
	 * @param parentid
	 * @param dstmoduleCustom
	 * @throws Exception
	 */
	public void insertModule(String parentid, DstmoduleCustom dstmoduleCustom)
			throws Exception {
		 //参数校验
		 //1.非空校验
		 if(!StringUtils.isNotNullAndEmptyByTrim(parentid)){
			 //抛出异常
			 ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { "模块id" }));
		 }
		 dstmoduleCustom.setParentid(parentid);
		 dstmoduleCustom.setModuleid(UUIDBuild.getUUID());
	     String nullstr = this.insertModuleisNotNullAndEmptyByTrim(dstmoduleCustom);
	     if(StringUtils.isNotNullAndEmptyByTrim(nullstr)){
		 //抛出异常
		 ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { nullstr }));
	     }
	     //数据业务合法性校验
	     //数据操作
	     dstmoduleMapper.insert(dstmoduleCustom); 	
	}

	/**
	 * 修改模块
	 * @param moduleid
	 * @param dstmoduleCustom
	 * @throws Exception
	 */
	public void updateModule(DstmoduleQueryDto dstmoduleQueryDto)throws Exception {
	  //参数校验
	  //1.非空校验
	  DstmoduleCustom dstmoduleCustom = dstmoduleQueryDto.getDstmoduleCustom();
	  String nullstr = this.updateModuleisNotNullAndEmptyByTrim(dstmoduleCustom);
	  if(StringUtils.isNotNullAndEmptyByTrim(nullstr)){
	    ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { nullstr }));
	  }
	  //数据业务合法性校验
	  //数据操作
	  Dstmodule dstmodule_update = dstmoduleMapper.selectByPrimaryKey(dstmoduleCustom.getModuleid());
	  dstmodule_update.setModuleid(dstmoduleCustom.getModuleid()); 
	  dstmodule_update.setModulename(dstmoduleCustom.getModulename());
	  dstmodule_update.setParentid(dstmoduleCustom.getParentid());
	  dstmodule_update.setUrl(dstmoduleCustom.getUrl());
	  dstmodule_update.setIcon(dstmoduleCustom.getIcon());
	  dstmodule_update.setShoworder(dstmoduleCustom.getShoworder());
	  dstmodule_update.setIsused(dstmoduleCustom.getIsused());
	  dstmodule_update.setReloadType(dstmoduleCustom.getReloadType());
	  dstmoduleMapper.updateByPrimaryKey(dstmodule_update);		
	}

	/**
	 * 删除模块
	 * @param moduleid
	 * @throws Exception
	 */
	public void deleteModule(String moduleid) throws Exception {
	//参数校验
    //1.非空校验
	if(!StringUtils.isNotNullAndEmptyByTrim(moduleid)){
	  ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { "模块id" }));
	}
	//根据Moduleid判断 是否模块被使用 是否有子模块  是否有子操作 确定是否可以删除  暂定子模块不能删除
	if (/*isUsedModule(moduleid) || */hasLowerModule(moduleid) /*|| hasOperation(moduleid)*/) {
	    
	}
	 //2.删除模块是否存在
	Dstmodule dstmodule_delete = dstmoduleMapper.selectByPrimaryKey(moduleid);
	if(dstmodule_delete == null){
	  ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 912, new Object[] { "模块信息","" }));
	}
	//数据业务合法性校验
   	dstmoduleMapper.deleteByPrimaryKey(moduleid);
   	 //删除子操作
   	DstoperationExample dstoperationExample=new DstoperationExample();
   	DstoperationExample.Criteria criteria=dstoperationExample.createCriteria();
   	criteria.andModuleidEqualTo(moduleid);
   	//查看子操作是否存在
   	List<Dstoperation> dstoperation_delete=dstoperationMapper.selectByExample(dstoperationExample);
   	if(dstoperation_delete.size()>0){
   	   dstoperationMapper.deleteByExample(dstoperationExample);
   	}
    }
	/**
	 * 操作管理必填字段项非空校验
	 * @param dstoperationCustom
	 * @return
	 */
	 private String insertModuleisNotNullAndEmptyByTrim(DstmoduleCustom dstmoduleCustom) {
	   //操作id
	   if(!StringUtils.isNotNullAndEmptyByTrim(dstmoduleCustom.getModuleid())){
	     return "模块id";
		}
	   //模块名称
	   if(!StringUtils.isNotNullAndEmptyByTrim(dstmoduleCustom.getModulename())){
	     return "模块名称";
		}
	   //父模块id
	   if(!StringUtils.isNotNullAndEmptyByTrim(dstmoduleCustom.getParentid())){
	     return "父模块id";
		}
	   //显示顺序
	   if(!StringUtils.isNotNullAndEmptyByTrim(dstmoduleCustom.getShoworder()==null?"":dstmoduleCustom.getShoworder()+"")){
	     return "显示顺序";
		}
	    //状态标记
	   if(!StringUtils.isNotNullAndEmptyByTrim(dstmoduleCustom.getIsused())){
	     return "状态标记";
		}
		return null;
	 }
	 /**
	 * 操作管理必填字段项非空校验
	 * @param dstoperationCustom
	 * @return
	 */
	 private String updateModuleisNotNullAndEmptyByTrim(DstmoduleCustom dstmoduleCustom) {
	   //操作id
	   if(!StringUtils.isNotNullAndEmptyByTrim(dstmoduleCustom.getModuleid())){
	     return "模块id";
		}
	   //模块名称
	   if(!StringUtils.isNotNullAndEmptyByTrim(dstmoduleCustom.getModulename())){
	     return "模块名称";
		}
	   //父模块id
	   if(!StringUtils.isNotNullAndEmptyByTrim(dstmoduleCustom.getParentid())){
	     return "父模块id";
		}
	   //显示顺序
	   if(!StringUtils.isNotNullAndEmptyByTrim(dstmoduleCustom.getShoworder()==null?"":dstmoduleCustom.getShoworder()+"")){
	     return "显示顺序";
		}
	    //状态标记
	   if(!StringUtils.isNotNullAndEmptyByTrim(dstmoduleCustom.getIsused())){
	     return "状态标记";
		}
		return null;
	 }

	 /**
	 * 根据moduleid查询用户信息
	 * @param moduleid
	 * @return
	 * @throws Exception
	 */
	public DstmoduleCustom findModuleByModuleid(String moduleid)
			throws Exception {
		return dstmoduleCustomMapper.findModuleByModuleId(moduleid);
	}
	/**
	 * 角色授权
	 * @param roleid
	 * @param ids
	 */
	public void insertroleauth(String roleid, String[] ids) {
		//删除模块操作表
		deleteDstroleoperateByRoleid(roleid);
		//删除模块表
		deleteDstrolemodule(roleid);
		List<Dstroleoperate> dstroleoperateList = new ArrayList<Dstroleoperate>();
		List<Dstmodule> dstmoduleList = selectDstmodule();
		Dstrolemodule module = null;
		for(String moduleid:ids){
			if(!ResourcesUtil.getValue(Config.SYSCONFIG, "URL").equals(moduleid)){
				for (Dstmodule dstmodule : dstmoduleList) {
					if(dstmodule.getModuleid().equals(moduleid)){
						module = new Dstrolemodule();
						module.setId(UUIDBuild.getUUID());
						module.setRoleid(roleid);
						module.setModuleid(moduleid);
						dstrolemoduleMapper.insert(module);
					}
				}
				List<Dstoperation> dstoperationList= selectDstoperation(moduleid,"1");
				if(dstoperationList.size() == 0){
					Dstoperation dstoperation = dstoperationMapper.selectByPrimaryKey(moduleid);
					if(dstoperation!=null && module !=null){
						Dstroleoperate dstroleoperate = new Dstroleoperate();
						dstroleoperate.setId(UUIDBuild.getUUID());
						dstroleoperate.setRmid(module.getId());
						dstroleoperate.setOperateid(dstoperation.getOperateid());
						dstroleoperateList.add(dstroleoperate);
					}
				}
				for(Dstoperation dstoperation:dstoperationList){
					Dstroleoperate dstroleoperate = new Dstroleoperate();
					dstroleoperate.setId(UUIDBuild.getUUID());
					dstroleoperate.setRmid(module.getId());
					dstroleoperate.setOperateid(dstoperation.getOperateid());
					dstroleoperateList.add(dstroleoperate);
				}
			}
		}
		if(dstroleoperateList.size()>0){
			dstroleoperateCustomMapper.insertList(dstroleoperateList);
		}
	}
	
	private List<Dstmodule> selectDstmodule() {
		DstmoduleExample dstoperationExample = new DstmoduleExample();
		DstmoduleExample.Criteria criteria = dstoperationExample.createCriteria();
		criteria.andIsusedEqualTo("1");
		return dstmoduleMapper.selectByExample(dstoperationExample);
	}
	
	/**
	 * 根据模块号获取模块操作列表
	 * @param moduleid
	 * @return
	 */
	public List<Dstoperation> selectDstoperation(String moduleid, String opertype){
		DstoperationExample dstoperationExample = new DstoperationExample();
		DstoperationExample.Criteria criteria = dstoperationExample.createCriteria();
		criteria.andModuleidEqualTo(moduleid);
		criteria.andOpertypeEqualTo(opertype);
		return dstoperationMapper.selectByExample(dstoperationExample);
	}
	/**
	 * 删除模块操作表
	 * @param roleid
	 */
	public void deleteDstroleoperateByRoleid(String roleid) {
		List<Dstrolemodule> dstrolemoduleList =  selectDstrolemodule(roleid);
		if(dstrolemoduleList.size()>0)
		dstroleoperateCustomMapper.deleteDstroleoperateMapperByRmid(dstrolemoduleList);
	}
	/**
	 * 根据模块号获取模块操作列表
	 * @param moduleid
	 * @return
	 */
	public List<Dstoperation> selectDstoperation(String moduleid){
		DstoperationExample dstoperationExample = new DstoperationExample();
		DstoperationExample.Criteria criteria = dstoperationExample.createCriteria();
		criteria.andModuleidEqualTo(moduleid);
		return dstoperationMapper.selectByExample(dstoperationExample);
	}
	/**
	 * 获取模块表
	 * @param roleid
	 * @return
	 */
	public List<Dstrolemodule> selectDstrolemodule(String roleid){
		DstrolemoduleExample dstrolemoduleExample = new DstrolemoduleExample();
		DstrolemoduleExample.Criteria criteria = dstrolemoduleExample.createCriteria();
		criteria.andRoleidEqualTo(roleid);
		return dstrolemoduleMapper.selectByExample(dstrolemoduleExample);
	}
	/**
	 * 删除模块表
	 * @param roleid
	 */
	public void deleteDstrolemodule(String roleid){
		DstrolemoduleExample dstrolemoduleExample = new DstrolemoduleExample();
		DstrolemoduleExample.Criteria criteria = dstrolemoduleExample.createCriteria();
		criteria.andRoleidEqualTo(roleid);
		dstrolemoduleMapper.deleteByExample(dstrolemoduleExample);
	}
	/**
	 * 模块是否在用
	 * @param moduleid
	 * @return
	 * @throws ExceptionResultInfo 
	 */
	public boolean isUsedModule(String moduleid) throws ExceptionResultInfo{
		DstrolemoduleExample dstrolemoduleExample=new DstrolemoduleExample();
		DstrolemoduleExample.Criteria criteria=dstrolemoduleExample.createCriteria();
		criteria.andModuleidEqualTo(moduleid);
		List<Dstrolemodule> list=dstrolemoduleMapper.selectByExample(dstrolemoduleExample);
		if(list!=null&&list.size()>0){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 126,null));
			return true;	
		}else{
			return false;
		}
	}
	/**
	 * 模块下是否存在子模块
	 * @param moduleid
	 * @return
	 * @throws ExceptionResultInfo 
	 */
	public boolean hasLowerModule(String moduleid) throws ExceptionResultInfo{
		DstmoduleExample dstmoduleExample=new DstmoduleExample();
		DstmoduleExample.Criteria criteria=dstmoduleExample.createCriteria();
		criteria.andParentidEqualTo(moduleid);
		List<Dstmodule> list=dstmoduleMapper.selectByExample(dstmoduleExample);
		if(list!=null&&list.size()>0){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 127,null));
			return true;	
		}else{
			return false;
		}
	}
	public boolean hasOperation(String moduleid) throws ExceptionResultInfo{
		DstoperationExample dstoperationExample=new DstoperationExample();
		DstoperationExample.Criteria criteria=dstoperationExample.createCriteria();
		criteria.andModuleidEqualTo(moduleid);
		List<Dstoperation> list=dstoperationMapper.selectByExample(dstoperationExample);
		if(list!=null&&list.size()>0){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 128,null));
			return true;	
		}else{
			return false;
		}
	}
    /**
	 * 根据parentid查询showorder最大值
	 */
	public int getMaxShowOrderByParentid(String parentid){
		return dstmoduleCustomMapper.getMaxShowOrderByParentid(parentid);
	}
}
