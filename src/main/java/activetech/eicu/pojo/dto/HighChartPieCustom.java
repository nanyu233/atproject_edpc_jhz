package activetech.eicu.pojo.dto;

import java.math.BigDecimal;
import java.util.List;

public class HighChartPieCustom {
	
	private String name;
	private BigDecimal numb;
	private String type;
	private String code;
	private List<HighChartPieCustom> list;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getNumb() {
		return numb;
	}
	public void setNumb(BigDecimal numb) {
		this.numb = numb;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<HighChartPieCustom> getList() {
		return list;
	}
	public void setList(List<HighChartPieCustom> list) {
		this.list = list;
	}
	
}
