package activetech.base.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WeixinConfig {

    private static String AgentId;
    private static String Corpid;
    private static String Corpsecret;
    private static String Appid;
    private static String AppSecret;
    private static String AesKey;
    private static String AesToken;

    @Value("${weixin.AgentId}")
    public static void setAgentId(String agentId) {
        AgentId = agentId;
    }
    @Value("${weixin.corpid}")
    public void setCorpid(String corpid) {
        Corpid = corpid;
    }
    @Value("${weixin.corpsecret}")
    public void setCorpsecret(String corpsecret) {
        Corpsecret = corpsecret;
    }
    @Value("${weixin.Appid}")
    public void setAppid(String appid) {
        Appid = appid;
    }
    @Value("${weixin.AppSecret}")
    public void setAppSecret(String appSecret) {
        AppSecret = appSecret;
    }
    @Value("${weixin.AesKey}")
    public void setAesKey(String aesKey) {
        AesKey = aesKey;
    }
    @Value("${weixin.AesToken}")
    public void setAesToken(String aesToken) {
        AesToken = aesToken;
    }


    public static String getCorpid() {
        return Corpid;
    }

    public static String getCorpsecret() {
        return Corpsecret;
    }

    public static String getAppid() {
        return Appid;
    }

    public static String getAppSecret() {
        return AppSecret;
    }

    public static String getAesKey() {
        return AesKey;
    }

    public static String getAesToken() {
        return AesToken;
    }
}
