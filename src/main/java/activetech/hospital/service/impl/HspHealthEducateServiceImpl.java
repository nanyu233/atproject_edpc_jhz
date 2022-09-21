package activetech.hospital.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.domain.TreeNode;
import activetech.base.pojo.domain.TreenodeAttributes;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.hospital.dao.mapper.HspHealtheduInfCustomMapper;
import activetech.hospital.dao.mapper.HspHealtheduInfMapper;
import activetech.hospital.dao.mapper.HspHealtheduItemCustomMapper;
import activetech.hospital.dao.mapper.HspHealtheduItemMapper;
import activetech.hospital.pojo.domain.HspHealtheduItem;
import activetech.hospital.pojo.domain.HspHealtheduItemExample;
import activetech.hospital.pojo.dto.HspHealtheduInfCustom;
import activetech.hospital.pojo.dto.HspHealtheduInfQueryDto;
import activetech.hospital.pojo.dto.HspHealtheduItemCustom;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.service.HspHealthEducateService;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;

public class HspHealthEducateServiceImpl implements HspHealthEducateService {
	@Autowired
	private HspHealtheduInfMapper hspHealtheduInfMapper;
	@Autowired
	private HspHealtheduItemMapper hspHealtheduItemMapper;
	@Autowired
	private HspHealtheduInfCustomMapper hspHealtheduInfCustomMapper;
	@Autowired
	private HspHealtheduItemCustomMapper hspHealtheduItemCustomMapper;

	/**
	 * 抢救室病人列表
	 * @param hspemginfQueryDto
	 * @return
	 */
	@Override
	public List<HspemginfCustom> findEmgListInQjs(
			HspHealtheduInfQueryDto hspHealtheduQueryDto) {
		return hspHealtheduInfCustomMapper.findEmgListInQjs(hspHealtheduQueryDto);
	}

	/**
	 * 病人健康教育项目列表
	 * @param hspemginfQueryDto emgSeq and eduDat
	 * @return
	 */
	@Override
	public List<HspHealtheduInfCustom> findHealtheduListByEmgSeq(
			HspHealtheduInfQueryDto hspHealtheduQueryDto) {
		HspHealtheduInfCustom hspHealtheduInfCustom=hspHealtheduQueryDto.getHspHealtheduInfCustom();
		List<HspHealtheduInfCustom> eduList=null;
		if(hspHealtheduInfCustom!=null){
			eduList=hspHealtheduInfCustomMapper.findHealtheduListByEmgSeq(hspHealtheduQueryDto);
		}
		return eduList;
	}

	@Override
	public void insertHealthEducate(HspHealtheduInfQueryDto hspHealtheduQueryDto,ActiveUser activeUser) throws Exception{
		String[] eduItemList=hspHealtheduQueryDto.getEduItemList();
		HspHealtheduInfCustom hspHealtheduInfCustom=hspHealtheduQueryDto.getHspHealtheduInfCustom();
		if(hspHealtheduInfCustom!=null){
			hspHealtheduInfCustom.setCratDat(new Date());
			hspHealtheduInfCustom.setCratNbr(activeUser.getUsrno());
			hspHealtheduInfCustom.setUpdtDat(new Date());
			hspHealtheduInfCustom.setUpdtNbr(activeUser.getUsrno());
			//教育项目逐条新增
			for (String eduItem:eduItemList) {
				hspHealtheduInfCustom.setEduSeq(UUIDBuild.getUUID());
				hspHealtheduInfCustom.setEduItem(eduItem);
				//插入项目详细说明
				HspHealtheduItem hspHealtheduItem=hspHealtheduItemMapper.selectByPrimaryKey(eduItem);
				hspHealtheduInfCustom.setEduOther(hspHealtheduItem.getVchar1());
				hspHealtheduInfMapper.insert(hspHealtheduInfCustom);
			}
		}
		
	}

	@Override
	public void deleteHealthEducate(String eduSeq) throws Exception{
		if(StringUtils.isNotNullAndEmptyByTrim(eduSeq))
			hspHealtheduInfMapper.deleteByPrimaryKey(eduSeq);
		
	}

