package activetech.zyyhospital.pojo.dto;

public class HspDeathRecordQueryDto {

	private HspDeathRecordCustom hspDeathRecordCustom;
	private String observationCode;
	
	public HspDeathRecordCustom getHspDeathRecordCustom() {
		return hspDeathRecordCustom;
	}

	public void setHspDeathRecordCustom(HspDeathRecordCustom hspDeathRecordCustom) {
		this.hspDeathRecordCustom = hspDeathRecordCustom;
	}

	public String getObservationCode() {
		return observationCode;
	}

	public void setObservationCode(String observationCode) {
		this.observationCode = observationCode;
	}
	
}
