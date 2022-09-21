package activetech.edpc.pojo.dto;

public class HomePageResult {
	
	private Integer thisDay;
	
	private Integer thisWeek;
	
	private Integer thisMonth;
	
	private Integer thisYear;
	
	private String wayTyp;
	
	private Integer total;
	
	private String info;
	
	private String infocode;
	
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getInfocode() {
		return infocode;
	}

	public void setInfocode(String infocode) {
		this.infocode = infocode;
	}

	public String getWayTyp() {
		return wayTyp;
	}

	public void setWayTyp(String wayTyp) {
		this.wayTyp = wayTyp;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getThisDay() {
		return thisDay;
	}

	public void setThisDay(Integer thisDay) {
		this.thisDay = thisDay;
	}

	public Integer getThisWeek() {
		return thisWeek;
	}

	public void setThisWeek(Integer thisWeek) {
		this.thisWeek = thisWeek;
	}

	public Integer getThisMonth() {
		return thisMonth;
	}

	public void setThisMonth(Integer thisMonth) {
		this.thisMonth = thisMonth;
	}

	public Integer getThisYear() {
		return thisYear;
	}

	public void setThisYear(Integer thisYear) {
		this.thisYear = thisYear;
	}

}