	@Override
	public List<TreeNode> loadHealthEducateTree(HspHealtheduItemCustom hspHealtheduItemCustom) throws Exception {
		//获取父模块
		hspHealtheduItemCustom=hspHealtheduItemCustom!=null?hspHealtheduItemCustom:new HspHealtheduItemCustom();
		String itemno=hspHealtheduItemCustom.getItemno();
		if(!StringUtils.isNotNullAndEmptyByTrim(itemno) || StringUtils.isNotNullAndEmptyByTrim(hspHealtheduItemCustom.getItemNam())){
			itemno="00100";
			hspHealtheduItemCustom.setItemno(itemno);
		}
		HspHealtheduItem parent=findItemByItemNo(itemno);
		TreeNode eduNode = new TreeNode();
		eduNode.setId(parent.getItemno());
		eduNode.setParentId(parent.getParentno());
		eduNode.setText(parent.getItemNam());
		eduNode.setState("open");
		eduNode.setIconCls("icon-node-module-bottom");
		eduNode.setAttributes(new TreenodeAttributes(null));
		eduNode.getAttributes().setSpareField(parent.getVchar1());
		List<HspHealtheduItemCustom> eduList = hspHealtheduItemCustomMapper.findItemTreeByItemNamAndParentno(hspHealtheduItemCustom);
		//获取子模块
		if(eduList.size()>0){
			List<TreeNode> children=getAllMdlNode(eduList,itemno);
			eduNode.setChildren(children);
		}
		List<TreeNode> list=new ArrayList<TreeNode>();
		list.add(eduNode);
		return list;
	}
	//获取所有节点模块
	private List<TreeNode> getAllMdlNode(List<HspHealtheduItemCustom> eduList,String itemno) throws Exception {
		List<TreeNode> TreeNodeList=new ArrayList<TreeNode>();
		for (HspHealtheduItem hspHealtheduItem : eduList) {
			TreeNode eduNode = new TreeNode();
			eduNode.setId(hspHealtheduItem.getItemno());
			eduNode.setParentId(hspHealtheduItem.getParentno());
			eduNode.setText(hspHealtheduItem.getItemNam());
			if(!"00100".equals(itemno)){
				eduNode.setState("open");
			}else{
				eduNode.setState("closed");
			}
			eduNode.setIconCls("icon-node-module-bottom");
			eduNode.setAttributes(new TreenodeAttributes(null));
			eduNode.getAttributes().setSpareField(hspHealtheduItem.getVchar1());
			//插入空子节点，防止ztree自增子节点
			if("00100".equals(itemno)){
				List<TreeNode> children=new ArrayList<TreeNode>();
				TreeNode c = new TreeNode();
				c.setId("000000");
				c.setParentId(hspHealtheduItem.getItemno());
				c.setText("");
				c.setState("close");
				c.setIconCls("icon-node-module-bottom");
				c.setAttributes(new TreenodeAttributes(null));
				c.getAttributes().setSpareField(hspHealtheduItem.getVchar1());
				children.add(c);
				eduNode.setChildren(children);
			}
			//eduNode.setSpareField(hspHealtheduItem.getVchar1());
			TreeNodeList.add(eduNode);
		}
		return TreeNodeList;
	}
	
	/**
	 * 根据父节点获取机构列表
	 * @param comman
	 * @return
	 * @throws Exception
	 */
	private List<HspHealtheduItem> getHealthEduByParentNo(String parentNo) throws Exception{
		HspHealtheduItemExample hspHealtheduItemExample = new HspHealtheduItemExample();
		HspHealtheduItemExample.Criteria criteria = hspHealtheduItemExample.createCriteria();
		criteria.andParentnoEqualTo(parentNo);
		criteria.andIsenableEqualTo("1");
		hspHealtheduItemExample.setOrderByClause("showorder asc");
		return hspHealtheduItemMapper.selectByExample(hspHealtheduItemExample);
	}
	
