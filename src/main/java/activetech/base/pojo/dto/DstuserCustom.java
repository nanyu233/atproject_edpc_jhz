package activetech.base.pojo.dto;

import activetech.base.pojo.domain.Dstuser;
/**
 * 
 * <p>Title:DstuserCustom</p>
 * <p>Description:用户管理查询集合</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年1月9日 上午11:23:33
 *
 */
public class DstuserCustom extends Dstuser {
	private String dwmc;//用户的归属机构名称
	private String groupname;//用户的分组名称
	private String errormsg;//导入失败原因
	private String updatepwd1;//新密码
	private String updatepwd2;//确认新密码
	private String emgdwmc ;//出诊科室号
	private String comno; 
	private String comcname; 
	private String remark; 
	private String comnoB;
	private String comcnameB;
	private String queryLike;
	private String selrole;//查询角色条件

	public String getSelrole() {
		return selrole;
	}

	public void setSelrole(String selrole) {
		this.selrole = selrole;
	}

	public String getQueryLike() {
		return queryLike;
	}

	public void setQueryLike(String queryLike) {
		this.queryLike = queryLike;
	}

	public String getComnoB() {
		return comnoB;
	}

	public void setComnoB(String comnoB) {
		this.comnoB = comnoB;
	}

	public String getComcnameB() {
		return comcnameB;
	}

	public void setComcnameB(String comcnameB) {
		this.comcnameB = comcnameB;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getComcname() {
		return comcname;
	}

	public void setComcname(String comcname) {
		this.comcname = comcname;
	}

	public String getComno() {
		return comno;
	}

	public void setComno(String comno) {
		this.comno = comno;
	}

	public String getEmgdwmc() {
		return emgdwmc;
	}

	public void setEmgdwmc(String emgdwmc) {
		this.emgdwmc = emgdwmc;
	}

	public String getUpdatepwd1() {
		return updatepwd1;
	}

	public void setUpdatepwd1(String updatepwd1) {
		this.updatepwd1 = updatepwd1;
	}

	public String getUpdatepwd2() {
		return updatepwd2;
	}

	public void setUpdatepwd2(String updatepwd2) {
		this.updatepwd2 = updatepwd2;
	}

	public String getErrormsg() {
		return errormsg;
	}

	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}

	public String getDwmc() {
		return dwmc;
	}

	public void setDwmc(String dwmc) {
		this.dwmc = dwmc;
	}

	public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

}
