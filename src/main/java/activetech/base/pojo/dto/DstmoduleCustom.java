package activetech.base.pojo.dto;
import activetech.base.pojo.domain.Dstmodule;
/**
 * 
 * <p>Title:DstmoduleCustom</p>
 * <p>Description:模块查询结果集</p>
 * <p>activetech</p>
 * @author pyy
 * @date 2017-1-5 上午9:13:27
 *
 */

public class DstmoduleCustom extends Dstmodule{
	private String parentname;//模块父类名称

	public String getParentname() {
		return parentname;
	}

	public void setParentname(String parentname) {
		this.parentname = parentname;
	}
	
	
}
