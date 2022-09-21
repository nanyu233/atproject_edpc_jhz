package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspNrsInf;

public class HspNrsInfCustom extends HspNrsInf {

	public String nrsFlg;
	public String nrsscoFlg;
	/**
	 * 病情护理记录单Id
	 */
	public String bqhiSeq;
	
	
	public String getBqhiSeq() {
		return bqhiSeq;
	}

	public void setBqhiSeq(String bqhiSeq) {
		this.bqhiSeq = bqhiSeq;
	}
	
	public String getNrsscoFlg() {
		return nrsscoFlg;
	}
	public void setNrsscoFlg(String nrsscoFlg) {
		this.nrsscoFlg = nrsscoFlg;
	}

	public String getNrsFlg() {
		return nrsFlg;
	}

	public void setNrsFlg(String nrsFlg) {
		this.nrsFlg = nrsFlg;
	}

	
	
	@Override
	public String toString() {
		return   (getXtpgSeq() != null ? "getXtpgSeq()=" + getXtpgSeq() + ", "
						: "")
				+ (getEmgSeq() != null ? "getEmgSeq()=" + getEmgSeq() + ", "
						: "")
				+ (getNrsTtbw() != null ? "getNrsTtbw()=" + getNrsTtbw() + ", "
						: "")
				+ (getNrsTtbwQt() != null ? "getNrsTtbwQt()=" + getNrsTtbwQt()
						+ ", " : "")
				+ (getNrsTtxz() != null ? "getNrsTtxz()=" + getNrsTtxz() + ", "
						: "")
				+ (getNrsTtxzQt() != null ? "getNrsTtxzQt()=" + getNrsTtxzQt()
						+ ", " : "")
				+ (getNrsTtsj() != null ? "getNrsTtsj()=" + getNrsTtsj() + ", "
						: "")
				+ (getNrsTtkz() != null ? "getNrsTtkz()=" + getNrsTtkz() + ", "
						: "")
				+ (getNrsSco() != null ? "getNrsSco()=" + getNrsSco() + ", "
						: "")
				+ (getNrsMemo() != null ? "getNrsMemo()=" + getNrsMemo() + ", "
						: "")
				+ (getNrsDat() != null ? "getNrsDat()=" + getNrsDat() + ", "
						: "")
				+ (getNrsStatus() != null ? "getNrsStatus()=" + getNrsStatus()
						+ ", " : "")
				+ (getTtpfTypeCod() != null ? "getTtpfTypeCod()=" + getTtpfTypeCod()
						+ ", " : "")
				+ (getTtpfNr() != null ? "getTtpfNr()=" + getTtpfNr()
						+ ", " : "")
				;
	}
	
	
	
}
