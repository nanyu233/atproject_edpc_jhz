package activetech.hospital.pojo.dto;

import activetech.hospital.pojo.domain.HspDevdataKm;

public class HspDevdataKmCustom extends HspDevdataKm {
	
	public int ptPmType;			//数据包类型

	
	public int getPtPmType() {
		return ptPmType;
	}

	public void setPtPmType(int ptPmType) {
		this.ptPmType = ptPmType;
	}
	
}
