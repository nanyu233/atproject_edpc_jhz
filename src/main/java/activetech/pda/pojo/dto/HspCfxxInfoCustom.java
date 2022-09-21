package activetech.pda.pojo.dto;


import activetech.pda.pojo.domain.HspCfxxInfo;
/**
 * 处方信息自定义实体类
 * @author machaofan
 *
 */
public class HspCfxxInfoCustom extends HspCfxxInfo{
	
	/**
	 * 处方数量
	 */
	private String num;

	/**
	 * 剂量单位拼接
	 */
	private String daDoseUnit;
	
	/**
	 * 给药方式
	 */
	private String daWayStr;
	
	/**
	 * 执行护士
	 */
	private String execUserXm;
	
	/**
	 * 执行时间
	 */
	private String execTime; 
	
	/**
	 * 
	 */
	private String seriesStr;
	
	/**
	 * 首日次数=开嘱当日的用药次数
	 */
	private String todayTimesStr;
	
	/**
	 * 自备药标识 1=是自备药；0=不是自备药
	 */
	private String provideBySelfStr;
	
	/**
	 * 副药标识 是否副药,0=表示主药,1=表示副药
	 */
	private String isAuxStr;
	
	/**
	 * 执行核对
	 */
	private String execUserxmSecond;
	
	/**
	 * 配药核对
	 */
	private String dispenseUserxmSecond;
	
	public Long getStartTimeLong() {
		if(getStartTime() != null )
			return getStartTime().getTime();
        return 0L;
    }
	
	
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getDaDoseUnit() {
		return daDoseUnit;
	}

	public void setDaDoseUnit(String daDoseUnit) {
		this.daDoseUnit = daDoseUnit;
	}

	public String getDaWayStr() {
		return daWayStr;
	}

	public void setDaWayStr(String daWayStr) {
		this.daWayStr = daWayStr;
	}

	public String getExecUserXm() {
		return execUserXm;
	}

	public void setExecUserXm(String execUserXm) {
		this.execUserXm = execUserXm;
	}

	public String getExecTime() {
		return execTime;
	}

	public void setExecTime(String execTime) {
		this.execTime = execTime;
	}

	public String getSeriesStr() {
		return seriesStr;
	}

	public void setSeriesStr(String seriesStr) {
		this.seriesStr = seriesStr;
	}

	public String getTodayTimesStr() {
		return todayTimesStr;
	}

	public void setTodayTimesStr(String todayTimesStr) {
		this.todayTimesStr = todayTimesStr;
	}

	public String getProvideBySelfStr() {
		return provideBySelfStr;
	}

	public void setProvideBySelfStr(String provideBySelfStr) {
		this.provideBySelfStr = provideBySelfStr;
	}

	public String getIsAuxStr() {
		return isAuxStr;
	}

	public void setIsAuxStr(String isAuxStr) {
		this.isAuxStr = isAuxStr;
	}

	public String getExecUserxmSecond() {
		return execUserxmSecond;
	}

	public void setExecUserxmSecond(String execUserxmSecond) {
		this.execUserxmSecond = execUserxmSecond;
	}


	public String getDispenseUserxmSecond() {
		return dispenseUserxmSecond;
	}


	public void setDispenseUserxmSecond(String dispenseUserxmSecond) {
		this.dispenseUserxmSecond = dispenseUserxmSecond;
	}
	
	

}