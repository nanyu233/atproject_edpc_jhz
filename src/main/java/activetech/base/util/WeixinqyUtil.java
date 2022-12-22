package activetech.base.util;

import activetech.base.config.WeixinConfig;
import activetech.util.HttpClientUtil;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Component;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@Component
public class WeixinqyUtil {
    public static WeixinqyUtil weixinUtil;

    private static Map<String, String> tokenMap = null;

    /**
     * 登录凭证校验。通过 wx.login 接口获得临时登录凭证 code 后传到开发者服务器调用此接口完成登录流程。更多使用方法详见小程序登录
     * 会话密钥 session_key 是对用户数据进行 加密签名 的密钥 后期确定是否需要session_key
     * https://qyapi.weixin.qq.com/cgi-bin/miniprogram/jscode2session
     * @param authCode authCode
     * @return return {
     * "openid":"xxxxxx",
     * "session_key":"xxxxx",
     * "unionid":"xxxxx",
     * "errcode":0,
     * "errmsg":"xxxxx"
     * }
     * @throws Exception Exception
     */
    public static String jscode2session(String accessToken, String authCode) throws Exception {
        String url = "https://qyapi.weixin.qq.com/cgi-bin/miniprogram/jscode2session";
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("access_token", accessToken);
        paramMap.put("js_code", authCode);
        paramMap.put("grant_type", "authorization_code");
        paramMap.put("debug", "1");

        Map<String, Object> resultMap = wxReqDataGet(url, paramMap);

        String userid = (String) resultMap.get("userid");
        if(userid == null || userid == "") {
            throw new RuntimeException("weixin accessToken获取异常...");
        }
        return userid;
    }

    /**
     * 获取accessToken
     * 如果数据库中存在则数据库获取
     * https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=ID&corpsecret=SECRET
     * @return return{
     * "access_token":"ACCESS_TOKEN",
     * "expires_in":7200
     * }
     * @throws Exception Exception
     */
    public static String getAccessToken() throws Exception {
        Map<String, String> tokenMap = WeixinqyUtil.tokenMap;
        if (tokenMap != null && Long.parseLong(tokenMap.get("date")) >= (System.currentTimeMillis() - (6500 * 1000))) {
            return tokenMap.get("access_token");
        }
        String url = "https://qyapi.weixin.qq.com/cgi-bin/gettoken";
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("corpid", WeixinConfig.getCorpid());
        paramMap.put("corpsecret", WeixinConfig.getCorpsecret());

        Map<String, Object> resultMap = wxReqDataGet(url, paramMap);
        String access_token = (String) resultMap.get("access_token");
        if(access_token == null || access_token == "") {
            throw new RuntimeException("weixin accessToken获取异常...");
        }
        WeixinqyUtil.tokenMap = new HashMap<>();
        WeixinqyUtil.tokenMap.put("date", String.valueOf(System.currentTimeMillis()));
        WeixinqyUtil.tokenMap.put("access_token", access_token);

        System.out.println("重新获取accessToken");
        return access_token;
    }


    /**
     * 获取访问用户身份
     * https://qyapi.weixin.qq.com/cgi-bin/auth/getuserinfo
     * @param accessToken accessToken
     * @param code code
     */
    public static String getuserinfo(String accessToken, String code) throws Exception{
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("access_token", accessToken);
        paramMap.put("code", code);
        String url = "https://qyapi.weixin.qq.com/cgi-bin/auth/getuserinfo";
        Map<String, Object> resultMap = wxReqDataGet(url, paramMap);
        String userid = (String) resultMap.get("userid");
        if(userid == null || userid == "") {
            throw new RuntimeException("userid获取异常...");
        }
        return userid;
    }

    /**
     * 请求后数据处理封装
     * @param url url
     * @param paramMap paramMap
     * @return
     */
    public static Map<String, Object> wxReqDataGet(String url, Map<String, String> paramMap) throws Exception{
        String resultStr = HttpClientUtil.doGet(url, paramMap);
        Map<String, Object> resultMap = JSON.parseObject(resultStr, Map.class);
        if (resultMap == null || (resultMap.containsKey("errcode") && (Integer) resultMap.get("errcode") != 0)) {
            if(resultMap == null) {
                throw new RuntimeException("数据解析异常...");
            } else {
                throw new RuntimeException(resultMap.get("errmsg").toString());
            }
        }
        return resultMap;
    }

    /**
     * 求后数据处理封装
     * @param url url
     * @return return return
     */
    public static Map<String, Object> wxReqDataGet(String url) throws Exception{
        return wxReqDataGet(url, null);
    }

    /**
     * 请求方法
     * @param url url
     * @return return
     */
    public static Map<String, Object> reqGetMap(String url) {
        try {
            URL reqURL = new URL(url);
            HttpsURLConnection openConnection = (HttpsURLConnection) reqURL.openConnection();
            openConnection.setConnectTimeout(10000);
            openConnection.connect();
            InputStream in = openConnection.getInputStream();
            StringBuilder builder = new StringBuilder();
            BufferedReader bufreader = new BufferedReader(new InputStreamReader(in));
            for (String temp = bufreader.readLine(); temp != null; temp = bufreader.readLine()) {
                builder.append(temp);
            }
            String result = builder.toString();
            in.close();
            openConnection.disconnect();
            Map<String, Object> resultMap = JSON.parseObject(result, Map.class);
            return resultMap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) throws Exception{
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
