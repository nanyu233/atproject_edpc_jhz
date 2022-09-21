package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspHljldInf;
import activetech.zyyhospital.pojo.domain.HspHljldInfWithBLOBs;

public class HspHljldInfCustom extends HspHljldInfWithBLOBs{
    private String rl;//入量数据
    private String cl;//出量数据
    private String date2;//导出用到的时间
    private String sbp;//上下压;
    private String hsusrnames;//护士签名拼接字段
    private String xtName;//血糖类型名
    //统计出入量
	private String typecrl;
	private String sumcrl;
	private String crtDateStr;
  		
	/**
	 * 疼痛评分
	 */
	private String nrsSco;
	/**
	 * braden评分
	 */
	private String bradenSco;
	/**
	 * adl评分
	 */
	private String adlSco;
	/**
	 * 转运风险评分
	 */
	private String zyfxpfSco;
	/**
	 * gcs评分
	 */
	private String gcsSco;
	
	/**
	 * morse评分
	 */
	private String morseSco;
	
	
	public String getXtName() {
		return xtName;
	}
	public void setXtName(String xtName) {
		this.xtName = xtName;
	}
	public String getNrsSco() {
		return nrsSco;
	}
	public void setNrsSco(String nrsSco) {
		this.nrsSco = nrsSco;
	}
	public String getBradenSco() {
		return bradenSco;
	}
	public void setBradenSco(String bradenSco) {
		this.bradenSco = bradenSco;
	}
	public String getAdlSco() {
		return adlSco;
	}
	public void setAdlSco(String adlSco) {
		this.adlSco = adlSco;
	}
	public String getZyfxpfSco() {
		return zyfxpfSco;
	}
	public void setZyfxpfSco(String zyfxpfSco) {
		this.zyfxpfSco = zyfxpfSco;
	}
	public String getGcsSco() {
		return gcsSco;
	}
	public void setGcsSco(String gcsSco) {
		this.gcsSco = gcsSco;
	}
	public String getMorseSco() {
		return morseSco;
	}
	public void setMorseSco(String morseSco) {
		this.morseSco = morseSco;
	}
	public String getCrtDateStr() {
		return crtDateStr;
	}
	public void setCrtDateStr(String crtDateStr) {
		this.crtDateStr = crtDateStr;
	}
	public String getTypecrl() {
		return typecrl;
	}
	public void setTypecrl(String typecrl) {
		this.typecrl = typecrl;
	}
	public String getSumcrl() {
		return sumcrl;
	}
	public void setSumcrl(String sumcrl) {
		this.sumcrl = sumcrl;
	}
	
	public String getHsusrnames() {
		return hsusrnames;
	}
	public void setHsusrnames(String hsusrnames) {
		this.hsusrnames = hsusrnames;
	}
	public String getSbp() {
		return sbp;
	}
	public void setSbp(String sbp) {
		this.sbp = sbp;
	}
	public String getRl() {
		return rl;
	}
	public void setRl(String rl) {
		this.rl = rl;
	}
	public String getCl() {
		return cl;
	}
	public void setCl(String cl) {
		this.cl = cl;
	}
	public String getDate2() {
		return date2;
	}
	public void setDate2(String date2) {
		this.date2 = date2;
	}

}
