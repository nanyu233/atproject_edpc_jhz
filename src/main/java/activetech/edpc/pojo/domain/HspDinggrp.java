package activetech.edpc.pojo.domain;

/**
    * 患者钉钉群映射表
    */
public class HspDinggrp {
    /**
    * 患者编号
    */
    private String regSeq;

    /**
    * 群会话的ID。;后续版本中chatid将不再使用，请将openConversationId作为群会话唯一标识。
    */
    private String chatid;

    /**
    * 群会话的ID。
    */
    private String openConversationId;

    public String getRegSeq() {
        return regSeq;
    }

    public void setRegSeq(String regSeq) {
        this.regSeq = regSeq;
    }

    public String getChatid() {
        return chatid;
    }

    public void setChatid(String chatid) {
        this.chatid = chatid;
    }

    public String getOpenConversationId() {
        return openConversationId;
    }

    public void setOpenConversationId(String openConversationId) {
        this.openConversationId = openConversationId;
    }
}