	//---------------------------健康教育项目维护----------------------------------
	/**
	 * 健康教育项目列表
	 */
	@Override
	public List<HspHealtheduItemCustom> getItemsListTree(HspHealtheduInfQueryDto hspHealtheduInfQueryDto)throws Exception {
		List<HspHealtheduItemCustom> list=null;
		hspHealtheduInfQueryDto.getHspHealtheduItemCustom().setItemno("00100");
		
		if(StringUtils.isNotNullAndEmptyByTrim(hspHealtheduInfQueryDto.getHspHealtheduItemCustom().getItemNam())){
			//适用于3个节点以内查询 包含最父节点
			list=hspHealtheduItemCustomMapper.findItemTreeByItemNam(hspHealtheduInfQueryDto);
		}else{
			list=hspHealtheduItemCustomMapper.getItemsListTree(hspHealtheduInfQueryDto);
		}
		//放入最大父节点
		HspHealtheduItemCustom parent=findItemByItemNo(hspHealtheduInfQueryDto.getHspHealtheduItemCustom().getItemno());
		list.add(0, parent);
		if(list !=null && list.size() !=0 ){
			list.get(0).set_parentId("");
		}
		return list;
	}
	
	@Override
	public void insertHealthEduItem(HspHealtheduInfQueryDto hspHealtheduQueryDto)throws Exception {
		HspHealtheduItemCustom hspHealtheduItemCustom=hspHealtheduQueryDto.getHspHealtheduItemCustom();
		if(hspHealtheduItemCustom!=null){
			HspHealtheduItem hspHealtheduItem=hspHealtheduItemMapper.selectByPrimaryKey(hspHealtheduItemCustom.getItemno());
			if(hspHealtheduItem!=null && !hspHealtheduItem.getIsenable().equals("3")){
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 912,new Object[] {"项目号" ,hspHealtheduItem.getItemno()}));
			}
			if(hspHealtheduItem!=null && hspHealtheduItem.getIsenable().equals("3")){
				hspHealtheduItem.setItemNam(hspHealtheduItemCustom.getItemNam());
				hspHealtheduItem.setParentno(hspHealtheduItemCustom.getParentno());
				hspHealtheduItem.setSpellcode(hspHealtheduItemCustom.getSpellcode());
				hspHealtheduItem.setVchar1(hspHealtheduItemCustom.getVchar1());
				hspHealtheduItem.setIsenable(hspHealtheduItemCustom.getIsenable());
				hspHealtheduItem.setShoworder(hspHealtheduItemCustom.getShoworder());
				hspHealtheduItemMapper.updateByPrimaryKey(hspHealtheduItem);
				return;
			}
			hspHealtheduItemMapper.insert(hspHealtheduItemCustom);
		}
	}
	
	@Override
	public void deleteHealthEduItem(String itemno)throws Exception {
		if(!StringUtils.isNotNullAndEmptyByTrim(itemno)){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920,new Object[] {"项目号不能为空！"}));
		}
		HspHealtheduItem hspHealtheduItem=hspHealtheduItemMapper.selectByPrimaryKey(itemno);
		hspHealtheduItem.setIsenable("3");
		hspHealtheduItemMapper.updateByPrimaryKey(hspHealtheduItem);
	}

	@Override
	public HspHealtheduItemCustom findItemByItemNo(String itemno)
			throws Exception {
		HspHealtheduItemCustom hspHealtheduItemCustom=hspHealtheduItemCustomMapper.findItemByItemNo(itemno);
		return hspHealtheduItemCustom;
	}
	
	@Override
	public void editHealthEduItem(HspHealtheduInfQueryDto hspHealtheduQueryDto)throws Exception {
		HspHealtheduItemCustom hspHealtheduItemCustom=hspHealtheduQueryDto.getHspHealtheduItemCustom();
		if(hspHealtheduItemCustom!=null){
			HspHealtheduItem hspHealtheduItem=hspHealtheduItemMapper.selectByPrimaryKey(hspHealtheduItemCustom.getItemno());
			if(hspHealtheduItem!=null){
				hspHealtheduItem.setItemNam(hspHealtheduItemCustom.getItemNam());
				hspHealtheduItem.setParentno(hspHealtheduItemCustom.getParentno());
				hspHealtheduItem.setSpellcode(hspHealtheduItemCustom.getSpellcode());
				hspHealtheduItem.setVchar1(hspHealtheduItemCustom.getVchar1());
				hspHealtheduItem.setIsenable(hspHealtheduItemCustom.getIsenable());
				hspHealtheduItem.setShoworder(hspHealtheduItemCustom.getShoworder());
				hspHealtheduItemMapper.updateByPrimaryKey(hspHealtheduItem);
			}
		}
	}

	@Override
	public int getTreeLevel(String itemno) throws Exception {
		int level=hspHealtheduItemCustomMapper.getTreeLevel(itemno);
		return level;
	}
}
