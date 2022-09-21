package activetech.hospital.pojo.dto;

import activetech.hospital.pojo.domain.HspGcsInf;

/**
 * 
 * <p>Title:HspgcsinfCustom</p>
 * <p>Description:GCS意识评分自定义类</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年2月20日 下午3:19:23
 *
 */
public class HspgcsinfCustom extends HspGcsInf{
	
	private String eyeRctCodStr;//睁眼反应
	private String lanRctCodStr;//语言反应
	private String actRctCodStr;//肢体反应
	public String getEyeRctCodStr() {
		return eyeRctCodStr;
	}
	public void setEyeRctCodStr(String eyeRctCodStr) {
		this.eyeRctCodStr = eyeRctCodStr;
	}
	public String getLanRctCodStr() {
		return lanRctCodStr;
	}
	public void setLanRctCodStr(String lanRctCodStr) {
		this.lanRctCodStr = lanRctCodStr;
	}
	public String getActRctCodStr() {
		return actRctCodStr;
	}
	public void setActRctCodStr(String actRctCodStr) {
		this.actRctCodStr = actRctCodStr;
	}
}
