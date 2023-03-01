package activetech.ding.util;

import activetech.ding.enums.MsgTypeEnum;
import activetech.ding.model.DingTalkMessage;
import com.dingtalk.api.request.OapiChatSendRequest;

public class BuildMsgOApiChatSendRequestMsg {
    /**
     * 构建钉钉群消息
     *
     * @param dingTalkMessage
     * @return
     */
    public static OapiChatSendRequest.Msg buildOapiChatSendRequestMsg(DingTalkMessage dingTalkMessage) {
        // 群消息
        OapiChatSendRequest.Msg msg = new OapiChatSendRequest.Msg();
        switch (MsgTypeEnum.getMsgEnum(dingTalkMessage.getMsgType())) {
            case TEXT:
                DingTalkMessage.Text textMessage = dingTalkMessage.getText();
                msg.setMsgtype(dingTalkMessage.getMsgType());
                OapiChatSendRequest.Text text = buildTest(textMessage);
                msg.setText(text);
                return msg;
            case LINK:
                DingTalkMessage.LinkMessage linkMessage = dingTalkMessage.getLink();
                msg.setMsgtype(dingTalkMessage.getMsgType());
                OapiChatSendRequest.Link link = buildLink(linkMessage);
                msg.setLink(link);
                return msg;
            case FILE:
                DingTalkMessage.File fileMessage = dingTalkMessage.getFile();
                msg.setMsgtype(dingTalkMessage.getMsgType());
                // 构建链接消息
                OapiChatSendRequest.File file = buildFile(fileMessage);
                msg.setFile(file);
                return msg;
            case IMAGE:
                DingTalkMessage.Image imageMessage = dingTalkMessage.getImage();
                msg.setMsgtype(dingTalkMessage.getMsgType());
                // 构建链接消息
                OapiChatSendRequest.Image image = buildImage(imageMessage);
                msg.setImage(image);
                return msg;
            case MARKDOWN:
                DingTalkMessage.Markdown markdownMessage = dingTalkMessage.getMarkdown();
                msg.setMsgtype(dingTalkMessage.getMsgType());
                // 构建链接消息
                OapiChatSendRequest.Markdown markdown = buildMarkdown(markdownMessage);
                msg.setMarkdown(markdown);
                return msg;
            default:
                throw new RuntimeException("msgType not match");
        }
    }

    /**
     * 构建链接消息
     *
     * @param linkMessage
     * @return
     */
    public static OapiChatSendRequest.Link buildLink(DingTalkMessage.LinkMessage linkMessage) {
        OapiChatSendRequest.Link link = new OapiChatSendRequest.Link();
        link.setMessageUrl(linkMessage.getMessageUrl());
        link.setPicUrl(linkMessage.getPicUrl());
        link.setText(linkMessage.getText());
        link.setTitle(linkMessage.getTitle());
        return link;
    }

    public static OapiChatSendRequest.File buildFile(DingTalkMessage.File fileMessage) {
        OapiChatSendRequest.File file = new OapiChatSendRequest.File();
        file.setMediaId(fileMessage.getMediaId());
        return file;
    }

    public static OapiChatSendRequest.Image buildImage(DingTalkMessage.Image imageMessage) {
        OapiChatSendRequest.Image image = new OapiChatSendRequest.Image();
        image.setMediaId(imageMessage.getMediaId());
        return image;
    }

    public static OapiChatSendRequest.Text buildTest(DingTalkMessage.Text textMessage) {
        OapiChatSendRequest.Text text = new OapiChatSendRequest.Text();
        text.setContent(textMessage.getContent());
        return text;
    }

    public static OapiChatSendRequest.Markdown buildMarkdown(DingTalkMessage.Markdown markdownMessage) {
        OapiChatSendRequest.Markdown markdown = new OapiChatSendRequest.Markdown();
        markdown.setText(markdownMessage.getText());
        markdown.setTitle(markdownMessage.getTitle());
        return markdown;
    }
}
