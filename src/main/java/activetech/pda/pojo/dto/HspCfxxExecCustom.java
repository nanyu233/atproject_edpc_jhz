package activetech.pda.pojo.dto;

import java.util.List;
import java.util.Map;

import activetech.pda.pojo.domain.HspCfxxExec;
/**
 * 处方信息执行单自定义实体类
 * @author machaofan
 *
 */
public class HspCfxxExecCustom extends HspCfxxExec{
	
	public Long getCrtTimeLong() {
		if(getCrtTime() != null )
			return getCrtTime().getTime();
        return 0L;
    }
	
	public Long getPlanTimeLong() {
		if(getPlanTime() != null )
			return getPlanTime().getTime();
        return 0L;
    }
	
	/**
	 * 开单医生
	 */
	private String startDoct;
	
	/**
	 * 核对护士
	 */
	private String hdhsXm;

	/**
	 * 处方数量
	 */
	private String num;
	
	/**
	 * 给药方式
	 */
	private String daWayStr;
	
	/**
	 * 拆分执行单信息（daInfo，daDose，daUnit）
	 */
	private List<Map<String,Object>> infoList;
	
	/**
	 * 是否为高危药品
	 */
	private String highRisk;
	
	/**
	 * 开立时间
	 */
	private String enterTime;
	

	public String getStartDoct() {
		return startDoct;
	}

	public void setStartDoct(String startDoct) {
		this.startDoct = startDoct;
	}

	public String getHdhsXm() {
		return hdhsXm;
	}

	public void setHdhsXm(String hdhsXm) {
		this.hdhsXm = hdhsXm;
	}
	
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getDaWayStr() {
		return daWayStr;
	}

	public void setDaWayStr(String daWayStr) {
		this.daWayStr = daWayStr;
	}

	public List<Map<String, Object>> getInfoList() {
		return infoList;
	}

	public void setInfoList(List<Map<String, Object>> infoList) {
		this.infoList = infoList;
	}

	public String getHighRisk() {
		return highRisk;
	}

	public void setHighRisk(String highRisk) {
		this.highRisk = highRisk;
	}

	public String getEnterTime() {
		return enterTime;
	}

	public void setEnterTime(String enterTime) {
		this.enterTime = enterTime;
	}
	
}