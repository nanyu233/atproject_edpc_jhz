package activetech.zyyhospital.pojo.dto;

import java.util.List;

import activetech.basehis.pojo.dto.HspAotographInfoCustom;
import activetech.zyyhospital.pojo.domain.HspTransfusionInf;

/**
 * 输血记录自定义实体类
 * @author machaofan
 *
 */
public class HspTransfusionInfCustom extends HspTransfusionInf{
    
	/**
	 * 输输血后评估拼接
	 */
	private String vitalSigns;
	
	/**
	 * 电子签名对象
	 */
	private List<HspAotographInfoCustom> hspAotographInfoList;

	public List<HspAotographInfoCustom> getHspAotographInfoList() {
		return hspAotographInfoList;
	}

	public void setHspAotographInfoList(List<HspAotographInfoCustom> hspAotographInfoList) {
		this.hspAotographInfoList = hspAotographInfoList;
	}

	public String getVitalSigns() {
		return vitalSigns;
	}

	public void setVitalSigns(String vitalSigns) {
		this.vitalSigns = vitalSigns;
	}
	
	
}