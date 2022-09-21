package activetech.edpc.xml.dto;

public class MessageHeader {
	private String Sender;
	private String Receiver;
	private String SendTime;
	private String EventType;
	private String MsgId;
	public MessageHeader(String Sender,
								String Receiver,
								String SendTime,
								String EventType,
								String MsgId){
		this.Sender = Sender;
		this.Receiver = Receiver;
		this.SendTime = SendTime;
		this.EventType = EventType;
		this.MsgId = MsgId;
	}
	public String getSender() {
		return Sender;
	}
	public void setSender(String sender) {
		Sender = sender;
	}
	public String getReceiver() {
		return Receiver;
	}
	public void setReceiver(String receiver) {
		Receiver = receiver;
	}
	public String getSendTime() {
		return SendTime;
	}
	public void setSendTime(String sendTime) {
		SendTime = sendTime;
	}
	public String getEventType() {
		return EventType;
	}
	public void setEventType(String eventType) {
		EventType = eventType;
	}
	public String getMsgId() {
		return MsgId;
	}
	public void setMsgId(String msgId) {
		MsgId = msgId;
	}
	
}
