package activetech.ding.model;

public class DingTalkMessage {

    /**
     * 消息类型 MsgTypeEnum
     */
    private String msgType;

    /**
     * 链接消息
     */
    private LinkMessage link;

    /**
     * 文件消息
     */
    private File file;
    /**
     * 文本消息
     */
    private Text text;
    /**
     * 图片消息
     */
    private Image image;
    /**
     * markdown消息
     */
    private Markdown markdown;


    /**
     * link 链接消息
     */
    public static class LinkMessage {

        /**
         * 消息点击链接地址，当发送消息为小程序时支持小程序跳转链接
         */
        private String messageUrl;

        /**
         * 图片地址，可以通过上传媒体文件接口获取。
         */
        private String picUrl;

        /**
         * 消息标题，建议100字符以内。
         */
        private String title;

        /**
         * 消息描述，建议500字符以内。
         */
        private String text;

        public String getMessageUrl() {
            return messageUrl;
        }

        public void setMessageUrl(String messageUrl) {
            this.messageUrl = messageUrl;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public static class File {
        private String mediaId;

        public String getMediaId() {
            return mediaId;
        }

        public void setMediaId(String mediaId) {
            this.mediaId = mediaId;
        }
    }

    public static class Text {
        private String content;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }

    public static class Image {
        private String mediaId;

        public String getMediaId() {
            return mediaId;
        }

        public void setMediaId(String mediaId) {
            this.mediaId = mediaId;
        }
    }

    public static class Markdown {
        private String title;
        private String text;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public LinkMessage getLink() {
        return link;
    }

    public void setLink(LinkMessage link) {
        this.link = link;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Markdown getMarkdown() {
        return markdown;
    }

    public void setMarkdown(Markdown markdown) {
        this.markdown = markdown;
    }
}
