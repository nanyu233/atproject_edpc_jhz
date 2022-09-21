package activetech.base.pojo.domain;
/**
 * 
 * <p>Title:图标的数据类</p>
 * <p>Description:Series</p>
 * <p>activetech</p>
 * @author jpj
 * @date 2017-2-10 下午2:58:44
 *
 */
public class Series {
	private String name;//数据名
	private double[] data;//数据值
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double[] getData() {
		return data;
	}
	public void setData(double[] data) {
		this.data = data;
	}
}
