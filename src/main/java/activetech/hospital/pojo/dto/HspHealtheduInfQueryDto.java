package activetech.hospital.pojo.dto;

import java.util.List;

public class HspHealtheduInfQueryDto {
	private HspHealtheduInfCustom hspHealtheduInfCustom;
	private HspHealtheduItemCustom hspHealtheduItemCustom;
	private String[] eduItemList;
	private String sort;
	private String order;
	
	private String startdate;
	private String enddate;

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getStartdate() {
		return startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public HspHealtheduItemCustom getHspHealtheduItemCustom() {
		return hspHealtheduItemCustom;
	}

	public void setHspHealtheduItemCustom(
			HspHealtheduItemCustom hspHealtheduItemCustom) {
		this.hspHealtheduItemCustom = hspHealtheduItemCustom;
	}

	public String[] getEduItemList() {
		return eduItemList;
	}

	public void setEduItemList(String[] eduItemList) {
		this.eduItemList = eduItemList;
	}

	public HspHealtheduInfCustom getHspHealtheduInfCustom() {
		return hspHealtheduInfCustom;
	}

	public void setHspHealtheduInfCustom(HspHealtheduInfCustom hspHealtheduInfCustom) {
		this.hspHealtheduInfCustom = hspHealtheduInfCustom;
	}
	

}
