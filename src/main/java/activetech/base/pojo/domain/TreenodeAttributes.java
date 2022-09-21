package activetech.base.pojo.domain;

/**
 * 
 * <p>Title:TreenodeAttribute</p>
 * <p>Description:树的自定义属性</p>
 * <p>activetech</p>
 * @author moneyblue
 * @date 2017-1-6 上午10:00:47
 *
 */
public class TreenodeAttributes {
    private String url;
    private String spareField;//备用字段
    
    public String getSpareField() {
		return spareField;
	}

	public void setSpareField(String spareField) {
		this.spareField = spareField;
	}
    
	public TreenodeAttributes(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
    
    
    
}