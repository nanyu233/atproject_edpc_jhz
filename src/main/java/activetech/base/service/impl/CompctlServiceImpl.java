package activetech.base.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.dao.mapper.DstcompctlCustomMapper;
import activetech.base.dao.mapper.DstcompctlMapper;
import activetech.base.pojo.domain.Dstcompctl;
import activetech.base.pojo.domain.DstcompctlExample;
import activetech.base.pojo.domain.TreeNode;
import activetech.base.pojo.domain.TreenodeAttributes;
import activetech.base.pojo.dto.DstcompctlCustom;
import activetech.base.pojo.dto.DstcompctlQueryDto;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.CompctlService;
import activetech.util.ResourcesUtil;
import activetech.util.StringUtils;
/**
 * 
 * <p>Title:CompctlServiceImpl</p>
 * <p>Description:机构管理Service实现类</p>
 * <p>activetech</p>
 * @author jpj
 * @date 2017-1-18 上午9:20:58
 *
 */
public class CompctlServiceImpl implements CompctlService {
	@Autowired
	private DstcompctlMapper dstcompctlMapper;
	@Autowired
	private DstcompctlCustomMapper dstcompctlCustomMapper; 

	/**
	 * 分步加载机构树
	 */
	public List<TreeNode> loadCompctlUserTreeElement(String comman) throws Exception {
		List<Dstcompctl> dstcompctlList = getDstcompctlByPK(comman);//获取机构列表父节点下的所有机构
		return getCompctlUserTreeElement(dstcompctlList);
	}
	public List<TreeNode> loadCompctlUserTreeElementChild(String comman) throws Exception{
		List<Dstcompctl> dstcompctlList = getDstcompctlByComman(comman);//获取机构列表父节点下的所有机构
		return getCompctlUserTreeElement(dstcompctlList);
	}
	private List<TreeNode> getCompctlUserTreeElement(List<Dstcompctl> dstcompctlList)throws Exception {
		List<TreeNode> TreeNodeList= new ArrayList<TreeNode>();
		for(Dstcompctl dstcompctl : dstcompctlList){
			TreeNode treeNode = new TreeNode();
			treeNode.setId(dstcompctl.getComno());
			treeNode.setText(dstcompctl.getComcname());
			treeNode.setIconCls("icon-node-module-bottom");
			treeNode.setAttributes(new TreenodeAttributes(ResourcesUtil.getValue(Config.SYSCONFIG, "url_userlist")));
			List<Dstcompctl> dstcompctlChildsList = getDstcompctlByComman(dstcompctl.getComno());
			if(dstcompctlChildsList.size()>0)
				treeNode.setState("closed");
			TreeNodeList.add(treeNode);
		}
		return TreeNodeList;
	}
	/**
	 * 根据主键获取机构列表
	 * @param comman
	 * @return
	 * @throws Exception
	 */
	private List<Dstcompctl> getDstcompctlByPK(String comno) throws Exception{
		List<Dstcompctl> dstcompctlsList = new ArrayList<Dstcompctl>();
		dstcompctlsList.add(dstcompctlMapper.selectByPrimaryKey(comno));
		return dstcompctlsList;
	}
	/**
	 * 根据父节点获取机构列表
	 * @param comman
	 * @return
	 * @throws Exception
	 */
	private List<Dstcompctl> getDstcompctlByComman(String comman) throws Exception{
		DstcompctlExample dstcompctlExample = new DstcompctlExample();
		DstcompctlExample.Criteria criteria = dstcompctlExample.createCriteria();
		criteria.andCommanEqualTo(comman);
		criteria.andIsenableEqualTo("1");
		dstcompctlExample.setOrderByClause("showorder asc");
		return dstcompctlMapper.selectByExample(dstcompctlExample);
	}
	/**
	 * 获取所有机构列表树
	 * @param dstcompctlList
	 * @return
	 * @throws Exception
	 */
	private List<TreeNode> getCompctlUserTree(List<Dstcompctl> dstcompctlList) throws Exception{
		List<TreeNode> TreeNodeList= new ArrayList<TreeNode>();
		for(Dstcompctl dstcompctl : dstcompctlList){
			TreeNode treeNode = new TreeNode();
			treeNode.setId(dstcompctl.getComno());
			treeNode.setText(dstcompctl.getComcname());
			treeNode.setIconCls("icon-node-module-bottom");
			treeNode.setAttributes(new TreenodeAttributes(ResourcesUtil.getValue(Config.SYSCONFIG, "url_userlist")));
			List<Dstcompctl> dstcompctlChildsList = getDstcompctlByComman(dstcompctl.getComno());
			List<TreeNode> TreeNodeChildsList= getCompctlUserTree(dstcompctlChildsList);
			if(TreeNodeChildsList.size()>0)
			treeNode.setChildren(TreeNodeChildsList);
			TreeNodeList.add(treeNode);
		}
		return TreeNodeList;
	}
	/**
	 * 根据主键comno机构号查询机构 不含上级机构名称
	 * @param comno
	 * @return
	 */
	public Dstcompctl findCompctlByComno(String comno) {
		return dstcompctlMapper.selectByPrimaryKey(comno);
	}
	/**
	 * 新增机构
	 * @param dstcompctlCustom
	 * @throws Exception
	 */
	public void insertCompctl(DstcompctlCustom dstcompctlCustom)
			throws Exception {
		//参数校验
		//1.非空校验
		String nullstr = this.insertCompctlisNotNullAndEmptyByTrim(dstcompctlCustom);
		if(StringUtils.isNotNullAndEmptyByTrim(nullstr)){
		//抛出异常
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { nullstr }));
		}
		//判断机构号是否存在
		Dstcompctl dstcompctl=dstcompctlMapper.selectByPrimaryKey(dstcompctlCustom.getComno());
		if(dstcompctl!=null && !dstcompctl.getIsenable().equals("3")){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 912,new Object[] {"机构号" ,dstcompctlCustom.getComno()}));
		}
		if(dstcompctl!=null && dstcompctl.getIsenable().equals("3")){
			dstcompctl.setComno(dstcompctlCustom.getComno());
			dstcompctl.setComcname(dstcompctlCustom.getComcname());
			dstcompctl.setComman(dstcompctlCustom.getComman());
			dstcompctl.setAreaid(dstcompctlCustom.getAreaid());
			dstcompctl.setIsenable(dstcompctlCustom.getIsenable());
			dstcompctl.setAddr(dstcompctlCustom.getAddr());
			dstcompctl.setPost(dstcompctlCustom.getPost());
			dstcompctl.setFax(dstcompctlCustom.getFax());
			dstcompctl.setPhone(dstcompctlCustom.getPhone());
			dstcompctl.setVchar1(dstcompctlCustom.getVchar1());
			dstcompctl.setIsJzks(dstcompctlCustom.getIsJzks());
			dstcompctlMapper.updateByPrimaryKey(dstcompctl);
			return;
		}
		//数据操作
		dstcompctlMapper.insert(dstcompctlCustom);    
	}
	/**
	 * 修改机构
	 * @param dstcompctlCustom
	 * @throws Exception
	 */
	public void updateCompctl(String comno,DstcompctlCustom dstcompctlCustom)
			throws Exception {
	   //参数校验
	  //1.非空校验
	  dstcompctlCustom.setComno(comno);
	  String nullstr = this.updateCompctlisNotNullAndEmptyByTrim(dstcompctlCustom);
	  if(StringUtils.isNotNullAndEmptyByTrim(nullstr)){
		 ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { nullstr }));
	   }
	//数据操作
	Dstcompctl dstcompctl_update = dstcompctlMapper.selectByPrimaryKey(comno);
	dstcompctl_update.setComno(dstcompctlCustom.getComno());
	dstcompctl_update.setComcname(dstcompctlCustom.getComcname());
	dstcompctl_update.setComman(dstcompctlCustom.getComman());
	dstcompctl_update.setAreaid(dstcompctlCustom.getAreaid());
	dstcompctl_update.setIsenable(dstcompctlCustom.getIsenable());
	dstcompctl_update.setAddr(dstcompctlCustom.getAddr());
	dstcompctl_update.setPost(dstcompctlCustom.getPost());
	dstcompctl_update.setFax(dstcompctlCustom.getFax());
	dstcompctl_update.setPhone(dstcompctlCustom.getPhone());
	dstcompctl_update.setVchar1(dstcompctlCustom.getVchar1());
	dstcompctl_update.setIsJzks(dstcompctlCustom.getIsJzks());
	dstcompctlMapper.updateByPrimaryKey(dstcompctl_update);
	}
	/**
	 * 删除机构
	 * @param comno
	 * @throws Exception
	 */
	public void deleteCompctl(String comno) throws Exception {
		//参数校验
		//1.非空校验
		if(!StringUtils.isNotNullAndEmptyByTrim(comno)){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { "机构号"}));
		}
		Dstcompctl dstcompctl = dstcompctlMapper.selectByPrimaryKey(comno);
		dstcompctl.setIsenable("3");
		dstcompctlMapper.updateByPrimaryKey(dstcompctl);
	}
	/**
	 * 新增机构表必填项验证
	 * @param dstcompctlCustom
	 * @return
	 */
	 private String insertCompctlisNotNullAndEmptyByTrim(DstcompctlCustom dstcompctlCustom) {
		//机构号
		if(!StringUtils.isNotNullAndEmptyByTrim(dstcompctlCustom.getComno())){
			return "机构号";
		}
		//机构名称
		if(!StringUtils.isNotNullAndEmptyByTrim(dstcompctlCustom.getComcname())){
			return "机构名称";
		}
		//所属上级id
		if(!StringUtils.isNotNullAndEmptyByTrim(dstcompctlCustom.getComman())){
			return "所属上级id";
		}
		//是否有效
		if(!StringUtils.isNotNullAndEmptyByTrim(dstcompctlCustom.getIsenable())){
			return "是否有效";
		}
		return null;
	}
	/**
	 * 修改机构表必填项验证
	 * @param dstcompctlCustom
	 * @return
	 */
	 private String updateCompctlisNotNullAndEmptyByTrim(DstcompctlCustom dstcompctlCustom) {
		//机构号
		if(!StringUtils.isNotNullAndEmptyByTrim(dstcompctlCustom.getComno())){
			return "机构号";
		}
		//机构名称
		if(!StringUtils.isNotNullAndEmptyByTrim(dstcompctlCustom.getComcname())){
			return "机构名称";
		}
		//所属上级id
		if(!StringUtils.isNotNullAndEmptyByTrim(dstcompctlCustom.getComman())){
			return "所属上级id";
		}
		//是否有效
		if(!StringUtils.isNotNullAndEmptyByTrim(dstcompctlCustom.getIsenable())){
			return "是否有效";
		}
		return null;
	}
	 /**
	  * 获取机构列表
	  * @param comno
	  * @return
	  */
	public List<DstcompctlCustom> getDstcompctlCustomList(DstcompctlQueryDto dstcompctlQueryDto) throws Exception {
		List<DstcompctlCustom> compctllist = dstcompctlCustomMapper.getDstcompctlCustomList(dstcompctlQueryDto);
		if(compctllist.size()==0){
			List<DstcompctlCustom> newcompctllist=dstcompctlCustomMapper.getDstcompctlCustomParentList(dstcompctlQueryDto);
			compctllist=newcompctllist;
		}
		DstcompctlCustom dstc=dstcompctlCustomMapper.getDstcompctlCustomBycomno("00100");
		compctllist.add(0, dstc);	
		if(StringUtils.isNotNullAndEmptyByTrim(dstcompctlQueryDto.getDstcompctlCustom().getComcname()) || 
				StringUtils.isNotNullAndEmptyByTrim(dstcompctlQueryDto.getDstcompctlCustom().getIsJzks())){
			List<DstcompctlCustom> list=dstcompctlCustomMapper.getDstcompctlCustomListGroupByComman(dstcompctlQueryDto);
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).getComman().equals("00100") || list.get(i).getComman().equals("0")){}
				else{
				    DstcompctlCustom dst=dstcompctlCustomMapper.getDstcompctlCustomBycomno(list.get(i).getComman());
				    compctllist.add(dst);
				}
			}
		}
		if(compctllist !=null && compctllist.size() !=0 ){
			compctllist.get(0).set_parentId("");
		}
		return compctllist;
	}
	/**
	 * 根据主键comno机构号查询机构 含上级机构名称
	 * @param comno
	 * @return
	 */
	public DstcompctlCustom selectCompctlByComno(String comno) {
		return dstcompctlCustomMapper.selectCompctlByComno(comno);
	}
	/**
	 * 根据Comman查询机构
	 * @param Comman
	 * @return
	 * @throws Exception
	 */
	public List<Dstcompctl> findCompctlByComman(String Comman) throws Exception {
		//非空校验
		if(!StringUtils.isNotNullAndEmptyByTrim(Comman)){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { "所属上级id"}));
		}
		DstcompctlExample dstcompctlExample=new DstcompctlExample();
		DstcompctlExample.Criteria criteria=dstcompctlExample.createCriteria();
		criteria.andComnoNotEqualTo("001003");
		criteria.andComcnameLike("急诊%");
		return dstcompctlMapper.selectByExample(dstcompctlExample);
	}
	
	/**
	 * 查询所有机构分页
	 * @param comman
	 * @return
	 */
	public List<DstcompctlCustom> selectCompctl(DstcompctlQueryDto dstcompctlQueryDto){
		DstcompctlCustom dstcompctlCustom=dstcompctlQueryDto.getDstcompctlCustom();

		//拼音编码不区分大小写
//		if(dstcompctlCustom != null){
//			if(StringUtils.isNotNullAndEmptyByTrim(dstcompctlCustom.getPybm())){
//				dstcompctlCustom.setPybm(dstcompctlCustom.getPybm().toUpperCase());
//			}
//		}
		return dstcompctlCustomMapper.selectCompctl(dstcompctlQueryDto);
	}
	
	/**
	 * 查询所有机构个数
	 * @param dstroleQueryDto
	 * @return
	 * @throws Exception
	 */
	public int selectCompctlCount(DstcompctlQueryDto dstcompctlQueryDto) throws Exception{
		//拼音编码不区分大小写
		return dstcompctlCustomMapper.selectCompctlCount(dstcompctlQueryDto);
	}
	
	/**
	 * 查询急诊列表数据
	 * @return
	 * @throws Exception
	 */
	public List<Dstcompctl> getJzksCompctlList() throws Exception{
		DstcompctlExample dstcompctlExample=new DstcompctlExample();
		DstcompctlExample.Criteria criteria=dstcompctlExample.createCriteria();
		criteria.andIsJzksEqualTo("1");
		criteria.andIsenableEqualTo("1");
		dstcompctlExample.setOrderByClause("SHOWORDER asc");
		return dstcompctlMapper.selectByExample(dstcompctlExample);
	}
}
