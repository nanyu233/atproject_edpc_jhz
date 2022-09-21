package activetech.eicu.pojo.dto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class HighChartsGanttCustom {

	private String name;
	private String id;
	private Date start;
	private Date end;
	private String type;
	private String startLocation;
	private String endLocation;
	private boolean milestone;
	private String dependency;
	
	List<HighChartsGanttCustom> data;
	
	private String statName;
	private Date modTime;
	private String memo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatName() {
		return statName;
	}
	public void setStatName(String statName) {
		this.statName = statName;
	}
	public List<HighChartsGanttCustom> getData() {
		return data;
	}
	public void setData(List<HighChartsGanttCustom> data) {
		this.data = data;
	}
	public Date getModTime() {
		return modTime;
	}
	public void setModTime(Date modTime) {
		this.modTime = modTime;
	}
	public String getStartLocation() {
		return startLocation;
	}
	public void setStartLocation(String startLocation) {
		this.startLocation = startLocation;
	}
	public String getEndLocation() {
		return endLocation;
	}
	public void setEndLocation(String endLocation) {
		this.endLocation = endLocation;
	}
	public boolean isMilestone() {
		return milestone;
	}
	public void setMilestone(boolean milestone) {
		this.milestone = milestone;
	}
	public String getDependency() {
		return dependency;
	}
	public void setDependency(String dependency) {
		this.dependency = dependency;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", id=" + id + ", start="
				+ parseDate(start) + ", end=" + parseDate(end) + ", type=" + type + ", statName="
				+ statName + ", modTime=" + parseDate(modTime) + ", startLocation="
				+ startLocation + ", endLocation=" + endLocation + ", data="
				+ data + "]";
	}
	
	private String parseDate(Date date){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return format.format(date);
	}
	
}
