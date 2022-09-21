package activetech.base.pojo.dto;

import activetech.base.pojo.domain.Dstuserrole;
/**
 * 
 * <p>Title:DstuserroleCustom</p>
 * <p>Description:用户角色查询集合</p>
 * <p>activetech</p>
 * @author sunqian
 * @date 2017年1月22日 上午11:23:33
 *
 */
public class DstuserroleCustom extends Dstuserrole {
	private String rolename;//角色名称

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

}
