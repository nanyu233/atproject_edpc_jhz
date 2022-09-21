package activetech.edpc.pojo.dto;

public class WebSocketDto {
	
	/**
	 * 通知涉及到的病案号
	 */
	private String emgSeq;
	
	
	/**
	 * 通知涉及到的节点号
	 */
	private String pointId;
	
	
	/**
	 * 附加信息
	 */
	private Object object;


	public String getEmgSeq() {
		return emgSeq;
	}


	public void setEmgSeq(String emgSeq) {
		this.emgSeq = emgSeq;
	}


	public String getPointId() {
		return pointId;
	}


	public void setPointId(String pointId) {
		this.pointId = pointId;
	}


	public Object getObject() {
		return object;
	}


	public void setObject(Object object) {
		this.object = object;
	}
	
	
	
	
	

}
