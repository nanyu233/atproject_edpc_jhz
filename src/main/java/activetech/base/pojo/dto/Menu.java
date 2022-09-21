package activetech.base.pojo.dto;

import java.io.Serializable;
import java.util.List;

/**
 * 菜单模型类
 */
public class Menu implements Serializable {
	private static final long serialVersionUID = 345346488123L;
	//二级菜单
	private List<Menu> menus;
	//菜单id、模块id
	private String menuid;
	//图标
	private String icon;
	//菜单名称/模块名称
	private String menuname;
	//子菜单链接
	private String url;
	//主菜单链接
	private String mainurl;
	private String reloadType;  //刷新方式
	
	//菜单下的各各操作链接为了权限链接
	private List<Operation> operations;

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public String getMenuid() {
		return menuid;
	}

	public void setMenuid(String menuid) {
		this.menuid = menuid;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getMenuname() {
		return menuname;
	}

	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	public String getReloadType() {
		return reloadType;
	}

	public void setReloadType(String reloadType) {
		this.reloadType = reloadType;
	}

	
	public String getMainurl() {
		return mainurl;
	}

	public void setMainurl(String mainurl) {
		this.mainurl = mainurl;
	}

	@Override
	public String toString() {
		return "Menu [menus=" + menus + ", menuid=" + menuid + ", icon=" + icon
				+ ", menuname=" + menuname + ", url=" + url + "]";
	}

}
