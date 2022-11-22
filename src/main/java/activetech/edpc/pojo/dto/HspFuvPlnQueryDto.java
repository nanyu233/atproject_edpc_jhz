package activetech.edpc.pojo.dto;


import activetech.base.pojo.domain.PageCond;

import java.util.Date;
import java.util.List;

public class HspFuvPlnQueryDto extends PageCond {

    private HspFuvPlnCustom hspFuvPlnCustom;
    private List<HspFuvPlnCustom> hspFuvPlnCustoms;
    private Date startDate;
    private Date endDate;
	/**
	 * 距离到期提醒时间 0 当天 1 前一天 2 前 2天
	 */
	private String beforeWarnTim;
	/**
	 * 随访状态
	 */
	private String plnSta;
	/**
	 * 到期后天数 0 当天 1 前一天 2 前 2天
	 */
	private String expireTim;

	public HspFuvPlnCustom getHspFuvPlnCustom() {
		return hspFuvPlnCustom;
	}

	public void setHspFuvPlnCustom(HspFuvPlnCustom hspFuvPlnCustom) {
		this.hspFuvPlnCustom = hspFuvPlnCustom;
	}

	public List<HspFuvPlnCustom> getHspFuvPlnCustoms() {
		return hspFuvPlnCustoms;
	}

	public void setHspFuvPlnCustoms(List<HspFuvPlnCustom> hspFuvPlnCustoms) {
		this.hspFuvPlnCustoms = hspFuvPlnCustoms;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getBeforeWarnTim() {
		return beforeWarnTim;
	}

	public void setBeforeWarnTim(String beforeWarnTim) {
		this.beforeWarnTim = beforeWarnTim;
	}

	public String getPlnSta() {
		return plnSta;
	}

	public void setPlnSta(String plnSta) {
		this.plnSta = plnSta;
	}

	public String getExpireTim() {
		return expireTim;
	}

	public void setExpireTim(String expireTim) {
		this.expireTim = expireTim;
	}
}