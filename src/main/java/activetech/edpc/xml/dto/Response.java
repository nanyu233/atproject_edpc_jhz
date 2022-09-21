package activetech.edpc.xml.dto;

public class Response {
	private MessageHeader MessageHeader;
	private MessageBody MessageBody;

	public MessageHeader getMessageHeader() {
		return MessageHeader;
	}

	public void setMessageHeader(MessageHeader messageHeader) {
		MessageHeader = messageHeader;
	}

	public MessageBody getMessageBody() {
		return MessageBody;
	}

	public void setMessageBody(MessageBody messageBody) {
		MessageBody = messageBody;
	}
	
}
