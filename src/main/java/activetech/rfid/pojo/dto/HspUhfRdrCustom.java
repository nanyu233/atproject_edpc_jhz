package activetech.rfid.pojo.dto;

import activetech.rfid.pojo.domain.HspUhfRdr;

/**
 * 
 * <p>Title:HspUhfRdrCustom</p>
 * <p>Description:UHF读写器查询结果集</p>
 * <p>activetech</p>
 * @author zhanghui
 * @date 2021-3-25 上午09:50:00
 * 
 */
public class HspUhfRdrCustom extends HspUhfRdr {

	private String qxcount;//已分配权限数sss

	private String usrno; //用户号

	private String rdrDepNam; //

	//设备是否可用，0：不可用，1：可用，默认不可用
	private String rdrAva;

	public String getRdrDepNam() {
		return rdrDepNam;
	}

	public void setRdrDepNam(String rdrDepNam) {
		this.rdrDepNam = rdrDepNam;
	}

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

	public String getRdrAva() { return rdrAva; }

	public void setRdrAva(String rdrAva) { this.rdrAva = rdrAva; }
}