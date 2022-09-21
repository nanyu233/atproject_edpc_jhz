package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspHlpgb;

public class HspHlpgbCustom extends HspHlpgb {
	private String pgbFlag;
	private String preAssStr;
	private String qtNamStr;
	
	private String nrsSco;
	private String bradenSco;
	private String zcddexpfSco;
	private String adlSco;
	private String fallriskSco;
	private String zyfxpfSco;
	private String gcsSco;
	private String morseSco;
	private String info;
	private String name;
	private int count;
	private String querydate;
	private String xy;
	private String xt;
	private String xtFlg;
	
	/**
	 * 预检时间
	 */
	private String emgDatStr;
	
	
	public String getXy() {
		return xy;
	}

	public void setXy(String xy) {
		this.xy = xy;
	}

	public String getXt() {
		return xt;
	}

	public void setXt(String xt) {
		this.xt = xt;
	}

	public String getXtFlg() {
		return xtFlg;
	}

	public void setXtFlg(String xtFlg) {
		this.xtFlg = xtFlg;
	}

	public String getQuerydate() {
		return querydate;
	}

	public void setQuerydate(String querydate) {
		this.querydate = querydate;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getMorseSco() {
		return morseSco;
	}

	public void setMorseSco(String morseSco) {
		this.morseSco = morseSco;
	}

	public String getGcsSco() {
		return gcsSco;
	}

	public void setGcsSco(String gcsSco) {
		this.gcsSco = gcsSco;
	}

	public String getZyfxpfSco() {
		return zyfxpfSco;
	}

	public void setZyfxpfSco(String zyfxpfSco) {
		this.zyfxpfSco = zyfxpfSco;
	}

	public String getFallriskSco() {
		return fallriskSco;
	}

	public void setFallriskSco(String fallriskSco) {
		this.fallriskSco = fallriskSco;
	}

	public String getBradenSco() {
		return bradenSco;
	}

	public void setBradenSco(String bradenSco) {
		this.bradenSco = bradenSco;
	}

	public String getZcddexpfSco() {
		return zcddexpfSco;
	}

	public void setZcddexpfSco(String zcddexpfSco) {
		this.zcddexpfSco = zcddexpfSco;
	}

	public String getAdlSco() {
		return adlSco;
	}

	public void setAdlSco(String adlSco) {
		this.adlSco = adlSco;
	}

	public String getNrsSco() {
		return nrsSco;
	}
	
	public void setNrsSco(String nrsSco) {
		this.nrsSco = nrsSco;
	}

	public String getQtNamStr() {
		return qtNamStr;
	}

	public void setQtNamStr(String qtNamStr) {
		this.qtNamStr = qtNamStr;
	}

	public String getPreAssStr() {
		return preAssStr;
	}

	public void setPreAssStr(String preAssStr) {
		this.preAssStr = preAssStr;
	}

	public String getPgbFlag() {
		return pgbFlag;
	}

	public void setPgbFlag(String pgbFlag) {
		this.pgbFlag = pgbFlag;
	}

	@Override
	public String toString() {
		return (pgbFlag != null ? "pgbFlag=" + pgbFlag + ", " : "")
//				+ (getEmgSeq() != null ? "getEmgSeq()=" + getEmgSeq() + ", "
//						: "")
//				+ (getOprDat() != null ? "getOprDat()=" + getOprDat() + ", "
//						: "")
				+ (getPbgNbr() != null ? "getPbgNbr()=" + getPbgNbr() + ", "
						: "")
				+ (getQdCod() != null ? "getQdCod()=" + getQdCod() + ", " : "")
				+ (getQdOther() != null ? "getQdOther()=" + getQdOther() + ", "
						: "")
				+ (getHxCod() != null ? "getHxCod()=" + getHxCod() + ", " : "")
				+ (getHxOther() != null ? "getHxOther()=" + getHxOther() + ", "
						: "")
				+ (getXhCod() != null ? "getXhCod()=" + getXhCod() + ", " : "")
				+ (getCxCod() != null ? "getCxCod()=" + getCxCod() + ", " : "")
				+ (getCxQtbw() != null ? "getCxQtbw()=" + getCxQtbw() + ", "
						: "")
				+ (getNsCod() != null ? "getNsCod()=" + getNsCod() + ", " : "")
				+ (getNsDaqt() != null ? "getNsDaqt()=" + getNsDaqt() + ", "
						: "")
				+ (getNsTtcj() != null ? "getNsTtcj()=" + getNsTtcj() + ", "
						: "")
				+ (getNsThzt() != null ? "getNsThzt()=" + getNsThzt() + ", "
						: "")
				+ (getNsThztDes() != null ? "getNsThztDes()=" + getNsThztDes()
						+ ", " : "")
				+ (getTkLeft() != null ? "getTkLeft()=" + getTkLeft() + ", "
						: "")
				+ (getTkLeftCod() != null ? "getTkLeftCod()=" + getTkLeftCod()
						+ ", " : "")
				+ (getTkRight() != null ? "getTkRight()=" + getTkRight() + ", "
						: "")
				+ (getTkRightCod() != null ? "getTkRightCod()="
						+ getTkRightCod() + ", " : "")
				+ (getFbCod() != null ? "getFbCod()=" + getFbCod() + ", " : "")
				
				+ (getFbFc() != null ? "getFbFc()=" + getFbFc() + ", " : "")
				+ (getFbFcDes() != null ? "getFbFcDes()=" + getFbFcDes() + ", "
						: "")
				+ (getFbOther() != null ? "getFbOther()=" + getFbOther() + ", "
						: "")
				+ (getPfCod() != null ? "getPfCod()=" + getPfCod() + ", " : "")
				+ (getPfFw() != null ? "getPfFw()=" + getPfFw() + ", " : "")
				+ (getPfFwDes() != null ? "getPfFwDes()=" + getPfFwDes() + ", "
						: "")
				+ (getClbzCod() != null ? "getClbzCod()=" + getClbzCod() + ", "
						: "")
				+ (getQtQmsDat() != null ? "getQtQmsDat()=" + getQtQmsDat()
						+ ", " : "")
				+ (getQtTatRs() != null ? "getQtTatRs()=" + getQtTatRs() + ", "
						: "")
				+ (getQtTatDat() != null ? "getQtTatDat()=" + getQtTatDat()
						+ ", " : "")
				+ (getQtObj1Rs() != null ? "getQtObj1Rs()=" + getQtObj1Rs()
						+ ", " : "")
				+ (getQtObj1Dat() != null ? "getQtObj1Dat()=" + getQtObj1Dat()
						+ ", " : "")
				+ (getQtObj2Rs() != null ? "getQtObj2Rs()=" + getQtObj2Rs()
						+ ", " : "")
				+ (getQtObj2Dat() != null ? "getQtObj2Dat()=" + getQtObj2Dat()
						+ ", " : "")
				+ (getHlAddr() != null ? "getHlAddr()=" + getHlAddr() + ", "
						: "")
				+ (getJjlxNam() != null ? "getJjlxNam()=" + getJjlxNam() + ", "
						: "")
				+ (getJjlxTel() != null ? "getJjlxTel()=" + getJjlxTel() + ", "
						: "")
				+ (getQkCod() != null ? "getQkCod()=" + getQkCod() + ", " : "")
				+ (getQxBf() != null ? "getQxBf()=" + getQxBf() + ", " : "")
				+ (getQxZyh() != null ? "getQxZyh()=" + getQxZyh() + ", " : "")
//				+ (getPreAssNam() != null ? "getPreAssNam()=" + getPreAssNam()
//						+ ", " : "")
//				+ (getQtNam() != null ? "getQtNam()=" + getQtNam() + ", " : "")
//				+ (getCreateDat() != null ? "getCreateDat()=" + getCreateDat()
//						+ ", " : "")
//				+ (getCreateNbr() != null ? "getCreateNbr()=" + getCreateNbr()
//						+ ", " : "")
//				+ (getUpdateDat() != null ? "getUpdateDat()=" + getUpdateDat()
//						+ ", " : "")
//				+ (getUpdateNbr() != null ? "getUpdateNbr()=" + getUpdateNbr()
//						+ ", " : "")
				+ (getQtObj1Nam() != null ? "getQtObj1Nam()=" + getQtObj1Nam()
						+ ", " : "")
				+ (getQtObj2Nam() != null ? "getQtObj2Nam()=" + getQtObj2Nam()
						+ ", " : "");
	}

	public String getEmgDatStr() {
		return emgDatStr;
	}

	public void setEmgDatStr(String emgDatStr) {
		this.emgDatStr = emgDatStr;
	}
	
}
