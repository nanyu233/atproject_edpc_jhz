package activetech.edpc.pojo.dto;



/**
 * 
 * 报表返回值
 * @author ROG
 *
 */
public class ReportDataResult {
	
	// 年月
	private String yarmon;
	
	// 平均值
	private Double avgTime;
	
	// 中位数
	private Double medianTime;
	
	private Integer patNumb;
	
	// 最大值
    private Double maxMin;
    
    // 最小值
    private Double minMin;
    
    // 总数
    private Integer total;
    // 符合条件的数量
    private Integer tnumb;
    
    private String infocode;
    
    private String info;
    // 胸痛患者病因诊断各项人数
    private Integer stemi;
    private Integer nstemi;
    private Integer ua;
    private Integer zdmjc;
    private Integer fss;
    private Integer nacs;
    private Integer other;
    // 中位数
    private double median;
    // 比例
    private String rate;
    
	public Integer getTnumb() {
		return tnumb;
	}

	public void setTnumb(Integer tnumb) {
		this.tnumb = tnumb;
	}

	public Double getMaxMin() {
		return maxMin;
	}

	public void setMaxMin(Double maxMin) {
		this.maxMin = maxMin;
	}

	public Double getMinMin() {
		return minMin;
	}

	public void setMinMin(Double minMin) {
		this.minMin = minMin;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getYarmon() {
		return yarmon;
	}

	public void setYarmon(String yarmon) {
		this.yarmon = yarmon;
	}

	public Double getAvgTime() {
		return avgTime;
	}

	public void setAvgTime(Double avgTime) {
		this.avgTime = avgTime;
	}

	public Double getMedianTime() {
		return medianTime;
	}

	public void setMedianTime(Double medianTime) {
		this.medianTime = medianTime;
	}

	public Integer getPatNumb() {
		return patNumb;
	}

	public void setPatNumb(Integer patNumb) {
		this.patNumb = patNumb;
	}

	public String getInfocode() {
		return infocode;
	}

	public void setInfocode(String infocode) {
		this.infocode = infocode;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Integer getStemi() {
		return stemi;
	}

	public void setStemi(Integer stemi) {
		this.stemi = stemi;
	}

	public Integer getNstemi() {
		return nstemi;
	}

	public void setNstemi(Integer nstemi) {
		this.nstemi = nstemi;
	}

	public Integer getUa() {
		return ua;
	}

	public void setUa(Integer ua) {
		this.ua = ua;
	}

	public Integer getZdmjc() {
		return zdmjc;
	}

	public void setZdmjc(Integer zdmjc) {
		this.zdmjc = zdmjc;
	}

	public Integer getFss() {
		return fss;
	}

	public void setFss(Integer fss) {
		this.fss = fss;
	}

	public Integer getNacs() {
		return nacs;
	}

	public void setNacs(Integer nacs) {
		this.nacs = nacs;
	}

	public Integer getOther() {
		return other;
	}

	public void setOther(Integer other) {
		this.other = other;
	}

	public double getMedian() {
		return median;
	}

	public void setMedian(double median) {
		this.median = median;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

}
