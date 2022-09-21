package activetech.rfid.pojo.dto;

import activetech.rfid.pojo.domain.HspUhfTrp;

/**
 * 
 * <p>Title:HspUhfTrpCustom</p>
 * <p>Description:UHF应答器查询结果集</p>
 * <p>activetech</p>
 * @author zhanghui
 * @date 2021-3-31 下午20:38:00
 * 
 */
public class HspUhfTrpCustom extends HspUhfTrp {
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