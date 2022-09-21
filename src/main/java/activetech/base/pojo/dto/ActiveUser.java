package activetech.base.pojo.dto;
import java.io.Serializable;
import java.util.List;

/**
 * 用户身份信息、存入session
 */
public class ActiveUser  implements Serializable {
	
	private static final long serialVersionUID = 5676957562341L;

	
	private String usrno;//用户账号
	private String usrname;//用户名称
	private String groupid;//用户类型
	private String groupname;//用户类型名称

	private Menu menu;//操作菜单
	private List<Operation> operationList;//操作权限，包括用户点击菜单及操作菜单功能所有链接权限
	
	private String sysid;//用户所属单位id
	private String sysmc;//单位名称
	private List<String> dstroleList;//角色
	private String departmentCod; //医生等了所选科室id
	private String departmentName; //医生等了所选科室名称
	private String ip;//登陆电脑ip
	private String hospitalCategory;//医院类别
	private String qmOpenid;
	
	public String getHospitalCategory() {
		return hospitalCategory;
	}

	public void setHospitalCategory(String hospitalCategory) {
		this.hospitalCategory = hospitalCategory;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getDepartmentCod() {
		return departmentCod;
	}

	public void setDepartmentCod(String departmentCod) {
		this.departmentCod = departmentCod;
	}

	public List<String> getDstroleList() {
		return dstroleList;
	}

	public void setDstroleList(List<String> dstroleList) {
		this.dstroleList = dstroleList;
	}

	public String getUsrname() {
		return usrname;
	}

	public void setUsrname(String usrname) {
		this.usrname = usrname;
	}

	public String getUsrno() {
		return usrno;
	}

	public void setUsrno(String usrno) {
		this.usrno = usrno;
	}

	public String getGroupid() {
		return groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}


	public String getSysid() {
		return sysid;
	}

	public void setSysid(String sysid) {
		this.sysid = sysid;
	}


	public String getGroupname() {
		return groupname;
	}

	public List<Operation> getOperationList() {
		return operationList;
	}

	public void setOperationList(List<Operation> operationList) {
		this.operationList = operationList;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public String getSysmc() {
		return sysmc;
	}

	public void setSysmc(String sysmc) {
		this.sysmc = sysmc;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getQmOpenid() {
		return qmOpenid;
	}

	public void setQmOpenid(String qmOpenid) {
		this.qmOpenid = qmOpenid;
	}

}
