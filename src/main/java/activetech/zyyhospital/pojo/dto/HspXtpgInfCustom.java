package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspXtpgInf;

public class HspXtpgInfCustom extends HspXtpgInf{

	private Long bradenSco;   //Braden评分
	private Long bradenQSco;  //BradenQ评分
	private Long adlSco;	  //ADL评分
	private Long zcddexpfSco; //坠床跌倒评分
	private Long xezcddexpfSco;//小儿坠床/跌倒危险因素评分
	private Long nrsSco;	   //疼痛评分
	private String xtpgHsNam;//护士姓名
    private String xtpgSjhsNam;//上级护士姓名
    private Integer  falAss;//跌倒危险评分
	
    
	
	public Integer getFalAss() {
		return falAss;
	}
	public void setFalAss(Integer falAss) {
		this.falAss = falAss;
	}
	public String getXtpgHsNam() {
		return xtpgHsNam;
	}
	public void setXtpgHsNam(String xtpgHsNam) {
		this.xtpgHsNam = xtpgHsNam;
	}
	public String getXtpgSjhsNam() {
		return xtpgSjhsNam;
	}
	public void setXtpgSjhsNam(String xtpgSjhsNam) {
		this.xtpgSjhsNam = xtpgSjhsNam;
	}
	public Long getBradenSco() {
		return bradenSco;
	}
	public void setBradenSco(Long bradenSco) {
		this.bradenSco = bradenSco;
	}
	public Long getBradenQSco() {
		return bradenQSco;
	}
	public void setBradenQSco(Long bradenQSco) {
		this.bradenQSco = bradenQSco;
	}
	public Long getAdlSco() {
		return adlSco;
	}
	public void setAdlSco(Long adlSco) {
		this.adlSco = adlSco;
	}
	public Long getZcddexpfSco() {
		return zcddexpfSco;
	}
	public void setZcddexpfSco(Long zcddexpfSco) {
		this.zcddexpfSco = zcddexpfSco;
	}
	public Long getXezcddexpfSco() {
		return xezcddexpfSco;
	}
	public void setXezcddexpfSco(Long xezcddexpfSco) {
		this.xezcddexpfSco = xezcddexpfSco;
	}
	public Long getNrsSco() {
		return nrsSco;
	}
	public void setNrsSco(Long nrsSco) {
		this.nrsSco = nrsSco;
	}

	
}
