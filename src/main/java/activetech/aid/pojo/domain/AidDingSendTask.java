package activetech.aid.pojo.domain;

import java.io.Serializable;
import java.util.Date;

public class AidDingSendTask implements Serializable {
    private String id;

    private String recipients;

    private String recipientsType;

    private String sender;

    private String senderType;

    private String msgType;

    private String text;

    private String title;

    private String mediaId;

    private String messageUrl;

    private String messageId;

    private String code;

    private String errorMsg;

    private String sendFlg;

    private Date creatTime;

    private String systemId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients == null ? null : recipients.trim();
    }

    public String getRecipientsType() {
        return recipientsType;
    }

    public void setRecipientsType(String recipientsType) {
        this.recipientsType = recipientsType == null ? null : recipientsType.trim();
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    public String getSenderType() {
        return senderType;
    }

    public void setSenderType(String senderType) {
        this.senderType = senderType == null ? null : senderType.trim();
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType == null ? null : msgType.trim();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId == null ? null : mediaId.trim();
    }

    public String getMessageUrl() {
        return messageUrl;
    }

    public void setMessageUrl(String messageUrl) {
        this.messageUrl = messageUrl == null ? null : messageUrl.trim();
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId == null ? null : messageId.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg == null ? null : errorMsg.trim();
    }

    public String getSendFlg() {
        return sendFlg;
    }

    public void setSendFlg(String sendFlg) {
        this.sendFlg = sendFlg == null ? null : sendFlg.trim();
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId == null ? null : systemId.trim();
    }
}