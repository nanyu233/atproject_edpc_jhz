package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspDgpgInf;

public class HspDgpgInfCustom extends HspDgpgInf {

	public String dgpgFlg;

	public String ylgDg;
	
	public String qtDg;
	
	public String getQtDg() {
		return qtDg;
	}

	public void setQtDg(String qtDg) {
		this.qtDg = qtDg;
	}

	public String getDgpgFlg() {
		return dgpgFlg;
	}

	public void setDgpgFlg(String dgpgFlg) {
		this.dgpgFlg = dgpgFlg;
	}

	
	public String getYlgDg() {
		return ylgDg;
	}

	public void setYlgDg(String ylgDg) {
		this.ylgDg = ylgDg;
	}

	@Override
	public String toString() {
		return  (dgpgFlg != null ? "dgpgFlg=" + dgpgFlg + ", " : "")
				+ (ylgDg != null ? "ylgDg=" + ylgDg + ", " : "")
				+ (getQtDg() != null ? "getQtDg()=" + getQtDg() : "")
				+ (getYlgDg() != null ? "getYlgDg()=" + getYlgDg() + ", " : "")
				+ (getXtpgSeq() != null ? "getXtpgSeq()=" + getXtpgSeq() + ", "
						: "")
				+ (getEmgSeq() != null ? "getEmgSeq()=" + getEmgSeq() + ", "
						: "")
				+ (getDgpgJmdgFlg() != null ? "getDgpgJmdgFlg()="
						+ getDgpgJmdgFlg() + ", " : "")
				+ (getWzjmTcFlg() != null ? "getWzjmTcFlg()=" + getWzjmTcFlg()
						+ ", " : "")
				+ (getWzjmJwbyy() != null ? "getWzjmJwbyy()=" + getWzjmJwbyy()
						+ ", " : "")
				+ (getWzjmSd() != null ? "getWzjmSd()=" + getWzjmSd() + ", "
						: "")
				+ (getWzjmGrjxFlg() != null ? "getWzjmGrjxFlg()="
						+ getWzjmGrjxFlg() + ", " : "")
				+ (getWzjmSfbgFlg() != null ? "getWzjmSfbgFlg()="
						+ getWzjmSfbgFlg() + ", " : "")
				+ (getWzjmMemo() != null ? "getWzjmMemo()=" + getWzjmMemo()
						+ ", " : "")
				+ (getCvcDgpgCctjCod() != null ? "getCvcDgpgCctjCod()="
						+ getCvcDgpgCctjCod() + ", " : "")
				+ (getCvcDgxhCod() != null ? "getCvcDgxhCod()="
						+ getCvcDgxhCod() + ", " : "")
				+ (getCvcZgsd() != null ? "getCvcZgsd()=" + getCvcZgsd() + ", "
						: "")
				+ (getCvcJwbyy() != null ? "getCvcJwbyy()=" + getCvcJwbyy()
						+ ", " : "")
				+ (getCvcJwbyySd() != null ? "getCvcJwbyySd()="
						+ getCvcJwbyySd() + ", " : "")
				+ (getCvcGrjxFlg() != null ? "getCvcGrjxFlg()="
						+ getCvcGrjxFlg() + ", " : "")
				+ (getCvcHyFlg() != null ? "getCvcHyFlg()=" + getCvcHyFlg()
						+ ", " : "")
				+ (getCvcMemo() != null ? "getCvcMemo()=" + getCvcMemo() + ", "
						: "")
				+ (getPiccDgxh() != null ? "getPiccDgxh()=" + getPiccDgxh()
						+ ", " : "")
				+ (getPiccDgxhNz() != null ? "getPiccDgxhNz()="
						+ getPiccDgxhNz() + ", " : "")
				+ (getPiccDgxhWz() != null ? "getPiccDgxhWz()="
						+ getPiccDgxhWz() + ", " : "")
				+ (getSygDgpgCctjCod() != null ? "getSygDgpgCctjCod()="
						+ getSygDgpgCctjCod() + ", " : "")
				+ (getSygCctjTcFlg() != null ? "getSygCctjTcFlg()="
						+ getSygCctjTcFlg() + ", " : "")
				+ (getSygJwbyy() != null ? "getSygJwbyy()=" + getSygJwbyy()
						+ ", " : "")
				+ (getSygSd() != null ? "getSygSd()=" + getSygSd() + ", " : "")
				+ (getSygGrjxFlg() != null ? "getSygGrjxFlg()="
						+ getSygGrjxFlg() + ", " : "")
				+ (getSygDxzccFlg() != null ? "getSygDxzccFlg()="
						+ getSygDxzccFlg() + ", " : "")
				+ (getSygBdxzFlg() != null ? "getSygBdxzFlg()="
						+ getSygBdxzFlg() + ", " : "")
				+ (getSygQt() != null ? "getSygQt()=" + getSygQt() + ", " : "")
				+ (getDgpgYlgFlg() != null ? "getDgpgYlgFlg()="
						+ getDgpgYlgFlg() + ", " : "")
				+ (getYlgGrjxFlg() != null ? "getYlgGrjxFlg()="
						+ getYlgGrjxFlg() + ", " : "")
				+ (getYlgBgFlg() != null ? "getYlgBgFlg()=" + getYlgBgFlg()
						+ ", " : "")
				+ (getDgpgMemo() != null ? "getDgpgMemo()=" + getDgpgMemo()
						+ ", " : "")
				;
	}
}
