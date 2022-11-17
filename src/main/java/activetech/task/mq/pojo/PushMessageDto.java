package activetech.task.mq.pojo;

import java.io.Serializable;

public class PushMessageDto implements Serializable {

	private static final long serialVersionUID = -327110726852705695L;

	private String emgSeq;
	
	private String greenNodeId;
	
	private String status;
	
	private String time;
	
	private String targetPage;
	
	private String messageCode;
	
	private String message;
	
	private String memo;
	
	public String getTargetPage() {
		return targetPage;
	}

	public void setTargetPage(String targetPage) {
		this.targetPage = targetPage;
	}

	public String getMessageCode() {
		return messageCode;
	}

	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEmgSeq() {
		return emgSeq;
	}

	public void setEmgSeq(String emgSeq) {
		this.emgSeq = emgSeq;
	}

	public String getGreenNodeId() {
		return greenNodeId;
	}

	public void setGreenNodeId(String greenNodeId) {
		this.greenNodeId = greenNodeId;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
