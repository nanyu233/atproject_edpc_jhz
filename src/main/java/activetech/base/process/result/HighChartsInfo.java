package activetech.base.process.result;

import java.util.List;

import activetech.base.pojo.domain.Series;
/**
 * 
 * <p>Title:图标信息</p>
 * <p>Description:HighChartsInfo</p>
 * <p>activetech</p>
 * @author jpj
 * @date 2017-2-10 下午2:59:28
 *
 */
public class HighChartsInfo {
	
	private String[] xcategories;//设置X轴分类
	private List<Series> series;//数据
	public String[] getXcategories() {
		return xcategories;
	}
	public void setXcategories(String[] xcategories) {
		this.xcategories = xcategories;
	}
	public List<Series> getSeries() {
		return series;
	}
	public void setSeries(List<Series> series) {
		this.series = series;
	}
}
