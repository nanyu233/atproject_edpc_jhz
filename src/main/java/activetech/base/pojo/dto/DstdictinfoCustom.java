package activetech.base.pojo.dto;

import activetech.base.pojo.domain.Dstdictinfo;
/**
 * 
 * <p>Title:DescriptionCustom</p>
 * <p>Description:数据字典结果集</p>
 * <p>activetech</p>
 * @author lpp
 * @date 2017-1-9 下午5:14:24
 *
 */

public class DstdictinfoCustom extends Dstdictinfo{
	private String typename;//类别名称

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

}
