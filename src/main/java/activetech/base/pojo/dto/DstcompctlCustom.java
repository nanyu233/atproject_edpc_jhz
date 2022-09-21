package activetech.base.pojo.dto;

import activetech.base.pojo.domain.Dstcompctl;
/**
 * 
 * <p>Title:DstcompctlCustom</p>
 * <p>Description:机构管理</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年1月22日 上午9:31:39
 *
 */
public class DstcompctlCustom extends Dstcompctl{
	private String _parentId;
	private String iconCls;
	private String commanname;//上级机构名字
	public String get_parentId() {
		return _parentId;
	}

	public void set_parentId(String _parentId) {
		this._parentId = _parentId;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	public String getCommanname() {
		return commanname;
	}

	public void setCommanname(String commanname) {
		this.commanname = commanname;
	}
	
}
