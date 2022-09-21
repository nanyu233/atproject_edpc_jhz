package activetech.hospital.pojo.dto;

import java.util.Date;

public class HspBrbzCustom {

	private String infocode;
	private String info;
	private String SAV_MNG_COD;
	
	//按半年查询（上半年，下半年）
	private String querydate;
	
	public String getSAV_MNG_COD() {
		return SAV_MNG_COD;
	}
	public void setSAV_MNG_COD(String sAV_MNG_COD) {
		SAV_MNG_COD = sAV_MNG_COD;
	}
	public String getInfocode() {
		return infocode;
	}
	public void setInfocode(String infocode) {
		this.infocode = infocode;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	private String name;
	private int count ;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public String getQuerydate() {
		return querydate;
	}
	public void setQuerydate(String Querydate) {
		this.querydate = Querydate;
	}
}
