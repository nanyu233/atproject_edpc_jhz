package activetech.base.pojo.dto;
import activetech.base.pojo.domain.Dstrole;

/**
 * 
 * <p>Title:DstroleCustom</p>
 * <p>Description:角色查询结果集</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2017-1-4 上午10:42:17
 * 
 */
public class DstroleCustom extends Dstrole {
	private String qxcount;//已分配权限数
	private String usrno; //用户号
	
	public String getUsrno() {
		return usrno;
	}

	public void setUsrno(String usrno) {
		this.usrno = usrno;
	}

	public String getQxcount() {
		return qxcount;
	}

	public void setQxcount(String qxcount) {
		this.qxcount = qxcount;
	}

	
}