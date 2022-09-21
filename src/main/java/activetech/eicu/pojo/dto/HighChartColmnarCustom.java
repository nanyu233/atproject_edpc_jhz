package activetech.eicu.pojo.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HighChartColmnarCustom {
	
	
	private String name;
	private List<BigDecimal> data = new ArrayList<BigDecimal>();
	
	List<String> xdataList = new ArrayList<String>();
	List<HighChartColmnarCustom> rows = new ArrayList<HighChartColmnarCustom>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<BigDecimal> getData() {
		return data;
	}
	public void setData(List<BigDecimal> data) {
		this.data = data;
	}
	public List<String> getXdataList() {
		return xdataList;
	}
	public void setXdataList(List<String> xdataList) {
		this.xdataList = xdataList;
	}
	public List<HighChartColmnarCustom> getRows() {
		return rows;
	}
	public void setRows(List<HighChartColmnarCustom> rows) {
		this.rows = rows;
	}
	
}
