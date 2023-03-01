package activetech.ding.enums;

public enum MsgTypeEnum {

    /**
     * 链接消息
     */
    LINK("link"),

    /**
     * 文本消息
     */
    TEXT("text"),
    /**
     * 图片
     */
    IMAGE("image"),
    /**
     * 文件消息
     */
    FILE("file"),
    /**
     * markdown
     */
    MARKDOWN("markdown"),
    /**
     * 未知
     */
    OTHER("other"),

    ;

    MsgTypeEnum(String msgType) {
        this.msgType = msgType;
    }

    private String msgType;

    public String getMsgType() {
        return msgType;
    }

    public static MsgTypeEnum getMsgEnum(String type) {
        for (MsgTypeEnum constants : values()) {
            if (type.equals(constants.getMsgType())) {
                return constants;
            }
        }
        return OTHER;
    }

}
