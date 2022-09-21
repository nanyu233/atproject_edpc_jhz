package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspHeartRecord;

/**
 * 心肺复苏自定义实体类
 * @author machaofan
 *
 */
public class HspHeartRecordCustom extends HspHeartRecord{
 
	/**
	 * 血压拼接字段
	 */
	private String sbpNbrStr;
	
	/**
	 * 意识名称
	 */
	private String senStuNam;

	public String getSbpNbrStr() {
		return sbpNbrStr;
	}

	public void setSbpNbrStr(String sbpNbrStr) {
		this.sbpNbrStr = sbpNbrStr;
	}

	public String getSenStuNam() {
		return senStuNam;
	}

	public void setSenStuNam(String senStuNam) {
		this.senStuNam = senStuNam;
	}

}