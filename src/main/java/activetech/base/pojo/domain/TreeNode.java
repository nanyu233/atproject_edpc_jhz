package activetech.base.pojo.domain;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * <p>Title:TreenodeAttribute</p>
 * <p>Description:树的自定义属性</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2017-1-6 上午10:00:47
 *
 */
public class TreeNode {
    private String id;            //ID
    private String text;          //节点显示
    private String state;         //节点状态
    private String iconCls;		  //小图标
    private boolean checked;      //是否选中
    private List<TreeNode> children;//子节点
    private TreenodeAttributes attributes;//自定义属性
    private String parentId;
    
    public TreeNode() {
    	children = new ArrayList<TreeNode>();
    }
    
    public TreeNode(String id, String text) {
    	this.id = id;
    	this.text = text;
    	children = new ArrayList<TreeNode>();
    }
    
    public void addChild(TreeNode child) {
    	this.children.add(child);
    }
    
    public boolean hasChild() {
    	return this.children.size() != 0;
    }

	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public TreenodeAttributes getAttributes() {
		return attributes;
	}

	public void setAttributes(TreenodeAttributes attributes) {
		this.attributes = attributes;
	}

	public List<TreeNode> getChildren() {
		return children;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	
}