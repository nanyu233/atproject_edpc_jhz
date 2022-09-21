package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspAdlInf;


public class HspAdlInfCustom extends HspAdlInf{
	
	public String aldFlg;
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

	public String getAldFlg() {
		return aldFlg;
	}

	public void setAldFlg(String aldFlg) {
		this.aldFlg = aldFlg;
	}

	@Override
	public String toString() {
		return(aldFlg != null ? "aldFlg=" + aldFlg + ", " : "")
				+ (getAldFlg() != null ? "getAldFlg()=" + getAldFlg() + ", "
						: "")
				+ (getXtpgSeq() != null ? "getXtpgSeq()=" + getXtpgSeq() + ", "
						: "")
				+ (getEmgSeq() != null ? "getEmgSeq()=" + getEmgSeq() + ", "
						: "")
				+ (getAdlHlylcd() != null ? "getAdlHlylcd()=" + getAdlHlylcd()
						+ ", " : "")
				+ (getAdlJsSco() != null ? "getAdlJsSco()=" + getAdlJsSco()
						+ ", " : "")
				+ (getAdlJsScoNew() != null ? "getAdlJsScoNew()="
						+ getAdlJsScoNew() + ", " : "")
				+ (getAdlXizSco() != null ? "getAdlXizSco()=" + getAdlXizSco()
						+ ", " : "")
				+ (getAdlXizScoNew() != null ? "getAdlXizScoNew()="
						+ getAdlXizScoNew() + ", " : "")
				+ (getAdlXsSco() != null ? "getAdlXsSco()=" + getAdlXsSco()
						+ ", " : "")
				+ (getAdlXsScoNew() != null ? "getAdlXsScoNew()="
						+ getAdlXsScoNew() + ", " : "")
				+ (getAdlCySco() != null ? "getAdlCySco()=" + getAdlCySco()
						+ ", " : "")
				+ (getAdlCyScoNew() != null ? "getAdlCyScoNew()="
						+ getAdlCyScoNew() + ", " : "")
				+ (getAdlKzdbSco() != null ? "getAdlKzdbSco()="
						+ getAdlKzdbSco() + ", " : "")
				+ (getAdlKzdbScoNew() != null ? "getAdlKzdbScoNew()="
						+ getAdlKzdbScoNew() + ", " : "")
				+ (getAdlKzxbSco() != null ? "getAdlKzxbSco()="
						+ getAdlKzxbSco() + ", " : "")
				+ (getAdlKzxbScoNew() != null ? "getAdlKzxbScoNew()="
						+ getAdlKzxbScoNew() + ", " : "")
				+ (getAdlScsSco() != null ? "getAdlScsSco()=" + getAdlScsSco()
						+ ", " : "")
				+ (getAdlScsScoNew() != null ? "getAdlScsScoNew()="
						+ getAdlScsScoNew() + ", " : "")
				+ (getAdlCyzySco() != null ? "getAdlCyzySco()="
						+ getAdlCyzySco() + ", " : "")
				+ (getAdlCyzyScoNew() != null ? "getAdlCyzyScoNew()="
						+ getAdlCyzyScoNew() + ", " : "")
				+ (getAdlXingzSco() != null ? "getAdlXingzSco()="
						+ getAdlXingzSco() + ", " : "")
				+ (getAdlXingzScoNew() != null ? "getAdlXingzScoNew()="
						+ getAdlXingzScoNew() + ", " : "")
				+ (getAdlSxltSco() != null ? "getAdlSxltSco()="
						+ getAdlSxltSco() + ", " : "")
				+ (getAdlSxltScoNew() != null ? "getAdlSxltScoNew()="
						+ getAdlSxltScoNew() + ", " : "")
				+ (getAdlSco() != null ? "getAdlSco()=" + getAdlSco() + ", "
						: "")
				+ (getAdlMemo() != null ? "getAdlMemo()=" + getAdlMemo() : "");
	}

	

	
	
}
