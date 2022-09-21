package activetech.zyyhospital.pojo.dto;

import activetech.hospital.pojo.domain.HspGcsInf;

public class HspGcsInfCustom extends HspGcsInf{

	public String GcsFlg;
	
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
	public String getGcsFlg() {
		return GcsFlg;
	}


	public void setGcsFlg(String gcsFlg) {
		GcsFlg = gcsFlg;
	}


	@Override
	public String toString() {
		return "HspGcsInfCustom [GcsFlg=" + GcsFlg + ", getEmgSeq()="
				+ getEmgSeq() + ", getEyeRctCod()=" + getEyeRctCod()
				+ ", getLanRctCod()=" + getLanRctCod() + ", getActRctCod()="
				+ getActRctCod() + ", getTotSco()=" + getTotSco()
				+ ", getCratDat()=" + getCratDat() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
	
	
}
