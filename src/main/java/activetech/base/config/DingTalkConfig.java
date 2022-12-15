package activetech.base.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DingTalkConfig {

    private static String CorpId;
    private static String ApiToken;
    private static String AgentId;
    private static String MiniAppId;
    private static String AppKey;
    private static String AppSecret;
    private static String AesKey;
    private static String AesToken;

    @Value("${ding.CorpId}")
    public void setCorpId(String corpId) {
        CorpId = corpId;
    }
    @Value("${ding.ApiToken}")
    public void setApiToken(String apiToken) {
        ApiToken = apiToken;
    }
    @Value("${ding.AgentId}")
    public void setAgentId(String agentId) {
        AgentId = agentId;
    }
    @Value("${ding.MiniAppId}")
    public void setMiniAppId(String miniAppId) {
        MiniAppId = miniAppId;
    }
    @Value("${ding.AppKey}")
    public void setAppKey(String appKey) {
        AppKey = appKey;
    }
    @Value("${ding.AppSecret}")
    public void setAppSecret(String appSecret) {
        AppSecret = appSecret;
    }
    @Value("${ding.AesKey}")
    public void setAesKey(String aesKey) {
        AesKey = aesKey;
    }
    @Value("${ding.AesToken}")
    public void setAesToken(String aesToken) {
        AesToken = aesToken;
    }

    public static String getCorpId() {
        return CorpId;
    }

    public static String getAppKey() {
        return AppKey;
    }

    public static String getAesKey() {
        return AesKey;
    }

    public static String getAesToken() {
        return AesToken;
    }

    public static String getApiToken() {
        return ApiToken;
    }

    public static String getAgentId() {
        return AgentId;
    }

    public static String getMiniAppId() {
        return MiniAppId;
    }

    public static String getAppSecret() {
        return AppSecret;
    }
}
